import java.io.IOException;
import java.io.Writer;

public class CaesarWriter extends Writer {
    private Writer writer;
    private int steps;

    public CaesarWriter(Writer writer, int steps) {
        this.writer = writer;
        this.steps = steps;
    }

    @Override
    public void write(String str) throws IOException {
        String erg = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (current >= 'a' && current <= 'z') {
                current += steps;
                if (current > 'z') {
                    current -= 26;
                }
            }

            if (current >= 'A' && current <= 'Z') {
                current += steps;
                if (current > 'Z') {
                    current -= 26;
                }
            }

            erg += current;
        }

        this.writer.write(erg);
    }

    @Override
    public void write(int c) throws IOException {
        this.writer.write(c);
    }

    @Override
    public void write(char[] cbuf) throws IOException {
        this.writer.write(cbuf);
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        this.writer.write(str, off, len);
    }

    @Override
    public Writer append(CharSequence csq) throws IOException {
        return this.writer.append(csq);
    }

    @Override
    public Writer append(CharSequence csq, int start, int end) throws IOException {
        return this.writer.append(csq, start, end);
    }

    @Override
    public Writer append(char c) throws IOException {
        return this.writer.append(c);
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        this.writer.write(cbuf, off, len);
    }

    @Override
    public void flush() throws IOException {
        this.writer.flush();
    }

    @Override
    public void close() throws IOException {
        this.writer.close();
    }
}

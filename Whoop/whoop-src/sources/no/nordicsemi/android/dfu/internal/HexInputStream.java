package no.nordicsemi.android.dfu.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import no.nordicsemi.android.dfu.internal.exception.HexFileValidationException;

/* JADX INFO: loaded from: classes3.dex */
public class HexInputStream extends FilterInputStream {
    private final int LINE_LENGTH;
    private final int MBRSize;
    private final int available;
    private int bytesRead;
    private int lastAddress;
    private final byte[] localBuf;
    private int localPos;
    private int pos;
    private int size;

    public HexInputStream(InputStream inputStream, int i13) throws IOException {
        super(new BufferedInputStream(inputStream));
        this.LINE_LENGTH = 128;
        byte[] bArr = new byte[128];
        this.localBuf = bArr;
        this.localPos = 128;
        this.size = bArr.length;
        this.lastAddress = 0;
        this.MBRSize = i13;
        this.available = calculateBinSize(i13);
    }

    private int asciiToInt(int i13) {
        if (i13 >= 65) {
            return i13 - 55;
        }
        if (i13 >= 48) {
            return i13 - 48;
        }
        return -1;
    }

    private int calculateBinSize(int i13) throws IOException {
        int address;
        InputStream inputStream = ((FilterInputStream) this).in;
        inputStream.mark(inputStream.available());
        try {
            int i14 = inputStream.read();
            int i15 = 0;
            int i16 = 0;
            while (true) {
                checkComma(i14);
                int i17 = readByte(inputStream);
                int address2 = readAddress(inputStream);
                int i18 = readByte(inputStream);
                if (i18 != 0) {
                    if (i18 == 1) {
                        return i16;
                    }
                    if (i18 == 2) {
                        address = readAddress(inputStream) << 4;
                        if (i16 > 0 && (address >> 16) != (i15 >> 16) + 1) {
                            return i16;
                        }
                        skip(inputStream, 2L);
                    } else if (i18 == 4) {
                        int address3 = readAddress(inputStream);
                        if (i16 > 0 && address3 != (i15 >> 16) + 1) {
                            return i16;
                        }
                        address = address3 << 16;
                        skip(inputStream, 2L);
                    }
                    i15 = address;
                    while (true) {
                        i14 = inputStream.read();
                        if (i14 != 10 || i14 == 13) {
                        }
                    }
                } else if (address2 + i15 >= i13) {
                    i16 += i17;
                }
                skip(inputStream, (((long) i17) * 2) + 2);
                while (true) {
                    i14 = inputStream.read();
                    if (i14 != 10) {
                    }
                }
            }
        } finally {
            inputStream.reset();
        }
    }

    private void checkComma(int i13) throws HexFileValidationException {
        if (i13 != 58) {
            throw new HexFileValidationException("Not a HEX file");
        }
    }

    private int readAddress(InputStream inputStream) throws IOException {
        return readByte(inputStream) | (readByte(inputStream) << 8);
    }

    private int readByte(InputStream inputStream) throws IOException {
        return asciiToInt(inputStream.read()) | (asciiToInt(inputStream.read()) << 4);
    }

    private int readLine() throws IOException {
        if (this.pos == -1) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        while (true) {
            int i13 = inputStream.read();
            this.pos++;
            if (i13 != 10 && i13 != 13) {
                checkComma(i13);
                int i14 = readByte(inputStream);
                this.pos += 2;
                int address = readAddress(inputStream);
                this.pos += 4;
                int i15 = readByte(inputStream);
                int i16 = this.pos + 2;
                this.pos = i16;
                if (i15 != 0) {
                    if (i15 == 1) {
                        this.pos = -1;
                        return 0;
                    }
                    if (i15 == 2) {
                        int address2 = readAddress(inputStream) << 4;
                        int i17 = this.pos + 4;
                        this.pos = i17;
                        if (this.bytesRead > 0 && (address2 >> 16) != (this.lastAddress >> 16) + 1) {
                            return 0;
                        }
                        this.lastAddress = address2;
                        this.pos = (int) (((long) i17) + skip(inputStream, 2L));
                    } else if (i15 != 4) {
                        this.pos = (int) (((long) i16) + skip(inputStream, (((long) i14) * 2) + 2));
                    } else {
                        int address3 = readAddress(inputStream);
                        int i18 = this.pos + 4;
                        this.pos = i18;
                        if (this.bytesRead > 0 && address3 != (this.lastAddress >> 16) + 1) {
                            return 0;
                        }
                        this.lastAddress = address3 << 16;
                        this.pos = (int) (((long) i18) + skip(inputStream, 2L));
                    }
                } else if (this.lastAddress + address < this.MBRSize) {
                    this.pos = (int) (((long) i16) + skip(inputStream, (((long) i14) * 2) + 2));
                    i15 = -1;
                }
                if (i15 == 0) {
                    for (int i19 = 0; i19 < this.localBuf.length && i19 < i14; i19++) {
                        int i24 = readByte(inputStream);
                        this.pos += 2;
                        this.localBuf[i19] = (byte) i24;
                    }
                    this.pos = (int) (((long) this.pos) + skip(inputStream, 2L));
                    this.localPos = 0;
                    return i14;
                }
            }
        }
    }

    private long skip(InputStream inputStream, long j7) throws IOException {
        long jSkip = inputStream.skip(j7);
        return jSkip < j7 ? inputStream.skip(j7 - jSkip) + jSkip : jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.available - this.bytesRead;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i13) {
        try {
            super.mark(((FilterInputStream) this).in.available());
        } catch (IOException unused) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        throw new UnsupportedOperationException("Please, use readPacket() method instead");
    }

    public int readPacket(byte[] bArr) throws IOException {
        int i13 = 0;
        while (i13 < bArr.length) {
            int i14 = this.localPos;
            if (i14 < this.size) {
                byte[] bArr2 = this.localBuf;
                this.localPos = i14 + 1;
                bArr[i13] = bArr2[i14];
                i13++;
            } else {
                int i15 = this.bytesRead;
                int line = readLine();
                this.size = line;
                this.bytesRead = i15 + line;
                if (line == 0) {
                    break;
                }
            }
        }
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.pos = 0;
        this.bytesRead = 0;
        this.localPos = 128;
    }

    public int sizeInBytes() {
        return this.available;
    }

    public int sizeInPackets(int i13) {
        int iSizeInBytes = sizeInBytes();
        return (iSizeInBytes / i13) + (iSizeInBytes % i13 > 0 ? 1 : 0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return readPacket(bArr);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i13, int i14) {
        throw new UnsupportedOperationException("Please, use readPacket() method instead");
    }

    public HexInputStream(byte[] bArr, int i13) throws IOException {
        super(new ByteArrayInputStream(bArr));
        this.LINE_LENGTH = 128;
        byte[] bArr2 = new byte[128];
        this.localBuf = bArr2;
        this.localPos = 128;
        this.size = bArr2.length;
        this.lastAddress = 0;
        this.MBRSize = i13;
        this.available = calculateBinSize(i13);
    }
}

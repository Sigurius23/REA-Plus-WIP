package p273k6;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: k6.b */
/* JADX INFO: loaded from: classes.dex */
public class C22217b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: E */
    public final int f86572E;

    /* JADX INFO: renamed from: w */
    public final DataInputStream f86573w;

    /* JADX INFO: renamed from: x */
    public int f86574x;

    /* JADX INFO: renamed from: y */
    public ByteOrder f86575y;

    /* JADX INFO: renamed from: z */
    public byte[] f86576z;

    public C22217b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.f86572E = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f86573w.available();
    }

    /* JADX INFO: renamed from: b */
    public final void m63677b(int i13) throws IOException {
        int i14 = 0;
        while (i14 < i13) {
            int i15 = i13 - i14;
            DataInputStream dataInputStream = this.f86573w;
            int iSkip = (int) dataInputStream.skip(i15);
            if (iSkip <= 0) {
                if (this.f86576z == null) {
                    this.f86576z = new byte[DfuBaseService.ERROR_REMOTE_MASK];
                }
                iSkip = dataInputStream.read(this.f86576z, 0, Math.min(DfuBaseService.ERROR_REMOTE_MASK, i15));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC2875y.m8296i(i13, "Reached EOF while skipping ", " bytes."));
                }
            }
            i14 += iSkip;
        }
        this.f86574x += i14;
    }

    @Override // java.io.InputStream
    public final void mark(int i13) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f86574x++;
        return this.f86573w.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f86574x++;
        return this.f86573w.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f86574x++;
        int i13 = this.f86573w.read();
        if (i13 >= 0) {
            return (byte) i13;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f86574x += 2;
        return this.f86573w.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i13, int i14) throws IOException {
        this.f86574x += i14;
        this.f86573w.readFully(bArr, i13, i14);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f86574x += 4;
        DataInputStream dataInputStream = this.f86573w;
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        if ((i13 | i14 | i15 | i16) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f86575y;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i16 << 24) + (i15 << 16) + (i14 << 8) + i13;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i13 << 24) + (i14 << 16) + (i15 << 8) + i16;
        }
        throw new IOException("Invalid byte order: " + this.f86575y);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j7;
        long j13;
        this.f86574x += 8;
        DataInputStream dataInputStream = this.f86573w;
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        int i18 = dataInputStream.read();
        int i19 = dataInputStream.read();
        int i24 = dataInputStream.read();
        if ((i13 | i14 | i15 | i16 | i17 | i18 | i19 | i24) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f86575y;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j7 = (((long) i24) << 56) + (((long) i19) << 48) + (((long) i18) << 40) + (((long) i17) << 32) + (((long) i16) << 24) + (((long) i15) << 16) + (((long) i14) << 8);
            j13 = i13;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f86575y);
            }
            j7 = (((long) i13) << 56) + (((long) i14) << 48) + (((long) i15) << 40) + (((long) i16) << 32) + (((long) i17) << 24) + (((long) i18) << 16) + (((long) i19) << 8);
            j13 = i24;
        }
        return j7 + j13;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f86574x += 2;
        DataInputStream dataInputStream = this.f86573w;
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        if ((i13 | i14) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f86575y;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i14 << 8) + i13);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i13 << 8) + i14);
        }
        throw new IOException("Invalid byte order: " + this.f86575y);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f86574x += 2;
        return this.f86573w.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f86574x++;
        return this.f86573w.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f86574x += 2;
        DataInputStream dataInputStream = this.f86573w;
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        if ((i13 | i14) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f86575y;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i14 << 8) + i13;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i13 << 8) + i14;
        }
        throw new IOException("Invalid byte order: " + this.f86575y);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i13) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22217b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        int i15 = this.f86573w.read(bArr, i13, i14);
        this.f86574x += i15;
        return i15;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f86574x += bArr.length;
        this.f86573w.readFully(bArr);
    }

    public C22217b(InputStream inputStream, int i13) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f86573w = dataInputStream;
        dataInputStream.mark(0);
        this.f86574x = 0;
        this.f86575y = byteOrder;
        this.f86572E = inputStream instanceof C22217b ? ((C22217b) inputStream).f86572E : -1;
    }
}

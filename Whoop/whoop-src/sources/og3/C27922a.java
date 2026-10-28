package og3;

import java.io.DataInput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import jg3.C21689p;

/* JADX INFO: renamed from: og3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C27922a implements Externalizable {

    /* JADX INFO: renamed from: w */
    public byte f112617w;

    /* JADX INFO: renamed from: x */
    public Serializable f112618x;

    public C27922a(byte b, Serializable serializable) {
        this.f112617w = b;
        this.f112618x = serializable;
    }

    /* JADX INFO: renamed from: a */
    public static long m84260a(DataInput dataInput) {
        int i13 = dataInput.readByte() & 255;
        if (i13 == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i13 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    /* JADX INFO: renamed from: b */
    public static Serializable m84261b(byte b, DataInput dataInput) throws IOException {
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    return C27927f.m84275a(dataInput);
                }
                throw new StreamCorruptedException("Unknown serialized type");
            }
            long jM84260a = m84260a(dataInput);
            C21689p c21689pM84262c = m84262c(dataInput);
            C21689p c21689pM84262c2 = m84262c(dataInput);
            if (c21689pM84262c.equals(c21689pM84262c2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            return new C27926e(jM84260a, c21689pM84262c, c21689pM84262c2);
        }
        int i13 = dataInput.readInt();
        long[] jArr = new long[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            jArr[i14] = m84260a(dataInput);
        }
        int i15 = i13 + 1;
        C21689p[] c21689pArr = new C21689p[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            c21689pArr[i16] = m84262c(dataInput);
        }
        int i17 = dataInput.readInt();
        long[] jArr2 = new long[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            jArr2[i18] = m84260a(dataInput);
        }
        int i19 = i17 + 1;
        C21689p[] c21689pArr2 = new C21689p[i19];
        for (int i24 = 0; i24 < i19; i24++) {
            c21689pArr2[i24] = m84262c(dataInput);
        }
        int i25 = dataInput.readByte();
        C27927f[] c27927fArr = new C27927f[i25];
        for (int i26 = 0; i26 < i25; i26++) {
            c27927fArr[i26] = C27927f.m84275a(dataInput);
        }
        return new C27923b(jArr, c21689pArr, jArr2, c21689pArr2, c27927fArr);
    }

    /* JADX INFO: renamed from: c */
    public static C21689p m84262c(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? C21689p.m61076r(dataInput.readInt()) : C21689p.m61076r(b * 900);
    }

    /* JADX INFO: renamed from: d */
    public static void m84263d(long j7, ObjectOutput objectOutput) throws IOException {
        if (j7 < -4575744000L || j7 >= 10413792000L || j7 % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(j7);
        } else {
            int i13 = (int) ((j7 + 4575744000L) / 900);
            objectOutput.writeByte((i13 >>> 16) & 255);
            objectOutput.writeByte((i13 >>> 8) & 255);
            objectOutput.writeByte(i13 & 255);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m84264e(C21689p c21689p, ObjectOutput objectOutput) throws IOException {
        int i13 = c21689p.f83282x;
        int i14 = i13 % 900 == 0 ? i13 / 900 : 127;
        objectOutput.writeByte(i14);
        if (i14 == 127) {
            objectOutput.writeInt(i13);
        }
    }

    private Object readResolve() {
        return this.f112618x;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.f112617w = b;
        this.f112618x = m84261b(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f112617w;
        Serializable serializable = this.f112618x;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                ((C27927f) serializable).writeExternal(objectOutput);
                return;
            } else {
                C27926e c27926e = (C27926e) serializable;
                C21689p c21689p = c27926e.f112635x;
                m84263d(c27926e.f112634w.m64905o0(c21689p), objectOutput);
                m84264e(c21689p, objectOutput);
                m84264e(c27926e.f112636y, objectOutput);
                return;
            }
        }
        C27923b c27923b = (C27923b) serializable;
        C27927f[] c27927fArr = c27923b.f112620F;
        long[] jArr = c27923b.f112624y;
        long[] jArr2 = c27923b.f112622w;
        objectOutput.writeInt(jArr2.length);
        for (long j7 : jArr2) {
            m84263d(j7, objectOutput);
        }
        for (C21689p c21689p2 : c27923b.f112623x) {
            m84264e(c21689p2, objectOutput);
        }
        objectOutput.writeInt(jArr.length);
        for (long j13 : jArr) {
            m84263d(j13, objectOutput);
        }
        for (C21689p c21689p3 : c27923b.f112619E) {
            m84264e(c21689p3, objectOutput);
        }
        objectOutput.writeByte(c27927fArr.length);
        for (C27927f c27927f : c27927fArr) {
            c27927f.writeExternal(objectOutput);
        }
    }
}

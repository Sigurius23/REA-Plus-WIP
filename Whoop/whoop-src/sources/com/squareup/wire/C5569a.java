package com.squareup.wire;

import java.io.IOException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.squareup.wire.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C5569a extends AbstractC5586q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22082a = 0;

    /* JADX INFO: renamed from: b */
    public final AbstractC5586q f22083b;

    public C5569a(C5571b c5571b) {
        super(EnumC5573d.LENGTH_DELIMITED, AbstractC22671h0.f89337a.getOrCreateKotlinClass(long[].class), null, c5571b.getSyntax(), new double[0]);
        this.f22083b = c5571b;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object decode(C5587r reader) {
        switch (this.f22082a) {
            case 0:
                AbstractC22676k.m65750j(reader, "reader");
                return new double[]{Double.longBitsToDouble(reader.m16812i())};
            default:
                AbstractC22676k.m65750j(reader, "reader");
                return new float[]{Float.intBitsToFloat(reader.m16811h())};
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5588s c5588s, Object obj) {
        switch (this.f22082a) {
            case 0:
                double[] value = (double[]) obj;
                AbstractC22676k.m65750j(value, "value");
                for (double d3 : value) {
                    ((C5571b) this.f22083b).encode(c5588s, Double.valueOf(d3));
                }
                break;
            default:
                float[] value2 = (float[]) obj;
                AbstractC22676k.m65750j(value2, "value");
                for (float f13 : value2) {
                    ((C5571b) this.f22083b).encode(c5588s, Float.valueOf(f13));
                }
                break;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encodeWithTag(C5588s writer, int i13, Object obj) throws IOException {
        switch (this.f22082a) {
            case 0:
                double[] dArr = (double[]) obj;
                AbstractC22676k.m65750j(writer, "writer");
                if (dArr != null && dArr.length != 0) {
                    super.encodeWithTag(writer, i13, dArr);
                    break;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                AbstractC22676k.m65750j(writer, "writer");
                if (fArr != null && fArr.length != 0) {
                    super.encodeWithTag(writer, i13, fArr);
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSize(Object obj) {
        switch (this.f22082a) {
            case 0:
                double[] value = (double[]) obj;
                AbstractC22676k.m65750j(value, "value");
                int i13 = 0;
                for (double d3 : value) {
                    ((C5571b) this.f22083b).encodedSize(Double.valueOf(d3));
                    i13 += 8;
                }
                return i13;
            default:
                float[] value2 = (float[]) obj;
                AbstractC22676k.m65750j(value2, "value");
                int i14 = 0;
                for (float f13 : value2) {
                    ((C5571b) this.f22083b).getClass();
                    i14 += 4;
                }
                return i14;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSizeWithTag(int i13, Object obj) {
        switch (this.f22082a) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return 0;
                }
                return super.encodedSizeWithTag(i13, dArr);
            default:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return 0;
                }
                return super.encodedSizeWithTag(i13, fArr);
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object redact(Object obj) {
        switch (this.f22082a) {
            case 0:
                double[] value = (double[]) obj;
                AbstractC22676k.m65750j(value, "value");
                return new double[0];
            default:
                float[] value2 = (float[]) obj;
                AbstractC22676k.m65750j(value2, "value");
                return new float[0];
        }
    }

    public C5569a(C5571b c5571b, byte b) {
        super(EnumC5573d.LENGTH_DELIMITED, AbstractC22671h0.f89337a.getOrCreateKotlinClass(long[].class), null, c5571b.getSyntax(), new float[0]);
        this.f22083b = c5571b;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5591v c5591v, Object obj) {
        switch (this.f22082a) {
            case 0:
                double[] value = (double[]) obj;
                AbstractC22676k.m65750j(value, "value");
                int length = value.length;
                while (true) {
                    length--;
                    if (-1 < length) {
                        c5591v.m16827f(Double.doubleToLongBits(value[length]));
                    }
                    break;
                }
                break;
            default:
                float[] value2 = (float[]) obj;
                AbstractC22676k.m65750j(value2, "value");
                int length2 = value2.length;
                while (true) {
                    length2--;
                    if (-1 < length2) {
                        c5591v.m16826e(Float.floatToIntBits(value2[length2]));
                    }
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encodeWithTag(C5591v writer, int i13, Object obj) throws IOException {
        switch (this.f22082a) {
            case 0:
                double[] dArr = (double[]) obj;
                AbstractC22676k.m65750j(writer, "writer");
                if (dArr != null && dArr.length != 0) {
                    super.encodeWithTag(writer, i13, dArr);
                    break;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                AbstractC22676k.m65750j(writer, "writer");
                if (fArr != null && fArr.length != 0) {
                    super.encodeWithTag(writer, i13, fArr);
                    break;
                }
                break;
        }
    }
}

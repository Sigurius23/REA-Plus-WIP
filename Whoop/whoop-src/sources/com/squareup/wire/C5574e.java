package com.squareup.wire;

import j93.InterfaceC21461d;
import java.io.IOException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.squareup.wire.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C5574e extends AbstractC5586q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22091a;

    /* JADX INFO: renamed from: b */
    public final AbstractC5586q f22092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5574e(AbstractC5586q abstractC5586q, int i13) {
        super(EnumC5573d.LENGTH_DELIMITED, AbstractC22671h0.f89337a.getOrCreateKotlinClass(int[].class), null, abstractC5586q.getSyntax(), new int[0]);
        this.f22091a = i13;
        switch (i13) {
            case 1:
                super(EnumC5573d.LENGTH_DELIMITED, AbstractC22671h0.f89337a.getOrCreateKotlinClass(long[].class), null, abstractC5586q.getSyntax(), new long[0]);
                this.f22092b = abstractC5586q;
                break;
            default:
                this.f22092b = abstractC5586q;
                break;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object decode(C5587r reader) {
        int i13 = this.f22091a;
        AbstractC5586q abstractC5586q = this.f22092b;
        switch (i13) {
            case 0:
                AbstractC22676k.m65750j(reader, "reader");
                return new int[]{((Number) abstractC5586q.decode(reader)).intValue()};
            case 1:
                AbstractC22676k.m65750j(reader, "reader");
                return new long[]{((Number) abstractC5586q.decode(reader)).longValue()};
            default:
                AbstractC22676k.m65750j(reader, "reader");
                Object identity = abstractC5586q.getIdentity();
                long jM16807d = reader.m16807d();
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        reader.m16808e(jM16807d);
                        return identity;
                    }
                    if (iM16810g == 1) {
                        identity = abstractC5586q.decode(reader);
                    } else {
                        reader.m16813j(iM16810g);
                    }
                }
                break;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5588s c5588s, Object obj) throws IOException {
        switch (this.f22091a) {
            case 0:
                int[] value = (int[]) obj;
                AbstractC22676k.m65750j(value, "value");
                for (int i13 : value) {
                    this.f22092b.encode(c5588s, Integer.valueOf(i13));
                }
                break;
            case 1:
                long[] value2 = (long[]) obj;
                AbstractC22676k.m65750j(value2, "value");
                for (long j7 : value2) {
                    this.f22092b.encode(c5588s, Long.valueOf(j7));
                }
                break;
            default:
                if (obj != null) {
                    AbstractC5586q abstractC5586q = this.f22092b;
                    if (!obj.equals(abstractC5586q.getIdentity())) {
                        abstractC5586q.encodeWithTag(c5588s, 1, obj);
                    }
                }
                break;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public void encodeWithTag(C5588s writer, int i13, Object obj) throws IOException {
        switch (this.f22091a) {
            case 0:
                int[] iArr = (int[]) obj;
                AbstractC22676k.m65750j(writer, "writer");
                if (iArr != null && iArr.length != 0) {
                    super.encodeWithTag(writer, i13, iArr);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                AbstractC22676k.m65750j(writer, "writer");
                if (jArr != null && jArr.length != 0) {
                    super.encodeWithTag(writer, i13, jArr);
                    break;
                }
                break;
            default:
                super.encodeWithTag(writer, i13, obj);
                break;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSize(Object obj) {
        switch (this.f22091a) {
            case 0:
                int[] value = (int[]) obj;
                AbstractC22676k.m65750j(value, "value");
                int iEncodedSize = 0;
                for (int i13 : value) {
                    iEncodedSize += this.f22092b.encodedSize(Integer.valueOf(i13));
                }
                return iEncodedSize;
            case 1:
                long[] value2 = (long[]) obj;
                AbstractC22676k.m65750j(value2, "value");
                int iEncodedSize2 = 0;
                for (long j7 : value2) {
                    iEncodedSize2 += this.f22092b.encodedSize(Long.valueOf(j7));
                }
                return iEncodedSize2;
            default:
                if (obj != null) {
                    AbstractC5586q abstractC5586q = this.f22092b;
                    if (!obj.equals(abstractC5586q.getIdentity())) {
                        return abstractC5586q.encodedSizeWithTag(1, obj);
                    }
                }
                return 0;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public int encodedSizeWithTag(int i13, Object obj) {
        switch (this.f22091a) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return 0;
                }
                return super.encodedSizeWithTag(i13, iArr);
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return 0;
                }
                return super.encodedSizeWithTag(i13, jArr);
            default:
                return super.encodedSizeWithTag(i13, obj);
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object redact(Object obj) {
        switch (this.f22091a) {
            case 0:
                int[] value = (int[]) obj;
                AbstractC22676k.m65750j(value, "value");
                return new int[0];
            case 1:
                long[] value2 = (long[]) obj;
                AbstractC22676k.m65750j(value2, "value");
                return new long[0];
            default:
                if (obj == null) {
                    return null;
                }
                return this.f22092b.redact(obj);
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public void encodeWithTag(C5591v writer, int i13, Object obj) throws IOException {
        switch (this.f22091a) {
            case 0:
                int[] iArr = (int[]) obj;
                AbstractC22676k.m65750j(writer, "writer");
                if (iArr != null && iArr.length != 0) {
                    super.encodeWithTag(writer, i13, iArr);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                AbstractC22676k.m65750j(writer, "writer");
                if (jArr != null && jArr.length != 0) {
                    super.encodeWithTag(writer, i13, jArr);
                    break;
                }
                break;
            default:
                super.encodeWithTag(writer, i13, obj);
                break;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5591v c5591v, Object obj) throws IOException {
        switch (this.f22091a) {
            case 0:
                int[] value = (int[]) obj;
                AbstractC22676k.m65750j(value, "value");
                int length = value.length;
                while (true) {
                    length--;
                    if (-1 < length) {
                        this.f22092b.encode(c5591v, Integer.valueOf(value[length]));
                    }
                    break;
                }
                break;
            case 1:
                long[] value2 = (long[]) obj;
                AbstractC22676k.m65750j(value2, "value");
                int length2 = value2.length;
                while (true) {
                    length2--;
                    if (-1 < length2) {
                        this.f22092b.encode(c5591v, Long.valueOf(value2[length2]));
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    AbstractC5586q abstractC5586q = this.f22092b;
                    if (!obj.equals(abstractC5586q.getIdentity())) {
                        abstractC5586q.encodeWithTag(c5591v, 1, obj);
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5574e(String str, AbstractC5586q abstractC5586q, InterfaceC21461d interfaceC21461d, Object obj) {
        super(EnumC5573d.LENGTH_DELIMITED, interfaceC21461d, str, EnumC5593x.PROTO_3, obj);
        this.f22091a = 2;
        this.f22092b = abstractC5586q;
    }
}

package p367of;

import p326mf.AbstractC25492l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: of.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C27892a extends AbstractC25492l {

    /* JADX INFO: renamed from: a */
    public final byte[] f112471a;

    /* JADX INFO: renamed from: b */
    public final long f112472b;

    public C27892a(byte[] bytes) {
        AbstractC22676k.m65750j(bytes, "bytes");
        this.f112471a = bytes;
        this.f112472b = bytes.length;
    }

    @Override // p326mf.AbstractC25492l
    /* JADX INFO: renamed from: a */
    public final Long mo74901a() {
        return Long.valueOf(this.f112472b);
    }

    @Override // p326mf.AbstractC25492l
    /* JADX INFO: renamed from: c */
    public final boolean mo74902c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m84163d() {
        return this.f112471a;
    }
}

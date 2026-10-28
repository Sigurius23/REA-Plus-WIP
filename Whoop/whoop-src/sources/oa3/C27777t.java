package oa3;

import no.nordicsemi.android.dfu.DfuBaseService;

/* JADX INFO: renamed from: oa3.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C27777t {

    /* JADX INFO: renamed from: i */
    public static final C27777t f111974i = new C27777t(new C27777t(null, 2047), 2012);

    /* JADX INFO: renamed from: a */
    public final boolean f111975a;

    /* JADX INFO: renamed from: b */
    public final boolean f111976b;

    /* JADX INFO: renamed from: c */
    public final C27777t f111977c;

    /* JADX INFO: renamed from: d */
    public final boolean f111978d;

    /* JADX INFO: renamed from: e */
    public final C27777t f111979e;

    /* JADX INFO: renamed from: f */
    public final C27777t f111980f;

    /* JADX INFO: renamed from: g */
    public final boolean f111981g;

    /* JADX INFO: renamed from: h */
    public final boolean f111982h;

    public C27777t(boolean z4, boolean z13, C27777t c27777t, boolean z14, C27777t c27777t2, C27777t c27777t3, boolean z15, boolean z16) {
        this.f111975a = z4;
        this.f111976b = z13;
        this.f111977c = c27777t;
        this.f111978d = z14;
        this.f111979e = c27777t2;
        this.f111980f = c27777t3;
        this.f111981g = z15;
        this.f111982h = z16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C27777t(C27777t c27777t, int i13) {
        boolean z4 = (i13 & 1) != 0;
        boolean z13 = (i13 & 2) != 0;
        C27777t c27777t2 = (i13 & 32) != 0 ? null : c27777t;
        this(z4, z13, c27777t2, true, c27777t2, c27777t2, (i13 & 512) == 0, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0);
    }
}

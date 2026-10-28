package oe3;

import java.util.ArrayList;
import ne3.C26611e0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oe3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C27889i {

    /* JADX INFO: renamed from: a */
    public final C26611e0 f112448a;

    /* JADX INFO: renamed from: b */
    public final boolean f112449b;

    /* JADX INFO: renamed from: c */
    public final String f112450c;

    /* JADX INFO: renamed from: d */
    public final long f112451d;

    /* JADX INFO: renamed from: e */
    public final long f112452e;

    /* JADX INFO: renamed from: f */
    public final long f112453f;

    /* JADX INFO: renamed from: g */
    public final int f112454g;

    /* JADX INFO: renamed from: h */
    public final long f112455h;

    /* JADX INFO: renamed from: i */
    public final int f112456i;

    /* JADX INFO: renamed from: j */
    public final int f112457j;

    /* JADX INFO: renamed from: k */
    public final Long f112458k;

    /* JADX INFO: renamed from: l */
    public final Long f112459l;

    /* JADX INFO: renamed from: m */
    public final Long f112460m;

    /* JADX INFO: renamed from: n */
    public final Integer f112461n;

    /* JADX INFO: renamed from: o */
    public final Integer f112462o;

    /* JADX INFO: renamed from: p */
    public final Integer f112463p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f112464q;

    public C27889i(C26611e0 canonicalPath, boolean z4, String comment, long j7, long j13, long j14, int i13, long j15, int i14, int i15, Long l7, Long l12, Long l13, Integer num, Integer num2, Integer num3) {
        AbstractC22676k.m65750j(canonicalPath, "canonicalPath");
        AbstractC22676k.m65750j(comment, "comment");
        this.f112448a = canonicalPath;
        this.f112449b = z4;
        this.f112450c = comment;
        this.f112451d = j7;
        this.f112452e = j13;
        this.f112453f = j14;
        this.f112454g = i13;
        this.f112455h = j15;
        this.f112456i = i14;
        this.f112457j = i15;
        this.f112458k = l7;
        this.f112459l = l12;
        this.f112460m = l13;
        this.f112461n = num;
        this.f112462o = num2;
        this.f112463p = num3;
        this.f112464q = new ArrayList();
    }

    public /* synthetic */ C27889i(C26611e0 c26611e0, boolean z4, String str, long j7, long j13, long j14, int i13, long j15, int i14, int i15, Long l7, Long l12, Long l13, int i16) {
        this(c26611e0, z4, (i16 & 4) != 0 ? "" : str, (i16 & 8) != 0 ? -1L : j7, (i16 & 16) != 0 ? -1L : j13, (i16 & 32) != 0 ? -1L : j14, (i16 & 64) != 0 ? -1 : i13, (i16 & 128) != 0 ? -1L : j15, (i16 & 256) != 0 ? -1 : i14, (i16 & 512) != 0 ? -1 : i15, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : l7, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : l12, (i16 & 4096) != 0 ? null : l13, null, null, null);
    }
}

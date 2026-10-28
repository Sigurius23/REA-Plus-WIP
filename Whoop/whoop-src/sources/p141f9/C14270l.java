package p141f9;

import android.net.Uri;
import e10.C12554k0;
import java.util.ArrayList;
import p112e9.InterfaceC12870i;
import p516u8.C34610p;
import p690zr.AbstractC41023g0;

/* JADX INFO: renamed from: f9.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C14270l extends AbstractC14271m {

    /* JADX INFO: renamed from: F */
    public final C14268j f52108F;

    /* JADX INFO: renamed from: G */
    public final C12554k0 f52109G;

    public C14270l(C34610p c34610p, AbstractC41023g0 abstractC41023g0, C14276r c14276r, ArrayList arrayList) {
        super(c34610p, abstractC41023g0, c14276r, arrayList);
        Uri.parse(((C14260b) abstractC41023g0.get(0)).f52058a);
        long j7 = c14276r.f52128e;
        C14268j c14268j = j7 <= 0 ? null : new C14268j(null, c14276r.f52127d, j7);
        this.f52108F = c14268j;
        this.f52109G = c14268j == null ? new C12554k0(new C14268j(null, 0L, -1L), 13) : null;
    }

    @Override // p141f9.AbstractC14271m
    /* JADX INFO: renamed from: b */
    public final String mo40752b() {
        return null;
    }

    @Override // p141f9.AbstractC14271m
    /* JADX INFO: renamed from: c */
    public final InterfaceC12870i mo40753c() {
        return this.f52109G;
    }

    @Override // p141f9.AbstractC14271m
    /* JADX INFO: renamed from: d */
    public final C14268j mo40754d() {
        return this.f52108F;
    }
}

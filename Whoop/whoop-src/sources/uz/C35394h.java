package uz;

import bc3.C3033m;
import p715kotlin.jvm.internal.AbstractC22676k;
import u40.C34531g;
import x40.InterfaceC37952b;

/* JADX INFO: renamed from: uz.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C35394h implements InterfaceC37952b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C3033m f150812w;

    public C35394h(C3033m c3033m) {
        this.f150812w = c3033m;
    }

    @Override // x40.InterfaceC37952b
    public final void onSuccess(Object obj) {
        C34531g result = (C34531g) obj;
        AbstractC22676k.m65750j(result, "result");
        this.f150812w.resumeWith(new C35405s(result.f145152a));
    }
}

package vy0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28690z0;
import p512u2.C34472r;
import y71.C39274g;

/* JADX INFO: renamed from: vy0.o */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36587o implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f156720w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f156721x;

    public /* synthetic */ C36587o(Object obj, int i13) {
        this.f156720w = i13;
        this.f156721x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f156720w) {
            case 0:
                return AbstractC36588p.a.m117502f((InterfaceC28690z0) this.f156721x, (C34472r) obj, ((Float) obj2).floatValue());
            case 1:
                return AbstractC36588p.m117430a0((InterfaceC4351m) this.f156721x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC36596x.m117527q((C39274g) this.f156721x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC36568c0.m117313r((InterfaceC28601c1) this.f156721x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}

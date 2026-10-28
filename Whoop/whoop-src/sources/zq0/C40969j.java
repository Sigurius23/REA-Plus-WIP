package zq0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p512u2.C34472r;
import p715kotlin.jvm.internal.C22663d0;

/* JADX INFO: renamed from: zq0.j */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C40969j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176828w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f176829x;

    public /* synthetic */ C40969j(Object obj, int i13) {
        this.f176828w = i13;
        this.f176829x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f176828w) {
            case 0:
                return AbstractC40965f.d.m132995h((C22663d0) this.f176829x, (C34472r) obj, ((Float) obj2).floatValue());
            default:
                return AbstractC40960c0.m132916g((C40962d0) this.f176829x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}

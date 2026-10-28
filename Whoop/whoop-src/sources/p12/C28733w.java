package p12;

import c93.InterfaceC4339a;
import p163g1.C15199y3;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p12.w */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28733w implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116285w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f116286x;

    public /* synthetic */ C28733w(Object obj, int i13) {
        this.f116285w = i13;
        this.f116286x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f116285w) {
            case 0:
                return AbstractC28734x.a.m87464h((C15199y3) this.f116286x);
            case 1:
                return AbstractC28734x.b.m87467h((C15199y3) this.f116286x);
            default:
                return AbstractC28734x.m87410W((Function1) this.f116286x);
        }
    }
}

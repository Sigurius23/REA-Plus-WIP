package p032bc;

import java.util.ArrayList;

/* JADX INFO: renamed from: bc.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C2959l extends AbstractC2975x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f11864a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f11865b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f11866c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f11867d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2963n f11868e;

    public C2959l(C2963n c2963n, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f11868e = c2963n;
        this.f11864a = obj;
        this.f11865b = arrayList;
        this.f11866c = obj2;
        this.f11867d = arrayList2;
    }

    @Override // p032bc.AbstractC2975x, p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: b */
    public final void mo8571b(AbstractC2974w abstractC2974w) {
        C2963n c2963n = this.f11868e;
        Object obj = this.f11864a;
        if (obj != null) {
            c2963n.m8635z(obj, this.f11865b, null);
        }
        Object obj2 = this.f11866c;
        if (obj2 != null) {
            c2963n.m8635z(obj2, this.f11867d, null);
        }
    }

    @Override // p032bc.AbstractC2975x, p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: c */
    public final void mo8572c(AbstractC2974w abstractC2974w) {
        abstractC2974w.mo8576C(this);
    }
}

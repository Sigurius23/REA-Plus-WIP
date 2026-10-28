package hr;

import android.graphics.Typeface;
import p477s2.AbstractC32073e;
import p513u4.AbstractC34514b;

/* JADX INFO: renamed from: hr.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C17572b extends AbstractC34514b {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC32073e f68085h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C17574d f68086i;

    public C17572b(C17574d c17574d, AbstractC32073e abstractC32073e) {
        this.f68086i = c17574d;
        this.f68085h = abstractC32073e;
    }

    @Override // p513u4.AbstractC34514b
    /* JADX INFO: renamed from: j */
    public final void mo50020j(int i13) {
        this.f68086i.f68103m = true;
        this.f68085h.mo29862Q(i13);
    }

    @Override // p513u4.AbstractC34514b
    /* JADX INFO: renamed from: k */
    public final void mo50021k(Typeface typeface) {
        C17574d c17574d = this.f68086i;
        c17574d.f68104n = Typeface.create(typeface, c17574d.f68093c);
        c17574d.f68103m = true;
        this.f68085h.mo29863R(c17574d.f68104n, false);
    }
}

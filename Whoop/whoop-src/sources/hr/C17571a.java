package hr;

import android.graphics.Typeface;
import cr.C11064b;
import p477s2.AbstractC32073e;

/* JADX INFO: renamed from: hr.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17571a extends AbstractC32073e {

    /* JADX INFO: renamed from: a */
    public final Typeface f68082a;

    /* JADX INFO: renamed from: b */
    public final C11064b f68083b;

    /* JADX INFO: renamed from: c */
    public boolean f68084c;

    public C17571a(C11064b c11064b, Typeface typeface) {
        this.f68082a = typeface;
        this.f68083b = c11064b;
    }

    @Override // p477s2.AbstractC32073e
    /* JADX INFO: renamed from: Q */
    public final void mo29862Q(int i13) {
        if (this.f68084c) {
            return;
        }
        this.f68083b.m29840a(this.f68082a);
    }

    @Override // p477s2.AbstractC32073e
    /* JADX INFO: renamed from: R */
    public final void mo29863R(Typeface typeface, boolean z4) {
        if (this.f68084c) {
            return;
        }
        this.f68083b.m29840a(typeface);
    }
}

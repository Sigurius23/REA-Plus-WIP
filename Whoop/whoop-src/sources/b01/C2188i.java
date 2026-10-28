package b01;

import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: b01.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, m65681d2 = {"Lb01/i;", "Lm91/u;", "Lb01/q;", "searchableListViewState", "Lb01/d;", "cta", "Lny0/h;", "button", "<init>", "(Lb01/q;Lb01/d;Lny0/h;)V", "a", "(Lb01/q;Lb01/d;Lny0/h;)Lb01/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lb01/q;", "f", "()Lb01/q;", "b", "Lb01/d;", "e", "()Lb01/d;", "c", "Lny0/h;", "()Lny0/h;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2188i implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C2196q searchableListViewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C2183d cta;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27256h button;

    public C2188i(C2196q searchableListViewState, C2183d cta, C27256h c27256h) {
        AbstractC22676k.m65750j(searchableListViewState, "searchableListViewState");
        AbstractC22676k.m65750j(cta, "cta");
        this.searchableListViewState = searchableListViewState;
        this.cta = cta;
        this.button = c27256h;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2188i m6894b(C2188i c2188i, C2196q c2196q, C2183d c2183d, C27256h c27256h, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c2196q = c2188i.searchableListViewState;
        }
        if ((i13 & 2) != 0) {
            c2183d = c2188i.cta;
        }
        if ((i13 & 4) != 0) {
            c27256h = c2188i.button;
        }
        return c2188i.m6895a(c2196q, c2183d, c27256h);
    }

    /* JADX INFO: renamed from: a */
    public final C2188i m6895a(C2196q searchableListViewState, C2183d cta, C27256h button) {
        AbstractC22676k.m65750j(searchableListViewState, "searchableListViewState");
        AbstractC22676k.m65750j(cta, "cta");
        return new C2188i(searchableListViewState, cta, button);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27256h getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C2183d getCta() {
        return this.cta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2188i)) {
            return false;
        }
        C2188i c2188i = (C2188i) other;
        return AbstractC22676k.m65745e(this.searchableListViewState, c2188i.searchableListViewState) && AbstractC22676k.m65745e(this.cta, c2188i.cta) && AbstractC22676k.m65745e(this.button, c2188i.button);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C2196q getSearchableListViewState() {
        return this.searchableListViewState;
    }

    public int hashCode() {
        int iHashCode = (this.cta.hashCode() + (this.searchableListViewState.hashCode() * 31)) * 31;
        C27256h c27256h = this.button;
        return iHashCode + (c27256h == null ? 0 : c27256h.hashCode());
    }

    public String toString() {
        return "SanguineWaitlistBiomarkerListPreviewViewState(searchableListViewState=" + this.searchableListViewState + ", cta=" + this.cta + ", button=" + this.button + ")";
    }
}

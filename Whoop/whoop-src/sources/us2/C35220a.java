package us2;

import p000.AbstractC11266d;
import p31.C28801l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: us2.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lus2/a;", "Lm91/u;", "Lp31/l;", "headerSection", "", "path", "errorState", "<init>", "(Lp31/l;Ljava/lang/String;Lm91/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp31/l;", "b", "()Lp31/l;", "Ljava/lang/String;", "c", "Lm91/u;", "()Lm91/u;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35220a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28801l headerSection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25312u errorState;

    public C35220a(C28801l headerSection, String path, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(headerSection, "headerSection");
        AbstractC22676k.m65750j(path, "path");
        this.headerSection = headerSection;
        this.path = path;
        this.errorState = interfaceC25312u;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getErrorState() {
        return this.errorState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C28801l getHeaderSection() {
        return this.headerSection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35220a)) {
            return false;
        }
        C35220a c35220a = (C35220a) other;
        return AbstractC22676k.m65745e(this.headerSection, c35220a.headerSection) && AbstractC22676k.m65745e(this.path, c35220a.path) && AbstractC22676k.m65745e(this.errorState, c35220a.errorState);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.headerSection.hashCode() * 31, 31, this.path);
        InterfaceC25312u interfaceC25312u = this.errorState;
        return iM30450d + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode());
    }

    public String toString() {
        return "ChallengeLandingCustomPlanState(headerSection=" + this.headerSection + ", path=" + this.path + ", errorState=" + this.errorState + ")";
    }
}

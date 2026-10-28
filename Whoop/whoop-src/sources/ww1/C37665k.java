package ww1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uw1.C35310c;

/* JADX INFO: renamed from: ww1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lww1/k;", "Lww1/a;", "", "isNewMember", "Luw1/c$c;", "hubScreenContent", "<init>", "(ZLuw1/c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Luw1/c$c;", "()Luw1/c$c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37665k implements InterfaceC37655a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isNewMember;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35310c.c hubScreenContent;

    public C37665k(boolean z4, C35310c.c cVar) {
        this.isNewMember = z4;
        this.hubScreenContent = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C35310c.c getHubScreenContent() {
        return this.hubScreenContent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsNewMember() {
        return this.isNewMember;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37665k)) {
            return false;
        }
        C37665k c37665k = (C37665k) other;
        return this.isNewMember == c37665k.isNewMember && AbstractC22676k.m65745e(this.hubScreenContent, c37665k.hubScreenContent);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isNewMember) * 31;
        C35310c.c cVar = this.hubScreenContent;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "TappedInviteFromFPH(isNewMember=" + this.isNewMember + ", hubScreenContent=" + this.hubScreenContent + ")";
    }
}

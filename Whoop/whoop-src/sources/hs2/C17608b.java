package hs2;

import hy0.C17749h0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hs2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lhs2/b;", "", "", "id", "displayName", "initials", "Lhy0/h0;", "profileImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhy0/h0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getDisplayName", "c", "getInitials", "d", "Lhy0/h0;", "getProfileImage", "()Lhy0/h0;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17608b {

    /* JADX INFO: renamed from: e */
    public static final int f68227e = C17749h0.f69004h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String initials;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17749h0 profileImage;

    public C17608b(String id4, String displayName, String initials, C17749h0 c17749h0) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(displayName, "displayName");
        AbstractC22676k.m65750j(initials, "initials");
        this.id = id4;
        this.displayName = displayName;
        this.initials = initials;
        this.profileImage = c17749h0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17608b)) {
            return false;
        }
        C17608b c17608b = (C17608b) other;
        return AbstractC22676k.m65745e(this.id, c17608b.id) && AbstractC22676k.m65745e(this.displayName, c17608b.displayName) && AbstractC22676k.m65745e(this.initials, c17608b.initials) && AbstractC22676k.m65745e(this.profileImage, c17608b.profileImage);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.displayName), 31, this.initials);
        C17749h0 c17749h0 = this.profileImage;
        return iM30450d + (c17749h0 == null ? 0 : c17749h0.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.displayName;
        String str3 = this.initials;
        C17749h0 c17749h0 = this.profileImage;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("VideoCallParticipantViewState(id=", str, ", displayName=", str2, ", initials=");
        sbM32001t.append(str3);
        sbM32001t.append(", profileImage=");
        sbM32001t.append(c17749h0);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}

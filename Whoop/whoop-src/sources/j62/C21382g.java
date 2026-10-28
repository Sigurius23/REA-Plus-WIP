package j62;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j62.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lj62/g;", "", "", "code", "shareCtaText", "sharedText", "shareMessage", "bottomCtaText", "", "isShared", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "e", "d", "f", "Z", "()Z", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21382g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String shareCtaText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String sharedText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String shareMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String bottomCtaText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isShared;

    public C21382g(String code, String shareCtaText, String sharedText, String shareMessage, String bottomCtaText, boolean z4) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(shareCtaText, "shareCtaText");
        AbstractC22676k.m65750j(sharedText, "sharedText");
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        AbstractC22676k.m65750j(bottomCtaText, "bottomCtaText");
        this.code = code;
        this.shareCtaText = shareCtaText;
        this.sharedText = sharedText;
        this.shareMessage = shareMessage;
        this.bottomCtaText = bottomCtaText;
        this.isShared = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBottomCtaText() {
        return this.bottomCtaText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getShareCtaText() {
        return this.shareCtaText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getShareMessage() {
        return this.shareMessage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSharedText() {
        return this.sharedText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21382g)) {
            return false;
        }
        C21382g c21382g = (C21382g) other;
        return AbstractC22676k.m65745e(this.code, c21382g.code) && AbstractC22676k.m65745e(this.shareCtaText, c21382g.shareCtaText) && AbstractC22676k.m65745e(this.sharedText, c21382g.sharedText) && AbstractC22676k.m65745e(this.shareMessage, c21382g.shareMessage) && AbstractC22676k.m65745e(this.bottomCtaText, c21382g.bottomCtaText) && this.isShared == c21382g.isShared;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsShared() {
        return this.isShared;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isShared) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.code.hashCode() * 31, 31, this.shareCtaText), 31, this.sharedText), 31, this.shareMessage), 31, this.bottomCtaText);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.shareCtaText;
        String str3 = this.sharedText;
        String str4 = this.shareMessage;
        String str5 = this.bottomCtaText;
        boolean z4 = this.isShared;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TrialsItemDomainState(code=", str, ", shareCtaText=", str2, ", sharedText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", shareMessage=", str4, ", bottomCtaText=");
        return AbstractC21702c.m61137h(sbM32001t, str5, ", isShared=", z4, ")");
    }
}

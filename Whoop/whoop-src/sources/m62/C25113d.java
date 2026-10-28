package m62;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m62.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001e"}, m65681d2 = {"Lm62/d;", "", "", "title", "body", "", "referralsCompleted", "referralsNeeded", "referralProgressText", "daysLeftText", "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "c", "I", "e", "d", "f", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25113d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String body;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int referralsCompleted;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int referralsNeeded;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String referralProgressText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String daysLeftText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int buttonTitle;

    public C25113d(String title, String body, int i13, int i14, String referralProgressText, String str, int i15) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(referralProgressText, "referralProgressText");
        this.title = title;
        this.body = body;
        this.referralsCompleted = i13;
        this.referralsNeeded = i14;
        this.referralProgressText = referralProgressText;
        this.daysLeftText = str;
        this.buttonTitle = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDaysLeftText() {
        return this.daysLeftText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getReferralProgressText() {
        return this.referralProgressText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getReferralsCompleted() {
        return this.referralsCompleted;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25113d)) {
            return false;
        }
        C25113d c25113d = (C25113d) other;
        return AbstractC22676k.m65745e(this.title, c25113d.title) && AbstractC22676k.m65745e(this.body, c25113d.body) && this.referralsCompleted == c25113d.referralsCompleted && this.referralsNeeded == c25113d.referralsNeeded && AbstractC22676k.m65745e(this.referralProgressText, c25113d.referralProgressText) && AbstractC22676k.m65745e(this.daysLeftText, c25113d.daysLeftText) && this.buttonTitle == c25113d.buttonTitle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getReferralsNeeded() {
        return this.referralsNeeded;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.referralsNeeded, AbstractC11266d.m30448b(this.referralsCompleted, AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body), 31), 31), 31, this.referralProgressText);
        String str = this.daysLeftText;
        return Integer.hashCode(this.buttonTitle) + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        int i13 = this.referralsCompleted;
        int i14 = this.referralsNeeded;
        String str3 = this.referralProgressText;
        String str4 = this.daysLeftText;
        int i15 = this.buttonTitle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PromotionCardViewState(title=", str, ", body=", str2, ", referralsCompleted=");
        AbstractC30802r.m94773v(sbM32001t, i13, ", referralsNeeded=", i14, ", referralProgressText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", daysLeftText=", str4, ", buttonTitle=");
        return AbstractC18489d0.m53371l(sbM32001t, i15, ")");
    }
}

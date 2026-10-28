package vy2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vy2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001f"}, m65681d2 = {"Lvy2/c;", "", "", "submittingTitle", "submittingSubtitle", "submittedTitle", "submittedSubtitle", "submittedErrorTitle", "submittedErrorSubtitle", "submittedErrorPositiveCta", "submittedErrorNegativeCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "g", "c", "f", "d", "e", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36605c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String submittingTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String submittingSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String submittedTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String submittedSubtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String submittedErrorTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String submittedErrorSubtitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String submittedErrorPositiveCta;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String submittedErrorNegativeCta;

    public C36605c(String submittingTitle, String str, String submittedTitle, String str2, String submittedErrorTitle, String str3, String submittedErrorPositiveCta, String submittedErrorNegativeCta) {
        AbstractC22676k.m65750j(submittingTitle, "submittingTitle");
        AbstractC22676k.m65750j(submittedTitle, "submittedTitle");
        AbstractC22676k.m65750j(submittedErrorTitle, "submittedErrorTitle");
        AbstractC22676k.m65750j(submittedErrorPositiveCta, "submittedErrorPositiveCta");
        AbstractC22676k.m65750j(submittedErrorNegativeCta, "submittedErrorNegativeCta");
        this.submittingTitle = submittingTitle;
        this.submittingSubtitle = str;
        this.submittedTitle = submittedTitle;
        this.submittedSubtitle = str2;
        this.submittedErrorTitle = submittedErrorTitle;
        this.submittedErrorSubtitle = str3;
        this.submittedErrorPositiveCta = submittedErrorPositiveCta;
        this.submittedErrorNegativeCta = submittedErrorNegativeCta;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSubmittedErrorNegativeCta() {
        return this.submittedErrorNegativeCta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubmittedErrorPositiveCta() {
        return this.submittedErrorPositiveCta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubmittedErrorSubtitle() {
        return this.submittedErrorSubtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubmittedErrorTitle() {
        return this.submittedErrorTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubmittedSubtitle() {
        return this.submittedSubtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36605c)) {
            return false;
        }
        C36605c c36605c = (C36605c) other;
        return AbstractC22676k.m65745e(this.submittingTitle, c36605c.submittingTitle) && AbstractC22676k.m65745e(this.submittingSubtitle, c36605c.submittingSubtitle) && AbstractC22676k.m65745e(this.submittedTitle, c36605c.submittedTitle) && AbstractC22676k.m65745e(this.submittedSubtitle, c36605c.submittedSubtitle) && AbstractC22676k.m65745e(this.submittedErrorTitle, c36605c.submittedErrorTitle) && AbstractC22676k.m65745e(this.submittedErrorSubtitle, c36605c.submittedErrorSubtitle) && AbstractC22676k.m65745e(this.submittedErrorPositiveCta, c36605c.submittedErrorPositiveCta) && AbstractC22676k.m65745e(this.submittedErrorNegativeCta, c36605c.submittedErrorNegativeCta);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubmittedTitle() {
        return this.submittedTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubmittingSubtitle() {
        return this.submittingSubtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubmittingTitle() {
        return this.submittingTitle;
    }

    public int hashCode() {
        int iHashCode = this.submittingTitle.hashCode() * 31;
        String str = this.submittingSubtitle;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.submittedTitle);
        String str2 = this.submittedSubtitle;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.submittedErrorTitle);
        String str3 = this.submittedErrorSubtitle;
        return this.submittedErrorNegativeCta.hashCode() + AbstractC11266d.m30450d((iM30450d2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.submittedErrorPositiveCta);
    }

    public String toString() {
        String str = this.submittingTitle;
        String str2 = this.submittingSubtitle;
        String str3 = this.submittedTitle;
        String str4 = this.submittedSubtitle;
        String str5 = this.submittedErrorTitle;
        String str6 = this.submittedErrorSubtitle;
        String str7 = this.submittedErrorPositiveCta;
        String str8 = this.submittedErrorNegativeCta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ScreeningConfig(submittingTitle=", str, ", submittingSubtitle=", str2, ", submittedTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", submittedSubtitle=", str4, ", submittedErrorTitle=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", submittedErrorSubtitle=", str6, ", submittedErrorPositiveCta=");
        return AbstractC11266d.m30464r(sbM32001t, str7, ", submittedErrorNegativeCta=", str8, ")");
    }
}

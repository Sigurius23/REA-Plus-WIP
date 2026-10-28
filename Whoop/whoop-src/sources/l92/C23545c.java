package l92;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: l92.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Ll92/c;", "", "", "header", "titleDisplay", "subTitleDisplay", "selectAllCtaTitle", "ctaTextDisplay", "", "Ll92/b;", "consents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getHeader", "b", "getTitleDisplay", "c", "getSubTitleDisplay", "d", "getSelectAllCtaTitle", "e", "getCtaTextDisplay", "f", "Ljava/util/List;", "getConsents", "()Ljava/util/List;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23545c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("title")
    private final String titleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("subtitle")
    private final String subTitleDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("select_all_cta_title")
    private final String selectAllCtaTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("next_step_cta_title")
    private final String ctaTextDisplay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C23544b> consents;

    public C23545c() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23545c)) {
            return false;
        }
        C23545c c23545c = (C23545c) other;
        return AbstractC22676k.m65745e(this.header, c23545c.header) && AbstractC22676k.m65745e(this.titleDisplay, c23545c.titleDisplay) && AbstractC22676k.m65745e(this.subTitleDisplay, c23545c.subTitleDisplay) && AbstractC22676k.m65745e(this.selectAllCtaTitle, c23545c.selectAllCtaTitle) && AbstractC22676k.m65745e(this.ctaTextDisplay, c23545c.ctaTextDisplay) && AbstractC22676k.m65745e(this.consents, c23545c.consents);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.header.hashCode() * 31, 31, this.titleDisplay), 31, this.subTitleDisplay);
        String str = this.selectAllCtaTitle;
        return this.consents.hashCode() + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.ctaTextDisplay);
    }

    public String toString() {
        String str = this.header;
        String str2 = this.titleDisplay;
        String str3 = this.subTitleDisplay;
        String str4 = this.selectAllCtaTitle;
        String str5 = this.ctaTextDisplay;
        List<C23544b> list = this.consents;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TermsSummaryResponse(header=", str, ", titleDisplay=", str2, ", subTitleDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", selectAllCtaTitle=", str4, ", ctaTextDisplay=");
        return AbstractC30007c.m91840j(str5, ", consents=", ")", sbM32001t, list);
    }

    public C23545c(String header, String titleDisplay, String subTitleDisplay, String str, String ctaTextDisplay, List<C23544b> consents) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subTitleDisplay, "subTitleDisplay");
        AbstractC22676k.m65750j(ctaTextDisplay, "ctaTextDisplay");
        AbstractC22676k.m65750j(consents, "consents");
        this.header = header;
        this.titleDisplay = titleDisplay;
        this.subTitleDisplay = subTitleDisplay;
        this.selectAllCtaTitle = str;
        this.ctaTextDisplay = ctaTextDisplay;
        this.consents = consents;
    }

    public /* synthetic */ C23545c(String str, String str2, String str3, String str4, String str5, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? C25271y.f99162w : list);
    }
}

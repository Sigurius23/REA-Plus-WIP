package s80;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i93.C18284j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: s80.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012Jn\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b3\u0010\u0016R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u0016¨\u00064"}, m65681d2 = {"Ls80/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "Lkd1/o;", "image", "", "minAgeMillis", "maxAgeMillis", "Li93/j;", "yearRange", "", "showPickerByDefault", "analyticsName", "birthdayPrefill", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;JJLi93/j;ZLjava/lang/String;Ljava/lang/String;)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;JJLi93/j;ZLjava/lang/String;Ljava/lang/String;)Ls80/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "i", "c", "Lkd1/o;", "e", "()Lkd1/o;", "d", "J", "g", "()J", "f", "Li93/j;", "k", "()Li93/j;", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "getAnalyticsName", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32256d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long minAgeMillis;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long maxAgeMillis;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C18284j yearRange;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean showPickerByDefault;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String birthdayPrefill;

    public C32256d(TextResource title, String str, AbstractC22403o image, long j7, long j13, C18284j yearRange, boolean z4, String analyticsName, String str2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(yearRange, "yearRange");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = str;
        this.image = image;
        this.minAgeMillis = j7;
        this.maxAgeMillis = j13;
        this.yearRange = yearRange;
        this.showPickerByDefault = z4;
        this.analyticsName = analyticsName;
        this.birthdayPrefill = str2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32256d m100380b(C32256d c32256d, TextResource textResource, String str, AbstractC22403o abstractC22403o, long j7, long j13, C18284j c18284j, boolean z4, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c32256d.title;
        }
        if ((i13 & 2) != 0) {
            str = c32256d.subtitle;
        }
        if ((i13 & 4) != 0) {
            abstractC22403o = c32256d.image;
        }
        if ((i13 & 8) != 0) {
            j7 = c32256d.minAgeMillis;
        }
        if ((i13 & 16) != 0) {
            j13 = c32256d.maxAgeMillis;
        }
        if ((i13 & 32) != 0) {
            c18284j = c32256d.yearRange;
        }
        if ((i13 & 64) != 0) {
            z4 = c32256d.showPickerByDefault;
        }
        if ((i13 & 128) != 0) {
            str2 = c32256d.analyticsName;
        }
        if ((i13 & 256) != 0) {
            str3 = c32256d.birthdayPrefill;
        }
        long j14 = j13;
        long j15 = j7;
        AbstractC22403o abstractC22403o2 = abstractC22403o;
        return c32256d.m100381a(textResource, str, abstractC22403o2, j15, j14, c18284j, z4, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final C32256d m100381a(TextResource title, String subtitle, AbstractC22403o image, long minAgeMillis, long maxAgeMillis, C18284j yearRange, boolean showPickerByDefault, String analyticsName, String birthdayPrefill) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(yearRange, "yearRange");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new C32256d(title, subtitle, image, minAgeMillis, maxAgeMillis, yearRange, showPickerByDefault, analyticsName, birthdayPrefill);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBirthdayPrefill() {
        return this.birthdayPrefill;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32256d)) {
            return false;
        }
        C32256d c32256d = (C32256d) other;
        return AbstractC22676k.m65745e(this.title, c32256d.title) && AbstractC22676k.m65745e(this.subtitle, c32256d.subtitle) && AbstractC22676k.m65745e(this.image, c32256d.image) && this.minAgeMillis == c32256d.minAgeMillis && this.maxAgeMillis == c32256d.maxAgeMillis && AbstractC22676k.m65745e(this.yearRange, c32256d.yearRange) && this.showPickerByDefault == c32256d.showPickerByDefault && AbstractC22676k.m65745e(this.analyticsName, c32256d.analyticsName) && AbstractC22676k.m65745e(this.birthdayPrefill, c32256d.birthdayPrefill);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getMaxAgeMillis() {
        return this.maxAgeMillis;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getMinAgeMillis() {
        return this.minAgeMillis;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShowPickerByDefault() {
        return this.showPickerByDefault;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b((this.yearRange.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC30007c.m91833c(this.image, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), this.minAgeMillis, 31), this.maxAgeMillis, 31)) * 31, 31, this.showPickerByDefault), 31, this.analyticsName);
        String str2 = this.birthdayPrefill;
        return iM30450d + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C18284j getYearRange() {
        return this.yearRange;
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        AbstractC22403o abstractC22403o = this.image;
        long j7 = this.minAgeMillis;
        long j13 = this.maxAgeMillis;
        C18284j c18284j = this.yearRange;
        boolean z4 = this.showPickerByDefault;
        String str2 = this.analyticsName;
        String str3 = this.birthdayPrefill;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("BirthdayScreenViewState(title=", textResource, ", subtitle=", str, ", image=");
        sbM91845o.append(abstractC22403o);
        sbM91845o.append(", minAgeMillis=");
        sbM91845o.append(j7);
        AbstractC2875y.m8285A(sbM91845o, ", maxAgeMillis=", j13, ", yearRange=");
        sbM91845o.append(c18284j);
        sbM91845o.append(", showPickerByDefault=");
        sbM91845o.append(z4);
        sbM91845o.append(", analyticsName=");
        return AbstractC11266d.m30464r(sbM91845o, str2, ", birthdayPrefill=", str3, ")");
    }

    public /* synthetic */ C32256d(TextResource textResource, String str, AbstractC22403o abstractC22403o, long j7, long j13, C18284j c18284j, boolean z4, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? AbstractC22403o.b.f87641b : abstractC22403o, j7, j13, c18284j, (i13 & 64) != 0 ? false : z4, str2, (i13 & 256) != 0 ? null : str3);
    }
}

package e90;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: e90.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jr\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b-\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b.\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b%\u00100R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b1\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104¨\u00065"}, m65681d2 = {"Le90/h;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "Lkd1/o;", "image", "", "Le90/c;", "genders", "preselectedGender", "preselectedBaseLine", "Le90/b;", "dialogData", "analyticsName", "", "showDialogByDefault", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Le90/b;Ljava/lang/String;Z)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Le90/b;Ljava/lang/String;Z)Le90/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "k", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "j", "c", "Lkd1/o;", "f", "()Lkd1/o;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Le90/b;", "()Le90/b;", "getAnalyticsName", "i", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12885h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C12880c> genders;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String preselectedGender;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String preselectedBaseLine;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C12879b dialogData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean showDialogByDefault;

    public C12885h(TextResource title, String subtitle, AbstractC22403o image, List<C12880c> genders, String preselectedGender, String str, C12879b dialogData, String analyticsName, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(genders, "genders");
        AbstractC22676k.m65750j(preselectedGender, "preselectedGender");
        AbstractC22676k.m65750j(dialogData, "dialogData");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
        this.genders = genders;
        this.preselectedGender = preselectedGender;
        this.preselectedBaseLine = str;
        this.dialogData = dialogData;
        this.analyticsName = analyticsName;
        this.showDialogByDefault = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12885h m36221b(C12885h c12885h, TextResource textResource, String str, AbstractC22403o abstractC22403o, List list, String str2, String str3, C12879b c12879b, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c12885h.title;
        }
        if ((i13 & 2) != 0) {
            str = c12885h.subtitle;
        }
        if ((i13 & 4) != 0) {
            abstractC22403o = c12885h.image;
        }
        if ((i13 & 8) != 0) {
            list = c12885h.genders;
        }
        if ((i13 & 16) != 0) {
            str2 = c12885h.preselectedGender;
        }
        if ((i13 & 32) != 0) {
            str3 = c12885h.preselectedBaseLine;
        }
        if ((i13 & 64) != 0) {
            c12879b = c12885h.dialogData;
        }
        if ((i13 & 128) != 0) {
            str4 = c12885h.analyticsName;
        }
        if ((i13 & 256) != 0) {
            z4 = c12885h.showDialogByDefault;
        }
        String str5 = str4;
        boolean z13 = z4;
        String str6 = str3;
        C12879b c12879b2 = c12879b;
        String str7 = str2;
        AbstractC22403o abstractC22403o2 = abstractC22403o;
        return c12885h.m36222a(textResource, str, abstractC22403o2, list, str7, str6, c12879b2, str5, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C12885h m36222a(TextResource title, String subtitle, AbstractC22403o image, List<C12880c> genders, String preselectedGender, String preselectedBaseLine, C12879b dialogData, String analyticsName, boolean showDialogByDefault) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(genders, "genders");
        AbstractC22676k.m65750j(preselectedGender, "preselectedGender");
        AbstractC22676k.m65750j(dialogData, "dialogData");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new C12885h(title, subtitle, image, genders, preselectedGender, preselectedBaseLine, dialogData, analyticsName, showDialogByDefault);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C12879b getDialogData() {
        return this.dialogData;
    }

    /* JADX INFO: renamed from: e */
    public final List<C12880c> m36224e() {
        return this.genders;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12885h)) {
            return false;
        }
        C12885h c12885h = (C12885h) other;
        return AbstractC22676k.m65745e(this.title, c12885h.title) && AbstractC22676k.m65745e(this.subtitle, c12885h.subtitle) && AbstractC22676k.m65745e(this.image, c12885h.image) && AbstractC22676k.m65745e(this.genders, c12885h.genders) && AbstractC22676k.m65745e(this.preselectedGender, c12885h.preselectedGender) && AbstractC22676k.m65745e(this.preselectedBaseLine, c12885h.preselectedBaseLine) && AbstractC22676k.m65745e(this.dialogData, c12885h.dialogData) && AbstractC22676k.m65745e(this.analyticsName, c12885h.analyticsName) && this.showDialogByDefault == c12885h.showDialogByDefault;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPreselectedBaseLine() {
        return this.preselectedBaseLine;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPreselectedGender() {
        return this.preselectedGender;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC30007c.m91833c(this.image, AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31), 31, this.genders), 31, this.preselectedGender);
        String str = this.preselectedBaseLine;
        return Boolean.hashCode(this.showDialogByDefault) + AbstractC11266d.m30450d((this.dialogData.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.analyticsName);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getShowDialogByDefault() {
        return this.showDialogByDefault;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        AbstractC22403o abstractC22403o = this.image;
        List<C12880c> list = this.genders;
        String str2 = this.preselectedGender;
        String str3 = this.preselectedBaseLine;
        C12879b c12879b = this.dialogData;
        String str4 = this.analyticsName;
        boolean z4 = this.showDialogByDefault;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("GenderSelectionViewState(title=", textResource, ", subtitle=", str, ", image=");
        sbM91845o.append(abstractC22403o);
        sbM91845o.append(", genders=");
        sbM91845o.append(list);
        sbM91845o.append(", preselectedGender=");
        AbstractC11266d.m30444B(sbM91845o, str2, ", preselectedBaseLine=", str3, ", dialogData=");
        sbM91845o.append(c12879b);
        sbM91845o.append(", analyticsName=");
        sbM91845o.append(str4);
        sbM91845o.append(", showDialogByDefault=");
        return AbstractC18489d0.m53372m(sbM91845o, z4, ")");
    }

    public /* synthetic */ C12885h(TextResource textResource, String str, AbstractC22403o abstractC22403o, List list, String str2, String str3, C12879b c12879b, String str4, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, abstractC22403o, list, (i13 & 16) != 0 ? "" : str2, (i13 & 32) != 0 ? null : str3, c12879b, str4, (i13 & 256) != 0 ? false : z4);
    }
}

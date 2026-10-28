package i51;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: i51.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b-\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b+\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b'\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b \u00105R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b#\u00108¨\u00069"}, m65681d2 = {"Li51/o;", "Lm91/u;", "", "celebrationId", "Li51/d;", "confettiStyle", "", "Ly81/e;", "confettiColors", "items", "topItems", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Li51/c;", "buttonSection", "Li51/m;", "alignment", "", "analyticProperties", "<init>", "(Ljava/lang/String;Li51/d;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/c;Li51/m;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCelebrationId", "b", "Li51/d;", "getConfettiStyle", "()Li51/d;", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "Li51/c;", "()Li51/c;", "i", "Li51/m;", "()Li51/m;", "j", "Ljava/util/Map;", "()Ljava/util/Map;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18118o implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f70347k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String celebrationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC18107d confettiStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC39332e> confettiColors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<InterfaceC25312u> topItems;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C18106c buttonSection;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC18116m alignment;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Map<String, String> analyticProperties;

    /* JADX WARN: Multi-variable type inference failed */
    public C18118o(String celebrationId, EnumC18107d enumC18107d, List<? extends InterfaceC39332e> confettiColors, List<? extends InterfaceC25312u> items, List<? extends InterfaceC25312u> topItems, TextResource textResource, TextResource textResource2, C18106c buttonSection, EnumC18116m alignment, Map<String, String> analyticProperties) {
        AbstractC22676k.m65750j(celebrationId, "celebrationId");
        AbstractC22676k.m65750j(confettiColors, "confettiColors");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(topItems, "topItems");
        AbstractC22676k.m65750j(buttonSection, "buttonSection");
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
        this.celebrationId = celebrationId;
        this.confettiStyle = enumC18107d;
        this.confettiColors = confettiColors;
        this.items = items;
        this.topItems = topItems;
        this.title = textResource;
        this.subtitle = textResource2;
        this.buttonSection = buttonSection;
        this.alignment = alignment;
        this.analyticProperties = analyticProperties;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC18116m getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m52013b() {
        return this.analyticProperties;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C18106c getButtonSection() {
        return this.buttonSection;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC39332e> m52016e() {
        return this.confettiColors;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18118o)) {
            return false;
        }
        C18118o c18118o = (C18118o) other;
        return AbstractC22676k.m65745e(this.celebrationId, c18118o.celebrationId) && this.confettiStyle == c18118o.confettiStyle && AbstractC22676k.m65745e(this.confettiColors, c18118o.confettiColors) && AbstractC22676k.m65745e(this.items, c18118o.items) && AbstractC22676k.m65745e(this.topItems, c18118o.topItems) && AbstractC22676k.m65745e(this.title, c18118o.title) && AbstractC22676k.m65745e(this.subtitle, c18118o.subtitle) && AbstractC22676k.m65745e(this.buttonSection, c18118o.buttonSection) && this.alignment == c18118o.alignment && AbstractC22676k.m65745e(this.analyticProperties, c18118o.analyticProperties);
    }

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC25312u> m52017f() {
        return this.items;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC25312u> m52019h() {
        return this.topItems;
    }

    public int hashCode() {
        int iHashCode = this.celebrationId.hashCode() * 31;
        EnumC18107d enumC18107d = this.confettiStyle;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode + (enumC18107d == null ? 0 : enumC18107d.hashCode())) * 31, 31, this.confettiColors), 31, this.items), 31, this.topItems);
        TextResource textResource = this.title;
        int iHashCode2 = (iM31983b + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.subtitle;
        return this.analyticProperties.hashCode() + ((this.alignment.hashCode() + ((this.buttonSection.hashCode() + ((iHashCode2 + (textResource2 != null ? textResource2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.celebrationId;
        EnumC18107d enumC18107d = this.confettiStyle;
        List<InterfaceC39332e> list = this.confettiColors;
        List<InterfaceC25312u> list2 = this.items;
        List<InterfaceC25312u> list3 = this.topItems;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        C18106c c18106c = this.buttonSection;
        EnumC18116m enumC18116m = this.alignment;
        Map<String, String> map = this.analyticProperties;
        StringBuilder sb4 = new StringBuilder("CelebrationOverlayViewState(celebrationId=");
        sb4.append(str);
        sb4.append(", confettiStyle=");
        sb4.append(enumC18107d);
        sb4.append(", confettiColors=");
        AbstractC21702c.m61148s(sb4, list, ", items=", list2, ", topItems=");
        AbstractC30007c.m91852v(textResource, ", title=", ", subtitle=", sb4, list3);
        sb4.append(textResource2);
        sb4.append(", buttonSection=");
        sb4.append(c18106c);
        sb4.append(", alignment=");
        sb4.append(enumC18116m);
        sb4.append(", analyticProperties=");
        sb4.append(map);
        sb4.append(")");
        return sb4.toString();
    }
}

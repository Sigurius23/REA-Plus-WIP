package ri0;

import com.whoop.design.models.items.FixedHeaderAlignment;
import com.whoop.design.models.items.NavigationBarStyle;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ri0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b#\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001f\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b-\u00101R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\b)\u00103R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b%\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b!\u00107\u001a\u0004\b4\u0010\u0018¨\u00068"}, m65681d2 = {"Lri0/f;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lgz0/m0;", "icon", "Lri0/h;", "startButton", "endButton", "", "displayRefreshingAnimation", "Lcom/whoop/design/models/items/NavigationBarStyle;", "navigationBarStyle", "", "Lm91/o;", "fixedHeaderItems", "Lcom/whoop/design/models/items/FixedHeaderAlignment;", "fixedHeaderAlignment", "", "tag", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lri0/h;Lri0/h;ZLcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/FixedHeaderAlignment;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Lgz0/m0;", "e", "()Lgz0/m0;", "d", "Lri0/h;", "g", "()Lri0/h;", "f", "Z", "()Z", "Lcom/whoop/design/models/items/NavigationBarStyle;", "()Lcom/whoop/design/models/items/NavigationBarStyle;", "Ljava/util/List;", "()Ljava/util/List;", "i", "Lcom/whoop/design/models/items/FixedHeaderAlignment;", "()Lcom/whoop/design/models/items/FixedHeaderAlignment;", "Ljava/lang/String;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31447f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC31449h startButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC31449h endButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean displayRefreshingAnimation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final NavigationBarStyle navigationBarStyle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C25306o> fixedHeaderItems;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final FixedHeaderAlignment fixedHeaderAlignment;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String tag;

    public C31447f(TextResource title, TextResource textResource, EnumC16313m0 enumC16313m0, InterfaceC31449h interfaceC31449h, InterfaceC31449h interfaceC31449h2, boolean z4, NavigationBarStyle navigationBarStyle, List<C25306o> fixedHeaderItems, FixedHeaderAlignment fixedHeaderAlignment, String str) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(navigationBarStyle, "navigationBarStyle");
        AbstractC22676k.m65750j(fixedHeaderItems, "fixedHeaderItems");
        AbstractC22676k.m65750j(fixedHeaderAlignment, "fixedHeaderAlignment");
        this.title = title;
        this.subtitle = textResource;
        this.icon = enumC16313m0;
        this.startButton = interfaceC31449h;
        this.endButton = interfaceC31449h2;
        this.displayRefreshingAnimation = z4;
        this.navigationBarStyle = navigationBarStyle;
        this.fixedHeaderItems = fixedHeaderItems;
        this.fixedHeaderAlignment = fixedHeaderAlignment;
        this.tag = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDisplayRefreshingAnimation() {
        return this.displayRefreshingAnimation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC31449h getEndButton() {
        return this.endButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FixedHeaderAlignment getFixedHeaderAlignment() {
        return this.fixedHeaderAlignment;
    }

    /* JADX INFO: renamed from: d */
    public final List<C25306o> m96836d() {
        return this.fixedHeaderItems;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31447f)) {
            return false;
        }
        C31447f c31447f = (C31447f) other;
        return AbstractC22676k.m65745e(this.title, c31447f.title) && AbstractC22676k.m65745e(this.subtitle, c31447f.subtitle) && this.icon == c31447f.icon && AbstractC22676k.m65745e(this.startButton, c31447f.startButton) && AbstractC22676k.m65745e(this.endButton, c31447f.endButton) && this.displayRefreshingAnimation == c31447f.displayRefreshingAnimation && this.navigationBarStyle == c31447f.navigationBarStyle && AbstractC22676k.m65745e(this.fixedHeaderItems, c31447f.fixedHeaderItems) && this.fixedHeaderAlignment == c31447f.fixedHeaderAlignment && AbstractC22676k.m65745e(this.tag, c31447f.tag);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final NavigationBarStyle getNavigationBarStyle() {
        return this.navigationBarStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC31449h getStartButton() {
        return this.startButton;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.subtitle;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        InterfaceC31449h interfaceC31449h = this.startButton;
        int iHashCode4 = (iHashCode3 + (interfaceC31449h == null ? 0 : interfaceC31449h.hashCode())) * 31;
        InterfaceC31449h interfaceC31449h2 = this.endButton;
        int iHashCode5 = (this.fixedHeaderAlignment.hashCode() + AbstractC11895b.m31983b((this.navigationBarStyle.hashCode() + AbstractC2875y.m8289b((iHashCode4 + (interfaceC31449h2 == null ? 0 : interfaceC31449h2.hashCode())) * 31, 31, this.displayRefreshingAnimation)) * 31, 31, this.fixedHeaderItems)) * 31;
        String str = this.tag;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        EnumC16313m0 enumC16313m0 = this.icon;
        InterfaceC31449h interfaceC31449h = this.startButton;
        InterfaceC31449h interfaceC31449h2 = this.endButton;
        boolean z4 = this.displayRefreshingAnimation;
        NavigationBarStyle navigationBarStyle = this.navigationBarStyle;
        List<C25306o> list = this.fixedHeaderItems;
        FixedHeaderAlignment fixedHeaderAlignment = this.fixedHeaderAlignment;
        String str = this.tag;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("NavigationBarState(title=", textResource, ", subtitle=", textResource2, ", icon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(", startButton=");
        sbM106658q.append(interfaceC31449h);
        sbM106658q.append(", endButton=");
        sbM106658q.append(interfaceC31449h2);
        sbM106658q.append(", displayRefreshingAnimation=");
        sbM106658q.append(z4);
        sbM106658q.append(", navigationBarStyle=");
        sbM106658q.append(navigationBarStyle);
        sbM106658q.append(", fixedHeaderItems=");
        sbM106658q.append(list);
        sbM106658q.append(", fixedHeaderAlignment=");
        sbM106658q.append(fixedHeaderAlignment);
        sbM106658q.append(", tag=");
        sbM106658q.append(str);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}

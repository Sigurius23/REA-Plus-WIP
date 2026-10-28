package d01;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: d01.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b*\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b:\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b;\u0010)R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b,\u0010=R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b@\u0010B\u001a\u0004\b6\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b(\u0010D\u001a\u0004\b2\u0010ER\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b.\u0010F\u001a\u0004\b>\u0010GR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b:\u0010H\u001a\u0004\b&\u0010I¨\u0006J"}, m65681d2 = {"Ld01/f;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Ld01/h;", "titleType", "Ld01/a;", "addon", "Lgz0/m0;", "leadingIcon", "Lkd1/o;", "leadingImage", "trailingIcon", "message", "", "avatars", "Ly81/f;", "tintColor", "", "enabled", "Lcom/whoop/navigation/e;", "destination", "Ld01/g;", "style", "", "actionArgument", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ld01/h;Ld01/a;Lgz0/m0;Lkd1/o;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Ld01/g;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ld01/h;", "m", "()Ld01/h;", "Ld01/a;", "()Ld01/a;", "e", "Lgz0/m0;", "g", "()Lgz0/m0;", "f", "Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkd1/o;", "n", "i", "Ljava/util/List;", "()Ljava/util/List;", "j", "Ly81/f;", "k", "()Ly81/f;", "Z", "()Z", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Ld01/g;", "()Ld01/g;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11441f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC11443h titleType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC11436a addon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 leadingIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC22403o leadingImage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC16313m0 trailingIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource message;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<AbstractC22403o> avatars;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC39333f tintColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final EnumC11442g style;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Object actionArgument;

    /* JADX WARN: Multi-variable type inference failed */
    public C11441f(TextResource title, TextResource textResource, EnumC11443h titleType, EnumC11436a addon, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o, EnumC16313m0 enumC16313m1, TextResource textResource2, List<? extends AbstractC22403o> list, EnumC39333f enumC39333f, boolean z4, C9598e c9598e, EnumC11442g style, Object obj) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleType, "titleType");
        AbstractC22676k.m65750j(addon, "addon");
        AbstractC22676k.m65750j(style, "style");
        this.title = title;
        this.subtitle = textResource;
        this.titleType = titleType;
        this.addon = addon;
        this.leadingIcon = enumC16313m0;
        this.leadingImage = abstractC22403o;
        this.trailingIcon = enumC16313m1;
        this.message = textResource2;
        this.avatars = list;
        this.tintColor = enumC39333f;
        this.enabled = z4;
        this.destination = c9598e;
        this.style = style;
        this.actionArgument = obj;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getActionArgument() {
        return this.actionArgument;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC11436a getAddon() {
        return this.addon;
    }

    /* JADX INFO: renamed from: c */
    public final List<AbstractC22403o> m30705c() {
        return this.avatars;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11441f)) {
            return false;
        }
        C11441f c11441f = (C11441f) other;
        return AbstractC22676k.m65745e(this.title, c11441f.title) && AbstractC22676k.m65745e(this.subtitle, c11441f.subtitle) && this.titleType == c11441f.titleType && this.addon == c11441f.addon && this.leadingIcon == c11441f.leadingIcon && AbstractC22676k.m65745e(this.leadingImage, c11441f.leadingImage) && this.trailingIcon == c11441f.trailingIcon && AbstractC22676k.m65745e(this.message, c11441f.message) && AbstractC22676k.m65745e(this.avatars, c11441f.avatars) && this.tintColor == c11441f.tintColor && this.enabled == c11441f.enabled && AbstractC22676k.m65745e(this.destination, c11441f.destination) && this.style == c11441f.style && AbstractC22676k.m65745e(this.actionArgument, c11441f.actionArgument);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16313m0 getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AbstractC22403o getLeadingImage() {
        return this.leadingImage;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.subtitle;
        int iHashCode2 = (this.addon.hashCode() + ((this.titleType.hashCode() + ((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31)) * 31)) * 31;
        EnumC16313m0 enumC16313m0 = this.leadingIcon;
        int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.leadingImage;
        int iHashCode4 = (iHashCode3 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.trailingIcon;
        int iHashCode5 = (iHashCode4 + (enumC16313m1 == null ? 0 : enumC16313m1.hashCode())) * 31;
        TextResource textResource2 = this.message;
        int iHashCode6 = (iHashCode5 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        List<AbstractC22403o> list = this.avatars;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        EnumC39333f enumC39333f = this.tintColor;
        int iM8289b = AbstractC2875y.m8289b((iHashCode7 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31, 31, this.enabled);
        C9598e c9598e = this.destination;
        int iHashCode8 = (this.style.hashCode() + ((iM8289b + (c9598e == null ? 0 : c9598e.hashCode())) * 31)) * 31;
        Object obj = this.actionArgument;
        return iHashCode8 + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC11442g getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC39333f getTintColor() {
        return this.tintColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final EnumC11443h getTitleType() {
        return this.titleType;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final EnumC16313m0 getTrailingIcon() {
        return this.trailingIcon;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        EnumC11443h enumC11443h = this.titleType;
        EnumC11436a enumC11436a = this.addon;
        EnumC16313m0 enumC16313m0 = this.leadingIcon;
        AbstractC22403o abstractC22403o = this.leadingImage;
        EnumC16313m0 enumC16313m1 = this.trailingIcon;
        TextResource textResource3 = this.message;
        List<AbstractC22403o> list = this.avatars;
        EnumC39333f enumC39333f = this.tintColor;
        boolean z4 = this.enabled;
        C9598e c9598e = this.destination;
        EnumC11442g enumC11442g = this.style;
        Object obj = this.actionArgument;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ButtonCellState(title=", textResource, ", subtitle=", textResource2, ", titleType=");
        sbM106658q.append(enumC11443h);
        sbM106658q.append(", addon=");
        sbM106658q.append(enumC11436a);
        sbM106658q.append(", leadingIcon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(", leadingImage=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(", trailingIcon=");
        sbM106658q.append(enumC16313m1);
        sbM106658q.append(", message=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", avatars=");
        sbM106658q.append(list);
        sbM106658q.append(", tintColor=");
        sbM106658q.append(enumC39333f);
        sbM106658q.append(", enabled=");
        sbM106658q.append(z4);
        sbM106658q.append(", destination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", style=");
        sbM106658q.append(enumC11442g);
        sbM106658q.append(", actionArgument=");
        sbM106658q.append(obj);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}

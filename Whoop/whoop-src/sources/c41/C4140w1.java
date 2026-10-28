package c41;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import f01.EnumC13892q1;
import gz0.EnumC16313m0;
import h01.EnumC16533a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c41.w1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b)\u00108R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b6\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b/\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b9\u0010@R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b4\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bB\u0010D\u001a\u0004\b:\u0010ER\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b<\u0010F\u001a\u0004\b>\u0010GR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b+\u0010H\u001a\u0004\b&\u0010I¨\u0006J"}, m65681d2 = {"Lc41/w1;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "endIcon", "body", "Lkd1/o;", "image", "Lf01/q1;", "backgroundStyle", "ctaText", "ctaIcon", "Lh01/a;", "style", "Lcom/whoop/navigation/e;", "destination", "navigationTag", "Lcom/whoop/whoopaction/domain/models/Action;", "dismissAction", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "Lc41/o1;", "analyticEvents", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lkd1/o;Lf01/q1;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lh01/a;Lcom/whoop/navigation/e;Lm91/u;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lc41/o1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "n", "()Lcom/whoop/design/util/TextResource;", "c", "Lgz0/m0;", "i", "()Lgz0/m0;", "d", "e", "Lkd1/o;", "k", "()Lkd1/o;", "f", "Lf01/q1;", "()Lf01/q1;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lh01/a;", "m", "()Lh01/a;", "j", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lm91/u;", "l", "()Lm91/u;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lc41/o1;", "()Lc41/o1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4140w1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource body;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC13892q1 backgroundStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource ctaText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC16313m0 ctaIcon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC16533a style;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC25312u navigationTag;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Action dismissAction;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final GenericInteraction genericInteraction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C4084o1 analyticEvents;

    public C4140w1(String str, TextResource textResource, EnumC16313m0 enumC16313m0, TextResource body, AbstractC22403o abstractC22403o, EnumC13892q1 backgroundStyle, TextResource ctaText, EnumC16313m0 enumC16313m1, EnumC16533a style, C9598e c9598e, InterfaceC25312u interfaceC25312u, Action action, GenericInteraction genericInteraction, C4084o1 c4084o1) {
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(style, "style");
        this.id = str;
        this.title = textResource;
        this.endIcon = enumC16313m0;
        this.body = body;
        this.image = abstractC22403o;
        this.backgroundStyle = backgroundStyle;
        this.ctaText = ctaText;
        this.ctaIcon = enumC16313m1;
        this.style = style;
        this.destination = c9598e;
        this.navigationTag = interfaceC25312u;
        this.dismissAction = action;
        this.genericInteraction = genericInteraction;
        this.analyticEvents = c4084o1;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4084o1 getAnalyticEvents() {
        return this.analyticEvents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC13892q1 getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getCtaIcon() {
        return this.ctaIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4140w1)) {
            return false;
        }
        C4140w1 c4140w1 = (C4140w1) other;
        return AbstractC22676k.m65745e(this.id, c4140w1.id) && AbstractC22676k.m65745e(this.title, c4140w1.title) && this.endIcon == c4140w1.endIcon && AbstractC22676k.m65745e(this.body, c4140w1.body) && AbstractC22676k.m65745e(this.image, c4140w1.image) && this.backgroundStyle == c4140w1.backgroundStyle && AbstractC22676k.m65745e(this.ctaText, c4140w1.ctaText) && this.ctaIcon == c4140w1.ctaIcon && this.style == c4140w1.style && AbstractC22676k.m65745e(this.destination, c4140w1.destination) && AbstractC22676k.m65745e(this.navigationTag, c4140w1.navigationTag) && AbstractC22676k.m65745e(this.dismissAction, c4140w1.dismissAction) && AbstractC22676k.m65745e(this.genericInteraction, c4140w1.genericInteraction) && AbstractC22676k.m65745e(this.analyticEvents, c4140w1.analyticEvents);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Action getDismissAction() {
        return this.dismissAction;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TextResource textResource = this.title;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iM95625a = AbstractC31061c.m95625a((iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, this.body, 31);
        AbstractC22403o abstractC22403o = this.image;
        int iM95625a2 = AbstractC31061c.m95625a((this.backgroundStyle.hashCode() + ((iM95625a + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31)) * 31, this.ctaText, 31);
        EnumC16313m0 enumC16313m1 = this.ctaIcon;
        int iHashCode3 = (this.style.hashCode() + ((iM95625a2 + (enumC16313m1 == null ? 0 : enumC16313m1.hashCode())) * 31)) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.navigationTag;
        int iHashCode5 = (iHashCode4 + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        Action action = this.dismissAction;
        int iHashCode6 = (iHashCode5 + (action == null ? 0 : action.hashCode())) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        int iHashCode7 = (iHashCode6 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        C4084o1 c4084o1 = this.analyticEvents;
        return iHashCode7 + (c4084o1 != null ? c4084o1.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC25312u getNavigationTag() {
        return this.navigationTag;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final EnumC16533a getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        TextResource textResource2 = this.body;
        AbstractC22403o abstractC22403o = this.image;
        EnumC13892q1 enumC13892q1 = this.backgroundStyle;
        TextResource textResource3 = this.ctaText;
        EnumC16313m0 enumC16313m1 = this.ctaIcon;
        EnumC16533a enumC16533a = this.style;
        C9598e c9598e = this.destination;
        InterfaceC25312u interfaceC25312u = this.navigationTag;
        Action action = this.dismissAction;
        GenericInteraction genericInteraction = this.genericInteraction;
        C4084o1 c4084o1 = this.analyticEvents;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("EntryPointTileState(id=", str, ", title=", textResource, ", endIcon=");
        sbM91847q.append(enumC16313m0);
        sbM91847q.append(", body=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", image=");
        sbM91847q.append(abstractC22403o);
        sbM91847q.append(", backgroundStyle=");
        sbM91847q.append(enumC13892q1);
        sbM91847q.append(", ctaText=");
        sbM91847q.append(textResource3);
        sbM91847q.append(", ctaIcon=");
        sbM91847q.append(enumC16313m1);
        sbM91847q.append(", style=");
        sbM91847q.append(enumC16533a);
        sbM91847q.append(", destination=");
        sbM91847q.append(c9598e);
        sbM91847q.append(", navigationTag=");
        sbM91847q.append(interfaceC25312u);
        sbM91847q.append(", dismissAction=");
        sbM91847q.append(action);
        sbM91847q.append(", genericInteraction=");
        sbM91847q.append(genericInteraction);
        sbM91847q.append(", analyticEvents=");
        sbM91847q.append(c4084o1);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }
}

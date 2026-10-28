package nr0;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: nr0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b%\u0010(R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b/\u0010,R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b)\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\"\u00104R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b0\u0010,R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b1\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b5\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b2\u00104R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\b6\u0010:¨\u0006;"}, m65681d2 = {"Lnr0/j;", "Lm91/u;", "Lm91/n;", "", "id", "Lcom/whoop/design/util/TextResource;", "label", "Ly81/f;", "labelTextColor", "labelBackgroundColor", "badge", "badgeTextColor", "badgeBackgroundColor", "Lkd1/o;", "backgroundImage", "borderColor", "Ly3/f;", "borderWidth", "footerText", "footerAvatar", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lkd1/o;Ly81/f;FLcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "k", "()Lcom/whoop/design/util/TextResource;", "c", "Ly81/f;", "m", "()Ly81/f;", "d", "l", "e", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lkd1/o;", "()Lkd1/o;", "i", "j", "F", "()F", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "community-highlights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27077j implements InterfaceC25312u, InterfaceC25305n<String> {

    /* JADX INFO: renamed from: n */
    public static final int f108223n;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f labelTextColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f labelBackgroundColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource badge;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC39333f badgeTextColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC39333f badgeBackgroundColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC39333f borderColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float borderWidth;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource footerText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final AbstractC22403o footerAvatar;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    static {
        int i13 = GenericInteraction.$stable;
        int i14 = AbstractC22403o.f87638a;
        int i15 = TextResource.$stable;
        f108223n = i13 | i14 | i15 | i14 | i15 | i15;
    }

    public /* synthetic */ C27077j(String str, TextResource textResource, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, TextResource textResource2, EnumC39333f enumC39333f3, EnumC39333f enumC39333f4, AbstractC22403o abstractC22403o, EnumC39333f enumC39333f5, float f13, TextResource textResource3, AbstractC22403o abstractC22403o2, GenericInteraction genericInteraction, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, enumC39333f, enumC39333f2, textResource2, enumC39333f3, enumC39333f4, abstractC22403o, enumC39333f5, f13, textResource3, abstractC22403o2, genericInteraction);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getBadgeBackgroundColor() {
        return this.badgeBackgroundColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getBadgeTextColor() {
        return this.badgeTextColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27077j)) {
            return false;
        }
        C27077j c27077j = (C27077j) other;
        return AbstractC22676k.m65745e(this.id, c27077j.id) && AbstractC22676k.m65745e(this.label, c27077j.label) && this.labelTextColor == c27077j.labelTextColor && this.labelBackgroundColor == c27077j.labelBackgroundColor && AbstractC22676k.m65745e(this.badge, c27077j.badge) && this.badgeTextColor == c27077j.badgeTextColor && this.badgeBackgroundColor == c27077j.badgeBackgroundColor && AbstractC22676k.m65745e(this.backgroundImage, c27077j.backgroundImage) && this.borderColor == c27077j.borderColor && C39174f.m124782b(this.borderWidth, c27077j.borderWidth) && AbstractC22676k.m65745e(this.footerText, c27077j.footerText) && AbstractC22676k.m65745e(this.footerAvatar, c27077j.footerAvatar) && AbstractC22676k.m65745e(this.interaction, c27077j.interaction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC39333f getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AbstractC22403o getFooterAvatar() {
        return this.footerAvatar;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        TextResource textResource = this.label;
        int iM61132c = AbstractC21702c.m61132c(this.labelBackgroundColor, AbstractC21702c.m61132c(this.labelTextColor, (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, 31), 31);
        TextResource textResource2 = this.badge;
        int iM30447a = AbstractC11266d.m30447a(this.borderWidth, AbstractC21702c.m61132c(this.borderColor, AbstractC30007c.m91833c(this.backgroundImage, AbstractC21702c.m61132c(this.badgeBackgroundColor, AbstractC21702c.m61132c(this.badgeTextColor, (iM61132c + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31), 31), 31), 31), 31);
        TextResource textResource3 = this.footerText;
        int iHashCode2 = (iM30447a + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.footerAvatar;
        int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode3 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC39333f getLabelBackgroundColor() {
        return this.labelBackgroundColor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final EnumC39333f getLabelTextColor() {
        return this.labelTextColor;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.label;
        EnumC39333f enumC39333f = this.labelTextColor;
        EnumC39333f enumC39333f2 = this.labelBackgroundColor;
        TextResource textResource2 = this.badge;
        EnumC39333f enumC39333f3 = this.badgeTextColor;
        EnumC39333f enumC39333f4 = this.badgeBackgroundColor;
        AbstractC22403o abstractC22403o = this.backgroundImage;
        EnumC39333f enumC39333f5 = this.borderColor;
        String strM124783c = C39174f.m124783c(this.borderWidth);
        TextResource textResource3 = this.footerText;
        AbstractC22403o abstractC22403o2 = this.footerAvatar;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("HighlightCardState(id=", str, ", label=", textResource, ", labelTextColor=");
        sbM91847q.append(enumC39333f);
        sbM91847q.append(", labelBackgroundColor=");
        sbM91847q.append(enumC39333f2);
        sbM91847q.append(", badge=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", badgeTextColor=");
        sbM91847q.append(enumC39333f3);
        sbM91847q.append(", badgeBackgroundColor=");
        sbM91847q.append(enumC39333f4);
        sbM91847q.append(", backgroundImage=");
        sbM91847q.append(abstractC22403o);
        sbM91847q.append(", borderColor=");
        sbM91847q.append(enumC39333f5);
        sbM91847q.append(", borderWidth=");
        sbM91847q.append(strM124783c);
        sbM91847q.append(", footerText=");
        sbM91847q.append(textResource3);
        sbM91847q.append(", footerAvatar=");
        sbM91847q.append(abstractC22403o2);
        sbM91847q.append(", interaction=");
        return AbstractC26725a.m79506j(sbM91847q, genericInteraction, ")");
    }

    private C27077j(String id4, TextResource textResource, EnumC39333f labelTextColor, EnumC39333f labelBackgroundColor, TextResource textResource2, EnumC39333f badgeTextColor, EnumC39333f badgeBackgroundColor, AbstractC22403o backgroundImage, EnumC39333f borderColor, float f13, TextResource textResource3, AbstractC22403o abstractC22403o, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(labelTextColor, "labelTextColor");
        AbstractC22676k.m65750j(labelBackgroundColor, "labelBackgroundColor");
        AbstractC22676k.m65750j(badgeTextColor, "badgeTextColor");
        AbstractC22676k.m65750j(badgeBackgroundColor, "badgeBackgroundColor");
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        AbstractC22676k.m65750j(borderColor, "borderColor");
        this.id = id4;
        this.label = textResource;
        this.labelTextColor = labelTextColor;
        this.labelBackgroundColor = labelBackgroundColor;
        this.badge = textResource2;
        this.badgeTextColor = badgeTextColor;
        this.badgeBackgroundColor = badgeBackgroundColor;
        this.backgroundImage = backgroundImage;
        this.borderColor = borderColor;
        this.borderWidth = f13;
        this.footerText = textResource3;
        this.footerAvatar = abstractC22403o;
        this.interaction = genericInteraction;
    }

    @Override // p720m91.InterfaceC25305n
    /* JADX INFO: renamed from: getId, reason: avoid collision after fix types in other method and from getter */
    public String getStateUpdateKey() {
        return this.id;
    }
}

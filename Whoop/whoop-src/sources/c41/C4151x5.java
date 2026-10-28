package c41;

import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.util.TrendKey;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import rz0.EnumC31927f;
import y71.C39274g;

/* JADX INFO: renamed from: c41.x5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u008a\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b1\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b%\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b7\u0010?\u001a\u0004\b3\u0010@¨\u0006A"}, m65681d2 = {"Lc41/x5;", "Lm91/u;", "Landroidx/compose/ui/Modifier;", "modifier", "Ly71/g;", "leftIcon", "Lcom/whoop/design/util/TextResource;", "title", "currentStatText", "historicStatText", "arrowIcon", "Ly81/f;", "arrowTint", "", "showCTA", "Lcom/whoop/util/TrendKey;", "trendKey", "Lrz0/f;", "style", "Lkotlin/Function0;", "Ll83/a0;", "content", "<init>", "(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/f;ZLcom/whoop/util/TrendKey;Lrz0/f;Lc93/m;)V", "a", "(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/f;ZLcom/whoop/util/TrendKey;Lrz0/f;Lc93/m;)Lc41/x5;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/Modifier;", "j", "()Landroidx/compose/ui/Modifier;", "b", "Ly71/g;", "i", "()Ly71/g;", "c", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "d", "g", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Ly81/f;", "()Ly81/f;", "Z", "k", "()Z", "Lcom/whoop/util/TrendKey;", "n", "()Lcom/whoop/util/TrendKey;", "Lrz0/f;", "l", "()Lrz0/f;", "Lc93/m;", "()Lc93/m;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4151x5 implements InterfaceC25312u {

    /* JADX INFO: renamed from: l */
    public static final int f16908l = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Modifier modifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39274g leftIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource currentStatText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource historicStatText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C39274g arrowIcon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC39333f arrowTint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean showCTA;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TrendKey trendKey;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC31927f style;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC4351m content;

    public C4151x5(Modifier modifier, C39274g c39274g, TextResource title, TextResource currentStatText, TextResource textResource, C39274g c39274g2, EnumC39333f arrowTint, boolean z4, TrendKey trendKey, EnumC31927f style, InterfaceC4351m content) {
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(currentStatText, "currentStatText");
        AbstractC22676k.m65750j(arrowTint, "arrowTint");
        AbstractC22676k.m65750j(trendKey, "trendKey");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(content, "content");
        this.modifier = modifier;
        this.leftIcon = c39274g;
        this.title = title;
        this.currentStatText = currentStatText;
        this.historicStatText = textResource;
        this.arrowIcon = c39274g2;
        this.arrowTint = arrowTint;
        this.showCTA = z4;
        this.trendKey = trendKey;
        this.style = style;
        this.content = content;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4151x5 m12917b(C4151x5 c4151x5, Modifier modifier, C39274g c39274g, TextResource textResource, TextResource textResource2, TextResource textResource3, C39274g c39274g2, EnumC39333f enumC39333f, boolean z4, TrendKey trendKey, EnumC31927f enumC31927f, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            modifier = c4151x5.modifier;
        }
        if ((i13 & 2) != 0) {
            c39274g = c4151x5.leftIcon;
        }
        if ((i13 & 4) != 0) {
            textResource = c4151x5.title;
        }
        if ((i13 & 8) != 0) {
            textResource2 = c4151x5.currentStatText;
        }
        if ((i13 & 16) != 0) {
            textResource3 = c4151x5.historicStatText;
        }
        if ((i13 & 32) != 0) {
            c39274g2 = c4151x5.arrowIcon;
        }
        if ((i13 & 64) != 0) {
            enumC39333f = c4151x5.arrowTint;
        }
        if ((i13 & 128) != 0) {
            z4 = c4151x5.showCTA;
        }
        if ((i13 & 256) != 0) {
            trendKey = c4151x5.trendKey;
        }
        if ((i13 & 512) != 0) {
            enumC31927f = c4151x5.style;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            interfaceC4351m = c4151x5.content;
        }
        EnumC31927f enumC31927f2 = enumC31927f;
        InterfaceC4351m interfaceC4351m2 = interfaceC4351m;
        boolean z13 = z4;
        TrendKey trendKey2 = trendKey;
        C39274g c39274g3 = c39274g2;
        EnumC39333f enumC39333f2 = enumC39333f;
        TextResource textResource4 = textResource3;
        TextResource textResource5 = textResource;
        return c4151x5.m12918a(modifier, c39274g, textResource5, textResource2, textResource4, c39274g3, enumC39333f2, z13, trendKey2, enumC31927f2, interfaceC4351m2);
    }

    /* JADX INFO: renamed from: a */
    public final C4151x5 m12918a(Modifier modifier, C39274g leftIcon, TextResource title, TextResource currentStatText, TextResource historicStatText, C39274g arrowIcon, EnumC39333f arrowTint, boolean showCTA, TrendKey trendKey, EnumC31927f style, InterfaceC4351m content) {
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(currentStatText, "currentStatText");
        AbstractC22676k.m65750j(arrowTint, "arrowTint");
        AbstractC22676k.m65750j(trendKey, "trendKey");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(content, "content");
        return new C4151x5(modifier, leftIcon, title, currentStatText, historicStatText, arrowIcon, arrowTint, showCTA, trendKey, style, content);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C39274g getArrowIcon() {
        return this.arrowIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getArrowTint() {
        return this.arrowTint;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4151x5)) {
            return false;
        }
        C4151x5 c4151x5 = (C4151x5) other;
        return AbstractC22676k.m65745e(this.modifier, c4151x5.modifier) && AbstractC22676k.m65745e(this.leftIcon, c4151x5.leftIcon) && AbstractC22676k.m65745e(this.title, c4151x5.title) && AbstractC22676k.m65745e(this.currentStatText, c4151x5.currentStatText) && AbstractC22676k.m65745e(this.historicStatText, c4151x5.historicStatText) && AbstractC22676k.m65745e(this.arrowIcon, c4151x5.arrowIcon) && this.arrowTint == c4151x5.arrowTint && this.showCTA == c4151x5.showCTA && this.trendKey == c4151x5.trendKey && this.style == c4151x5.style && AbstractC22676k.m65745e(this.content, c4151x5.content);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC4351m getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getCurrentStatText() {
        return this.currentStatText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getHistoricStatText() {
        return this.historicStatText;
    }

    public int hashCode() {
        int iHashCode = this.modifier.hashCode() * 31;
        C39274g c39274g = this.leftIcon;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (c39274g == null ? 0 : c39274g.hashCode())) * 31, this.title, 31), this.currentStatText, 31);
        TextResource textResource = this.historicStatText;
        int iHashCode2 = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C39274g c39274g2 = this.arrowIcon;
        return this.content.hashCode() + ((this.style.hashCode() + ((this.trendKey.hashCode() + AbstractC2875y.m8289b(AbstractC21702c.m61132c(this.arrowTint, (iHashCode2 + (c39274g2 != null ? c39274g2.hashCode() : 0)) * 31, 31), 31, this.showCTA)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C39274g getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowCTA() {
        return this.showCTA;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC31927f getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TrendKey getTrendKey() {
        return this.trendKey;
    }

    public String toString() {
        Modifier modifier = this.modifier;
        C39274g c39274g = this.leftIcon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.currentStatText;
        TextResource textResource3 = this.historicStatText;
        C39274g c39274g2 = this.arrowIcon;
        EnumC39333f enumC39333f = this.arrowTint;
        boolean z4 = this.showCTA;
        TrendKey trendKey = this.trendKey;
        EnumC31927f enumC31927f = this.style;
        InterfaceC4351m interfaceC4351m = this.content;
        StringBuilder sb4 = new StringBuilder("TrendTileState(modifier=");
        sb4.append(modifier);
        sb4.append(", leftIcon=");
        sb4.append(c39274g);
        sb4.append(", title=");
        AbstractC30007c.m91855y(sb4, textResource, ", currentStatText=", textResource2, ", historicStatText=");
        sb4.append(textResource3);
        sb4.append(", arrowIcon=");
        sb4.append(c39274g2);
        sb4.append(", arrowTint=");
        sb4.append(enumC39333f);
        sb4.append(", showCTA=");
        sb4.append(z4);
        sb4.append(", trendKey=");
        sb4.append(trendKey);
        sb4.append(", style=");
        sb4.append(enumC31927f);
        sb4.append(", content=");
        sb4.append(interfaceC4351m);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C4151x5(Modifier modifier, C39274g c39274g, TextResource textResource, TextResource textResource2, TextResource textResource3, C39274g c39274g2, EnumC39333f enumC39333f, boolean z4, TrendKey trendKey, EnumC31927f enumC31927f, InterfaceC4351m interfaceC4351m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C2314t.f9131w : modifier, (i13 & 2) != 0 ? null : c39274g, textResource, textResource2, (i13 & 16) != 0 ? null : textResource3, (i13 & 32) != 0 ? null : c39274g2, (i13 & 64) != 0 ? EnumC39333f.TRANSPARENT : enumC39333f, (i13 & 128) != 0 ? false : z4, (i13 & 256) != 0 ? TrendKey.NONE : trendKey, (i13 & 512) != 0 ? EnumC31927f.DEFAULT : enumC31927f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C4132v0.f16807a.m12758b() : interfaceC4351m);
    }
}

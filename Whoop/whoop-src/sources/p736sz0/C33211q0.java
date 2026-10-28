package p736sz0;

import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import l83.C23454a0;
import p000.AbstractC30802r;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import sr2.C32940v;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: sz0.q0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013Jz\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b4\u0010)R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b5\u00101R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b2\u00101¨\u00066"}, m65681d2 = {"Lsz0/q0;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "Lkotlin/Function0;", "Ll83/a0;", "onScrimClicked", "primaryButtonText", "", "showSecondaryAction", "showSecondaryActionIcon", "secondaryButtonText", "removeBackgroundModifier", "overlayBackground", "<init>", "(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZ)V", "c", "(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZ)Lsz0/q0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "e", "()Landroidx/compose/ui/Modifier;", "b", "Lsz0/p0;", "n", "()Lsz0/p0;", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "d", "Lc93/a;", "f", "()Lc93/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "k", "()Z", "g", "l", "j", "i", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33211q0 {

    /* JADX INFO: renamed from: k */
    public static final int f138501k = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Modifier modifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC33208p0 type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource supportText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4339a onScrimClicked;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource primaryButtonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean showSecondaryAction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean showSecondaryActionIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource secondaryButtonText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean removeBackgroundModifier;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean overlayBackground;

    public C33211q0(Modifier modifier, AbstractC33208p0 type, TextResource supportText, InterfaceC4339a onScrimClicked, TextResource primaryButtonText, boolean z4, boolean z13, TextResource secondaryButtonText, boolean z14, boolean z15) {
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(supportText, "supportText");
        AbstractC22676k.m65750j(onScrimClicked, "onScrimClicked");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
        this.modifier = modifier;
        this.type = type;
        this.supportText = supportText;
        this.onScrimClicked = onScrimClicked;
        this.primaryButtonText = primaryButtonText;
        this.showSecondaryAction = z4;
        this.showSecondaryActionIcon = z13;
        this.secondaryButtonText = secondaryButtonText;
        this.removeBackgroundModifier = z14;
        this.overlayBackground = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m105331b() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C33211q0 m105332d(C33211q0 c33211q0, Modifier modifier, AbstractC33208p0 abstractC33208p0, TextResource textResource, InterfaceC4339a interfaceC4339a, TextResource textResource2, boolean z4, boolean z13, TextResource textResource3, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            modifier = c33211q0.modifier;
        }
        if ((i13 & 2) != 0) {
            abstractC33208p0 = c33211q0.type;
        }
        if ((i13 & 4) != 0) {
            textResource = c33211q0.supportText;
        }
        if ((i13 & 8) != 0) {
            interfaceC4339a = c33211q0.onScrimClicked;
        }
        if ((i13 & 16) != 0) {
            textResource2 = c33211q0.primaryButtonText;
        }
        if ((i13 & 32) != 0) {
            z4 = c33211q0.showSecondaryAction;
        }
        if ((i13 & 64) != 0) {
            z13 = c33211q0.showSecondaryActionIcon;
        }
        if ((i13 & 128) != 0) {
            textResource3 = c33211q0.secondaryButtonText;
        }
        if ((i13 & 256) != 0) {
            z14 = c33211q0.removeBackgroundModifier;
        }
        if ((i13 & 512) != 0) {
            z15 = c33211q0.overlayBackground;
        }
        boolean z16 = z14;
        boolean z17 = z15;
        boolean z18 = z13;
        TextResource textResource4 = textResource3;
        TextResource textResource5 = textResource2;
        boolean z19 = z4;
        return c33211q0.m105333c(modifier, abstractC33208p0, textResource, interfaceC4339a, textResource5, z19, z18, textResource4, z16, z17);
    }

    /* JADX INFO: renamed from: c */
    public final C33211q0 m105333c(Modifier modifier, AbstractC33208p0 type, TextResource supportText, InterfaceC4339a onScrimClicked, TextResource primaryButtonText, boolean showSecondaryAction, boolean showSecondaryActionIcon, TextResource secondaryButtonText, boolean removeBackgroundModifier, boolean overlayBackground) {
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(supportText, "supportText");
        AbstractC22676k.m65750j(onScrimClicked, "onScrimClicked");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
        return new C33211q0(modifier, type, supportText, onScrimClicked, primaryButtonText, showSecondaryAction, showSecondaryActionIcon, secondaryButtonText, removeBackgroundModifier, overlayBackground);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33211q0)) {
            return false;
        }
        C33211q0 c33211q0 = (C33211q0) other;
        return AbstractC22676k.m65745e(this.modifier, c33211q0.modifier) && AbstractC22676k.m65745e(this.type, c33211q0.type) && AbstractC22676k.m65745e(this.supportText, c33211q0.supportText) && AbstractC22676k.m65745e(this.onScrimClicked, c33211q0.onScrimClicked) && AbstractC22676k.m65745e(this.primaryButtonText, c33211q0.primaryButtonText) && this.showSecondaryAction == c33211q0.showSecondaryAction && this.showSecondaryActionIcon == c33211q0.showSecondaryActionIcon && AbstractC22676k.m65745e(this.secondaryButtonText, c33211q0.secondaryButtonText) && this.removeBackgroundModifier == c33211q0.removeBackgroundModifier && this.overlayBackground == c33211q0.overlayBackground;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC4339a getOnScrimClicked() {
        return this.onScrimClicked;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getOverlayBackground() {
        return this.overlayBackground;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public int hashCode() {
        return Boolean.hashCode(this.overlayBackground) + AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC30802r.m94755d(AbstractC31061c.m95625a((this.type.hashCode() + (this.modifier.hashCode() * 31)) * 31, this.supportText, 31), 31, this.onScrimClicked), this.primaryButtonText, 31), 31, this.showSecondaryAction), 31, this.showSecondaryActionIcon), this.secondaryButtonText, 31), 31, this.removeBackgroundModifier);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getRemoveBackgroundModifier() {
        return this.removeBackgroundModifier;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowSecondaryAction() {
        return this.showSecondaryAction;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getShowSecondaryActionIcon() {
        return this.showSecondaryActionIcon;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getSupportText() {
        return this.supportText;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final AbstractC33208p0 getType() {
        return this.type;
    }

    public String toString() {
        Modifier modifier = this.modifier;
        AbstractC33208p0 abstractC33208p0 = this.type;
        TextResource textResource = this.supportText;
        InterfaceC4339a interfaceC4339a = this.onScrimClicked;
        TextResource textResource2 = this.primaryButtonText;
        boolean z4 = this.showSecondaryAction;
        boolean z13 = this.showSecondaryActionIcon;
        TextResource textResource3 = this.secondaryButtonText;
        boolean z14 = this.removeBackgroundModifier;
        boolean z15 = this.overlayBackground;
        StringBuilder sb4 = new StringBuilder("ProgressModelState(modifier=");
        sb4.append(modifier);
        sb4.append(", type=");
        sb4.append(abstractC33208p0);
        sb4.append(", supportText=");
        sb4.append(textResource);
        sb4.append(", onScrimClicked=");
        sb4.append(interfaceC4339a);
        sb4.append(", primaryButtonText=");
        AbstractC33745d.m106664w(textResource2, ", showSecondaryAction=", ", showSecondaryActionIcon=", sb4, z4);
        AbstractC21702c.m61144o(textResource3, ", secondaryButtonText=", ", removeBackgroundModifier=", sb4, z13);
        return AbstractC36095b.m114682j(sb4, z14, ", overlayBackground=", z15, ")");
    }

    public /* synthetic */ C33211q0(Modifier modifier, AbstractC33208p0 abstractC33208p0, TextResource textResource, InterfaceC4339a interfaceC4339a, TextResource textResource2, boolean z4, boolean z13, TextResource textResource3, boolean z14, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C2314t.f9131w : modifier, abstractC33208p0, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? new C32940v(23) : interfaceC4339a, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 256) != 0 ? false : z14, (i13 & 512) != 0 ? false : z15);
    }
}

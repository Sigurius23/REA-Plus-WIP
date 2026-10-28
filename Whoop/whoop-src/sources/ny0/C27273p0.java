package ny0;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21166s;
import k81.EnumC22291a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;
import y71.C39274g;

/* JADX INFO: renamed from: ny0.p0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ¨\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b/\u0010CR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b1\u0010D\u001a\u0004\b9\u0010ER\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b-\u0010F\u001a\u0004\b=\u0010GR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b4\u0010H\u001a\u0004\b5\u0010IR\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\bK\u0010@R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b)\u0010L\u001a\u0004\bJ\u0010MR\u0017\u0010\u001a\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u0010>\u001a\u0004\bA\u0010@¨\u0006N"}, m65681d2 = {"Lny0/p0;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "text", "Lcom/whoop/navigation/e;", "navigationAction", "Ly71/g;", "leftIcon", "rightIcon", "Ly81/e;", "tint", "Lj91/b;", "tintGradient", "", "useTextPadding", "", "actionArgument", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "Lj02/s;", "dismissEvent", "Lk81/a;", "alignment", "trimStartGutter", "Lny0/m0;", "style", "enabled", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;Z)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;Z)Lny0/p0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "b", "Lcom/whoop/navigation/e;", "j", "()Lcom/whoop/navigation/e;", "c", "Ly71/g;", "i", "()Ly71/g;", "d", "k", "e", "Ly81/e;", "n", "()Ly81/e;", "f", "Lj91/b;", "o", "()Lj91/b;", "g", "Z", "q", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/Object;", "()Ljava/lang/Object;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "Lj02/s;", "()Lj02/s;", "Lk81/a;", "()Lk81/a;", "l", "p", "Lny0/m0;", "()Lny0/m0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27273p0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: o */
    public static final int f109116o = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e navigationAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39274g leftIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C39274g rightIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e tint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC21430b tintGradient;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean useTextPadding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Object actionArgument;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C21166s dismissEvent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC22291a alignment;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean trimStartGutter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final EnumC27267m0 style;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean enabled;

    public C27273p0(TextResource text, C9598e navigationAction, C39274g c39274g, C39274g c39274g2, InterfaceC39332e tint, InterfaceC21430b interfaceC21430b, boolean z4, Object obj, AnalyticEventModel analyticEventModel, C21166s c21166s, EnumC22291a alignment, boolean z13, EnumC27267m0 style, boolean z14) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(navigationAction, "navigationAction");
        AbstractC22676k.m65750j(tint, "tint");
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(style, "style");
        this.text = text;
        this.navigationAction = navigationAction;
        this.leftIcon = c39274g;
        this.rightIcon = c39274g2;
        this.tint = tint;
        this.tintGradient = interfaceC21430b;
        this.useTextPadding = z4;
        this.actionArgument = obj;
        this.analyticEvent = analyticEventModel;
        this.dismissEvent = c21166s;
        this.alignment = alignment;
        this.trimStartGutter = z13;
        this.style = style;
        this.enabled = z14;
    }

    /* JADX INFO: renamed from: a */
    public final C27273p0 m82257a(TextResource text, C9598e navigationAction, C39274g leftIcon, C39274g rightIcon, InterfaceC39332e tint, InterfaceC21430b tintGradient, boolean useTextPadding, Object actionArgument, AnalyticEventModel analyticEvent, C21166s dismissEvent, EnumC22291a alignment, boolean trimStartGutter, EnumC27267m0 style, boolean enabled) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(navigationAction, "navigationAction");
        AbstractC22676k.m65750j(tint, "tint");
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(style, "style");
        return new C27273p0(text, navigationAction, leftIcon, rightIcon, tint, tintGradient, useTextPadding, actionArgument, analyticEvent, dismissEvent, alignment, trimStartGutter, style, enabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getActionArgument() {
        return this.actionArgument;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC22291a getAlignment() {
        return this.alignment;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27273p0)) {
            return false;
        }
        C27273p0 c27273p0 = (C27273p0) other;
        return AbstractC22676k.m65745e(this.text, c27273p0.text) && AbstractC22676k.m65745e(this.navigationAction, c27273p0.navigationAction) && AbstractC22676k.m65745e(this.leftIcon, c27273p0.leftIcon) && AbstractC22676k.m65745e(this.rightIcon, c27273p0.rightIcon) && AbstractC22676k.m65745e(this.tint, c27273p0.tint) && AbstractC22676k.m65745e(this.tintGradient, c27273p0.tintGradient) && this.useTextPadding == c27273p0.useTextPadding && AbstractC22676k.m65745e(this.actionArgument, c27273p0.actionArgument) && AbstractC22676k.m65745e(this.analyticEvent, c27273p0.analyticEvent) && AbstractC22676k.m65745e(this.dismissEvent, c27273p0.dismissEvent) && this.alignment == c27273p0.alignment && this.trimStartGutter == c27273p0.trimStartGutter && this.style == c27273p0.style && this.enabled == c27273p0.enabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C21166s getDismissEvent() {
        return this.dismissEvent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        int iM114673a = AbstractC36095b.m114673a(this.navigationAction, this.text.hashCode() * 31, 31);
        C39274g c39274g = this.leftIcon;
        int iHashCode = (iM114673a + (c39274g == null ? 0 : c39274g.hashCode())) * 31;
        C39274g c39274g2 = this.rightIcon;
        int iM106648g = AbstractC33745d.m106648g(this.tint, (iHashCode + (c39274g2 == null ? 0 : c39274g2.hashCode())) * 31, 31);
        InterfaceC21430b interfaceC21430b = this.tintGradient;
        int iM8289b = AbstractC2875y.m8289b((iM106648g + (interfaceC21430b == null ? 0 : interfaceC21430b.hashCode())) * 31, 31, this.useTextPadding);
        Object obj = this.actionArgument;
        int iHashCode2 = (iM8289b + (obj == null ? 0 : obj.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iHashCode3 = (iHashCode2 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        C21166s c21166s = this.dismissEvent;
        return Boolean.hashCode(this.enabled) + ((this.style.hashCode() + AbstractC2875y.m8289b((this.alignment.hashCode() + ((iHashCode3 + (c21166s != null ? c21166s.hashCode() : 0)) * 31)) * 31, 31, this.trimStartGutter)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C39274g getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C9598e getNavigationAction() {
        return this.navigationAction;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C39274g getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC27267m0 getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC39332e getTint() {
        return this.tint;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC21430b getTintGradient() {
        return this.tintGradient;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getTrimStartGutter() {
        return this.trimStartGutter;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getUseTextPadding() {
        return this.useTextPadding;
    }

    public String toString() {
        return "SecondaryButtonViewState(text=" + this.text + ", navigationAction=" + this.navigationAction + ", leftIcon=" + this.leftIcon + ", rightIcon=" + this.rightIcon + ", tint=" + this.tint + ", tintGradient=" + this.tintGradient + ", useTextPadding=" + this.useTextPadding + ", actionArgument=" + this.actionArgument + ", analyticEvent=" + this.analyticEvent + ", dismissEvent=" + this.dismissEvent + ", alignment=" + this.alignment + ", trimStartGutter=" + this.trimStartGutter + ", style=" + this.style + ", enabled=" + this.enabled + ")";
    }

    public /* synthetic */ C27273p0(TextResource textResource, C9598e c9598e, C39274g c39274g, C39274g c39274g2, InterfaceC39332e interfaceC39332e, InterfaceC21430b interfaceC21430b, boolean z4, Object obj, AnalyticEventModel analyticEventModel, C21166s c21166s, EnumC22291a enumC22291a, boolean z13, EnumC27267m0 enumC27267m0, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, c9598e, (i13 & 4) != 0 ? null : c39274g, (i13 & 8) != 0 ? null : c39274g2, (i13 & 16) != 0 ? EnumC39333f.BRAND_WHITE : interfaceC39332e, (i13 & 32) != 0 ? null : interfaceC21430b, (i13 & 64) != 0 ? true : z4, (i13 & 128) != 0 ? null : obj, (i13 & 256) != 0 ? null : analyticEventModel, (i13 & 512) != 0 ? null : c21166s, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC22291a.LEADING : enumC22291a, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z13, (i13 & 4096) != 0 ? EnumC27267m0.DEFAULT : enumC27267m0, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? true : z14);
    }
}

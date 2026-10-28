package l11;

import b91.C2886a;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: l11.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0090\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b+\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010 \u001a\u0004\b,\u0010\u0018R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b0\u0010\u0018R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b*\u00104\u001a\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Ll11/e;", "Lm91/u;", "", "id", "buttonText", "successText", "Lgz0/m0;", "leadingIcon", "successIcon", "errorText", "errorIcon", "Ll11/d;", "state", "", "showLoading", "path", "prefixText", "Lb91/a;", "textStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;)Ll11/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "c", "m", "d", "Lgz0/m0;", "g", "()Lgz0/m0;", "e", "l", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ll11/d;", "k", "()Ll11/d;", "i", "Z", "j", "()Z", "Lb91/a;", "n", "()Lb91/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23223e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String buttonText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String successText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 leadingIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 successIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String errorText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC16313m0 errorIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC23222d state;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean showLoading;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String prefixText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C2886a textStyle;

    public C23223e(String id4, String buttonText, String successText, EnumC16313m0 enumC16313m0, EnumC16313m0 successIcon, String errorText, EnumC16313m0 enumC16313m1, InterfaceC23222d state, boolean z4, String path, String str, C2886a c2886a) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(successText, "successText");
        AbstractC22676k.m65750j(successIcon, "successIcon");
        AbstractC22676k.m65750j(errorText, "errorText");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(path, "path");
        this.id = id4;
        this.buttonText = buttonText;
        this.successText = successText;
        this.leadingIcon = enumC16313m0;
        this.successIcon = successIcon;
        this.errorText = errorText;
        this.errorIcon = enumC16313m1;
        this.state = state;
        this.showLoading = z4;
        this.path = path;
        this.prefixText = str;
        this.textStyle = c2886a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C23223e m67193b(C23223e c23223e, String str, String str2, String str3, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, String str4, EnumC16313m0 enumC16313m2, InterfaceC23222d interfaceC23222d, boolean z4, String str5, String str6, C2886a c2886a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c23223e.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c23223e.buttonText;
        }
        if ((i13 & 4) != 0) {
            str3 = c23223e.successText;
        }
        if ((i13 & 8) != 0) {
            enumC16313m0 = c23223e.leadingIcon;
        }
        if ((i13 & 16) != 0) {
            enumC16313m1 = c23223e.successIcon;
        }
        if ((i13 & 32) != 0) {
            str4 = c23223e.errorText;
        }
        if ((i13 & 64) != 0) {
            enumC16313m2 = c23223e.errorIcon;
        }
        if ((i13 & 128) != 0) {
            interfaceC23222d = c23223e.state;
        }
        if ((i13 & 256) != 0) {
            z4 = c23223e.showLoading;
        }
        if ((i13 & 512) != 0) {
            str5 = c23223e.path;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str6 = c23223e.prefixText;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            c2886a = c23223e.textStyle;
        }
        String str7 = str6;
        C2886a c2886a2 = c2886a;
        boolean z13 = z4;
        String str8 = str5;
        EnumC16313m0 enumC16313m3 = enumC16313m2;
        InterfaceC23222d interfaceC23222d2 = interfaceC23222d;
        EnumC16313m0 enumC16313m4 = enumC16313m1;
        String str9 = str4;
        return c23223e.m67194a(str, str2, str3, enumC16313m0, enumC16313m4, str9, enumC16313m3, interfaceC23222d2, z13, str8, str7, c2886a2);
    }

    /* JADX INFO: renamed from: a */
    public final C23223e m67194a(String id4, String buttonText, String successText, EnumC16313m0 leadingIcon, EnumC16313m0 successIcon, String errorText, EnumC16313m0 errorIcon, InterfaceC23222d state, boolean showLoading, String path, String prefixText, C2886a textStyle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(successText, "successText");
        AbstractC22676k.m65750j(successIcon, "successIcon");
        AbstractC22676k.m65750j(errorText, "errorText");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(path, "path");
        return new C23223e(id4, buttonText, successText, leadingIcon, successIcon, errorText, errorIcon, state, showLoading, path, prefixText, textStyle);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getErrorIcon() {
        return this.errorIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23223e)) {
            return false;
        }
        C23223e c23223e = (C23223e) other;
        return AbstractC22676k.m65745e(this.id, c23223e.id) && AbstractC22676k.m65745e(this.buttonText, c23223e.buttonText) && AbstractC22676k.m65745e(this.successText, c23223e.successText) && this.leadingIcon == c23223e.leadingIcon && this.successIcon == c23223e.successIcon && AbstractC22676k.m65745e(this.errorText, c23223e.errorText) && this.errorIcon == c23223e.errorIcon && AbstractC22676k.m65745e(this.state, c23223e.state) && this.showLoading == c23223e.showLoading && AbstractC22676k.m65745e(this.path, c23223e.path) && AbstractC22676k.m65745e(this.prefixText, c23223e.prefixText) && AbstractC22676k.m65745e(this.textStyle, c23223e.textStyle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16313m0 getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.buttonText), 31, this.successText);
        EnumC16313m0 enumC16313m0 = this.leadingIcon;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC17176i.m48500b(this.successIcon, (iM30450d + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31), 31, this.errorText);
        EnumC16313m0 enumC16313m1 = this.errorIcon;
        int iM30450d3 = AbstractC11266d.m30450d(AbstractC2875y.m8289b((this.state.hashCode() + ((iM30450d2 + (enumC16313m1 == null ? 0 : enumC16313m1.hashCode())) * 31)) * 31, 31, this.showLoading), 31, this.path);
        String str = this.prefixText;
        int iHashCode = (iM30450d3 + (str == null ? 0 : str.hashCode())) * 31;
        C2886a c2886a = this.textStyle;
        return iHashCode + (c2886a != null ? c2886a.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPrefixText() {
        return this.prefixText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC23222d getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC16313m0 getSuccessIcon() {
        return this.successIcon;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSuccessText() {
        return this.successText;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C2886a getTextStyle() {
        return this.textStyle;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.buttonText;
        String str3 = this.successText;
        EnumC16313m0 enumC16313m0 = this.leadingIcon;
        EnumC16313m0 enumC16313m1 = this.successIcon;
        String str4 = this.errorText;
        EnumC16313m0 enumC16313m2 = this.errorIcon;
        InterfaceC23222d interfaceC23222d = this.state;
        boolean z4 = this.showLoading;
        String str5 = this.path;
        String str6 = this.prefixText;
        C2886a c2886a = this.textStyle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EndpointButtonViewState(id=", str, ", buttonText=", str2, ", successText=");
        sbM32001t.append(str3);
        sbM32001t.append(", leadingIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", successIcon=");
        sbM32001t.append(enumC16313m1);
        sbM32001t.append(", errorText=");
        sbM32001t.append(str4);
        sbM32001t.append(", errorIcon=");
        sbM32001t.append(enumC16313m2);
        sbM32001t.append(", state=");
        sbM32001t.append(interfaceC23222d);
        sbM32001t.append(", showLoading=");
        AbstractC38963t7.m124391u(sbM32001t, z4, ", path=", str5, ", prefixText=");
        sbM32001t.append(str6);
        sbM32001t.append(", textStyle=");
        sbM32001t.append(c2886a);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C23223e(String str, String str2, String str3, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, String str4, EnumC16313m0 enumC16313m2, InterfaceC23222d interfaceC23222d, boolean z4, String str5, String str6, C2886a c2886a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, enumC16313m0, enumC16313m1, (i13 & 32) != 0 ? "" : str4, (i13 & 64) != 0 ? null : enumC16313m2, (i13 & 128) != 0 ? InterfaceC23222d.a.f91938a : interfaceC23222d, (i13 & 256) != 0 ? true : z4, (i13 & 512) != 0 ? "" : str5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str6, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c2886a);
    }
}

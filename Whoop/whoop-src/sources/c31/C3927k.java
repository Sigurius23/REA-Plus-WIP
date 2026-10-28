package c31;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17911t;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c31.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJÌ\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010$R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b>\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b5\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b>\u0010B\u001a\u0004\b;\u0010CR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b@\u0010B\u001a\u0004\bD\u0010CR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\b6\u00103R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b9\u0010F\u001a\u0004\b0\u0010GR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\bH\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\bE\u00103R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b*\u0010J\u001a\u0004\bI\u0010KR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bL\u0010\"¨\u0006N"}, m65681d2 = {"Lc31/k;", "Lm91/u;", "Lc31/d;", "state", "Lcom/whoop/design/util/TextResource;", "buttonText", "Ly81/e;", "textColor", "errorMessage", "errorClickableText", "Lgz0/m0;", "icon", "", "totalCount", "filledCount", "", "filledPercentage", "", "enabled", "isVisible", "buttonColor", "Li2/t;", "buttonBrush", "iconColor", "glowColor", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "", "testTag", "<init>", "(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)V", "a", "(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Lc31/k;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lc31/d;", "p", "()Lc31/d;", "b", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "c", "Ly81/e;", "r", "()Ly81/e;", "d", "i", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lgz0/m0;", "m", "()Lgz0/m0;", "g", "I", "s", "j", "Ljava/lang/Float;", "k", "()Ljava/lang/Float;", "Z", "()Z", "t", "l", "Li2/t;", "()Li2/t;", "n", "o", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "q", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3927k implements InterfaceC25312u {

    /* JADX INFO: renamed from: r */
    public static final int f16020r = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC3920d state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource buttonText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e textColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource errorMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource errorClickableText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int totalCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int filledCount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Float filledPercentage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC39332e buttonColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final AbstractC17911t buttonBrush;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC39332e iconColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC39332e glowColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final String testTag;

    public C3927k(EnumC3920d state, TextResource buttonText, InterfaceC39332e textColor, TextResource textResource, TextResource textResource2, EnumC16313m0 icon, int i13, int i14, Float f13, boolean z4, boolean z13, InterfaceC39332e interfaceC39332e, AbstractC17911t abstractC17911t, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, GenericInteraction genericInteraction, String str) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(icon, "icon");
        this.state = state;
        this.buttonText = buttonText;
        this.textColor = textColor;
        this.errorMessage = textResource;
        this.errorClickableText = textResource2;
        this.icon = icon;
        this.totalCount = i13;
        this.filledCount = i14;
        this.filledPercentage = f13;
        this.enabled = z4;
        this.isVisible = z13;
        this.buttonColor = interfaceC39332e;
        this.buttonBrush = abstractC17911t;
        this.iconColor = interfaceC39332e2;
        this.glowColor = interfaceC39332e3;
        this.interaction = genericInteraction;
        this.testTag = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C3927k m11937b(C3927k c3927k, EnumC3920d enumC3920d, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, TextResource textResource3, EnumC16313m0 enumC16313m0, int i13, int i14, Float f13, boolean z4, boolean z13, InterfaceC39332e interfaceC39332e2, AbstractC17911t abstractC17911t, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, GenericInteraction genericInteraction, String str, int i15, Object obj) {
        String str2;
        GenericInteraction genericInteraction2;
        EnumC3920d enumC3920d2 = (i15 & 1) != 0 ? c3927k.state : enumC3920d;
        TextResource textResource4 = (i15 & 2) != 0 ? c3927k.buttonText : textResource;
        InterfaceC39332e interfaceC39332e5 = (i15 & 4) != 0 ? c3927k.textColor : interfaceC39332e;
        TextResource textResource5 = (i15 & 8) != 0 ? c3927k.errorMessage : textResource2;
        TextResource textResource6 = (i15 & 16) != 0 ? c3927k.errorClickableText : textResource3;
        EnumC16313m0 enumC16313m1 = (i15 & 32) != 0 ? c3927k.icon : enumC16313m0;
        int i16 = (i15 & 64) != 0 ? c3927k.totalCount : i13;
        int i17 = (i15 & 128) != 0 ? c3927k.filledCount : i14;
        Float f14 = (i15 & 256) != 0 ? c3927k.filledPercentage : f13;
        boolean z14 = (i15 & 512) != 0 ? c3927k.enabled : z4;
        boolean z15 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c3927k.isVisible : z13;
        InterfaceC39332e interfaceC39332e6 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c3927k.buttonColor : interfaceC39332e2;
        AbstractC17911t abstractC17911t2 = (i15 & 4096) != 0 ? c3927k.buttonBrush : abstractC17911t;
        InterfaceC39332e interfaceC39332e7 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c3927k.iconColor : interfaceC39332e3;
        EnumC3920d enumC3920d3 = enumC3920d2;
        InterfaceC39332e interfaceC39332e8 = (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c3927k.glowColor : interfaceC39332e4;
        GenericInteraction genericInteraction3 = (i15 & 32768) != 0 ? c3927k.interaction : genericInteraction;
        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            genericInteraction2 = genericInteraction3;
            str2 = c3927k.testTag;
        } else {
            str2 = str;
            genericInteraction2 = genericInteraction3;
        }
        return c3927k.m11938a(enumC3920d3, textResource4, interfaceC39332e5, textResource5, textResource6, enumC16313m1, i16, i17, f14, z14, z15, interfaceC39332e6, abstractC17911t2, interfaceC39332e7, interfaceC39332e8, genericInteraction2, str2);
    }

    /* JADX INFO: renamed from: a */
    public final C3927k m11938a(EnumC3920d state, TextResource buttonText, InterfaceC39332e textColor, TextResource errorMessage, TextResource errorClickableText, EnumC16313m0 icon, int totalCount, int filledCount, Float filledPercentage, boolean enabled, boolean isVisible, InterfaceC39332e buttonColor, AbstractC17911t buttonBrush, InterfaceC39332e iconColor, InterfaceC39332e glowColor, GenericInteraction interaction, String testTag) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(icon, "icon");
        return new C3927k(state, buttonText, textColor, errorMessage, errorClickableText, icon, totalCount, filledCount, filledPercentage, enabled, isVisible, buttonColor, buttonBrush, iconColor, glowColor, interaction, testTag);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC17911t getButtonBrush() {
        return this.buttonBrush;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getButtonColor() {
        return this.buttonColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3927k)) {
            return false;
        }
        C3927k c3927k = (C3927k) other;
        return this.state == c3927k.state && AbstractC22676k.m65745e(this.buttonText, c3927k.buttonText) && AbstractC22676k.m65745e(this.textColor, c3927k.textColor) && AbstractC22676k.m65745e(this.errorMessage, c3927k.errorMessage) && AbstractC22676k.m65745e(this.errorClickableText, c3927k.errorClickableText) && this.icon == c3927k.icon && this.totalCount == c3927k.totalCount && this.filledCount == c3927k.filledCount && AbstractC22676k.m65745e(this.filledPercentage, c3927k.filledPercentage) && this.enabled == c3927k.enabled && this.isVisible == c3927k.isVisible && AbstractC22676k.m65745e(this.buttonColor, c3927k.buttonColor) && AbstractC22676k.m65745e(this.buttonBrush, c3927k.buttonBrush) && AbstractC22676k.m65745e(this.iconColor, c3927k.iconColor) && AbstractC22676k.m65745e(this.glowColor, c3927k.glowColor) && AbstractC22676k.m65745e(this.interaction, c3927k.interaction) && AbstractC22676k.m65745e(this.testTag, c3927k.testTag);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getErrorClickableText() {
        return this.errorClickableText;
    }

    public int hashCode() {
        int iM106648g = AbstractC33745d.m106648g(this.textColor, AbstractC31061c.m95625a(this.state.hashCode() * 31, this.buttonText, 31), 31);
        TextResource textResource = this.errorMessage;
        int iHashCode = (iM106648g + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.errorClickableText;
        int iM30448b = AbstractC11266d.m30448b(this.filledCount, AbstractC11266d.m30448b(this.totalCount, AbstractC17176i.m48500b(this.icon, (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31), 31), 31);
        Float f13 = this.filledPercentage;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30448b + (f13 == null ? 0 : f13.hashCode())) * 31, 31, this.enabled), 31, this.isVisible);
        InterfaceC39332e interfaceC39332e = this.buttonColor;
        int iHashCode2 = (iM8289b + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31;
        AbstractC17911t abstractC17911t = this.buttonBrush;
        int iHashCode3 = (iHashCode2 + (abstractC17911t == null ? 0 : abstractC17911t.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e2 = this.iconColor;
        int iHashCode4 = (iHashCode3 + (interfaceC39332e2 == null ? 0 : interfaceC39332e2.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e3 = this.glowColor;
        int iHashCode5 = (iHashCode4 + (interfaceC39332e3 == null ? 0 : interfaceC39332e3.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        int iHashCode6 = (iHashCode5 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        String str = this.testTag;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getFilledCount() {
        return this.filledCount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Float getFilledPercentage() {
        return this.filledPercentage;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC39332e getGlowColor() {
        return this.glowColor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC39332e getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final EnumC3920d getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final InterfaceC39332e getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public String toString() {
        EnumC3920d enumC3920d = this.state;
        TextResource textResource = this.buttonText;
        InterfaceC39332e interfaceC39332e = this.textColor;
        TextResource textResource2 = this.errorMessage;
        TextResource textResource3 = this.errorClickableText;
        EnumC16313m0 enumC16313m0 = this.icon;
        int i13 = this.totalCount;
        int i14 = this.filledCount;
        Float f13 = this.filledPercentage;
        boolean z4 = this.enabled;
        boolean z13 = this.isVisible;
        InterfaceC39332e interfaceC39332e2 = this.buttonColor;
        AbstractC17911t abstractC17911t = this.buttonBrush;
        InterfaceC39332e interfaceC39332e3 = this.iconColor;
        InterfaceC39332e interfaceC39332e4 = this.glowColor;
        GenericInteraction genericInteraction = this.interaction;
        String str = this.testTag;
        StringBuilder sb4 = new StringBuilder("ProgressButtonState(state=");
        sb4.append(enumC3920d);
        sb4.append(", buttonText=");
        sb4.append(textResource);
        sb4.append(", textColor=");
        AbstractC33745d.m106665x(sb4, interfaceC39332e, ", errorMessage=", textResource2, ", errorClickableText=");
        sb4.append(textResource3);
        sb4.append(", icon=");
        sb4.append(enumC16313m0);
        sb4.append(", totalCount=");
        AbstractC30802r.m94773v(sb4, i13, ", filledCount=", i14, ", filledPercentage=");
        sb4.append(f13);
        sb4.append(", enabled=");
        sb4.append(z4);
        sb4.append(", isVisible=");
        sb4.append(z13);
        sb4.append(", buttonColor=");
        sb4.append(interfaceC39332e2);
        sb4.append(", buttonBrush=");
        sb4.append(abstractC17911t);
        sb4.append(", iconColor=");
        sb4.append(interfaceC39332e3);
        sb4.append(", glowColor=");
        sb4.append(interfaceC39332e4);
        sb4.append(", interaction=");
        sb4.append(genericInteraction);
        sb4.append(", testTag=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ C3927k(EnumC3920d enumC3920d, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, TextResource textResource3, EnumC16313m0 enumC16313m0, int i13, int i14, Float f13, boolean z4, boolean z13, InterfaceC39332e interfaceC39332e2, AbstractC17911t abstractC17911t, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, GenericInteraction genericInteraction, String str, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC3920d, textResource, (i15 & 4) != 0 ? EnumC39333f.BRAND_WHITE : interfaceC39332e, (i15 & 8) != 0 ? null : textResource2, (i15 & 16) != 0 ? null : textResource3, (i15 & 32) != 0 ? EnumC16313m0.ARROW_FORWARD : enumC16313m0, (i15 & 64) != 0 ? 1 : i13, (i15 & 128) != 0 ? 1 : i14, (i15 & 256) != 0 ? null : f13, (i15 & 512) != 0 ? true : z4, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? true : z13, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : interfaceC39332e2, (i15 & 4096) != 0 ? null : abstractC17911t, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? EnumC39333f.BRAND_WHITE : interfaceC39332e3, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : interfaceC39332e4, (32768 & i15) != 0 ? null : genericInteraction, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : str);
    }
}

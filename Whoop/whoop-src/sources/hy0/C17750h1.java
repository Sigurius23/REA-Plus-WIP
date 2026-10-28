package hy0;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import i91.C18250d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17911t;
import p208i2.InterfaceC17869a1;
import p490t0.AbstractC33253j;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;
import y71.C39274g;

/* JADX INFO: renamed from: hy0.h1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0088\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\bL\u0010[R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bV\u0010Y\u001a\u0004\b]\u0010[R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\bX\u0010;R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bB\u0010Y\u001a\u0004\b\\\u0010[R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010=\u001a\u0004\b^\u0010?R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bK\u0010_\u001a\u0004\bJ\u0010`R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b]\u0010a\u001a\u0004\b<\u0010bR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bN\u0010c\u001a\u0004\bF\u0010dR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b6\u0010e\u001a\u0004\bP\u0010fR\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010#8\u0006¢\u0006\f\n\u0004\bH\u0010g\u001a\u0004\bD\u0010hR\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\bE\u0010i\u001a\u0004\bT\u0010j¨\u0006k"}, m65681d2 = {"Lhy0/h1;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "tagText", "Ly71/g;", "tagIcon", "Ly81/e;", "tagBackgroundColor", "Li91/d;", "tagBackgroundGradient", "tagTextColor", "Li2/t;", "tagTextBrush", "tagIconBrush", "Lhy0/o1;", "tagStyle", "", "isAlertState", "Li2/a1;", "shape", "Ly3/f;", "verticalPadding", "horizontalPadding", "tagIconSize", "rightTagIcon", "rightTagIconSize", "rightTagIconColorOverride", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lhy0/c1;", "border", "Lkd1/o;", "image", "", "avatars", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;)Lhy0/h1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "t", "()Lcom/whoop/design/util/TextResource;", "b", "Ly71/g;", "p", "()Ly71/g;", "c", "Ly81/e;", "n", "()Ly81/e;", "d", "Li91/d;", "o", "()Li91/d;", "e", "v", "f", "Li2/t;", "u", "()Li2/t;", "g", "q", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lhy0/o1;", "s", "()Lhy0/o1;", "i", "Z", "x", "()Z", "j", "Li2/a1;", "m", "()Li2/a1;", "k", "F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()F", "l", "r", "getRightTagIconColorOverride", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "Lhy0/c1;", "()Lhy0/c1;", "Lkd1/o;", "()Lkd1/o;", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17750h1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: w */
    public static final int f69012w = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource tagText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39274g tagIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e tagBackgroundColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18250d tagBackgroundGradient;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e tagTextColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC17911t tagTextBrush;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC17911t tagIconBrush;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC17775o1 tagStyle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isAlertState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC17869a1 shape;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float verticalPadding;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final float horizontalPadding;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float tagIconSize;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C39274g rightTagIcon;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final float rightTagIconSize;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC39332e rightTagIconColorOverride;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C17730c1 border;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final List<AbstractC22403o> avatars;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    public /* synthetic */ C17750h1(TextResource textResource, C39274g c39274g, InterfaceC39332e interfaceC39332e, C18250d c18250d, InterfaceC39332e interfaceC39332e2, AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, EnumC17775o1 enumC17775o1, boolean z4, InterfaceC17869a1 interfaceC17869a1, float f13, float f14, float f15, C39274g c39274g2, float f16, InterfaceC39332e interfaceC39332e3, C9598e c9598e, Action action, C17730c1 c17730c1, AbstractC22403o abstractC22403o, List list, GenericInteraction genericInteraction, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, c39274g, interfaceC39332e, c18250d, interfaceC39332e2, abstractC17911t, abstractC17911t2, enumC17775o1, z4, interfaceC17869a1, f13, f14, f15, c39274g2, f16, interfaceC39332e3, c9598e, action, c17730c1, abstractC22403o, list, genericInteraction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17750h1 m50901b(C17750h1 c17750h1, TextResource textResource, C39274g c39274g, InterfaceC39332e interfaceC39332e, C18250d c18250d, InterfaceC39332e interfaceC39332e2, AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, EnumC17775o1 enumC17775o1, boolean z4, InterfaceC17869a1 interfaceC17869a1, float f13, float f14, float f15, C39274g c39274g2, float f16, InterfaceC39332e interfaceC39332e3, C9598e c9598e, Action action, C17730c1 c17730c1, AbstractC22403o abstractC22403o, List list, GenericInteraction genericInteraction, int i13, Object obj) {
        GenericInteraction genericInteraction2;
        List list2;
        TextResource textResource2 = (i13 & 1) != 0 ? c17750h1.tagText : textResource;
        C39274g c39274g3 = (i13 & 2) != 0 ? c17750h1.tagIcon : c39274g;
        InterfaceC39332e interfaceC39332e4 = (i13 & 4) != 0 ? c17750h1.tagBackgroundColor : interfaceC39332e;
        C18250d c18250d2 = (i13 & 8) != 0 ? c17750h1.tagBackgroundGradient : c18250d;
        InterfaceC39332e interfaceC39332e5 = (i13 & 16) != 0 ? c17750h1.tagTextColor : interfaceC39332e2;
        AbstractC17911t abstractC17911t3 = (i13 & 32) != 0 ? c17750h1.tagTextBrush : abstractC17911t;
        AbstractC17911t abstractC17911t4 = (i13 & 64) != 0 ? c17750h1.tagIconBrush : abstractC17911t2;
        EnumC17775o1 enumC17775o2 = (i13 & 128) != 0 ? c17750h1.tagStyle : enumC17775o1;
        boolean z13 = (i13 & 256) != 0 ? c17750h1.isAlertState : z4;
        InterfaceC17869a1 interfaceC17869a2 = (i13 & 512) != 0 ? c17750h1.shape : interfaceC17869a1;
        float f17 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c17750h1.verticalPadding : f13;
        float f18 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c17750h1.horizontalPadding : f14;
        float f19 = (i13 & 4096) != 0 ? c17750h1.tagIconSize : f15;
        C39274g c39274g4 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c17750h1.rightTagIcon : c39274g2;
        TextResource textResource3 = textResource2;
        float f24 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c17750h1.rightTagIconSize : f16;
        InterfaceC39332e interfaceC39332e6 = (i13 & 32768) != 0 ? c17750h1.rightTagIconColorOverride : interfaceC39332e3;
        C9598e c9598e2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c17750h1.destination : c9598e;
        Action action2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c17750h1.action : action;
        C17730c1 c17730c2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c17750h1.border : c17730c1;
        AbstractC22403o abstractC22403o2 = (i13 & 524288) != 0 ? c17750h1.image : abstractC22403o;
        List list3 = (i13 & 1048576) != 0 ? c17750h1.avatars : list;
        if ((i13 & 2097152) != 0) {
            list2 = list3;
            genericInteraction2 = c17750h1.interaction;
        } else {
            genericInteraction2 = genericInteraction;
            list2 = list3;
        }
        return c17750h1.m50902a(textResource3, c39274g3, interfaceC39332e4, c18250d2, interfaceC39332e5, abstractC17911t3, abstractC17911t4, enumC17775o2, z13, interfaceC17869a2, f17, f18, f19, c39274g4, f24, interfaceC39332e6, c9598e2, action2, c17730c2, abstractC22403o2, list2, genericInteraction2);
    }

    /* JADX INFO: renamed from: a */
    public final C17750h1 m50902a(TextResource tagText, C39274g tagIcon, InterfaceC39332e tagBackgroundColor, C18250d tagBackgroundGradient, InterfaceC39332e tagTextColor, AbstractC17911t tagTextBrush, AbstractC17911t tagIconBrush, EnumC17775o1 tagStyle, boolean isAlertState, InterfaceC17869a1 shape, float verticalPadding, float horizontalPadding, float tagIconSize, C39274g rightTagIcon, float rightTagIconSize, InterfaceC39332e rightTagIconColorOverride, C9598e destination, Action action, C17730c1 border, AbstractC22403o image, List<? extends AbstractC22403o> avatars, GenericInteraction interaction) {
        AbstractC22676k.m65750j(tagText, "tagText");
        AbstractC22676k.m65750j(tagBackgroundColor, "tagBackgroundColor");
        AbstractC22676k.m65750j(tagTextColor, "tagTextColor");
        AbstractC22676k.m65750j(tagStyle, "tagStyle");
        AbstractC22676k.m65750j(shape, "shape");
        AbstractC22676k.m65750j(rightTagIconColorOverride, "rightTagIconColorOverride");
        return new C17750h1(tagText, tagIcon, tagBackgroundColor, tagBackgroundGradient, tagTextColor, tagTextBrush, tagIconBrush, tagStyle, isAlertState, shape, verticalPadding, horizontalPadding, tagIconSize, rightTagIcon, rightTagIconSize, rightTagIconColorOverride, destination, action, border, image, avatars, interaction, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: e */
    public final List<AbstractC22403o> m50904e() {
        return this.avatars;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17750h1)) {
            return false;
        }
        C17750h1 c17750h1 = (C17750h1) other;
        return AbstractC22676k.m65745e(this.tagText, c17750h1.tagText) && AbstractC22676k.m65745e(this.tagIcon, c17750h1.tagIcon) && AbstractC22676k.m65745e(this.tagBackgroundColor, c17750h1.tagBackgroundColor) && AbstractC22676k.m65745e(this.tagBackgroundGradient, c17750h1.tagBackgroundGradient) && AbstractC22676k.m65745e(this.tagTextColor, c17750h1.tagTextColor) && AbstractC22676k.m65745e(this.tagTextBrush, c17750h1.tagTextBrush) && AbstractC22676k.m65745e(this.tagIconBrush, c17750h1.tagIconBrush) && this.tagStyle == c17750h1.tagStyle && this.isAlertState == c17750h1.isAlertState && AbstractC22676k.m65745e(this.shape, c17750h1.shape) && C39174f.m124782b(this.verticalPadding, c17750h1.verticalPadding) && C39174f.m124782b(this.horizontalPadding, c17750h1.horizontalPadding) && C39174f.m124782b(this.tagIconSize, c17750h1.tagIconSize) && AbstractC22676k.m65745e(this.rightTagIcon, c17750h1.rightTagIcon) && C39174f.m124782b(this.rightTagIconSize, c17750h1.rightTagIconSize) && AbstractC22676k.m65745e(this.rightTagIconColorOverride, c17750h1.rightTagIconColorOverride) && AbstractC22676k.m65745e(this.destination, c17750h1.destination) && AbstractC22676k.m65745e(this.action, c17750h1.action) && AbstractC22676k.m65745e(this.border, c17750h1.border) && AbstractC22676k.m65745e(this.image, c17750h1.image) && AbstractC22676k.m65745e(this.avatars, c17750h1.avatars) && AbstractC22676k.m65745e(this.interaction, c17750h1.interaction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C17730c1 getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent */
    public /* bridge */ Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return super.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public int hashCode() {
        int iHashCode = this.tagText.hashCode() * 31;
        C39274g c39274g = this.tagIcon;
        int iM106648g = AbstractC33745d.m106648g(this.tagBackgroundColor, (iHashCode + (c39274g == null ? 0 : c39274g.hashCode())) * 31, 31);
        C18250d c18250d = this.tagBackgroundGradient;
        int iM106648g2 = AbstractC33745d.m106648g(this.tagTextColor, (iM106648g + (c18250d == null ? 0 : c18250d.hashCode())) * 31, 31);
        AbstractC17911t abstractC17911t = this.tagTextBrush;
        int iHashCode2 = (iM106648g2 + (abstractC17911t == null ? 0 : abstractC17911t.hashCode())) * 31;
        AbstractC17911t abstractC17911t2 = this.tagIconBrush;
        int iM30447a = AbstractC11266d.m30447a(this.tagIconSize, AbstractC11266d.m30447a(this.horizontalPadding, AbstractC11266d.m30447a(this.verticalPadding, (this.shape.hashCode() + AbstractC2875y.m8289b((this.tagStyle.hashCode() + ((iHashCode2 + (abstractC17911t2 == null ? 0 : abstractC17911t2.hashCode())) * 31)) * 31, 31, this.isAlertState)) * 31, 31), 31), 31);
        C39274g c39274g2 = this.rightTagIcon;
        int iM106648g3 = AbstractC33745d.m106648g(this.rightTagIconColorOverride, AbstractC11266d.m30447a(this.rightTagIconSize, (iM30447a + (c39274g2 == null ? 0 : c39274g2.hashCode())) * 31, 31), 31);
        C9598e c9598e = this.destination;
        int iHashCode3 = (iM106648g3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Action action = this.action;
        int iHashCode4 = (iHashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        C17730c1 c17730c1 = this.border;
        int iHashCode5 = (iHashCode4 + (c17730c1 == null ? 0 : c17730c1.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode6 = (iHashCode5 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        List<AbstractC22403o> list = this.avatars;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode7 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C39274g getRightTagIcon() {
        return this.rightTagIcon;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getRightTagIconSize() {
        return this.rightTagIconSize;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final InterfaceC17869a1 getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC39332e getTagBackgroundColor() {
        return this.tagBackgroundColor;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C18250d getTagBackgroundGradient() {
        return this.tagBackgroundGradient;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final C39274g getTagIcon() {
        return this.tagIcon;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final AbstractC17911t getTagIconBrush() {
        return this.tagIconBrush;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getTagIconSize() {
        return this.tagIconSize;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final EnumC17775o1 getTagStyle() {
        return this.tagStyle;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final TextResource getTagText() {
        return this.tagText;
    }

    public String toString() {
        TextResource textResource = this.tagText;
        C39274g c39274g = this.tagIcon;
        InterfaceC39332e interfaceC39332e = this.tagBackgroundColor;
        C18250d c18250d = this.tagBackgroundGradient;
        InterfaceC39332e interfaceC39332e2 = this.tagTextColor;
        AbstractC17911t abstractC17911t = this.tagTextBrush;
        AbstractC17911t abstractC17911t2 = this.tagIconBrush;
        EnumC17775o1 enumC17775o1 = this.tagStyle;
        boolean z4 = this.isAlertState;
        InterfaceC17869a1 interfaceC17869a1 = this.shape;
        String strM124783c = C39174f.m124783c(this.verticalPadding);
        String strM124783c2 = C39174f.m124783c(this.horizontalPadding);
        String strM124783c3 = C39174f.m124783c(this.tagIconSize);
        C39274g c39274g2 = this.rightTagIcon;
        String strM124783c4 = C39174f.m124783c(this.rightTagIconSize);
        InterfaceC39332e interfaceC39332e3 = this.rightTagIconColorOverride;
        C9598e c9598e = this.destination;
        Action action = this.action;
        C17730c1 c17730c1 = this.border;
        AbstractC22403o abstractC22403o = this.image;
        List<AbstractC22403o> list = this.avatars;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sb4 = new StringBuilder("TagState(tagText=");
        sb4.append(textResource);
        sb4.append(", tagIcon=");
        sb4.append(c39274g);
        sb4.append(", tagBackgroundColor=");
        sb4.append(interfaceC39332e);
        sb4.append(", tagBackgroundGradient=");
        sb4.append(c18250d);
        sb4.append(", tagTextColor=");
        sb4.append(interfaceC39332e2);
        sb4.append(", tagTextBrush=");
        sb4.append(abstractC17911t);
        sb4.append(", tagIconBrush=");
        sb4.append(abstractC17911t2);
        sb4.append(", tagStyle=");
        sb4.append(enumC17775o1);
        sb4.append(", isAlertState=");
        sb4.append(z4);
        sb4.append(", shape=");
        sb4.append(interfaceC17869a1);
        sb4.append(", verticalPadding=");
        AbstractC11266d.m30444B(sb4, strM124783c, ", horizontalPadding=", strM124783c2, ", tagIconSize=");
        sb4.append(strM124783c3);
        sb4.append(", rightTagIcon=");
        sb4.append(c39274g2);
        sb4.append(", rightTagIconSize=");
        sb4.append(strM124783c4);
        sb4.append(", rightTagIconColorOverride=");
        sb4.append(interfaceC39332e3);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", action=");
        sb4.append(action);
        sb4.append(", border=");
        sb4.append(c17730c1);
        sb4.append(", image=");
        sb4.append(abstractC22403o);
        sb4.append(", avatars=");
        sb4.append(list);
        sb4.append(", interaction=");
        sb4.append(genericInteraction);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final AbstractC17911t getTagTextBrush() {
        return this.tagTextBrush;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final InterfaceC39332e getTagTextColor() {
        return this.tagTextColor;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final float getVerticalPadding() {
        return this.verticalPadding;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsAlertState() {
        return this.isAlertState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C17750h1(TextResource tagText, C39274g c39274g, InterfaceC39332e tagBackgroundColor, C18250d c18250d, InterfaceC39332e tagTextColor, AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, EnumC17775o1 tagStyle, boolean z4, InterfaceC17869a1 shape, float f13, float f14, float f15, C39274g c39274g2, float f16, InterfaceC39332e rightTagIconColorOverride, C9598e c9598e, Action action, C17730c1 c17730c1, AbstractC22403o abstractC22403o, List<? extends AbstractC22403o> list, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(tagText, "tagText");
        AbstractC22676k.m65750j(tagBackgroundColor, "tagBackgroundColor");
        AbstractC22676k.m65750j(tagTextColor, "tagTextColor");
        AbstractC22676k.m65750j(tagStyle, "tagStyle");
        AbstractC22676k.m65750j(shape, "shape");
        AbstractC22676k.m65750j(rightTagIconColorOverride, "rightTagIconColorOverride");
        this.tagText = tagText;
        this.tagIcon = c39274g;
        this.tagBackgroundColor = tagBackgroundColor;
        this.tagBackgroundGradient = c18250d;
        this.tagTextColor = tagTextColor;
        this.tagTextBrush = abstractC17911t;
        this.tagIconBrush = abstractC17911t2;
        this.tagStyle = tagStyle;
        this.isAlertState = z4;
        this.shape = shape;
        this.verticalPadding = f13;
        this.horizontalPadding = f14;
        this.tagIconSize = f15;
        this.rightTagIcon = c39274g2;
        this.rightTagIconSize = f16;
        this.rightTagIconColorOverride = rightTagIconColorOverride;
        this.destination = c9598e;
        this.action = action;
        this.border = c17730c1;
        this.image = abstractC22403o;
        this.avatars = list;
        this.interaction = genericInteraction;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C17750h1(TextResource textResource, C39274g c39274g, InterfaceC39332e interfaceC39332e, C18250d c18250d, InterfaceC39332e interfaceC39332e2, AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, EnumC17775o1 enumC17775o1, boolean z4, InterfaceC17869a1 interfaceC17869a1, float f13, float f14, float f15, C39274g c39274g2, float f16, InterfaceC39332e interfaceC39332e3, C9598e c9598e, Action action, C17730c1 c17730c1, AbstractC22403o abstractC22403o, List list, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        float f17;
        C39274g c39274g3 = (i13 & 2) != 0 ? null : c39274g;
        InterfaceC39332e interfaceC39332e4 = (i13 & 4) != 0 ? EnumC39333f.WHITE_10 : interfaceC39332e;
        C18250d c18250d2 = (i13 & 8) != 0 ? null : c18250d;
        InterfaceC39332e interfaceC39332e5 = (i13 & 16) != 0 ? EnumC39333f.BRAND_WHITE : interfaceC39332e2;
        AbstractC17911t abstractC17911t3 = (i13 & 32) != 0 ? null : abstractC17911t;
        AbstractC17911t abstractC17911t4 = (i13 & 64) != 0 ? null : abstractC17911t2;
        EnumC17775o1 enumC17775o2 = (i13 & 128) != 0 ? EnumC17775o1.NONE : enumC17775o1;
        boolean z13 = (i13 & 256) != 0 ? false : z4;
        InterfaceC17869a1 interfaceC17869a1M105489e = (i13 & 512) != 0 ? AbstractC33253j.m105489e(1 * 4) : interfaceC17869a1;
        C39274g c39274g4 = c39274g3;
        float f18 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? ((float) 0.5d) * 8 : f13;
        float f19 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? 1 * 8 : f14;
        if ((i13 & 4096) != 0) {
            float f24 = 4;
            f17 = f24 * f24;
        } else {
            f17 = f15;
        }
        this(textResource, c39274g4, interfaceC39332e4, c18250d2, interfaceC39332e5, abstractC17911t3, abstractC17911t4, enumC17775o2, z13, interfaceC17869a1M105489e, f18, f19, f17, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c39274g2, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? AbstractC17746g1.m50886v() : f16, (32768 & i13) != 0 ? EnumC39333f.WHITE_50 : interfaceC39332e3, (65536 & i13) != 0 ? null : c9598e, (131072 & i13) != 0 ? null : action, (262144 & i13) != 0 ? null : c17730c1, (524288 & i13) != 0 ? null : abstractC22403o, (1048576 & i13) != 0 ? null : list, (i13 & 2097152) != 0 ? null : genericInteraction, null);
    }
}

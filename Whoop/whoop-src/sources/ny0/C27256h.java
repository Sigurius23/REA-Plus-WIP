package ny0;

import androidx.profileinstaller.ProfileVerifier;
import b91.EnumC2888c;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21166s;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p636y3.C39174f;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ny0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bM\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001b\u0012\b\b\u0002\u0010 \u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b-\u0010.Jª\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020\u001b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u001b2\b\u00106\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bK\u0010I\u001a\u0004\bL\u00102R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\b@\u0010WR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bJ\u0010X\u001a\u0004\bK\u0010YR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bU\u0010\\R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bS\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bZ\u0010bR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u001d\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bg\u0010d\u001a\u0004\bh\u0010fR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\be\u0010I\u001a\u0004\bi\u00102R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bh\u0010d\u001a\u0004\bg\u0010fR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bj\u0010d\u001a\u0004\bk\u0010fR\u0019\u0010!\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b>\u0010A\u001a\u0004\b`\u0010CR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bH\u0010nR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bc\u0010qR\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bO\u0010r\u001a\u0004\bl\u0010sR\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b^\u0010t\u001a\u0004\bj\u0010uR\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b:\u0010v\u001a\u0004\bw\u0010xR\u0019\u0010,\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\by\u0010A\u001a\u0004\bz\u0010CR\u0011\u0010{\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bM\u0010CR\u0011\u0010|\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bo\u0010CR\u0011\u0010}\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\by\u0010GR\u0013\u0010~\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\bQ\u0010xZ\n\u0010\u007f\"\u00020&2\u00020&¨\u0006\u0080\u0001"}, m65681d2 = {"Lny0/h;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "icon", "Li91/a;", "overrideBackground", "Ly81/f;", "overrideTitleColor", "", "cardName", "featureType", "Lny0/p;", "style", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "Lny0/g;", "buttonSize", "Lb91/c;", "textStyle", "Ly3/f;", "cornerRadius", "", "fillMaxSize", "fillMaxWidth", "id", "enabled", "isLoading", "disabledBackgroundOverride", "", "actionArgument", "Lj02/s;", "dismissEvent", "Lny0/c;", "iconConfiguration", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "Lj91/b;", "overrideBorderColor", "overridePressedBackground", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;)Lny0/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "x", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "s", "()Lgz0/m0;", "c", "Li91/a;", "getOverrideBackground", "()Li91/a;", "d", "Ly81/f;", "getOverrideTitleColor", "()Ly81/f;", "e", "Ljava/lang/String;", "j", "f", "getFeatureType", "g", "Lny0/p;", "v", "()Lny0/p;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/navigation/e;", "l", "()Lcom/whoop/navigation/e;", "i", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "k", "Lny0/g;", "()Lny0/g;", "Lb91/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Lb91/c;", "m", "Ly3/f;", "()Ly3/f;", "n", "Z", "p", "()Z", "o", "q", "getId", "r", "z", "t", "Ljava/lang/Object;", "()Ljava/lang/Object;", "u", "Lj02/s;", "()Lj02/s;", "Lny0/c;", "()Lny0/c;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lj91/b;", "getOverrideBorderColor", "()Lj91/b;", "y", "getOverridePressedBackground", "background", "pressedBackground", "titleColor", "borderColor", "IconConfiguration", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27256h implements InterfaceC25312u {

    /* JADX INFO: renamed from: z */
    public static final int f109055z = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC18247a overrideBackground;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f overrideTitleColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String cardName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String featureType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC27272p style;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC27254g buttonSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC2888c textStyle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C39174f cornerRadius;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean fillMaxSize;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean fillMaxWidth;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final AbstractC18247a disabledBackgroundOverride;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final Object actionArgument;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C21166s dismissEvent;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final EnumC27243c iconConfiguration;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final GenericInteraction genericInteraction;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC21430b overrideBorderColor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final AbstractC18247a overridePressedBackground;

    public /* synthetic */ C27256h(TextResource textResource, EnumC16313m0 enumC16313m0, AbstractC18247a abstractC18247a, EnumC39333f enumC39333f, String str, String str2, EnumC27272p enumC27272p, C9598e c9598e, Action action, AnalyticEventModel analyticEventModel, EnumC27254g enumC27254g, EnumC2888c enumC2888c, C39174f c39174f, boolean z4, boolean z13, String str3, boolean z14, boolean z15, AbstractC18247a abstractC18247a2, Object obj, C21166s c21166s, EnumC27243c enumC27243c, GenericInteraction genericInteraction, InterfaceC21430b interfaceC21430b, AbstractC18247a abstractC18247a3, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, enumC16313m0, abstractC18247a, enumC39333f, str, str2, enumC27272p, c9598e, action, analyticEventModel, enumC27254g, enumC2888c, c39174f, z4, z13, str3, z14, z15, abstractC18247a2, obj, c21166s, enumC27243c, genericInteraction, interfaceC21430b, abstractC18247a3);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27256h m82144b(C27256h c27256h, TextResource textResource, EnumC16313m0 enumC16313m0, AbstractC18247a abstractC18247a, EnumC39333f enumC39333f, String str, String str2, EnumC27272p enumC27272p, C9598e c9598e, Action action, AnalyticEventModel analyticEventModel, EnumC27254g enumC27254g, EnumC2888c enumC2888c, C39174f c39174f, boolean z4, boolean z13, String str3, boolean z14, boolean z15, AbstractC18247a abstractC18247a2, Object obj, C21166s c21166s, EnumC27243c enumC27243c, GenericInteraction genericInteraction, InterfaceC21430b interfaceC21430b, AbstractC18247a abstractC18247a3, int i13, Object obj2) {
        AbstractC18247a abstractC18247a4;
        InterfaceC21430b interfaceC21430b2;
        TextResource textResource2 = (i13 & 1) != 0 ? c27256h.title : textResource;
        EnumC16313m0 enumC16313m1 = (i13 & 2) != 0 ? c27256h.icon : enumC16313m0;
        AbstractC18247a abstractC18247a5 = (i13 & 4) != 0 ? c27256h.overrideBackground : abstractC18247a;
        EnumC39333f enumC39333f2 = (i13 & 8) != 0 ? c27256h.overrideTitleColor : enumC39333f;
        String str4 = (i13 & 16) != 0 ? c27256h.cardName : str;
        String str5 = (i13 & 32) != 0 ? c27256h.featureType : str2;
        EnumC27272p enumC27272p2 = (i13 & 64) != 0 ? c27256h.style : enumC27272p;
        C9598e c9598e2 = (i13 & 128) != 0 ? c27256h.destination : c9598e;
        Action action2 = (i13 & 256) != 0 ? c27256h.action : action;
        AnalyticEventModel analyticEventModel2 = (i13 & 512) != 0 ? c27256h.analyticEvent : analyticEventModel;
        EnumC27254g enumC27254g2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c27256h.buttonSize : enumC27254g;
        EnumC2888c enumC2888c2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c27256h.textStyle : enumC2888c;
        C39174f c39174f2 = (i13 & 4096) != 0 ? c27256h.cornerRadius : c39174f;
        boolean z16 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c27256h.fillMaxSize : z4;
        TextResource textResource3 = textResource2;
        boolean z17 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c27256h.fillMaxWidth : z13;
        String str6 = (i13 & 32768) != 0 ? c27256h.id : str3;
        boolean z18 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c27256h.enabled : z14;
        boolean z19 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c27256h.isLoading : z15;
        AbstractC18247a abstractC18247a6 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c27256h.disabledBackgroundOverride : abstractC18247a2;
        Object obj3 = (i13 & 524288) != 0 ? c27256h.actionArgument : obj;
        C21166s c21166s2 = (i13 & 1048576) != 0 ? c27256h.dismissEvent : c21166s;
        EnumC27243c enumC27243c2 = (i13 & 2097152) != 0 ? c27256h.iconConfiguration : enumC27243c;
        GenericInteraction genericInteraction2 = (i13 & 4194304) != 0 ? c27256h.genericInteraction : genericInteraction;
        InterfaceC21430b interfaceC21430b3 = (i13 & 8388608) != 0 ? c27256h.overrideBorderColor : interfaceC21430b;
        if ((i13 & 16777216) != 0) {
            interfaceC21430b2 = interfaceC21430b3;
            abstractC18247a4 = c27256h.overridePressedBackground;
        } else {
            abstractC18247a4 = abstractC18247a3;
            interfaceC21430b2 = interfaceC21430b3;
        }
        return c27256h.m82145a(textResource3, enumC16313m1, abstractC18247a5, enumC39333f2, str4, str5, enumC27272p2, c9598e2, action2, analyticEventModel2, enumC27254g2, enumC2888c2, c39174f2, z16, z17, str6, z18, z19, abstractC18247a6, obj3, c21166s2, enumC27243c2, genericInteraction2, interfaceC21430b2, abstractC18247a4);
    }

    /* JADX INFO: renamed from: a */
    public final C27256h m82145a(TextResource title, EnumC16313m0 icon, AbstractC18247a overrideBackground, EnumC39333f overrideTitleColor, String cardName, String featureType, EnumC27272p style, C9598e destination, Action action, AnalyticEventModel analyticEvent, EnumC27254g buttonSize, EnumC2888c textStyle, C39174f cornerRadius, boolean fillMaxSize, boolean fillMaxWidth, String id4, boolean enabled, boolean isLoading, AbstractC18247a disabledBackgroundOverride, Object actionArgument, C21166s dismissEvent, EnumC27243c iconConfiguration, GenericInteraction genericInteraction, InterfaceC21430b overrideBorderColor, AbstractC18247a overridePressedBackground) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(buttonSize, "buttonSize");
        AbstractC22676k.m65750j(iconConfiguration, "iconConfiguration");
        return new C27256h(title, icon, overrideBackground, overrideTitleColor, cardName, featureType, style, destination, action, analyticEvent, buttonSize, textStyle, cornerRadius, fillMaxSize, fillMaxWidth, id4, enabled, isLoading, disabledBackgroundOverride, actionArgument, dismissEvent, iconConfiguration, genericInteraction, overrideBorderColor, overridePressedBackground, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getActionArgument() {
        return this.actionArgument;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27256h)) {
            return false;
        }
        C27256h c27256h = (C27256h) other;
        return AbstractC22676k.m65745e(this.title, c27256h.title) && this.icon == c27256h.icon && AbstractC22676k.m65745e(this.overrideBackground, c27256h.overrideBackground) && this.overrideTitleColor == c27256h.overrideTitleColor && AbstractC22676k.m65745e(this.cardName, c27256h.cardName) && AbstractC22676k.m65745e(this.featureType, c27256h.featureType) && this.style == c27256h.style && AbstractC22676k.m65745e(this.destination, c27256h.destination) && AbstractC22676k.m65745e(this.action, c27256h.action) && AbstractC22676k.m65745e(this.analyticEvent, c27256h.analyticEvent) && this.buttonSize == c27256h.buttonSize && this.textStyle == c27256h.textStyle && AbstractC22676k.m65745e(this.cornerRadius, c27256h.cornerRadius) && this.fillMaxSize == c27256h.fillMaxSize && this.fillMaxWidth == c27256h.fillMaxWidth && AbstractC22676k.m65745e(this.id, c27256h.id) && this.enabled == c27256h.enabled && this.isLoading == c27256h.isLoading && AbstractC22676k.m65745e(this.disabledBackgroundOverride, c27256h.disabledBackgroundOverride) && AbstractC22676k.m65745e(this.actionArgument, c27256h.actionArgument) && AbstractC22676k.m65745e(this.dismissEvent, c27256h.dismissEvent) && this.iconConfiguration == c27256h.iconConfiguration && AbstractC22676k.m65745e(this.genericInteraction, c27256h.genericInteraction) && AbstractC22676k.m65745e(this.overrideBorderColor, c27256h.overrideBorderColor) && AbstractC22676k.m65745e(this.overridePressedBackground, c27256h.overridePressedBackground);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC18247a m82149g() {
        AbstractC18247a abstractC18247a = this.overrideBackground;
        return abstractC18247a == null ? this.style.getBackground() : abstractC18247a;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC21430b m82150h() {
        InterfaceC21430b interfaceC21430b = this.overrideBorderColor;
        return interfaceC21430b == null ? this.style.getBorderColor() : interfaceC21430b;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        AbstractC18247a abstractC18247a = this.overrideBackground;
        int iHashCode3 = (iHashCode2 + (abstractC18247a == null ? 0 : abstractC18247a.hashCode())) * 31;
        EnumC39333f enumC39333f = this.overrideTitleColor;
        int iHashCode4 = (iHashCode3 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        String str = this.cardName;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.featureType;
        int iM114673a = AbstractC36095b.m114673a(this.destination, (this.style.hashCode() + ((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
        Action action = this.action;
        int iHashCode6 = (iM114673a + (action == null ? 0 : action.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iHashCode7 = (this.buttonSize.hashCode() + ((iHashCode6 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31)) * 31;
        EnumC2888c enumC2888c = this.textStyle;
        int iHashCode8 = (iHashCode7 + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31;
        C39174f c39174f = this.cornerRadius;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode8 + (c39174f == null ? 0 : Float.hashCode(c39174f.f168413w))) * 31, 31, this.fillMaxSize), 31, this.fillMaxWidth);
        String str3 = this.id;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.enabled), 31, this.isLoading);
        AbstractC18247a abstractC18247a2 = this.disabledBackgroundOverride;
        int iHashCode9 = (iM8289b2 + (abstractC18247a2 == null ? 0 : abstractC18247a2.hashCode())) * 31;
        Object obj = this.actionArgument;
        int iHashCode10 = (iHashCode9 + (obj == null ? 0 : obj.hashCode())) * 31;
        C21166s c21166s = this.dismissEvent;
        int iHashCode11 = (this.iconConfiguration.hashCode() + ((iHashCode10 + (c21166s == null ? 0 : c21166s.hashCode())) * 31)) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        int iHashCode12 = (iHashCode11 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        InterfaceC21430b interfaceC21430b = this.overrideBorderColor;
        int iHashCode13 = (iHashCode12 + (interfaceC21430b == null ? 0 : interfaceC21430b.hashCode())) * 31;
        AbstractC18247a abstractC18247a3 = this.overridePressedBackground;
        return iHashCode13 + (abstractC18247a3 != null ? abstractC18247a3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC27254g getButtonSize() {
        return this.buttonSize;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C39174f getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final AbstractC18247a getDisabledBackgroundOverride() {
        return this.disabledBackgroundOverride;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C21166s getDismissEvent() {
        return this.dismissEvent;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getFillMaxSize() {
        return this.fillMaxSize;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getFillMaxWidth() {
        return this.fillMaxWidth;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final EnumC27243c getIconConfiguration() {
        return this.iconConfiguration;
    }

    public String toString() {
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.icon;
        AbstractC18247a abstractC18247a = this.overrideBackground;
        EnumC39333f enumC39333f = this.overrideTitleColor;
        String str = this.cardName;
        String str2 = this.featureType;
        EnumC27272p enumC27272p = this.style;
        C9598e c9598e = this.destination;
        Action action = this.action;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        EnumC27254g enumC27254g = this.buttonSize;
        EnumC2888c enumC2888c = this.textStyle;
        C39174f c39174f = this.cornerRadius;
        boolean z4 = this.fillMaxSize;
        boolean z13 = this.fillMaxWidth;
        String str3 = this.id;
        boolean z14 = this.enabled;
        boolean z15 = this.isLoading;
        AbstractC18247a abstractC18247a2 = this.disabledBackgroundOverride;
        Object obj = this.actionArgument;
        C21166s c21166s = this.dismissEvent;
        EnumC27243c enumC27243c = this.iconConfiguration;
        GenericInteraction genericInteraction = this.genericInteraction;
        InterfaceC21430b interfaceC21430b = this.overrideBorderColor;
        AbstractC18247a abstractC18247a3 = this.overridePressedBackground;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("CardButtonState(title=", textResource, ", icon=", enumC16313m0, ", overrideBackground=");
        sbM61140k.append(abstractC18247a);
        sbM61140k.append(", overrideTitleColor=");
        sbM61140k.append(enumC39333f);
        sbM61140k.append(", cardName=");
        AbstractC11266d.m30444B(sbM61140k, str, ", featureType=", str2, ", style=");
        sbM61140k.append(enumC27272p);
        sbM61140k.append(", destination=");
        sbM61140k.append(c9598e);
        sbM61140k.append(", action=");
        sbM61140k.append(action);
        sbM61140k.append(", analyticEvent=");
        sbM61140k.append(analyticEventModel);
        sbM61140k.append(", buttonSize=");
        sbM61140k.append(enumC27254g);
        sbM61140k.append(", textStyle=");
        sbM61140k.append(enumC2888c);
        sbM61140k.append(", cornerRadius=");
        sbM61140k.append(c39174f);
        sbM61140k.append(", fillMaxSize=");
        sbM61140k.append(z4);
        sbM61140k.append(", fillMaxWidth=");
        AbstractC38963t7.m124391u(sbM61140k, z13, ", id=", str3, ", enabled=");
        AbstractC38963t7.m124392v(sbM61140k, z14, ", isLoading=", z15, ", disabledBackgroundOverride=");
        sbM61140k.append(abstractC18247a2);
        sbM61140k.append(", actionArgument=");
        sbM61140k.append(obj);
        sbM61140k.append(", dismissEvent=");
        sbM61140k.append(c21166s);
        sbM61140k.append(", iconConfiguration=");
        sbM61140k.append(enumC27243c);
        sbM61140k.append(", genericInteraction=");
        sbM61140k.append(genericInteraction);
        sbM61140k.append(", overrideBorderColor=");
        sbM61140k.append(interfaceC21430b);
        sbM61140k.append(", overridePressedBackground=");
        sbM61140k.append(abstractC18247a3);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC18247a m82163u() {
        AbstractC18247a abstractC18247a = this.overridePressedBackground;
        return abstractC18247a == null ? this.style.getPressedBackground() : abstractC18247a;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final EnumC27272p getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final EnumC2888c getTextStyle() {
        return this.textStyle;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: y */
    public final EnumC39333f m82167y() {
        EnumC39333f enumC39333f = this.overrideTitleColor;
        if (enumC39333f == null) {
            return this.overrideBackground != null ? EnumC39333f.BRAND_BLACK : this.style.getTitleColor();
        }
        return enumC39333f;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    private C27256h(TextResource title, EnumC16313m0 enumC16313m0, AbstractC18247a abstractC18247a, EnumC39333f enumC39333f, String str, String str2, EnumC27272p style, C9598e destination, Action action, AnalyticEventModel analyticEventModel, EnumC27254g buttonSize, EnumC2888c enumC2888c, C39174f c39174f, boolean z4, boolean z13, String str3, boolean z14, boolean z15, AbstractC18247a abstractC18247a2, Object obj, C21166s c21166s, EnumC27243c iconConfiguration, GenericInteraction genericInteraction, InterfaceC21430b interfaceC21430b, AbstractC18247a abstractC18247a3) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(buttonSize, "buttonSize");
        AbstractC22676k.m65750j(iconConfiguration, "iconConfiguration");
        this.title = title;
        this.icon = enumC16313m0;
        this.overrideBackground = abstractC18247a;
        this.overrideTitleColor = enumC39333f;
        this.cardName = str;
        this.featureType = str2;
        this.style = style;
        this.destination = destination;
        this.action = action;
        this.analyticEvent = analyticEventModel;
        this.buttonSize = buttonSize;
        this.textStyle = enumC2888c;
        this.cornerRadius = c39174f;
        this.fillMaxSize = z4;
        this.fillMaxWidth = z13;
        this.id = str3;
        this.enabled = z14;
        this.isLoading = z15;
        this.disabledBackgroundOverride = abstractC18247a2;
        this.actionArgument = obj;
        this.dismissEvent = c21166s;
        this.iconConfiguration = iconConfiguration;
        this.genericInteraction = genericInteraction;
        this.overrideBorderColor = interfaceC21430b;
        this.overridePressedBackground = abstractC18247a3;
    }

    public /* synthetic */ C27256h(TextResource textResource, EnumC16313m0 enumC16313m0, AbstractC18247a abstractC18247a, EnumC39333f enumC39333f, String str, String str2, EnumC27272p enumC27272p, C9598e c9598e, Action action, AnalyticEventModel analyticEventModel, EnumC27254g enumC27254g, EnumC2888c enumC2888c, C39174f c39174f, boolean z4, boolean z13, String str3, boolean z14, boolean z15, AbstractC18247a abstractC18247a2, Object obj, C21166s c21166s, EnumC27243c enumC27243c, GenericInteraction genericInteraction, InterfaceC21430b interfaceC21430b, AbstractC18247a abstractC18247a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? null : enumC16313m0, (i13 & 4) != 0 ? null : abstractC18247a, (i13 & 8) != 0 ? null : enumC39333f, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? EnumC27272p.DEFAULT : enumC27272p, (i13 & 128) != 0 ? new C9598e(null, null, null, 7, null) : c9598e, (i13 & 256) != 0 ? null : action, (i13 & 512) != 0 ? null : analyticEventModel, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC27254g.COMPACT : enumC27254g, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : enumC2888c, (i13 & 4096) != 0 ? null : c39174f, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? true : z4, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z13, (32768 & i13) != 0 ? null : str3, (65536 & i13) != 0 ? true : z14, (131072 & i13) != 0 ? false : z15, (262144 & i13) != 0 ? null : abstractC18247a2, (524288 & i13) != 0 ? null : obj, (1048576 & i13) != 0 ? null : c21166s, (2097152 & i13) != 0 ? EnumC27243c.LEADING_ICON : enumC27243c, (4194304 & i13) != 0 ? null : genericInteraction, (8388608 & i13) != 0 ? null : interfaceC21430b, (i13 & 16777216) != 0 ? null : abstractC18247a3, null);
    }
}

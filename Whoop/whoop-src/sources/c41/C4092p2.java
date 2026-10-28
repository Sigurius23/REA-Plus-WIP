package c41;

import androidx.profileinstaller.ProfileVerifier;
import b91.EnumC2888c;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.Request;
import com.whoop.whoopaction.domain.models.UpdateAction;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import rz0.EnumC31927f;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c41.p2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b7\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010#¢\u0006\u0004\b%\u0010&Jú\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0002\u0010\"\u001a\u00020!2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010#HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u0010G\u001a\u0004\bA\u0010HR\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bJ\u0010HR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bE\u0010G\u001a\u0004\bI\u0010HR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bL\u0010HR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bM\u0010G\u001a\u0004\bN\u0010HR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bS\u0010G\u001a\u0004\bO\u0010HR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bL\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b3\u0010W\u001a\u0004\bC\u0010*R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b;\u0010X\u001a\u0004\bK\u0010YR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b7\u0010Z\u001a\u0004\bM\u0010[R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b\\\u0010^R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b_\u0010aR%\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010#8\u0006¢\u0006\f\n\u0004\bN\u0010b\u001a\u0004\b9\u0010cR\u0019\u0010d\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bQ\u0010W\u001a\u0004\bS\u0010*¨\u0006e"}, m65681d2 = {"Lc41/p2;", "Lm91/u;", "Lgz0/m0;", "icon", "Ly3/f;", "iconSize", "Lc41/n2;", "iconGradient", "Lcom/whoop/design/util/TextResource;", "title", "content", "Lb91/c;", "contentTypography", "Ly81/e;", "background", "titleColor", "contentColor", "emphasisTextColor", "strongEmphasisTextColor", "Lrz0/f;", "tileStyle", "dismissIconColor", "", "isDismissable", "", "componentDismissalId", "Lcom/whoop/whoopaction/domain/models/Action;", "dismissAction", "Lcom/whoop/analytics/AnalyticEventModel;", "dismissAnalyticEvent", "", "Lm91/o;", "items", "Lc41/o2;", "itemsAlignment", "", "analyticsProperties", "<init>", "(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;)Lc41/p2;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lgz0/m0;", "o", "()Lgz0/m0;", "b", "F", "q", "()F", "c", "Lc41/n2;", "p", "()Lc41/n2;", "d", "Lcom/whoop/design/util/TextResource;", "v", "()Lcom/whoop/design/util/TextResource;", "e", "g", "f", "Lb91/c;", "i", "()Lb91/c;", "Ly81/e;", "()Ly81/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "j", "n", "k", "t", "l", "Lrz0/f;", "u", "()Lrz0/f;", "m", "Z", "x", "()Z", "Ljava/lang/String;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "r", "Ljava/util/List;", "()Ljava/util/List;", "s", "Lc41/o2;", "()Lc41/o2;", "Ljava/util/Map;", "()Ljava/util/Map;", "dismissalId", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4092p2 implements InterfaceC25312u {

    /* JADX INFO: renamed from: v */
    public static final int f16593v = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float iconSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC4078n2 iconGradient;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC2888c contentTypography;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC39332e background;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC39332e titleColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC39332e contentColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC39332e emphasisTextColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC39332e strongEmphasisTextColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC31927f tileStyle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC39332e dismissIconColor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean isDismissable;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String componentDismissalId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Action dismissAction;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final AnalyticEventModel dismissAnalyticEvent;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final List<C25306o> items;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final EnumC4085o2 itemsAlignment;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final Map<String, String> analyticsProperties;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final String dismissalId;

    /* JADX INFO: renamed from: c41.p2$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f16615w = new a();

        /* JADX INFO: renamed from: a */
        public final long m12575a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m12575a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c41.p2$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f16616w = new b();

        /* JADX INFO: renamed from: a */
        public final long m12576a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m12576a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c41.p2$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f16617w = new c();

        /* JADX INFO: renamed from: a */
        public final long m12577a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m12577a((C39336i) obj));
        }
    }

    public /* synthetic */ C4092p2(EnumC16313m0 enumC16313m0, float f13, EnumC4078n2 enumC4078n2, TextResource textResource, TextResource textResource2, EnumC2888c enumC2888c, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, InterfaceC39332e interfaceC39332e5, EnumC31927f enumC31927f, InterfaceC39332e interfaceC39332e6, boolean z4, String str, Action action, AnalyticEventModel analyticEventModel, List list, EnumC4085o2 enumC4085o2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC16313m0, f13, enumC4078n2, textResource, textResource2, enumC2888c, interfaceC39332e, interfaceC39332e2, interfaceC39332e3, interfaceC39332e4, interfaceC39332e5, enumC31927f, interfaceC39332e6, z4, str, action, analyticEventModel, list, enumC4085o2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4092p2 m12552b(C4092p2 c4092p2, EnumC16313m0 enumC16313m0, float f13, EnumC4078n2 enumC4078n2, TextResource textResource, TextResource textResource2, EnumC2888c enumC2888c, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, InterfaceC39332e interfaceC39332e5, EnumC31927f enumC31927f, InterfaceC39332e interfaceC39332e6, boolean z4, String str, Action action, AnalyticEventModel analyticEventModel, List list, EnumC4085o2 enumC4085o2, Map map, int i13, Object obj) {
        Map map2;
        EnumC4085o2 enumC4085o3;
        EnumC16313m0 enumC16313m1 = (i13 & 1) != 0 ? c4092p2.icon : enumC16313m0;
        float f14 = (i13 & 2) != 0 ? c4092p2.iconSize : f13;
        EnumC4078n2 enumC4078n3 = (i13 & 4) != 0 ? c4092p2.iconGradient : enumC4078n2;
        TextResource textResource3 = (i13 & 8) != 0 ? c4092p2.title : textResource;
        TextResource textResource4 = (i13 & 16) != 0 ? c4092p2.content : textResource2;
        EnumC2888c enumC2888c2 = (i13 & 32) != 0 ? c4092p2.contentTypography : enumC2888c;
        InterfaceC39332e interfaceC39332e7 = (i13 & 64) != 0 ? c4092p2.background : interfaceC39332e;
        InterfaceC39332e interfaceC39332e8 = (i13 & 128) != 0 ? c4092p2.titleColor : interfaceC39332e2;
        InterfaceC39332e interfaceC39332e9 = (i13 & 256) != 0 ? c4092p2.contentColor : interfaceC39332e3;
        InterfaceC39332e interfaceC39332e10 = (i13 & 512) != 0 ? c4092p2.emphasisTextColor : interfaceC39332e4;
        InterfaceC39332e interfaceC39332e11 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c4092p2.strongEmphasisTextColor : interfaceC39332e5;
        EnumC31927f enumC31927f2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c4092p2.tileStyle : enumC31927f;
        InterfaceC39332e interfaceC39332e12 = (i13 & 4096) != 0 ? c4092p2.dismissIconColor : interfaceC39332e6;
        boolean z13 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c4092p2.isDismissable : z4;
        EnumC16313m0 enumC16313m2 = enumC16313m1;
        String str2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c4092p2.componentDismissalId : str;
        Action action2 = (i13 & 32768) != 0 ? c4092p2.dismissAction : action;
        AnalyticEventModel analyticEventModel2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c4092p2.dismissAnalyticEvent : analyticEventModel;
        List list2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c4092p2.items : list;
        EnumC4085o2 enumC4085o4 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c4092p2.itemsAlignment : enumC4085o2;
        if ((i13 & 524288) != 0) {
            enumC4085o3 = enumC4085o4;
            map2 = c4092p2.analyticsProperties;
        } else {
            map2 = map;
            enumC4085o3 = enumC4085o4;
        }
        return c4092p2.m12553a(enumC16313m2, f14, enumC4078n3, textResource3, textResource4, enumC2888c2, interfaceC39332e7, interfaceC39332e8, interfaceC39332e9, interfaceC39332e10, interfaceC39332e11, enumC31927f2, interfaceC39332e12, z13, str2, action2, analyticEventModel2, list2, enumC4085o3, map2);
    }

    /* JADX INFO: renamed from: a */
    public final C4092p2 m12553a(EnumC16313m0 icon, float iconSize, EnumC4078n2 iconGradient, TextResource title, TextResource content, EnumC2888c contentTypography, InterfaceC39332e background, InterfaceC39332e titleColor, InterfaceC39332e contentColor, InterfaceC39332e emphasisTextColor, InterfaceC39332e strongEmphasisTextColor, EnumC31927f tileStyle, InterfaceC39332e dismissIconColor, boolean isDismissable, String componentDismissalId, Action dismissAction, AnalyticEventModel dismissAnalyticEvent, List<C25306o> items, EnumC4085o2 itemsAlignment, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(iconGradient, "iconGradient");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(contentTypography, "contentTypography");
        AbstractC22676k.m65750j(background, "background");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(contentColor, "contentColor");
        AbstractC22676k.m65750j(emphasisTextColor, "emphasisTextColor");
        AbstractC22676k.m65750j(strongEmphasisTextColor, "strongEmphasisTextColor");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(itemsAlignment, "itemsAlignment");
        return new C4092p2(icon, iconSize, iconGradient, title, content, contentTypography, background, titleColor, contentColor, emphasisTextColor, strongEmphasisTextColor, tileStyle, dismissIconColor, isDismissable, componentDismissalId, dismissAction, dismissAnalyticEvent, items, itemsAlignment, analyticsProperties, null);
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, String> m12554c() {
        return this.analyticsProperties;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getBackground() {
        return this.background;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4092p2)) {
            return false;
        }
        C4092p2 c4092p2 = (C4092p2) other;
        return this.icon == c4092p2.icon && C39174f.m124782b(this.iconSize, c4092p2.iconSize) && this.iconGradient == c4092p2.iconGradient && AbstractC22676k.m65745e(this.title, c4092p2.title) && AbstractC22676k.m65745e(this.content, c4092p2.content) && this.contentTypography == c4092p2.contentTypography && AbstractC22676k.m65745e(this.background, c4092p2.background) && AbstractC22676k.m65745e(this.titleColor, c4092p2.titleColor) && AbstractC22676k.m65745e(this.contentColor, c4092p2.contentColor) && AbstractC22676k.m65745e(this.emphasisTextColor, c4092p2.emphasisTextColor) && AbstractC22676k.m65745e(this.strongEmphasisTextColor, c4092p2.strongEmphasisTextColor) && this.tileStyle == c4092p2.tileStyle && AbstractC22676k.m65745e(this.dismissIconColor, c4092p2.dismissIconColor) && this.isDismissable == c4092p2.isDismissable && AbstractC22676k.m65745e(this.componentDismissalId, c4092p2.componentDismissalId) && AbstractC22676k.m65745e(this.dismissAction, c4092p2.dismissAction) && AbstractC22676k.m65745e(this.dismissAnalyticEvent, c4092p2.dismissAnalyticEvent) && AbstractC22676k.m65745e(this.items, c4092p2.items) && this.itemsAlignment == c4092p2.itemsAlignment && AbstractC22676k.m65745e(this.analyticsProperties, c4092p2.analyticsProperties);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getComponentDismissalId() {
        return this.componentDismissalId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC39332e getContentColor() {
        return this.contentColor;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode = (this.iconGradient.hashCode() + AbstractC11266d.m30447a(this.iconSize, (enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31, 31)) * 31;
        TextResource textResource = this.title;
        int iM106648g = AbstractC33745d.m106648g(this.strongEmphasisTextColor, AbstractC33745d.m106648g(this.emphasisTextColor, AbstractC33745d.m106648g(this.contentColor, AbstractC33745d.m106648g(this.titleColor, AbstractC33745d.m106648g(this.background, (this.contentTypography.hashCode() + AbstractC31061c.m95625a((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, this.content, 31)) * 31, 31), 31), 31), 31), 31);
        EnumC31927f enumC31927f = this.tileStyle;
        int iHashCode2 = (iM106648g + (enumC31927f == null ? 0 : enumC31927f.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e = this.dismissIconColor;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31, 31, this.isDismissable);
        String str = this.componentDismissalId;
        int iHashCode3 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.dismissAction;
        int iHashCode4 = (iHashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.dismissAnalyticEvent;
        int iHashCode5 = (this.itemsAlignment.hashCode() + AbstractC11895b.m31983b((iHashCode4 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31, 31, this.items)) * 31;
        Map<String, String> map = this.analyticsProperties;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC2888c getContentTypography() {
        return this.contentTypography;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Action getDismissAction() {
        return this.dismissAction;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final AnalyticEventModel getDismissAnalyticEvent() {
        return this.dismissAnalyticEvent;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC39332e getDismissIconColor() {
        return this.dismissIconColor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getDismissalId() {
        return this.dismissalId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC39332e getEmphasisTextColor() {
        return this.emphasisTextColor;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final EnumC4078n2 getIconGradient() {
        return this.iconGradient;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: r */
    public final List<C25306o> m12568r() {
        return this.items;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final EnumC4085o2 getItemsAlignment() {
        return this.itemsAlignment;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final InterfaceC39332e getStrongEmphasisTextColor() {
        return this.strongEmphasisTextColor;
    }

    public String toString() {
        return "InfoCalloutState(icon=" + this.icon + ", iconSize=" + C39174f.m124783c(this.iconSize) + ", iconGradient=" + this.iconGradient + ", title=" + this.title + ", content=" + this.content + ", contentTypography=" + this.contentTypography + ", background=" + this.background + ", titleColor=" + this.titleColor + ", contentColor=" + this.contentColor + ", emphasisTextColor=" + this.emphasisTextColor + ", strongEmphasisTextColor=" + this.strongEmphasisTextColor + ", tileStyle=" + this.tileStyle + ", dismissIconColor=" + this.dismissIconColor + ", isDismissable=" + this.isDismissable + ", componentDismissalId=" + this.componentDismissalId + ", dismissAction=" + this.dismissAction + ", dismissAnalyticEvent=" + this.dismissAnalyticEvent + ", items=" + this.items + ", itemsAlignment=" + this.itemsAlignment + ", analyticsProperties=" + this.analyticsProperties + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final EnumC31927f getTileStyle() {
        return this.tileStyle;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final InterfaceC39332e getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsDismissable() {
        return this.isDismissable;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00be  */
    private C4092p2(EnumC16313m0 enumC16313m0, float f13, EnumC4078n2 iconGradient, TextResource textResource, TextResource content, EnumC2888c contentTypography, InterfaceC39332e background, InterfaceC39332e titleColor, InterfaceC39332e contentColor, InterfaceC39332e emphasisTextColor, InterfaceC39332e strongEmphasisTextColor, EnumC31927f enumC31927f, InterfaceC39332e interfaceC39332e, boolean z4, String str, Action action, AnalyticEventModel analyticEventModel, List<C25306o> items, EnumC4085o2 itemsAlignment, Map<String, String> map) {
        String content2;
        JsonElement jsonElement;
        Request request;
        AbstractC22676k.m65750j(iconGradient, "iconGradient");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(contentTypography, "contentTypography");
        AbstractC22676k.m65750j(background, "background");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(contentColor, "contentColor");
        AbstractC22676k.m65750j(emphasisTextColor, "emphasisTextColor");
        AbstractC22676k.m65750j(strongEmphasisTextColor, "strongEmphasisTextColor");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(itemsAlignment, "itemsAlignment");
        this.icon = enumC16313m0;
        this.iconSize = f13;
        this.iconGradient = iconGradient;
        this.title = textResource;
        this.content = content;
        this.contentTypography = contentTypography;
        this.background = background;
        this.titleColor = titleColor;
        this.contentColor = contentColor;
        this.emphasisTextColor = emphasisTextColor;
        this.strongEmphasisTextColor = strongEmphasisTextColor;
        this.tileStyle = enumC31927f;
        this.dismissIconColor = interfaceC39332e;
        this.isDismissable = z4;
        this.componentDismissalId = str;
        this.dismissAction = action;
        this.dismissAnalyticEvent = analyticEventModel;
        this.items = items;
        this.itemsAlignment = itemsAlignment;
        this.analyticsProperties = map;
        if (str == null) {
            UpdateAction updateAction = action instanceof UpdateAction ? (UpdateAction) action : null;
            JsonElement body = (updateAction == null || (request = updateAction.getRequest()) == null) ? null : request.getBody();
            JsonObject jsonObject = body instanceof JsonObject ? (JsonObject) body : null;
            if (jsonObject == null || (jsonElement = (JsonElement) jsonObject.get((Object) "id")) == null) {
                content2 = null;
            } else {
                JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
                if (jsonPrimitive != null) {
                    content2 = jsonPrimitive.getContent();
                } else {
                    content2 = null;
                }
            }
        } else {
            content2 = str;
        }
        this.dismissalId = content2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4092p2(EnumC16313m0 enumC16313m0, float f13, EnumC4078n2 enumC4078n2, TextResource textResource, TextResource textResource2, EnumC2888c enumC2888c, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, InterfaceC39332e interfaceC39332e5, EnumC31927f enumC31927f, InterfaceC39332e interfaceC39332e6, boolean z4, String str, Action action, AnalyticEventModel analyticEventModel, List list, EnumC4085o2 enumC4085o2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        float f14;
        EnumC16313m0 enumC16313m1 = (i13 & 1) != 0 ? null : enumC16313m0;
        if ((i13 & 2) != 0) {
            float f15 = 4;
            f14 = f15 * f15;
        } else {
            f14 = f13;
        }
        this(enumC16313m1, f14, (i13 & 4) != 0 ? EnumC4078n2.NONE : enumC4078n2, (i13 & 8) != 0 ? null : textResource, textResource2, (i13 & 32) != 0 ? EnumC2888c.B2 : enumC2888c, interfaceC39332e, (i13 & 128) != 0 ? p745y81.Function1.m125323a(a.f16615w) : interfaceC39332e2, interfaceC39332e3, (i13 & 512) != 0 ? p745y81.Function1.m125323a(b.f16616w) : interfaceC39332e4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? p745y81.Function1.m125323a(c.f16617w) : interfaceC39332e5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : enumC31927f, (i13 & 4096) != 0 ? null : interfaceC39332e6, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str, (32768 & i13) != 0 ? null : action, (65536 & i13) != 0 ? null : analyticEventModel, (131072 & i13) != 0 ? C25271y.f99162w : list, (262144 & i13) != 0 ? EnumC4085o2.TEXT : enumC4085o2, (i13 & 524288) != 0 ? null : map, null);
    }
}

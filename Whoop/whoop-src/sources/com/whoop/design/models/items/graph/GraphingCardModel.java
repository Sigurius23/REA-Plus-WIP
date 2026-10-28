package com.whoop.design.models.items.graph;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CheckmarkStyle;
import com.whoop.design.models.items.UnlockTrendsCardModel;
import com.whoop.design.models.items.UnlockTrendsCardModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ep0.C13395a;
import gz0.EnumC16313m0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 p2\u00020\u0001:\u0002qpBÙ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fBÑ\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001e\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010(J\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010(J\u0012\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b=\u00104J\u0012\u0010>\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b>\u0010?Jä\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bB\u0010(J\u0010\u0010C\u001a\u00020 HÖ\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010H\u001a\u00020G2\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003¢\u0006\u0004\bH\u0010IJ'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\bV\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\bW\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\bX\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010Y\u001a\u0004\bZ\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010U\u001a\u0004\b[\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010U\u001a\u0004\b\\\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\b]\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\b^\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010_\u001a\u0004\b`\u00102R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010a\u001a\u0004\bb\u00104R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010c\u0012\u0004\be\u0010f\u001a\u0004\bd\u00106R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010g\u001a\u0004\bh\u00108R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010i\u001a\u0004\bj\u0010:R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010k\u001a\u0004\bl\u0010<R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001b\u0010a\u001a\u0004\bm\u00104R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010n\u001a\u0004\bo\u0010?¨\u0006r"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphingCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/graph/GraphModel;", "graph", "", "id", "title", "icon", "Lgz0/m0;", "endIcon", "trendsCta", "trendCtaText", "progressDisplay", "sevenDayVow", "Lcom/whoop/design/models/items/CheckmarkStyle;", "checkmarkStyle", "", "Lcom/whoop/design/models/items/graph/GraphLegendModel;", "graphLegends", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;", "planProgressStatus", "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "circularProgressIndicator", "Lcom/whoop/design/models/items/UnlockTrendsCardModel;", "unlockTrendsCard", "subItems", "Lcom/whoop/design/models/items/graph/GraphingCardTheme;", "theme", "<init>", "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lgz0/m0;", "component6", "component7", "component8", "component9", "component10", "()Lcom/whoop/design/models/items/CheckmarkStyle;", "component11", "()Ljava/util/List;", "component12", "()Lcom/whoop/navigation/e;", "component13", "()Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;", "component14", "()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "component15", "()Lcom/whoop/design/models/items/UnlockTrendsCardModel;", "component16", "component17", "()Lcom/whoop/design/models/items/graph/GraphingCardTheme;", "copy", "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;)Lcom/whoop/design/models/items/graph/GraphingCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/GraphingCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraph", "Ljava/lang/String;", "getId", "getTitle", "getIcon", "Lgz0/m0;", "getEndIcon", "getTrendsCta", "getTrendCtaText", "getProgressDisplay", "getSevenDayVow", "Lcom/whoop/design/models/items/CheckmarkStyle;", "getCheckmarkStyle", "Ljava/util/List;", "getGraphLegends", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;", "getPlanProgressStatus", "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "getCircularProgressIndicator", "Lcom/whoop/design/models/items/UnlockTrendsCardModel;", "getUnlockTrendsCard", "getSubItems", "Lcom/whoop/design/models/items/graph/GraphingCardTheme;", "getTheme", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphingCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final CheckmarkStyle checkmarkStyle;
    private final CircularProgressIndicator circularProgressIndicator;
    private final C9598e destination;
    private final EnumC16313m0 endIcon;
    private final GraphModel graph;
    private final List<GraphLegendModel> graphLegends;
    private final String icon;
    private final String id;
    private final PlanProgressStatusModel planProgressStatus;
    private final String progressDisplay;
    private final String sevenDayVow;
    private final List<DesignSystemModel> subItems;
    private final GraphingCardTheme theme;
    private final String title;
    private final String trendCtaText;
    private final String trendsCta;
    private final UnlockTrendsCardModel unlockTrendsCard;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphingCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/GraphingCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphingCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C13395a(23)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C13395a(24)), AbstractC30060g.m92087G(enumC23463i, new C13395a(25)), AbstractC30060g.m92087G(enumC23463i, new C13395a(26)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C13395a(27)), null};
    }

    public /* synthetic */ GraphingCardModel(int i13, GraphModel graphModel, String str, String str2, String str3, EnumC16313m0 enumC16313m0, String str4, String str5, String str6, String str7, CheckmarkStyle checkmarkStyle, List list, C9598e c9598e, PlanProgressStatusModel planProgressStatusModel, CircularProgressIndicator circularProgressIndicator, UnlockTrendsCardModel unlockTrendsCardModel, List list2, GraphingCardTheme graphingCardTheme, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, GraphingCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.graph = graphModel;
        if ((i13 & 2) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i13 & 4) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i13 & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
        if ((i13 & 16) == 0) {
            this.endIcon = null;
        } else {
            this.endIcon = enumC16313m0;
        }
        if ((i13 & 32) == 0) {
            this.trendsCta = null;
        } else {
            this.trendsCta = str4;
        }
        if ((i13 & 64) == 0) {
            this.trendCtaText = null;
        } else {
            this.trendCtaText = str5;
        }
        if ((i13 & 128) == 0) {
            this.progressDisplay = null;
        } else {
            this.progressDisplay = str6;
        }
        if ((i13 & 256) == 0) {
            this.sevenDayVow = null;
        } else {
            this.sevenDayVow = str7;
        }
        if ((i13 & 512) == 0) {
            this.checkmarkStyle = null;
        } else {
            this.checkmarkStyle = checkmarkStyle;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.graphLegends = null;
        } else {
            this.graphLegends = list;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 4096) == 0) {
            this.planProgressStatus = null;
        } else {
            this.planProgressStatus = planProgressStatusModel;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.circularProgressIndicator = null;
        } else {
            this.circularProgressIndicator = circularProgressIndicator;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.unlockTrendsCard = null;
        } else {
            this.unlockTrendsCard = unlockTrendsCardModel;
        }
        if ((32768 & i13) == 0) {
            this.subItems = null;
        } else {
            this.subItems = list2;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
            this.theme = null;
        } else {
            this.theme = graphingCardTheme;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.CheckmarkStyle", CheckmarkStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(GraphLegendModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$3() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GraphingCardModel copy$default(GraphingCardModel graphingCardModel, GraphModel graphModel, String str, String str2, String str3, EnumC16313m0 enumC16313m0, String str4, String str5, String str6, String str7, CheckmarkStyle checkmarkStyle, List list, C9598e c9598e, PlanProgressStatusModel planProgressStatusModel, CircularProgressIndicator circularProgressIndicator, UnlockTrendsCardModel unlockTrendsCardModel, List list2, GraphingCardTheme graphingCardTheme, int i13, Object obj) {
        GraphingCardTheme graphingCardTheme2;
        List list3;
        GraphModel graphModel2 = (i13 & 1) != 0 ? graphingCardModel.graph : graphModel;
        String str8 = (i13 & 2) != 0 ? graphingCardModel.id : str;
        String str9 = (i13 & 4) != 0 ? graphingCardModel.title : str2;
        String str10 = (i13 & 8) != 0 ? graphingCardModel.icon : str3;
        EnumC16313m0 enumC16313m1 = (i13 & 16) != 0 ? graphingCardModel.endIcon : enumC16313m0;
        String str11 = (i13 & 32) != 0 ? graphingCardModel.trendsCta : str4;
        String str12 = (i13 & 64) != 0 ? graphingCardModel.trendCtaText : str5;
        String str13 = (i13 & 128) != 0 ? graphingCardModel.progressDisplay : str6;
        String str14 = (i13 & 256) != 0 ? graphingCardModel.sevenDayVow : str7;
        CheckmarkStyle checkmarkStyle2 = (i13 & 512) != 0 ? graphingCardModel.checkmarkStyle : checkmarkStyle;
        List list4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? graphingCardModel.graphLegends : list;
        C9598e c9598e2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? graphingCardModel.destination : c9598e;
        PlanProgressStatusModel planProgressStatusModel2 = (i13 & 4096) != 0 ? graphingCardModel.planProgressStatus : planProgressStatusModel;
        CircularProgressIndicator circularProgressIndicator2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? graphingCardModel.circularProgressIndicator : circularProgressIndicator;
        GraphModel graphModel3 = graphModel2;
        UnlockTrendsCardModel unlockTrendsCardModel2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? graphingCardModel.unlockTrendsCard : unlockTrendsCardModel;
        List list5 = (i13 & 32768) != 0 ? graphingCardModel.subItems : list2;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            list3 = list5;
            graphingCardTheme2 = graphingCardModel.theme;
        } else {
            graphingCardTheme2 = graphingCardTheme;
            list3 = list5;
        }
        return graphingCardModel.copy(graphModel3, str8, str9, str10, enumC16313m1, str11, str12, str13, str14, checkmarkStyle2, list4, c9598e2, planProgressStatusModel2, circularProgressIndicator2, unlockTrendsCardModel2, list3, graphingCardTheme2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphingCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, GraphModel$$serializer.INSTANCE, self.graph);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 2, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.endIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.endIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.trendsCta != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.trendsCta);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.trendCtaText != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.trendCtaText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.progressDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.progressDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.sevenDayVow != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.sevenDayVow);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.checkmarkStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.checkmarkStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.graphLegends != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.graphLegends);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.destination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.planProgressStatus != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, PlanProgressStatusModel$$serializer.INSTANCE, self.planProgressStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.circularProgressIndicator != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, CircularProgressIndicator$$serializer.INSTANCE, self.circularProgressIndicator);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.unlockTrendsCard != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, UnlockTrendsCardModel$$serializer.INSTANCE, self.unlockTrendsCard);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.subItems != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, (InterfaceC37145j) interfaceC23462hArr[15].getValue(), self.subItems);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 16) && self.theme == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 16, GraphingCardTheme$$serializer.INSTANCE, self.theme);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GraphModel getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CheckmarkStyle getCheckmarkStyle() {
        return this.checkmarkStyle;
    }

    public final List<GraphLegendModel> component11() {
        return this.graphLegends;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final PlanProgressStatusModel getPlanProgressStatus() {
        return this.planProgressStatus;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final UnlockTrendsCardModel getUnlockTrendsCard() {
        return this.unlockTrendsCard;
    }

    public final List<DesignSystemModel> component16() {
        return this.subItems;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final GraphingCardTheme getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrendsCta() {
        return this.trendsCta;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrendCtaText() {
        return this.trendCtaText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProgressDisplay() {
        return this.progressDisplay;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSevenDayVow() {
        return this.sevenDayVow;
    }

    public final GraphingCardModel copy(GraphModel graph, String id4, String title, String icon, EnumC16313m0 endIcon, String trendsCta, String trendCtaText, String progressDisplay, String sevenDayVow, CheckmarkStyle checkmarkStyle, List<GraphLegendModel> graphLegends, C9598e destination, PlanProgressStatusModel planProgressStatus, CircularProgressIndicator circularProgressIndicator, UnlockTrendsCardModel unlockTrendsCard, List<? extends DesignSystemModel> subItems, GraphingCardTheme theme) {
        AbstractC22676k.m65750j(graph, "graph");
        AbstractC22676k.m65750j(title, "title");
        return new GraphingCardModel(graph, id4, title, icon, endIcon, trendsCta, trendCtaText, progressDisplay, sevenDayVow, checkmarkStyle, graphLegends, destination, planProgressStatus, circularProgressIndicator, unlockTrendsCard, subItems, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphingCardModel)) {
            return false;
        }
        GraphingCardModel graphingCardModel = (GraphingCardModel) other;
        return AbstractC22676k.m65745e(this.graph, graphingCardModel.graph) && AbstractC22676k.m65745e(this.id, graphingCardModel.id) && AbstractC22676k.m65745e(this.title, graphingCardModel.title) && AbstractC22676k.m65745e(this.icon, graphingCardModel.icon) && this.endIcon == graphingCardModel.endIcon && AbstractC22676k.m65745e(this.trendsCta, graphingCardModel.trendsCta) && AbstractC22676k.m65745e(this.trendCtaText, graphingCardModel.trendCtaText) && AbstractC22676k.m65745e(this.progressDisplay, graphingCardModel.progressDisplay) && AbstractC22676k.m65745e(this.sevenDayVow, graphingCardModel.sevenDayVow) && this.checkmarkStyle == graphingCardModel.checkmarkStyle && AbstractC22676k.m65745e(this.graphLegends, graphingCardModel.graphLegends) && AbstractC22676k.m65745e(this.destination, graphingCardModel.destination) && AbstractC22676k.m65745e(this.planProgressStatus, graphingCardModel.planProgressStatus) && AbstractC22676k.m65745e(this.circularProgressIndicator, graphingCardModel.circularProgressIndicator) && AbstractC22676k.m65745e(this.unlockTrendsCard, graphingCardModel.unlockTrendsCard) && AbstractC22676k.m65745e(this.subItems, graphingCardModel.subItems) && AbstractC22676k.m65745e(this.theme, graphingCardModel.theme);
    }

    public final CheckmarkStyle getCheckmarkStyle() {
        return this.checkmarkStyle;
    }

    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    public final GraphModel getGraph() {
        return this.graph;
    }

    public final List<GraphLegendModel> getGraphLegends() {
        return this.graphLegends;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final PlanProgressStatusModel getPlanProgressStatus() {
        return this.planProgressStatus;
    }

    public final String getProgressDisplay() {
        return this.progressDisplay;
    }

    public final String getSevenDayVow() {
        return this.sevenDayVow;
    }

    public final List<DesignSystemModel> getSubItems() {
        return this.subItems;
    }

    public final GraphingCardTheme getTheme() {
        return this.theme;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrendCtaText() {
        return this.trendCtaText;
    }

    public final String getTrendsCta() {
        return this.trendsCta;
    }

    public final UnlockTrendsCardModel getUnlockTrendsCard() {
        return this.unlockTrendsCard;
    }

    public int hashCode() {
        int iHashCode = this.graph.hashCode() * 31;
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
        String str2 = this.icon;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        String str3 = this.trendsCta;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trendCtaText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.progressDisplay;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sevenDayVow;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        CheckmarkStyle checkmarkStyle = this.checkmarkStyle;
        int iHashCode8 = (iHashCode7 + (checkmarkStyle == null ? 0 : checkmarkStyle.hashCode())) * 31;
        List<GraphLegendModel> list = this.graphLegends;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode10 = (iHashCode9 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        PlanProgressStatusModel planProgressStatusModel = this.planProgressStatus;
        int iHashCode11 = (iHashCode10 + (planProgressStatusModel == null ? 0 : planProgressStatusModel.hashCode())) * 31;
        CircularProgressIndicator circularProgressIndicator = this.circularProgressIndicator;
        int iHashCode12 = (iHashCode11 + (circularProgressIndicator == null ? 0 : circularProgressIndicator.hashCode())) * 31;
        UnlockTrendsCardModel unlockTrendsCardModel = this.unlockTrendsCard;
        int iHashCode13 = (iHashCode12 + (unlockTrendsCardModel == null ? 0 : unlockTrendsCardModel.hashCode())) * 31;
        List<DesignSystemModel> list2 = this.subItems;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GraphingCardTheme graphingCardTheme = this.theme;
        return iHashCode14 + (graphingCardTheme != null ? graphingCardTheme.hashCode() : 0);
    }

    public String toString() {
        GraphModel graphModel = this.graph;
        String str = this.id;
        String str2 = this.title;
        String str3 = this.icon;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        String str4 = this.trendsCta;
        String str5 = this.trendCtaText;
        String str6 = this.progressDisplay;
        String str7 = this.sevenDayVow;
        CheckmarkStyle checkmarkStyle = this.checkmarkStyle;
        List<GraphLegendModel> list = this.graphLegends;
        C9598e c9598e = this.destination;
        PlanProgressStatusModel planProgressStatusModel = this.planProgressStatus;
        CircularProgressIndicator circularProgressIndicator = this.circularProgressIndicator;
        UnlockTrendsCardModel unlockTrendsCardModel = this.unlockTrendsCard;
        List<DesignSystemModel> list2 = this.subItems;
        GraphingCardTheme graphingCardTheme = this.theme;
        StringBuilder sb4 = new StringBuilder("GraphingCardModel(graph=");
        sb4.append(graphModel);
        sb4.append(", id=");
        sb4.append(str);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str2, ", icon=", str3, ", endIcon=");
        sb4.append(enumC16313m0);
        sb4.append(", trendsCta=");
        sb4.append(str4);
        sb4.append(", trendCtaText=");
        AbstractC11266d.m30444B(sb4, str5, ", progressDisplay=", str6, ", sevenDayVow=");
        sb4.append(str7);
        sb4.append(", checkmarkStyle=");
        sb4.append(checkmarkStyle);
        sb4.append(", graphLegends=");
        sb4.append(list);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", planProgressStatus=");
        sb4.append(planProgressStatusModel);
        sb4.append(", circularProgressIndicator=");
        sb4.append(circularProgressIndicator);
        sb4.append(", unlockTrendsCard=");
        sb4.append(unlockTrendsCardModel);
        sb4.append(", subItems=");
        sb4.append(list2);
        sb4.append(", theme=");
        sb4.append(graphingCardTheme);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GraphingCardModel(GraphModel graph, String str, String title, String str2, EnumC16313m0 enumC16313m0, String str3, String str4, String str5, String str6, CheckmarkStyle checkmarkStyle, List<GraphLegendModel> list, C9598e c9598e, PlanProgressStatusModel planProgressStatusModel, CircularProgressIndicator circularProgressIndicator, UnlockTrendsCardModel unlockTrendsCardModel, List<? extends DesignSystemModel> list2, GraphingCardTheme graphingCardTheme) {
        AbstractC22676k.m65750j(graph, "graph");
        AbstractC22676k.m65750j(title, "title");
        this.graph = graph;
        this.id = str;
        this.title = title;
        this.icon = str2;
        this.endIcon = enumC16313m0;
        this.trendsCta = str3;
        this.trendCtaText = str4;
        this.progressDisplay = str5;
        this.sevenDayVow = str6;
        this.checkmarkStyle = checkmarkStyle;
        this.graphLegends = list;
        this.destination = c9598e;
        this.planProgressStatus = planProgressStatusModel;
        this.circularProgressIndicator = circularProgressIndicator;
        this.unlockTrendsCard = unlockTrendsCardModel;
        this.subItems = list2;
        this.theme = graphingCardTheme;
    }

    public /* synthetic */ GraphingCardModel(GraphModel graphModel, String str, String str2, String str3, EnumC16313m0 enumC16313m0, String str4, String str5, String str6, String str7, CheckmarkStyle checkmarkStyle, List list, C9598e c9598e, PlanProgressStatusModel planProgressStatusModel, CircularProgressIndicator circularProgressIndicator, UnlockTrendsCardModel unlockTrendsCardModel, List list2, GraphingCardTheme graphingCardTheme, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(graphModel, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : enumC16313m0, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : str6, (i13 & 256) != 0 ? null : str7, (i13 & 512) != 0 ? null : checkmarkStyle, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c9598e, (i13 & 4096) != 0 ? null : planProgressStatusModel, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : circularProgressIndicator, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : unlockTrendsCardModel, (i13 & 32768) != 0 ? null : list2, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : graphingCardTheme);
    }
}

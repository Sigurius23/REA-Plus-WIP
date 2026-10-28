package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.ArticleTileCarouselModel$$serializer;
import com.whoop.design.models.items.StepperComponentModel;
import com.whoop.design.models.items.StepperComponentModel$$serializer;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.WhoopCoachVowModel$$serializer;
import com.whoop.design.models.items.graph.StressGraphingCardModel;
import com.whoop.design.models.items.graph.StressGraphingCardModel$$serializer;
import com.whoop.design.models.items.graph.stress.StressState;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih1.C18518b;
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
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bG\b\u0087\b\u0018\u0000 ª\u00012\u00020\u0001:\u0004«\u0001¬\u0001Bï\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+B\u008d\u0002\b\u0010\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b*\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bA\u00102J\u0010\u0010B\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bB\u00102J\u0012\u0010C\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bE\u0010DJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bF\u0010DJ\u0010\u0010G\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bG\u00108J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00102J\u0012\u0010I\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bM\u0010@J\u0012\u0010N\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bR\u0010@J\u0018\u0010S\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bW\u0010XJ¨\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b[\u00102J\u0010\u0010\\\u001a\u00020,HÖ\u0001¢\u0006\u0004\b\\\u0010]J\u001a\u0010_\u001a\u00020\b2\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b_\u0010`J'\u0010i\u001a\u00020f2\u0006\u0010a\u001a\u00020\u00002\u0006\u0010c\u001a\u00020b2\u0006\u0010e\u001a\u00020dH\u0001¢\u0006\u0004\bg\u0010hR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010j\u0012\u0004\bl\u0010m\u001a\u0004\bk\u00102R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010n\u0012\u0004\bp\u0010m\u001a\u0004\bo\u00104R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010q\u0012\u0004\bs\u0010m\u001a\u0004\br\u00106R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010t\u0012\u0004\bv\u0010m\u001a\u0004\bu\u00108R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010w\u0012\u0004\by\u0010m\u001a\u0004\bx\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010z\u0012\u0004\b|\u0010m\u001a\u0004\b{\u0010<R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010}\u0012\u0004\b\u007f\u0010m\u001a\u0004\b~\u0010>R%\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0011\u0010\u0080\u0001\u0012\u0005\b\u0082\u0001\u0010m\u001a\u0005\b\u0081\u0001\u0010@R\"\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0012\u0010j\u0012\u0005\b\u0084\u0001\u0010m\u001a\u0005\b\u0083\u0001\u00102R\"\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0013\u0010j\u0012\u0005\b\u0086\u0001\u0010m\u001a\u0005\b\u0085\u0001\u00102R%\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0015\u0010\u0087\u0001\u0012\u0005\b\u0089\u0001\u0010m\u001a\u0005\b\u0088\u0001\u0010DR%\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0016\u0010\u0087\u0001\u0012\u0005\b\u008b\u0001\u0010m\u001a\u0005\b\u008a\u0001\u0010DR%\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0017\u0010\u0087\u0001\u0012\u0005\b\u008d\u0001\u0010m\u001a\u0005\b\u008c\u0001\u0010DR\"\u0010\u0018\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0018\u0010t\u0012\u0005\b\u008f\u0001\u0010m\u001a\u0005\b\u008e\u0001\u00108R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0019\u0010j\u0012\u0005\b\u0091\u0001\u0010m\u001a\u0005\b\u0090\u0001\u00102R%\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001b\u0010\u0092\u0001\u0012\u0005\b\u0094\u0001\u0010m\u001a\u0005\b\u0093\u0001\u0010JR%\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001d\u0010\u0095\u0001\u0012\u0005\b\u0097\u0001\u0010m\u001a\u0005\b\u0096\u0001\u0010LR%\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001e\u0010\u0080\u0001\u0012\u0005\b\u0099\u0001\u0010m\u001a\u0005\b\u0098\u0001\u0010@R%\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b \u0010\u009a\u0001\u0012\u0005\b\u009c\u0001\u0010m\u001a\u0005\b\u009b\u0001\u0010OR%\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\"\u0010\u009d\u0001\u0012\u0005\b\u009f\u0001\u0010m\u001a\u0005\b\u009e\u0001\u0010QR%\u0010#\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b#\u0010\u0080\u0001\u0012\u0005\b¡\u0001\u0010m\u001a\u0005\b \u0001\u0010@R+\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b%\u0010¢\u0001\u0012\u0005\b¤\u0001\u0010m\u001a\u0005\b£\u0001\u0010TR%\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b'\u0010¥\u0001\u0012\u0005\b§\u0001\u0010m\u001a\u0005\b¦\u0001\u0010VR\u001b\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000e\n\u0005\b)\u0010¨\u0001\u001a\u0005\b©\u0001\u0010X¨\u0006\u00ad\u0001"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressMonitorDto;", "", "", "title", "Lcom/whoop/stress/domain/model/LoadingData;", "loadingData", "Lcom/whoop/design/models/items/graph/stress/StressState;", "stressState", "", "showConnectivityWindow", "Lcom/whoop/stress/domain/model/StressMonitorMeterDto;", "meter", "Lcom/whoop/stress/domain/model/StressMonitorVow;", "vow", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "whoopCoachVow", "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "stressGraph", "feedbackUrl", "lastUpdated", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "onboardingCarouselModel", "sessionsCarouselModel", "educationCarouselModel", "showOnboardingEducation", "calibrationText", "Lcom/whoop/stress/domain/model/PendingActivityDialogue;", "pendingActivityDialogue", "Lcom/whoop/stress/domain/model/OnboardingDismissDialog;", "onboardingDismissDialogue", "previousStressGraphState", "Lcom/whoop/stress/domain/model/StressTrend;", "trend", "Lcom/whoop/stress/domain/model/StressDateSelector;", "dateSelector", "extended24HourGraphState", "", "trendList", "Lcom/whoop/design/models/items/StepperComponentModel;", "progressStepper", "Lcom/whoop/stress/domain/model/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/stress/domain/model/LoadingData;", "component3", "()Lcom/whoop/design/models/items/graph/stress/StressState;", "component4", "()Z", "component5", "()Lcom/whoop/stress/domain/model/StressMonitorMeterDto;", "component6", "()Lcom/whoop/stress/domain/model/StressMonitorVow;", "component7", "()Lcom/whoop/design/models/items/WhoopCoachVowModel;", "component8", "()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "component9", "component10", "component11", "()Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "component12", "component13", "component14", "component15", "component16", "()Lcom/whoop/stress/domain/model/PendingActivityDialogue;", "component17", "()Lcom/whoop/stress/domain/model/OnboardingDismissDialog;", "component18", "component19", "()Lcom/whoop/stress/domain/model/StressTrend;", "component20", "()Lcom/whoop/stress/domain/model/StressDateSelector;", "component21", "component22", "()Ljava/util/List;", "component23", "()Lcom/whoop/design/models/items/StepperComponentModel;", "component24", "()Lcom/whoop/stress/domain/model/MetaData;", "copy", "(Ljava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;)Lcom/whoop/stress/domain/model/StressMonitorDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressMonitorDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Lcom/whoop/stress/domain/model/LoadingData;", "getLoadingData", "getLoadingData$annotations", "Lcom/whoop/design/models/items/graph/stress/StressState;", "getStressState", "getStressState$annotations", "Z", "getShowConnectivityWindow", "getShowConnectivityWindow$annotations", "Lcom/whoop/stress/domain/model/StressMonitorMeterDto;", "getMeter", "getMeter$annotations", "Lcom/whoop/stress/domain/model/StressMonitorVow;", "getVow", "getVow$annotations", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "getWhoopCoachVow", "getWhoopCoachVow$annotations", "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "getStressGraph", "getStressGraph$annotations", "getFeedbackUrl", "getFeedbackUrl$annotations", "getLastUpdated", "getLastUpdated$annotations", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "getOnboardingCarouselModel", "getOnboardingCarouselModel$annotations", "getSessionsCarouselModel", "getSessionsCarouselModel$annotations", "getEducationCarouselModel", "getEducationCarouselModel$annotations", "getShowOnboardingEducation", "getShowOnboardingEducation$annotations", "getCalibrationText", "getCalibrationText$annotations", "Lcom/whoop/stress/domain/model/PendingActivityDialogue;", "getPendingActivityDialogue", "getPendingActivityDialogue$annotations", "Lcom/whoop/stress/domain/model/OnboardingDismissDialog;", "getOnboardingDismissDialogue", "getOnboardingDismissDialogue$annotations", "getPreviousStressGraphState", "getPreviousStressGraphState$annotations", "Lcom/whoop/stress/domain/model/StressTrend;", "getTrend", "getTrend$annotations", "Lcom/whoop/stress/domain/model/StressDateSelector;", "getDateSelector", "getDateSelector$annotations", "getExtended24HourGraphState", "getExtended24HourGraphState$annotations", "Ljava/util/List;", "getTrendList", "getTrendList$annotations", "Lcom/whoop/design/models/items/StepperComponentModel;", "getProgressStepper", "getProgressStepper$annotations", "Lcom/whoop/stress/domain/model/MetaData;", "getMetadata", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressMonitorDto {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("calibration_text_display")
    private final String calibrationText;

    @SerializedName("date_selector")
    private final StressDateSelector dateSelector;

    @SerializedName("education_carousel")
    private final ArticleTileCarouselModel educationCarouselModel;

    @SerializedName("extended24_hour_graph")
    private final StressGraphingCardModel extended24HourGraphState;

    @SerializedName("typeform_url")
    private final String feedbackUrl;

    @SerializedName("last_updated_display")
    private final String lastUpdated;

    @SerializedName("loading_data")
    private final LoadingData loadingData;
    private final MetaData metadata;

    @SerializedName("gauge")
    private final StressMonitorMeterDto meter;

    @SerializedName("onboarding_carousel")
    private final ArticleTileCarouselModel onboardingCarouselModel;

    @SerializedName("onboarding_dismiss_dialogue")
    private final OnboardingDismissDialog onboardingDismissDialogue;

    @SerializedName("pending_activity_dialogue")
    private final PendingActivityDialogue pendingActivityDialogue;

    @SerializedName("previous_stress_graph")
    private final StressGraphingCardModel previousStressGraphState;

    @SerializedName("progress_stepper")
    private final StepperComponentModel progressStepper;

    @SerializedName("sessions")
    private final ArticleTileCarouselModel sessionsCarouselModel;

    @SerializedName("show_connectivity_window")
    private final boolean showConnectivityWindow;

    @SerializedName("show_education")
    private final boolean showOnboardingEducation;

    @SerializedName("stress_graph")
    private final StressGraphingCardModel stressGraph;

    @SerializedName("stress_state")
    private final StressState stressState;

    @SerializedName("title")
    private final String title;

    @SerializedName("trend")
    private final StressTrend trend;

    @SerializedName("trend_list")
    private final List<StressTrend> trendList;

    @SerializedName("vow")
    private final StressMonitorVow vow;

    @SerializedName("whoop_coach_vow")
    private final WhoopCoachVowModel whoopCoachVow;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressMonitorDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressMonitorDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressMonitorDto;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressMonitorDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C18518b(13)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C18518b(14)), null, null};
    }

    public /* synthetic */ StressMonitorDto(int i13, String str, LoadingData loadingData, StressState stressState, boolean z4, StressMonitorMeterDto stressMonitorMeterDto, StressMonitorVow stressMonitorVow, WhoopCoachVowModel whoopCoachVowModel, StressGraphingCardModel stressGraphingCardModel, String str2, String str3, ArticleTileCarouselModel articleTileCarouselModel, ArticleTileCarouselModel articleTileCarouselModel2, ArticleTileCarouselModel articleTileCarouselModel3, boolean z13, String str4, PendingActivityDialogue pendingActivityDialogue, OnboardingDismissDialog onboardingDismissDialog, StressGraphingCardModel stressGraphingCardModel2, StressTrend stressTrend, StressDateSelector stressDateSelector, StressGraphingCardModel stressGraphingCardModel3, List list, StepperComponentModel stepperComponentModel, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (16777215 != (i13 & 16777215)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 16777215, StressMonitorDto$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.loadingData = loadingData;
        this.stressState = stressState;
        this.showConnectivityWindow = z4;
        this.meter = stressMonitorMeterDto;
        this.vow = stressMonitorVow;
        this.whoopCoachVow = whoopCoachVowModel;
        this.stressGraph = stressGraphingCardModel;
        this.feedbackUrl = str2;
        this.lastUpdated = str3;
        this.onboardingCarouselModel = articleTileCarouselModel;
        this.sessionsCarouselModel = articleTileCarouselModel2;
        this.educationCarouselModel = articleTileCarouselModel3;
        this.showOnboardingEducation = z13;
        this.calibrationText = str4;
        this.pendingActivityDialogue = pendingActivityDialogue;
        this.onboardingDismissDialogue = onboardingDismissDialog;
        this.previousStressGraphState = stressGraphingCardModel2;
        this.trend = stressTrend;
        this.dateSelector = stressDateSelector;
        this.extended24HourGraphState = stressGraphingCardModel3;
        this.trendList = list;
        this.progressStepper = stepperComponentModel;
        this.metadata = metaData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.stress.StressState", StressState.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StressTrend$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StressMonitorDto copy$default(StressMonitorDto stressMonitorDto, String str, LoadingData loadingData, StressState stressState, boolean z4, StressMonitorMeterDto stressMonitorMeterDto, StressMonitorVow stressMonitorVow, WhoopCoachVowModel whoopCoachVowModel, StressGraphingCardModel stressGraphingCardModel, String str2, String str3, ArticleTileCarouselModel articleTileCarouselModel, ArticleTileCarouselModel articleTileCarouselModel2, ArticleTileCarouselModel articleTileCarouselModel3, boolean z13, String str4, PendingActivityDialogue pendingActivityDialogue, OnboardingDismissDialog onboardingDismissDialog, StressGraphingCardModel stressGraphingCardModel2, StressTrend stressTrend, StressDateSelector stressDateSelector, StressGraphingCardModel stressGraphingCardModel3, List list, StepperComponentModel stepperComponentModel, MetaData metaData, int i13, Object obj) {
        MetaData metaData2;
        StepperComponentModel stepperComponentModel2;
        String str5 = (i13 & 1) != 0 ? stressMonitorDto.title : str;
        LoadingData loadingData2 = (i13 & 2) != 0 ? stressMonitorDto.loadingData : loadingData;
        StressState stressState2 = (i13 & 4) != 0 ? stressMonitorDto.stressState : stressState;
        boolean z14 = (i13 & 8) != 0 ? stressMonitorDto.showConnectivityWindow : z4;
        StressMonitorMeterDto stressMonitorMeterDto2 = (i13 & 16) != 0 ? stressMonitorDto.meter : stressMonitorMeterDto;
        StressMonitorVow stressMonitorVow2 = (i13 & 32) != 0 ? stressMonitorDto.vow : stressMonitorVow;
        WhoopCoachVowModel whoopCoachVowModel2 = (i13 & 64) != 0 ? stressMonitorDto.whoopCoachVow : whoopCoachVowModel;
        StressGraphingCardModel stressGraphingCardModel4 = (i13 & 128) != 0 ? stressMonitorDto.stressGraph : stressGraphingCardModel;
        String str6 = (i13 & 256) != 0 ? stressMonitorDto.feedbackUrl : str2;
        String str7 = (i13 & 512) != 0 ? stressMonitorDto.lastUpdated : str3;
        ArticleTileCarouselModel articleTileCarouselModel4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? stressMonitorDto.onboardingCarouselModel : articleTileCarouselModel;
        ArticleTileCarouselModel articleTileCarouselModel5 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? stressMonitorDto.sessionsCarouselModel : articleTileCarouselModel2;
        ArticleTileCarouselModel articleTileCarouselModel6 = (i13 & 4096) != 0 ? stressMonitorDto.educationCarouselModel : articleTileCarouselModel3;
        boolean z15 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? stressMonitorDto.showOnboardingEducation : z13;
        String str8 = str5;
        String str9 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? stressMonitorDto.calibrationText : str4;
        PendingActivityDialogue pendingActivityDialogue2 = (i13 & 32768) != 0 ? stressMonitorDto.pendingActivityDialogue : pendingActivityDialogue;
        OnboardingDismissDialog onboardingDismissDialog2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? stressMonitorDto.onboardingDismissDialogue : onboardingDismissDialog;
        StressGraphingCardModel stressGraphingCardModel5 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? stressMonitorDto.previousStressGraphState : stressGraphingCardModel2;
        StressTrend stressTrend2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? stressMonitorDto.trend : stressTrend;
        StressDateSelector stressDateSelector2 = (i13 & 524288) != 0 ? stressMonitorDto.dateSelector : stressDateSelector;
        StressGraphingCardModel stressGraphingCardModel6 = (i13 & 1048576) != 0 ? stressMonitorDto.extended24HourGraphState : stressGraphingCardModel3;
        List list2 = (i13 & 2097152) != 0 ? stressMonitorDto.trendList : list;
        StepperComponentModel stepperComponentModel3 = (i13 & 4194304) != 0 ? stressMonitorDto.progressStepper : stepperComponentModel;
        if ((i13 & 8388608) != 0) {
            stepperComponentModel2 = stepperComponentModel3;
            metaData2 = stressMonitorDto.metadata;
        } else {
            metaData2 = metaData;
            stepperComponentModel2 = stepperComponentModel3;
        }
        return stressMonitorDto.copy(str8, loadingData2, stressState2, z14, stressMonitorMeterDto2, stressMonitorVow2, whoopCoachVowModel2, stressGraphingCardModel4, str6, str7, articleTileCarouselModel4, articleTileCarouselModel5, articleTileCarouselModel6, z15, str9, pendingActivityDialogue2, onboardingDismissDialog2, stressGraphingCardModel5, stressTrend2, stressDateSelector2, stressGraphingCardModel6, list2, stepperComponentModel2, metaData2);
    }

    @InterfaceC37143h("calibration_text_display")
    public static /* synthetic */ void getCalibrationText$annotations() {
    }

    @InterfaceC37143h("date_selector")
    public static /* synthetic */ void getDateSelector$annotations() {
    }

    @InterfaceC37143h("education_carousel")
    public static /* synthetic */ void getEducationCarouselModel$annotations() {
    }

    @InterfaceC37143h("extended24_hour_graph")
    public static /* synthetic */ void getExtended24HourGraphState$annotations() {
    }

    @InterfaceC37143h("typeform_url")
    public static /* synthetic */ void getFeedbackUrl$annotations() {
    }

    @InterfaceC37143h("last_updated_display")
    public static /* synthetic */ void getLastUpdated$annotations() {
    }

    @InterfaceC37143h("loading_data")
    public static /* synthetic */ void getLoadingData$annotations() {
    }

    @InterfaceC37143h("gauge")
    public static /* synthetic */ void getMeter$annotations() {
    }

    @InterfaceC37143h("onboarding_carousel")
    public static /* synthetic */ void getOnboardingCarouselModel$annotations() {
    }

    @InterfaceC37143h("onboarding_dismiss_dialogue")
    public static /* synthetic */ void getOnboardingDismissDialogue$annotations() {
    }

    @InterfaceC37143h("pending_activity_dialogue")
    public static /* synthetic */ void getPendingActivityDialogue$annotations() {
    }

    @InterfaceC37143h("previous_stress_graph")
    public static /* synthetic */ void getPreviousStressGraphState$annotations() {
    }

    @InterfaceC37143h("progress_stepper")
    public static /* synthetic */ void getProgressStepper$annotations() {
    }

    @InterfaceC37143h("sessions")
    public static /* synthetic */ void getSessionsCarouselModel$annotations() {
    }

    @InterfaceC37143h("show_connectivity_window")
    public static /* synthetic */ void getShowConnectivityWindow$annotations() {
    }

    @InterfaceC37143h("show_education")
    public static /* synthetic */ void getShowOnboardingEducation$annotations() {
    }

    @InterfaceC37143h("stress_graph")
    public static /* synthetic */ void getStressGraph$annotations() {
    }

    @InterfaceC37143h("stress_state")
    public static /* synthetic */ void getStressState$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("trend")
    public static /* synthetic */ void getTrend$annotations() {
    }

    @InterfaceC37143h("trend_list")
    public static /* synthetic */ void getTrendList$annotations() {
    }

    @InterfaceC37143h("vow")
    public static /* synthetic */ void getVow$annotations() {
    }

    @InterfaceC37143h("whoop_coach_vow")
    public static /* synthetic */ void getWhoopCoachVow$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressMonitorDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, LoadingData$$serializer.INSTANCE, self.loadingData);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.stressState);
        output.encodeBooleanElement(serialDesc, 3, self.showConnectivityWindow);
        output.encodeSerializableElement(serialDesc, 4, StressMonitorMeterDto$$serializer.INSTANCE, self.meter);
        output.encodeNullableSerializableElement(serialDesc, 5, StressMonitorVow$$serializer.INSTANCE, self.vow);
        output.encodeNullableSerializableElement(serialDesc, 6, WhoopCoachVowModel$$serializer.INSTANCE, self.whoopCoachVow);
        StressGraphingCardModel$$serializer stressGraphingCardModel$$serializer = StressGraphingCardModel$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 7, stressGraphingCardModel$$serializer, self.stressGraph);
        output.encodeStringElement(serialDesc, 8, self.feedbackUrl);
        output.encodeStringElement(serialDesc, 9, self.lastUpdated);
        ArticleTileCarouselModel$$serializer articleTileCarouselModel$$serializer = ArticleTileCarouselModel$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 10, articleTileCarouselModel$$serializer, self.onboardingCarouselModel);
        output.encodeNullableSerializableElement(serialDesc, 11, articleTileCarouselModel$$serializer, self.sessionsCarouselModel);
        output.encodeNullableSerializableElement(serialDesc, 12, articleTileCarouselModel$$serializer, self.educationCarouselModel);
        output.encodeBooleanElement(serialDesc, 13, self.showOnboardingEducation);
        output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.calibrationText);
        output.encodeNullableSerializableElement(serialDesc, 15, PendingActivityDialogue$$serializer.INSTANCE, self.pendingActivityDialogue);
        output.encodeNullableSerializableElement(serialDesc, 16, OnboardingDismissDialog$$serializer.INSTANCE, self.onboardingDismissDialogue);
        output.encodeNullableSerializableElement(serialDesc, 17, stressGraphingCardModel$$serializer, self.previousStressGraphState);
        output.encodeNullableSerializableElement(serialDesc, 18, StressTrend$$serializer.INSTANCE, self.trend);
        output.encodeNullableSerializableElement(serialDesc, 19, StressDateSelector$$serializer.INSTANCE, self.dateSelector);
        output.encodeNullableSerializableElement(serialDesc, 20, stressGraphingCardModel$$serializer, self.extended24HourGraphState);
        output.encodeNullableSerializableElement(serialDesc, 21, (InterfaceC37145j) interfaceC23462hArr[21].getValue(), self.trendList);
        output.encodeNullableSerializableElement(serialDesc, 22, StepperComponentModel$$serializer.INSTANCE, self.progressStepper);
        output.encodeNullableSerializableElement(serialDesc, 23, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ArticleTileCarouselModel getOnboardingCarouselModel() {
        return this.onboardingCarouselModel;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ArticleTileCarouselModel getSessionsCarouselModel() {
        return this.sessionsCarouselModel;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ArticleTileCarouselModel getEducationCarouselModel() {
        return this.educationCarouselModel;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getShowOnboardingEducation() {
        return this.showOnboardingEducation;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCalibrationText() {
        return this.calibrationText;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final PendingActivityDialogue getPendingActivityDialogue() {
        return this.pendingActivityDialogue;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final OnboardingDismissDialog getOnboardingDismissDialogue() {
        return this.onboardingDismissDialogue;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final StressGraphingCardModel getPreviousStressGraphState() {
        return this.previousStressGraphState;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final StressTrend getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LoadingData getLoadingData() {
        return this.loadingData;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final StressDateSelector getDateSelector() {
        return this.dateSelector;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final StressGraphingCardModel getExtended24HourGraphState() {
        return this.extended24HourGraphState;
    }

    public final List<StressTrend> component22() {
        return this.trendList;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final StepperComponentModel getProgressStepper() {
        return this.progressStepper;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StressState getStressState() {
        return this.stressState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowConnectivityWindow() {
        return this.showConnectivityWindow;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final StressMonitorMeterDto getMeter() {
        return this.meter;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StressMonitorVow getVow() {
        return this.vow;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final StressGraphingCardModel getStressGraph() {
        return this.stressGraph;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFeedbackUrl() {
        return this.feedbackUrl;
    }

    public final StressMonitorDto copy(String title, LoadingData loadingData, StressState stressState, boolean showConnectivityWindow, StressMonitorMeterDto meter, StressMonitorVow vow, WhoopCoachVowModel whoopCoachVow, StressGraphingCardModel stressGraph, String feedbackUrl, String lastUpdated, ArticleTileCarouselModel onboardingCarouselModel, ArticleTileCarouselModel sessionsCarouselModel, ArticleTileCarouselModel educationCarouselModel, boolean showOnboardingEducation, String calibrationText, PendingActivityDialogue pendingActivityDialogue, OnboardingDismissDialog onboardingDismissDialogue, StressGraphingCardModel previousStressGraphState, StressTrend trend, StressDateSelector dateSelector, StressGraphingCardModel extended24HourGraphState, List<StressTrend> trendList, StepperComponentModel progressStepper, MetaData metadata) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(stressState, "stressState");
        AbstractC22676k.m65750j(meter, "meter");
        AbstractC22676k.m65750j(feedbackUrl, "feedbackUrl");
        AbstractC22676k.m65750j(lastUpdated, "lastUpdated");
        return new StressMonitorDto(title, loadingData, stressState, showConnectivityWindow, meter, vow, whoopCoachVow, stressGraph, feedbackUrl, lastUpdated, onboardingCarouselModel, sessionsCarouselModel, educationCarouselModel, showOnboardingEducation, calibrationText, pendingActivityDialogue, onboardingDismissDialogue, previousStressGraphState, trend, dateSelector, extended24HourGraphState, trendList, progressStepper, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressMonitorDto)) {
            return false;
        }
        StressMonitorDto stressMonitorDto = (StressMonitorDto) other;
        return AbstractC22676k.m65745e(this.title, stressMonitorDto.title) && AbstractC22676k.m65745e(this.loadingData, stressMonitorDto.loadingData) && this.stressState == stressMonitorDto.stressState && this.showConnectivityWindow == stressMonitorDto.showConnectivityWindow && AbstractC22676k.m65745e(this.meter, stressMonitorDto.meter) && AbstractC22676k.m65745e(this.vow, stressMonitorDto.vow) && AbstractC22676k.m65745e(this.whoopCoachVow, stressMonitorDto.whoopCoachVow) && AbstractC22676k.m65745e(this.stressGraph, stressMonitorDto.stressGraph) && AbstractC22676k.m65745e(this.feedbackUrl, stressMonitorDto.feedbackUrl) && AbstractC22676k.m65745e(this.lastUpdated, stressMonitorDto.lastUpdated) && AbstractC22676k.m65745e(this.onboardingCarouselModel, stressMonitorDto.onboardingCarouselModel) && AbstractC22676k.m65745e(this.sessionsCarouselModel, stressMonitorDto.sessionsCarouselModel) && AbstractC22676k.m65745e(this.educationCarouselModel, stressMonitorDto.educationCarouselModel) && this.showOnboardingEducation == stressMonitorDto.showOnboardingEducation && AbstractC22676k.m65745e(this.calibrationText, stressMonitorDto.calibrationText) && AbstractC22676k.m65745e(this.pendingActivityDialogue, stressMonitorDto.pendingActivityDialogue) && AbstractC22676k.m65745e(this.onboardingDismissDialogue, stressMonitorDto.onboardingDismissDialogue) && AbstractC22676k.m65745e(this.previousStressGraphState, stressMonitorDto.previousStressGraphState) && AbstractC22676k.m65745e(this.trend, stressMonitorDto.trend) && AbstractC22676k.m65745e(this.dateSelector, stressMonitorDto.dateSelector) && AbstractC22676k.m65745e(this.extended24HourGraphState, stressMonitorDto.extended24HourGraphState) && AbstractC22676k.m65745e(this.trendList, stressMonitorDto.trendList) && AbstractC22676k.m65745e(this.progressStepper, stressMonitorDto.progressStepper) && AbstractC22676k.m65745e(this.metadata, stressMonitorDto.metadata);
    }

    public final String getCalibrationText() {
        return this.calibrationText;
    }

    public final StressDateSelector getDateSelector() {
        return this.dateSelector;
    }

    public final ArticleTileCarouselModel getEducationCarouselModel() {
        return this.educationCarouselModel;
    }

    public final StressGraphingCardModel getExtended24HourGraphState() {
        return this.extended24HourGraphState;
    }

    public final String getFeedbackUrl() {
        return this.feedbackUrl;
    }

    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    public final LoadingData getLoadingData() {
        return this.loadingData;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final StressMonitorMeterDto getMeter() {
        return this.meter;
    }

    public final ArticleTileCarouselModel getOnboardingCarouselModel() {
        return this.onboardingCarouselModel;
    }

    public final OnboardingDismissDialog getOnboardingDismissDialogue() {
        return this.onboardingDismissDialogue;
    }

    public final PendingActivityDialogue getPendingActivityDialogue() {
        return this.pendingActivityDialogue;
    }

    public final StressGraphingCardModel getPreviousStressGraphState() {
        return this.previousStressGraphState;
    }

    public final StepperComponentModel getProgressStepper() {
        return this.progressStepper;
    }

    public final ArticleTileCarouselModel getSessionsCarouselModel() {
        return this.sessionsCarouselModel;
    }

    public final boolean getShowConnectivityWindow() {
        return this.showConnectivityWindow;
    }

    public final boolean getShowOnboardingEducation() {
        return this.showOnboardingEducation;
    }

    public final StressGraphingCardModel getStressGraph() {
        return this.stressGraph;
    }

    public final StressState getStressState() {
        return this.stressState;
    }

    public final String getTitle() {
        return this.title;
    }

    public final StressTrend getTrend() {
        return this.trend;
    }

    public final List<StressTrend> getTrendList() {
        return this.trendList;
    }

    public final StressMonitorVow getVow() {
        return this.vow;
    }

    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        LoadingData loadingData = this.loadingData;
        int iHashCode2 = (this.meter.hashCode() + AbstractC2875y.m8289b((this.stressState.hashCode() + ((iHashCode + (loadingData == null ? 0 : loadingData.hashCode())) * 31)) * 31, 31, this.showConnectivityWindow)) * 31;
        StressMonitorVow stressMonitorVow = this.vow;
        int iHashCode3 = (iHashCode2 + (stressMonitorVow == null ? 0 : stressMonitorVow.hashCode())) * 31;
        WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVow;
        int iHashCode4 = (iHashCode3 + (whoopCoachVowModel == null ? 0 : whoopCoachVowModel.hashCode())) * 31;
        StressGraphingCardModel stressGraphingCardModel = this.stressGraph;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode4 + (stressGraphingCardModel == null ? 0 : stressGraphingCardModel.hashCode())) * 31, 31, this.feedbackUrl), 31, this.lastUpdated);
        ArticleTileCarouselModel articleTileCarouselModel = this.onboardingCarouselModel;
        int iHashCode5 = (iM30450d + (articleTileCarouselModel == null ? 0 : articleTileCarouselModel.hashCode())) * 31;
        ArticleTileCarouselModel articleTileCarouselModel2 = this.sessionsCarouselModel;
        int iHashCode6 = (iHashCode5 + (articleTileCarouselModel2 == null ? 0 : articleTileCarouselModel2.hashCode())) * 31;
        ArticleTileCarouselModel articleTileCarouselModel3 = this.educationCarouselModel;
        int iM8289b = AbstractC2875y.m8289b((iHashCode6 + (articleTileCarouselModel3 == null ? 0 : articleTileCarouselModel3.hashCode())) * 31, 31, this.showOnboardingEducation);
        String str = this.calibrationText;
        int iHashCode7 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        PendingActivityDialogue pendingActivityDialogue = this.pendingActivityDialogue;
        int iHashCode8 = (iHashCode7 + (pendingActivityDialogue == null ? 0 : pendingActivityDialogue.hashCode())) * 31;
        OnboardingDismissDialog onboardingDismissDialog = this.onboardingDismissDialogue;
        int iHashCode9 = (iHashCode8 + (onboardingDismissDialog == null ? 0 : onboardingDismissDialog.hashCode())) * 31;
        StressGraphingCardModel stressGraphingCardModel2 = this.previousStressGraphState;
        int iHashCode10 = (iHashCode9 + (stressGraphingCardModel2 == null ? 0 : stressGraphingCardModel2.hashCode())) * 31;
        StressTrend stressTrend = this.trend;
        int iHashCode11 = (iHashCode10 + (stressTrend == null ? 0 : stressTrend.hashCode())) * 31;
        StressDateSelector stressDateSelector = this.dateSelector;
        int iHashCode12 = (iHashCode11 + (stressDateSelector == null ? 0 : stressDateSelector.hashCode())) * 31;
        StressGraphingCardModel stressGraphingCardModel3 = this.extended24HourGraphState;
        int iHashCode13 = (iHashCode12 + (stressGraphingCardModel3 == null ? 0 : stressGraphingCardModel3.hashCode())) * 31;
        List<StressTrend> list = this.trendList;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        StepperComponentModel stepperComponentModel = this.progressStepper;
        int iHashCode15 = (iHashCode14 + (stepperComponentModel == null ? 0 : stepperComponentModel.hashCode())) * 31;
        MetaData metaData = this.metadata;
        return iHashCode15 + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        LoadingData loadingData = this.loadingData;
        StressState stressState = this.stressState;
        boolean z4 = this.showConnectivityWindow;
        StressMonitorMeterDto stressMonitorMeterDto = this.meter;
        StressMonitorVow stressMonitorVow = this.vow;
        WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVow;
        StressGraphingCardModel stressGraphingCardModel = this.stressGraph;
        String str2 = this.feedbackUrl;
        String str3 = this.lastUpdated;
        ArticleTileCarouselModel articleTileCarouselModel = this.onboardingCarouselModel;
        ArticleTileCarouselModel articleTileCarouselModel2 = this.sessionsCarouselModel;
        ArticleTileCarouselModel articleTileCarouselModel3 = this.educationCarouselModel;
        boolean z13 = this.showOnboardingEducation;
        String str4 = this.calibrationText;
        PendingActivityDialogue pendingActivityDialogue = this.pendingActivityDialogue;
        OnboardingDismissDialog onboardingDismissDialog = this.onboardingDismissDialogue;
        StressGraphingCardModel stressGraphingCardModel2 = this.previousStressGraphState;
        StressTrend stressTrend = this.trend;
        StressDateSelector stressDateSelector = this.dateSelector;
        StressGraphingCardModel stressGraphingCardModel3 = this.extended24HourGraphState;
        List<StressTrend> list = this.trendList;
        StepperComponentModel stepperComponentModel = this.progressStepper;
        MetaData metaData = this.metadata;
        StringBuilder sb4 = new StringBuilder("StressMonitorDto(title=");
        sb4.append(str);
        sb4.append(", loadingData=");
        sb4.append(loadingData);
        sb4.append(", stressState=");
        sb4.append(stressState);
        sb4.append(", showConnectivityWindow=");
        sb4.append(z4);
        sb4.append(", meter=");
        sb4.append(stressMonitorMeterDto);
        sb4.append(", vow=");
        sb4.append(stressMonitorVow);
        sb4.append(", whoopCoachVow=");
        sb4.append(whoopCoachVowModel);
        sb4.append(", stressGraph=");
        sb4.append(stressGraphingCardModel);
        sb4.append(", feedbackUrl=");
        AbstractC11266d.m30444B(sb4, str2, ", lastUpdated=", str3, ", onboardingCarouselModel=");
        sb4.append(articleTileCarouselModel);
        sb4.append(", sessionsCarouselModel=");
        sb4.append(articleTileCarouselModel2);
        sb4.append(", educationCarouselModel=");
        sb4.append(articleTileCarouselModel3);
        sb4.append(", showOnboardingEducation=");
        sb4.append(z13);
        sb4.append(", calibrationText=");
        sb4.append(str4);
        sb4.append(", pendingActivityDialogue=");
        sb4.append(pendingActivityDialogue);
        sb4.append(", onboardingDismissDialogue=");
        sb4.append(onboardingDismissDialog);
        sb4.append(", previousStressGraphState=");
        sb4.append(stressGraphingCardModel2);
        sb4.append(", trend=");
        sb4.append(stressTrend);
        sb4.append(", dateSelector=");
        sb4.append(stressDateSelector);
        sb4.append(", extended24HourGraphState=");
        sb4.append(stressGraphingCardModel3);
        sb4.append(", trendList=");
        sb4.append(list);
        sb4.append(", progressStepper=");
        sb4.append(stepperComponentModel);
        sb4.append(", metadata=");
        sb4.append(metaData);
        sb4.append(")");
        return sb4.toString();
    }

    public StressMonitorDto(String title, LoadingData loadingData, StressState stressState, boolean z4, StressMonitorMeterDto meter, StressMonitorVow stressMonitorVow, WhoopCoachVowModel whoopCoachVowModel, StressGraphingCardModel stressGraphingCardModel, String feedbackUrl, String lastUpdated, ArticleTileCarouselModel articleTileCarouselModel, ArticleTileCarouselModel articleTileCarouselModel2, ArticleTileCarouselModel articleTileCarouselModel3, boolean z13, String str, PendingActivityDialogue pendingActivityDialogue, OnboardingDismissDialog onboardingDismissDialog, StressGraphingCardModel stressGraphingCardModel2, StressTrend stressTrend, StressDateSelector stressDateSelector, StressGraphingCardModel stressGraphingCardModel3, List<StressTrend> list, StepperComponentModel stepperComponentModel, MetaData metaData) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(stressState, "stressState");
        AbstractC22676k.m65750j(meter, "meter");
        AbstractC22676k.m65750j(feedbackUrl, "feedbackUrl");
        AbstractC22676k.m65750j(lastUpdated, "lastUpdated");
        this.title = title;
        this.loadingData = loadingData;
        this.stressState = stressState;
        this.showConnectivityWindow = z4;
        this.meter = meter;
        this.vow = stressMonitorVow;
        this.whoopCoachVow = whoopCoachVowModel;
        this.stressGraph = stressGraphingCardModel;
        this.feedbackUrl = feedbackUrl;
        this.lastUpdated = lastUpdated;
        this.onboardingCarouselModel = articleTileCarouselModel;
        this.sessionsCarouselModel = articleTileCarouselModel2;
        this.educationCarouselModel = articleTileCarouselModel3;
        this.showOnboardingEducation = z13;
        this.calibrationText = str;
        this.pendingActivityDialogue = pendingActivityDialogue;
        this.onboardingDismissDialogue = onboardingDismissDialog;
        this.previousStressGraphState = stressGraphingCardModel2;
        this.trend = stressTrend;
        this.dateSelector = stressDateSelector;
        this.extended24HourGraphState = stressGraphingCardModel3;
        this.trendList = list;
        this.progressStepper = stepperComponentModel;
        this.metadata = metaData;
    }
}

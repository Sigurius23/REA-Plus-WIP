package com.whoop.design.models.items.recommendationtile;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
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
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import z91.C40204a;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0002XWB \u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012+\b\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0099\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ#\u0010!\u001a\u00020\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u0010H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b/\u00100J\u001e\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b1\u00102J3\u00103\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016HÆ\u0003¢\u0006\u0004\b3\u00102J±\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102+\b\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b6\u0010$J\u0010\u00107\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bJ\u0010(R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bL\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bM\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010N\u001a\u0004\b\f\u0010-R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\b\r\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u00100R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u00102\"\u0004\bS\u0010TRE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010Q\u001a\u0004\bU\u00102\"\u0004\bV\u0010T¨\u0006Y"}, m65681d2 = {"Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "recommendationId", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;", NotificationCompat.CATEGORY_STATUS, "header", "", "body", "cta", "", "isExpanded", "isSelected", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;", "style", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;", "component3", "()Lcom/whoop/design/models/DesignSystemModel;", "component4", "()Ljava/util/List;", "component5", "component6", "()Z", "component7", "component8", "()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;", "component9", "()Ljava/util/Map;", "component10", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getRecommendationId", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;", "getStatus", "Lcom/whoop/design/models/DesignSystemModel;", "getHeader", "Ljava/util/List;", "getBody", "getCta", "Z", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;", "getStyle", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecommendationTileModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final List<DesignSystemModel> body;
    private final DesignSystemModel cta;
    private final DesignSystemModel header;
    private final boolean isExpanded;
    private final boolean isSelected;
    private final String recommendationId;
    private final RecommendationTileStatus status;
    private final RecommendationTileLayoutStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecommendationTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C40204a(11)), AbstractC30060g.m92087G(enumC23463i, new C40204a(12)), AbstractC30060g.m92087G(enumC23463i, new C40204a(13)), AbstractC30060g.m92087G(enumC23463i, new C40204a(14)), null, null, AbstractC30060g.m92087G(enumC23463i, new C40204a(15)), AbstractC30060g.m92087G(enumC23463i, new C40204a(16)), null};
    }

    public /* synthetic */ RecommendationTileModel(int i13, String str, RecommendationTileStatus recommendationTileStatus, DesignSystemModel designSystemModel, List list, DesignSystemModel designSystemModel2, boolean z4, boolean z13, RecommendationTileLayoutStyle recommendationTileLayoutStyle, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (23 != (i13 & 23)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 23, RecommendationTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.recommendationId = str;
        this.status = recommendationTileStatus;
        this.header = designSystemModel;
        if ((i13 & 8) == 0) {
            this.body = C25271y.f99162w;
        } else {
            this.body = list;
        }
        this.cta = designSystemModel2;
        if ((i13 & 32) == 0) {
            this.isExpanded = true;
        } else {
            this.isExpanded = z4;
        }
        if ((i13 & 64) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z13;
        }
        if ((i13 & 128) == 0) {
            this.style = null;
        } else {
            this.style = recommendationTileLayoutStyle;
        }
        if ((i13 & 256) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 512) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return RecommendationTileStatus.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return RecommendationTileLayoutStyle.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationTileModel copy$default(RecommendationTileModel recommendationTileModel, String str, RecommendationTileStatus recommendationTileStatus, DesignSystemModel designSystemModel, List list, DesignSystemModel designSystemModel2, boolean z4, boolean z13, RecommendationTileLayoutStyle recommendationTileLayoutStyle, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = recommendationTileModel.recommendationId;
        }
        if ((i13 & 2) != 0) {
            recommendationTileStatus = recommendationTileModel.status;
        }
        if ((i13 & 4) != 0) {
            designSystemModel = recommendationTileModel.header;
        }
        if ((i13 & 8) != 0) {
            list = recommendationTileModel.body;
        }
        if ((i13 & 16) != 0) {
            designSystemModel2 = recommendationTileModel.cta;
        }
        if ((i13 & 32) != 0) {
            z4 = recommendationTileModel.isExpanded;
        }
        if ((i13 & 64) != 0) {
            z13 = recommendationTileModel.isSelected;
        }
        if ((i13 & 128) != 0) {
            recommendationTileLayoutStyle = recommendationTileModel.style;
        }
        if ((i13 & 256) != 0) {
            map = recommendationTileModel.bindings;
        }
        if ((i13 & 512) != 0) {
            map2 = recommendationTileModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        boolean z14 = z13;
        RecommendationTileLayoutStyle recommendationTileLayoutStyle2 = recommendationTileLayoutStyle;
        DesignSystemModel designSystemModel3 = designSystemModel2;
        boolean z15 = z4;
        return recommendationTileModel.copy(str, recommendationTileStatus, designSystemModel, list, designSystemModel3, z15, z14, recommendationTileLayoutStyle2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(RecommendationTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.recommendationId);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.status);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.header);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.body, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.body);
        }
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.cta);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !self.isExpanded) {
            output.encodeBooleanElement(serialDesc, 5, self.isExpanded);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.isSelected) {
            output.encodeBooleanElement(serialDesc, 6, self.isSelected);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return RecommendationTileModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRecommendationId() {
        return this.recommendationId;
    }

    public final Map<String, AggregateBinding> component10() {
        return this.aggregateBindings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecommendationTileStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DesignSystemModel getHeader() {
        return this.header;
    }

    public final List<DesignSystemModel> component4() {
        return this.body;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DesignSystemModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final RecommendationTileLayoutStyle getStyle() {
        return this.style;
    }

    public final Map<String, String> component9() {
        return this.bindings;
    }

    public final RecommendationTileModel copy(String recommendationId, RecommendationTileStatus status, DesignSystemModel header, List<? extends DesignSystemModel> body, DesignSystemModel cta, boolean isExpanded, boolean isSelected, RecommendationTileLayoutStyle style, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(body, "body");
        return new RecommendationTileModel(recommendationId, status, header, body, cta, isExpanded, isSelected, style, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationTileModel)) {
            return false;
        }
        RecommendationTileModel recommendationTileModel = (RecommendationTileModel) other;
        return AbstractC22676k.m65745e(this.recommendationId, recommendationTileModel.recommendationId) && this.status == recommendationTileModel.status && AbstractC22676k.m65745e(this.header, recommendationTileModel.header) && AbstractC22676k.m65745e(this.body, recommendationTileModel.body) && AbstractC22676k.m65745e(this.cta, recommendationTileModel.cta) && this.isExpanded == recommendationTileModel.isExpanded && this.isSelected == recommendationTileModel.isSelected && this.style == recommendationTileModel.style && AbstractC22676k.m65745e(this.bindings, recommendationTileModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, recommendationTileModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final List<DesignSystemModel> getBody() {
        return this.body;
    }

    public final DesignSystemModel getCta() {
        return this.cta;
    }

    public final DesignSystemModel getHeader() {
        return this.header;
    }

    public final String getRecommendationId() {
        return this.recommendationId;
    }

    public final RecommendationTileStatus getStatus() {
        return this.status;
    }

    public final RecommendationTileLayoutStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + (this.recommendationId.hashCode() * 31)) * 31;
        DesignSystemModel designSystemModel = this.header;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31, 31, this.body);
        DesignSystemModel designSystemModel2 = this.cta;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM31983b + (designSystemModel2 == null ? 0 : designSystemModel2.hashCode())) * 31, 31, this.isExpanded), 31, this.isSelected);
        RecommendationTileLayoutStyle recommendationTileLayoutStyle = this.style;
        int iHashCode2 = (iM8289b + (recommendationTileLayoutStyle == null ? 0 : recommendationTileLayoutStyle.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        String str = this.recommendationId;
        RecommendationTileStatus recommendationTileStatus = this.status;
        DesignSystemModel designSystemModel = this.header;
        List<DesignSystemModel> list = this.body;
        DesignSystemModel designSystemModel2 = this.cta;
        boolean z4 = this.isExpanded;
        boolean z13 = this.isSelected;
        RecommendationTileLayoutStyle recommendationTileLayoutStyle = this.style;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("RecommendationTileModel(recommendationId=");
        sb4.append(str);
        sb4.append(", status=");
        sb4.append(recommendationTileStatus);
        sb4.append(", header=");
        sb4.append(designSystemModel);
        sb4.append(", body=");
        sb4.append(list);
        sb4.append(", cta=");
        sb4.append(designSystemModel2);
        sb4.append(", isExpanded=");
        sb4.append(z4);
        sb4.append(", isSelected=");
        sb4.append(z13);
        sb4.append(", style=");
        sb4.append(recommendationTileLayoutStyle);
        sb4.append(", bindings=");
        return AbstractC30802r.m94765n(sb4, map, ", aggregateBindings=", map2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationTileModel(String recommendationId, RecommendationTileStatus status, DesignSystemModel designSystemModel, List<? extends DesignSystemModel> body, DesignSystemModel designSystemModel2, boolean z4, boolean z13, RecommendationTileLayoutStyle recommendationTileLayoutStyle, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(body, "body");
        this.recommendationId = recommendationId;
        this.status = status;
        this.header = designSystemModel;
        this.body = body;
        this.cta = designSystemModel2;
        this.isExpanded = z4;
        this.isSelected = z13;
        this.style = recommendationTileLayoutStyle;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ RecommendationTileModel(String str, RecommendationTileStatus recommendationTileStatus, DesignSystemModel designSystemModel, List list, DesignSystemModel designSystemModel2, boolean z4, boolean z13, RecommendationTileLayoutStyle recommendationTileLayoutStyle, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, recommendationTileStatus, designSystemModel, (i13 & 8) != 0 ? C25271y.f99162w : list, designSystemModel2, (i13 & 32) != 0 ? true : z4, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? null : recommendationTileLayoutStyle, (i13 & 256) != 0 ? null : map, (i13 & 512) != 0 ? null : map2);
    }
}

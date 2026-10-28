package com.whoop.design.models.items.recommendationtile;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import z91.C40204a;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0002UTB\u0090\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012+\b\u0002\u0010\u0016\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0004\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u008b\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ#\u0010 \u001a\u00020\u00022\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b-\u0010.J\u001e\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b/\u00100J3\u00101\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0004\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015HÆ\u0003¢\u0006\u0004\b1\u00100J¡\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2+\b\u0002\u0010\u0016\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0004\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b4\u0010#J\u0010\u00105\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b8\u00109J'\u0010B\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b@\u0010AR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010C\u001a\u0004\bD\u0010#R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bE\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010H\u001a\u0004\bI\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\b\u000b\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\b\f\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bM\u0010.R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u00100\"\u0004\bP\u0010QRE\u0010\u0016\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0004\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010N\u001a\u0004\bR\u00100\"\u0004\bS\u0010Q¨\u0006V"}, m65681d2 = {"Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "icon", "title", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;", NotificationCompat.CATEGORY_STATUS, "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;", "style", "", "isLoading", "isEnabled", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;ZLjava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;ZLjava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;", "component4", "()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;", "component5", "()Z", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/whoop/navigation/models/GenericInteraction;", "component8", "()Ljava/util/Map;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;ZLjava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getIcon", "getTitle", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;", "getStatus", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;", "getStyle", "Z", "Ljava/lang/Boolean;", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecommendationTileButtonModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String icon;
    private final GenericInteraction interaction;
    private final Boolean isEnabled;
    private final boolean isLoading;
    private final RecommendationTileStatus status;
    private final RecommendationTileLayoutStyle style;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecommendationTileButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C40204a(4)), AbstractC30060g.m92087G(enumC23463i, new C40204a(5)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C40204a(6)), null};
    }

    public /* synthetic */ RecommendationTileButtonModel(int i13, String str, String str2, RecommendationTileStatus recommendationTileStatus, RecommendationTileLayoutStyle recommendationTileLayoutStyle, boolean z4, Boolean bool, GenericInteraction genericInteraction, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (39 != (i13 & 39)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 39, RecommendationTileButtonModel$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.title = str2;
        this.status = recommendationTileStatus;
        if ((i13 & 8) == 0) {
            this.style = RecommendationTileLayoutStyle.CAROUSEL;
        } else {
            this.style = recommendationTileLayoutStyle;
        }
        if ((i13 & 16) == 0) {
            this.isLoading = false;
        } else {
            this.isLoading = z4;
        }
        this.isEnabled = bool;
        if ((i13 & 64) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
        }
        if ((i13 & 128) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 256) == 0) {
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
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return RecommendationTileLayoutStyle.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationTileButtonModel copy$default(RecommendationTileButtonModel recommendationTileButtonModel, String str, String str2, RecommendationTileStatus recommendationTileStatus, RecommendationTileLayoutStyle recommendationTileLayoutStyle, boolean z4, Boolean bool, GenericInteraction genericInteraction, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = recommendationTileButtonModel.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = recommendationTileButtonModel.title;
        }
        if ((i13 & 4) != 0) {
            recommendationTileStatus = recommendationTileButtonModel.status;
        }
        if ((i13 & 8) != 0) {
            recommendationTileLayoutStyle = recommendationTileButtonModel.style;
        }
        if ((i13 & 16) != 0) {
            z4 = recommendationTileButtonModel.isLoading;
        }
        if ((i13 & 32) != 0) {
            bool = recommendationTileButtonModel.isEnabled;
        }
        if ((i13 & 64) != 0) {
            genericInteraction = recommendationTileButtonModel.interaction;
        }
        if ((i13 & 128) != 0) {
            map = recommendationTileButtonModel.bindings;
        }
        if ((i13 & 256) != 0) {
            map2 = recommendationTileButtonModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        Boolean bool2 = bool;
        GenericInteraction genericInteraction2 = genericInteraction;
        boolean z13 = z4;
        RecommendationTileStatus recommendationTileStatus2 = recommendationTileStatus;
        return recommendationTileButtonModel.copy(str, str2, recommendationTileStatus2, recommendationTileLayoutStyle, z13, bool2, genericInteraction2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(RecommendationTileButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.icon);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.status);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.style != RecommendationTileLayoutStyle.CAROUSEL) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.isLoading) {
            output.encodeBooleanElement(serialDesc, 4, self.isLoading);
        }
        output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.isEnabled);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.interaction != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, GenericInteraction$$serializer.INSTANCE, self.interaction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return RecommendationTileButtonModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RecommendationTileStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RecommendationTileLayoutStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final Map<String, String> component8() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component9() {
        return this.aggregateBindings;
    }

    public final RecommendationTileButtonModel copy(String icon, String title, RecommendationTileStatus status, RecommendationTileLayoutStyle style, boolean isLoading, Boolean isEnabled, GenericInteraction interaction, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(style, "style");
        return new RecommendationTileButtonModel(icon, title, status, style, isLoading, isEnabled, interaction, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationTileButtonModel)) {
            return false;
        }
        RecommendationTileButtonModel recommendationTileButtonModel = (RecommendationTileButtonModel) other;
        return AbstractC22676k.m65745e(this.icon, recommendationTileButtonModel.icon) && AbstractC22676k.m65745e(this.title, recommendationTileButtonModel.title) && this.status == recommendationTileButtonModel.status && this.style == recommendationTileButtonModel.style && this.isLoading == recommendationTileButtonModel.isLoading && AbstractC22676k.m65745e(this.isEnabled, recommendationTileButtonModel.isEnabled) && AbstractC22676k.m65745e(this.interaction, recommendationTileButtonModel.interaction) && AbstractC22676k.m65745e(this.bindings, recommendationTileButtonModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, recommendationTileButtonModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final RecommendationTileStatus getStatus() {
        return this.status;
    }

    public final RecommendationTileLayoutStyle getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.icon;
        int iM8289b = AbstractC2875y.m8289b((this.style.hashCode() + ((this.status.hashCode() + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title)) * 31)) * 31, 31, this.isLoading);
        Boolean bool = this.isEnabled;
        int iHashCode = (iM8289b + (bool == null ? 0 : bool.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        int iHashCode2 = (iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isLoading() {
        return this.isLoading;
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
        String str = this.icon;
        String str2 = this.title;
        RecommendationTileStatus recommendationTileStatus = this.status;
        RecommendationTileLayoutStyle recommendationTileLayoutStyle = this.style;
        boolean z4 = this.isLoading;
        Boolean bool = this.isEnabled;
        GenericInteraction genericInteraction = this.interaction;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RecommendationTileButtonModel(icon=", str, ", title=", str2, ", status=");
        sbM32001t.append(recommendationTileStatus);
        sbM32001t.append(", style=");
        sbM32001t.append(recommendationTileLayoutStyle);
        sbM32001t.append(", isLoading=");
        sbM32001t.append(z4);
        sbM32001t.append(", isEnabled=");
        sbM32001t.append(bool);
        sbM32001t.append(", interaction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", bindings=");
        sbM32001t.append(map);
        sbM32001t.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sbM32001t, map2, ")");
    }

    public RecommendationTileButtonModel(String str, String title, RecommendationTileStatus status, RecommendationTileLayoutStyle style, boolean z4, Boolean bool, GenericInteraction genericInteraction, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(style, "style");
        this.icon = str;
        this.title = title;
        this.status = status;
        this.style = style;
        this.isLoading = z4;
        this.isEnabled = bool;
        this.interaction = genericInteraction;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ RecommendationTileButtonModel(String str, String str2, RecommendationTileStatus recommendationTileStatus, RecommendationTileLayoutStyle recommendationTileLayoutStyle, boolean z4, Boolean bool, GenericInteraction genericInteraction, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, recommendationTileStatus, (i13 & 8) != 0 ? RecommendationTileLayoutStyle.CAROUSEL : recommendationTileLayoutStyle, (i13 & 16) != 0 ? false : z4, bool, (i13 & 64) != 0 ? null : genericInteraction, (i13 & 128) != 0 ? null : map, (i13 & 256) != 0 ? null : map2);
    }
}

package com.whoop.archv2.model.template;

import c13.AbstractC3855a;
import cb1.C4387a;
import cj0.AbstractC4740b;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002[\\B®\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012+\b\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017¢\u0006\u0004\b\u0019\u0010\u001aB¡\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ#\u0010\"\u001a\u00020\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 0\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b.\u0010/J \u00100\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b0\u00101J\u001e\u00102\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b2\u00101J3\u00103\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0003¢\u0006\u0004\b3\u00101J¹\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2+\b\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b<\u0010=J'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bJ\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bN\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bP\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u0010/R'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bT\u00101R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010S\u001a\u0004\bU\u00101\"\u0004\bV\u0010WRE\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010S\u001a\u0004\bX\u00101\"\u0004\bY\u0010W¨\u0006]"}, m65681d2 = {"Lcom/whoop/archv2/model/template/FlowStep;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/archv2/model/template/AnyScreenTemplate;", "template", "Lcom/whoop/archv2/model/template/BackgroundModel;", "background", "Lcom/whoop/design/models/ProgressButtonModel;", "progressButton", "", "", "requiredKeys", "Lcom/whoop/archv2/model/template/BackBehavior;", "backBehavior", "Lcom/whoop/archv2/model/template/FlowStepTransition;", "stepTransition", "", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvents", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Lcom/whoop/archv2/model/template/AnyScreenTemplate;", "component2", "()Lcom/whoop/archv2/model/template/BackgroundModel;", "component3", "()Lcom/whoop/design/models/ProgressButtonModel;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/archv2/model/template/BackBehavior;", "component6", "()Lcom/whoop/archv2/model/template/FlowStepTransition;", "component7", "()Ljava/util/Map;", "component8", "component9", "copy", "(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/FlowStep;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$arch_v2_release", "(Lcom/whoop/archv2/model/template/FlowStep;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/archv2/model/template/AnyScreenTemplate;", "getTemplate", "Lcom/whoop/archv2/model/template/BackgroundModel;", "getBackground", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressButton", "Ljava/util/List;", "getRequiredKeys", "Lcom/whoop/archv2/model/template/BackBehavior;", "getBackBehavior", "Lcom/whoop/archv2/model/template/FlowStepTransition;", "getStepTransition", "Ljava/util/Map;", "getAnalyticEvents", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FlowStep implements WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private final Map<String, AnalyticEventModel> analyticEvents;
    private final BackBehavior backBehavior;
    private final BackgroundModel background;
    private Map<String, String> bindings;
    private final ProgressButtonModel progressButton;
    private final List<String> requiredKeys;
    private final FlowStepTransition stepTransition;
    private final AnyScreenTemplate template;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.FlowStep$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/FlowStep$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/FlowStep;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FlowStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C4387a(14)), null, null, AbstractC30060g.m92087G(enumC23463i, new C4387a(15)), AbstractC30060g.m92087G(enumC23463i, new C4387a(16)), AbstractC30060g.m92087G(enumC23463i, new C4387a(17)), AbstractC30060g.m92087G(enumC23463i, new C4387a(18)), AbstractC30060g.m92087G(enumC23463i, new C4387a(19)), null};
    }

    public /* synthetic */ FlowStep(int i13, AnyScreenTemplate anyScreenTemplate, BackgroundModel backgroundModel, ProgressButtonModel progressButtonModel, List list, BackBehavior backBehavior, FlowStepTransition flowStepTransition, Map map, Map map2, Map map3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, FlowStep$$serializer.INSTANCE.getDescriptor());
        }
        this.template = anyScreenTemplate;
        if ((i13 & 2) == 0) {
            this.background = null;
        } else {
            this.background = backgroundModel;
        }
        if ((i13 & 4) == 0) {
            this.progressButton = null;
        } else {
            this.progressButton = progressButtonModel;
        }
        if ((i13 & 8) == 0) {
            this.requiredKeys = C25271y.f99162w;
        } else {
            this.requiredKeys = list;
        }
        if ((i13 & 16) == 0) {
            this.backBehavior = null;
        } else {
            this.backBehavior = backBehavior;
        }
        if ((i13 & 32) == 0) {
            this.stepTransition = null;
        } else {
            this.stepTransition = flowStepTransition;
        }
        if ((i13 & 64) == 0) {
            this.analyticEvents = null;
        } else {
            this.analyticEvents = map;
        }
        if ((i13 & 128) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map2;
        }
        if ((i13 & 256) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return AnyScreenTemplate.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return BackBehavior.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return FlowStepTransition.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, AbstractC38195a.m122336d(AnalyticEventModel$$serializer.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlowStep copy$default(FlowStep flowStep, AnyScreenTemplate anyScreenTemplate, BackgroundModel backgroundModel, ProgressButtonModel progressButtonModel, List list, BackBehavior backBehavior, FlowStepTransition flowStepTransition, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            anyScreenTemplate = flowStep.template;
        }
        if ((i13 & 2) != 0) {
            backgroundModel = flowStep.background;
        }
        if ((i13 & 4) != 0) {
            progressButtonModel = flowStep.progressButton;
        }
        if ((i13 & 8) != 0) {
            list = flowStep.requiredKeys;
        }
        if ((i13 & 16) != 0) {
            backBehavior = flowStep.backBehavior;
        }
        if ((i13 & 32) != 0) {
            flowStepTransition = flowStep.stepTransition;
        }
        if ((i13 & 64) != 0) {
            map = flowStep.analyticEvents;
        }
        if ((i13 & 128) != 0) {
            map2 = flowStep.bindings;
        }
        if ((i13 & 256) != 0) {
            map3 = flowStep.aggregateBindings;
        }
        Map map4 = map2;
        Map map5 = map3;
        FlowStepTransition flowStepTransition2 = flowStepTransition;
        Map map6 = map;
        BackBehavior backBehavior2 = backBehavior;
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        return flowStep.copy(anyScreenTemplate, backgroundModel, progressButtonModel2, list, backBehavior2, flowStepTransition2, map6, map4, map5);
    }

    public static final /* synthetic */ void write$Self$arch_v2_release(FlowStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.template);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.background != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, BackgroundModel$$serializer.INSTANCE, self.background);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.progressButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, ProgressButtonModel$$serializer.INSTANCE, self.progressButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.requiredKeys, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.requiredKeys);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.backBehavior != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.backBehavior);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.stepTransition != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.stepTransition);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.analyticEvents != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.analyticEvents);
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
        return AbstractC4740b.m14857a(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnyScreenTemplate getTemplate() {
        return this.template;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BackgroundModel getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProgressButtonModel getProgressButton() {
        return this.progressButton;
    }

    public final List<String> component4() {
        return this.requiredKeys;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BackBehavior getBackBehavior() {
        return this.backBehavior;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FlowStepTransition getStepTransition() {
        return this.stepTransition;
    }

    public final Map<String, AnalyticEventModel> component7() {
        return this.analyticEvents;
    }

    public final Map<String, String> component8() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component9() {
        return this.aggregateBindings;
    }

    public final FlowStep copy(AnyScreenTemplate template, BackgroundModel background, ProgressButtonModel progressButton, List<String> requiredKeys, BackBehavior backBehavior, FlowStepTransition stepTransition, Map<String, AnalyticEventModel> analyticEvents, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(template, "template");
        AbstractC22676k.m65750j(requiredKeys, "requiredKeys");
        return new FlowStep(template, background, progressButton, requiredKeys, backBehavior, stepTransition, analyticEvents, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowStep)) {
            return false;
        }
        FlowStep flowStep = (FlowStep) other;
        return AbstractC22676k.m65745e(this.template, flowStep.template) && AbstractC22676k.m65745e(this.background, flowStep.background) && AbstractC22676k.m65745e(this.progressButton, flowStep.progressButton) && AbstractC22676k.m65745e(this.requiredKeys, flowStep.requiredKeys) && this.backBehavior == flowStep.backBehavior && this.stepTransition == flowStep.stepTransition && AbstractC22676k.m65745e(this.analyticEvents, flowStep.analyticEvents) && AbstractC22676k.m65745e(this.bindings, flowStep.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, flowStep.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final Map<String, AnalyticEventModel> getAnalyticEvents() {
        return this.analyticEvents;
    }

    public final BackBehavior getBackBehavior() {
        return this.backBehavior;
    }

    public final BackgroundModel getBackground() {
        return this.background;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final ProgressButtonModel getProgressButton() {
        return this.progressButton;
    }

    public final List<String> getRequiredKeys() {
        return this.requiredKeys;
    }

    public final FlowStepTransition getStepTransition() {
        return this.stepTransition;
    }

    public final AnyScreenTemplate getTemplate() {
        return this.template;
    }

    public int hashCode() {
        int iHashCode = this.template.hashCode() * 31;
        BackgroundModel backgroundModel = this.background;
        int iHashCode2 = (iHashCode + (backgroundModel == null ? 0 : backgroundModel.hashCode())) * 31;
        ProgressButtonModel progressButtonModel = this.progressButton;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31, 31, this.requiredKeys);
        BackBehavior backBehavior = this.backBehavior;
        int iHashCode3 = (iM31983b + (backBehavior == null ? 0 : backBehavior.hashCode())) * 31;
        FlowStepTransition flowStepTransition = this.stepTransition;
        int iHashCode4 = (iHashCode3 + (flowStepTransition == null ? 0 : flowStepTransition.hashCode())) * 31;
        Map<String, AnalyticEventModel> map = this.analyticEvents;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.bindings;
        int iHashCode6 = (iHashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, AggregateBinding> map3 = this.aggregateBindings;
        return iHashCode6 + (map3 != null ? map3.hashCode() : 0);
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
        AnyScreenTemplate anyScreenTemplate = this.template;
        BackgroundModel backgroundModel = this.background;
        ProgressButtonModel progressButtonModel = this.progressButton;
        List<String> list = this.requiredKeys;
        BackBehavior backBehavior = this.backBehavior;
        FlowStepTransition flowStepTransition = this.stepTransition;
        Map<String, AnalyticEventModel> map = this.analyticEvents;
        Map<String, String> map2 = this.bindings;
        Map<String, AggregateBinding> map3 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("FlowStep(template=");
        sb4.append(anyScreenTemplate);
        sb4.append(", background=");
        sb4.append(backgroundModel);
        sb4.append(", progressButton=");
        sb4.append(progressButtonModel);
        sb4.append(", requiredKeys=");
        sb4.append(list);
        sb4.append(", backBehavior=");
        sb4.append(backBehavior);
        sb4.append(", stepTransition=");
        sb4.append(flowStepTransition);
        sb4.append(", analyticEvents=");
        AbstractC3855a.m11840x(sb4, map, ", bindings=", map2, ", aggregateBindings=");
        return AbstractC13673n.m38565l(sb4, map3, ")");
    }

    public FlowStep(AnyScreenTemplate template, BackgroundModel backgroundModel, ProgressButtonModel progressButtonModel, List<String> requiredKeys, BackBehavior backBehavior, FlowStepTransition flowStepTransition, Map<String, AnalyticEventModel> map, Map<String, String> map2, Map<String, AggregateBinding> map3) {
        AbstractC22676k.m65750j(template, "template");
        AbstractC22676k.m65750j(requiredKeys, "requiredKeys");
        this.template = template;
        this.background = backgroundModel;
        this.progressButton = progressButtonModel;
        this.requiredKeys = requiredKeys;
        this.backBehavior = backBehavior;
        this.stepTransition = flowStepTransition;
        this.analyticEvents = map;
        this.bindings = map2;
        this.aggregateBindings = map3;
    }

    public /* synthetic */ FlowStep(AnyScreenTemplate anyScreenTemplate, BackgroundModel backgroundModel, ProgressButtonModel progressButtonModel, List list, BackBehavior backBehavior, FlowStepTransition flowStepTransition, Map map, Map map2, Map map3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(anyScreenTemplate, (i13 & 2) != 0 ? null : backgroundModel, (i13 & 4) != 0 ? null : progressButtonModel, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? null : backBehavior, (i13 & 32) != 0 ? null : flowStepTransition, (i13 & 64) != 0 ? null : map, (i13 & 128) != 0 ? null : map2, (i13 & 256) != 0 ? null : map3);
    }
}

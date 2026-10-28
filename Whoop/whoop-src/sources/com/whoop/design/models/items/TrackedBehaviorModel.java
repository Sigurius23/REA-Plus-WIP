package com.whoop.design.models.items;

import com.whoop.design.models.SearchFilterableModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import java.lang.annotation.Annotation;
import java.util.Collection;
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
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36964k;
import wb3.AbstractC37056f;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0002]\\B\u009e\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011\u0012+\b\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u0091\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010\u00002\u0006\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\u0011H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\u000fHÆ\u0003¢\u0006\u0004\b3\u00104J\u001e\u00105\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b5\u00106J3\u00107\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0003¢\u0006\u0004\b7\u00106J©\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112+\b\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b:\u0010.J\u0010\u0010;\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010>\u001a\u00020\r2\b\u0010=\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b>\u0010?J'\u0010H\u001a\u00020E2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010I\u001a\u0004\bJ\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010K\u001a\u0004\bL\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bN\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bP\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bR\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\b\u000e\u00102R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010T\u001a\u0004\bU\u00104R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010V\u001a\u0004\bW\u00106\"\u0004\bX\u0010YRE\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010V\u001a\u0004\bZ\u00106\"\u0004\b[\u0010Y¨\u0006^"}, m65681d2 = {"Lcom/whoop/design/models/items/TrackedBehaviorModel;", "Lcom/whoop/design/models/SearchFilterableModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/items/BehaviorTrackerModel;", "behaviorTracker", "Lcom/whoop/design/models/items/TrackerInputModel;", "trackerInput", "Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;", "metadata", "", "stateKey", "Lcom/whoop/whoopaction/domain/models/Action;", "deselectAction", "", "isSuggested", "", "searchKeys", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "query", "filteredForSearch", "(Ljava/lang/String;)Lcom/whoop/design/models/items/TrackedBehaviorModel;", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/items/TrackedBehaviorModel;", "component1", "()Lcom/whoop/design/models/items/BehaviorTrackerModel;", "component2", "()Lcom/whoop/design/models/items/TrackerInputModel;", "component3", "()Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/whoop/whoopaction/domain/models/Action;", "component6", "()Z", "component7", "()Ljava/util/List;", "component8", "()Ljava/util/Map;", "component9", "copy", "(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/TrackedBehaviorModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TrackedBehaviorModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/models/items/BehaviorTrackerModel;", "getBehaviorTracker", "Lcom/whoop/design/models/items/TrackerInputModel;", "getTrackerInput", "Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;", "getMetadata", "Ljava/lang/String;", "getStateKey", "Lcom/whoop/whoopaction/domain/models/Action;", "getDeselectAction", "Z", "Ljava/util/List;", "getSearchKeys", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrackedBehaviorModel implements SearchFilterableModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private final BehaviorTrackerModel behaviorTracker;
    private Map<String, String> bindings;
    private final Action deselectAction;
    private final boolean isSuggested;
    private final TrackedBehaviorMetadataModel metadata;
    private final List<String> searchKeys;
    private final String stateKey;
    private final TrackerInputModel trackerInput;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TrackedBehaviorModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TrackedBehaviorModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrackedBehaviorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36964k(22)), null, AbstractC30060g.m92087G(enumC23463i, new C36964k(23)), AbstractC30060g.m92087G(enumC23463i, new C36964k(24)), null};
    }

    public /* synthetic */ TrackedBehaviorModel(int i13, BehaviorTrackerModel behaviorTrackerModel, TrackerInputModel trackerInputModel, TrackedBehaviorMetadataModel trackedBehaviorMetadataModel, String str, Action action, boolean z4, List list, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, TrackedBehaviorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.behaviorTracker = behaviorTrackerModel;
        if ((i13 & 2) == 0) {
            this.trackerInput = null;
        } else {
            this.trackerInput = trackerInputModel;
        }
        if ((i13 & 4) == 0) {
            this.metadata = null;
        } else {
            this.metadata = trackedBehaviorMetadataModel;
        }
        if ((i13 & 8) == 0) {
            this.stateKey = null;
        } else {
            this.stateKey = str;
        }
        if ((i13 & 16) == 0) {
            this.deselectAction = null;
        } else {
            this.deselectAction = action;
        }
        if ((i13 & 32) == 0) {
            this.isSuggested = false;
        } else {
            this.isSuggested = z4;
        }
        if ((i13 & 64) == 0) {
            this.searchKeys = C25271y.f99162w;
        } else {
            this.searchKeys = list;
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
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackedBehaviorModel copy$default(TrackedBehaviorModel trackedBehaviorModel, BehaviorTrackerModel behaviorTrackerModel, TrackerInputModel trackerInputModel, TrackedBehaviorMetadataModel trackedBehaviorMetadataModel, String str, Action action, boolean z4, List list, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            behaviorTrackerModel = trackedBehaviorModel.behaviorTracker;
        }
        if ((i13 & 2) != 0) {
            trackerInputModel = trackedBehaviorModel.trackerInput;
        }
        if ((i13 & 4) != 0) {
            trackedBehaviorMetadataModel = trackedBehaviorModel.metadata;
        }
        if ((i13 & 8) != 0) {
            str = trackedBehaviorModel.stateKey;
        }
        if ((i13 & 16) != 0) {
            action = trackedBehaviorModel.deselectAction;
        }
        if ((i13 & 32) != 0) {
            z4 = trackedBehaviorModel.isSuggested;
        }
        if ((i13 & 64) != 0) {
            list = trackedBehaviorModel.searchKeys;
        }
        if ((i13 & 128) != 0) {
            map = trackedBehaviorModel.bindings;
        }
        if ((i13 & 256) != 0) {
            map2 = trackedBehaviorModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        boolean z13 = z4;
        List list2 = list;
        Action action2 = action;
        TrackedBehaviorMetadataModel trackedBehaviorMetadataModel2 = trackedBehaviorMetadataModel;
        return trackedBehaviorModel.copy(behaviorTrackerModel, trackerInputModel, trackedBehaviorMetadataModel2, str, action2, z13, list2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TrackedBehaviorModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, BehaviorTrackerModel$$serializer.INSTANCE, self.behaviorTracker);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.trackerInput != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, TrackerInputModel$$serializer.INSTANCE, self.trackerInput);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.metadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, TrackedBehaviorMetadataModel$$serializer.INSTANCE, self.metadata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.stateKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.stateKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.deselectAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.deselectAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.isSuggested) {
            output.encodeBooleanElement(serialDesc, 5, self.isSuggested);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC22676k.m65745e(self.searchKeys, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.searchKeys);
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
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BehaviorTrackerModel getBehaviorTracker() {
        return this.behaviorTracker;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrackerInputModel getTrackerInput() {
        return this.trackerInput;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TrackedBehaviorMetadataModel getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStateKey() {
        return this.stateKey;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Action getDeselectAction() {
        return this.deselectAction;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsSuggested() {
        return this.isSuggested;
    }

    public final List<String> component7() {
        return this.searchKeys;
    }

    public final Map<String, String> component8() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component9() {
        return this.aggregateBindings;
    }

    public final TrackedBehaviorModel copy(BehaviorTrackerModel behaviorTracker, TrackerInputModel trackerInput, TrackedBehaviorMetadataModel metadata, String stateKey, Action deselectAction, boolean isSuggested, List<String> searchKeys, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(behaviorTracker, "behaviorTracker");
        AbstractC22676k.m65750j(searchKeys, "searchKeys");
        return new TrackedBehaviorModel(behaviorTracker, trackerInput, metadata, stateKey, deselectAction, isSuggested, searchKeys, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackedBehaviorModel)) {
            return false;
        }
        TrackedBehaviorModel trackedBehaviorModel = (TrackedBehaviorModel) other;
        return AbstractC22676k.m65745e(this.behaviorTracker, trackedBehaviorModel.behaviorTracker) && AbstractC22676k.m65745e(this.trackerInput, trackedBehaviorModel.trackerInput) && AbstractC22676k.m65745e(this.metadata, trackedBehaviorModel.metadata) && AbstractC22676k.m65745e(this.stateKey, trackedBehaviorModel.stateKey) && AbstractC22676k.m65745e(this.deselectAction, trackedBehaviorModel.deselectAction) && this.isSuggested == trackedBehaviorModel.isSuggested && AbstractC22676k.m65745e(this.searchKeys, trackedBehaviorModel.searchKeys) && AbstractC22676k.m65745e(this.bindings, trackedBehaviorModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, trackedBehaviorModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final BehaviorTrackerModel getBehaviorTracker() {
        return this.behaviorTracker;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final Action getDeselectAction() {
        return this.deselectAction;
    }

    public final TrackedBehaviorMetadataModel getMetadata() {
        return this.metadata;
    }

    public final List<String> getSearchKeys() {
        return this.searchKeys;
    }

    public final String getStateKey() {
        return this.stateKey;
    }

    public final TrackerInputModel getTrackerInput() {
        return this.trackerInput;
    }

    public int hashCode() {
        int iHashCode = this.behaviorTracker.hashCode() * 31;
        TrackerInputModel trackerInputModel = this.trackerInput;
        int iHashCode2 = (iHashCode + (trackerInputModel == null ? 0 : trackerInputModel.hashCode())) * 31;
        TrackedBehaviorMetadataModel trackedBehaviorMetadataModel = this.metadata;
        int iHashCode3 = (iHashCode2 + (trackedBehaviorMetadataModel == null ? 0 : trackedBehaviorMetadataModel.hashCode())) * 31;
        String str = this.stateKey;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.deselectAction;
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b((iHashCode4 + (action == null ? 0 : action.hashCode())) * 31, 31, this.isSuggested), 31, this.searchKeys);
        Map<String, String> map = this.bindings;
        int iHashCode5 = (iM31983b + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode5 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isSuggested() {
        return this.isSuggested;
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
        BehaviorTrackerModel behaviorTrackerModel = this.behaviorTracker;
        TrackerInputModel trackerInputModel = this.trackerInput;
        TrackedBehaviorMetadataModel trackedBehaviorMetadataModel = this.metadata;
        String str = this.stateKey;
        Action action = this.deselectAction;
        boolean z4 = this.isSuggested;
        List<String> list = this.searchKeys;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("TrackedBehaviorModel(behaviorTracker=");
        sb4.append(behaviorTrackerModel);
        sb4.append(", trackerInput=");
        sb4.append(trackerInputModel);
        sb4.append(", metadata=");
        sb4.append(trackedBehaviorMetadataModel);
        sb4.append(", stateKey=");
        sb4.append(str);
        sb4.append(", deselectAction=");
        sb4.append(action);
        sb4.append(", isSuggested=");
        sb4.append(z4);
        sb4.append(", searchKeys=");
        sb4.append(list);
        sb4.append(", bindings=");
        sb4.append(map);
        sb4.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sb4, map2, ")");
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public TrackedBehaviorModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return TrackedBehaviorModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    @Override // com.whoop.design.models.SearchFilterableModel
    public TrackedBehaviorModel filteredForSearch(String query) {
        AbstractC22676k.m65750j(query, "query");
        Collection collection = this.searchKeys;
        if (collection == null) {
            collection = C25271y.f99162w;
        }
        Collection collectionM118960L = collection;
        if (collectionM118960L.isEmpty()) {
            collectionM118960L = AbstractC37056f.m118960L(this.behaviorTracker.getTitle());
        }
        if (SearchFilterableModel.INSTANCE.matchesQuery(query, (List) collectionM118960L)) {
            return this;
        }
        return null;
    }

    public TrackedBehaviorModel(BehaviorTrackerModel behaviorTracker, TrackerInputModel trackerInputModel, TrackedBehaviorMetadataModel trackedBehaviorMetadataModel, String str, Action action, boolean z4, List<String> searchKeys, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(behaviorTracker, "behaviorTracker");
        AbstractC22676k.m65750j(searchKeys, "searchKeys");
        this.behaviorTracker = behaviorTracker;
        this.trackerInput = trackerInputModel;
        this.metadata = trackedBehaviorMetadataModel;
        this.stateKey = str;
        this.deselectAction = action;
        this.isSuggested = z4;
        this.searchKeys = searchKeys;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ TrackedBehaviorModel(BehaviorTrackerModel behaviorTrackerModel, TrackerInputModel trackerInputModel, TrackedBehaviorMetadataModel trackedBehaviorMetadataModel, String str, Action action, boolean z4, List list, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(behaviorTrackerModel, (i13 & 2) != 0 ? null : trackerInputModel, (i13 & 4) != 0 ? null : trackedBehaviorMetadataModel, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : action, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? C25271y.f99162w : list, (i13 & 128) != 0 ? null : map, (i13 & 256) != 0 ? null : map2);
    }
}

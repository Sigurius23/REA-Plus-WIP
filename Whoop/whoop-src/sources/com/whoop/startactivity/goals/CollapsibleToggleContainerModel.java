package com.whoop.startactivity.goals;

import com.whoop.design.models.DesignModelWrapper;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.ContentBindingResolverKt;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jx2.C22038b;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0004UVWXBO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0010\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010*Jb\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b.\u0010$J\u0010\u0010/\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b\u0004\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bH\u0010*R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MRE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\t0Q8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010I\u001a\u0004\bR\u0010K\"\u0004\bS\u0010M¨\u0006Y"}, m65681d2 = {"Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "isToggleOn", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;", "toggleStyle", "", "title", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;", "badge", "", "items", "Lcom/whoop/navigation/models/GenericInteraction;", "toggleOnInteraction", "toggleOffInteraction", "<init>", "(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;", "component1", "()Z", "component2", "()Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;", "component5", "()Ljava/util/List;", "component6", "()Lcom/whoop/navigation/models/GenericInteraction;", "component7", "copy", "(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$start_activity_release", "(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Z", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;", "getToggleStyle", "Ljava/lang/String;", "getTitle", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;", "getBadge", "Ljava/util/List;", "getItems", "Lcom/whoop/navigation/models/GenericInteraction;", "getToggleOnInteraction", "getToggleOffInteraction", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "b", "Badge", "$serializer", "a", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CollapsibleToggleContainerModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private final Badge badge;
    private Map<String, String> bindings;
    private final boolean isToggleOn;
    private final List<DesignSystemModel> items;
    private final String title;
    private final GenericInteraction toggleOffInteraction;
    private final GenericInteraction toggleOnInteraction;
    private final EnumC10234b toggleStyle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.startactivity.goals.CollapsibleToggleContainerModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;", "serializer", "()Lwc3/c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CollapsibleToggleContainerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.startactivity.goals.CollapsibleToggleContainerModel$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;", "", "<init>", "(Ljava/lang/String;I)V", "GREEN", "AI", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum EnumC10234b {
        GREEN,
        AI;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C22038b(24)), null, null, AbstractC30060g.m92087G(enumC23463i, new C22038b(25)), null, null, AbstractC30060g.m92087G(enumC23463i, new C22038b(26)), null};
    }

    public /* synthetic */ CollapsibleToggleContainerModel(int i13, boolean z4, EnumC10234b enumC10234b, String str, Badge badge, List list, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, CollapsibleToggleContainerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.isToggleOn = z4;
        this.toggleStyle = enumC10234b;
        this.title = str;
        this.badge = badge;
        this.items = list;
        if ((i13 & 32) == 0) {
            this.toggleOnInteraction = null;
        } else {
            this.toggleOnInteraction = genericInteraction;
        }
        if ((i13 & 64) == 0) {
            this.toggleOffInteraction = null;
        } else {
            this.toggleOffInteraction = genericInteraction2;
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
        return EnumsKt.createSimpleEnumSerializer("com.whoop.startactivity.goals.CollapsibleToggleContainerModel.ToggleStyle", EnumC10234b.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollapsibleToggleContainerModel copy$default(CollapsibleToggleContainerModel collapsibleToggleContainerModel, boolean z4, EnumC10234b enumC10234b, String str, Badge badge, List list, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = collapsibleToggleContainerModel.isToggleOn;
        }
        if ((i13 & 2) != 0) {
            enumC10234b = collapsibleToggleContainerModel.toggleStyle;
        }
        if ((i13 & 4) != 0) {
            str = collapsibleToggleContainerModel.title;
        }
        if ((i13 & 8) != 0) {
            badge = collapsibleToggleContainerModel.badge;
        }
        if ((i13 & 16) != 0) {
            list = collapsibleToggleContainerModel.items;
        }
        if ((i13 & 32) != 0) {
            genericInteraction = collapsibleToggleContainerModel.toggleOnInteraction;
        }
        if ((i13 & 64) != 0) {
            genericInteraction2 = collapsibleToggleContainerModel.toggleOffInteraction;
        }
        GenericInteraction genericInteraction3 = genericInteraction;
        GenericInteraction genericInteraction4 = genericInteraction2;
        List list2 = list;
        String str2 = str;
        return collapsibleToggleContainerModel.copy(z4, enumC10234b, str2, badge, list2, genericInteraction3, genericInteraction4);
    }

    public static final /* synthetic */ void write$Self$start_activity_release(CollapsibleToggleContainerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.isToggleOn);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.toggleStyle);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, CollapsibleToggleContainerModel$Badge$$serializer.INSTANCE, self.badge);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.items);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.toggleOnInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, GenericInteraction$$serializer.INSTANCE, self.toggleOnInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.toggleOffInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, GenericInteraction$$serializer.INSTANCE, self.toggleOffInteraction);
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
    public final boolean getIsToggleOn() {
        return this.isToggleOn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC10234b getToggleStyle() {
        return this.toggleStyle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    public final List<DesignSystemModel> component5() {
        return this.items;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GenericInteraction getToggleOnInteraction() {
        return this.toggleOnInteraction;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GenericInteraction getToggleOffInteraction() {
        return this.toggleOffInteraction;
    }

    public final CollapsibleToggleContainerModel copy(boolean isToggleOn, EnumC10234b toggleStyle, String title, Badge badge, List<? extends DesignSystemModel> items, GenericInteraction toggleOnInteraction, GenericInteraction toggleOffInteraction) {
        AbstractC22676k.m65750j(toggleStyle, "toggleStyle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        return new CollapsibleToggleContainerModel(isToggleOn, toggleStyle, title, badge, items, toggleOnInteraction, toggleOffInteraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollapsibleToggleContainerModel)) {
            return false;
        }
        CollapsibleToggleContainerModel collapsibleToggleContainerModel = (CollapsibleToggleContainerModel) other;
        return this.isToggleOn == collapsibleToggleContainerModel.isToggleOn && this.toggleStyle == collapsibleToggleContainerModel.toggleStyle && AbstractC22676k.m65745e(this.title, collapsibleToggleContainerModel.title) && AbstractC22676k.m65745e(this.badge, collapsibleToggleContainerModel.badge) && AbstractC22676k.m65745e(this.items, collapsibleToggleContainerModel.items) && AbstractC22676k.m65745e(this.toggleOnInteraction, collapsibleToggleContainerModel.toggleOnInteraction) && AbstractC22676k.m65745e(this.toggleOffInteraction, collapsibleToggleContainerModel.toggleOffInteraction);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public final GenericInteraction getToggleOffInteraction() {
        return this.toggleOffInteraction;
    }

    public final GenericInteraction getToggleOnInteraction() {
        return this.toggleOnInteraction;
    }

    public final EnumC10234b getToggleStyle() {
        return this.toggleStyle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.toggleStyle.hashCode() + (Boolean.hashCode(this.isToggleOn) * 31)) * 31, 31, this.title);
        Badge badge = this.badge;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.items);
        GenericInteraction genericInteraction = this.toggleOnInteraction;
        int iHashCode = (iM31983b + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.toggleOffInteraction;
        return iHashCode + (genericInteraction2 != null ? genericInteraction2.hashCode() : 0);
    }

    public final boolean isToggleOn() {
        return this.isToggleOn;
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
        boolean z4 = this.isToggleOn;
        EnumC10234b enumC10234b = this.toggleStyle;
        String str = this.title;
        Badge badge = this.badge;
        List<DesignSystemModel> list = this.items;
        GenericInteraction genericInteraction = this.toggleOnInteraction;
        GenericInteraction genericInteraction2 = this.toggleOffInteraction;
        StringBuilder sb4 = new StringBuilder("CollapsibleToggleContainerModel(isToggleOn=");
        sb4.append(z4);
        sb4.append(", toggleStyle=");
        sb4.append(enumC10234b);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", badge=");
        sb4.append(badge);
        sb4.append(", items=");
        sb4.append(list);
        sb4.append(", toggleOnInteraction=");
        sb4.append(genericInteraction);
        sb4.append(", toggleOffInteraction=");
        return AbstractC26725a.m79506j(sb4, genericInteraction2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollapsibleToggleContainerModel(boolean z4, EnumC10234b toggleStyle, String title, Badge badge, List<? extends DesignSystemModel> items, GenericInteraction genericInteraction, GenericInteraction genericInteraction2) {
        AbstractC22676k.m65750j(toggleStyle, "toggleStyle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        this.isToggleOn = z4;
        this.toggleStyle = toggleStyle;
        this.title = title;
        this.badge = badge;
        this.items = items;
        this.toggleOnInteraction = genericInteraction;
        this.toggleOffInteraction = genericInteraction2;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public CollapsibleToggleContainerModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        CollapsibleToggleContainerModel collapsibleToggleContainerModelM26010a = AbstractC10238b.m26010a(this, getBindings(), getAggregateBindings(), accumulatedState);
        if (accumulatedState.isEmpty()) {
            return collapsibleToggleContainerModelM26010a;
        }
        List<DesignSystemModel> list = collapsibleToggleContainerModelM26010a.items;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (DesignSystemModel designSystemModel : list) {
            DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap(designSystemModel);
            WithGeneratedBindings withGeneratedBindings = designSystemModelUnwrap instanceof WithGeneratedBindings ? (WithGeneratedBindings) designSystemModelUnwrap : null;
            WithGeneratedBindings withGeneratedBindingsBind = withGeneratedBindings != null ? withGeneratedBindings.bind(accumulatedState) : null;
            DesignSystemModel designSystemModel2 = withGeneratedBindingsBind instanceof DesignSystemModel ? (DesignSystemModel) withGeneratedBindingsBind : null;
            DesignSystemModel designSystemModelCopy$default = designSystemModel2 == null ? designSystemModelUnwrap : designSystemModel2;
            if (designSystemModel instanceof DesignModelWrapper) {
                designSystemModelCopy$default = DesignModelWrapper.copy$default((DesignModelWrapper) designSystemModel, designSystemModelCopy$default, null, null, null, null, 30, null);
            }
            arrayList.add(designSystemModelCopy$default);
        }
        return (CollapsibleToggleContainerModel) ContentBindingResolverKt.copyBindingsFrom(copy$default(collapsibleToggleContainerModelM26010a, false, null, null, null, arrayList, null, null, 111, null), collapsibleToggleContainerModelM26010a);
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0003+,-B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;", "", "", "icon", "title", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge$a;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge$a;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge$a;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$start_activity_release", "(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge$a;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge$a;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitle", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge$a;", "getStyle", "Companion", "a", "$serializer", "b", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Badge {
        public static final int $stable = 0;
        private final String icon;
        private final EnumC10231a style;
        private final String title;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22038b(27))};

        /* JADX INFO: renamed from: com.whoop.startactivity.goals.CollapsibleToggleContainerModel$Badge$a */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge$a;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "AI", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public enum EnumC10231a {
            DEFAULT,
            AI;

            private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

            public static InterfaceC33616a getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX INFO: renamed from: com.whoop.startactivity.goals.CollapsibleToggleContainerModel$Badge$b, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge$b;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;", "serializer", "()Lwc3/c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return CollapsibleToggleContainerModel$Badge$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Badge(int i13, String str, String str2, EnumC10231a enumC10231a, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, CollapsibleToggleContainerModel$Badge$$serializer.INSTANCE.getDescriptor());
            }
            this.icon = str;
            this.title = str2;
            if ((i13 & 4) == 0) {
                this.style = EnumC10231a.DEFAULT;
            } else {
                this.style = enumC10231a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.whoop.startactivity.goals.CollapsibleToggleContainerModel.Badge.BadgeStyle", EnumC10231a.values());
        }

        public static /* synthetic */ Badge copy$default(Badge badge, String str, String str2, EnumC10231a enumC10231a, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = badge.icon;
            }
            if ((i13 & 2) != 0) {
                str2 = badge.title;
            }
            if ((i13 & 4) != 0) {
                enumC10231a = badge.style;
            }
            return badge.copy(str, str2, enumC10231a);
        }

        public static final /* synthetic */ void write$Self$start_activity_release(Badge self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.icon);
            output.encodeStringElement(serialDesc, 1, self.title);
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.style == EnumC10231a.DEFAULT) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
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
        public final EnumC10231a getStyle() {
            return this.style;
        }

        public final Badge copy(String icon, String title, EnumC10231a style) {
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(style, "style");
            return new Badge(icon, title, style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return AbstractC22676k.m65745e(this.icon, badge.icon) && AbstractC22676k.m65745e(this.title, badge.title) && this.style == badge.style;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final EnumC10231a getStyle() {
            return this.style;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.style.hashCode() + AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title);
        }

        public String toString() {
            String str = this.icon;
            String str2 = this.title;
            EnumC10231a enumC10231a = this.style;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Badge(icon=", str, ", title=", str2, ", style=");
            sbM32001t.append(enumC10231a);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public Badge(String icon, String title, EnumC10231a style) {
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(style, "style");
            this.icon = icon;
            this.title = title;
            this.style = style;
        }

        public /* synthetic */ Badge(String str, String str2, EnumC10231a enumC10231a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? EnumC10231a.DEFAULT : enumC10231a);
        }
    }

    public /* synthetic */ CollapsibleToggleContainerModel(boolean z4, EnumC10234b enumC10234b, String str, Badge badge, List list, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, enumC10234b, str, badge, list, (i13 & 32) != 0 ? null : genericInteraction, (i13 & 64) != 0 ? null : genericInteraction2);
    }
}

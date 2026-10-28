package com.whoop.startactivity.goals;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.lang.annotation.Annotation;
import java.util.Map;
import jx2.C22038b;
import kg2.AbstractC22461g;
import kg2.C22458d;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002RSBW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fB\u008b\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u000e\u0010\u0018J#\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J`\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b>\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b?\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010&R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010(R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JRE\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`K¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\t0N8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010F\u001a\u0004\bO\u0010H\"\u0004\bP\u0010J¨\u0006T"}, m65681d2 = {"Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;", "component", "path", "activityType", "", "gpsEnabled", "Lcom/whoop/startactivity/goals/TargetsScoreType;", "scoreType", "showLoading", "<init>", "(Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;Z)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;ZLjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/whoop/startactivity/goals/TargetsScoreType;", "component7", "()Z", "copy", "(Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;Z)Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$start_activity_release", "(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;", "getComponent", "getPath", "getActivityType", "Ljava/lang/Boolean;", "getGpsEnabled", "Lcom/whoop/startactivity/goals/TargetsScoreType;", "getScoreType", "Z", "getShowLoading", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "a", "$serializer", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StartActivityTargetsMiniArch implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    public static final String DEFAULT_ID = "start-activity-targets";
    private final String activityType;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final StartActivityTargetsMiniArchComponent component;
    private final Boolean gpsEnabled;
    private final String id;
    private final String path;
    private final TargetsScoreType scoreType;
    private final boolean showLoading;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.startactivity.goals.StartActivityTargetsMiniArch$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;", "serializer", "()Lwc3/c;", "", "DEFAULT_ID", "Ljava/lang/String;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StartActivityTargetsMiniArch$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C22038b(28)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C22038b(29)), null, AbstractC30060g.m92087G(enumC23463i, new C22458d(0)), null};
    }

    public StartActivityTargetsMiniArch() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ObjectSerializer("com.whoop.startactivity.goals.StartActivityTargetsMiniArchComponent", StartActivityTargetsMiniArchComponent.INSTANCE, new Annotation[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return TargetsScoreType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    public static /* synthetic */ StartActivityTargetsMiniArch copy$default(StartActivityTargetsMiniArch startActivityTargetsMiniArch, String str, StartActivityTargetsMiniArchComponent startActivityTargetsMiniArchComponent, String str2, String str3, Boolean bool, TargetsScoreType targetsScoreType, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = startActivityTargetsMiniArch.id;
        }
        if ((i13 & 2) != 0) {
            startActivityTargetsMiniArchComponent = startActivityTargetsMiniArch.component;
        }
        if ((i13 & 4) != 0) {
            str2 = startActivityTargetsMiniArch.path;
        }
        if ((i13 & 8) != 0) {
            str3 = startActivityTargetsMiniArch.activityType;
        }
        if ((i13 & 16) != 0) {
            bool = startActivityTargetsMiniArch.gpsEnabled;
        }
        if ((i13 & 32) != 0) {
            targetsScoreType = startActivityTargetsMiniArch.scoreType;
        }
        if ((i13 & 64) != 0) {
            z4 = startActivityTargetsMiniArch.showLoading;
        }
        TargetsScoreType targetsScoreType2 = targetsScoreType;
        boolean z13 = z4;
        Boolean bool2 = bool;
        String str4 = str2;
        return startActivityTargetsMiniArch.copy(str, startActivityTargetsMiniArchComponent, str4, str3, bool2, targetsScoreType2, z13);
    }

    public static final /* synthetic */ void write$Self$start_activity_release(StartActivityTargetsMiniArch self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, DEFAULT_ID)) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.component != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.component);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.path != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.path);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.activityType != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.activityType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.gpsEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.gpsEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.scoreType != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.scoreType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !self.showLoading) {
            output.encodeBooleanElement(serialDesc, 6, self.showLoading);
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
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StartActivityTargetsMiniArchComponent getComponent() {
        return this.component;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getGpsEnabled() {
        return this.gpsEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TargetsScoreType getScoreType() {
        return this.scoreType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final StartActivityTargetsMiniArch copy(String id4, StartActivityTargetsMiniArchComponent component, String path, String activityType, Boolean gpsEnabled, TargetsScoreType scoreType, boolean showLoading) {
        AbstractC22676k.m65750j(id4, "id");
        return new StartActivityTargetsMiniArch(id4, component, path, activityType, gpsEnabled, scoreType, showLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartActivityTargetsMiniArch)) {
            return false;
        }
        StartActivityTargetsMiniArch startActivityTargetsMiniArch = (StartActivityTargetsMiniArch) other;
        return AbstractC22676k.m65745e(this.id, startActivityTargetsMiniArch.id) && AbstractC22676k.m65745e(this.component, startActivityTargetsMiniArch.component) && AbstractC22676k.m65745e(this.path, startActivityTargetsMiniArch.path) && AbstractC22676k.m65745e(this.activityType, startActivityTargetsMiniArch.activityType) && AbstractC22676k.m65745e(this.gpsEnabled, startActivityTargetsMiniArch.gpsEnabled) && this.scoreType == startActivityTargetsMiniArch.scoreType && this.showLoading == startActivityTargetsMiniArch.showLoading;
    }

    public final String getActivityType() {
        return this.activityType;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final StartActivityTargetsMiniArchComponent getComponent() {
        return this.component;
    }

    public final Boolean getGpsEnabled() {
        return this.gpsEnabled;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPath() {
        return this.path;
    }

    public final TargetsScoreType getScoreType() {
        return this.scoreType;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        StartActivityTargetsMiniArchComponent startActivityTargetsMiniArchComponent = this.component;
        int iHashCode2 = (iHashCode + (startActivityTargetsMiniArchComponent == null ? 0 : startActivityTargetsMiniArchComponent.hashCode())) * 31;
        String str = this.path;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activityType;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.gpsEnabled;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        TargetsScoreType targetsScoreType = this.scoreType;
        return Boolean.hashCode(this.showLoading) + ((iHashCode5 + (targetsScoreType != null ? targetsScoreType.hashCode() : 0)) * 31);
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
        String str = this.id;
        StartActivityTargetsMiniArchComponent startActivityTargetsMiniArchComponent = this.component;
        String str2 = this.path;
        String str3 = this.activityType;
        Boolean bool = this.gpsEnabled;
        TargetsScoreType targetsScoreType = this.scoreType;
        boolean z4 = this.showLoading;
        StringBuilder sb4 = new StringBuilder("StartActivityTargetsMiniArch(id=");
        sb4.append(str);
        sb4.append(", component=");
        sb4.append(startActivityTargetsMiniArchComponent);
        sb4.append(", path=");
        AbstractC11266d.m30444B(sb4, str2, ", activityType=", str3, ", gpsEnabled=");
        sb4.append(bool);
        sb4.append(", scoreType=");
        sb4.append(targetsScoreType);
        sb4.append(", showLoading=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ StartActivityTargetsMiniArch(int i13, String str, StartActivityTargetsMiniArchComponent startActivityTargetsMiniArchComponent, String str2, String str3, Boolean bool, TargetsScoreType targetsScoreType, boolean z4, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i13 & 1) == 0 ? DEFAULT_ID : str;
        if ((i13 & 2) == 0) {
            this.component = null;
        } else {
            this.component = startActivityTargetsMiniArchComponent;
        }
        if ((i13 & 4) == 0) {
            this.path = null;
        } else {
            this.path = str2;
        }
        if ((i13 & 8) == 0) {
            this.activityType = null;
        } else {
            this.activityType = str3;
        }
        if ((i13 & 16) == 0) {
            this.gpsEnabled = null;
        } else {
            this.gpsEnabled = bool;
        }
        if ((i13 & 32) == 0) {
            this.scoreType = null;
        } else {
            this.scoreType = targetsScoreType;
        }
        if ((i13 & 64) == 0) {
            this.showLoading = true;
        } else {
            this.showLoading = z4;
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

    @Override // com.whoop.design.models.WithGeneratedBindings
    public StartActivityTargetsMiniArch bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AbstractC22461g.m64876a(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public StartActivityTargetsMiniArch(String id4, StartActivityTargetsMiniArchComponent startActivityTargetsMiniArchComponent, String str, String str2, Boolean bool, TargetsScoreType targetsScoreType, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.component = startActivityTargetsMiniArchComponent;
        this.path = str;
        this.activityType = str2;
        this.gpsEnabled = bool;
        this.scoreType = targetsScoreType;
        this.showLoading = z4;
    }

    public /* synthetic */ StartActivityTargetsMiniArch(String str, StartActivityTargetsMiniArchComponent startActivityTargetsMiniArchComponent, String str2, String str3, Boolean bool, TargetsScoreType targetsScoreType, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? DEFAULT_ID : str, (i13 & 2) != 0 ? null : startActivityTargetsMiniArchComponent, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : bool, (i13 & 32) != 0 ? null : targetsScoreType, (i13 & 64) != 0 ? true : z4);
    }
}

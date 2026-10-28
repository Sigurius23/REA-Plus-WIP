package com.whoop.strengthworkout.domain.models;

import bf2.C3201a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJN\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b3\u0010\u001f¨\u00066"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;", "", "", "workoutTemplateKey", "parentTemplateKey", "", "name", "", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateGroup;", "workoutGroups", "source", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strength_workout_release", "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Long;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getWorkoutTemplateKey", "getParentTemplateKey", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getWorkoutGroups", "getSource", "Companion", "$serializer", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrengthWorkoutTemplateResponse {
    private final String name;
    private final Long parentTemplateKey;
    private final String source;
    private final List<StrengthWorkoutTemplateGroup> workoutGroups;
    private final Long workoutTemplateKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3201a(20)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;", "serializer", "()Lwc3/c;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrengthWorkoutTemplateResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrengthWorkoutTemplateResponse(int i13, Long l7, Long l12, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (23 != (i13 & 23)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 23, StrengthWorkoutTemplateResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.workoutTemplateKey = l7;
        this.parentTemplateKey = l12;
        this.name = str;
        if ((i13 & 8) == 0) {
            this.workoutGroups = C25271y.f99162w;
        } else {
            this.workoutGroups = list;
        }
        this.source = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StrengthWorkoutTemplateGroup$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrengthWorkoutTemplateResponse copy$default(StrengthWorkoutTemplateResponse strengthWorkoutTemplateResponse, Long l7, Long l12, String str, List list, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = strengthWorkoutTemplateResponse.workoutTemplateKey;
        }
        if ((i13 & 2) != 0) {
            l12 = strengthWorkoutTemplateResponse.parentTemplateKey;
        }
        if ((i13 & 4) != 0) {
            str = strengthWorkoutTemplateResponse.name;
        }
        if ((i13 & 8) != 0) {
            list = strengthWorkoutTemplateResponse.workoutGroups;
        }
        if ((i13 & 16) != 0) {
            str2 = strengthWorkoutTemplateResponse.source;
        }
        String str3 = str2;
        String str4 = str;
        return strengthWorkoutTemplateResponse.copy(l7, l12, str4, list, str3);
    }

    public static final /* synthetic */ void write$Self$strength_workout_release(StrengthWorkoutTemplateResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, longSerializer, self.workoutTemplateKey);
        output.encodeNullableSerializableElement(serialDesc, 1, longSerializer, self.parentTemplateKey);
        output.encodeStringElement(serialDesc, 2, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.workoutGroups, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.workoutGroups);
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getWorkoutTemplateKey() {
        return this.workoutTemplateKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getParentTemplateKey() {
        return this.parentTemplateKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<StrengthWorkoutTemplateGroup> component4() {
        return this.workoutGroups;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final StrengthWorkoutTemplateResponse copy(Long workoutTemplateKey, Long parentTemplateKey, String name, List<StrengthWorkoutTemplateGroup> workoutGroups, String source) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(workoutGroups, "workoutGroups");
        return new StrengthWorkoutTemplateResponse(workoutTemplateKey, parentTemplateKey, name, workoutGroups, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrengthWorkoutTemplateResponse)) {
            return false;
        }
        StrengthWorkoutTemplateResponse strengthWorkoutTemplateResponse = (StrengthWorkoutTemplateResponse) other;
        return AbstractC22676k.m65745e(this.workoutTemplateKey, strengthWorkoutTemplateResponse.workoutTemplateKey) && AbstractC22676k.m65745e(this.parentTemplateKey, strengthWorkoutTemplateResponse.parentTemplateKey) && AbstractC22676k.m65745e(this.name, strengthWorkoutTemplateResponse.name) && AbstractC22676k.m65745e(this.workoutGroups, strengthWorkoutTemplateResponse.workoutGroups) && AbstractC22676k.m65745e(this.source, strengthWorkoutTemplateResponse.source);
    }

    public final String getName() {
        return this.name;
    }

    public final Long getParentTemplateKey() {
        return this.parentTemplateKey;
    }

    public final String getSource() {
        return this.source;
    }

    public final List<StrengthWorkoutTemplateGroup> getWorkoutGroups() {
        return this.workoutGroups;
    }

    public final Long getWorkoutTemplateKey() {
        return this.workoutTemplateKey;
    }

    public int hashCode() {
        Long l7 = this.workoutTemplateKey;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        Long l12 = this.parentTemplateKey;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d((iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.name), 31, this.workoutGroups);
        String str = this.source;
        return iM31983b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Long l7 = this.workoutTemplateKey;
        Long l12 = this.parentTemplateKey;
        String str = this.name;
        List<StrengthWorkoutTemplateGroup> list = this.workoutGroups;
        String str2 = this.source;
        StringBuilder sb4 = new StringBuilder("StrengthWorkoutTemplateResponse(workoutTemplateKey=");
        sb4.append(l7);
        sb4.append(", parentTemplateKey=");
        sb4.append(l12);
        sb4.append(", name=");
        AbstractC36095b.m114694v(str, ", workoutGroups=", ", source=", sb4, list);
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public StrengthWorkoutTemplateResponse(Long l7, Long l12, String name, List<StrengthWorkoutTemplateGroup> workoutGroups, String str) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(workoutGroups, "workoutGroups");
        this.workoutTemplateKey = l7;
        this.parentTemplateKey = l12;
        this.name = name;
        this.workoutGroups = workoutGroups;
        this.source = str;
    }

    public /* synthetic */ StrengthWorkoutTemplateResponse(Long l7, Long l12, String str, List list, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(l7, l12, str, (i13 & 8) != 0 ? C25271y.f99162w : list, str2);
    }
}

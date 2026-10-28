package com.whoop.core.details.activitytargets;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wr1.C37572f;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*Jd\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b9\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b:\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b\u000b\u0010(R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010*¨\u0006A"}, m65681d2 = {"Lcom/whoop/core/details/activitytargets/ActivityTarget;", "", "Lcom/whoop/core/details/activitytargets/ActivityTargetType;", "type", "Lgz0/m0;", "icon", "", "title", "value", "target", "", "isCompleted", "", "Lcom/whoop/core/details/activitytargets/ActivityTargetZone;", "zones", "<init>", "(Lcom/whoop/core/details/activitytargets/ActivityTargetType;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/core/details/activitytargets/ActivityTargetType;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/activitytargets/ActivityTarget;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/core/details/activitytargets/ActivityTargetType;", "component2", "()Lgz0/m0;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/util/List;", "copy", "(Lcom/whoop/core/details/activitytargets/ActivityTargetType;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/whoop/core/details/activitytargets/ActivityTarget;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/core/details/activitytargets/ActivityTargetType;", "getType", "Lgz0/m0;", "getIcon", "Ljava/lang/String;", "getTitle", "getValue", "getTarget", "Ljava/lang/Boolean;", "Ljava/util/List;", "getZones", "Companion", "$serializer", "a", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivityTarget {
    private static final InterfaceC23462h[] $childSerializers;
    private final EnumC16313m0 icon;
    private final Boolean isCompleted;
    private final String target;
    private final String title;
    private final ActivityTargetType type;
    private final String value;
    private final List<ActivityTargetZone> zones;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.core.details.activitytargets.ActivityTarget$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/activitytargets/ActivityTarget$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/activitytargets/ActivityTarget;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivityTarget$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C37572f(3)), AbstractC30060g.m92087G(enumC23463i, new C37572f(4)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C37572f(5))};
    }

    public /* synthetic */ ActivityTarget(int i13, ActivityTargetType activityTargetType, EnumC16313m0 enumC16313m0, String str, String str2, String str3, Boolean bool, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, ActivityTarget$$serializer.INSTANCE.getDescriptor());
        }
        this.type = activityTargetType;
        this.icon = enumC16313m0;
        this.title = str;
        this.value = str2;
        this.target = str3;
        this.isCompleted = bool;
        this.zones = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ActivityTargetType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(ActivityTargetZone$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityTarget copy$default(ActivityTarget activityTarget, ActivityTargetType activityTargetType, EnumC16313m0 enumC16313m0, String str, String str2, String str3, Boolean bool, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            activityTargetType = activityTarget.type;
        }
        if ((i13 & 2) != 0) {
            enumC16313m0 = activityTarget.icon;
        }
        if ((i13 & 4) != 0) {
            str = activityTarget.title;
        }
        if ((i13 & 8) != 0) {
            str2 = activityTarget.value;
        }
        if ((i13 & 16) != 0) {
            str3 = activityTarget.target;
        }
        if ((i13 & 32) != 0) {
            bool = activityTarget.isCompleted;
        }
        if ((i13 & 64) != 0) {
            list = activityTarget.zones;
        }
        Boolean bool2 = bool;
        List list2 = list;
        String str4 = str3;
        String str5 = str;
        return activityTarget.copy(activityTargetType, enumC16313m0, str5, str2, str4, bool2, list2);
    }

    public static final /* synthetic */ void write$Self$core_details_release(ActivityTarget self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.type);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.icon);
        output.encodeStringElement(serialDesc, 2, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.value);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.target);
        output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.isCompleted);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.zones);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ActivityTargetType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsCompleted() {
        return this.isCompleted;
    }

    public final List<ActivityTargetZone> component7() {
        return this.zones;
    }

    public final ActivityTarget copy(ActivityTargetType type, EnumC16313m0 icon, String title, String value, String target, Boolean isCompleted, List<ActivityTargetZone> zones) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        return new ActivityTarget(type, icon, title, value, target, isCompleted, zones);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityTarget)) {
            return false;
        }
        ActivityTarget activityTarget = (ActivityTarget) other;
        return this.type == activityTarget.type && this.icon == activityTarget.icon && AbstractC22676k.m65745e(this.title, activityTarget.title) && AbstractC22676k.m65745e(this.value, activityTarget.value) && AbstractC22676k.m65745e(this.target, activityTarget.target) && AbstractC22676k.m65745e(this.isCompleted, activityTarget.isCompleted) && AbstractC22676k.m65745e(this.zones, activityTarget.zones);
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ActivityTargetType getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final List<ActivityTargetZone> getZones() {
        return this.zones;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC17176i.m48500b(this.icon, this.type.hashCode() * 31, 31), 31, this.title);
        String str = this.value;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.target;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isCompleted;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<ActivityTargetZone> list = this.zones;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final Boolean isCompleted() {
        return this.isCompleted;
    }

    public String toString() {
        ActivityTargetType activityTargetType = this.type;
        EnumC16313m0 enumC16313m0 = this.icon;
        String str = this.title;
        String str2 = this.value;
        String str3 = this.target;
        Boolean bool = this.isCompleted;
        List<ActivityTargetZone> list = this.zones;
        StringBuilder sb4 = new StringBuilder("ActivityTarget(type=");
        sb4.append(activityTargetType);
        sb4.append(", icon=");
        sb4.append(enumC16313m0);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str, ", value=", str2, ", target=");
        AbstractC36095b.m114692t(bool, str3, ", isCompleted=", ", zones=", sb4);
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public ActivityTarget(ActivityTargetType type, EnumC16313m0 icon, String title, String str, String str2, Boolean bool, List<ActivityTargetZone> list) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        this.type = type;
        this.icon = icon;
        this.title = title;
        this.value = str;
        this.target = str2;
        this.isCompleted = bool;
        this.zones = list;
    }
}

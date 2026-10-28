package com.whoop.addactivity.network;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.C21179y0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JT\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u001a\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010#R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010%¨\u0006:"}, m65681d2 = {"Lcom/whoop/addactivity/network/CreateActivityRequestV1;", "", "", "activityInternalName", "", "garmentId", "startTime", "endTime", "", "gpsEnabled", "", "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;", "pauseSegments", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Z", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/whoop/addactivity/network/CreateActivityRequestV1;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivityInternalName", "I", "getGarmentId", "getStartTime", "getEndTime", "Z", "getGpsEnabled", "Ljava/util/List;", "getPauseSegments", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CreateActivityRequestV1 {

    @SerializedName("activity_internal_name")
    private final String activityInternalName;

    @SerializedName("end_time")
    private final String endTime;

    @SerializedName("garment_id")
    private final int garmentId;

    @SerializedName("gps_enabled")
    private final boolean gpsEnabled;

    @SerializedName("pause_segments")
    private final List<CreateActivityPauseSegment> pauseSegments;

    @SerializedName("start_time")
    private final String startTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21179y0(9))};

    /* JADX INFO: renamed from: com.whoop.addactivity.network.CreateActivityRequestV1$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/addactivity/network/CreateActivityRequestV1$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/addactivity/network/CreateActivityRequestV1;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CreateActivityRequestV1$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreateActivityRequestV1(int i13, String str, int i14, String str2, String str3, boolean z4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, CreateActivityRequestV1$$serializer.INSTANCE.getDescriptor());
        }
        this.activityInternalName = str;
        this.garmentId = i14;
        this.startTime = str2;
        this.endTime = str3;
        this.gpsEnabled = z4;
        if ((i13 & 32) == 0) {
            this.pauseSegments = null;
        } else {
            this.pauseSegments = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CreateActivityPauseSegment$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateActivityRequestV1 copy$default(CreateActivityRequestV1 createActivityRequestV1, String str, int i13, String str2, String str3, boolean z4, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = createActivityRequestV1.activityInternalName;
        }
        if ((i14 & 2) != 0) {
            i13 = createActivityRequestV1.garmentId;
        }
        if ((i14 & 4) != 0) {
            str2 = createActivityRequestV1.startTime;
        }
        if ((i14 & 8) != 0) {
            str3 = createActivityRequestV1.endTime;
        }
        if ((i14 & 16) != 0) {
            z4 = createActivityRequestV1.gpsEnabled;
        }
        if ((i14 & 32) != 0) {
            list = createActivityRequestV1.pauseSegments;
        }
        boolean z13 = z4;
        List list2 = list;
        return createActivityRequestV1.copy(str, i13, str2, str3, z13, list2);
    }

    public static final /* synthetic */ void write$Self$core_release(CreateActivityRequestV1 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.activityInternalName);
        output.encodeIntElement(serialDesc, 1, self.garmentId);
        output.encodeStringElement(serialDesc, 2, self.startTime);
        output.encodeStringElement(serialDesc, 3, self.endTime);
        output.encodeBooleanElement(serialDesc, 4, self.gpsEnabled);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.pauseSegments == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.pauseSegments);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityInternalName() {
        return this.activityInternalName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGarmentId() {
        return this.garmentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getGpsEnabled() {
        return this.gpsEnabled;
    }

    public final List<CreateActivityPauseSegment> component6() {
        return this.pauseSegments;
    }

    public final CreateActivityRequestV1 copy(String activityInternalName, int garmentId, String startTime, String endTime, boolean gpsEnabled, List<CreateActivityPauseSegment> pauseSegments) {
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        return new CreateActivityRequestV1(activityInternalName, garmentId, startTime, endTime, gpsEnabled, pauseSegments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateActivityRequestV1)) {
            return false;
        }
        CreateActivityRequestV1 createActivityRequestV1 = (CreateActivityRequestV1) other;
        return AbstractC22676k.m65745e(this.activityInternalName, createActivityRequestV1.activityInternalName) && this.garmentId == createActivityRequestV1.garmentId && AbstractC22676k.m65745e(this.startTime, createActivityRequestV1.startTime) && AbstractC22676k.m65745e(this.endTime, createActivityRequestV1.endTime) && this.gpsEnabled == createActivityRequestV1.gpsEnabled && AbstractC22676k.m65745e(this.pauseSegments, createActivityRequestV1.pauseSegments);
    }

    public final String getActivityInternalName() {
        return this.activityInternalName;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final int getGarmentId() {
        return this.garmentId;
    }

    public final boolean getGpsEnabled() {
        return this.gpsEnabled;
    }

    public final List<CreateActivityPauseSegment> getPauseSegments() {
        return this.pauseSegments;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.garmentId, this.activityInternalName.hashCode() * 31, 31), 31, this.startTime), 31, this.endTime), 31, this.gpsEnabled);
        List<CreateActivityPauseSegment> list = this.pauseSegments;
        return iM8289b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.activityInternalName;
        int i13 = this.garmentId;
        String str2 = this.startTime;
        String str3 = this.endTime;
        boolean z4 = this.gpsEnabled;
        List<CreateActivityPauseSegment> list = this.pauseSegments;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "CreateActivityRequestV1(activityInternalName=", str, ", garmentId=", ", startTime=");
        AbstractC11266d.m30444B(sbM30467u, str2, ", endTime=", str3, ", gpsEnabled=");
        sbM30467u.append(z4);
        sbM30467u.append(", pauseSegments=");
        sbM30467u.append(list);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public CreateActivityRequestV1(String activityInternalName, int i13, String startTime, String endTime, boolean z4, List<CreateActivityPauseSegment> list) {
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        this.activityInternalName = activityInternalName;
        this.garmentId = i13;
        this.startTime = startTime;
        this.endTime = endTime;
        this.gpsEnabled = z4;
        this.pauseSegments = list;
    }

    public /* synthetic */ CreateActivityRequestV1(String str, int i13, String str2, String str3, boolean z4, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, str2, str3, z4, (i14 & 32) != 0 ? null : list);
    }
}

package com.whoop.addactivity.network;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010 ¨\u00063"}, m65681d2 = {"Lcom/whoop/addactivity/network/CreateActivityRequest;", "", "", "sportId", "garmentId", "", "startTime", "endTime", "", "gpsEnabled", "<init>", "(IILjava/lang/String;Ljava/lang/String;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/addactivity/network/CreateActivityRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Z", "copy", "(IILjava/lang/String;Ljava/lang/String;Z)Lcom/whoop/addactivity/network/CreateActivityRequest;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getSportId", "getGarmentId", "Ljava/lang/String;", "getStartTime", "getEndTime", "Z", "getGpsEnabled", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CreateActivityRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("end_time")
    private final String endTime;

    @SerializedName("garment_id")
    private final int garmentId;

    @SerializedName("gps_enabled")
    private final boolean gpsEnabled;

    @SerializedName("sport_id")
    private final int sportId;

    @SerializedName("start_time")
    private final String startTime;

    /* JADX INFO: renamed from: com.whoop.addactivity.network.CreateActivityRequest$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/addactivity/network/CreateActivityRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/addactivity/network/CreateActivityRequest;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CreateActivityRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreateActivityRequest(int i13, int i14, int i15, String str, String str2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, CreateActivityRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sportId = i14;
        this.garmentId = i15;
        this.startTime = str;
        this.endTime = str2;
        this.gpsEnabled = z4;
    }

    public static /* synthetic */ CreateActivityRequest copy$default(CreateActivityRequest createActivityRequest, int i13, int i14, String str, String str2, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = createActivityRequest.sportId;
        }
        if ((i15 & 2) != 0) {
            i14 = createActivityRequest.garmentId;
        }
        if ((i15 & 4) != 0) {
            str = createActivityRequest.startTime;
        }
        if ((i15 & 8) != 0) {
            str2 = createActivityRequest.endTime;
        }
        if ((i15 & 16) != 0) {
            z4 = createActivityRequest.gpsEnabled;
        }
        boolean z13 = z4;
        String str3 = str;
        return createActivityRequest.copy(i13, i14, str3, str2, z13);
    }

    public static final /* synthetic */ void write$Self$core_release(CreateActivityRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.sportId);
        output.encodeIntElement(serialDesc, 1, self.garmentId);
        output.encodeStringElement(serialDesc, 2, self.startTime);
        output.encodeStringElement(serialDesc, 3, self.endTime);
        output.encodeBooleanElement(serialDesc, 4, self.gpsEnabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSportId() {
        return this.sportId;
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

    public final CreateActivityRequest copy(int sportId, int garmentId, String startTime, String endTime, boolean gpsEnabled) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        return new CreateActivityRequest(sportId, garmentId, startTime, endTime, gpsEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateActivityRequest)) {
            return false;
        }
        CreateActivityRequest createActivityRequest = (CreateActivityRequest) other;
        return this.sportId == createActivityRequest.sportId && this.garmentId == createActivityRequest.garmentId && AbstractC22676k.m65745e(this.startTime, createActivityRequest.startTime) && AbstractC22676k.m65745e(this.endTime, createActivityRequest.endTime) && this.gpsEnabled == createActivityRequest.gpsEnabled;
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

    public final int getSportId() {
        return this.sportId;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Boolean.hashCode(this.gpsEnabled) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.garmentId, Integer.hashCode(this.sportId) * 31, 31), 31, this.startTime), 31, this.endTime);
    }

    public String toString() {
        int i13 = this.sportId;
        int i14 = this.garmentId;
        String str = this.startTime;
        String str2 = this.endTime;
        boolean z4 = this.gpsEnabled;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "CreateActivityRequest(sportId=", ", garmentId=", ", startTime=");
        AbstractC11266d.m30444B(sbM30465s, str, ", endTime=", str2, ", gpsEnabled=");
        return AbstractC18489d0.m53372m(sbM30465s, z4, ")");
    }

    public CreateActivityRequest(int i13, int i14, String startTime, String endTime, boolean z4) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        this.sportId = i13;
        this.garmentId = i14;
        this.startTime = startTime;
        this.endTime = endTime;
        this.gpsEnabled = z4;
    }
}

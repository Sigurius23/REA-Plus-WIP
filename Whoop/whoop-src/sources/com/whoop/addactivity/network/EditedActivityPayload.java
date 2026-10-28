package com.whoop.addactivity.network;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0018¨\u0006/"}, m65681d2 = {"Lcom/whoop/addactivity/network/EditedActivityPayload;", "", "", "activityInternalName", "", "garmentId", "startTime", "endTime", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/addactivity/network/EditedActivityPayload;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/addactivity/network/EditedActivityPayload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivityInternalName", "Ljava/lang/Integer;", "getGarmentId", "getStartTime", "getEndTime", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EditedActivityPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("activity_internal_name")
    private final String activityInternalName;

    @SerializedName("end_time")
    private final String endTime;

    @SerializedName("garment_id")
    private final Integer garmentId;

    @SerializedName("start_time")
    private final String startTime;

    /* JADX INFO: renamed from: com.whoop.addactivity.network.EditedActivityPayload$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/addactivity/network/EditedActivityPayload$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/addactivity/network/EditedActivityPayload;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EditedActivityPayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EditedActivityPayload(int i13, String str, Integer num, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, EditedActivityPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.activityInternalName = str;
        this.garmentId = num;
        this.startTime = str2;
        this.endTime = str3;
    }

    public static /* synthetic */ EditedActivityPayload copy$default(EditedActivityPayload editedActivityPayload, String str, Integer num, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = editedActivityPayload.activityInternalName;
        }
        if ((i13 & 2) != 0) {
            num = editedActivityPayload.garmentId;
        }
        if ((i13 & 4) != 0) {
            str2 = editedActivityPayload.startTime;
        }
        if ((i13 & 8) != 0) {
            str3 = editedActivityPayload.endTime;
        }
        return editedActivityPayload.copy(str, num, str2, str3);
    }

    public static final /* synthetic */ void write$Self$core_release(EditedActivityPayload self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.activityInternalName);
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.garmentId);
        output.encodeStringElement(serialDesc, 2, self.startTime);
        output.encodeStringElement(serialDesc, 3, self.endTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityInternalName() {
        return this.activityInternalName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getGarmentId() {
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

    public final EditedActivityPayload copy(String activityInternalName, Integer garmentId, String startTime, String endTime) {
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        return new EditedActivityPayload(activityInternalName, garmentId, startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditedActivityPayload)) {
            return false;
        }
        EditedActivityPayload editedActivityPayload = (EditedActivityPayload) other;
        return AbstractC22676k.m65745e(this.activityInternalName, editedActivityPayload.activityInternalName) && AbstractC22676k.m65745e(this.garmentId, editedActivityPayload.garmentId) && AbstractC22676k.m65745e(this.startTime, editedActivityPayload.startTime) && AbstractC22676k.m65745e(this.endTime, editedActivityPayload.endTime);
    }

    public final String getActivityInternalName() {
        return this.activityInternalName;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final Integer getGarmentId() {
        return this.garmentId;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iHashCode = this.activityInternalName.hashCode() * 31;
        Integer num = this.garmentId;
        return this.endTime.hashCode() + AbstractC11266d.m30450d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.startTime);
    }

    public String toString() {
        String str = this.activityInternalName;
        Integer num = this.garmentId;
        String str2 = this.startTime;
        String str3 = this.endTime;
        StringBuilder sb4 = new StringBuilder("EditedActivityPayload(activityInternalName=");
        sb4.append(str);
        sb4.append(", garmentId=");
        sb4.append(num);
        sb4.append(", startTime=");
        return AbstractC11266d.m30464r(sb4, str2, ", endTime=", str3, ")");
    }

    public EditedActivityPayload(String activityInternalName, Integer num, String startTime, String endTime) {
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        this.activityInternalName = activityInternalName;
        this.garmentId = num;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}

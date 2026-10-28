package com.whoop.shepherd.feature.togglesettings.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u0016¨\u0006+"}, m65681d2 = {"Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;", "", "", "detectionOn", "notificationOn", "<init>", "(ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getDetectionOn", "getDetectionOn$annotations", "()V", "getNotificationOn", "getNotificationOn$annotations", "Companion", "$serializer", "a", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdSettingsUpdateRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("detection_enabled")
    private final boolean detectionOn;

    @SerializedName("notification_enabled")
    private final boolean notificationOn;

    /* JADX INFO: renamed from: com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdSettingsUpdateRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdSettingsUpdateRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShepherdSettingsUpdateRequest(int i13, boolean z4, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ShepherdSettingsUpdateRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.detectionOn = z4;
        this.notificationOn = z13;
    }

    public static /* synthetic */ ShepherdSettingsUpdateRequest copy$default(ShepherdSettingsUpdateRequest shepherdSettingsUpdateRequest, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = shepherdSettingsUpdateRequest.detectionOn;
        }
        if ((i13 & 2) != 0) {
            z13 = shepherdSettingsUpdateRequest.notificationOn;
        }
        return shepherdSettingsUpdateRequest.copy(z4, z13);
    }

    @InterfaceC37143h("detection_enabled")
    public static /* synthetic */ void getDetectionOn$annotations() {
    }

    @InterfaceC37143h("notification_enabled")
    public static /* synthetic */ void getNotificationOn$annotations() {
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdSettingsUpdateRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.detectionOn);
        output.encodeBooleanElement(serialDesc, 1, self.notificationOn);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDetectionOn() {
        return this.detectionOn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNotificationOn() {
        return this.notificationOn;
    }

    public final ShepherdSettingsUpdateRequest copy(boolean detectionOn, boolean notificationOn) {
        return new ShepherdSettingsUpdateRequest(detectionOn, notificationOn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdSettingsUpdateRequest)) {
            return false;
        }
        ShepherdSettingsUpdateRequest shepherdSettingsUpdateRequest = (ShepherdSettingsUpdateRequest) other;
        return this.detectionOn == shepherdSettingsUpdateRequest.detectionOn && this.notificationOn == shepherdSettingsUpdateRequest.notificationOn;
    }

    public final boolean getDetectionOn() {
        return this.detectionOn;
    }

    public final boolean getNotificationOn() {
        return this.notificationOn;
    }

    public int hashCode() {
        return Boolean.hashCode(this.notificationOn) + (Boolean.hashCode(this.detectionOn) * 31);
    }

    public String toString() {
        return AbstractC30802r.m94762k("ShepherdSettingsUpdateRequest(detectionOn=", ", notificationOn=", ")", this.detectionOn, this.notificationOn);
    }

    public ShepherdSettingsUpdateRequest(boolean z4, boolean z13) {
        this.detectionOn = z4;
        this.notificationOn = z13;
    }
}

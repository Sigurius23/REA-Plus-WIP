package io.getstream.video.android.core.notifications.internal.storage;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.video.android.model.Device;
import io.getstream.video.android.model.Device$$serializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, m65681d2 = {"Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;", "", "Lio/getstream/video/android/model/Device;", "userDevice", "<init>", "(Lio/getstream/video/android/model/Device;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILio/getstream/video/android/model/Device;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stream_video_android_core_release", "(Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lio/getstream/video/android/model/Device;", "copy", "(Lio/getstream/video/android/model/Device;)Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/getstream/video/android/model/Device;", "getUserDevice", "Companion", "$serializer", "io/getstream/video/android/core/notifications/internal/storage/a", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DevicePreferences {
    public static final C19966a Companion = new C19966a();
    private final Device userDevice;

    /* JADX WARN: Multi-variable type inference failed */
    public DevicePreferences() {
        this((Device) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ DevicePreferences copy$default(DevicePreferences devicePreferences, Device device, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            device = devicePreferences.userDevice;
        }
        return devicePreferences.copy(device);
    }

    public static final /* synthetic */ void write$Self$stream_video_android_core_release(DevicePreferences self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.userDevice == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, Device$$serializer.INSTANCE, self.userDevice);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Device getUserDevice() {
        return this.userDevice;
    }

    public final DevicePreferences copy(Device userDevice) {
        return new DevicePreferences(userDevice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DevicePreferences) && AbstractC22676k.m65745e(this.userDevice, ((DevicePreferences) other).userDevice);
    }

    public final Device getUserDevice() {
        return this.userDevice;
    }

    public int hashCode() {
        Device device = this.userDevice;
        if (device == null) {
            return 0;
        }
        return device.hashCode();
    }

    public String toString() {
        return "DevicePreferences(userDevice=" + this.userDevice + ")";
    }

    @InterfaceC23457c
    public /* synthetic */ DevicePreferences(int i13, Device device, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.userDevice = null;
        } else {
            this.userDevice = device;
        }
    }

    public DevicePreferences(Device device) {
        this.userDevice = device;
    }

    public /* synthetic */ DevicePreferences(Device device, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : device);
    }
}

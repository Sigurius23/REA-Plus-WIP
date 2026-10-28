package io.getstream.video.android.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006'"}, m65681d2 = {"Lio/getstream/video/android/model/UserDevices;", "", "", "Lio/getstream/video/android/model/Device;", "devices", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stream_video_android_core_release", "(Lio/getstream/video/android/model/UserDevices;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/getstream/video/android/model/UserDevices;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDevices", "Companion", "$serializer", "io/getstream/video/android/model/d", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserDevices {
    private final List<Device> devices;
    public static final C19973d Companion = new C19973d();
    private static final InterfaceC37138c[] $childSerializers = {new ArrayListSerializer(Device$$serializer.INSTANCE)};

    /* JADX WARN: Multi-variable type inference failed */
    public UserDevices() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserDevices copy$default(UserDevices userDevices, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = userDevices.devices;
        }
        return userDevices.copy(list);
    }

    public static final /* synthetic */ void write$Self$stream_video_android_core_release(UserDevices self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && AbstractC22676k.m65745e(self.devices, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.devices);
    }

    public final List<Device> component1() {
        return this.devices;
    }

    public final UserDevices copy(List<Device> devices) {
        AbstractC22676k.m65750j(devices, "devices");
        return new UserDevices(devices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserDevices) && AbstractC22676k.m65745e(this.devices, ((UserDevices) other).devices);
    }

    public final List<Device> getDevices() {
        return this.devices;
    }

    public int hashCode() {
        return this.devices.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("UserDevices(devices=", ")", this.devices);
    }

    @InterfaceC23457c
    public /* synthetic */ UserDevices(int i13, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.devices = C25271y.f99162w;
        } else {
            this.devices = list;
        }
    }

    public UserDevices(List<Device> devices) {
        AbstractC22676k.m65750j(devices, "devices");
        this.devices = devices;
    }

    public /* synthetic */ UserDevices(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list);
    }
}

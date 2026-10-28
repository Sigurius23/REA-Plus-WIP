package io.getstream.video.android.datastore.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import io.getstream.video.android.model.Device;
import io.getstream.video.android.model.Device$$serializer;
import io.getstream.video.android.model.User;
import io.getstream.video.android.model.User$$serializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\f\b\u0002\u0010\b\u001a\u00060\u0004j\u0002`\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBO\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u001d\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u001f\u001a\u00060\u0004j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!JD\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0002\u0010\b\u001a\u00060\u0004j\u0002`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001cR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001eR\u001b\u0010\b\u001a\u00060\u0004j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010!¨\u00065"}, m65681d2 = {"Lio/getstream/video/android/datastore/model/StreamUserPreferences;", "", "Lio/getstream/video/android/model/User;", UserState.Sources.USER, "", "Lio/getstream/video/android/model/ApiKey;", "apiKey", "Lio/getstream/video/android/model/UserToken;", "userToken", "Lio/getstream/video/android/model/Device;", "userDevice", "<init>", "(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stream_video_android_core_release", "(Lio/getstream/video/android/datastore/model/StreamUserPreferences;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lio/getstream/video/android/model/User;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lio/getstream/video/android/model/Device;", "copy", "(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;)Lio/getstream/video/android/datastore/model/StreamUserPreferences;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/getstream/video/android/model/User;", "getUser", "Ljava/lang/String;", "getApiKey", "getUserToken", "Lio/getstream/video/android/model/Device;", "getUserDevice", "Companion", "$serializer", "io/getstream/video/android/datastore/model/a", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StreamUserPreferences {
    public static final C19969a Companion = new C19969a();
    private final String apiKey;
    private final User user;
    private final Device userDevice;
    private final String userToken;

    public StreamUserPreferences() {
        this((User) null, (String) null, (String) null, (Device) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StreamUserPreferences copy$default(StreamUserPreferences streamUserPreferences, User user, String str, String str2, Device device, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            user = streamUserPreferences.user;
        }
        if ((i13 & 2) != 0) {
            str = streamUserPreferences.apiKey;
        }
        if ((i13 & 4) != 0) {
            str2 = streamUserPreferences.userToken;
        }
        if ((i13 & 8) != 0) {
            device = streamUserPreferences.userDevice;
        }
        return streamUserPreferences.copy(user, str, str2, device);
    }

    public static final /* synthetic */ void write$Self$stream_video_android_core_release(StreamUserPreferences self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.user != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, User$$serializer.INSTANCE, self.user);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.apiKey, "")) {
            output.encodeStringElement(serialDesc, 1, self.apiKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.userToken, "")) {
            output.encodeStringElement(serialDesc, 2, self.userToken);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.userDevice == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, Device$$serializer.INSTANCE, self.userDevice);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserToken() {
        return this.userToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Device getUserDevice() {
        return this.userDevice;
    }

    public final StreamUserPreferences copy(User user, String apiKey, String userToken, Device userDevice) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(userToken, "userToken");
        return new StreamUserPreferences(user, apiKey, userToken, userDevice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamUserPreferences)) {
            return false;
        }
        StreamUserPreferences streamUserPreferences = (StreamUserPreferences) other;
        return AbstractC22676k.m65745e(this.user, streamUserPreferences.user) && AbstractC22676k.m65745e(this.apiKey, streamUserPreferences.apiKey) && AbstractC22676k.m65745e(this.userToken, streamUserPreferences.userToken) && AbstractC22676k.m65745e(this.userDevice, streamUserPreferences.userDevice);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final User getUser() {
        return this.user;
    }

    public final Device getUserDevice() {
        return this.userDevice;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        User user = this.user;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((user == null ? 0 : user.hashCode()) * 31, 31, this.apiKey), 31, this.userToken);
        Device device = this.userDevice;
        return iM30450d + (device != null ? device.hashCode() : 0);
    }

    public String toString() {
        return "StreamUserPreferences(user=" + this.user + ", apiKey=" + this.apiKey + ", userToken=" + this.userToken + ", userDevice=" + this.userDevice + ")";
    }

    @InterfaceC23457c
    public /* synthetic */ StreamUserPreferences(int i13, User user, String str, String str2, Device device, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i13 & 2) == 0) {
            this.apiKey = "";
        } else {
            this.apiKey = str;
        }
        if ((i13 & 4) == 0) {
            this.userToken = "";
        } else {
            this.userToken = str2;
        }
        if ((i13 & 8) == 0) {
            this.userDevice = null;
        } else {
            this.userDevice = device;
        }
    }

    public StreamUserPreferences(User user, String apiKey, String userToken, Device device) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(userToken, "userToken");
        this.user = user;
        this.apiKey = apiKey;
        this.userToken = userToken;
        this.userDevice = device;
    }

    public /* synthetic */ StreamUserPreferences(User user, String str, String str2, Device device, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : user, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? null : device);
    }
}

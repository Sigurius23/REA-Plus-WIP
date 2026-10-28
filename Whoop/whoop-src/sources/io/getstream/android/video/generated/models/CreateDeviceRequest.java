package io.getstream.android.video.generated.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JF\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CreateDeviceRequest;", "", "id", "", "pushProvider", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;", "hardwareId", "pushProviderName", "voipToken", "", "(Ljava/lang/String;Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getHardwareId", "()Ljava/lang/String;", "getId", "getPushProvider", "()Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;", "getPushProviderName", "getVoipToken", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/CreateDeviceRequest;", "equals", "other", "hashCode", "", "toString", "PushProvider", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CreateDeviceRequest {
    private final String hardwareId;
    private final String id;
    private final PushProvider pushProvider;
    private final String pushProviderName;
    private final Boolean voipToken;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0007\b\t\n\u000b\f\r\u000eB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Apn", "Companion", "Firebase", "Huawei", "PushProviderAdapter", "Unknown", "Xiaomi", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Apn;", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Firebase;", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Huawei;", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Unknown;", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Xiaomi;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class PushProvider {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Apn;", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Apn extends PushProvider {
            public static final Apn INSTANCE = new Apn();

            private Apn() {
                super("apn", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final PushProvider fromString(String s13) {
                AbstractC22676k.m65750j(s13, "s");
                switch (s13.hashCode()) {
                    case -1206476313:
                        if (s13.equals("huawei")) {
                            return Huawei.INSTANCE;
                        }
                        break;
                    case -759499589:
                        if (s13.equals("xiaomi")) {
                            return Xiaomi.INSTANCE;
                        }
                        break;
                    case -563351033:
                        if (s13.equals("firebase")) {
                            return Firebase.INSTANCE;
                        }
                        break;
                    case 96799:
                        if (s13.equals("apn")) {
                            return Apn.INSTANCE;
                        }
                        break;
                }
                return new Unknown(s13);
            }

            private Companion() {
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Firebase;", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Firebase extends PushProvider {
            public static final Firebase INSTANCE = new Firebase();

            private Firebase() {
                super("firebase", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Huawei;", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Huawei extends PushProvider {
            public static final Huawei INSTANCE = new Huawei();

            private Huawei() {
                super("huawei", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$PushProviderAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class PushProviderAdapter extends JsonAdapter<PushProvider> {
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public PushProvider fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                String strNextString = reader.nextString();
                if (strNextString == null) {
                    return null;
                }
                return PushProvider.INSTANCE.fromString(strNextString);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, PushProvider value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.mo94362F0(value != null ? value.getValue() : null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Unknown;", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final /* data */ class Unknown extends PushProvider {
            private final String unknownValue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unknown(String unknownValue) {
                super(unknownValue, null);
                AbstractC22676k.m65750j(unknownValue, "unknownValue");
                this.unknownValue = unknownValue;
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = unknown.unknownValue;
                }
                return unknown.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUnknownValue() {
                return this.unknownValue;
            }

            public final Unknown copy(String unknownValue) {
                AbstractC22676k.m65750j(unknownValue, "unknownValue");
                return new Unknown(unknownValue);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unknown) && AbstractC22676k.m65745e(this.unknownValue, ((Unknown) other).unknownValue);
            }

            public final String getUnknownValue() {
                return this.unknownValue;
            }

            public int hashCode() {
                return this.unknownValue.hashCode();
            }

            @Override // io.getstream.android.video.generated.models.CreateDeviceRequest.PushProvider
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Xiaomi;", "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Xiaomi extends PushProvider {
            public static final Xiaomi INSTANCE = new Xiaomi();

            private Xiaomi() {
                super("xiaomi", null);
            }
        }

        public /* synthetic */ PushProvider(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }

        private PushProvider(String str) {
            this.value = str;
        }
    }

    public CreateDeviceRequest(@InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "push_provider") PushProvider pushProvider, @InterfaceC30731q(name = "hardware_id") String str, @InterfaceC30731q(name = "push_provider_name") String str2, @InterfaceC30731q(name = "voip_token") Boolean bool) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pushProvider, "pushProvider");
        this.id = id4;
        this.pushProvider = pushProvider;
        this.hardwareId = str;
        this.pushProviderName = str2;
        this.voipToken = bool;
    }

    public static /* synthetic */ CreateDeviceRequest copy$default(CreateDeviceRequest createDeviceRequest, String str, PushProvider pushProvider, String str2, String str3, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = createDeviceRequest.id;
        }
        if ((i13 & 2) != 0) {
            pushProvider = createDeviceRequest.pushProvider;
        }
        if ((i13 & 4) != 0) {
            str2 = createDeviceRequest.hardwareId;
        }
        if ((i13 & 8) != 0) {
            str3 = createDeviceRequest.pushProviderName;
        }
        if ((i13 & 16) != 0) {
            bool = createDeviceRequest.voipToken;
        }
        Boolean bool2 = bool;
        String str4 = str2;
        return createDeviceRequest.copy(str, pushProvider, str4, str3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PushProvider getPushProvider() {
        return this.pushProvider;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHardwareId() {
        return this.hardwareId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPushProviderName() {
        return this.pushProviderName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getVoipToken() {
        return this.voipToken;
    }

    public final CreateDeviceRequest copy(@InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "push_provider") PushProvider pushProvider, @InterfaceC30731q(name = "hardware_id") String hardwareId, @InterfaceC30731q(name = "push_provider_name") String pushProviderName, @InterfaceC30731q(name = "voip_token") Boolean voipToken) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pushProvider, "pushProvider");
        return new CreateDeviceRequest(id4, pushProvider, hardwareId, pushProviderName, voipToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateDeviceRequest)) {
            return false;
        }
        CreateDeviceRequest createDeviceRequest = (CreateDeviceRequest) other;
        return AbstractC22676k.m65745e(this.id, createDeviceRequest.id) && AbstractC22676k.m65745e(this.pushProvider, createDeviceRequest.pushProvider) && AbstractC22676k.m65745e(this.hardwareId, createDeviceRequest.hardwareId) && AbstractC22676k.m65745e(this.pushProviderName, createDeviceRequest.pushProviderName) && AbstractC22676k.m65745e(this.voipToken, createDeviceRequest.voipToken);
    }

    public final String getHardwareId() {
        return this.hardwareId;
    }

    public final String getId() {
        return this.id;
    }

    public final PushProvider getPushProvider() {
        return this.pushProvider;
    }

    public final String getPushProviderName() {
        return this.pushProviderName;
    }

    public final Boolean getVoipToken() {
        return this.voipToken;
    }

    public int hashCode() {
        int iHashCode = (this.pushProvider.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.hardwareId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pushProviderName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.voipToken;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        PushProvider pushProvider = this.pushProvider;
        String str2 = this.hardwareId;
        String str3 = this.pushProviderName;
        Boolean bool = this.voipToken;
        StringBuilder sb4 = new StringBuilder("CreateDeviceRequest(id=");
        sb4.append(str);
        sb4.append(", pushProvider=");
        sb4.append(pushProvider);
        sb4.append(", hardwareId=");
        AbstractC11266d.m30444B(sb4, str2, ", pushProviderName=", str3, ", voipToken=");
        return AbstractC11478a.m30858j(sb4, bool, ")");
    }

    public /* synthetic */ CreateDeviceRequest(String str, PushProvider pushProvider, String str2, String str3, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, pushProvider, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : bool);
    }
}

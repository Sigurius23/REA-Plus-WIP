package io.getstream.android.video.generated.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
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
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest;", "", "name", "", "streamUrl", "quality", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "streamKey", "layout", "Lio/getstream/android/video/generated/models/LayoutSettingsRequest;", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;Ljava/lang/String;Lio/getstream/android/video/generated/models/LayoutSettingsRequest;)V", "getLayout", "()Lio/getstream/android/video/generated/models/LayoutSettingsRequest;", "getName", "()Ljava/lang/String;", "getQuality", "()Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "getStreamKey", "getStreamUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Quality", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class RTMPBroadcastRequest {
    private final LayoutSettingsRequest layout;
    private final String name;
    private final Quality quality;
    private final String streamKey;
    private final String streamUrl;

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\r\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Companion", "Portrait1080x1920", "Portrait1440x2560", "Portrait360x640", "Portrait480x854", "Portrait720x1280", "Quality1080p", "Quality1440p", "Quality360p", "Quality480p", "Quality720p", "QualityAdapter", "Unknown", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Portrait1080x1920;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Portrait1440x2560;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Portrait360x640;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Portrait480x854;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Portrait720x1280;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality1080p;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality1440p;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality360p;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality480p;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality720p;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Quality {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final Quality fromString(String s13) {
                AbstractC22676k.m65750j(s13, "s");
                switch (s13.hashCode()) {
                    case -1301276363:
                        if (s13.equals("portrait-360x640")) {
                            return Portrait360x640.INSTANCE;
                        }
                        break;
                    case -356512423:
                        if (s13.equals("portrait-480x854")) {
                            return Portrait480x854.INSTANCE;
                        }
                        break;
                    case 1572835:
                        if (s13.equals("360p")) {
                            return Quality360p.INSTANCE;
                        }
                        break;
                    case 1604548:
                        if (s13.equals("480p")) {
                            return Quality480p.INSTANCE;
                        }
                        break;
                    case 1688155:
                        if (s13.equals("720p")) {
                            return Quality720p.INSTANCE;
                        }
                        break;
                    case 46737913:
                        if (s13.equals("1080p")) {
                            return Quality1080p.INSTANCE;
                        }
                        break;
                    case 46853233:
                        if (s13.equals("1440p")) {
                            return Quality1440p.INSTANCE;
                        }
                        break;
                    case 987801732:
                        if (s13.equals("portrait-1440x2560")) {
                            return Portrait1440x2560.INSTANCE;
                        }
                        break;
                    case 1736214446:
                        if (s13.equals("portrait-720x1280")) {
                            return Portrait720x1280.INSTANCE;
                        }
                        break;
                    case 1861516341:
                        if (s13.equals("portrait-1080x1920")) {
                            return Portrait1080x1920.INSTANCE;
                        }
                        break;
                }
                return new Unknown(s13);
            }

            private Companion() {
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Portrait1080x1920;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Portrait1080x1920 extends Quality {
            public static final Portrait1080x1920 INSTANCE = new Portrait1080x1920();

            private Portrait1080x1920() {
                super("portrait-1080x1920", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Portrait1440x2560;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Portrait1440x2560 extends Quality {
            public static final Portrait1440x2560 INSTANCE = new Portrait1440x2560();

            private Portrait1440x2560() {
                super("portrait-1440x2560", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Portrait360x640;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Portrait360x640 extends Quality {
            public static final Portrait360x640 INSTANCE = new Portrait360x640();

            private Portrait360x640() {
                super("portrait-360x640", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Portrait480x854;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Portrait480x854 extends Quality {
            public static final Portrait480x854 INSTANCE = new Portrait480x854();

            private Portrait480x854() {
                super("portrait-480x854", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Portrait720x1280;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Portrait720x1280 extends Quality {
            public static final Portrait720x1280 INSTANCE = new Portrait720x1280();

            private Portrait720x1280() {
                super("portrait-720x1280", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality1080p;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Quality1080p extends Quality {
            public static final Quality1080p INSTANCE = new Quality1080p();

            private Quality1080p() {
                super("1080p", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality1440p;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Quality1440p extends Quality {
            public static final Quality1440p INSTANCE = new Quality1440p();

            private Quality1440p() {
                super("1440p", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality360p;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Quality360p extends Quality {
            public static final Quality360p INSTANCE = new Quality360p();

            private Quality360p() {
                super("360p", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality480p;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Quality480p extends Quality {
            public static final Quality480p INSTANCE = new Quality480p();

            private Quality480p() {
                super("480p", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality720p;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Quality720p extends Quality {
            public static final Quality720p INSTANCE = new Quality720p();

            private Quality720p() {
                super("720p", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$QualityAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class QualityAdapter extends JsonAdapter<Quality> {
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public Quality fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                String strNextString = reader.nextString();
                if (strNextString == null) {
                    return null;
                }
                return Quality.INSTANCE.fromString(strNextString);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, Quality value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.mo94362F0(value != null ? value.getValue() : null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Unknown;", "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final /* data */ class Unknown extends Quality {
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

            @Override // io.getstream.android.video.generated.models.RTMPBroadcastRequest.Quality
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        public /* synthetic */ Quality(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }

        private Quality(String str) {
            this.value = str;
        }
    }

    public RTMPBroadcastRequest(@InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "stream_url") String streamUrl, @InterfaceC30731q(name = "quality") Quality quality, @InterfaceC30731q(name = "stream_key") String str, @InterfaceC30731q(name = "layout") LayoutSettingsRequest layoutSettingsRequest) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(streamUrl, "streamUrl");
        this.name = name;
        this.streamUrl = streamUrl;
        this.quality = quality;
        this.streamKey = str;
        this.layout = layoutSettingsRequest;
    }

    public static /* synthetic */ RTMPBroadcastRequest copy$default(RTMPBroadcastRequest rTMPBroadcastRequest, String str, String str2, Quality quality, String str3, LayoutSettingsRequest layoutSettingsRequest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = rTMPBroadcastRequest.name;
        }
        if ((i13 & 2) != 0) {
            str2 = rTMPBroadcastRequest.streamUrl;
        }
        if ((i13 & 4) != 0) {
            quality = rTMPBroadcastRequest.quality;
        }
        if ((i13 & 8) != 0) {
            str3 = rTMPBroadcastRequest.streamKey;
        }
        if ((i13 & 16) != 0) {
            layoutSettingsRequest = rTMPBroadcastRequest.layout;
        }
        LayoutSettingsRequest layoutSettingsRequest2 = layoutSettingsRequest;
        Quality quality2 = quality;
        return rTMPBroadcastRequest.copy(str, str2, quality2, str3, layoutSettingsRequest2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStreamUrl() {
        return this.streamUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Quality getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStreamKey() {
        return this.streamKey;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LayoutSettingsRequest getLayout() {
        return this.layout;
    }

    public final RTMPBroadcastRequest copy(@InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "stream_url") String streamUrl, @InterfaceC30731q(name = "quality") Quality quality, @InterfaceC30731q(name = "stream_key") String streamKey, @InterfaceC30731q(name = "layout") LayoutSettingsRequest layout) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(streamUrl, "streamUrl");
        return new RTMPBroadcastRequest(name, streamUrl, quality, streamKey, layout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RTMPBroadcastRequest)) {
            return false;
        }
        RTMPBroadcastRequest rTMPBroadcastRequest = (RTMPBroadcastRequest) other;
        return AbstractC22676k.m65745e(this.name, rTMPBroadcastRequest.name) && AbstractC22676k.m65745e(this.streamUrl, rTMPBroadcastRequest.streamUrl) && AbstractC22676k.m65745e(this.quality, rTMPBroadcastRequest.quality) && AbstractC22676k.m65745e(this.streamKey, rTMPBroadcastRequest.streamKey) && AbstractC22676k.m65745e(this.layout, rTMPBroadcastRequest.layout);
    }

    public final LayoutSettingsRequest getLayout() {
        return this.layout;
    }

    public final String getName() {
        return this.name;
    }

    public final Quality getQuality() {
        return this.quality;
    }

    public final String getStreamKey() {
        return this.streamKey;
    }

    public final String getStreamUrl() {
        return this.streamUrl;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.streamUrl);
        Quality quality = this.quality;
        int iHashCode = (iM30450d + (quality == null ? 0 : quality.hashCode())) * 31;
        String str = this.streamKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LayoutSettingsRequest layoutSettingsRequest = this.layout;
        return iHashCode2 + (layoutSettingsRequest != null ? layoutSettingsRequest.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.streamUrl;
        Quality quality = this.quality;
        String str3 = this.streamKey;
        LayoutSettingsRequest layoutSettingsRequest = this.layout;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RTMPBroadcastRequest(name=", str, ", streamUrl=", str2, ", quality=");
        sbM32001t.append(quality);
        sbM32001t.append(", streamKey=");
        sbM32001t.append(str3);
        sbM32001t.append(", layout=");
        sbM32001t.append(layoutSettingsRequest);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ RTMPBroadcastRequest(String str, String str2, Quality quality, String str3, LayoutSettingsRequest layoutSettingsRequest, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : quality, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : layoutSettingsRequest);
    }
}

package live.hms.video.sdk.models;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/sdk/models/PolicyUpdate;", "", "<init>", "()V", "PublishTracks", "UnpublishTracks", "Llive/hms/video/sdk/models/PolicyUpdate$PublishTracks;", "Llive/hms/video/sdk/models/PolicyUpdate$UnpublishTracks;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class PolicyUpdate {

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/models/PolicyUpdate$PublishTracks;", "Llive/hms/video/sdk/models/PolicyUpdate;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class PublishTracks extends PolicyUpdate {
        public static final PublishTracks INSTANCE = new PublishTracks();

        private PublishTracks() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/models/PolicyUpdate$UnpublishTracks;", "Llive/hms/video/sdk/models/PolicyUpdate;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class UnpublishTracks extends PolicyUpdate {
        public static final UnpublishTracks INSTANCE = new UnpublishTracks();

        private UnpublishTracks() {
            super(null);
        }
    }

    public /* synthetic */ PolicyUpdate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PolicyUpdate() {
    }
}

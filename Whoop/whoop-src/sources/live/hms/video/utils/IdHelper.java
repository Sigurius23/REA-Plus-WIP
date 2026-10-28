package live.hms.video.utils;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\f"}, m65681d2 = {"Llive/hms/video/utils/IdHelper;", "", "<init>", "()V", "uuidv4", "", "makeCallSignalId", "makeStreamId", "makeAudioMediaStreamTrackId", "makeVideoMediaStreamTrackId", "makePeerId", "makeHMSTrackId", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class IdHelper {
    public static final IdHelper INSTANCE = new IdHelper();

    private IdHelper() {
    }

    private final String uuidv4() {
        return AbstractC11895b.m31995n("toString(...)");
    }

    public final String makeAudioMediaStreamTrackId() {
        return uuidv4();
    }

    public final String makeCallSignalId() {
        return uuidv4();
    }

    public final String makeHMSTrackId() {
        return uuidv4();
    }

    public final String makePeerId() {
        return uuidv4();
    }

    public final String makeStreamId() {
        return uuidv4();
    }

    public final String makeVideoMediaStreamTrackId() {
        return uuidv4();
    }
}

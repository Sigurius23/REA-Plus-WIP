package live.hms.video.sdk;

import java.util.List;
import live.hms.video.media.tracks.HMSTrack;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Llive/hms/video/sdk/RolePreviewListener;", "Llive/hms/video/sdk/IErrorListener;", "Llive/hms/video/sdk/RequestPermissionInterface;", "", "Llive/hms/video/media/tracks/HMSTrack;", "localTracks", "Ll83/a0;", "onTracks", "([Llive/hms/video/media/tracks/HMSTrack;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface RolePreviewListener extends IErrorListener, RequestPermissionInterface {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static void onPermissionsRequested(RolePreviewListener rolePreviewListener, List<String> permissions) {
            AbstractC22676k.m65750j(permissions, "permissions");
            RequestPermissionInterface.DefaultImpls.onPermissionsRequested(rolePreviewListener, permissions);
        }
    }

    void onTracks(HMSTrack[] localTracks);
}

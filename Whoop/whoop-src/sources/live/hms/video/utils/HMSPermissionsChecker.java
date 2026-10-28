package live.hms.video.utils;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import live.hms.video.error.ErrorFactory;
import p479s4.AbstractC32131l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Llive/hms/video/utils/HMSPermissionsChecker;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "permission", "Ll83/a0;", "checkPermissionAndThrowError", "(Landroid/content/Context;Ljava/lang/String;)V", "", "Llive/hms/video/utils/CheckedPermissions;", "checkedPermissions", "Ljava/util/List;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSPermissionsChecker {
    private final List<CheckedPermissions> checkedPermissions;

    public HMSPermissionsChecker() {
        ErrorFactory.TracksErrors tracksErrors = ErrorFactory.TracksErrors.INSTANCE;
        ErrorFactory.Action action = ErrorFactory.Action.TRACK;
        this.checkedPermissions = AbstractC37056f.m118959K(new CheckedPermissions("android.permission.RECORD_AUDIO", ErrorFactory.TracksErrors.CantAccessCaptureDevice$default(tracksErrors, action, "microphone", "RECORD_AUDIO permission not received.", false, null, null, 48, null)), new CheckedPermissions("android.permission.CAMERA", ErrorFactory.TracksErrors.CantAccessCaptureDevice$default(tracksErrors, action, "camera", "CAMERA permission not received.", false, null, null, 48, null)));
    }

    public final void checkPermissionAndThrowError(Context context, String permission) {
        Object next;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(permission, "permission");
        Iterator<T> it = this.checkedPermissions.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((CheckedPermissions) next).getPermission(), permission));
        AbstractC22676k.m65747g(next);
        CheckedPermissions checkedPermissions = (CheckedPermissions) next;
        if (AbstractC32131l.m100073e(context, checkedPermissions.getPermission()) != 0) {
            throw checkedPermissions.getErrorToThrow();
        }
    }
}

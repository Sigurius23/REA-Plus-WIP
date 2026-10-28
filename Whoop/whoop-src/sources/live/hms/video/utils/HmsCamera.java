package live.hms.video.utils;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import hms.webrtc.Camera2Enumerator;
import hms.webrtc.CameraEnumerator;
import java.util.Arrays;
import java.util.NoSuchElementException;
import l83.C23454a0;
import l83.C23467m;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010$\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Llive/hms/video/utils/HmsCamera;", "", "Landroid/content/Context;", "context", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "<init>", "(Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;)V", "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "face", "", "throwException", "", "getCameraIdFromFace", "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Z)Ljava/lang/String;", "deviceId", "getCachedCameraFacing", "(Ljava/lang/String;)Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "getWebrtcCameraFacing", "getCam2", "Ll83/a0;", "enumerateAndAssignFrontBackValues", "()V", "Lhms/webrtc/CameraEnumerator;", "getEnumerator", "()Lhms/webrtc/CameraEnumerator;", "getDeviceId", "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)Ljava/lang/String;", "getCameraFaceFromId", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Llive/hms/video/events/AnalyticsEventsService;", "frontCameraId", "Ljava/lang/String;", "backCameraId", "enumerator", "Lhms/webrtc/CameraEnumerator;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HmsCamera {
    private final AnalyticsEventsService analyticsEventsService;
    private String backCameraId;
    private final Context context;
    private CameraEnumerator enumerator;
    private String frontCameraId;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMSVideoTrackSettings.CameraFacing.values().length];
            try {
                iArr[HMSVideoTrackSettings.CameraFacing.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSVideoTrackSettings.CameraFacing.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HmsCamera(Context context, AnalyticsEventsService analyticsEventsService) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        this.context = context;
        this.analyticsEventsService = analyticsEventsService;
        this.enumerator = new Camera2Enumerator(context);
    }

    private final void enumerateAndAssignFrontBackValues() {
        Object objM107888l;
        Integer num;
        Integer num2;
        try {
            String[] deviceNames = this.enumerator.getDeviceNames();
            if (deviceNames == null) {
                deviceNames = new String[0];
            }
            Object systemService = this.context.getSystemService("camera");
            AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraManager cameraManager = (CameraManager) systemService;
            for (String str : deviceNames) {
                if (this.frontCameraId == null && this.enumerator.isFrontFacing(str)) {
                    this.frontCameraId = str;
                }
                if (this.backCameraId == null && this.enumerator.isBackFacing(str)) {
                    this.backCameraId = str;
                }
            }
            if ((this.frontCameraId == null || this.backCameraId == null) && this.context.getPackageManager().hasSystemFeature("android.hardware.camera.external")) {
                for (String str2 : deviceNames) {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                    if (this.frontCameraId == null && cameraCharacteristics != null && (num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)) != null && num2.intValue() == 2) {
                        this.frontCameraId = str2;
                    } else if (this.backCameraId == null && cameraCharacteristics != null && (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)) != null && num.intValue() == 2) {
                        this.backCameraId = str2;
                    }
                }
            }
            objM107888l = C23454a0.f92919a;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if ((this.frontCameraId == null && this.backCameraId == null) || (objM107888l instanceof C23467m)) {
            Camera2Enumerator camera2Enumerator = new Camera2Enumerator(this.context);
            this.enumerator = camera2Enumerator;
            String[] deviceNames2 = camera2Enumerator.getDeviceNames();
            AbstractC22676k.m65749i(deviceNames2, "getDeviceNames(...)");
            for (String str3 : deviceNames2) {
                if (this.frontCameraId == null && this.enumerator.isFrontFacing(str3)) {
                    this.frontCameraId = str3;
                }
                if (this.backCameraId == null && this.enumerator.isBackFacing(str3)) {
                    this.backCameraId = str3;
                }
            }
        }
    }

    private final HMSVideoTrackSettings.CameraFacing getCachedCameraFacing(String deviceId) {
        if (AbstractC22676k.m65745e(deviceId, this.frontCameraId)) {
            return HMSVideoTrackSettings.CameraFacing.FRONT;
        }
        if (AbstractC22676k.m65745e(deviceId, this.backCameraId)) {
            return HMSVideoTrackSettings.CameraFacing.BACK;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    private final HMSVideoTrackSettings.CameraFacing getCam2(String deviceId) {
        Object objM107888l;
        try {
            Object systemService = this.context.getSystemService("camera");
            AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraManager cameraManager = (CameraManager) systemService;
            if (this.enumerator.isBackFacing(deviceId)) {
                objM107888l = HMSVideoTrackSettings.CameraFacing.BACK;
            } else if (this.enumerator.isFrontFacing(deviceId)) {
                objM107888l = HMSVideoTrackSettings.CameraFacing.FRONT;
            } else if ((this.frontCameraId == null || this.backCameraId == null) && this.context.getPackageManager().hasSystemFeature("android.hardware.camera.external")) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(deviceId);
                Integer num = cameraCharacteristics != null ? (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING) : null;
                if (num != null && num.intValue() == 0) {
                    objM107888l = HMSVideoTrackSettings.CameraFacing.FRONT;
                } else if (num != null && num.intValue() == 1) {
                    objM107888l = HMSVideoTrackSettings.CameraFacing.BACK;
                } else if (num == null) {
                    objM107888l = null;
                } else {
                    enumerateAndAssignFrontBackValues();
                    if (this.frontCameraId == null) {
                        this.frontCameraId = deviceId;
                        objM107888l = HMSVideoTrackSettings.CameraFacing.FRONT;
                    } else if (this.backCameraId == null) {
                        this.backCameraId = deviceId;
                        objM107888l = HMSVideoTrackSettings.CameraFacing.BACK;
                    } else {
                        objM107888l = null;
                    }
                }
            } else {
                objM107888l = null;
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        return (HMSVideoTrackSettings.CameraFacing) (objM107888l instanceof C23467m ? null : objM107888l);
    }

    private final String getCameraIdFromFace(HMSVideoTrackSettings.CameraFacing face, boolean throwException) {
        String str;
        String str2 = this.frontCameraId;
        if (str2 == null && this.backCameraId == null && throwException) {
            throw new NoSuchElementException("both, front and back cameraId returned null for face " + face);
        }
        if (str2 == null && this.backCameraId == null) {
            return null;
        }
        if (face == HMSVideoTrackSettings.CameraFacing.FRONT && str2 != null && str2.length() != 0) {
            String str3 = this.frontCameraId;
            AbstractC22676k.m65747g(str3);
            return str3;
        }
        if (face == HMSVideoTrackSettings.CameraFacing.BACK && (str = this.backCameraId) != null && str.length() != 0) {
            String str4 = this.backCameraId;
            AbstractC22676k.m65747g(str4);
            return str4;
        }
        if (!throwException) {
            return null;
        }
        throw new NoSuchElementException("Couldn't find " + face + " facing camera. Please restart your device");
    }

    private static final String getDeviceId$getFaceString(HMSVideoTrackSettings.CameraFacing cameraFacing) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[cameraFacing.ordinal()];
        if (i13 == 1) {
            return "front facing";
        }
        if (i13 == 2) {
            return "back facing";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final HMSVideoTrackSettings.CameraFacing getWebrtcCameraFacing(String deviceId) {
        Object objM107888l;
        try {
            if (this.enumerator.isFrontFacing(deviceId)) {
                objM107888l = HMSVideoTrackSettings.CameraFacing.FRONT;
            } else {
                objM107888l = this.enumerator.isBackFacing(deviceId) ? HMSVideoTrackSettings.CameraFacing.BACK : null;
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        return (HMSVideoTrackSettings.CameraFacing) (objM107888l instanceof C23467m ? null : objM107888l);
    }

    public final HMSVideoTrackSettings.CameraFacing getCameraFaceFromId(String deviceId) {
        AbstractC22676k.m65750j(deviceId, "deviceId");
        HMSVideoTrackSettings.CameraFacing cachedCameraFacing = getCachedCameraFacing(deviceId);
        return (cachedCameraFacing == null && (cachedCameraFacing = getWebrtcCameraFacing(deviceId)) == null && (cachedCameraFacing = getCam2(deviceId)) == null) ? getCachedCameraFacing(deviceId) : cachedCameraFacing;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDeviceId(HMSVideoTrackSettings.CameraFacing face) throws HMSException {
        AbstractC22676k.m65750j(face, "face");
        try {
            String cameraIdFromFace = getCameraIdFromFace(face, false);
            if (cameraIdFromFace != null) {
                return cameraIdFromFace;
            }
            enumerateAndAssignFrontBackValues();
            String cameraIdFromFace2 = getCameraIdFromFace(face, true);
            AbstractC22676k.m65747g(cameraIdFromFace2);
            return cameraIdFromFace2;
        } catch (NoSuchElementException unused) {
            HMSException hMSExceptionCantFindCameraIdForParticularFace$default = ErrorFactory.TracksErrors.CantFindCameraIdForParticularFace$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, getDeviceId$getFaceString(face), "No camera device found for " + face + " among " + Arrays.toString(this.enumerator.getDeviceNames()), false, null, null, 56, null);
            this.analyticsEventsService.queue(AnalyticsEventFactory.INSTANCE.videoPublishFail(hMSExceptionCantFindCameraIdForParticularFace$default)).flush();
            throw hMSExceptionCantFindCameraIdForParticularFace$default;
        } catch (Exception e5) {
            HMSException hMSExceptionCantAccessCaptureDevice$default = ErrorFactory.TracksErrors.CantAccessCaptureDevice$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, "camera", String.valueOf(e5.getMessage()), false, null, null, 48, null);
            this.analyticsEventsService.queue(AnalyticsEventFactory.INSTANCE.videoPublishFail(hMSExceptionCantAccessCaptureDevice$default)).flush();
            throw hMSExceptionCantAccessCaptureDevice$default;
        }
    }

    public final CameraEnumerator getEnumerator() {
        return this.enumerator;
    }
}

package live.hms.video.media.capturers.camera;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Range;
import ge3.AbstractC15751g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import l83.C23454a0;
import live.hms.video.media.capturers.camera.utils.ImageCaptureModel;
import live.hms.video.utils.HMSUtils;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30065l;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\b\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\b\u001a\u001b\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\b\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a$\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0080@¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u001b\u001a!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001c\u0010\r\u001a\u001b\u0010\u001e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Landroid/content/Context;", "", "cameraId", "", "isFlashAvailable", "(Landroid/content/Context;Ljava/lang/String;)Z", "", "getWhiteBalanceMeteringRegionsSupported", "(Landroid/content/Context;Ljava/lang/String;)I", "getExposureMaxMeteringRegionsSupported", "Landroid/util/Range;", "", "getZoomRatioRange", "(Landroid/content/Context;Ljava/lang/String;)Landroid/util/Range;", "getFocusMaxMeteringRegionsSupported", "computeRelativeRotation", "Landroid/hardware/camera2/CameraCharacteristics;", "getCameraCharacteristics", "(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;", "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;", "result", "Ljava/io/File;", "filePathToSave", "Ll83/a0;", "saveResult", "(Landroid/content/Context;Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;Ljava/io/File;Lq83/d;)Ljava/lang/Object;", "context", "(ILandroid/content/Context;)Landroid/hardware/camera2/CameraCharacteristics;", "getLensDistanceRange", "mirrored", "computeExifOrientation", "(IZ)I", "lib_release"}, m65682k = 2, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class CameraExtKt {
    public static final int computeExifOrientation(int i13, boolean z4) {
        if (i13 == 0 && !z4) {
            return 1;
        }
        if (i13 == 0 && z4) {
            return 2;
        }
        if (i13 == 180 && !z4) {
            return 3;
        }
        if (i13 == 180 && z4) {
            return 4;
        }
        if (i13 == 270 && z4) {
            return 7;
        }
        if (i13 == 90 && !z4) {
            return 6;
        }
        if (i13 == 90 && z4) {
            return 5;
        }
        if (i13 == 270 && z4) {
            return 8;
        }
        return (i13 != 270 || z4) ? 0 : 7;
    }

    public static final int computeRelativeRotation(Context context, String cameraId) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(cameraId, "cameraId");
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(context, cameraId);
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        return (iIntValue + ((num2 == null || num2.intValue() != 1) ? HMSUtils.INSTANCE.getOrientation(context) : 360 - HMSUtils.INSTANCE.getOrientation(context))) % 360;
    }

    public static final CameraCharacteristics getCameraCharacteristics(Context context, String cameraId) throws CameraAccessException {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(cameraId, "cameraId");
        Object systemService = context.getSystemService("camera");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraCharacteristics cameraCharacteristics = ((CameraManager) systemService).getCameraCharacteristics(cameraId);
        AbstractC22676k.m65749i(cameraCharacteristics, "getCameraCharacteristics(...)");
        return cameraCharacteristics;
    }

    public static final int getExposureMaxMeteringRegionsSupported(Context context, String cameraId) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(cameraId, "cameraId");
        Integer num = (Integer) getCameraCharacteristics(context, cameraId).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int getFocusMaxMeteringRegionsSupported(Context context, String cameraId) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(cameraId, "cameraId");
        Integer num = (Integer) getCameraCharacteristics(context, cameraId).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final Range<Float> getLensDistanceRange(Context context, String cameraId) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(cameraId, "cameraId");
        Float fValueOf = Float.valueOf(0.0f);
        Float f13 = (Float) getCameraCharacteristics(context, cameraId).get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        return new Range<>(fValueOf, Float.valueOf(f13 != null ? f13.floatValue() : 0.0f));
    }

    public static final int getWhiteBalanceMeteringRegionsSupported(Context context, String cameraId) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(cameraId, "cameraId");
        Integer num = (Integer) getCameraCharacteristics(context, cameraId).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final Range<Float> getZoomRatioRange(Context context, String cameraId) {
        Float fValueOf = Float.valueOf(1.0f);
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(cameraId, "cameraId");
        if (Build.VERSION.SDK_INT >= 30) {
            Range<Float> range = (Range) getCameraCharacteristics(context, cameraId).get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            return range == null ? new Range<>(fValueOf, fValueOf) : range;
        }
        Float f13 = (Float) getCameraCharacteristics(context, cameraId).get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        return f13 != null ? new Range<>(fValueOf, Float.valueOf(f13.floatValue())) : new Range<>(fValueOf, fValueOf);
    }

    public static final boolean isFlashAvailable(Context context, String cameraId) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(cameraId, "cameraId");
        Boolean bool = (Boolean) getCameraCharacteristics(context, cameraId).get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Removed unreachable split cross block B:42:0x0083 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [live.hms.video.media.capturers.camera.utils.ImageCaptureModel] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [live.hms.video.media.capturers.camera.utils.ImageCaptureModel] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static final Object saveResult(Context context, ImageCaptureModel imageCaptureModel, File file, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C30065l c30065l = new C30065l(AbstractC15751g.m44424D(interfaceC30057d));
        int format = imageCaptureModel.getFormat();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (format == 256 || format == 1768253795) {
            ByteBuffer buffer = imageCaptureModel.getImage().getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        fileOutputStream2.write(bArr);
                        try {
                            c30065l.resumeWith(c23454a0);
                            imageCaptureModel.close();
                            fileOutputStream2.close();
                            imageCaptureModel = imageCaptureModel;
                        } catch (IOException e5) {
                            e = e5;
                            fileOutputStream = fileOutputStream2;
                            c30065l.resumeWith(AbstractC34132o.m107888l(e));
                            imageCaptureModel.close();
                            imageCaptureModel = imageCaptureModel;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                                imageCaptureModel = imageCaptureModel;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream2;
                            imageCaptureModel.close();
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th4) {
                                    AbstractC34132o.m107888l(th4);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (Throwable th6) {
                AbstractC34132o.m107888l(th6);
                imageCaptureModel = th6;
            }
        } else {
            c30065l.resumeWith(AbstractC34132o.m107888l(new RuntimeException("Unknown image format: " + imageCaptureModel.getImage().getFormat())));
        }
        Object objM92140a = c30065l.m92140a();
        return objM92140a == EnumC31071a.f128113w ? objM92140a : c23454a0;
    }

    public static final CameraCharacteristics getCameraCharacteristics(int i13, Context context) {
        AbstractC22676k.m65750j(context, "context");
        Object systemService = context.getSystemService("camera");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            AbstractC22676k.m65749i(cameraIdList, "getCameraIdList(...)");
            if (i13 < cameraIdList.length) {
                return cameraManager.getCameraCharacteristics(cameraIdList[i13]);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}

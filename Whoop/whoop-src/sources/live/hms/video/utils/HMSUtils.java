package live.hms.video.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.Display;
import android.view.WindowManager;
import hms.webrtc.RendererCommon;
import hms.webrtc.RtpParameters;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import live.hms.video.error.ErrorCodes;
import live.hms.video.error.HMSException;
import live.hms.video.media.settings.HMSLayer;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.sdk.models.DegradationPreference;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sdk.models.role.LayerParams;
import live.hms.video.sdk.models.role.PublishParams;
import live.hms.video.sdk.models.role.Simulcast;
import live.hms.video.sdk.models.role.VideoSimulcastLayersParams;
import m83.AbstractC25260n;
import p463rj.AbstractC31479j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007J\u0017\u0010\u000f\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u0012j\u0002`\u0011¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0002J%\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u001e\u001a\u00020\fH\u0000¢\u0006\u0002\b$J\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001cJ!\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0002\b+J\u0019\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b/J\u000e\u00100\u001a\u00020\f*\u0004\u0018\u00010)H\u0002JW\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\b\u00106\u001a\u0004\u0018\u00010\u00072\b\u00107\u001a\u0004\u0018\u00010\u00072\u0006\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020;H\u0000¢\u0006\u0004\b<\u0010=JG\u0010>\u001a\u0004\u0018\u0001022\b\u0010?\u001a\u0004\u0018\u0001022\b\u00106\u001a\u0004\u0018\u00010\u00072\b\u00107\u001a\u0004\u0018\u00010\u00072\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\fH\u0000¢\u0006\u0004\bC\u0010DJ\u000e\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u0007J\u0012\u0010G\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010JJ\u000e\u0010K\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006L"}, m65681d2 = {"Llive/hms/video/utils/HMSUtils;", "", "<init>", "()V", "TAG", "", "MAX_SCREENSHARE_SIZE", "", "getOrientation", "context", "Landroid/content/Context;", "hasOrientationChange", "", "currentOrientation", "oldOrientation", "shouldRetry", "ex", "Lkotlin/Exception;", "Ljava/lang/Exception;", "(Ljava/lang/Exception;)Z", "addAndConvertBuffers", "", "a1", "", "a1Limit", "a2", "a2Limit", "getDeviceWidthAndHeight", "Landroid/graphics/Point;", "isSimulcastEnabledFromPolicy", "isScreenShare", "hmsVideoTrackSettings", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "getVideoEncodingParameter", "", "Lhms/webrtc/RtpParameters$Encoding;", "getVideoEncodingParameter$lib_release", "applySizeConstraint", "actualSize", "didSimulcastLayerChangeHappen", "prevRole", "Llive/hms/video/sdk/models/role/HMSRole;", "newRole", "didSimulcastLayerChangeHappen$lib_release", "ridToHMSLayerMapper", "Llive/hms/video/media/settings/HMSLayer;", "rid", "ridToHMSLayerMapper$lib_release", "isRoleSimulcast", "viewToNormalized", "Landroid/graphics/RectF;", "transformRect", "viewWidth", "viewHeight", "captureWidth", "captureHeight", "mirrorMode", "rotationAngle", "scaleType", "Lhms/webrtc/RendererCommon$ScalingType;", "viewToNormalized$lib_release", "(Landroid/graphics/RectF;IILjava/lang/Integer;Ljava/lang/Integer;ZILhms/webrtc/RendererCommon$ScalingType;)Landroid/graphics/RectF;", "normalizedToCameraSensor", "normalisedRect", "cropSensorWidth", "cropSensorHeight", "needCameraCrop", "normalizedToCameraSensor$lib_release", "(Landroid/graphics/RectF;Ljava/lang/Integer;Ljava/lang/Integer;IIZ)Landroid/graphics/RectF;", "getSurfaceOrientation", "surfaceOrientation", "mapHmsDegradationPreference", "Lhms/webrtc/RtpParameters$DegradationPreference;", "degradationPreference", "Llive/hms/video/sdk/models/DegradationPreference;", "getBatteryPercentage", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSUtils {
    public static final HMSUtils INSTANCE = new HMSUtils();
    private static final int MAX_SCREENSHARE_SIZE = 1920;
    private static final String TAG = "HMSUtils";

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RendererCommon.ScalingType.values().length];
            try {
                iArr[RendererCommon.ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RendererCommon.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RendererCommon.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DegradationPreference.values().length];
            try {
                iArr2[DegradationPreference.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DegradationPreference.MAINTAIN_FRAMERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DegradationPreference.MAINTAIN_RESOLUTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DegradationPreference.BALANCED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private HMSUtils() {
    }

    public static /* synthetic */ List getVideoEncodingParameter$lib_release$default(HMSUtils hMSUtils, HMSVideoTrackSettings hMSVideoTrackSettings, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return hMSUtils.getVideoEncodingParameter$lib_release(hMSVideoTrackSettings, z4);
    }

    private final boolean isRoleSimulcast(HMSRole hMSRole) {
        PublishParams publishParams;
        Simulcast simulcast;
        VideoSimulcastLayersParams video;
        ArrayList<LayerParams> layers = (hMSRole == null || (publishParams = hMSRole.getPublishParams()) == null || (simulcast = publishParams.getSimulcast()) == null || (video = simulcast.getVideo()) == null) ? null : video.getLayers();
        return !(layers == null || layers.isEmpty());
    }

    private final boolean isSimulcastEnabledFromPolicy(boolean isScreenShare, HMSVideoTrackSettings hmsVideoTrackSettings) {
        if (isScreenShare) {
            VideoSimulcastLayersParams screenShareSimulcastLayersParams$lib_release = hmsVideoTrackSettings.getScreenShareSimulcastLayersParams();
            ArrayList<LayerParams> layers = screenShareSimulcastLayersParams$lib_release != null ? screenShareSimulcastLayersParams$lib_release.getLayers() : null;
            if (layers == null || layers.isEmpty()) {
                return true;
            }
        }
        if (isScreenShare) {
            return false;
        }
        VideoSimulcastLayersParams videoSimulcastLayersParams$lib_release = hmsVideoTrackSettings.getVideoSimulcastLayersParams();
        ArrayList<LayerParams> layers2 = videoSimulcastLayersParams$lib_release != null ? videoSimulcastLayersParams$lib_release.getLayers() : null;
        return layers2 == null || layers2.isEmpty();
    }

    public final byte[] addAndConvertBuffers(short[] a5, int a1Limit, short[] a14, int a2Limit) {
        int i13;
        AbstractC22676k.m65750j(a5, "a1");
        AbstractC22676k.m65750j(a14, "a2");
        int iMax = Math.max(a1Limit, a2Limit);
        int i14 = 0;
        if (iMax < 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[iMax * 2];
        while (i14 < iMax) {
            if (i14 >= a1Limit) {
                i13 = a14[i14];
            } else {
                i13 = i14 >= a2Limit ? a5[i14] : a5[i14] + a14[i14];
            }
            int i15 = i13;
            if (i13 > 32767) {
                i15 = 32767;
            }
            if (i15 < -32768) {
                i15 = -32768;
            }
            int i16 = i14 * 2;
            bArr[i16] = (byte) (i15 & 255);
            bArr[i16 + 1] = (byte) ((i15 >> 8) & 255);
            i14++;
        }
        return bArr;
    }

    public final Point applySizeConstraint(Point actualSize) {
        int i13;
        AbstractC22676k.m65750j(actualSize, "actualSize");
        int i14 = actualSize.x;
        int i15 = actualSize.y;
        int iMax = Math.max(i14, i15);
        int i16 = MAX_SCREENSHARE_SIZE;
        if (iMax <= MAX_SCREENSHARE_SIZE) {
            return actualSize;
        }
        float f13 = i14 / i15;
        if (i14 == iMax) {
            i13 = (int) ((1.0f / f13) * MAX_SCREENSHARE_SIZE);
        } else {
            i16 = (int) (MAX_SCREENSHARE_SIZE * f13);
            i13 = MAX_SCREENSHARE_SIZE;
        }
        return new Point(i16, i13);
    }

    public final boolean didSimulcastLayerChangeHappen$lib_release(HMSRole prevRole, HMSRole newRole) {
        return isRoleSimulcast(prevRole) != isRoleSimulcast(newRole);
    }

    public final int getBatteryPercentage(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return (int) (((intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : -1) / (intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1)) * 100);
    }

    public final Point getDeviceWidthAndHeight(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Point point = new Point();
        Object systemService = context.getSystemService("window");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public final int getOrientation(Context context) {
        Display defaultDisplay;
        AbstractC22676k.m65750j(context, "context");
        Object systemService = context.getSystemService("window");
        Integer numValueOf = null;
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            numValueOf = Integer.valueOf(defaultDisplay.getRotation());
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 90;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return 180;
        }
        return (numValueOf != null && numValueOf.intValue() == 3) ? 270 : 0;
    }

    public final int getSurfaceOrientation(int surfaceOrientation) {
        if (surfaceOrientation == 0) {
            return 0;
        }
        if (surfaceOrientation == 1) {
            return 90;
        }
        if (surfaceOrientation != 2) {
            return surfaceOrientation != 3 ? 0 : 270;
        }
        return 180;
    }

    public final List<RtpParameters.Encoding> getVideoEncodingParameter$lib_release(HMSVideoTrackSettings hmsVideoTrackSettings, boolean isScreenShare) {
        VideoSimulcastLayersParams videoSimulcastLayersParams$lib_release;
        AbstractC22676k.m65750j(hmsVideoTrackSettings, "hmsVideoTrackSettings");
        ArrayList arrayList = new ArrayList();
        if (!hmsVideoTrackSettings.getIsSimulcastFeatureFlagEnabled() || isSimulcastEnabledFromPolicy(isScreenShare, hmsVideoTrackSettings)) {
            RtpParameters.Encoding encoding = new RtpParameters.Encoding(null, true, null);
            encoding.maxBitrateBps = Integer.valueOf(hmsVideoTrackSettings.getMaxBitRate() * 1000);
            encoding.maxFramerate = Integer.valueOf(hmsVideoTrackSettings.getMaxFrameRate());
            arrayList.add(encoding);
            return arrayList;
        }
        ArrayList<LayerParams> layers = (!isScreenShare ? (videoSimulcastLayersParams$lib_release = hmsVideoTrackSettings.getVideoSimulcastLayersParams()) != null : (videoSimulcastLayersParams$lib_release = hmsVideoTrackSettings.getScreenShareSimulcastLayersParams()) != null) ? null : videoSimulcastLayersParams$lib_release.getLayers();
        if (layers != null) {
            for (LayerParams layerParams : layers) {
                String rid = layerParams.getRid();
                Float scaleResolutionDownBy = layerParams.getScaleResolutionDownBy();
                RtpParameters.Encoding encoding2 = new RtpParameters.Encoding(rid, true, scaleResolutionDownBy != null ? Double.valueOf(scaleResolutionDownBy.floatValue()) : null);
                Integer maxBitrate = layerParams.getMaxBitrate();
                encoding2.maxBitrateBps = Integer.valueOf((maxBitrate != null ? maxBitrate.intValue() : hmsVideoTrackSettings.getMaxBitRate()) * 1000);
                Integer maxFramerate = layerParams.getMaxFramerate();
                encoding2.maxFramerate = Integer.valueOf(maxFramerate != null ? maxFramerate.intValue() : hmsVideoTrackSettings.getMaxFrameRate());
                arrayList.add(encoding2);
            }
        }
        return arrayList;
    }

    public final boolean hasOrientationChange(int currentOrientation, int oldOrientation) {
        return (currentOrientation == oldOrientation || Math.abs(currentOrientation - oldOrientation) == 180) ? false : true;
    }

    public final RtpParameters.DegradationPreference mapHmsDegradationPreference(DegradationPreference degradationPreference) {
        int i13 = degradationPreference == null ? -1 : WhenMappings.$EnumSwitchMapping$1[degradationPreference.ordinal()];
        if (i13 == 1) {
            return RtpParameters.DegradationPreference.DISABLED;
        }
        if (i13 == 2) {
            return RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE;
        }
        if (i13 == 3) {
            return RtpParameters.DegradationPreference.MAINTAIN_RESOLUTION;
        }
        if (i13 != 4) {
            return null;
        }
        return RtpParameters.DegradationPreference.BALANCED;
    }

    public final RectF normalizedToCameraSensor$lib_release(RectF normalisedRect, Integer captureWidth, Integer captureHeight, int cropSensorWidth, int cropSensorHeight, boolean needCameraCrop) {
        if (normalisedRect == null || captureWidth == null || captureHeight == null || normalisedRect.left < 0.0f || normalisedRect.top < 0.0f || normalisedRect.width() > 1.0f || normalisedRect.height() > 1.0f) {
            return null;
        }
        RectF rectF = new RectF(normalisedRect);
        Matrix matrix = new Matrix();
        if (needCameraCrop) {
            float fIntValue = cropSensorWidth / captureWidth.intValue();
            float fIntValue2 = cropSensorHeight / captureHeight.intValue();
            float f13 = fIntValue / fIntValue2;
            if (f13 > 1.0f) {
                matrix.postTranslate((f13 - 1.0f) / 2.0f, 0.0f);
                cropSensorWidth = (int) ((cropSensorWidth * fIntValue2) / fIntValue);
            } else if (f13 < 1.0f) {
                matrix.postTranslate(0.0f, ((fIntValue2 / fIntValue) - 1.0f) / 2.0f);
                cropSensorHeight = (int) ((cropSensorHeight * fIntValue) / fIntValue2);
            }
            matrix.mapRect(rectF);
        }
        matrix.setScale(cropSensorWidth, cropSensorHeight);
        matrix.mapRect(rectF);
        return rectF;
    }

    public final HMSLayer ridToHMSLayerMapper$lib_release(String rid) {
        if (rid == null) {
            return null;
        }
        int iHashCode = rid.hashCode();
        if (iHashCode == 102) {
            if (rid.equals("f")) {
                return HMSLayer.HIGH;
            }
            return null;
        }
        if (iHashCode == 104) {
            if (rid.equals(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT)) {
                return HMSLayer.MEDIUM;
            }
            return null;
        }
        if (iHashCode == 113 && rid.equals("q")) {
            return HMSLayer.LOW;
        }
        return null;
    }

    public final boolean shouldRetry(Exception ex3) {
        AbstractC22676k.m65750j(ex3, "ex");
        if (ex3 instanceof HMSException) {
            HMSException hMSException = (HMSException) ex3;
            if (AbstractC25260n.m74056a0(new Integer[]{Integer.valueOf(ErrorCodes.InitAPIErrors.cEndpointUnreachable), 1003}, Integer.valueOf(hMSException.getCode())) || AbstractC39421y.m125930O(String.valueOf(hMSException.getCode()), "5", false) || AbstractC39421y.m125930O(String.valueOf(hMSException.getCode()), "429", false)) {
                return true;
            }
        }
        return false;
    }

    public final RectF viewToNormalized$lib_release(RectF transformRect, int viewWidth, int viewHeight, Integer captureWidth, Integer captureHeight, boolean mirrorMode, int rotationAngle, RendererCommon.ScalingType scaleType) {
        AbstractC22676k.m65750j(scaleType, "scaleType");
        if (transformRect == null || captureWidth == null || captureHeight == null || viewWidth <= 0 || viewHeight <= 0 || transformRect.left < 0.0f || transformRect.top < 0.0f) {
            return null;
        }
        float f13 = viewWidth;
        if (transformRect.right > f13) {
            return null;
        }
        float f14 = viewHeight;
        if (transformRect.bottom > f14 || rotationAngle % 90 != 0) {
            return null;
        }
        int i13 = rotationAngle > 0 ? rotationAngle % 360 : (rotationAngle % 360) + 360;
        RectF rectF = new RectF(transformRect);
        Matrix matrix = new Matrix();
        matrix.postRotate(i13);
        float f15 = (i13 == 90 || i13 == 270) ? f14 : f13;
        if (i13 != 90 && i13 != 270) {
            f13 = f14;
        }
        float fIntValue = f15 / captureWidth.intValue();
        float fIntValue2 = f13 / captureHeight.intValue();
        matrix.postScale(1.0f / f15, 1.0f / f13);
        if (i13 == 90) {
            matrix.postTranslate(1.0f, 0.0f);
        } else if (i13 == 180) {
            matrix.postTranslate(1.0f, 1.0f);
        } else if (i13 == 270) {
            matrix.postTranslate(0.0f, 1.0f);
        }
        int i14 = WhenMappings.$EnumSwitchMapping$0[scaleType.ordinal()];
        if (i14 == 1 || i14 == 2) {
            if (fIntValue <= fIntValue2) {
                matrix.postScale(fIntValue / fIntValue2, 1.0f, 0.5f, 0.0f);
                matrix.mapRect(rectF);
                rectF.right = AbstractC31479j.m96938q(rectF.right, 0.0f, 1.0f);
                rectF.left = AbstractC31479j.m96938q(rectF.left, 0.0f, 1.0f);
            } else {
                matrix.postScale(1.0f, fIntValue2 / fIntValue, 0.0f, 0.5f);
                matrix.mapRect(rectF);
                rectF.top = AbstractC31479j.m96938q(rectF.top, 0.0f, 1.0f);
                rectF.bottom = AbstractC31479j.m96938q(rectF.bottom, 0.0f, 1.0f);
            }
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (fIntValue <= fIntValue2) {
                matrix.postScale(1.0f, fIntValue2 / fIntValue);
                matrix.mapRect(rectF);
                rectF.top = AbstractC31479j.m96938q(rectF.top, 0.0f, 1.0f);
                rectF.bottom = AbstractC31479j.m96938q(rectF.bottom, 0.0f, 1.0f);
            } else {
                matrix.postScale(fIntValue / fIntValue2, 1.0f, 0.5f, 0.0f);
                matrix.mapRect(rectF);
                rectF.right = AbstractC31479j.m96938q(rectF.right, 0.0f, 1.0f);
                rectF.left = AbstractC31479j.m96938q(rectF.left, 0.0f, 1.0f);
            }
        }
        if (mirrorMode) {
            float f16 = rectF.left;
            rectF.left = 1.0f - rectF.right;
            rectF.right = 1.0f - f16;
        }
        return rectF;
    }
}

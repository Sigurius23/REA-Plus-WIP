package lh1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.gifting.feature.gifting.domain.models.GiftingStickyModel;
import com.whoop.healthconnect.domain.models.HealthConnectBodyMeasurementRequestBody;
import com.whoop.healthconnect.domain.models.HealthConnectEventsResponse;
import com.whoop.stories.OnboardingStoryFragment;
import live.hms.video.factories.HMSVideoDecoderFactory;
import live.hms.video.factories.HappyEyeballsDns;
import live.hms.video.factories.SafeVariable;
import live.hms.video.media.capturers.camera.CameraControl;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.sdk.NetworkObserverUseCase;
import live.hms.video.sdk.SDKDelegate;
import live.hms.video.signal.jsonrpc.JSONRpcSignal;
import mc3.AbstractC25438d;

/* JADX INFO: renamed from: lh1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24069a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95107w;

    public /* synthetic */ C24069a(int i13) {
        this.f95107w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95107w) {
            case 0:
                return GiftingStickyModel._childSerializers$_anonymous_();
            case 1:
                return OnboardingStoryFragment.m26178j0();
            case 2:
                return HMSVideoDecoderFactory.softwareVideoDecoderFactory_delegate$lambda$1();
            case 3:
                return HappyEyeballsDns.defaultExecutor_delegate$lambda$10();
            case 4:
                return SafeVariable.safeHandlerThread_delegate$lambda$1();
            case 5:
                return CameraControl.imageReaderThread_delegate$lambda$1();
            case 6:
                return HMSRemoteVideoTrack.sinksMap_delegate$lambda$0();
            case 7:
                return NetworkObserverUseCase.networkQualityCalculator_delegate$lambda$0();
            case 8:
                return SDKDelegate.previewForRoleTracks_delegate$lambda$58();
            case 9:
                return SDKDelegate.pendingPluginList_delegate$lambda$77();
            case 10:
                return SDKDelegate.audioHandlerThread_delegate$lambda$6();
            case 11:
                return AbstractC25438d.m74669a();
            case 12:
                return JSONRpcSignal.close$lambda$2();
            case 13:
                return HealthConnectBodyMeasurementRequestBody._childSerializers$_anonymous_();
            case 14:
                return HealthConnectBodyMeasurementRequestBody._childSerializers$_anonymous_$0();
            case 15:
                return HealthConnectEventsResponse._childSerializers$_anonymous_();
            case 16:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$2();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$3();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$4();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$5();
            case 20:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$6();
            case 21:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$7();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$8();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$9();
            case 24:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$10();
            case 25:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$11();
            case 26:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$12();
            case 27:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$13();
            case 28:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$14();
            default:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$15();
        }
    }
}

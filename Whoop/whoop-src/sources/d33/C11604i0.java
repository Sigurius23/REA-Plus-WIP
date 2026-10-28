package d33;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c43.C4207w;
import c93.InterfaceC4351m;
import e33.C12645n;
import ec3.C13045h2;
import io.getstream.android.video.generated.models.OwnCapability;
import java.util.List;
import l83.C23454a0;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoTrack;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import stream.video.sfu.models.TrackType;
import t23.AbstractC33441q1;
import t23.C33368c0;
import t23.C33431o1;

/* JADX INFO: renamed from: d33.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11604i0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f37465w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f37466x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11602h1 f37467y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11604i0(C11602h1 c11602h1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37467y = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C11604i0 c11604i0 = new C11604i0(this.f37467y, interfaceC30057d);
        c11604i0.f37466x = obj;
        return c11604i0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C11604i0) create((AbstractC33441q1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        MediaStreamTrack mediaStreamTrack;
        String strM31035j;
        String str;
        C11602h1 c11602h1 = this.f37467y;
        C13045h2 c13045h2 = c11602h1.f37421A;
        C33368c0 c33368c0 = c11602h1.f37440b;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f37465w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            AbstractC33441q1 abstractC33441q1 = (AbstractC33441q1) this.f37466x;
            boolean zContains = ((List) c33368c0.f139302p.f139624M.getValue()).contains(OwnCapability.SendVideo.INSTANCE);
            if (!AbstractC22676k.m65745e(abstractC33441q1, C33431o1.f139566a)) {
                TrackType trackType = TrackType.TRACK_TYPE_VIDEO;
                c11602h1.m31028F(false, trackType);
                C12645n c12645n = (C12645n) c13045h2.getValue();
                if (c12645n != null) {
                    this.f37465w = 2;
                    c12645n.m35397A(trackType);
                    if (c23454a0 == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return c23454a0;
            }
            CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) c33368c0.m105817h().f139757e.f139360q.getValue();
            mediaStreamTrack = null;
            if (captureFormat == null) {
                C2345k c2345kM31043s = c11602h1.m31043s();
                InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
                String str2 = c2345kM31043s.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    c2345kM31043s.f9274b.log(enumC2341g, str2, "Camera resolution is null. This will result in an empty video track.", null);
                }
            } else {
                C2345k c2345kM31043s2 = c11602h1.m31043s();
                InterfaceC2339e interfaceC2339e2 = c2345kM31043s2.f9275c;
                String str3 = c2345kM31043s2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                    c2345kM31043s2.f9274b.log(enumC2341g2, str3, "Camera resolution: " + captureFormat, null);
                }
            }
            if (!zContains) {
                C2345k c2345kM31043s3 = c11602h1.m31043s();
                InterfaceC2339e interfaceC2339e3 = c2345kM31043s3.f9275c;
                String str4 = c2345kM31043s3.f9273a;
                EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
                if (interfaceC2339e3.isLoggable(enumC2341g3, str4)) {
                    c2345kM31043s3.f9274b.log(enumC2341g3, str4, "[listenToMediaChanges#enableCamera] No capability to send video.", null);
                    return c23454a0;
                }
                return c23454a0;
            }
            TrackType trackType2 = TrackType.TRACK_TYPE_VIDEO;
            c11602h1.m31028F(true, trackType2);
            strM31035j = c11602h1.m31035j(trackType2);
            C12645n c12645n2 = (C12645n) c13045h2.getValue();
            if (c12645n2 != null) {
                CameraEnumerationAndroid.CaptureFormat captureFormat2 = (CameraEnumerationAndroid.CaptureFormat) c33368c0.m105817h().f139757e.f139360q.getValue();
                this.f37466x = strM31035j;
                this.f37465w = 1;
                obj = c12645n2.m35406v(strM31035j, trackType2, captureFormat2, this);
                if (obj != enumC31071a) {
                    str = strM31035j;
                }
                return enumC31071a;
            }
            TrackType trackType3 = TrackType.TRACK_TYPE_VIDEO;
            AbstractC22676k.m65748h(mediaStreamTrack, "null cannot be cast to non-null type org.webrtc.VideoTrack");
            c11602h1.m31027E(trackType3, new C4207w(strM31035j, (VideoTrack) mediaStreamTrack));
            return c23454a0;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        str = (String) this.f37466x;
        AbstractC34132o.m107864I(obj);
        mediaStreamTrack = (MediaStreamTrack) obj;
        strM31035j = str;
        TrackType trackType4 = TrackType.TRACK_TYPE_VIDEO;
        AbstractC22676k.m65748h(mediaStreamTrack, "null cannot be cast to non-null type org.webrtc.VideoTrack");
        c11602h1.m31027E(trackType4, new C4207w(strM31035j, (VideoTrack) mediaStreamTrack));
        return c23454a0;
    }
}

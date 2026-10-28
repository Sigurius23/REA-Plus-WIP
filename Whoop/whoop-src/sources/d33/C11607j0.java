package d33;

import c43.C4207w;
import c93.InterfaceC4351m;
import e33.C12645n;
import ec3.C13045h2;
import io.getstream.android.video.generated.models.OwnCapability;
import java.util.List;
import l83.C23454a0;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoTrack;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import stream.video.sfu.models.TrackType;
import t23.AbstractC33441q1;
import t23.C33431o1;

/* JADX INFO: renamed from: d33.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11607j0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f37470w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f37471x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11602h1 f37472y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11607j0(C11602h1 c11602h1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37472y = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C11607j0 c11607j0 = new C11607j0(this.f37472y, interfaceC30057d);
        c11607j0.f37471x = obj;
        return c11607j0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C11607j0) create((AbstractC33441q1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        String strM31035j;
        MediaStreamTrack mediaStreamTrack;
        String str;
        C11602h1 c11602h1 = this.f37472y;
        C13045h2 c13045h2 = c11602h1.f37421A;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f37470w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            AbstractC33441q1 abstractC33441q1 = (AbstractC33441q1) this.f37471x;
            boolean zContains = ((List) c11602h1.f37440b.f139302p.f139624M.getValue()).contains(OwnCapability.Screenshare.INSTANCE);
            if (!AbstractC22676k.m65745e(abstractC33441q1, C33431o1.f139566a)) {
                TrackType trackType = TrackType.TRACK_TYPE_SCREEN_SHARE;
                c11602h1.m31028F(false, trackType);
                C12645n c12645n = (C12645n) c13045h2.getValue();
                if (c12645n != null) {
                    this.f37470w = 2;
                    c12645n.m35397A(trackType);
                    if (c23454a0 == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return c23454a0;
            }
            if (zContains) {
                TrackType trackType2 = TrackType.TRACK_TYPE_SCREEN_SHARE;
                c11602h1.m31028F(true, trackType2);
                strM31035j = c11602h1.m31035j(trackType2);
                C12645n c12645n2 = (C12645n) c13045h2.getValue();
                mediaStreamTrack = null;
                if (c12645n2 != null) {
                    this.f37471x = strM31035j;
                    this.f37470w = 1;
                    obj = c12645n2.m35406v(strM31035j, trackType2, null, this);
                    if (obj != enumC31071a) {
                        str = strM31035j;
                    }
                    return enumC31071a;
                }
                TrackType trackType3 = TrackType.TRACK_TYPE_SCREEN_SHARE;
                AbstractC22676k.m65748h(mediaStreamTrack, "null cannot be cast to non-null type org.webrtc.VideoTrack");
                c11602h1.m31027E(trackType3, new C4207w(strM31035j, (VideoTrack) mediaStreamTrack));
                return c23454a0;
            }
            return c23454a0;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        str = (String) this.f37471x;
        AbstractC34132o.m107864I(obj);
        mediaStreamTrack = (MediaStreamTrack) obj;
        strM31035j = str;
        TrackType trackType4 = TrackType.TRACK_TYPE_SCREEN_SHARE;
        AbstractC22676k.m65748h(mediaStreamTrack, "null cannot be cast to non-null type org.webrtc.VideoTrack");
        c11602h1.m31027E(trackType4, new C4207w(strM31035j, (VideoTrack) mediaStreamTrack));
        return c23454a0;
    }
}

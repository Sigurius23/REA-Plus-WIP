package e33;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.sentry.internal.debugmeta.C20378c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.C25271y;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import sc3.AbstractC32398l;
import stream.video.sfu.models.PublishOption;
import stream.video.sfu.models.TrackType;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: e33.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C12639k extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C12645n f43169w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f43170x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TrackType f43171y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ CameraEnumerationAndroid.CaptureFormat f43172z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12639k(C12645n c12645n, String str, TrackType trackType, CameraEnumerationAndroid.CaptureFormat captureFormat, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f43169w = c12645n;
        this.f43170x = str;
        this.f43171y = trackType;
        this.f43172z = captureFormat;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C12639k(this.f43169w, this.f43170x, this.f43171y, this.f43172z, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C12639k) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0198  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0198, please report this as an issue */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C2345k c2345kM35417f;
        InterfaceC2339e interfaceC2339e;
        String str;
        EnumC2341g enumC2341g;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        C12645n c12645n = this.f43169w;
        C20378c c20378c = c12645n.f43190F;
        List<PublishOption> list = c12645n.f43200y;
        String streamId = this.f43170x;
        AbstractC22676k.m65750j(streamId, "streamId");
        TrackType trackType = this.f43171y;
        AbstractC22676k.m65750j(trackType, "trackType");
        C2345k c2345kM35417f2 = c12645n.m35417f();
        InterfaceC2339e interfaceC2339e2 = c2345kM35417f2.f9275c;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        String str2 = c2345kM35417f2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345kM35417f2.f9274b.log(enumC2341g2, str2, "[trackPublishing] Publishing track: " + trackType, null);
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            c2345kM35417f = c12645n.m35417f();
            interfaceC2339e = c2345kM35417f.f9275c;
            str = c2345kM35417f.f9273a;
            enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM35417f.f9274b.log(enumC2341g, str, "[trackPublishing] No publish options found for " + trackType, null);
            }
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((PublishOption) it.next()).getTrack_type() == trackType) {
                    for (PublishOption publishOption : list) {
                        if (publishOption.getTrack_type() == trackType) {
                            RtpTransceiver rtpTransceiverM56589r = c20378c.m56589r(publishOption);
                            C25271y c25271y = C25271y.f99162w;
                            CameraEnumerationAndroid.CaptureFormat captureFormat = this.f43172z;
                            if (rtpTransceiverM56589r == null) {
                                C2345k c2345kM35417f3 = c12645n.m35417f();
                                InterfaceC2339e interfaceC2339e3 = c2345kM35417f3.f9275c;
                                String str3 = c2345kM35417f3.f9273a;
                                EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
                                if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                                    c2345kM35417f3.f9274b.log(enumC2341g3, str3, "[trackPublishing] No transceiver found for " + trackType + ", creating new track and transceiver.", null);
                                }
                                MediaStreamTrack mediaStreamTrackM35405u = c12645n.m35405u(publishOption.getTrack_type());
                                String strM85628id = mediaStreamTrackM35405u.m85628id();
                                AbstractC22676k.m65749i(strM85628id, "id(...)");
                                c12645n.m35423m(trackType, strM85628id, c25271y);
                                c12645n.m35398n(AbstractC37056f.m118980f(streamId), captureFormat, mediaStreamTrackM35405u, publishOption);
                                return mediaStreamTrackM35405u;
                            }
                            try {
                                RtpSender sender = rtpTransceiverM56589r.getSender();
                                MediaStreamTrack mediaStreamTrackTrack = sender.track();
                                if (mediaStreamTrackTrack == null || mediaStreamTrackTrack.isDisposed()) {
                                    C2345k c2345kM35417f4 = c12645n.m35417f();
                                    InterfaceC2339e interfaceC2339e4 = c2345kM35417f4.f9275c;
                                    String str4 = c2345kM35417f4.f9273a;
                                    EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
                                    if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
                                        c2345kM35417f4.f9274b.log(enumC2341g4, str4, "[trackPublishing] Track is disposed, creating new one.", null);
                                    }
                                    MediaStreamTrack mediaStreamTrackM35405u2 = c12645n.m35405u(publishOption.getTrack_type());
                                    String strM85628id2 = mediaStreamTrackM35405u2.m85628id();
                                    AbstractC22676k.m65749i(strM85628id2, "id(...)");
                                    c12645n.m35423m(trackType, strM85628id2, c25271y);
                                    sender.setTrack(mediaStreamTrackM35405u2, true);
                                    return mediaStreamTrackM35405u2;
                                }
                                C2345k c2345kM35417f5 = c12645n.m35417f();
                                InterfaceC2339e interfaceC2339e5 = c2345kM35417f5.f9275c;
                                String str5 = c2345kM35417f5.f9273a;
                                EnumC2341g enumC2341g5 = EnumC2341g.DEBUG;
                                if (interfaceC2339e5.isLoggable(enumC2341g5, str5)) {
                                    c2345kM35417f5.f9274b.log(enumC2341g5, str5, "[trackPublishing] Track already exists.", null);
                                }
                                AbstractC32398l.m100981n(mediaStreamTrackTrack, true);
                                c12645n.m35403s(mediaStreamTrackTrack);
                                String strM85628id3 = mediaStreamTrackTrack.m85628id();
                                AbstractC22676k.m65749i(strM85628id3, "id(...)");
                                c12645n.m35423m(trackType, strM85628id3, c25271y);
                                return mediaStreamTrackTrack;
                            } catch (Exception unused) {
                                C2345k c2345kM35417f6 = c12645n.m35417f();
                                InterfaceC2339e interfaceC2339e6 = c2345kM35417f6.f9275c;
                                String str6 = c2345kM35417f6.f9273a;
                                EnumC2341g enumC2341g6 = EnumC2341g.WARN;
                                if (interfaceC2339e6.isLoggable(enumC2341g6, str6)) {
                                    c2345kM35417f6.f9274b.log(enumC2341g6, str6, "Failed to set track for " + publishOption.getTrack_type() + ", creating new transceiver", null);
                                }
                                ((Map) c20378c.f76422x).remove(C20378c.m56577y(publishOption));
                                MediaStreamTrack mediaStreamTrackM35405u3 = c12645n.m35405u(publishOption.getTrack_type());
                                String strM85628id4 = mediaStreamTrackM35405u3.m85628id();
                                AbstractC22676k.m65749i(strM85628id4, "id(...)");
                                c12645n.m35423m(trackType, strM85628id4, c25271y);
                                c12645n.m35398n(AbstractC37056f.m118980f(streamId), captureFormat, mediaStreamTrackM35405u3, publishOption);
                                return mediaStreamTrackM35405u3;
                            }
                        }
                    }
                }
            }
            c2345kM35417f = c12645n.m35417f();
            interfaceC2339e = c2345kM35417f.f9275c;
            str = c2345kM35417f.f9273a;
            enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM35417f.f9274b.log(enumC2341g, str, "[trackPublishing] No publish options found for " + trackType, null);
            }
        }
        return null;
    }
}

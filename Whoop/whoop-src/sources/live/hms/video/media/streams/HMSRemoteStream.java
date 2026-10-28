package live.hms.video.media.streams;

import hms.webrtc.MediaStream;
import java.util.Locale;
import l83.C23454a0;
import live.hms.video.connection.subscribe.HMSSubscribeConnection;
import live.hms.video.media.settings.HMSSimulcastLayer;
import live.hms.video.media.streams.models.PreferLayer;
import live.hms.video.media.streams.models.PreferLayerAudio;
import live.hms.video.media.streams.models.PreferStateResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/media/streams/HMSRemoteStream;", "Llive/hms/video/media/streams/HMSMediaStream;", "Lhms/webrtc/MediaStream;", "nativeStream", "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;", "connection", "<init>", "(Lhms/webrtc/MediaStream;Llive/hms/video/connection/subscribe/HMSSubscribeConnection;)V", "", "trackId", "", "isEnabled", "Ll83/a0;", "setAudio", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Llive/hms/video/media/settings/HMSSimulcastLayer;", "layer", "Llive/hms/video/media/streams/models/PreferStateResponse;", "setVideo", "(Llive/hms/video/media/settings/HMSSimulcastLayer;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "with", "compareNative", "(Lhms/webrtc/MediaStream;)Z", "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;", "shouldSubscribeToAudio", "Z", "videoSimulcastLayer", "Llive/hms/video/media/settings/HMSSimulcastLayer;", "frameRate", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSRemoteStream extends HMSMediaStream {
    private final HMSSubscribeConnection connection;
    private HMSSimulcastLayer frameRate;
    private boolean shouldSubscribeToAudio;
    private HMSSimulcastLayer videoSimulcastLayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSRemoteStream(MediaStream nativeStream, HMSSubscribeConnection connection) {
        super(nativeStream);
        AbstractC22676k.m65750j(nativeStream, "nativeStream");
        AbstractC22676k.m65750j(connection, "connection");
        this.connection = connection;
        this.shouldSubscribeToAudio = true;
        HMSSimulcastLayer hMSSimulcastLayer = HMSSimulcastLayer.HIGH;
        this.videoSimulcastLayer = hMSSimulcastLayer;
        this.frameRate = hMSSimulcastLayer;
    }

    public final boolean compareNative(MediaStream with) {
        AbstractC22676k.m65750j(with, "with");
        return AbstractC22676k.m65745e(getNativeStream(), with);
    }

    public final Object setAudio(String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.shouldSubscribeToAudio = z4;
        Object objSendOverApiDataChannel = this.connection.sendOverApiDataChannel(new PreferLayerAudio(str, z4), false, interfaceC30057d);
        return objSendOverApiDataChannel == EnumC31071a.f128113w ? objSendOverApiDataChannel : C23454a0.f92919a;
    }

    public final Object setVideo(HMSSimulcastLayer hMSSimulcastLayer, String str, InterfaceC30057d<? super PreferStateResponse> interfaceC30057d) {
        this.videoSimulcastLayer = hMSSimulcastLayer;
        HMSSubscribeConnection hMSSubscribeConnection = this.connection;
        String lowerCase = hMSSimulcastLayer.name().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return hMSSubscribeConnection.sendOverApiDataChannel(new PreferLayer(str, lowerCase), true, interfaceC30057d);
    }
}

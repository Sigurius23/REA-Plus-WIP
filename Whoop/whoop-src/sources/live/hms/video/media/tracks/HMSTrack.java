package live.hms.video.media.tracks;

import hms.webrtc.MediaStreamTrack;
import l83.C23454a0;
import l83.C23467m;
import live.hms.video.media.streams.HMSMediaStream;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0090@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0011R*\u0010!\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u001eR*\u0010$\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&\"\u0004\b'\u0010(R*\u0010)\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b*\u0010&\"\u0004\b\u000f\u0010(R\u0014\u0010.\u001a\u00020+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Llive/hms/video/media/tracks/HMSTrack;", "", "Llive/hms/video/media/streams/HMSMediaStream;", "stream", "Lhms/webrtc/MediaStreamTrack;", "nativeTrack", "", "source", "<init>", "(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/MediaStreamTrack;Ljava/lang/String;)V", "", "value", "Ll83/a0;", "setEnabled$lib_release", "(ZLq83/d;)Ljava/lang/Object;", "setEnabled", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "Llive/hms/video/media/streams/HMSMediaStream;", "getStream$lib_release", "()Llive/hms/video/media/streams/HMSMediaStream;", "Lhms/webrtc/MediaStreamTrack;", "getNativeTrack$lib_release", "()Lhms/webrtc/MediaStreamTrack;", "Ljava/lang/String;", "getSource", "setSource", "(Ljava/lang/String;)V", "trackId", "getTrackId", "description", "getDescription", "setDescription$lib_release", "isMute", "Z", "()Z", "setMute$lib_release", "(Z)V", "isEnabled", "isEnabled$lib_release", "Llive/hms/video/media/tracks/HMSTrackType;", "getType", "()Llive/hms/video/media/tracks/HMSTrackType;", "type", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class HMSTrack {
    private String description;
    private boolean isEnabled;
    private boolean isMute;
    private final MediaStreamTrack nativeTrack;
    private String source;
    private final HMSMediaStream stream;
    private final String trackId;

    public HMSTrack(HMSMediaStream stream2, MediaStreamTrack nativeTrack, String source) {
        Object objM107888l;
        AbstractC22676k.m65750j(stream2, "stream");
        AbstractC22676k.m65750j(nativeTrack, "nativeTrack");
        AbstractC22676k.m65750j(source, "source");
        this.stream = stream2;
        this.nativeTrack = nativeTrack;
        this.source = source;
        String strM49577id = nativeTrack.m49577id();
        AbstractC22676k.m65749i(strM49577id, "id(...)");
        this.trackId = strM49577id;
        this.description = new String();
        try {
            objM107888l = Boolean.valueOf(nativeTrack.enabled());
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Boolean bool = (Boolean) (objM107888l instanceof C23467m ? null : objM107888l);
        this.isEnabled = bool != null ? bool.booleanValue() : false;
    }

    private final void setEnabled(boolean z4) {
        try {
            this.nativeTrack.setEnabled(z4);
        } catch (Exception e5) {
            HMSLogger.INSTANCE.m71138e("HMSTrack", "Error setting enabled for track as it has been disposed", e5);
        }
        this.isEnabled = z4;
    }

    public static /* synthetic */ Object setEnabled$suspendImpl(HMSTrack hMSTrack, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        hMSTrack.setEnabled(z4);
        return C23454a0.f92919a;
    }

    public boolean equals(Object other) {
        if (!(other == null ? true : other instanceof HMSTrack)) {
            return false;
        }
        HMSTrack hMSTrack = (HMSTrack) other;
        return AbstractC22676k.m65745e(this.trackId, hMSTrack != null ? hMSTrack.trackId : null);
    }

    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: getNativeTrack$lib_release, reason: from getter */
    public final MediaStreamTrack getNativeTrack() {
        return this.nativeTrack;
    }

    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: getStream$lib_release, reason: from getter */
    public HMSMediaStream getStream() {
        return this.stream;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public abstract HMSTrackType getType();

    /* JADX INFO: renamed from: isEnabled$lib_release, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: isMute, reason: from getter */
    public final boolean getIsMute() {
        return this.isMute;
    }

    public final void setDescription$lib_release(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.description = str;
    }

    public Object setEnabled$lib_release(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return setEnabled$suspendImpl(this, z4, interfaceC30057d);
    }

    public final void setMute$lib_release(boolean z4) {
        this.isMute = z4;
    }

    public final void setSource(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.source = str;
    }

    public String toString() {
        return "HMSTrack(trackId=" + this.trackId + ", isEnabled=" + this.isEnabled + ", type=" + getType() + ')';
    }

    public /* synthetic */ HMSTrack(HMSMediaStream hMSMediaStream, MediaStreamTrack mediaStreamTrack, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hMSMediaStream, mediaStreamTrack, (i13 & 4) != 0 ? "regular" : str);
    }
}

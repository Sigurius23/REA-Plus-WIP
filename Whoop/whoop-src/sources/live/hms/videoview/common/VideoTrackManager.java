package live.hms.videoview.common;

import android.os.Handler;
import android.os.Looper;
import c93.InterfaceC4339a;
import com.mapbox.maps.RunnableC5502c;
import hms.webrtc.RendererCommon;
import hms.webrtc.VideoSink;
import io.sentry.RunnableC20277c7;
import java.util.List;
import live.hms.video.media.settings.HMSLayer;
import live.hms.video.media.settings.HMSSimulcastLayerDefinition;
import live.hms.video.media.tracks.HMSLocalVideoTrack;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.media.tracks.HMSVideoTrack;
import live.hms.videoview.ResolutionChangeListener;
import live.hms.videoview.VideoViewStateChangeListener;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J!\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\u0004\u0018\u00010\u0019*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\"\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010\u0014J\u0019\u0010-\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\u0014J'\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016¢\u0006\u0004\b2\u00103J\u001f\u00108\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u00020\u001dH\u0000¢\u0006\u0004\b6\u00107J\u0017\u0010<\u001a\u00020\u00062\u0006\u00109\u001a\u00020\nH\u0000¢\u0006\u0004\b:\u0010;R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010?R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\bC\u0010?R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\bD\u0010?R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0016\u0010Q\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010ER\u0016\u0010R\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010ER\u0016\u0010S\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010E¨\u0006T"}, m65681d2 = {"Llive/hms/videoview/common/VideoTrackManager;", "Lhms/webrtc/RendererCommon$RendererEvents;", "Lkotlin/Function0;", "Lhms/webrtc/VideoSink;", "attachedVideoSink", "Lkotlin/Function1;", "Ll83/a0;", "initRenderer", "releaseRenderer", "clearFrame", "", "enableAutoSimulcast", "<init>", "(Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Z)V", "Llive/hms/video/media/tracks/HMSVideoTrack;", "track", "bind", "(Llive/hms/video/media/tracks/HMSVideoTrack;)V", "unbind", "safeInit", "()V", "safeRelease", "dispatchAutoSimulcastLayerUpdate", "remoteVideoTrack", "dispatchLayerInfoToSfu", "Llive/hms/video/media/settings/HMSLayer;", "updateSimulcastLayer", "(Llive/hms/video/media/tracks/HMSVideoTrack;Z)Llive/hms/video/media/settings/HMSLayer;", "Llive/hms/video/media/tracks/HMSRemoteVideoTrack;", "", "width", "height", "pickTheClosestLayerBasedOnResolution", "(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;II)Llive/hms/video/media/settings/HMSLayer;", "enableBlackFrame", "addTrack", "(Llive/hms/video/media/tracks/HMSVideoTrack;Z)V", "getCurrentTrack", "()Llive/hms/video/media/tracks/HMSVideoTrack;", "removeTrack$videoview_release", "removeTrack", "Llive/hms/videoview/VideoViewStateChangeListener;", "videoViewStateChangeListener", "setVideoViewStateChangeListener$videoview_release", "(Llive/hms/videoview/VideoViewStateChangeListener;)V", "setVideoViewStateChangeListener", "onFirstFrameRendered", "videoWidth", "videoHeight", "rotation", "onFrameResolutionChanged", "(III)V", "changedWidth", "changedHeight", "onSizeChanged$videoview_release", "(II)V", "onSizeChanged", "isDisabled", "disableAutoSimulcastLayerSelect$videoview_release", "(Z)V", "disableAutoSimulcastLayerSelect", "Lc93/a;", "getAttachedVideoSink", "()Lc93/a;", "Lkotlin/jvm/functions/Function1;", "getInitRenderer", "()Lkotlin/jvm/functions/Function1;", "getReleaseRenderer", "getClearFrame", "Z", "getEnableAutoSimulcast", "()Z", "currentTrack", "Llive/hms/video/media/tracks/HMSVideoTrack;", "Llive/hms/videoview/VideoViewStateChangeListener;", "Llive/hms/videoview/ResolutionChangeListener;", "resolutionChangeListener", "Llive/hms/videoview/ResolutionChangeListener;", "currentWidth", "I", "currentHeight", "isAutoSimulcastEnabled", "pendingTrackUpdate", "isInitialised", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class VideoTrackManager implements RendererCommon.RendererEvents {
    private final InterfaceC4339a attachedVideoSink;
    private final InterfaceC4339a clearFrame;
    private int currentHeight;
    private HMSVideoTrack currentTrack;
    private int currentWidth;
    private final boolean enableAutoSimulcast;
    private final Function1 initRenderer;
    private boolean isAutoSimulcastEnabled;
    private boolean isInitialised;
    private boolean pendingTrackUpdate;
    private final InterfaceC4339a releaseRenderer;
    private ResolutionChangeListener resolutionChangeListener;
    private VideoViewStateChangeListener videoViewStateChangeListener;

    public VideoTrackManager(InterfaceC4339a attachedVideoSink, Function1 initRenderer, InterfaceC4339a releaseRenderer, InterfaceC4339a clearFrame, boolean z4) {
        AbstractC22676k.m65750j(attachedVideoSink, "attachedVideoSink");
        AbstractC22676k.m65750j(initRenderer, "initRenderer");
        AbstractC22676k.m65750j(releaseRenderer, "releaseRenderer");
        AbstractC22676k.m65750j(clearFrame, "clearFrame");
        this.attachedVideoSink = attachedVideoSink;
        this.initRenderer = initRenderer;
        this.releaseRenderer = releaseRenderer;
        this.clearFrame = clearFrame;
        this.enableAutoSimulcast = z4;
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.isAutoSimulcastEnabled = z4;
    }

    public static /* synthetic */ void addTrack$default(VideoTrackManager videoTrackManager, HMSVideoTrack hMSVideoTrack, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        videoTrackManager.addTrack(hMSVideoTrack, z4);
    }

    private final void bind(HMSVideoTrack track) {
        HMSLayer hMSLayerUpdateSimulcastLayer = updateSimulcastLayer(track, false);
        if (track instanceof HMSRemoteVideoTrack) {
            HMSRemoteVideoTrack hMSRemoteVideoTrack = (HMSRemoteVideoTrack) track;
            VideoSink videoSink = (VideoSink) this.attachedVideoSink.invoke();
            if (hMSLayerUpdateSimulcastLayer == null) {
                hMSLayerUpdateSimulcastLayer = hMSRemoteVideoTrack.getLayer();
            }
            hMSRemoteVideoTrack.addSinkInternal(videoSink, hMSLayerUpdateSimulcastLayer);
        } else if (track instanceof HMSLocalVideoTrack) {
            HMSVideoTrack.addSink$default(track, (VideoSink) this.attachedVideoSink.invoke(), null, 2, null);
        }
        this.currentTrack = track;
    }

    private final void dispatchAutoSimulcastLayerUpdate() {
        if (!this.isAutoSimulcastEnabled || this.pendingTrackUpdate) {
            return;
        }
        HMSVideoTrack hMSVideoTrack = this.currentTrack;
        if (hMSVideoTrack == null) {
            this.pendingTrackUpdate = true;
            return;
        }
        if (hMSVideoTrack instanceof HMSRemoteVideoTrack) {
            this.pendingTrackUpdate = true;
            HMSRemoteVideoTrack hMSRemoteVideoTrack = hMSVideoTrack instanceof HMSRemoteVideoTrack ? (HMSRemoteVideoTrack) hMSVideoTrack : null;
            if (hMSRemoteVideoTrack != null) {
                updateSimulcastLayer(hMSRemoteVideoTrack, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFirstFrameRendered$lambda$3(VideoTrackManager this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        VideoViewStateChangeListener videoViewStateChangeListener = this$0.videoViewStateChangeListener;
        if (videoViewStateChangeListener != null) {
            videoViewStateChangeListener.onFirstFrameRendered();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFrameResolutionChanged$lambda$4(VideoTrackManager this$0, int i13, int i14) {
        AbstractC22676k.m65750j(this$0, "this$0");
        VideoViewStateChangeListener videoViewStateChangeListener = this$0.videoViewStateChangeListener;
        if (videoViewStateChangeListener != null) {
            videoViewStateChangeListener.onResolutionChange(i13, i14);
        }
    }

    private final HMSLayer pickTheClosestLayerBasedOnResolution(HMSRemoteVideoTrack hMSRemoteVideoTrack, int i13, int i14) {
        List<HMSSimulcastLayerDefinition> layerDefinition = hMSRemoteVideoTrack.getLayerDefinition();
        if (layerDefinition == null || layerDefinition.isEmpty()) {
            return null;
        }
        HMSSimulcastLayerDefinition hMSSimulcastLayerDefinition = hMSRemoteVideoTrack.getLayerDefinition().get(hMSRemoteVideoTrack.getLayerDefinition().size() - 1);
        int i15 = Integer.MAX_VALUE;
        for (HMSSimulcastLayerDefinition hMSSimulcastLayerDefinition2 : hMSRemoteVideoTrack.getLayerDefinition()) {
            int iAbs = Math.abs((i13 * i14) - (hMSSimulcastLayerDefinition2.getResolution().getHeight() * hMSSimulcastLayerDefinition2.getResolution().getWidth()));
            if (iAbs < i15) {
                hMSSimulcastLayerDefinition = hMSSimulcastLayerDefinition2;
                i15 = iAbs;
            }
        }
        return hMSSimulcastLayerDefinition.getLayer();
    }

    private final void safeInit() {
        if (this.isInitialised) {
            return;
        }
        this.initRenderer.invoke(this);
        this.isInitialised = true;
    }

    private final void safeRelease() {
        if (this.isInitialised) {
            this.releaseRenderer.invoke();
            this.isInitialised = false;
        }
    }

    private final void unbind(HMSVideoTrack track) {
        track.removeSink((VideoSink) this.attachedVideoSink.invoke());
        this.currentTrack = null;
    }

    private final HMSLayer updateSimulcastLayer(HMSVideoTrack remoteVideoTrack, boolean dispatchLayerInfoToSfu) {
        if (!this.pendingTrackUpdate || !this.isAutoSimulcastEnabled || !(remoteVideoTrack instanceof HMSRemoteVideoTrack)) {
            return null;
        }
        HMSRemoteVideoTrack hMSRemoteVideoTrack = (HMSRemoteVideoTrack) remoteVideoTrack;
        HMSLayer hMSLayerPickTheClosestLayerBasedOnResolution = pickTheClosestLayerBasedOnResolution(hMSRemoteVideoTrack, this.currentWidth, this.currentHeight);
        if (hMSLayerPickTheClosestLayerBasedOnResolution != null && dispatchLayerInfoToSfu) {
            HMSRemoteVideoTrack.setLayer$default(hMSRemoteVideoTrack, hMSLayerPickTheClosestLayerBasedOnResolution, null, 2, null);
        }
        this.pendingTrackUpdate = false;
        return hMSLayerPickTheClosestLayerBasedOnResolution;
    }

    public final void addTrack(HMSVideoTrack track, boolean enableBlackFrame) {
        safeInit();
        if (track instanceof HMSRemoteVideoTrack) {
            HMSVideoTrack hMSVideoTrack = this.currentTrack;
            if (hMSVideoTrack instanceof HMSRemoteVideoTrack) {
                HMSRemoteVideoTrack hMSRemoteVideoTrack = (HMSRemoteVideoTrack) track;
                if ((hMSVideoTrack != null ? hMSVideoTrack.getTrackId() : null) == hMSRemoteVideoTrack.getTrackId()) {
                    HMSVideoTrack hMSVideoTrack2 = this.currentTrack;
                    HMSRemoteVideoTrack hMSRemoteVideoTrack2 = hMSVideoTrack2 instanceof HMSRemoteVideoTrack ? (HMSRemoteVideoTrack) hMSVideoTrack2 : null;
                    if (hMSRemoteVideoTrack2 != null && hMSRemoteVideoTrack2.getSsrc() == hMSRemoteVideoTrack.getSsrc()) {
                        return;
                    }
                }
            }
        }
        if (track instanceof HMSLocalVideoTrack) {
            HMSVideoTrack hMSVideoTrack3 = this.currentTrack;
            if (hMSVideoTrack3 instanceof HMSLocalVideoTrack) {
                if ((hMSVideoTrack3 != null ? hMSVideoTrack3.getTrackId() : null) == ((HMSLocalVideoTrack) track).getTrackId()) {
                    return;
                }
            }
        }
        HMSVideoTrack hMSVideoTrack4 = this.currentTrack;
        if (hMSVideoTrack4 != null && hMSVideoTrack4 != null) {
            unbind(hMSVideoTrack4);
            if (enableBlackFrame) {
                this.clearFrame.invoke();
            }
        }
        if (track != null) {
            bind(track);
        }
    }

    public final void disableAutoSimulcastLayerSelect$videoview_release(boolean isDisabled) {
        this.isAutoSimulcastEnabled = !isDisabled;
        dispatchAutoSimulcastLayerUpdate();
    }

    public final InterfaceC4339a getAttachedVideoSink() {
        return this.attachedVideoSink;
    }

    public final InterfaceC4339a getClearFrame() {
        return this.clearFrame;
    }

    public final HMSVideoTrack getCurrentTrack() {
        return this.currentTrack;
    }

    public final boolean getEnableAutoSimulcast() {
        return this.enableAutoSimulcast;
    }

    public final Function1 getInitRenderer() {
        return this.initRenderer;
    }

    public final InterfaceC4339a getReleaseRenderer() {
        return this.releaseRenderer;
    }

    @Override // hms.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        new Handler(Looper.getMainLooper()).post(new RunnableC20277c7(this, 20));
    }

    @Override // hms.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(int videoWidth, int videoHeight, int rotation) {
        new Handler(Looper.getMainLooper()).post(new RunnableC5502c(this, videoWidth, videoHeight, 3));
    }

    public final void onSizeChanged$videoview_release(int changedWidth, int changedHeight) {
        if (this.currentWidth == changedWidth && this.currentHeight == changedHeight) {
            return;
        }
        this.currentWidth = changedWidth;
        this.currentHeight = changedHeight;
        dispatchAutoSimulcastLayerUpdate();
    }

    public final void removeTrack$videoview_release() {
        HMSVideoTrack hMSVideoTrack = this.currentTrack;
        if (hMSVideoTrack == null) {
            safeRelease();
            return;
        }
        if (hMSVideoTrack != null) {
            unbind(hMSVideoTrack);
        }
        safeRelease();
    }

    public final void setVideoViewStateChangeListener$videoview_release(VideoViewStateChangeListener videoViewStateChangeListener) {
        this.videoViewStateChangeListener = videoViewStateChangeListener;
    }

    public /* synthetic */ VideoTrackManager(InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4339a, function1, interfaceC4339a2, interfaceC4339a3, (i13 & 16) != 0 ? true : z4);
    }
}

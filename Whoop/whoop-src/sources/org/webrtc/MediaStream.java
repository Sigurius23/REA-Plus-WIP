package org.webrtc;

import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes3.dex */
public class MediaStream {
    private static final String TAG = "MediaStream";
    private long nativeStream;
    public final List<AudioTrack> audioTracks = new ArrayList();
    public final List<VideoTrack> videoTracks = new ArrayList();
    public final List<VideoTrack> preservedVideoTracks = new ArrayList();

    @CalledByNative
    public MediaStream(long j7) {
        this.nativeStream = j7;
    }

    private void checkMediaStreamExists() {
        if (this.nativeStream == 0) {
            throw new IllegalStateException("MediaStream has been disposed.");
        }
    }

    private static native boolean nativeAddAudioTrackToNativeStream(long j7, long j13);

    private static native boolean nativeAddVideoTrackToNativeStream(long j7, long j13);

    private static native String nativeGetId(long j7);

    private static native boolean nativeRemoveAudioTrack(long j7, long j13);

    private static native boolean nativeRemoveVideoTrack(long j7, long j13);

    private static void removeMediaStreamTrack(List<? extends MediaStreamTrack> list, long j7) {
        Iterator<? extends MediaStreamTrack> it = list.iterator();
        while (it.hasNext()) {
            MediaStreamTrack next = it.next();
            if (next.getNativeMediaStreamTrack() == j7) {
                next.dispose();
                it.remove();
                return;
            }
        }
        Logging.m85622e(TAG, "Couldn't not find track");
    }

    @CalledByNative
    public void addNativeAudioTrack(long j7) {
        this.audioTracks.add(new AudioTrack(j7));
    }

    @CalledByNative
    public void addNativeVideoTrack(long j7) {
        this.videoTracks.add(new VideoTrack(j7));
    }

    public boolean addPreservedTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (!nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeVideoTrack())) {
            return false;
        }
        this.preservedVideoTracks.add(videoTrack);
        return true;
    }

    public boolean addTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        if (!nativeAddAudioTrackToNativeStream(this.nativeStream, audioTrack.getNativeAudioTrack())) {
            return false;
        }
        this.audioTracks.add(audioTrack);
        return true;
    }

    @CalledByNative
    public void dispose() {
        checkMediaStreamExists();
        while (!this.audioTracks.isEmpty()) {
            AudioTrack audioTrack = this.audioTracks.get(0);
            removeTrack(audioTrack);
            audioTrack.dispose();
        }
        while (!this.videoTracks.isEmpty()) {
            VideoTrack videoTrack = this.videoTracks.get(0);
            removeTrack(videoTrack);
            videoTrack.dispose();
        }
        while (!this.preservedVideoTracks.isEmpty()) {
            removeTrack(this.preservedVideoTracks.get(0));
        }
        JniCommon.nativeReleaseRef(this.nativeStream);
        this.nativeStream = 0L;
    }

    public String getId() {
        checkMediaStreamExists();
        return nativeGetId(this.nativeStream);
    }

    public long getNativeMediaStream() {
        checkMediaStreamExists();
        return this.nativeStream;
    }

    @CalledByNative
    public void removeAudioTrack(long j7) {
        removeMediaStreamTrack(this.audioTracks, j7);
    }

    public boolean removeTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        this.audioTracks.remove(audioTrack);
        return nativeRemoveAudioTrack(this.nativeStream, audioTrack.getNativeAudioTrack());
    }

    @CalledByNative
    public void removeVideoTrack(long j7) {
        removeMediaStreamTrack(this.videoTracks, j7);
    }

    public String toString() {
        String id4 = getId();
        int size = this.audioTracks.size();
        return AbstractC18489d0.m53371l(AbstractC11266d.m30467u(size, "[", id4, ":A=", ":V="), this.videoTracks.size(), "]");
    }

    public boolean addTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (!nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeVideoTrack())) {
            return false;
        }
        this.videoTracks.add(videoTrack);
        return true;
    }

    public boolean removeTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        this.videoTracks.remove(videoTrack);
        this.preservedVideoTracks.remove(videoTrack);
        return nativeRemoveVideoTrack(this.nativeStream, videoTrack.getNativeVideoTrack());
    }
}

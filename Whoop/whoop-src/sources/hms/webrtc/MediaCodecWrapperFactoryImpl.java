package hms.webrtc;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    public static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i13) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i13);
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public int dequeueInputBuffer(long j7) {
            return this.mediaCodec.dequeueInputBuffer(j7);
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j7) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j7);
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public ByteBuffer getInputBuffer(int i13) {
            return this.mediaCodec.getInputBuffer(i13);
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public MediaFormat getInputFormat() {
            return this.mediaCodec.getInputFormat();
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public ByteBuffer getOutputBuffer(int i13) {
            return this.mediaCodec.getOutputBuffer(i13);
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public void queueInputBuffer(int i13, int i14, int i15, long j7, int i16) {
            this.mediaCodec.queueInputBuffer(i13, i14, i15, j7, i16);
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public void releaseOutputBuffer(int i13, boolean z4) {
            this.mediaCodec.releaseOutputBuffer(i13, z4);
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // hms.webrtc.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }
    }

    @Override // hms.webrtc.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String str) throws IOException {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}

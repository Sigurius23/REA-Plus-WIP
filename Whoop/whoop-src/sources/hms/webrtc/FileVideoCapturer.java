package hms.webrtc;

import android.content.Context;
import android.os.SystemClock;
import hc3.AbstractC17176i;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes11.dex */
public class FileVideoCapturer implements VideoCapturer {
    private static final String TAG = "FileVideoCapturer";
    private CapturerObserver capturerObserver;
    private final VideoReader videoReader;
    private final Timer timer = new Timer();
    private final TimerTask tickTask = new TimerTask() { // from class: hms.webrtc.FileVideoCapturer.1
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            FileVideoCapturer.this.tick();
        }
    };

    public interface VideoReader {
        void close();

        VideoFrame getNextFrame();
    }

    public static class VideoReaderY4M implements VideoReader {
        private static final int FRAME_DELIMETER_LENGTH = 6;
        private static final String TAG = "VideoReaderY4M";
        private static final String Y4M_FRAME_DELIMETER = "FRAME";
        private final int frameHeight;
        private final int frameWidth;
        private final RandomAccessFile mediaFile;
        private final FileChannel mediaFileChannel;
        private final long videoStart;

        public VideoReaderY4M(String str) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            this.mediaFile = randomAccessFile;
            this.mediaFileChannel = randomAccessFile.getChannel();
            StringBuilder sb4 = new StringBuilder();
            while (true) {
                int i13 = this.mediaFile.read();
                if (i13 == -1) {
                    throw new RuntimeException(AbstractC11266d.m30461o("Found end of file before end of header for file: ", str));
                }
                if (i13 == 10) {
                    this.videoStart = this.mediaFileChannel.position();
                    String strSubstring = "";
                    int i14 = 0;
                    int i15 = 0;
                    for (String str2 : sb4.toString().split("[ ]")) {
                        char cCharAt = str2.charAt(0);
                        if (cCharAt == 'C') {
                            strSubstring = str2.substring(1);
                        } else if (cCharAt == 'H') {
                            i15 = Integer.parseInt(str2.substring(1));
                        } else if (cCharAt == 'W') {
                            i14 = Integer.parseInt(str2.substring(1));
                        }
                    }
                    Logging.m49570d(TAG, "Color space: " + strSubstring);
                    if (!strSubstring.equals("420") && !strSubstring.equals("420mpeg2")) {
                        throw new IllegalArgumentException("Does not support any other color space than I420 or I420mpeg2");
                    }
                    if (i14 % 2 == 1 || i15 % 2 == 1) {
                        throw new IllegalArgumentException("Does not support odd width or height");
                    }
                    this.frameWidth = i14;
                    this.frameHeight = i15;
                    Logging.m49570d(TAG, AbstractC25012a.m73372e(i14, i15, "frame dim: (", ", ", ")"));
                    return;
                }
                sb4.append((char) i13);
            }
        }

        @Override // hms.webrtc.FileVideoCapturer.VideoReader
        public void close() {
            try {
                this.mediaFile.close();
            } catch (IOException e5) {
                Logging.m49572e(TAG, "Problem closing file", e5);
            }
        }

        @Override // hms.webrtc.FileVideoCapturer.VideoReader
        public VideoFrame getNextFrame() {
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(this.frameWidth, this.frameHeight);
            ByteBuffer dataY = javaI420BufferAllocate.getDataY();
            ByteBuffer dataU = javaI420BufferAllocate.getDataU();
            ByteBuffer dataV = javaI420BufferAllocate.getDataV();
            javaI420BufferAllocate.getStrideY();
            javaI420BufferAllocate.getStrideU();
            javaI420BufferAllocate.getStrideV();
            try {
                int i13 = FRAME_DELIMETER_LENGTH;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i13);
                if (this.mediaFileChannel.read(byteBufferAllocate) < i13) {
                    this.mediaFileChannel.position(this.videoStart);
                    if (this.mediaFileChannel.read(byteBufferAllocate) < i13) {
                        throw new RuntimeException("Error looping video");
                    }
                }
                String str = new String(byteBufferAllocate.array(), Charset.forName("US-ASCII"));
                if (str.equals("FRAME\n")) {
                    this.mediaFileChannel.read(dataY);
                    this.mediaFileChannel.read(dataU);
                    this.mediaFileChannel.read(dataV);
                    return new VideoFrame(javaI420BufferAllocate, 0, nanos);
                }
                throw new RuntimeException("Frames should be delimited by FRAME plus newline, found delimter was: '" + str + "'");
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    public FileVideoCapturer(String str) throws IOException {
        try {
            this.videoReader = new VideoReaderY4M(str);
        } catch (IOException e5) {
            AbstractC17176i.m48510l("Could not open video file: ", str, TAG);
            throw e5;
        }
    }

    @Override // hms.webrtc.VideoCapturer
    public void changeCaptureFormat(int i13, int i14, int i15) {
    }

    @Override // hms.webrtc.VideoCapturer
    public void dispose() {
        this.videoReader.close();
    }

    @Override // hms.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
    }

    @Override // hms.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // hms.webrtc.VideoCapturer
    public void startCapture(int i13, int i14, int i15) {
        this.timer.schedule(this.tickTask, 0L, 1000 / i15);
    }

    @Override // hms.webrtc.VideoCapturer
    public void stopCapture() throws InterruptedException {
        this.timer.cancel();
    }

    public void tick() {
        VideoFrame nextFrame = this.videoReader.getNextFrame();
        this.capturerObserver.onFrameCaptured(nextFrame);
        nextFrame.release();
    }
}

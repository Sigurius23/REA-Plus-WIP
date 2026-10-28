package hms.webrtc;

import android.graphics.ImageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.DateTimeConstants;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
public class CameraEnumerationAndroid {
    static final ArrayList<Size> COMMON_RESOLUTIONS = new ArrayList<>(Arrays.asList(new Size(160, 120), new Size(240, 160), new Size(320, 240), new Size(400, 240), new Size(480, 320), new Size(640, 360), new Size(640, 480), new Size(768, 480), new Size(854, 480), new Size(800, 600), new Size(960, 540), new Size(960, 640), new Size(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, 576), new Size(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, 600), new Size(1280, 720), new Size(1280, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED), new Size(1920, 1080), new Size(1920, DateTimeConstants.MINUTES_PER_DAY), new Size(2560, DateTimeConstants.MINUTES_PER_DAY), new Size(3840, 2160)));
    private static final String TAG = "CameraEnumerationAndroid";

    public static class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        public static class FramerateRange {
            public int max;
            public int min;

            public FramerateRange(int i13, int i14) {
                this.min = i13;
                this.max = i14;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                return this.min == framerateRange.min && this.max == framerateRange.max;
            }

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public String toString() {
                return AbstractC31061c.m95638n("[", this.min / 1000.0f, ":", this.max / 1000.0f, "]");
            }
        }

        public CaptureFormat(int i13, int i14, int i15, int i16) {
            this.width = i13;
            this.height = i14;
            this.framerate = new FramerateRange(i15, i16);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            return this.width == captureFormat.width && this.height == captureFormat.height && this.framerate.equals(captureFormat.framerate);
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }

        public int hashCode() {
            return this.framerate.hashCode() + (((this.width * 65497) + this.height) * 251) + 1;
        }

        public String toString() {
            return this.width + "x" + this.height + "@" + this.framerate;
        }

        public static int frameSize(int i13, int i14, int i15) {
            if (i15 != 17) {
                throw new UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
            }
            return (ImageFormat.getBitsPerPixel(i15) * (i13 * i14)) / 8;
        }

        public CaptureFormat(int i13, int i14, FramerateRange framerateRange) {
            this.width = i13;
            this.height = i14;
            this.framerate = framerateRange;
        }
    }

    public static abstract class ClosestComparator<T> implements Comparator<T> {
        public /* synthetic */ ClosestComparator(int i13) {
            this();
        }

        @Override // java.util.Comparator
        public int compare(T t14, T t15) {
            return diff(t14) - diff(t15);
        }

        public abstract int diff(T t14);

        private ClosestComparator() {
        }
    }

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CaptureFormat.FramerateRange> list, final int i13) {
        return (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator<CaptureFormat.FramerateRange>() { // from class: hms.webrtc.CameraEnumerationAndroid.1
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            private int progressivePenalty(int i14, int i15, int i16, int i17) {
                if (i14 < i15) {
                    return i14 * i16;
                }
                return ((i14 - i15) * i17) + (i16 * i15);
            }

            @Override // hms.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(CaptureFormat.FramerateRange framerateRange) {
                return progressivePenalty(framerateRange.min, MIN_FPS_THRESHOLD, 1, 4) + progressivePenalty(Math.abs((i13 * 1000) - framerateRange.max), 5000, 1, 3);
            }
        });
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i13, final int i14) {
        return (Size) Collections.min(list, new ClosestComparator<Size>() { // from class: hms.webrtc.CameraEnumerationAndroid.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // hms.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(Size size) {
                return Math.abs(i14 - size.height) + Math.abs(i13 - size.width);
            }
        });
    }

    public static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }
}

package hms.webrtc;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Metrics {
    private static final String TAG = "Metrics";
    public final Map<String, HistogramInfo> map = new HashMap();

    public static class HistogramInfo {
        public final int bucketCount;
        public final int max;
        public final int min;
        public final Map<Integer, Integer> samples = new HashMap();

        @CalledByNative("HistogramInfo")
        public HistogramInfo(int i13, int i14, int i15) {
            this.min = i13;
            this.max = i14;
            this.bucketCount = i15;
        }

        @CalledByNative("HistogramInfo")
        public void addSample(int i13, int i14) {
            this.samples.put(Integer.valueOf(i13), Integer.valueOf(i14));
        }
    }

    @CalledByNative
    public Metrics() {
    }

    @CalledByNative
    private void add(String str, HistogramInfo histogramInfo) {
        this.map.put(str, histogramInfo);
    }

    public static void enable() {
        nativeEnable();
    }

    public static Metrics getAndReset() {
        return nativeGetAndReset();
    }

    private static native void nativeEnable();

    private static native Metrics nativeGetAndReset();
}

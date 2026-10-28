package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoEncoder {

    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        @CalledByNative("BitrateAllocation")
        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int i13 = 0;
            for (int[] iArr : this.bitratesBbs) {
                for (int i14 : iArr) {
                    i13 += i14;
                }
            }
            return i13;
        }
    }

    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public static class Capabilities {
        public final boolean lossNotification;

        @CalledByNative("Capabilities")
        public Capabilities(boolean z4) {
            this.lossNotification = z4;
        }
    }

    public static class CodecSpecificInfo {
    }

    public static class CodecSpecificInfoAV1 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoH265 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    public static class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        @CalledByNative("EncodeInfo")
        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    public static class EncoderInfo {
        public final boolean applyAlignmentToAllSimulcastLayers;
        public final int requestedResolutionAlignment;

        public EncoderInfo(int i13, boolean z4) {
            this.requestedResolutionAlignment = i13;
            this.applyAlignmentToAllSimulcastLayers = z4;
        }

        @CalledByNative("EncoderInfo")
        public boolean getApplyAlignmentToAllSimulcastLayers() {
            return this.applyAlignmentToAllSimulcastLayers;
        }

        @CalledByNative("EncoderInfo")
        public int getRequestedResolutionAlignment() {
            return this.requestedResolutionAlignment;
        }
    }

    public static class RateControlParameters {
        public final BitrateAllocation bitrate;
        public final double framerateFps;

        @CalledByNative("RateControlParameters")
        public RateControlParameters(BitrateAllocation bitrateAllocation, double d3) {
            this.bitrate = bitrateAllocation;
            this.framerateFps = d3;
        }
    }

    public static class ResolutionBitrateLimits {
        public final int frameSizePixels;
        public final int maxBitrateBps;
        public final int minBitrateBps;
        public final int minStartBitrateBps;

        public ResolutionBitrateLimits(int i13, int i14, int i15, int i16) {
            this.frameSizePixels = i13;
            this.minStartBitrateBps = i14;
            this.minBitrateBps = i15;
            this.maxBitrateBps = i16;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getFrameSizePixels() {
            return this.frameSizePixels;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMinBitrateBps() {
            return this.minBitrateBps;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMinStartBitrateBps() {
            return this.minStartBitrateBps;
        }
    }

    public static class Settings {
        public final boolean automaticResizeOn;
        public final Capabilities capabilities;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int startBitrate;
        public final int width;

        @Deprecated
        public Settings(int i13, int i14, int i15, int i16, int i17, int i18, boolean z4) {
            this(i13, i14, i15, i16, i17, i18, z4, new Capabilities(false));
        }

        @CalledByNative("Settings")
        public Settings(int i13, int i14, int i15, int i16, int i17, int i18, boolean z4, Capabilities capabilities) {
            this.numberOfCores = i13;
            this.width = i14;
            this.height = i15;
            this.startBitrate = i16;
            this.maxFramerate = i17;
            this.numberOfSimulcastStreams = i18;
            this.automaticResizeOn = z4;
            this.capabilities = capabilities;
        }
    }

    @CalledByNative
    default long createNative(long j7) {
        return 0L;
    }

    @CalledByNative
    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    @CalledByNative
    default EncoderInfo getEncoderInfo() {
        return new EncoderInfo(1, false);
    }

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    default ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return new ResolutionBitrateLimits[0];
    }

    @CalledByNative
    ScalingSettings getScalingSettings();

    @CalledByNative
    VideoCodecStatus initEncode(Settings settings, Callback callback);

    @CalledByNative
    default boolean isHardwareEncoder() {
        return true;
    }

    @CalledByNative
    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i13);

    @CalledByNative
    default VideoCodecStatus setRates(RateControlParameters rateControlParameters) {
        return setRateAllocation(rateControlParameters.bitrate, (int) Math.ceil(rateControlParameters.framerateFps));
    }

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;

        /* JADX INFO: renamed from: on */
        public final boolean f114049on;

        public ScalingSettings(int i13, int i14) {
            this.f114049on = true;
            this.low = Integer.valueOf(i13);
            this.high = Integer.valueOf(i14);
        }

        public String toString() {
            if (!this.f114049on) {
                return "OFF";
            }
            return "[ " + this.low + ", " + this.high + " ]";
        }

        private ScalingSettings() {
            this.f114049on = false;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z4) {
            this.f114049on = z4;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z4, int i13, int i14) {
            this.f114049on = z4;
            this.low = Integer.valueOf(i13);
            this.high = Integer.valueOf(i14);
        }
    }
}

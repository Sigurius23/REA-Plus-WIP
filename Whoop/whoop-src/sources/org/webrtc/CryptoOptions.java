package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public final class CryptoOptions {
    private final SFrame sframe;
    private final Srtp srtp;

    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean requireFrameEncryption;

        public /* synthetic */ Builder(int i13) {
            this();
        }

        public CryptoOptions createCryptoOptions() {
            return new CryptoOptions(this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption, 0);
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z4) {
            this.enableAes128Sha1_32CryptoCipher = z4;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z4) {
            this.enableEncryptedRtpHeaderExtensions = z4;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z4) {
            this.enableGcmCryptoSuites = z4;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z4) {
            this.requireFrameEncryption = z4;
            return this;
        }

        private Builder() {
        }
    }

    public final class SFrame {
        private final boolean requireFrameEncryption;

        public /* synthetic */ SFrame(CryptoOptions cryptoOptions, boolean z4, int i13) {
            this(z4);
        }

        @CalledByNative("SFrame")
        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }

        private SFrame(boolean z4) {
            this.requireFrameEncryption = z4;
        }
    }

    public final class Srtp {
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        private final boolean enableGcmCryptoSuites;

        public /* synthetic */ Srtp(CryptoOptions cryptoOptions, boolean z4, boolean z13, boolean z14, int i13) {
            this(z4, z13, z14);
        }

        @CalledByNative("Srtp")
        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        @CalledByNative("Srtp")
        public boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        @CalledByNative("Srtp")
        public boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }

        private Srtp(boolean z4, boolean z13, boolean z14) {
            this.enableGcmCryptoSuites = z4;
            this.enableAes128Sha1_32CryptoCipher = z13;
            this.enableEncryptedRtpHeaderExtensions = z14;
        }
    }

    public /* synthetic */ CryptoOptions(boolean z4, boolean z13, boolean z14, boolean z15, int i13) {
        this(z4, z13, z14, z15);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @CalledByNative
    public SFrame getSFrame() {
        return this.sframe;
    }

    @CalledByNative
    public Srtp getSrtp() {
        return this.srtp;
    }

    private CryptoOptions(boolean z4, boolean z13, boolean z14, boolean z15) {
        this.srtp = new Srtp(this, z4, z13, z14, 0);
        this.sframe = new SFrame(this, z15, 0);
    }
}

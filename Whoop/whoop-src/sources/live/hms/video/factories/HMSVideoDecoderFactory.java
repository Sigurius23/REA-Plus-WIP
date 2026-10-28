package live.hms.video.factories;

import c93.InterfaceC4339a;
import hms.webrtc.DefaultVideoDecoderFactory;
import hms.webrtc.EglBase;
import hms.webrtc.HardwareVideoDecoderFactory;
import hms.webrtc.PlatformSoftwareVideoDecoderFactory;
import hms.webrtc.SoftwareVideoDecoderFactory;
import hms.webrtc.VideoCodecInfo;
import hms.webrtc.VideoDecoder;
import hms.webrtc.VideoDecoderFallback;
import l83.InterfaceC23462h;
import lh1.C24069a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Llive/hms/video/factories/HMSVideoDecoderFactory;", "Lhms/webrtc/DefaultVideoDecoderFactory;", "Lhms/webrtc/EglBase$Context;", "eglContext", "", "forceSoftwareDecoder", "<init>", "(Lhms/webrtc/EglBase$Context;Z)V", "Lhms/webrtc/VideoCodecInfo;", "codecType", "Lhms/webrtc/VideoDecoder;", "createDecoder", "(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;", "Z", "getForceSoftwareDecoder", "()Z", "Lhms/webrtc/HardwareVideoDecoderFactory;", "hardwareVideoDecoderFactory$delegate", "Ll83/h;", "getHardwareVideoDecoderFactory", "()Lhms/webrtc/HardwareVideoDecoderFactory;", "hardwareVideoDecoderFactory", "Lhms/webrtc/SoftwareVideoDecoderFactory;", "softwareVideoDecoderFactory$delegate", "getSoftwareVideoDecoderFactory", "()Lhms/webrtc/SoftwareVideoDecoderFactory;", "softwareVideoDecoderFactory", "Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;", "platformSoftwareVideoDecoderFactory$delegate", "getPlatformSoftwareVideoDecoderFactory", "()Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;", "platformSoftwareVideoDecoderFactory", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSVideoDecoderFactory extends DefaultVideoDecoderFactory {
    private final boolean forceSoftwareDecoder;

    /* JADX INFO: renamed from: hardwareVideoDecoderFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h hardwareVideoDecoderFactory;

    /* JADX INFO: renamed from: platformSoftwareVideoDecoderFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h platformSoftwareVideoDecoderFactory;

    /* JADX INFO: renamed from: softwareVideoDecoderFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h softwareVideoDecoderFactory;

    public /* synthetic */ HMSVideoDecoderFactory(EglBase.Context context, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? false : z4);
    }

    private final HardwareVideoDecoderFactory getHardwareVideoDecoderFactory() {
        return (HardwareVideoDecoderFactory) this.hardwareVideoDecoderFactory.getValue();
    }

    private final PlatformSoftwareVideoDecoderFactory getPlatformSoftwareVideoDecoderFactory() {
        return (PlatformSoftwareVideoDecoderFactory) this.platformSoftwareVideoDecoderFactory.getValue();
    }

    private final SoftwareVideoDecoderFactory getSoftwareVideoDecoderFactory() {
        return (SoftwareVideoDecoderFactory) this.softwareVideoDecoderFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HardwareVideoDecoderFactory hardwareVideoDecoderFactory_delegate$lambda$0(EglBase.Context eglContext) {
        AbstractC22676k.m65750j(eglContext, "$eglContext");
        return new HardwareVideoDecoderFactory(eglContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformSoftwareVideoDecoderFactory platformSoftwareVideoDecoderFactory_delegate$lambda$2(EglBase.Context eglContext) {
        AbstractC22676k.m65750j(eglContext, "$eglContext");
        return new PlatformSoftwareVideoDecoderFactory(eglContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SoftwareVideoDecoderFactory softwareVideoDecoderFactory_delegate$lambda$1() {
        return new SoftwareVideoDecoderFactory();
    }

    @Override // hms.webrtc.DefaultVideoDecoderFactory, hms.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo codecType) {
        VideoDecoder videoDecoderCreateDecoder = getSoftwareVideoDecoderFactory().createDecoder(codecType);
        HardwareVideoDecoderFactory hardwareVideoDecoderFactory = getHardwareVideoDecoderFactory();
        AbstractC22676k.m65747g(hardwareVideoDecoderFactory);
        VideoDecoder videoDecoderCreateDecoder2 = hardwareVideoDecoderFactory.createDecoder(codecType);
        if (videoDecoderCreateDecoder == null && getPlatformSoftwareVideoDecoderFactory() != null) {
            videoDecoderCreateDecoder = getPlatformSoftwareVideoDecoderFactory().createDecoder(codecType);
        }
        if (this.forceSoftwareDecoder && videoDecoderCreateDecoder != null) {
            return videoDecoderCreateDecoder;
        }
        if (videoDecoderCreateDecoder2 != null && videoDecoderCreateDecoder != null) {
            return new VideoDecoderFallback(videoDecoderCreateDecoder, videoDecoderCreateDecoder2);
        }
        if (videoDecoderCreateDecoder2 != null) {
            return videoDecoderCreateDecoder2;
        }
        AbstractC22676k.m65747g(videoDecoderCreateDecoder);
        return videoDecoderCreateDecoder;
    }

    public final boolean getForceSoftwareDecoder() {
        return this.forceSoftwareDecoder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSVideoDecoderFactory(final EglBase.Context eglContext, boolean z4) {
        super(eglContext);
        AbstractC22676k.m65750j(eglContext, "eglContext");
        this.forceSoftwareDecoder = z4;
        final int i13 = 0;
        this.hardwareVideoDecoderFactory = AbstractC30060g.m92088H(new InterfaceC4339a() { // from class: live.hms.video.factories.d
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return HMSVideoDecoderFactory.hardwareVideoDecoderFactory_delegate$lambda$0(eglContext);
                    default:
                        return HMSVideoDecoderFactory.platformSoftwareVideoDecoderFactory_delegate$lambda$2(eglContext);
                }
            }
        });
        this.softwareVideoDecoderFactory = AbstractC30060g.m92088H(new C24069a(2));
        final int i14 = 1;
        this.platformSoftwareVideoDecoderFactory = AbstractC30060g.m92088H(new InterfaceC4339a() { // from class: live.hms.video.factories.d
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return HMSVideoDecoderFactory.hardwareVideoDecoderFactory_delegate$lambda$0(eglContext);
                    default:
                        return HMSVideoDecoderFactory.platformSoftwareVideoDecoderFactory_delegate$lambda$2(eglContext);
                }
            }
        });
    }
}

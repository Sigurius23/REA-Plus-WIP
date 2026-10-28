package live.hms.video.utils;

import bc3.C3033m;
import bc3.InterfaceC3025k;
import ge3.AbstractC15751g;
import l83.C23454a0;
import live.hms.video.error.HMSException;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.SDKDelegate;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Llive/hms/video/sdk/SDKDelegate;", "Ll83/a0;", "stopScreenShareSuspend", "(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)Ljava/lang/Object;", "stopAudioShareSuspend", "lib_release"}, m65682k = 2, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HmsExtensionKt {
    public static final Object stopAudioShareSuspend(SDKDelegate sDKDelegate, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        sDKDelegate.stopAudioshare(new HMSActionResultListener() { // from class: live.hms.video.utils.HmsExtensionKt$stopAudioShareSuspend$2$callBack$1
            @Override // live.hms.video.sdk.IErrorListener
            public void onError(HMSException error) {
                AbstractC22676k.m65750j(error, "error");
                InterfaceC3025k interfaceC3025k = c3033m;
                Throwable thFillInStackTrace = error.fillInStackTrace();
                AbstractC22676k.m65749i(thFillInStackTrace, "fillInStackTrace(...)");
                interfaceC3025k.resumeWith(AbstractC34132o.m107888l(thFillInStackTrace));
            }

            @Override // live.hms.video.sdk.HMSActionResultListener
            public void onSuccess() {
                c3033m.mo8744e(C23454a0.f92919a, new Function1() { // from class: live.hms.video.utils.HmsExtensionKt$stopAudioShareSuspend$2$callBack$1$onSuccess$1
                    public final void invoke(Throwable it) {
                        AbstractC22676k.m65750j(it, "it");
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return C23454a0.f92919a;
                    }
                });
            }
        });
        Object objM8773r = c3033m.m8773r();
        return objM8773r == EnumC31071a.f128113w ? objM8773r : C23454a0.f92919a;
    }

    public static final Object stopScreenShareSuspend(SDKDelegate sDKDelegate, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        sDKDelegate.stopScreenshare(new HMSActionResultListener() { // from class: live.hms.video.utils.HmsExtensionKt$stopScreenShareSuspend$2$callBack$1
            @Override // live.hms.video.sdk.IErrorListener
            public void onError(HMSException error) {
                AbstractC22676k.m65750j(error, "error");
                InterfaceC3025k interfaceC3025k = c3033m;
                Throwable thFillInStackTrace = error.fillInStackTrace();
                AbstractC22676k.m65749i(thFillInStackTrace, "fillInStackTrace(...)");
                interfaceC3025k.resumeWith(AbstractC34132o.m107888l(thFillInStackTrace));
            }

            @Override // live.hms.video.sdk.HMSActionResultListener
            public void onSuccess() {
                c3033m.mo8744e(C23454a0.f92919a, new Function1() { // from class: live.hms.video.utils.HmsExtensionKt$stopScreenShareSuspend$2$callBack$1$onSuccess$1
                    public final void invoke(Throwable it) {
                        AbstractC22676k.m65750j(it, "it");
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return C23454a0.f92919a;
                    }
                });
            }
        });
        Object objM8773r = c3033m.m8773r();
        return objM8773r == EnumC31071a.f128113w ? objM8773r : C23454a0.f92919a;
    }
}

package live.hms.video.sdk;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hc3.AbstractC17182o;
import kc3.C22365e;
import l83.C23454a0;
import live.hms.video.connection.stats.quality.HMSNetworkQuality;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.utils.HMSConstantsKt;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$preview$2$1$1$onTimeout$1$1", m100430f = "SDKDelegate.kt", m100431l = {1426}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class SDKDelegate$preview$2$1$1$onTimeout$1$1 extends AbstractC32275i implements InterfaceC4351m {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SDKDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKDelegate$preview$2$1$1$onTimeout$1$1(SDKDelegate sDKDelegate, InterfaceC30057d<? super SDKDelegate$preview$2$1$1$onTimeout$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = sDKDelegate;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        SDKDelegate$preview$2$1$1$onTimeout$1$1 sDKDelegate$preview$2$1$1$onTimeout$1$1 = new SDKDelegate$preview$2$1$1$onTimeout$1$1(this.this$0, interfaceC30057d);
        sDKDelegate$preview$2$1$1$onTimeout$1$1.L$0 = obj;
        return sDKDelegate$preview$2$1$1$onTimeout$1$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((SDKDelegate$preview$2$1$1$onTimeout$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2994c0 interfaceC2994c0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.L$0;
            this.L$0 = interfaceC2994c1;
            this.label = 1;
            if (AbstractC3034m0.m8782b(HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS, this) == enumC31071a) {
                return enumC31071a;
            }
            interfaceC2994c0 = interfaceC2994c1;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
            AbstractC34132o.m107864I(obj);
        }
        HMSLocalPeer localPeer = this.this$0.store.getLocalPeer();
        if (localPeer == null) {
            return null;
        }
        SDKDelegate sDKDelegate = this.this$0;
        localPeer.setNetworkQuality$lib_release(new HMSNetworkQuality(-1));
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3006f0.m8732z(interfaceC2994c0, AbstractC17182o.f65999a, null, new SDKDelegate$preview$2$1$1$onTimeout$1$1$1$1(sDKDelegate, localPeer, null), 2);
        return C23454a0.f92919a;
    }
}

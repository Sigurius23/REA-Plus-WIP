package live.hms.video.sdk;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import live.hms.video.audio.HMSAudioDeviceInfo;
import live.hms.video.audio.HMSAudioManager;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$audioDeviceListener$1$onAudioDeviceInfoChanged$1", m100430f = "SDKDelegate.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class SDKDelegate$audioDeviceListener$1$onAudioDeviceInfoChanged$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ List<HMSAudioDeviceInfo> $groupedAudioDevice;
    final /* synthetic */ HMSAudioManager.AudioDevice $selectedAudioDevice;
    int label;
    final /* synthetic */ SDKDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKDelegate$audioDeviceListener$1$onAudioDeviceInfoChanged$1(SDKDelegate sDKDelegate, HMSAudioManager.AudioDevice audioDevice, List<HMSAudioDeviceInfo> list, InterfaceC30057d<? super SDKDelegate$audioDeviceListener$1$onAudioDeviceInfoChanged$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = sDKDelegate;
        this.$selectedAudioDevice = audioDevice;
        this.$groupedAudioDevice = list;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new SDKDelegate$audioDeviceListener$1$onAudioDeviceInfoChanged$1(this.this$0, this.$selectedAudioDevice, this.$groupedAudioDevice, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((SDKDelegate$audioDeviceListener$1$onAudioDeviceInfoChanged$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        HMSAudioManager.AudioManagerDeviceChangeListener audioManagerDeviceChangeListener = this.this$0.audioManagerDeviceChangeListener;
        if (audioManagerDeviceChangeListener != null) {
            audioManagerDeviceChangeListener.onAudioDeviceInfoChanged(this.$selectedAudioDevice, this.$groupedAudioDevice);
        }
        return C23454a0.f92919a;
    }
}

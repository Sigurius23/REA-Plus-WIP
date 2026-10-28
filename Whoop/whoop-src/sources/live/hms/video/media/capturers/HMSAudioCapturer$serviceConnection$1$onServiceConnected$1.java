package live.hms.video.media.capturers;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import live.hms.video.services.HMSScreenCaptureService;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.media.capturers.HMSAudioCapturer$serviceConnection$1$onServiceConnected$1", m100430f = "HMSAudioCapturer.kt", m100431l = {53}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class HMSAudioCapturer$serviceConnection$1$onServiceConnected$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ InterfaceC4339a $endAudioShare;
    int label;
    final /* synthetic */ HMSAudioCapturer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSAudioCapturer$serviceConnection$1$onServiceConnected$1(HMSAudioCapturer hMSAudioCapturer, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super HMSAudioCapturer$serviceConnection$1$onServiceConnected$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = hMSAudioCapturer;
        this.$endAudioShare = interfaceC4339a;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new HMSAudioCapturer$serviceConnection$1$onServiceConnected$1(this.this$0, this.$endAudioShare, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((HMSAudioCapturer$serviceConnection$1$onServiceConnected$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC13072o1 endFlow;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            HMSScreenCaptureService hMSScreenCaptureService = this.this$0.capturerService;
            if (hMSScreenCaptureService == null || (endFlow = hMSScreenCaptureService.getEndFlow()) == null) {
                return C23454a0.f92919a;
            }
            final InterfaceC4339a interfaceC4339a = this.$endAudioShare;
            InterfaceC13062m interfaceC13062m = new InterfaceC13062m() { // from class: live.hms.video.media.capturers.HMSAudioCapturer$serviceConnection$1$onServiceConnected$1.1
                @Override // ec3.InterfaceC13062m
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC30057d interfaceC30057d) {
                    return emit(((Boolean) obj2).booleanValue(), (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
                }

                public final Object emit(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    interfaceC4339a.invoke();
                    return C23454a0.f92919a;
                }
            };
            this.label = 1;
            if (endFlow.collect(interfaceC13062m, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        throw new KotlinNothingValueException();
    }
}

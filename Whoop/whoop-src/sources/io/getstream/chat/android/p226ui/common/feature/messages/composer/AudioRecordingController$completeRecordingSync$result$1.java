package io.getstream.chat.android.p226ui.common.feature.messages.composer;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import n23.AbstractC26205h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s23.C32091d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$completeRecordingSync$result$1", m100430f = "AudioRecordingController.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ls23/f;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class AudioRecordingController$completeRecordingSync$result$1 extends AbstractC32275i implements InterfaceC4351m {
    int label;
    final /* synthetic */ AudioRecordingController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordingController$completeRecordingSync$result$1(AudioRecordingController audioRecordingController, InterfaceC30057d<? super AudioRecordingController$completeRecordingSync$result$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = audioRecordingController;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new AudioRecordingController$completeRecordingSync$result$1(this.this$0, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return ((AudioRecordingController$completeRecordingSync$result$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        return ((C32091d) this.this$0.mediaRecorder).m99833f();
    }
}

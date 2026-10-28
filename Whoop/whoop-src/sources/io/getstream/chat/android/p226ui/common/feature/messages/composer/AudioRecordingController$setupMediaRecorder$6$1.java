package io.getstream.chat.android.p226ui.common.feature.messages.composer;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import io.getstream.chat.android.p226ui.common.state.messages.composer.RecordingState;
import io.getstream.chat.android.p226ui.common.state.messages.composer.RecordingStateKt;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$setupMediaRecorder$6$1", m100430f = "AudioRecordingController.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class AudioRecordingController$setupMediaRecorder$6$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ long $durationMs;
    int label;
    final /* synthetic */ AudioRecordingController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordingController$setupMediaRecorder$6$1(AudioRecordingController audioRecordingController, long j7, InterfaceC30057d<? super AudioRecordingController$setupMediaRecorder$6$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = audioRecordingController;
        this.$durationMs = j7;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new AudioRecordingController$setupMediaRecorder$6$1(this.this$0, this.$durationMs, interfaceC30057d);
    }

    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        AudioRecordingController$setupMediaRecorder$6$1 audioRecordingController$setupMediaRecorder$6$1 = (AudioRecordingController$setupMediaRecorder$6$1) create(interfaceC2994c0, interfaceC30057d);
        C23454a0 c23454a0 = C23454a0.f92919a;
        audioRecordingController$setupMediaRecorder$6$1.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        RecordingState recordingState = (RecordingState) ((C13045h2) this.this$0.getRecordingState()).getValue();
        C2345k c2345k = this.this$0.logger;
        long j7 = this.$durationMs;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        String str = c2345k.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[onRecorderDurationChanged] duration: " + j7 + ", state: " + recordingState, null);
        }
        if (recordingState instanceof RecordingState.Recording) {
            this.this$0.setState(RecordingStateKt.copy$default((RecordingState.Recording) recordingState, (int) this.$durationMs, null, 2, null));
        }
        return C23454a0.f92919a;
    }

    @Override // c93.InterfaceC4351m
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
        return C23454a0.f92919a;
    }
}

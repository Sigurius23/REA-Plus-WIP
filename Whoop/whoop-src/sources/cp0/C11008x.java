package cp0;

import p390p1.InterfaceC28670t2;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cp0.x */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001BG\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcp0/x;", "", "Lp1/t2;", "", "isVoiceSessionActiveState", "isListeningState", "", "audioLevelState", "Lkotlin/Function1;", "Ll83/a0;", "onStopRecording", "<init>", "(Lp1/t2;Lp1/t2;Lp1/t2;Lkotlin/jvm/functions/Function1;)V", "sendCurrentValue", "d", "(Z)V", "a", "Lkotlin/jvm/functions/Function1;", "b", "Lp1/t2;", "c", "()Z", "isVoiceSessionActive", "isListening", "()F", "audioLevel", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11008x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onStopRecording;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28670t2 isVoiceSessionActive;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28670t2 isListening;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC28670t2 audioLevel;

    public C11008x(InterfaceC28670t2 isVoiceSessionActiveState, InterfaceC28670t2 isListeningState, InterfaceC28670t2 audioLevelState, Function1 onStopRecording) {
        AbstractC22676k.m65750j(isVoiceSessionActiveState, "isVoiceSessionActiveState");
        AbstractC22676k.m65750j(isListeningState, "isListeningState");
        AbstractC22676k.m65750j(audioLevelState, "audioLevelState");
        AbstractC22676k.m65750j(onStopRecording, "onStopRecording");
        this.onStopRecording = onStopRecording;
        this.isVoiceSessionActive = isVoiceSessionActiveState;
        this.isListening = isListeningState;
        this.audioLevel = audioLevelState;
    }

    /* JADX INFO: renamed from: a */
    public final float m29411a() {
        return ((Number) this.audioLevel.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m29412b() {
        return ((Boolean) this.isListening.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m29413c() {
        return ((Boolean) this.isVoiceSessionActive.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m29414d(boolean sendCurrentValue) {
        this.onStopRecording.invoke(Boolean.valueOf(sendCurrentValue));
    }
}

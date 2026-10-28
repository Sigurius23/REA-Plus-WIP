package m01;

import android.os.VibrationEffect;
import android.os.Vibrator;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: m01.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, m65681d2 = {"Lm01/a;", "", "Landroid/os/Vibrator;", "vibrator", "<init>", "(Landroid/os/Vibrator;)V", "Ll83/a0;", "a", "()V", "Landroid/os/Vibrator;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24873a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Vibrator vibrator;

    public C24873a(Vibrator vibrator) {
        this.vibrator = vibrator;
    }

    /* JADX INFO: renamed from: a */
    public final void m72904a() {
        try {
            if (this.vibrator == null) {
                return;
            }
            this.vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 50, 50, 50}, new int[]{0, 200, 0, 200}, -1));
        } catch (Exception unused) {
        }
    }
}

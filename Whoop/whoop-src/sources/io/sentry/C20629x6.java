package io.sentry;

import java.util.TimerTask;

/* JADX INFO: renamed from: io.sentry.x6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20629x6 extends TimerTask {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f77178w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20645z6 f77179x;

    public /* synthetic */ C20629x6(C20645z6 c20645z6, int i13) {
        this.f77178w = i13;
        this.f77179x = c20645z6;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f77178w) {
            case 0:
                C20645z6 c20645z6 = this.f77179x;
                EnumC20374i7 enumC20374i7Mo56450c = c20645z6.mo56450c();
                if (enumC20374i7Mo56450c == null) {
                    enumC20374i7Mo56450c = EnumC20374i7.OK;
                }
                c20645z6.mo56464v(enumC20374i7Mo56450c, null);
                c20645z6.f77212l.set(false);
                break;
            default:
                C20645z6 c20645z7 = this.f77179x;
                EnumC20374i7 enumC20374i7Mo56450c2 = c20645z7.mo56450c();
                if (enumC20374i7Mo56450c2 == null) {
                    enumC20374i7Mo56450c2 = EnumC20374i7.DEADLINE_EXCEEDED;
                }
                c20645z7.mo56511f(enumC20374i7Mo56450c2, c20645z7.f77218r.f76520g != null, null);
                c20645z7.f77213m.set(false);
                break;
        }
    }
}

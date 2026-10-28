package p180h0;

/* JADX INFO: renamed from: h0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16369c0 implements InterfaceC16413k2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C16375d0 f62927a;

    public C16369c0(C16375d0 c16375d0) {
        this.f62927a = c16375d0;
    }

    @Override // p180h0.InterfaceC16413k2
    /* JADX INFO: renamed from: a */
    public final float mo29373a(float f13) {
        if (Float.isNaN(f13)) {
            return 0.0f;
        }
        C16375d0 c16375d0 = this.f62927a;
        float fFloatValue = ((Number) c16375d0.f62961a.invoke(Float.valueOf(f13))).floatValue();
        c16375d0.f62965e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        c16375d0.f62966f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}

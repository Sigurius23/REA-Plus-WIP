package p222ij;

import com.amplitude.android.engagement.C4861a;
import com.amplitude.quickjs.wrapper.QuickJSContext;

/* JADX INFO: renamed from: ij.j */
/* JADX INFO: loaded from: classes.dex */
public final class C18584j implements QuickJSContext.Console {
    @Override // com.amplitude.quickjs.wrapper.QuickJSContext.Console
    public final void debug(String str) {
        C4861a.f20259o.m16031I(String.valueOf(str));
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSContext.Console
    public final void error(String str) {
        C4861a.f20259o.m16032K(String.valueOf(str));
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSContext.Console
    public final void info(String str) {
        C4861a.f20259o.m16047a0(String.valueOf(str));
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSContext.Console
    public final void log(String str) {
        C4861a.f20259o.m16047a0(String.valueOf(str));
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSContext.Console
    public final void warn(String str) {
        C4861a.f20259o.m16067m0(String.valueOf(str));
    }
}

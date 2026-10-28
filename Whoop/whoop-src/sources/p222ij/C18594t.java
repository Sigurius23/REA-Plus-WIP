package p222ij;

import com.amplitude.quickjs.wrapper.JSObject;
import com.amplitude.quickjs.wrapper.QuickJSContext;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p692zt.C41113q;

/* JADX INFO: renamed from: ij.t */
/* JADX INFO: loaded from: classes.dex */
public final class C18594t extends C41113q {

    /* JADX INFO: renamed from: G */
    public final LinkedHashMap f72625G;

    /* JADX INFO: renamed from: H */
    public final AtomicLong f72626H;

    public C18594t(C18587m c18587m) {
        JSObject globalObject;
        JSObject globalObject2;
        super(c18587m);
        this.f72625G = new LinkedHashMap();
        this.f72626H = new AtomicLong(1L);
        QuickJSContext quickJSContextM53802b = c18587m.m53802b();
        if (quickJSContextM53802b != null && (globalObject2 = quickJSContextM53802b.getGlobalObject()) != null) {
            globalObject2.setProperty("setTimeout", new C18592r(c18587m, this));
        }
        QuickJSContext quickJSContextM53802b2 = c18587m.m53802b();
        if (quickJSContextM53802b2 == null || (globalObject = quickJSContextM53802b2.getGlobalObject()) == null) {
            return;
        }
        globalObject.setProperty("clearTimeout", new C18592r(this, c18587m));
    }
}

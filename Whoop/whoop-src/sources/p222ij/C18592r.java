package p222ij;

import android.os.Handler;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.quickjs.wrapper.JSCallFunction;
import com.amplitude.quickjs.wrapper.JSFunction;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ij.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18592r implements JSCallFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72619a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C18594t f72620b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C18587m f72621c;

    public /* synthetic */ C18592r(C18587m c18587m, C18594t c18594t) {
        this.f72621c = c18587m;
        this.f72620b = c18594t;
    }

    @Override // com.amplitude.quickjs.wrapper.JSCallFunction
    public final Object call(Object[] objArr) {
        switch (this.f72619a) {
            case 0:
                if (objArr.length >= 2) {
                    Object obj = objArr[0];
                    if (obj instanceof JSFunction) {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof Number) {
                            final JSFunction jSFunction = (JSFunction) obj;
                            long jLongValue = ((Number) obj2).longValue();
                            Handler handler = this.f72621c.f72606d;
                            final C18594t c18594t = this.f72620b;
                            final long andIncrement = c18594t.f72626H.getAndIncrement();
                            Runnable runnable = new Runnable() { // from class: ij.s
                                @Override // java.lang.Runnable
                                public final void run() {
                                    JSFunction jSFunction2 = jSFunction;
                                    long j7 = andIncrement;
                                    LinkedHashMap linkedHashMap = c18594t.f72625G;
                                    try {
                                        try {
                                            jSFunction2.call(new Object[0]);
                                        } catch (Exception e5) {
                                            C4861a.f20259o.m16032K("Error in setTimeout callback: " + e5.getMessage(), e5);
                                        }
                                    } finally {
                                        linkedHashMap.remove(Long.valueOf(j7));
                                    }
                                }
                            };
                            c18594t.f72625G.put(Long.valueOf(andIncrement), runnable);
                            handler.postDelayed(runnable, jLongValue);
                            return Long.valueOf(andIncrement);
                        }
                    }
                }
                return null;
            default:
                LinkedHashMap linkedHashMap = this.f72620b.f72625G;
                if (objArr.length >= 1) {
                    Object obj3 = objArr[0];
                    if (obj3 instanceof Number) {
                        long jLongValue2 = ((Number) obj3).longValue();
                        Runnable runnable2 = (Runnable) linkedHashMap.get(Long.valueOf(jLongValue2));
                        if (runnable2 != null) {
                            this.f72621c.f72606d.removeCallbacks(runnable2);
                            linkedHashMap.remove(Long.valueOf(jLongValue2));
                            return Boolean.TRUE;
                        }
                    }
                }
                return Boolean.FALSE;
        }
    }

    public /* synthetic */ C18592r(C18594t c18594t, C18587m c18587m) {
        this.f72620b = c18594t;
        this.f72621c = c18587m;
    }
}

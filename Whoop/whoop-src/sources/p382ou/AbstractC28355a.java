package p382ou;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import io.sentry.android.replay.video.C20245d;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: ou.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC28355a {

    /* JADX INFO: renamed from: a */
    public final Context f114400a;

    /* JADX INFO: renamed from: b */
    public final WindowManager f114401b;

    /* JADX INFO: renamed from: c */
    public final C20245d f114402c;

    /* JADX INFO: renamed from: d */
    public MotionEvent f114403d;

    /* JADX INFO: renamed from: e */
    public MotionEvent f114404e;

    /* JADX INFO: renamed from: f */
    public long f114405f;

    /* JADX INFO: renamed from: g */
    public boolean f114406g = true;

    /* JADX INFO: renamed from: h */
    public Object f114407h;

    public AbstractC28355a(Context context, C20245d c20245d) {
        this.f114400a = context;
        this.f114401b = (WindowManager) context.getSystemService("window");
        this.f114402c = c20245d;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo86028a(MotionEvent motionEvent);

    /* JADX INFO: renamed from: b */
    public boolean mo86029b(int i13) {
        if (this.f114407h == null || !this.f114406g) {
            return false;
        }
        C20245d c20245d = this.f114402c;
        for (Set<Integer> set : (ArrayList) c20245d.f76045a) {
            if (set.contains(Integer.valueOf(i13))) {
                for (Integer num : set) {
                    num.getClass();
                    for (AbstractC28355a abstractC28355a : (ArrayList) c20245d.f76046b) {
                        if (abstractC28355a instanceof AbstractC28362h) {
                            AbstractC28362h abstractC28362h = (AbstractC28362h) abstractC28355a;
                            if (abstractC28362h.f114434p.contains(num) && abstractC28362h.f114435q) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}

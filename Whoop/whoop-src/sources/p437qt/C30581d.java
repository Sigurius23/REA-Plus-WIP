package p437qt;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import ge3.AbstractC15751g;
import java.util.Set;
import java.util.concurrent.Executor;
import p073cq.C11052u;
import p098dt.C12351c;
import st.InterfaceC32956a;

/* JADX INFO: renamed from: qt.d */
/* JADX INFO: loaded from: classes.dex */
public final class C30581d implements InterfaceC30583f, InterfaceC30584g {

    /* JADX INFO: renamed from: a */
    public final C12351c f125826a;

    /* JADX INFO: renamed from: b */
    public final Context f125827b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC32956a f125828c;

    /* JADX INFO: renamed from: d */
    public final Set f125829d;

    /* JADX INFO: renamed from: e */
    public final Executor f125830e;

    public C30581d(Context context, String str, Set set, InterfaceC32956a interfaceC32956a, Executor executor) {
        this.f125826a = new C12351c(context, str);
        this.f125829d = set;
        this.f125830e = executor;
        this.f125828c = interfaceC32956a;
        this.f125827b = context;
    }

    /* JADX INFO: renamed from: a */
    public final C11052u m93813a() {
        if (!AbstractC15751g.m44427G(this.f125827b)) {
            return Tasks.m15640d("");
        }
        return Tasks.m15638b(this.f125830e, new CallableC30580c(this, 0));
    }

    /* JADX INFO: renamed from: b */
    public final void m93814b() {
        if (this.f125829d.size() <= 0) {
            Tasks.m15640d(null);
        } else if (!AbstractC15751g.m44427G(this.f125827b)) {
            Tasks.m15640d(null);
        } else {
            Tasks.m15638b(this.f125830e, new CallableC30580c(this, 1));
        }
    }
}

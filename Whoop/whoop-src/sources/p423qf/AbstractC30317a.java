package p423qf;

import com.whoop.service.network.model.UserState;
import gf.C15760a;
import gf.C15762c;

/* JADX INFO: renamed from: qf.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC30317a {

    /* JADX INFO: renamed from: a */
    public static final C15762c f124376a;

    /* JADX INFO: renamed from: b */
    public static final C15762c f124377b;

    static {
        C15762c c15762c = new C15762c();
        c15762c.mo33083c(new C15760a("state"), UserState.States.IDLE);
        f124376a = c15762c;
        new C15762c().mo33083c(new C15760a("state"), "acquired");
        new C15762c().mo33083c(new C15760a("state"), "queued");
        C15762c c15762c2 = new C15762c();
        c15762c2.mo33083c(new C15760a("state"), "in-flight");
        f124377b = c15762c2;
    }

    /* JADX INFO: renamed from: a */
    public static C15762c m92661a() {
        return f124376a;
    }

    /* JADX INFO: renamed from: b */
    public static C15762c m92662b() {
        return f124377b;
    }
}

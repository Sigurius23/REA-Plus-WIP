package p590wo;

import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.AbstractC4977h;
import com.google.android.gms.common.api.C4974e;
import com.google.android.gms.common.api.C4975f;
import com.google.android.gms.tasks.Task;
import e73.C12803b;
import jp.AbstractC21844b;
import p096dq.C12281y;
import p508ty.C34249c;
import p529uo.C35125m;
import to.AbstractC33993q;

/* JADX INFO: renamed from: wo.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C37434b extends AbstractC4977h {

    /* JADX INFO: renamed from: a */
    public static final C4975f f160242a = new C4975f("ClientTelemetry.API", new C12281y(7), new C4974e());

    /* JADX INFO: renamed from: c */
    public final Task m119842c(C35125m c35125m) {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.f43825c = new C4986c[]{AbstractC21844b.f84372a};
        c12803bM107465a.f43824b = false;
        c12803bM107465a.f43827e = new C34249c(c35125m, 21);
        return doBestEffortWrite(c12803bM107465a.m35864g());
    }
}

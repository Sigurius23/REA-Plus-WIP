package androidx.room;

import androidx.lifecycle.RunnableC1645z0;
import java.util.Set;
import p489t.C33242a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1819p1 extends AbstractC1826s {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1780e1 f7161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819p1(String[] strArr, C1780e1 c1780e1) {
        super(strArr);
        this.f7161b = c1780e1;
    }

    @Override // androidx.room.AbstractC1826s
    /* JADX INFO: renamed from: a */
    public final void mo5361a(Set tables) {
        AbstractC22676k.m65750j(tables, "tables");
        C33242a c33242aM105474V = C33242a.m105474V();
        RunnableC1645z0 runnableC1645z0 = new RunnableC1645z0(this.f7161b, 1);
        if (c33242aM105474V.f138639a.m105476V()) {
            runnableC1645z0.run();
        } else {
            c33242aM105474V.m105475W(runnableC1645z0);
        }
    }
}

package p249jc;

import androidx.room.AbstractC1821q0;
import p218ic.C18391y;
import p518ub.InterfaceC34728a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21569c extends AbstractC1821q0 {

    /* JADX INFO: renamed from: a */
    public final C18391y f82719a;

    public C21569c(C18391y clock) {
        AbstractC22676k.m65750j(clock, "clock");
        this.f82719a = clock;
    }

    @Override // androidx.room.AbstractC1821q0
    public final void onOpen(InterfaceC34728a db4) {
        AbstractC22676k.m65750j(db4, "db");
        db4.mo109673y();
        try {
            StringBuilder sb4 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.f82719a.getClass();
            sb4.append(System.currentTimeMillis() - AbstractC21591q.f82794a);
            sb4.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db4.mo109660E(sb4.toString());
            db4.mo109663O();
        } finally {
            db4.mo109665V();
        }
    }
}

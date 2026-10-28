package p420qc;

import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.dao.persistent.C6497h;
import ge3.AbstractC15751g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qc.i */
/* JADX INFO: loaded from: classes.dex */
public final class C30199i {

    /* JADX INFO: renamed from: a */
    public final AbstractC1848z0 f123601a;

    /* JADX INFO: renamed from: b */
    public final C30192b f123602b = new C30192b(2);

    public C30199i(AbstractC1848z0 abstractC1848z0) {
        this.f123601a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: a */
    public C30198h m92421a(C30200j c30200j) {
        String workSpecId = c30200j.f123603a;
        int i13 = c30200j.f123604b;
        AbstractC22676k.m65750j(workSpecId, "workSpecId");
        return (C30198h) AbstractC15751g.m44432L(this.f123601a, true, false, new C6497h(workSpecId, i13, 1));
    }
}

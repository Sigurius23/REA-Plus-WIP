package p420qc;

import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import java.util.Iterator;
import java.util.Set;
import p392p3.C28761b0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qc.w */
/* JADX INFO: loaded from: classes.dex */
public final class C30213w {

    /* JADX INFO: renamed from: a */
    public final AbstractC1848z0 f123670a;

    /* JADX INFO: renamed from: b */
    public final C30192b f123671b = new C30192b(6);

    public C30213w(AbstractC1848z0 abstractC1848z0) {
        this.f123670a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: a */
    public void m92441a(String id4, Set tags) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            AbstractC15751g.m44432L(this.f123670a, false, true, new C28761b0(7, this, new C30212v((String) it.next(), id4)));
        }
    }
}

package gs;

import p075ct.C11105a;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: gs.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16123b extends AbstractC34132o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61240a;

    /* JADX INFO: renamed from: V */
    public abstract C11105a mo45678V();

    /* JADX INFO: renamed from: W */
    public abstract AbstractC16123b mo45679W();

    /* JADX INFO: renamed from: X */
    public abstract AbstractC16123b mo45680X();

    @Override // p505ts.AbstractC34132o
    /* JADX INFO: renamed from: z */
    public Integer mo16076z() {
        switch (this.f61240a) {
            case 1:
                return mo45679W().mo16076z();
            default:
                return mo45680X().mo16076z();
        }
    }
}

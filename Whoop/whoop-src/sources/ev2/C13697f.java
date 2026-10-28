package ev2;

import java.util.Set;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ev2.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13697f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48531w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f48532x;

    public /* synthetic */ C13697f(Function1 function1, int i13) {
        this.f48531w = i13;
        this.f48532x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f48531w) {
            case 0:
                return AbstractC13705n.m38708x(this.f48532x, (Set) obj);
            case 1:
                return AbstractC13712u.m38742L0(this.f48532x, obj);
            default:
                return AbstractC13712u.m38732G0(this.f48532x, (Set) obj);
        }
    }
}

package rq0;

import com.whoop.domain.model.RecordsDto;
import hq0.C17561a;
import java.util.List;
import p217ib.AbstractC18327x;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: rq0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31663f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130983w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC18327x f130984x;

    public /* synthetic */ C31663f(AbstractC18327x abstractC18327x, int i13) {
        this.f130983w = i13;
        this.f130984x = abstractC18327x;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130983w) {
            case 0:
                return C31666g.m97980r(this.f130984x, (List) obj);
            case 1:
                return C31673i0.b.m98088r(this.f130984x, (RecordsDto) obj);
            case 2:
                return C31678k0.m98165r(this.f130984x, (C17561a) obj);
            case 3:
                return C31702w0.m98283r(this.f130984x, (RecordsDto) obj);
            default:
                return C31662e1.b.m97964r(this.f130984x, (RecordsDto) obj);
        }
    }
}

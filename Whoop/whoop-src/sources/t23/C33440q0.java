package t23;

import c43.C4190f;
import c43.C4198n;
import io.getstream.android.video.generated.models.CallIngressResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: t23.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33440q0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139594w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33450s0 f139595x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33440q0(C33450s0 c33450s0, int i13) {
        super(1);
        this.f139594w = i13;
        this.f139595x = c33450s0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        switch (this.f139594w) {
            case 0:
                CallIngressResponse callIngressResponse = (CallIngressResponse) obj;
                if (callIngressResponse == null) {
                    return null;
                }
                String streamKey = this.f139595x.f139640b.f139293g.f139262z;
                String address = callIngressResponse.getRtmp().getAddress();
                AbstractC22676k.m65750j(address, "address");
                AbstractC22676k.m65750j(streamKey, "streamKey");
                C4198n c4198n = new C4198n();
                c4198n.f17053a = address;
                c4198n.f17054b = streamKey;
                C4190f c4190f = new C4190f();
                c4190f.f17047a = c4198n;
                return c4190f;
            case 1:
                Map map = (Map) obj;
                AbstractC22676k.m65750j(map, "map");
                C33450s0 c33450s0 = this.f139595x;
                C33392g2 c33392g2 = (C33392g2) map.get(c33450s0.f139640b.f139269D);
                if (c33392g2 != null) {
                    return c33392g2;
                }
                Iterator it = ((Iterable) c33450s0.f139680v.f81695j.getValue()).iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (((Boolean) ((C33392g2) next).f139429h.getValue()).booleanValue()) {
                        return (C33392g2) next;
                    }
                }
                next = null;
                return (C33392g2) next;
            default:
                List list = (List) obj;
                AbstractC22676k.m65750j(list, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!AbstractC22676k.m65745e(((C33392g2) obj2).f139422a, this.f139595x.f139640b.f139269D)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
        }
    }
}

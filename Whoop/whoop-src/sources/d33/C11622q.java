package d33;

import ec3.C13045h2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: d33.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C11622q extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37526w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37527x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11622q(C11602h1 c11602h1, int i13) {
        super(1);
        this.f37526w = i13;
        this.f37527x = c11602h1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37526w) {
            case 0:
                ((Number) obj).intValue();
                this.f37527x.f37440b.m105817h().f139760h.getClass();
                return null;
            default:
                Map it = (Map) obj;
                AbstractC22676k.m65750j(it, "it");
                C11602h1 c11602h1 = this.f37527x;
                c11602h1.m31030H(false);
                C13045h2 c13045h2 = c11602h1.f37440b.f139302p.f139667o0;
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(it.size()));
                Iterator it3 = it.entrySet().iterator();
                if (!it3.hasNext()) {
                    c13045h2.getClass();
                    c13045h2.m36571k(null, linkedHashMap);
                    return C23454a0.f92919a;
                }
                Map.Entry entry = (Map.Entry) it3.next();
                entry.getKey();
                entry.getValue().getClass();
                throw new ClassCastException();
        }
    }
}

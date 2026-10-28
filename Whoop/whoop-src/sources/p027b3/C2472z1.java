package p027b3;

import aa3.C0627i1;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import e93.AbstractC12889b;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p114eb.C12991u0;
import p161g.AbstractActivityC14909l;
import p399pb.InterfaceC29046c;
import p634y1.C39034g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.z1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2472z1 implements InterfaceC29046c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9625a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9626b;

    public /* synthetic */ C2472z1(Object obj, int i13) {
        this.f9625a = i13;
        this.f9626b = obj;
    }

    @Override // p399pb.InterfaceC29046c
    /* JADX INFO: renamed from: a */
    public final Bundle mo4129a() {
        C23465k[] c23465kArr;
        switch (this.f9625a) {
            case 0:
                Map mapMo7447e = ((C39034g) this.f9626b).mo7447e();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapMo7447e.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                return AbstractActivityC14909l.m43000l((AbstractActivityC14909l) this.f9626b);
            case 2:
                C12991u0 this_apply = (C12991u0) this.f9626b;
                AbstractC22676k.m65750j(this_apply, "$this_apply");
                Bundle bundleM36382J = this_apply.m36382J();
                if (bundleM36382J != null) {
                    return bundleM36382J;
                }
                Bundle EMPTY = Bundle.EMPTY;
                AbstractC22676k.m65749i(EMPTY, "EMPTY");
                return EMPTY;
            case 3:
                NavHostFragment this$0 = (NavHostFragment) this.f9626b;
                AbstractC22676k.m65750j(this$0, "this$0");
                int i13 = this$0.f6513y;
                if (i13 != 0) {
                    return AbstractC12889b.m36273g(new C23465k("android-support-nav:fragment:graphId", Integer.valueOf(i13)));
                }
                Bundle bundle2 = Bundle.EMPTY;
                AbstractC22676k.m65749i(bundle2, "{\n                    Bu…e.EMPTY\n                }");
                return bundle2;
            default:
                C0627i1 c0627i1 = (C0627i1) this.f9626b;
                for (Map.Entry entry2 : AbstractC25247g0.m74001j0((LinkedHashMap) c0627i1.f2198e).entrySet()) {
                    c0627i1.m1630o(((C13045h2) ((InterfaceC13075p1) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : AbstractC25247g0.m74001j0((LinkedHashMap) c0627i1.f2196c).entrySet()) {
                    c0627i1.m1630o(((InterfaceC29046c) entry3.getValue()).mo4129a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0627i1.f2195b;
                if (linkedHashMap.isEmpty()) {
                    c23465kArr = new C23465k[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new C23465k((String) entry4.getKey(), entry4.getValue()));
                    }
                    c23465kArr = (C23465k[]) arrayList.toArray(new C23465k[0]);
                }
                return AbstractC12889b.m36273g((C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length));
        }
    }
}

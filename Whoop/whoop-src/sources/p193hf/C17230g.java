package p193hf;

import hg3.AbstractC17269i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hf.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17230g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f66212w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17231h f66213x;

    public /* synthetic */ C17230g(C17231h c17231h, int i13) {
        this.f66212w = i13;
        this.f66213x = c17231h;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List it = (List) obj;
        switch (this.f66212w) {
            case 0:
                AbstractC22676k.m65750j(it, "it");
                C17231h c17231h = this.f66213x;
                return AbstractC17269i.m48914s(it, c17231h.f66220z, c17231h.f66214E);
            default:
                AbstractC22676k.m65750j(it, "it");
                ArrayList arrayList = new ArrayList();
                ?? r10 = this.f66213x.f66214E;
                Iterator it3 = it.iterator();
                while (it3.hasNext()) {
                    arrayList.add(r10.invoke(it3.next()));
                }
                return arrayList;
        }
    }
}

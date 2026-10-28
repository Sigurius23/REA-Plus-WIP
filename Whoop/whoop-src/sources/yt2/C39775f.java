package yt2;

import com.whoop.cache.persistence.C6101a;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: yt2.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C39775f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171328w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f171329x;

    public /* synthetic */ C39775f(int i13, int i14) {
        this.f171328w = i14;
        this.f171329x = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int iM127371M;
        switch (this.f171328w) {
            case 0:
                iM127371M = AbstractC39780k.m127371M(this.f171329x, ((Integer) obj).intValue());
                break;
            default:
                iM127371M = C6101a.m18305C("DELETE FROM cache_entries WHERE uri NOT IN (SELECT uri FROM cache_entries ORDER BY lastUpdated DESC, uri DESC LIMIT ?)", this.f171329x, (InterfaceC33687a) obj);
                break;
        }
        return Integer.valueOf(iM127371M);
    }
}

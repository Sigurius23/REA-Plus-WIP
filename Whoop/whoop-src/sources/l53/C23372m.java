package l53;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m83.AbstractC25265s;
import p005a3.C0271z0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l53.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C23372m {

    /* JADX INFO: renamed from: a */
    public final String f92651a;

    /* JADX INFO: renamed from: b */
    public final List f92652b;

    /* JADX INFO: renamed from: c */
    public boolean f92653c;

    public C23372m(String str) {
        this.f92651a = str;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC22676k.m65749i(listSynchronizedList, "synchronizedList(...)");
        this.f92652b = listSynchronizedList;
        this.f92653c = true;
    }

    /* JADX INFO: renamed from: a */
    public final C23371l m67652a() {
        List listM74093D1;
        synchronized (this.f92652b) {
            listM74093D1 = AbstractC25265s.m74093D1(this.f92652b);
            this.f92652b.clear();
        }
        return new C23371l(listM74093D1, new C0271z0(17, this, listM74093D1));
    }

    /* JADX INFO: renamed from: b */
    public final void m67653b(Object obj, String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        synchronized (this.f92652b) {
            if (this.f92653c) {
                this.f92652b.add(new C23370k(tag, this.f92651a, obj, System.currentTimeMillis()));
            }
        }
    }
}

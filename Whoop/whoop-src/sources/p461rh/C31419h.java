package p461rh;

import f93.C14289a;
import java.util.LinkedHashMap;
import m83.AbstractC25247g0;

/* JADX INFO: renamed from: rh.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C31419h {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f129285a;

    public C31419h() {
        this.f129285a = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m96731a(C14289a c14289a, Object obj) {
        LinkedHashMap linkedHashMap = this.f129285a;
        if (obj != null) {
            linkedHashMap.put(c14289a, obj);
        } else {
            linkedHashMap.remove(c14289a);
        }
    }

    public C31419h(C31420i c31420i) {
        this.f129285a = AbstractC25247g0.m74003l0(c31420i.f129287a);
    }
}

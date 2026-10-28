package v53;

import a63.InterfaceC0500q;
import java.util.LinkedHashMap;
import o63.AbstractC27621l;
import o63.C27610a;
import p005a3.C0227m1;
import p027b3.C2442t0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: v53.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C35711e {

    /* JADX INFO: renamed from: g */
    public boolean f151943g;

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f151937a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f151938b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f151939c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public AbstractC22680m f151940d = C35707a.f151918y;

    /* JADX INFO: renamed from: e */
    public boolean f151941e = true;

    /* JADX INFO: renamed from: f */
    public boolean f151942f = true;

    /* JADX INFO: renamed from: h */
    public final boolean f151944h = AbstractC27621l.f111159a;

    /* JADX INFO: renamed from: a */
    public final void m113182a(InterfaceC0500q interfaceC0500q, Function1 function1) {
        C27610a key = interfaceC0500q.getKey();
        LinkedHashMap linkedHashMap = this.f151938b;
        linkedHashMap.put(interfaceC0500q.getKey(), new C2442t0(12, (Function1) linkedHashMap.get(key), function1));
        C27610a key2 = interfaceC0500q.getKey();
        LinkedHashMap linkedHashMap2 = this.f151937a;
        if (linkedHashMap2.containsKey(key2)) {
            return;
        }
        linkedHashMap2.put(interfaceC0500q.getKey(), new C0227m1(interfaceC0500q, 26));
    }
}

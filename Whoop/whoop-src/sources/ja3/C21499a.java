package ja3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p000.C31931s;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35850h;
import x93.C38122n;
import x93.C38128t;
import x93.C38131w;
import x93.C38134z;
import xb3.AbstractC38176k;
import xb3.C38170e;
import xb3.C38171f;

/* JADX INFO: renamed from: ja3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21499a implements InterfaceC21503c {

    /* JADX INFO: renamed from: a */
    public final C38122n f82458a;

    /* JADX INFO: renamed from: b */
    public final Function1 f82459b;

    /* JADX INFO: renamed from: c */
    public final C31931s f82460c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f82461d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f82462e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f82463f;

    public C21499a(C38122n jClass, Function1 function1) {
        AbstractC22676k.m65750j(jClass, "jClass");
        this.f82458a = jClass;
        this.f82459b = function1;
        C31931s c31931s = new C31931s(this, 8);
        this.f82460c = c31931s;
        C38171f c38171fM122282r = AbstractC38176k.m122282r(AbstractC25265s.m74145r0(jClass.m122103d()), c31931s);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C38170e c38170e = new C38170e(c38171fM122282r);
        while (c38170e.hasNext()) {
            Object next = c38170e.next();
            C35850h c35850hM122119d = ((C38131w) next).m122119d();
            Object arrayList = linkedHashMap.get(c35850hM122119d);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c35850hM122119d, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f82461d = linkedHashMap;
        C38171f c38171fM122282r2 = AbstractC38176k.m122282r(AbstractC25265s.m74145r0(this.f82458a.m122101b()), this.f82459b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C38170e c38170e2 = new C38170e(c38171fM122282r2);
        while (c38170e2.hasNext()) {
            Object next2 = c38170e2.next();
            linkedHashMap2.put(((C38128t) next2).m122119d(), next2);
        }
        this.f82462e = linkedHashMap2;
        ArrayList arrayListM122105f = this.f82458a.m122105f();
        Function1 function2 = this.f82459b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListM122105f) {
            if (((Boolean) function2.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((C38134z) obj2).m122119d(), obj2);
        }
        this.f82463f = linkedHashMap3;
    }

    @Override // ja3.InterfaceC21503c
    /* JADX INFO: renamed from: a */
    public final Set mo60459a() {
        C38171f c38171fM122282r = AbstractC38176k.m122282r(AbstractC25265s.m74145r0(this.f82458a.m122103d()), this.f82460c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C38170e c38170e = new C38170e(c38171fM122282r);
        while (c38170e.hasNext()) {
            linkedHashSet.add(((C38131w) c38170e.next()).m122119d());
        }
        return linkedHashSet;
    }

    @Override // ja3.InterfaceC21503c
    /* JADX INFO: renamed from: b */
    public final Set mo60460b() {
        return this.f82463f.keySet();
    }

    @Override // ja3.InterfaceC21503c
    /* JADX INFO: renamed from: c */
    public final Set mo60461c() {
        C38171f c38171fM122282r = AbstractC38176k.m122282r(AbstractC25265s.m74145r0(this.f82458a.m122101b()), this.f82459b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C38170e c38170e = new C38170e(c38171fM122282r);
        while (c38170e.hasNext()) {
            linkedHashSet.add(((C38128t) c38170e.next()).m122119d());
        }
        return linkedHashSet;
    }

    @Override // ja3.InterfaceC21503c
    /* JADX INFO: renamed from: d */
    public final C38128t mo60462d(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return (C38128t) this.f82462e.get(name);
    }

    @Override // ja3.InterfaceC21503c
    /* JADX INFO: renamed from: e */
    public final C38134z mo60463e(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return (C38134z) this.f82463f.get(name);
    }

    @Override // ja3.InterfaceC21503c
    /* JADX INFO: renamed from: f */
    public final Collection mo60464f(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        List list = (List) this.f82461d.get(name);
        return list != null ? list : C25271y.f99162w;
    }
}

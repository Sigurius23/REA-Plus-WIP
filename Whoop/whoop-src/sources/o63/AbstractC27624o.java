package o63;

import c93.InterfaceC4351m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o63.o */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC27624o implements InterfaceC27622m {

    /* JADX INFO: renamed from: c */
    public final Map f111160c;

    public AbstractC27624o(Map values) {
        AbstractC22676k.m65750j(values, "values");
        C27613d c27613d = new C27613d();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList.add((String) list.get(i13));
            }
            c27613d.put(str, arrayList);
        }
        this.f111160c = c27613d;
    }

    @Override // o63.InterfaceC27622m
    /* JADX INFO: renamed from: b */
    public final Set mo52165b() {
        Set setEntrySet = this.f111160c.entrySet();
        AbstractC22676k.m65750j(setEntrySet, "<this>");
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        AbstractC22676k.m65749i(setUnmodifiableSet, "unmodifiableSet(this)");
        return setUnmodifiableSet;
    }

    @Override // o63.InterfaceC27622m
    /* JADX INFO: renamed from: c */
    public final void mo52166c(InterfaceC4351m interfaceC4351m) {
        for (Map.Entry entry : this.f111160c.entrySet()) {
            interfaceC4351m.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // o63.InterfaceC27622m
    /* JADX INFO: renamed from: d */
    public final boolean mo52167d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC27622m)) {
            return false;
        }
        InterfaceC27622m interfaceC27622m = (InterfaceC27622m) obj;
        if (true != interfaceC27622m.mo52167d()) {
            return false;
        }
        return mo52165b().equals(interfaceC27622m.mo52165b());
    }

    @Override // o63.InterfaceC27622m
    public final String get(String str) {
        List list = (List) this.f111160c.get(str);
        if (list != null) {
            return (String) AbstractC25265s.m74100H0(list);
        }
        return null;
    }

    public final int hashCode() {
        Set setMo52165b = mo52165b();
        return setMo52165b.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // o63.InterfaceC27622m
    public final boolean isEmpty() {
        return this.f111160c.isEmpty();
    }
}

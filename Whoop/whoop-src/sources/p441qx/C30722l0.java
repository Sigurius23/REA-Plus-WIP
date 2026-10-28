package p441qx;

import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p471rx.AbstractC31885f;

/* JADX INFO: renamed from: qx.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C30722l0 {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f126505d;

    /* JADX INFO: renamed from: a */
    public final List f126506a;

    /* JADX INFO: renamed from: b */
    public final ThreadLocal f126507b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f126508c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f126505d = arrayList;
        arrayList.add(AbstractC30736s0.f126530a);
        arrayList.add(AbstractC30727o.f126513b);
        arrayList.add(C30711g.f126457e);
        arrayList.add(C30711g.f126456d);
        arrayList.add(AbstractC30728o0.f126515a);
        arrayList.add(C30721l.f126501d);
    }

    public C30722l0(C30716i0 c30716i0) {
        ArrayList arrayList = c30716i0.f126485a;
        int size = arrayList.size();
        ArrayList arrayList2 = f126505d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f126506a = Collections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public final JsonAdapter m94398a(Class cls) {
        return m94400c(cls, AbstractC31885f.f132390a, null);
    }

    /* JADX INFO: renamed from: b */
    public final JsonAdapter m94399b(Type type, Set set) {
        return m94400c(type, set, null);
    }

    /* JADX INFO: renamed from: c */
    public final JsonAdapter m94400c(Type type, Set set, String str) {
        JsonAdapter jsonAdapter;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM99130h = AbstractC31885f.m99130h(AbstractC31885f.m99123a(type));
        Object objAsList = set.isEmpty() ? typeM99130h : Arrays.asList(typeM99130h, set);
        synchronized (this.f126508c) {
            try {
                JsonAdapter jsonAdapter2 = (JsonAdapter) this.f126508c.get(objAsList);
                if (jsonAdapter2 != null) {
                    return jsonAdapter2;
                }
                C30720k0 c30720k0 = (C30720k0) this.f126507b.get();
                if (c30720k0 == null) {
                    c30720k0 = new C30720k0(this);
                    this.f126507b.set(c30720k0);
                }
                ArrayDeque arrayDeque = c30720k0.f126498b;
                ArrayList arrayList = c30720k0.f126497a;
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        C30718j0 c30718j0 = new C30718j0(typeM99130h, str, objAsList);
                        arrayList.add(c30718j0);
                        arrayDeque.add(c30718j0);
                        jsonAdapter = null;
                        break;
                    }
                    C30718j0 c30718j1 = (C30718j0) arrayList.get(i13);
                    if (c30718j1.f126492c.equals(objAsList)) {
                        arrayDeque.add(c30718j1);
                        JsonAdapter jsonAdapter3 = c30718j1.f126493d;
                        jsonAdapter = c30718j1;
                        if (jsonAdapter3 == null) {
                            break;
                        }
                        jsonAdapter = jsonAdapter3;
                        break;
                    }
                    i13++;
                }
                try {
                    if (jsonAdapter != null) {
                        c30720k0.m94397b(false);
                        return jsonAdapter;
                    }
                    try {
                        int size2 = this.f126506a.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            JsonAdapter jsonAdapterCreate = ((InterfaceC30735s) this.f126506a.get(i14)).create(typeM99130h, set, this);
                            if (jsonAdapterCreate != null) {
                                ((C30718j0) c30720k0.f126498b.getLast()).f126493d = jsonAdapterCreate;
                                c30720k0.m94397b(true);
                                return jsonAdapterCreate;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + AbstractC31885f.m99133k(typeM99130h, set));
                    } catch (IllegalArgumentException e5) {
                        throw c30720k0.m94396a(e5);
                    }
                } catch (Throwable th3) {
                    c30720k0.m94397b(false);
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final JsonAdapter m94401d(C30707e c30707e, Type type, Set set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM99130h = AbstractC31885f.m99130h(AbstractC31885f.m99123a(type));
        List list = this.f126506a;
        int iIndexOf = list.indexOf(c30707e);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + c30707e);
        }
        int size = list.size();
        for (int i13 = iIndexOf + 1; i13 < size; i13++) {
            JsonAdapter jsonAdapterCreate = ((InterfaceC30735s) list.get(i13)).create(typeM99130h, set, this);
            if (jsonAdapterCreate != null) {
                return jsonAdapterCreate;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + AbstractC31885f.m99133k(typeM99130h, set));
    }
}

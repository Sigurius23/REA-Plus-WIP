package yb3;

import m83.AbstractC25242e;

/* JADX INFO: renamed from: yb3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C39408l extends AbstractC25242e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C39410n f169581w;

    public C39408l(C39410n c39410n) {
        this.f169581w = c39410n;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f169581w.f169583a.groupCount() + 1;
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        String strGroup = this.f169581w.f169583a.group(i13);
        return strGroup == null ? "" : strGroup;
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}

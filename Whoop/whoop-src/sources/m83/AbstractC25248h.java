package m83;

import d93.InterfaceC11822c;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: m83.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25248h extends AbstractList implements List, InterfaceC11822c {
    /* JADX INFO: renamed from: a */
    public abstract int mo74007a();

    /* JADX INFO: renamed from: c */
    public abstract Object mo74008c(int i13);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i13) {
        return mo74008c(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo74007a();
    }
}

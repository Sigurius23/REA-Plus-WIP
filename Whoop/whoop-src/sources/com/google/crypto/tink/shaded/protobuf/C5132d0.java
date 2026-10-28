package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5132d0 extends AbstractC5125b implements InterfaceC5135e0, RandomAccess {

    /* JADX INFO: renamed from: x */
    public final List f21498x;

    static {
        new C5132d0();
    }

    public C5132d0(ArrayList arrayList) {
        super(true);
        this.f21498x = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5135e0
    /* JADX INFO: renamed from: T0 */
    public final void mo16154T0(AbstractC5146i abstractC5146i) {
        m16122a();
        this.f21498x.add(abstractC5146i);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        m16122a();
        this.f21498x.add(i13, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5125b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f21498x.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5135e0
    /* JADX INFO: renamed from: b */
    public final List mo16155b() {
        return Collections.unmodifiableList(this.f21498x);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5125b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m16122a();
        this.f21498x.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        String str;
        List list = this.f21498x;
        Object obj = list.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC5146i)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC5126b0.f21479a);
            if (AbstractC5169p1.f21562a.mo16297W(bArr, 0, bArr.length) == 0) {
                list.set(i13, str2);
            }
            return str2;
        }
        AbstractC5146i abstractC5146i = (AbstractC5146i) obj;
        Charset charset = AbstractC5126b0.f21479a;
        if (abstractC5146i.size() == 0) {
            str = "";
        } else {
            C5143h c5143h = (C5143h) abstractC5146i;
            str = new String(c5143h.f21510z, c5143h.mo16167j(), c5143h.size(), charset);
        }
        C5143h c5143h2 = (C5143h) abstractC5146i;
        int iMo16167j = c5143h2.mo16167j();
        if (AbstractC5169p1.f21562a.mo16297W(c5143h2.f21510z, iMo16167j, c5143h2.size() + iMo16167j) == 0) {
            list.set(i13, str);
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5123a0
    /* JADX INFO: renamed from: i */
    public final InterfaceC5123a0 mo16111i(int i13) {
        List list = this.f21498x;
        if (i13 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i13);
        arrayList.addAll(list);
        return new C5132d0(arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5135e0
    /* JADX INFO: renamed from: k */
    public final InterfaceC5135e0 mo16156k() {
        return this.f21478w ? new C5145h1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5125b, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        m16122a();
        Object objRemove = this.f21498x.remove(i13);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC5146i)) {
            return new String((byte[]) objRemove, AbstractC5126b0.f21479a);
        }
        AbstractC5146i abstractC5146i = (AbstractC5146i) objRemove;
        Charset charset = AbstractC5126b0.f21479a;
        if (abstractC5146i.size() == 0) {
            return "";
        }
        C5143h c5143h = (C5143h) abstractC5146i;
        return new String(c5143h.f21510z, c5143h.mo16167j(), c5143h.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        m16122a();
        Object obj2 = this.f21498x.set(i13, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC5146i)) {
            return new String((byte[]) obj2, AbstractC5126b0.f21479a);
        }
        AbstractC5146i abstractC5146i = (AbstractC5146i) obj2;
        Charset charset = AbstractC5126b0.f21479a;
        if (abstractC5146i.size() == 0) {
            return "";
        }
        C5143h c5143h = (C5143h) abstractC5146i;
        return new String(c5143h.f21510z, c5143h.mo16167j(), c5143h.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21498x.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5135e0
    /* JADX INFO: renamed from: x */
    public final Object mo16157x(int i13) {
        return this.f21498x.get(i13);
    }

    public C5132d0() {
        super(false);
        this.f21498x = Collections.EMPTY_LIST;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5125b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        m16122a();
        if (collection instanceof InterfaceC5135e0) {
            collection = ((InterfaceC5135e0) collection).mo16155b();
        }
        boolean zAddAll = this.f21498x.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C5132d0(int i13) {
        this(new ArrayList(i13));
    }
}

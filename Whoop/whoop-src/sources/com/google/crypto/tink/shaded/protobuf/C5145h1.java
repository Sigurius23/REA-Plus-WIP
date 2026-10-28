package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5145h1 extends AbstractList implements InterfaceC5135e0, RandomAccess {

    /* JADX INFO: renamed from: w */
    public final C5132d0 f21513w;

    public C5145h1(C5132d0 c5132d0) {
        this.f21513w = c5132d0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5135e0
    /* JADX INFO: renamed from: T0 */
    public final void mo16154T0(AbstractC5146i abstractC5146i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5135e0
    /* JADX INFO: renamed from: b */
    public final List mo16155b() {
        return Collections.unmodifiableList(this.f21513w.f21498x);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return (String) this.f21513w.get(i13);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C5142g1 c5142g1 = new C5142g1();
        c5142g1.f21509w = this.f21513w.iterator();
        return c5142g1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5135e0
    /* JADX INFO: renamed from: k */
    public final InterfaceC5135e0 mo16156k() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        C5139f1 c5139f1 = new C5139f1();
        c5139f1.f21508w = this.f21513w.listIterator(i13);
        return c5139f1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21513w.f21498x.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5135e0
    /* JADX INFO: renamed from: x */
    public final Object mo16157x(int i13) {
        return this.f21513w.f21498x.get(i13);
    }
}

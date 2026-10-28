package com.mapbox.common.location;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p715kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002J\u000e\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"com/mapbox/common/location/LocationUpdatesReceiver$CircularArray$iterator$1", "", "index", "Ljava/util/concurrent/atomic/AtomicInteger;", "hasNext", "", "next", "()Ljava/lang/Object;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class LocationUpdatesReceiver$CircularArray$iterator$1<T> implements Iterator<T>, InterfaceC11820a {
    private final AtomicInteger index = new AtomicInteger(0);
    final /* synthetic */ LocationUpdatesReceiver.CircularArray<T> this$0;

    public LocationUpdatesReceiver$CircularArray$iterator$1(LocationUpdatesReceiver.CircularArray<T> circularArray) {
        this.this$0 = circularArray;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index.get() < this.this$0.getCurrentSize();
    }

    @Override // java.util.Iterator
    public T next() {
        return this.this$0.get(this.index.getAndIncrement());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

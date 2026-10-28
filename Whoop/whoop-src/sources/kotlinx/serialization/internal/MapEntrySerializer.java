package kotlinx.serialization.internal;

import d13.AbstractC11478a;
import d93.InterfaceC11820a;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0016B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lkotlinx/serialization/internal/MapEntrySerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "", "Lwc3/c;", "keySerializer", "valueSerializer", "<init>", "(Lwc3/c;Lwc3/c;)V", "key", "value", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "getKey", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "getValue", "MapEntry", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MapEntrySerializer<K, V> extends KeyValueSerializer<K, V, Map.Entry<? extends K, ? extends V>> {
    private final InterfaceC39443g descriptor;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\tJ\u000e\u0010\r\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00022\b\b\u0002\u0010\u0005\u001a\u00028\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00028\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lkotlinx/serialization/internal/MapEntrySerializer$MapEntry;", "K", "V", "", "key", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/serialization/internal/MapEntrySerializer$MapEntry;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MapEntry<K, V> implements Map.Entry<K, V>, InterfaceC11820a {
        private final K key;
        private final V value;

        public MapEntry(K k5, V v13) {
            this.key = k5;
            this.value = v13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MapEntry copy$default(MapEntry mapEntry, Object obj, Object obj2, int i13, Object obj3) {
            if ((i13 & 1) != 0) {
                obj = mapEntry.key;
            }
            if ((i13 & 2) != 0) {
                obj2 = mapEntry.value;
            }
            return mapEntry.copy(obj, obj2);
        }

        public final K component1() {
            return this.key;
        }

        public final V component2() {
            return this.value;
        }

        public final MapEntry<K, V> copy(K key, V value) {
            return new MapEntry<>(key, value);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapEntry)) {
                return false;
            }
            MapEntry mapEntry = (MapEntry) other;
            return AbstractC22676k.m65745e(this.key, mapEntry.key) && AbstractC22676k.m65745e(this.value, mapEntry.value);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k5 = this.key;
            int iHashCode = (k5 == null ? 0 : k5.hashCode()) * 31;
            V v13 = this.value;
            return iHashCode + (v13 != null ? v13.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v13) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("MapEntry(key=");
            sb4.append(this.key);
            sb4.append(", value=");
            return AbstractC11478a.m30860l(sb4, this.value, ')');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(InterfaceC37138c keySerializer, InterfaceC37138c valueSerializer) {
        super(keySerializer, valueSerializer, null);
        AbstractC22676k.m65750j(keySerializer, "keySerializer");
        AbstractC22676k.m65750j(valueSerializer, "valueSerializer");
        C39448l c39448l = C39448l.f169715c;
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("kotlin.collections.Map.Entry")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (c39448l.equals(C39448l.f169713a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C39437a c39437a = new C39437a("kotlin.collections.Map.Entry");
        descriptor$lambda$0(keySerializer, valueSerializer, c39437a);
        this.descriptor = new C39444h("kotlin.collections.Map.Entry", c39448l, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    private static final C23454a0 descriptor$lambda$0(InterfaceC37138c interfaceC37138c, InterfaceC37138c interfaceC37138c2, C39437a buildSerialDescriptor) {
        AbstractC22676k.m65750j(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.m125993a("key", interfaceC37138c.getDescriptor(), false);
        buildSerialDescriptor.m125993a("value", interfaceC37138c2.getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public K getKey(Map.Entry<? extends K, ? extends V> entry) {
        AbstractC22676k.m65750j(entry, "<this>");
        return entry.getKey();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public V getValue(Map.Entry<? extends K, ? extends V> entry) {
        AbstractC22676k.m65750j(entry, "<this>");
        return entry.getValue();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public Map.Entry<K, V> toResult(K key, V value) {
        return new MapEntry(key, value);
    }
}

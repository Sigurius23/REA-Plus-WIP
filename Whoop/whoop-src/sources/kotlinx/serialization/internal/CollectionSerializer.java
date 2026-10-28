package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0001H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r*\u00028\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lkotlinx/serialization/internal/CollectionSerializer;", "E", "", "C", "B", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lwc3/c;", "element", "<init>", "(Lwc3/c;)V", "", "collectionSize", "(Ljava/util/Collection;)I", "", "collectionIterator", "(Ljava/util/Collection;)Ljava/util/Iterator;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class CollectionSerializer<E, C extends Collection<? extends E>, B> extends CollectionLikeSerializer<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSerializer(InterfaceC37138c element) {
        super(element, null);
        AbstractC22676k.m65750j(element, "element");
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Iterator<E> collectionIterator(C c3) {
        AbstractC22676k.m65750j(c3, "<this>");
        return c3.iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(C c3) {
        AbstractC22676k.m65750j(c3, "<this>");
        return c3.size();
    }
}

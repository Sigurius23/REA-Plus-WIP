package kotlinx.serialization.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lkotlinx/serialization/internal/LinkedHashSetSerializer;", "E", "Lkotlinx/serialization/internal/CollectionSerializer;", "", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lwc3/c;", "eSerializer", "<init>", "(Lwc3/c;)V", "builder", "()Ljava/util/LinkedHashSet;", "", "builderSize", "(Ljava/util/LinkedHashSet;)I", "toResult", "(Ljava/util/LinkedHashSet;)Ljava/util/Set;", "toBuilder", "(Ljava/util/Set;)Ljava/util/LinkedHashSet;", "size", "Ll83/a0;", "checkCapacity", "(Ljava/util/LinkedHashSet;I)V", "index", "element", "insert", "(Ljava/util/LinkedHashSet;ILjava/lang/Object;)V", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LinkedHashSetSerializer<E> extends CollectionSerializer<E, Set<? extends E>, LinkedHashSet<E>> {
    private final InterfaceC39443g descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedHashSetSerializer(InterfaceC37138c eSerializer) {
        super(eSerializer);
        AbstractC22676k.m65750j(eSerializer, "eSerializer");
        this.descriptor = new LinkedHashSetClassDesc(eSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(LinkedHashSet<E> linkedHashSet, int i13) {
        AbstractC22676k.m65750j(linkedHashSet, "<this>");
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Set<E> toResult(LinkedHashSet<E> linkedHashSet) {
        AbstractC22676k.m65750j(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public LinkedHashSet<E> builder() {
        return new LinkedHashSet<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(LinkedHashSet<E> linkedHashSet) {
        AbstractC22676k.m65750j(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public void insert(LinkedHashSet<E> linkedHashSet, int i13, E e5) {
        AbstractC22676k.m65750j(linkedHashSet, "<this>");
        linkedHashSet.add(e5);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public LinkedHashSet<E> toBuilder(Set<? extends E> set) {
        AbstractC22676k.m65750j(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }
}

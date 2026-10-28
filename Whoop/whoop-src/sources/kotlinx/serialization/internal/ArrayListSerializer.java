package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0018\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lkotlinx/serialization/internal/ArrayListSerializer;", "E", "Lkotlinx/serialization/internal/CollectionSerializer;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lwc3/c;", "element", "<init>", "(Lwc3/c;)V", "builder", "()Ljava/util/ArrayList;", "", "builderSize", "(Ljava/util/ArrayList;)I", "toResult", "(Ljava/util/ArrayList;)Ljava/util/List;", "toBuilder", "(Ljava/util/List;)Ljava/util/ArrayList;", "size", "Ll83/a0;", "checkCapacity", "(Ljava/util/ArrayList;I)V", "index", "insert", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ArrayListSerializer<E> extends CollectionSerializer<E, List<? extends E>, ArrayList<E>> {
    private final InterfaceC39443g descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayListSerializer(InterfaceC37138c element) {
        super(element);
        AbstractC22676k.m65750j(element, "element");
        this.descriptor = new ArrayListClassDesc(element.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public List<E> toResult(ArrayList<E> arrayList) {
        AbstractC22676k.m65750j(arrayList, "<this>");
        return arrayList;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<E> builder() {
        return new ArrayList<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(ArrayList<E> arrayList) {
        AbstractC22676k.m65750j(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(ArrayList<E> arrayList, int i13) {
        AbstractC22676k.m65750j(arrayList, "<this>");
        arrayList.ensureCapacity(i13);
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public void insert(ArrayList<E> arrayList, int i13, E e5) {
        AbstractC22676k.m65750j(arrayList, "<this>");
        arrayList.add(i13, e5);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<E> toBuilder(List<? extends E> list) {
        AbstractC22676k.m65750j(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }
}

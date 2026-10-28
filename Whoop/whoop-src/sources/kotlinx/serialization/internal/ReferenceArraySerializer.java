package kotlinx.serialization.internal;

import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000e*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u001d*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010\"\u001a\u00020\u001d*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\"\u0010#R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lkotlinx/serialization/internal/ReferenceArraySerializer;", "", "ElementKlass", "Element", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lj93/d;", "kClass", "Lwc3/c;", "eSerializer", "<init>", "(Lj93/d;Lwc3/c;)V", "", "collectionSize", "([Ljava/lang/Object;)I", "", "collectionIterator", "([Ljava/lang/Object;)Ljava/util/Iterator;", "builder", "()Ljava/util/ArrayList;", "builderSize", "(Ljava/util/ArrayList;)I", "toResult", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "toBuilder", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "size", "Ll83/a0;", "checkCapacity", "(Ljava/util/ArrayList;I)V", "index", "element", "insert", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "Lj93/d;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ReferenceArraySerializer<ElementKlass, Element extends ElementKlass> extends CollectionLikeSerializer<Element, Element[], ArrayList<Element>> {
    private final InterfaceC39443g descriptor;
    private final InterfaceC21461d kClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceArraySerializer(InterfaceC21461d kClass, InterfaceC37138c eSerializer) {
        super(eSerializer, null);
        AbstractC22676k.m65750j(kClass, "kClass");
        AbstractC22676k.m65750j(eSerializer, "eSerializer");
        this.kClass = kClass;
        this.descriptor = new ArrayClassDesc(eSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<Element> builder() {
        return new ArrayList<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(ArrayList<Element> arrayList) {
        AbstractC22676k.m65750j(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(ArrayList<Element> arrayList, int i13) {
        AbstractC22676k.m65750j(arrayList, "<this>");
        arrayList.ensureCapacity(i13);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Iterator<Element> collectionIterator(Element[] elementArr) {
        AbstractC22676k.m65750j(elementArr, "<this>");
        return AbstractC22681m0.m65777h(elementArr);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(Element[] elementArr) {
        AbstractC22676k.m65750j(elementArr, "<this>");
        return elementArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public void insert(ArrayList<Element> arrayList, int i13, Element element) {
        AbstractC22676k.m65750j(arrayList, "<this>");
        arrayList.add(i13, element);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<Element> toBuilder(Element[] elementArr) {
        AbstractC22676k.m65750j(elementArr, "<this>");
        return new ArrayList<>(AbstractC25260n.m74048W(elementArr));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Element[] toResult(ArrayList<Element> arrayList) {
        AbstractC22676k.m65750j(arrayList, "<this>");
        return (Element[]) PlatformKt.toNativeArrayImpl(arrayList, this.kClass);
    }
}

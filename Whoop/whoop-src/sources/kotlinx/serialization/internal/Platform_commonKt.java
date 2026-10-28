package kotlinx.serialization.internal;

import j93.C21462d0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\t*\u0006\u0012\u0002\b\u00030\nH\u0081\b¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\t*\u0006\u0012\u0002\b\u00030\rH\u0081\b¢\u0006\u0004\b\u000b\u0010\u000e\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\t*\u0006\u0012\u0002\b\u00030\u000fH\u0081\b¢\u0006\u0004\b\u000b\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u0011H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u001a\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011*\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001e\u001a\u00020\u0019*\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, m65681d2 = {"Lyc3/g;", "", "", "cachedSerialNames", "(Lyc3/g;)Ljava/util/Set;", "", "", "compactArray", "(Ljava/util/List;)[Lyc3/g;", "T", "Lwc3/c;", "cast", "(Lwc3/c;)Lwc3/c;", "Lwc3/j;", "(Lwc3/j;)Lwc3/j;", "Lwc3/b;", "(Lwc3/b;)Lwc3/b;", "Lj93/d;", "", "serializerNotRegistered", "(Lj93/d;)Ljava/lang/Void;", "notRegisteredMessage", "(Lj93/d;)Ljava/lang/String;", "className", "(Ljava/lang/String;)Ljava/lang/String;", "Lj93/a0;", "", "kclass", "(Lj93/a0;)Lj93/d;", "Lj93/d0;", "typeOrThrow", "(Lj93/d0;)Lj93/a0;", "K", "", "Lkotlin/Function1;", "selector", "", "elementsHashCodeBy", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)I", "EMPTY_DESCRIPTOR_ARRAY", "[Lyc3/g;", "kotlinx-serialization-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class Platform_commonKt {
    private static final InterfaceC39443g[] EMPTY_DESCRIPTOR_ARRAY = new InterfaceC39443g[0];

    public static final Set<String> cachedSerialNames(InterfaceC39443g interfaceC39443g) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        if (interfaceC39443g instanceof CachedNames) {
            return ((CachedNames) interfaceC39443g).getSerialNames();
        }
        HashSet hashSet = new HashSet(interfaceC39443g.getElementsCount());
        int elementsCount = interfaceC39443g.getElementsCount();
        for (int i13 = 0; i13 < elementsCount; i13++) {
            hashSet.add(interfaceC39443g.getElementName(i13));
        }
        return hashSet;
    }

    public static final <T> InterfaceC37137b cast(InterfaceC37137b interfaceC37137b) {
        AbstractC22676k.m65750j(interfaceC37137b, "<this>");
        return interfaceC37137b;
    }

    public static final InterfaceC39443g[] compactArray(List<? extends InterfaceC39443g> list) {
        InterfaceC39443g[] interfaceC39443gArr;
        List<? extends InterfaceC39443g> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC39443gArr = (InterfaceC39443g[]) list.toArray(new InterfaceC39443g[0])) == null) ? EMPTY_DESCRIPTOR_ARRAY : interfaceC39443gArr;
    }

    public static final <T, K> int elementsHashCodeBy(Iterable<? extends T> iterable, Function1 selector) {
        AbstractC22676k.m65750j(iterable, "<this>");
        AbstractC22676k.m65750j(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            int i13 = iHashCode * 31;
            Object objInvoke = selector.invoke(it.next());
            iHashCode = i13 + (objInvoke != null ? objInvoke.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final InterfaceC21461d kclass(InterfaceC21456a0 interfaceC21456a0) {
        AbstractC22676k.m65750j(interfaceC21456a0, "<this>");
        InterfaceC21463e classifier = interfaceC21456a0.getClassifier();
        if (classifier instanceof InterfaceC21461d) {
            return (InterfaceC21461d) classifier;
        }
        if (!(classifier instanceof InterfaceC21458b0)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    public static final String notRegisteredMessage(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        String simpleName = interfaceC21461d.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return notRegisteredMessage(simpleName);
    }

    public static final Void serializerNotRegistered(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        throw new SerializationException(notRegisteredMessage(interfaceC21461d));
    }

    public static final InterfaceC21456a0 typeOrThrow(C21462d0 c21462d0) {
        AbstractC22676k.m65750j(c21462d0, "<this>");
        InterfaceC21456a0 interfaceC21456a0M60393c = c21462d0.m60393c();
        if (interfaceC21456a0M60393c != null) {
            return interfaceC21456a0M60393c;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + c21462d0.m60393c()).toString());
    }

    public static final <T> InterfaceC37138c cast(InterfaceC37138c interfaceC37138c) {
        AbstractC22676k.m65750j(interfaceC37138c, "<this>");
        return interfaceC37138c;
    }

    public static final String notRegisteredMessage(String className) {
        AbstractC22676k.m65750j(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final <T> InterfaceC37145j cast(InterfaceC37145j interfaceC37145j) {
        AbstractC22676k.m65750j(interfaceC37145j, "<this>");
        return interfaceC37145j;
    }
}

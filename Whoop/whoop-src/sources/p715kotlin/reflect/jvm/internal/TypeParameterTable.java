package p715kotlin.reflect.jvm.internal;

import aa3.AbstractC0645p;
import aa3.C0606b1;
import aa3.C0612d1;
import j93.InterfaceC21458b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25263q;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B5\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/TypeParameterTable;", "", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "ownTypeParameters", "", "", "Lj93/b0;", "map", "parent", "<init>", "(Ljava/util/List;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeParameterTable;)V", "id", "get", "(I)Lj93/b0;", "Ljava/util/List;", "getOwnTypeParameters", "()Ljava/util/List;", "Ljava/util/Map;", "Lkotlin/reflect/jvm/internal/TypeParameterTable;", "Companion", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TypeParameterTable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final TypeParameterTable EMPTY = new TypeParameterTable(C25271y.f99162w, C25272z.f99163w, null);
    private final Map<Integer, InterfaceC21458b0> map;
    private final List<KTypeParameterImpl> ownTypeParameters;
    private final TypeParameterTable parent;

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/TypeParameterTable$Companion;", "", "<init>", "()V", "", "Laa3/d1;", "kmTypeParameters", "Lkotlin/reflect/jvm/internal/TypeParameterTable;", "parent", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "container", "Ljava/lang/ClassLoader;", "classLoader", "create", "(Ljava/util/List;Lkotlin/reflect/jvm/internal/TypeParameterTable;Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Ljava/lang/ClassLoader;)Lkotlin/reflect/jvm/internal/TypeParameterTable;", "EMPTY", "Lkotlin/reflect/jvm/internal/TypeParameterTable;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
        public final TypeParameterTable create(List<C0612d1> kmTypeParameters, TypeParameterTable parent, KTypeParameterOwnerImpl container, ClassLoader classLoader) {
            AbstractC22676k.m65750j(kmTypeParameters, "kmTypeParameters");
            AbstractC22676k.m65750j(container, "container");
            AbstractC22676k.m65750j(classLoader, "classLoader");
            List<C0612d1> list = kmTypeParameters;
            ArrayList<KTypeParameterImpl> arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (C0612d1 c0612d1 : list) {
                arrayList.add(new KTypeParameterImpl(container, c0612d1.f2168b, ConvertFromMetadataKt.toKVariance(c0612d1.f2170d), AbstractC0645p.f2261l.m16043W(c0612d1, AbstractC0645p.f2250a[49])));
            }
            C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(list);
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            Iterator it = c25263qM74105J1.iterator();
            while (true) {
                C25241d0 c25241d0 = (C25241d0) it;
                if (!c25241d0.f99123x.hasNext()) {
                    break;
                }
                C25239c0 c25239c0 = (C25239c0) c25241d0.next();
                linkedHashMap.put(Integer.valueOf(((C0612d1) c25239c0.f99118b).f2169c), arrayList.get(c25239c0.f99117a));
            }
            TypeParameterTable typeParameterTable = new TypeParameterTable(arrayList, linkedHashMap, parent, null);
            int i13 = 0;
            for (KTypeParameterImpl kTypeParameterImpl : arrayList) {
                int i14 = i13 + 1;
                ArrayList arrayList2 = kmTypeParameters.get(i13).f2171e;
                ?? arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ClassLoader classLoader2 = classLoader;
                    arrayList3.add(ConvertFromMetadataKt.toKType$default((C0606b1) it3.next(), classLoader2, typeParameterTable, null, 4, null));
                    classLoader = classLoader2;
                }
                ClassLoader classLoader3 = classLoader;
                if (arrayList3.isEmpty()) {
                    arrayList3 = AbstractC37056f.m118958J(StandardKTypes.INSTANCE.getNULLABLE_ANY());
                }
                kTypeParameterImpl.setUpperBounds((List) arrayList3);
                i13 = i14;
                classLoader = classLoader3;
            }
            return typeParameterTable;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TypeParameterTable(List list, Map map, TypeParameterTable typeParameterTable, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, map, typeParameterTable);
    }

    public final InterfaceC21458b0 get(int id4) {
        InterfaceC21458b0 interfaceC21458b0 = this.map.get(Integer.valueOf(id4));
        if (interfaceC21458b0 != null) {
            return interfaceC21458b0;
        }
        TypeParameterTable typeParameterTable = this.parent;
        if (typeParameterTable != null) {
            return typeParameterTable.get(id4);
        }
        return null;
    }

    public final List<KTypeParameterImpl> getOwnTypeParameters() {
        return this.ownTypeParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeParameterTable(List<KTypeParameterImpl> list, Map<Integer, ? extends InterfaceC21458b0> map, TypeParameterTable typeParameterTable) {
        this.ownTypeParameters = list;
        this.map = map;
        this.parent = typeParameterTable;
    }
}

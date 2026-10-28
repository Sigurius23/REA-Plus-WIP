package p549vb;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import c93.InterfaceC4339a;
import cd3.AbstractC4454f;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import kotlinx.serialization.internal.TripleSerializer;
import l83.C23465k;
import l83.C23471q;
import m83.AbstractC25267u;
import m83.C25271y;
import p037bu.C3632c;
import p557vo.AbstractC36220b;
import p636y3.C39172d;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import vf3.AbstractC35952b;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.C39438b;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: vb.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC35862g {
    /* JADX INFO: renamed from: a */
    public static C39172d m113838a() {
        return new C39172d(1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC21461d m113839b(InterfaceC39443g interfaceC39443g) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        if (interfaceC39443g instanceof C39438b) {
            return ((C39438b) interfaceC39443g).f169686b;
        }
        if (interfaceC39443g instanceof SerialDescriptorForNullable) {
            return m113839b(((SerialDescriptorForNullable) interfaceC39443g).getOriginal());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static SharedPreferences m113840c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: renamed from: d */
    public static C35858c m113841d(C3632c refHolder, SQLiteDatabase sQLiteDatabase) {
        AbstractC22676k.m65750j(refHolder, "refHolder");
        C35858c c35858c = (C35858c) refHolder.f14788w;
        if (c35858c != null && c35858c.f152668w.equals(sQLiteDatabase)) {
            return c35858c;
        }
        C35858c c35858c2 = new C35858c(sQLiteDatabase);
        refHolder.f14788w = c35858c2;
        return c35858c2;
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC37138c m113842e(AbstractC4454f module, InterfaceC21461d kClass) {
        AbstractC22676k.m65750j(module, "module");
        AbstractC22676k.m65750j(kClass, "kClass");
        InterfaceC37138c interfaceC37138cMo13924b = module.mo13924b(kClass, C25271y.f99162w);
        return interfaceC37138cMo13924b == null ? new C37140e(kClass) : interfaceC37138cMo13924b;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC37138c m113843f(AbstractC4454f module, InterfaceC21461d kClass) {
        AbstractC22676k.m65750j(module, "module");
        AbstractC22676k.m65750j(kClass, "kClass");
        InterfaceC37138c interfaceC37138cMo13924b = module.mo13924b(kClass, C25271y.f99162w);
        if (interfaceC37138cMo13924b != null) {
            return interfaceC37138cMo13924b;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC37138c m113844g(InterfaceC21461d interfaceC21461d, ArrayList arrayList, InterfaceC4339a interfaceC4339a) {
        InterfaceC37138c arrayListSerializer;
        InterfaceC37138c referenceArraySerializer;
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        if (interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(Collection.class)) || interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(List.class)) || interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(List.class)) || interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(ArrayList.class))) {
            arrayListSerializer = new ArrayListSerializer((InterfaceC37138c) arrayList.get(0));
        } else if (interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(HashSet.class))) {
            arrayListSerializer = new HashSetSerializer((InterfaceC37138c) arrayList.get(0));
        } else if (interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(Set.class)) || interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(Set.class)) || interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(LinkedHashSet.class))) {
            arrayListSerializer = new LinkedHashSetSerializer((InterfaceC37138c) arrayList.get(0));
        } else if (interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(HashMap.class))) {
            arrayListSerializer = new HashMapSerializer((InterfaceC37138c) arrayList.get(0), (InterfaceC37138c) arrayList.get(1));
        } else if (interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(Map.class)) || interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(Map.class)) || interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(LinkedHashMap.class))) {
            arrayListSerializer = new LinkedHashMapSerializer((InterfaceC37138c) arrayList.get(0), (InterfaceC37138c) arrayList.get(1));
        } else if (interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(Map.Entry.class))) {
            arrayListSerializer = AbstractC38195a.m122334b((InterfaceC37138c) arrayList.get(0), (InterfaceC37138c) arrayList.get(1));
        } else {
            if (interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(C23465k.class))) {
                InterfaceC37138c keySerializer = (InterfaceC37138c) arrayList.get(0);
                InterfaceC37138c valueSerializer = (InterfaceC37138c) arrayList.get(1);
                AbstractC22676k.m65750j(keySerializer, "keySerializer");
                AbstractC22676k.m65750j(valueSerializer, "valueSerializer");
                referenceArraySerializer = new PairSerializer(keySerializer, valueSerializer);
            } else if (interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(C23471q.class))) {
                InterfaceC37138c aSerializer = (InterfaceC37138c) arrayList.get(0);
                InterfaceC37138c bSerializer = (InterfaceC37138c) arrayList.get(1);
                InterfaceC37138c cSerializer = (InterfaceC37138c) arrayList.get(2);
                AbstractC22676k.m65750j(aSerializer, "aSerializer");
                AbstractC22676k.m65750j(bSerializer, "bSerializer");
                AbstractC22676k.m65750j(cSerializer, "cSerializer");
                arrayListSerializer = new TripleSerializer(aSerializer, bSerializer, cSerializer);
            } else if (PlatformKt.isReferenceArray(interfaceC21461d)) {
                Object objInvoke = interfaceC4339a.invoke();
                AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                InterfaceC37138c elementSerializer = (InterfaceC37138c) arrayList.get(0);
                AbstractC22676k.m65750j(elementSerializer, "elementSerializer");
                referenceArraySerializer = new ReferenceArraySerializer((InterfaceC21461d) objInvoke, elementSerializer);
            } else {
                arrayListSerializer = null;
            }
            arrayListSerializer = referenceArraySerializer;
        }
        if (arrayListSerializer != null) {
            return arrayListSerializer;
        }
        InterfaceC37138c[] interfaceC37138cArr = (InterfaceC37138c[]) arrayList.toArray(new InterfaceC37138c[0]);
        return PlatformKt.constructSerializerForGivenTypeArgs(interfaceC21461d, (InterfaceC37138c[]) Arrays.copyOf(interfaceC37138cArr, interfaceC37138cArr.length));
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC37138c m113845h(AbstractC4454f abstractC4454f, Type type) {
        AbstractC22676k.m65750j(abstractC4454f, "<this>");
        InterfaceC37138c interfaceC37138cM114202j = AbstractC35952b.m114202j(abstractC4454f, type, true);
        if (interfaceC37138cM114202j != null) {
            return interfaceC37138cM114202j;
        }
        PlatformKt.serializerNotRegistered(AbstractC35952b.m114199g(type));
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC37138c m113846i(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        InterfaceC37138c interfaceC37138cM113847j = m113847j(interfaceC21461d);
        if (interfaceC37138cM113847j != null) {
            return interfaceC37138cM113847j;
        }
        Platform_commonKt.serializerNotRegistered(interfaceC21461d);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC37138c m113847j(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        InterfaceC37138c interfaceC37138cCompiledSerializerImpl = PlatformKt.compiledSerializerImpl(interfaceC21461d);
        return interfaceC37138cCompiledSerializerImpl == null ? PrimitivesKt.builtinSerializerOrNull(interfaceC21461d) : interfaceC37138cCompiledSerializerImpl;
    }

    /* JADX INFO: renamed from: k */
    public static final ArrayList m113848k(AbstractC4454f abstractC4454f, List typeArguments, boolean z4) {
        AbstractC22676k.m65750j(abstractC4454f, "<this>");
        AbstractC22676k.m65750j(typeArguments, "typeArguments");
        if (!z4) {
            List<InterfaceC21456a0> list = typeArguments;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (InterfaceC21456a0 type : list) {
                AbstractC22676k.m65750j(type, "type");
                InterfaceC37138c interfaceC37138cM115292D = AbstractC36220b.m115292D(abstractC4454f, type, false);
                if (interfaceC37138cM115292D == null) {
                    return null;
                }
                arrayList.add(interfaceC37138cM115292D);
            }
            return arrayList;
        }
        List<InterfaceC21456a0> list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (InterfaceC21456a0 type2 : list2) {
            AbstractC22676k.m65750j(type2, "type");
            InterfaceC37138c interfaceC37138cM115292D2 = AbstractC36220b.m115292D(abstractC4454f, type2, true);
            if (interfaceC37138cM115292D2 == null) {
                PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type2));
                throw new KotlinNothingValueException();
            }
            arrayList2.add(interfaceC37138cM115292D2);
        }
        return arrayList2;
    }
}

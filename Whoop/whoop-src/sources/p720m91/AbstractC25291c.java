package p720m91;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Predicate;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import n83.C26459b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p668z1.C39967p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: m91.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001aE\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0003\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"K", "Lm91/u;", "V", "", "items", "Lkotlin/Function1;", "id", "Lm91/a;", "c", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "Lm91/n;", "b", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25291c {

    /* JADX INFO: renamed from: m91.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.item.AnimatableListItemsKt$animatableListItems$1$1", m100430f = "AnimatableListItems.kt", m100431l = {48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f99275w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f99276x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39967p f99277y;

        /* JADX INFO: renamed from: m91.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41987a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28670t2 f99278w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39967p f99279x;

            public C41987a(InterfaceC28670t2 interfaceC28670t2, C39967p c39967p) {
                this.f99278w = interfaceC28670t2;
                this.f99279x = c39967p;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Map<K, ? extends V> map, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C25287a c25287a;
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0((Map) this.f99278w.getValue());
                C39967p c39967p = this.f99279x;
                InterfaceC28670t2 interfaceC28670t2 = this.f99278w;
                ListIterator listIterator = c39967p.listIterator();
                while (true) {
                    C26459b c26459b = (C26459b) listIterator;
                    if (!c26459b.hasNext()) {
                        break;
                    }
                    C25287a c25287a2 = (C25287a) c26459b.next();
                    if (c25287a2.m74237f() != EnumC25296e0.Invisible) {
                        InterfaceC25312u interfaceC25312u = (InterfaceC25312u) ((Map) interfaceC28670t2.getValue()).get(c25287a2.m74234c());
                        if (interfaceC25312u == null) {
                            c25287a = new C25287a(c25287a2.m74234c(), c25287a2.m74235d(), EnumC25296e0.Exiting);
                        } else {
                            linkedHashMapM74003l0.remove(c25287a2.m74234c());
                            c25287a = new C25287a(c25287a2.m74234c(), interfaceC25312u, c25287a2.m74237f());
                        }
                        arrayList.add(c25287a);
                    }
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMapM74003l0.size());
                for (Map.Entry entry : linkedHashMapM74003l0.entrySet()) {
                    arrayList2.add(new C25287a(entry.getKey(), (InterfaceC25312u) entry.getValue(), EnumC25296e0.Entering));
                }
                arrayList.addAll(arrayList2);
                this.f99279x.clear();
                this.f99279x.addAll(arrayList);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28670t2 interfaceC28670t2, C39967p c39967p, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f99276x = interfaceC28670t2;
            this.f99277y = c39967p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final Map m74246h(InterfaceC28670t2 interfaceC28670t2) {
            return (Map) interfaceC28670t2.getValue();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f99276x, this.f99277y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99275w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C25289b(this.f99276x, 0));
                C41987a c41987a = new C41987a(this.f99276x, this.f99277y);
                this.f99275w = 1;
                if (c13084s1M87240H.collect(c41987a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: m91.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.item.AnimatableListItemsKt$animatableListItems$2$1", m100430f = "AnimatableListItems.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f99280w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39967p f99281x;

        /* JADX INFO: renamed from: m91.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C39967p f99282w;

            public a(C39967p c39967p) {
                this.f99282w = c39967p;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: f */
            public static final boolean m74252f(C25287a item) {
                AbstractC22676k.m65750j(item, "item");
                return item.m74237f() == EnumC25296e0.Invisible;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: g */
            public static final boolean m74253g(Function1 function1, Object obj) {
                return ((Boolean) function1.invoke(obj)).booleanValue();
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object emit(C25287a<K, V> c25287a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (c25287a != 0) {
                    C39967p c39967p = this.f99282w;
                    final C25293d c25293d = new C25293d(0);
                    c39967p.removeIf(new Predicate() { // from class: m91.e
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return AbstractC25291c.b.a.m74253g(c25293d, obj);
                        }
                    });
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C39967p c39967p, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f99281x = c39967p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C25287a m74249h(C39967p c39967p) {
            Object next;
            Iterator<E> it = c39967p.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((C25287a) next).m74237f() == EnumC25296e0.Invisible) {
                    return (C25287a) next;
                }
            }
            next = null;
            return (C25287a) next;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f99281x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99280w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C25289b(this.f99281x, 1));
                a aVar = new a(this.f99281x);
                this.f99280w = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final <K, V extends InterfaceC25305n<K>> List<C25287a<K, V>> m74242b(List<? extends V> items, Composer composer, int i13) {
        AbstractC22676k.m65750j(items, "items");
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C25293d(1);
            c28655q.m87172p0(objM87133R);
        }
        return m74243c(items, (Function1) objM87133R, c28655q, (i13 & 14) | 48);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final <K, V extends InterfaceC25312u> List<C25287a<K, V>> m74243c(List<? extends V> items, Function1 id4, Composer composer, int i13) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(id4, "id");
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            List<? extends V> list = items;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) it.next();
                arrayList.add(new C25287a(id4.invoke(interfaceC25312u), interfaceC25312u, EnumC25296e0.Visible));
            }
            objM87133R = AbstractC28683x.m87242J(arrayList);
            c28655q.m87172p0(objM87133R);
        }
        C39967p c39967p = (C39967p) objM87133R;
        List<? extends V> list2 = items;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list2) {
            linkedHashMap.put(id4.invoke(obj), obj);
        }
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(linkedHashMap, c28655q);
        boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87238F);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = new a(interfaceC28601c1M87238F, c39967p, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC28601c1M87238F);
        Object objM87133R3 = c28655q.m87133R();
        if (objM87133R3 == c28676v0) {
            objM87133R3 = new b(c39967p, null);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c39967p);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c39967p, 10));
        ListIterator listIterator = c39967p.listIterator();
        while (true) {
            C26459b c26459b = (C26459b) listIterator;
            if (!c26459b.hasNext()) {
                return arrayList2;
            }
            C25287a c25287aM74232b = (C25287a) c26459b.next();
            InterfaceC25312u interfaceC25312u2 = (InterfaceC25312u) ((Map) interfaceC28601c1M87238F.getValue()).get(c25287aM74232b.m74234c());
            if (interfaceC25312u2 != null) {
                c25287aM74232b = C25287a.m74232b(c25287aM74232b, null, interfaceC25312u2, null, 5, null);
            }
            arrayList2.add(c25287aM74232b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Object m74244d(InterfaceC25305n it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getId();
    }
}

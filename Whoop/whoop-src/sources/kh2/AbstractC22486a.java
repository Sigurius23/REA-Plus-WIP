package kh2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: kh2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001a&\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\b\u0010\u0006\u001a6\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"La6/g;", "Lf6/f;", "Lf6/d;", "key", "", "a", "(La6/g;Lf6/d;Lq83/d;)Ljava/lang/Object;", "T", "b", "value", "c", "(La6/g;Lf6/d;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;", "essentials_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22486a {

    /* JADX INFO: renamed from: kh2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.storage.DataStoreExtKt", m100430f = "DataStoreExt.kt", m100431l = {9}, m100432m = "contains", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f88162w;

        /* JADX INFO: renamed from: x */
        Object f88163x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88164y;

        /* JADX INFO: renamed from: z */
        int f88165z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f88164y = obj;
            this.f88165z |= Integer.MIN_VALUE;
            return AbstractC22486a.m64985a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kh2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.storage.DataStoreExtKt", m100430f = "DataStoreExt.kt", m100431l = {13}, m100432m = "get", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T> extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f88166w;

        /* JADX INFO: renamed from: x */
        Object f88167x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88168y;

        /* JADX INFO: renamed from: z */
        int f88169z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f88168y = obj;
            this.f88169z |= Integer.MIN_VALUE;
            return AbstractC22486a.m64986b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kh2.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.storage.DataStoreExtKt", m100430f = "DataStoreExt.kt", m100431l = {C1533u.MAX_FIELD_NUMBER}, m100432m = "set", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c<T> extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f88170E;

        /* JADX INFO: renamed from: w */
        Object f88171w;

        /* JADX INFO: renamed from: x */
        Object f88172x;

        /* JADX INFO: renamed from: y */
        Object f88173y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f88174z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f88174z = obj;
            this.f88170E |= Integer.MIN_VALUE;
            return AbstractC22486a.m64987c(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kh2.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.storage.DataStoreExtKt$set$2", m100430f = "DataStoreExt.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88175w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f88176x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14132d f88177y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ T f88178z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C14132d c14132d, T t14, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88177y = c14132d;
            this.f88178z = t14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f88177y, this.f88178z, interfaceC30057d);
            dVar.f88176x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f88176x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88175w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(this.f88177y, this.f88178z);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m64985a(InterfaceC0422g interfaceC0422g, C14132d key, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f88165z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f88165z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM36575A = aVar.f88164y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f88165z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC13058l data = interfaceC0422g.getData();
            aVar.f88162w = null;
            aVar.f88163x = key;
            aVar.f88165z = 1;
            objM36575A = AbstractC13091v.m36575A(data, aVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            key = (C14132d) aVar.f88163x;
            AbstractC34132o.m107864I(objM36575A);
        }
        C14129a c14129a = (C14129a) ((AbstractC14134f) objM36575A);
        c14129a.getClass();
        AbstractC22676k.m65750j(key, "key");
        return Boolean.valueOf(c14129a.f50833a.containsKey(key));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final <T> Object m64986b(InterfaceC0422g interfaceC0422g, C14132d c14132d, InterfaceC30057d<? super T> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f88169z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f88169z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM36575A = bVar.f88168y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f88169z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC13058l data = interfaceC0422g.getData();
            bVar.f88166w = null;
            bVar.f88167x = c14132d;
            bVar.f88169z = 1;
            objM36575A = AbstractC13091v.m36575A(data, bVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c14132d = (C14132d) bVar.f88167x;
            AbstractC34132o.m107864I(objM36575A);
        }
        return ((AbstractC14134f) objM36575A).mo40227b(c14132d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final <T> Object m64987c(InterfaceC0422g interfaceC0422g, C14132d c14132d, T t14, InterfaceC30057d<? super T> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f88170E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f88170E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f88174z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f88170E;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = cVar.f88173y;
            AbstractC34132o.m107864I(obj);
            return obj2;
        }
        AbstractC34132o.m107864I(obj);
        d dVar = new d(c14132d, t14, null);
        cVar.f88171w = null;
        cVar.f88172x = null;
        cVar.f88173y = t14;
        cVar.f88170E = 1;
        return AbstractC17269i.m48861G(interfaceC0422g, dVar, cVar) == enumC31071a ? enumC31071a : t14;
    }
}

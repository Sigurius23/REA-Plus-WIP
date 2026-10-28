package il1;

import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: il1.w */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lil1/w;", "", "La6/g;", "Lf6/f;", "prefsDataStore", "<init>", "(La6/g;)V", "", "b", "(Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "a", "La6/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18646w {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g prefsDataStore;

    /* JADX INFO: renamed from: il1.w$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeToolbarInteractor$pressGiftIcon$2", m100430f = "HomeToolbarInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73174w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f73175x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f73175x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f73175x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f73174w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(AbstractC18647x.m54077a(), Boolean.TRUE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: il1.w$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeToolbarInteractor", m100430f = "HomeToolbarInteractor.kt", m100431l = {16}, m100432m = "shouldShowGiftIconNewIndicator", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f73176w;

        /* JADX INFO: renamed from: y */
        int f73178y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f73176w = obj;
            this.f73178y |= Integer.MIN_VALUE;
            return C18646w.this.m54076b(this);
        }
    }

    public C18646w(InterfaceC0422g prefsDataStore) {
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        this.prefsDataStore = prefsDataStore;
    }

    /* JADX INFO: renamed from: a */
    public final Object m54075a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM48861G = AbstractC17269i.m48861G(this.prefsDataStore, new a(null), interfaceC30057d);
        return objM48861G == EnumC31071a.f128113w ? objM48861G : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m54076b(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f73178y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f73178y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM36575A = bVar.f73176w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f73178y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC13058l data = this.prefsDataStore.getData();
            bVar.f73178y = 1;
            objM36575A = AbstractC13091v.m36575A(data, bVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36575A);
        }
        Boolean bool = (Boolean) ((AbstractC14134f) objM36575A).mo40227b(AbstractC18647x.m54077a());
        return Boolean.valueOf(!(bool != null ? bool.booleanValue() : false));
    }
}

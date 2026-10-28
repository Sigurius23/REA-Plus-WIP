package al1;

import c93.InterfaceC4339a;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wk1.AbstractC37339c;

/* JADX INFO: renamed from: al1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lal1/e;", "", "<init>", "()V", "Lec3/l;", "Lwk1/c;", "domainStateFlow", "Lkotlin/Function0;", "Ll83/a0;", "recordErrorState", "Lal1/d;", "a", "(Lec3/l;Lc93/a;)Lec3/l;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0984e {

    /* JADX INFO: renamed from: al1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f3624w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f3625x;

        /* JADX INFO: renamed from: al1.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41281a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f3626w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC4339a f3627x;

            /* JADX INFO: renamed from: al1.e$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.helpcenter.presentation.HelpCenterViewStateReducer$reduce$$inlined$map$1$2", m100430f = "HelpCenterViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41282a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f3628E;

                /* JADX INFO: renamed from: F */
                Object f3629F;

                /* JADX INFO: renamed from: G */
                Object f3630G;

                /* JADX INFO: renamed from: H */
                int f3631H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f3632w;

                /* JADX INFO: renamed from: x */
                int f3633x;

                /* JADX INFO: renamed from: y */
                Object f3634y;

                public C41282a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f3632w = obj;
                    this.f3633x |= Integer.MIN_VALUE;
                    return C41281a.this.emit(null, this);
                }
            }

            public C41281a(InterfaceC13062m interfaceC13062m, InterfaceC4339a interfaceC4339a) {
                this.f3626w = interfaceC13062m;
                this.f3627x = interfaceC4339a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41282a c41282a;
                Object cVar;
                if (interfaceC30057d instanceof C41282a) {
                    c41282a = (C41282a) interfaceC30057d;
                    int i13 = c41282a.f3633x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41282a.f3633x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41282a = new C41282a(interfaceC30057d);
                    }
                } else {
                    c41282a = new C41282a(interfaceC30057d);
                }
                Object obj2 = c41282a.f3632w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41282a.f3633x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f3626w;
                    AbstractC37339c abstractC37339c = (AbstractC37339c) obj;
                    if (abstractC37339c instanceof AbstractC37339c.b) {
                        cVar = new AbstractC0983d.c(((AbstractC37339c.b) abstractC37339c).getData());
                    } else {
                        if (!(abstractC37339c instanceof AbstractC37339c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f3627x.invoke();
                        cVar = AbstractC0983d.a.f3621a;
                    }
                    c41282a.f3634y = null;
                    c41282a.f3628E = null;
                    c41282a.f3629F = null;
                    c41282a.f3630G = null;
                    c41282a.f3631H = 0;
                    c41282a.f3633x = 1;
                    if (interfaceC13062m.emit(cVar, c41282a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, InterfaceC4339a interfaceC4339a) {
            this.f3624w = interfaceC13058l;
            this.f3625x = interfaceC4339a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f3624w.collect(new C41281a(interfaceC13062m, this.f3625x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m2678a(InterfaceC13058l domainStateFlow, InterfaceC4339a recordErrorState) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        AbstractC22676k.m65750j(recordErrorState, "recordErrorState");
        return new a(domainStateFlow, recordErrorState);
    }
}

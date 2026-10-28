package nx2;

import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import mx2.AbstractC26019f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import px2.InterfaceC29603f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: nx2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lnx2/a;", "", "<init>", "()V", "Lec3/l;", "Lmx2/f;", "domainStateFlow", "Lpx2/f;", "a", "(Lec3/l;)Lec3/l;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27227a {

    /* JADX INFO: renamed from: nx2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108978w;

        /* JADX INFO: renamed from: nx2.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42103a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108979w;

            /* JADX INFO: renamed from: nx2.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.reducer.CampaignDetailsViewStateReducer$reduce$$inlined$map$1$2", m100430f = "CampaignDetailsViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42104a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108980E;

                /* JADX INFO: renamed from: F */
                Object f108981F;

                /* JADX INFO: renamed from: G */
                Object f108982G;

                /* JADX INFO: renamed from: H */
                int f108983H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108984w;

                /* JADX INFO: renamed from: x */
                int f108985x;

                /* JADX INFO: renamed from: y */
                Object f108986y;

                public C42104a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108984w = obj;
                    this.f108985x |= Integer.MIN_VALUE;
                    return C42103a.this.emit(null, this);
                }
            }

            public C42103a(InterfaceC13062m interfaceC13062m) {
                this.f108979w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42104a c42104a;
                Object bVar;
                if (interfaceC30057d instanceof C42104a) {
                    c42104a = (C42104a) interfaceC30057d;
                    int i13 = c42104a.f108985x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42104a.f108985x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42104a = new C42104a(interfaceC30057d);
                    }
                } else {
                    c42104a = new C42104a(interfaceC30057d);
                }
                Object obj2 = c42104a.f108984w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42104a.f108985x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108979w;
                    AbstractC26019f abstractC26019f = (AbstractC26019f) obj;
                    if (abstractC26019f instanceof AbstractC26019f.a) {
                        bVar = AbstractC27228b.m82054m((AbstractC26019f.a) abstractC26019f);
                    } else {
                        if (!(abstractC26019f instanceof AbstractC26019f.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = new InterfaceC29603f.b(AbstractC27228b.m82053l(((AbstractC26019f.b) abstractC26019f).getModal()));
                    }
                    c42104a.f108986y = null;
                    c42104a.f108980E = null;
                    c42104a.f108981F = null;
                    c42104a.f108982G = null;
                    c42104a.f108983H = 0;
                    c42104a.f108985x = 1;
                    if (interfaceC13062m.emit(bVar, c42104a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f108978w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108978w.collect(new C42103a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m82041a(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return new a(domainStateFlow);
    }
}

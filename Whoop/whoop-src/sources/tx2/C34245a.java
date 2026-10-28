package tx2;

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
import sx2.AbstractC33076b;
import ux2.InterfaceC35372b;

/* JADX INFO: renamed from: tx2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Ltx2/a;", "", "<init>", "()V", "Lec3/l;", "Lsx2/b;", "domainStateFlow", "Lux2/b;", "a", "(Lec3/l;)Lec3/l;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34245a {

    /* JADX INFO: renamed from: tx2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f143638w;

        /* JADX INFO: renamed from: tx2.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42423a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f143639w;

            /* JADX INFO: renamed from: tx2.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignextendeddetails.reducer.CampaignExtendedDetailsViewStateReducer$reduce$$inlined$map$1$2", m100430f = "CampaignExtendedDetailsViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42424a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f143640E;

                /* JADX INFO: renamed from: F */
                Object f143641F;

                /* JADX INFO: renamed from: G */
                Object f143642G;

                /* JADX INFO: renamed from: H */
                int f143643H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f143644w;

                /* JADX INFO: renamed from: x */
                int f143645x;

                /* JADX INFO: renamed from: y */
                Object f143646y;

                public C42424a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f143644w = obj;
                    this.f143645x |= Integer.MIN_VALUE;
                    return C42423a.this.emit(null, this);
                }
            }

            public C42423a(InterfaceC13062m interfaceC13062m) {
                this.f143639w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42424a c42424a;
                Object objM108288b;
                if (interfaceC30057d instanceof C42424a) {
                    c42424a = (C42424a) interfaceC30057d;
                    int i13 = c42424a.f143645x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42424a.f143645x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42424a = new C42424a(interfaceC30057d);
                    }
                } else {
                    c42424a = new C42424a(interfaceC30057d);
                }
                Object obj2 = c42424a.f143644w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42424a.f143645x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f143639w;
                    AbstractC33076b abstractC33076b = (AbstractC33076b) obj;
                    if (AbstractC22676k.m65745e(abstractC33076b, AbstractC33076b.c.f137928a)) {
                        objM108288b = InterfaceC35372b.c.f150672a;
                    } else if (abstractC33076b instanceof AbstractC33076b.a) {
                        objM108288b = new InterfaceC35372b.a(((AbstractC33076b.a) abstractC33076b).getCampaignId());
                    } else {
                        if (!(abstractC33076b instanceof AbstractC33076b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM108288b = AbstractC34246b.m108288b(((AbstractC33076b.b) abstractC33076b).getCampaignExtendedDetailsScreen());
                    }
                    c42424a.f143646y = null;
                    c42424a.f143640E = null;
                    c42424a.f143641F = null;
                    c42424a.f143642G = null;
                    c42424a.f143643H = 0;
                    c42424a.f143645x = 1;
                    if (interfaceC13062m.emit(objM108288b, c42424a) == enumC31071a) {
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
            this.f143638w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f143638w.collect(new C42423a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m108286a(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return new a(domainStateFlow);
    }
}

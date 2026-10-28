package qy2;

import com.whoop.design.util.AbstractC8693b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import or2.C28205u0;
import oy2.InterfaceC28476b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ty2.AbstractC34268a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: qy2.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqy2/b;", "", "Lzr2/a;", "dateAndTimeProvider", "Lor2/u0;", "localizedDateTimeFormatter", "<init>", "(Lzr2/a;Lor2/u0;)V", "Lec3/l;", "Loy2/b;", "domainStateFlow", "Lty2/a;", "c", "(Lec3/l;)Lec3/l;", "a", "Lzr2/a;", "()Lzr2/a;", "b", "Lor2/u0;", "()Lor2/u0;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30778b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28205u0 localizedDateTimeFormatter;

    /* JADX INFO: renamed from: qy2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.reducer.CampaignStepsViewStateReducer$reduce$1", m100430f = "CampaignStepsViewStateReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lty2/a;", "previousViewState", "Loy2/b;", "currentDomainState", "<anonymous>", "(Lty2/a;Loy2/b;)Lty2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f126764w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f126765x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f126766y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC34268a abstractC34268a, InterfaceC28476b interfaceC28476b, InterfaceC30057d<? super AbstractC34268a> interfaceC30057d) {
            a aVar = C30778b.this.new a(interfaceC30057d);
            aVar.f126765x = abstractC34268a;
            aVar.f126766y = interfaceC28476b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC34268a abstractC34268a = (AbstractC34268a) this.f126765x;
            InterfaceC28476b interfaceC28476b = (InterfaceC28476b) this.f126766y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f126764w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(interfaceC28476b, InterfaceC28476b.q.f115003a)) {
                return AbstractC34268a.g.f143930a;
            }
            if (interfaceC28476b instanceof InterfaceC28476b.i) {
                return AbstractC30779c.m94642u((InterfaceC28476b.i) interfaceC28476b);
            }
            if (interfaceC28476b instanceof InterfaceC28476b.g) {
                return AbstractC30779c.m94640s((InterfaceC28476b.g) interfaceC28476b);
            }
            if (interfaceC28476b instanceof InterfaceC28476b.m) {
                return AbstractC30779c.m94644w((InterfaceC28476b.m) interfaceC28476b);
            }
            if (interfaceC28476b instanceof InterfaceC28476b.t) {
                return new AbstractC34268a.j(AbstractC8693b.m21278l(((InterfaceC28476b.t) interfaceC28476b).getText()));
            }
            if (interfaceC28476b instanceof InterfaceC28476b.r) {
                InterfaceC28476b.r rVar = (InterfaceC28476b.r) interfaceC28476b;
                return new AbstractC34268a.h(AbstractC8693b.m21278l(rVar.getText()), AbstractC8693b.m21278l(rVar.getSubtext()));
            }
            if (interfaceC28476b instanceof InterfaceC28476b.s) {
                return AbstractC30779c.m94646y((InterfaceC28476b.s) interfaceC28476b);
            }
            if (interfaceC28476b instanceof InterfaceC28476b.o) {
                InterfaceC28476b.o oVar = (InterfaceC28476b.o) interfaceC28476b;
                return new AbstractC34268a.e(AbstractC8693b.m21278l(oVar.getTitle()), AbstractC8693b.m21278l(oVar.getBody()), AbstractC8693b.m21278l(oVar.getPositiveCta()), AbstractC8693b.m21278l(oVar.getNegativeCta()));
            }
            if (interfaceC28476b instanceof InterfaceC28476b.p) {
                InterfaceC28476b.p pVar = (InterfaceC28476b.p) interfaceC28476b;
                return new AbstractC34268a.f(AbstractC8693b.m21277k(pVar.getTitle()), AbstractC8693b.m21277k(pVar.getDescription()), AbstractC8693b.m21277k(pVar.getPrimaryActionText()));
            }
            if (interfaceC28476b instanceof InterfaceC28476b.k) {
                return new AbstractC34268a.b(((InterfaceC28476b.k) interfaceC28476b).getCampaignId());
            }
            if (AbstractC22676k.m65745e(interfaceC28476b, InterfaceC28476b.l.f114983a)) {
                return abstractC34268a;
            }
            if (interfaceC28476b instanceof InterfaceC28476b.c) {
                return AbstractC30779c.m94637p((InterfaceC28476b.c) interfaceC28476b);
            }
            if (interfaceC28476b instanceof InterfaceC28476b.a) {
                return AbstractC30779c.m94635n((InterfaceC28476b.a) interfaceC28476b);
            }
            if (interfaceC28476b instanceof InterfaceC28476b.n) {
                return AbstractC30779c.m94645x((InterfaceC28476b.n) interfaceC28476b);
            }
            if (interfaceC28476b instanceof InterfaceC28476b.e) {
                return AbstractC30779c.m94639r((InterfaceC28476b.e) interfaceC28476b);
            }
            if (interfaceC28476b instanceof InterfaceC28476b.d) {
                return AbstractC30779c.m94638q((InterfaceC28476b.d) interfaceC28476b);
            }
            if (interfaceC28476b instanceof InterfaceC28476b.h) {
                return AbstractC30779c.m94641t((InterfaceC28476b.h) interfaceC28476b);
            }
            if (interfaceC28476b instanceof InterfaceC28476b.j) {
                return AbstractC30779c.m94643v((InterfaceC28476b.j) interfaceC28476b);
            }
            if (interfaceC28476b instanceof InterfaceC28476b.b) {
                return AbstractC30779c.m94636o((InterfaceC28476b.b) interfaceC28476b, C30778b.this.getDateAndTimeProvider(), C30778b.this.getLocalizedDateTimeFormatter().m85383l());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C30778b(InterfaceC41070a dateAndTimeProvider, C28205u0 localizedDateTimeFormatter) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC41070a getDateAndTimeProvider() {
        return this.dateAndTimeProvider;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C28205u0 getLocalizedDateTimeFormatter() {
        return this.localizedDateTimeFormatter;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m94617c(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return AbstractC13091v.m36610t(new C13060l1(AbstractC34268a.g.f143930a, domainStateFlow, new a(null)));
    }
}

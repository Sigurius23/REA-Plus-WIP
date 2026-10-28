package kx2;

import androidx.health.platform.client.proto.C1533u;
import ax2.InterfaceC2121a;
import ax2.InterfaceC2122b;
import ex2.C13731b;
import l83.C23454a0;
import mx2.C26014a;
import mx2.InterfaceC26015b;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: kx2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lkx2/a;", "Lax2/a;", "Ll83/a0;", "Lmx2/b$a;", "action", "Lex2/b;", "repository", "Ltr2/n;", "logger", "<init>", "(Lmx2/b$a;Lex2/b;Ltr2/n;)V", "Lax2/b;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lmx2/b$a;", "b", "Lex2/b;", "c", "Ltr2/n;", "d", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22884a implements InterfaceC2121a<C23454a0> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f90340e = 8;

    /* JADX INFO: renamed from: f */
    private static final String f90341f = "AbandonCampaignDetailsCommand";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26015b.a action;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C13731b repository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: kx2.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkx2/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m66510a() {
            return C22884a.f90341f;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kx2.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.commands.AbandonCampaignDetailsCommand", m100430f = "AbandonCampaignDetailsCommand.kt", m100431l = {C1533u.MAX_FIELD_NUMBER}, m100432m = "execute", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f90345w;

        /* JADX INFO: renamed from: y */
        int f90347y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f90345w = obj;
            this.f90347y |= Integer.MIN_VALUE;
            return C22884a.this.mo6691a(this);
        }
    }

    public C22884a(InterfaceC26015b.a action, C13731b repository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(logger, "logger");
        this.action = action;
        this.repository = repository;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ax2.InterfaceC2121a
    /* JADX INFO: renamed from: a */
    public Object mo6691a(InterfaceC30057d<? super InterfaceC2122b<? extends C23454a0>> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f90347y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f90347y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM38970a = bVar.f90345w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f90347y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM38970a);
            this.logger.mo85228t(AbstractC2875y.m8295h(this.action.getCampaignId(), "Attempting to abandon campaign: "), new AbstractC30556a.a[0]);
            C13731b c13731b = this.repository;
            int campaignId = this.action.getCampaignId();
            C26014a feedback = this.action.getFeedback();
            String reason = feedback != null ? feedback.getReason() : null;
            C26014a feedback2 = this.action.getFeedback();
            String additionalText = feedback2 != null ? feedback2.getAdditionalText() : null;
            bVar.f90347y = 1;
            objM38970a = c13731b.m38970a(campaignId, reason, additionalText, bVar);
            if (objM38970a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM38970a);
        }
        if (((Boolean) objM38970a).booleanValue()) {
            this.logger.mo85216g(AbstractC2875y.m8295h(this.action.getCampaignId(), "Participant removed from study: "), new AbstractC30556a.a[0]);
            return new InterfaceC2122b.b(C23454a0.f92919a);
        }
        this.logger.mo85222m(AbstractC2875y.m8295h(this.action.getCampaignId(), "Failed to abandon campaign: "), new AbstractC30556a.a[0]);
        return InterfaceC2122b.a.f8494a;
    }
}

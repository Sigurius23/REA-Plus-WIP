package bz2;

import ax2.InterfaceC2121a;
import ax2.InterfaceC2122b;
import bc3.AbstractC3006f0;
import com.whoop.whooplabs.data.domain.DwlLanding;
import ex2.C13730a;
import l83.C23454a0;
import nz2.AbstractC27308b;
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

/* JADX INFO: renamed from: bz2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lbz2/b;", "Lax2/a;", "Ll83/a0;", "Lcom/whoop/whooplabs/data/domain/DwlLanding;", "landing", "Lex2/a;", "repository", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/whooplabs/data/domain/DwlLanding;Lex2/a;Ltr2/n;)V", "Lax2/b;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whooplabs/data/domain/DwlLanding;", "b", "Lex2/a;", "c", "Ltr2/n;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3717b implements InterfaceC2121a<C23454a0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DwlLanding landing;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C13730a repository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: bz2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.landing.commands.PersistDwlLandingCampaignsCommand", m100430f = "PersistDwlLandingCampaignsCommand.kt", m100431l = {21}, m100432m = "execute", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f15188w;

        /* JADX INFO: renamed from: y */
        int f15190y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f15188w = obj;
            this.f15190y |= Integer.MIN_VALUE;
            return C3717b.this.mo6691a(this);
        }
    }

    public C3717b(DwlLanding landing, C13730a repository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(landing, "landing");
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(logger, "logger");
        this.landing = landing;
        this.repository = repository;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ax2.InterfaceC2121a
    /* JADX INFO: renamed from: a */
    public Object mo6691a(InterfaceC30057d<? super InterfaceC2122b<? extends C23454a0>> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f15190y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f15190y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f15188w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f15190y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                this.logger.mo85216g("Persisting Dwl Landing campaigns", new AbstractC30556a.a[0]);
                C13730a c13730a = this.repository;
                DwlLanding dwlLanding = this.landing;
                aVar.f15190y = 1;
                if (c13730a.m38961c(dwlLanding, aVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return new InterfaceC2122b.b(C23454a0.f92919a);
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(aVar.getContext());
            this.logger.mo85230v("Error saving campaigns", e5, new AbstractC30556a.a[0]);
            return InterfaceC2122b.a.f8494a;
        }
    }

    public /* synthetic */ C3717b(DwlLanding dwlLanding, C13730a c13730a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(dwlLanding, c13730a, (i13 & 4) != 0 ? AbstractC27308b.m82458a("PersistDwlLandingCampaignsCommand") : interfaceC34116n);
    }
}

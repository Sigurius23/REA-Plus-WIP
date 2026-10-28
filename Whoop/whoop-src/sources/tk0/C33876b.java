package tk0;

import android.annotation.SuppressLint;
import android.os.ParcelUuid;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.ble.api.scan.ScanFailure;
import dc3.C11929n;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.ChatClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td3.AbstractC33722b;
import td3.AbstractC33729i;
import td3.C33731k;
import td3.C33732l;
import td3.C33733m;
import td3.C33734n;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: tk0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Ltk0/b;", "Ltk0/d;", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "", "Ljava/util/UUID;", "serviceIds", "Lec3/l;", "", "Ltk0/f;", "a", "(Ljava/util/Set;)Lec3/l;", "Ltd3/m;", "d", "(Ltd3/m;)Ltk0/f;", "Ltd3/n;", "c", "()Ltd3/n;", "Ltr2/n;", "b", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33876b implements InterfaceC33878d {

    /* JADX INFO: renamed from: b */
    private static final a f141895b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: tk0.b$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Ltk0/b$a;", "", "<init>", "()V", "", "REPORT_DELAY_MS", "J", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: tk0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.scan.NordicPlatformScanner$scan$1", m100430f = "NordicPlatformScanner.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ldc3/u;", "", "Ltk0/f;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f141897E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f141898F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Set<UUID> f141899G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C33876b f141900H;

        /* JADX INFO: renamed from: w */
        Object f141901w;

        /* JADX INFO: renamed from: x */
        Object f141902x;

        /* JADX INFO: renamed from: y */
        Object f141903y;

        /* JADX INFO: renamed from: z */
        Object f141904z;

        /* JADX INFO: renamed from: tk0.b$b$a */
        @Metadata(m65680d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"tk0/b$b$a", "Ltd3/i;", "", "Ltk0/f;", "reports", "Ll83/a0;", "d", "(Ljava/util/List;)V", "", "callbackType", "Ltd3/m;", "result", "c", "(ILtd3/m;)V", "results", "a", "errorCode", "b", "(I)V", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC33729i {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C33876b f141905a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC11936u f141906b;

            public a(C33876b c33876b, InterfaceC11936u interfaceC11936u) {
                this.f141905a = c33876b;
                this.f141906b = interfaceC11936u;
            }

            /* JADX INFO: renamed from: d */
            private final void m107134d(List<C33880f> reports) {
                if (((C11935t) this.f141906b).f39041z.mo32218s(reports) instanceof C11929n) {
                    this.f141905a.logger.mo85226q(AbstractC2875y.m8296i(reports.size(), "Dropped a batch of ", " scan reports: consumer is behind"), new AbstractC30556a.a[0]);
                }
            }

            @Override // td3.AbstractC33729i
            /* JADX INFO: renamed from: a */
            public void mo18123a(List<C33733m> results) {
                AbstractC22676k.m65750j(results, "results");
                if (results.isEmpty()) {
                    return;
                }
                List<C33733m> list = results;
                C33876b c33876b = this.f141905a;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(c33876b.m107131d((C33733m) it.next()));
                }
                m107134d(arrayList);
            }

            @Override // td3.AbstractC33729i
            /* JADX INFO: renamed from: b */
            public void mo18124b(int errorCode) {
                ((C11935t) this.f141906b).mo32217r(new ScanFailure.Rejected(errorCode));
            }

            @Override // td3.AbstractC33729i
            /* JADX INFO: renamed from: c */
            public void mo18125c(int callbackType, C33733m result) {
                AbstractC22676k.m65750j(result, "result");
                m107134d(AbstractC37056f.m118958J(this.f141905a.m107131d(result)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set<UUID> set, C33876b c33876b, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141899G = set;
            this.f141900H = c33876b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m107133h(AbstractC33722b abstractC33722b, a aVar) {
            abstractC33722b.m106609d(aVar);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f141899G, this.f141900H, interfaceC30057d);
            bVar.f141898F = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f141898F;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141897E;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            final AbstractC33722b abstractC33722bM106606a = AbstractC33722b.m106606a();
            final a aVar = new a(this.f141900H, interfaceC11936u);
            Set<UUID> set = this.f141899G;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(new C33731k(null, null, new ParcelUuid((UUID) it.next()), null, null, null, null, -1, null, null));
            }
            try {
                abstractC33722bM106606a.m106607b(arrayList, this.f141900H.m107130c(), aVar);
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: tk0.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return C33876b.b.m107133h(abstractC33722bM106606a, aVar);
                    }
                };
                this.f141898F = null;
                this.f141901w = null;
                this.f141902x = null;
                this.f141903y = null;
                this.f141904z = null;
                this.f141897E = 1;
                return AbstractC37056f.m118984h(interfaceC11936u, interfaceC4339a, this) == enumC31071a ? enumC31071a : c23454a0;
            } catch (Exception e5) {
                abstractC33722bM106606a.m106609d(aVar);
                ((C11935t) interfaceC11936u).mo32217r(e5);
                return c23454a0;
            }
        }
    }

    public C33876b(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    @Override // tk0.InterfaceC33878d
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo107129a(Set<UUID> serviceIds) {
        AbstractC22676k.m65750j(serviceIds, "serviceIds");
        return AbstractC13091v.m36600j(new b(serviceIds, this, null));
    }

    /* JADX INFO: renamed from: c */
    public final C33734n m107130c() {
        return new C33734n(2, 1, 0L, 1, 3, false, 255, true, true, true, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, 0L, 0L);
    }

    /* JADX INFO: renamed from: d */
    public final C33880f m107131d(C33733m c33733m) {
        List list;
        AbstractC22676k.m65750j(c33733m, "<this>");
        String address = c33733m.f141097w.getAddress();
        AbstractC22676k.m65749i(address, "getAddress(...)");
        C33732l c33732l = c33733m.f141098x;
        List arrayList = null;
        String str = c33732l != null ? c33732l.f141089f : null;
        int i13 = c33733m.f141099y;
        if (c33732l != null && (list = c33732l.f141085b) != null) {
            List list2 = list;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ParcelUuid) it.next()).getUuid());
            }
        }
        if (arrayList == null) {
            arrayList = C25271y.f99162w;
        }
        return new C33880f(address, str, i13, arrayList);
    }
}

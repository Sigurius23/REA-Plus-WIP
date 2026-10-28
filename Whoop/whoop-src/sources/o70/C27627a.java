package o70;

import com.whoop.data.remote.api.FileDownloaderApi;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import r90.C31102i;
import r90.C31103j;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import ud3.AbstractC34799a1;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: o70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u001b\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lo70/a;", "Lod1/g;", "Lo70/d;", "Lo70/c;", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "fileDownloaderApi", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/data/remote/api/FileDownloaderApi;Ltr2/n;)V", "", "fullTermsUrl", "Lr90/i;", "k", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "termId", "p", "(Lo70/c;Ljava/lang/String;)Lo70/c;", "termDetail", "q", "(Lo70/c;Ljava/lang/String;Lr90/i;)Lo70/c;", "o", "(Lo70/c;)Lo70/c;", "m", "l", "n", "body", "r", "(Ljava/lang/String;)Lr90/i;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "b", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27627a implements InterfaceC27844g<AbstractC27630d, C27629c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FileDownloaderApi fileDownloaderApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: o70.a$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.terms.PrivacyConsentInteractor", m100430f = "PrivacyConsentInteractor.kt", m100431l = {54}, m100432m = "fetchTermDetails", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f111168w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f111169x;

        /* JADX INFO: renamed from: z */
        int f111171z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f111169x = obj;
            this.f111171z |= Integer.MIN_VALUE;
            return C27627a.this.m83390k(null, this);
        }
    }

    /* JADX INFO: renamed from: o70.a$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.terms.PrivacyConsentInteractor$fetchTermDetails$termDetailsContent$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lud3/a1;", "<anonymous>", "()Lud3/a1;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f111172w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f111174y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f111174y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C27627a.this.new b(this.f111174y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111172w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FileDownloaderApi fileDownloaderApi = C27627a.this.fileDownloaderApi;
            String str = this.f111174y;
            this.f111172w = 1;
            Object objDownloadFile = fileDownloaderApi.downloadFile(str, this);
            return objDownloadFile == enumC31071a ? enumC31071a : objDownloadFile;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: o70.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.terms.PrivacyConsentInteractor$interact$1", m100430f = "PrivacyConsentInteractor.kt", m100431l = {20}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lo70/c;", "internalState", "Lo70/d;", "domainAction", "<anonymous>", "(Lo70/c;Lo70/d;)Lo70/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f111175w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f111176x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f111177y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C27629c c27629c, AbstractC27630d abstractC27630d, InterfaceC30057d<? super C27629c> interfaceC30057d) {
            c cVar = C27627a.this.new c(interfaceC30057d);
            cVar.f111176x = c27629c;
            cVar.f111177y = abstractC27630d;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27629c c27629c = (C27629c) this.f111176x;
            AbstractC27630d abstractC27630d = (AbstractC27630d) this.f111177y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111175w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(abstractC27630d instanceof AbstractC27630d.c)) {
                    if (abstractC27630d instanceof AbstractC27630d.f) {
                        return c27629c.m83399a(((AbstractC27630d.f) abstractC27630d).m83405a());
                    }
                    if (AbstractC22676k.m65745e(abstractC27630d, AbstractC27630d.e.f111188a)) {
                        return C27627a.this.m83394o(c27629c);
                    }
                    if (AbstractC22676k.m65745e(abstractC27630d, AbstractC27630d.b.f111184a)) {
                        return C27627a.this.m83392m(c27629c);
                    }
                    if (abstractC27630d instanceof AbstractC27630d.a) {
                        return C27627a.this.m83391l(c27629c, ((AbstractC27630d.a) abstractC27630d).getTermId());
                    }
                    if (abstractC27630d instanceof AbstractC27630d.d) {
                        return C27627a.this.m83393n(c27629c, ((AbstractC27630d.d) abstractC27630d).getTermId());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C27627a c27627a = C27627a.this;
                String fullTermsUrl = ((AbstractC27630d.c) abstractC27630d).getFullTermsUrl();
                this.f111176x = c27629c;
                this.f111177y = abstractC27630d;
                this.f111175w = 1;
                obj = c27627a.m83390k(fullTermsUrl, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C31102i c31102i = (C31102i) obj;
            return c31102i != null ? C27627a.this.m83396q(c27629c, ((AbstractC27630d.c) abstractC27630d).getTermId(), c31102i) : C27627a.this.m83395p(c27629c, ((AbstractC27630d.c) abstractC27630d).getTermId());
        }
    }

    public C27627a(FileDownloaderApi fileDownloaderApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(fileDownloaderApi, "fileDownloaderApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.fileDownloaderApi = fileDownloaderApi;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m83390k(String str, InterfaceC30057d<? super C31102i> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f111171z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f111171z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f111169x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f111171z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f111168w = null;
            aVar2.f111171z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        AbstractC34799a1 abstractC34799a1 = (AbstractC34799a1) AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
        if (abstractC34799a1 != null) {
            return m83397r(abstractC34799a1.m109860m());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final C27629c m83391l(C27629c c27629c, String str) {
        List<C31103j> listM83400b = c27629c.m83400b();
        if (listM83400b == null) {
            listM83400b = C25271y.f99162w;
        }
        List<C31103j> list = listM83400b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C31103j c31103jM95844b : list) {
            if (AbstractC39414r.m125876U(c31103jM95844b.getId(), str, false)) {
                c31103jM95844b = C31103j.m95844b(c31103jM95844b, null, null, null, null, false, false, null, false, null, null, null, false, !c31103jM95844b.getIsChecked(), 4095, null);
            }
            arrayList.add(c31103jM95844b);
        }
        return c27629c.m83399a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C27629c m83392m(C27629c c27629c) {
        List<C31103j> listM83400b = c27629c.m83400b();
        if (listM83400b == null) {
            listM83400b = C25271y.f99162w;
        }
        List<C31103j> list = listM83400b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C31103j.m95844b((C31103j) it.next(), null, null, null, null, false, false, null, false, null, null, null, false, false, 4095, null));
        }
        return c27629c.m83399a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final C27629c m83393n(C27629c c27629c, String str) {
        List<C31103j> listM83400b = c27629c.m83400b();
        if (listM83400b == null) {
            listM83400b = C25271y.f99162w;
        }
        List<C31103j> list = listM83400b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C31103j c31103jM95844b : list) {
            if (AbstractC39414r.m125876U(c31103jM95844b.getId(), str, false)) {
                c31103jM95844b = C31103j.m95844b(c31103jM95844b, null, null, null, null, false, false, null, false, null, null, null, !c31103jM95844b.getIsExpanded(), false, 6143, null);
            }
            arrayList.add(c31103jM95844b);
        }
        return c27629c.m83399a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final C27629c m83394o(C27629c c27629c) {
        List<C31103j> listM83400b = c27629c.m83400b();
        if (listM83400b == null) {
            listM83400b = C25271y.f99162w;
        }
        List<C31103j> list = listM83400b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C31103j.m95844b((C31103j) it.next(), null, null, null, null, false, false, null, false, null, null, null, false, true, 4095, null));
        }
        return c27629c.m83399a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final C27629c m83395p(C27629c c27629c, String str) {
        List<C31103j> listM83400b = c27629c.m83400b();
        if (listM83400b == null) {
            listM83400b = C25271y.f99162w;
        }
        List<C31103j> list = listM83400b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C31103j c31103jM95844b : list) {
            if (AbstractC39414r.m125876U(c31103jM95844b.getId(), str, false)) {
                c31103jM95844b = C31103j.m95844b(c31103jM95844b, null, null, null, null, false, false, null, false, null, null, new C31102i(AbstractC27628b.a.f111179a, null, 2, null), false, false, 7167, null);
            }
            arrayList.add(c31103jM95844b);
        }
        return c27629c.m83399a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final C27629c m83396q(C27629c c27629c, String str, C31102i c31102i) {
        List<C31103j> listM83400b = c27629c.m83400b();
        if (listM83400b == null) {
            listM83400b = C25271y.f99162w;
        }
        List<C31103j> list = listM83400b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C31103j c31103jM95844b : list) {
            if (AbstractC39414r.m125876U(c31103jM95844b.getId(), str, false)) {
                c31103jM95844b = C31103j.m95844b(c31103jM95844b, null, null, null, null, false, false, null, false, null, null, c31102i, false, false, 7167, null);
            }
            arrayList.add(c31103jM95844b);
        }
        return c27629c.m83399a(arrayList);
    }

    /* JADX INFO: renamed from: r */
    private final C31102i m83397r(String body) {
        return new C31102i(AbstractC27628b.b.f111180a, body);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C27629c(null, 1, null), upstream, new c(null));
    }
}

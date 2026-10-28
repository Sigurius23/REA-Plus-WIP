package y72;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.sanguine.domain.models.SanguineWaitlistAnalyticsInfo;
import com.whoop.sanguine.domain.models.SanguineWaitlistResponse;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33208p0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t72.InterfaceC33586e;
import uv0.AbstractC35283c;
import w72.AbstractC36914g;
import w72.C36908a;

/* JADX INFO: renamed from: y72.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Ly72/d;", "", "<init>", "()V", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;", "response", "Lsz0/p0;", "waitlistJoinModalState", "Lw72/g$c;", "b", "(Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;Lsz0/p0;)Lw72/g$c;", "Lec3/l;", "Lt72/e;", "upstream", "Lw72/g;", "c", "(Lec3/l;)Lec3/l;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39288d {

    /* JADX INFO: renamed from: y72.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f169033w;

        /* JADX INFO: renamed from: y72.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42686a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f169034w;

            /* JADX INFO: renamed from: y72.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sanguine.presentation.reducers.SanguineWaitlistViewStateReducer$reduce$$inlined$map$1$2", m100430f = "SanguineWaitlistViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42687a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f169035E;

                /* JADX INFO: renamed from: F */
                Object f169036F;

                /* JADX INFO: renamed from: G */
                Object f169037G;

                /* JADX INFO: renamed from: H */
                int f169038H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f169039w;

                /* JADX INFO: renamed from: x */
                int f169040x;

                /* JADX INFO: renamed from: y */
                Object f169041y;

                public C42687a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f169039w = obj;
                    this.f169040x |= Integer.MIN_VALUE;
                    return C42686a.this.emit(null, this);
                }
            }

            public C42686a(InterfaceC13062m interfaceC13062m) {
                this.f169034w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42687a c42687a;
                if (interfaceC30057d instanceof C42687a) {
                    c42687a = (C42687a) interfaceC30057d;
                    int i13 = c42687a.f169040x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42687a.f169040x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42687a = new C42687a(interfaceC30057d);
                    }
                } else {
                    c42687a = new C42687a(interfaceC30057d);
                }
                Object obj2 = c42687a.f169039w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42687a.f169040x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f169034w;
                    AbstractC36914g currentViewState = ((C39287c) obj).getCurrentViewState();
                    c42687a.f169041y = null;
                    c42687a.f169035E = null;
                    c42687a.f169036F = null;
                    c42687a.f169037G = null;
                    c42687a.f169038H = 0;
                    c42687a.f169040x = 1;
                    if (interfaceC13062m.emit(currentViewState, c42687a) == enumC31071a) {
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
            this.f169033w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f169033w.collect(new C42686a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y72.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.presentation.reducers.SanguineWaitlistViewStateReducer$reduce$1", m100430f = "SanguineWaitlistViewStateReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ly72/c;", "accumulation", "Lt72/e;", "result", "<anonymous>", "(Ly72/c;Lt72/e;)Ly72/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f169043w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f169044x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f169045y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C39287c c39287c, InterfaceC33586e interfaceC33586e, InterfaceC30057d<? super C39287c> interfaceC30057d) {
            b bVar = C39288d.this.new b(interfaceC30057d);
            bVar.f169044x = c39287c;
            bVar.f169045y = interfaceC33586e;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005a A[PHI: r0
          0x005a: PHI (r0v16 w72.g$c) = (r0v13 w72.g$c), (r0v17 w72.g$c) binds: [B:37:0x00bc, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC36914g.c cVarM118537c;
            C39287c c39287c = (C39287c) this.f169044x;
            InterfaceC33586e interfaceC33586e = (InterfaceC33586e) this.f169045y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f169043w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC36914g currentViewState = c39287c.getCurrentViewState();
            AbstractC36914g.c cVar = currentViewState instanceof AbstractC36914g.c ? (AbstractC36914g.c) currentViewState : null;
            if (interfaceC33586e instanceof InterfaceC33586e.a) {
                currentViewState = AbstractC36914g.a.f157950b;
            } else if (interfaceC33586e instanceof InterfaceC33586e.f) {
                currentViewState = C39288d.this.m125265b(((InterfaceC33586e.f) interfaceC33586e).getResponse(), cVar != null ? cVar.getWaitlistJoinModalState() : null);
            } else if (AbstractC22676k.m65745e(interfaceC33586e, InterfaceC33586e.e.f140133a)) {
                if (cVar != null && (cVarM118537c = AbstractC36914g.c.m118537c(cVar, null, null, null, null, null, AbstractC33208p0.f.f138478e, 31, null)) != null) {
                    currentViewState = cVarM118537c;
                }
            } else if (interfaceC33586e instanceof InterfaceC33586e.d) {
                currentViewState = C39288d.this.m125265b(((InterfaceC33586e.d) interfaceC33586e).getResponse(), new AbstractC33208p0.h(null, 0L, null, 7, null));
            } else if (AbstractC22676k.m65745e(interfaceC33586e, InterfaceC33586e.b.f140130a)) {
                if (cVar == null || (currentViewState = AbstractC36914g.c.m118537c(cVar, null, null, null, null, null, new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35283c.f150170H, null, 2, null), false, null, 6, null), 31, null)) == null) {
                    currentViewState = AbstractC36914g.a.f157950b;
                }
            } else {
                if (!AbstractC22676k.m65745e(interfaceC33586e, InterfaceC33586e.c.f140131a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (cVar != null && (cVarM118537c = AbstractC36914g.c.m118537c(cVar, null, null, null, null, null, null, 31, null)) != null) {
                    currentViewState = cVarM118537c;
                }
            }
            return new C39287c(currentViewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final AbstractC36914g.c m125265b(SanguineWaitlistResponse response, AbstractC33208p0 waitlistJoinModalState) {
        SanguineWaitlistAnalyticsInfo analytics = response.getAnalytics();
        C36908a c36908a = analytics != null ? new C36908a(analytics.getOnWaitlist(), analytics.getViewedLabel()) : null;
        AbstractC22403o.c cVar = new AbstractC22403o.c(response.getHeaderImageUrl(), 0, 0, 0, 14, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(response.getHeaderText());
        List<DesignSystemModel> items = response.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC39285a.m125251g().m60541h((DesignSystemModel) it.next()));
        }
        return new AbstractC36914g.c(cVar, textResourceM21278l, arrayList, response.getFooter(), c36908a, waitlistJoinModalState);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m125266c(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(new C13060l1(new C39287c(AbstractC36914g.b.f157951b), upstream, new b(null)));
    }
}

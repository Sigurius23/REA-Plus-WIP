package cs1;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import com.whoop.design.util.AbstractC8693b;
import ds1.C12340j;
import ds1.C12341k;
import ds1.C12342l;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.C13081r1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import od1.AbstractC27845h;
import or2.C28180m;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p337n8.C26444a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr1.AbstractC32913e;
import sr1.EnumC32914f;
import sr2.AbstractC32943y;
import tr2.InterfaceC34116n;
import ur1.C35191h;
import ur1.InterfaceC35190g;
import yr1.C39735f;

/* JADX INFO: renamed from: cs1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020 ¢\u0006\u0004\b&\u0010$J\u0015\u0010'\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020 ¢\u0006\u0004\b)\u0010$J\u001d\u0010*\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00100R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0013048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00105R&\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a08078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00109R&\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e0;078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001a0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001e0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001e0>8\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020H078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u00109R\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020H0>8\u0006¢\u0006\f\n\u0004\bK\u0010@\u001a\u0004\b,\u0010FR\u0017\u0010Q\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00100>8\u0006¢\u0006\f\n\u0004\bW\u0010@\u001a\u0004\bX\u0010F¨\u0006Z"}, m65681d2 = {"Lcs1/a;", "Landroidx/lifecycle/w1;", "Lsr2/y;", "urlProvider", "Lur1/h;", "journalDomainCombiner", "Lds1/l;", "viewStateReducer", "Lyr1/f;", "viewEventMapper", "Lcs1/b;", "config", "Lbc3/c0;", "coroutineScope", "<init>", "(Lsr2/y;Lur1/h;Lds1/l;Lyr1/f;Lcs1/b;Lbc3/c0;)V", "Lds1/k;", "t", "()Lds1/k;", "Lcs1/c;", "viewEvent", "Lur1/g;", "F", "(Lcs1/c;)Lur1/g;", "", "cycleId", "", "requestDate", "y", "(JLjava/lang/String;)Ljava/lang/String;", "", "value", "Ll83/a0;", "C", "(I)V", "A", "()V", "B", "r", "D", "(Lcs1/c;)V", "z", "E", "(JLjava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lds1/l;", "x", "Lyr1/f;", "Lcs1/b;", "Ltr2/n;", "Ltr2/n;", "logger", "Lec3/o1;", "Lec3/o1;", "eventFlow", "Lec3/p1;", "Ll83/k;", "Lec3/p1;", "currentEntry", "", "G", "scrollPositionsByEntry", "Lec3/f2;", "H", "Lec3/f2;", "currentScrollEntryKey", "I", "_savedScrollPosition", "J", "v", "()Lec3/f2;", "savedScrollPosition", "", "K", "_scrollToTopRequest", "L", "scrollToTopRequest", "M", "Ljava/lang/String;", "u", "()Ljava/lang/String;", "journalHelpShortLink", "Lec3/l;", "Lsr1/e;", "N", "Lec3/l;", "domainState", "O", "getViewState", "viewState", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11101a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13075p1 currentEntry;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13075p1 scrollPositionsByEntry;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13037f2 currentScrollEntryKey;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13037f2 _savedScrollPosition;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13037f2 savedScrollPosition;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC13075p1 _scrollToTopRequest;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC13037f2 scrollToTopRequest;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final String journalHelpShortLink;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C12342l viewStateReducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C39735f viewEventMapper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C11102b config;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: cs1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.viewmodel.JournalSurveyAnswerViewModel$_savedScrollPosition$1", m100430f = "JournalSurveyAnswerViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\n"}, m65681d2 = {"<anonymous>", "", "entryKey", "", "map", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f35216w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f35217x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f35218y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, Map<String, Integer> map, InterfaceC30057d<? super Integer> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f35217x = str;
            aVar.f35218y = map;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.f35217x;
            Map map = (Map) this.f35218y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f35216w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Integer num = (Integer) map.get(str);
            return new Integer(num != null ? num.intValue() : 0);
        }
    }

    /* JADX INFO: renamed from: cs1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.viewmodel.JournalSurveyAnswerViewModel$domainState$1", m100430f = "JournalSurveyAnswerViewModel.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB, 109}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcs1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f35219w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f35220x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C11101a.this.new b(interfaceC30057d);
            bVar.f35220x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
        
            if (r1.emit(r3, r18) == r2) goto L18;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = r0.f35220x
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f35219w
                r4 = 1
                r5 = 2
                if (r3 == 0) goto L23
                if (r3 == r4) goto L1f
                if (r3 != r5) goto L17
                p505ts.AbstractC34132o.m107864I(r19)
                goto L90
            L17:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L1f:
                p505ts.AbstractC34132o.m107864I(r19)
                goto L74
            L23:
                p505ts.AbstractC34132o.m107864I(r19)
                cs1.c$j r6 = new cs1.c$j
                cs1.a r3 = cs1.C11101a.this
                cs1.b r3 = cs1.C11101a.m29982j(r3)
                java.lang.String r7 = r3.getRequestDate()
                cs1.a r3 = cs1.C11101a.this
                cs1.b r3 = cs1.C11101a.m29982j(r3)
                long r8 = r3.getCycleId()
                cs1.a r3 = cs1.C11101a.this
                cs1.b r3 = cs1.C11101a.m29982j(r3)
                boolean r10 = r3.getIsAutoPop()
                cs1.a r3 = cs1.C11101a.this
                cs1.b r3 = cs1.C11101a.m29982j(r3)
                java.lang.String r3 = r3.getSource()
                if (r3 != 0) goto L54
                java.lang.String r3 = ""
            L54:
                r11 = r3
                cs1.a r3 = cs1.C11101a.this
                cs1.b r3 = cs1.C11101a.m29982j(r3)
                java.lang.String r12 = r3.getLabel()
                r16 = 224(0xe0, float:3.14E-43)
                r17 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17)
                r0.f35220x = r1
                r0.f35219w = r4
                java.lang.Object r3 = r1.emit(r6, r0)
                if (r3 != r2) goto L74
                goto L8f
            L74:
                cs1.c$i r3 = new cs1.c$i
                cs1.a r4 = cs1.C11101a.this
                cs1.b r4 = cs1.C11101a.m29982j(r4)
                java.lang.String r4 = r4.getRequestDate()
                r6 = 0
                r7 = 0
                r3.<init>(r4, r6, r5, r7)
                r0.f35220x = r7
                r0.f35219w = r5
                java.lang.Object r1 = r1.emit(r3, r0)
                if (r1 != r2) goto L90
            L8f:
                return r2
            L90:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: cs1.C11101a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cs1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.viewmodel.JournalSurveyAnswerViewModel$sendViewEvent$1", m100430f = "JournalSurveyAnswerViewModel.kt", m100431l = {133}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f35222w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC11103c f35224y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC11103c abstractC11103c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f35224y = abstractC11103c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11101a.this.new c(this.f35224y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f35222w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13072o1 interfaceC13072o1 = C11101a.this.eventFlow;
                    AbstractC11103c abstractC11103c = this.f35224y;
                    this.f35222w = 1;
                    if (interfaceC13072o1.emit(abstractC11103c, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Exception e5) {
                C11101a.this.logger.mo85230v(AbstractC11266d.m30461o("Failed to emit view event: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(this.f35224y.getClass()).getSimpleName()), e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cs1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f35225w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11101a f35226x;

        /* JADX INFO: renamed from: cs1.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f35227w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11101a f35228x;

            /* JADX INFO: renamed from: cs1.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.viewmodel.JournalSurveyAnswerViewModel$special$$inlined$map$1$2", m100430f = "JournalSurveyAnswerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41445a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f35229E;

                /* JADX INFO: renamed from: F */
                Object f35230F;

                /* JADX INFO: renamed from: G */
                Object f35231G;

                /* JADX INFO: renamed from: H */
                int f35232H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f35233w;

                /* JADX INFO: renamed from: x */
                int f35234x;

                /* JADX INFO: renamed from: y */
                Object f35235y;

                public C41445a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f35233w = obj;
                    this.f35234x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C11101a c11101a) {
                this.f35227w = interfaceC13062m;
                this.f35228x = c11101a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41445a c41445a;
                if (interfaceC30057d instanceof C41445a) {
                    c41445a = (C41445a) interfaceC30057d;
                    int i13 = c41445a.f35234x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41445a.f35234x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41445a = new C41445a(interfaceC30057d);
                    }
                } else {
                    c41445a = new C41445a(interfaceC30057d);
                }
                Object obj2 = c41445a.f35233w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41445a.f35234x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f35227w;
                    C23465k c23465k = (C23465k) obj;
                    String strM29989y = this.f35228x.m29989y(((Number) c23465k.f92937w).longValue(), (String) c23465k.f92938x);
                    c41445a.f35235y = null;
                    c41445a.f35229E = null;
                    c41445a.f35230F = null;
                    c41445a.f35231G = null;
                    c41445a.f35232H = 0;
                    c41445a.f35234x = 1;
                    if (interfaceC13062m.emit(strM29989y, c41445a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C11101a c11101a) {
            this.f35225w = interfaceC13058l;
            this.f35226x = c11101a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f35225w.collect(new a(interfaceC13062m, this.f35226x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cs1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f35237w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11101a f35238x;

        /* JADX INFO: renamed from: cs1.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f35239w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11101a f35240x;

            /* JADX INFO: renamed from: cs1.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.viewmodel.JournalSurveyAnswerViewModel$special$$inlined$map$2$2", m100430f = "JournalSurveyAnswerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41446a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f35241E;

                /* JADX INFO: renamed from: F */
                Object f35242F;

                /* JADX INFO: renamed from: G */
                Object f35243G;

                /* JADX INFO: renamed from: H */
                int f35244H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f35245w;

                /* JADX INFO: renamed from: x */
                int f35246x;

                /* JADX INFO: renamed from: y */
                Object f35247y;

                public C41446a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f35245w = obj;
                    this.f35246x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C11101a c11101a) {
                this.f35239w = interfaceC13062m;
                this.f35240x = c11101a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41446a c41446a;
                if (interfaceC30057d instanceof C41446a) {
                    c41446a = (C41446a) interfaceC30057d;
                    int i13 = c41446a.f35246x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41446a.f35246x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41446a = new C41446a(interfaceC30057d);
                    }
                } else {
                    c41446a = new C41446a(interfaceC30057d);
                }
                Object obj2 = c41446a.f35245w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41446a.f35246x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f35239w;
                    InterfaceC35190g interfaceC35190gM29980F = this.f35240x.m29980F((AbstractC11103c) obj);
                    c41446a.f35247y = null;
                    c41446a.f35241E = null;
                    c41446a.f35242F = null;
                    c41446a.f35243G = null;
                    c41446a.f35244H = 0;
                    c41446a.f35246x = 1;
                    if (interfaceC13062m.emit(interfaceC35190gM29980F, c41446a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C11101a c11101a) {
            this.f35237w = interfaceC13058l;
            this.f35238x = c11101a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f35237w.collect(new a(interfaceC13062m, this.f35238x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cs1.a$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f35249w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11101a f35250x;

        /* JADX INFO: renamed from: cs1.a$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f35251w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11101a f35252x;

            /* JADX INFO: renamed from: cs1.a$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.viewmodel.JournalSurveyAnswerViewModel$special$$inlined$map$3$2", m100430f = "JournalSurveyAnswerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41447a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f35253E;

                /* JADX INFO: renamed from: F */
                Object f35254F;

                /* JADX INFO: renamed from: G */
                Object f35255G;

                /* JADX INFO: renamed from: H */
                int f35256H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f35257w;

                /* JADX INFO: renamed from: x */
                int f35258x;

                /* JADX INFO: renamed from: y */
                Object f35259y;

                public C41447a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f35257w = obj;
                    this.f35258x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C11101a c11101a) {
                this.f35251w = interfaceC13062m;
                this.f35252x = c11101a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41447a c41447a;
                C12341k c12341kM29988t;
                if (interfaceC30057d instanceof C41447a) {
                    c41447a = (C41447a) interfaceC30057d;
                    int i13 = c41447a.f35258x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41447a.f35258x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41447a = new C41447a(interfaceC30057d);
                    }
                } else {
                    c41447a = new C41447a(interfaceC30057d);
                }
                Object obj2 = c41447a.f35257w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41447a.f35258x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f35251w;
                    try {
                        c12341kM29988t = this.f35252x.viewStateReducer.m34503s((AbstractC32913e) obj);
                    } catch (Exception e5) {
                        this.f35252x.logger.mo85230v("Failed to reduce domain state", e5, new AbstractC30556a.a[0]);
                        c12341kM29988t = this.f35252x.m29988t();
                    }
                    c41447a.f35259y = null;
                    c41447a.f35253E = null;
                    c41447a.f35254F = null;
                    c41447a.f35255G = null;
                    c41447a.f35256H = 0;
                    c41447a.f35258x = 1;
                    if (interfaceC13062m.emit(c12341kM29988t, c41447a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C11101a c11101a) {
            this.f35249w = interfaceC13058l;
            this.f35250x = c11101a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f35249w.collect(new a(interfaceC13062m, this.f35250x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11101a(AbstractC32943y urlProvider, C35191h journalDomainCombiner, C12342l viewStateReducer, C39735f viewEventMapper, C11102b config, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(journalDomainCombiner, "journalDomainCombiner");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(viewEventMapper, "viewEventMapper");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.viewStateReducer = viewStateReducer;
        this.viewEventMapper = viewEventMapper;
        this.config = config;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("JournalSurveyAnswerViewModel");
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C23465k(Long.valueOf(config.getCycleId()), config.getRequestDate()));
        this.currentEntry = c13045h2M36593c;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(C25272z.f99163w);
        this.scrollPositionsByEntry = c13045h2M36593c2;
        d dVar = new d(c13045h2M36593c, this);
        C26444a c26444aM5043b = AbstractC1640x1.m5043b(this);
        String strM29989y = m29989y(config.getCycleId(), config.getRequestDate());
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13081r1 c13081r1M36587M = AbstractC13091v.m36587M(dVar, c26444aM5043b, c13021b2, strM29989y);
        this.currentScrollEntryKey = c13081r1M36587M;
        C13081r1 c13081r1M36587M2 = AbstractC13091v.m36587M(AbstractC13091v.m36610t(new C13060l1(c13081r1M36587M, c13045h2M36593c2, new a(null), 1)), AbstractC1640x1.m5043b(this), c13021b2, 0);
        this._savedScrollPosition = c13081r1M36587M2;
        this.savedScrollPosition = c13081r1M36587M2;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(Boolean.FALSE);
        this._scrollToTopRequest = c13045h2M36593c3;
        this.scrollToTopRequest = c13045h2M36593c3;
        this.journalHelpShortLink = AbstractC2875y.m8299l(urlProvider.getApiBaseUrl(), "/url-mapping-service/v1/JOURNAL_OVERVIEW");
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new C4588i(new e(new C13015a0(new b(null), c13096w1M36592b), this), 2), journalDomainCombiner);
        this.domainState = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36587M(new f(interfaceC13058lM83945a, this), AbstractC1640x1.m5043b(this), C13105z1.m36630a(2, 5000L), new C12341k(true, null, false, false, false, null, 62, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final InterfaceC35190g m29980F(AbstractC11103c viewEvent) {
        return this.viewEventMapper.m127147a(viewEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final C12341k m29988t() {
        return new C12341k(false, new C12340j(AbstractC8693b.m21278l("Something went wrong"), EnumC32914f.COULD_NOT_LOAD_ENTRIES), false, false, false, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final String m29989y(long cycleId, String requestDate) {
        return cycleId + ":" + requestDate;
    }

    /* JADX INFO: renamed from: A */
    public final void m29990A() {
        InterfaceC13075p1 interfaceC13075p1 = this._scrollToTopRequest;
        Boolean bool = Boolean.TRUE;
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
    }

    /* JADX INFO: renamed from: B */
    public final void m29991B() {
        m29992C(0);
        m29990A();
    }

    /* JADX INFO: renamed from: C */
    public final void m29992C(int value) {
        C13045h2 c13045h2;
        Object value2;
        String str = (String) this.currentScrollEntryKey.getValue();
        InterfaceC13075p1 interfaceC13075p1 = this.scrollPositionsByEntry;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value2 = c13045h2.getValue();
        } while (!c13045h2.m36569i(value2, AbstractC25247g0.m73996e0((Map) value2, new C23465k(str, Integer.valueOf(value)))));
    }

    /* JADX INFO: renamed from: D */
    public final void m29993D(AbstractC11103c viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(viewEvent, null), 3);
    }

    /* JADX INFO: renamed from: E */
    public final void m29994E(long cycleId, String requestDate) {
        AbstractC22676k.m65750j(requestDate, "requestDate");
        InterfaceC13075p1 interfaceC13075p1 = this.currentEntry;
        C23465k c23465k = new C23465k(Long.valueOf(cycleId), requestDate);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, c23465k);
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: r */
    public final void m29995r() {
        InterfaceC13075p1 interfaceC13075p1 = this._scrollToTopRequest;
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getJournalHelpShortLink() {
        return this.journalHelpShortLink;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final InterfaceC13037f2 getSavedScrollPosition() {
        return this.savedScrollPosition;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final InterfaceC13037f2 getScrollToTopRequest() {
        return this.scrollToTopRequest;
    }

    /* JADX INFO: renamed from: z */
    public final void m29999z() {
        this.logger.mo85219j("calling RefreshQuestionsV2", new AbstractC30556a.a[0]);
        C23465k c23465k = (C23465k) ((C13045h2) this.currentEntry).getValue();
        m29993D(new AbstractC11103c.j((String) c23465k.f92938x, ((Number) c23465k.f92937w).longValue(), false, "AI Coach", null, false, false, null, 244, null));
    }

    public /* synthetic */ C11101a(AbstractC32943y abstractC32943y, C35191h c35191h, C12342l c12342l, C39735f c39735f, C11102b c11102b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC32943y, c35191h, c12342l, c39735f, c11102b, (i13 & 32) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

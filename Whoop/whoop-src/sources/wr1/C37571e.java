package wr1;

import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerApi;
import com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: wr1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lwr1/e;", "Lod1/g;", "Lwr1/b;", "Lwr1/c;", "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerApi;", "api", "Ltr2/n;", "logger", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerApi;Ltr2/n;Lzr2/a;)V", "", HttpHeaders.DATE, "Lec3/l;", "g", "(Ltr2/n;Ljava/lang/String;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lwr1/d;", "domainState", "selectedDate", "currentDate", "", "hasUserEditJournal", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lwr1/d;Ljava/lang/String;Ljava/lang/String;Z)Lwr1/c;", "a", "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerApi;", "b", "Ltr2/n;", "c", "Lzr2/a;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37571e implements InterfaceC27844g<AbstractC37568b, C37569c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final JournalDatePickerApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: wr1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.datepicker.JournalDatePickerInteractor$fetchDatePicker$1", m100430f = "JournalDatePickerInteractor.kt", m100431l = {35, 40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lwr1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC34116n f160661E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f160662F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C37571e f160663G;

        /* JADX INFO: renamed from: w */
        Object f160664w;

        /* JADX INFO: renamed from: x */
        int f160665x;

        /* JADX INFO: renamed from: y */
        int f160666y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f160667z;

        /* JADX INFO: renamed from: wr1.e$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.datepicker.JournalDatePickerInteractor$fetchDatePicker$1$1", m100430f = "JournalDatePickerInteractor.kt", m100431l = {37, 38}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42601a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C37571e f160668E;

            /* JADX INFO: renamed from: w */
            Object f160669w;

            /* JADX INFO: renamed from: x */
            int f160670x;

            /* JADX INFO: renamed from: y */
            int f160671y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f160672z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42601a(String str, C37571e c37571e, InterfaceC30057d<? super C42601a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f160672z = str;
                this.f160668E = c37571e;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42601a(this.f160672z, this.f160668E, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
            
                if (r7 == r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
            
                if (r7 == r0) goto L21;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r6.f160671y
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L21
                    if (r1 == r4) goto L19
                    if (r1 != r3) goto L11
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L66
                L11:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L19:
                    java.lang.Object r1 = r6.f160669w
                    java.lang.String r1 = (java.lang.String) r1
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L3c
                L21:
                    p505ts.AbstractC34132o.m107864I(r7)
                    java.lang.String r7 = r6.f160672z
                    if (r7 == 0) goto L42
                    wr1.e r1 = r6.f160668E
                    com.whoop.journal.interactors.v2.datepicker.JournalDatePickerApi r1 = wr1.C37571e.m120604d(r1)
                    r6.f160669w = r2
                    r5 = 0
                    r6.f160670x = r5
                    r6.f160671y = r4
                    java.lang.Object r7 = r1.getJournalDatePicker(r7, r6)
                    if (r7 != r0) goto L3c
                    goto L65
                L3c:
                    com.whoop.journal.interactors.v2.datepicker.JournalDatePickerResponse r7 = (com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerResponse) r7
                    if (r7 != 0) goto L41
                    goto L42
                L41:
                    return r7
                L42:
                    wr1.e r7 = r6.f160668E
                    com.whoop.journal.interactors.v2.datepicker.JournalDatePickerApi r7 = wr1.C37571e.m120604d(r7)
                    wr1.e r1 = r6.f160668E
                    zr2.a r1 = wr1.C37571e.m120605e(r1)
                    org.joda.time.LocalDate r1 = r1.mo133365d()
                    java.lang.String r1 = r1.toString()
                    java.lang.String r4 = "toString(...)"
                    p715kotlin.jvm.internal.AbstractC22676k.m65749i(r1, r4)
                    r6.f160669w = r2
                    r6.f160671y = r3
                    java.lang.Object r7 = r7.getJournalDatePicker(r1, r6)
                    if (r7 != r0) goto L66
                L65:
                    return r0
                L66:
                    com.whoop.journal.interactors.v2.datepicker.JournalDatePickerResponse r7 = (com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerResponse) r7
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: wr1.C37571e.a.C42601a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super JournalDatePickerResponse> interfaceC30057d) {
                return ((C42601a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC34116n interfaceC34116n, String str, C37571e c37571e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160661E = interfaceC34116n;
            this.f160662F = str;
            this.f160663G = c37571e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f160661E, this.f160662F, this.f160663G, interfaceC30057d);
            aVar.f160667z = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
        
            if (r8.emit(r0, r19) == r9) goto L32;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r5 = r19
                java.lang.Object r0 = r5.f160667z
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r5.f160666y
                r10 = 2
                r1 = 1
                r11 = 0
                if (r0 == 0) goto L2b
                if (r0 == r1) goto L25
                if (r0 != r10) goto L1d
                java.lang.Object r0 = r5.f160664w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r20)
                goto Lbf
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                p505ts.AbstractC34132o.m107864I(r20)
                r0 = r20
                goto L4d
            L2b:
                p505ts.AbstractC34132o.m107864I(r20)
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                tr2.n r2 = r5.f160661E
                wr1.e$a$a r4 = new wr1.e$a$a
                java.lang.String r3 = r5.f160662F
                wr1.e r6 = r5.f160663G
                r4.<init>(r3, r6, r11)
                r5.f160667z = r8
                r5.f160666y = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "Failed to fetch date picker"
                r6 = 2
                r7 = 0
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L4d
                goto Lbe
            L4d:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.b
                if (r1 == 0) goto L5b
                wr1.c r0 = new wr1.c
                wr1.d$a r1 = wr1.AbstractC37570d.a.f160655a
                r0.<init>(r1)
                goto Laf
            L5b:
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto Lc2
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r1 = r0.m108735a()
                r13 = r1
                com.whoop.journal.interactors.v2.datepicker.JournalDatePickerResponse r13 = (com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerResponse) r13
                java.lang.Object r0 = r0.m108735a()
                com.whoop.journal.interactors.v2.datepicker.JournalDatePickerResponse r0 = (com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerResponse) r0
                java.util.List r0 = r0.getItems()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L78:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L8c
                java.lang.Object r1 = r0.next()
                r2 = r1
                com.whoop.journal.interactors.v2.datepicker.JournalDatePickerEntry r2 = (com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerEntry) r2
                boolean r2 = r2.isSelected()
                if (r2 == 0) goto L78
                goto L8d
            L8c:
                r1 = r11
            L8d:
                com.whoop.journal.interactors.v2.datepicker.JournalDatePickerEntry r1 = (com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerEntry) r1
                if (r1 == 0) goto L97
                java.lang.String r0 = r1.getDate()
                r14 = r0
                goto L98
            L97:
                r14 = r11
            L98:
                wr1.a r12 = new wr1.a
                r16 = 0
                r15 = 0
                r17 = 4
                r18 = 0
                r12.<init>(r13, r14, r15, r16, r17, r18)
                wr1.d$c r0 = new wr1.d$c
                r0.<init>(r12)
                wr1.c r1 = new wr1.c
                r1.<init>(r0)
                r0 = r1
            Laf:
                r5.f160667z = r11
                r5.f160664w = r11
                r1 = 0
                r5.f160665x = r1
                r5.f160666y = r10
                java.lang.Object r0 = r8.emit(r0, r5)
                if (r0 != r9) goto Lbf
            Lbe:
                return r9
            Lbf:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            Lc2:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wr1.C37571e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: wr1.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.datepicker.JournalDatePickerInteractor$interact$1", m100430f = "JournalDatePickerInteractor.kt", m100431l = {21}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lwr1/c;", "previousState", "Lwr1/b;", "action", "<anonymous>", "(Lwr1/c;Lwr1/b;)Lwr1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f160673w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f160674x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f160675y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C37569c c37569c, AbstractC37568b abstractC37568b, InterfaceC30057d<? super C37569c> interfaceC30057d) {
            b bVar = C37571e.this.new b(interfaceC30057d);
            bVar.f160674x = c37569c;
            bVar.f160675y = abstractC37568b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C37569c c37569c = (C37569c) this.f160674x;
            AbstractC37568b abstractC37568b = (AbstractC37568b) this.f160675y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160673w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(abstractC37568b instanceof AbstractC37568b.a)) {
                    if (!(abstractC37568b instanceof AbstractC37568b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC37568b.b bVar = (AbstractC37568b.b) abstractC37568b;
                    return C37571e.this.m120608h(c37569c.getResult(), bVar.getSelectedDate(), bVar.getCurrentDate(), bVar.getHasUserEditJournal());
                }
                C37571e c37571e = C37571e.this;
                InterfaceC13058l interfaceC13058lM120607g = c37571e.m120607g(c37571e.logger, ((AbstractC37568b.a) abstractC37568b).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
                this.f160674x = null;
                this.f160675y = null;
                this.f160673w = 1;
                obj = AbstractC13091v.m36577C(interfaceC13058lM120607g, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C37569c c37569c2 = (C37569c) obj;
            return c37569c2 == null ? new C37569c(AbstractC37570d.a.f160655a) : c37569c2;
        }
    }

    public C37571e(JournalDatePickerApi api, InterfaceC34116n logger, InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.api = api;
        this.logger = logger;
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m120607g(InterfaceC34116n logger, String date) {
        return new C13084s1(new a(logger, date, this, null));
    }

    /* JADX INFO: renamed from: h */
    public final C37569c m120608h(AbstractC37570d domainState, String selectedDate, String currentDate, boolean hasUserEditJournal) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        AbstractC37570d cVar = AbstractC37570d.a.f160655a;
        if (!domainState.equals(cVar)) {
            cVar = AbstractC37570d.b.f160656a;
            if (!domainState.equals(cVar)) {
                if (!(domainState instanceof AbstractC37570d.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new AbstractC37570d.c(C37567a.m120591b(((AbstractC37570d.c) domainState).getAccumulator(), null, selectedDate, null, true, 5, null));
            }
        }
        return new C37569c(cVar);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C37569c(AbstractC37570d.b.f160656a), upstream, new b(null));
    }
}

package xq2;

import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p329n0.C26068u;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: xq2.f0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JP\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R+\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR/\u0010&\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010 8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010)\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u0018\u0010+\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010*R/\u0010/\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b!\u0010,\"\u0004\b-\u0010.¨\u00060"}, m65681d2 = {"Lxq2/f0;", "", "Ln0/u;", "listState", "<init>", "(Ln0/u;)V", "", "index", "itemWidthPx", "", "animated", "Lkotlin/Function0;", "Ll83/a0;", "onDone", "isNavigation", "Lbc3/c0;", "scope", "g", "(IIZLc93/a;ZLbc3/c0;Lq83/d;)Ljava/lang/Object;", "a", "Ln0/u;", "Lmc3/a;", "b", "Lmc3/a;", "scrollMutex", "<set-?>", "c", "Lp1/c1;", "()Z", "i", "(Z)V", "animating", "Lbc3/k1;", "d", "e", "()Lbc3/k1;", "l", "(Lbc3/k1;)V", "snapJob", "f", "k", "isNavigating", "Lbc3/k1;", "navigationClearJob", "()Ljava/lang/Integer;", "j", "(Ljava/lang/Integer;)V", "lastSnappedIndex", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C38562f0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C26068u listState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25435a scrollMutex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28601c1 animating;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC28601c1 snapJob;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC28601c1 isNavigating;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC3027k1 navigationClearJob;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC28601c1 lastSnappedIndex;

    /* JADX INFO: renamed from: xq2.f0$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.TimelineScrollController", m100430f = "YearInReviewTimeline.kt", m100431l = {575, 297, 302}, m100432m = "scrollToIndex", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f165965E;

        /* JADX INFO: renamed from: F */
        boolean f165966F;

        /* JADX INFO: renamed from: G */
        Object f165967G;

        /* JADX INFO: renamed from: H */
        Object f165968H;

        /* JADX INFO: renamed from: I */
        Object f165969I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f165970J;

        /* JADX INFO: renamed from: L */
        int f165972L;

        /* JADX INFO: renamed from: w */
        int f165973w;

        /* JADX INFO: renamed from: x */
        int f165974x;

        /* JADX INFO: renamed from: y */
        int f165975y;

        /* JADX INFO: renamed from: z */
        int f165976z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f165970J = obj;
            this.f165972L |= Integer.MIN_VALUE;
            return C38562f0.this.m123638g(0, 0, false, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: xq2.f0$b */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.TimelineScrollController$scrollToIndex$2$2", m100430f = "YearInReviewTimeline.kt", m100431l = {316}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f165977w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C38562f0.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f165977w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f165977w = 1;
                if (AbstractC3034m0.m8782b(50L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C38562f0.this.m123633k(false);
            C38562f0.this.m123632j(null);
            return C23454a0.f92919a;
        }
    }

    public C38562f0(C26068u listState) {
        AbstractC22676k.m65750j(listState, "listState");
        this.listState = listState;
        this.scrollMutex = AbstractC25438d.m74669a();
        Boolean bool = Boolean.FALSE;
        this.animating = AbstractC28683x.m87272z(bool);
        this.snapJob = AbstractC28683x.m87272z(null);
        this.isNavigating = AbstractC28683x.m87272z(bool);
        this.lastSnappedIndex = AbstractC28683x.m87272z(null);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m123630h(C38562f0 c38562f0, int i13, int i14, boolean z4, InterfaceC4339a interfaceC4339a, boolean z13, InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d interfaceC30057d, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            interfaceC4339a = null;
        }
        if ((i15 & 16) != 0) {
            z13 = false;
        }
        if ((i15 & 32) != 0) {
            interfaceC2994c0 = null;
        }
        return c38562f0.m123638g(i13, i14, z4, interfaceC4339a, z13, interfaceC2994c0, interfaceC30057d);
    }

    /* JADX INFO: renamed from: i */
    private final void m123631i(boolean z4) {
        this.animating.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m123632j(Integer num) {
        this.lastSnappedIndex.setValue(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m123633k(boolean z4) {
        this.isNavigating.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m123634c() {
        return ((Boolean) this.animating.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final Integer m123635d() {
        return (Integer) this.lastSnappedIndex.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC3027k1 m123636e() {
        return (InterfaceC3027k1) this.snapJob.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m123637f() {
        return ((Boolean) this.isNavigating.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0120 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:46:0x011b, B:48:0x0120, B:50:0x0125, B:53:0x0131, B:55:0x0141, B:26:0x00b0, B:28:0x00b5, B:30:0x00bc), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0125 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:46:0x011b, B:48:0x0120, B:50:0x0125, B:53:0x0131, B:55:0x0141, B:26:0x00b0, B:28:0x00b5, B:30:0x00bc), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0141 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:46:0x011b, B:48:0x0120, B:50:0x0125, B:53:0x0131, B:55:0x0141, B:26:0x00b0, B:28:0x00b5, B:30:0x00bc), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x014d A[Catch: all -> 0x0151, TryCatch #1 {all -> 0x0151, blocks: (B:57:0x0148, B:59:0x014d, B:63:0x0156, B:67:0x0163, B:70:0x0178, B:69:0x0172, B:71:0x0179, B:73:0x017e, B:75:0x0183, B:78:0x018f, B:80:0x019e), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0156 A[Catch: all -> 0x0151, TryCatch #1 {all -> 0x0151, blocks: (B:57:0x0148, B:59:0x014d, B:63:0x0156, B:67:0x0163, B:70:0x0178, B:69:0x0172, B:71:0x0179, B:73:0x017e, B:75:0x0183, B:78:0x018f, B:80:0x019e), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0172 A[Catch: all -> 0x0151, TryCatch #1 {all -> 0x0151, blocks: (B:57:0x0148, B:59:0x014d, B:63:0x0156, B:67:0x0163, B:70:0x0178, B:69:0x0172, B:71:0x0179, B:73:0x017e, B:75:0x0183, B:78:0x018f, B:80:0x019e), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x017e A[Catch: all -> 0x0151, TryCatch #1 {all -> 0x0151, blocks: (B:57:0x0148, B:59:0x014d, B:63:0x0156, B:67:0x0163, B:70:0x0178, B:69:0x0172, B:71:0x0179, B:73:0x017e, B:75:0x0183, B:78:0x018f, B:80:0x019e), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0183 A[Catch: all -> 0x0151, TryCatch #1 {all -> 0x0151, blocks: (B:57:0x0148, B:59:0x014d, B:63:0x0156, B:67:0x0163, B:70:0x0178, B:69:0x0172, B:71:0x0179, B:73:0x017e, B:75:0x0183, B:78:0x018f, B:80:0x019e), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x019e A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #1 {all -> 0x0151, blocks: (B:57:0x0148, B:59:0x014d, B:63:0x0156, B:67:0x0163, B:70:0x0178, B:69:0x0172, B:71:0x0179, B:73:0x017e, B:75:0x0183, B:78:0x018f, B:80:0x019e), top: B:88:0x0027 }] */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0118, code lost:
    
        if (r16.listState.m77567j(r10, -(r11 / 2), r2) == r3) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r2v10, types: [c93.a] */
    /* JADX WARN: Type inference failed for: r2v12, types: [c93.a] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [c93.a] */
    /* JADX WARN: Type inference failed for: r4v10, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m123638g(int r17, int r18, boolean r19, c93.InterfaceC4339a r20, boolean r21, bc3.InterfaceC2994c0 r22, q83.InterfaceC30057d<? super l83.C23454a0> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xq2.C38562f0.m123638g(int, int, boolean, c93.a, boolean, bc3.c0, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: l */
    public final void m123639l(InterfaceC3027k1 interfaceC3027k1) {
        this.snapJob.setValue(interfaceC3027k1);
    }
}

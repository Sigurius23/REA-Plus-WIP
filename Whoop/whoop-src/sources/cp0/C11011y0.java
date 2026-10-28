package cp0;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import po0.AbstractC29398b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: cp0.y0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b!\b\u0001\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0018J\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\"\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010*R\u0018\u00103\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m65681d2 = {"Lcp0/y0;", "", "Lbc3/c0;", "scope", "", "isEducationTypeDayZero", "Lkotlin/Function0;", "", "screenHeightPx", "Lcp0/u1;", "sheetState", "heroProgress", "targetHeight", "Lkotlin/Function1;", "Ll83/a0;", "onHeroProgressChanged", "onTargetHeightChanged", "onSheetStateChanged", "onIsDraggingChanged", "", "onDismiss", "<init>", "(Lbc3/c0;ZLc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "k", "()V", "dragAmountY", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(F)V", "j", "i", "a", "Lbc3/c0;", "b", "Z", "c", "Lc93/a;", "d", "e", "f", "g", "Lkotlin/jvm/functions/Function1;", "l", "F", "totalDragAmount", "m", "Ljava/lang/Float;", "heightAtDragStart", "n", "heroAtDragStart", "o", "Lcp0/u1;", "sheetStateAtDragStart", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11011y0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isEducationTypeDayZero;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC4339a screenHeightPx;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4339a sheetState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC4339a heroProgress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC4339a targetHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1 onHeroProgressChanged;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Function1 onTargetHeightChanged;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Function1 onSheetStateChanged;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Function1 onIsDraggingChanged;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Function1 onDismiss;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float totalDragAmount;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private Float heightAtDragStart;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float heroAtDragStart;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private EnumC11003u1 sheetStateAtDragStart;

    /* JADX INFO: renamed from: cp0.y0$a */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachSheetMorphDragHandler$onDragEnd$1", m100430f = "MorphCoachEverywhereBottomSheet.kt", m100431l = {345}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f34470w;

        /* JADX INFO: renamed from: x */
        int f34471x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC11003u1 f34472y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C11011y0 f34473z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC11003u1 enumC11003u1, C11011y0 c11011y0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34472y = enumC11003u1;
            this.f34473z = c11011y0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f34472y, this.f34473z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34471x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC10991q1 abstractC10991q1M29270v = AbstractC10979m1.m29270v(new C10994r1(this.f34472y, this.f34473z.totalDragAmount, ((Number) this.f34473z.screenHeightPx.invoke()).floatValue(), this.f34473z.isEducationTypeDayZero));
                if (abstractC10991q1M29270v instanceof AbstractC10991q1.a) {
                    AbstractC10991q1.a aVar = (AbstractC10991q1.a) abstractC10991q1M29270v;
                    this.f34473z.onSheetStateChanged.invoke(aVar.getNewSheetState());
                    this.f34473z.onTargetHeightChanged.invoke(new Float(aVar.getNewTargetHeight()));
                    this.f34473z.onHeroProgressChanged.invoke(new Float(aVar.getNewHeroProgress()));
                    if (aVar.getShouldDismiss()) {
                        this.f34470w = null;
                        this.f34471x = 1;
                        if (AbstractC3034m0.m8782b(300L, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (!(abstractC10991q1M29270v instanceof AbstractC10991q1.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC10991q1.b bVar = (AbstractC10991q1.b) abstractC10991q1M29270v;
                    this.f34473z.onTargetHeightChanged.invoke(new Float(bVar.getTargetHeight()));
                    this.f34473z.onHeroProgressChanged.invoke(new Float(bVar.getHeroProgress()));
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f34473z.onDismiss.invoke(AbstractC29398b.m89576a(this.f34472y));
            return C23454a0.f92919a;
        }
    }

    public C11011y0(InterfaceC2994c0 scope, boolean z4, InterfaceC4339a screenHeightPx, InterfaceC4339a sheetState, InterfaceC4339a heroProgress, InterfaceC4339a targetHeight, Function1 onHeroProgressChanged, Function1 onTargetHeightChanged, Function1 onSheetStateChanged, Function1 onIsDraggingChanged, Function1 onDismiss) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(screenHeightPx, "screenHeightPx");
        AbstractC22676k.m65750j(sheetState, "sheetState");
        AbstractC22676k.m65750j(heroProgress, "heroProgress");
        AbstractC22676k.m65750j(targetHeight, "targetHeight");
        AbstractC22676k.m65750j(onHeroProgressChanged, "onHeroProgressChanged");
        AbstractC22676k.m65750j(onTargetHeightChanged, "onTargetHeightChanged");
        AbstractC22676k.m65750j(onSheetStateChanged, "onSheetStateChanged");
        AbstractC22676k.m65750j(onIsDraggingChanged, "onIsDraggingChanged");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        this.scope = scope;
        this.isEducationTypeDayZero = z4;
        this.screenHeightPx = screenHeightPx;
        this.sheetState = sheetState;
        this.heroProgress = heroProgress;
        this.targetHeight = targetHeight;
        this.onHeroProgressChanged = onHeroProgressChanged;
        this.onTargetHeightChanged = onTargetHeightChanged;
        this.onSheetStateChanged = onSheetStateChanged;
        this.onIsDraggingChanged = onIsDraggingChanged;
        this.onDismiss = onDismiss;
        this.heroAtDragStart = 1.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m29557h(float dragAmountY) {
        float fFloatValue = ((Number) this.screenHeightPx.invoke()).floatValue();
        if (fFloatValue <= 0.0f) {
            return;
        }
        this.totalDragAmount += dragAmountY;
        C11000t1 c11000t1M29271w = AbstractC10979m1.m29271w(new C10997s1(((Number) this.heroProgress.invoke()).floatValue(), ((Number) this.targetHeight.invoke()).floatValue(), (EnumC11003u1) this.sheetState.invoke(), this.isEducationTypeDayZero), (-dragAmountY) / fFloatValue, dragAmountY > 0.0f);
        this.onHeroProgressChanged.invoke(Float.valueOf(c11000t1M29271w.getNewHeroProgress()));
        this.onTargetHeightChanged.invoke(Float.valueOf(c11000t1M29271w.getNewTargetHeight()));
    }

    /* JADX INFO: renamed from: i */
    public final void m29558i() {
        Float f13 = this.heightAtDragStart;
        if (f13 != null) {
            EnumC11003u1 enumC11003u1 = this.sheetStateAtDragStart;
            this.heightAtDragStart = null;
            this.sheetStateAtDragStart = null;
            this.totalDragAmount = 0.0f;
            this.onIsDraggingChanged.invoke(Boolean.FALSE);
            if (enumC11003u1 != this.sheetState.invoke()) {
                return;
            }
            this.onTargetHeightChanged.invoke(f13);
            this.onHeroProgressChanged.invoke(Float.valueOf(this.heroAtDragStart));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m29559j() {
        this.onIsDraggingChanged.invoke(Boolean.FALSE);
        this.heightAtDragStart = null;
        this.sheetStateAtDragStart = null;
        AbstractC3006f0.m8732z(this.scope, null, null, new a((EnumC11003u1) this.sheetState.invoke(), this, null), 3);
    }

    /* JADX INFO: renamed from: k */
    public final void m29560k() {
        this.totalDragAmount = 0.0f;
        this.heightAtDragStart = (Float) this.targetHeight.invoke();
        this.heroAtDragStart = ((Number) this.heroProgress.invoke()).floatValue();
        this.sheetStateAtDragStart = (EnumC11003u1) this.sheetState.invoke();
        this.onIsDraggingChanged.invoke(Boolean.TRUE);
    }
}

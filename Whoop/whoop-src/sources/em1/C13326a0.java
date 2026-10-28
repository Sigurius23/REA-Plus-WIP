package em1;

import a13.C0148f;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import fn2.EnumC14650j;
import fn2.InterfaceC14643c;
import fn2.InterfaceC14652l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: em1.a0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lem1/a0;", "Landroidx/lifecycle/w1;", "Lfn2/c;", "orientationLockChecker", "<init>", "(Lfn2/c;)V", "Lkotlin/Function0;", "", "check", "Ll83/a0;", "v", "(Lc93/a;)V", "Lfn2/l;", "monitor", "o", "(Lfn2/l;)V", "", "newOrientation", "t", "(I)V", "u", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "q", "Lfn2/c;", "Lec3/p1;", "x", "Lec3/p1;", "_visible", "Lec3/f2;", "y", "Lec3/f2;", "p", "()Lec3/f2;", "visible", "Lbc3/k1;", "z", "Lbc3/k1;", "hideJob", "E", "Ljava/lang/Integer;", "lastConfigurationOrientation", "F", "rotationObserverJob", "G", "Lc93/a;", "isTiltGraphVisible", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13326a0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private Integer lastConfigurationOrientation;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private InterfaceC3027k1 rotationObserverJob;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private InterfaceC4339a isTiltGraphVisible;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC14643c orientationLockChecker;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13075p1 _visible;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13037f2 visible;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private InterfaceC3027k1 hideJob;

    /* JADX INFO: renamed from: em1.a0$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.TiltEntryButtonViewModel$bindRotationMonitor$1", m100430f = "TiltEntryButtonViewModel.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46180w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC14652l f46181x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13326a0 f46182y;

        /* JADX INFO: renamed from: em1.a0$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41535a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C13326a0 f46183w;

            public C41535a(C13326a0 c13326a0) {
                this.f46183w = c13326a0;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC14650j enumC14650j, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (this.f46183w.orientationLockChecker.mo41843a() && !((Boolean) this.f46183w.isTiltGraphVisible.invoke()).booleanValue()) {
                    this.f46183w.m37457w();
                } else {
                    this.f46183w.m37453q();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14652l interfaceC14652l, C13326a0 c13326a0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f46181x = interfaceC14652l;
            this.f46182y = c13326a0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f46181x, this.f46182y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46180w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36599i = AbstractC13091v.m36599i(this.f46181x.mo41857a(), -1, 2);
                C41535a c41535a = new C41535a(this.f46182y);
                this.f46180w = 1;
                if (interfaceC13058lM36599i.collect(c41535a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.a0$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.TiltEntryButtonViewModel$showTemporarily$1", m100430f = "TiltEntryButtonViewModel.kt", m100431l = {77}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46184w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13326a0.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46184w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f46184w = 1;
                if (AbstractC3034m0.m8782b(5000L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC13075p1 interfaceC13075p1 = C13326a0.this._visible;
            Boolean bool = Boolean.FALSE;
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, bool);
            return C23454a0.f92919a;
        }
    }

    public C13326a0(InterfaceC14643c orientationLockChecker) {
        AbstractC22676k.m65750j(orientationLockChecker, "orientationLockChecker");
        this.orientationLockChecker = orientationLockChecker;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this._visible = c13045h2M36593c;
        this.visible = AbstractC13091v.m36598h(c13045h2M36593c);
        this.isTiltGraphVisible = new C0148f(28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final boolean m37450r() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m37451o(InterfaceC14652l monitor) {
        AbstractC22676k.m65750j(monitor, "monitor");
        InterfaceC3027k1 interfaceC3027k1 = this.rotationObserverJob;
        if (interfaceC3027k1 == null || !interfaceC3027k1.isActive()) {
            this.rotationObserverJob = AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(monitor, this, null), 3);
        }
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC13037f2 getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: q */
    public final void m37453q() {
        InterfaceC3027k1 interfaceC3027k1 = this.hideJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.hideJob = null;
        InterfaceC13075p1 interfaceC13075p1 = this._visible;
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
    }

    /* JADX INFO: renamed from: t */
    public final void m37454t(int newOrientation) {
        Integer num = this.lastConfigurationOrientation;
        this.lastConfigurationOrientation = Integer.valueOf(newOrientation);
        if (!this.orientationLockChecker.mo41843a()) {
            m37453q();
        } else {
            if (num == null || num.intValue() == newOrientation || ((Boolean) this.isTiltGraphVisible.invoke()).booleanValue()) {
                return;
            }
            m37457w();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m37455u() {
        InterfaceC3027k1 interfaceC3027k1 = this.hideJob;
        if (interfaceC3027k1 == null || !interfaceC3027k1.isActive()) {
            return;
        }
        InterfaceC13075p1 interfaceC13075p1 = this._visible;
        Boolean bool = Boolean.TRUE;
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
    }

    /* JADX INFO: renamed from: v */
    public final void m37456v(InterfaceC4339a check) {
        AbstractC22676k.m65750j(check, "check");
        this.isTiltGraphVisible = check;
    }

    /* JADX INFO: renamed from: w */
    public final void m37457w() {
        InterfaceC3027k1 interfaceC3027k1 = this.hideJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._visible;
        Boolean bool = Boolean.TRUE;
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
        this.hideJob = AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
    }
}

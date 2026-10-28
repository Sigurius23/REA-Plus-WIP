package fn2;

import android.content.Context;
import android.view.OrientationEventListener;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: fn2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lfn2/i;", "Lfn2/l;", "Landroid/content/Context;", "context", "Lfn2/g;", "orientationHelper", "Lfn2/c;", "orientationLockChecker", "<init>", "(Landroid/content/Context;Lfn2/g;Lfn2/c;)V", "Lec3/l;", "Lfn2/j;", "a", "()Lec3/l;", "Ll83/a0;", "b", "()V", "Landroid/content/Context;", "Lfn2/g;", "c", "Lfn2/c;", "Lfn2/k;", "d", "Lfn2/k;", "tracker", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14649i implements InterfaceC14652l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14647g orientationHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14643c orientationLockChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private volatile C14651k tracker;

    /* JADX INFO: renamed from: fn2.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.ui.orientationutil.SystemTiltEntryRotationMonitor$orientationTransitions$1", m100430f = "TiltEntryRotationMonitor.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Lfn2/j;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f54075w;

        /* JADX INFO: renamed from: x */
        int f54076x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f54077y;

        /* JADX INFO: renamed from: fn2.i$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"fn2/i$a$a", "Landroid/view/OrientationEventListener;", "", "orientation", "Ll83/a0;", "onOrientationChanged", "(I)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41599a extends OrientationEventListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C14649i f54079a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC11936u f54080b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41599a(C14649i c14649i, InterfaceC11936u interfaceC11936u, Context context) {
                super(context, 2);
                this.f54079a = c14649i;
                this.f54080b = interfaceC11936u;
            }

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                EnumC14650j enumC14650jM41861a;
                if (this.f54079a.orientationLockChecker.mo41843a() && (enumC14650jM41861a = this.f54079a.tracker.m41861a(orientation)) != null) {
                    ((C11935t) this.f54080b).f39041z.mo32218s(enumC14650jM41861a);
                }
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m41860h(C41599a c41599a) {
            c41599a.disable();
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C14649i.this.new a(interfaceC30057d);
            aVar.f54077y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f54077y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54076x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            C14649i.this.tracker = new C14651k(C14649i.this.orientationHelper);
            final C41599a c41599a = new C41599a(C14649i.this, interfaceC11936u, C14649i.this.context);
            if (!c41599a.canDetectOrientation()) {
                ((C11935t) interfaceC11936u).mo32217r(null);
                return c23454a0;
            }
            c41599a.enable();
            InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: fn2.h
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return C14649i.a.m41860h(c41599a);
                }
            };
            this.f54077y = null;
            this.f54075w = null;
            this.f54076x = 1;
            return AbstractC37056f.m118984h(interfaceC11936u, interfaceC4339a, this) == enumC31071a ? enumC31071a : c23454a0;
        }
    }

    public C14649i(Context context, C14647g orientationHelper, InterfaceC14643c orientationLockChecker) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(orientationHelper, "orientationHelper");
        AbstractC22676k.m65750j(orientationLockChecker, "orientationLockChecker");
        this.context = context;
        this.orientationHelper = orientationHelper;
        this.orientationLockChecker = orientationLockChecker;
        this.tracker = new C14651k(orientationHelper);
    }

    @Override // fn2.InterfaceC14652l
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo41857a() {
        return AbstractC13091v.m36600j(new a(null));
    }

    @Override // fn2.InterfaceC14652l
    /* JADX INFO: renamed from: b */
    public void mo41858b() {
        this.tracker = new C14651k(this.orientationHelper);
    }
}

package fn2;

import android.content.Context;
import android.view.OrientationEventListener;
import bc3.C3033m;
import bc3.InterfaceC3025k;
import ge3.AbstractC15751g;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: fn2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lfn2/f;", "Lfn2/d;", "Landroid/content/Context;", "context", "Lfn2/g;", "orientationHelper", "Lfn2/c;", "orientationLockChecker", "<init>", "(Landroid/content/Context;Lfn2/g;Lfn2/c;)V", "", "expectedOrientation", "Ll83/a0;", "f", "(ILq83/d;)Ljava/lang/Object;", "b", "(Lq83/d;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Lfn2/g;", "c", "Lfn2/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14646f implements InterfaceC14644d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14647g orientationHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14643c orientationLockChecker;

    /* JADX INFO: renamed from: fn2.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ b f54064w;

        public a(b bVar) {
            this.f54064w = bVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m41850a(Throwable th3) {
            this.f54064w.disable();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m41850a((Throwable) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fn2.f$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"fn2/f$b", "Landroid/view/OrientationEventListener;", "", "orientation", "Ll83/a0;", "onOrientationChanged", "(I)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends OrientationEventListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f54066b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC3025k f54067c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i13, InterfaceC3025k interfaceC3025k, Context context) {
            super(context);
            this.f54066b = i13;
            this.f54067c = interfaceC3025k;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int orientation) {
            if (C14646f.this.orientationLockChecker.mo41843a() && orientation != -1 && this.f54066b == C14646f.this.orientationHelper.m41851a(orientation)) {
                disable();
                this.f54067c.resumeWith(C23454a0.f92919a);
            }
        }
    }

    public C14646f(Context context, C14647g orientationHelper, InterfaceC14643c orientationLockChecker) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(orientationHelper, "orientationHelper");
        AbstractC22676k.m65750j(orientationLockChecker, "orientationLockChecker");
        this.context = context;
        this.orientationHelper = orientationHelper;
        this.orientationLockChecker = orientationLockChecker;
    }

    /* JADX INFO: renamed from: f */
    private final Object m41849f(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        b bVar = new b(i13, c3033m, this.context);
        bVar.enable();
        c3033m.m8776u(new a(bVar));
        Object objM8773r = c3033m.m8773r();
        return objM8773r == EnumC31071a.f128113w ? objM8773r : C23454a0.f92919a;
    }

    @Override // fn2.InterfaceC14644d
    /* JADX INFO: renamed from: a */
    public Object mo41844a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM41849f = m41849f(1, interfaceC30057d);
        return objM41849f == EnumC31071a.f128113w ? objM41849f : C23454a0.f92919a;
    }

    @Override // fn2.InterfaceC14644d
    /* JADX INFO: renamed from: b */
    public Object mo41845b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM41849f = m41849f(0, interfaceC30057d);
        return objM41849f == EnumC31071a.f128113w ? objM41849f : C23454a0.f92919a;
    }
}

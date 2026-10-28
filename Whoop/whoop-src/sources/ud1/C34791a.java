package ud1;

import ak0.C0945g;
import b82.InterfaceC2804a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import lt0.EnumC24728e;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import zj0.C40727h;

/* JADX INFO: renamed from: ud1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lud1/a;", "Lb82/a;", "Ltd1/b;", "whoopStrapProxy", "<init>", "(Ltd1/b;)V", "Lzj0/h;", "commandResponsePacket", "Llt0/e;", "commandNumber", "Ll83/a0;", "d", "(Lzj0/h;Llt0/e;)V", "", "patternId", "numberOfLoops", "Lak0/g;", "a", "(IILq83/d;)Ljava/lang/Object;", "Ltd1/b;", "Ltr2/n;", "b", "Ltr2/n;", "logger", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34791a implements InterfaceC2804a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ud1.a$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.strap.haptics.HapticsFeedbackSdkImpl$runHapticsPattern$2", m100430f = "HapticsFeedbackSdkImpl.kt", m100431l = {28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lak0/g;", "<anonymous>", "(Lbc3/c0;)Lak0/g;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f146496w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f146498y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f146499z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, int i14, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f146498y = i13;
            this.f146499z = i14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34791a.this.new a(this.f146498y, this.f146499z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C0945g> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f146496w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C34791a.this.logger.mo85228t(AbstractC2875y.m8294g(this.f146498y, this.f146499z, "Sending RunHapticsPattern command for pattern = ", " and number of loops = "), new AbstractC30556a.a[0]);
                InterfaceC33704b interfaceC33704b = C34791a.this.whoopStrapProxy;
                int i14 = this.f146498y;
                int i15 = this.f146499z;
                this.f146496w = 1;
                obj = interfaceC33704b.mo106486D(i14, i15, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C0945g c0945g = (C0945g) obj;
            C34791a.m109794e(C34791a.this, c0945g, null, 2, null);
            return c0945g;
        }
    }

    public C34791a(InterfaceC33704b whoopStrapProxy) {
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        this.whoopStrapProxy = whoopStrapProxy;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("HapticsFeedbackSdkImpl");
    }

    /* JADX INFO: renamed from: d */
    private final void m109793d(C40727h commandResponsePacket, EnumC24728e commandNumber) {
        if (commandResponsePacket == null) {
            this.logger.mo85214e("RunHaptics", "Did not receive any response packet for command " + commandNumber + "!", new AbstractC30556a.a[0]);
            return;
        }
        String str = commandResponsePacket.m132198W() ? "success" : "failure";
        this.logger.mo85232x("RunHaptics", "Command " + commandNumber + " resulted in " + str, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m109794e(C34791a c34791a, C40727h c40727h, EnumC24728e enumC24728e, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            enumC24728e = EnumC24728e.RUN_HAPTICS_PATTERN;
        }
        c34791a.m109793d(c40727h, enumC24728e);
    }

    @Override // b82.InterfaceC2804a
    /* JADX INFO: renamed from: a */
    public Object mo7990a(int i13, int i14, InterfaceC30057d<? super C0945g> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new a(i13, i14, null), interfaceC30057d);
    }
}

package gv1;

import androidx.core.app.NotificationCompat;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13075p1;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: gv1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lgv1/d;", "", "<init>", "()V", "Lgv1/m;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lgv1/m;)V", "Lec3/p1;", "Lgv1/o;", "a", "Lec3/p1;", "lottieSource", "", "isSelectLottieSheetVisible", "Lec3/l;", "Lgv1/e;", "c", "Lec3/l;", "()Lec3/l;", "state", "lottie-tester_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16230d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13075p1 lottieSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 isSelectLottieSheetVisible;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13058l state;

    /* JADX INFO: renamed from: gv1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.lottietester.LocalLottieTesterOverrideController$state$1", m100430f = "LocalLottieTesterOverrideController.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lgv1/o;", "source", "", "isSheetVisible", "Lgv1/e;", "<anonymous>", "(Lgv1/o;Z)Lgv1/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f61670w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f61671x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ boolean f61672y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m45941f(AbstractC16241o abstractC16241o, boolean z4, InterfaceC30057d<? super C16231e> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f61671x = abstractC16241o;
            aVar.f61672y = z4;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m45941f((AbstractC16241o) obj, ((Boolean) obj2).booleanValue(), (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC16241o abstractC16241o = (AbstractC16241o) this.f61671x;
            boolean z4 = this.f61672y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f61670w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C16231e(abstractC16241o, z4);
        }
    }

    public C16230d() {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.lottieSource = c13045h2M36593c;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(Boolean.FALSE);
        this.isSelectLottieSheetVisible = c13045h2M36593c2;
        this.state = new C13060l1(c13045h2M36593c, c13045h2M36593c2, new a(null), 1);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC13058l getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: b */
    public final void m45940b(InterfaceC16239m event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC16239m.d) {
            InterfaceC13075p1 interfaceC13075p1 = this.lottieSource;
            AbstractC16241o.d dVar = new AbstractC16241o.d(((InterfaceC16239m.d) event).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String());
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, dVar);
            return;
        }
        if (event instanceof InterfaceC16239m.c) {
            InterfaceC13075p1 interfaceC13075p2 = this.lottieSource;
            AbstractC16241o.c cVar = new AbstractC16241o.c(((InterfaceC16239m.c) event).getJsonString());
            C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
            c13045h3.getClass();
            c13045h3.m36571k(null, cVar);
            return;
        }
        if (event instanceof InterfaceC16239m.b) {
            InterfaceC13075p1 interfaceC13075p3 = this.lottieSource;
            AbstractC16241o.b bVar = new AbstractC16241o.b(((InterfaceC16239m.b) event).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String());
            C13045h2 c13045h4 = (C13045h2) interfaceC13075p3;
            c13045h4.getClass();
            c13045h4.m36571k(null, bVar);
            return;
        }
        if (event instanceof InterfaceC16239m.a) {
            InterfaceC13075p1 interfaceC13075p4 = this.lottieSource;
            AbstractC16241o.a aVar = new AbstractC16241o.a(((InterfaceC16239m.a) event).getUri());
            C13045h2 c13045h5 = (C13045h2) interfaceC13075p4;
            c13045h5.getClass();
            c13045h5.m36571k(null, aVar);
            return;
        }
        if (event instanceof InterfaceC16239m.e) {
            ((C13045h2) this.lottieSource).m36570j(null);
            return;
        }
        if (!(event instanceof InterfaceC16239m.f)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC13075p1 interfaceC13075p5 = this.isSelectLottieSheetVisible;
        Boolean boolValueOf = Boolean.valueOf(((InterfaceC16239m.f) event).getIsVisible());
        C13045h2 c13045h6 = (C13045h2) interfaceC13075p5;
        c13045h6.getClass();
        c13045h6.m36571k(null, boolValueOf);
    }
}

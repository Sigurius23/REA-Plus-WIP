package o92;

import android.content.Context;
import bc3.InterfaceC2994c0;
import ch.C4588i;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import hf1.InterfaceC17235b;
import hi0.AbstractC17312j;
import jk0.EnumC21747a;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import lf1.C23992b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: o92.c0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lo92/c0;", "", "Lhf1/b;", "experimentsChecker", "Lci2/b;", "whoopStrapProvider", "Lbc3/c0;", "coroutineScope", "<init>", "(Lhf1/b;Lci2/b;Lbc3/c0;)V", "", "defaultBody", "Landroid/content/Context;", "context", "Lo92/d0;", "a", "(Ljava/lang/String;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;", "Lhf1/b;", "Lec3/f2;", "Ljk0/a;", "b", "Lec3/f2;", "strapBodyStatusFlow", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27696c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13037f2 strapBodyStatusFlow;

    /* JADX INFO: renamed from: o92.c0$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.SleepNeedPushNotificationBodyGetter", m100430f = "SleepNeedPushNotificationBodyGetter.kt", m100431l = {47}, m100432m = "getBodyOrDefault", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f111527E;

        /* JADX INFO: renamed from: G */
        int f111529G;

        /* JADX INFO: renamed from: w */
        Object f111530w;

        /* JADX INFO: renamed from: x */
        Object f111531x;

        /* JADX INFO: renamed from: y */
        Object f111532y;

        /* JADX INFO: renamed from: z */
        int f111533z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f111527E = obj;
            this.f111529G |= Integer.MIN_VALUE;
            return C27696c0.this.m83720a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: o92.c0$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.SleepNeedPushNotificationBodyGetter$special$$inlined$flatMapLatest$1", m100430f = "SleepNeedPushNotificationBodyGetter.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f111534w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f111535x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f111536y;

        public b(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f111535x = interfaceC13062m;
            bVar.f111536y = interfaceC21750d;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111534w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f111535x;
                InterfaceC13037f2 observeStrapIsOnBody = ((InterfaceC21750d) this.f111536y).mo24695J().getObserveStrapIsOnBody();
                this.f111535x = null;
                this.f111536y = null;
                this.f111534w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, observeStrapIsOnBody, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C27696c0(InterfaceC17235b experimentsChecker, InterfaceC4733b whoopStrapProvider, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.experimentsChecker = experimentsChecker;
        this.strapBodyStatusFlow = AbstractC13091v.m36587M(AbstractC13091v.m36590P(new C4588i(whoopStrapProvider.mo14818b(), 2), new b(null)), coroutineScope, C13105z1.f45288a, EnumC21747a.UNKNOWN);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: a */
    public final Object m83720a(String str, Context context, InterfaceC30057d<? super C27698d0> interfaceC30057d) {
        a aVar;
        String str2;
        Context context2;
        EnumC21747a enumC21747a;
        int i13;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f111529G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f111529G = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f111527E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar2.f111529G;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            EnumC21747a enumC21747a2 = (EnumC21747a) this.strapBodyStatusFlow.getValue();
            int i16 = enumC21747a2 == EnumC21747a.STRAP_OFF_BODY ? 1 : 0;
            InterfaceC17235b interfaceC17235b = this.experimentsChecker;
            C23992b c23992b = new C23992b(null, null, null, null, 15, null);
            str2 = str;
            aVar2.f111530w = str2;
            context2 = context;
            aVar2.f111531x = context2;
            aVar2.f111532y = enumC21747a2;
            aVar2.f111533z = i16;
            aVar2.f111529G = 1;
            Object objM48741d = InterfaceC17235b.m48741d(interfaceC17235b, c23992b, 0L, true, false, aVar2, 10, null);
            if (objM48741d == enumC31071a) {
                return enumC31071a;
            }
            enumC21747a = enumC21747a2;
            obj = objM48741d;
            i13 = i16;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = aVar2.f111533z;
            enumC21747a = (EnumC21747a) aVar2.f111532y;
            Context context3 = (Context) aVar2.f111531x;
            String str3 = (String) aVar2.f111530w;
            AbstractC34132o.m107864I(obj);
            context2 = context3;
            str2 = str3;
        }
        String str4 = (String) obj;
        if (AbstractC22676k.m65745e(str4, "test_variant") && i13 != 0) {
            String string = context2.getString(AbstractC17312j.f66980e1);
            AbstractC22676k.m65749i(string, "getString(...)");
            str2 = str2 + " " + string;
        }
        return new C27698d0(str2, str4, enumC21747a);
    }
}

package o92;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import m92.AbstractC25319b;
import m92.C25323f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wm0.C37378a;

/* JADX INFO: renamed from: o92.a0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lo92/a0;", "Lm92/b;", "Lo92/s;", "pushContext", "Lwm0/a;", "scopeCoordinator", "<init>", "(Lo92/s;Lwm0/a;)V", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lwm0/a;", "", "J", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "K", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27692a0 extends AbstractC25319b {

    /* JADX INFO: renamed from: L */
    public static final int f111499L = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: o92.a0$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.RefreshStreaksSilentPush$perform$1", m100430f = "RefreshStreaksSilentPush.kt", m100431l = {21}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111502w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27692a0.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111502w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C37378a c37378a = C27692a0.this.scopeCoordinator;
                this.f111502w = 1;
                if (c37378a.m119657b("streaksHome", this) == enumC31071a) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27692a0(C27721s pushContext, C37378a scopeCoordinator) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        this.scopeCoordinator = scopeCoordinator;
        this.logTag = "RefreshStreaksSilentPush";
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        AbstractC3006f0.m8732z(getScope(), null, null, new b(null), 3);
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}

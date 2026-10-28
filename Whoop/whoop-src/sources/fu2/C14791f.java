package fu2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import iu2.C20937a;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;

/* JADX INFO: renamed from: fu2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lfu2/f;", "", "Liu2/a;", "strengthTrainerPacketManager", "Lu92/d;", "prefsStore", "Ltr2/n;", "logger", "<init>", "(Liu2/a;Lu92/d;Ltr2/n;)V", "Lbc3/c0;", "coroutineScope", "Ll83/a0;", "e", "(Lbc3/c0;)V", "d", "a", "Liu2/a;", "b", "Lu92/d;", "c", "Ltr2/n;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14791f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C20937a strengthTrainerPacketManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: fu2.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.common.domain.StrainStartupHandler$disableDataStreamingIfLeftOn$1", m100430f = "StrainStartupHandler.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        boolean f54896w;

        /* JADX INFO: renamed from: x */
        int f54897x;

        /* JADX INFO: renamed from: y */
        int f54898y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14791f.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54898y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                boolean zM109528e = C14791f.this.prefsStore.m109528e(SharedPreferenceConstants.RAW_DATA_STREAMING_ENABLED, false);
                int i14 = C14791f.this.prefsStore.m109533j(SharedPreferenceConstants.STRENGTH_BUILDER_SAVED_STATE) != null ? 1 : 0;
                if (zM109528e && i14 == 0) {
                    C14791f.this.logger.mo85228t("Detected IMU or raw data streaming is still on, but there is no active strength builder workout. Turning it off.", new AbstractC30556a.a[0]);
                    C20937a c20937a = C14791f.this.strengthTrainerPacketManager;
                    this.f54896w = zM109528e;
                    this.f54897x = i14;
                    this.f54898y = 1;
                    if (c20937a.m58163y(this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    public C14791f(C20937a strengthTrainerPacketManager, C34660d prefsStore, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(strengthTrainerPacketManager, "strengthTrainerPacketManager");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        AbstractC22676k.m65750j(logger, "logger");
        this.strengthTrainerPacketManager = strengthTrainerPacketManager;
        this.prefsStore = prefsStore;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: e */
    private final void m42519e(InterfaceC2994c0 coroutineScope) {
        AbstractC3006f0.m8732z(coroutineScope, null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: d */
    public final void m42520d(InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        m42519e(coroutineScope);
    }
}

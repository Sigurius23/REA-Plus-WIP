package o92;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import iy1.InterfaceC21030c;
import l83.C23454a0;
import m92.AbstractC25319b;
import m92.C25323f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wm0.C37378a;

/* JADX INFO: renamed from: o92.z */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Lo92/z;", "Lm92/b;", "Lo92/s;", "pushContext", "Lwm0/a;", "scopeCoordinator", "Liy1/c;", "metricWriter", "<init>", "(Lo92/s;Lwm0/a;Liy1/c;)V", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lwm0/a;", "J", "Liy1/c;", "", "K", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "L", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27728z extends AbstractC25319b {

    /* JADX INFO: renamed from: M */
    public static final int f111771M = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: o92.z$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.RefreshPendingFollowerInvitesSilentPush$perform$1", m100430f = "RefreshPendingFollowerInvitesSilentPush.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER, C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111775w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27728z.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r13.m119657b("BadgingRefreshScope", r12) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r12.f111775w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r13)
                goto L4e
            L10:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L18:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L3d
            L1c:
                p505ts.AbstractC34132o.m107864I(r13)
                o92.z r13 = o92.C27728z.this
                iy1.c r13 = o92.C27728z.m83797z(r13)
                jy1.a r4 = new jy1.a
                r10 = 21
                r11 = 0
                r5 = 0
                java.lang.String r6 = "refresh_pending_follower_invites.push_received"
                r7 = 0
                m83.y r8 = m83.C25271y.f99162w
                r9 = 0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                r12.f111775w = r3
                java.lang.Object r13 = r13.mo58700a(r4, r12)
                if (r13 != r0) goto L3d
                goto L4d
            L3d:
                o92.z r13 = o92.C27728z.this
                wm0.a r13 = o92.C27728z.m83796A(r13)
                r12.f111775w = r2
                java.lang.String r1 = "BadgingRefreshScope"
                java.lang.Object r13 = r13.m119657b(r1, r12)
                if (r13 != r0) goto L4e
            L4d:
                return r0
            L4e:
                l83.a0 r13 = l83.C23454a0.f92919a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o92.C27728z.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27728z(C27721s pushContext, C37378a scopeCoordinator, InterfaceC21030c metricWriter) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.scopeCoordinator = scopeCoordinator;
        this.metricWriter = metricWriter;
        this.logTag = "RefreshPendingFollowerInvitesSilentPush";
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        m74350l().mo85228t("RefreshPendingFollowerInvites push received", new AbstractC30556a.a[0]);
        AbstractC3006f0.m8732z(getScope(), null, null, new b(null), 3);
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}

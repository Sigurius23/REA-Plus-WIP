package is0;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28593a1;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: is0.z0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a+\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\u000e\u0010\r\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "commentCount", "Lkotlin/time/Duration;", "interval", "", "isPaused", "d", "(ILkotlin/time/Duration;ZLandroidx/compose/runtime/Composer;II)I", "a", "J", "getDEFAULT_ROTATION_INTERVAL", "()J", "DEFAULT_ROTATION_INTERVAL", "surfacedIndex", "community-reactions-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20921z0 {

    /* JADX INFO: renamed from: a */
    private static final long f78841a;

    /* JADX INFO: renamed from: is0.z0$a */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.RememberSurfacedIndexKt$rememberSurfacedIndex$1$1", m100430f = "RememberSurfacedIndex.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78842w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f78843x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Duration f78844y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28593a1 f78845z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Duration duration, InterfaceC28593a1 interfaceC28593a1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78844y = duration;
            this.f78845z = interfaceC28593a1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f78844y, this.f78845z, interfaceC30057d);
            aVar.f78843x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        /* JADX WARN: Code duplicated, block: B:13:0x0032 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:14:0x0033). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f78843x
                bc3.c0 r0 = (bc3.InterfaceC2994c0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f78842w
                r3 = 1
                if (r2 == 0) goto L19
                if (r2 != r3) goto L11
                p505ts.AbstractC34132o.m107864I(r7)
                goto L33
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                p505ts.AbstractC34132o.m107864I(r7)
            L1c:
                boolean r7 = bc3.AbstractC3006f0.m8729w(r0)
                if (r7 == 0) goto L40
                kotlin.time.Duration r7 = r6.f78844y
                long r4 = r7.getRawValue()
                r6.f78843x = r0
                r6.f78842w = r3
                java.lang.Object r7 = bc3.AbstractC3034m0.m8783c(r4, r6)
                if (r7 != r1) goto L33
                return r1
            L33:
                p1.a1 r7 = r6.f78845z
                int r7 = is0.AbstractC20921z0.m58031b(r7)
                p1.a1 r2 = r6.f78845z
                int r7 = r7 + r3
                is0.AbstractC20921z0.m58032c(r2, r7)
                goto L1c
            L40:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: is0.AbstractC20921z0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f78841a = DurationKt.toDuration(5, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: d */
    public static final int m58033d(int i13, Duration duration, boolean z4, Composer composer, int i14, int i15) {
        if ((i15 & 4) != 0) {
            z4 = false;
        }
        Object[] objArr = new Object[0];
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C20886i(14);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 48);
        Duration durationM134260boximpl = Duration.m134260boximpl(duration != null ? duration.getRawValue() : f78841a);
        if (Duration.m134261compareToLRDsOJo(durationM134260boximpl.getRawValue(), Duration.INSTANCE.m134357getZEROUwyO8pc()) <= 0 || z4 || i13 <= 1) {
            durationM134260boximpl = null;
        }
        if (durationM134260boximpl != null) {
            c28655q.m87150e0(356688917);
            boolean zM87153g = c28655q.m87153g(durationM134260boximpl) | c28655q.m87153g(interfaceC28593a1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new a(durationM134260boximpl, interfaceC28593a1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, durationM134260boximpl);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(356843638);
            c28655q.m87173q(false);
        }
        return m58035f(interfaceC28593a1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC28593a1 m58034e() {
        return new C28621h1(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final int m58035f(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m58036g(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }
}

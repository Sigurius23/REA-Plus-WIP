package p739ui0;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.LoadingTreatment;
import java.util.List;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ui0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "treatment", "Ll83/a0;", "c", "(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Landroidx/compose/runtime/Composer;I)V", "", "currentIndex", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35004f {

    /* JADX INFO: renamed from: ui0.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.CyclingProgressModalKt$CyclingProgressModal$2$1", m100430f = "CyclingProgressModal.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28593a1 f148076E;

        /* JADX INFO: renamed from: w */
        long f148077w;

        /* JADX INFO: renamed from: x */
        int f148078x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ LoadingTreatment f148079y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<String> f148080z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LoadingTreatment loadingTreatment, List<String> list, InterfaceC28593a1 interfaceC28593a1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148079y = loadingTreatment;
            this.f148080z = list;
            this.f148076E = interfaceC28593a1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f148079y, this.f148080z, this.f148076E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0035
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.f148078x
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                long r3 = r7.f148077w
                p505ts.AbstractC34132o.m107864I(r8)
                goto L36
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                p505ts.AbstractC34132o.m107864I(r8)
                com.whoop.whoopaction.domain.models.LoadingTreatment r8 = r7.f148079y
                float r8 = r8.getMessageCycleIntervalSeconds()
                r1 = 1000(0x3e8, float:1.401E-42)
                float r1 = (float) r1
                float r8 = r8 * r1
                long r3 = (long) r8
                r5 = 100
                long r3 = java.lang.Math.max(r3, r5)
            L2b:
                r7.f148077w = r3
                r7.f148078x = r2
                java.lang.Object r8 = bc3.AbstractC3034m0.m8782b(r3, r7)
                if (r8 != r0) goto L36
                return r0
            L36:
                p1.a1 r8 = r7.f148076E
                int r1 = p739ui0.AbstractC35004f.m110522h(r8)
                int r1 = r1 + r2
                java.util.List<java.lang.String> r5 = r7.f148080z
                int r5 = r5.size()
                int r1 = r1 % r5
                p739ui0.AbstractC35004f.m110523i(r8, r1)
                goto L2b
            */
            throw new UnsupportedOperationException("Method not decompiled: p739ui0.AbstractC35004f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m110517c(final LoadingTreatment treatment, Composer composer, final int i13) {
        int i14;
        final int i15;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        AbstractC22676k.m65750j(treatment, "treatment");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1859415191);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(treatment) : c28655q.m87157i(treatment) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        final int i16 = 0;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            List<String> messages = treatment.getMessages();
            if (messages.isEmpty()) {
                c28655q.m87150e0(1644863098);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    interfaceC4351m = new InterfaceC4351m() { // from class: ui0.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int i17 = i16;
                            Composer composer2 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            switch (i17) {
                                case 0:
                                    return AbstractC35004f.m110518d(treatment, i13, composer2, iIntValue);
                                default:
                                    return AbstractC35004f.m110521g(treatment, i13, composer2, iIntValue);
                            }
                        }
                    };
                }
            } else {
                c28655q.m87150e0(1644971691);
                c28655q.m87173q(false);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q);
                }
                InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                if (messages.size() > 1) {
                    c28655q.m87150e0(1645068039);
                    boolean zM87157i = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(treatment))) | c28655q.m87157i(messages);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new a(treatment, messages, interfaceC28593a1, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    LoadingTreatment.Companion companion = LoadingTreatment.INSTANCE;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, treatment);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1645348651);
                    c28655q.m87173q(false);
                }
                i15 = 1;
                AbstractC33199m0.m105214F(new AbstractC33208p0.d(AbstractC8693b.m21278l(messages.get(m110519e(interfaceC28593a1)))), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.d.f138473f | (TextResource.$stable << 3), 0, 4092);
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        i15 = 1;
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            interfaceC4351m = new InterfaceC4351m() { // from class: ui0.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = i15;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i17) {
                        case 0:
                            return AbstractC35004f.m110518d(treatment, i13, composer2, iIntValue);
                        default:
                            return AbstractC35004f.m110521g(treatment, i13, composer2, iIntValue);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m110518d(LoadingTreatment loadingTreatment, int i13, Composer composer, int i14) {
        m110517c(loadingTreatment, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final int m110519e(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m110520f(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m110521g(LoadingTreatment loadingTreatment, int i13, Composer composer, int i14) {
        m110517c(loadingTreatment, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

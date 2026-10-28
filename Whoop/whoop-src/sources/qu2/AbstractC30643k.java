package qu2;

import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1935f;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bm0.C3403f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import hh0.C17285e;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.C3756l0;
import p040c0.C3775r1;
import p040c0.InterfaceC3764o;
import p040c0.InterfaceC3770q;
import p077d0.AbstractC11348f;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qo1.C30527b;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qu2.k */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011²\u0006\u000e\u0010\r\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "countingDown", "Lkotlin/Function0;", "Ll83/a0;", "onCountdownComplete", "contentBehindCountdown", "m", "(ZLc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "B", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "countdownShown", "alreadyAnimated", "", "currentCountdownNumber", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30643k {

    /* JADX INFO: renamed from: qu2.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.view.ActivityCountdownKt$ActivityCountdown$1$1", m100430f = "ActivityCountdown.kt", m100431l = {93}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126048w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f126049x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f126050y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126049x = interfaceC4339a;
            this.f126050y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f126049x, this.f126050y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        /* JADX WARN: Code duplicated, block: B:13:0x0030 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002e -> B:14:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f126048w
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                p505ts.AbstractC34132o.m107864I(r6)
                goto L31
            Ld:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L15:
                p505ts.AbstractC34132o.m107864I(r6)
            L18:
                p1.c1 r6 = r5.f126050y
                int r6 = qu2.AbstractC30643k.m94200w(r6)
                if (r6 <= 0) goto L3c
                kotlin.time.Duration$Companion r6 = p715kotlin.time.Duration.INSTANCE
                kotlin.time.DurationUnit r6 = p715kotlin.time.DurationUnit.SECONDS
                long r3 = p715kotlin.time.DurationKt.toDuration(r2, r6)
                r5.f126048w = r2
                java.lang.Object r6 = bc3.AbstractC3034m0.m8783c(r3, r5)
                if (r6 != r0) goto L31
                return r0
            L31:
                p1.c1 r6 = r5.f126050y
                int r1 = qu2.AbstractC30643k.m94200w(r6)
                int r1 = r1 - r2
                qu2.AbstractC30643k.m94201x(r6, r1)
                goto L18
            L3c:
                c93.a r6 = r5.f126049x
                r6.invoke()
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qu2.AbstractC30643k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qu2.k$b */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.view.ActivityCountdownKt$ActivityCountdownWrapper$2$1$1", m100430f = "ActivityCountdown.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126051w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f126052x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126052x = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f126052x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f126051w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC30643k.m94193p(this.f126052x, true);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qu2.k$c */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.view.ActivityCountdownKt$ActivityCountdownWrapper$2$2$1", m100430f = "ActivityCountdown.kt", m100431l = {77}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126053w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f126054x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f126055y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126054x = interfaceC28601c1;
            this.f126055y = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f126054x, this.f126055y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126053w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC30643k.m94192o(this.f126054x)) {
                    this.f126053w = 1;
                    if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC30643k.m94196s(this.f126055y, true);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: B */
    private static final Modifier m94177B(Modifier modifier) {
        return modifier.mo3471e(AbstractC18249c.m52565c(C2314t.f9131w, AbstractC18249c.m52570h(C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4284931583L)), new C17919x(AbstractC17918w0.m51517e(4278227943L)), new C17919x(AbstractC17918w0.m51517e(4279446623L))), 0.0f, 0.0f, 14))));
    }

    /* JADX INFO: renamed from: h */
    public static final void m94185h(InterfaceC4339a onCountdownComplete, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(onCountdownComplete, "onCountdownComplete");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1447966097);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(onCountdownComplete) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Object[] objArr = new Object[0];
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C30527b(29);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q2, 48);
            boolean zM87153g = ((i14 & 14) == 4) | c28655q2.m87153g(interfaceC28601c1);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new a(onCountdownComplete, interfaceC28601c1, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            C2307m c2307m = C2299e.f9102E;
            Modifier modifierM94177B = m94177B(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM94177B);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (m94187j(interfaceC28601c1) > 0) {
                c28655q2.m87150e0(-1041560386);
                String strValueOf = String.valueOf(m94187j(interfaceC28601c1));
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                AbstractC30795n.m94707h(strValueOf, null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getN1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(-1041372681);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 19, onCountdownComplete);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC28601c1 m94186i() {
        return AbstractC28683x.m87272z(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final int m94187j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m94188k(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m94189l(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m94185h(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m94190m(boolean z4, InterfaceC4339a onCountdownComplete, InterfaceC4351m contentBehindCountdown, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onCountdownComplete, "onCountdownComplete");
        AbstractC22676k.m65750j(contentBehindCountdown, "contentBehindCountdown");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-509214933);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onCountdownComplete) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(contentBehindCountdown) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C30527b(27);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 48);
            Object[] objArr2 = new Object[0];
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C30527b(28);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R2, c28655q, 48);
            Boolean boolValueOf = Boolean.valueOf(z4);
            int i15 = i14 & 14;
            boolean zM87153g = c28655q.m87153g(interfaceC28601c2) | (i15 == 4);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                objM87133R3 = new C17285e(interfaceC28601c2, z4);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC1089a.m3344b(boolValueOf, null, (Function1) objM87133R3, null, null, null, AbstractC37817c.m121344e(-225555922, c28655q, new C3403f(onCountdownComplete, interfaceC28601c1, contentBehindCountdown, interfaceC28601c2, 6)), c28655q, i15 | 1572864, 58);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(z4, onCountdownComplete, contentBehindCountdown, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC28601c1 m94191n() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final boolean m94192o(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m94193p(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC28601c1 m94194q() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: r */
    private static final boolean m94195r(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m94196s(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C3756l0 m94197t(InterfaceC28601c1 interfaceC28601c1, boolean z4, InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        C3756l0 c3756l0 = new C3756l0(AbstractC3730c1.f15251a, m94195r(interfaceC28601c1) ? AbstractC3736e1.f15289a : InterfaceC3770q.m11570a(AnimatedContent, 2, AbstractC11348f.m30574v(500, 0, null, 6), 4), (C3775r1) null, 12);
        c3756l0.f15351c.m87023y(z4 ? 1.0f : 0.0f);
        return c3756l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m94198u(InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c2, InterfaceC3764o AnimatedContent, boolean z4, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        C28676v0 c28676v0 = C28635l.f115821a;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!z4 || m94195r(interfaceC28601c2)) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(2087573635);
            interfaceC4351m.invoke(c28655q, 0);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(interfaceC28601c2);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new c(interfaceC28601c1, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
            c28655q.m87173q(false);
            return c23454a0;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(2087416031);
        m94185h(interfaceC4339a, c28655q2, 0);
        boolean zM87153g2 = c28655q2.m87153g(interfaceC28601c1);
        Object objM87133R2 = c28655q2.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new b(interfaceC28601c1, null);
            c28655q2.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, c23454a0);
        c28655q2.m87173q(false);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m94199v(boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m94190m(z4, interfaceC4339a, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

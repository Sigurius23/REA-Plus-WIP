package q81;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c41.C4090p0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import eu.C13620k;
import java.util.Arrays;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26954j0;
import org.joda.time.DateTimeConstants;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q80.C30036h;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.C38072d;

/* JADX INFO: renamed from: q81.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a?\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a²\u0006\u000e\u0010\u0019\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lq81/b;", "baseTimerState", "Landroidx/lifecycle/g0;", "lifecycleOwner", "Lb91/a;", "textStyle", "Li2/x;", "textColor", "Ll83/a0;", "e", "(Landroidx/compose/ui/Modifier;Lq81/b;Landroidx/lifecycle/g0;Lb91/a;JLandroidx/compose/runtime/Composer;II)V", "state", "", "l", "(Lq81/b;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;II)Ljava/lang/String;", "", "timeInSeconds", "", "includeHours", "j", "(IZ)Ljava/lang/String;", "i", "(I)Ljava/lang/String;", "currentTimeInSeconds", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30043a {

    /* JADX INFO: renamed from: q81.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.weightliftingtimer.BaseTimerKt$timerString$1$1$1", m100430f = "BaseTimer.kt", m100431l = {112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f122621w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30044b f122622x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f122623y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f122624z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C30044b c30044b, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122622x = c30044b;
            this.f122623y = interfaceC28670t2;
            this.f122624z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f122622x, this.f122623y, this.f122624z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0035  */
        /* JADX WARN: Code duplicated, block: B:13:0x005b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0064  */
        /* JADX WARN: Code duplicated, block: B:18:0x006c  */
        /* JADX WARN: Code duplicated, block: B:19:0x0077  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0059 -> B:14:0x005c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0064
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f122621w
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                p505ts.AbstractC34132o.m107864I(r6)
                goto L5c
            Ld:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L15:
                p505ts.AbstractC34132o.m107864I(r6)
                p1.c1 r6 = r5.f122624z
                q81.b r1 = r5.f122622x
                c93.a r1 = r1.getGetUpdatedDisplayTimeInSecondsOnResume()
                java.lang.Object r1 = r1.invoke()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                q81.AbstractC30043a.m91988h(r6, r1)
            L2d:
                q81.b r6 = r5.f122622x
                boolean r6 = r6.getIsPaused()
                if (r6 != 0) goto L82
                p1.t2 r6 = r5.f122623y
                java.lang.Object r6 = r6.getValue()
                kotlin.jvm.functions.Function1 r6 = (p715kotlin.jvm.functions.Function1) r6
                p1.c1 r1 = r5.f122624z
                int r1 = q81.AbstractC30043a.m91987g(r1)
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r1)
                r6.invoke(r3)
                kotlin.time.Duration$Companion r6 = p715kotlin.time.Duration.INSTANCE
                kotlin.time.DurationUnit r6 = p715kotlin.time.DurationUnit.SECONDS
                long r3 = p715kotlin.time.DurationKt.toDuration(r2, r6)
                r5.f122621w = r2
                java.lang.Object r6 = bc3.AbstractC3034m0.m8783c(r3, r5)
                if (r6 != r0) goto L5c
                return r0
            L5c:
                q81.b r6 = r5.f122622x
                boolean r6 = r6.getIsCountDown()
                if (r6 == 0) goto L77
                p1.c1 r6 = r5.f122624z
                int r6 = q81.AbstractC30043a.m91987g(r6)
                if (r6 <= 0) goto L2d
                p1.c1 r6 = r5.f122624z
                int r1 = q81.AbstractC30043a.m91987g(r6)
                int r1 = r1 - r2
                q81.AbstractC30043a.m91988h(r6, r1)
                goto L2d
            L77:
                p1.c1 r6 = r5.f122624z
                int r1 = q81.AbstractC30043a.m91987g(r6)
                int r1 = r1 + r2
                q81.AbstractC30043a.m91988h(r6, r1)
                goto L2d
            L82:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q81.AbstractC30043a.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: q81.a$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"q81/a$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1585g0 f122625a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1577e0 f122626b;

        public b(InterfaceC1585g0 interfaceC1585g0, InterfaceC1577e0 interfaceC1577e0) {
            this.f122625a = interfaceC1585g0;
            this.f122626b = interfaceC1577e0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f122625a.getLifecycle().mo4988d(this.f122626b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX INFO: renamed from: e */
    public static final void m91985e(Modifier modifier, C30044b baseTimerState, InterfaceC1585g0 interfaceC1585g0, C2886a c2886a, long j7, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC1585g0 interfaceC1585g1;
        long jM125430y;
        C28655q c28655q;
        Modifier modifier3;
        InterfaceC1585g0 interfaceC1585g2;
        long j13;
        C2886a c2886a2;
        Modifier modifier4;
        InterfaceC1585g0 interfaceC1585g3;
        C2886a c2886a3;
        int i16;
        int i17;
        C2886a c2886aM8403A = c2886a;
        AbstractC22676k.m65750j(baseTimerState, "baseTimerState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-801311405);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(baseTimerState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                interfaceC1585g1 = interfaceC1585g0;
                int i19 = c28655q2.m87157i(interfaceC1585g1) ? 256 : 128;
                i15 |= i19;
            } else {
                interfaceC1585g1 = interfaceC1585g0;
            }
            i15 |= i19;
        } else {
            interfaceC1585g1 = interfaceC1585g0;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) != 0) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                if ((i13 & 4096) == 0 ? c28655q2.m87153g(c2886aM8403A) : c28655q2.m87157i(c2886aM8403A)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
            }
            i15 |= i17;
        }
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) == 0) {
                jM125430y = j7;
                if (c28655q2.m87151f(jM125430y)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i15 |= i16;
            } else {
                jM125430y = j7;
            }
            i16 = DfuBaseService.ERROR_REMOTE_MASK;
            i15 |= i16;
        } else {
            jM125430y = j7;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            c28655q2.m87140Z();
            if ((i13 & 1) == 0 || c28655q2.m87118C()) {
                modifier4 = i18 != 0 ? C2314t.f9131w : modifier2;
                if ((i14 & 4) != 0) {
                    interfaceC1585g3 = (InterfaceC1585g0) c28655q2.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    i15 &= -897;
                } else {
                    interfaceC1585g3 = interfaceC1585g1;
                }
                if ((i14 & 8) != 0) {
                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                    i15 &= -7169;
                }
                if ((i14 & 16) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i15 &= -57345;
                }
                c2886a3 = c2886aM8403A;
            } else {
                c28655q2.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
                if ((i14 & 16) != 0) {
                    i15 &= -57345;
                }
                c2886a3 = c2886aM8403A;
                modifier4 = modifier2;
                interfaceC1585g3 = interfaceC1585g1;
            }
            long j14 = jM125430y;
            c28655q2.m87175r();
            c28655q = c28655q2;
            AbstractC30795n.m94707h(m91992l(baseTimerState, interfaceC1585g3, c28655q2, (i15 >> 3) & 126, 0), AbstractC1136a.m3599a(modifier4, "BASE_TIMER_TEST_TAG"), j14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, null, c28655q, (i15 >> 6) & 896, (i15 << 9) & 3670016, 196600);
            modifier3 = modifier4;
            interfaceC1585g2 = interfaceC1585g3;
            j13 = j14;
            c2886a2 = c2886a3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC1585g2 = interfaceC1585g1;
            j13 = jM125430y;
            c2886a2 = c2886aM8403A;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4090p0(modifier3, baseTimerState, interfaceC1585g2, c2886a2, j13, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m91986f(Modifier modifier, C30044b c30044b, InterfaceC1585g0 interfaceC1585g0, C2886a c2886a, long j7, int i13, int i14, Composer composer, int i15) {
        m91985e(modifier, c30044b, interfaceC1585g0, c2886a, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final String m91989i(int i13) {
        return String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
    }

    /* JADX INFO: renamed from: j */
    public static final String m91990j(int i13, boolean z4) {
        String strM91989i = m91989i(i13 / DateTimeConstants.SECONDS_PER_HOUR);
        String strM91989i2 = m91989i((i13 / 60) % 60);
        String strM91989i3 = m91989i(i13 % 60);
        StringBuilder sb4 = new StringBuilder();
        if (z4) {
            sb4.append(strM91989i + ":");
        }
        sb4.append(strM91989i2 + ":" + strM91989i3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m91991k(int i13, boolean z4, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z4 = false;
        }
        return m91990j(i13, z4);
    }

    /* JADX INFO: renamed from: l */
    public static final String m91992l(C30044b state, InterfaceC1585g0 interfaceC1585g0, Composer composer, int i13, int i14) {
        AbstractC22676k.m65750j(state, "state");
        if ((i14 & 2) != 0) {
            interfaceC1585g0 = (InterfaceC1585g0) ((C28655q) composer).m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        }
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-2023753566);
        Object[] objArr = {Integer.valueOf(state.getInitialValueInSeconds()), state.getUpdateToTriggerTimeRefresh()};
        boolean zM87153g = c28655q.m87153g(state);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C30036h(state, 1);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 0);
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(state.getOnTimeChanged(), c28655q);
        Boolean boolValueOf = Boolean.valueOf(state.getIsPaused());
        Integer numValueOf = Integer.valueOf(state.getInitialValueInSeconds());
        Long updateToTriggerTimeRefresh = state.getUpdateToTriggerTimeRefresh();
        boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(state) | c28655q.m87153g(interfaceC28601c1M87238F);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new a(state, interfaceC28601c1M87238F, interfaceC28601c1, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87255i(boolValueOf, numValueOf, updateToTriggerTimeRefresh, (InterfaceC4351m) objM87133R2, c28655q);
        boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(state) | c28655q.m87157i(interfaceC1585g0);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C26954j0(interfaceC1585g0, state, interfaceC28601c1, 21);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R3, c28655q);
        String strM91990j = m91990j(m91994n(interfaceC28601c1), state.getIncludeHours());
        c28655q.m87173q(false);
        return strM91990j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC28601c1 m91993m(C30044b c30044b) {
        return AbstractC28683x.m87272z(Integer.valueOf(c30044b.getInitialValueInSeconds()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final int m91994n(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m91995o(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC28620h0 m91996p(InterfaceC1585g0 interfaceC1585g0, C30044b c30044b, InterfaceC28601c1 interfaceC28601c1, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C13620k c13620k = new C13620k(c30044b, interfaceC28601c1);
        interfaceC1585g0.getLifecycle().mo4986a(c13620k);
        return new b(interfaceC1585g0, c13620k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m91997q(C30044b c30044b, InterfaceC28601c1 interfaceC28601c1, InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<unused var>");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_RESUME) {
            m91995o(interfaceC28601c1, ((Number) c30044b.getGetUpdatedDisplayTimeInSecondsOnResume().invoke()).intValue());
        }
    }
}

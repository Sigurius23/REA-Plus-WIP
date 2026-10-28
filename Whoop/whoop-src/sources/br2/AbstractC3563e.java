package br2;

import a41.C0373i;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2476a1;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bg0.C3226h;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.C11393q0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import xq2.C38569i;
import xq2.C38575l;
import xq2.EnumC38561f;

/* JADX INFO: renamed from: br2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a+\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lxq2/l;", "rowState", "", "skipAnimations", "Ll83/a0;", "m", "(Landroidx/compose/ui/Modifier;Lxq2/l;ZLandroidx/compose/runtime/Composer;II)V", "Lxq2/i;", "barViewState", "", "index", "f", "(Lxq2/i;ILandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lxq2/i;Landroidx/compose/runtime/Composer;I)V", "animationIndex", "j", "(Landroidx/compose/ui/Modifier;Lxq2/i;ZILandroidx/compose/runtime/Composer;II)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3563e {

    /* JADX INFO: renamed from: br2.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.stackedhorizontalbar.ComparisonSectionViewKt$ComparisonBar$1$2$1$1", m100430f = "ComparisonSectionView.kt", m100431l = {139}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14418w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f14419x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C11393q0 f14420y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, C11393q0 c11393q0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14419x = i13;
            this.f14420y = c11393q0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f14419x, this.f14420y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14418w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(this.f14419x * 300, DurationUnit.MILLISECONDS);
                this.f14418w = 1;
                if (AbstractC3034m0.m8783c(duration, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f14420y.m30628I0(Boolean.TRUE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: br2.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14421a;

        static {
            int[] iArr = new int[EnumC38561f.values().length];
            try {
                iArr[EnumC38561f.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38561f.TRAILING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14421a = iArr;
        }
    }

    /* JADX INFO: renamed from: f */
    private static final void m10680f(C38569i c38569i, int i13, Modifier modifier, boolean z4, Composer composer, int i14, int i15) {
        int i16;
        int i17;
        C38569i c38569i2;
        boolean z13;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-206883);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87157i(c38569i) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        int i19 = i15 & 8;
        if (i19 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            if (i18 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            boolean z14 = i19 != 0 ? false : z4;
            i17 = i13;
            m10684j(modifier3, c38569i, z14, i17, c28655q, ((i16 >> 6) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 896) | ((i16 << 6) & 7168), 0);
            c38569i2 = c38569i;
            modifier2 = modifier3;
            z13 = z14;
        } else {
            i17 = i13;
            c38569i2 = c38569i;
            c28655q.m87138X();
            z13 = z4;
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3562d(c38569i2, i17, modifier2, z13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m10681g(C38569i c38569i, int i13, Modifier modifier, boolean z4, int i14, int i15, Composer composer, int i16) {
        m10680f(c38569i, i13, modifier, z4, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final void m10682h(C38569i c38569i, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1296062849);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c38569i) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC37056f.m118994r(AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3409f(c38569i.getBar().getFillPercentage(), C2314t.f9131w)), c38569i.getLayout().getCornerShape()), c38569i.getBar().getBackground()), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(c38569i, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m10683i(C38569i c38569i, int i13, Composer composer, int i14) {
        m10682h(c38569i, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x028c  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:110:0x02af  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:118:0x0300  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x012c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0206  */
    /* JADX WARN: Code duplicated, block: B:78:0x020e  */
    /* JADX WARN: Code duplicated, block: B:81:0x021e  */
    /* JADX WARN: Code duplicated, block: B:83:0x022c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0237  */
    /* JADX WARN: Code duplicated, block: B:87:0x024c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0258  */
    /* JADX WARN: Code duplicated, block: B:90:0x025a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0265  */
    /* JADX WARN: Code duplicated, block: B:97:0x0277  */
    /* JADX WARN: Code duplicated, block: B:98:0x0279  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public static final void m10684j(Modifier modifier, C38569i barViewState, boolean z4, int i13, Composer composer, int i14, int i15) {
        Modifier modifier2;
        int i16;
        boolean z13;
        int i17;
        int i18;
        int i19;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        int i24;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z16;
        int i25;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        boolean z17;
        int iHashCode3;
        int i26;
        boolean z18;
        Object objM87133R;
        C11393q0 c11393q0;
        boolean z19;
        boolean zM87157i;
        Object objM87133R2;
        int i27;
        int i28;
        C2305k c2305k;
        AbstractC22676k.m65750j(barViewState, "barViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1812486082);
        int i29 = i15 & 1;
        if (i29 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87157i(barViewState) ? 32 : 16;
        }
        int i34 = i15 & 4;
        if (i34 == 0) {
            if ((i14 & 384) == 0) {
                z13 = z4;
                i16 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    i18 = i13;
                    if (c28655q.m87149e(i18)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i19;
                }
                if ((i16 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i34 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i17 != 0) {
                        i18 = 0;
                    }
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    i25 = i18;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3407d(1.0f, c2314t), barViewState.getLayout().getGradientBackground()), c28655q, 0);
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(barViewState.getLayout().getTextAlignment(), false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                    c28655q.m87158i0();
                    z17 = z16;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    Modifier modifier4 = modifier2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(barViewState.getMetric(), c28655q, TextResource.$stable), AbstractC1099a.m3393o(barViewState.getLayout().getTextPadding(), c2314t), barViewState.getTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN6(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(barViewState.getLayout().getBarAlignment(), false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    if (z17) {
                        c28655q.m87150e0(542945);
                        m10682h(barViewState, c28655q, (i16 >> 3) & 14);
                        c28655q.m87173q(false);
                        i27 = i25;
                    } else {
                        c28655q.m87150e0(647260);
                        i26 = i16 & 7168;
                        if (i26 == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (z18 || objM87133R == c28676v0) {
                            objM87133R = new C11393q0(Boolean.FALSE);
                            c28655q.m87172p0(objM87133R);
                        }
                        c11393q0 = (C11393q0) objM87133R;
                        Integer numValueOf = Integer.valueOf(i25);
                        if (i26 == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i = c28655q.m87157i(c11393q0) | z19;
                        objM87133R2 = c28655q.m87133R();
                        if (!zM87157i || objM87133R2 == c28676v0) {
                            i27 = i25;
                            objM87133R2 = new a(i27, c11393q0, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            i27 = i25;
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, numValueOf);
                        i28 = b.f14421a[barViewState.getAlignment().ordinal()];
                        if (i28 != 1) {
                            c2305k = C2299e.f9112O;
                        } else {
                            if (i28 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2305k = C2299e.f9110M;
                        }
                        AbstractC1090b.m3347b(c11393q0, null, AbstractC3788w0.m11573a(AbstractC11348f.m30573u(0.0f, 200.0f, 5, null), c2305k, 12).m11562a(AbstractC3788w0.m11577e(null, 3)), null, null, AbstractC37817c.m121344e(1219122238, c28655q, new C2476a1(barViewState, 2)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    i24 = i27;
                    z15 = z17;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    i24 = i18;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3562d(modifier3, barViewState, z15, i24, i14, i15);
                }
            }
            i16 |= 3072;
            i18 = i13;
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                if (i34 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i17 != 0) {
                    i18 = 0;
                }
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, modifier2);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                i25 = i18;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d4);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3407d(1.0f, c2314t), barViewState.getLayout().getGradientBackground()), c28655q, 0);
                Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(barViewState.getLayout().getTextAlignment(), false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d5);
                c28655q.m87158i0();
                z17 = z16;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
                Modifier modifier5 = modifier2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(barViewState.getMetric(), c28655q, TextResource.$stable), AbstractC1099a.m3393o(barViewState.getLayout().getTextPadding(), c2314t), barViewState.getTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN6(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(barViewState.getLayout().getBarAlignment(), false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
                if (z17) {
                    c28655q.m87150e0(542945);
                    m10682h(barViewState, c28655q, (i16 >> 3) & 14);
                    c28655q.m87173q(false);
                    i27 = i25;
                } else {
                    c28655q.m87150e0(647260);
                    i26 = i16 & 7168;
                    if (i26 == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (z18) {
                        objM87133R = new C11393q0(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C11393q0(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    }
                    c11393q0 = (C11393q0) objM87133R;
                    Integer numValueOf2 = Integer.valueOf(i25);
                    if (i26 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = c28655q.m87157i(c11393q0) | z19;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        i27 = i25;
                        objM87133R2 = new a(i27, c11393q0, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        i27 = i25;
                        objM87133R2 = new a(i27, c11393q0, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, numValueOf2);
                    i28 = b.f14421a[barViewState.getAlignment().ordinal()];
                    if (i28 != 1) {
                        c2305k = C2299e.f9112O;
                    } else {
                        if (i28 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9110M;
                    }
                    AbstractC1090b.m3347b(c11393q0, null, AbstractC3788w0.m11573a(AbstractC11348f.m30573u(0.0f, 200.0f, 5, null), c2305k, 12).m11562a(AbstractC3788w0.m11577e(null, 3)), null, null, AbstractC37817c.m121344e(1219122238, c28655q, new C2476a1(barViewState, 2)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                i24 = i27;
                z15 = z17;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                i24 = i18;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3562d(modifier3, barViewState, z15, i24, i14, i15);
            }
        }
        i16 |= 384;
        z13 = z4;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                i18 = i13;
                if (c28655q.m87149e(i18)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i19;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                if (i34 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i17 != 0) {
                    i18 = 0;
                }
                Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, modifier2);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                i25 = i18;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3407d7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d7);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N7);
                AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3407d(1.0f, c2314t), barViewState.getLayout().getGradientBackground()), c28655q, 0);
                Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(barViewState.getLayout().getTextAlignment(), false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d8);
                c28655q.m87158i0();
                z17 = z16;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N8);
                Modifier modifier6 = modifier2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(barViewState.getMetric(), c28655q, TextResource.$stable), AbstractC1099a.m3393o(barViewState.getLayout().getTextPadding(), c2314t), barViewState.getTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN6(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                Modifier modifierM3407d9 = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(barViewState.getLayout().getBarAlignment(), false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3407d9);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d9);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                if (z17) {
                    c28655q.m87150e0(542945);
                    m10682h(barViewState, c28655q, (i16 >> 3) & 14);
                    c28655q.m87173q(false);
                    i27 = i25;
                } else {
                    c28655q.m87150e0(647260);
                    i26 = i16 & 7168;
                    if (i26 == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v2 = C28635l.f115821a;
                    if (z18) {
                        objM87133R = new C11393q0(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C11393q0(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    }
                    c11393q0 = (C11393q0) objM87133R;
                    Integer numValueOf3 = Integer.valueOf(i25);
                    if (i26 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = c28655q.m87157i(c11393q0) | z19;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        i27 = i25;
                        objM87133R2 = new a(i27, c11393q0, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        i27 = i25;
                        objM87133R2 = new a(i27, c11393q0, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, numValueOf3);
                    i28 = b.f14421a[barViewState.getAlignment().ordinal()];
                    if (i28 != 1) {
                        c2305k = C2299e.f9112O;
                    } else {
                        if (i28 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9110M;
                    }
                    AbstractC1090b.m3347b(c11393q0, null, AbstractC3788w0.m11573a(AbstractC11348f.m30573u(0.0f, 200.0f, 5, null), c2305k, 12).m11562a(AbstractC3788w0.m11577e(null, 3)), null, null, AbstractC37817c.m121344e(1219122238, c28655q, new C2476a1(barViewState, 2)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                i24 = i27;
                z15 = z17;
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                i24 = i18;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3562d(modifier3, barViewState, z15, i24, i14, i15);
            }
        }
        i16 |= 3072;
        i18 = i13;
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier2 = c2314t;
            }
            if (i34 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (i17 != 0) {
                i18 = 0;
            }
            Modifier modifierM3407d10 = AbstractC1102d.m3407d(1.0f, modifier2);
            InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            i25 = i18;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3407d10);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d10);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N10);
            AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3407d(1.0f, c2314t), barViewState.getLayout().getGradientBackground()), c28655q, 0);
            Modifier modifierM3407d11 = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(barViewState.getLayout().getTextAlignment(), false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3407d11);
            c28655q.m87158i0();
            z17 = z16;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d11);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m11);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
            Modifier modifier7 = modifier2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(barViewState.getMetric(), c28655q, TextResource.$stable), AbstractC1099a.m3393o(barViewState.getLayout().getTextPadding(), c2314t), barViewState.getTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN6(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            Modifier modifierM3407d12 = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(barViewState.getLayout().getBarAlignment(), false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3407d12);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d12);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N12);
            if (z17) {
                c28655q.m87150e0(542945);
                m10682h(barViewState, c28655q, (i16 >> 3) & 14);
                c28655q.m87173q(false);
                i27 = i25;
            } else {
                c28655q.m87150e0(647260);
                i26 = i16 & 7168;
                if (i26 == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v3 = C28635l.f115821a;
                if (z18) {
                    objM87133R = new C11393q0(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11393q0(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                c11393q0 = (C11393q0) objM87133R;
                Integer numValueOf4 = Integer.valueOf(i25);
                if (i26 == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i = c28655q.m87157i(c11393q0) | z19;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    i27 = i25;
                    objM87133R2 = new a(i27, c11393q0, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    i27 = i25;
                    objM87133R2 = new a(i27, c11393q0, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, numValueOf4);
                i28 = b.f14421a[barViewState.getAlignment().ordinal()];
                if (i28 != 1) {
                    c2305k = C2299e.f9112O;
                } else {
                    if (i28 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2305k = C2299e.f9110M;
                }
                AbstractC1090b.m3347b(c11393q0, null, AbstractC3788w0.m11573a(AbstractC11348f.m30573u(0.0f, 200.0f, 5, null), c2305k, 12).m11562a(AbstractC3788w0.m11577e(null, 3)), null, null, AbstractC37817c.m121344e(1219122238, c28655q, new C2476a1(barViewState, 2)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            i24 = i27;
            z15 = z17;
            modifier3 = modifier7;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
            i24 = i18;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3562d(modifier3, barViewState, z15, i24, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m10685k(C38569i c38569i, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        m10682h(c38569i, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m10686l(Modifier modifier, C38569i c38569i, boolean z4, int i13, int i14, int i15, Composer composer, int i16) {
        m10684j(modifier, c38569i, z4, i13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149  */
    /* JADX WARN: Code duplicated, block: B:70:0x0156  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static final void m10687m(Modifier modifier, C38575l rowState, boolean z4, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int i17;
        int i18;
        AbstractC22676k.m65750j(rowState, "rowState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-256261428);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(rowState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                Modifier modifierM3411h = AbstractC1102d.m3411h(11 * 4, AbstractC1102d.m3409f(1.0f, modifier2));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c28655q.m87150e0(-1982841652);
                i17 = 0;
                for (Object obj : rowState.m123667a()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C38569i c38569i = (C38569i) obj;
                    if (1.0f > 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    m10680f(c38569i, i17, new LayoutWeightElement(1.0f, true), z16, c28655q, (i16 << 3) & 7168, 0);
                    i17 = i18;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                String strM21274h = AbstractC8693b.m21274h(rowState.getTitle(), c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i25 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier2;
                z15 = z16;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(modifier3, rowState, z15, i13, i14, 1);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier2 = c2314t;
            }
            if (i24 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(11 * 4, AbstractC1102d.m3409f(1.0f, modifier2));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3411h2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9108K, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            c28655q.m87150e0(-1982841652);
            i17 = 0;
            while (r0.hasNext()) {
                i18 = i17 + 1;
                if (i17 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C38569i c38569i2 = (C38569i) obj;
                if (1.0f > 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                m10680f(c38569i2, i17, new LayoutWeightElement(1.0f, true), z16, c28655q, (i16 << 3) & 7168, 0);
                i17 = i18;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            String strM21274h2 = AbstractC8693b.m21274h(rowState.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d2 = C38072d.f163053a;
            int i26 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i26).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier2;
            z15 = z16;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(modifier3, rowState, z15, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m10688n(Modifier modifier, C38575l c38575l, boolean z4, int i13, int i14, Composer composer, int i15) {
        m10687m(modifier, c38575l, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

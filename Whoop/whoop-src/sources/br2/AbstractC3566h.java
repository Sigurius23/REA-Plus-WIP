package br2;

import a01.C0086f;
import a01.C0091k;
import a41.C0373i;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jr2.AbstractC21902a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kr2.AbstractC22813b;
import kr2.EnumC22817f;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C21061j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.C11393q0;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: br2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a?\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001d\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lbr2/c;", "barViewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/time/Duration;", "delay", "Ll83/a0;", "k", "(Lbr2/c;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Ly81/f;", "color", "", "opacity", "fillPercentage", "p", "(Ly81/f;FFLandroidx/compose/runtime/Composer;I)V", "i", "(Ly81/f;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "title", "Lkd1/o;", "icon", "Lb91/a;", "titleTextStyle", "t", "(Lcom/whoop/design/util/TextResource;Lkd1/o;Lb91/a;Landroidx/compose/runtime/Composer;I)V", "metric", "subMetric", "textColor", "metricTextStyle", "r", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Lb91/a;Landroidx/compose/runtime/Composer;II)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3566h {

    /* JADX INFO: renamed from: br2.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.stackedhorizontalbar.HorizontalBarKt$HorizontalBarV2$1$1$1", m100430f = "HorizontalBar.kt", m100431l = {134}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14430w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ long f14431x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C11393q0 f14432y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j7, C11393q0 c11393q0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14431x = j7;
            this.f14432y = c11393q0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f14431x, this.f14432y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14430w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long j7 = this.f14431x;
                this.f14430w = 1;
                if (AbstractC3034m0.m8783c(j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f14432y.m30628I0(Boolean.TRUE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: i */
    private static final void m10697i(EnumC39333f enumC39333f, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2012898053);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC39333f.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), AbstractC21902a.m62306a(enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, i14 & 14)), null, 0.0f, 6), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(enumC39333f, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m10698j(EnumC39333f enumC39333f, int i13, Composer composer, int i14) {
        m10697i(enumC39333f, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:64:0x015d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0178  */
    /* JADX WARN: Code duplicated, block: B:73:0x0186  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static final void m10699k(final C3561c barViewState, Modifier modifier, long j7, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        C28676v0 c28676v0;
        C11393q0 c11393q0;
        boolean z13;
        boolean zM87157i;
        Object objM87133R2;
        int iHashCode2;
        int i16;
        AbstractC22676k.m65750j(barViewState, "barViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-188463879);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(barViewState) : c28655q.m87157i(barViewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87151f(j7)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier4);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C11393q0(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                c11393q0 = (C11393q0) objM87133R;
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = c28655q.m87157i(c11393q0) | z13;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(j7, c11393q0, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                final int i18 = 0;
                Modifier modifier5 = modifier4;
                AbstractC22813b.m66090q(c11393q0, EnumC22817f.START, null, AbstractC37817c.m121344e(-2059567368, c28655q, new InterfaceC4351m() { // from class: br2.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int i19 = i18;
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i19) {
                            case 0:
                                return AbstractC3566h.m10700l(barViewState, composer2, iIntValue);
                            case 1:
                                return AbstractC3566h.m10701m(C23000t1.f90727a, barViewState, composer2, iIntValue);
                            default:
                                return AbstractC3566h.m10702n(barViewState, composer2, iIntValue);
                        }
                    }
                }), c28655q, 3120, 4);
                c28655q = c28655q;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 5 * 4, 0.0f, 2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                final int i19 = 1;
                AbstractC22813b.m66084k(c11393q0, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), AbstractC37817c.m121344e(670339891, c28655q, new InterfaceC4351m() { // from class: br2.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int i110 = i19;
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i110) {
                            case 0:
                                return AbstractC3566h.m10700l(barViewState, composer2, iIntValue);
                            case 1:
                                return AbstractC3566h.m10701m(C23000t1.f90727a, barViewState, composer2, iIntValue);
                            default:
                                return AbstractC3566h.m10702n(barViewState, composer2, iIntValue);
                        }
                    }
                }), c28655q, 384, 0);
                final int i24 = 2;
                AbstractC22813b.m66084k(c11393q0, null, AbstractC37817c.m121344e(166751402, c28655q, new InterfaceC4351m() { // from class: br2.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int i110 = i24;
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i110) {
                            case 0:
                                return AbstractC3566h.m10700l(barViewState, composer2, iIntValue);
                            case 1:
                                return AbstractC3566h.m10701m(C23000t1.f90727a, barViewState, composer2, iIntValue);
                            default:
                                return AbstractC3566h.m10702n(barViewState, composer2, iIntValue);
                        }
                    }
                }), c28655q, 384, 2);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3565g(barViewState, modifier3, j7, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (c28655q.m87151f(j7)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierMo3471e2 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier4);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
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
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C11393q0(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            c11393q0 = (C11393q0) objM87133R;
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = c28655q.m87157i(c11393q0) | z13;
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(j7, c11393q0, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(j7, c11393q0, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            final int i110 = 0;
            Modifier modifier6 = modifier4;
            AbstractC22813b.m66090q(c11393q0, EnumC22817f.START, null, AbstractC37817c.m121344e(-2059567368, c28655q, new InterfaceC4351m() { // from class: br2.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i111 = i110;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i111) {
                        case 0:
                            return AbstractC3566h.m10700l(barViewState, composer2, iIntValue);
                        case 1:
                            return AbstractC3566h.m10701m(C23000t1.f90727a, barViewState, composer2, iIntValue);
                        default:
                            return AbstractC3566h.m10702n(barViewState, composer2, iIntValue);
                    }
                }
            }), c28655q, 3120, 4);
            c28655q = c28655q;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 5 * 4, 0.0f, 2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            final int i111 = 1;
            AbstractC22813b.m66084k(c11393q0, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), AbstractC37817c.m121344e(670339891, c28655q, new InterfaceC4351m() { // from class: br2.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i112 = i111;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i112) {
                        case 0:
                            return AbstractC3566h.m10700l(barViewState, composer2, iIntValue);
                        case 1:
                            return AbstractC3566h.m10701m(C23000t1.f90727a, barViewState, composer2, iIntValue);
                        default:
                            return AbstractC3566h.m10702n(barViewState, composer2, iIntValue);
                    }
                }
            }), c28655q, 384, 0);
            final int i25 = 2;
            AbstractC22813b.m66084k(c11393q0, null, AbstractC37817c.m121344e(166751402, c28655q, new InterfaceC4351m() { // from class: br2.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i112 = i25;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i112) {
                        case 0:
                            return AbstractC3566h.m10700l(barViewState, composer2, iIntValue);
                        case 1:
                            return AbstractC3566h.m10701m(C23000t1.f90727a, barViewState, composer2, iIntValue);
                        default:
                            return AbstractC3566h.m10702n(barViewState, composer2, iIntValue);
                    }
                }
            }), c28655q, 384, 2);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3565g(barViewState, modifier3, j7, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m10700l(C3561c c3561c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (c3561c.getUseGradientBackground()) {
                c28655q.m87150e0(381546042);
                m10697i(c3561c.getColor(), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(381628688);
                c28655q.m87173q(false);
            }
            m10704p(c3561c.getColor(), c3561c.getOpacity(), c3561c.getFillPercentage(), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m10701m(InterfaceC22997s1 interfaceC22997s1, C3561c c3561c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierMo66772c = interfaceC22997s1.mo66772c(C2314t.f9131w, true, 1.0f);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo66772c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m10708t(c3561c.getTitle(), c3561c.getIcon(), c3561c.getTitleTextStyle(), c28655q, TextResource.$stable | (AbstractC22403o.f87638a << 3) | (C2886a.f11498d << 6));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m10702n(C3561c c3561c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9103F, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            TextResource textResourceM10666e = c3561c.getMetric();
            TextResource textResourceM10669h = c3561c.getSubMetric();
            EnumC39333f enumC39333fM10670i = c3561c.getTextColor();
            C2886a c2886aM10667f = c3561c.getMetricTextStyle();
            int i14 = TextResource.$stable;
            m10706r(null, textResourceM10666e, textResourceM10669h, enumC39333fM10670i, c2886aM10667f, c28655q, (i14 << 6) | (i14 << 3) | (C2886a.f11498d << 12), 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m10703o(C3561c c3561c, Modifier modifier, long j7, int i13, int i14, Composer composer, int i15) {
        m10699k(c3561c, modifier, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m10704p(EnumC39333f enumC39333f, float f13, float f14, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1110804964);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC39333f.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f14) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f15 = 2 * 4;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(f14, AbstractC1102d.m3406c(1.0f, C2314t.f9131w)), AbstractC33253j.m105491g(0.0f, f15, f15, 0.0f, 9)), C17919x.m51541c(f13, enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, i14 & 14)), AbstractC17918w0.f69621a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0091k(enumC39333f, f13, f14, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m10705q(EnumC39333f enumC39333f, float f13, float f14, int i13, Composer composer, int i14) {
        m10704p(enumC39333f, f13, f14, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:98:0x0217  */
    /* JADX INFO: renamed from: r */
    private static final void m10706r(Modifier modifier, TextResource textResource, TextResource textResource2, EnumC39333f enumC39333f, C2886a c2886a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        InterfaceC39332e interfaceC39332e;
        long jM95624D;
        Modifier modifier4;
        C0209i c0209i;
        int i16;
        int i17;
        C28655q c28655q2;
        int iHashCode;
        boolean z4;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(636269723);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q3.m87153g(textResource) : c28655q3.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q3.m87153g(textResource2) : c28655q3.m87157i(textResource2) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q3.m87149e(enumC39333f == null ? -1 : enumC39333f.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= (32768 & i13) == 0 ? c28655q3.m87153g(c2886a) : c28655q3.m87157i(c2886a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier5 = i18 != 0 ? c2314t : modifier2;
            C17919x c17919xM31989h = null;
            InterfaceC39332e interfaceC39332e2 = i19 != 0 ? null : enumC39333f;
            if (interfaceC39332e2 == null) {
                c28655q3.m87150e0(1420854515);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(1569854670);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q3, false, interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q3, (i15 >> 9) & 14));
            }
            if (c17919xM31989h == null) {
                c28655q3.m87150e0(1569855973);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q3, C38072d.f163054b, false);
            } else {
                c28655q3.m87150e0(1569854361);
                c28655q3.m87173q(false);
                jM95624D = c17919xM31989h.f69639a;
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q3, 48);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifier5);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q3.f115903S) {
                modifier4 = modifier5;
            } else {
                modifier4 = modifier5;
                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i, modifierM118962N);
                i16 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q3, ((i15 >> 3) & 14) | i16);
                i17 = C2886a.f11498d << 18;
                InterfaceC39332e interfaceC39332e3 = interfaceC39332e2;
                Modifier modifier6 = modifier4;
                AbstractC30795n.m94707h(strM21274h, null, jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q3, 0, i17 | ((i15 << 6) & 3670016), 196602);
                c28655q2 = c28655q3;
                if (textResource2 == null) {
                    c28655q2.m87150e0(-522278956);
                    c28655q2.m87173q(false);
                    z4 = true;
                } else {
                    c28655q2.m87150e0(-522278955);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q2, 6);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N2);
                    String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q2, i16);
                    C38072d c38072d = C38072d.f163053a;
                    int i24 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q2, i24).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i24).getN7(), null, c28655q2, 0, i17, 196602);
                    c28655q2 = c28655q2;
                    z4 = true;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z4);
                modifier3 = modifier6;
                c28655q = c28655q2;
                interfaceC39332e = interfaceC39332e3;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i4);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i, modifierM118962N);
            i16 = TextResource.$stable;
            String strM21274h3 = AbstractC8693b.m21274h(textResource, c28655q3, ((i15 >> 3) & 14) | i16);
            i17 = C2886a.f11498d << 18;
            InterfaceC39332e interfaceC39332e4 = interfaceC39332e2;
            Modifier modifier7 = modifier4;
            AbstractC30795n.m94707h(strM21274h3, null, jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q3, 0, i17 | ((i15 << 6) & 3670016), 196602);
            c28655q2 = c28655q3;
            if (textResource2 == null) {
                c28655q2.m87150e0(-522278956);
                c28655q2.m87173q(false);
                z4 = true;
            } else {
                c28655q2.m87150e0(-522278955);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N3);
                String strM21274h4 = AbstractC8693b.m21274h(textResource2, c28655q2, i16);
                C38072d c38072d2 = C38072d.f163053a;
                int i25 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h4, null, c38072d2.m121949b(c28655q2, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i25).getN7(), null, c28655q2, 0, i17, 196602);
                c28655q2 = c28655q2;
                z4 = true;
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z4);
            modifier3 = modifier7;
            c28655q = c28655q2;
            interfaceC39332e = interfaceC39332e4;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
            modifier3 = modifier2;
            interfaceC39332e = enumC39333f;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(modifier3, textResource, textResource2, interfaceC39332e, c2886a, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m10707s(Modifier modifier, TextResource textResource, TextResource textResource2, EnumC39333f enumC39333f, C2886a c2886a, int i13, int i14, Composer composer, int i15) {
        m10706r(modifier, textResource, textResource2, enumC39333f, c2886a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m10708t(TextResource textResource, AbstractC22403o abstractC22403o, C2886a c2886a, Composer composer, int i13) {
        int i14;
        int i15;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(224728849);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(c2886a) : c28655q.m87157i(c2886a) ? 256 : 128;
        }
        int i16 = i14;
        if (c28655q.m87135U(i16 & 1, (i16 & 147) != 146)) {
            long brandWhite = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (abstractC22403o == null) {
                c28655q.m87150e0(-550236883);
                c28655q.m87173q(false);
                i15 = i16;
                z4 = true;
            } else {
                c28655q.m87150e0(-550236882);
                float f13 = 4;
                i15 = i16;
                z4 = true;
                AbstractC15005f3.m43107a(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(6 * f13, c2314t), brandWhite, c28655q, 432, 0);
                AbstractC31061c.m95650z(3, f13, c2314t, c28655q, false);
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable | (i15 & 14)), null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886a, null, c28655q, 0, (C2886a.f11498d << 18) | 3120 | ((i15 << 12) & 3670016), 186362);
            c28655q = c28655q;
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(textResource, abstractC22403o, c2886a, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m10709u(TextResource textResource, AbstractC22403o abstractC22403o, C2886a c2886a, int i13, Composer composer, int i14) {
        m10708t(textResource, abstractC22403o, c2886a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

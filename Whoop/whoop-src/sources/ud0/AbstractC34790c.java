package ud0;

import a00.C0073h;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import ny0.C27238a0;
import od0.InterfaceC27834a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qd0.InterfaceC30292a;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import rd0.C31241c;
import rd0.InterfaceC31239a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sd0.C32409a;
import sg2.C32458i;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ud0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a[\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lrd0/c;", "viewState", "Lkotlin/Function1;", "Lqd0/a;", "Ll83/a0;", "onNavigationEvent", "Lrd0/a;", "onViewEvent", "Lod0/a;", "onAnalyticsEvent", "", "inviteCode", "j", "(Lrd0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lsd0/a;", "data", "f", "(Lsd0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34790c {

    /* JADX INFO: renamed from: ud0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.rafReceiver.view.RafReceiverScreenKt$RafReceiverContent$1$1", m100430f = "RafReceiverScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f146491w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f146492x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32409a f146493y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C32409a c32409a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f146492x = function1;
            this.f146493y = c32409a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f146492x, this.f146493y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f146491w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f146492x.invoke(new InterfaceC27834a.b(this.f146493y.getAnalyticsName(), this.f146493y.getAnalyticsCategory()));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0385  */
    /* JADX WARN: Code duplicated, block: B:108:0x03a8 A[LOOP:0: B:106:0x03a2->B:108:0x03a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:115:0x0403  */
    /* JADX WARN: Code duplicated, block: B:117:0x0407  */
    /* JADX WARN: Code duplicated, block: B:120:0x0416  */
    /* JADX WARN: Code duplicated, block: B:121:0x0418  */
    /* JADX WARN: Code duplicated, block: B:124:0x0422  */
    /* JADX WARN: Code duplicated, block: B:125:0x0424  */
    /* JADX WARN: Code duplicated, block: B:128:0x042c  */
    /* JADX WARN: Code duplicated, block: B:129:0x042e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0436  */
    /* JADX WARN: Code duplicated, block: B:134:0x043a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x0183  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191  */
    /* JADX WARN: Code duplicated, block: B:78:0x01de  */
    /* JADX WARN: Code duplicated, block: B:81:0x0213  */
    /* JADX WARN: Code duplicated, block: B:82:0x0217  */
    /* JADX WARN: Code duplicated, block: B:89:0x0236  */
    /* JADX WARN: Code duplicated, block: B:92:0x031c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0326  */
    /* JADX WARN: Code duplicated, block: B:96:0x0366  */
    /* JADX WARN: Code duplicated, block: B:97:0x036a  */
    /* JADX INFO: renamed from: f */
    private static final void m109784f(C32409a c32409a, Function1 function1, Function1 function2, Function1 function3, String str, Composer composer, int i13) {
        int i14;
        C0209i c0209i;
        C0209i c0209i2;
        int i15;
        boolean z4;
        Object objM87133R;
        int i16;
        C0209i c0209i3;
        float f13;
        int iHashCode;
        float f14;
        C38072d c38072d;
        int i17;
        List<InterfaceC25312u> listM100990g;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        int iHashCode2;
        Iterator<T> it;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2103298254);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c32409a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function3) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(str) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            int i18 = i14 & 7168;
            boolean zM87157i = (i18 == 2048) | c28655q.m87157i(c32409a);
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new a(function3, c32409a, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            C2314t c2314t = C2314t.f9131w;
            float f15 = 8;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC22953f.m66724m(AbstractC15673b0.m44038g0(AbstractC1102d.m3407d(1.0f, c2314t))), 0.0f, 0.0f, 0.0f, 6 * f15, 7), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S) {
                c0209i = c0209i5;
            } else {
                c0209i = c0209i5;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                c0209i2 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i2, modifierM118962N);
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 1 * f15, 0.0f, 0.0f, 13);
                AbstractC6721d.a aVar = new AbstractC6721d.a(null, null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65531, null);
                i15 = i14 & 112;
                if (i15 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == c28676v0) {
                    objM87133R = new C32458i(function1, 26);
                    c28655q.m87172p0(objM87133R);
                }
                i16 = i14;
                c0209i3 = c0209i;
                AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                f13 = 2 * f15;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3413j(new LayoutWeightElement(1.0f, true), f13, 0.0f, 2));
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, modifierM118962N2);
                f14 = 4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c32409a.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(30 * f14, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                float f16 = f14 * f15;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                String strM100992i = c32409a.getTitle();
                c38072d = C38072d.f163053a;
                i17 = C38072d.f163054b;
                C2886a c2886aM8417O = c38072d.m121952e(c28655q, i17).getT2();
                long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM100992i, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, i19, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 0.5d) * f15, c2314t));
                AbstractC30795n.m94707h(c32409a.getSubtitle(), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, i19, 196602);
                c28655q = c28655q;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                listM100990g = c32409a.m100990g();
                if (listM100990g != null) {
                    z13 = true;
                    if (!listM100990g.isEmpty()) {
                        c28655q.m87150e0(-265808899);
                        Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(3 * f14)), c38072d.m121949b(c28655q, i17).getWhite5(), AbstractC17918w0.f69621a));
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, modifierM118962N3);
                        c28655q.m87150e0(-200351545);
                        it = c32409a.m100990g().iterator();
                        while (it.hasNext()) {
                            C28655q c28655q2 = c28655q;
                            AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, null, c28655q2, 0, 14);
                            c28655q = c28655q2;
                        }
                        z14 = false;
                        z13 = true;
                        AbstractC25012a.m73392y(c28655q, false, true, false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(5 * f15, c2314t));
                    C27238a0 c27238a0 = new C27238a0(AbstractC8693b.m21278l(c32409a.getCtaText()), null, null, null, 0.0f, null, null, null, false, false, 1022, null);
                    if (i18 == 2048) {
                        z15 = z13;
                    } else {
                        z15 = z14;
                    }
                    boolean zM87157i2 = z15 | c28655q.m87157i(c32409a);
                    if ((i16 & 896) == 256) {
                        z16 = z13;
                    } else {
                        z16 = z14;
                    }
                    boolean z24 = zM87157i2 | z16;
                    if ((i16 & 57344) == 16384) {
                        z17 = z13;
                    } else {
                        z17 = z14;
                    }
                    boolean z25 = z24 | z17;
                    if (i15 == 32) {
                        z18 = z13;
                    } else {
                        z18 = z14;
                    }
                    z19 = z25 | z18;
                    objM87133R2 = c28655q.m87133R();
                    if (z19 || objM87133R2 == c28676v0) {
                        C0073h c0073h = new C0073h(function3, c32409a, function2, str, function1, 24);
                        c28655q.m87172p0(c0073h);
                        objM87133R2 = c0073h;
                    }
                    AbstractC27292z.m82341h(c27238a0, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27238a0.f109008k, 6);
                    c28655q.m87173q(z13);
                    c28655q.m87173q(z13);
                } else {
                    z13 = true;
                }
                z14 = false;
                c28655q.m87150e0(-265436992);
                c28655q.m87173q(false);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(5 * f15, c2314t));
                C27238a0 c27238a1 = new C27238a0(AbstractC8693b.m21278l(c32409a.getCtaText()), null, null, null, 0.0f, null, null, null, false, false, 1022, null);
                if (i18 == 2048) {
                    z15 = z13;
                } else {
                    z15 = z14;
                }
                boolean zM87157i3 = z15 | c28655q.m87157i(c32409a);
                if ((i16 & 896) == 256) {
                    z16 = z13;
                } else {
                    z16 = z14;
                }
                boolean z26 = zM87157i3 | z16;
                if ((i16 & 57344) == 16384) {
                    z17 = z13;
                } else {
                    z17 = z14;
                }
                boolean z27 = z26 | z17;
                if (i15 == 32) {
                    z18 = z13;
                } else {
                    z18 = z14;
                }
                z19 = z27 | z18;
                objM87133R2 = c28655q.m87133R();
                if (z19) {
                    C0073h c0073h2 = new C0073h(function3, c32409a, function2, str, function1, 24);
                    c28655q.m87172p0(c0073h2);
                    objM87133R2 = c0073h2;
                } else {
                    C0073h c0073h3 = new C0073h(function3, c32409a, function2, str, function1, 24);
                    c28655q.m87172p0(c0073h3);
                    objM87133R2 = c0073h3;
                }
                AbstractC27292z.m82341h(c27238a1, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27238a0.f109008k, 6);
                c28655q.m87173q(z13);
                c28655q.m87173q(z13);
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            c0209i2 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i2, modifierM118962N);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 1 * f15, 0.0f, 0.0f, 13);
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(null, null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65531, null);
            i15 = i14 & 112;
            if (i15 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z4) {
                objM87133R = new C32458i(function1, 26);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C32458i(function1, 26);
                c28655q.m87172p0(objM87133R);
            }
            i16 = i14;
            c0209i3 = c0209i;
            AbstractC6719b.m20143d(modifierM3398t2, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            f13 = 2 * f15;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3413j(new LayoutWeightElement(1.0f, true), f13, 0.0f, 2));
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, modifierM118962N4);
            f14 = 4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c32409a.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(30 * f14, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
            float f17 = f14 * f15;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t));
            String strM100992i2 = c32409a.getTitle();
            c38072d = C38072d.f163053a;
            i17 = C38072d.f163054b;
            C2886a c2886aM8417O2 = c38072d.m121952e(c28655q, i17).getT2();
            long jM125430y2 = c38072d.m121949b(c28655q, i17).getBrandWhite();
            int i110 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM100992i2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q, 0, i110, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 0.5d) * f15, c2314t));
            AbstractC30795n.m94707h(c32409a.getSubtitle(), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, i110, 196602);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t));
            listM100990g = c32409a.m100990g();
            if (listM100990g != null) {
                z13 = true;
                if (!listM100990g.isEmpty()) {
                    c28655q.m87150e0(-265808899);
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(3 * f14)), c38072d.m121949b(c28655q, i17).getWhite5(), AbstractC17918w0.f69621a));
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, modifierM118962N5);
                    c28655q.m87150e0(-200351545);
                    it = c32409a.m100990g().iterator();
                    while (it.hasNext()) {
                        C28655q c28655q3 = c28655q;
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, null, c28655q3, 0, 14);
                        c28655q = c28655q3;
                    }
                    z14 = false;
                    z13 = true;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(5 * f15, c2314t));
                C27238a0 c27238a2 = new C27238a0(AbstractC8693b.m21278l(c32409a.getCtaText()), null, null, null, 0.0f, null, null, null, false, false, 1022, null);
                if (i18 == 2048) {
                    z15 = z13;
                } else {
                    z15 = z14;
                }
                boolean zM87157i4 = z15 | c28655q.m87157i(c32409a);
                if ((i16 & 896) == 256) {
                    z16 = z13;
                } else {
                    z16 = z14;
                }
                boolean z28 = zM87157i4 | z16;
                if ((i16 & 57344) == 16384) {
                    z17 = z13;
                } else {
                    z17 = z14;
                }
                boolean z29 = z28 | z17;
                if (i15 == 32) {
                    z18 = z13;
                } else {
                    z18 = z14;
                }
                z19 = z29 | z18;
                objM87133R2 = c28655q.m87133R();
                if (z19) {
                    C0073h c0073h4 = new C0073h(function3, c32409a, function2, str, function1, 24);
                    c28655q.m87172p0(c0073h4);
                    objM87133R2 = c0073h4;
                } else {
                    C0073h c0073h5 = new C0073h(function3, c32409a, function2, str, function1, 24);
                    c28655q.m87172p0(c0073h5);
                    objM87133R2 = c0073h5;
                }
                AbstractC27292z.m82341h(c27238a2, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27238a0.f109008k, 6);
                c28655q.m87173q(z13);
                c28655q.m87173q(z13);
            } else {
                z13 = true;
            }
            z14 = false;
            c28655q.m87150e0(-265436992);
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(5 * f15, c2314t));
            C27238a0 c27238a3 = new C27238a0(AbstractC8693b.m21278l(c32409a.getCtaText()), null, null, null, 0.0f, null, null, null, false, false, 1022, null);
            if (i18 == 2048) {
                z15 = z13;
            } else {
                z15 = z14;
            }
            boolean zM87157i5 = z15 | c28655q.m87157i(c32409a);
            if ((i16 & 896) == 256) {
                z16 = z13;
            } else {
                z16 = z14;
            }
            boolean z210 = zM87157i5 | z16;
            if ((i16 & 57344) == 16384) {
                z17 = z13;
            } else {
                z17 = z14;
            }
            boolean z211 = z210 | z17;
            if (i15 == 32) {
                z18 = z13;
            } else {
                z18 = z14;
            }
            z19 = z211 | z18;
            objM87133R2 = c28655q.m87133R();
            if (z19) {
                C0073h c0073h6 = new C0073h(function3, c32409a, function2, str, function1, 24);
                c28655q.m87172p0(c0073h6);
                objM87133R2 = c0073h6;
            } else {
                C0073h c0073h7 = new C0073h(function3, c32409a, function2, str, function1, 24);
                c28655q.m87172p0(c0073h7);
                objM87133R2 = c0073h7;
            }
            AbstractC27292z.m82341h(c27238a3, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27238a0.f109008k, 6);
            c28655q.m87173q(z13);
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34789b((Object) c32409a, (Object) function1, (Object) function2, (Object) function3, (Object) str, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m109785g(Function1 function1) {
        function1.invoke(InterfaceC30292a.a.f123895a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m109786h(Function1 function1, C32409a c32409a, Function1 function2, String str, Function1 function3) {
        function1.invoke(new InterfaceC27834a.a(c32409a.getAnalyticsName(), c32409a.getAnalyticsActionName(), c32409a.getAnalyticsCategory()));
        function2.invoke(new InterfaceC31239a.a(str, c32409a.getAnalyticsActionName()));
        function3.invoke(new InterfaceC30292a.b(c32409a.getDestination()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m109787i(C32409a c32409a, Function1 function1, Function1 function2, Function1 function3, String str, int i13, Composer composer, int i14) {
        m109784f(c32409a, function1, function2, function3, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m109788j(C31241c viewState, Function1 onNavigationEvent, Function1 onViewEvent, Function1 onAnalyticsEvent, String inviteCode, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(277295471);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(inviteCode) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            c28655q.m87138X();
        } else if (viewState.getIsLoading()) {
            c28655q.m87150e0(1687572604);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        } else {
            Object[] objArr = true;
            if (viewState.getIsError()) {
                c28655q.m87150e0(1687945193);
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                if ((i14 & 112) != 32) {
                    objArr = false;
                }
                Object objM87133R = c28655q.m87133R();
                if (objArr != false || objM87133R == C28635l.f115821a) {
                    objM87133R = new C32458i(onNavigationEvent, 25);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (viewState.getData() != null) {
                c28655q.m87150e0(1688368436);
                m109784f(viewState.getData(), onNavigationEvent, onViewEvent, onAnalyticsEvent, inviteCode, c28655q, 65520 & i14);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1688650195);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34789b((Object) viewState, (Object) onNavigationEvent, (Object) onViewEvent, (Object) onAnalyticsEvent, (Object) inviteCode, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m109789k(Function1 function1) {
        function1.invoke(InterfaceC30292a.a.f123895a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m109790l(C31241c c31241c, Function1 function1, Function1 function2, Function1 function3, String str, int i13, Composer composer, int i14) {
        m109788j(c31241c, function1, function2, function3, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

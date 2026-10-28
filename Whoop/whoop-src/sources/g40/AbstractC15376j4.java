package g40;

import a31.C0341c;
import am2.C1008b;
import am2.C1023i0;
import android.content.Context;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.input.key.AbstractC1128a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aw0.C2108h;
import b30.C2564l1;
import b30.C2609r;
import bc3.InterfaceC2994c0;
import bg0.C3226h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import d40.AbstractC11673r;
import d40.C11662g;
import dc1.C11906c;
import fd3.C14408a;
import fw0.C14833a;
import g11.C15218b;
import g20.C15270p;
import h02.C16587n0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j93.AbstractC21478l0;
import j93.InterfaceC21467g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23459e;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15067l1;
import p163g1.AbstractC15170v4;
import p163g1.C14970c1;
import p163g1.C15043i8;
import p163g1.C15069l3;
import p163g1.C15123q7;
import p163g1.C15197y1;
import p164g2.C15247s;
import p164g2.InterfaceC15237i;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22949e;
import p291l0.C22994r1;
import p294l3.C23283u0;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28592a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p412q3.C29891y;
import p412q3.InterfaceC29873g0;
import p510u0.C34348q0;
import p510u0.C34351r0;
import p547v8.AbstractC35785b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import se.AbstractC32410a;
import se.AbstractC32411b;
import te0.AbstractC33745d;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g40.j4 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC15376j4 {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f57805a = new C28674u2(C15346e4.f57661w);

    /* JADX INFO: renamed from: a */
    public static final void m43585a(final List list, final boolean z4, Composer composer, final int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2067380269);
        if ((((c28655q.m87157i(list) ? 4 : 2) | i13 | (c28655q.m87155h(z4) ? 32 : 16)) & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            if (list.isEmpty()) {
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i14 = 0;
                    c28677v1M87180u.f115982d = new InterfaceC4351m(list, i13, z4, i14) { // from class: g40.b4

                        /* JADX INFO: renamed from: w */
                        public final /* synthetic */ int f57597w;

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ List f57598x;

                        /* JADX INFO: renamed from: y */
                        public final /* synthetic */ boolean f57599y;

                        {
                            this.f57597w = i14;
                            this.f57599y = z4;
                        }

                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int i15 = this.f57597w;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i15) {
                                case 0:
                                    AbstractC15376j4.m43585a(this.f57598x, this.f57599y, composer2, AbstractC28683x.m87244L(1));
                                    break;
                                default:
                                    AbstractC15376j4.m43585a(this.f57598x, this.f57599y, composer2, AbstractC28683x.m87244L(1));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    return;
                }
                return;
            }
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C28592a0 c28592a0 = new C28592a0(AbstractC28683x.m87262p(c28655q));
                c28655q.m87172p0(c28592a0);
                objM87133R = c28592a0;
            }
            InterfaceC2994c0 interfaceC2994c0 = ((C28592a0) objM87133R).f115706w;
            boolean zBooleanValue = ((Boolean) c28655q.m87161k(AbstractC11673r.f37716h)).booleanValue();
            Object objM74096F0 = AbstractC25265s.m74096F0(list);
            c28655q.m87150e0(790385189);
            boolean zM87155h = c28655q.m87155h(zBooleanValue) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(list);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87155h || objM87133R2 == c28676v0) {
                objM87133R2 = new C15123q7(zBooleanValue, interfaceC2994c0, list, (InterfaceC30057d) null);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC29125c.m88520b((C15411q3) AbstractC28683x.m87233A(c28655q, (InterfaceC4351m) objM87133R2, objM74096F0).getValue(), null, null, null, AbstractC37817c.m121344e(2089412202, c28655q, new C15340d4(z4, 0)), c28655q, 24576, 14);
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            final int i15 = 1;
            c28677v1M87180u2.f115982d = new InterfaceC4351m(list, i13, z4, i15) { // from class: g40.b4

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ int f57597w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ List f57598x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ boolean f57599y;

                {
                    this.f57597w = i15;
                    this.f57599y = z4;
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = this.f57597w;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i16) {
                        case 0:
                            AbstractC15376j4.m43585a(this.f57598x, this.f57599y, composer2, AbstractC28683x.m87244L(1));
                            break;
                        default:
                            AbstractC15376j4.m43585a(this.f57598x, this.f57599y, composer2, AbstractC28683x.m87244L(1));
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43586b(AbstractC15416r3 abstractC15416r3, boolean z4, Function1 function1, Composer composer, int i13) {
        boolean z13 = z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-310096182);
        int i14 = i13 | (c28655q.m87153g(abstractC15416r3) ? 4 : 2) | (c28655q.m87155h(z13) ? 32 : 16) | (c28655q.m87157i(function1) ? 256 : 128);
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C22949e c22949e = AbstractC22977m.f90650a;
            C2306l c2306l = C2299e.f9107J;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 0);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (abstractC15416r3 instanceof C15411q3) {
                c28655q.m87150e0(-1078737087);
                m43592h((C15411q3) abstractC15416r3, z13, null, c28655q, i14 & 112, 4);
                c28655q.m87173q(false);
                z13 = z4;
            } else if (abstractC15416r3 instanceof C15406p3) {
                c28655q.m87150e0(-1078613490);
                Modifier modifierM3394p = AbstractC1099a.m3394p(10, c2314t);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 0);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c28655q.m87150e0(-906940245);
                C15406p3 c15406p3 = (C15406p3) abstractC15416r3;
                Iterator it = c15406p3.f57870a.iterator();
                while (it.hasNext()) {
                    m43592h((C15411q3) it.next(), z4, null, c28655q, i14 & 112, 4);
                }
                z13 = z4;
                c28655q.m87173q(false);
                m43585a(c15406p3.f57871b, z13, c28655q, i14 & 112);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                z13 = z4;
                if (!(abstractC15416r3 instanceof C15401o3)) {
                    throw AbstractC11895b.m32003v(-450441415, c28655q, false);
                }
                c28655q.m87150e0(-1078294097);
                m43591g((C15401o3) abstractC15416r3, z13, function1, c28655q, i14 & MessageListItemViewType.GIPHY);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0341c(abstractC15416r3, z13, function1, i13, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0160  */
    /* JADX WARN: Code duplicated, block: B:103:0x0164  */
    /* JADX WARN: Code duplicated, block: B:105:0x016c  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01de  */
    /* JADX WARN: Code duplicated, block: B:112:0x0244 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x024b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0282  */
    /* JADX WARN: Code duplicated, block: B:121:0x0299  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:128:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:134:0x030b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0312 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x0314  */
    /* JADX WARN: Code duplicated, block: B:141:0x0374  */
    /* JADX WARN: Code duplicated, block: B:143:0x037a  */
    /* JADX WARN: Code duplicated, block: B:149:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x038e  */
    /* JADX WARN: Code duplicated, block: B:153:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:154:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:163:0x044e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x0450  */
    /* JADX WARN: Code duplicated, block: B:167:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x047c  */
    /* JADX WARN: Code duplicated, block: B:171:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:177:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:180:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:181:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:184:0x04e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:191:0x0535  */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0109  */
    /* JADX WARN: Code duplicated, block: B:88:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0125  */
    /* JADX WARN: Code duplicated, block: B:90:0x0128  */
    /* JADX WARN: Code duplicated, block: B:93:0x0135  */
    /* JADX WARN: Code duplicated, block: B:96:0x0149  */
    /* JADX WARN: Code duplicated, block: B:98:0x0155  */
    /* JADX INFO: renamed from: c */
    public static final void m43587c(final InterfaceC15391m3 textFieldController, final boolean z4, final int i13, Modifier modifier, Function1 function1, int i14, int i15, C15247s c15247s, boolean z13, boolean z14, Composer composer, final int i16, final int i17) {
        int i18;
        Modifier modifier2;
        int i19;
        int i24;
        C15247s c15247s2;
        int i25;
        int i26;
        boolean z15;
        int i27;
        int i28;
        boolean z16;
        int i29;
        int i34;
        C28676v0 c28676v0;
        Modifier modifier3;
        Object objM87133R;
        Function1 function2;
        int i35;
        boolean z17;
        int i36;
        int i37;
        boolean z18;
        Object objM87133R2;
        InterfaceC15237i interfaceC15237i;
        Function1 function3;
        InterfaceC28601c1 interfaceC28601c1M83597t;
        int i38;
        InterfaceC28601c1 interfaceC28601c1M83597t2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c1M83597t3;
        boolean zM87153g;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c2;
        Function1 function4;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM94759h;
        InterfaceC28601c1 interfaceC28601c4;
        Context context;
        InterfaceC28601c1 interfaceC28601c5;
        int i39;
        C23283u0 c23283u0;
        long jM60431f;
        int i44;
        boolean z19;
        Object objM87133R6;
        boolean zM87153g2;
        Object objM87133R7;
        boolean z24;
        boolean z25;
        Object objM87133R8;
        boolean z26;
        boolean zM87157i;
        Object objM87133R9;
        boolean zM87157i2;
        Object objM87133R10;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objM87133R11;
        Function1 function5;
        C28655q c28655q;
        final Function1 function6;
        final int i45;
        final C15247s c15247s3;
        final boolean z34;
        final boolean z35;
        final Modifier modifier4;
        final int i46;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(textFieldController, "textFieldController");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1949869177);
        if ((i16 & 6) == 0) {
            i18 = ((i16 & 8) == 0 ? c28655q2.m87153g(textFieldController) : c28655q2.m87157i(textFieldController) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 |= c28655q2.m87149e(i13) ? 256 : 128;
        }
        int i47 = i17 & 8;
        if (i47 == 0) {
            if ((i16 & 3072) == 0) {
                modifier2 = modifier;
                i18 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i19 = i18 | 24576;
            if ((196608 & i16) == 0) {
                i19 = 90112 | i18;
            }
            if ((1572864 & i16) == 0) {
                i19 |= 524288;
            }
            i24 = i17 & 128;
            if (i24 != 0) {
                if ((12582912 & i16) == 0) {
                    c15247s2 = c15247s;
                    if (c28655q2.m87153g(c15247s2)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i19 |= i25;
                }
                i26 = i17 & 256;
                if (i26 != 0) {
                    if ((100663296 & i16) == 0) {
                        z15 = z13;
                        if (c28655q2.m87155h(z15)) {
                            i27 = 67108864;
                        } else {
                            i27 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i19 |= i27;
                    }
                    i28 = i17 & 512;
                    if (i28 != 0) {
                        i19 |= 805306368;
                        z16 = z14;
                    } else {
                        z16 = z14;
                        if ((i16 & 805306368) == 0) {
                            if (c28655q2.m87155h(z16)) {
                                i29 = 536870912;
                            } else {
                                i29 = 268435456;
                            }
                            i19 |= i29;
                        }
                    }
                    if ((i19 & 306783379) == 306783378 || !c28655q2.m87121F()) {
                        c28655q2.m87140Z();
                        i34 = i16 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i34 != 0 || c28655q2.m87118C()) {
                            if (i47 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier2;
                            }
                            c28655q2.m87150e0(2088962976);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C15449y1(7);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function2 = (Function1) objM87133R;
                            c28655q2.m87173q(false);
                            i35 = i19 & (-4128769);
                            if (i24 != 0) {
                                c28655q2.m87150e0(2088968539);
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                                }
                                c15247s2 = (C15247s) objM87133R2;
                                c28655q2.m87173q(false);
                            }
                            if (i26 != 0) {
                                z15 = true;
                            }
                            if (i28 != 0) {
                                i36 = 1;
                                z17 = true;
                            } else {
                                z17 = z16;
                                i36 = 1;
                            }
                            i37 = 2;
                            z18 = z15;
                        } else {
                            c28655q2.m87138X();
                            function2 = function1;
                            i35 = i19 & (-4128769);
                            modifier3 = modifier2;
                            i36 = i14;
                            z17 = z16;
                            z18 = z15;
                            i37 = i15;
                        }
                        c28655q2.m87175r();
                        interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                        function3 = function2;
                        interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                        i38 = i35;
                        InterfaceC28601c1 interfaceC28601c1M83597t4 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                        InterfaceC28601c1 interfaceC28601c1M83597t5 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                        InterfaceC28601c1 interfaceC28601c1M83597t6 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                        interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                        InterfaceC28601c1 interfaceC28601c1M83597t7 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                        InterfaceC28601c1 interfaceC28601c1M83597t8 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                        Object[] objArr = new Object[0];
                        c28655q2.m87150e0(2088992823);
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C14833a(25);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        c28655q2.m87173q(false);
                        interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                        interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                        InterfaceC28601c1 interfaceC28601c1M83597t9 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                        InterfaceC28601c1 interfaceC28601c1M83597t10 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                        InterfaceC15421s3 interfaceC15421s3 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                        c28655q2.m87150e0(2089001433);
                        zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                        objM87133R4 = c28655q2.m87133R();
                        if (!zM87153g || objM87133R4 == c28676v0) {
                            objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                            interfaceC28601c2 = interfaceC28601c1M83597t3;
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            interfaceC28601c2 = interfaceC28601c1M83597t3;
                        }
                        c28655q2.m87173q(false);
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s3);
                        function4 = (Function1) c28655q2.m87161k(f57805a);
                        c28655q2.m87150e0(2089012023);
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                        if (objM94759h == c28676v0) {
                            objM94759h = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM94759h);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                        c28655q2.m87173q(false);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        interfaceC28601c5 = interfaceC28601c2;
                        String str = (String) interfaceC28601c1M83597t.getValue();
                        i39 = i36;
                        c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                        if (c23283u0 != null) {
                            jM60431f = c23283u0.f92253a;
                        } else {
                            int length = ((String) interfaceC28601c1M83597t.getValue()).length();
                            jM60431f = AbstractC21478l0.m60431f(length, length);
                        }
                        C29891y c29891y = new C29891y(str, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                        boolean zBooleanValue = ((Boolean) interfaceC28601c1M83597t6.getValue()).booleanValue();
                        c28655q2.m87150e0(2089044360);
                        i44 = i38 & 14;
                        if (i44 != 4 || ((i38 & 8) != 0 && c28655q2.m87157i(textFieldController))) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R6 = c28655q2.m87133R();
                        if (z19 || objM87133R6 == c28676v0) {
                            objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        InterfaceC21467g interfaceC21467g = (InterfaceC21467g) objM87133R6;
                        c28655q2.m87173q(false);
                        Modifier modifierM3494b = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                        int i48 = i38 << 3;
                        Modifier modifier5 = modifier3;
                        c28655q2.m87150e0(-1079542001);
                        List listM118960L = AbstractC37056f.m118960L(textFieldController.mo43565k());
                        int i49 = i37;
                        c28655q2.m87150e0(558058687);
                        zM87153g2 = ((((i48 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i48 & 48) == 32) | c28655q2.m87153g(function4);
                        objM87133R7 = c28655q2.m87133R();
                        if (zM87153g2 || objM87133R7 == c28676v0) {
                            objM87133R7 = new C14408a(19, textFieldController, function4);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM110153n = AbstractC34924m.m110153n(modifierM3494b, listM118960L, (Function1) objM87133R7, c28655q2, 0);
                        c28655q2.m87173q(false);
                        Modifier modifierM3483b = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                        c28655q2.m87150e0(2089063762);
                        boolean zM87153g3 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                        if ((i38 & 1879048192) == 536870912) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zM87153g3 | z24;
                        objM87133R8 = c28655q2.m87133R();
                        if (!z25 || objM87133R8 == c28676v0) {
                            z26 = z17;
                            objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            z26 = z17;
                        }
                        c28655q2.m87173q(false);
                        Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3483b, false, (Function1) objM87133R8);
                        String strM113396S = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t9.getValue(), c28655q2);
                        boolean zMo43567m = textFieldController.mo43567m();
                        String str2 = (String) interfaceC28601c1M83597t8.getValue();
                        AbstractC15416r3 abstractC15416r3 = (AbstractC15416r3) interfaceC28601c1M83597t4.getValue();
                        boolean zBooleanValue2 = ((Boolean) interfaceC28601c1M83597t5.getValue()).booleanValue();
                        InterfaceC15361h1 interfaceC15361h1 = (InterfaceC15361h1) interfaceC28601c1M83597t10.getValue();
                        InterfaceC29873g0 interfaceC29873g0 = (InterfaceC29873g0) interfaceC28601c1M83597t7.getValue();
                        EnumC39181m layoutDirection = textFieldController.getLayoutDirection();
                        C34351r0 c34351r0 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                        c28655q2.m87150e0(2089097627);
                        zM87157i = c28655q2.m87157i(interfaceC15237i);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i || objM87133R9 == c28676v0) {
                            objM87133R9 = new C2564l1(interfaceC15237i, 8);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        Function1 function7 = (Function1) objM87133R9;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(2089094350);
                        zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i2 || objM87133R10 == c28676v0) {
                            objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        c28655q2.m87173q(false);
                        C34348q0 c34348q0 = new C34348q0(function7, (Function1) objM87133R10, null, null, 58);
                        c28655q2.m87150e0(2089025901);
                        boolean zM87153g4 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                        if (i44 != 4 || ((i38 & 8) != 0 && c28655q2.m87157i(textFieldController))) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        boolean z36 = zM87153g4 | z27;
                        if ((i38 & 57344) == 16384) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = z36 | z28;
                        objM87133R11 = c28655q2.m87133R();
                        if (!z29 || objM87133R11 == c28676v0) {
                            objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                            function5 = function3;
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            function5 = function3;
                        }
                        c28655q2.m87173q(false);
                        c28655q = c28655q2;
                        m43590f(c29891y, z4, zBooleanValue, strM113396S, str2, abstractC15416r3, zMo43567m, zBooleanValue2, interfaceC15361h1, z18, modifierM51775c, interfaceC29873g0, layoutDirection, c34351r0, c34348q0, (Function1) objM87133R11, (Function1) interfaceC21467g, c28655q, i48 & 1879048192);
                        function6 = function5;
                        i45 = i39;
                        c15247s3 = c15247s2;
                        z34 = z26;
                        z35 = z18;
                        modifier4 = modifier5;
                        i46 = i49;
                    } else {
                        c28655q2.m87138X();
                        function6 = function1;
                        i45 = i14;
                        c28655q = c28655q2;
                        modifier4 = modifier2;
                        c15247s3 = c15247s2;
                        z35 = z15;
                        z34 = z16;
                        i46 = i15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.c4
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC15376j4.m43587c(textFieldController, z4, i13, modifier4, function6, i45, i46, c15247s3, z35, z34, (Composer) obj, AbstractC28683x.m87244L(i16 | 1), i17);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i19 |= 100663296;
                z15 = z13;
                i28 = i17 & 512;
                if (i28 != 0) {
                    i19 |= 805306368;
                    z16 = z14;
                } else {
                    z16 = z14;
                    if ((i16 & 805306368) == 0) {
                        if (c28655q2.m87155h(z16)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i19 |= i29;
                    }
                }
                if ((i19 & 306783379) == 306783378) {
                    c28655q2.m87140Z();
                    i34 = i16 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    } else {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    }
                    c28655q2.m87175r();
                    interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    function3 = function2;
                    interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                    i38 = i35;
                    InterfaceC28601c1 interfaceC28601c1M83597t11 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t12 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t13 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                    interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t14 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t15 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                    Object[] objArr2 = new Object[0];
                    c28655q2.m87150e0(2088992823);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C14833a(25);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q2.m87173q(false);
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr2, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                    interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t16 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t17 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                    InterfaceC15421s3 interfaceC15421s4 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                    c28655q2.m87150e0(2089001433);
                    zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c28655q2.m87173q(false);
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s4);
                    function4 = (Function1) c28655q2.m87161k(f57805a);
                    c28655q2.m87150e0(2089012023);
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                    if (objM94759h == c28676v0) {
                        objM94759h = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM94759h);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                    c28655q2.m87173q(false);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    interfaceC28601c5 = interfaceC28601c2;
                    String str3 = (String) interfaceC28601c1M83597t.getValue();
                    i39 = i36;
                    c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                    if (c23283u0 != null) {
                        jM60431f = c23283u0.f92253a;
                    } else {
                        int length2 = ((String) interfaceC28601c1M83597t.getValue()).length();
                        jM60431f = AbstractC21478l0.m60431f(length2, length2);
                    }
                    C29891y c29891y2 = new C29891y(str3, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                    boolean zBooleanValue3 = ((Boolean) interfaceC28601c1M83597t13.getValue()).booleanValue();
                    c28655q2.m87150e0(2089044360);
                    i44 = i38 & 14;
                    if (i44 != 4) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (z19) {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC21467g interfaceC21467g2 = (InterfaceC21467g) objM87133R6;
                    c28655q2.m87173q(false);
                    Modifier modifierM3494b2 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                    int i410 = i38 << 3;
                    Modifier modifier6 = modifier3;
                    c28655q2.m87150e0(-1079542001);
                    List listM118960L2 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                    int i411 = i37;
                    c28655q2.m87150e0(558058687);
                    zM87153g2 = ((((i410 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i410 & 48) == 32) | c28655q2.m87153g(function4);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM110153n2 = AbstractC34924m.m110153n(modifierM3494b2, listM118960L2, (Function1) objM87133R7, c28655q2, 0);
                    c28655q2.m87173q(false);
                    Modifier modifierM3483b2 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n2, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                    c28655q2.m87150e0(2089063762);
                    boolean zM87153g5 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                    if ((i38 & 1879048192) == 536870912) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87153g5 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM3483b2, false, (Function1) objM87133R8);
                    String strM113396S2 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t16.getValue(), c28655q2);
                    boolean zMo43567m2 = textFieldController.mo43567m();
                    String str4 = (String) interfaceC28601c1M83597t15.getValue();
                    AbstractC15416r3 abstractC15416r4 = (AbstractC15416r3) interfaceC28601c1M83597t11.getValue();
                    boolean zBooleanValue4 = ((Boolean) interfaceC28601c1M83597t12.getValue()).booleanValue();
                    InterfaceC15361h1 interfaceC15361h2 = (InterfaceC15361h1) interfaceC28601c1M83597t17.getValue();
                    InterfaceC29873g0 interfaceC29873g1 = (InterfaceC29873g0) interfaceC28601c1M83597t14.getValue();
                    EnumC39181m layoutDirection2 = textFieldController.getLayoutDirection();
                    C34351r0 c34351r1 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                    c28655q2.m87150e0(2089097627);
                    zM87157i = c28655q2.m87157i(interfaceC15237i);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    Function1 function8 = (Function1) objM87133R9;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(2089094350);
                    zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q2.m87173q(false);
                    C34348q0 c34348q1 = new C34348q0(function8, (Function1) objM87133R10, null, null, 58);
                    c28655q2.m87150e0(2089025901);
                    boolean zM87153g6 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                    if (i44 != 4) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    boolean z37 = zM87153g6 | z27;
                    if ((i38 & 57344) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z37 | z28;
                    objM87133R11 = c28655q2.m87133R();
                    if (z29) {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                    m43590f(c29891y2, z4, zBooleanValue3, strM113396S2, str4, abstractC15416r4, zMo43567m2, zBooleanValue4, interfaceC15361h2, z18, modifierM51775c2, interfaceC29873g1, layoutDirection2, c34351r1, c34348q1, (Function1) objM87133R11, (Function1) interfaceC21467g2, c28655q, i410 & 1879048192);
                    function6 = function5;
                    i45 = i39;
                    c15247s3 = c15247s2;
                    z34 = z26;
                    z35 = z18;
                    modifier4 = modifier6;
                    i46 = i411;
                } else {
                    c28655q2.m87140Z();
                    i34 = i16 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    } else {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    }
                    c28655q2.m87175r();
                    interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    function3 = function2;
                    interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                    i38 = i35;
                    InterfaceC28601c1 interfaceC28601c1M83597t18 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t19 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t110 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                    interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t111 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t112 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                    Object[] objArr3 = new Object[0];
                    c28655q2.m87150e0(2088992823);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C14833a(25);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q2.m87173q(false);
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr3, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                    interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t113 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t114 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                    InterfaceC15421s3 interfaceC15421s5 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                    c28655q2.m87150e0(2089001433);
                    zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c28655q2.m87173q(false);
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s5);
                    function4 = (Function1) c28655q2.m87161k(f57805a);
                    c28655q2.m87150e0(2089012023);
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                    if (objM94759h == c28676v0) {
                        objM94759h = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM94759h);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                    c28655q2.m87173q(false);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    interfaceC28601c5 = interfaceC28601c2;
                    String str5 = (String) interfaceC28601c1M83597t.getValue();
                    i39 = i36;
                    c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                    if (c23283u0 != null) {
                        jM60431f = c23283u0.f92253a;
                    } else {
                        int length3 = ((String) interfaceC28601c1M83597t.getValue()).length();
                        jM60431f = AbstractC21478l0.m60431f(length3, length3);
                    }
                    C29891y c29891y3 = new C29891y(str5, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                    boolean zBooleanValue5 = ((Boolean) interfaceC28601c1M83597t110.getValue()).booleanValue();
                    c28655q2.m87150e0(2089044360);
                    i44 = i38 & 14;
                    if (i44 != 4) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (z19) {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC21467g interfaceC21467g3 = (InterfaceC21467g) objM87133R6;
                    c28655q2.m87173q(false);
                    Modifier modifierM3494b3 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                    int i412 = i38 << 3;
                    Modifier modifier7 = modifier3;
                    c28655q2.m87150e0(-1079542001);
                    List listM118960L3 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                    int i413 = i37;
                    c28655q2.m87150e0(558058687);
                    zM87153g2 = ((((i412 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i412 & 48) == 32) | c28655q2.m87153g(function4);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM110153n3 = AbstractC34924m.m110153n(modifierM3494b3, listM118960L3, (Function1) objM87133R7, c28655q2, 0);
                    c28655q2.m87173q(false);
                    Modifier modifierM3483b3 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n3, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                    c28655q2.m87150e0(2089063762);
                    boolean zM87153g7 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                    if ((i38 & 1879048192) == 536870912) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87153g7 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM51775c3 = AbstractC18032n.m51775c(modifierM3483b3, false, (Function1) objM87133R8);
                    String strM113396S3 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t113.getValue(), c28655q2);
                    boolean zMo43567m3 = textFieldController.mo43567m();
                    String str6 = (String) interfaceC28601c1M83597t112.getValue();
                    AbstractC15416r3 abstractC15416r5 = (AbstractC15416r3) interfaceC28601c1M83597t18.getValue();
                    boolean zBooleanValue6 = ((Boolean) interfaceC28601c1M83597t19.getValue()).booleanValue();
                    InterfaceC15361h1 interfaceC15361h3 = (InterfaceC15361h1) interfaceC28601c1M83597t114.getValue();
                    InterfaceC29873g0 interfaceC29873g2 = (InterfaceC29873g0) interfaceC28601c1M83597t111.getValue();
                    EnumC39181m layoutDirection3 = textFieldController.getLayoutDirection();
                    C34351r0 c34351r2 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                    c28655q2.m87150e0(2089097627);
                    zM87157i = c28655q2.m87157i(interfaceC15237i);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    Function1 function9 = (Function1) objM87133R9;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(2089094350);
                    zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q2.m87173q(false);
                    C34348q0 c34348q2 = new C34348q0(function9, (Function1) objM87133R10, null, null, 58);
                    c28655q2.m87150e0(2089025901);
                    boolean zM87153g8 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                    if (i44 != 4) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    boolean z38 = zM87153g8 | z27;
                    if ((i38 & 57344) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z38 | z28;
                    objM87133R11 = c28655q2.m87133R();
                    if (z29) {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                    m43590f(c29891y3, z4, zBooleanValue5, strM113396S3, str6, abstractC15416r5, zMo43567m3, zBooleanValue6, interfaceC15361h3, z18, modifierM51775c3, interfaceC29873g2, layoutDirection3, c34351r2, c34348q2, (Function1) objM87133R11, (Function1) interfaceC21467g3, c28655q, i412 & 1879048192);
                    function6 = function5;
                    i45 = i39;
                    c15247s3 = c15247s2;
                    z34 = z26;
                    z35 = z18;
                    modifier4 = modifier7;
                    i46 = i413;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.c4
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC15376j4.m43587c(textFieldController, z4, i13, modifier4, function6, i45, i46, c15247s3, z35, z34, (Composer) obj, AbstractC28683x.m87244L(i16 | 1), i17);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i19 |= 12582912;
            c15247s2 = c15247s;
            i26 = i17 & 256;
            if (i26 != 0) {
                if ((100663296 & i16) == 0) {
                    z15 = z13;
                    if (c28655q2.m87155h(z15)) {
                        i27 = 67108864;
                    } else {
                        i27 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i19 |= i27;
                }
                i28 = i17 & 512;
                if (i28 != 0) {
                    i19 |= 805306368;
                    z16 = z14;
                } else {
                    z16 = z14;
                    if ((i16 & 805306368) == 0) {
                        if (c28655q2.m87155h(z16)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i19 |= i29;
                    }
                }
                if ((i19 & 306783379) == 306783378) {
                    c28655q2.m87140Z();
                    i34 = i16 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    } else {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    }
                    c28655q2.m87175r();
                    interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    function3 = function2;
                    interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                    i38 = i35;
                    InterfaceC28601c1 interfaceC28601c1M83597t115 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t116 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t117 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                    interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t118 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t119 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                    Object[] objArr4 = new Object[0];
                    c28655q2.m87150e0(2088992823);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C14833a(25);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q2.m87173q(false);
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr4, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                    interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1110 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1111 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                    InterfaceC15421s3 interfaceC15421s6 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                    c28655q2.m87150e0(2089001433);
                    zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c28655q2.m87173q(false);
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s6);
                    function4 = (Function1) c28655q2.m87161k(f57805a);
                    c28655q2.m87150e0(2089012023);
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                    if (objM94759h == c28676v0) {
                        objM94759h = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM94759h);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                    c28655q2.m87173q(false);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    interfaceC28601c5 = interfaceC28601c2;
                    String str7 = (String) interfaceC28601c1M83597t.getValue();
                    i39 = i36;
                    c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                    if (c23283u0 != null) {
                        jM60431f = c23283u0.f92253a;
                    } else {
                        int length4 = ((String) interfaceC28601c1M83597t.getValue()).length();
                        jM60431f = AbstractC21478l0.m60431f(length4, length4);
                    }
                    C29891y c29891y4 = new C29891y(str7, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                    boolean zBooleanValue7 = ((Boolean) interfaceC28601c1M83597t117.getValue()).booleanValue();
                    c28655q2.m87150e0(2089044360);
                    i44 = i38 & 14;
                    if (i44 != 4) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (z19) {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC21467g interfaceC21467g4 = (InterfaceC21467g) objM87133R6;
                    c28655q2.m87173q(false);
                    Modifier modifierM3494b4 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                    int i414 = i38 << 3;
                    Modifier modifier8 = modifier3;
                    c28655q2.m87150e0(-1079542001);
                    List listM118960L4 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                    int i415 = i37;
                    c28655q2.m87150e0(558058687);
                    zM87153g2 = ((((i414 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i414 & 48) == 32) | c28655q2.m87153g(function4);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM110153n4 = AbstractC34924m.m110153n(modifierM3494b4, listM118960L4, (Function1) objM87133R7, c28655q2, 0);
                    c28655q2.m87173q(false);
                    Modifier modifierM3483b4 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n4, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                    c28655q2.m87150e0(2089063762);
                    boolean zM87153g9 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                    if ((i38 & 1879048192) == 536870912) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87153g9 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM51775c4 = AbstractC18032n.m51775c(modifierM3483b4, false, (Function1) objM87133R8);
                    String strM113396S4 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t1110.getValue(), c28655q2);
                    boolean zMo43567m4 = textFieldController.mo43567m();
                    String str8 = (String) interfaceC28601c1M83597t119.getValue();
                    AbstractC15416r3 abstractC15416r6 = (AbstractC15416r3) interfaceC28601c1M83597t115.getValue();
                    boolean zBooleanValue8 = ((Boolean) interfaceC28601c1M83597t116.getValue()).booleanValue();
                    InterfaceC15361h1 interfaceC15361h4 = (InterfaceC15361h1) interfaceC28601c1M83597t1111.getValue();
                    InterfaceC29873g0 interfaceC29873g3 = (InterfaceC29873g0) interfaceC28601c1M83597t118.getValue();
                    EnumC39181m layoutDirection4 = textFieldController.getLayoutDirection();
                    C34351r0 c34351r3 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                    c28655q2.m87150e0(2089097627);
                    zM87157i = c28655q2.m87157i(interfaceC15237i);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    Function1 function10 = (Function1) objM87133R9;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(2089094350);
                    zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q2.m87173q(false);
                    C34348q0 c34348q3 = new C34348q0(function10, (Function1) objM87133R10, null, null, 58);
                    c28655q2.m87150e0(2089025901);
                    boolean zM87153g10 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                    if (i44 != 4) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    boolean z39 = zM87153g10 | z27;
                    if ((i38 & 57344) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z39 | z28;
                    objM87133R11 = c28655q2.m87133R();
                    if (z29) {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                    m43590f(c29891y4, z4, zBooleanValue7, strM113396S4, str8, abstractC15416r6, zMo43567m4, zBooleanValue8, interfaceC15361h4, z18, modifierM51775c4, interfaceC29873g3, layoutDirection4, c34351r3, c34348q3, (Function1) objM87133R11, (Function1) interfaceC21467g4, c28655q, i414 & 1879048192);
                    function6 = function5;
                    i45 = i39;
                    c15247s3 = c15247s2;
                    z34 = z26;
                    z35 = z18;
                    modifier4 = modifier8;
                    i46 = i415;
                } else {
                    c28655q2.m87140Z();
                    i34 = i16 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    } else {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    }
                    c28655q2.m87175r();
                    interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    function3 = function2;
                    interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                    i38 = i35;
                    InterfaceC28601c1 interfaceC28601c1M83597t1112 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1113 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1114 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                    interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1115 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1116 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                    Object[] objArr5 = new Object[0];
                    c28655q2.m87150e0(2088992823);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C14833a(25);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q2.m87173q(false);
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr5, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                    interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1117 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1118 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                    InterfaceC15421s3 interfaceC15421s7 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                    c28655q2.m87150e0(2089001433);
                    zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c28655q2.m87173q(false);
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s7);
                    function4 = (Function1) c28655q2.m87161k(f57805a);
                    c28655q2.m87150e0(2089012023);
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                    if (objM94759h == c28676v0) {
                        objM94759h = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM94759h);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                    c28655q2.m87173q(false);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    interfaceC28601c5 = interfaceC28601c2;
                    String str9 = (String) interfaceC28601c1M83597t.getValue();
                    i39 = i36;
                    c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                    if (c23283u0 != null) {
                        jM60431f = c23283u0.f92253a;
                    } else {
                        int length5 = ((String) interfaceC28601c1M83597t.getValue()).length();
                        jM60431f = AbstractC21478l0.m60431f(length5, length5);
                    }
                    C29891y c29891y5 = new C29891y(str9, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                    boolean zBooleanValue9 = ((Boolean) interfaceC28601c1M83597t1114.getValue()).booleanValue();
                    c28655q2.m87150e0(2089044360);
                    i44 = i38 & 14;
                    if (i44 != 4) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (z19) {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC21467g interfaceC21467g5 = (InterfaceC21467g) objM87133R6;
                    c28655q2.m87173q(false);
                    Modifier modifierM3494b5 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                    int i416 = i38 << 3;
                    Modifier modifier9 = modifier3;
                    c28655q2.m87150e0(-1079542001);
                    List listM118960L5 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                    int i417 = i37;
                    c28655q2.m87150e0(558058687);
                    zM87153g2 = ((((i416 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i416 & 48) == 32) | c28655q2.m87153g(function4);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM110153n5 = AbstractC34924m.m110153n(modifierM3494b5, listM118960L5, (Function1) objM87133R7, c28655q2, 0);
                    c28655q2.m87173q(false);
                    Modifier modifierM3483b5 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n5, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                    c28655q2.m87150e0(2089063762);
                    boolean zM87153g11 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                    if ((i38 & 1879048192) == 536870912) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87153g11 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM51775c5 = AbstractC18032n.m51775c(modifierM3483b5, false, (Function1) objM87133R8);
                    String strM113396S5 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t1117.getValue(), c28655q2);
                    boolean zMo43567m5 = textFieldController.mo43567m();
                    String str10 = (String) interfaceC28601c1M83597t1116.getValue();
                    AbstractC15416r3 abstractC15416r7 = (AbstractC15416r3) interfaceC28601c1M83597t1112.getValue();
                    boolean zBooleanValue10 = ((Boolean) interfaceC28601c1M83597t1113.getValue()).booleanValue();
                    InterfaceC15361h1 interfaceC15361h5 = (InterfaceC15361h1) interfaceC28601c1M83597t1118.getValue();
                    InterfaceC29873g0 interfaceC29873g4 = (InterfaceC29873g0) interfaceC28601c1M83597t1115.getValue();
                    EnumC39181m layoutDirection5 = textFieldController.getLayoutDirection();
                    C34351r0 c34351r4 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                    c28655q2.m87150e0(2089097627);
                    zM87157i = c28655q2.m87157i(interfaceC15237i);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    Function1 function11 = (Function1) objM87133R9;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(2089094350);
                    zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q2.m87173q(false);
                    C34348q0 c34348q4 = new C34348q0(function11, (Function1) objM87133R10, null, null, 58);
                    c28655q2.m87150e0(2089025901);
                    boolean zM87153g12 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                    if (i44 != 4) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    boolean z310 = zM87153g12 | z27;
                    if ((i38 & 57344) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z310 | z28;
                    objM87133R11 = c28655q2.m87133R();
                    if (z29) {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                    m43590f(c29891y5, z4, zBooleanValue9, strM113396S5, str10, abstractC15416r7, zMo43567m5, zBooleanValue10, interfaceC15361h5, z18, modifierM51775c5, interfaceC29873g4, layoutDirection5, c34351r4, c34348q4, (Function1) objM87133R11, (Function1) interfaceC21467g5, c28655q, i416 & 1879048192);
                    function6 = function5;
                    i45 = i39;
                    c15247s3 = c15247s2;
                    z34 = z26;
                    z35 = z18;
                    modifier4 = modifier9;
                    i46 = i417;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.c4
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC15376j4.m43587c(textFieldController, z4, i13, modifier4, function6, i45, i46, c15247s3, z35, z34, (Composer) obj, AbstractC28683x.m87244L(i16 | 1), i17);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i19 |= 100663296;
            z15 = z13;
            i28 = i17 & 512;
            if (i28 != 0) {
                i19 |= 805306368;
                z16 = z14;
            } else {
                z16 = z14;
                if ((i16 & 805306368) == 0) {
                    if (c28655q2.m87155h(z16)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i19 |= i29;
                }
            }
            if ((i19 & 306783379) == 306783378) {
                c28655q2.m87140Z();
                i34 = i16 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                } else {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                }
                c28655q2.m87175r();
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                function3 = function2;
                interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                i38 = i35;
                InterfaceC28601c1 interfaceC28601c1M83597t1119 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11110 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11111 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11112 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11113 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                Object[] objArr6 = new Object[0];
                c28655q2.m87150e0(2088992823);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C14833a(25);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q2.m87173q(false);
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr6, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11114 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11115 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                InterfaceC15421s3 interfaceC15421s8 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                c28655q2.m87150e0(2089001433);
                zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                }
                c28655q2.m87173q(false);
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s8);
                function4 = (Function1) c28655q2.m87161k(f57805a);
                c28655q2.m87150e0(2089012023);
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                if (objM94759h == c28676v0) {
                    objM94759h = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM94759h);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                c28655q2.m87173q(false);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                interfaceC28601c5 = interfaceC28601c2;
                String str11 = (String) interfaceC28601c1M83597t.getValue();
                i39 = i36;
                c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                if (c23283u0 != null) {
                    jM60431f = c23283u0.f92253a;
                } else {
                    int length6 = ((String) interfaceC28601c1M83597t.getValue()).length();
                    jM60431f = AbstractC21478l0.m60431f(length6, length6);
                }
                C29891y c29891y6 = new C29891y(str11, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                boolean zBooleanValue11 = ((Boolean) interfaceC28601c1M83597t11111.getValue()).booleanValue();
                c28655q2.m87150e0(2089044360);
                i44 = i38 & 14;
                if (i44 != 4) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                objM87133R6 = c28655q2.m87133R();
                if (z19) {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC21467g interfaceC21467g6 = (InterfaceC21467g) objM87133R6;
                c28655q2.m87173q(false);
                Modifier modifierM3494b6 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                int i418 = i38 << 3;
                Modifier modifier10 = modifier3;
                c28655q2.m87150e0(-1079542001);
                List listM118960L6 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                int i419 = i37;
                c28655q2.m87150e0(558058687);
                zM87153g2 = ((((i418 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i418 & 48) == 32) | c28655q2.m87153g(function4);
                objM87133R7 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                }
                c28655q2.m87173q(false);
                Modifier modifierM110153n6 = AbstractC34924m.m110153n(modifierM3494b6, listM118960L6, (Function1) objM87133R7, c28655q2, 0);
                c28655q2.m87173q(false);
                Modifier modifierM3483b6 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n6, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                c28655q2.m87150e0(2089063762);
                boolean zM87153g13 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                if ((i38 & 1879048192) == 536870912) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87153g13 | z24;
                objM87133R8 = c28655q2.m87133R();
                if (z25) {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                }
                c28655q2.m87173q(false);
                Modifier modifierM51775c6 = AbstractC18032n.m51775c(modifierM3483b6, false, (Function1) objM87133R8);
                String strM113396S6 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t11114.getValue(), c28655q2);
                boolean zMo43567m6 = textFieldController.mo43567m();
                String str12 = (String) interfaceC28601c1M83597t11113.getValue();
                AbstractC15416r3 abstractC15416r8 = (AbstractC15416r3) interfaceC28601c1M83597t1119.getValue();
                boolean zBooleanValue12 = ((Boolean) interfaceC28601c1M83597t11110.getValue()).booleanValue();
                InterfaceC15361h1 interfaceC15361h6 = (InterfaceC15361h1) interfaceC28601c1M83597t11115.getValue();
                InterfaceC29873g0 interfaceC29873g5 = (InterfaceC29873g0) interfaceC28601c1M83597t11112.getValue();
                EnumC39181m layoutDirection6 = textFieldController.getLayoutDirection();
                C34351r0 c34351r5 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                c28655q2.m87150e0(2089097627);
                zM87157i = c28655q2.m87157i(interfaceC15237i);
                objM87133R9 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                }
                Function1 function12 = (Function1) objM87133R9;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(2089094350);
                zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q2.m87173q(false);
                C34348q0 c34348q5 = new C34348q0(function12, (Function1) objM87133R10, null, null, 58);
                c28655q2.m87150e0(2089025901);
                boolean zM87153g14 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                if (i44 != 4) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                boolean z311 = zM87153g14 | z27;
                if ((i38 & 57344) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z311 | z28;
                objM87133R11 = c28655q2.m87133R();
                if (z29) {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                }
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                m43590f(c29891y6, z4, zBooleanValue11, strM113396S6, str12, abstractC15416r8, zMo43567m6, zBooleanValue12, interfaceC15361h6, z18, modifierM51775c6, interfaceC29873g5, layoutDirection6, c34351r5, c34348q5, (Function1) objM87133R11, (Function1) interfaceC21467g6, c28655q, i418 & 1879048192);
                function6 = function5;
                i45 = i39;
                c15247s3 = c15247s2;
                z34 = z26;
                z35 = z18;
                modifier4 = modifier10;
                i46 = i419;
            } else {
                c28655q2.m87140Z();
                i34 = i16 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                } else {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                }
                c28655q2.m87175r();
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                function3 = function2;
                interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                i38 = i35;
                InterfaceC28601c1 interfaceC28601c1M83597t11116 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11117 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11118 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11119 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t111110 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                Object[] objArr7 = new Object[0];
                c28655q2.m87150e0(2088992823);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C14833a(25);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q2.m87173q(false);
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr7, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t111111 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t111112 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                InterfaceC15421s3 interfaceC15421s9 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                c28655q2.m87150e0(2089001433);
                zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                }
                c28655q2.m87173q(false);
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s9);
                function4 = (Function1) c28655q2.m87161k(f57805a);
                c28655q2.m87150e0(2089012023);
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                if (objM94759h == c28676v0) {
                    objM94759h = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM94759h);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                c28655q2.m87173q(false);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                interfaceC28601c5 = interfaceC28601c2;
                String str13 = (String) interfaceC28601c1M83597t.getValue();
                i39 = i36;
                c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                if (c23283u0 != null) {
                    jM60431f = c23283u0.f92253a;
                } else {
                    int length7 = ((String) interfaceC28601c1M83597t.getValue()).length();
                    jM60431f = AbstractC21478l0.m60431f(length7, length7);
                }
                C29891y c29891y7 = new C29891y(str13, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                boolean zBooleanValue13 = ((Boolean) interfaceC28601c1M83597t11118.getValue()).booleanValue();
                c28655q2.m87150e0(2089044360);
                i44 = i38 & 14;
                if (i44 != 4) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                objM87133R6 = c28655q2.m87133R();
                if (z19) {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC21467g interfaceC21467g7 = (InterfaceC21467g) objM87133R6;
                c28655q2.m87173q(false);
                Modifier modifierM3494b7 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                int i4110 = i38 << 3;
                Modifier modifier11 = modifier3;
                c28655q2.m87150e0(-1079542001);
                List listM118960L7 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                int i4111 = i37;
                c28655q2.m87150e0(558058687);
                zM87153g2 = ((((i4110 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i4110 & 48) == 32) | c28655q2.m87153g(function4);
                objM87133R7 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                }
                c28655q2.m87173q(false);
                Modifier modifierM110153n7 = AbstractC34924m.m110153n(modifierM3494b7, listM118960L7, (Function1) objM87133R7, c28655q2, 0);
                c28655q2.m87173q(false);
                Modifier modifierM3483b7 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n7, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                c28655q2.m87150e0(2089063762);
                boolean zM87153g15 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                if ((i38 & 1879048192) == 536870912) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87153g15 | z24;
                objM87133R8 = c28655q2.m87133R();
                if (z25) {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                }
                c28655q2.m87173q(false);
                Modifier modifierM51775c7 = AbstractC18032n.m51775c(modifierM3483b7, false, (Function1) objM87133R8);
                String strM113396S7 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t111111.getValue(), c28655q2);
                boolean zMo43567m7 = textFieldController.mo43567m();
                String str14 = (String) interfaceC28601c1M83597t111110.getValue();
                AbstractC15416r3 abstractC15416r9 = (AbstractC15416r3) interfaceC28601c1M83597t11116.getValue();
                boolean zBooleanValue14 = ((Boolean) interfaceC28601c1M83597t11117.getValue()).booleanValue();
                InterfaceC15361h1 interfaceC15361h7 = (InterfaceC15361h1) interfaceC28601c1M83597t111112.getValue();
                InterfaceC29873g0 interfaceC29873g6 = (InterfaceC29873g0) interfaceC28601c1M83597t11119.getValue();
                EnumC39181m layoutDirection7 = textFieldController.getLayoutDirection();
                C34351r0 c34351r6 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                c28655q2.m87150e0(2089097627);
                zM87157i = c28655q2.m87157i(interfaceC15237i);
                objM87133R9 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                }
                Function1 function13 = (Function1) objM87133R9;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(2089094350);
                zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q2.m87173q(false);
                C34348q0 c34348q6 = new C34348q0(function13, (Function1) objM87133R10, null, null, 58);
                c28655q2.m87150e0(2089025901);
                boolean zM87153g16 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                if (i44 != 4) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                boolean z312 = zM87153g16 | z27;
                if ((i38 & 57344) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z312 | z28;
                objM87133R11 = c28655q2.m87133R();
                if (z29) {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                }
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                m43590f(c29891y7, z4, zBooleanValue13, strM113396S7, str14, abstractC15416r9, zMo43567m7, zBooleanValue14, interfaceC15361h7, z18, modifierM51775c7, interfaceC29873g6, layoutDirection7, c34351r6, c34348q6, (Function1) objM87133R11, (Function1) interfaceC21467g7, c28655q, i4110 & 1879048192);
                function6 = function5;
                i45 = i39;
                c15247s3 = c15247s2;
                z34 = z26;
                z35 = z18;
                modifier4 = modifier11;
                i46 = i4111;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.c4
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC15376j4.m43587c(textFieldController, z4, i13, modifier4, function6, i45, i46, c15247s3, z35, z34, (Composer) obj, AbstractC28683x.m87244L(i16 | 1), i17);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i18 |= 3072;
        modifier2 = modifier;
        i19 = i18 | 24576;
        if ((196608 & i16) == 0) {
            i19 = 90112 | i18;
        }
        if ((1572864 & i16) == 0) {
            i19 |= 524288;
        }
        i24 = i17 & 128;
        if (i24 != 0) {
            if ((12582912 & i16) == 0) {
                c15247s2 = c15247s;
                if (c28655q2.m87153g(c15247s2)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i19 |= i25;
            }
            i26 = i17 & 256;
            if (i26 != 0) {
                if ((100663296 & i16) == 0) {
                    z15 = z13;
                    if (c28655q2.m87155h(z15)) {
                        i27 = 67108864;
                    } else {
                        i27 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i19 |= i27;
                }
                i28 = i17 & 512;
                if (i28 != 0) {
                    i19 |= 805306368;
                    z16 = z14;
                } else {
                    z16 = z14;
                    if ((i16 & 805306368) == 0) {
                        if (c28655q2.m87155h(z16)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i19 |= i29;
                    }
                }
                if ((i19 & 306783379) == 306783378) {
                    c28655q2.m87140Z();
                    i34 = i16 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    } else {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    }
                    c28655q2.m87175r();
                    interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    function3 = function2;
                    interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                    i38 = i35;
                    InterfaceC28601c1 interfaceC28601c1M83597t111113 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t111114 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t111115 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                    interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t111116 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t111117 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                    Object[] objArr8 = new Object[0];
                    c28655q2.m87150e0(2088992823);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C14833a(25);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q2.m87173q(false);
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr8, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                    interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t111118 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t111119 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                    InterfaceC15421s3 interfaceC15421s10 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                    c28655q2.m87150e0(2089001433);
                    zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c28655q2.m87173q(false);
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s10);
                    function4 = (Function1) c28655q2.m87161k(f57805a);
                    c28655q2.m87150e0(2089012023);
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                    if (objM94759h == c28676v0) {
                        objM94759h = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM94759h);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                    c28655q2.m87173q(false);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    interfaceC28601c5 = interfaceC28601c2;
                    String str15 = (String) interfaceC28601c1M83597t.getValue();
                    i39 = i36;
                    c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                    if (c23283u0 != null) {
                        jM60431f = c23283u0.f92253a;
                    } else {
                        int length8 = ((String) interfaceC28601c1M83597t.getValue()).length();
                        jM60431f = AbstractC21478l0.m60431f(length8, length8);
                    }
                    C29891y c29891y8 = new C29891y(str15, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                    boolean zBooleanValue15 = ((Boolean) interfaceC28601c1M83597t111115.getValue()).booleanValue();
                    c28655q2.m87150e0(2089044360);
                    i44 = i38 & 14;
                    if (i44 != 4) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (z19) {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC21467g interfaceC21467g8 = (InterfaceC21467g) objM87133R6;
                    c28655q2.m87173q(false);
                    Modifier modifierM3494b8 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                    int i4112 = i38 << 3;
                    Modifier modifier12 = modifier3;
                    c28655q2.m87150e0(-1079542001);
                    List listM118960L8 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                    int i4113 = i37;
                    c28655q2.m87150e0(558058687);
                    zM87153g2 = ((((i4112 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i4112 & 48) == 32) | c28655q2.m87153g(function4);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM110153n8 = AbstractC34924m.m110153n(modifierM3494b8, listM118960L8, (Function1) objM87133R7, c28655q2, 0);
                    c28655q2.m87173q(false);
                    Modifier modifierM3483b8 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n8, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                    c28655q2.m87150e0(2089063762);
                    boolean zM87153g17 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                    if ((i38 & 1879048192) == 536870912) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87153g17 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM51775c8 = AbstractC18032n.m51775c(modifierM3483b8, false, (Function1) objM87133R8);
                    String strM113396S8 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t111118.getValue(), c28655q2);
                    boolean zMo43567m8 = textFieldController.mo43567m();
                    String str16 = (String) interfaceC28601c1M83597t111117.getValue();
                    AbstractC15416r3 abstractC15416r10 = (AbstractC15416r3) interfaceC28601c1M83597t111113.getValue();
                    boolean zBooleanValue16 = ((Boolean) interfaceC28601c1M83597t111114.getValue()).booleanValue();
                    InterfaceC15361h1 interfaceC15361h8 = (InterfaceC15361h1) interfaceC28601c1M83597t111119.getValue();
                    InterfaceC29873g0 interfaceC29873g7 = (InterfaceC29873g0) interfaceC28601c1M83597t111116.getValue();
                    EnumC39181m layoutDirection8 = textFieldController.getLayoutDirection();
                    C34351r0 c34351r7 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                    c28655q2.m87150e0(2089097627);
                    zM87157i = c28655q2.m87157i(interfaceC15237i);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    Function1 function14 = (Function1) objM87133R9;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(2089094350);
                    zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q2.m87173q(false);
                    C34348q0 c34348q7 = new C34348q0(function14, (Function1) objM87133R10, null, null, 58);
                    c28655q2.m87150e0(2089025901);
                    boolean zM87153g18 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                    if (i44 != 4) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    boolean z313 = zM87153g18 | z27;
                    if ((i38 & 57344) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z313 | z28;
                    objM87133R11 = c28655q2.m87133R();
                    if (z29) {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                    m43590f(c29891y8, z4, zBooleanValue15, strM113396S8, str16, abstractC15416r10, zMo43567m8, zBooleanValue16, interfaceC15361h8, z18, modifierM51775c8, interfaceC29873g7, layoutDirection8, c34351r7, c34348q7, (Function1) objM87133R11, (Function1) interfaceC21467g8, c28655q, i4112 & 1879048192);
                    function6 = function5;
                    i45 = i39;
                    c15247s3 = c15247s2;
                    z34 = z26;
                    z35 = z18;
                    modifier4 = modifier12;
                    i46 = i4113;
                } else {
                    c28655q2.m87140Z();
                    i34 = i16 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    } else {
                        if (i47 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        c28655q2.m87150e0(2088962976);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15449y1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                        c28655q2.m87173q(false);
                        i35 = i19 & (-4128769);
                        if (i24 != 0) {
                            c28655q2.m87150e0(2088968539);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                            }
                            c15247s2 = (C15247s) objM87133R2;
                            c28655q2.m87173q(false);
                        }
                        if (i26 != 0) {
                            z15 = true;
                        }
                        if (i28 != 0) {
                            i36 = 1;
                            z17 = true;
                        } else {
                            z17 = z16;
                            i36 = 1;
                        }
                        i37 = 2;
                        z18 = z15;
                    }
                    c28655q2.m87175r();
                    interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    function3 = function2;
                    interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                    i38 = i35;
                    InterfaceC28601c1 interfaceC28601c1M83597t1111110 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1111111 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1111112 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                    interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1111113 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1111114 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                    Object[] objArr9 = new Object[0];
                    c28655q2.m87150e0(2088992823);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C14833a(25);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q2.m87173q(false);
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr9, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                    interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1111115 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                    InterfaceC28601c1 interfaceC28601c1M83597t1111116 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                    InterfaceC15421s3 interfaceC15421s11 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                    c28655q2.m87150e0(2089001433);
                    zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                        interfaceC28601c2 = interfaceC28601c1M83597t3;
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c28655q2.m87173q(false);
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s11);
                    function4 = (Function1) c28655q2.m87161k(f57805a);
                    c28655q2.m87150e0(2089012023);
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                    if (objM94759h == c28676v0) {
                        objM94759h = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM94759h);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                    c28655q2.m87173q(false);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    interfaceC28601c5 = interfaceC28601c2;
                    String str17 = (String) interfaceC28601c1M83597t.getValue();
                    i39 = i36;
                    c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                    if (c23283u0 != null) {
                        jM60431f = c23283u0.f92253a;
                    } else {
                        int length9 = ((String) interfaceC28601c1M83597t.getValue()).length();
                        jM60431f = AbstractC21478l0.m60431f(length9, length9);
                    }
                    C29891y c29891y9 = new C29891y(str17, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                    boolean zBooleanValue17 = ((Boolean) interfaceC28601c1M83597t1111112.getValue()).booleanValue();
                    c28655q2.m87150e0(2089044360);
                    i44 = i38 & 14;
                    if (i44 != 4) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (z19) {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC21467g interfaceC21467g9 = (InterfaceC21467g) objM87133R6;
                    c28655q2.m87173q(false);
                    Modifier modifierM3494b9 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                    int i4114 = i38 << 3;
                    Modifier modifier13 = modifier3;
                    c28655q2.m87150e0(-1079542001);
                    List listM118960L9 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                    int i4115 = i37;
                    c28655q2.m87150e0(558058687);
                    zM87153g2 = ((((i4114 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i4114 & 48) == 32) | c28655q2.m87153g(function4);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C14408a(19, textFieldController, function4);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM110153n9 = AbstractC34924m.m110153n(modifierM3494b9, listM118960L9, (Function1) objM87133R7, c28655q2, 0);
                    c28655q2.m87173q(false);
                    Modifier modifierM3483b9 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n9, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                    c28655q2.m87150e0(2089063762);
                    boolean zM87153g19 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                    if ((i38 & 1879048192) == 536870912) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87153g19 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        z26 = z17;
                        objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    c28655q2.m87173q(false);
                    Modifier modifierM51775c9 = AbstractC18032n.m51775c(modifierM3483b9, false, (Function1) objM87133R8);
                    String strM113396S9 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t1111115.getValue(), c28655q2);
                    boolean zMo43567m9 = textFieldController.mo43567m();
                    String str18 = (String) interfaceC28601c1M83597t1111114.getValue();
                    AbstractC15416r3 abstractC15416r11 = (AbstractC15416r3) interfaceC28601c1M83597t1111110.getValue();
                    boolean zBooleanValue18 = ((Boolean) interfaceC28601c1M83597t1111111.getValue()).booleanValue();
                    InterfaceC15361h1 interfaceC15361h9 = (InterfaceC15361h1) interfaceC28601c1M83597t1111116.getValue();
                    InterfaceC29873g0 interfaceC29873g8 = (InterfaceC29873g0) interfaceC28601c1M83597t1111113.getValue();
                    EnumC39181m layoutDirection9 = textFieldController.getLayoutDirection();
                    C34351r0 c34351r8 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                    c28655q2.m87150e0(2089097627);
                    zM87157i = c28655q2.m87157i(interfaceC15237i);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C2564l1(interfaceC15237i, 8);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    Function1 function15 = (Function1) objM87133R9;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(2089094350);
                    zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q2.m87173q(false);
                    C34348q0 c34348q8 = new C34348q0(function15, (Function1) objM87133R10, null, null, 58);
                    c28655q2.m87150e0(2089025901);
                    boolean zM87153g110 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                    if (i44 != 4) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    boolean z314 = zM87153g110 | z27;
                    if ((i38 & 57344) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z314 | z28;
                    objM87133R11 = c28655q2.m87133R();
                    if (z29) {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                        function5 = function3;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                    m43590f(c29891y9, z4, zBooleanValue17, strM113396S9, str18, abstractC15416r11, zMo43567m9, zBooleanValue18, interfaceC15361h9, z18, modifierM51775c9, interfaceC29873g8, layoutDirection9, c34351r8, c34348q8, (Function1) objM87133R11, (Function1) interfaceC21467g9, c28655q, i4114 & 1879048192);
                    function6 = function5;
                    i45 = i39;
                    c15247s3 = c15247s2;
                    z34 = z26;
                    z35 = z18;
                    modifier4 = modifier13;
                    i46 = i4115;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.c4
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC15376j4.m43587c(textFieldController, z4, i13, modifier4, function6, i45, i46, c15247s3, z35, z34, (Composer) obj, AbstractC28683x.m87244L(i16 | 1), i17);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i19 |= 100663296;
            z15 = z13;
            i28 = i17 & 512;
            if (i28 != 0) {
                i19 |= 805306368;
                z16 = z14;
            } else {
                z16 = z14;
                if ((i16 & 805306368) == 0) {
                    if (c28655q2.m87155h(z16)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i19 |= i29;
                }
            }
            if ((i19 & 306783379) == 306783378) {
                c28655q2.m87140Z();
                i34 = i16 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                } else {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                }
                c28655q2.m87175r();
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                function3 = function2;
                interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                i38 = i35;
                InterfaceC28601c1 interfaceC28601c1M83597t1111117 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t1111118 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t1111119 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11111110 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11111111 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                Object[] objArr10 = new Object[0];
                c28655q2.m87150e0(2088992823);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C14833a(25);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q2.m87173q(false);
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr10, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11111112 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11111113 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                InterfaceC15421s3 interfaceC15421s12 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                c28655q2.m87150e0(2089001433);
                zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                }
                c28655q2.m87173q(false);
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s12);
                function4 = (Function1) c28655q2.m87161k(f57805a);
                c28655q2.m87150e0(2089012023);
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                if (objM94759h == c28676v0) {
                    objM94759h = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM94759h);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                c28655q2.m87173q(false);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                interfaceC28601c5 = interfaceC28601c2;
                String str19 = (String) interfaceC28601c1M83597t.getValue();
                i39 = i36;
                c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                if (c23283u0 != null) {
                    jM60431f = c23283u0.f92253a;
                } else {
                    int length10 = ((String) interfaceC28601c1M83597t.getValue()).length();
                    jM60431f = AbstractC21478l0.m60431f(length10, length10);
                }
                C29891y c29891y10 = new C29891y(str19, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                boolean zBooleanValue19 = ((Boolean) interfaceC28601c1M83597t1111119.getValue()).booleanValue();
                c28655q2.m87150e0(2089044360);
                i44 = i38 & 14;
                if (i44 != 4) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                objM87133R6 = c28655q2.m87133R();
                if (z19) {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC21467g interfaceC21467g10 = (InterfaceC21467g) objM87133R6;
                c28655q2.m87173q(false);
                Modifier modifierM3494b10 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                int i4116 = i38 << 3;
                Modifier modifier14 = modifier3;
                c28655q2.m87150e0(-1079542001);
                List listM118960L10 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                int i4117 = i37;
                c28655q2.m87150e0(558058687);
                zM87153g2 = ((((i4116 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i4116 & 48) == 32) | c28655q2.m87153g(function4);
                objM87133R7 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                }
                c28655q2.m87173q(false);
                Modifier modifierM110153n10 = AbstractC34924m.m110153n(modifierM3494b10, listM118960L10, (Function1) objM87133R7, c28655q2, 0);
                c28655q2.m87173q(false);
                Modifier modifierM3483b10 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n10, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                c28655q2.m87150e0(2089063762);
                boolean zM87153g111 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                if ((i38 & 1879048192) == 536870912) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87153g111 | z24;
                objM87133R8 = c28655q2.m87133R();
                if (z25) {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                }
                c28655q2.m87173q(false);
                Modifier modifierM51775c10 = AbstractC18032n.m51775c(modifierM3483b10, false, (Function1) objM87133R8);
                String strM113396S10 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t11111112.getValue(), c28655q2);
                boolean zMo43567m10 = textFieldController.mo43567m();
                String str110 = (String) interfaceC28601c1M83597t11111111.getValue();
                AbstractC15416r3 abstractC15416r12 = (AbstractC15416r3) interfaceC28601c1M83597t1111117.getValue();
                boolean zBooleanValue110 = ((Boolean) interfaceC28601c1M83597t1111118.getValue()).booleanValue();
                InterfaceC15361h1 interfaceC15361h10 = (InterfaceC15361h1) interfaceC28601c1M83597t11111113.getValue();
                InterfaceC29873g0 interfaceC29873g9 = (InterfaceC29873g0) interfaceC28601c1M83597t11111110.getValue();
                EnumC39181m layoutDirection10 = textFieldController.getLayoutDirection();
                C34351r0 c34351r9 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                c28655q2.m87150e0(2089097627);
                zM87157i = c28655q2.m87157i(interfaceC15237i);
                objM87133R9 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                }
                Function1 function16 = (Function1) objM87133R9;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(2089094350);
                zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q2.m87173q(false);
                C34348q0 c34348q9 = new C34348q0(function16, (Function1) objM87133R10, null, null, 58);
                c28655q2.m87150e0(2089025901);
                boolean zM87153g112 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                if (i44 != 4) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                boolean z315 = zM87153g112 | z27;
                if ((i38 & 57344) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z315 | z28;
                objM87133R11 = c28655q2.m87133R();
                if (z29) {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                }
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                m43590f(c29891y10, z4, zBooleanValue19, strM113396S10, str110, abstractC15416r12, zMo43567m10, zBooleanValue110, interfaceC15361h10, z18, modifierM51775c10, interfaceC29873g9, layoutDirection10, c34351r9, c34348q9, (Function1) objM87133R11, (Function1) interfaceC21467g10, c28655q, i4116 & 1879048192);
                function6 = function5;
                i45 = i39;
                c15247s3 = c15247s2;
                z34 = z26;
                z35 = z18;
                modifier4 = modifier14;
                i46 = i4117;
            } else {
                c28655q2.m87140Z();
                i34 = i16 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                } else {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                }
                c28655q2.m87175r();
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                function3 = function2;
                interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                i38 = i35;
                InterfaceC28601c1 interfaceC28601c1M83597t11111114 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11111115 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11111116 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11111117 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11111118 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                Object[] objArr11 = new Object[0];
                c28655q2.m87150e0(2088992823);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C14833a(25);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q2.m87173q(false);
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr11, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t11111119 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t111111110 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                InterfaceC15421s3 interfaceC15421s13 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                c28655q2.m87150e0(2089001433);
                zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                }
                c28655q2.m87173q(false);
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s13);
                function4 = (Function1) c28655q2.m87161k(f57805a);
                c28655q2.m87150e0(2089012023);
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                if (objM94759h == c28676v0) {
                    objM94759h = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM94759h);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                c28655q2.m87173q(false);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                interfaceC28601c5 = interfaceC28601c2;
                String str111 = (String) interfaceC28601c1M83597t.getValue();
                i39 = i36;
                c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                if (c23283u0 != null) {
                    jM60431f = c23283u0.f92253a;
                } else {
                    int length11 = ((String) interfaceC28601c1M83597t.getValue()).length();
                    jM60431f = AbstractC21478l0.m60431f(length11, length11);
                }
                C29891y c29891y11 = new C29891y(str111, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                boolean zBooleanValue111 = ((Boolean) interfaceC28601c1M83597t11111116.getValue()).booleanValue();
                c28655q2.m87150e0(2089044360);
                i44 = i38 & 14;
                if (i44 != 4) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                objM87133R6 = c28655q2.m87133R();
                if (z19) {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC21467g interfaceC21467g11 = (InterfaceC21467g) objM87133R6;
                c28655q2.m87173q(false);
                Modifier modifierM3494b11 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                int i4118 = i38 << 3;
                Modifier modifier15 = modifier3;
                c28655q2.m87150e0(-1079542001);
                List listM118960L11 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                int i4119 = i37;
                c28655q2.m87150e0(558058687);
                zM87153g2 = ((((i4118 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i4118 & 48) == 32) | c28655q2.m87153g(function4);
                objM87133R7 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                }
                c28655q2.m87173q(false);
                Modifier modifierM110153n11 = AbstractC34924m.m110153n(modifierM3494b11, listM118960L11, (Function1) objM87133R7, c28655q2, 0);
                c28655q2.m87173q(false);
                Modifier modifierM3483b11 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n11, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                c28655q2.m87150e0(2089063762);
                boolean zM87153g113 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                if ((i38 & 1879048192) == 536870912) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87153g113 | z24;
                objM87133R8 = c28655q2.m87133R();
                if (z25) {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                }
                c28655q2.m87173q(false);
                Modifier modifierM51775c11 = AbstractC18032n.m51775c(modifierM3483b11, false, (Function1) objM87133R8);
                String strM113396S11 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t11111119.getValue(), c28655q2);
                boolean zMo43567m11 = textFieldController.mo43567m();
                String str112 = (String) interfaceC28601c1M83597t11111118.getValue();
                AbstractC15416r3 abstractC15416r13 = (AbstractC15416r3) interfaceC28601c1M83597t11111114.getValue();
                boolean zBooleanValue112 = ((Boolean) interfaceC28601c1M83597t11111115.getValue()).booleanValue();
                InterfaceC15361h1 interfaceC15361h11 = (InterfaceC15361h1) interfaceC28601c1M83597t111111110.getValue();
                InterfaceC29873g0 interfaceC29873g10 = (InterfaceC29873g0) interfaceC28601c1M83597t11111117.getValue();
                EnumC39181m layoutDirection11 = textFieldController.getLayoutDirection();
                C34351r0 c34351r10 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                c28655q2.m87150e0(2089097627);
                zM87157i = c28655q2.m87157i(interfaceC15237i);
                objM87133R9 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                }
                Function1 function17 = (Function1) objM87133R9;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(2089094350);
                zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q2.m87173q(false);
                C34348q0 c34348q10 = new C34348q0(function17, (Function1) objM87133R10, null, null, 58);
                c28655q2.m87150e0(2089025901);
                boolean zM87153g114 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                if (i44 != 4) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                boolean z316 = zM87153g114 | z27;
                if ((i38 & 57344) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z316 | z28;
                objM87133R11 = c28655q2.m87133R();
                if (z29) {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                }
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                m43590f(c29891y11, z4, zBooleanValue111, strM113396S11, str112, abstractC15416r13, zMo43567m11, zBooleanValue112, interfaceC15361h11, z18, modifierM51775c11, interfaceC29873g10, layoutDirection11, c34351r10, c34348q10, (Function1) objM87133R11, (Function1) interfaceC21467g11, c28655q, i4118 & 1879048192);
                function6 = function5;
                i45 = i39;
                c15247s3 = c15247s2;
                z34 = z26;
                z35 = z18;
                modifier4 = modifier15;
                i46 = i4119;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.c4
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC15376j4.m43587c(textFieldController, z4, i13, modifier4, function6, i45, i46, c15247s3, z35, z34, (Composer) obj, AbstractC28683x.m87244L(i16 | 1), i17);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i19 |= 12582912;
        c15247s2 = c15247s;
        i26 = i17 & 256;
        if (i26 != 0) {
            if ((100663296 & i16) == 0) {
                z15 = z13;
                if (c28655q2.m87155h(z15)) {
                    i27 = 67108864;
                } else {
                    i27 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i19 |= i27;
            }
            i28 = i17 & 512;
            if (i28 != 0) {
                i19 |= 805306368;
                z16 = z14;
            } else {
                z16 = z14;
                if ((i16 & 805306368) == 0) {
                    if (c28655q2.m87155h(z16)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i19 |= i29;
                }
            }
            if ((i19 & 306783379) == 306783378) {
                c28655q2.m87140Z();
                i34 = i16 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                } else {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                }
                c28655q2.m87175r();
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                function3 = function2;
                interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                i38 = i35;
                InterfaceC28601c1 interfaceC28601c1M83597t111111111 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t111111112 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t111111113 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t111111114 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t111111115 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                Object[] objArr12 = new Object[0];
                c28655q2.m87150e0(2088992823);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C14833a(25);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q2.m87173q(false);
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr12, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t111111116 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t111111117 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                InterfaceC15421s3 interfaceC15421s14 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                c28655q2.m87150e0(2089001433);
                zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                }
                c28655q2.m87173q(false);
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s14);
                function4 = (Function1) c28655q2.m87161k(f57805a);
                c28655q2.m87150e0(2089012023);
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                if (objM94759h == c28676v0) {
                    objM94759h = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM94759h);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                c28655q2.m87173q(false);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                interfaceC28601c5 = interfaceC28601c2;
                String str113 = (String) interfaceC28601c1M83597t.getValue();
                i39 = i36;
                c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                if (c23283u0 != null) {
                    jM60431f = c23283u0.f92253a;
                } else {
                    int length12 = ((String) interfaceC28601c1M83597t.getValue()).length();
                    jM60431f = AbstractC21478l0.m60431f(length12, length12);
                }
                C29891y c29891y12 = new C29891y(str113, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                boolean zBooleanValue113 = ((Boolean) interfaceC28601c1M83597t111111113.getValue()).booleanValue();
                c28655q2.m87150e0(2089044360);
                i44 = i38 & 14;
                if (i44 != 4) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                objM87133R6 = c28655q2.m87133R();
                if (z19) {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC21467g interfaceC21467g12 = (InterfaceC21467g) objM87133R6;
                c28655q2.m87173q(false);
                Modifier modifierM3494b12 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                int i41110 = i38 << 3;
                Modifier modifier16 = modifier3;
                c28655q2.m87150e0(-1079542001);
                List listM118960L12 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                int i41111 = i37;
                c28655q2.m87150e0(558058687);
                zM87153g2 = ((((i41110 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i41110 & 48) == 32) | c28655q2.m87153g(function4);
                objM87133R7 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                }
                c28655q2.m87173q(false);
                Modifier modifierM110153n12 = AbstractC34924m.m110153n(modifierM3494b12, listM118960L12, (Function1) objM87133R7, c28655q2, 0);
                c28655q2.m87173q(false);
                Modifier modifierM3483b12 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n12, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                c28655q2.m87150e0(2089063762);
                boolean zM87153g115 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                if ((i38 & 1879048192) == 536870912) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87153g115 | z24;
                objM87133R8 = c28655q2.m87133R();
                if (z25) {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                }
                c28655q2.m87173q(false);
                Modifier modifierM51775c12 = AbstractC18032n.m51775c(modifierM3483b12, false, (Function1) objM87133R8);
                String strM113396S12 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t111111116.getValue(), c28655q2);
                boolean zMo43567m12 = textFieldController.mo43567m();
                String str114 = (String) interfaceC28601c1M83597t111111115.getValue();
                AbstractC15416r3 abstractC15416r14 = (AbstractC15416r3) interfaceC28601c1M83597t111111111.getValue();
                boolean zBooleanValue114 = ((Boolean) interfaceC28601c1M83597t111111112.getValue()).booleanValue();
                InterfaceC15361h1 interfaceC15361h12 = (InterfaceC15361h1) interfaceC28601c1M83597t111111117.getValue();
                InterfaceC29873g0 interfaceC29873g11 = (InterfaceC29873g0) interfaceC28601c1M83597t111111114.getValue();
                EnumC39181m layoutDirection12 = textFieldController.getLayoutDirection();
                C34351r0 c34351r11 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                c28655q2.m87150e0(2089097627);
                zM87157i = c28655q2.m87157i(interfaceC15237i);
                objM87133R9 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                }
                Function1 function18 = (Function1) objM87133R9;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(2089094350);
                zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q2.m87173q(false);
                C34348q0 c34348q11 = new C34348q0(function18, (Function1) objM87133R10, null, null, 58);
                c28655q2.m87150e0(2089025901);
                boolean zM87153g116 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                if (i44 != 4) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                boolean z317 = zM87153g116 | z27;
                if ((i38 & 57344) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z317 | z28;
                objM87133R11 = c28655q2.m87133R();
                if (z29) {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                }
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                m43590f(c29891y12, z4, zBooleanValue113, strM113396S12, str114, abstractC15416r14, zMo43567m12, zBooleanValue114, interfaceC15361h12, z18, modifierM51775c12, interfaceC29873g11, layoutDirection12, c34351r11, c34348q11, (Function1) objM87133R11, (Function1) interfaceC21467g12, c28655q, i41110 & 1879048192);
                function6 = function5;
                i45 = i39;
                c15247s3 = c15247s2;
                z34 = z26;
                z35 = z18;
                modifier4 = modifier16;
                i46 = i41111;
            } else {
                c28655q2.m87140Z();
                i34 = i16 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                } else {
                    if (i47 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28655q2.m87150e0(2088962976);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15449y1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                    c28655q2.m87173q(false);
                    i35 = i19 & (-4128769);
                    if (i24 != 0) {
                        c28655q2.m87150e0(2088968539);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                        }
                        c15247s2 = (C15247s) objM87133R2;
                        c28655q2.m87173q(false);
                    }
                    if (i26 != 0) {
                        z15 = true;
                    }
                    if (i28 != 0) {
                        i36 = 1;
                        z17 = true;
                    } else {
                        z17 = z16;
                        i36 = 1;
                    }
                    i37 = 2;
                    z18 = z15;
                }
                c28655q2.m87175r();
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                function3 = function2;
                interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
                i38 = i35;
                InterfaceC28601c1 interfaceC28601c1M83597t111111118 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t111111119 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t1111111110 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
                interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t1111111111 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t1111111112 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
                Object[] objArr13 = new Object[0];
                c28655q2.m87150e0(2088992823);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C14833a(25);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q2.m87173q(false);
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr13, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
                interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t1111111113 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t1111111114 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
                InterfaceC15421s3 interfaceC15421s15 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
                c28655q2.m87150e0(2089001433);
                zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                    interfaceC28601c2 = interfaceC28601c1M83597t3;
                    c28655q2.m87172p0(objM87133R4);
                }
                c28655q2.m87173q(false);
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s15);
                function4 = (Function1) c28655q2.m87161k(f57805a);
                c28655q2.m87150e0(2089012023);
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
                if (objM94759h == c28676v0) {
                    objM94759h = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM94759h);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
                c28655q2.m87173q(false);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                interfaceC28601c5 = interfaceC28601c2;
                String str115 = (String) interfaceC28601c1M83597t.getValue();
                i39 = i36;
                c23283u0 = (C23283u0) interfaceC28601c3.getValue();
                if (c23283u0 != null) {
                    jM60431f = c23283u0.f92253a;
                } else {
                    int length13 = ((String) interfaceC28601c1M83597t.getValue()).length();
                    jM60431f = AbstractC21478l0.m60431f(length13, length13);
                }
                C29891y c29891y13 = new C29891y(str115, jM60431f, (C23283u0) interfaceC28601c4.getValue());
                boolean zBooleanValue115 = ((Boolean) interfaceC28601c1M83597t1111111110.getValue()).booleanValue();
                c28655q2.m87150e0(2089044360);
                i44 = i38 & 14;
                if (i44 != 4) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                objM87133R6 = c28655q2.m87133R();
                if (z19) {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC21467g interfaceC21467g13 = (InterfaceC21467g) objM87133R6;
                c28655q2.m87173q(false);
                Modifier modifierM3494b13 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
                int i41112 = i38 << 3;
                Modifier modifier17 = modifier3;
                c28655q2.m87150e0(-1079542001);
                List listM118960L13 = AbstractC37056f.m118960L(textFieldController.mo43565k());
                int i41113 = i37;
                c28655q2.m87150e0(558058687);
                zM87153g2 = ((((i41112 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i41112 & 48) == 32) | c28655q2.m87153g(function4);
                objM87133R7 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C14408a(19, textFieldController, function4);
                    c28655q2.m87172p0(objM87133R7);
                }
                c28655q2.m87173q(false);
                Modifier modifierM110153n13 = AbstractC34924m.m110153n(modifierM3494b13, listM118960L13, (Function1) objM87133R7, c28655q2, 0);
                c28655q2.m87173q(false);
                Modifier modifierM3483b13 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n13, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
                c28655q2.m87150e0(2089063762);
                boolean zM87153g117 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
                if ((i38 & 1879048192) == 536870912) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87153g117 | z24;
                objM87133R8 = c28655q2.m87133R();
                if (z25) {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    z26 = z17;
                    objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                    c28655q2.m87172p0(objM87133R8);
                }
                c28655q2.m87173q(false);
                Modifier modifierM51775c13 = AbstractC18032n.m51775c(modifierM3483b13, false, (Function1) objM87133R8);
                String strM113396S13 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t1111111113.getValue(), c28655q2);
                boolean zMo43567m13 = textFieldController.mo43567m();
                String str116 = (String) interfaceC28601c1M83597t1111111112.getValue();
                AbstractC15416r3 abstractC15416r15 = (AbstractC15416r3) interfaceC28601c1M83597t111111118.getValue();
                boolean zBooleanValue116 = ((Boolean) interfaceC28601c1M83597t111111119.getValue()).booleanValue();
                InterfaceC15361h1 interfaceC15361h13 = (InterfaceC15361h1) interfaceC28601c1M83597t1111111114.getValue();
                InterfaceC29873g0 interfaceC29873g12 = (InterfaceC29873g0) interfaceC28601c1M83597t1111111111.getValue();
                EnumC39181m layoutDirection13 = textFieldController.getLayoutDirection();
                C34351r0 c34351r12 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
                c28655q2.m87150e0(2089097627);
                zM87157i = c28655q2.m87157i(interfaceC15237i);
                objM87133R9 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C2564l1(interfaceC15237i, 8);
                    c28655q2.m87172p0(objM87133R9);
                }
                Function1 function19 = (Function1) objM87133R9;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(2089094350);
                zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q2.m87173q(false);
                C34348q0 c34348q12 = new C34348q0(function19, (Function1) objM87133R10, null, null, 58);
                c28655q2.m87150e0(2089025901);
                boolean zM87153g118 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
                if (i44 != 4) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                boolean z318 = zM87153g118 | z27;
                if ((i38 & 57344) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z318 | z28;
                objM87133R11 = c28655q2.m87133R();
                if (z29) {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                    function5 = function3;
                    c28655q2.m87172p0(objM87133R11);
                }
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                m43590f(c29891y13, z4, zBooleanValue115, strM113396S13, str116, abstractC15416r15, zMo43567m13, zBooleanValue116, interfaceC15361h13, z18, modifierM51775c13, interfaceC29873g12, layoutDirection13, c34351r12, c34348q12, (Function1) objM87133R11, (Function1) interfaceC21467g13, c28655q, i41112 & 1879048192);
                function6 = function5;
                i45 = i39;
                c15247s3 = c15247s2;
                z34 = z26;
                z35 = z18;
                modifier4 = modifier17;
                i46 = i41113;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.c4
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC15376j4.m43587c(textFieldController, z4, i13, modifier4, function6, i45, i46, c15247s3, z35, z34, (Composer) obj, AbstractC28683x.m87244L(i16 | 1), i17);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i19 |= 100663296;
        z15 = z13;
        i28 = i17 & 512;
        if (i28 != 0) {
            i19 |= 805306368;
            z16 = z14;
        } else {
            z16 = z14;
            if ((i16 & 805306368) == 0) {
                if (c28655q2.m87155h(z16)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i19 |= i29;
            }
        }
        if ((i19 & 306783379) == 306783378) {
            c28655q2.m87140Z();
            i34 = i16 & 1;
            c28676v0 = C28635l.f115821a;
            if (i34 != 0) {
                if (i47 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28655q2.m87150e0(2088962976);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C15449y1(7);
                    c28655q2.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
                c28655q2.m87173q(false);
                i35 = i19 & (-4128769);
                if (i24 != 0) {
                    c28655q2.m87150e0(2088968539);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                    }
                    c15247s2 = (C15247s) objM87133R2;
                    c28655q2.m87173q(false);
                }
                if (i26 != 0) {
                    z15 = true;
                }
                if (i28 != 0) {
                    i36 = 1;
                    z17 = true;
                } else {
                    z17 = z16;
                    i36 = 1;
                }
                i37 = 2;
                z18 = z15;
            } else {
                if (i47 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28655q2.m87150e0(2088962976);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C15449y1(7);
                    c28655q2.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
                c28655q2.m87173q(false);
                i35 = i19 & (-4128769);
                if (i24 != 0) {
                    c28655q2.m87150e0(2088968539);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                    }
                    c15247s2 = (C15247s) objM87133R2;
                    c28655q2.m87173q(false);
                }
                if (i26 != 0) {
                    z15 = true;
                }
                if (i28 != 0) {
                    i36 = 1;
                    z17 = true;
                } else {
                    z17 = z16;
                    i36 = 1;
                }
                i37 = 2;
                z18 = z15;
            }
            c28655q2.m87175r();
            interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            function3 = function2;
            interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
            i38 = i35;
            InterfaceC28601c1 interfaceC28601c1M83597t1111111115 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t1111111116 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t1111111117 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
            interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t1111111118 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t1111111119 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
            Object[] objArr14 = new Object[0];
            c28655q2.m87150e0(2088992823);
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C14833a(25);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q2.m87173q(false);
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr14, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
            interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t11111111110 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t11111111111 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
            InterfaceC15421s3 interfaceC15421s16 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
            c28655q2.m87150e0(2089001433);
            zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
            objM87133R4 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                interfaceC28601c2 = interfaceC28601c1M83597t3;
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                interfaceC28601c2 = interfaceC28601c1M83597t3;
                c28655q2.m87172p0(objM87133R4);
            }
            c28655q2.m87173q(false);
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s16);
            function4 = (Function1) c28655q2.m87161k(f57805a);
            c28655q2.m87150e0(2089012023);
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R5);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
            objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
            if (objM94759h == c28676v0) {
                objM94759h = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM94759h);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
            c28655q2.m87173q(false);
            context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            interfaceC28601c5 = interfaceC28601c2;
            String str117 = (String) interfaceC28601c1M83597t.getValue();
            i39 = i36;
            c23283u0 = (C23283u0) interfaceC28601c3.getValue();
            if (c23283u0 != null) {
                jM60431f = c23283u0.f92253a;
            } else {
                int length14 = ((String) interfaceC28601c1M83597t.getValue()).length();
                jM60431f = AbstractC21478l0.m60431f(length14, length14);
            }
            C29891y c29891y14 = new C29891y(str117, jM60431f, (C23283u0) interfaceC28601c4.getValue());
            boolean zBooleanValue117 = ((Boolean) interfaceC28601c1M83597t1111111117.getValue()).booleanValue();
            c28655q2.m87150e0(2089044360);
            i44 = i38 & 14;
            if (i44 != 4) {
                z19 = true;
            } else {
                z19 = true;
            }
            objM87133R6 = c28655q2.m87133R();
            if (z19) {
                objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                c28655q2.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                c28655q2.m87172p0(objM87133R6);
            }
            InterfaceC21467g interfaceC21467g14 = (InterfaceC21467g) objM87133R6;
            c28655q2.m87173q(false);
            Modifier modifierM3494b14 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
            int i41114 = i38 << 3;
            Modifier modifier18 = modifier3;
            c28655q2.m87150e0(-1079542001);
            List listM118960L14 = AbstractC37056f.m118960L(textFieldController.mo43565k());
            int i41115 = i37;
            c28655q2.m87150e0(558058687);
            zM87153g2 = ((((i41114 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i41114 & 48) == 32) | c28655q2.m87153g(function4);
            objM87133R7 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R7 = new C14408a(19, textFieldController, function4);
                c28655q2.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C14408a(19, textFieldController, function4);
                c28655q2.m87172p0(objM87133R7);
            }
            c28655q2.m87173q(false);
            Modifier modifierM110153n14 = AbstractC34924m.m110153n(modifierM3494b14, listM118960L14, (Function1) objM87133R7, c28655q2, 0);
            c28655q2.m87173q(false);
            Modifier modifierM3483b14 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n14, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
            c28655q2.m87150e0(2089063762);
            boolean zM87153g119 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
            if ((i38 & 1879048192) == 536870912) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = zM87153g119 | z24;
            objM87133R8 = c28655q2.m87133R();
            if (z25) {
                z26 = z17;
                objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                c28655q2.m87172p0(objM87133R8);
            } else {
                z26 = z17;
                objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                c28655q2.m87172p0(objM87133R8);
            }
            c28655q2.m87173q(false);
            Modifier modifierM51775c14 = AbstractC18032n.m51775c(modifierM3483b14, false, (Function1) objM87133R8);
            String strM113396S14 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t11111111110.getValue(), c28655q2);
            boolean zMo43567m14 = textFieldController.mo43567m();
            String str118 = (String) interfaceC28601c1M83597t1111111119.getValue();
            AbstractC15416r3 abstractC15416r16 = (AbstractC15416r3) interfaceC28601c1M83597t1111111115.getValue();
            boolean zBooleanValue118 = ((Boolean) interfaceC28601c1M83597t1111111116.getValue()).booleanValue();
            InterfaceC15361h1 interfaceC15361h14 = (InterfaceC15361h1) interfaceC28601c1M83597t11111111111.getValue();
            InterfaceC29873g0 interfaceC29873g13 = (InterfaceC29873g0) interfaceC28601c1M83597t1111111118.getValue();
            EnumC39181m layoutDirection14 = textFieldController.getLayoutDirection();
            C34351r0 c34351r13 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
            c28655q2.m87150e0(2089097627);
            zM87157i = c28655q2.m87157i(interfaceC15237i);
            objM87133R9 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R9 = new C2564l1(interfaceC15237i, 8);
                c28655q2.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new C2564l1(interfaceC15237i, 8);
                c28655q2.m87172p0(objM87133R9);
            }
            Function1 function110 = (Function1) objM87133R9;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(2089094350);
            zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
            objM87133R10 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                c28655q2.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                c28655q2.m87172p0(objM87133R10);
            }
            c28655q2.m87173q(false);
            C34348q0 c34348q13 = new C34348q0(function110, (Function1) objM87133R10, null, null, 58);
            c28655q2.m87150e0(2089025901);
            boolean zM87153g1110 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
            if (i44 != 4) {
                z27 = true;
            } else {
                z27 = true;
            }
            boolean z319 = zM87153g1110 | z27;
            if ((i38 & 57344) == 16384) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = z319 | z28;
            objM87133R11 = c28655q2.m87133R();
            if (z29) {
                objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                function5 = function3;
                c28655q2.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                function5 = function3;
                c28655q2.m87172p0(objM87133R11);
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            m43590f(c29891y14, z4, zBooleanValue117, strM113396S14, str118, abstractC15416r16, zMo43567m14, zBooleanValue118, interfaceC15361h14, z18, modifierM51775c14, interfaceC29873g13, layoutDirection14, c34351r13, c34348q13, (Function1) objM87133R11, (Function1) interfaceC21467g14, c28655q, i41114 & 1879048192);
            function6 = function5;
            i45 = i39;
            c15247s3 = c15247s2;
            z34 = z26;
            z35 = z18;
            modifier4 = modifier18;
            i46 = i41115;
        } else {
            c28655q2.m87140Z();
            i34 = i16 & 1;
            c28676v0 = C28635l.f115821a;
            if (i34 != 0) {
                if (i47 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28655q2.m87150e0(2088962976);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C15449y1(7);
                    c28655q2.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
                c28655q2.m87173q(false);
                i35 = i19 & (-4128769);
                if (i24 != 0) {
                    c28655q2.m87150e0(2088968539);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                    }
                    c15247s2 = (C15247s) objM87133R2;
                    c28655q2.m87173q(false);
                }
                if (i26 != 0) {
                    z15 = true;
                }
                if (i28 != 0) {
                    i36 = 1;
                    z17 = true;
                } else {
                    z17 = z16;
                    i36 = 1;
                }
                i37 = 2;
                z18 = z15;
            } else {
                if (i47 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28655q2.m87150e0(2088962976);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C15449y1(7);
                    c28655q2.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
                c28655q2.m87173q(false);
                i35 = i19 & (-4128769);
                if (i24 != 0) {
                    c28655q2.m87150e0(2088968539);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC33745d.m106649h(c28655q2);
                    }
                    c15247s2 = (C15247s) objM87133R2;
                    c28655q2.m87173q(false);
                }
                if (i26 != 0) {
                    z15 = true;
                }
                if (i28 != 0) {
                    i36 = 1;
                    z17 = true;
                } else {
                    z17 = z16;
                    i36 = 1;
                }
                i37 = 2;
                z18 = z15;
            }
            c28655q2.m87175r();
            interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            function3 = function2;
            interfaceC28601c1M83597t = C27648a.m83597t(textFieldController.mo43570p(), c28655q2, 0);
            i38 = i35;
            InterfaceC28601c1 interfaceC28601c1M83597t11111111112 = C27648a.m83597t(textFieldController.mo43557a(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t11111111113 = C27648a.m83597t(textFieldController.mo43574t(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t11111111114 = C27648a.m83597t(textFieldController.getLoading(), c28655q2, 0);
            interfaceC28601c1M83597t2 = C27648a.m83597t(textFieldController.getContentDescription(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t11111111115 = C27648a.m83597t(textFieldController.mo43560d(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t11111111116 = C27648a.m83597t(textFieldController.mo43561e(), c28655q2, 0);
            Object[] objArr15 = new Object[0];
            c28655q2.m87150e0(2088992823);
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C14833a(25);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q2.m87173q(false);
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr15, null, (InterfaceC4339a) objM87133R3, c28655q2, 3072, 6);
            interfaceC28601c1M83597t3 = C27648a.m83597t(textFieldController.mo43572r(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t11111111117 = C27648a.m83597t(textFieldController.getLabel(), c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t11111111118 = C27648a.m83597t(textFieldController.mo43544f(), c28655q2, 0);
            InterfaceC15421s3 interfaceC15421s17 = (InterfaceC15421s3) interfaceC28601c1M83597t3.getValue();
            c28655q2.m87150e0(2089001433);
            zM87153g = c28655q2.m87153g(interfaceC28601c1M83597t3) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i36);
            objM87133R4 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                interfaceC28601c2 = interfaceC28601c1M83597t3;
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C15270p(interfaceC28601c1, interfaceC15237i, i36, interfaceC28601c1M83597t3, (InterfaceC30057d) null);
                interfaceC28601c2 = interfaceC28601c1M83597t3;
                c28655q2.m87172p0(objM87133R4);
            }
            c28655q2.m87173q(false);
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, interfaceC15421s17);
            function4 = (Function1) c28655q2.m87161k(f57805a);
            c28655q2.m87150e0(2089012023);
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R5);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
            objM94759h = AbstractC30802r.m94759h(2089014647, c28655q2, false);
            if (objM94759h == c28676v0) {
                objM94759h = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM94759h);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM94759h;
            c28655q2.m87173q(false);
            context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            interfaceC28601c5 = interfaceC28601c2;
            String str119 = (String) interfaceC28601c1M83597t.getValue();
            i39 = i36;
            c23283u0 = (C23283u0) interfaceC28601c3.getValue();
            if (c23283u0 != null) {
                jM60431f = c23283u0.f92253a;
            } else {
                int length15 = ((String) interfaceC28601c1M83597t.getValue()).length();
                jM60431f = AbstractC21478l0.m60431f(length15, length15);
            }
            C29891y c29891y15 = new C29891y(str119, jM60431f, (C23283u0) interfaceC28601c4.getValue());
            boolean zBooleanValue119 = ((Boolean) interfaceC28601c1M83597t11111111114.getValue()).booleanValue();
            c28655q2.m87150e0(2089044360);
            i44 = i38 & 14;
            if (i44 != 4) {
                z19 = true;
            } else {
                z19 = true;
            }
            objM87133R6 = c28655q2.m87133R();
            if (z19) {
                objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                c28655q2.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C15352f4(1, textFieldController, InterfaceC15391m3.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                c28655q2.m87172p0(objM87133R6);
            }
            InterfaceC21467g interfaceC21467g15 = (InterfaceC21467g) objM87133R6;
            c28655q2.m87173q(false);
            Modifier modifierM3494b15 = AbstractC1128a.m3494b(modifier3, new C15370i4((String) interfaceC28601c1M83597t.getValue(), interfaceC15237i, i37));
            int i41116 = i38 << 3;
            Modifier modifier19 = modifier3;
            c28655q2.m87150e0(-1079542001);
            List listM118960L15 = AbstractC37056f.m118960L(textFieldController.mo43565k());
            int i41117 = i37;
            c28655q2.m87150e0(558058687);
            zM87153g2 = ((((i41116 & 112) ^ 48) <= 32 && c28655q2.m87157i(textFieldController)) || (i41116 & 48) == 32) | c28655q2.m87153g(function4);
            objM87133R7 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R7 = new C14408a(19, textFieldController, function4);
                c28655q2.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C14408a(19, textFieldController, function4);
                c28655q2.m87172p0(objM87133R7);
            }
            c28655q2.m87173q(false);
            Modifier modifierM110153n15 = AbstractC34924m.m110153n(modifierM3494b15, listM118960L15, (Function1) objM87133R7, c28655q2, 0);
            c28655q2.m87173q(false);
            Modifier modifierM3483b15 = AbstractC1126a.m3483b(AbstractC1126a.m3484c(modifierM110153n15, new C14408a(20, interfaceC28601c1, textFieldController)), c15247s2);
            c28655q2.m87150e0(2089063762);
            boolean zM87153g1111 = c28655q2.m87153g(interfaceC28601c1M83597t2) | c28655q2.m87157i(context);
            if ((i38 & 1879048192) == 536870912) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = zM87153g1111 | z24;
            objM87133R8 = c28655q2.m87133R();
            if (z25) {
                z26 = z17;
                objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                c28655q2.m87172p0(objM87133R8);
            } else {
                z26 = z17;
                objM87133R8 = new C1023i0(context, z26, interfaceC28601c1M83597t2, 6);
                c28655q2.m87172p0(objM87133R8);
            }
            c28655q2.m87173q(false);
            Modifier modifierM51775c15 = AbstractC18032n.m51775c(modifierM3483b15, false, (Function1) objM87133R8);
            String strM113396S15 = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t11111111117.getValue(), c28655q2);
            boolean zMo43567m15 = textFieldController.mo43567m();
            String str1110 = (String) interfaceC28601c1M83597t11111111116.getValue();
            AbstractC15416r3 abstractC15416r17 = (AbstractC15416r3) interfaceC28601c1M83597t11111111112.getValue();
            boolean zBooleanValue1110 = ((Boolean) interfaceC28601c1M83597t11111111113.getValue()).booleanValue();
            InterfaceC15361h1 interfaceC15361h15 = (InterfaceC15361h1) interfaceC28601c1M83597t11111111118.getValue();
            InterfaceC29873g0 interfaceC29873g14 = (InterfaceC29873g0) interfaceC28601c1M83597t11111111115.getValue();
            EnumC39181m layoutDirection15 = textFieldController.getLayoutDirection();
            C34351r0 c34351r14 = new C34351r0(textFieldController.mo43563h(), textFieldController.mo43569o(), i13, 114);
            c28655q2.m87150e0(2089097627);
            zM87157i = c28655q2.m87157i(interfaceC15237i);
            objM87133R9 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R9 = new C2564l1(interfaceC15237i, 8);
                c28655q2.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new C2564l1(interfaceC15237i, 8);
                c28655q2.m87172p0(objM87133R9);
            }
            Function1 function111 = (Function1) objM87133R9;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(2089094350);
            zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87149e(i39);
            objM87133R10 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                c28655q2.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new C6516c(interfaceC15237i, i39, 7);
                c28655q2.m87172p0(objM87133R10);
            }
            c28655q2.m87173q(false);
            C34348q0 c34348q14 = new C34348q0(function111, (Function1) objM87133R10, null, null, 58);
            c28655q2.m87150e0(2089025901);
            boolean zM87153g1112 = c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87153g(interfaceC28601c1M83597t);
            if (i44 != 4) {
                z27 = true;
            } else {
                z27 = true;
            }
            boolean z3110 = zM87153g1112 | z27;
            if ((i38 & 57344) == 16384) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = z3110 | z28;
            objM87133R11 = c28655q2.m87133R();
            if (z29) {
                objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                function5 = function3;
                c28655q2.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C1008b(textFieldController, function3, interfaceC28601c5, interfaceC28601c1M83597t, interfaceC28601c3, interfaceC28601c4);
                function5 = function3;
                c28655q2.m87172p0(objM87133R11);
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            m43590f(c29891y15, z4, zBooleanValue119, strM113396S15, str1110, abstractC15416r17, zMo43567m15, zBooleanValue1110, interfaceC15361h15, z18, modifierM51775c15, interfaceC29873g14, layoutDirection15, c34351r14, c34348q14, (Function1) objM87133R11, (Function1) interfaceC21467g15, c28655q, i41116 & 1879048192);
            function6 = function5;
            i45 = i39;
            c15247s3 = c15247s2;
            z34 = z26;
            z35 = z18;
            modifier4 = modifier19;
            i46 = i41117;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.c4
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15376j4.m43587c(textFieldController, z4, i13, modifier4, function6, i45, i46, c15247s3, z35, z34, (Composer) obj, AbstractC28683x.m87244L(i16 | 1), i17);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C15197y1 m43588d(EnumC15343e1 enumC15343e1, long j7, long j13, long j14, long j15, Composer composer, int i13, int i14) {
        long jM51541c;
        long jM43088c;
        long jM43088c2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-964433817);
        EnumC15343e1 enumC15343e2 = (i14 & 1) != 0 ? EnumC15343e1.f57652w : enumC15343e1;
        long jM43088c3 = (i14 & 2) != 0 ? AbstractC11673r.m31082k(c28655q).f37671d : j7;
        if ((i14 & 4) != 0) {
            long j16 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
            if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                AbstractC17918w0.m51536x(j16);
            } else {
                AbstractC17918w0.m51536x(j16);
            }
            jM51541c = C17919x.m51541c(0.38f, jM43088c3);
        } else {
            jM51541c = j13;
        }
        long j17 = (i14 & 8) != 0 ? AbstractC11673r.m31082k(c28655q).f37668a : j14;
        long j18 = (i14 & 16) != 0 ? C17919x.f69636m : j15;
        C15043i8 c15043i8 = C15043i8.f56313a;
        c28655q.m87150e0(147596117);
        EnumC15343e1 enumC15343e3 = EnumC15343e1.f57653x;
        if (enumC15343e2 == enumC15343e3) {
            jM43088c3 = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43088c();
        } else if (enumC15343e2 != EnumC15343e1.f57652w && enumC15343e2 != EnumC15343e1.f57654y) {
            throw new NoWhenBranchMatchedException();
        }
        c28655q.m87173q(false);
        long j19 = AbstractC11673r.m31082k(c28655q).f37674g;
        long j24 = AbstractC11673r.m31082k(c28655q).f37674g;
        long j25 = AbstractC11673r.m31082k(c28655q).f37674g;
        long j26 = C17919x.f69636m;
        long j27 = AbstractC11673r.m31082k(c28655q).f37673f;
        long j28 = jM43088c3;
        int iOrdinal = enumC15343e2.ordinal();
        if (iOrdinal == 0) {
            c28655q.m87150e0(147623608);
            long j29 = AbstractC11673r.m31082k(c28655q).f37673f;
            c28655q.m87173q(false);
            jM43088c = j29;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw AbstractC11895b.m32003v(147618065, c28655q, false);
            }
            c28655q.m87150e0(147623608);
            long j210 = AbstractC11673r.m31082k(c28655q).f37673f;
            c28655q.m87173q(false);
            jM43088c = j210;
        } else {
            c28655q.m87150e0(147620531);
            jM43088c = C15069l3.m43147a(c28655q).m43088c();
            c28655q.m87173q(false);
        }
        c28655q.m87150e0(147625181);
        if (enumC15343e2 == enumC15343e3) {
            jM43088c2 = C15069l3.m43147a(c28655q).m43088c();
        } else {
            if (enumC15343e2 != EnumC15343e1.f57652w && enumC15343e2 != EnumC15343e1.f57654y) {
                throw new NoWhenBranchMatchedException();
            }
            jM43088c2 = j26;
        }
        c28655q.m87173q(false);
        C15197y1 c15197y1M43130h = C15043i8.m43130h(j28, jM51541c, j17, j27, jM43088c, j26, j26, j18, jM43088c2, j24, j19, j25, 0L, c28655q, 1474048);
        c28655q.m87173q(false);
        return c15197y1M43130h;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m43589e(Modifier modifier, InterfaceC15391m3 textFieldController, boolean z4, C37816b c37816b, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i17;
        AbstractC22676k.m65750j(textFieldController, "textFieldController");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2063701262);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(textFieldController) : c28655q.m87157i(textFieldController) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            i16 = i15 | 3072;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(c37816b)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i17;
            }
            if ((i16 & 9363) == 9362 || !c28655q.m87121F()) {
                if (i18 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                AbstractC32410a.m101045o(null, (InterfaceC15361h1) C27648a.m83597t(textFieldController.mo43544f(), c28655q, 0).getValue(), modifier, z14, c37816b, c28655q, ((i16 << 6) & 896) | ((i16 << 3) & 7168) | (i16 & 57344), 0);
                z15 = z14;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(modifier, (Object) textFieldController, z15, (InterfaceC23459e) c37816b, i13, i14, 10);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i15 | 3072;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(c37816b)) {
                i17 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i17;
        }
        if ((i16 & 9363) == 9362) {
            if (i18 != 0) {
                z14 = false;
            } else {
                z14 = z13;
            }
            AbstractC32410a.m101045o(null, (InterfaceC15361h1) C27648a.m83597t(textFieldController.mo43544f(), c28655q, 0).getValue(), modifier, z14, c37816b, c28655q, ((i16 << 6) & 896) | ((i16 << 3) & 7168) | (i16 & 57344), 0);
            z15 = z14;
        } else {
            if (i18 != 0) {
                z14 = false;
            } else {
                z14 = z13;
            }
            AbstractC32410a.m101045o(null, (InterfaceC15361h1) C27648a.m83597t(textFieldController.mo43544f(), c28655q, 0).getValue(), modifier, z14, c37816b, c28655q, ((i16 << 6) & 896) | ((i16 << 3) & 7168) | (i16 & 57344), 0);
            z15 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(modifier, (Object) textFieldController, z15, (InterfaceC23459e) c37816b, i13, i14, 10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m43590f(final C29891y c29891y, final boolean z4, final boolean z13, final String label, final String str, final AbstractC15416r3 abstractC15416r3, final boolean z14, final boolean z15, final InterfaceC15361h1 interfaceC15361h1, final boolean z16, final Modifier modifier, final InterfaceC29873g0 interfaceC29873g0, final EnumC39181m enumC39181m, final C34351r0 c34351r0, final C34348q0 c34348q0, final Function1 function1, final Function1 function2, Composer composer, final int i13) {
        int i14;
        boolean z17;
        String str2;
        EnumC15343e1 enumC15343e1;
        AbstractC22676k.m65750j(label, "label");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(512263101);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c29891y) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            z17 = z13;
            i14 |= c28655q.m87155h(z17) ? 256 : 128;
        } else {
            z17 = z13;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(label) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            str2 = str;
            i14 |= c28655q.m87153g(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i14 |= c28655q.m87153g(abstractC15416r3) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i14 |= c28655q.m87155h(z14) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i14 |= c28655q.m87155h(z15) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i14 |= c28655q.m87153g(interfaceC15361h1) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i14 |= c28655q.m87155h(z16) ? 536870912 : 268435456;
        }
        int i15 = (c28655q.m87153g(modifier) ? (char) 4 : (char) 2) | (c28655q.m87153g(interfaceC29873g0) ? ' ' : (char) 16) | (c28655q.m87153g(enumC39181m) ? (char) 256 : (char) 128) | (c28655q.m87153g(c34351r0) ? (char) 2048 : (char) 1024) | (c28655q.m87153g(c34348q0) ? (char) 16384 : (char) 8192) | (c28655q.m87157i(function1) ? (char) 0 : (char) 0) | (c28655q.m87157i(function2) ? (char) 0 : (char) 0);
        if ((i14 & 306783379) == 306783378 && (599187 & i15) == 599186 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            if (z15) {
                if ((interfaceC15361h1 instanceof C15349f1) || interfaceC15361h1 == null) {
                    enumC15343e1 = EnumC15343e1.f57653x;
                } else {
                    if (!(interfaceC15361h1 instanceof C15355g1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    enumC15343e1 = EnumC15343e1.f57654y;
                }
            } else {
                if (z15) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC15343e1 = EnumC15343e1.f57652w;
            }
            C15197y1 c15197y1M43588d = m43588d(enumC15343e1, 0L, 0L, 0L, 0L, c28655q, 0, 30);
            C11662g c11662g = (C11662g) c28655q.m87161k(AbstractC11673r.f37718j);
            c28655q.m87150e0(1576343105);
            EnumC39181m enumC39181m2 = enumC39181m == null ? (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n) : enumC39181m;
            c28655q.m87173q(false);
            c28655q = c28655q;
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(enumC39181m2), AbstractC37817c.m121344e(2013284477, c28655q, new C15364h4(c29891y, function1, modifier, z4, str2, abstractC15416r3, z15, interfaceC15361h1, interfaceC29873g0, c34351r0, c34348q0, c15197y1M43588d, c11662g, z14, label, z16, z17, function2)), c28655q, 56);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g40.a4
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                    AbstractC15376j4.m43590f(c29891y, z4, z13, label, str, abstractC15416r3, z14, z15, interfaceC15361h1, z16, modifier, interfaceC29873g0, enumC39181m, c34351r0, c34348q0, function1, function2, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m43591g(C15401o3 c15401o3, boolean z4, Function1 function1, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-58118303);
        int i14 = i13 | (c28655q.m87157i(c15401o3) ? 4 : 2) | (c28655q.m87155h(z4) ? 32 : 16) | (c28655q.m87157i(function1) ? 256 : 128);
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(1539059274);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            c28655q.m87173q(false);
            boolean z13 = (z4 || c15401o3.f57857b) ? false : true;
            c28655q.m87150e0(1539064144);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C15449y1(6);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3482a = AbstractC1126a.m3482a(c2314t, (Function1) objM87133R2);
            c28655q.m87150e0(1539066063);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C15218b(4, interfaceC28601c2);
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1092a.m3361f(modifierM3482a, z13, null, (InterfaceC4339a) objM87133R3, 6), "dropdown_menu_clickable");
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            boolean z14 = z13;
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3394p = AbstractC1099a.m3394p(10, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(4), C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            m43592h(new C15411q3(c15401o3.f57858c.f57849c, false, (C16587n0) null, 10), z4, null, c28655q, i14 & 112, 4);
            c28655q.m87150e0(-268168580);
            if (z14) {
                AbstractC28683x.m87247a(AbstractC15067l1.f56420a.mo86977a(new C17919x(AbstractC11673r.m31082k(c28655q).f37674g)), AbstractC15360h0.f57735a, c28655q, 56);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            boolean zBooleanValue = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
            C41210b c41210b = c15401o3.f57856a;
            C15396n3 c15396n3 = c15401o3.f57858c;
            ArrayList arrayList = c15401o3.f57859d;
            long j7 = AbstractC11673r.m31082k(c28655q).f37672e;
            long j13 = AbstractC11673r.m31082k(c28655q).f37671d;
            c28655q.m87150e0(-797425696);
            boolean z15 = (i14 & 896) == 256;
            Object objM87133R4 = c28655q.m87133R();
            if (z15 || objM87133R4 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c2;
                objM87133R4 = new C2609r(function1, interfaceC28601c1, 12);
                c28655q.m87172p0(objM87133R4);
            } else {
                interfaceC28601c1 = interfaceC28601c2;
            }
            Function1 function2 = (Function1) objM87133R4;
            Object objM94759h = AbstractC30802r.m94759h(-797421685, c28655q, false);
            if (objM94759h == c28676v0) {
                objM94759h = new C15218b(5, interfaceC28601c1);
                c28655q.m87172p0(objM94759h);
            }
            c28655q.m87173q(false);
            AbstractC32411b.m101107s(zBooleanValue, c41210b, c15396n3, arrayList, function2, j7, j13, (InterfaceC4339a) objM94759h, c28655q, 12582912);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0341c(c15401o3, z4, function1, i13, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m43592h(C15411q3 trailingIcon, boolean z4, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Modifier modifier3;
        Modifier modifier4;
        String strM92103Y;
        Modifier modifier5;
        Modifier modifierM3361f;
        String strM92103Y2;
        Modifier modifierM3361f2;
        Modifier modifier6;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(trailingIcon, "trailingIcon");
        InterfaceC4339a interfaceC4339a = trailingIcon.f57896d;
        int i16 = trailingIcon.f57893a;
        Integer num = trailingIcon.f57894b;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(580728384);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(trailingIcon) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) == 146 || !c28655q.m87121F()) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (z4) {
                    c28655q.m87150e0(614347698);
                    modifier5 = modifier3;
                    AbstractC15170v4.m43202b(AbstractC1102d.m3411h(24, AbstractC18032n.m51775c(modifier3, true, new C11906c(29))), 0L, 0.0f, 0L, 0, c28655q, 0, 30);
                    c28655q.m87173q(false);
                } else {
                    modifier4 = modifier3;
                    if (trailingIcon.f57895c) {
                        c28655q.m87150e0(614557754);
                        AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(i16, c28655q, 0);
                        c28655q.m87150e0(435470871);
                        if (num == null) {
                            strM92103Y2 = null;
                        } else {
                            strM92103Y2 = AbstractC30060g.m92103Y(c28655q, num.intValue());
                        }
                        c28655q.m87173q(false);
                        if (interfaceC4339a != null) {
                            modifierM3361f2 = AbstractC1092a.m3361f(modifier4, false, null, new C15369i3(interfaceC4339a, 1), 7);
                        } else {
                            modifierM3361f2 = modifier4;
                        }
                        AbstractC15005f3.m43107a(abstractC26165aM88500I, strM92103Y2, modifierM3361f2, 0L, c28655q, 0, 8);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        modifier5 = modifier4;
                    } else {
                        c28655q.m87150e0(614885145);
                        AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(i16, c28655q, 0);
                        c28655q.m87150e0(435481463);
                        if (num == null) {
                            strM92103Y = null;
                        } else {
                            strM92103Y = AbstractC30060g.m92103Y(c28655q, num.intValue());
                        }
                        c28655q.m87173q(false);
                        if (interfaceC4339a != null) {
                            modifierM3361f = AbstractC1092a.m3361f(modifier4, false, null, new C15369i3(interfaceC4339a, 1), 7);
                            modifier5 = modifier4;
                        } else {
                            modifier5 = modifier4;
                            modifierM3361f = modifier5;
                        }
                        AbstractC29125c.m88522c(abstractC26165aM88500I2, strM92103Y, modifierM3361f, null, null, 0.0f, null, c28655q, 0, 120);
                        c28655q.m87173q(false);
                    }
                }
                modifier6 = modifier5;
            } else {
                c28655q.m87138X();
                modifier6 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(trailingIcon, z4, modifier6, i13, i14, 8);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) == 146) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (z4) {
                c28655q.m87150e0(614347698);
                modifier5 = modifier3;
                AbstractC15170v4.m43202b(AbstractC1102d.m3411h(24, AbstractC18032n.m51775c(modifier3, true, new C11906c(29))), 0L, 0.0f, 0L, 0, c28655q, 0, 30);
                c28655q.m87173q(false);
            } else {
                modifier4 = modifier3;
                if (trailingIcon.f57895c) {
                    c28655q.m87150e0(614557754);
                    AbstractC26165a abstractC26165aM88500I3 = AbstractC29125c.m88500I(i16, c28655q, 0);
                    c28655q.m87150e0(435470871);
                    if (num == null) {
                        strM92103Y2 = null;
                    } else {
                        strM92103Y2 = AbstractC30060g.m92103Y(c28655q, num.intValue());
                    }
                    c28655q.m87173q(false);
                    if (interfaceC4339a != null) {
                        modifierM3361f2 = AbstractC1092a.m3361f(modifier4, false, null, new C15369i3(interfaceC4339a, 1), 7);
                    } else {
                        modifierM3361f2 = modifier4;
                    }
                    AbstractC15005f3.m43107a(abstractC26165aM88500I3, strM92103Y2, modifierM3361f2, 0L, c28655q, 0, 8);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    modifier5 = modifier4;
                } else {
                    c28655q.m87150e0(614885145);
                    AbstractC26165a abstractC26165aM88500I4 = AbstractC29125c.m88500I(i16, c28655q, 0);
                    c28655q.m87150e0(435481463);
                    if (num == null) {
                        strM92103Y = null;
                    } else {
                        strM92103Y = AbstractC30060g.m92103Y(c28655q, num.intValue());
                    }
                    c28655q.m87173q(false);
                    if (interfaceC4339a != null) {
                        modifierM3361f = AbstractC1092a.m3361f(modifier4, false, null, new C15369i3(interfaceC4339a, 1), 7);
                        modifier5 = modifier4;
                    } else {
                        modifier5 = modifier4;
                        modifierM3361f = modifier5;
                    }
                    AbstractC29125c.m88522c(abstractC26165aM88500I4, strM92103Y, modifierM3361f, null, null, 0.0f, null, c28655q, 0, 120);
                    c28655q.m87173q(false);
                }
            }
            modifier6 = modifier5;
        } else {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (z4) {
                c28655q.m87150e0(614347698);
                modifier5 = modifier3;
                AbstractC15170v4.m43202b(AbstractC1102d.m3411h(24, AbstractC18032n.m51775c(modifier3, true, new C11906c(29))), 0L, 0.0f, 0L, 0, c28655q, 0, 30);
                c28655q.m87173q(false);
            } else {
                modifier4 = modifier3;
                if (trailingIcon.f57895c) {
                    c28655q.m87150e0(614557754);
                    AbstractC26165a abstractC26165aM88500I5 = AbstractC29125c.m88500I(i16, c28655q, 0);
                    c28655q.m87150e0(435470871);
                    if (num == null) {
                        strM92103Y2 = null;
                    } else {
                        strM92103Y2 = AbstractC30060g.m92103Y(c28655q, num.intValue());
                    }
                    c28655q.m87173q(false);
                    if (interfaceC4339a != null) {
                        modifierM3361f2 = AbstractC1092a.m3361f(modifier4, false, null, new C15369i3(interfaceC4339a, 1), 7);
                    } else {
                        modifierM3361f2 = modifier4;
                    }
                    AbstractC15005f3.m43107a(abstractC26165aM88500I5, strM92103Y2, modifierM3361f2, 0L, c28655q, 0, 8);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    modifier5 = modifier4;
                } else {
                    c28655q.m87150e0(614885145);
                    AbstractC26165a abstractC26165aM88500I6 = AbstractC29125c.m88500I(i16, c28655q, 0);
                    c28655q.m87150e0(435481463);
                    if (num == null) {
                        strM92103Y = null;
                    } else {
                        strM92103Y = AbstractC30060g.m92103Y(c28655q, num.intValue());
                    }
                    c28655q.m87173q(false);
                    if (interfaceC4339a != null) {
                        modifierM3361f = AbstractC1092a.m3361f(modifier4, false, null, new C15369i3(interfaceC4339a, 1), 7);
                        modifier5 = modifier4;
                    } else {
                        modifier5 = modifier4;
                        modifierM3361f = modifier5;
                    }
                    AbstractC29125c.m88522c(abstractC26165aM88500I6, strM92103Y, modifierM3361f, null, null, 0.0f, null, c28655q, 0, 120);
                    c28655q.m87173q(false);
                }
            }
            modifier6 = modifier5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(trailingIcon, z4, modifier6, i13, i14, 8);
        }
    }
}

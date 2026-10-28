package w71;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c41.C4048j0;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.Iterator;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p01.C28582b;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32632k2;
import pp2.C29451o;
import rm1.C31598l;
import v11.C35546d;
import v41.C35657b0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: w71.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018JW\u0010!\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b!\u0010\"JG\u0010#\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b#\u0010$JW\u0010%\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b%\u0010\"J+\u0010(\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b(\u0010\u0013J5\u0010+\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020)2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b+\u0010,J3\u00101\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b1\u00102J5\u00105\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u0002032\u0014\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b5\u00106J3\u00109\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b9\u0010:¨\u0006;"}, m65681d2 = {"Lw71/l;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "Lw71/y;", "journalQuestionState", "Lkotlin/Function1;", "Ll83/a0;", "callBack", "R", "(Landroidx/compose/ui/Modifier;Lw71/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lw71/t;", "section", "onViewEvent", "T", "(Landroidx/compose/ui/Modifier;Lw71/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "G", "(Lw71/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "number", "tapAction", "Z", "(Lw71/y;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "min", "max", "increment", "preSetNumber", "Lcom/whoop/design/util/TextResource;", "level", "selectedNumber", "c0", "(Lw71/y;IIILjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "f0", "(Lw71/y;IILjava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "i0", "", "callback", "o0", "", "timeString", "l0", "(Lw71/y;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lw71/f0$h;", "type", "", "isOn", "r0", "(Lw71/y;Lw71/f0$h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lw71/f0$i;", "onAnswer", "W", "(Lw71/y;Lw71/f0$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lw71/f0$a;", "onCheckedChanged", "E", "(Lw71/y;Lw71/f0$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36893l {

    /* JADX INFO: renamed from: a */
    public static final C36893l f157828a = new C36893l();

    private C36893l() {
    }

    /* JADX INFO: renamed from: E */
    private final void m118380E(C36906y c36906y, AbstractC36882f0.a aVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-280202679);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c36906y) : c28655q.m87157i(c36906y) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(aVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC36881f.m118308b(AbstractC8693b.m21278l(c36906y.getQuestion()), false, aVar.getIsChecked(), c36906y.getIsEnabled(), function1, c28655q, (i14 << 6) & 57344, 2);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35546d(this, c36906y, aVar, function1, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m118381F(C36893l c36893l, C36906y c36906y, AbstractC36882f0.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        c36893l.m118380E(c36906y, aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private final void m118382G(final C36906y c36906y, final Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1955326651);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c36906y) : c28655q.m87157i(c36906y) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(this) ? 256 : 128;
        }
        boolean z4 = true;
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC36882f0 abstractC36882f0M118515j = c36906y.getType();
            boolean z13 = abstractC36882f0M118515j instanceof AbstractC36882f0.b;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13) {
                c28655q.m87150e0(-1504961154);
                Double dM118316f = ((AbstractC36882f0.b) c36906y.getType()).getNumber();
                boolean z14 = (i14 & 112) == 32;
                int i15 = i14 & 14;
                if (i15 != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(c36906y))) {
                    z4 = false;
                }
                boolean z15 = z14 | z4;
                Object objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    final int i16 = 2;
                    objM87133R = new Function1() { // from class: w71.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i16) {
                                case 0:
                                    return C36893l.m118390O(function1, c36906y, (Boolean) obj);
                                case 1:
                                    return C36893l.m118391P(function1, c36906y, ((Boolean) obj).booleanValue());
                                case 2:
                                    return C36893l.m118383H(function1, c36906y, (Double) obj);
                                case 3:
                                    return C36893l.m118384I(function1, c36906y, ((Integer) obj).intValue());
                                case 4:
                                    return C36893l.m118385J(function1, c36906y, ((Integer) obj).intValue());
                                case 5:
                                    return C36893l.m118386K(function1, c36906y, ((Integer) obj).intValue());
                                case 6:
                                    return C36893l.m118387L(function1, c36906y, ((Long) obj).longValue());
                                case 7:
                                    return C36893l.m118388M(function1, c36906y, (String) obj);
                                default:
                                    return C36893l.m118389N(function1, c36906y, ((Boolean) obj).booleanValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                m118399Z(c36906y, dM118316f, (Function1) objM87133R, c28655q, ((i14 << 3) & 7168) | i15, 0);
                c28655q.m87173q(false);
            } else if (abstractC36882f0M118515j instanceof AbstractC36882f0.d) {
                c28655q.m87150e0(-1504511127);
                int iM118326d = ((AbstractC36882f0.d) c36906y.getType()).getMin();
                int iM118325c = ((AbstractC36882f0.d) c36906y.getType()).getMax();
                Integer numM118327e = ((AbstractC36882f0.d) c36906y.getType()).getPresetNumber();
                boolean z16 = (i14 & 112) == 32;
                int i17 = i14 & 14;
                if (i17 != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(c36906y))) {
                    z4 = false;
                }
                boolean z17 = z16 | z4;
                Object objM87133R2 = c28655q.m87133R();
                if (z17 || objM87133R2 == c28676v0) {
                    final int i18 = 3;
                    objM87133R2 = new Function1() { // from class: w71.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i18) {
                                case 0:
                                    return C36893l.m118390O(function1, c36906y, (Boolean) obj);
                                case 1:
                                    return C36893l.m118391P(function1, c36906y, ((Boolean) obj).booleanValue());
                                case 2:
                                    return C36893l.m118383H(function1, c36906y, (Double) obj);
                                case 3:
                                    return C36893l.m118384I(function1, c36906y, ((Integer) obj).intValue());
                                case 4:
                                    return C36893l.m118385J(function1, c36906y, ((Integer) obj).intValue());
                                case 5:
                                    return C36893l.m118386K(function1, c36906y, ((Integer) obj).intValue());
                                case 6:
                                    return C36893l.m118387L(function1, c36906y, ((Long) obj).longValue());
                                case 7:
                                    return C36893l.m118388M(function1, c36906y, (String) obj);
                                default:
                                    return C36893l.m118389N(function1, c36906y, ((Boolean) obj).booleanValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                m118411f0(c36906y, iM118326d, iM118325c, numM118327e, (Function1) objM87133R2, c28655q, ((i14 << 9) & 458752) | i17, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (abstractC36882f0M118515j instanceof AbstractC36882f0.c) {
                c28655q.m87150e0(-1503837032);
                int iM118321d = ((AbstractC36882f0.c) c36906y.getType()).getMin();
                int iM118320c = ((AbstractC36882f0.c) c36906y.getType()).getMax();
                int iM118318a = ((AbstractC36882f0.c) c36906y.getType()).getIncrement();
                TextResource textResourceM21278l = AbstractC8693b.m21278l(((AbstractC36882f0.c) c36906y.getType()).getLevel());
                Integer numM118322e = ((AbstractC36882f0.c) c36906y.getType()).getPresetNumber();
                boolean z18 = (i14 & 112) == 32;
                int i19 = i14 & 14;
                if (i19 != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(c36906y))) {
                    z4 = false;
                }
                boolean z19 = z18 | z4;
                Object objM87133R3 = c28655q.m87133R();
                if (z19 || objM87133R3 == c28676v0) {
                    final int i24 = 4;
                    objM87133R3 = new Function1() { // from class: w71.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i24) {
                                case 0:
                                    return C36893l.m118390O(function1, c36906y, (Boolean) obj);
                                case 1:
                                    return C36893l.m118391P(function1, c36906y, ((Boolean) obj).booleanValue());
                                case 2:
                                    return C36893l.m118383H(function1, c36906y, (Double) obj);
                                case 3:
                                    return C36893l.m118384I(function1, c36906y, ((Integer) obj).intValue());
                                case 4:
                                    return C36893l.m118385J(function1, c36906y, ((Integer) obj).intValue());
                                case 5:
                                    return C36893l.m118386K(function1, c36906y, ((Integer) obj).intValue());
                                case 6:
                                    return C36893l.m118387L(function1, c36906y, ((Long) obj).longValue());
                                case 7:
                                    return C36893l.m118388M(function1, c36906y, (String) obj);
                                default:
                                    return C36893l.m118389N(function1, c36906y, ((Boolean) obj).booleanValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                m118405c0(c36906y, iM118321d, iM118320c, iM118318a, numM118322e, textResourceM21278l, (Function1) objM87133R3, c28655q, i19 | ((i14 << 15) & 29360128), 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (abstractC36882f0M118515j instanceof AbstractC36882f0.e) {
                c28655q.m87150e0(-1503046594);
                int iM118333f = ((AbstractC36882f0.e) c36906y.getType()).getMin();
                int iM118332e = ((AbstractC36882f0.e) c36906y.getType()).getMax();
                int iM118330c = ((AbstractC36882f0.e) c36906y.getType()).getIncrement();
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(((AbstractC36882f0.e) c36906y.getType()).getLevel());
                Integer numM118334g = ((AbstractC36882f0.e) c36906y.getType()).getPresetNumber();
                boolean z24 = (i14 & 112) == 32;
                int i25 = i14 & 14;
                if (i25 != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(c36906y))) {
                    z4 = false;
                }
                boolean z25 = z24 | z4;
                Object objM87133R4 = c28655q.m87133R();
                if (z25 || objM87133R4 == c28676v0) {
                    final int i26 = 5;
                    objM87133R4 = new Function1() { // from class: w71.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i26) {
                                case 0:
                                    return C36893l.m118390O(function1, c36906y, (Boolean) obj);
                                case 1:
                                    return C36893l.m118391P(function1, c36906y, ((Boolean) obj).booleanValue());
                                case 2:
                                    return C36893l.m118383H(function1, c36906y, (Double) obj);
                                case 3:
                                    return C36893l.m118384I(function1, c36906y, ((Integer) obj).intValue());
                                case 4:
                                    return C36893l.m118385J(function1, c36906y, ((Integer) obj).intValue());
                                case 5:
                                    return C36893l.m118386K(function1, c36906y, ((Integer) obj).intValue());
                                case 6:
                                    return C36893l.m118387L(function1, c36906y, ((Long) obj).longValue());
                                case 7:
                                    return C36893l.m118388M(function1, c36906y, (String) obj);
                                default:
                                    return C36893l.m118389N(function1, c36906y, ((Boolean) obj).booleanValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                m118417i0(c36906y, iM118333f, iM118332e, iM118330c, numM118334g, textResourceM21278l2, (Function1) objM87133R4, c28655q, i25 | ((i14 << 15) & 29360128), 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (abstractC36882f0M118515j instanceof AbstractC36882f0.g) {
                c28655q.m87150e0(-1502286598);
                boolean z26 = (i14 & 112) == 32;
                if ((i14 & 14) != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(c36906y))) {
                    z4 = false;
                }
                boolean z27 = z26 | z4;
                Object objM87133R5 = c28655q.m87133R();
                if (z27 || objM87133R5 == c28676v0) {
                    final int i27 = 6;
                    objM87133R5 = new Function1() { // from class: w71.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i27) {
                                case 0:
                                    return C36893l.m118390O(function1, c36906y, (Boolean) obj);
                                case 1:
                                    return C36893l.m118391P(function1, c36906y, ((Boolean) obj).booleanValue());
                                case 2:
                                    return C36893l.m118383H(function1, c36906y, (Double) obj);
                                case 3:
                                    return C36893l.m118384I(function1, c36906y, ((Integer) obj).intValue());
                                case 4:
                                    return C36893l.m118385J(function1, c36906y, ((Integer) obj).intValue());
                                case 5:
                                    return C36893l.m118386K(function1, c36906y, ((Integer) obj).intValue());
                                case 6:
                                    return C36893l.m118387L(function1, c36906y, ((Long) obj).longValue());
                                case 7:
                                    return C36893l.m118388M(function1, c36906y, (String) obj);
                                default:
                                    return C36893l.m118389N(function1, c36906y, ((Boolean) obj).booleanValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                }
                m118429o0(c36906y, (Function1) objM87133R5, c28655q, i14 & 910);
                c28655q.m87173q(false);
            } else if (abstractC36882f0M118515j instanceof AbstractC36882f0.f) {
                c28655q.m87150e0(-1501875631);
                String strM118335a = ((AbstractC36882f0.f) c36906y.getType()).getTime();
                boolean z28 = (i14 & 112) == 32;
                int i28 = i14 & 14;
                if (i28 != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(c36906y))) {
                    z4 = false;
                }
                boolean z29 = z28 | z4;
                Object objM87133R6 = c28655q.m87133R();
                if (z29 || objM87133R6 == c28676v0) {
                    final int i29 = 7;
                    objM87133R6 = new Function1() { // from class: w71.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i29) {
                                case 0:
                                    return C36893l.m118390O(function1, c36906y, (Boolean) obj);
                                case 1:
                                    return C36893l.m118391P(function1, c36906y, ((Boolean) obj).booleanValue());
                                case 2:
                                    return C36893l.m118383H(function1, c36906y, (Double) obj);
                                case 3:
                                    return C36893l.m118384I(function1, c36906y, ((Integer) obj).intValue());
                                case 4:
                                    return C36893l.m118385J(function1, c36906y, ((Integer) obj).intValue());
                                case 5:
                                    return C36893l.m118386K(function1, c36906y, ((Integer) obj).intValue());
                                case 6:
                                    return C36893l.m118387L(function1, c36906y, ((Long) obj).longValue());
                                case 7:
                                    return C36893l.m118388M(function1, c36906y, (String) obj);
                                default:
                                    return C36893l.m118389N(function1, c36906y, ((Boolean) obj).booleanValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R6);
                }
                m118423l0(c36906y, strM118335a, (Function1) objM87133R6, c28655q, ((i14 << 3) & 7168) | i28, 0);
                c28655q.m87173q(false);
            } else if (abstractC36882f0M118515j instanceof AbstractC36882f0.h) {
                c28655q.m87150e0(-1501451923);
                AbstractC36882f0.h hVar = (AbstractC36882f0.h) c36906y.getType();
                boolean z34 = (i14 & 112) == 32;
                int i34 = i14 & 14;
                if (i34 != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(c36906y))) {
                    z4 = false;
                }
                boolean z35 = z34 | z4;
                Object objM87133R7 = c28655q.m87133R();
                if (z35 || objM87133R7 == c28676v0) {
                    final int i35 = 8;
                    objM87133R7 = new Function1() { // from class: w71.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i35) {
                                case 0:
                                    return C36893l.m118390O(function1, c36906y, (Boolean) obj);
                                case 1:
                                    return C36893l.m118391P(function1, c36906y, ((Boolean) obj).booleanValue());
                                case 2:
                                    return C36893l.m118383H(function1, c36906y, (Double) obj);
                                case 3:
                                    return C36893l.m118384I(function1, c36906y, ((Integer) obj).intValue());
                                case 4:
                                    return C36893l.m118385J(function1, c36906y, ((Integer) obj).intValue());
                                case 5:
                                    return C36893l.m118386K(function1, c36906y, ((Integer) obj).intValue());
                                case 6:
                                    return C36893l.m118387L(function1, c36906y, ((Long) obj).longValue());
                                case 7:
                                    return C36893l.m118388M(function1, c36906y, (String) obj);
                                default:
                                    return C36893l.m118389N(function1, c36906y, ((Boolean) obj).booleanValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                }
                m118435r0(c36906y, hVar, (Function1) objM87133R7, c28655q, i34 | ((i14 << 3) & 7168));
                c28655q.m87173q(false);
            } else if (abstractC36882f0M118515j instanceof AbstractC36882f0.i) {
                c28655q.m87150e0(-1501026200);
                AbstractC36882f0.i iVar = (AbstractC36882f0.i) c36906y.getType();
                boolean z36 = (i14 & 112) == 32;
                int i36 = i14 & 14;
                if (i36 != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(c36906y))) {
                    z4 = false;
                }
                boolean z37 = z36 | z4;
                Object objM87133R8 = c28655q.m87133R();
                if (z37 || objM87133R8 == c28676v0) {
                    final int i37 = 0;
                    objM87133R8 = new Function1() { // from class: w71.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i37) {
                                case 0:
                                    return C36893l.m118390O(function1, c36906y, (Boolean) obj);
                                case 1:
                                    return C36893l.m118391P(function1, c36906y, ((Boolean) obj).booleanValue());
                                case 2:
                                    return C36893l.m118383H(function1, c36906y, (Double) obj);
                                case 3:
                                    return C36893l.m118384I(function1, c36906y, ((Integer) obj).intValue());
                                case 4:
                                    return C36893l.m118385J(function1, c36906y, ((Integer) obj).intValue());
                                case 5:
                                    return C36893l.m118386K(function1, c36906y, ((Integer) obj).intValue());
                                case 6:
                                    return C36893l.m118387L(function1, c36906y, ((Long) obj).longValue());
                                case 7:
                                    return C36893l.m118388M(function1, c36906y, (String) obj);
                                default:
                                    return C36893l.m118389N(function1, c36906y, ((Boolean) obj).booleanValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R8);
                }
                m118396W(c36906y, iVar, (Function1) objM87133R8, c28655q, i36 | ((i14 << 3) & 7168));
                c28655q.m87173q(false);
            } else {
                if (!(abstractC36882f0M118515j instanceof AbstractC36882f0.a)) {
                    throw AbstractC11895b.m32003v(-2126755563, c28655q, false);
                }
                c28655q.m87150e0(-1500592665);
                AbstractC36882f0.a aVar = (AbstractC36882f0.a) c36906y.getType();
                boolean z38 = (i14 & 112) == 32;
                int i38 = i14 & 14;
                if (i38 != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(c36906y))) {
                    z4 = false;
                }
                boolean z39 = z38 | z4;
                Object objM87133R9 = c28655q.m87133R();
                if (z39 || objM87133R9 == c28676v0) {
                    final int i39 = 1;
                    objM87133R9 = new Function1() { // from class: w71.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i39) {
                                case 0:
                                    return C36893l.m118390O(function1, c36906y, (Boolean) obj);
                                case 1:
                                    return C36893l.m118391P(function1, c36906y, ((Boolean) obj).booleanValue());
                                case 2:
                                    return C36893l.m118383H(function1, c36906y, (Double) obj);
                                case 3:
                                    return C36893l.m118384I(function1, c36906y, ((Integer) obj).intValue());
                                case 4:
                                    return C36893l.m118385J(function1, c36906y, ((Integer) obj).intValue());
                                case 5:
                                    return C36893l.m118386K(function1, c36906y, ((Integer) obj).intValue());
                                case 6:
                                    return C36893l.m118387L(function1, c36906y, ((Long) obj).longValue());
                                case 7:
                                    return C36893l.m118388M(function1, c36906y, (String) obj);
                                default:
                                    return C36893l.m118389N(function1, c36906y, ((Boolean) obj).booleanValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                }
                m118380E(c36906y, aVar, (Function1) objM87133R9, c28655q, i38 | ((i14 << 3) & 7168));
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36885h(this, c36906y, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m118383H(Function1 function1, C36906y c36906y, Double d3) {
        function1.invoke(new AbstractC36877d.b(c36906y.getId(), d3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m118384I(Function1 function1, C36906y c36906y, int i13) {
        function1.invoke(new AbstractC36877d.a(c36906y.getId(), Integer.valueOf(i13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m118385J(Function1 function1, C36906y c36906y, int i13) {
        function1.invoke(new AbstractC36877d.c(c36906y.getId(), Integer.valueOf(i13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m118386K(Function1 function1, C36906y c36906y, int i13) {
        function1.invoke(new AbstractC36877d.c(c36906y.getId(), Integer.valueOf(i13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m118387L(Function1 function1, C36906y c36906y, long j7) {
        function1.invoke(new AbstractC36877d.i(c36906y.getId(), Long.valueOf(j7)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m118388M(Function1 function1, C36906y c36906y, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC36877d.d(c36906y.getId(), it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m118389N(Function1 function1, C36906y c36906y, boolean z4) {
        function1.invoke(new AbstractC36877d.j(c36906y.getId(), Boolean.valueOf(z4)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m118390O(Function1 function1, C36906y c36906y, Boolean bool) {
        function1.invoke(new AbstractC36877d.k(c36906y.getId(), bool));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m118391P(Function1 function1, C36906y c36906y, boolean z4) {
        function1.invoke(new AbstractC36877d.e(c36906y.getId(), z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m118392Q(C36893l c36893l, C36906y c36906y, Function1 function1, int i13, Composer composer, int i14) {
        c36893l.m118382G(c36906y, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m118393S(C36893l c36893l, Modifier modifier, C36906y c36906y, Function1 function1, int i13, int i14, Composer composer, int i15) {
        c36893l.m118446R(modifier, c36906y, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m118394U(C36901t c36901t, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            f157828a.m118382G(c36901t.getQuestion(), function1, c28655q, 384);
            if (c36901t.getExpanded()) {
                c28655q.m87150e0(-1690645072);
                Iterator<T> it = c36901t.m118489j().iterator();
                while (it.hasNext()) {
                    f157828a.m118382G((C36906y) it.next(), function1, c28655q, 384);
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1690402900);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m118395V(C36893l c36893l, Modifier modifier, C36901t c36901t, Function1 function1, int i13, int i14, Composer composer, int i15) {
        c36893l.m118447T(modifier, c36901t, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    private final void m118396W(C36906y c36906y, AbstractC36882f0.i iVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1389481382);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c36906y) : c28655q.m87157i(c36906y) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(iVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c36906y.getQuestion());
            Boolean boolM118344b = iVar.getBoolean();
            Integer numValueOf = boolM118344b != null ? Integer.valueOf(boolM118344b.booleanValue() ? 1 : 0) : null;
            boolean zM118517l = c36906y.getIsSubQuestion();
            Object[] objArr = false;
            boolean zM118516k = c36906y.getIsEnabled();
            C28582b c28582bM118512g = c36906y.getIndicatorItemState();
            if ((i14 & 896) == 256) {
                objArr = true;
            }
            Object objM87133R = c28655q.m87133R();
            if (objArr != false || objM87133R == C28635l.f115821a) {
                objM87133R = new C35657b0(function1, 20);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC36884g0.m118348d(textResourceM21278l, zM118517l, numValueOf, zM118516k, c28582bM118512g, (Function1) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35546d(this, c36906y, iVar, function1, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m118397X(Function1 function1, Boolean bool) {
        function1.invoke(bool);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m118398Y(C36893l c36893l, C36906y c36906y, AbstractC36882f0.i iVar, Function1 function1, int i13, Composer composer, int i14) {
        c36893l.m118396W(c36906y, iVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Z */
    private final void m118399Z(C36906y c36906y, Double d3, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Double d14;
        boolean z4;
        Double d15;
        C28677v1 c28677v1M87180u;
        Double d16;
        boolean z13;
        boolean z14;
        Object objM87133R;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(300224819);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c36906y) : c28655q.m87157i(c36906y) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                d14 = d3;
                i15 |= c28655q.m87153g(d14) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(function1)) {
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
                if (i17 != 0) {
                    d16 = null;
                } else {
                    d16 = d14;
                }
                TextResource textResourceM21278l = AbstractC8693b.m21278l(c36906y.getQuestion());
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c36906y.getContext());
                boolean zM118516k = c36906y.getIsEnabled();
                boolean zM118517l = c36906y.getIsSubQuestion();
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C36887i(function1, d16);
                    c28655q.m87172p0(objM87133R);
                }
                Double d17 = d16;
                AbstractC36895n.m118456d(textResourceM21278l, textResourceM21278l2, d17, zM118517l, zM118516k, (InterfaceC4339a) objM87133R, c28655q, (i15 << 3) & 896, 0);
                d15 = d17;
            } else {
                c28655q.m87138X();
                d15 = d14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(this, c36906y, d15, function1, i13, i14, 28);
            }
        }
        i15 |= 48;
        d14 = d3;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(function1)) {
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
            if (i17 != 0) {
                d16 = null;
            } else {
                d16 = d14;
            }
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c36906y.getQuestion());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(c36906y.getContext());
            boolean zM118516k2 = c36906y.getIsEnabled();
            boolean zM118517l2 = c36906y.getIsSubQuestion();
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | ((i15 & 112) == 32);
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C36887i(function1, d16);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C36887i(function1, d16);
                c28655q.m87172p0(objM87133R);
            }
            Double d18 = d16;
            AbstractC36895n.m118456d(textResourceM21278l3, textResourceM21278l4, d18, zM118517l2, zM118516k2, (InterfaceC4339a) objM87133R, c28655q, (i15 << 3) & 896, 0);
            d15 = d18;
        } else {
            c28655q.m87138X();
            d15 = d14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(this, c36906y, d15, function1, i13, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m118401a0(Function1 function1, Double d3) {
        function1.invoke(d3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m118403b0(C36893l c36893l, C36906y c36906y, Double d3, Function1 function1, int i13, int i14, Composer composer, int i15) {
        c36893l.m118399Z(c36906y, d3, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0114  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c0 */
    private final void m118405c0(C36906y c36906y, int i13, int i14, int i15, Integer num, TextResource textResource, Function1 function1, Composer composer, int i16, int i17) {
        int i18;
        Integer num2;
        boolean z4;
        C28655q c28655q;
        Integer num3;
        C28677v1 c28677v1M87180u;
        Integer num4;
        boolean z13;
        Object objM87133R;
        int i19;
        int i24;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1593100017);
        if ((i16 & 6) == 0) {
            i18 = ((i16 & 8) == 0 ? c28655q2.m87153g(c36906y) : c28655q2.m87157i(c36906y) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= c28655q2.m87149e(i13) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 |= c28655q2.m87149e(i14) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= c28655q2.m87149e(i15) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i25 = i17 & 16;
        if (i25 == 0) {
            if ((i16 & 24576) == 0) {
                num2 = num;
                i18 |= c28655q2.m87153g(num2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i16) == 0) {
                if (c28655q2.m87153g(textResource)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i18 |= i24;
            }
            if ((1572864 & i16) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i18 |= i19;
            }
            if ((599187 & i18) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z4)) {
                if (i25 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                TextResource textResourceM21278l = AbstractC8693b.m21278l(c36906y.getQuestion());
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c36906y.getContext());
                boolean zM118516k = c36906y.getIsEnabled();
                z13 = (i18 & 3670016) == 1048576;
                objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C35657b0(function1, 23);
                    c28655q2.m87172p0(objM87133R);
                }
                Function1 function2 = (Function1) objM87133R;
                int i26 = (i18 >> 9) & 896;
                int i27 = i18 << 6;
                c28655q = c28655q2;
                AbstractC36897p.m118462c(textResourceM21278l, textResourceM21278l2, textResource, i13, i14, i15, num4, false, zM118516k, function2, c28655q, i26 | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (i27 & 3670016), 128);
                num3 = num4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                num3 = num2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36889j(this, c36906y, i13, i14, i15, num3, textResource, function1, i16, i17, 1);
            }
        }
        i18 |= 24576;
        num2 = num;
        if ((196608 & i16) == 0) {
            if (c28655q2.m87153g(textResource)) {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i18 |= i24;
        }
        if ((1572864 & i16) == 0) {
            if (c28655q2.m87157i(function1)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i18 |= i19;
        }
        if ((599187 & i18) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z4)) {
            if (i25 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c36906y.getQuestion());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(c36906y.getContext());
            boolean zM118516k2 = c36906y.getIsEnabled();
            if ((i18 & 3670016) == 1048576) {
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C35657b0(function1, 23);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C35657b0(function1, 23);
                c28655q2.m87172p0(objM87133R);
            }
            Function1 function3 = (Function1) objM87133R;
            int i28 = (i18 >> 9) & 896;
            int i29 = i18 << 6;
            c28655q = c28655q2;
            AbstractC36897p.m118462c(textResourceM21278l3, textResourceM21278l4, textResource, i13, i14, i15, num4, false, zM118516k2, function3, c28655q, i28 | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 128);
            num3 = num4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            num3 = num2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36889j(this, c36906y, i13, i14, i15, num3, textResource, function1, i16, i17, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m118407d0(Function1 function1, int i13) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m118409e0(C36893l c36893l, C36906y c36906y, int i13, int i14, int i15, Integer num, TextResource textResource, Function1 function1, int i16, int i17, Composer composer, int i18) {
        c36893l.m118405c0(c36906y, i13, i14, i15, num, textResource, function1, composer, AbstractC28683x.m87244L(i16 | 1), i17);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00df  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f0 */
    private final void m118411f0(C36906y c36906y, int i13, int i14, Integer num, Function1 function1, Composer composer, int i15, int i16) {
        int i17;
        Integer num2;
        boolean z4;
        C28655q c28655q;
        Integer num3;
        C28677v1 c28677v1M87180u;
        boolean z13;
        Integer num4;
        Object objM87133R;
        int i18;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(806940822);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? c28655q2.m87153g(c36906y) : c28655q2.m87157i(c36906y) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q2.m87149e(i13) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q2.m87149e(i14) ? 256 : 128;
        }
        int i19 = i16 & 8;
        if (i19 == 0) {
            if ((i15 & 3072) == 0) {
                num2 = num;
                i17 |= c28655q2.m87153g(num2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 24576) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i18 = 16384;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i17 |= i18;
            }
            if ((i17 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i17 & 1, z4)) {
                if (i19 != 0) {
                    num4 = null;
                    z13 = false;
                } else {
                    z13 = false;
                    num4 = num2;
                }
                TextResource textResourceM21278l = AbstractC8693b.m21278l(c36906y.getQuestion());
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c36906y.getContext());
                boolean zM118517l = c36906y.getIsSubQuestion();
                boolean zM118516k = c36906y.getIsEnabled();
                if ((57344 & i17) == 16384) {
                    z13 = true;
                }
                objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C35657b0(function1, 22);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q = c28655q2;
                AbstractC36900s.m118473h(textResourceM21278l, textResourceM21278l2, i13, i14, num4, zM118517l, zM118516k, (Function1) objM87133R, c28655q, (i17 << 3) & 65408, 0);
                num3 = num4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                num3 = num2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31598l(this, c36906y, i13, i14, num3, function1, i15, i16);
            }
        }
        i17 |= 3072;
        num2 = num;
        if ((i15 & 24576) == 0) {
            if (c28655q2.m87157i(function1)) {
                i18 = 16384;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 |= i18;
        }
        if ((i17 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i17 & 1, z4)) {
            if (i19 != 0) {
                num4 = null;
                z13 = false;
            } else {
                z13 = false;
                num4 = num2;
            }
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c36906y.getQuestion());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(c36906y.getContext());
            boolean zM118517l2 = c36906y.getIsSubQuestion();
            boolean zM118516k2 = c36906y.getIsEnabled();
            if ((57344 & i17) == 16384) {
                z13 = true;
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C35657b0(function1, 22);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C35657b0(function1, 22);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC36900s.m118473h(textResourceM21278l3, textResourceM21278l4, i13, i14, num4, zM118517l2, zM118516k2, (Function1) objM87133R, c28655q, (i17 << 3) & 65408, 0);
            num3 = num4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            num3 = num2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31598l(this, c36906y, i13, i14, num3, function1, i15, i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m118413g0(Function1 function1, int i13) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m118415h0(C36893l c36893l, C36906y c36906y, int i13, int i14, Integer num, Function1 function1, int i15, int i16, Composer composer, int i17) {
        c36893l.m118411f0(c36906y, i13, i14, num, function1, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x011a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0126  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i0 */
    private final void m118417i0(C36906y c36906y, int i13, int i14, int i15, Integer num, TextResource textResource, Function1 function1, Composer composer, int i16, int i17) {
        int i18;
        Integer num2;
        boolean z4;
        C28655q c28655q;
        Integer num3;
        C28677v1 c28677v1M87180u;
        Integer num4;
        boolean z13;
        Object objM87133R;
        int i19;
        int i24;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(487875861);
        if ((i16 & 6) == 0) {
            i18 = ((i16 & 8) == 0 ? c28655q2.m87153g(c36906y) : c28655q2.m87157i(c36906y) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= c28655q2.m87149e(i13) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 |= c28655q2.m87149e(i14) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= c28655q2.m87149e(i15) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i25 = i17 & 16;
        if (i25 == 0) {
            if ((i16 & 24576) == 0) {
                num2 = num;
                i18 |= c28655q2.m87153g(num2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i16) == 0) {
                if (c28655q2.m87153g(textResource)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i18 |= i24;
            }
            if ((1572864 & i16) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i18 |= i19;
            }
            if ((599187 & i18) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z4)) {
                if (i25 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                TextResource textResourceM21278l = AbstractC8693b.m21278l(c36906y.getQuestion());
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c36906y.getContext());
                boolean zM118517l = c36906y.getIsSubQuestion();
                boolean zM118516k = c36906y.getIsEnabled();
                z13 = (i18 & 3670016) == 1048576;
                objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C35657b0(function1, 18);
                    c28655q2.m87172p0(objM87133R);
                }
                Function1 function2 = (Function1) objM87133R;
                int i26 = (i18 >> 9) & 896;
                int i27 = i18 << 6;
                c28655q = c28655q2;
                AbstractC36905x.m118503d(textResourceM21278l, textResourceM21278l2, textResource, i13, i14, i15, num4, zM118517l, zM118516k, null, function2, c28655q, i26 | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (i27 & 3670016), 0, 512);
                num3 = num4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                num3 = num2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36889j(this, c36906y, i13, i14, i15, num3, textResource, function1, i16, i17, 0);
            }
        }
        i18 |= 24576;
        num2 = num;
        if ((196608 & i16) == 0) {
            if (c28655q2.m87153g(textResource)) {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i18 |= i24;
        }
        if ((1572864 & i16) == 0) {
            if (c28655q2.m87157i(function1)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i18 |= i19;
        }
        if ((599187 & i18) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z4)) {
            if (i25 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c36906y.getQuestion());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(c36906y.getContext());
            boolean zM118517l2 = c36906y.getIsSubQuestion();
            boolean zM118516k2 = c36906y.getIsEnabled();
            if ((i18 & 3670016) == 1048576) {
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C35657b0(function1, 18);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C35657b0(function1, 18);
                c28655q2.m87172p0(objM87133R);
            }
            Function1 function3 = (Function1) objM87133R;
            int i28 = (i18 >> 9) & 896;
            int i29 = i18 << 6;
            c28655q = c28655q2;
            AbstractC36905x.m118503d(textResourceM21278l3, textResourceM21278l4, textResource, i13, i14, i15, num4, zM118517l2, zM118516k2, null, function3, c28655q, i28 | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 0, 512);
            num3 = num4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            num3 = num2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36889j(this, c36906y, i13, i14, i15, num3, textResource, function1, i16, i17, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m118419j0(Function1 function1, int i13) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m118421k0(C36893l c36893l, C36906y c36906y, int i13, int i14, int i15, Integer num, TextResource textResource, Function1 function1, int i16, int i17, Composer composer, int i18) {
        c36893l.m118417i0(c36906y, i13, i14, i15, num, textResource, function1, composer, AbstractC28683x.m87244L(i16 | 1), i17);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l0 */
    private final void m118423l0(C36906y c36906y, String str, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        String str3;
        boolean z13;
        boolean z14;
        Object objM87133R;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(506466691);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c36906y) : c28655q.m87157i(c36906y) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(function1)) {
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
                if (i17 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                TextResource textResourceM21278l = AbstractC8693b.m21278l(c36906y.getQuestion());
                boolean zM118517l = c36906y.getIsSubQuestion();
                boolean zM118516k = c36906y.getIsEnabled();
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int i18 = i15 & 112;
                z14 = z13 | (i18 == 32);
                objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C4048j0(function1, str3, 15);
                    c28655q.m87172p0(objM87133R);
                }
                String str4 = str3;
                AbstractC36874b0.m118265d(textResourceM21278l, str4, zM118517l, zM118516k, (InterfaceC4339a) objM87133R, c28655q, i18, 0);
                str2 = str4;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(this, c36906y, str2, function1, i13, i14, 29);
            }
        }
        i15 |= 48;
        str2 = str;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(function1)) {
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
            if (i17 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c36906y.getQuestion());
            boolean zM118517l2 = c36906y.getIsSubQuestion();
            boolean zM118516k2 = c36906y.getIsEnabled();
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            int i19 = i15 & 112;
            z14 = z13 | (i19 == 32);
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C4048j0(function1, str3, 15);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C4048j0(function1, str3, 15);
                c28655q.m87172p0(objM87133R);
            }
            String str5 = str3;
            AbstractC36874b0.m118265d(textResourceM21278l2, str5, zM118517l2, zM118516k2, (InterfaceC4339a) objM87133R, c28655q, i19, 0);
            str2 = str5;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(this, c36906y, str2, function1, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m118425m0(Function1 function1, String str) {
        function1.invoke(str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m118427n0(C36893l c36893l, C36906y c36906y, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        c36893l.m118423l0(c36906y, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o0 */
    private final void m118429o0(C36906y c36906y, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-827966999);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(c36906y) : c28655q2.m87157i(c36906y) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC36882f0 abstractC36882f0M118515j = c36906y.getType();
            AbstractC22676k.m65748h(abstractC36882f0M118515j, "null cannot be cast to non-null type com.whoop.design.atomic.organism.journalsurvey.JournalQuestionType.TimeSlider");
            TextResource textResourceM118341f = ((AbstractC36882f0.g) abstractC36882f0M118515j).getTime();
            long jM118340e = ((AbstractC36882f0.g) c36906y.getType()).getMinTime();
            long jM118339d = ((AbstractC36882f0.g) c36906y.getType()).getMaxTime();
            long jM118338c = ((AbstractC36882f0.g) c36906y.getType()).getCurTime();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c36906y.getQuestion());
            boolean zM118517l = c36906y.getIsSubQuestion();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("");
            boolean zM118516k = c36906y.getIsEnabled();
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C35657b0(function1, 19);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC36880e0.m118300e(textResourceM118341f, jM118338c, jM118340e, jM118339d, textResourceM21278l, textResourceM21278l2, zM118517l, zM118516k, (Function1) objM87133R, c28655q, 0, 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36885h(this, c36906y, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m118431p0(Function1 function1, long j7) {
        function1.invoke(Long.valueOf(j7));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m118433q0(C36893l c36893l, C36906y c36906y, Function1 function1, int i13, Composer composer, int i14) {
        c36893l.m118429o0(c36906y, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r0 */
    private final void m118435r0(C36906y c36906y, AbstractC36882f0.h hVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(71256875);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c36906y) : c28655q.m87157i(c36906y) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(hVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c36906y.getQuestion());
            boolean zM65745e = AbstractC22676k.m65745e(hVar.getBoolean(), Boolean.TRUE);
            boolean zM118516k = c36906y.getIsEnabled();
            boolean z4 = (i14 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C35657b0(function1, 21);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC36886h0.m118355d(textResourceM21278l, false, zM65745e, zM118516k, (Function1) objM87133R, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35546d(this, c36906y, hVar, function1, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m118437s0(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m118439t0(C36893l c36893l, C36906y c36906y, AbstractC36882f0.h hVar, Function1 function1, int i13, Composer composer, int i14) {
        c36893l.m118435r0(c36906y, hVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    public final void m118446R(Modifier modifier, C36906y journalQuestionState, Function1 callBack, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(journalQuestionState, "journalQuestionState");
        AbstractC22676k.m65750j(callBack, "callBack");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-807407700);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(journalQuestionState) : c28655q.m87157i(journalQuestionState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(callBack) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
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
            int i17 = i15 >> 3;
            f157828a.m118382G(journalQuestionState, callBack, c28655q, (i17 & 112) | (i17 & 14) | 384);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(this, modifier2, journalQuestionState, callBack, i13, i14, 27);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m118447T(Modifier modifier, C36901t section, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(section, "section");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1700916532);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(section) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            EnumC36872a0 enumC36872a0 = section.getIsCompact() ? EnumC36872a0.COMPACT : EnumC36872a0.DEFAULT;
            Modifier modifierM3355a = AbstractC1091c.m3355a(modifier, null, 3);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3355a);
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
            AbstractC28683x.m87247a(AbstractC36907z.m118523f().mo86977a(enumC36872a0), AbstractC37817c.m121344e(616558166, c28655q, new C29451o(22, section, onViewEvent)), c28655q, 56);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(this, modifier2, section, onViewEvent, i13, i14, 0);
        }
    }
}

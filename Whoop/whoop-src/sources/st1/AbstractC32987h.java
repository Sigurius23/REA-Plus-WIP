package st1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32643m3;
import p745y81.EnumC39333f;
import qt1.C30587a;
import qt1.C30588b;

/* JADX INFO: renamed from: st1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aA\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0016\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001aC\u0010\u001c\u001a\u00020\n*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010#\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010%\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&\u001a!\u0010'\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "yAxisMinimum", "yAxisMaximum", "", "autoScale", "", "Lqt1/b;", "graphs", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;FFZLjava/util/List;Landroidx/compose/runtime/Composer;II)V", "Lk2/e;", "", "index", "lineGraph", "Lqt1/a;", "graphPoint1", "stepX", "stepY", "canvasHeight", "i", "(Lk2/e;ILqt1/b;Lqt1/a;FFF)V", "graphPoint", "Ly81/f;", "color", "radius", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lk2/e;Lqt1/a;FFFLy81/f;F)V", "Li2/x;", "size", "fadePercent", "fadeFirstIndex", "currentIndex", "j", "(JIIII)J", "k", "(IF)F", "l", "(IFF)F", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32987h {
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m104136c(Modifier modifier, float f13, float f14, final boolean z4, final List<C30588b> graphs, Composer composer, int i13, int i14) {
        int i15;
        final float f15;
        int i16;
        final float f16;
        int i17;
        boolean z13;
        float f17;
        float f18;
        C28677v1 c28677v1M87180u;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        int i18;
        int i19;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(graphs, "graphs");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1587983055);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                f15 = f13;
                i15 |= c28655q.m87147d(f15) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    f16 = f14;
                    if (c28655q.m87147d(f16)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87155h(z4)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(graphs)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i18;
                }
                if ((i15 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i24 != 0) {
                        f15 = -1000.0f;
                    }
                    if (i16 != 0) {
                        f16 = 2000.0f;
                    }
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier);
                    boolean zM87157i = c28655q.m87157i(graphs);
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z17 = zM87157i | z14;
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z17 | z15 | ((i15 & 112) == 32);
                    objM87133R = c28655q.m87133R();
                    if (z16 || objM87133R == C28635l.f115821a) {
                        objM87133R = new Function1() { // from class: st1.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC32987h.m104137d(graphs, z4, f16, f15, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R, c28655q, 0);
                } else {
                    c28655q.m87138X();
                }
                f17 = f15;
                f18 = f16;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32643m3(modifier, f17, f18, z4, graphs, i13, i14);
                }
            }
            i15 |= 384;
            f16 = f14;
            if ((i13 & 3072) == 0) {
                if (c28655q.m87155h(z4)) {
                    i19 = 2048;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(graphs)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    f15 = -1000.0f;
                }
                if (i16 != 0) {
                    f16 = 2000.0f;
                }
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifier);
                boolean zM87157i2 = c28655q.m87157i(graphs);
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z18 = zM87157i2 | z14;
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z18 | z15 | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (z16) {
                    objM87133R = new Function1() { // from class: st1.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC32987h.m104137d(graphs, z4, f16, f15, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new Function1() { // from class: st1.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC32987h.m104137d(graphs, z4, f16, f15, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierM3407d2, (Function1) objM87133R, c28655q, 0);
            } else {
                c28655q.m87138X();
            }
            f17 = f15;
            f18 = f16;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32643m3(modifier, f17, f18, z4, graphs, i13, i14);
            }
        }
        i15 |= 48;
        f15 = f13;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                f16 = f14;
                if (c28655q.m87147d(f16)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87155h(z4)) {
                    i19 = 2048;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(graphs)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    f15 = -1000.0f;
                }
                if (i16 != 0) {
                    f16 = 2000.0f;
                }
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, modifier);
                boolean zM87157i3 = c28655q.m87157i(graphs);
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z19 = zM87157i3 | z14;
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z19 | z15 | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (z16) {
                    objM87133R = new Function1() { // from class: st1.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC32987h.m104137d(graphs, z4, f16, f15, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new Function1() { // from class: st1.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC32987h.m104137d(graphs, z4, f16, f15, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierM3407d3, (Function1) objM87133R, c28655q, 0);
            } else {
                c28655q.m87138X();
            }
            f17 = f15;
            f18 = f16;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32643m3(modifier, f17, f18, z4, graphs, i13, i14);
            }
        }
        i15 |= 384;
        f16 = f14;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87155h(z4)) {
                i19 = 2048;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i19;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(graphs)) {
                i18 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i18;
        }
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i24 != 0) {
                f15 = -1000.0f;
            }
            if (i16 != 0) {
                f16 = 2000.0f;
            }
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, modifier);
            boolean zM87157i4 = c28655q.m87157i(graphs);
            if ((i15 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z110 = zM87157i4 | z14;
            if ((i15 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z110 | z15 | ((i15 & 112) == 32);
            objM87133R = c28655q.m87133R();
            if (z16) {
                objM87133R = new Function1() { // from class: st1.g
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC32987h.m104137d(graphs, z4, f16, f15, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new Function1() { // from class: st1.g
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC32987h.m104137d(graphs, z4, f16, f15, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3407d4, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        f17 = f15;
        f18 = f16;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32643m3(modifier, f17, f18, z4, graphs, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m104137d(List list, boolean z4, float f13, float f14, InterfaceC22131e interfaceC22131e) {
        C30588b c30588b;
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L));
        List<C30588b> list2 = list;
        Iterator it = list2.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int length = ((C30588b) next).getGraphPoints().length;
            while (true) {
                Object next2 = it.next();
                int length2 = ((C30588b) next2).getGraphPoints().length;
                if (length < length2) {
                    next = next2;
                    length = length2;
                }
                if (!it.hasNext()) {
                    break;
                }
                Canvas = interfaceC22131e;
            }
        }
        float length3 = fIntBitsToFloat / ((C30588b) next).getGraphPoints().length;
        for (C30588b c30588b2 : list2) {
            float fM104138e = fIntBitsToFloat2 / m104138e(z4, c30588b2, f13, f14);
            C30587a[] graphPoints = c30588b2.getGraphPoints();
            int length4 = graphPoints.length;
            int i13 = 0;
            int i14 = 0;
            while (i14 < length4) {
                int i15 = i13;
                C30587a c30587a = graphPoints[i14];
                int i16 = i15 + 1;
                if (c30588b2.getDrawCircles()) {
                    m104141h(Canvas, c30587a, length3, fM104138e, fIntBitsToFloat2, c30588b2.getColor(), c30588b2.getStrokeWidth());
                    c30588b = c30588b2;
                } else {
                    float f15 = fM104138e;
                    float f16 = fIntBitsToFloat2;
                    float f17 = length3;
                    C30588b c30588b3 = c30588b2;
                    m104142i(Canvas, i15, c30588b3, c30587a, f17, f15, f16);
                    c30588b = c30588b3;
                    length3 = f17;
                    fM104138e = f15;
                    fIntBitsToFloat2 = f16;
                }
                i14++;
                Canvas = interfaceC22131e;
                c30588b2 = c30588b;
                i13 = i16;
            }
            Canvas = interfaceC22131e;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private static final float m104138e(boolean z4, C30588b c30588b, float f13, float f14) {
        C30587a c30587a;
        if (!z4) {
            return f13 - f14;
        }
        C30587a[] graphPoints = c30588b.getGraphPoints();
        C30587a c30587a2 = null;
        int i13 = 1;
        if (graphPoints.length != 0) {
            c30587a = graphPoints[0];
            int length = graphPoints.length - 1;
            if (length != 0) {
                Integer numM93829f = c30587a.m93829f();
                int iIntValue = numM93829f != null ? numM93829f.intValue() : 0;
                if (1 <= length) {
                    int i14 = 1;
                    while (true) {
                        C30587a c30587a3 = graphPoints[i14];
                        Integer numM93829f2 = c30587a3.m93829f();
                        int iIntValue2 = numM93829f2 != null ? numM93829f2.intValue() : 0;
                        if (iIntValue < iIntValue2) {
                            c30587a = c30587a3;
                            iIntValue = iIntValue2;
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                    }
                }
            }
        } else {
            c30587a = null;
        }
        float fM104139f = m104139f(c30587a);
        C30587a[] graphPoints2 = c30588b.getGraphPoints();
        if (graphPoints2.length != 0) {
            c30587a2 = graphPoints2[0];
            int length2 = graphPoints2.length - 1;
            if (length2 != 0) {
                Integer numM93829f3 = c30587a2.m93829f();
                int iIntValue3 = numM93829f3 != null ? numM93829f3.intValue() : 0;
                if (1 <= length2) {
                    while (true) {
                        C30587a c30587a4 = graphPoints2[i13];
                        Integer numM93829f4 = c30587a4.m93829f();
                        int iIntValue4 = numM93829f4 != null ? numM93829f4.intValue() : 0;
                        if (iIntValue3 > iIntValue4) {
                            c30587a2 = c30587a4;
                            iIntValue3 = iIntValue4;
                        }
                        if (i13 == length2) {
                            break;
                        }
                        i13++;
                    }
                }
            }
        }
        return fM104139f - m104139f(c30587a2);
    }

    /* JADX INFO: renamed from: f */
    private static final float m104139f(C30587a c30587a) {
        if (c30587a == null) {
            return 0.0f;
        }
        Integer numM93829f = c30587a.m93829f();
        Float fValueOf = numM93829f != null ? Float.valueOf(numM93829f.intValue()) : null;
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m104140g(Modifier modifier, float f13, float f14, boolean z4, List list, int i13, int i14, Composer composer, int i15) {
        m104136c(modifier, f13, f14, z4, list, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final void m104141h(InterfaceC22131e interfaceC22131e, C30587a c30587a, float f13, float f14, float f15, EnumC39333f enumC39333f, float f16) {
        int x3 = c30587a.getX();
        Integer y13 = c30587a.getY();
        if (y13 != null) {
            float fM104144k = m104144k(x3, f13);
            float fM104145l = m104145l(y13.intValue(), f14, f15);
            InterfaceC22131e.m63379M(interfaceC22131e, enumC39333f.getColor(), f16, (Float.floatToRawIntBits(fM104144k) << 32) | (4294967295L & Float.floatToRawIntBits(fM104145l)), 0.0f, null, 120);
        }
    }

    /* JADX INFO: renamed from: i */
    private static final void m104142i(InterfaceC22131e interfaceC22131e, int i13, C30588b c30588b, C30587a c30587a, float f13, float f14, float f15) {
        if (i13 < c30588b.getGraphPoints().length - 2) {
            C30587a c30587a2 = c30588b.getGraphPoints()[i13 + 1];
            Integer numM93829f = c30587a.m93829f();
            Integer numM93829f2 = c30587a2.m93829f();
            int iM93828e = c30587a.m93828e();
            int iM93828e2 = c30587a2.m93828e();
            if (numM93829f == null || numM93829f2 == null || iM93828e2 <= iM93828e) {
                return;
            }
            interfaceC22131e.mo732d0(m104143j(c30588b.getColor().getColor(), c30588b.getGraphPoints().length, c30588b.getFadePercent(), c30588b.getFadeStartIndex(), i13), (((long) Float.floatToRawIntBits(m104144k(iM93828e, f13))) << 32) | (((long) Float.floatToRawIntBits(m104145l(numM93829f.intValue(), f14, f15))) & 4294967295L), (((long) Float.floatToRawIntBits(m104144k(iM93828e2, f13))) << 32) | (((long) Float.floatToRawIntBits(m104145l(numM93829f2.intValue(), f14, f15))) & 4294967295L), (496 & 8) != 0 ? 0.0f : c30588b.getStrokeWidth(), (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final long m104143j(long j7, int i13, int i14, int i15, int i16) {
        if (i14 != 0) {
            int i17 = (i13 * i14) / 100;
            if (i16 <= i15 + i17 && i16 >= i15) {
                return C17919x.m51541c(C17919x.m51543e(j7) * ((i16 - i15) / i17), j7);
            }
        }
        return j7;
    }

    /* JADX INFO: renamed from: k */
    public static final float m104144k(int i13, float f13) {
        return i13 * f13;
    }

    /* JADX INFO: renamed from: l */
    public static final float m104145l(int i13, float f13, float f14) {
        return (f14 / 2) + ((-i13) * f13);
    }
}

package e81;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import e61.C12760c;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import j93.AbstractC21478l0;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p181h2.C16618c;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.C17891j;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.InterfaceC17910s0;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: e81.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u001aE\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aG\u0010\u0017\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, m65681d2 = {"", "tileCount", "Ly3/f;", "spacing", "Lkotlin/Function0;", "", "collapsedHeightPx", "mergeProgress", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "c", "(IFLc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lk2/e;", "Lh2/b;", "topLeft", "Lh2/e;", "tileSize", "alpha", "", "Li2/x;", "fillBrushColors", "strokeBrushColors", "f", "(Lk2/e;JJFLjava/util/List;Ljava/util/List;)V", "a", "F", "TILE_CORNER_RADIUS", "b", "TILE_STROKE_WIDTH", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12842p {

    /* JADX INFO: renamed from: a */
    private static final float f44025a = 12;

    /* JADX INFO: renamed from: b */
    private static final float f44026b = 1;

    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103  */
    /* JADX WARN: Code duplicated, block: B:67:0x0106  */
    /* JADX WARN: Code duplicated, block: B:72:0x011c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x0140  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
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
    /* JADX INFO: renamed from: c */
    public static final void m36042c(final int i13, float f13, final InterfaceC4339a collapsedHeightPx, final InterfaceC4339a mergeProgress, Modifier modifier, Composer composer, int i14, int i15) {
        int i16;
        float f14;
        Modifier modifier2;
        int i17;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        final List listM118959K;
        final List listM118959K2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean zM87153g;
        Object objM87133R;
        AbstractC22676k.m65750j(collapsedHeightPx, "collapsedHeightPx");
        AbstractC22676k.m65750j(mergeProgress, "mergeProgress");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1935208545);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            f14 = f13;
            i16 |= c28655q.m87147d(f14) ? 32 : 16;
        } else {
            f14 = f13;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87157i(collapsedHeightPx) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(mergeProgress) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i15 & 16;
        if (i18 == 0) {
            if ((i14 & 24576) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i16;
            if ((i17 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i17 & 1, z4)) {
                if (i18 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                C38072d c38072d = C38072d.f163053a;
                listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, 6).getWhite10()), new C17919x(c38072d.m121949b(c28655q, 6).getTransparent()));
                listM118959K2 = AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, 6).getWhite5()), new C17919x(c38072d.m121949b(c28655q, 6).getTransparent()));
                if ((i17 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i17 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z17 = z13 | z14;
                if ((i17 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z18 = z15 | z17;
                if ((i17 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87153g = z18 | z16 | c28655q.m87153g(listM118959K) | c28655q.m87153g(listM118959K2);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    final float f15 = f14;
                    Function1 function1 = new Function1() { // from class: e81.o
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC12842p.m36043d(mergeProgress, collapsedHeightPx, i13, f15, listM118959K, listM118959K2, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function1);
                    objM87133R = function1;
                }
                AbstractC21478l0.m60421a(modifier2, (Function1) objM87133R, c28655q, (i17 >> 12) & 14);
            } else {
                c28655q.m87138X();
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12760c(i13, f13, collapsedHeightPx, mergeProgress, modifier3, i14, i15);
            }
        }
        i16 |= 24576;
        modifier2 = modifier;
        i17 = i16;
        if ((i17 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i17 & 1, z4)) {
            if (i18 != 0) {
                modifier2 = C2314t.f9131w;
            }
            C38072d c38072d2 = C38072d.f163053a;
            listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, 6).getWhite10()), new C17919x(c38072d2.m121949b(c28655q, 6).getTransparent()));
            listM118959K2 = AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, 6).getWhite5()), new C17919x(c38072d2.m121949b(c28655q, 6).getTransparent()));
            if ((i17 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i17 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z19 = z13 | z14;
            if ((i17 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z110 = z15 | z19;
            if ((i17 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87153g = z110 | z16 | c28655q.m87153g(listM118959K) | c28655q.m87153g(listM118959K2);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                final float f16 = f14;
                Function1 function2 = new Function1() { // from class: e81.o
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC12842p.m36043d(mergeProgress, collapsedHeightPx, i13, f16, listM118959K, listM118959K2, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function2);
                objM87133R = function2;
            } else {
                final float f17 = f14;
                Function1 function3 = new Function1() { // from class: e81.o
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC12842p.m36043d(mergeProgress, collapsedHeightPx, i13, f17, listM118959K, listM118959K2, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function3);
                objM87133R = function3;
            }
            AbstractC21478l0.m60421a(modifier2, (Function1) objM87133R, c28655q, (i17 >> 12) & 14);
        } else {
            c28655q.m87138X();
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12760c(i13, f13, collapsedHeightPx, mergeProgress, modifier3, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m36043d(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, float f13, List list, List list2, InterfaceC22131e interfaceC22131e) {
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float f14 = 0.0f;
        float fM36283m = AbstractC12889b.m36283m(((Number) interfaceC4339a.invoke()).floatValue(), 0.0f, 1.0f);
        float fFloatValue = ((Number) interfaceC4339a2.invoke()).floatValue();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L));
        float f15 = fFloatValue > fIntBitsToFloat ? fIntBitsToFloat : fFloatValue;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (f15 > 0.0f && i13 > 0) {
            if (fM36283m < 1.0f) {
                float f16 = 1.0f - fM36283m;
                float fMo743q0 = Canvas.mo743q0(f13) * f16;
                float fMax = Math.max(0.0f, (Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) - ((i13 - 1) * fMo743q0)) / i13);
                int i14 = 0;
                while (i14 < i13) {
                    m36045f(Canvas, (((long) Float.floatToRawIntBits((fMax + fMo743q0) * i14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), f16, list, list2);
                    i14++;
                    f14 = f14;
                    Canvas = interfaceC22131e;
                    fM36283m = fM36283m;
                }
            }
            float f17 = fM36283m;
            if (f17 > f14) {
                m36045f(interfaceC22131e, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(((Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) - f15) * f17) + f15)) & 4294967295L), f17, list, list2);
            }
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m36044e(int i13, float f13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Modifier modifier, int i14, int i15, Composer composer, int i16) {
        m36042c(i13, f13, interfaceC4339a, interfaceC4339a2, modifier, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final void m36045f(InterfaceC22131e interfaceC22131e, long j7, long j13, float f13, List<C17919x> list, List<C17919x> list2) {
        if (Float.intBitsToFloat((int) (j13 >> 32)) > 0.0f) {
            int i13 = (int) (j13 & 4294967295L);
            if (Float.intBitsToFloat(i13) <= 0.0f) {
                return;
            }
            float fMo743q0 = interfaceC22131e.mo743q0(f44025a);
            float fMo743q1 = interfaceC22131e.mo743q0(f44026b);
            C17891j c17891jM51478a = AbstractC17897m.m51478a();
            C16618c c16618cM48896j = AbstractC17269i.m48896j(j7, j13);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMo743q0);
            InterfaceC17910s0.m51496b(c17891jM51478a, AbstractC21478l0.m60425c(c16618cM48896j, jFloatToRawIntBits, (Float.floatToRawIntBits(fMo743q0) & 4294967295L) | (jFloatToRawIntBits2 << 32), 0L, 0L));
            C17909s c17909s = AbstractC17911t.f69612b;
            int i14 = (int) (j7 & 4294967295L);
            InterfaceC22131e.m63378L(interfaceC22131e, c17891jM51478a, C17909s.m51493k(c17909s, list, Float.intBitsToFloat(i14), Float.intBitsToFloat(i13) + Float.intBitsToFloat(i14), 8), f13, null, 56);
            InterfaceC22131e.m63378L(interfaceC22131e, c17891jM51478a, C17909s.m51493k(c17909s, list2, Float.intBitsToFloat(i14), Float.intBitsToFloat(i13) + Float.intBitsToFloat(i14), 8), f13, new C22135i(fMo743q1, 0.0f, 0, 0, null, 30), 48);
        }
    }
}

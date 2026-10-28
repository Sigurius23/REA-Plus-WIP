package r71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import ch.C4592m;
import com.whoop.design.atomic.organism.horizontalscrollcontainer.HorizontalScrollBehavior;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.C9749c;
import ev2.C13698g;
import java.util.Iterator;
import java.util.List;
import jz0.AbstractC22070c;
import l83.C23454a0;
import m83.C25272z;
import o71.C27632b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3781t1;
import p077d0.AbstractC11348f;
import p077d0.C11413x;
import p088dc.AbstractC11895b;
import p180h0.C16363b0;
import p180h0.InterfaceC16432o1;
import p180h0.InterfaceC16439p3;
import p206i0.AbstractC17833k;
import p206i0.C17824b;
import p206i0.C17829g;
import p206i0.C17835m;
import p206i0.InterfaceC17834l;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p319m4.AbstractC25012a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import pf.C29124b;
import q11.C29793c;
import qk2.C30453i;
import qz0.AbstractC30795n;
import r61.C30985h;
import r70.C31050b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: r71.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Ly3/f;", "parentHorizontalPadding", "v", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "Lr71/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "k", "(Lr71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ln0/u;", "", "u", "(Ln0/u;)I", "Lp1/t1;", "", "a", "Lp1/t1;", "y", "()Lp1/t1;", "LocalIsInHorizontalScrollContainer", "b", "z", "LocalListHorizontalPadding", "selectedItemIndex", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31052b {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f128034a = new C28674u2(new C31050b(21));

    /* JADX INFO: renamed from: b */
    private static final AbstractC28669t1 f128035b = new C28674u2(new C31050b(22));

    /* JADX INFO: renamed from: r71.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f128036w = new a();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r71.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f128037w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f128038x;

        public b(Function1 function1, List list) {
            this.f128037w = function1;
            this.f128038x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m95601a(int i13) {
            return this.f128037w.invoke(this.f128038x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m95601a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: r71.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f128039w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f128040x;

        public c(List list, Function1 function1) {
            this.f128039w = list;
            this.f128040x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m95602a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f128039w.get(i13);
            c28655q.m87150e0(-1407832787);
            AbstractC25303l.m74291r(interfaceC25312u, null, null, this.f128040x, c28655q, 0, 6);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m95602a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: r71.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f128041a;

        static {
            int[] iArr = new int[HorizontalScrollBehavior.values().length];
            try {
                iArr[HorizontalScrollBehavior.SNAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalScrollBehavior.FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f128041a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x0194  */
    /* JADX WARN: Code duplicated, block: B:55:0x0197  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x020e  */
    /* JADX WARN: Code duplicated, block: B:84:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
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
    /* JADX INFO: renamed from: k */
    public static final void m95584k(C31053c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        C2314t c2314t;
        boolean zM87157i;
        Object objM87133R;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        TextResource textResourceM95608g;
        double d3;
        C2314t c2314t2;
        ?? r14;
        C28655q c28655q2;
        C26068u c26068uM77569a;
        int i17;
        Object obj;
        int i18;
        C17835m c17835m;
        boolean zM87153g;
        Object objM87133R2;
        InterfaceC17834l interfaceC17834l;
        C11413x c11413xM11572a;
        boolean zM87153g2;
        Object objM87133R3;
        Object obj2;
        boolean zM87153g3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(307947774);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q3.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q3.m87157i(function2) ? 32 : 16;
            }
            i16 = 1;
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30985h(i16);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                float f13 = ((C39174f) c28655q3.m87161k(f128035b)).f168413w;
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, m95595v(c2314t, f13));
                zM87157i = c28655q3.m87157i(viewState);
                objM87133R = c28655q3.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C29124b(viewState, 23);
                    c28655q3.m87172p0(objM87133R);
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3409f, false, (Function1) objM87133R);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM51775c);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                textResourceM95608g = viewState.getTitle();
                if (textResourceM95608g == null) {
                    c28655q3.m87150e0(2093445668);
                    c28655q3.m87173q(false);
                    c2314t2 = c2314t;
                    d3 = 1.5d;
                    r14 = 0;
                    c28655q2 = c28655q3;
                } else {
                    c28655q3.m87150e0(2093445669);
                    String strM21274h = AbstractC8693b.m21274h(textResourceM95608g, c28655q3, 0);
                    float f14 = 8;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * f14, 0.0f, 2);
                    C38072d c38072d = C38072d.f163053a;
                    d3 = 1.5d;
                    AbstractC30795n.m94707h(strM21274h, modifierM3396r, c38072d.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getH4(), null, c28655q3, 48, 0, 196600);
                    C28655q c28655q4 = c28655q3;
                    c2314t2 = c2314t;
                    r14 = 0;
                    AbstractC25012a.m73388u((float) 1.5d, f14, c2314t2, c28655q4, false);
                    c28655q2 = c28655q4;
                }
                c26068uM77569a = AbstractC26071x.m77569a(r14, r14, c28655q2, 3);
                i17 = d.f128041a[viewState.getScrollBehavior().ordinal()];
                if (i17 != 1) {
                    i18 = 2;
                    if (i17 == 2) {
                        throw AbstractC11895b.m32003v(-348098219, c28655q2, r14);
                    }
                    c28655q2.m87150e0(-348092649);
                    C11413x c11413xM11572a2 = AbstractC3781t1.m11572a(c28655q2);
                    zM87153g3 = c28655q2.m87153g(c11413xM11572a2);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g3) {
                        obj = c28676v0;
                    } else {
                        obj = c28676v0;
                        if (objM87133R4 == obj) {
                        }
                        obj2 = (C16363b0) objM87133R4;
                        c28655q2.m87173q(r14);
                    }
                    objM87133R4 = new C16363b0(c11413xM11572a2);
                    c28655q2.m87172p0(objM87133R4);
                    obj2 = (C16363b0) objM87133R4;
                    c28655q2.m87173q(r14);
                } else {
                    obj = c28676v0;
                    i18 = 2;
                    c28655q2.m87150e0(-348095860);
                    c17835m = C17835m.f69347b;
                    zM87153g = c28655q2.m87153g(c26068uM77569a);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g || objM87133R2 == obj) {
                        objM87133R2 = new C17824b(c26068uM77569a, c17835m);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC17834l = (InterfaceC17834l) objM87133R2;
                    float f15 = AbstractC17833k.f69346a;
                    InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    c11413xM11572a = AbstractC3781t1.m11572a(c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC39171c) | c28655q2.m87153g(interfaceC17834l) | c28655q2.m87153g(c11413xM11572a);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g2 || objM87133R3 == obj) {
                        objM87133R3 = new C17829g(interfaceC17834l, c11413xM11572a, AbstractC11348f.m30573u(0.0f, 400.0f, 5, null));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    obj2 = (InterfaceC16439p3) objM87133R3;
                    c28655q2.m87173q(r14);
                }
                double d14 = d3;
                Object obj3 = obj;
                Function1 function5 = function4;
                AbstractC28683x.m87247a(f128034a.mo86977a(Boolean.TRUE), AbstractC37817c.m121344e(-765764088, c28655q2, new C27632b(viewState, c26068uM77569a, obj2, function5, 5)), c28655q2, 56);
                if (viewState.getPagingIndicatorEnabled() || viewState.m95604b().isEmpty()) {
                    c28655q2.m87150e0(2095166138);
                    c28655q2.m87173q(r14);
                } else {
                    c28655q2.m87150e0(2094763479);
                    boolean zM87153g4 = c28655q2.m87153g(c26068uM77569a);
                    Object objM87133R6 = c28655q2.m87133R();
                    if (zM87153g4 || objM87133R6 == obj3) {
                        objM87133R6 = AbstractC28683x.m87264r(new C9749c(c26068uM77569a, i18));
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(((float) d14) * 8, c2314t2));
                    AbstractC22070c.m63138d(viewState.m95604b().size(), m95590q((InterfaceC28670t2) objM87133R6), AbstractC1102d.m3409f(1.0f, c2314t2), 0L, 0L, c28655q2, 384, 24);
                    c28655q2.m87173q(r14);
                }
                c28655q2.m87173q(true);
                function3 = function5;
                c28655q = c28655q2;
            } else {
                c28655q3.m87138X();
                function3 = function2;
                c28655q = c28655q3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(viewState, i13, function3, i14, 2);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = 1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R5 = c28655q3.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C30985h(i16);
                    c28655q3.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            float f16 = ((C39174f) c28655q3.m87161k(f128035b)).f168413w;
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, m95595v(c2314t, f16));
            zM87157i = c28655q3.m87157i(viewState);
            objM87133R = c28655q3.m87133R();
            if (zM87157i) {
                objM87133R = new C29124b(viewState, 23);
                c28655q3.m87172p0(objM87133R);
            } else {
                objM87133R = new C29124b(viewState, 23);
                c28655q3.m87172p0(objM87133R);
            }
            Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM3409f2, false, (Function1) objM87133R);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM51775c2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
            textResourceM95608g = viewState.getTitle();
            if (textResourceM95608g == null) {
                c28655q3.m87150e0(2093445668);
                c28655q3.m87173q(false);
                c2314t2 = c2314t;
                d3 = 1.5d;
                r14 = 0;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(2093445669);
                String strM21274h2 = AbstractC8693b.m21274h(textResourceM95608g, c28655q3, 0);
                float f17 = 8;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 2 * f17, 0.0f, 2);
                C38072d c38072d2 = C38072d.f163053a;
                d3 = 1.5d;
                AbstractC30795n.m94707h(strM21274h2, modifierM3396r2, c38072d2.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, 6).getH4(), null, c28655q3, 48, 0, 196600);
                C28655q c28655q5 = c28655q3;
                c2314t2 = c2314t;
                r14 = 0;
                AbstractC25012a.m73388u((float) 1.5d, f17, c2314t2, c28655q5, false);
                c28655q2 = c28655q5;
            }
            c26068uM77569a = AbstractC26071x.m77569a(r14, r14, c28655q2, 3);
            i17 = d.f128041a[viewState.getScrollBehavior().ordinal()];
            if (i17 != 1) {
                i18 = 2;
                if (i17 == 2) {
                    throw AbstractC11895b.m32003v(-348098219, c28655q2, r14);
                }
                c28655q2.m87150e0(-348092649);
                C11413x c11413xM11572a3 = AbstractC3781t1.m11572a(c28655q2);
                zM87153g3 = c28655q2.m87153g(c11413xM11572a3);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g3) {
                    obj = c28676v0;
                    if (objM87133R4 == obj) {
                    }
                    obj2 = (C16363b0) objM87133R4;
                    c28655q2.m87173q(r14);
                } else {
                    obj = c28676v0;
                }
                objM87133R4 = new C16363b0(c11413xM11572a3);
                c28655q2.m87172p0(objM87133R4);
                obj2 = (C16363b0) objM87133R4;
                c28655q2.m87173q(r14);
            } else {
                obj = c28676v0;
                i18 = 2;
                c28655q2.m87150e0(-348095860);
                c17835m = C17835m.f69347b;
                zM87153g = c28655q2.m87153g(c26068uM77569a);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R2 = new C17824b(c26068uM77569a, c17835m);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C17824b(c26068uM77569a, c17835m);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC17834l = (InterfaceC17834l) objM87133R2;
                float f18 = AbstractC17833k.f69346a;
                InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                c11413xM11572a = AbstractC3781t1.m11572a(c28655q2);
                zM87153g2 = c28655q2.m87153g(interfaceC39171c2) | c28655q2.m87153g(interfaceC17834l) | c28655q2.m87153g(c11413xM11572a);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R3 = new C17829g(interfaceC17834l, c11413xM11572a, AbstractC11348f.m30573u(0.0f, 400.0f, 5, null));
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C17829g(interfaceC17834l, c11413xM11572a, AbstractC11348f.m30573u(0.0f, 400.0f, 5, null));
                    c28655q2.m87172p0(objM87133R3);
                }
                obj2 = (InterfaceC16439p3) objM87133R3;
                c28655q2.m87173q(r14);
            }
            double d15 = d3;
            Object obj4 = obj;
            Function1 function6 = function4;
            AbstractC28683x.m87247a(f128034a.mo86977a(Boolean.TRUE), AbstractC37817c.m121344e(-765764088, c28655q2, new C27632b(viewState, c26068uM77569a, obj2, function6, 5)), c28655q2, 56);
            if (viewState.getPagingIndicatorEnabled()) {
                c28655q2.m87150e0(2095166138);
                c28655q2.m87173q(r14);
            } else {
                c28655q2.m87150e0(2095166138);
                c28655q2.m87173q(r14);
            }
            c28655q2.m87173q(true);
            function3 = function6;
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            function3 = function2;
            c28655q = c28655q3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(viewState, i13, function3, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m95585l(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m95586m(C31053c c31053c, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(c31053c.getAccessibilityLabel(), semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m95587n(C31053c c31053c, C26068u c26068u, InterfaceC16432o1 interfaceC16432o1, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC22973k1 interfaceC22973k1M95605c = c31053c.getPaddingValues();
            C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 1.5d) * 8);
            C2306l c2306l = C2299e.f9107J;
            boolean zM87157i = c28655q.m87157i(c31053c) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C29793c(c31053c, function1, 15);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65718d(null, c26068u, interfaceC22973k1M95605c, c22971kM66746i, c2306l, interfaceC16432o1, false, null, (Function1) objM87133R, c28655q, 221184, 393);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m95588o(C31053c c31053c, Function1 function1, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        List<InterfaceC25312u> listM95604b = c31053c.m95604b();
        C26053f c26053f = (C26053f) LazyRow;
        c26053f.m77529r(listM95604b.size(), null, new b(a.f128036w, listM95604b), new C37816b(new c(listM95604b, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final int m95589p(C26068u c26068u) {
        return m95594u(c26068u);
    }

    /* JADX INFO: renamed from: q */
    private static final int m95590q(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m95591r(C31053c c31053c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m95584k(c31053c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final boolean m95592s() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C39174f m95593t() {
        return new C39174f(2 * 8);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: u */
    private static final int m95594u(C26068u c26068u) {
        Object obj;
        ?? r10 = c26068u.m77565h().f103177k;
        if (r10.isEmpty()) {
            return 0;
        }
        int i13 = (c26068u.m77565h().f103178l + c26068u.m77565h().f103179m) / 2;
        Iterator it = ((Iterable) r10).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                C26062o c26062o = (C26062o) ((InterfaceC26054g) next);
                int iAbs = Math.abs(((c26062o.f103199p / 2) + c26062o.f103198o) - i13);
                do {
                    Object next2 = it.next();
                    C26062o c26062o2 = (C26062o) ((InterfaceC26054g) next2);
                    int iAbs2 = Math.abs(((c26062o2.f103199p / 2) + c26062o2.f103198o) - i13);
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) obj;
        if (interfaceC26054g != null) {
            return ((C26062o) interfaceC26054g).f103184a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public static final Modifier m95595v(Modifier fullParentMaxWidth, float f13) {
        AbstractC22676k.m65750j(fullParentMaxWidth, "$this$fullParentMaxWidth");
        return AbstractC1131a.m3498b(fullParentMaxWidth, new C13698g(f13, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC39130s0 m95596w(float f13, InterfaceC39133t0 layout, InterfaceC39124q0 measurable, C39169a c39169a) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC22676k.m65750j(measurable, "measurable");
        long j7 = c39169a.f168407a;
        AbstractC39104j1 abstractC39104j1Mo448T = measurable.mo448T(C39169a.m124758b(j7, 0, layout.mo724F(f13 * 2) + C39169a.m124765i(j7), 0, C39169a.m124764h(c39169a.f168407a), 5));
        return layout.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C4592m(abstractC39104j1Mo448T, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m95597x(AbstractC39104j1 abstractC39104j1, AbstractC39101i1 layout) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        layout.m124632f(abstractC39104j1, 0, 0, 0.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final AbstractC28669t1 m95598y() {
        return f128034a;
    }

    /* JADX INFO: renamed from: z */
    public static final AbstractC28669t1 m95599z() {
        return f128035b;
    }
}

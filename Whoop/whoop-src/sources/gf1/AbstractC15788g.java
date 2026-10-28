package gf1;

import af1.AbstractC0810d;
import af1.C0807a;
import am2.C1042s;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import aq1.C1909c;
import bc3.InterfaceC2994c0;
import bm2.C3424a0;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d61.InterfaceC11732a;
import ef1.AbstractC13149e;
import ef1.C13147c;
import ef1.C13148d;
import ef1.C13150f;
import ef1.InterfaceC13145a;
import g40.C15449y1;
import g90.C15595a;
import ge0.C15728c;
import i11.AbstractC17862e;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k71.C22246d;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n21.AbstractC26189c;
import no.nordicsemi.android.dfu.DfuBaseService;
import o51.AbstractC27537c;
import o51.C27539e;
import o51.C27540f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33231x0;
import p736sz0.C33223u0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s01.AbstractC32050f;
import s01.C32048d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.C35670i;
import v41.C35678m;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: gf1.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a=\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\f\u0010\u000b\u001aE\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001a²\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lef1/c$b;", "viewState", "", "exercisePath", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "s", "(Landroidx/compose/ui/Modifier;Lef1/c$b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "n", "Lef1/c$c;", "currentTimeSegmentState", "", "selectedIndex", "D", "(Lef1/c$b;Lef1/c$c;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lo51/e;", "noDataGraphState", "z", "(Lef1/c$c;Lo51/e;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "modifiedState", "", "isScrubbing", "exercise-progress-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15788g {

    /* JADX INFO: renamed from: gf1.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.exerciseprogressminiarch.view.ExerciseProgressScreenContentKt$ExerciseProgressScreenContent$1$1", m100430f = "ExerciseProgressScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f59494w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f59495x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f59496y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f59495x = interfaceC28601c1;
            this.f59496y = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f59495x, this.f59496y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f59494w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC15788g.m44526v(this.f59495x)) {
                AbstractC15788g.m44525u(this.f59496y, null);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Modifier m44495A(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-2071313835);
        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), "ExerciseProgressGraph");
        c28655q.m87173q(false);
        return modifierM3599a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m44496B(Function1 function1, Integer num, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC13145a.d(num != null ? num.intValue() : 0, it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m44497C(C13147c.c cVar, C27539e c27539e, Integer num, Function1 function1, int i13, Composer composer, int i14) {
        m44530z(cVar, c27539e, num, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0264  */
    /* JADX WARN: Code duplicated, block: B:106:0x0273  */
    /* JADX WARN: Code duplicated, block: B:107:0x028b  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ad A[LOOP:1: B:108:0x02a7->B:110:0x02ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:131:0x035c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0360  */
    /* JADX WARN: Code duplicated, block: B:137:0x0381  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:141:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:144:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:149:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:155:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:162:0x01a6 A[EDGE_INSN: B:162:0x01a6->B:82:0x01a6 BREAK  A[LOOP:0: B:76:0x0174->B:81:0x0197], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0143  */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:80:0x018d  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:94:0x0216  */
    /* JADX WARN: Code duplicated, block: B:97:0x0245  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    private static final void m44498D(C13147c.b bVar, C13147c.c cVar, Integer num, String str, Function1 function1, Composer composer, int i13) {
        int i14;
        String strM21274h;
        String str2;
        int iHashCode;
        Iterator<T> it;
        boolean zHasNext;
        C28676v0 c28676v0;
        int iHashCode2;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode3;
        C27540f c27540fM36813d;
        ArrayList arrayList;
        Iterator<T> it3;
        int iM83097b;
        boolean z4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        char c3;
        boolean z15;
        boolean z16;
        int iHashCode4;
        C0213j c0213j2;
        C0209i c0209i2;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R2;
        Object objM87133R3;
        C2307m c2307m = C2299e.f9114w;
        C2306l c2306l = C2299e.f9107J;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-23086607);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(cVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(num) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            C15782a c15782a = (C15782a) c28655q.m87161k(AbstractC15783b.m44491c());
            C35678m c35678m = (C35678m) AbstractC25265s.m74100H0(cVar.m36821f());
            TextResource textResourceM113023a = c35678m != null ? c35678m.getMetric() : null;
            if (textResourceM113023a == null) {
                c28655q.m87150e0(-577967048);
                c28655q.m87173q(false);
                strM21274h = null;
            } else {
                c28655q.m87150e0(-577967047);
                strM21274h = AbstractC8693b.m21274h(textResourceM113023a, c28655q, TextResource.$stable);
                c28655q.m87173q(false);
            }
            if (strM21274h == null) {
                strM21274h = "";
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j3 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S) {
                str2 = strM21274h;
            } else {
                str2 = strM21274h;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(0.5f, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                c28655q.m87150e0(277686149);
                it = cVar.m36821f().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    c28676v0 = C28635l.f115821a;
                    if (zHasNext) {
                        break;
                    }
                    C35678m c35678m2 = (C35678m) it.next();
                    C35670i c35670i = new C35670i();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C15449y1(25);
                        c28655q.m87172p0(objM87133R3);
                    }
                    c35670i.Compose(c35678m2, (Function1) objM87133R3, c28655q, C35678m.f151630k | 48 | (C35670i.f151609a << 6));
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierMo3471e = new LayoutWeightElement(1.0f, true).mo3471e(new VerticalAlignElement(c2306l));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i7 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a2);
                C0209i c0209i8 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N3);
                float f13 = 4;
                Modifier modifierM3424u = AbstractC1102d.m3424u(42 * f13, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3424u);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                c27540fM36813d = bVar.getSegmentController();
                if (c27540fM36813d == null) {
                    c28655q.m87150e0(1768123766);
                    c28655q.m87173q(false);
                    z15 = false;
                    z16 = true;
                    c3 = 256;
                } else {
                    c28655q.m87150e0(1768123767);
                    List<String> listM83096a = c27540fM36813d.m83096a();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM83096a, 10));
                    it3 = listM83096a.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new C33223u0((String) it3.next(), null, 2, 0 == true ? 1 : 0));
                    }
                    if (num != null) {
                        iM83097b = num.intValue();
                    } else {
                        iM83097b = c27540fM36813d.getInitialIndex();
                    }
                    boolean zM87157i = c28655q.m87157i(c27540fM36813d);
                    if ((i15 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean zM87153g = zM87157i | z4 | c28655q.m87153g(c15782a);
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87153g | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14 || objM87133R == c28676v0) {
                        C1042s c1042s = new C1042s((Object) c27540fM36813d, (Object) num, (Object) c15782a, function1, 21);
                        c15782a = c15782a;
                        c28655q.m87172p0(c1042s);
                        objM87133R = c1042s;
                    }
                    c3 = 256;
                    z15 = false;
                    int i16 = iM83097b;
                    z16 = true;
                    AbstractC33231x0.m105420e(arrayList, i16, null, null, (Function1) objM87133R, c28655q, 0, 12);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z16);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13 * f13, r20));
                Modifier modifierM3424u2 = AbstractC1102d.m3424u(52 * f13, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z15);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3424u2);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                TextResource textResourceM51373m = cVar.getDateSelectorState().getText();
                boolean zM51365e = cVar.getDateSelectorState().getBackButtonEnabled();
                boolean zM51368h = cVar.getDateSelectorState().getForwardButtonEnabled();
                String strM51366f = cVar.getDateSelectorState().getBackDate();
                String strM51369i = cVar.getDateSelectorState().getForwardDate();
                boolean zM87157i2 = c28655q.m87157i(cVar) | c28655q.m87157i(bVar);
                if ((i15 & 896) == c3) {
                    z17 = z16;
                } else {
                    z17 = z15;
                }
                boolean zM87153g2 = zM87157i2 | z17 | c28655q.m87153g(str2) | c28655q.m87153g(c15782a);
                if ((i15 & 57344) == 16384) {
                    z18 = z16;
                } else {
                    z18 = z15;
                }
                boolean z25 = zM87153g2 | z18;
                if ((i15 & 7168) == 2048) {
                    z19 = z16;
                } else {
                    z19 = z15;
                }
                z24 = z25 | z19;
                objM87133R2 = c28655q.m87133R();
                if (z24 || objM87133R2 == c28676v0) {
                    C3424a0 c3424a0 = new C3424a0(cVar, bVar, num, str2, c15782a, function1, str, 6);
                    c28655q.m87172p0(c3424a0);
                    objM87133R2 = c3424a0;
                }
                AbstractC17862e.m51358q(null, false, null, textResourceM51373m, zM51365e, zM51368h, strM51366f, strM51369i, null, null, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 9, 0, 3847);
                c28655q = c28655q;
                AbstractC25012a.m73392y(c28655q, z16, z16, z16);
            }
            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N);
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(0.5f, c2314t);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
            c28655q.m87150e0(277686149);
            it = cVar.m36821f().iterator();
            while (true) {
                zHasNext = it.hasNext();
                c28676v0 = C28635l.f115821a;
                if (zHasNext) {
                    break;
                    break;
                }
                C35678m c35678m3 = (C35678m) it.next();
                C35670i c35670i2 = new C35670i();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C15449y1(25);
                    c28655q.m87172p0(objM87133R3);
                }
                c35670i2.Compose(c35678m3, (Function1) objM87133R3, c28655q, C35678m.f151630k | 48 | (C35670i.f151609a << 6));
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e2 = new LayoutWeightElement(1.0f, true).mo3471e(new VerticalAlignElement(c2306l));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            float f14 = 4;
            Modifier modifierM3424u3 = AbstractC1102d.m3424u(42 * f14, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3424u3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            c27540fM36813d = bVar.getSegmentController();
            if (c27540fM36813d == null) {
                c28655q.m87150e0(1768123766);
                c28655q.m87173q(false);
                z15 = false;
                z16 = true;
                c3 = 256;
            } else {
                c28655q.m87150e0(1768123767);
                List<String> listM83096a2 = c27540fM36813d.m83096a();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM83096a2, 10));
                it3 = listM83096a2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new C33223u0((String) it3.next(), null, 2, 0 == true ? 1 : 0));
                }
                if (num != null) {
                    iM83097b = num.intValue();
                } else {
                    iM83097b = c27540fM36813d.getInitialIndex();
                }
                boolean zM87157i3 = c28655q.m87157i(c27540fM36813d);
                if ((i15 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean zM87153g3 = zM87157i3 | z4 | c28655q.m87153g(c15782a);
                if ((i15 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87153g3 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    C1042s c1042s2 = new C1042s((Object) c27540fM36813d, (Object) num, (Object) c15782a, function1, 21);
                    c15782a = c15782a;
                    c28655q.m87172p0(c1042s2);
                    objM87133R = c1042s2;
                } else {
                    C1042s c1042s3 = new C1042s((Object) c27540fM36813d, (Object) num, (Object) c15782a, function1, 21);
                    c15782a = c15782a;
                    c28655q.m87172p0(c1042s3);
                    objM87133R = c1042s3;
                }
                c3 = 256;
                z15 = false;
                int i17 = iM83097b;
                z16 = true;
                AbstractC33231x0.m105420e(arrayList, i17, null, null, (Function1) objM87133R, c28655q, 0, 12);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z16);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14 * f14, r20));
            Modifier modifierM3424u4 = AbstractC1102d.m3424u(52 * f14, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, z15);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3424u4);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
            TextResource textResourceM51373m2 = cVar.getDateSelectorState().getText();
            boolean zM51365e2 = cVar.getDateSelectorState().getBackButtonEnabled();
            boolean zM51368h2 = cVar.getDateSelectorState().getForwardButtonEnabled();
            String strM51366f2 = cVar.getDateSelectorState().getBackDate();
            String strM51369i2 = cVar.getDateSelectorState().getForwardDate();
            boolean zM87157i4 = c28655q.m87157i(cVar) | c28655q.m87157i(bVar);
            if ((i15 & 896) == c3) {
                z17 = z16;
            } else {
                z17 = z15;
            }
            boolean zM87153g4 = zM87157i4 | z17 | c28655q.m87153g(str2) | c28655q.m87153g(c15782a);
            if ((i15 & 57344) == 16384) {
                z18 = z16;
            } else {
                z18 = z15;
            }
            boolean z26 = zM87153g4 | z18;
            if ((i15 & 7168) == 2048) {
                z19 = z16;
            } else {
                z19 = z15;
            }
            z24 = z26 | z19;
            objM87133R2 = c28655q.m87133R();
            if (z24) {
                C3424a0 c3424a1 = new C3424a0(cVar, bVar, num, str2, c15782a, function1, str, 6);
                c28655q.m87172p0(c3424a1);
                objM87133R2 = c3424a1;
            } else {
                C3424a0 c3424a2 = new C3424a0(cVar, bVar, num, str2, c15782a, function1, str, 6);
                c28655q.m87172p0(c3424a2);
                objM87133R2 = c3424a2;
            }
            AbstractC17862e.m51358q(null, false, null, textResourceM51373m2, zM51365e2, zM51368h2, strM51366f2, strM51369i2, null, null, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 9, 0, 3847);
            c28655q = c28655q;
            AbstractC25012a.m73392y(c28655q, z16, z16, z16);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(bVar, cVar, num, str, function1, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m44499E(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m44500F(C27540f c27540f, Integer num, C15782a c15782a, Function1 function1, int i13) {
        InterfaceC13145a.a.C41523a c41523aM1962d = C0807a.f2971a.m1962d(c27540f, num, i13, c15782a.getExerciseName());
        if (c41523aM1962d != null) {
            function1.invoke(c41523aM1962d);
        }
        function1.invoke(new InterfaceC13145a.c(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m44501G(C13147c.c cVar, C13147c.b bVar, Integer num, String str, C15782a c15782a, Function1 function1, String str2, Object date) {
        AbstractC22676k.m65750j(date, "date");
        InterfaceC13145a.a.b bVarM1959a = C0807a.f2971a.m1959a(cVar.getDateSelectorState(), bVar.getSegmentController(), num, date, str, c15782a.getExerciseName());
        if (bVarM1959a != null) {
            function1.invoke(bVarM1959a);
        }
        String str3 = date instanceof String ? (String) date : null;
        if (str3 != null) {
            function1.invoke(new InterfaceC13145a.b(str2, str3));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m44502H(C13147c.b bVar, C13147c.c cVar, Integer num, String str, Function1 function1, int i13, Composer composer, int i14) {
        m44498D(bVar, cVar, num, str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x0208  */
    /* JADX WARN: Code duplicated, block: B:109:0x022c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0237  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x0115  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
    /* JADX WARN: Code duplicated, block: B:77:0x0131  */
    /* JADX WARN: Code duplicated, block: B:79:0x015f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0163  */
    /* JADX WARN: Code duplicated, block: B:85:0x017e  */
    /* JADX WARN: Code duplicated, block: B:88:0x018a  */
    /* JADX WARN: Code duplicated, block: B:89:0x018c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0195  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fd  */
    /* JADX INFO: renamed from: n */
    public static final void m44518n(Modifier modifier, C13147c.b viewState, String exercisePath, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        Integer numM36814e;
        int iIntValue;
        C13147c.c cVar;
        int iHashCode2;
        int i16;
        boolean z13;
        Object objM87133R;
        float f13;
        boolean z14;
        C32048d c32048dM36822g;
        boolean z15;
        Object objM87133R2;
        boolean z16;
        C27540f c27540fM36813d;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(exercisePath, "exercisePath");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2136777676);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(exercisePath) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
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
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C15449y1(24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                numM36814e = viewState.getSelectedIndex();
                if (numM36814e == null) {
                    c27540fM36813d = viewState.getSegmentController();
                    if (c27540fM36813d != null) {
                        numM36814e = Integer.valueOf(c27540fM36813d.getInitialIndex());
                    } else {
                        numM36814e = null;
                    }
                }
                Map<Integer, C13147c.c> mapM36815f = viewState.m36815f();
                if (numM36814e != null) {
                    iIntValue = numM36814e.intValue();
                } else {
                    iIntValue = 0;
                }
                cVar = mapM36815f.get(Integer.valueOf(iIntValue));
                if (cVar == null) {
                    c28655q.m87150e0(-2089848452);
                    c28655q.m87173q(false);
                    modifier3 = modifier4;
                    function2 = function4;
                    z14 = true;
                } else {
                    c28655q.m87150e0(-2089848451);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    Integer num = numM36814e;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    i16 = i15 & 7168;
                    if (i16 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C15728c(function4, 4);
                        c28655q.m87172p0(objM87133R);
                    }
                    m44498D(viewState, cVar, num, exercisePath, (Function1) objM87133R, c28655q, ((i15 >> 3) & 14) | ((i15 << 3) & 7168));
                    f13 = 8;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * f13, c2314t));
                    Function1 function5 = function4;
                    modifier3 = modifier4;
                    z14 = true;
                    m44530z(cVar, viewState.getNoDataGraphState(), num, function5, c28655q, (C27539e.f110868d << 3) | i16);
                    function2 = function5;
                    c28655q = c28655q;
                    c32048dM36822g = cVar.getWhoopCoachVow();
                    if (c32048dM36822g == null) {
                        c28655q.m87150e0(1757444885);
                        z16 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1757444886);
                        Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f13, 1);
                        if (i16 == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z15 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C15728c(function2, 5);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC32050f.m99607k(modifierM3396r, c32048dM36822g, (Function1) objM87133R2, c28655q, (C32048d.f132920h << 3) | 6, 0);
                        z16 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(z16);
                }
                c28655q.m87173q(z14);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15785d(modifier3, viewState, exercisePath, function3, i13, i14, 1);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
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
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C15449y1(24);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            numM36814e = viewState.getSelectedIndex();
            if (numM36814e == null) {
                c27540fM36813d = viewState.getSegmentController();
                if (c27540fM36813d != null) {
                    numM36814e = Integer.valueOf(c27540fM36813d.getInitialIndex());
                } else {
                    numM36814e = null;
                }
            }
            Map<Integer, C13147c.c> mapM36815f2 = viewState.m36815f();
            if (numM36814e != null) {
                iIntValue = numM36814e.intValue();
            } else {
                iIntValue = 0;
            }
            cVar = mapM36815f2.get(Integer.valueOf(iIntValue));
            if (cVar == null) {
                c28655q.m87150e0(-2089848452);
                c28655q.m87173q(false);
                modifier3 = modifier4;
                function2 = function4;
                z14 = true;
            } else {
                c28655q.m87150e0(-2089848451);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                Integer num2 = numM36814e;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                i16 = i15 & 7168;
                if (i16 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C15728c(function4, 4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15728c(function4, 4);
                    c28655q.m87172p0(objM87133R);
                }
                m44498D(viewState, cVar, num2, exercisePath, (Function1) objM87133R, c28655q, ((i15 >> 3) & 14) | ((i15 << 3) & 7168));
                f13 = 8;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * f13, c2314t));
                Function1 function6 = function4;
                modifier3 = modifier4;
                z14 = true;
                m44530z(cVar, viewState.getNoDataGraphState(), num2, function6, c28655q, (C27539e.f110868d << 3) | i16);
                function2 = function6;
                c28655q = c28655q;
                c32048dM36822g = cVar.getWhoopCoachVow();
                if (c32048dM36822g == null) {
                    c28655q.m87150e0(1757444885);
                    z16 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1757444886);
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f13, 1);
                    if (i16 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        objM87133R2 = new C15728c(function2, 5);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C15728c(function2, 5);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC32050f.m99607k(modifierM3396r2, c32048dM36822g, (Function1) objM87133R2, c28655q, (C32048d.f132920h << 3) | 6, 0);
                    z16 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(z16);
            }
            c28655q.m87173q(z14);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15785d(modifier3, viewState, exercisePath, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m44519o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m44520p(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m44521q(Function1 function1, Object event) {
        C9598e c9598eM99591c;
        AbstractC22676k.m65750j(event, "event");
        if ((event instanceof C32048d) && (c9598eM99591c = ((C32048d) event).getDestination()) != null) {
            function1.invoke(c9598eM99591c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m44522r(Modifier modifier, C13147c.b bVar, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m44518n(modifier, bVar, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m44523s(Modifier modifier, C13147c.b viewState, String exercisePath, Function1 onEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(exercisePath, "exercisePath");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-827870353);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(exercisePath) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(onEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i15;
        if (c28655q2.m87135U(i17 & 1, (i17 & 1171) != 1170)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C13148d();
                c28655q2.m87172p0(objM87133R);
            }
            C13148d c13148d = (C13148d) objM87133R;
            Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C15782a c15782a = (C15782a) c28655q2.m87161k(AbstractC15783b.m44491c());
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new a(interfaceC28601c2, interfaceC28601c1, null);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, viewState);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier3);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            C13147c.b bVarM44524t = m44524t(interfaceC28601c1);
            C13147c.b bVar = bVarM44524t == null ? viewState : bVarM44524t;
            boolean zM87157i = c28655q2.m87157i(viewState) | c28655q2.m87157i(context) | ((i17 & 7168) == 2048) | c28655q2.m87153g(c15782a);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                C3424a0 c3424a0 = new C3424a0((Object) c13148d, (Object) viewState, (Object) context, (Object) onEvent, (Object) c15782a, interfaceC28601c1, interfaceC28601c2, 5);
                c28655q2.m87172p0(c3424a0);
                objM87133R5 = c3424a0;
            }
            c28655q = c28655q2;
            m44518n(null, bVar, exercisePath, (Function1) objM87133R5, c28655q, i17 & 896, 1);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15785d(modifier2, viewState, exercisePath, onEvent, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: t */
    private static final C13147c.b m44524t(InterfaceC28601c1 interfaceC28601c1) {
        return (C13147c.b) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m44525u(InterfaceC28601c1 interfaceC28601c1, C13147c.b bVar) {
        interfaceC28601c1.setValue(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final boolean m44526v(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: w */
    private static final void m44527w(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m44528x(C13148d c13148d, C13147c.b bVar, Context context, Function1 function1, C15782a c15782a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof InterfaceC13145a.d) {
            InterfaceC13145a.d dVar = (InterfaceC13145a.d) it;
            C13150f c13150fM36824a = c13148d.m36824a(dVar, bVar, m44524t(interfaceC28601c1));
            Object objM36792a = dVar.getAction();
            InterfaceC11732a interfaceC11732a = objM36792a instanceof InterfaceC11732a ? (InterfaceC11732a) objM36792a : null;
            if (c13150fM36824a != null) {
                if ((interfaceC11732a instanceof InterfaceC11732a.c) && AbstractC13149e.m36826a(interfaceC11732a)) {
                    function1.invoke(C0807a.f2971a.m1960b(dVar.getSelectedIndex(), bVar.getSegmentController(), AbstractC0810d.m1969a(interfaceC11732a, context), c15782a.getExerciseName(), c15782a.getExerciseType()));
                }
                m44527w(interfaceC28601c2, c13150fM36824a.getIsScrubbing());
                m44525u(interfaceC28601c1, c13150fM36824a.getModifiedState());
            } else {
                function1.invoke(it);
            }
        } else {
            function1.invoke(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m44529y(Modifier modifier, C13147c.b bVar, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m44523s(modifier, bVar, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m44530z(C13147c.c cVar, C27539e c27539e, Integer num, Function1 function1, Composer composer, int i13) {
        C13147c.c cVar2;
        int i14;
        boolean z4;
        boolean z13;
        List<AbstractC21394b> listM60096f;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(876337121);
        if ((i13 & 6) == 0) {
            cVar2 = cVar;
            i14 = (c28655q.m87157i(cVar2) ? 4 : 2) | i13;
        } else {
            cVar2 = cVar;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c27539e) : c28655q.m87157i(c27539e) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(num) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            InterfaceC25312u interfaceC25312uM36819d = cVar2.getGraphItem();
            List<C22246d> listM36820e = cVar2.m36820e();
            C21395c c21395c = interfaceC25312uM36819d instanceof C21395c ? (C21395c) interfaceC25312uM36819d : null;
            if (c21395c == null || (listM60096f = c21395c.m60096f()) == null) {
                z4 = false;
            } else {
                List<AbstractC21394b> list = listM60096f;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!(((AbstractC21394b) it.next()) instanceof AbstractC21394b.d)) {
                                z4 = false;
                            }
                        }
                    }
                }
                z4 = true;
            }
            if ((interfaceC25312uM36819d == null || z4) && c27539e != null) {
                c28655q.m87150e0(-2146512302);
                AbstractC22676k.m65747g(c27539e);
                AbstractC27537c.m83073s(c27539e, c28655q, C27539e.f110868d);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2146426184);
                List<C22246d> list2 = listM36820e;
                boolean z14 = list2 == null || list2.isEmpty();
                C2314t c2314t = C2314t.f9131w;
                if (z14) {
                    z13 = false;
                    c28655q.m87150e0(-2146175487);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2146405166);
                    float f13 = 8;
                    z13 = false;
                    AbstractC26189c.m77740e(listM36820e, AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f13, 0.0f, 2 * f13, 5), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite70(), c28655q, 48, 0);
                    c28655q.m87173q(false);
                }
                if (interfaceC25312uM36819d != 0) {
                    c28655q.m87150e0(-2146122880);
                    Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), z13, 1.3333334f);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z13);
                    int iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3384f);
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
                    C15786e c15786e = new C15786e(0);
                    boolean z15 = ((i15 & 7168) == 2048 ? true : z13) | ((i15 & 896) == 256 ? true : z13);
                    Object objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C15787f(function1, num, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74291r(interfaceC25312uM36819d, null, c15786e, (Function1) objM87133R, c28655q, 0, 2);
                    c28655q.m87173q(true);
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(-2145496122);
                    AbstractC22989q.m66760a(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), z13, 1.3333334f), c28655q, 6);
                    c28655q.m87173q(z13);
                }
                c28655q.m87173q(z13);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15595a(cVar, c27539e, num, function1, i13, 3);
        }
    }
}

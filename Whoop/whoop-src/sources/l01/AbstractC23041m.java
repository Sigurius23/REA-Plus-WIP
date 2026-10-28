package l01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.EnumC2888c;
import c11.C3837d;
import c13.AbstractC3855a;
import c41.C4048j0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ck1.C4789l;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import dp0.C12253i;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import gb1.C15696x;
import ge3.AbstractC15751g;
import gf1.C15786e;
import gz0.EnumC16313m0;
import h02.C16576i;
import hy0.AbstractC17746g1;
import hy0.C17728c;
import hy0.C17750h1;
import hy0.C17780q0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import i91.C18252f;
import ih0.AbstractC18489d0;
import ih1.C18522f;
import io2.C20778p;
import iz0.AbstractC21048g;
import iz0.C21053l;
import j81.C21421e;
import j93.AbstractC21478l0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp1.C21852d;
import k71.C22252i;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kl2.C22571f;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17894k0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23001u;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p355o2.C27430e;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.C39077b1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p699b70.C2775a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import s11.AbstractC32066b;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: l01.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0005*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u000b\u001a+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u000b\u001a)\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001fH\u0003¢\u0006\u0004\b \u0010!\u001aE\u0010'\u001a\u00020\u0006*\u00020\"2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b'\u0010(\u001aQ\u00100\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b0\u00101\u001a\u0019\u00102\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b2\u00103\u001a\u0019\u00104\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b4\u00103\u001a\u0019\u00105\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b5\u00103\u001a\u0019\u00106\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b6\u00103\u001a\u0019\u00107\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b7\u00103¨\u00068"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll01/n;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "k0", "(Landroidx/compose/ui/Modifier;Ll01/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Y", "(Ll01/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "imageSource", "Ll01/t;", "style", "A", "(Lkd1/o;Ll01/t;Landroidx/compose/runtime/Composer;I)V", "Lny0/h;", "p0", "(Lny0/h;)Ljava/lang/Object;", "R", "L", "Ll01/d;", "featureList", "Li91/a;", "background", "J", "(Ll01/d;Li91/a;Ll01/t;Landroidx/compose/runtime/Composer;I)V", "C", "(Li91/a;Landroidx/compose/runtime/Composer;I)V", "Ll01/b;", "E", "(Ll01/b;Landroidx/compose/runtime/Composer;I)V", "Ll0/u;", "Lgz0/m0;", "icon", "", "id", "G", "(Ll0/u;Landroidx/compose/ui/Modifier;Lgz0/m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "cornerRadius", "strokeWidth", "", "Li2/x;", "gradientColors", "content", "V", "(Landroidx/compose/ui/Modifier;FFLjava/util/List;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "g0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "i0", "a0", "e0", "c0", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23041m {

    /* JADX INFO: renamed from: l01.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Modifier f90821w;

        public a(Modifier modifier) {
            this.f90821w = modifier;
        }

        /* JADX INFO: renamed from: a */
        public final void m66906a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-2013759731);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC15673b0.m44028b0(C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            Modifier modifier = this.f90821w;
            C23042n c23042nM66943a = C23043o.f90862a.m66943a();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = b.f90822w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23041m.m66885k0(modifier, c23042nM66943a, (Function1) objM87133R, c28655q, 384, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m66906a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f90822w = new b();

        /* JADX INFO: renamed from: a */
        public final void m66907a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m66907a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Modifier f90823w;

        public c(Modifier modifier) {
            this.f90823w = modifier;
        }

        /* JADX INFO: renamed from: a */
        public final void m66908a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-334378844);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC15673b0.m44028b0(C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            Modifier modifier = this.f90823w;
            C23042n c23042nM66944b = C23043o.f90862a.m66944b();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = d.f90824w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23041m.m66885k0(modifier, c23042nM66944b, (Function1) objM87133R, c28655q, 384, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m66908a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f90824w = new d();

        /* JADX INFO: renamed from: a */
        public final void m66909a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m66909a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Modifier f90825w;

        public e(Modifier modifier) {
            this.f90825w = modifier;
        }

        /* JADX INFO: renamed from: a */
        public final void m66910a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(81360043);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC15673b0.m44028b0(C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            Modifier modifier = this.f90825w;
            C23042n c23042nM66945c = C23043o.f90862a.m66945c();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = f.f90826w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23041m.m66885k0(modifier, c23042nM66945c, (Function1) objM87133R, c28655q, 384, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m66910a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f90826w = new f();

        /* JADX INFO: renamed from: a */
        public final void m66911a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m66911a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Modifier f90827w;

        public g(Modifier modifier) {
            this.f90827w = modifier;
        }

        /* JADX INFO: renamed from: a */
        public final void m66912a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(367255622);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC15673b0.m44028b0(C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            Modifier modifier = this.f90827w;
            C23043o c23043o = C23043o.f90862a;
            C23042n c23042nM66948f = c23043o.m66948f();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = h.f90828w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23041m.m66885k0(modifier, c23042nM66948f, (Function1) objM87133R, c28655q, 384, 0);
            Modifier modifier2 = this.f90827w;
            C23042n c23042nM66949g = c23043o.m66949g();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = i.f90829w;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC23041m.m66885k0(modifier2, c23042nM66949g, (Function1) objM87133R2, c28655q, 384, 0);
            Modifier modifier3 = this.f90827w;
            C23042n c23042nM66947e = c23043o.m66947e();
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = j.f90830w;
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC23041m.m66885k0(modifier3, c23042nM66947e, (Function1) objM87133R3, c28655q, 384, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m66912a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f90828w = new h();

        /* JADX INFO: renamed from: a */
        public final void m66913a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m66913a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f90829w = new i();

        /* JADX INFO: renamed from: a */
        public final void m66914a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m66914a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f90830w = new j();

        /* JADX INFO: renamed from: a */
        public final void m66915a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m66915a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Modifier f90831w;

        public k(Modifier modifier) {
            this.f90831w = modifier;
        }

        /* JADX INFO: renamed from: a */
        public final void m66916a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-393936211);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC15673b0.m44028b0(C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            Modifier modifier = this.f90831w;
            C23043o c23043o = C23043o.f90862a;
            C23042n c23042nM66921b = C23042n.m66921b(c23043o.m66948f(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2093055, null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = l.f90832w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23041m.m66885k0(modifier, c23042nM66921b, (Function1) objM87133R, c28655q, 384, 0);
            Modifier modifier2 = this.f90831w;
            C23042n c23042nM66921b2 = C23042n.m66921b(c23043o.m66949g(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2093055, null);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = m.f90833w;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC23041m.m66885k0(modifier2, c23042nM66921b2, (Function1) objM87133R2, c28655q, 384, 0);
            Modifier modifier3 = this.f90831w;
            C23042n c23042nM66921b3 = C23042n.m66921b(c23043o.m66947e(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2093055, null);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = n.f90834w;
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC23041m.m66885k0(modifier3, c23042nM66921b3, (Function1) objM87133R3, c28655q, 384, 0);
            Modifier modifier4 = this.f90831w;
            C23042n c23042nM66921b4 = C23042n.m66921b(c23043o.m66946d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2093055, null);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = o.f90835w;
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC23041m.m66885k0(modifier4, c23042nM66921b4, (Function1) objM87133R4, c28655q, 384, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m66916a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f90832w = new l();

        /* JADX INFO: renamed from: a */
        public final void m66917a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m66917a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f90833w = new m();

        /* JADX INFO: renamed from: a */
        public final void m66918a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m66918a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f90834w = new n();

        /* JADX INFO: renamed from: a */
        public final void m66919a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m66919a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l01.m$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f90835w = new o();

        /* JADX INFO: renamed from: a */
        public final void m66920a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m66920a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m66838A(AbstractC22403o abstractC22403o, EnumC23048t enumC23048t, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2007783637);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC23048t == null ? -1 : enumC23048t.ordinal()) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM3411h = AbstractC1102d.m3411h(10 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
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
            AbstractC29125c.m88524d(AbstractC34132o.m107874S(C38072d.f163053a.m121951d().getLogo().getWhoopText(), c28655q, 6), null, AbstractC1102d.m3419p(30 * f13, c2314t), null, c28655q, 25008, 104);
            float fM134452getTierImageMinHeightD9Ej5fM = 8;
            AbstractC38963t7.m124386p(1, fM134452getTierImageMinHeightD9Ej5fM, c2314t, c28655q);
            float f14 = 11 * f13;
            if (enumC23048t != null) {
                fM134452getTierImageMinHeightD9Ej5fM = enumC23048t.getTierImageMinHeight();
            }
            Modifier modifierM3423t = AbstractC1102d.m3423t(c2314t, f14, fM134452getTierImageMinHeightD9Ej5fM, 0.0f, enumC23048t != null ? enumC23048t.getTierImageMaxHeight() : 12, 4);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, i14 & 14, 3);
            abstractC22403o2 = abstractC22403o;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM3423t, null, C39102j.f168201c, 0.0f, null, c28655q, 24624, 104);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(abstractC22403o2, enumC23048t, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m66839B(AbstractC22403o abstractC22403o, EnumC23048t enumC23048t, int i13, Composer composer, int i14) {
        m66838A(abstractC22403o, enumC23048t, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m66840C(AbstractC18247a abstractC18247a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1223575748);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC18247a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM52565c = AbstractC18249c.m52565c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13 * f13, c2314t), AbstractC33253j.f138651a), abstractC18247a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM52565c);
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
            Modifier modifierM3419p = AbstractC1102d.m3419p(((float) 2.5d) * f13, c2314t);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getGrowth().getSelectedCheck(), c28655q, 6), null, modifierM3419p, c38072d.m121949b(c28655q, 6).getBrandBlack(), c28655q, 432, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17728c(abstractC18247a, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m66841D(AbstractC18247a abstractC18247a, int i13, Composer composer, int i14) {
        m66840C(abstractC18247a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final void m66842E(C23030b c23030b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1936718487);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(c23030b) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 2 * 8;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(C2314t.f9131w, f13, 0.0f, 2));
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q, 6).getWhite5(), AbstractC33253j.m105489e(f13)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c23030b.getTitle(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c23030b.getSubtitle(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(c23030b, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m66843F(C23030b c23030b, int i13, Composer composer, int i14) {
        m66842E(c23030b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: G */
    private static final void m66844G(InterfaceC23001u interfaceC23001u, Modifier modifier, EnumC16313m0 enumC16313m0, String str, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int i16;
        int i17;
        int iOrdinal;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-773182901);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 1;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (enumC16313m0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC16313m0.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i15 |= i18;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87153g(str)) {
                    i17 = 2048;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(function1)) {
                    i16 = 16384;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i16;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (enumC16313m0 != null || str == null) {
                    c28655q.m87150e0(18394007);
                    c28655q.m87173q(false);
                } else {
                    C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q, 17998850, enumC16313m0, c28655q, 6);
                    long jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    float f13 = 4;
                    Modifier modifierMo3400a = interfaceC23001u.mo3400a(AbstractC1102d.m3419p(f13 * f13, modifier4), C2299e.f9116y);
                    boolean z13 = ((57344 & i15) == 16384) | ((i15 & 7168) == 2048);
                    Object objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C4048j0(function1, str, 4);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC15005f3.m43108b(c27430eM53378s, null, AbstractC1136a.m3599a(AbstractC1092a.m3362g(modifierMo3400a, false, null, null, (InterfaceC4339a) objM87133R, 15), "UpsellCardCloseBtn"), jM125430y, c28655q, 48, 0);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(interfaceC23001u, modifier3, enumC16313m0, str, function1, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (enumC16313m0 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC16313m0.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q.m87153g(str)) {
                i17 = 2048;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(function1)) {
                i16 = 16384;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i16;
        }
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (enumC16313m0 != null) {
                c28655q.m87150e0(18394007);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(18394007);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(interfaceC23001u, modifier3, enumC16313m0, str, function1, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m66845H(Function1 function1, String str) {
        function1.invoke(new C23037i(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m66846I(InterfaceC23001u interfaceC23001u, Modifier modifier, EnumC16313m0 enumC16313m0, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m66844G(interfaceC23001u, modifier, enumC16313m0, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final void m66847J(C23032d c23032d, AbstractC18247a abstractC18247a, EnumC23048t enumC23048t, Composer composer, int i13) throws XmlPullParserException, IOException {
        C23032d c23032d2;
        int i14;
        float f13;
        C2314t c2314t;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1204514368);
        if ((i13 & 6) == 0) {
            c23032d2 = c23032d;
            i14 = (c28655q.m87157i(c23032d2) ? 4 : 2) | i13;
        } else {
            c23032d2 = c23032d;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(abstractC18247a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87149e(enumC23048t == null ? -1 : enumC23048t.ordinal()) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f14 = 8;
            float f15 = 2 * f14;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t2, f15, 0.0f, 2));
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f15, AbstractC31061c.m95629e(modifierM3409f, 1, f14, c38072d.m121949b(c28655q, 6).getWhite10()));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            if (c23032d2.getTitle() == null || !AbstractC8693b.m21270d(c23032d2.getTitle())) {
                f13 = f14;
                c2314t = c2314t2;
                z4 = false;
                c28655q.m87150e0(642627660);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(642428733);
                z4 = false;
                f13 = f14;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c23032d2.getTitle(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(1683299773);
            for (C23031c c23031c : c23032d.m66808c()) {
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 1.5d, f13, C2299e.f9108K, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (AbstractC25265s.m74155w0(AbstractC25260n.m74059b1(new EnumC23048t[]{EnumC23048t.ADVANCED_LABS, EnumC23048t.PDP}), enumC23048t)) {
                    c28655q.m87150e0(-79095138);
                    AbstractC32066b.m99639f(c23031c.getIcon(), c23031c.getIconBackgroundColor(), c23031c.getIconTintColor(), c23031c.getShape(), c23031c.getIconSize(), c28655q, 0, 0);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(-78738328);
                    m66840C(abstractC18247a, c28655q, (i14 >> 3) & 14);
                    c28655q.m87173q(z4);
                }
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(c23031c.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, EnumC2888c.INSTANCE.m8402a(c23031c.getTextStyle()), null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(c23032d, abstractC18247a, enumC23048t, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m66848K(C23032d c23032d, AbstractC18247a abstractC18247a, EnumC23048t enumC23048t, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m66847J(c23032d, abstractC18247a, enumC23048t, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final void m66849L(C23042n c23042n, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(730246807);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c23042n) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 2 * 8;
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13, 0.0f, 2), EnumC22935a1.f90537w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3388j);
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
            C27256h cardButton = c23042n.getCardButton();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (cardButton == null) {
                c28655q.m87150e0(630019068);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(630019069);
                C15786e c15786e = new C15786e(18);
                boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(cardButton);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C3837d(function1, cardButton, 5);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(cardButton, null, c15786e, (Function1) objM87133R, c28655q, 0, 2);
                c28655q.m87173q(false);
            }
            C27256h secondCardButton = c23042n.getSecondCardButton();
            if (secondCardButton == null) {
                c28655q.m87150e0(630356503);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(630356504);
                C15786e c15786e2 = new C15786e(19);
                boolean zM87157i2 = ((i14 & 112) == 32) | c28655q.m87157i(secondCardButton);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C3837d(function1, secondCardButton, 6);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC25303l.m74291r(secondCardButton, null, c15786e2, (Function1) objM87133R2, c28655q, 0, 2);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23040l(c23042n, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Modifier m66850M(InterfaceC22997s1 interfaceC22997s1, C27256h it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1340158033);
        Modifier modifierMo66772c = interfaceC22997s1.mo66772c(C2314t.f9131w, true, 1.0f);
        c28655q.m87173q(false);
        return modifierMo66772c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m66851N(Function1 function1, C27256h c27256h, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (!(it instanceof DesignItemInteraction)) {
            function1.invoke(m66895p0(c27256h));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final Modifier m66852O(InterfaceC22997s1 interfaceC22997s1, C27256h it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(525137048);
        Modifier modifierMo66772c = interfaceC22997s1.mo66772c(C2314t.f9131w, true, 1.0f);
        c28655q.m87173q(false);
        return modifierMo66772c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m66853P(Function1 function1, C27256h c27256h, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (!(it instanceof DesignItemInteraction)) {
            function1.invoke(m66895p0(c27256h));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m66854Q(C23042n c23042n, Function1 function1, int i13, Composer composer, int i14) {
        m66849L(c23042n, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private static final void m66855R(C23042n c23042n, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1545465339);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c23042n) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C27256h cardButton = c23042n.getCardButton();
            if (cardButton == null) {
                c28655q.m87150e0(1091621701);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1091621702);
                C15786e c15786e = new C15786e(20);
                boolean zM87157i = c28655q.m87157i(cardButton) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3837d(function1, cardButton, 7);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(cardButton, null, c15786e, (Function1) objM87133R, c28655q, 0, 2);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23040l(c23042n, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final Modifier m66856S(C27256h it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-401846527);
        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3388j(C2314t.f9131w, EnumC22935a1.f90538x), 1 * 8, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m66857T(Function1 function1, C27256h c27256h, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (!(it instanceof DesignItemInteraction)) {
            function1.invoke(m66895p0(c27256h));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m66858U(C23042n c23042n, Function1 function1, int i13, Composer composer, int i14) {
        m66855R(c23042n, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:108:0x01db  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:113:0x020c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0218  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:81:0x0136  */
    /* JADX WARN: Code duplicated, block: B:84:0x0149  */
    /* JADX WARN: Code duplicated, block: B:87:0x015a  */
    /* JADX WARN: Code duplicated, block: B:91:0x017f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Code duplicated, block: B:96:0x018e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0196  */
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
    /* JADX INFO: renamed from: V */
    public static final void m66859V(Modifier modifier, float f13, float f14, List<C17919x> list, Function3 function3, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        float f15;
        int i16;
        float f16;
        int i17;
        List<C17919x> listM118959K;
        boolean z4;
        Modifier modifier3;
        List<C17919x> list2;
        Function3 function4;
        float f17;
        float f18;
        C28677v1 c28677v1M87180u;
        int i18;
        C2314t c2314t;
        float f19;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier5;
        C17894k0 c17894k0M51493k;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int iHashCode2;
        int i19;
        int i24;
        Function3 content = function3;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-399354750);
        int i25 = i14 & 1;
        if (i25 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
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
                    if ((i14 & 8) == 0) {
                        listM118959K = list;
                        if (c28655q.m87157i(listM118959K)) {
                            i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i15 |= i24;
                    } else {
                        listM118959K = list;
                    }
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    i15 |= i24;
                } else {
                    listM118959K = list;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(content)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i18 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i18 != 0 || c28655q.m87118C()) {
                        if (i25 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i26 != 0) {
                            f15 = 16;
                        }
                        f19 = f15;
                        if (i16 != 0) {
                            f16 = (float) 1.5d;
                        }
                        if ((i14 & 8) != 0) {
                            C38072d c38072d = C38072d.f163053a;
                            i15 &= -7169;
                            f15 = f19;
                            listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.m51541c(0.0f, c38072d.m121949b(c28655q, 6).getWhite10())));
                        } else {
                            f15 = f19;
                        }
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                        }
                    }
                    c28655q.m87175r();
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                    C2307m c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    modifier4 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                    if (c28655q.f115903S) {
                        modifier5 = modifier4;
                    } else {
                        modifier5 = modifier4;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        c17894k0M51493k = C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14);
                        C1100b c1100b = C1100b.f4583a;
                        Modifier modifierMo3401b = c1100b.mo3401b(c2314t);
                        boolean zM87153g = c28655q.m87153g(c17894k0M51493k);
                        List<C17919x> list3 = listM118959K;
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z16 = zM87153g | z13;
                        int i27 = i15;
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | z16;
                        objM87133R = c28655q.m87133R();
                        if (z15 || objM87133R == C28635l.f115821a) {
                            objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC21478l0.m60421a(modifierMo3401b, (Function1) objM87133R, c28655q, 0);
                        Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f15));
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM118994r);
                        c28655q.m87158i0();
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
                        Function3 function5 = function3;
                        function5.invoke(c1100b, c28655q, Integer.valueOf(6 | ((i27 >> 9) & 112)));
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        list2 = list3;
                        modifier3 = modifier5;
                        function4 = function5;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    c17894k0M51493k = C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14);
                    C1100b c1100b2 = C1100b.f4583a;
                    Modifier modifierMo3401b2 = c1100b2.mo3401b(c2314t);
                    boolean zM87153g2 = c28655q.m87153g(c17894k0M51493k);
                    List<C17919x> list4 = listM118959K;
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z17 = zM87153g2 | z13;
                    int i28 = i15;
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z17;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC21478l0.m60421a(modifierMo3401b2, (Function1) objM87133R, c28655q, 0);
                    Modifier modifierM118994r2 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f15));
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM118994r2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                    Function3 function6 = function3;
                    function6.invoke(c1100b2, c28655q, Integer.valueOf(6 | ((i28 >> 9) & 112)));
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    list2 = list4;
                    modifier3 = modifier5;
                    function4 = function6;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    list2 = listM118959K;
                    function4 = content;
                }
                f17 = f15;
                f18 = f16;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C17780q0(modifier3, f17, f18, list2, function4, i13, i14);
                }
            }
            i15 |= 384;
            f16 = f14;
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    listM118959K = list;
                    if (c28655q.m87157i(listM118959K)) {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i24;
                } else {
                    listM118959K = list;
                }
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i24;
            } else {
                listM118959K = list;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(content)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i18 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    if (i25 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i26 != 0) {
                        f15 = 16;
                    }
                    f19 = f15;
                    if (i16 != 0) {
                        f16 = (float) 1.5d;
                    }
                    if ((i14 & 8) != 0) {
                        C38072d c38072d2 = C38072d.f163053a;
                        i15 &= -7169;
                        f15 = f19;
                        listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.m51541c(0.0f, c38072d2.m121949b(c28655q, 6).getWhite10())));
                    } else {
                        f15 = f19;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i26 != 0) {
                        f15 = 16;
                    }
                    f19 = f15;
                    if (i16 != 0) {
                        f16 = (float) 1.5d;
                    }
                    if ((i14 & 8) != 0) {
                        C38072d c38072d3 = C38072d.f163053a;
                        i15 &= -7169;
                        f15 = f19;
                        listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d3.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.m51541c(0.0f, c38072d3.m121949b(c28655q, 6).getWhite10())));
                    } else {
                        f15 = f19;
                    }
                }
                c28655q.m87175r();
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
                C2307m c2307m2 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                modifier4 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier5 = modifier4;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    c17894k0M51493k = C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14);
                    C1100b c1100b3 = C1100b.f4583a;
                    Modifier modifierMo3401b3 = c1100b3.mo3401b(c2314t);
                    boolean zM87153g3 = c28655q.m87153g(c17894k0M51493k);
                    List<C17919x> list5 = listM118959K;
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z18 = zM87153g3 | z13;
                    int i29 = i15;
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z18;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC21478l0.m60421a(modifierMo3401b3, (Function1) objM87133R, c28655q, 0);
                    Modifier modifierM118994r3 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f15));
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM118994r3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                    Function3 function7 = function3;
                    function7.invoke(c1100b3, c28655q, Integer.valueOf(6 | ((i29 >> 9) & 112)));
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    list2 = list5;
                    modifier3 = modifier5;
                    function4 = function7;
                } else {
                    modifier5 = modifier4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                c17894k0M51493k = C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14);
                C1100b c1100b4 = C1100b.f4583a;
                Modifier modifierMo3401b4 = c1100b4.mo3401b(c2314t);
                boolean zM87153g4 = c28655q.m87153g(c17894k0M51493k);
                List<C17919x> list6 = listM118959K;
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z19 = zM87153g4 | z13;
                int i210 = i15;
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z19;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierMo3401b4, (Function1) objM87133R, c28655q, 0);
                Modifier modifierM118994r4 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f15));
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM118994r4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                Function3 function8 = function3;
                function8.invoke(c1100b4, c28655q, Integer.valueOf(6 | ((i210 >> 9) & 112)));
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                list2 = list6;
                modifier3 = modifier5;
                function4 = function8;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                list2 = listM118959K;
                function4 = content;
            }
            f17 = f15;
            f18 = f16;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17780q0(modifier3, f17, f18, list2, function4, i13, i14);
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
                if ((i14 & 8) == 0) {
                    listM118959K = list;
                    if (c28655q.m87157i(listM118959K)) {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i24;
                } else {
                    listM118959K = list;
                }
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i24;
            } else {
                listM118959K = list;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(content)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i18 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    if (i25 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i26 != 0) {
                        f15 = 16;
                    }
                    f19 = f15;
                    if (i16 != 0) {
                        f16 = (float) 1.5d;
                    }
                    if ((i14 & 8) != 0) {
                        C38072d c38072d4 = C38072d.f163053a;
                        i15 &= -7169;
                        f15 = f19;
                        listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d4.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.m51541c(0.0f, c38072d4.m121949b(c28655q, 6).getWhite10())));
                    } else {
                        f15 = f19;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i26 != 0) {
                        f15 = 16;
                    }
                    f19 = f15;
                    if (i16 != 0) {
                        f16 = (float) 1.5d;
                    }
                    if ((i14 & 8) != 0) {
                        C38072d c38072d5 = C38072d.f163053a;
                        i15 &= -7169;
                        f15 = f19;
                        listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d5.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.m51541c(0.0f, c38072d5.m121949b(c28655q, 6).getWhite10())));
                    } else {
                        f15 = f19;
                    }
                }
                c28655q.m87175r();
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier2);
                C2307m c2307m3 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m3, false);
                modifier4 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d7);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier5 = modifier4;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                    c17894k0M51493k = C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14);
                    C1100b c1100b5 = C1100b.f4583a;
                    Modifier modifierMo3401b5 = c1100b5.mo3401b(c2314t);
                    boolean zM87153g5 = c28655q.m87153g(c17894k0M51493k);
                    List<C17919x> list7 = listM118959K;
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z110 = zM87153g5 | z13;
                    int i211 = i15;
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z110;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC21478l0.m60421a(modifierMo3401b5, (Function1) objM87133R, c28655q, 0);
                    Modifier modifierM118994r5 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f15));
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM118994r5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                    Function3 function9 = function3;
                    function9.invoke(c1100b5, c28655q, Integer.valueOf(6 | ((i211 >> 9) & 112)));
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    list2 = list7;
                    modifier3 = modifier5;
                    function4 = function9;
                } else {
                    modifier5 = modifier4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                c17894k0M51493k = C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14);
                C1100b c1100b6 = C1100b.f4583a;
                Modifier modifierMo3401b6 = c1100b6.mo3401b(c2314t);
                boolean zM87153g6 = c28655q.m87153g(c17894k0M51493k);
                List<C17919x> list8 = listM118959K;
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z111 = zM87153g6 | z13;
                int i212 = i15;
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z111;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierMo3401b6, (Function1) objM87133R, c28655q, 0);
                Modifier modifierM118994r6 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f15));
                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM118994r6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d9);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                Function3 function10 = function3;
                function10.invoke(c1100b6, c28655q, Integer.valueOf(6 | ((i212 >> 9) & 112)));
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                list2 = list8;
                modifier3 = modifier5;
                function4 = function10;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                list2 = listM118959K;
                function4 = content;
            }
            f17 = f15;
            f18 = f16;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17780q0(modifier3, f17, f18, list2, function4, i13, i14);
            }
        }
        i15 |= 384;
        f16 = f14;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                listM118959K = list;
                if (c28655q.m87157i(listM118959K)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i24;
            } else {
                listM118959K = list;
            }
            i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i24;
        } else {
            listM118959K = list;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(content)) {
                i19 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i19;
        }
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i18 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i26 != 0) {
                    f15 = 16;
                }
                f19 = f15;
                if (i16 != 0) {
                    f16 = (float) 1.5d;
                }
                if ((i14 & 8) != 0) {
                    C38072d c38072d6 = C38072d.f163053a;
                    i15 &= -7169;
                    f15 = f19;
                    listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d6.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.m51541c(0.0f, c38072d6.m121949b(c28655q, 6).getWhite10())));
                } else {
                    f15 = f19;
                }
            } else {
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i26 != 0) {
                    f15 = 16;
                }
                f19 = f15;
                if (i16 != 0) {
                    f16 = (float) 1.5d;
                }
                if ((i14 & 8) != 0) {
                    C38072d c38072d7 = C38072d.f163053a;
                    i15 &= -7169;
                    f15 = f19;
                    listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d7.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.m51541c(0.0f, c38072d7.m121949b(c28655q, 6).getWhite10())));
                } else {
                    f15 = f19;
                }
            }
            c28655q.m87175r();
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier2);
            C2307m c2307m4 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m4, false);
            modifier4 = modifier2;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d10);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier5 = modifier4;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                c17894k0M51493k = C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14);
                C1100b c1100b7 = C1100b.f4583a;
                Modifier modifierMo3401b7 = c1100b7.mo3401b(c2314t);
                boolean zM87153g7 = c28655q.m87153g(c17894k0M51493k);
                List<C17919x> list9 = listM118959K;
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z112 = zM87153g7 | z13;
                int i213 = i15;
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z112;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierMo3401b7, (Function1) objM87133R, c28655q, 0);
                Modifier modifierM118994r7 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f15));
                InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m4, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM118994r7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d11);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N11);
                Function3 function11 = function3;
                function11.invoke(c1100b7, c28655q, Integer.valueOf(6 | ((i213 >> 9) & 112)));
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                list2 = list9;
                modifier3 = modifier5;
                function4 = function11;
            } else {
                modifier5 = modifier4;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N10);
            c17894k0M51493k = C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14);
            C1100b c1100b8 = C1100b.f4583a;
            Modifier modifierMo3401b8 = c1100b8.mo3401b(c2314t);
            boolean zM87153g8 = c28655q.m87153g(c17894k0M51493k);
            List<C17919x> list10 = listM118959K;
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z113 = zM87153g8 | z13;
            int i214 = i15;
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z113;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C15696x(f15, f16, 1, c17894k0M51493k);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierMo3401b8, (Function1) objM87133R, c28655q, 0);
            Modifier modifierM118994r8 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f15));
            InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m4, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM118994r8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d12);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N12);
            Function3 function12 = function3;
            function12.invoke(c1100b8, c28655q, Integer.valueOf(6 | ((i214 >> 9) & 112)));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            list2 = list10;
            modifier3 = modifier5;
            function4 = function12;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            list2 = listM118959K;
            function4 = content;
        }
        f17 = f15;
        f18 = f16;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17780q0(modifier3, f17, f18, list2, function4, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m66860W(AbstractC17911t abstractC17911t, float f13, float f14, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jMo731d = Canvas.mo731d();
        float fMo743q0 = Canvas.mo743q0(f13);
        InterfaceC22131e.m63376J0(Canvas, abstractC17911t, 0L, jMo731d, (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L) | (Float.floatToRawIntBits(fMo743q0) << 32), 0.0f, new C22135i(Canvas.mo743q0(f14), 0.0f, 0, 0, null, 30), 210);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m66861X(Modifier modifier, float f13, float f14, List list, Function3 function3, int i13, int i14, Composer composer, int i15) {
        m66859V(modifier, f13, f14, list, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Float, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
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
    /* JADX INFO: renamed from: Y */
    private static final void m66862Y(C23042n c23042n, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        int i15;
        C28655q c28655q;
        int i16;
        C28655q c28655q2;
        C28655q c28655q3;
        float f13;
        C28655q c28655q4;
        ?? r14;
        ?? r15;
        AbstractC18247a checkmarkBackground;
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(-645796836);
        int i17 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q5.m87157i(c23042n) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q5.m87157i(function1) ? 32 : 16;
        }
        int i18 = i14;
        boolean z4 = false;
        if (c28655q5.m87135U(i18 & 1, (i18 & 19) != 18)) {
            String header = c23042n.getHeader();
            C2314t c2314t = C2314t.f9131w;
            C23454a0 c23454a0 = null;
            if (header == null) {
                c28655q5.m87150e0(-1774913185);
                c28655q5.m87173q(false);
                i16 = 6;
            } else {
                c28655q5.m87150e0(-1774913184);
                String strM21275i = AbstractC8693b.m21275i(header, c28655q5, 0);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C38072d c38072d = C38072d.f163053a;
                i16 = 6;
                AbstractC30795n.m94707h(strM21275i, modifierM3409f, c38072d.m121949b(c28655q5, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, 6).getT4(), null, c28655q5, 48, 0, 196088);
                c28655q2.m87173q(false);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                c28655q2 = c28655q5;
                c28655q3 = c28655q2;
                c28655q3.m87150e0(-1774654985);
                AbstractC22403o tierImage = c23042n.getTierImage();
                if (tierImage == null) {
                    c28655q3 = c28655q5;
                    c28655q3.m87150e0(1883943699);
                } else {
                    c28655q3 = c28655q5;
                    c28655q3.m87150e0(1883943700);
                    m66838A(tierImage, c23042n.getStyle(), c28655q3, 0);
                }
                c28655q3.m87173q(false);
                c28655q3.m87173q(false);
            } else {
                c28655q2 = c28655q5;
                c28655q3 = c28655q2;
                c28655q3 = c28655q5;
                c28655q3.m87150e0(-2135465597);
                c28655q3.m87173q(false);
            }
            if (c23042n.getShouldShowDivider()) {
                c28655q3.m87150e0(-1774527916);
                f13 = 0.0f;
                AbstractC15751g.m44449b(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 2 * 8, 0.0f, 2), C38072d.f163053a.m121949b(c28655q3, i16).getWhite10(), 1, 0.0f, c28655q3, 390, 8);
                c28655q3.m87173q(false);
            } else {
                f13 = 0.0f;
                c28655q3.m87150e0(-1774320154);
                c28655q3.m87173q(false);
            }
            String title = c23042n.getTitle();
            if (title == null) {
                c28655q3.m87150e0(-1774284164);
                c28655q3.m87173q(false);
                c28655q4 = c28655q3;
            } else {
                c28655q3.m87150e0(-1774284163);
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 2 * ((float) r10), f13, 2);
                C21053l c21053l = C21053l.f79834a;
                C23285v0 c23285v0M67364b = C23285v0.m67364b(EnumC2888c.INSTANCE.m8402a(c23042n.getTitleTypography()).getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447);
                C38072d c38072d2 = C38072d.f163053a;
                C28655q c28655q6 = c28655q3;
                AbstractC21048g.m58807M(title, modifierM3396r, true, c21053l.m58880a(c23285v0M67364b, c38072d2.m121949b(c28655q3, 6).getWhite70(), 0L, 0L, null, c38072d2.m121949b(c28655q3, 6).getBrandWhite(), 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q6, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32732), null, 0, 0, 0, false, c28655q6, 432, 496);
                C28655q c28655q7 = c28655q6;
                c28655q7.m87173q(false);
                c28655q4 = c28655q7;
            }
            List<C25306o> listM66932m = c23042n.m66932m();
            if (listM66932m == null || listM66932m.isEmpty()) {
                listM66932m = null;
            }
            if (listM66932m == null) {
                c28655q4.m87150e0(-1773690514);
                c28655q4.m87173q(false);
                i15 = 2;
                r15 = 0;
                r14 = 0;
            } else {
                c28655q4.m87150e0(-1773690513);
                float f14 = 2 * ((float) 8);
                Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f14, c23042n.getSectionTopPadding(), f14, c23042n.getSectionBottomPadding());
                C22949e c22949e = AbstractC22977m.f90650a;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(c23042n.getInterItemPadding()), C2299e.f9110M, c28655q4, 0);
                int iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3397s);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
                c28655q4.m87150e0(1631187674);
                Iterator<T> it = listM66932m.iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74290q((C25306o) it.next(), null, null, function1, c28655q4, (i18 << 6) & 7168, 6);
                    i17 = i17;
                    z4 = z4;
                }
                i15 = i17;
                boolean z13 = z4;
                r14 = 0;
                AbstractC25012a.m73392y(c28655q4, z13, true, z13);
                r15 = z13;
            }
            C23032d featureList = c23042n.getFeatureList();
            if (featureList == null) {
                c28655q4.m87150e0(-1773176131);
                c28655q4.m87173q(r15);
            } else {
                c28655q4.m87150e0(-1773176130);
                C27256h cardButton = c23042n.getCardButton();
                if ((cardButton == null || (checkmarkBackground = cardButton.m82149g()) == null) && (checkmarkBackground = c23042n.getCheckmarkBackground()) == null) {
                    checkmarkBackground = new C18252f(EnumC39333f.TRANSPARENT, r14, i15, r14);
                }
                m66847J(featureList, checkmarkBackground, c23042n.getStyle(), c28655q4, r15);
                c28655q4.m87173q(r15);
            }
            C23030b descriptionCard = c23042n.getDescriptionCard();
            if (descriptionCard == null) {
                c28655q4.m87150e0(-1772953644);
                c28655q4.m87173q(r15);
            } else {
                c28655q4.m87150e0(-1772953643);
                m66842E(descriptionCard, c28655q4, r15);
                c28655q4.m87173q(r15);
            }
            if (c23042n.getCardButton() != null && c23042n.getSecondCardButton() == null) {
                c28655q4.m87150e0(-1772822079);
                m66855R(c23042n, function1, c28655q4, i18 & 126);
                c28655q4.m87173q(r15);
                c28655q = c28655q4;
            } else if (c23042n.getCardButton() == null || c23042n.getSecondCardButton() == null) {
                c28655q4.m87150e0(-1772611930);
                c28655q4.m87173q(r15);
                c28655q = c28655q4;
            } else {
                c28655q4.m87150e0(-1772682269);
                m66849L(c23042n, function1, c28655q4, i18 & 126);
                c28655q4.m87173q(r15);
                c28655q = c28655q4;
            }
        } else {
            i15 = 2;
            c28655q5.m87138X();
            c28655q = c28655q5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23040l(c23042n, function1, i13, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m66863Z(C23042n c23042n, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m66862Y(c23042n, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m66865a0(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1450957471);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a(modifier)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 16, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m66867b0(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m66865a0(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m66869c0(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2068672725);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new c(modifier)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 13, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m66871d0(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m66869c0(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m66873e0(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1855143991);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new e(modifier)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 15, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m66875f0(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m66873e0(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m66877g0(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-819715705);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new g(modifier)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 17, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m66879h0(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m66877g0(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m66881i0(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(723853333);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new k(modifier)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 14, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m66883j0(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m66881i0(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m66885k0(Modifier modifier, C23042n state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1912939209);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            EnumC23048t style = state.getStyle();
            List<C17919x> borderColors = style != null ? style.getBorderColors() : null;
            if (borderColors == null) {
                c28655q.m87150e0(-88569402);
                C38072d c38072d = C38072d.f163053a;
                borderColors = AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.m51541c(0.0f, c38072d.m121949b(c28655q, 6).getWhite10())));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-88570301);
                c28655q.m87173q(false);
            }
            m66859V(modifier3, 0.0f, 0.0f, borderColors, AbstractC37817c.m121344e(1387635972, c28655q, new C18522f(10, state, onViewEvent)), c28655q, (i15 & 14) | 24576, 6);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(modifier2, state, onViewEvent, i13, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m66887l0(C23042n c23042n, Function1 function1, InterfaceC23001u UpsellCardBackground, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C39077b1 c39077b1;
        C0209i c0209i;
        C2314t c2314t;
        C0209i c0209i2;
        C0209i c0209i3;
        C0213j c0213j;
        float f13;
        List<C17919x> backgroundRadialGradientColors;
        AbstractC17911t backgroundLinearGradient;
        AbstractC22676k.m65750j(UpsellCardBackground, "$this$UpsellCardBackground");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(UpsellCardBackground) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C27256h cardButton = c23042n.getCardButton();
            Modifier modifierM44071x = null;
            C9598e destination = cardButton != null ? cardButton.getDestination() : null;
            EnumC23048t style = c23042n.getStyle();
            boolean z4 = style != null && style.getFullBleedImage();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            boolean z13 = destination != null;
            boolean zM87157i = c28655q.m87157i(destination) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C20778p(destination, function1, 1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3409f, z13, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44099b);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            C39077b1 c39077b2 = C39102j.f168199a;
            if (z4) {
                c28655q.m87150e0(840834984);
                c0213j = c0213j2;
                c0209i2 = c0209i5;
                c2314t = c2314t2;
                c0209i3 = c0209i6;
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(c23042n.getTitleImage(), null, null, c28655q, 0, 3);
                C1100b c1100b = C1100b.f4583a;
                c0209i = c0209i4;
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, c1100b.mo3401b(c2314t), null, c39077b2, 0.0f, null, c28655q, 24624, 104);
                c39077b1 = c39077b2;
                AbstractC17911t imageOverlayGradient = c23042n.getStyle().getImageOverlayGradient();
                if (imageOverlayGradient == null) {
                    c28655q = c28655q;
                    c28655q.m87150e0(841144952);
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q;
                    c28655q.m87150e0(841144953);
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(c1100b.mo3401b(c2314t), imageOverlayGradient, null, 0.0f, 6), c28655q, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c39077b1 = c39077b2;
                c0209i = c0209i4;
                c2314t = c2314t2;
                c0209i2 = c0209i5;
                c0209i3 = c0209i6;
                c0213j = c0213j2;
                c28655q.m87150e0(841373144);
                c28655q.m87173q(false);
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            EnumC23048t style2 = c23042n.getStyle();
            Modifier modifierM44103f = AbstractC15676d.m44103f(modifierM3409f2, (style2 == null || (backgroundLinearGradient = style2.getBackgroundLinearGradient()) == null) ? null : AbstractC1092a.m3357b(c2314t, backgroundLinearGradient, null, 0.0f, 6));
            EnumC23048t style3 = c23042n.getStyle();
            if (style3 != null && (backgroundRadialGradientColors = style3.getBackgroundRadialGradientColors()) != null) {
                List<C17919x> list = !backgroundRadialGradientColors.isEmpty() ? backgroundRadialGradientColors : null;
                if (list != null) {
                    modifierM44071x = AbstractC15673b0.m44071x(c2314t, list, 0.0f, c23042n.getStyle().getRadiusFactor(), 2, null);
                }
            }
            Modifier modifierM44103f2 = AbstractC15676d.m44103f(modifierM44103f, modifierM44071x);
            EnumC23048t style4 = c23042n.getStyle();
            Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM44103f2, 0.0f, 0.0f, 0.0f, style4 != null ? style4.getBottomPadding() : 0, 7);
            float f14 = 8;
            float f15 = 2 * f14;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
            if (z4) {
                c28655q.m87150e0(-52008723);
                AbstractC25012a.m73388u(55, 4, c2314t, c28655q, false);
                f13 = f14;
            } else {
                c28655q.m87150e0(-51888567);
                f13 = f14;
                C28655q c28655q2 = c28655q;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c23042n.getTitleImage(), null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(55 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), null, c39077b1, 0.0f, null, c28655q2, 25008, 104);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            m66862Y(c23042n, function1, c28655q, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            Modifier modifier = c2314t;
            m66844G(UpsellCardBackground, AbstractC1099a.m3394p(f15, c2314t), c23042n.getEndIcon(), c23042n.getId(), function1, c28655q, (i14 & 14) | 48, 0);
            C17750h1 badge = c23042n.getBadge();
            if (badge == null) {
                c28655q.m87150e0(5549282);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(5549283);
                float f16 = ((float) 1.5d) * f13;
                AbstractC17746g1.m50872h(badge, AbstractC1099a.m3398t(UpsellCardBackground.mo3400a(modifier, C2299e.f9116y), 0.0f, f16, f16, 0.0f, 9), null, c28655q, 0, 4);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Modifier m66889m0(C9598e c9598e, Function1 function1, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1092a.m3362g(applyIf, false, null, null, new C4789l(c9598e, function1, 7), 15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m66891n0(C9598e c9598e, Function1 function1) {
        if (c9598e != null) {
            function1.invoke(c9598e);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m66893o0(Modifier modifier, C23042n c23042n, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m66885k0(modifier, c23042n, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p0 */
    private static final Object m66895p0(C27256h c27256h) {
        return c27256h.getActionArgument() != null ? c27256h : c27256h.getDestination();
    }
}

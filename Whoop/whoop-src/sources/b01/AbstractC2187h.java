package b01;

import a01.C0085e;
import a11.C0130h;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import dp0.C12253i;
import fy1.C14873i;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j02.C21166s;
import java.util.ArrayList;
import kd1.C22411w;
import l83.C23454a0;
import m83.C25235a0;
import ny0.AbstractC27271o0;
import ny0.C27246d;
import ny0.C27256h;
import ny0.EnumC27243c;
import ny0.EnumC27254g;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: b01.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lb01/i;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lb01/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "k", "(Landroidx/compose/runtime/Composer;I)V", "Lny0/h;", "a", "Lny0/h;", "getFakeCardButtonState", "()Lny0/h;", "fakeCardButtonState", "Lb01/d;", "b", "Lb01/d;", "getFakeCta", "()Lb01/d;", "fakeCta", "c", "Lb01/i;", "m", "()Lb01/i;", "fakeSanguineWaitlistBiomarkerListPreviewViewState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2187h {

    /* JADX INFO: renamed from: a */
    private static final C27256h f8676a;

    /* JADX INFO: renamed from: b */
    private static final C2183d f8677b;

    /* JADX INFO: renamed from: c */
    private static final C2188i f8678c;

    /* JADX INFO: renamed from: b01.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m6892a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(1867722425);
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkAlt(), AbstractC17918w0.f69621a));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            C2188i c2188iM6894b = C2188i.m6894b(AbstractC2187h.m6891m(), null, null, null, 3, null);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = b.f8679w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2187h.m6884f(null, c2188iM6894b, (Function1) objM87133R, c28655q, 384, 1);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m6892a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b01.h$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f8679w = new b();

        /* JADX INFO: renamed from: a */
        public final void m6893a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m6893a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC16313m0 enumC16313m0 = null;
        AbstractC18247a abstractC18247a = null;
        EnumC39333f enumC39333f = null;
        String str = null;
        String str2 = null;
        Action action = null;
        AnalyticEventModel analyticEventModel = null;
        EnumC2888c enumC2888c = null;
        boolean z4 = false;
        boolean z13 = true;
        String str3 = null;
        boolean z14 = false;
        boolean z15 = false;
        AbstractC18247a abstractC18247a2 = null;
        Object obj = null;
        C21166s c21166s = null;
        EnumC27243c enumC27243c = null;
        GenericInteraction genericInteraction = null;
        InterfaceC21430b interfaceC21430b = null;
        AbstractC18247a abstractC18247a3 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        C27256h c27256h = new C27256h(AbstractC8693b.m21278l("SEE ALL BIOMARKERS"), enumC16313m0, abstractC18247a, enumC39333f, str, str2, EnumC27272p.HIGHLIGHT, new C9598e(null, null, null, 7, null), action, analyticEventModel, EnumC27254g.STANDARD, enumC2888c, objArr, z4, z13, str3, z14, z15, abstractC18247a2, obj, c21166s, enumC27243c, genericInteraction, interfaceC21430b, abstractC18247a3, 33528588, null);
        f8676a = c27256h;
        C2183d c2183d = new C2183d("SEE ALL BIOMARKERS", new C9598e(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null));
        f8677b = c2183d;
        Object[] objArr2 = 0 == true ? 1 : 0;
        C2182c c2182c = new C2182c("id0", "Alkaline Phosphatase (ALP)", null, 0 == true ? 1 : 0, 12, objArr2);
        EnumC16313m0 enumC16313m1 = null;
        Object[] objArr3 = 0 == true ? 1 : 0;
        EnumC16313m0 enumC16313m2 = null;
        EnumC16313m0 enumC16313m3 = null;
        EnumC16313m0 enumC16313m4 = null;
        EnumC16313m0 enumC16313m5 = null;
        EnumC16313m0 enumC16313m6 = null;
        f8678c = new C2188i(new C2196q("", "Search biomarkers", AbstractC37056f.m118959K(c2182c, new C2182c("id1", "Alanine Aminotransferase (ALT)", 0 == true ? 1 : 0, enumC16313m1, 12, objArr3), new C2182c("id2", "Albumin", enumC16313m1, enumC16313m2, 12, null), new C2182c("id3", "Albumin/Globulin Ratio", enumC16313m2, enumC16313m3, 12, 0 == true ? 1 : 0), new C2182c("id4", "Apolipoprotein B (ApoB)", enumC16313m3, enumC16313m4, 12, 0 == true ? 1 : 0), new C2182c("id5", "Aspartate Aminotransferase (AST)", enumC16313m4, enumC16313m5, 12, null), new C2182c("id6", "Basophil %", enumC16313m5, enumC16313m6, 12, null), new C2182c("id7", "Basophils", enumC16313m6, null, 12, 0 == true ? 1 : 0))), c2183d, c27256h);
    }

    /* JADX INFO: renamed from: f */
    public static final void m6884f(Modifier modifier, final C2188i viewState, final Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-609551737);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "SanguineWaitlistBiomarkerListPreview"), C22411w.f87680a.m64535a().m64090c());
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM118994r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C2196q searchableListViewState = viewState.getSearchableListViewState();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C2185f(0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2195p.m6933s(searchableListViewState, null, AbstractC1125a.m3480c(c2314t, (Function1) objM87133R), false, false, null, c28655q, 27648, 34);
            Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t);
            int i18 = i17 & 896;
            boolean zM87157i = c28655q.m87157i(viewState) | (i18 == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                final int i19 = 0;
                objM87133R2 = new InterfaceC4339a() { // from class: b01.g
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                return AbstractC2187h.m6886h(onViewEvent, viewState);
                            default:
                                return AbstractC2187h.m6887i(onViewEvent, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3362g(modifierMo3401b, false, null, null, (InterfaceC4339a) objM87133R2, 15), c28655q, 0);
            c28655q.m87173q(true);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getCta().getText());
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 2 * f13, 0.0f, 0.0f, 13);
            boolean zM87157i2 = (i18 == 256) | c28655q.m87157i(viewState);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                final int i24 = 1;
                objM87133R3 = new InterfaceC4339a() { // from class: b01.g
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i24) {
                            case 0:
                                return AbstractC2187h.m6886h(onViewEvent, viewState);
                            default:
                                return AbstractC2187h.m6887i(onViewEvent, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifier5 = modifier4;
            AbstractC27271o0.m82253b(modifierM3398t, false, textResourceM21278l, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R3, c28655q, 6, 0, MessageListItemViewType.POLL);
            c28655q = c28655q;
            C27256h button = viewState.getButton();
            if (button == null) {
                c28655q.m87150e0(-162796738);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-162796737);
                new C27246d().Compose(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 1 * f13, 0.0f, 0.0f, 13), button, onViewEvent, c28655q, i18 | 6);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(modifier3, viewState, onViewEvent, i13, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m6885g(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C22128b c22128b = c0238p0.f815w;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) * 0.6f;
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69625b), new C17919x(C17919x.f69636m)), Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) - fIntBitsToFloat, Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)), 8), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) - fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0.0f, null, 6, 56);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m6886h(Function1 function1, C2188i c2188i) {
        function1.invoke(c2188i.getCta().getNavigationAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m6887i(Function1 function1, C2188i c2188i) {
        function1.invoke(c2188i.getCta().getNavigationAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m6888j(Modifier modifier, C2188i c2188i, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m6884f(modifier, c2188i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m6889k(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1482460889);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m6890l(int i13, Composer composer, int i14) {
        m6889k(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final C2188i m6891m() {
        return f8678c;
    }
}

package ey0;

import a80.C0547k;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import aw0.C2108h;
import b81.C2795b;
import b91.C2886a;
import c41.C4092p2;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9790n;
import cy0.C11184c;
import cy0.InterfaceC11182a;
import d62.C11735a;
import d62.C11738d;
import eg2.C13168a;
import ev2.C13693b;
import fy0.AbstractC14863a;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.Map;
import km2.C22593d;
import km2.C22596g;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p132f0.C13821r1;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23001u;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import qu1.C30628d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import su1.C33019e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ey0.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a?\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcy0/c$d;", "viewState", "Lkotlin/Function1;", "Lcy0/a;", "Ll83/a0;", "onEvent", "", "pillar", "Lf0/r1;", "scrollState", "n", "(Lcy0/c$d;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lf0/r1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lcy0/c$b;", "toolbarState", "", "showIconGlow", "z", "(Landroidx/compose/ui/Modifier;Lcy0/c$b;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", "item", "", "u", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "deep-dive_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13740g {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m39022A(Function1 function1, C11184c.b bVar) {
        function1.invoke(bVar.getOnLeftClick());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m39023B(Function1 function1, C11184c.b bVar, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC11182a.f(it, bVar.getEndItem(), ""));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m39024C(C11184c.b bVar, boolean z4, Function1 function1, InterfaceC23001u GlowEffect, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        long jM53358D;
        AbstractC22676k.m65750j(GlowEffect, "$this$GlowEffect");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(GlowEffect) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C27430e c27430eM107874S = AbstractC34132o.m107874S(bVar.getRightIcon().toWhoopIcon(), c28655q, 6);
            String strM21274h = AbstractC8693b.m21274h(bVar.getRightIconContentDescription(), c28655q, TextResource.$stable);
            if (z4) {
                c28655q.m87150e0(-812777746);
                jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-812776661);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            long j7 = jM53358D;
            Modifier modifierMo3400a = GlowEffect.mo3400a(AbstractC1102d.m3419p(7 * 4, C2314t.f9131w), C2299e.f9103F);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(bVar);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C13738e(function1, bVar, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15005f3.m43108b(c27430eM107874S, strM21274h, AbstractC1772c1.m5391i(modifierMo3400a, false, null, (InterfaceC4339a) objM87133R, 3), j7, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m39025D(Function1 function1, C11184c.b bVar) {
        function1.invoke(bVar.getOnRightClick());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m39026E(Modifier modifier, C11184c.b bVar, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m39052z(modifier, bVar, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9371. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: n */
    public static final void m39040n(cy0.C11184c.d r30, p715kotlin.jvm.functions.Function1 r31, java.lang.String r32, p132f0.C13821r1 r33, androidx.compose.runtime.Composer r34, int r35, int r36) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ey0.AbstractC13740g.m39040n(cy0.c$d, kotlin.jvm.functions.Function1, java.lang.String, f0.r1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m39041o(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: p */
    private static final void m39042p(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m39043q(Function1 function1, C11184c.d dVar) {
        function1.invoke(new InterfaceC11182a.j(dVar.getSource()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m39044r(Function1 function1, InterfaceC25312u interfaceC25312u, C11184c.d dVar, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC11182a.f(it, interfaceC25312u, dVar.getSource()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m39045s(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m39042p(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m39046t(C11184c.d dVar, Function1 function1, String str, C13821r1 c13821r1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m39040n(dVar, function1, str, c13821r1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final void m39047u(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-617183371);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C13693b(7);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C13693b(8);
                c28655q.m87172p0(objM87133R2);
            }
            int i17 = i15;
            AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R2), new C13168a(11), function3, c28655q, ((i17 << 6) & 7168) | (i17 & 14) | (C25307p.f99300b << 3), 0);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m39048v(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m39049w(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C30628d.class), new C33019e());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C22596g.class), new C22593d());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C11738d.class), new C11735a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Modifier m39050x(InterfaceC25312u state, Composer composer, int i13) {
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1109333509);
        boolean z4 = state instanceof C4092p2;
        Modifier modifierM3398t = C2314t.f9131w;
        if (z4) {
            float f13 = 8;
            modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 4 * f13, 0.0f, 2 * f13, 5);
        }
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m39051y(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m39047u(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:62:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:71:0x020a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0232  */
    /* JADX WARN: Code duplicated, block: B:74:0x0236  */
    /* JADX WARN: Code duplicated, block: B:79:0x0253  */
    /* JADX WARN: Code duplicated, block: B:82:0x0265  */
    /* JADX WARN: Code duplicated, block: B:84:0x0269  */
    /* JADX WARN: Code duplicated, block: B:90:0x027c  */
    /* JADX WARN: Code duplicated, block: B:92:0x029f  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x02de  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    private static final void m39052z(Modifier modifier, C11184c.b bVar, boolean z4, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        Function1 function2;
        Modifier modifier3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C2307m c2307m;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C1100b c1100b;
        int i17;
        boolean z16;
        boolean zM87157i;
        Object objM87133R;
        boolean z17;
        boolean z18;
        boolean z19;
        int iHashCode2;
        boolean z24;
        boolean zM87157i2;
        Object objM87133R2;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(854580118);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
            i15 |= c28655q.m87157i(bVar) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(function1)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i18;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    z13 = false;
                }
                float f13 = 8;
                float f14 = 2 * f13;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, modifier4), f14, 1 * f13);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
                Modifier modifier5 = modifier4;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(bVar.getLeftIcon().toWhoopIcon(), c28655q, 6);
                TextResource textResourceM30319c = bVar.getLeftIconContentDescription();
                int i25 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM30319c, c28655q, i25);
                C38072d c38072d = C38072d.f163053a;
                int i26 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q, i26).getBrandWhite();
                Modifier modifierM3419p = AbstractC1102d.m3419p(4 * 7, c2314t);
                C2307m c2307m2 = C2299e.f9117z;
                c1100b = C1100b.f4583a;
                Modifier modifierMo3400a = c1100b.mo3400a(modifierM3419p, c2307m2);
                i17 = i16 & 7168;
                if (i17 == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i = z16 | c28655q.m87157i(bVar);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C13738e(function1, bVar, 1);
                    c28655q.m87172p0(objM87133R);
                }
                z17 = z13;
                AbstractC15005f3.m43108b(c27430eM107874S, strM21274h, AbstractC1772c1.m5391i(modifierMo3400a, false, null, (InterfaceC4339a) objM87133R, 3), jM125430y, c28655q, 0, 0);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getTitle(), c28655q, i25), AbstractC1099a.m3396r(c1100b.mo3400a(c2314t, C2299e.f9102E), f14, 0.0f, 2), c38072d.m121949b(c28655q, i26).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196088);
                c28655q = c28655q;
                if (bVar.getEndItem() != null) {
                    c28655q.m87150e0(-1222309936);
                    Modifier modifierMo3400a2 = c1100b.mo3400a(c2314t, C2299e.f9103F);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3400a2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    InterfaceC25312u interfaceC25312uM30317a = bVar.getEndItem();
                    if (i17 == 2048) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    zM87157i2 = c28655q.m87157i(bVar) | z24;
                    objM87133R2 = c28655q.m87133R();
                    if (!zM87157i2 || objM87133R2 == c28676v0) {
                        function2 = function1;
                        objM87133R2 = new C9790n(21, function2, bVar);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function2 = function1;
                    }
                    AbstractC25303l.m74291r(interfaceC25312uM30317a, null, null, (Function1) objM87133R2, c28655q, 0, 6);
                    c28655q = c28655q;
                    z18 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    z19 = z17;
                } else {
                    function2 = function1;
                    z18 = true;
                    c28655q.m87150e0(-1221893544);
                    z19 = z17;
                    AbstractC14863a.m42887b(c1100b, z19, AbstractC37817c.m121344e(-1243302492, c28655q, new C2795b(bVar, z19, function2, 1)), c28655q, 390 | ((i16 >> 3) & 112), 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z18);
                modifier3 = modifier5;
                z15 = z19;
            } else {
                function2 = function1;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(modifier3, (Object) bVar, z15, (InterfaceC23459e) function2, i13, i14, 8);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(function1)) {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i18;
        }
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i24 != 0) {
                z13 = false;
            }
            float f15 = 8;
            float f16 = 2 * f15;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, modifier4), f16, 1 * f15);
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            Modifier modifier6 = modifier4;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(bVar.getLeftIcon().toWhoopIcon(), c28655q, 6);
            TextResource textResourceM30319c2 = bVar.getLeftIconContentDescription();
            int i27 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM30319c2, c28655q, i27);
            C38072d c38072d2 = C38072d.f163053a;
            int i28 = C38072d.f163054b;
            long jM125430y2 = c38072d2.m121949b(c28655q, i28).getBrandWhite();
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(4 * 7, c2314t);
            C2307m c2307m3 = C2299e.f9117z;
            c1100b = C1100b.f4583a;
            Modifier modifierMo3400a3 = c1100b.mo3400a(modifierM3419p2, c2307m3);
            i17 = i16 & 7168;
            if (i17 == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87157i = z16 | c28655q.m87157i(bVar);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87157i) {
                objM87133R = new C13738e(function1, bVar, 1);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C13738e(function1, bVar, 1);
                c28655q.m87172p0(objM87133R);
            }
            z17 = z13;
            AbstractC15005f3.m43108b(c27430eM107874S2, strM21274h2, AbstractC1772c1.m5391i(modifierMo3400a3, false, null, (InterfaceC4339a) objM87133R, 3), jM125430y2, c28655q, 0, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c1100b.mo3400a(c2314t, C2299e.f9102E), f16, 0.0f, 2), c38072d2.m121949b(c28655q, i28).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i28).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196088);
            c28655q = c28655q;
            if (bVar.getEndItem() != null) {
                c28655q.m87150e0(-1222309936);
                Modifier modifierMo3400a4 = c1100b.mo3400a(c2314t, C2299e.f9103F);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3400a4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                InterfaceC25312u interfaceC25312uM30317a2 = bVar.getEndItem();
                if (i17 == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zM87157i2 = c28655q.m87157i(bVar) | z24;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2) {
                    function2 = function1;
                    objM87133R2 = new C9790n(21, function2, bVar);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function2 = function1;
                    objM87133R2 = new C9790n(21, function2, bVar);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC25303l.m74291r(interfaceC25312uM30317a2, null, null, (Function1) objM87133R2, c28655q, 0, 6);
                c28655q = c28655q;
                z18 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                z19 = z17;
            } else {
                function2 = function1;
                z18 = true;
                c28655q.m87150e0(-1221893544);
                z19 = z17;
                AbstractC14863a.m42887b(c1100b, z19, AbstractC37817c.m121344e(-1243302492, c28655q, new C2795b(bVar, z19, function2, 1)), c28655q, 390 | ((i16 >> 3) & 112), 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z18);
            modifier3 = modifier6;
            z15 = z19;
        } else {
            function2 = function1;
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(modifier3, (Object) bVar, z15, (InterfaceC23459e) function2, i13, i14, 8);
        }
    }
}

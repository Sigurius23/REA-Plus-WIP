package hp2;

import a00.C0073h;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fc0.C14361e;
import l83.C23454a0;
import ln2.AbstractC24541a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39281n;
import y71.C39282o;

/* JADX INFO: renamed from: hp2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, m65681d2 = {"Lhp2/g;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "c", "(Lhp2/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/ClipboardManager;", "clipboardManager", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17559f {
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:53:0x013d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0204  */
    /* JADX WARN: Code duplicated, block: B:58:0x0208  */
    /* JADX WARN: Code duplicated, block: B:61:0x0211  */
    /* JADX WARN: Code duplicated, block: B:62:0x0214  */
    /* JADX WARN: Code duplicated, block: B:66:0x022e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0232  */
    /* JADX WARN: Code duplicated, block: B:70:0x0257  */
    /* JADX WARN: Code duplicated, block: B:73:0x0261  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public static final void m49968c(C17560g viewState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        String strM92103Y;
        String strM92103Y2;
        Context context;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        int iHashCode2;
        C17560g c17560g;
        boolean zM87157i;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(458002484);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            z4 = false;
            if ((i15 & 19) != 18) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
                Object systemService = ((Context) c28655q.m87161k(c28674u2)).getSystemService("clipboard");
                AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                interfaceC28601c1M87238F = AbstractC28683x.m87238F((ClipboardManager) systemService, c28655q);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC24541a.f95771c);
                strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC24541a.f95777i);
                context = (Context) c28655q.m87161k(c28674u2);
                Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier4);
                float f13 = 8;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 2.25d) * f13);
                C2305k c2305k = C2299e.f9110M;
                Modifier modifier5 = modifier4;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i16 = i15;
                } else {
                    i16 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    C23010x c23010xM73381n = AbstractC25012a.m73381n(1, f13, c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    TextResource textResourceM49974c = viewState.getTitle();
                    int i18 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(textResourceM49974c, c28655q, i18);
                    C38072d c38072d = C38072d.f163053a;
                    int i19 = C38072d.f163054b;
                    long brandWhite = c38072d.m121949b(c28655q, i19).getBrandWhite();
                    C2886a t14 = c38072d.m121952e(c28655q, i19).getT3();
                    int i24 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q, 0, i24, 196602);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i18), null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB2(), null, c28655q, 0, i24, 196602);
                    c28655q.m87173q(true);
                    Modifier modifierM3411h = AbstractC1102d.m3411h(15 * 4, c2314t);
                    C39282o c39282oM49973b = viewState.getTile();
                    boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(strM92103Y2);
                    if ((i16 & 14) != 4) {
                        if ((i16 & 8) != 0) {
                            c17560g = viewState;
                            if (c28655q.m87157i(c17560g)) {
                            }
                        } else {
                            c17560g = viewState;
                        }
                        zM87157i = zM87153g | z4 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i || objM87133R == C28635l.f115821a) {
                            C0073h c0073h = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                            c28655q.m87172p0(c0073h);
                            objM87133R = c0073h;
                        }
                        c28655q = c28655q;
                        AbstractC39281n.m125207c(modifierM3411h, c39282oM49973b, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
                        c28655q.m87173q(true);
                        modifier3 = modifier5;
                    } else {
                        c17560g = viewState;
                    }
                    z4 = true;
                    zM87157i = zM87153g | z4 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        C0073h c0073h2 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                        c28655q.m87172p0(c0073h2);
                        objM87133R = c0073h2;
                    } else {
                        C0073h c0073h3 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                        c28655q.m87172p0(c0073h3);
                        objM87133R = c0073h3;
                    }
                    c28655q = c28655q;
                    AbstractC39281n.m125207c(modifierM3411h, c39282oM49973b, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                C23010x c23010xM73381n2 = AbstractC25012a.m73381n(1, f13, c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                TextResource textResourceM49974c2 = viewState.getTitle();
                int i110 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(textResourceM49974c2, c28655q, i110);
                C38072d c38072d2 = C38072d.f163053a;
                int i111 = C38072d.f163054b;
                long brandWhite2 = c38072d2.m121949b(c28655q, i111).getBrandWhite();
                C2886a t15 = c38072d2.m121952e(c28655q, i111).getT3();
                int i25 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t15, null, c28655q, 0, i25, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i110), null, c38072d2.m121949b(c28655q, i111).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i111).getB2(), null, c28655q, 0, i25, 196602);
                c28655q.m87173q(true);
                Modifier modifierM3411h2 = AbstractC1102d.m3411h(15 * 4, c2314t);
                C39282o c39282oM49973b2 = viewState.getTile();
                boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(strM92103Y2);
                if ((i16 & 14) != 4) {
                    if ((i16 & 8) != 0) {
                        c17560g = viewState;
                        if (c28655q.m87157i(c17560g)) {
                        }
                    } else {
                        c17560g = viewState;
                    }
                    zM87157i = zM87153g2 | z4 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        C0073h c0073h4 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                        c28655q.m87172p0(c0073h4);
                        objM87133R = c0073h4;
                    } else {
                        C0073h c0073h5 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                        c28655q.m87172p0(c0073h5);
                        objM87133R = c0073h5;
                    }
                    c28655q = c28655q;
                    AbstractC39281n.m125207c(modifierM3411h2, c39282oM49973b2, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                } else {
                    c17560g = viewState;
                }
                z4 = true;
                zM87157i = zM87153g2 | z4 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    C0073h c0073h6 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                    c28655q.m87172p0(c0073h6);
                    objM87133R = c0073h6;
                } else {
                    C0073h c0073h7 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                    c28655q.m87172p0(c0073h7);
                    objM87133R = c0073h7;
                }
                c28655q = c28655q;
                AbstractC39281n.m125207c(modifierM3411h2, c39282oM49973b2, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(viewState, i13, modifier3, i14, 21);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        z4 = false;
        if ((i15 & 19) != 18) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            C28674u2 c28674u3 = AndroidCompositionLocals_androidKt.f4976b;
            Object systemService2 = ((Context) c28655q.m87161k(c28674u3)).getSystemService("clipboard");
            AbstractC22676k.m65748h(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
            interfaceC28601c1M87238F = AbstractC28683x.m87238F((ClipboardManager) systemService2, c28655q);
            strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC24541a.f95771c);
            strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC24541a.f95777i);
            context = (Context) c28655q.m87161k(c28674u3);
            Modifier modifierMo3471e2 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier4);
            float f14 = 8;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(((float) 2.25d) * f14);
            C2305k c2305k2 = C2299e.f9110M;
            Modifier modifier6 = modifier4;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k2, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                i16 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                C23010x c23010xM73381n3 = AbstractC25012a.m73381n(1, f14, c2305k2, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM73381n3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                TextResource textResourceM49974c3 = viewState.getTitle();
                int i112 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(textResourceM49974c3, c28655q, i112);
                C38072d c38072d3 = C38072d.f163053a;
                int i113 = C38072d.f163054b;
                long brandWhite3 = c38072d3.m121949b(c28655q, i113).getBrandWhite();
                C2886a t16 = c38072d3.m121952e(c28655q, i113).getT3();
                int i26 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h3, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t16, null, c28655q, 0, i26, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i112), null, c38072d3.m121949b(c28655q, i113).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i113).getB2(), null, c28655q, 0, i26, 196602);
                c28655q.m87173q(true);
                Modifier modifierM3411h3 = AbstractC1102d.m3411h(15 * 4, c2314t);
                C39282o c39282oM49973b3 = viewState.getTile();
                boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(strM92103Y2);
                if ((i16 & 14) != 4) {
                    if ((i16 & 8) != 0) {
                        c17560g = viewState;
                        if (c28655q.m87157i(c17560g)) {
                        }
                    } else {
                        c17560g = viewState;
                    }
                    zM87157i = zM87153g3 | z4 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        C0073h c0073h8 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                        c28655q.m87172p0(c0073h8);
                        objM87133R = c0073h8;
                    } else {
                        C0073h c0073h9 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                        c28655q.m87172p0(c0073h9);
                        objM87133R = c0073h9;
                    }
                    c28655q = c28655q;
                    AbstractC39281n.m125207c(modifierM3411h3, c39282oM49973b3, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
                    c28655q.m87173q(true);
                    modifier3 = modifier6;
                } else {
                    c17560g = viewState;
                }
                z4 = true;
                zM87157i = zM87153g3 | z4 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    C0073h c0073h10 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                    c28655q.m87172p0(c0073h10);
                    objM87133R = c0073h10;
                } else {
                    C0073h c0073h11 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                    c28655q.m87172p0(c0073h11);
                    objM87133R = c0073h11;
                }
                c28655q = c28655q;
                AbstractC39281n.m125207c(modifierM3411h3, c39282oM49973b3, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
                c28655q.m87173q(true);
                modifier3 = modifier6;
            } else {
                i16 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            C23010x c23010xM73381n4 = AbstractC25012a.m73381n(1, f14, c2305k2, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM73381n4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            TextResource textResourceM49974c4 = viewState.getTitle();
            int i114 = TextResource.$stable;
            String strM21274h4 = AbstractC8693b.m21274h(textResourceM49974c4, c28655q, i114);
            C38072d c38072d4 = C38072d.f163053a;
            int i115 = C38072d.f163054b;
            long brandWhite4 = c38072d4.m121949b(c28655q, i115).getBrandWhite();
            C2886a t17 = c38072d4.m121952e(c28655q, i115).getT3();
            int i27 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h4, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t17, null, c28655q, 0, i27, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i114), null, c38072d4.m121949b(c28655q, i115).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i115).getB2(), null, c28655q, 0, i27, 196602);
            c28655q.m87173q(true);
            Modifier modifierM3411h4 = AbstractC1102d.m3411h(15 * 4, c2314t);
            C39282o c39282oM49973b4 = viewState.getTile();
            boolean zM87153g4 = c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(strM92103Y2);
            if ((i16 & 14) != 4) {
                if ((i16 & 8) != 0) {
                    c17560g = viewState;
                    if (c28655q.m87157i(c17560g)) {
                    }
                } else {
                    c17560g = viewState;
                }
                zM87157i = zM87153g4 | z4 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    C0073h c0073h12 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                    c28655q.m87172p0(c0073h12);
                    objM87133R = c0073h12;
                } else {
                    C0073h c0073h13 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                    c28655q.m87172p0(c0073h13);
                    objM87133R = c0073h13;
                }
                c28655q = c28655q;
                AbstractC39281n.m125207c(modifierM3411h4, c39282oM49973b4, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
                c28655q.m87173q(true);
                modifier3 = modifier6;
            } else {
                c17560g = viewState;
            }
            z4 = true;
            zM87157i = zM87153g4 | z4 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                C0073h c0073h14 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                c28655q.m87172p0(c0073h14);
                objM87133R = c0073h14;
            } else {
                C0073h c0073h15 = new C0073h(strM92103Y2, (Object) c17560g, context, strM92103Y, interfaceC28601c1M87238F, 10);
                c28655q.m87172p0(c0073h15);
                objM87133R = c0073h15;
            }
            c28655q = c28655q;
            AbstractC39281n.m125207c(modifierM3411h4, c39282oM49973b4, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(viewState, i13, modifier3, i14, 21);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final ClipboardManager m49969d(InterfaceC28670t2 interfaceC28670t2) {
        return (ClipboardManager) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m49970e(String str, C17560g c17560g, Context context, String str2, InterfaceC28670t2 interfaceC28670t2) {
        m49969d(interfaceC28670t2).setPrimaryClip(ClipData.newPlainText(str, c17560g.getTextToCopy()));
        if (Build.VERSION.SDK_INT < 33) {
            Toast.makeText(context, str2, 1).show();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m49971f(C17560g c17560g, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m49968c(c17560g, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

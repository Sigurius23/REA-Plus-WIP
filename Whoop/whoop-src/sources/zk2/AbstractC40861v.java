package zk2;

import android.os.Build;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import j81.C21423g;
import j81.C21425i;
import java.io.IOException;
import kk2.AbstractC22551d;
import l83.C23454a0;
import ok2.AbstractC28001g;
import ok2.C28003i;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p097ds.AbstractC12313p;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17869a1;
import p208i2.InterfaceC17886g0;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22989q;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;
import p734sl0.C32676t1;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import z51.C40103n;

/* JADX INFO: renamed from: zk2.v */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\" \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lm91/u;", "item", "", "isPaused", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "p", "(Lm91/u;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "u", "(Lm91/u;Z)Z", "Li2/a1;", "clipShape", "Lkotlin/Function0;", "content", "k", "(Landroidx/compose/ui/Modifier;Li2/a1;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "PausedTabContentBlurRadius", "b", "PausedTabContentPauseIconSize", "c", "Z", "isBlurSupportedByPlatform", "Lp1/t1;", "d", "Lp1/t1;", "getLocalTrackSessionPausedTabBlurEnabled", "()Lp1/t1;", "LocalTrackSessionPausedTabBlurEnabled", "Lm91/p;", "e", "Lm91/p;", "pausedTabContentPreviewItemViewFactory", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40861v {

    /* JADX INFO: renamed from: a */
    private static final float f176100a;

    /* JADX INFO: renamed from: b */
    private static final float f176101b;

    /* JADX INFO: renamed from: c */
    private static final boolean f176102c;

    /* JADX INFO: renamed from: d */
    private static final AbstractC28669t1 f176103d;

    /* JADX INFO: renamed from: e */
    private static final C25307p f176104e;

    static {
        float f13 = 4;
        f176100a = ((float) 1.5d) * f13;
        f176101b = 6 * f13;
        f176102c = Build.VERSION.SDK_INT >= 31;
        f176103d = new C28674u2(new C40857r(0));
        f176104e = Function1.m74306g(new C40842c(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final boolean m132422j() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x011e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0129  */
    /* JADX WARN: Code duplicated, block: B:72:0x014c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:76:0x015d  */
    /* JADX WARN: Code duplicated, block: B:78:0x016b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0181  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:92:0x0201  */
    /* JADX WARN: Code duplicated, block: B:93:0x0205  */
    /* JADX WARN: Code duplicated, block: B:96:0x0212  */
    /* JADX WARN: Code duplicated, block: B:98:0x0220  */
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
    /* JADX INFO: renamed from: k */
    public static final void m132423k(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, InterfaceC4351m content, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        InterfaceC17869a1 interfaceC17869a2;
        boolean z4;
        InterfaceC17869a1 interfaceC17869a3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        InterfaceC17869a1 interfaceC17869a4;
        boolean zBooleanValue;
        final String strM21274h;
        Modifier modifierM118994r;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        Modifier modifierM34301s;
        int iHashCode2;
        boolean zM87153g;
        Object objM87133R3;
        int iHashCode3;
        int i17;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1704724347);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC17869a2 = interfaceC17869a1;
                i15 |= c28655q.m87153g(interfaceC17869a2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(content)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if (i19 != 0) {
                    interfaceC17869a4 = null;
                } else {
                    interfaceC17869a4 = interfaceC17869a2;
                }
                zBooleanValue = ((Boolean) c28655q.m87161k(f176103d)).booleanValue();
                strM21274h = AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC22551d.f88668J), c28655q, TextResource.C8688b.f25889c);
                if (interfaceC17869a4 != null) {
                    modifierM118994r = AbstractC37056f.m118994r(c2314t, interfaceC17869a4);
                } else {
                    modifierM118994r = c2314t;
                }
                C2307m c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                InterfaceC17869a1 interfaceC17869a5 = interfaceC17869a4;
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
                Modifier modifier3 = modifier2;
                if (c28655q.f115903S) {
                    i16 = i15;
                } else {
                    i16 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new C40842c(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM51774b = AbstractC18032n.m51774b(modifierM118994r, (p715kotlin.jvm.functions.Function1) objM87133R);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C40842c(3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM51774b, (p715kotlin.jvm.functions.Function1) objM87133R2);
                    if (zBooleanValue || !f176102c) {
                        modifierM34301s = c2314t;
                    } else {
                        modifierM34301s = AbstractC12313p.m34301s(f176100a, c2314t);
                    }
                    Modifier modifierMo3471e = modifierM3486a.mo3471e(modifierM34301s);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
                    content.invoke(c28655q, Integer.valueOf((i16 >> 6) & 14));
                    C1100b c1100b = C1100b.f4583a;
                    if (zBooleanValue || f176102c) {
                        c28655q.m87150e0(1272744371);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1272451266);
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(c1100b.mo3401b(c2314t), C17919x.m51541c(0.55f, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd()), AbstractC17918w0.f69621a), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    Modifier modifierMo3400a = c1100b.mo3400a(c2314t, c2307m);
                    zM87153g = c28655q.m87153g(strM21274h);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g || objM87133R3 == c28676v0) {
                        objM87133R3 = new p715kotlin.jvm.functions.Function1() { // from class: zk2.u
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40861v.m132426n(strM21274h, (InterfaceC18044z) obj);
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    Modifier modifierM51775c = AbstractC18032n.m51775c(modifierMo3400a, true, (p715kotlin.jvm.functions.Function1) objM87133R3);
                    C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 1.5d, 8, C2299e.f9111N, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM51775c);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    C38072d c38072d = C38072d.f163053a;
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getPause(), c28655q, 6);
                    int i24 = C38072d.f163054b;
                    AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176101b, c2314t), "track_session_tab_paused_overlay_icon"), c38072d.m121949b(c28655q, i24).getWhite50(), c28655q, 48, 0);
                    String strM21273g = AbstractC8693b.m21273g(AbstractC22551d.f88668J, c28655q, 0);
                    C2886a c2886aM8417O = c38072d.m121952e(c28655q, i24).getT2();
                    long jM125430y = c38072d.m121949b(c28655q, i24).getBrandWhite();
                    int i25 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21273g, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, i25, 196602);
                    AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC22551d.f88667I, c28655q, 0), null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB1(), null, c28655q, 0, i25, 196090);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC17869a3 = interfaceC17869a5;
                    modifier2 = modifier3;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C40842c(2);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM51774b2 = AbstractC18032n.m51774b(modifierM118994r, (p715kotlin.jvm.functions.Function1) objM87133R);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C40842c(3);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierM51774b2, (p715kotlin.jvm.functions.Function1) objM87133R2);
                if (zBooleanValue) {
                    modifierM34301s = c2314t;
                } else {
                    modifierM34301s = c2314t;
                }
                Modifier modifierMo3471e2 = modifierM3486a2.mo3471e(modifierM34301s);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                content.invoke(c28655q, Integer.valueOf((i16 >> 6) & 14));
                C1100b c1100b2 = C1100b.f4583a;
                if (zBooleanValue) {
                    c28655q.m87150e0(1272744371);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1272744371);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierMo3400a2 = c1100b2.mo3400a(c2314t, c2307m);
                zM87153g = c28655q.m87153g(strM21274h);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new p715kotlin.jvm.functions.Function1() { // from class: zk2.u
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40861v.m132426n(strM21274h, (InterfaceC18044z) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new p715kotlin.jvm.functions.Function1() { // from class: zk2.u
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40861v.m132426n(strM21274h, (InterfaceC18044z) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierMo3400a2, true, (p715kotlin.jvm.functions.Function1) objM87133R3);
                C23010x c23010xM73381n2 = AbstractC25012a.m73381n((float) 1.5d, 8, C2299e.f9111N, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM51775c2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                C38072d c38072d2 = C38072d.f163053a;
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getPause(), c28655q, 6);
                int i26 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S2, null, AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176101b, c2314t), "track_session_tab_paused_overlay_icon"), c38072d2.m121949b(c28655q, i26).getWhite50(), c28655q, 48, 0);
                String strM21273g2 = AbstractC8693b.m21273g(AbstractC22551d.f88668J, c28655q, 0);
                C2886a c2886aM8417O2 = c38072d2.m121952e(c28655q, i26).getT2();
                long jM125430y2 = c38072d2.m121949b(c28655q, i26).getBrandWhite();
                int i27 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21273g2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q, 0, i27, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC22551d.f88667I, c28655q, 0), null, c38072d2.m121949b(c28655q, i26).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i26).getB1(), null, c28655q, 0, i27, 196090);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC17869a3 = interfaceC17869a5;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                interfaceC17869a3 = interfaceC17869a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40103n(modifier2, interfaceC17869a3, content, i13, i14, 10);
            }
        }
        i15 |= 48;
        interfaceC17869a2 = interfaceC17869a1;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(content)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier2 = c2314t;
            }
            if (i19 != 0) {
                interfaceC17869a4 = null;
            } else {
                interfaceC17869a4 = interfaceC17869a2;
            }
            zBooleanValue = ((Boolean) c28655q.m87161k(f176103d)).booleanValue();
            strM21274h = AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC22551d.f88668J), c28655q, TextResource.C8688b.f25889c);
            if (interfaceC17869a4 != null) {
                modifierM118994r = AbstractC37056f.m118994r(c2314t, interfaceC17869a4);
            } else {
                modifierM118994r = c2314t;
            }
            C2307m c2307m2 = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            InterfaceC17869a1 interfaceC17869a6 = interfaceC17869a4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            c0209i = C0217k.f732j;
            Modifier modifier4 = modifier2;
            if (c28655q.f115903S) {
                i16 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C40842c(2);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM51774b3 = AbstractC18032n.m51774b(modifierM118994r, (p715kotlin.jvm.functions.Function1) objM87133R);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C40842c(3);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3486a3 = AbstractC1127a.m3486a(modifierM51774b3, (p715kotlin.jvm.functions.Function1) objM87133R2);
                if (zBooleanValue) {
                    modifierM34301s = c2314t;
                } else {
                    modifierM34301s = c2314t;
                }
                Modifier modifierMo3471e3 = modifierM3486a3.mo3471e(modifierM34301s);
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N7);
                content.invoke(c28655q, Integer.valueOf((i16 >> 6) & 14));
                C1100b c1100b3 = C1100b.f4583a;
                if (zBooleanValue) {
                    c28655q.m87150e0(1272744371);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1272744371);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierMo3400a3 = c1100b3.mo3400a(c2314t, c2307m2);
                zM87153g = c28655q.m87153g(strM21274h);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new p715kotlin.jvm.functions.Function1() { // from class: zk2.u
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40861v.m132426n(strM21274h, (InterfaceC18044z) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new p715kotlin.jvm.functions.Function1() { // from class: zk2.u
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40861v.m132426n(strM21274h, (InterfaceC18044z) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM51775c3 = AbstractC18032n.m51775c(modifierMo3400a3, true, (p715kotlin.jvm.functions.Function1) objM87133R3);
                C23010x c23010xM73381n3 = AbstractC25012a.m73381n((float) 1.5d, 8, C2299e.f9111N, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM51775c3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM73381n3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N8);
                C38072d c38072d3 = C38072d.f163053a;
                C27430e c27430eM107874S3 = AbstractC34132o.m107874S(c38072d3.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getPause(), c28655q, 6);
                int i28 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S3, null, AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176101b, c2314t), "track_session_tab_paused_overlay_icon"), c38072d3.m121949b(c28655q, i28).getWhite50(), c28655q, 48, 0);
                String strM21273g3 = AbstractC8693b.m21273g(AbstractC22551d.f88668J, c28655q, 0);
                C2886a c2886aM8417O3 = c38072d3.m121952e(c28655q, i28).getT2();
                long jM125430y3 = c38072d3.m121949b(c28655q, i28).getBrandWhite();
                int i29 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21273g3, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O3, null, c28655q, 0, i29, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC22551d.f88667I, c28655q, 0), null, c38072d3.m121949b(c28655q, i28).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i28).getB1(), null, c28655q, 0, i29, 196090);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC17869a3 = interfaceC17869a6;
                modifier2 = modifier4;
            } else {
                i16 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40842c(2);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM51774b4 = AbstractC18032n.m51774b(modifierM118994r, (p715kotlin.jvm.functions.Function1) objM87133R);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C40842c(3);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3486a4 = AbstractC1127a.m3486a(modifierM51774b4, (p715kotlin.jvm.functions.Function1) objM87133R2);
            if (zBooleanValue) {
                modifierM34301s = c2314t;
            } else {
                modifierM34301s = c2314t;
            }
            Modifier modifierMo3471e4 = modifierM3486a4.mo3471e(modifierM34301s);
            InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d6);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N9);
            content.invoke(c28655q, Integer.valueOf((i16 >> 6) & 14));
            C1100b c1100b4 = C1100b.f4583a;
            if (zBooleanValue) {
                c28655q.m87150e0(1272744371);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1272744371);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            Modifier modifierMo3400a4 = c1100b4.mo3400a(c2314t, c2307m2);
            zM87153g = c28655q.m87153g(strM21274h);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R3 = new p715kotlin.jvm.functions.Function1() { // from class: zk2.u
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC40861v.m132426n(strM21274h, (InterfaceC18044z) obj);
                    }
                };
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new p715kotlin.jvm.functions.Function1() { // from class: zk2.u
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC40861v.m132426n(strM21274h, (InterfaceC18044z) obj);
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM51775c4 = AbstractC18032n.m51775c(modifierMo3400a4, true, (p715kotlin.jvm.functions.Function1) objM87133R3);
            C23010x c23010xM73381n4 = AbstractC25012a.m73381n((float) 1.5d, 8, C2299e.f9111N, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM51775c4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM73381n4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m10);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N10);
            C38072d c38072d4 = C38072d.f163053a;
            C27430e c27430eM107874S4 = AbstractC34132o.m107874S(c38072d4.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getPause(), c28655q, 6);
            int i210 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S4, null, AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176101b, c2314t), "track_session_tab_paused_overlay_icon"), c38072d4.m121949b(c28655q, i210).getWhite50(), c28655q, 48, 0);
            String strM21273g4 = AbstractC8693b.m21273g(AbstractC22551d.f88668J, c28655q, 0);
            C2886a c2886aM8417O4 = c38072d4.m121952e(c28655q, i210).getT2();
            long jM125430y4 = c38072d4.m121949b(c28655q, i210).getBrandWhite();
            int i211 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21273g4, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O4, null, c28655q, 0, i211, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC22551d.f88667I, c28655q, 0), null, c38072d4.m121949b(c28655q, i210).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i210).getB1(), null, c28655q, 0, i211, 196090);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            interfaceC17869a3 = interfaceC17869a6;
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
            interfaceC17869a3 = interfaceC17869a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(modifier2, interfaceC17869a3, content, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m132424l(InterfaceC18044z clearAndSetSemantics) {
        AbstractC22676k.m65750j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m132425m(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51551a(0.6f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m132426n(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m132427o(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m132423k(modifier, interfaceC17869a1, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public static final void m132428p(final InterfaceC25312u item, boolean z4, Modifier modifier, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Modifier modifier2;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        final Modifier modifier4;
        Modifier modifier5;
        Modifier modifierM3428y;
        C33252i c33252i;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1887878454);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (m132433u(item, z4)) {
                    c28655q.m87150e0(-809542079);
                    if (item instanceof C28003i) {
                        modifierM3428y = AbstractC1102d.m3409f(1.0f, c2314t);
                    } else {
                        modifierM3428y = AbstractC1102d.m3428y(c2314t, C2299e.f9102E, false, 2);
                    }
                    Modifier modifierMo3471e = modifier4.mo3471e(modifierM3428y);
                    if (item instanceof C21425i) {
                        c33252i = AbstractC33253j.f138651a;
                    } else {
                        c33252i = null;
                    }
                    m132423k(modifierMo3471e, c33252i, AbstractC37817c.m121344e(-1255540107, c28655q, new InterfaceC4351m() { // from class: zk2.s
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40861v.m132429q(item, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 384, 0);
                    c28655q.m87173q(false);
                    modifier5 = modifier4;
                } else {
                    c28655q.m87150e0(-809092827);
                    modifier5 = modifier4;
                    AbstractC25303l.m74291r(item, null, new Function3() { // from class: zk2.t
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC40861v.m132430r(modifier4, (InterfaceC25312u) obj, (Composer) obj2, iIntValue);
                        }
                    }, null, c28655q, i15 & 14, 10);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(item, z4, modifier3, i13, i14, 11);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (m132433u(item, z4)) {
                c28655q.m87150e0(-809542079);
                if (item instanceof C28003i) {
                    modifierM3428y = AbstractC1102d.m3409f(1.0f, c2314t);
                } else {
                    modifierM3428y = AbstractC1102d.m3428y(c2314t, C2299e.f9102E, false, 2);
                }
                Modifier modifierMo3471e2 = modifier4.mo3471e(modifierM3428y);
                if (item instanceof C21425i) {
                    c33252i = AbstractC33253j.f138651a;
                } else {
                    c33252i = null;
                }
                m132423k(modifierMo3471e2, c33252i, AbstractC37817c.m121344e(-1255540107, c28655q, new InterfaceC4351m() { // from class: zk2.s
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40861v.m132429q(item, (Composer) obj, iIntValue);
                    }
                }), c28655q, 384, 0);
                c28655q.m87173q(false);
                modifier5 = modifier4;
            } else {
                c28655q.m87150e0(-809092827);
                modifier5 = modifier4;
                AbstractC25303l.m74291r(item, null, new Function3() { // from class: zk2.t
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC40861v.m132430r(modifier4, (InterfaceC25312u) obj, (Composer) obj2, iIntValue);
                    }
                }, null, c28655q, i15 & 14, 10);
                c28655q.m87173q(false);
            }
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(item, z4, modifier3, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m132429q(InterfaceC25312u interfaceC25312u, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC25303l.m74291r(interfaceC25312u, null, null, null, c28655q, 0, 14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Modifier m132430r(Modifier modifier, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1156190846);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m132431s(InterfaceC25312u interfaceC25312u, boolean z4, Modifier modifier, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m132428p(interfaceC25312u, z4, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m132432t(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21425i.class), new C21423g());
        designItemViewFactory.m74323b(AbstractC28001g.m84460b());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m132433u(InterfaceC25312u interfaceC25312u, boolean z4) {
        if (z4) {
            return (interfaceC25312u instanceof C21425i) || (interfaceC25312u instanceof C28003i);
        }
        return false;
    }
}

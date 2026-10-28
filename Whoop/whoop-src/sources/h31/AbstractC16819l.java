package h31;

import android.content.res.Configuration;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import g81.AbstractC15572b;
import gb1.AbstractC15673b0;
import gb1.AbstractC15693u;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import i31.AbstractC18048c;
import i31.C18052g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p208i2.C17893k;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;
import p736sz0.EnumC33232y;
import p745y81.EnumC39333f;
import r71.AbstractC31052b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h31.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aI\u0010!\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0#¢\u0006\u0004\b$\u0010%\u001aS\u0010,\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0#2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-\u001aq\u00102\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010.\u001a\u00020&2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010+\u001a\u00020\u000f2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0#2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010/\u001a\u00020\u000f2\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103\"\u0014\u00106\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\"\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\"\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00109\"\u0014\u0010>\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=\"\u0014\u0010?\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010=¨\u0006@"}, m65681d2 = {"Lh31/q;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "c", "(Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", "n", "(Lm91/u;)Lm91/u;", "Lh31/n;", "style", "", "isSelected", "isInGroup", "isList", "Ly3/f;", "cornerRadius", "Lh31/h;", "m", "(Lh31/n;ZZZFLandroidx/compose/runtime/Composer;I)Lh31/h;", "strokeWidth", "Li2/t;", "brush", "cornerRadiusDp", "", "dashPattern", "isDashed", "", "alpha", "e", "(Landroidx/compose/ui/Modifier;FLi2/t;F[FZF)Landroidx/compose/ui/Modifier;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "", "recommendationId", "header", "body", "cta", "isExpanded", "k", "(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;Z)Lh31/q;", "title", "iconBackgroundEnabled", "Lh31/b;", "backgroundStyle", "i", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;)Lh31/q;", "a", "F", "TILE_BORDER_WIDTH", "Li2/x;", "b", "J", "tileGradientStart", "tileGradientEnd", "d", "Li2/t;", "tileBackgroundGradient", "selectedTileBackgroundGradient", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16819l {

    /* JADX INFO: renamed from: a */
    private static final float f64600a = (float) 1.5d;

    /* JADX INFO: renamed from: b */
    private static final long f64601b;

    /* JADX INFO: renamed from: c */
    private static final long f64602c;

    /* JADX INFO: renamed from: d */
    private static final AbstractC17911t f64603d;

    /* JADX INFO: renamed from: e */
    private static final AbstractC17911t f64604e;

    static {
        long jM51517e = AbstractC17918w0.m51517e(4283487743L);
        f64601b = jM51517e;
        long jM51517e2 = AbstractC17918w0.m51517e(4287324927L);
        f64602c = jM51517e2;
        C17909s c17909s = AbstractC17911t.f69612b;
        f64603d = C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, jM51517e2)), new C17919x(C17919x.m51541c(0.1f, jM51517e))), 0L, 9187343241974906880L, 8);
        f64604e = AbstractC15693u.m44155b(c17909s, AbstractC15673b0.m44051n(), null, 0, 135.0f, true, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0168  */
    /* JADX WARN: Code duplicated, block: B:62:0x0179  */
    /* JADX WARN: Code duplicated, block: B:64:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01de  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x0219 A[LOOP:0: B:80:0x0213->B:82:0x0219, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x0232  */
    /* JADX WARN: Code duplicated, block: B:87:0x0242  */
    /* JADX WARN: Code duplicated, block: B:88:0x024c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0268  */
    /* JADX WARN: Code duplicated, block: B:93:0x0279  */
    /* JADX WARN: Code duplicated, block: B:96:0x0283  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m47379c(C16824q viewState, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z13;
        float f13;
        Modifier modifierM3409f;
        float f14;
        C2305k c2305k;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        InterfaceC25312u interfaceC25312uM47400e;
        boolean z14;
        InterfaceC25312u interfaceC25312uM47399c;
        int iHashCode2;
        Iterator<T> it;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1910072907);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                if (viewState.getBackgroundStyle() == EnumC16809b.LIST) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    f13 = 3 * 4;
                } else {
                    float f15 = 4;
                    f13 = f15 * f15;
                }
                float f16 = f13;
                Modifier modifier4 = modifier2;
                C16815h c16815hM47389m = m47389m(viewState.getStyle(), viewState.getIsSelected(), ((Boolean) c28655q.m87161k(AbstractC15572b.m43864h())).booleanValue(), z13, f16, c28655q, 0);
                if (((Boolean) c28655q.m87161k(AbstractC31052b.m95598y())).booleanValue()) {
                    c28655q.m87150e0(1040456739);
                    modifierM3409f = AbstractC1102d.m3424u(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp * 0.8f, c2314t);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1040566510);
                    c28655q.m87173q(false);
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                }
                Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC37056f.m118994r(modifier4.mo3471e(modifierM3409f), AbstractC33253j.m105489e(f16)).mo3471e(c16815hM47389m.getBorder()), c16815hM47389m.getBackgroundBrush(), null, 0.0f, 6);
                f14 = 8;
                float f17 = 2 * f14;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f17, modifierM3357b);
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f17);
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                interfaceC25312uM47400e = viewState.getHeader();
                if (interfaceC25312uM47400e == null) {
                    c28655q.m87150e0(-1280884436);
                    c28655q.m87173q(false);
                    c28655q = c28655q;
                } else {
                    c28655q.m87150e0(-1280884435);
                    if (z13) {
                        interfaceC25312uM47400e = m47390n(interfaceC25312uM47400e);
                    }
                    InterfaceC25312u interfaceC25312u = interfaceC25312uM47400e;
                    c28655q = c28655q;
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, onViewEvent, c28655q, (i16 << 6) & 7168, 6);
                    c28655q.m87173q(false);
                }
                if (viewState.getIsExpanded()) {
                    c28655q.m87150e0(-1280699117);
                    if (viewState.m47398b().isEmpty()) {
                        z14 = false;
                        c28655q.m87150e0(-1280302441);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1280658011);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C23010x c23010xM73381n = AbstractC25012a.m73381n(f14, 1.5f, c2305k, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        c28655q.m87150e0(-522266127);
                        it = viewState.m47398b().iterator();
                        while (it.hasNext()) {
                            AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, onViewEvent, c28655q, (i16 << 6) & 7168, 6);
                        }
                        z14 = false;
                        AbstractC25012a.m73392y(c28655q, false, true, false);
                    }
                    interfaceC25312uM47399c = viewState.getCta();
                    if (interfaceC25312uM47399c == null) {
                        c28655q.m87150e0(-1280270822);
                        c28655q.m87173q(z14);
                    } else {
                        c28655q.m87150e0(-1280270821);
                        AbstractC25303l.m74291r(interfaceC25312uM47399c, null, null, onViewEvent, c28655q, (i16 << 6) & 7168, 6);
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(-1280172489);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16817j(viewState, onViewEvent, modifier3, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            if (viewState.getBackgroundStyle() == EnumC16809b.LIST) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                f13 = 3 * 4;
            } else {
                float f18 = 4;
                f13 = f18 * f18;
            }
            float f19 = f13;
            Modifier modifier5 = modifier2;
            C16815h c16815hM47389m2 = m47389m(viewState.getStyle(), viewState.getIsSelected(), ((Boolean) c28655q.m87161k(AbstractC15572b.m43864h())).booleanValue(), z13, f19, c28655q, 0);
            if (((Boolean) c28655q.m87161k(AbstractC31052b.m95598y())).booleanValue()) {
                c28655q.m87150e0(1040456739);
                modifierM3409f = AbstractC1102d.m3424u(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp * 0.8f, c2314t);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1040566510);
                c28655q.m87173q(false);
                modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            }
            Modifier modifierM3357b2 = AbstractC1092a.m3357b(AbstractC37056f.m118994r(modifier5.mo3471e(modifierM3409f), AbstractC33253j.m105489e(f19)).mo3471e(c16815hM47389m2.getBorder()), c16815hM47389m2.getBackgroundBrush(), null, 0.0f, 6);
            f14 = 8;
            float f110 = 2 * f14;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f110, modifierM3357b2);
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f110);
            c2305k = C2299e.f9110M;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
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
            interfaceC25312uM47400e = viewState.getHeader();
            if (interfaceC25312uM47400e == null) {
                c28655q.m87150e0(-1280884436);
                c28655q.m87173q(false);
                c28655q = c28655q;
            } else {
                c28655q.m87150e0(-1280884435);
                if (z13) {
                    interfaceC25312uM47400e = m47390n(interfaceC25312uM47400e);
                }
                InterfaceC25312u interfaceC25312u2 = interfaceC25312uM47400e;
                c28655q = c28655q;
                AbstractC25303l.m74291r(interfaceC25312u2, null, null, onViewEvent, c28655q, (i16 << 6) & 7168, 6);
                c28655q.m87173q(false);
            }
            if (viewState.getIsExpanded()) {
                c28655q.m87150e0(-1280699117);
                if (viewState.m47398b().isEmpty()) {
                    c28655q.m87150e0(-1280658011);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM73381n2 = AbstractC25012a.m73381n(f14, 1.5f, c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                    c28655q.m87150e0(-522266127);
                    it = viewState.m47398b().iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, onViewEvent, c28655q, (i16 << 6) & 7168, 6);
                    }
                    z14 = false;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                } else {
                    z14 = false;
                    c28655q.m87150e0(-1280302441);
                    c28655q.m87173q(false);
                }
                interfaceC25312uM47399c = viewState.getCta();
                if (interfaceC25312uM47399c == null) {
                    c28655q.m87150e0(-1280270822);
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(-1280270821);
                    AbstractC25303l.m74291r(interfaceC25312uM47399c, null, null, onViewEvent, c28655q, (i16 << 6) & 7168, 6);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z14);
            } else {
                c28655q.m87150e0(-1280172489);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16817j(viewState, onViewEvent, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m47380d(C16824q c16824q, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m47379c(c16824q, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private static final Modifier m47381e(Modifier modifier, final float f13, final AbstractC17911t abstractC17911t, final float f14, final float[] fArr, final boolean z4, final float f15) {
        return AbstractC1125a.m3480c(modifier, new Function1() { // from class: h31.k
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC16819l.m47383g(f14, fArr, f13, z4, abstractC17911t, f15, (InterfaceC22129c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Modifier m47382f(Modifier modifier, float f13, AbstractC17911t abstractC17911t, float f14, float[] fArr, boolean z4, float f15, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            fArr = new float[]{4.0f, 2.0f};
        }
        return m47381e(modifier, f13, abstractC17911t, f14, fArr, (i13 & 16) != 0 ? true : z4, (i13 & 32) != 0 ? 0.5f : f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m47383g(float f13, float[] fArr, float f14, boolean z4, AbstractC17911t abstractC17911t, float f15, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        float fMo743q0 = c0238p0.mo743q0(f13);
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f16 : fArr) {
            arrayList.add(Float.valueOf(c0238p0.f815w.getDensity() * f16));
        }
        InterfaceC22131e.m63376J0(drawWithContent, abstractC17911t, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fMo743q0))), f15, new C22135i(c0238p0.mo743q0(f14), 0.0f, 0, 0, z4 ? new C17893k(new DashPathEffect(AbstractC25265s.m74089B1(arrayList), 0.0f)) : null, 14), 198);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final List<InterfaceC25312u> m47384h() {
        EnumC2888c enumC2888c = EnumC2888c.B4;
        Integer num = null;
        AbstractC17911t abstractC17911t = null;
        boolean z4 = false;
        EnumC33232y enumC33232y = null;
        return AbstractC37056f.m118959K(new C33169c0("A steady **Zone 2** effort to build your aerobic base without adding recovery debt.", enumC2888c, EnumC39333f.BRAND_WHITE, 5, null, null, num, null, false, null, MessageListItemViewType.GIPHY, null), new C33169c0("Best done on a **green** recovery day.", enumC2888c, EnumC39333f.WHITE_70, 5, 0 == true ? 1 : 0, num, 0 == true ? 1 : 0, abstractC17911t, z4, enumC33232y, MessageListItemViewType.GIPHY, null));
    }

    /* JADX INFO: renamed from: i */
    public static final C16824q m47385i(String recommendationId, String title, boolean z4, boolean z13, List<? extends InterfaceC25312u> body, InterfaceC25312u interfaceC25312u, EnumC16821n style, boolean z14, EnumC16809b enumC16809b) {
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(style, "style");
        return new C16824q(recommendationId, style, AbstractC18048c.m51836p(recommendationId, title, z4, z13, z14, null, 32, null), body, interfaceC25312u, z13, z4, enumC16809b);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C16824q m47386j(String str, String str2, boolean z4, boolean z13, List list, InterfaceC25312u interfaceC25312u, EnumC16821n enumC16821n, boolean z14, EnumC16809b enumC16809b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "sample-recommendation-header";
        }
        if ((i13 & 2) != 0) {
            str2 = "STRENGTH TRAINING";
        }
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        if ((i13 & 16) != 0) {
            list = C25271y.f99162w;
        }
        if ((i13 & 32) != 0) {
            interfaceC25312u = null;
        }
        if ((i13 & 64) != 0) {
            enumC16821n = EnumC16821n.UNCOMMITTED;
        }
        if ((i13 & 128) != 0) {
            z14 = true;
        }
        EnumC16809b enumC16809b2 = (i13 & 256) != 0 ? null : enumC16809b;
        boolean z15 = z14;
        EnumC16821n enumC16821n2 = enumC16821n;
        InterfaceC25312u interfaceC25312u2 = interfaceC25312u;
        List list2 = list;
        return m47385i(str, str2, z4, z13, list2, interfaceC25312u2, enumC16821n2, z15, enumC16809b2);
    }

    /* JADX INFO: renamed from: k */
    public static final C16824q m47387k(String recommendationId, EnumC16821n style, InterfaceC25312u interfaceC25312u, List<? extends InterfaceC25312u> body, InterfaceC25312u interfaceC25312u2, boolean z4) {
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(body, "body");
        return new C16824q(recommendationId, style, interfaceC25312u, body, interfaceC25312u2, z4, false, null, 192, null);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C16824q m47388l(String str, EnumC16821n enumC16821n, InterfaceC25312u interfaceC25312u, List list, InterfaceC25312u interfaceC25312u2, boolean z4, int i13, Object obj) {
        String str2 = (i13 & 1) != 0 ? "sample-recommendation" : str;
        EnumC16821n enumC16821n2 = (i13 & 2) != 0 ? EnumC16821n.UNCOMMITTED : enumC16821n;
        InterfaceC25312u interfaceC25312uM51834n = (i13 & 4) != 0 ? AbstractC18048c.m51834n(null, null, null, null, null, null, null, null, false, false, null, 2047, null) : interfaceC25312u;
        List listM47384h = (i13 & 8) != 0 ? m47384h() : list;
        InterfaceC25312u interfaceC25312uM47360k = (i13 & 16) != 0 ? AbstractC16812e.m47360k(EnumC16813f.UNCOMMITTED, "COMMIT", EnumC16313m0.ADD, false, null, 24, null) : interfaceC25312u2;
        if ((i13 & 32) != 0) {
            z4 = true;
        }
        return m47387k(str2, enumC16821n2, interfaceC25312uM51834n, listM47384h, interfaceC25312uM47360k, z4);
    }

    /* JADX INFO: renamed from: m */
    private static final C16815h m47389m(EnumC16821n enumC16821n, boolean z4, boolean z13, boolean z14, float f13, Composer composer, int i13) {
        C2314t c2314t = C2314t.f9131w;
        if (z4) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1777592397);
            c28655q.m87173q(false);
            return new C16815h(AbstractC15751g.m44456i(f64600a, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(f13)), f64604e);
        }
        if (!z13 && !z14) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1777578473);
            c28655q2.m87173q(false);
            return new C16815h(m47382f(c2314t, f64600a, AbstractC15673b0.m43972A(), f13, null, enumC16821n != EnumC16821n.COMPLETED, 0.0f, 40, null), f64603d);
        }
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(-1777583039);
        C16815h c16815h = new C16815h(c2314t, new C17875c1(C38072d.f163053a.m121949b(c28655q3, 6).getWhite10()));
        c28655q3.m87173q(false);
        return c16815h;
    }

    /* JADX INFO: renamed from: n */
    private static final InterfaceC25312u m47390n(InterfaceC25312u interfaceC25312u) {
        C18052g c18052gM51840b;
        C18052g c18052g = interfaceC25312u instanceof C18052g ? (C18052g) interfaceC25312u : null;
        return (c18052g == null || (c18052gM51840b = C18052g.m51840b(c18052g, null, null, null, null, null, null, null, null, false, false, null, 1535, null)) == null) ? interfaceC25312u : c18052gM51840b;
    }
}

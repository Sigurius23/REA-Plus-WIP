package e61;

import a11.C0137o;
import a13.C0148f;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bz0.AbstractC3712b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import cz0.AbstractC11245f;
import cz0.InterfaceC11257r;
import d61.InterfaceC11732a;
import dc1.C11906c;
import f61.C14147i;
import g61.C15529b;
import g61.C15532e;
import g61.C15534g;
import g61.EnumC15528a;
import g61.EnumC15533f;
import gy0.AbstractC16277f;
import i61.C18152a;
import i61.InterfaceC18153b;
import ih0.AbstractC18489d0;
import j61.C21369c;
import j61.C21372f;
import j61.C21374h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p007a6.C0438l0;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15210z4;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import p91.C29007a;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import x81.C38072d;
import yy0.AbstractC39891e;

/* JADX INFO: renamed from: e61.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aÁ\u0001\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$\"\u001a\u0010*\u001a\u00020%8\u0000X\u0080D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u001a\u0010-\u001a\u00020%8\u0000X\u0080D¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)\"\u001a\u00100\u001a\u00020%8\u0000X\u0080D¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)¨\u00063²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj61/h;", "state", "", "Lcz0/r;", "scrubbableData", "Le61/j;", "annotationFactory", "Lf61/i;", "axisFactory", "Li61/a;", "geometryFactory", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "Ld61/a;", "scrubberState", "Lkotlin/Function1;", "onDataScrub", "onBottomLeftGraphIconClicked", "onBottomRightGraphIconClicked", "onZoomGraphButtonClicked", "content", "o", "(Landroidx/compose/ui/Modifier;Lj61/h;Ljava/util/List;Le61/j;Lf61/i;Li61/a;Lc93/a;Ld61/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;III)V", "Li61/b;", "geometry", "factory", "B", "(Li61/b;Lj61/h;Lf61/i;Landroidx/compose/runtime/Composer;I)V", "Lh2/c;", "rect", "Lp91/a;", "anchor", "F", "(Landroidx/compose/ui/Modifier;Lh2/c;Lp91/a;)Landroidx/compose/ui/Modifier;", "", "a", "Ljava/lang/String;", "getGRAPH_BUTTON_ZOOM_TEST_TAG", "()Ljava/lang/String;", "GRAPH_BUTTON_ZOOM_TEST_TAG", "b", "getGRAPH_BUTTON_LEFT_TEST_TAG", "GRAPH_BUTTON_LEFT_TEST_TAG", "c", "getGRAPH_BUTTON_RIGHT_TEST_TAG", "GRAPH_BUTTON_RIGHT_TEST_TAG", "", "isActivelyScrubbing", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12765h {

    /* JADX INFO: renamed from: a */
    private static final String f43670a = "Graph Button Zoom";

    /* JADX INFO: renamed from: b */
    private static final String f43671b = "Graph Button Left";

    /* JADX INFO: renamed from: c */
    private static final String f43672c = "Graph Button Right";

    /* JADX INFO: renamed from: e61.h$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43673a;

        static {
            int[] iArr = new int[EnumC15528a.values().length];
            try {
                iArr[EnumC15528a.ZOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f43673a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m35712A(Modifier modifier, C21374h c21374h, List list, C12767j c12767j, C14147i c14147i, C18152a c18152a, InterfaceC4339a interfaceC4339a, InterfaceC11732a interfaceC11732a, Function1 function1, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4351m interfaceC4351m, int i13, int i14, int i15, Composer composer, int i16) {
        m35733o(modifier, c21374h, list, c12767j, c14147i, c18152a, interfaceC4339a, interfaceC11732a, function1, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final void m35713B(InterfaceC18153b interfaceC18153b, C21374h c21374h, C14147i c14147i, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1780466188);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(interfaceC18153b) : c28655q.m87157i(interfaceC18153b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c21374h) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(c14147i) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C15529b bottomHorizontalAxis = c21374h.getBottomHorizontalAxis();
            C2314t c2314t = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (bottomHorizontalAxis == null) {
                c28655q.m87150e0(-977767792);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-977767791);
                Modifier modifierM35718G = m35718G(c2314t, interfaceC18153b.mo52130k(), null, 2, null);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C11906c(19);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC39891e.m127984b(AbstractC18032n.m51774b(modifierM35718G, (Function1) objM87133R), bottomHorizontalAxis.m43722e(), C29007a.INSTANCE.m88137b(), c28655q, 384, 0);
                c28655q.m87173q(false);
            }
            C15529b topHorizontalAxis = c21374h.getTopHorizontalAxis();
            if (topHorizontalAxis == null) {
                c28655q.m87150e0(-977478221);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-977478220);
                Modifier modifierM35718G2 = m35718G(c2314t, interfaceC18153b.mo52126g(), null, 2, null);
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C11906c(20);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC39891e.m127984b(AbstractC18032n.m51774b(modifierM35718G2, (Function1) objM87133R2), topHorizontalAxis.m43722e(), C29007a.INSTANCE.m88137b(), c28655q, 384, 0);
                c28655q.m87173q(false);
            }
            C15529b startVerticalAxis = c21374h.getStartVerticalAxis();
            if (startVerticalAxis == null) {
                c28655q.m87150e0(-977197454);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-977197453);
                c14147i.m40314S(startVerticalAxis, interfaceC18153b, c28655q, ((i14 << 3) & 112) | (i14 & 896));
                c28655q.m87173q(false);
            }
            C15529b endVerticalAxis = c21374h.getEndVerticalAxis();
            if (endVerticalAxis == null) {
                c28655q.m87150e0(-977102284);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-977102283);
                c14147i.m40312B(endVerticalAxis, interfaceC18153b, c28655q, (i14 & 896) | ((i14 << 3) & 112));
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0137o(interfaceC18153b, c21374h, c14147i, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m35714C(InterfaceC18044z clearAndSetSemantics) {
        AbstractC22676k.m65750j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m35715D(InterfaceC18044z clearAndSetSemantics) {
        AbstractC22676k.m65750j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m35716E(InterfaceC18153b interfaceC18153b, C21374h c21374h, C14147i c14147i, int i13, Composer composer, int i14) {
        m35713B(interfaceC18153b, c21374h, c14147i, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    public static final Modifier m35717F(Modifier modifier, C16618c rect, C29007a anchor) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(rect, "rect");
        AbstractC22676k.m65750j(anchor, "anchor");
        float f13 = rect.f63939a;
        float f14 = rect.f63942d;
        return modifier.mo3471e(AbstractC29011e.m88144e(modifier, f13, f14, rect.f63941c - f13, f14 - rect.f63940b, anchor));
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Modifier m35718G(Modifier modifier, C16618c c16618c, C29007a c29007a, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            c29007a = new C29007a(0.0f, 1.0f, false, false, 13, null);
        }
        return m35717F(modifier, c16618c, c29007a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x013c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0144  */
    /* JADX WARN: Code duplicated, block: B:113:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0151  */
    /* JADX WARN: Code duplicated, block: B:117:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x015e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0163  */
    /* JADX WARN: Code duplicated, block: B:123:0x016d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0174  */
    /* JADX WARN: Code duplicated, block: B:127:0x0178  */
    /* JADX WARN: Code duplicated, block: B:129:0x0182  */
    /* JADX WARN: Code duplicated, block: B:130:0x0185  */
    /* JADX WARN: Code duplicated, block: B:132:0x018a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0195  */
    /* JADX WARN: Code duplicated, block: B:136:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019e  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:173:0x0224 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x0226  */
    /* JADX WARN: Code duplicated, block: B:177:0x022c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0252  */
    /* JADX WARN: Code duplicated, block: B:180:0x0256  */
    /* JADX WARN: Code duplicated, block: B:181:0x0259  */
    /* JADX WARN: Code duplicated, block: B:184:0x025e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0266  */
    /* JADX WARN: Code duplicated, block: B:188:0x026b  */
    /* JADX WARN: Code duplicated, block: B:189:0x0273  */
    /* JADX WARN: Code duplicated, block: B:192:0x0278  */
    /* JADX WARN: Code duplicated, block: B:193:0x0280  */
    /* JADX WARN: Code duplicated, block: B:195:0x0284  */
    /* JADX WARN: Code duplicated, block: B:197:0x028a  */
    /* JADX WARN: Code duplicated, block: B:199:0x0297  */
    /* JADX WARN: Code duplicated, block: B:202:0x029d  */
    /* JADX WARN: Code duplicated, block: B:203:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:205:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:208:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:210:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:212:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:214:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:215:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:217:0x02de  */
    /* JADX WARN: Code duplicated, block: B:219:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:222:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:224:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:226:0x0303  */
    /* JADX WARN: Code duplicated, block: B:228:0x0309  */
    /* JADX WARN: Code duplicated, block: B:229:0x0316  */
    /* JADX WARN: Code duplicated, block: B:231:0x031c  */
    /* JADX WARN: Code duplicated, block: B:233:0x0322  */
    /* JADX WARN: Code duplicated, block: B:235:0x033a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0361  */
    /* JADX WARN: Code duplicated, block: B:240:0x036d  */
    /* JADX WARN: Code duplicated, block: B:242:0x039e  */
    /* JADX WARN: Code duplicated, block: B:246:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:249:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:250:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:255:0x041b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0448  */
    /* JADX WARN: Code duplicated, block: B:261:0x0461  */
    /* JADX WARN: Code duplicated, block: B:265:0x0475  */
    /* JADX WARN: Code duplicated, block: B:268:0x048c  */
    /* JADX WARN: Code duplicated, block: B:270:0x049c  */
    /* JADX WARN: Code duplicated, block: B:271:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:274:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:276:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:277:0x0501  */
    /* JADX WARN: Code duplicated, block: B:282:0x0522  */
    /* JADX WARN: Code duplicated, block: B:286:0x0552  */
    /* JADX WARN: Code duplicated, block: B:289:0x058e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0592  */
    /* JADX WARN: Code duplicated, block: B:295:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:299:0x05df  */
    /* JADX WARN: Code duplicated, block: B:301:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:303:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:307:0x0604  */
    /* JADX WARN: Code duplicated, block: B:308:0x065d  */
    /* JADX WARN: Code duplicated, block: B:310:0x069e  */
    /* JADX WARN: Code duplicated, block: B:311:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:316:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:320:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:322:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:323:0x0704  */
    /* JADX WARN: Code duplicated, block: B:326:0x0716  */
    /* JADX WARN: Code duplicated, block: B:328:0x074c  */
    /* JADX WARN: Code duplicated, block: B:329:0x0750  */
    /* JADX WARN: Code duplicated, block: B:334:0x0771  */
    /* JADX WARN: Code duplicated, block: B:338:0x0793  */
    /* JADX WARN: Code duplicated, block: B:341:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:342:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:344:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:345:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:347:0x0823  */
    /* JADX WARN: Code duplicated, block: B:348:0x0825  */
    /* JADX WARN: Code duplicated, block: B:354:0x0832  */
    /* JADX WARN: Code duplicated, block: B:358:0x085f  */
    /* JADX WARN: Code duplicated, block: B:359:0x086c  */
    /* JADX WARN: Code duplicated, block: B:361:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:362:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:368:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:372:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:373:0x0909  */
    /* JADX WARN: Code duplicated, block: B:375:0x0939  */
    /* JADX WARN: Code duplicated, block: B:376:0x093d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:381:0x095e  */
    /* JADX WARN: Code duplicated, block: B:385:0x0983  */
    /* JADX WARN: Code duplicated, block: B:387:0x098f  */
    /* JADX WARN: Code duplicated, block: B:388:0x0991  */
    /* JADX WARN: Code duplicated, block: B:391:0x099e  */
    /* JADX WARN: Code duplicated, block: B:393:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:394:0x09af  */
    /* JADX WARN: Code duplicated, block: B:397:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:398:0x09be  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:401:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:402:0x09da  */
    /* JADX WARN: Code duplicated, block: B:404:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:405:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:411:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:414:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:419:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:422:0x0ae5  */
    /* JADX WARN: Code duplicated, block: B:426:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:437:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
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
    /* JADX INFO: renamed from: o */
    public static final void m35733o(Modifier modifier, C21374h c21374h, List<? extends InterfaceC11257r> list, C12767j c12767j, C14147i c14147i, C18152a c18152a, InterfaceC4339a interfaceC4339a, InterfaceC11732a interfaceC11732a, Function1 function1, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4351m interfaceC4351m, Composer composer, final int i13, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        C21374h c21374h2;
        List<? extends InterfaceC11257r> list2;
        C12767j c12767j2;
        C14147i c14147i2;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        boolean z4;
        final C18152a c18152a2;
        final InterfaceC11732a interfaceC11732a2;
        final InterfaceC4339a interfaceC4339a5;
        final Modifier modifier3;
        final C21374h c21374h3;
        final List<? extends InterfaceC11257r> list3;
        final C14147i c14147i3;
        final C12767j c12767j3;
        final InterfaceC4339a interfaceC4339a6;
        final Function1 function2;
        final InterfaceC4339a interfaceC4339a7;
        final InterfaceC4339a interfaceC4339a8;
        final InterfaceC4351m interfaceC4351m2;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        int i39;
        C2314t c2314t;
        C28676v0 c28676v0;
        C21374h c21374h4;
        List<? extends InterfaceC11257r> list4;
        C12767j c12767j4;
        C14147i c14147i4;
        C18152a c18152a3;
        InterfaceC4339a interfaceC4339a9;
        InterfaceC11732a interfaceC11732a3;
        Function1 function3;
        InterfaceC4339a interfaceC4339a10;
        InterfaceC4339a interfaceC4339a11;
        InterfaceC4339a interfaceC4339a12;
        InterfaceC4351m interfaceC4351mM35705b;
        InterfaceC4339a interfaceC4339a13;
        InterfaceC4339a interfaceC4339a14;
        InterfaceC11732a interfaceC11732a4;
        C12767j c12767j5;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Function1 function4;
        InterfaceC4339a interfaceC4339a15;
        String strM21274h;
        C2314t c2314t2;
        Modifier modifier4;
        boolean zM87153g;
        Object objM87133R6;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC18153b interfaceC18153bM52119a;
        LinkedHashMap linkedHashMap;
        Object objM87133R7;
        InterfaceC28670t2 interfaceC28670t2;
        C29007a c29007a;
        InterfaceC11732a interfaceC11732a5;
        InterfaceC4339a interfaceC4339a16;
        InterfaceC28670t2 interfaceC28670t3;
        C18152a c18152a4;
        boolean z13;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        Modifier modifierM3396r;
        C28655q c28655q2;
        InterfaceC4351m interfaceC4351m3;
        InterfaceC11732a interfaceC11732a6;
        int iHashCode3;
        List<? extends InterfaceC11257r> list5;
        C0213j c0213j3;
        Function1 function5;
        C0209i c0209i3;
        C28655q c28655q3;
        int i44;
        C21374h c21374h5;
        C14147i c14147i5;
        boolean z14;
        C15534g buttons;
        Integer numM43735c;
        C2314t c2314t3;
        boolean z15;
        Object objM87133R8;
        InterfaceC4339a interfaceC4339a17;
        Integer numM43733a;
        boolean z16;
        Object objM87133R9;
        InterfaceC4339a interfaceC4339a18;
        List<C15532e> listM43734b;
        C23454a0 c23454a0;
        int iHashCode4;
        C0213j c0213j4;
        C0209i c0209i4;
        ArrayList arrayList;
        Iterator it;
        InterfaceC4339a interfaceC4339a19;
        boolean z17;
        boolean z18;
        C15532e c15532e;
        EnumC15528a enumC15528aM43730b;
        int i45;
        C23454a0 c23454a1;
        InterfaceC4339a interfaceC4339a20;
        Float fM43731c;
        float fFloatValue;
        Float fM43732d;
        float fFloatValue2;
        float f13;
        Integer numM43729a;
        boolean z19;
        Object objM87133R10;
        boolean z24;
        C23454a0 c23454a2;
        List list6;
        Iterator it3;
        int iHashCode5;
        C0213j c0213j5;
        C0209i c0209i5;
        Modifier modifier5;
        List list7;
        Iterator it4;
        int iHashCode6;
        C0213j c0213j6;
        C0209i c0209i6;
        Boolean boolValueOf;
        Object arrayList2;
        Object objM87133R11;
        int i46;
        boolean zM87157i;
        int i47;
        int i48;
        C12767j c12767j6;
        int i49;
        C12767j c12767j7;
        C12767j c12767j8;
        C2307m c2307m = C2299e.f9114w;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-290316364);
        int i54 = i15 & 1;
        if (i54 != 0) {
            i16 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i15 & 2) == 0) {
                c21374h2 = c21374h;
                int i55 = c28655q4.m87157i(c21374h2) ? 32 : 16;
                i16 |= i55;
            } else {
                c21374h2 = c21374h;
            }
            i16 |= i55;
        } else {
            c21374h2 = c21374h;
        }
        int i56 = i15 & 4;
        if (i56 == 0) {
            if ((i13 & 384) == 0) {
                list2 = list;
                i16 |= c28655q4.m87157i(list2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    c12767j8 = c12767j;
                    if (c28655q4.m87153g(c12767j8)) {
                        c12767j6 = c12767j8;
                        i49 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c12767j7 = c12767j8;
                    }
                    i16 |= i49;
                    c12767j2 = c12767j7;
                } else {
                    c12767j6 = c12767j;
                }
                c12767j6 = c12767j8;
                i49 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                c12767j7 = c12767j6;
                i16 |= i49;
                c12767j2 = c12767j7;
            } else {
                c12767j2 = c12767j;
            }
            if ((i13 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    c14147i2 = c14147i;
                    if (c28655q4.m87153g(c14147i2)) {
                        i48 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i16 |= i48;
                } else {
                    c14147i2 = c14147i;
                }
                i48 = DfuBaseService.ERROR_REMOTE_MASK;
                i16 |= i48;
            } else {
                c14147i2 = c14147i;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 0) {
                if ((i15 & 32) == 0 || !c28655q4.m87153g(c18152a)) {
                    i47 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    i47 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i16 |= i47;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                i16 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q4.m87157i(interfaceC4339a)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            if ((i13 & 12582912) != 0) {
                if ((i15 & 128) != 0) {
                    i46 = 4194304;
                } else {
                    if ((16777216 & i13) == 0) {
                        zM87157i = c28655q4.m87153g(interfaceC11732a);
                    } else {
                        zM87157i = c28655q4.m87157i(interfaceC11732a);
                    }
                    if (zM87157i) {
                        i46 = 8388608;
                    } else {
                        i46 = 4194304;
                    }
                }
                i16 |= i46;
            }
            i19 = i15 & 256;
            if (i19 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q4.m87157i(function1)) {
                    i24 = 67108864;
                } else {
                    i24 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i24;
            }
            i25 = i15 & 512;
            if (i25 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q4.m87157i(interfaceC4339a2)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i16 |= i26;
            }
            i27 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i27 != 0) {
                i28 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q4.m87157i(interfaceC4339a3)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i14 | i29;
            } else {
                i28 = i14;
            }
            i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i34 != 0) {
                i28 |= 48;
            } else if ((i14 & 48) != 0) {
                if (c28655q4.m87157i(interfaceC4339a4)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i28 |= i35;
            }
            i36 = i28;
            i37 = i15 & 4096;
            if (i37 != 0) {
                i38 = i36 | 384;
            } else if ((i14 & 384) == 0) {
                i38 = i36 | (c28655q4.m87157i(interfaceC4351m) ? 256 : 128);
            } else {
                i38 = i36;
            }
            if ((i16 & 306783379) == 306783378 || (i38 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i16 & 1, z4)) {
                c28655q4.m87140Z();
                i39 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i39 != 0 || c28655q4.m87118C()) {
                    if (i54 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i15 & 2) != 0) {
                        c21374h4 = new C21374h(null, null, null, null, null, null, null, null, false, false, null, 0L, 0.0f, 8191, null);
                        i16 &= -113;
                    } else {
                        c21374h4 = c21374h2;
                    }
                    if (i56 != 0) {
                        list4 = C25271y.f99162w;
                    } else {
                        list4 = list2;
                    }
                    if ((i15 & 8) != 0) {
                        i16 &= -7169;
                        c12767j4 = new C12767j();
                    } else {
                        c12767j4 = c12767j2;
                    }
                    if ((i15 & 16) != 0) {
                        c14147i4 = new C14147i();
                        i16 &= -57345;
                    } else {
                        c14147i4 = c14147i2;
                    }
                    if ((i15 & 32) != 0) {
                        c18152a3 = new C18152a();
                        i16 &= -458753;
                    } else {
                        c18152a3 = c18152a;
                    }
                    if (i17 != 0) {
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C0148f(24);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a9 = interfaceC4339a;
                    }
                    if ((i15 & 128) != 0) {
                        interfaceC11732a3 = InterfaceC11732a.b.f37977a;
                        i16 &= -29360129;
                    } else {
                        interfaceC11732a3 = interfaceC11732a;
                    }
                    if (i19 != 0) {
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C11906c(21);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        function3 = (Function1) objM87133R4;
                    } else {
                        i38 = i38;
                        function3 = function1;
                    }
                    if (i25 != 0) {
                        objM87133R3 = c28655q4.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C0148f(25);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        function3 = function3;
                        interfaceC4339a10 = interfaceC4339a2;
                    }
                    if (i27 != 0) {
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C0148f(26);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a10 = interfaceC4339a10;
                        interfaceC4339a11 = interfaceC4339a3;
                    }
                    if (i34 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C0148f(27);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a11 = interfaceC4339a11;
                        interfaceC4339a12 = interfaceC4339a4;
                    }
                    if (i37 != 0) {
                        interfaceC4351mM35705b = C12758a.f43638a.m35705b();
                    } else {
                        interfaceC4351mM35705b = interfaceC4351m;
                    }
                    interfaceC4339a13 = interfaceC4339a10;
                    interfaceC4339a14 = interfaceC4339a12;
                    interfaceC11732a4 = interfaceC11732a3;
                    c12767j5 = c12767j4;
                    c21374h2 = c21374h4;
                } else {
                    c28655q4.m87138X();
                    if ((i15 & 2) != 0) {
                        i16 &= -113;
                    }
                    if ((i15 & 8) != 0) {
                        i16 &= -7169;
                    }
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                    }
                    if ((i15 & 128) != 0) {
                        i16 &= -29360129;
                    }
                    interfaceC4339a9 = interfaceC4339a;
                    function3 = function1;
                    interfaceC4339a11 = interfaceC4339a3;
                    interfaceC4339a14 = interfaceC4339a4;
                    interfaceC4351mM35705b = interfaceC4351m;
                    i38 = i38;
                    i16 = i16;
                    interfaceC11732a4 = interfaceC11732a;
                    interfaceC4339a13 = interfaceC4339a2;
                    list4 = list2;
                    c14147i4 = c14147i2;
                    c18152a3 = c18152a;
                    c12767j5 = c12767j2;
                }
                c28655q4.m87175r();
                function4 = function3;
                interfaceC4339a15 = interfaceC4339a9;
                strM21274h = AbstractC8693b.m21274h(c21374h2.getAccessibilityState().getGraphDescription(), c28655q4, 0);
                if (c21374h2.getClickable()) {
                    c28655q4.m87150e0(178876994);
                    objM87133R11 = c28655q4.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC11266d.m30453g(c28655q4);
                    }
                    Modifier modifierM3360e = AbstractC1092a.m3360e(c2314t, (InterfaceC21083i) objM87133R11, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), false, null, interfaceC4339a15, 28);
                    c2314t2 = c2314t;
                    c28655q4.m87173q(false);
                    modifier4 = modifierM3360e;
                } else {
                    c2314t2 = c2314t;
                    c28655q4.m87150e0(178884348);
                    c28655q4.m87173q(false);
                    modifier4 = c2314t2;
                }
                Modifier modifierMo3471e = modifier2.mo3471e(modifier4);
                zM87153g = c28655q4.m87153g(strM21274h);
                objM87133R6 = c28655q4.m87133R();
                if (zM87153g || objM87133R6 == c28676v0) {
                    objM87133R6 = new C12764g(strM21274h, 0);
                    c28655q4.m87172p0(objM87133R6);
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifierMo3471e, false, (Function1) objM87133R6);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                Modifier modifier6 = modifier2;
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM51775c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
                interfaceC18153bM52119a = c18152a3.m52119a(c21374h2, ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).getFontScale());
                List<C21369c> listM59991h = c21374h2.m59991h();
                linkedHashMap = new LinkedHashMap();
                for (Object obj : listM59991h) {
                    boolValueOf = Boolean.valueOf(((C21369c) obj).getType().isDrawnAbovePlotContent());
                    arrayList2 = linkedHashMap.get(boolValueOf);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(boolValueOf, arrayList2);
                    }
                    ((List) arrayList2).add(obj);
                }
                objM87133R7 = c28655q4.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87264r(new C0438l0(interfaceC11732a4, 12));
                    c28655q4.m87172p0(objM87133R7);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R7;
                c29007a = null;
                if (m35741w(interfaceC28670t2)) {
                    interfaceC11732a5 = interfaceC11732a4;
                    interfaceC4339a16 = interfaceC4339a11;
                    interfaceC28670t3 = interfaceC28670t2;
                    c18152a4 = c18152a3;
                    z13 = false;
                    c28655q4.m87150e0(1014577352);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(448364584);
                    list7 = (List) linkedHashMap.get(Boolean.FALSE);
                    if (list7 == null) {
                        c28655q4.m87150e0(1014400217);
                        z13 = false;
                        c28655q4.m87173q(false);
                        interfaceC11732a5 = interfaceC11732a4;
                        interfaceC4339a16 = interfaceC4339a11;
                        interfaceC28670t3 = interfaceC28670t2;
                        c18152a4 = c18152a3;
                    } else {
                        c28655q4.m87150e0(1014400218);
                        it4 = list7.iterator();
                        while (it4.hasNext()) {
                            C21369c c21369c = (C21369c) it4.next();
                            InterfaceC11732a interfaceC11732a7 = interfaceC11732a4;
                            InterfaceC28670t2 interfaceC28670t4 = interfaceC28670t2;
                            Modifier modifierM35718G = m35718G(c2314t2, interfaceC18153bM52119a.mo52121b(c21369c), c29007a, 2, c29007a);
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                            C18152a c18152a5 = c18152a3;
                            Iterator it5 = it4;
                            iHashCode6 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM35718G);
                            InterfaceC0221l.f734a.getClass();
                            c0213j6 = C0217k.f724b;
                            c28655q4.m87158i0();
                            InterfaceC4339a interfaceC4339a21 = interfaceC4339a11;
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j6);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m2);
                            c0209i6 = C0217k.f732j;
                            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode6))) {
                                AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i6);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N2);
                            c12767j5.m35787b(c21369c, c28655q4, (i16 >> 6) & 112);
                            c28655q4.m87173q(true);
                            it4 = it5;
                            interfaceC11732a4 = interfaceC11732a7;
                            interfaceC28670t2 = interfaceC28670t4;
                            c18152a3 = c18152a5;
                            interfaceC4339a11 = interfaceC4339a21;
                            c29007a = null;
                        }
                        interfaceC11732a5 = interfaceC11732a4;
                        interfaceC4339a16 = interfaceC4339a11;
                        interfaceC28670t3 = interfaceC28670t2;
                        c18152a4 = c18152a3;
                        z13 = false;
                        c28655q4.m87173q(false);
                    }
                    c28655q4.m87173q(z13);
                }
                Modifier modifierM35718G2 = m35718G(c2314t2, interfaceC18153bM52119a.mo52122c(), null, 2, null);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, z13);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM35718G2);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i2 = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N3);
                modifierM3396r = AbstractC1099a.m3396r(c2314t2, c21374h2.getHorizontalGridLinePadding() * 8, 0.0f, 2);
                c28655q4.m87150e0(582183635);
                for (C21372f c21372f : c21374h2.m59994k()) {
                    if (c21372f.getAxis() == EnumC15533f.X_AXIS) {
                        modifier5 = modifierM3396r;
                    } else {
                        modifier5 = c2314t2;
                    }
                    AbstractC3712b.m11530b(modifier5, c21372f, c28655q4, 0, 0);
                }
                c28655q4.m87173q(false);
                c28655q4.m87173q(true);
                if (c21374h2.getScrubberEnabled()) {
                    c28655q4.m87150e0(1014991140);
                    List<? extends InterfaceC11257r> list8 = list4;
                    InterfaceC4351m interfaceC4351m4 = interfaceC4351mM35705b;
                    AbstractC11245f.m30353d(interfaceC18153bM52119a.mo52120a(), interfaceC18153bM52119a.mo52127h(), interfaceC11732a5, list8, function4, c21374h2.getLongPressTimeoutMillis(), false, interfaceC4351m4, c28655q4, ((i16 >> 15) & 896) | ((i16 << 3) & 7168) | ((i16 >> 12) & 57344) | (29360128 & (i38 << 15)), 64);
                    interfaceC4351m3 = interfaceC4351m4;
                    C28655q c28655q5 = c28655q4;
                    c28655q5.m87173q(false);
                    interfaceC11732a6 = interfaceC11732a5;
                    list5 = list8;
                    function5 = function4;
                    c28655q3 = c28655q5;
                } else {
                    c28655q2 = c28655q4;
                    interfaceC4351m3 = interfaceC4351mM35705b;
                    c28655q2.m87150e0(1015383445);
                    interfaceC11732a6 = interfaceC11732a5;
                    Modifier modifierM35718G3 = m35718G(c2314t2, interfaceC18153bM52119a.mo52120a(), null, 2, null);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM35718G3);
                    InterfaceC0221l.f734a.getClass();
                    list5 = list4;
                    c0213j3 = C0217k.f724b;
                    c28655q2.m87158i0();
                    function5 = function4;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j3);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                    AbstractC11895b.m31978A((i38 >> 6) & 14, interfaceC4351m3, c28655q2, true, false);
                    c28655q3 = c28655q2;
                }
                i44 = i16 >> 6;
                m35713B(interfaceC18153bM52119a, c21374h2, c14147i4, c28655q3, (i16 & 112) | (i44 & 896));
                if (m35741w(interfaceC28670t3)) {
                    c21374h5 = c21374h2;
                    c14147i5 = c14147i4;
                    z14 = false;
                    c28655q3.m87150e0(1015800488);
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(448404040);
                    list6 = (List) linkedHashMap.get(Boolean.TRUE);
                    if (list6 == null) {
                        c28655q3.m87150e0(1015623353);
                        c28655q3.m87173q(false);
                        c21374h5 = c21374h2;
                        z14 = false;
                        c14147i5 = c14147i4;
                    } else {
                        c28655q3.m87150e0(1015623354);
                        it3 = list6.iterator();
                        while (it3.hasNext()) {
                            C21369c c21369c2 = (C21369c) it3.next();
                            Modifier modifierM35718G4 = m35718G(c2314t2, interfaceC18153bM52119a.mo52121b(c21369c2), null, 2, null);
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                            C21374h c21374h6 = c21374h2;
                            C14147i c14147i6 = c14147i4;
                            iHashCode5 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM35718G4);
                            InterfaceC0221l.f734a.getClass();
                            c0213j5 = C0217k.f724b;
                            c28655q3.m87158i0();
                            Iterator it6 = it3;
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j5);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m5);
                            c0209i5 = C0217k.f732j;
                            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode5))) {
                                AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N5);
                            c12767j5.m35787b(c21369c2, c28655q3, i44 & 112);
                            c28655q3.m87173q(true);
                            it3 = it6;
                            c21374h2 = c21374h6;
                            c14147i4 = c14147i6;
                        }
                        c21374h5 = c21374h2;
                        c14147i5 = c14147i4;
                        z14 = false;
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z14);
                }
                buttons = c21374h5.getButtons();
                if (buttons == null) {
                    c28655q3.m87150e0(1015929416);
                    c28655q3.m87173q(z14);
                    interfaceC4339a19 = interfaceC4339a14;
                    interfaceC4339a18 = interfaceC4339a13;
                    interfaceC4339a17 = interfaceC4339a16;
                    z17 = true;
                } else {
                    c28655q3.m87150e0(1015929417);
                    numM43735c = buttons.getRight();
                    if (numM43735c == null) {
                        c28655q3.m87150e0(1595258588);
                        c28655q3.m87173q(z14);
                        c2314t3 = c2314t2;
                        interfaceC4339a17 = interfaceC4339a16;
                    } else {
                        c28655q3.m87150e0(1595258589);
                        int iIntValue = numM43735c.intValue();
                        Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t2, f43672c);
                        C27270o c27270o = new C27270o(AbstractC27274q.b.f109138f, iIntValue, null, null, null, false, false, false, 0.0f, false, 1020, null);
                        String strM92103Y = AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62350m);
                        C2314t c2314t4 = c2314t2;
                        Modifier modifierM88150k = AbstractC29011e.m88150k(c2314t4, 0.96f, 0.8f, null, 4, null);
                        c2314t3 = c2314t4;
                        if ((i38 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R8 = c28655q3.m87133R();
                        if (!z15 || objM87133R8 == c28676v0) {
                            interfaceC4339a17 = interfaceC4339a16;
                            objM87133R8 = new C12762e(interfaceC4339a17, 1);
                            c28655q3.m87172p0(objM87133R8);
                        } else {
                            interfaceC4339a17 = interfaceC4339a16;
                        }
                        AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM88150k, modifierM3599a, (InterfaceC4339a) objM87133R8, c28655q3, 3072, 0);
                        z14 = false;
                        c28655q3.m87173q(false);
                    }
                    numM43733a = buttons.getLeft();
                    if (numM43733a == null) {
                        c28655q3.m87150e0(1595797058);
                        c28655q3.m87173q(z14);
                        interfaceC4339a18 = interfaceC4339a13;
                    } else {
                        c28655q3.m87150e0(1595797059);
                        int iIntValue2 = numM43733a.intValue();
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t3, f43671b);
                        C27270o c27270o2 = new C27270o(AbstractC27274q.b.f109138f, iIntValue2, null, null, null, false, false, false, 0.0f, false, 1020, null);
                        String strM92103Y2 = AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62346l);
                        Modifier modifierM88150k2 = AbstractC29011e.m88150k(c2314t3, 0.0f, 0.8f, null, 4, null);
                        if ((i16 & 1879048192) == 536870912) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R9 = c28655q3.m87133R();
                        if (!z16 || objM87133R9 == c28676v0) {
                            interfaceC4339a18 = interfaceC4339a13;
                            objM87133R9 = new C12762e(interfaceC4339a18, 2);
                            c28655q3.m87172p0(objM87133R9);
                        } else {
                            interfaceC4339a18 = interfaceC4339a13;
                        }
                        AbstractC27242b1.m82092d(c27270o2, strM92103Y2, modifierM88150k2, modifierM3599a2, (InterfaceC4339a) objM87133R9, c28655q3, 3072, 0);
                        z14 = false;
                        c28655q3.m87173q(false);
                    }
                    listM43734b = buttons.m43734b();
                    if (listM43734b == null) {
                        c28655q3.m87150e0(1596820089);
                        c28655q3.m87173q(z14);
                        z18 = z14;
                        interfaceC4339a19 = interfaceC4339a14;
                        z17 = true;
                    } else {
                        c28655q3.m87150e0(1596820090);
                        c23454a0 = null;
                        Modifier modifierM35718G5 = m35718G(c2314t3, interfaceC18153bM52119a.mo52122c(), null, 2, null);
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, z14);
                        iHashCode4 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifierM35718G5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i4 = C0217k.f732j;
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N6);
                        c28655q3.m87150e0(238889991);
                        List<C15532e> list9 = listM43734b;
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(list9, 10));
                        it = list9.iterator();
                        while (it.hasNext()) {
                            c15532e = (C15532e) it.next();
                            enumC15528aM43730b = c15532e.getId();
                            if (enumC15528aM43730b == null) {
                                i45 = -1;
                            } else {
                                i45 = a.f43673a[enumC15528aM43730b.ordinal()];
                            }
                            c23454a1 = C23454a0.f92919a;
                            if (i45 == 1) {
                                c28655q3.m87150e0(-2099982099);
                                fM43731c = c15532e.getPositionX();
                                if (fM43731c != null) {
                                    fFloatValue = fM43731c.floatValue();
                                } else {
                                    fFloatValue = 0.8f;
                                }
                                float f14 = 1;
                                fM43732d = c15532e.getPositionY();
                                if (fM43732d != null) {
                                    fFloatValue2 = fM43732d.floatValue();
                                } else {
                                    fFloatValue2 = 0.03f;
                                }
                                f13 = f14 - fFloatValue2;
                                numM43729a = c15532e.getIcon();
                                if (numM43729a == null) {
                                    c28655q3.m87150e0(-2099776415);
                                    c28655q3.m87173q(false);
                                    c23454a2 = c23454a0;
                                    z24 = false;
                                    interfaceC4339a20 = interfaceC4339a14;
                                } else {
                                    c28655q3.m87150e0(-2099776414);
                                    int iIntValue3 = numM43729a.intValue();
                                    Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1136a.m3599a(c2314t3, f43670a), 2, 4), C38072d.f163053a.m121949b(c28655q3, 6).getBrandBlack(), AbstractC17918w0.f69621a);
                                    C27270o c27270o3 = new C27270o(AbstractC27274q.b.f109138f, iIntValue3, null, null, null, false, false, false, 0.0f, false, 1020, null);
                                    String strM92103Y3 = AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62354n);
                                    Modifier modifierM88149j = AbstractC29011e.m88149j(c2314t3, fFloatValue, f13, new C29007a(0.0f, 1.0f, false, false, 12, null));
                                    if ((i38 & 112) == 32) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    objM87133R10 = c28655q3.m87133R();
                                    if (!z19 || objM87133R10 == c28676v0) {
                                        interfaceC4339a20 = interfaceC4339a14;
                                        objM87133R10 = new C12762e(interfaceC4339a20, 0);
                                        c28655q3.m87172p0(objM87133R10);
                                    } else {
                                        interfaceC4339a20 = interfaceC4339a14;
                                    }
                                    AbstractC27242b1.m82092d(c27270o3, strM92103Y3, modifierM88149j, modifierM3358c, (InterfaceC4339a) objM87133R10, c28655q3, 0, 0);
                                    z24 = false;
                                    c28655q3.m87173q(false);
                                    c23454a2 = c23454a1;
                                }
                                c28655q3.m87173q(z24);
                                c23454a1 = c23454a2;
                            } else {
                                it = it;
                                interfaceC4339a20 = interfaceC4339a14;
                                c28655q3.m87150e0(-2098576869);
                                c28655q3.m87173q(false);
                            }
                            arrayList.add(c23454a1);
                            interfaceC4339a14 = interfaceC4339a20;
                            it = it;
                            c23454a0 = null;
                        }
                        interfaceC4339a19 = interfaceC4339a14;
                        z17 = true;
                        z18 = false;
                        AbstractC25012a.m73392y(c28655q3, false, true, false);
                    }
                    c28655q3.m87173q(z18);
                }
                c28655q3.m87173q(z17);
                InterfaceC4339a interfaceC4339a22 = interfaceC4339a17;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a8 = interfaceC4339a22;
                interfaceC11732a2 = interfaceC11732a6;
                list3 = list5;
                c21374h3 = c21374h5;
                interfaceC4339a6 = interfaceC4339a15;
                c14147i3 = c14147i5;
                interfaceC4339a7 = interfaceC4339a18;
                c12767j3 = c12767j5;
                modifier3 = modifier6;
                c18152a2 = c18152a4;
                interfaceC4339a5 = interfaceC4339a19;
                function2 = function5;
                c28655q = c28655q3;
            } else {
                C28655q c28655q6 = c28655q4;
                c28655q6.m87138X();
                c18152a2 = c18152a;
                interfaceC11732a2 = interfaceC11732a;
                interfaceC4339a5 = interfaceC4339a4;
                modifier3 = modifier2;
                c21374h3 = c21374h2;
                list3 = list2;
                c14147i3 = c14147i2;
                c12767j3 = c12767j2;
                interfaceC4339a6 = interfaceC4339a;
                function2 = function1;
                interfaceC4339a7 = interfaceC4339a2;
                interfaceC4339a8 = interfaceC4339a3;
                interfaceC4351m2 = interfaceC4351m;
                c28655q = c28655q6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e61.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue4 = ((Integer) obj3).intValue();
                        return AbstractC12765h.m35712A(modifier3, c21374h3, list3, c12767j3, c14147i3, c18152a2, interfaceC4339a6, interfaceC11732a2, function2, interfaceC4339a7, interfaceC4339a8, interfaceC4339a5, interfaceC4351m2, i13, i14, i15, (Composer) obj2, iIntValue4);
                    }
                };
            }
        }
        i16 |= 384;
        list2 = list;
        if ((i13 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                c12767j8 = c12767j;
                if (c28655q4.m87153g(c12767j8)) {
                    c12767j6 = c12767j8;
                    i49 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    c12767j7 = c12767j8;
                }
                i16 |= i49;
                c12767j2 = c12767j7;
            } else {
                c12767j6 = c12767j;
            }
            c12767j6 = c12767j8;
            i49 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            c12767j7 = c12767j6;
            i16 |= i49;
            c12767j2 = c12767j7;
        } else {
            c12767j2 = c12767j;
        }
        if ((i13 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                c14147i2 = c14147i;
                if (c28655q4.m87153g(c14147i2)) {
                    i48 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i16 |= i48;
            } else {
                c14147i2 = c14147i;
            }
            i48 = DfuBaseService.ERROR_REMOTE_MASK;
            i16 |= i48;
        } else {
            c14147i2 = c14147i;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 0) {
            if ((i15 & 32) == 0) {
                i47 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            } else {
                i47 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i47;
        }
        i17 = i15 & 64;
        if (i17 != 0) {
            i16 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q4.m87157i(interfaceC4339a)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i16 |= i18;
        }
        if ((i13 & 12582912) != 0) {
            if ((i15 & 128) != 0) {
                i46 = 4194304;
            } else {
                if ((16777216 & i13) == 0) {
                    zM87157i = c28655q4.m87153g(interfaceC11732a);
                } else {
                    zM87157i = c28655q4.m87157i(interfaceC11732a);
                }
                if (zM87157i) {
                    i46 = 8388608;
                } else {
                    i46 = 4194304;
                }
            }
            i16 |= i46;
        }
        i19 = i15 & 256;
        if (i19 != 0) {
            i16 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c28655q4.m87157i(function1)) {
                i24 = 67108864;
            } else {
                i24 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i24;
        }
        i25 = i15 & 512;
        if (i25 != 0) {
            i16 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c28655q4.m87157i(interfaceC4339a2)) {
                i26 = 536870912;
            } else {
                i26 = 268435456;
            }
            i16 |= i26;
        }
        i27 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i27 != 0) {
            i28 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q4.m87157i(interfaceC4339a3)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i28 = i14 | i29;
        } else {
            i28 = i14;
        }
        i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i34 != 0) {
            i28 |= 48;
        } else if ((i14 & 48) != 0) {
            if (c28655q4.m87157i(interfaceC4339a4)) {
                i35 = 32;
            } else {
                i35 = 16;
            }
            i28 |= i35;
        }
        i36 = i28;
        i37 = i15 & 4096;
        if (i37 != 0) {
            i38 = i36 | 384;
        } else if ((i14 & 384) == 0) {
            i38 = i36 | (c28655q4.m87157i(interfaceC4351m) ? 256 : 128);
        } else {
            i38 = i36;
        }
        if ((i16 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (c28655q4.m87135U(i16 & 1, z4)) {
            c28655q4.m87140Z();
            i39 = i13 & 1;
            c2314t = C2314t.f9131w;
            c28676v0 = C28635l.f115821a;
            if (i39 != 0) {
                if (i54 != 0) {
                    modifier2 = c2314t;
                }
                if ((i15 & 2) != 0) {
                    c21374h4 = new C21374h(null, null, null, null, null, null, null, null, false, false, null, 0L, 0.0f, 8191, null);
                    i16 &= -113;
                } else {
                    c21374h4 = c21374h2;
                }
                if (i56 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                    c12767j4 = new C12767j();
                } else {
                    c12767j4 = c12767j2;
                }
                if ((i15 & 16) != 0) {
                    c14147i4 = new C14147i();
                    i16 &= -57345;
                } else {
                    c14147i4 = c14147i2;
                }
                if ((i15 & 32) != 0) {
                    c18152a3 = new C18152a();
                    i16 &= -458753;
                } else {
                    c18152a3 = c18152a;
                }
                if (i17 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C0148f(24);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC4339a9 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a9 = interfaceC4339a;
                }
                if ((i15 & 128) != 0) {
                    interfaceC11732a3 = InterfaceC11732a.b.f37977a;
                    i16 &= -29360129;
                } else {
                    interfaceC11732a3 = interfaceC11732a;
                }
                if (i19 != 0) {
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C11906c(21);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    i38 = i38;
                    function3 = function1;
                }
                if (i25 != 0) {
                    objM87133R3 = c28655q4.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C0148f(25);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                } else {
                    function3 = function3;
                    interfaceC4339a10 = interfaceC4339a2;
                }
                if (i27 != 0) {
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C0148f(26);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a10 = interfaceC4339a10;
                    interfaceC4339a11 = interfaceC4339a3;
                }
                if (i34 != 0) {
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C0148f(27);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a11 = interfaceC4339a11;
                    interfaceC4339a12 = interfaceC4339a4;
                }
                if (i37 != 0) {
                    interfaceC4351mM35705b = C12758a.f43638a.m35705b();
                } else {
                    interfaceC4351mM35705b = interfaceC4351m;
                }
                interfaceC4339a13 = interfaceC4339a10;
                interfaceC4339a14 = interfaceC4339a12;
                interfaceC11732a4 = interfaceC11732a3;
                c12767j5 = c12767j4;
                c21374h2 = c21374h4;
            } else {
                if (i54 != 0) {
                    modifier2 = c2314t;
                }
                if ((i15 & 2) != 0) {
                    c21374h4 = new C21374h(null, null, null, null, null, null, null, null, false, false, null, 0L, 0.0f, 8191, null);
                    i16 &= -113;
                } else {
                    c21374h4 = c21374h2;
                }
                if (i56 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                    c12767j4 = new C12767j();
                } else {
                    c12767j4 = c12767j2;
                }
                if ((i15 & 16) != 0) {
                    c14147i4 = new C14147i();
                    i16 &= -57345;
                } else {
                    c14147i4 = c14147i2;
                }
                if ((i15 & 32) != 0) {
                    c18152a3 = new C18152a();
                    i16 &= -458753;
                } else {
                    c18152a3 = c18152a;
                }
                if (i17 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C0148f(24);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC4339a9 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a9 = interfaceC4339a;
                }
                if ((i15 & 128) != 0) {
                    interfaceC11732a3 = InterfaceC11732a.b.f37977a;
                    i16 &= -29360129;
                } else {
                    interfaceC11732a3 = interfaceC11732a;
                }
                if (i19 != 0) {
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C11906c(21);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    i38 = i38;
                    function3 = function1;
                }
                if (i25 != 0) {
                    objM87133R3 = c28655q4.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C0148f(25);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                } else {
                    function3 = function3;
                    interfaceC4339a10 = interfaceC4339a2;
                }
                if (i27 != 0) {
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C0148f(26);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a10 = interfaceC4339a10;
                    interfaceC4339a11 = interfaceC4339a3;
                }
                if (i34 != 0) {
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C0148f(27);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a11 = interfaceC4339a11;
                    interfaceC4339a12 = interfaceC4339a4;
                }
                if (i37 != 0) {
                    interfaceC4351mM35705b = C12758a.f43638a.m35705b();
                } else {
                    interfaceC4351mM35705b = interfaceC4351m;
                }
                interfaceC4339a13 = interfaceC4339a10;
                interfaceC4339a14 = interfaceC4339a12;
                interfaceC11732a4 = interfaceC11732a3;
                c12767j5 = c12767j4;
                c21374h2 = c21374h4;
            }
            c28655q4.m87175r();
            function4 = function3;
            interfaceC4339a15 = interfaceC4339a9;
            strM21274h = AbstractC8693b.m21274h(c21374h2.getAccessibilityState().getGraphDescription(), c28655q4, 0);
            if (c21374h2.getClickable()) {
                c28655q4.m87150e0(178876994);
                objM87133R11 = c28655q4.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC11266d.m30453g(c28655q4);
                }
                Modifier modifierM3360e2 = AbstractC1092a.m3360e(c2314t, (InterfaceC21083i) objM87133R11, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), false, null, interfaceC4339a15, 28);
                c2314t2 = c2314t;
                c28655q4.m87173q(false);
                modifier4 = modifierM3360e2;
            } else {
                c2314t2 = c2314t;
                c28655q4.m87150e0(178884348);
                c28655q4.m87173q(false);
                modifier4 = c2314t2;
            }
            Modifier modifierMo3471e2 = modifier2.mo3471e(modifier4);
            zM87153g = c28655q4.m87153g(strM21274h);
            objM87133R6 = c28655q4.m87133R();
            if (zM87153g) {
                objM87133R6 = new C12764g(strM21274h, 0);
                c28655q4.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C12764g(strM21274h, 0);
                c28655q4.m87172p0(objM87133R6);
            }
            Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierMo3471e2, false, (Function1) objM87133R6);
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
            Modifier modifier7 = modifier2;
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM51775c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d7);
            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N7);
            interfaceC18153bM52119a = c18152a3.m52119a(c21374h2, ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).getFontScale());
            List<C21369c> listM59991h2 = c21374h2.m59991h();
            linkedHashMap = new LinkedHashMap();
            while (r7.hasNext()) {
                boolValueOf = Boolean.valueOf(((C21369c) obj).getType().isDrawnAbovePlotContent());
                arrayList2 = linkedHashMap.get(boolValueOf);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(boolValueOf, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            objM87133R7 = c28655q4.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87264r(new C0438l0(interfaceC11732a4, 12));
                c28655q4.m87172p0(objM87133R7);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R7;
            c29007a = null;
            if (m35741w(interfaceC28670t2)) {
                c28655q4.m87150e0(448364584);
                list7 = (List) linkedHashMap.get(Boolean.FALSE);
                if (list7 == null) {
                    c28655q4.m87150e0(1014400217);
                    z13 = false;
                    c28655q4.m87173q(false);
                    interfaceC11732a5 = interfaceC11732a4;
                    interfaceC4339a16 = interfaceC4339a11;
                    interfaceC28670t3 = interfaceC28670t2;
                    c18152a4 = c18152a3;
                } else {
                    c28655q4.m87150e0(1014400218);
                    it4 = list7.iterator();
                    while (it4.hasNext()) {
                        C21369c c21369c3 = (C21369c) it4.next();
                        InterfaceC11732a interfaceC11732a8 = interfaceC11732a4;
                        InterfaceC28670t2 interfaceC28670t5 = interfaceC28670t2;
                        Modifier modifierM35718G6 = m35718G(c2314t2, interfaceC18153bM52119a.mo52121b(c21369c3), c29007a, 2, c29007a);
                        InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                        C18152a c18152a6 = c18152a3;
                        Iterator it7 = it4;
                        iHashCode6 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, modifierM35718G6);
                        InterfaceC0221l.f734a.getClass();
                        c0213j6 = C0217k.f724b;
                        c28655q4.m87158i0();
                        InterfaceC4339a interfaceC4339a23 = interfaceC4339a11;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j6);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d8);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i6 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N8);
                        c12767j5.m35787b(c21369c3, c28655q4, (i16 >> 6) & 112);
                        c28655q4.m87173q(true);
                        it4 = it7;
                        interfaceC11732a4 = interfaceC11732a8;
                        interfaceC28670t2 = interfaceC28670t5;
                        c18152a3 = c18152a6;
                        interfaceC4339a11 = interfaceC4339a23;
                        c29007a = null;
                    }
                    interfaceC11732a5 = interfaceC11732a4;
                    interfaceC4339a16 = interfaceC4339a11;
                    interfaceC28670t3 = interfaceC28670t2;
                    c18152a4 = c18152a3;
                    z13 = false;
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(z13);
            } else {
                interfaceC11732a5 = interfaceC11732a4;
                interfaceC4339a16 = interfaceC4339a11;
                interfaceC28670t3 = interfaceC28670t2;
                c18152a4 = c18152a3;
                z13 = false;
                c28655q4.m87150e0(1014577352);
                c28655q4.m87173q(false);
            }
            Modifier modifierM35718G7 = m35718G(c2314t2, interfaceC18153bM52119a.mo52122c(), null, 2, null);
            InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m, z13);
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, modifierM35718G7);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j2);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d9);
            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m9);
            c0209i2 = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N9);
            modifierM3396r = AbstractC1099a.m3396r(c2314t2, c21374h2.getHorizontalGridLinePadding() * 8, 0.0f, 2);
            c28655q4.m87150e0(582183635);
            while (r1.hasNext()) {
                if (c21372f.getAxis() == EnumC15533f.X_AXIS) {
                    modifier5 = modifierM3396r;
                } else {
                    modifier5 = c2314t2;
                }
                AbstractC3712b.m11530b(modifier5, c21372f, c28655q4, 0, 0);
            }
            c28655q4.m87173q(false);
            c28655q4.m87173q(true);
            if (c21374h2.getScrubberEnabled()) {
                c28655q4.m87150e0(1014991140);
                List<? extends InterfaceC11257r> list10 = list4;
                InterfaceC4351m interfaceC4351m5 = interfaceC4351mM35705b;
                AbstractC11245f.m30353d(interfaceC18153bM52119a.mo52120a(), interfaceC18153bM52119a.mo52127h(), interfaceC11732a5, list10, function4, c21374h2.getLongPressTimeoutMillis(), false, interfaceC4351m5, c28655q4, ((i16 >> 15) & 896) | ((i16 << 3) & 7168) | ((i16 >> 12) & 57344) | (29360128 & (i38 << 15)), 64);
                interfaceC4351m3 = interfaceC4351m5;
                C28655q c28655q7 = c28655q4;
                c28655q7.m87173q(false);
                interfaceC11732a6 = interfaceC11732a5;
                list5 = list10;
                function5 = function4;
                c28655q3 = c28655q7;
            } else {
                c28655q2 = c28655q4;
                interfaceC4351m3 = interfaceC4351mM35705b;
                c28655q2.m87150e0(1015383445);
                interfaceC11732a6 = interfaceC11732a5;
                Modifier modifierM35718G8 = m35718G(c2314t2, interfaceC18153bM52119a.mo52120a(), null, 2, null);
                InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM35718G8);
                InterfaceC0221l.f734a.getClass();
                list5 = list4;
                c0213j3 = C0217k.f724b;
                c28655q2.m87158i0();
                function5 = function4;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j3);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d10);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m10);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N10);
                AbstractC11895b.m31978A((i38 >> 6) & 14, interfaceC4351m3, c28655q2, true, false);
                c28655q3 = c28655q2;
            }
            i44 = i16 >> 6;
            m35713B(interfaceC18153bM52119a, c21374h2, c14147i4, c28655q3, (i16 & 112) | (i44 & 896));
            if (m35741w(interfaceC28670t3)) {
                c28655q3.m87150e0(448404040);
                list6 = (List) linkedHashMap.get(Boolean.TRUE);
                if (list6 == null) {
                    c28655q3.m87150e0(1015623353);
                    c28655q3.m87173q(false);
                    c21374h5 = c21374h2;
                    z14 = false;
                    c14147i5 = c14147i4;
                } else {
                    c28655q3.m87150e0(1015623354);
                    it3 = list6.iterator();
                    while (it3.hasNext()) {
                        C21369c c21369c4 = (C21369c) it3.next();
                        Modifier modifierM35718G9 = m35718G(c2314t2, interfaceC18153bM52119a.mo52121b(c21369c4), null, 2, null);
                        InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m, false);
                        C21374h c21374h7 = c21374h2;
                        C14147i c14147i7 = c14147i4;
                        iHashCode5 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q3.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q3, modifierM35718G9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j5 = C0217k.f724b;
                        c28655q3.m87158i0();
                        Iterator it8 = it3;
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j5);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d11);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m11);
                        c0209i5 = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N11);
                        c12767j5.m35787b(c21369c4, c28655q3, i44 & 112);
                        c28655q3.m87173q(true);
                        it3 = it8;
                        c21374h2 = c21374h7;
                        c14147i4 = c14147i7;
                    }
                    c21374h5 = c21374h2;
                    c14147i5 = c14147i4;
                    z14 = false;
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z14);
            } else {
                c21374h5 = c21374h2;
                c14147i5 = c14147i4;
                z14 = false;
                c28655q3.m87150e0(1015800488);
                c28655q3.m87173q(false);
            }
            buttons = c21374h5.getButtons();
            if (buttons == null) {
                c28655q3.m87150e0(1015929416);
                c28655q3.m87173q(z14);
                interfaceC4339a19 = interfaceC4339a14;
                interfaceC4339a18 = interfaceC4339a13;
                interfaceC4339a17 = interfaceC4339a16;
                z17 = true;
            } else {
                c28655q3.m87150e0(1015929417);
                numM43735c = buttons.getRight();
                if (numM43735c == null) {
                    c28655q3.m87150e0(1595258588);
                    c28655q3.m87173q(z14);
                    c2314t3 = c2314t2;
                    interfaceC4339a17 = interfaceC4339a16;
                } else {
                    c28655q3.m87150e0(1595258589);
                    int iIntValue4 = numM43735c.intValue();
                    Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t2, f43672c);
                    C27270o c27270o4 = new C27270o(AbstractC27274q.b.f109138f, iIntValue4, null, null, null, false, false, false, 0.0f, false, 1020, null);
                    String strM92103Y4 = AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62350m);
                    C2314t c2314t5 = c2314t2;
                    Modifier modifierM88150k3 = AbstractC29011e.m88150k(c2314t5, 0.96f, 0.8f, null, 4, null);
                    c2314t3 = c2314t5;
                    if ((i38 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R8 = c28655q3.m87133R();
                    if (z15) {
                        interfaceC4339a17 = interfaceC4339a16;
                        objM87133R8 = new C12762e(interfaceC4339a17, 1);
                        c28655q3.m87172p0(objM87133R8);
                    } else {
                        interfaceC4339a17 = interfaceC4339a16;
                        objM87133R8 = new C12762e(interfaceC4339a17, 1);
                        c28655q3.m87172p0(objM87133R8);
                    }
                    AbstractC27242b1.m82092d(c27270o4, strM92103Y4, modifierM88150k3, modifierM3599a3, (InterfaceC4339a) objM87133R8, c28655q3, 3072, 0);
                    z14 = false;
                    c28655q3.m87173q(false);
                }
                numM43733a = buttons.getLeft();
                if (numM43733a == null) {
                    c28655q3.m87150e0(1595797058);
                    c28655q3.m87173q(z14);
                    interfaceC4339a18 = interfaceC4339a13;
                } else {
                    c28655q3.m87150e0(1595797059);
                    int iIntValue5 = numM43733a.intValue();
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t3, f43671b);
                    C27270o c27270o5 = new C27270o(AbstractC27274q.b.f109138f, iIntValue5, null, null, null, false, false, false, 0.0f, false, 1020, null);
                    String strM92103Y5 = AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62346l);
                    Modifier modifierM88150k4 = AbstractC29011e.m88150k(c2314t3, 0.0f, 0.8f, null, 4, null);
                    if ((i16 & 1879048192) == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R9 = c28655q3.m87133R();
                    if (z16) {
                        interfaceC4339a18 = interfaceC4339a13;
                        objM87133R9 = new C12762e(interfaceC4339a18, 2);
                        c28655q3.m87172p0(objM87133R9);
                    } else {
                        interfaceC4339a18 = interfaceC4339a13;
                        objM87133R9 = new C12762e(interfaceC4339a18, 2);
                        c28655q3.m87172p0(objM87133R9);
                    }
                    AbstractC27242b1.m82092d(c27270o5, strM92103Y5, modifierM88150k4, modifierM3599a4, (InterfaceC4339a) objM87133R9, c28655q3, 3072, 0);
                    z14 = false;
                    c28655q3.m87173q(false);
                }
                listM43734b = buttons.m43734b();
                if (listM43734b == null) {
                    c28655q3.m87150e0(1596820089);
                    c28655q3.m87173q(z14);
                    z18 = z14;
                    interfaceC4339a19 = interfaceC4339a14;
                    z17 = true;
                } else {
                    c28655q3.m87150e0(1596820090);
                    c23454a0 = null;
                    Modifier modifierM35718G10 = m35718G(c2314t3, interfaceC18153bM52119a.mo52122c(), null, 2, null);
                    InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m, z14);
                    iHashCode4 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q3.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q3, modifierM35718G10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d12);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m12);
                    c0209i4 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N12);
                    c28655q3.m87150e0(238889991);
                    List<C15532e> list11 = listM43734b;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list11, 10));
                    it = list11.iterator();
                    while (it.hasNext()) {
                        c15532e = (C15532e) it.next();
                        enumC15528aM43730b = c15532e.getId();
                        if (enumC15528aM43730b == null) {
                            i45 = -1;
                        } else {
                            i45 = a.f43673a[enumC15528aM43730b.ordinal()];
                        }
                        c23454a1 = C23454a0.f92919a;
                        if (i45 == 1) {
                            c28655q3.m87150e0(-2099982099);
                            fM43731c = c15532e.getPositionX();
                            if (fM43731c != null) {
                                fFloatValue = fM43731c.floatValue();
                            } else {
                                fFloatValue = 0.8f;
                            }
                            float f15 = 1;
                            fM43732d = c15532e.getPositionY();
                            if (fM43732d != null) {
                                fFloatValue2 = fM43732d.floatValue();
                            } else {
                                fFloatValue2 = 0.03f;
                            }
                            f13 = f15 - fFloatValue2;
                            numM43729a = c15532e.getIcon();
                            if (numM43729a == null) {
                                c28655q3.m87150e0(-2099776415);
                                c28655q3.m87173q(false);
                                c23454a2 = c23454a0;
                                z24 = false;
                                interfaceC4339a20 = interfaceC4339a14;
                            } else {
                                c28655q3.m87150e0(-2099776414);
                                int iIntValue6 = numM43729a.intValue();
                                Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1136a.m3599a(c2314t3, f43670a), 2, 4), C38072d.f163053a.m121949b(c28655q3, 6).getBrandBlack(), AbstractC17918w0.f69621a);
                                C27270o c27270o6 = new C27270o(AbstractC27274q.b.f109138f, iIntValue6, null, null, null, false, false, false, 0.0f, false, 1020, null);
                                String strM92103Y6 = AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62354n);
                                Modifier modifierM88149j2 = AbstractC29011e.m88149j(c2314t3, fFloatValue, f13, new C29007a(0.0f, 1.0f, false, false, 12, null));
                                if ((i38 & 112) == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                objM87133R10 = c28655q3.m87133R();
                                if (z19) {
                                    interfaceC4339a20 = interfaceC4339a14;
                                    objM87133R10 = new C12762e(interfaceC4339a20, 0);
                                    c28655q3.m87172p0(objM87133R10);
                                } else {
                                    interfaceC4339a20 = interfaceC4339a14;
                                    objM87133R10 = new C12762e(interfaceC4339a20, 0);
                                    c28655q3.m87172p0(objM87133R10);
                                }
                                AbstractC27242b1.m82092d(c27270o6, strM92103Y6, modifierM88149j2, modifierM3358c2, (InterfaceC4339a) objM87133R10, c28655q3, 0, 0);
                                z24 = false;
                                c28655q3.m87173q(false);
                                c23454a2 = c23454a1;
                            }
                            c28655q3.m87173q(z24);
                            c23454a1 = c23454a2;
                        } else {
                            it = it;
                            interfaceC4339a20 = interfaceC4339a14;
                            c28655q3.m87150e0(-2098576869);
                            c28655q3.m87173q(false);
                        }
                        arrayList.add(c23454a1);
                        interfaceC4339a14 = interfaceC4339a20;
                        it = it;
                        c23454a0 = null;
                    }
                    interfaceC4339a19 = interfaceC4339a14;
                    z17 = true;
                    z18 = false;
                    AbstractC25012a.m73392y(c28655q3, false, true, false);
                }
                c28655q3.m87173q(z18);
            }
            c28655q3.m87173q(z17);
            InterfaceC4339a interfaceC4339a24 = interfaceC4339a17;
            interfaceC4351m2 = interfaceC4351m3;
            interfaceC4339a8 = interfaceC4339a24;
            interfaceC11732a2 = interfaceC11732a6;
            list3 = list5;
            c21374h3 = c21374h5;
            interfaceC4339a6 = interfaceC4339a15;
            c14147i3 = c14147i5;
            interfaceC4339a7 = interfaceC4339a18;
            c12767j3 = c12767j5;
            modifier3 = modifier7;
            c18152a2 = c18152a4;
            interfaceC4339a5 = interfaceC4339a19;
            function2 = function5;
            c28655q = c28655q3;
        } else {
            C28655q c28655q8 = c28655q4;
            c28655q8.m87138X();
            c18152a2 = c18152a;
            interfaceC11732a2 = interfaceC11732a;
            interfaceC4339a5 = interfaceC4339a4;
            modifier3 = modifier2;
            c21374h3 = c21374h2;
            list3 = list2;
            c14147i3 = c14147i2;
            c12767j3 = c12767j2;
            interfaceC4339a6 = interfaceC4339a;
            function2 = function1;
            interfaceC4339a7 = interfaceC4339a2;
            interfaceC4339a8 = interfaceC4339a3;
            interfaceC4351m2 = interfaceC4351m;
            c28655q = c28655q8;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e61.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue7 = ((Integer) obj3).intValue();
                    return AbstractC12765h.m35712A(modifier3, c21374h3, list3, c12767j3, c14147i3, c18152a2, interfaceC4339a6, interfaceC11732a2, function2, interfaceC4339a7, interfaceC4339a8, interfaceC4339a5, interfaceC4351m2, i13, i14, i15, (Composer) obj2, iIntValue7);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m35734p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m35735q(InterfaceC11732a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m35736r() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m35737s() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m35738t() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m35739u(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final boolean m35740v(InterfaceC11732a interfaceC11732a) {
        if (interfaceC11732a instanceof InterfaceC11732a.c) {
            return true;
        }
        if (AbstractC22676k.m65745e(interfaceC11732a, InterfaceC11732a.b.f37977a)) {
            return false;
        }
        if (interfaceC11732a instanceof InterfaceC11732a.a) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: w */
    private static final boolean m35741w(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m35742x(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m35743y(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m35744z(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }
}

package z71;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bm2.C3428b1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e81.C12819b0;
import gy0.AbstractC16272a;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import i91.AbstractC18247a;
import i91.AbstractC18254h;
import i91.AbstractC18255i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j93.AbstractC21478l0;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.InterfaceC17910s0;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import v41.AbstractC35684p;
import v41.C35658c;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import yo0.C39681c;
import yz1.C39913g;
import z51.C40103n;

/* JADX INFO: renamed from: z71.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a£\u0001\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a5\u0010$\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%\u001aI\u0010)\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b)\u0010*\u001a\u0017\u0010+\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0007H\u0003¢\u0006\u0004\b+\u0010,\u001a\u000f\u0010-\u001a\u00020\u0016H\u0003¢\u0006\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Li91/a;", "border", "overlay", "", "showHighLight", "", "highlightPercent", "Lcom/whoop/design/util/TextResource;", "metric", "title", "Li2/x;", "titleColor", "subtitleColor", "subtitle", "startValue", "endValue", "", "infoButtonContentDescription", "isLoading", "loadingPrompt", "isCalibrating", "Lkotlin/Function0;", "Ll83/a0;", "onInfoButtonClicked", "n", "(Li91/a;Li91/a;ZFLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/Modifier;", "modifier", "o", "(Landroidx/compose/ui/Modifier;Li91/a;Li91/a;Landroidx/compose/runtime/Composer;II)V", "selectorStartAngle", "sweepAngle", "Li2/t;", "brush", "Li2/o;", "blendMode", "t", "(FFLi2/t;ILandroidx/compose/runtime/Composer;II)V", "Ly3/f;", "thickness", "canvasSize", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(FFFFLi2/t;ILandroidx/compose/runtime/Composer;II)V", "z", "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "r", "(Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40153l {

    /* JADX INFO: renamed from: z71.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f173278w = new a();

        /* JADX INFO: renamed from: a */
        public final long m128768a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m128768a((C39336i) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m128736A() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m128737B(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m128738C(TextResource textResource, int i13, Composer composer, int i14) {
        m128767z(textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m128739D() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m128740E(boolean z4, boolean z13, boolean z14, float f13, String str, InterfaceC4339a interfaceC4339a, AbstractC18247a abstractC18247a, AbstractC18247a abstractC18247a2, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, long j7, long j13, TextResource textResource5, TextResource textResource6, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2307m c2307m = C2299e.f9102E;
            float fM128728c = AbstractC40145d.m128728c();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(fM128728c, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
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
            m128756o(null, abstractC18247a, abstractC18247a2, c28655q, 0, 1);
            C1100b c1100b = C1100b.f4583a;
            if (z13) {
                c28655q.m87150e0(1110452226);
                m128767z(textResource, c28655q, 0);
                c28655q.m87173q(false);
            } else if (z14) {
                c28655q.m87150e0(1110454297);
                m128759r(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(64411584);
                AbstractC40144c.m128724b(c1100b.mo3400a(c2314t, C2299e.f9115x), textResource2, textResource3, textResource4, j7, j13, c28655q, 0);
                AbstractC40154m.m128770b(c1100b.mo3400a(c2314t, C2299e.f9105H), textResource5, textResource6, c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (!z4 || z13 || z14) {
                c28655q.m87150e0(1392160245);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1392040120);
                m128761t(f13, 0.0f, null, 0, c28655q, 0, 14);
                m128764w(f13, 0.0f, 0.0f, 0.0f, null, 0, c28655q, 0, 62);
                c28655q.m87173q(false);
            }
            AbstractC27274q.g gVar = AbstractC27274q.g.f109144f;
            int i14 = AbstractC16272a.f62127n4;
            EnumC39333f enumC39333f = EnumC39333f.GREY_L1;
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = a.f173278w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(new C27270o(gVar, i14, enumC39333f, p745y81.Function1.m125323a((Function1) objM87133R), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null), str, c1100b.mo3400a(c2314t, C2299e.f9116y), null, interfaceC4339a, c28655q, 0, 8);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m128741F(AbstractC18247a abstractC18247a, AbstractC18247a abstractC18247a2, boolean z4, float f13, TextResource textResource, TextResource textResource2, long j7, long j13, TextResource textResource3, TextResource textResource4, TextResource textResource5, String str, boolean z13, TextResource textResource6, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15, Composer composer, int i16) {
        m128755n(abstractC18247a, abstractC18247a2, z4, f13, textResource, textResource2, j7, j13, textResource3, textResource4, textResource5, str, z13, textResource6, z14, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x015e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0165  */
    /* JADX WARN: Code duplicated, block: B:107:0x016b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0174  */
    /* JADX WARN: Code duplicated, block: B:114:0x017c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0180  */
    /* JADX WARN: Code duplicated, block: B:119:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0192  */
    /* JADX WARN: Code duplicated, block: B:125:0x019b  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:154:0x0200  */
    /* JADX WARN: Code duplicated, block: B:158:0x0219 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x021c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0222  */
    /* JADX WARN: Code duplicated, block: B:164:0x022e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0232  */
    /* JADX WARN: Code duplicated, block: B:167:0x0235  */
    /* JADX WARN: Code duplicated, block: B:169:0x0239  */
    /* JADX WARN: Code duplicated, block: B:170:0x023c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0244  */
    /* JADX WARN: Code duplicated, block: B:174:0x0249  */
    /* JADX WARN: Code duplicated, block: B:177:0x024e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0252  */
    /* JADX WARN: Code duplicated, block: B:181:0x025c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0275  */
    /* JADX WARN: Code duplicated, block: B:186:0x02be  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:70:0x0108  */
    /* JADX WARN: Code duplicated, block: B:72:0x010e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:77:0x011b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0124  */
    /* JADX WARN: Code duplicated, block: B:84:0x012c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0132  */
    /* JADX WARN: Code duplicated, block: B:87:0x0135  */
    /* JADX WARN: Code duplicated, block: B:89:0x013a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0140  */
    /* JADX WARN: Code duplicated, block: B:95:0x0149  */
    /* JADX WARN: Code duplicated, block: B:97:0x014d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0155  */
    /* JADX INFO: renamed from: n */
    public static final void m128755n(final AbstractC18247a border, final AbstractC18247a overlay, boolean z4, final float f13, final TextResource metric, final TextResource title, final long j7, long j13, final TextResource subtitle, final TextResource startValue, final TextResource endValue, String str, boolean z13, TextResource textResource, boolean z14, InterfaceC4339a interfaceC4339a, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        boolean z15;
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
        int i39;
        boolean z16;
        final String str2;
        final boolean z17;
        final TextResource textResource2;
        final boolean z18;
        final InterfaceC4339a interfaceC4339a2;
        final boolean z19;
        final long j14;
        C28677v1 c28677v1M87180u;
        long jM125382b1;
        String str3;
        boolean z24;
        final long j15;
        TextResource textResourceM21267a;
        final InterfaceC4339a interfaceC4339a3;
        final String str4;
        final boolean z25;
        final boolean z26;
        final boolean z27;
        final TextResource textResource3;
        Object objM87133R;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        AbstractC22676k.m65750j(border, "border");
        AbstractC22676k.m65750j(overlay, "overlay");
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(startValue, "startValue");
        AbstractC22676k.m65750j(endValue, "endValue");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1305465075);
        if ((i13 & 6) == 0) {
            i16 = (c28655q.m87153g(border) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q.m87153g(overlay) ? 32 : 16;
        }
        int i55 = i15 & 4;
        if (i55 == 0) {
            if ((i13 & 384) == 0) {
                z15 = z4;
                i16 |= c28655q.m87155h(z15) ? 256 : 128;
            }
            i17 = i13 & 3072;
            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i17 == 0) {
                if (c28655q.m87147d(f13)) {
                    i54 = 2048;
                } else {
                    i54 = 1024;
                }
                i16 |= i54;
            }
            i19 = i13 & 24576;
            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            if (i19 == 0) {
                if (c28655q.m87153g(metric)) {
                    i49 = 16384;
                } else {
                    i49 = 8192;
                }
                i16 |= i49;
            }
            i25 = i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i25 == 0) {
                if (c28655q.m87153g(title)) {
                    i48 = 131072;
                } else {
                    i48 = 65536;
                }
                i16 |= i48;
            }
            if ((i13 & 1572864) != 0) {
                if (c28655q.m87151f(j7)) {
                    i47 = 1048576;
                } else {
                    i47 = 524288;
                }
                i16 |= i47;
            }
            if ((i13 & 12582912) != 0) {
                i16 |= ((i15 & 128) == 0 || !c28655q.m87151f(j13)) ? 4194304 : 8388608;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87153g(subtitle)) {
                    i46 = 67108864;
                } else {
                    i46 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i46;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87153g(startValue)) {
                    i45 = 536870912;
                } else {
                    i45 = 268435456;
                }
                i16 |= i45;
            }
            if ((i14 & 6) == 0) {
                if (c28655q.m87153g(endValue)) {
                    i44 = 4;
                } else {
                    i44 = 2;
                }
                i27 = i14 | i44;
            } else {
                i27 = i14;
            }
            i28 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i28 != 0) {
                if ((i14 & 48) == 0) {
                    i27 |= c28655q.m87153g(str) ? 32 : 16;
                }
                i29 = i27;
                i34 = i15 & 4096;
                if (i34 != 0) {
                    i35 = i29;
                    if ((i14 & 384) == 0) {
                        i35 |= c28655q.m87155h(z13) ? 256 : 128;
                    }
                    if ((i14 & 3072) != 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0 && c28655q.m87153g(textResource)) {
                            i18 = 2048;
                        }
                        i35 |= i18;
                    }
                    i36 = i35;
                    i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                    if (i37 != 0) {
                        i38 = i36;
                        if ((i14 & 24576) == 0) {
                            if (!c28655q.m87155h(z14)) {
                                i24 = 8192;
                            }
                            i38 |= i24;
                        }
                        i39 = i15 & 32768;
                        if (i39 != 0) {
                            i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q.m87157i(interfaceC4339a)) {
                                i26 = 131072;
                            }
                            i38 |= i26;
                        }
                        if ((i16 & 306783379) == 306783378 || (i38 & 74899) != 74898) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q.m87135U(i16 & 1, z16)) {
                            c28655q.m87140Z();
                            if ((i13 & 1) != 0 || c28655q.m87118C()) {
                                boolean z28 = i55 == 0 ? z15 : true;
                                if ((i15 & 128) != 0) {
                                    jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                                } else {
                                    jM125382b1 = j13;
                                }
                                if (i28 != 0) {
                                    str3 = "";
                                } else {
                                    str3 = str;
                                }
                                if (i34 != 0) {
                                    z24 = false;
                                } else {
                                    z24 = z13;
                                }
                                j15 = jM125382b1;
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    textResourceM21267a = AbstractC8693b.m21267a();
                                } else {
                                    textResourceM21267a = textResource;
                                }
                                boolean z29 = i37 == 0 ? z14 : false;
                                if (i39 != 0) {
                                    objM87133R = c28655q.m87133R();
                                    if (objM87133R == C28635l.f115821a) {
                                        objM87133R = new C39681c(25);
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                str4 = str3;
                                z25 = z24;
                                z26 = z29;
                                z27 = z28;
                                textResource3 = textResourceM21267a;
                            } else {
                                c28655q.m87138X();
                                j15 = j13;
                                str4 = str;
                                z25 = z13;
                                z26 = z14;
                                interfaceC4339a3 = interfaceC4339a;
                                z27 = z15;
                                textResource3 = textResource;
                            }
                            c28655q.m87175r();
                            final float f14 = 215 * f13;
                            c28655q = c28655q;
                            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC40153l.m128740E(z27, z25, z26, f14, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                                }
                            }), c28655q, 56);
                            textResource2 = textResource3;
                            j14 = j15;
                            z17 = z25;
                            z18 = z26;
                            str2 = str4;
                            interfaceC4339a2 = interfaceC4339a3;
                            z19 = z27;
                        } else {
                            c28655q.m87138X();
                            str2 = str;
                            z17 = z13;
                            textResource2 = textResource;
                            z18 = z14;
                            interfaceC4339a2 = interfaceC4339a;
                            z19 = z15;
                            j14 = j13;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i38 = i36 | 24576;
                    i39 = i15 & 32768;
                    if (i39 != 0) {
                        i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i26 = 131072;
                        }
                        i38 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z16)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i55 == 0) {
                            }
                            if ((i15 & 128) != 0) {
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                            } else {
                                jM125382b1 = j13;
                            }
                            if (i28 != 0) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (i34 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            j15 = jM125382b1;
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = textResource;
                            }
                            if (i37 == 0) {
                            }
                            if (i39 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == C28635l.f115821a) {
                                    objM87133R = new C39681c(25);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            str4 = str3;
                            z25 = z24;
                            z26 = z29;
                            z27 = z28;
                            textResource3 = textResourceM21267a;
                        } else {
                            if (i55 == 0) {
                            }
                            if ((i15 & 128) != 0) {
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                            } else {
                                jM125382b1 = j13;
                            }
                            if (i28 != 0) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (i34 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            j15 = jM125382b1;
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = textResource;
                            }
                            if (i37 == 0) {
                            }
                            if (i39 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == C28635l.f115821a) {
                                    objM87133R = new C39681c(25);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            str4 = str3;
                            z25 = z24;
                            z26 = z29;
                            z27 = z28;
                            textResource3 = textResourceM21267a;
                        }
                        c28655q.m87175r();
                        final float f15 = 215 * f13;
                        c28655q = c28655q;
                        AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128740E(z27, z25, z26, f15, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                            }
                        }), c28655q, 56);
                        textResource2 = textResource3;
                        j14 = j15;
                        z17 = z25;
                        z18 = z26;
                        str2 = str4;
                        interfaceC4339a2 = interfaceC4339a3;
                        z19 = z27;
                    } else {
                        c28655q.m87138X();
                        str2 = str;
                        z17 = z13;
                        textResource2 = textResource;
                        z18 = z14;
                        interfaceC4339a2 = interfaceC4339a;
                        z19 = z15;
                        j14 = j13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i35 = i29 | 384;
                if ((i14 & 3072) != 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        i18 = 2048;
                    }
                    i35 |= i18;
                }
                i36 = i35;
                i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i37 != 0) {
                    i38 = i36;
                    if ((i14 & 24576) == 0) {
                        if (!c28655q.m87155h(z14)) {
                            i24 = 8192;
                        }
                        i38 |= i24;
                    }
                    i39 = i15 & 32768;
                    if (i39 != 0) {
                        i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i26 = 131072;
                        }
                        i38 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z16)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i55 == 0) {
                            }
                            if ((i15 & 128) != 0) {
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                            } else {
                                jM125382b1 = j13;
                            }
                            if (i28 != 0) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (i34 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            j15 = jM125382b1;
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = textResource;
                            }
                            if (i37 == 0) {
                            }
                            if (i39 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == C28635l.f115821a) {
                                    objM87133R = new C39681c(25);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            str4 = str3;
                            z25 = z24;
                            z26 = z29;
                            z27 = z28;
                            textResource3 = textResourceM21267a;
                        } else {
                            if (i55 == 0) {
                            }
                            if ((i15 & 128) != 0) {
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                            } else {
                                jM125382b1 = j13;
                            }
                            if (i28 != 0) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (i34 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            j15 = jM125382b1;
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = textResource;
                            }
                            if (i37 == 0) {
                            }
                            if (i39 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == C28635l.f115821a) {
                                    objM87133R = new C39681c(25);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            str4 = str3;
                            z25 = z24;
                            z26 = z29;
                            z27 = z28;
                            textResource3 = textResourceM21267a;
                        }
                        c28655q.m87175r();
                        final float f16 = 215 * f13;
                        c28655q = c28655q;
                        AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128740E(z27, z25, z26, f16, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                            }
                        }), c28655q, 56);
                        textResource2 = textResource3;
                        j14 = j15;
                        z17 = z25;
                        z18 = z26;
                        str2 = str4;
                        interfaceC4339a2 = interfaceC4339a3;
                        z19 = z27;
                    } else {
                        c28655q.m87138X();
                        str2 = str;
                        z17 = z13;
                        textResource2 = textResource;
                        z18 = z14;
                        interfaceC4339a2 = interfaceC4339a;
                        z19 = z15;
                        j14 = j13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i38 = i36 | 24576;
                i39 = i15 & 32768;
                if (i39 != 0) {
                    i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i26 = 131072;
                    }
                    i38 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    } else {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    }
                    c28655q.m87175r();
                    final float f17 = 215 * f13;
                    c28655q = c28655q;
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128740E(z27, z25, z26, f17, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 56);
                    textResource2 = textResource3;
                    j14 = j15;
                    z17 = z25;
                    z18 = z26;
                    str2 = str4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z19 = z27;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    z17 = z13;
                    textResource2 = textResource;
                    z18 = z14;
                    interfaceC4339a2 = interfaceC4339a;
                    z19 = z15;
                    j14 = j13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i27 |= 48;
            i29 = i27;
            i34 = i15 & 4096;
            if (i34 != 0) {
                i35 = i29;
                if ((i14 & 384) == 0) {
                    i35 |= c28655q.m87155h(z13) ? 256 : 128;
                }
                if ((i14 & 3072) != 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        i18 = 2048;
                    }
                    i35 |= i18;
                }
                i36 = i35;
                i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i37 != 0) {
                    i38 = i36;
                    if ((i14 & 24576) == 0) {
                        if (!c28655q.m87155h(z14)) {
                            i24 = 8192;
                        }
                        i38 |= i24;
                    }
                    i39 = i15 & 32768;
                    if (i39 != 0) {
                        i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i26 = 131072;
                        }
                        i38 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z16)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i55 == 0) {
                            }
                            if ((i15 & 128) != 0) {
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                            } else {
                                jM125382b1 = j13;
                            }
                            if (i28 != 0) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (i34 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            j15 = jM125382b1;
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = textResource;
                            }
                            if (i37 == 0) {
                            }
                            if (i39 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == C28635l.f115821a) {
                                    objM87133R = new C39681c(25);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            str4 = str3;
                            z25 = z24;
                            z26 = z29;
                            z27 = z28;
                            textResource3 = textResourceM21267a;
                        } else {
                            if (i55 == 0) {
                            }
                            if ((i15 & 128) != 0) {
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                            } else {
                                jM125382b1 = j13;
                            }
                            if (i28 != 0) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (i34 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            j15 = jM125382b1;
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = textResource;
                            }
                            if (i37 == 0) {
                            }
                            if (i39 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == C28635l.f115821a) {
                                    objM87133R = new C39681c(25);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            str4 = str3;
                            z25 = z24;
                            z26 = z29;
                            z27 = z28;
                            textResource3 = textResourceM21267a;
                        }
                        c28655q.m87175r();
                        final float f18 = 215 * f13;
                        c28655q = c28655q;
                        AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128740E(z27, z25, z26, f18, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                            }
                        }), c28655q, 56);
                        textResource2 = textResource3;
                        j14 = j15;
                        z17 = z25;
                        z18 = z26;
                        str2 = str4;
                        interfaceC4339a2 = interfaceC4339a3;
                        z19 = z27;
                    } else {
                        c28655q.m87138X();
                        str2 = str;
                        z17 = z13;
                        textResource2 = textResource;
                        z18 = z14;
                        interfaceC4339a2 = interfaceC4339a;
                        z19 = z15;
                        j14 = j13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i38 = i36 | 24576;
                i39 = i15 & 32768;
                if (i39 != 0) {
                    i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i26 = 131072;
                    }
                    i38 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    } else {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    }
                    c28655q.m87175r();
                    final float f19 = 215 * f13;
                    c28655q = c28655q;
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128740E(z27, z25, z26, f19, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 56);
                    textResource2 = textResource3;
                    j14 = j15;
                    z17 = z25;
                    z18 = z26;
                    str2 = str4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z19 = z27;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    z17 = z13;
                    textResource2 = textResource;
                    z18 = z14;
                    interfaceC4339a2 = interfaceC4339a;
                    z19 = z15;
                    j14 = j13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i35 = i29 | 384;
            if ((i14 & 3072) != 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    i18 = 2048;
                }
                i35 |= i18;
            }
            i36 = i35;
            i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i37 != 0) {
                i38 = i36;
                if ((i14 & 24576) == 0) {
                    if (!c28655q.m87155h(z14)) {
                        i24 = 8192;
                    }
                    i38 |= i24;
                }
                i39 = i15 & 32768;
                if (i39 != 0) {
                    i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i26 = 131072;
                    }
                    i38 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    } else {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    }
                    c28655q.m87175r();
                    final float f110 = 215 * f13;
                    c28655q = c28655q;
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128740E(z27, z25, z26, f110, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 56);
                    textResource2 = textResource3;
                    j14 = j15;
                    z17 = z25;
                    z18 = z26;
                    str2 = str4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z19 = z27;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    z17 = z13;
                    textResource2 = textResource;
                    z18 = z14;
                    interfaceC4339a2 = interfaceC4339a;
                    z19 = z15;
                    j14 = j13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i38 = i36 | 24576;
            i39 = i15 & 32768;
            if (i39 != 0) {
                i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i26 = 131072;
                }
                i38 |= i26;
            }
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i55 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    } else {
                        jM125382b1 = j13;
                    }
                    if (i28 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i34 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    j15 = jM125382b1;
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = textResource;
                    }
                    if (i37 == 0) {
                    }
                    if (i39 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C39681c(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    str4 = str3;
                    z25 = z24;
                    z26 = z29;
                    z27 = z28;
                    textResource3 = textResourceM21267a;
                } else {
                    if (i55 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    } else {
                        jM125382b1 = j13;
                    }
                    if (i28 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i34 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    j15 = jM125382b1;
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = textResource;
                    }
                    if (i37 == 0) {
                    }
                    if (i39 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C39681c(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    str4 = str3;
                    z25 = z24;
                    z26 = z29;
                    z27 = z28;
                    textResource3 = textResourceM21267a;
                }
                c28655q.m87175r();
                final float f111 = 215 * f13;
                c28655q = c28655q;
                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128740E(z27, z25, z26, f111, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                    }
                }), c28655q, 56);
                textResource2 = textResource3;
                j14 = j15;
                z17 = z25;
                z18 = z26;
                str2 = str4;
                interfaceC4339a2 = interfaceC4339a3;
                z19 = z27;
            } else {
                c28655q.m87138X();
                str2 = str;
                z17 = z13;
                textResource2 = textResource;
                z18 = z14;
                interfaceC4339a2 = interfaceC4339a;
                z19 = z15;
                j14 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 384;
        z15 = z4;
        i17 = i13 & 3072;
        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i17 == 0) {
            if (c28655q.m87147d(f13)) {
                i54 = 2048;
            } else {
                i54 = 1024;
            }
            i16 |= i54;
        }
        i19 = i13 & 24576;
        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
        if (i19 == 0) {
            if (c28655q.m87153g(metric)) {
                i49 = 16384;
            } else {
                i49 = 8192;
            }
            i16 |= i49;
        }
        i25 = i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i25 == 0) {
            if (c28655q.m87153g(title)) {
                i48 = 131072;
            } else {
                i48 = 65536;
            }
            i16 |= i48;
        }
        if ((i13 & 1572864) != 0) {
            if (c28655q.m87151f(j7)) {
                i47 = 1048576;
            } else {
                i47 = 524288;
            }
            i16 |= i47;
        }
        if ((i13 & 12582912) != 0) {
            i16 |= ((i15 & 128) == 0 || !c28655q.m87151f(j13)) ? 4194304 : 8388608;
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q.m87153g(subtitle)) {
                i46 = 67108864;
            } else {
                i46 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i46;
        }
        if ((i13 & 805306368) == 0) {
            if (c28655q.m87153g(startValue)) {
                i45 = 536870912;
            } else {
                i45 = 268435456;
            }
            i16 |= i45;
        }
        if ((i14 & 6) == 0) {
            if (c28655q.m87153g(endValue)) {
                i44 = 4;
            } else {
                i44 = 2;
            }
            i27 = i14 | i44;
        } else {
            i27 = i14;
        }
        i28 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i28 != 0) {
            if ((i14 & 48) == 0) {
                i27 |= c28655q.m87153g(str) ? 32 : 16;
            }
            i29 = i27;
            i34 = i15 & 4096;
            if (i34 != 0) {
                i35 = i29;
                if ((i14 & 384) == 0) {
                    i35 |= c28655q.m87155h(z13) ? 256 : 128;
                }
                if ((i14 & 3072) != 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        i18 = 2048;
                    }
                    i35 |= i18;
                }
                i36 = i35;
                i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i37 != 0) {
                    i38 = i36;
                    if ((i14 & 24576) == 0) {
                        if (!c28655q.m87155h(z14)) {
                            i24 = 8192;
                        }
                        i38 |= i24;
                    }
                    i39 = i15 & 32768;
                    if (i39 != 0) {
                        i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i26 = 131072;
                        }
                        i38 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z16)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i55 == 0) {
                            }
                            if ((i15 & 128) != 0) {
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                            } else {
                                jM125382b1 = j13;
                            }
                            if (i28 != 0) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (i34 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            j15 = jM125382b1;
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = textResource;
                            }
                            if (i37 == 0) {
                            }
                            if (i39 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == C28635l.f115821a) {
                                    objM87133R = new C39681c(25);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            str4 = str3;
                            z25 = z24;
                            z26 = z29;
                            z27 = z28;
                            textResource3 = textResourceM21267a;
                        } else {
                            if (i55 == 0) {
                            }
                            if ((i15 & 128) != 0) {
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                            } else {
                                jM125382b1 = j13;
                            }
                            if (i28 != 0) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (i34 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            j15 = jM125382b1;
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = textResource;
                            }
                            if (i37 == 0) {
                            }
                            if (i39 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == C28635l.f115821a) {
                                    objM87133R = new C39681c(25);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            str4 = str3;
                            z25 = z24;
                            z26 = z29;
                            z27 = z28;
                            textResource3 = textResourceM21267a;
                        }
                        c28655q.m87175r();
                        final float f112 = 215 * f13;
                        c28655q = c28655q;
                        AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128740E(z27, z25, z26, f112, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                            }
                        }), c28655q, 56);
                        textResource2 = textResource3;
                        j14 = j15;
                        z17 = z25;
                        z18 = z26;
                        str2 = str4;
                        interfaceC4339a2 = interfaceC4339a3;
                        z19 = z27;
                    } else {
                        c28655q.m87138X();
                        str2 = str;
                        z17 = z13;
                        textResource2 = textResource;
                        z18 = z14;
                        interfaceC4339a2 = interfaceC4339a;
                        z19 = z15;
                        j14 = j13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i38 = i36 | 24576;
                i39 = i15 & 32768;
                if (i39 != 0) {
                    i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i26 = 131072;
                    }
                    i38 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    } else {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    }
                    c28655q.m87175r();
                    final float f113 = 215 * f13;
                    c28655q = c28655q;
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128740E(z27, z25, z26, f113, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 56);
                    textResource2 = textResource3;
                    j14 = j15;
                    z17 = z25;
                    z18 = z26;
                    str2 = str4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z19 = z27;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    z17 = z13;
                    textResource2 = textResource;
                    z18 = z14;
                    interfaceC4339a2 = interfaceC4339a;
                    z19 = z15;
                    j14 = j13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i35 = i29 | 384;
            if ((i14 & 3072) != 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    i18 = 2048;
                }
                i35 |= i18;
            }
            i36 = i35;
            i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i37 != 0) {
                i38 = i36;
                if ((i14 & 24576) == 0) {
                    if (!c28655q.m87155h(z14)) {
                        i24 = 8192;
                    }
                    i38 |= i24;
                }
                i39 = i15 & 32768;
                if (i39 != 0) {
                    i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i26 = 131072;
                    }
                    i38 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    } else {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    }
                    c28655q.m87175r();
                    final float f114 = 215 * f13;
                    c28655q = c28655q;
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128740E(z27, z25, z26, f114, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 56);
                    textResource2 = textResource3;
                    j14 = j15;
                    z17 = z25;
                    z18 = z26;
                    str2 = str4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z19 = z27;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    z17 = z13;
                    textResource2 = textResource;
                    z18 = z14;
                    interfaceC4339a2 = interfaceC4339a;
                    z19 = z15;
                    j14 = j13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i38 = i36 | 24576;
            i39 = i15 & 32768;
            if (i39 != 0) {
                i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i26 = 131072;
                }
                i38 |= i26;
            }
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i55 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    } else {
                        jM125382b1 = j13;
                    }
                    if (i28 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i34 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    j15 = jM125382b1;
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = textResource;
                    }
                    if (i37 == 0) {
                    }
                    if (i39 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C39681c(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    str4 = str3;
                    z25 = z24;
                    z26 = z29;
                    z27 = z28;
                    textResource3 = textResourceM21267a;
                } else {
                    if (i55 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    } else {
                        jM125382b1 = j13;
                    }
                    if (i28 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i34 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    j15 = jM125382b1;
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = textResource;
                    }
                    if (i37 == 0) {
                    }
                    if (i39 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C39681c(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    str4 = str3;
                    z25 = z24;
                    z26 = z29;
                    z27 = z28;
                    textResource3 = textResourceM21267a;
                }
                c28655q.m87175r();
                final float f115 = 215 * f13;
                c28655q = c28655q;
                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128740E(z27, z25, z26, f115, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                    }
                }), c28655q, 56);
                textResource2 = textResource3;
                j14 = j15;
                z17 = z25;
                z18 = z26;
                str2 = str4;
                interfaceC4339a2 = interfaceC4339a3;
                z19 = z27;
            } else {
                c28655q.m87138X();
                str2 = str;
                z17 = z13;
                textResource2 = textResource;
                z18 = z14;
                interfaceC4339a2 = interfaceC4339a;
                z19 = z15;
                j14 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i27 |= 48;
        i29 = i27;
        i34 = i15 & 4096;
        if (i34 != 0) {
            i35 = i29;
            if ((i14 & 384) == 0) {
                i35 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i14 & 3072) != 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    i18 = 2048;
                }
                i35 |= i18;
            }
            i36 = i35;
            i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i37 != 0) {
                i38 = i36;
                if ((i14 & 24576) == 0) {
                    if (!c28655q.m87155h(z14)) {
                        i24 = 8192;
                    }
                    i38 |= i24;
                }
                i39 = i15 & 32768;
                if (i39 != 0) {
                    i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i26 = 131072;
                    }
                    i38 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    } else {
                        if (i55 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        } else {
                            jM125382b1 = j13;
                        }
                        if (i28 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i34 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        j15 = jM125382b1;
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = textResource;
                        }
                        if (i37 == 0) {
                        }
                        if (i39 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C39681c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        str4 = str3;
                        z25 = z24;
                        z26 = z29;
                        z27 = z28;
                        textResource3 = textResourceM21267a;
                    }
                    c28655q.m87175r();
                    final float f116 = 215 * f13;
                    c28655q = c28655q;
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128740E(z27, z25, z26, f116, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 56);
                    textResource2 = textResource3;
                    j14 = j15;
                    z17 = z25;
                    z18 = z26;
                    str2 = str4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z19 = z27;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    z17 = z13;
                    textResource2 = textResource;
                    z18 = z14;
                    interfaceC4339a2 = interfaceC4339a;
                    z19 = z15;
                    j14 = j13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i38 = i36 | 24576;
            i39 = i15 & 32768;
            if (i39 != 0) {
                i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i26 = 131072;
                }
                i38 |= i26;
            }
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i55 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    } else {
                        jM125382b1 = j13;
                    }
                    if (i28 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i34 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    j15 = jM125382b1;
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = textResource;
                    }
                    if (i37 == 0) {
                    }
                    if (i39 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C39681c(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    str4 = str3;
                    z25 = z24;
                    z26 = z29;
                    z27 = z28;
                    textResource3 = textResourceM21267a;
                } else {
                    if (i55 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    } else {
                        jM125382b1 = j13;
                    }
                    if (i28 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i34 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    j15 = jM125382b1;
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = textResource;
                    }
                    if (i37 == 0) {
                    }
                    if (i39 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C39681c(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    str4 = str3;
                    z25 = z24;
                    z26 = z29;
                    z27 = z28;
                    textResource3 = textResourceM21267a;
                }
                c28655q.m87175r();
                final float f117 = 215 * f13;
                c28655q = c28655q;
                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128740E(z27, z25, z26, f117, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                    }
                }), c28655q, 56);
                textResource2 = textResource3;
                j14 = j15;
                z17 = z25;
                z18 = z26;
                str2 = str4;
                interfaceC4339a2 = interfaceC4339a3;
                z19 = z27;
            } else {
                c28655q.m87138X();
                str2 = str;
                z17 = z13;
                textResource2 = textResource;
                z18 = z14;
                interfaceC4339a2 = interfaceC4339a;
                z19 = z15;
                j14 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i35 = i29 | 384;
        if ((i14 & 3072) != 0) {
            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                i18 = 2048;
            }
            i35 |= i18;
        }
        i36 = i35;
        i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i37 != 0) {
            i38 = i36;
            if ((i14 & 24576) == 0) {
                if (!c28655q.m87155h(z14)) {
                    i24 = 8192;
                }
                i38 |= i24;
            }
            i39 = i15 & 32768;
            if (i39 != 0) {
                i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i26 = 131072;
                }
                i38 |= i26;
            }
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i55 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    } else {
                        jM125382b1 = j13;
                    }
                    if (i28 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i34 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    j15 = jM125382b1;
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = textResource;
                    }
                    if (i37 == 0) {
                    }
                    if (i39 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C39681c(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    str4 = str3;
                    z25 = z24;
                    z26 = z29;
                    z27 = z28;
                    textResource3 = textResourceM21267a;
                } else {
                    if (i55 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    } else {
                        jM125382b1 = j13;
                    }
                    if (i28 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i34 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    j15 = jM125382b1;
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = textResource;
                    }
                    if (i37 == 0) {
                    }
                    if (i39 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C39681c(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    str4 = str3;
                    z25 = z24;
                    z26 = z29;
                    z27 = z28;
                    textResource3 = textResourceM21267a;
                }
                c28655q.m87175r();
                final float f118 = 215 * f13;
                c28655q = c28655q;
                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128740E(z27, z25, z26, f118, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                    }
                }), c28655q, 56);
                textResource2 = textResource3;
                j14 = j15;
                z17 = z25;
                z18 = z26;
                str2 = str4;
                interfaceC4339a2 = interfaceC4339a3;
                z19 = z27;
            } else {
                c28655q.m87138X();
                str2 = str;
                z17 = z13;
                textResource2 = textResource;
                z18 = z14;
                interfaceC4339a2 = interfaceC4339a;
                z19 = z15;
                j14 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i38 = i36 | 24576;
        i39 = i15 & 32768;
        if (i39 != 0) {
            i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87157i(interfaceC4339a)) {
                i26 = 131072;
            }
            i38 |= i26;
        }
        if ((i16 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q.m87135U(i16 & 1, z16)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i55 == 0) {
                }
                if ((i15 & 128) != 0) {
                    jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                } else {
                    jM125382b1 = j13;
                }
                if (i28 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i34 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                j15 = jM125382b1;
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = textResource;
                }
                if (i37 == 0) {
                }
                if (i39 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C39681c(25);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                str4 = str3;
                z25 = z24;
                z26 = z29;
                z27 = z28;
                textResource3 = textResourceM21267a;
            } else {
                if (i55 == 0) {
                }
                if ((i15 & 128) != 0) {
                    jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                } else {
                    jM125382b1 = j13;
                }
                if (i28 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i34 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                j15 = jM125382b1;
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = textResource;
                }
                if (i37 == 0) {
                }
                if (i39 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C39681c(25);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                str4 = str3;
                z25 = z24;
                z26 = z29;
                z27 = z28;
                textResource3 = textResourceM21267a;
            }
            c28655q.m87175r();
            final float f119 = 215 * f13;
            c28655q = c28655q;
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(193696819, c28655q, new InterfaceC4351m() { // from class: z71.g
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC40153l.m128740E(z27, z25, z26, f119, str4, interfaceC4339a3, border, overlay, textResource3, metric, title, subtitle, j7, j15, startValue, endValue, (Composer) obj, iIntValue);
                }
            }), c28655q, 56);
            textResource2 = textResource3;
            j14 = j15;
            z17 = z25;
            z18 = z26;
            str2 = str4;
            interfaceC4339a2 = interfaceC4339a3;
            z19 = z27;
        } else {
            c28655q.m87138X();
            str2 = str;
            z17 = z13;
            textResource2 = textResource;
            z18 = z14;
            interfaceC4339a2 = interfaceC4339a;
            z19 = z15;
            j14 = j13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.h
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC40153l.m128741F(border, overlay, z19, f13, metric, title, j7, j14, subtitle, startValue, endValue, str2, z17, textResource2, z18, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m128756o(Modifier modifier, AbstractC18247a border, AbstractC18247a overlay, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(border, "border");
        AbstractC22676k.m65750j(overlay, "overlay");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1255185678);
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
            i15 |= c28655q.m87153g(border) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(overlay) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(AbstractC40145d.m128726a());
            float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(AbstractC40145d.m128731f());
            float fMo743q2 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(AbstractC40145d.m128730e());
            AbstractC18254h abstractC18254hM52584a = AbstractC18255i.m52584a(overlay, c28655q, (i15 >> 6) & 14);
            AbstractC18254h abstractC18254hM52584a2 = AbstractC18255i.m52584a(border, c28655q, (i15 >> 3) & 14);
            Modifier modifierM3419p = AbstractC1102d.m3419p(AbstractC40145d.m128730e(), modifier3);
            boolean zM87147d = c28655q.m87147d(fMo743q1) | c28655q.m87153g(abstractC18254hM52584a) | c28655q.m87147d(fMo743q2) | c28655q.m87153g(abstractC18254hM52584a2) | c28655q.m87147d(fMo743q0);
            Object objM87133R = c28655q.m87133R();
            if (zM87147d || objM87133R == C28635l.f115821a) {
                C12819b0 c12819b0 = new C12819b0(fMo743q1, abstractC18254hM52584a, fMo743q2, abstractC18254hM52584a2, fMo743q0);
                c28655q.m87172p0(c12819b0);
                objM87133R = c12819b0;
            }
            AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(modifier3, border, overlay, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m128757p(float f13, AbstractC18254h abstractC18254h, float f14, AbstractC18254h abstractC18254h2, float f15, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jMo721B0 = Canvas.mo721B0();
        C0237p c0237pMo744t0 = Canvas.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(160.0f, jMo721B0);
            InterfaceC17910s0 interfaceC17910s0M128732a = AbstractC40146e.m128732a(Canvas, f13);
            C0237p c0237pMo744t1 = Canvas.mo744t0();
            long jM670A2 = c0237pMo744t1.m670A();
            c0237pMo744t1.m716w().mo51426q();
            try {
                ((C0929d) c0237pMo744t1.f812x).m2344b(interfaceC17910s0M128732a, 1);
                AbstractC40146e.m128735d(Canvas, abstractC18254h, f13, f14);
                AbstractC40146e.m128734c(Canvas, abstractC18254h2, f15, f14);
                c0237pMo744t1.m716w().mo51417g();
                c0237pMo744t1.m690U(jM670A2);
                AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                return C23454a0.f92919a;
            } catch (Throwable th3) {
                c0237pMo744t1.m716w().mo51417g();
                c0237pMo744t1.m690U(jM670A2);
                throw th3;
            }
        } catch (Throwable th4) {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m128758q(Modifier modifier, AbstractC18247a abstractC18247a, AbstractC18247a abstractC18247a2, int i13, int i14, Composer composer, int i15) {
        m128756o(modifier, abstractC18247a, abstractC18247a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m128759r(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(431641742);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float fM128730e = AbstractC40145d.m128730e();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(fM128730e, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
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
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getLocked(), c28655q, 6), null, null, c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 48, 4);
            AbstractC18489d0.m53380u(2, 8, c2314t, c28655q);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62237G), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH2(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m128760s(int i13, Composer composer, int i14) {
        m128759r(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x010f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x012b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0137  */
    /* JADX INFO: renamed from: t */
    public static final void m128761t(final float f13, float f14, AbstractC17911t abstractC17911t, int i13, Composer composer, final int i14, final int i15) {
        float f15;
        int i16;
        float f16;
        int i17;
        AbstractC17911t abstractC17911tM128718c;
        int i18;
        final int i19;
        boolean z4;
        final float f17;
        final AbstractC17911t abstractC17911t2;
        final int i24;
        C28677v1 c28677v1M87180u;
        float f18;
        final AbstractC17911t abstractC17911t3;
        final float fMo743q0;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zM87147d;
        Object objM87133R;
        final float f19;
        int i25;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1619580060);
        if ((i14 & 6) == 0) {
            f15 = f13;
            i16 = (c28655q.m87147d(f15) ? 4 : 2) | i14;
        } else {
            f15 = f13;
            i16 = i14;
        }
        int i26 = i15 & 2;
        if (i26 == 0) {
            if ((i14 & 48) == 0) {
                f16 = f14;
                i16 |= c28655q.m87147d(f16) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    abstractC17911tM128718c = abstractC17911t;
                    if (c28655q.m87153g(abstractC17911tM128718c)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) == 0) {
                    if ((i15 & 8) == 0) {
                        i19 = i13;
                        if (c28655q.m87149e(i19)) {
                            i25 = 2048;
                        }
                        i16 |= i25;
                    } else {
                        i19 = i13;
                    }
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    i16 |= i25;
                } else {
                    i19 = i13;
                }
                if ((i16 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0 || c28655q.m87118C()) {
                        if (i26 != 0) {
                            f18 = 5.0f;
                        } else {
                            f18 = f16;
                        }
                        if (i17 != 0) {
                            abstractC17911tM128718c = AbstractC40142a.m128718c();
                        }
                        if ((i15 & 8) != 0) {
                            i16 &= -7169;
                            i19 = 3;
                        }
                    } else {
                        c28655q.m87138X();
                        if ((i15 & 8) != 0) {
                            i16 &= -7169;
                        }
                        f18 = f16;
                    }
                    abstractC17911t3 = abstractC17911tM128718c;
                    c28655q.m87175r();
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(AbstractC40145d.m128727b());
                    Modifier modifierM3419p = AbstractC1102d.m3419p(AbstractC40145d.m128727b(), C2314t.f9131w);
                    if ((i16 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i16 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z16 = z14 | z13;
                    if ((i16 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87147d = z16 | z15 | c28655q.m87147d(fMo743q0) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87149e(i19)) || (i16 & 3072) == 2048);
                    objM87133R = c28655q.m87133R();
                    if (!zM87147d || objM87133R == C28635l.f115821a) {
                        final float f24 = f15;
                        f19 = f18;
                        Function1 function1 = new Function1() { // from class: z71.k
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128762u(abstractC17911t3, f24, f19, fMo743q0, i19, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function1);
                        objM87133R = function1;
                    } else {
                        f19 = f18;
                    }
                    AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R, c28655q, 6);
                    abstractC17911t2 = abstractC17911t3;
                    f17 = f19;
                } else {
                    c28655q.m87138X();
                    f17 = f16;
                    abstractC17911t2 = abstractC17911tM128718c;
                }
                i24 = i19;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128763v(f13, f17, abstractC17911t2, i24, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 384;
            abstractC17911tM128718c = abstractC17911t;
            if ((i14 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    i19 = i13;
                    if (c28655q.m87149e(i19)) {
                        i25 = 2048;
                    }
                    i16 |= i25;
                } else {
                    i19 = i13;
                }
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i16 |= i25;
            } else {
                i19 = i13;
            }
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        f18 = 5.0f;
                    } else {
                        f18 = f16;
                    }
                    if (i17 != 0) {
                        abstractC17911tM128718c = AbstractC40142a.m128718c();
                    }
                    if ((i15 & 8) != 0) {
                        i16 &= -7169;
                        i19 = 3;
                    }
                } else {
                    if (i26 != 0) {
                        f18 = 5.0f;
                    } else {
                        f18 = f16;
                    }
                    if (i17 != 0) {
                        abstractC17911tM128718c = AbstractC40142a.m128718c();
                    }
                    if ((i15 & 8) != 0) {
                        i16 &= -7169;
                        i19 = 3;
                    }
                }
                abstractC17911t3 = abstractC17911tM128718c;
                c28655q.m87175r();
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(AbstractC40145d.m128727b());
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(AbstractC40145d.m128727b(), C2314t.f9131w);
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i16 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z17 = z14 | z13;
                if ((i16 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87147d = z17 | z15 | c28655q.m87147d(fMo743q0) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87149e(i19)) || (i16 & 3072) == 2048);
                objM87133R = c28655q.m87133R();
                if (zM87147d) {
                    final float f25 = f15;
                    f19 = f18;
                    Function1 function2 = new Function1() { // from class: z71.k
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128762u(abstractC17911t3, f25, f19, fMo743q0, i19, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function2);
                    objM87133R = function2;
                } else {
                    final float f26 = f15;
                    f19 = f18;
                    Function1 function3 = new Function1() { // from class: z71.k
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128762u(abstractC17911t3, f26, f19, fMo743q0, i19, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function3);
                    objM87133R = function3;
                }
                AbstractC21478l0.m60421a(modifierM3419p2, (Function1) objM87133R, c28655q, 6);
                abstractC17911t2 = abstractC17911t3;
                f17 = f19;
            } else {
                c28655q.m87138X();
                f17 = f16;
                abstractC17911t2 = abstractC17911tM128718c;
            }
            i24 = i19;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128763v(f13, f17, abstractC17911t2, i24, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 48;
        f16 = f14;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                abstractC17911tM128718c = abstractC17911t;
                if (c28655q.m87153g(abstractC17911tM128718c)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    i19 = i13;
                    if (c28655q.m87149e(i19)) {
                        i25 = 2048;
                    }
                    i16 |= i25;
                } else {
                    i19 = i13;
                }
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i16 |= i25;
            } else {
                i19 = i13;
            }
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        f18 = 5.0f;
                    } else {
                        f18 = f16;
                    }
                    if (i17 != 0) {
                        abstractC17911tM128718c = AbstractC40142a.m128718c();
                    }
                    if ((i15 & 8) != 0) {
                        i16 &= -7169;
                        i19 = 3;
                    }
                } else {
                    if (i26 != 0) {
                        f18 = 5.0f;
                    } else {
                        f18 = f16;
                    }
                    if (i17 != 0) {
                        abstractC17911tM128718c = AbstractC40142a.m128718c();
                    }
                    if ((i15 & 8) != 0) {
                        i16 &= -7169;
                        i19 = 3;
                    }
                }
                abstractC17911t3 = abstractC17911tM128718c;
                c28655q.m87175r();
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(AbstractC40145d.m128727b());
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(AbstractC40145d.m128727b(), C2314t.f9131w);
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i16 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z18 = z14 | z13;
                if ((i16 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87147d = z18 | z15 | c28655q.m87147d(fMo743q0) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87149e(i19)) || (i16 & 3072) == 2048);
                objM87133R = c28655q.m87133R();
                if (zM87147d) {
                    final float f27 = f15;
                    f19 = f18;
                    Function1 function4 = new Function1() { // from class: z71.k
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128762u(abstractC17911t3, f27, f19, fMo743q0, i19, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function4);
                    objM87133R = function4;
                } else {
                    final float f28 = f15;
                    f19 = f18;
                    Function1 function5 = new Function1() { // from class: z71.k
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128762u(abstractC17911t3, f28, f19, fMo743q0, i19, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function5);
                    objM87133R = function5;
                }
                AbstractC21478l0.m60421a(modifierM3419p3, (Function1) objM87133R, c28655q, 6);
                abstractC17911t2 = abstractC17911t3;
                f17 = f19;
            } else {
                c28655q.m87138X();
                f17 = f16;
                abstractC17911t2 = abstractC17911tM128718c;
            }
            i24 = i19;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128763v(f13, f17, abstractC17911t2, i24, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 384;
        abstractC17911tM128718c = abstractC17911t;
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                i19 = i13;
                if (c28655q.m87149e(i19)) {
                    i25 = 2048;
                }
                i16 |= i25;
            } else {
                i19 = i13;
            }
            i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i16 |= i25;
        } else {
            i19 = i13;
        }
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28655q.m87140Z();
            if ((i14 & 1) != 0) {
                if (i26 != 0) {
                    f18 = 5.0f;
                } else {
                    f18 = f16;
                }
                if (i17 != 0) {
                    abstractC17911tM128718c = AbstractC40142a.m128718c();
                }
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                    i19 = 3;
                }
            } else {
                if (i26 != 0) {
                    f18 = 5.0f;
                } else {
                    f18 = f16;
                }
                if (i17 != 0) {
                    abstractC17911tM128718c = AbstractC40142a.m128718c();
                }
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                    i19 = 3;
                }
            }
            abstractC17911t3 = abstractC17911tM128718c;
            c28655q.m87175r();
            fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(AbstractC40145d.m128727b());
            Modifier modifierM3419p4 = AbstractC1102d.m3419p(AbstractC40145d.m128727b(), C2314t.f9131w);
            if ((i16 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i16 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z19 = z14 | z13;
            if ((i16 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87147d = z19 | z15 | c28655q.m87147d(fMo743q0) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87149e(i19)) || (i16 & 3072) == 2048);
            objM87133R = c28655q.m87133R();
            if (zM87147d) {
                final float f29 = f15;
                f19 = f18;
                Function1 function6 = new Function1() { // from class: z71.k
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC40153l.m128762u(abstractC17911t3, f29, f19, fMo743q0, i19, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function6);
                objM87133R = function6;
            } else {
                final float f210 = f15;
                f19 = f18;
                Function1 function7 = new Function1() { // from class: z71.k
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC40153l.m128762u(abstractC17911t3, f210, f19, fMo743q0, i19, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function7);
                objM87133R = function7;
            }
            AbstractC21478l0.m60421a(modifierM3419p4, (Function1) objM87133R, c28655q, 6);
            abstractC17911t2 = abstractC17911t3;
            f17 = f19;
        } else {
            c28655q.m87138X();
            f17 = f16;
            abstractC17911t2 = abstractC17911tM128718c;
        }
        i24 = i19;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC40153l.m128763v(f13, f17, abstractC17911t2, i24, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m128762u(AbstractC17911t abstractC17911t, float f13, float f14, float f15, int i13, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jMo721B0 = Canvas.mo721B0();
        C0237p c0237pMo744t0 = Canvas.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(160.0f, jMo721B0);
            InterfaceC22131e.m63381X(Canvas, abstractC17911t, f13, f14, true, 0L, (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), null, i13, 464);
            return C23454a0.f92919a;
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m128763v(float f13, float f14, AbstractC17911t abstractC17911t, int i13, int i14, int i15, Composer composer, int i16) {
        m128761t(f13, f14, abstractC17911t, i13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0175  */
    /* JADX WARN: Code duplicated, block: B:104:0x0178  */
    /* JADX WARN: Code duplicated, block: B:107:0x0184  */
    /* JADX WARN: Code duplicated, block: B:109:0x018a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0198  */
    /* JADX WARN: Code duplicated, block: B:118:0x019f  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x015e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0161  */
    /* JADX WARN: Code duplicated, block: B:99:0x0169  */
    /* JADX INFO: renamed from: w */
    public static final void m128764w(final float f13, float f14, float f15, float f16, AbstractC17911t abstractC17911t, int i13, Composer composer, final int i14, final int i15) {
        int i16;
        float f17;
        int i17;
        float f18;
        int i18;
        int i19;
        float f19;
        int i24;
        int i25;
        AbstractC17911t abstractC17911tM51486d;
        int i26;
        final int i27;
        boolean z4;
        final float fM128729d;
        final float fM128728c;
        final float f24;
        final AbstractC17911t abstractC17911t2;
        final int i28;
        C28677v1 c28677v1M87180u;
        int i29;
        AbstractC17911t abstractC17911t3;
        final float f25;
        final float fMo743q0;
        final float fMo743q1;
        final float f26;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        final AbstractC17911t abstractC17911t4;
        int i34;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2067465886);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87147d(f13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i35 = i15 & 2;
        if (i35 == 0) {
            if ((i14 & 48) == 0) {
                f17 = f14;
                i16 |= c28655q.m87147d(f17) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    f18 = f15;
                    if (c28655q.m87147d(f18)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 8;
                if (i19 != 0) {
                    if ((i14 & 3072) == 0) {
                        f19 = f16;
                        if (c28655q.m87147d(f19)) {
                            i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 16;
                    if (i25 != 0) {
                        if ((i14 & 24576) == 0) {
                            abstractC17911tM51486d = abstractC17911t;
                            if (c28655q.m87153g(abstractC17911tM51486d)) {
                                i26 = 16384;
                            } else {
                                i26 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i16 |= i26;
                        }
                        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            i27 = i13;
                            if ((i15 & 32) == 0 || !c28655q.m87149e(i27)) {
                                i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            } else {
                                i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            }
                            i16 |= i34;
                        } else {
                            i27 = i13;
                        }
                        if ((i16 & 74899) != 74898) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i16 & 1, z4)) {
                            c28655q.m87140Z();
                            if ((i14 & 1) != 0 || c28655q.m87118C()) {
                                if (i35 != 0) {
                                    fM128729d = AbstractC40145d.m128729d();
                                } else {
                                    fM128729d = f17;
                                }
                                if (i17 != 0) {
                                    fM128728c = AbstractC40145d.m128728c();
                                } else {
                                    fM128728c = f18;
                                }
                                if (i19 != 0) {
                                    f19 = 5.0f;
                                }
                                if (i25 != 0) {
                                    C17909s c17909s = AbstractC17911t.f69612b;
                                    long j7 = C17919x.f69629f;
                                    abstractC17911tM51486d = C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(j7)), 0L, 0L, 14);
                                }
                                if ((i15 & 32) != 0) {
                                    i16 &= -458753;
                                    i27 = 3;
                                }
                            } else {
                                c28655q.m87138X();
                                if ((i15 & 32) != 0) {
                                    i16 &= -458753;
                                }
                                fM128729d = f17;
                                fM128728c = f18;
                            }
                            i29 = i16;
                            abstractC17911t3 = abstractC17911tM51486d;
                            f25 = f19;
                            c28655q.m87175r();
                            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
                            fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(fM128729d);
                            fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(fM128728c) - fMo743q0;
                            f26 = fMo743q0 / 2.0f;
                            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                            boolean zM87147d = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                            if ((57344 & i29) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z17 = zM87147d | z13;
                            if ((i29 & 14) == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z18 = z17 | z14;
                            if ((i29 & 7168) == 2048) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z18 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                            objM87133R = c28655q.m87133R();
                            if (!z16 || objM87133R == C28635l.f115821a) {
                                abstractC17911t4 = abstractC17911t3;
                                Function1 function1 = new Function1() { // from class: z71.i
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                                    }
                                };
                                c28655q.m87172p0(function1);
                                objM87133R = function1;
                            } else {
                                abstractC17911t4 = abstractC17911t3;
                            }
                            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R, c28655q, 6);
                            abstractC17911t2 = abstractC17911t4;
                            f24 = f25;
                        } else {
                            c28655q.m87138X();
                            fM128729d = f17;
                            fM128728c = f18;
                            f24 = f19;
                            abstractC17911t2 = abstractC17911tM51486d;
                        }
                        i28 = i27;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 24576;
                    abstractC17911tM51486d = abstractC17911t;
                    if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        i27 = i13;
                        if ((i15 & 32) == 0) {
                            i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        } else {
                            i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i16 |= i34;
                    } else {
                        i27 = i13;
                    }
                    if ((i16 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z4)) {
                        c28655q.m87140Z();
                        if ((i14 & 1) != 0) {
                            if (i35 != 0) {
                                fM128729d = AbstractC40145d.m128729d();
                            } else {
                                fM128729d = f17;
                            }
                            if (i17 != 0) {
                                fM128728c = AbstractC40145d.m128728c();
                            } else {
                                fM128728c = f18;
                            }
                            if (i19 != 0) {
                                f19 = 5.0f;
                            }
                            if (i25 != 0) {
                                C17909s c17909s2 = AbstractC17911t.f69612b;
                                long j13 = C17919x.f69629f;
                                abstractC17911tM51486d = C17909s.m51486d(c17909s2, AbstractC37056f.m118959K(new C17919x(j13), new C17919x(j13)), 0L, 0L, 14);
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i27 = 3;
                            }
                        } else {
                            if (i35 != 0) {
                                fM128729d = AbstractC40145d.m128729d();
                            } else {
                                fM128729d = f17;
                            }
                            if (i17 != 0) {
                                fM128728c = AbstractC40145d.m128728c();
                            } else {
                                fM128728c = f18;
                            }
                            if (i19 != 0) {
                                f19 = 5.0f;
                            }
                            if (i25 != 0) {
                                C17909s c17909s3 = AbstractC17911t.f69612b;
                                long j14 = C17919x.f69629f;
                                abstractC17911tM51486d = C17909s.m51486d(c17909s3, AbstractC37056f.m118959K(new C17919x(j14), new C17919x(j14)), 0L, 0L, 14);
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i27 = 3;
                            }
                        }
                        i29 = i16;
                        abstractC17911t3 = abstractC17911tM51486d;
                        f25 = f19;
                        c28655q.m87175r();
                        C28674u2 c28674u3 = AbstractC2453v1.f9569h;
                        fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u3)).mo743q0(fM128729d);
                        fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u3)).mo743q0(fM128728c) - fMo743q0;
                        f26 = fMo743q0 / 2.0f;
                        Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        boolean zM87147d2 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                        if ((57344 & i29) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z19 = zM87147d2 | z13;
                        if ((i29 & 14) == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z110 = z19 | z14;
                        if ((i29 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z110 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            abstractC17911t4 = abstractC17911t3;
                            Function1 function2 = new Function1() { // from class: z71.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                                }
                            };
                            c28655q.m87172p0(function2);
                            objM87133R = function2;
                        } else {
                            abstractC17911t4 = abstractC17911t3;
                            Function1 function3 = new Function1() { // from class: z71.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                                }
                            };
                            c28655q.m87172p0(function3);
                            objM87133R = function3;
                        }
                        AbstractC21478l0.m60421a(modifierM3407d2, (Function1) objM87133R, c28655q, 6);
                        abstractC17911t2 = abstractC17911t4;
                        f24 = f25;
                    } else {
                        c28655q.m87138X();
                        fM128729d = f17;
                        fM128728c = f18;
                        f24 = f19;
                        abstractC17911t2 = abstractC17911tM51486d;
                    }
                    i28 = i27;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 3072;
                f19 = f16;
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((i14 & 24576) == 0) {
                        abstractC17911tM51486d = abstractC17911t;
                        if (c28655q.m87153g(abstractC17911tM51486d)) {
                            i26 = 16384;
                        } else {
                            i26 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i16 |= i26;
                    }
                    if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        i27 = i13;
                        if ((i15 & 32) == 0) {
                            i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        } else {
                            i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i16 |= i34;
                    } else {
                        i27 = i13;
                    }
                    if ((i16 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z4)) {
                        c28655q.m87140Z();
                        if ((i14 & 1) != 0) {
                            if (i35 != 0) {
                                fM128729d = AbstractC40145d.m128729d();
                            } else {
                                fM128729d = f17;
                            }
                            if (i17 != 0) {
                                fM128728c = AbstractC40145d.m128728c();
                            } else {
                                fM128728c = f18;
                            }
                            if (i19 != 0) {
                                f19 = 5.0f;
                            }
                            if (i25 != 0) {
                                C17909s c17909s4 = AbstractC17911t.f69612b;
                                long j15 = C17919x.f69629f;
                                abstractC17911tM51486d = C17909s.m51486d(c17909s4, AbstractC37056f.m118959K(new C17919x(j15), new C17919x(j15)), 0L, 0L, 14);
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i27 = 3;
                            }
                        } else {
                            if (i35 != 0) {
                                fM128729d = AbstractC40145d.m128729d();
                            } else {
                                fM128729d = f17;
                            }
                            if (i17 != 0) {
                                fM128728c = AbstractC40145d.m128728c();
                            } else {
                                fM128728c = f18;
                            }
                            if (i19 != 0) {
                                f19 = 5.0f;
                            }
                            if (i25 != 0) {
                                C17909s c17909s5 = AbstractC17911t.f69612b;
                                long j16 = C17919x.f69629f;
                                abstractC17911tM51486d = C17909s.m51486d(c17909s5, AbstractC37056f.m118959K(new C17919x(j16), new C17919x(j16)), 0L, 0L, 14);
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i27 = 3;
                            }
                        }
                        i29 = i16;
                        abstractC17911t3 = abstractC17911tM51486d;
                        f25 = f19;
                        c28655q.m87175r();
                        C28674u2 c28674u4 = AbstractC2453v1.f9569h;
                        fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u4)).mo743q0(fM128729d);
                        fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u4)).mo743q0(fM128728c) - fMo743q0;
                        f26 = fMo743q0 / 2.0f;
                        Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        boolean zM87147d3 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                        if ((57344 & i29) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z111 = zM87147d3 | z13;
                        if ((i29 & 14) == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z112 = z111 | z14;
                        if ((i29 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z112 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            abstractC17911t4 = abstractC17911t3;
                            Function1 function4 = new Function1() { // from class: z71.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                                }
                            };
                            c28655q.m87172p0(function4);
                            objM87133R = function4;
                        } else {
                            abstractC17911t4 = abstractC17911t3;
                            Function1 function5 = new Function1() { // from class: z71.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                                }
                            };
                            c28655q.m87172p0(function5);
                            objM87133R = function5;
                        }
                        AbstractC21478l0.m60421a(modifierM3407d3, (Function1) objM87133R, c28655q, 6);
                        abstractC17911t2 = abstractC17911t4;
                        f24 = f25;
                    } else {
                        c28655q.m87138X();
                        fM128729d = f17;
                        fM128728c = f18;
                        f24 = f19;
                        abstractC17911t2 = abstractC17911tM51486d;
                    }
                    i28 = i27;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 24576;
                abstractC17911tM51486d = abstractC17911t;
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i27 = i13;
                    if ((i15 & 32) == 0) {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i34;
                } else {
                    i27 = i13;
                }
                if ((i16 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s6 = AbstractC17911t.f69612b;
                            long j17 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s6, AbstractC37056f.m118959K(new C17919x(j17), new C17919x(j17)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    } else {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s7 = AbstractC17911t.f69612b;
                            long j18 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s7, AbstractC37056f.m118959K(new C17919x(j18), new C17919x(j18)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    }
                    i29 = i16;
                    abstractC17911t3 = abstractC17911tM51486d;
                    f25 = f19;
                    c28655q.m87175r();
                    C28674u2 c28674u5 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u5)).mo743q0(fM128729d);
                    fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u5)).mo743q0(fM128728c) - fMo743q0;
                    f26 = fMo743q0 / 2.0f;
                    Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    boolean zM87147d4 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                    if ((57344 & i29) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z113 = zM87147d4 | z13;
                    if ((i29 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z114 = z113 | z14;
                    if ((i29 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z114 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function6 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function6);
                        objM87133R = function6;
                    } else {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function7 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function7);
                        objM87133R = function7;
                    }
                    AbstractC21478l0.m60421a(modifierM3407d4, (Function1) objM87133R, c28655q, 6);
                    abstractC17911t2 = abstractC17911t4;
                    f24 = f25;
                } else {
                    c28655q.m87138X();
                    fM128729d = f17;
                    fM128728c = f18;
                    f24 = f19;
                    abstractC17911t2 = abstractC17911tM51486d;
                }
                i28 = i27;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 384;
            f18 = f15;
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    f19 = f16;
                    if (c28655q.m87147d(f19)) {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((i14 & 24576) == 0) {
                        abstractC17911tM51486d = abstractC17911t;
                        if (c28655q.m87153g(abstractC17911tM51486d)) {
                            i26 = 16384;
                        } else {
                            i26 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i16 |= i26;
                    }
                    if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        i27 = i13;
                        if ((i15 & 32) == 0) {
                            i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        } else {
                            i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i16 |= i34;
                    } else {
                        i27 = i13;
                    }
                    if ((i16 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z4)) {
                        c28655q.m87140Z();
                        if ((i14 & 1) != 0) {
                            if (i35 != 0) {
                                fM128729d = AbstractC40145d.m128729d();
                            } else {
                                fM128729d = f17;
                            }
                            if (i17 != 0) {
                                fM128728c = AbstractC40145d.m128728c();
                            } else {
                                fM128728c = f18;
                            }
                            if (i19 != 0) {
                                f19 = 5.0f;
                            }
                            if (i25 != 0) {
                                C17909s c17909s8 = AbstractC17911t.f69612b;
                                long j19 = C17919x.f69629f;
                                abstractC17911tM51486d = C17909s.m51486d(c17909s8, AbstractC37056f.m118959K(new C17919x(j19), new C17919x(j19)), 0L, 0L, 14);
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i27 = 3;
                            }
                        } else {
                            if (i35 != 0) {
                                fM128729d = AbstractC40145d.m128729d();
                            } else {
                                fM128729d = f17;
                            }
                            if (i17 != 0) {
                                fM128728c = AbstractC40145d.m128728c();
                            } else {
                                fM128728c = f18;
                            }
                            if (i19 != 0) {
                                f19 = 5.0f;
                            }
                            if (i25 != 0) {
                                C17909s c17909s9 = AbstractC17911t.f69612b;
                                long j110 = C17919x.f69629f;
                                abstractC17911tM51486d = C17909s.m51486d(c17909s9, AbstractC37056f.m118959K(new C17919x(j110), new C17919x(j110)), 0L, 0L, 14);
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i27 = 3;
                            }
                        }
                        i29 = i16;
                        abstractC17911t3 = abstractC17911tM51486d;
                        f25 = f19;
                        c28655q.m87175r();
                        C28674u2 c28674u6 = AbstractC2453v1.f9569h;
                        fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u6)).mo743q0(fM128729d);
                        fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u6)).mo743q0(fM128728c) - fMo743q0;
                        f26 = fMo743q0 / 2.0f;
                        Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        boolean zM87147d5 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                        if ((57344 & i29) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z115 = zM87147d5 | z13;
                        if ((i29 & 14) == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z116 = z115 | z14;
                        if ((i29 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z116 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            abstractC17911t4 = abstractC17911t3;
                            Function1 function8 = new Function1() { // from class: z71.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                                }
                            };
                            c28655q.m87172p0(function8);
                            objM87133R = function8;
                        } else {
                            abstractC17911t4 = abstractC17911t3;
                            Function1 function9 = new Function1() { // from class: z71.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                                }
                            };
                            c28655q.m87172p0(function9);
                            objM87133R = function9;
                        }
                        AbstractC21478l0.m60421a(modifierM3407d5, (Function1) objM87133R, c28655q, 6);
                        abstractC17911t2 = abstractC17911t4;
                        f24 = f25;
                    } else {
                        c28655q.m87138X();
                        fM128729d = f17;
                        fM128728c = f18;
                        f24 = f19;
                        abstractC17911t2 = abstractC17911tM51486d;
                    }
                    i28 = i27;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 24576;
                abstractC17911tM51486d = abstractC17911t;
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i27 = i13;
                    if ((i15 & 32) == 0) {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i34;
                } else {
                    i27 = i13;
                }
                if ((i16 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s10 = AbstractC17911t.f69612b;
                            long j111 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s10, AbstractC37056f.m118959K(new C17919x(j111), new C17919x(j111)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    } else {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s11 = AbstractC17911t.f69612b;
                            long j112 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s11, AbstractC37056f.m118959K(new C17919x(j112), new C17919x(j112)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    }
                    i29 = i16;
                    abstractC17911t3 = abstractC17911tM51486d;
                    f25 = f19;
                    c28655q.m87175r();
                    C28674u2 c28674u7 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u7)).mo743q0(fM128729d);
                    fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u7)).mo743q0(fM128728c) - fMo743q0;
                    f26 = fMo743q0 / 2.0f;
                    Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    boolean zM87147d6 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                    if ((57344 & i29) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z117 = zM87147d6 | z13;
                    if ((i29 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z118 = z117 | z14;
                    if ((i29 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z118 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function10 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function10);
                        objM87133R = function10;
                    } else {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function11 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function11);
                        objM87133R = function11;
                    }
                    AbstractC21478l0.m60421a(modifierM3407d6, (Function1) objM87133R, c28655q, 6);
                    abstractC17911t2 = abstractC17911t4;
                    f24 = f25;
                } else {
                    c28655q.m87138X();
                    fM128729d = f17;
                    fM128728c = f18;
                    f24 = f19;
                    abstractC17911t2 = abstractC17911tM51486d;
                }
                i28 = i27;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 3072;
            f19 = f16;
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((i14 & 24576) == 0) {
                    abstractC17911tM51486d = abstractC17911t;
                    if (c28655q.m87153g(abstractC17911tM51486d)) {
                        i26 = 16384;
                    } else {
                        i26 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i26;
                }
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i27 = i13;
                    if ((i15 & 32) == 0) {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i34;
                } else {
                    i27 = i13;
                }
                if ((i16 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s12 = AbstractC17911t.f69612b;
                            long j113 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s12, AbstractC37056f.m118959K(new C17919x(j113), new C17919x(j113)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    } else {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s13 = AbstractC17911t.f69612b;
                            long j114 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s13, AbstractC37056f.m118959K(new C17919x(j114), new C17919x(j114)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    }
                    i29 = i16;
                    abstractC17911t3 = abstractC17911tM51486d;
                    f25 = f19;
                    c28655q.m87175r();
                    C28674u2 c28674u8 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u8)).mo743q0(fM128729d);
                    fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u8)).mo743q0(fM128728c) - fMo743q0;
                    f26 = fMo743q0 / 2.0f;
                    Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    boolean zM87147d7 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                    if ((57344 & i29) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z119 = zM87147d7 | z13;
                    if ((i29 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z1110 = z119 | z14;
                    if ((i29 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z1110 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function12 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function12);
                        objM87133R = function12;
                    } else {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function13 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function13);
                        objM87133R = function13;
                    }
                    AbstractC21478l0.m60421a(modifierM3407d7, (Function1) objM87133R, c28655q, 6);
                    abstractC17911t2 = abstractC17911t4;
                    f24 = f25;
                } else {
                    c28655q.m87138X();
                    fM128729d = f17;
                    fM128728c = f18;
                    f24 = f19;
                    abstractC17911t2 = abstractC17911tM51486d;
                }
                i28 = i27;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            abstractC17911tM51486d = abstractC17911t;
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                i27 = i13;
                if ((i15 & 32) == 0) {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i34;
            } else {
                i27 = i13;
            }
            if ((i16 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i35 != 0) {
                        fM128729d = AbstractC40145d.m128729d();
                    } else {
                        fM128729d = f17;
                    }
                    if (i17 != 0) {
                        fM128728c = AbstractC40145d.m128728c();
                    } else {
                        fM128728c = f18;
                    }
                    if (i19 != 0) {
                        f19 = 5.0f;
                    }
                    if (i25 != 0) {
                        C17909s c17909s14 = AbstractC17911t.f69612b;
                        long j115 = C17919x.f69629f;
                        abstractC17911tM51486d = C17909s.m51486d(c17909s14, AbstractC37056f.m118959K(new C17919x(j115), new C17919x(j115)), 0L, 0L, 14);
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i27 = 3;
                    }
                } else {
                    if (i35 != 0) {
                        fM128729d = AbstractC40145d.m128729d();
                    } else {
                        fM128729d = f17;
                    }
                    if (i17 != 0) {
                        fM128728c = AbstractC40145d.m128728c();
                    } else {
                        fM128728c = f18;
                    }
                    if (i19 != 0) {
                        f19 = 5.0f;
                    }
                    if (i25 != 0) {
                        C17909s c17909s15 = AbstractC17911t.f69612b;
                        long j116 = C17919x.f69629f;
                        abstractC17911tM51486d = C17909s.m51486d(c17909s15, AbstractC37056f.m118959K(new C17919x(j116), new C17919x(j116)), 0L, 0L, 14);
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i27 = 3;
                    }
                }
                i29 = i16;
                abstractC17911t3 = abstractC17911tM51486d;
                f25 = f19;
                c28655q.m87175r();
                C28674u2 c28674u9 = AbstractC2453v1.f9569h;
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u9)).mo743q0(fM128729d);
                fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u9)).mo743q0(fM128728c) - fMo743q0;
                f26 = fMo743q0 / 2.0f;
                Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                boolean zM87147d8 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                if ((57344 & i29) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z1111 = zM87147d8 | z13;
                if ((i29 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z1112 = z1111 | z14;
                if ((i29 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z1112 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                objM87133R = c28655q.m87133R();
                if (z16) {
                    abstractC17911t4 = abstractC17911t3;
                    Function1 function14 = new Function1() { // from class: z71.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function14);
                    objM87133R = function14;
                } else {
                    abstractC17911t4 = abstractC17911t3;
                    Function1 function15 = new Function1() { // from class: z71.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function15);
                    objM87133R = function15;
                }
                AbstractC21478l0.m60421a(modifierM3407d8, (Function1) objM87133R, c28655q, 6);
                abstractC17911t2 = abstractC17911t4;
                f24 = f25;
            } else {
                c28655q.m87138X();
                fM128729d = f17;
                fM128728c = f18;
                f24 = f19;
                abstractC17911t2 = abstractC17911tM51486d;
            }
            i28 = i27;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 48;
        f17 = f14;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                f18 = f15;
                if (c28655q.m87147d(f18)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    f19 = f16;
                    if (c28655q.m87147d(f19)) {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((i14 & 24576) == 0) {
                        abstractC17911tM51486d = abstractC17911t;
                        if (c28655q.m87153g(abstractC17911tM51486d)) {
                            i26 = 16384;
                        } else {
                            i26 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i16 |= i26;
                    }
                    if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        i27 = i13;
                        if ((i15 & 32) == 0) {
                            i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        } else {
                            i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i16 |= i34;
                    } else {
                        i27 = i13;
                    }
                    if ((i16 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z4)) {
                        c28655q.m87140Z();
                        if ((i14 & 1) != 0) {
                            if (i35 != 0) {
                                fM128729d = AbstractC40145d.m128729d();
                            } else {
                                fM128729d = f17;
                            }
                            if (i17 != 0) {
                                fM128728c = AbstractC40145d.m128728c();
                            } else {
                                fM128728c = f18;
                            }
                            if (i19 != 0) {
                                f19 = 5.0f;
                            }
                            if (i25 != 0) {
                                C17909s c17909s16 = AbstractC17911t.f69612b;
                                long j117 = C17919x.f69629f;
                                abstractC17911tM51486d = C17909s.m51486d(c17909s16, AbstractC37056f.m118959K(new C17919x(j117), new C17919x(j117)), 0L, 0L, 14);
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i27 = 3;
                            }
                        } else {
                            if (i35 != 0) {
                                fM128729d = AbstractC40145d.m128729d();
                            } else {
                                fM128729d = f17;
                            }
                            if (i17 != 0) {
                                fM128728c = AbstractC40145d.m128728c();
                            } else {
                                fM128728c = f18;
                            }
                            if (i19 != 0) {
                                f19 = 5.0f;
                            }
                            if (i25 != 0) {
                                C17909s c17909s17 = AbstractC17911t.f69612b;
                                long j118 = C17919x.f69629f;
                                abstractC17911tM51486d = C17909s.m51486d(c17909s17, AbstractC37056f.m118959K(new C17919x(j118), new C17919x(j118)), 0L, 0L, 14);
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i27 = 3;
                            }
                        }
                        i29 = i16;
                        abstractC17911t3 = abstractC17911tM51486d;
                        f25 = f19;
                        c28655q.m87175r();
                        C28674u2 c28674u10 = AbstractC2453v1.f9569h;
                        fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u10)).mo743q0(fM128729d);
                        fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u10)).mo743q0(fM128728c) - fMo743q0;
                        f26 = fMo743q0 / 2.0f;
                        Modifier modifierM3407d9 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        boolean zM87147d9 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                        if ((57344 & i29) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z1113 = zM87147d9 | z13;
                        if ((i29 & 14) == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z1114 = z1113 | z14;
                        if ((i29 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z1114 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            abstractC17911t4 = abstractC17911t3;
                            Function1 function16 = new Function1() { // from class: z71.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                                }
                            };
                            c28655q.m87172p0(function16);
                            objM87133R = function16;
                        } else {
                            abstractC17911t4 = abstractC17911t3;
                            Function1 function17 = new Function1() { // from class: z71.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                                }
                            };
                            c28655q.m87172p0(function17);
                            objM87133R = function17;
                        }
                        AbstractC21478l0.m60421a(modifierM3407d9, (Function1) objM87133R, c28655q, 6);
                        abstractC17911t2 = abstractC17911t4;
                        f24 = f25;
                    } else {
                        c28655q.m87138X();
                        fM128729d = f17;
                        fM128728c = f18;
                        f24 = f19;
                        abstractC17911t2 = abstractC17911tM51486d;
                    }
                    i28 = i27;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 24576;
                abstractC17911tM51486d = abstractC17911t;
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i27 = i13;
                    if ((i15 & 32) == 0) {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i34;
                } else {
                    i27 = i13;
                }
                if ((i16 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s18 = AbstractC17911t.f69612b;
                            long j119 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s18, AbstractC37056f.m118959K(new C17919x(j119), new C17919x(j119)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    } else {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s19 = AbstractC17911t.f69612b;
                            long j1110 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s19, AbstractC37056f.m118959K(new C17919x(j1110), new C17919x(j1110)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    }
                    i29 = i16;
                    abstractC17911t3 = abstractC17911tM51486d;
                    f25 = f19;
                    c28655q.m87175r();
                    C28674u2 c28674u11 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u11)).mo743q0(fM128729d);
                    fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u11)).mo743q0(fM128728c) - fMo743q0;
                    f26 = fMo743q0 / 2.0f;
                    Modifier modifierM3407d10 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    boolean zM87147d10 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                    if ((57344 & i29) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z1115 = zM87147d10 | z13;
                    if ((i29 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z1116 = z1115 | z14;
                    if ((i29 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z1116 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function18 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function18);
                        objM87133R = function18;
                    } else {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function19 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function19);
                        objM87133R = function19;
                    }
                    AbstractC21478l0.m60421a(modifierM3407d10, (Function1) objM87133R, c28655q, 6);
                    abstractC17911t2 = abstractC17911t4;
                    f24 = f25;
                } else {
                    c28655q.m87138X();
                    fM128729d = f17;
                    fM128728c = f18;
                    f24 = f19;
                    abstractC17911t2 = abstractC17911tM51486d;
                }
                i28 = i27;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 3072;
            f19 = f16;
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((i14 & 24576) == 0) {
                    abstractC17911tM51486d = abstractC17911t;
                    if (c28655q.m87153g(abstractC17911tM51486d)) {
                        i26 = 16384;
                    } else {
                        i26 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i26;
                }
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i27 = i13;
                    if ((i15 & 32) == 0) {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i34;
                } else {
                    i27 = i13;
                }
                if ((i16 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s110 = AbstractC17911t.f69612b;
                            long j1111 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s110, AbstractC37056f.m118959K(new C17919x(j1111), new C17919x(j1111)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    } else {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s111 = AbstractC17911t.f69612b;
                            long j1112 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s111, AbstractC37056f.m118959K(new C17919x(j1112), new C17919x(j1112)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    }
                    i29 = i16;
                    abstractC17911t3 = abstractC17911tM51486d;
                    f25 = f19;
                    c28655q.m87175r();
                    C28674u2 c28674u12 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u12)).mo743q0(fM128729d);
                    fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u12)).mo743q0(fM128728c) - fMo743q0;
                    f26 = fMo743q0 / 2.0f;
                    Modifier modifierM3407d11 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    boolean zM87147d11 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                    if ((57344 & i29) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z1117 = zM87147d11 | z13;
                    if ((i29 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z1118 = z1117 | z14;
                    if ((i29 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z1118 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function110 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function110);
                        objM87133R = function110;
                    } else {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function111 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function111);
                        objM87133R = function111;
                    }
                    AbstractC21478l0.m60421a(modifierM3407d11, (Function1) objM87133R, c28655q, 6);
                    abstractC17911t2 = abstractC17911t4;
                    f24 = f25;
                } else {
                    c28655q.m87138X();
                    fM128729d = f17;
                    fM128728c = f18;
                    f24 = f19;
                    abstractC17911t2 = abstractC17911tM51486d;
                }
                i28 = i27;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            abstractC17911tM51486d = abstractC17911t;
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                i27 = i13;
                if ((i15 & 32) == 0) {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i34;
            } else {
                i27 = i13;
            }
            if ((i16 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i35 != 0) {
                        fM128729d = AbstractC40145d.m128729d();
                    } else {
                        fM128729d = f17;
                    }
                    if (i17 != 0) {
                        fM128728c = AbstractC40145d.m128728c();
                    } else {
                        fM128728c = f18;
                    }
                    if (i19 != 0) {
                        f19 = 5.0f;
                    }
                    if (i25 != 0) {
                        C17909s c17909s112 = AbstractC17911t.f69612b;
                        long j1113 = C17919x.f69629f;
                        abstractC17911tM51486d = C17909s.m51486d(c17909s112, AbstractC37056f.m118959K(new C17919x(j1113), new C17919x(j1113)), 0L, 0L, 14);
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i27 = 3;
                    }
                } else {
                    if (i35 != 0) {
                        fM128729d = AbstractC40145d.m128729d();
                    } else {
                        fM128729d = f17;
                    }
                    if (i17 != 0) {
                        fM128728c = AbstractC40145d.m128728c();
                    } else {
                        fM128728c = f18;
                    }
                    if (i19 != 0) {
                        f19 = 5.0f;
                    }
                    if (i25 != 0) {
                        C17909s c17909s113 = AbstractC17911t.f69612b;
                        long j1114 = C17919x.f69629f;
                        abstractC17911tM51486d = C17909s.m51486d(c17909s113, AbstractC37056f.m118959K(new C17919x(j1114), new C17919x(j1114)), 0L, 0L, 14);
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i27 = 3;
                    }
                }
                i29 = i16;
                abstractC17911t3 = abstractC17911tM51486d;
                f25 = f19;
                c28655q.m87175r();
                C28674u2 c28674u13 = AbstractC2453v1.f9569h;
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u13)).mo743q0(fM128729d);
                fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u13)).mo743q0(fM128728c) - fMo743q0;
                f26 = fMo743q0 / 2.0f;
                Modifier modifierM3407d12 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                boolean zM87147d12 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                if ((57344 & i29) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z1119 = zM87147d12 | z13;
                if ((i29 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z11110 = z1119 | z14;
                if ((i29 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z11110 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                objM87133R = c28655q.m87133R();
                if (z16) {
                    abstractC17911t4 = abstractC17911t3;
                    Function1 function112 = new Function1() { // from class: z71.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function112);
                    objM87133R = function112;
                } else {
                    abstractC17911t4 = abstractC17911t3;
                    Function1 function113 = new Function1() { // from class: z71.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function113);
                    objM87133R = function113;
                }
                AbstractC21478l0.m60421a(modifierM3407d12, (Function1) objM87133R, c28655q, 6);
                abstractC17911t2 = abstractC17911t4;
                f24 = f25;
            } else {
                c28655q.m87138X();
                fM128729d = f17;
                fM128728c = f18;
                f24 = f19;
                abstractC17911t2 = abstractC17911tM51486d;
            }
            i28 = i27;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 384;
        f18 = f15;
        i19 = i15 & 8;
        if (i19 != 0) {
            if ((i14 & 3072) == 0) {
                f19 = f16;
                if (c28655q.m87147d(f19)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i24;
            }
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((i14 & 24576) == 0) {
                    abstractC17911tM51486d = abstractC17911t;
                    if (c28655q.m87153g(abstractC17911tM51486d)) {
                        i26 = 16384;
                    } else {
                        i26 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i26;
                }
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i27 = i13;
                    if ((i15 & 32) == 0) {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i34;
                } else {
                    i27 = i13;
                }
                if ((i16 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s114 = AbstractC17911t.f69612b;
                            long j1115 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s114, AbstractC37056f.m118959K(new C17919x(j1115), new C17919x(j1115)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    } else {
                        if (i35 != 0) {
                            fM128729d = AbstractC40145d.m128729d();
                        } else {
                            fM128729d = f17;
                        }
                        if (i17 != 0) {
                            fM128728c = AbstractC40145d.m128728c();
                        } else {
                            fM128728c = f18;
                        }
                        if (i19 != 0) {
                            f19 = 5.0f;
                        }
                        if (i25 != 0) {
                            C17909s c17909s115 = AbstractC17911t.f69612b;
                            long j1116 = C17919x.f69629f;
                            abstractC17911tM51486d = C17909s.m51486d(c17909s115, AbstractC37056f.m118959K(new C17919x(j1116), new C17919x(j1116)), 0L, 0L, 14);
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i27 = 3;
                        }
                    }
                    i29 = i16;
                    abstractC17911t3 = abstractC17911tM51486d;
                    f25 = f19;
                    c28655q.m87175r();
                    C28674u2 c28674u14 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u14)).mo743q0(fM128729d);
                    fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u14)).mo743q0(fM128728c) - fMo743q0;
                    f26 = fMo743q0 / 2.0f;
                    Modifier modifierM3407d13 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    boolean zM87147d13 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                    if ((57344 & i29) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z11111 = zM87147d13 | z13;
                    if ((i29 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z11112 = z11111 | z14;
                    if ((i29 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z11112 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function114 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function114);
                        objM87133R = function114;
                    } else {
                        abstractC17911t4 = abstractC17911t3;
                        Function1 function115 = new Function1() { // from class: z71.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(function115);
                        objM87133R = function115;
                    }
                    AbstractC21478l0.m60421a(modifierM3407d13, (Function1) objM87133R, c28655q, 6);
                    abstractC17911t2 = abstractC17911t4;
                    f24 = f25;
                } else {
                    c28655q.m87138X();
                    fM128729d = f17;
                    fM128728c = f18;
                    f24 = f19;
                    abstractC17911t2 = abstractC17911tM51486d;
                }
                i28 = i27;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            abstractC17911tM51486d = abstractC17911t;
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                i27 = i13;
                if ((i15 & 32) == 0) {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i34;
            } else {
                i27 = i13;
            }
            if ((i16 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i35 != 0) {
                        fM128729d = AbstractC40145d.m128729d();
                    } else {
                        fM128729d = f17;
                    }
                    if (i17 != 0) {
                        fM128728c = AbstractC40145d.m128728c();
                    } else {
                        fM128728c = f18;
                    }
                    if (i19 != 0) {
                        f19 = 5.0f;
                    }
                    if (i25 != 0) {
                        C17909s c17909s116 = AbstractC17911t.f69612b;
                        long j1117 = C17919x.f69629f;
                        abstractC17911tM51486d = C17909s.m51486d(c17909s116, AbstractC37056f.m118959K(new C17919x(j1117), new C17919x(j1117)), 0L, 0L, 14);
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i27 = 3;
                    }
                } else {
                    if (i35 != 0) {
                        fM128729d = AbstractC40145d.m128729d();
                    } else {
                        fM128729d = f17;
                    }
                    if (i17 != 0) {
                        fM128728c = AbstractC40145d.m128728c();
                    } else {
                        fM128728c = f18;
                    }
                    if (i19 != 0) {
                        f19 = 5.0f;
                    }
                    if (i25 != 0) {
                        C17909s c17909s117 = AbstractC17911t.f69612b;
                        long j1118 = C17919x.f69629f;
                        abstractC17911tM51486d = C17909s.m51486d(c17909s117, AbstractC37056f.m118959K(new C17919x(j1118), new C17919x(j1118)), 0L, 0L, 14);
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i27 = 3;
                    }
                }
                i29 = i16;
                abstractC17911t3 = abstractC17911tM51486d;
                f25 = f19;
                c28655q.m87175r();
                C28674u2 c28674u15 = AbstractC2453v1.f9569h;
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u15)).mo743q0(fM128729d);
                fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u15)).mo743q0(fM128728c) - fMo743q0;
                f26 = fMo743q0 / 2.0f;
                Modifier modifierM3407d14 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                boolean zM87147d14 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                if ((57344 & i29) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z11113 = zM87147d14 | z13;
                if ((i29 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z11114 = z11113 | z14;
                if ((i29 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z11114 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                objM87133R = c28655q.m87133R();
                if (z16) {
                    abstractC17911t4 = abstractC17911t3;
                    Function1 function116 = new Function1() { // from class: z71.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function116);
                    objM87133R = function116;
                } else {
                    abstractC17911t4 = abstractC17911t3;
                    Function1 function117 = new Function1() { // from class: z71.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function117);
                    objM87133R = function117;
                }
                AbstractC21478l0.m60421a(modifierM3407d14, (Function1) objM87133R, c28655q, 6);
                abstractC17911t2 = abstractC17911t4;
                f24 = f25;
            } else {
                c28655q.m87138X();
                fM128729d = f17;
                fM128728c = f18;
                f24 = f19;
                abstractC17911t2 = abstractC17911tM51486d;
            }
            i28 = i27;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        f19 = f16;
        i25 = i15 & 16;
        if (i25 != 0) {
            if ((i14 & 24576) == 0) {
                abstractC17911tM51486d = abstractC17911t;
                if (c28655q.m87153g(abstractC17911tM51486d)) {
                    i26 = 16384;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i26;
            }
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                i27 = i13;
                if ((i15 & 32) == 0) {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i34;
            } else {
                i27 = i13;
            }
            if ((i16 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i35 != 0) {
                        fM128729d = AbstractC40145d.m128729d();
                    } else {
                        fM128729d = f17;
                    }
                    if (i17 != 0) {
                        fM128728c = AbstractC40145d.m128728c();
                    } else {
                        fM128728c = f18;
                    }
                    if (i19 != 0) {
                        f19 = 5.0f;
                    }
                    if (i25 != 0) {
                        C17909s c17909s118 = AbstractC17911t.f69612b;
                        long j1119 = C17919x.f69629f;
                        abstractC17911tM51486d = C17909s.m51486d(c17909s118, AbstractC37056f.m118959K(new C17919x(j1119), new C17919x(j1119)), 0L, 0L, 14);
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i27 = 3;
                    }
                } else {
                    if (i35 != 0) {
                        fM128729d = AbstractC40145d.m128729d();
                    } else {
                        fM128729d = f17;
                    }
                    if (i17 != 0) {
                        fM128728c = AbstractC40145d.m128728c();
                    } else {
                        fM128728c = f18;
                    }
                    if (i19 != 0) {
                        f19 = 5.0f;
                    }
                    if (i25 != 0) {
                        C17909s c17909s119 = AbstractC17911t.f69612b;
                        long j11110 = C17919x.f69629f;
                        abstractC17911tM51486d = C17909s.m51486d(c17909s119, AbstractC37056f.m118959K(new C17919x(j11110), new C17919x(j11110)), 0L, 0L, 14);
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i27 = 3;
                    }
                }
                i29 = i16;
                abstractC17911t3 = abstractC17911tM51486d;
                f25 = f19;
                c28655q.m87175r();
                C28674u2 c28674u16 = AbstractC2453v1.f9569h;
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u16)).mo743q0(fM128729d);
                fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u16)).mo743q0(fM128728c) - fMo743q0;
                f26 = fMo743q0 / 2.0f;
                Modifier modifierM3407d15 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                boolean zM87147d15 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
                if ((57344 & i29) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z11115 = zM87147d15 | z13;
                if ((i29 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z11116 = z11115 | z14;
                if ((i29 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z11116 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
                objM87133R = c28655q.m87133R();
                if (z16) {
                    abstractC17911t4 = abstractC17911t3;
                    Function1 function118 = new Function1() { // from class: z71.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function118);
                    objM87133R = function118;
                } else {
                    abstractC17911t4 = abstractC17911t3;
                    Function1 function119 = new Function1() { // from class: z71.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function119);
                    objM87133R = function119;
                }
                AbstractC21478l0.m60421a(modifierM3407d15, (Function1) objM87133R, c28655q, 6);
                abstractC17911t2 = abstractC17911t4;
                f24 = f25;
            } else {
                c28655q.m87138X();
                fM128729d = f17;
                fM128728c = f18;
                f24 = f19;
                abstractC17911t2 = abstractC17911tM51486d;
            }
            i28 = i27;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        abstractC17911tM51486d = abstractC17911t;
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i27 = i13;
            if ((i15 & 32) == 0) {
                i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            } else {
                i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i34;
        } else {
            i27 = i13;
        }
        if ((i16 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28655q.m87140Z();
            if ((i14 & 1) != 0) {
                if (i35 != 0) {
                    fM128729d = AbstractC40145d.m128729d();
                } else {
                    fM128729d = f17;
                }
                if (i17 != 0) {
                    fM128728c = AbstractC40145d.m128728c();
                } else {
                    fM128728c = f18;
                }
                if (i19 != 0) {
                    f19 = 5.0f;
                }
                if (i25 != 0) {
                    C17909s c17909s1110 = AbstractC17911t.f69612b;
                    long j11111 = C17919x.f69629f;
                    abstractC17911tM51486d = C17909s.m51486d(c17909s1110, AbstractC37056f.m118959K(new C17919x(j11111), new C17919x(j11111)), 0L, 0L, 14);
                }
                if ((i15 & 32) != 0) {
                    i16 &= -458753;
                    i27 = 3;
                }
            } else {
                if (i35 != 0) {
                    fM128729d = AbstractC40145d.m128729d();
                } else {
                    fM128729d = f17;
                }
                if (i17 != 0) {
                    fM128728c = AbstractC40145d.m128728c();
                } else {
                    fM128728c = f18;
                }
                if (i19 != 0) {
                    f19 = 5.0f;
                }
                if (i25 != 0) {
                    C17909s c17909s1111 = AbstractC17911t.f69612b;
                    long j11112 = C17919x.f69629f;
                    abstractC17911tM51486d = C17909s.m51486d(c17909s1111, AbstractC37056f.m118959K(new C17919x(j11112), new C17919x(j11112)), 0L, 0L, 14);
                }
                if ((i15 & 32) != 0) {
                    i16 &= -458753;
                    i27 = 3;
                }
            }
            i29 = i16;
            abstractC17911t3 = abstractC17911tM51486d;
            f25 = f19;
            c28655q.m87175r();
            C28674u2 c28674u17 = AbstractC2453v1.f9569h;
            fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u17)).mo743q0(fM128729d);
            fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u17)).mo743q0(fM128728c) - fMo743q0;
            f26 = fMo743q0 / 2.0f;
            Modifier modifierM3407d16 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            boolean zM87147d16 = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f26);
            if ((57344 & i29) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z11117 = zM87147d16 | z13;
            if ((i29 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z11118 = z11117 | z14;
            if ((i29 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z11118 | z15 | ((((458752 & i29) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) <= 131072 && c28655q.m87149e(i27)) || (i29 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072);
            objM87133R = c28655q.m87133R();
            if (z16) {
                abstractC17911t4 = abstractC17911t3;
                Function1 function1110 = new Function1() { // from class: z71.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1110);
                objM87133R = function1110;
            } else {
                abstractC17911t4 = abstractC17911t3;
                Function1 function1111 = new Function1() { // from class: z71.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC40153l.m128765x(fMo743q0, fMo743q1, f26, abstractC17911t4, f13, f25, i27, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1111);
                objM87133R = function1111;
            }
            AbstractC21478l0.m60421a(modifierM3407d16, (Function1) objM87133R, c28655q, 6);
            abstractC17911t2 = abstractC17911t4;
            f24 = f25;
        } else {
            c28655q.m87138X();
            fM128729d = f17;
            fM128728c = f18;
            f24 = f19;
            abstractC17911t2 = abstractC17911tM51486d;
        }
        i28 = i27;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z71.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC40153l.m128766y(f13, fM128729d, fM128728c, f24, abstractC17911t2, i28, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m128765x(float f13, float f14, float f15, AbstractC17911t abstractC17911t, float f16, float f17, int i13, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jMo721B0 = Canvas.mo721B0();
        C0237p c0237pMo744t0 = Canvas.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(160.0f, jMo721B0);
            C22135i c22135i = new C22135i(f13, 0.0f, 0, 0, null, 30);
            InterfaceC22131e.m63381X(Canvas, abstractC17911t, f16, f17, false, (((long) Float.floatToRawIntBits(f15)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f15))), (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), c22135i, i13, 320);
            return C23454a0.f92919a;
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m128766y(float f13, float f14, float f15, float f16, AbstractC17911t abstractC17911t, int i13, int i14, int i15, Composer composer, int i16) {
        m128764w(f13, f14, f15, f16, abstractC17911t, i13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m128767z(TextResource textResource, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1358749777);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float fM128730e = AbstractC40145d.m128730e();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(fM128730e, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
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
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(((float) 12.5d) * 4, AbstractC1136a.m3599a(c2314t, "progress_modal_loading_lottie"));
            InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C39681c(26);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C39913g(21);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC35684p.m113047h(modifierM3419p2, dVarM113128a, false, 0.0f, 0, interfaceC4339a, (Function1) objM87133R2, null, null, c28655q, 1769478, 412);
            AbstractC18489d0.m53380u(2, 8, c2314t, c28655q);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i14 & 14);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH2(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3428b1(textResource, i13, 18);
        }
    }
}

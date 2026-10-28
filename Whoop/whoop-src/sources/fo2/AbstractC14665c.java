package fo2;

import a31.C0342d;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import ar2.C1930a;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d01.C11439d;
import ej1.C13242h;
import eo2.EnumC13389i;
import eo2.InterfaceC13383c;
import f01.C13849c0;
import f02.C13917c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import nn2.AbstractC26867a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
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
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36776l;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: fo2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001aA\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lfo2/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lfo2/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "quantity", "minQuantity", "maxQuantity", "", "isUpdating", "", "lineItemId", "productLabel", "k", "(IIIZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "enabled", NotificationCompat.CATEGORY_EVENT, "Lkotlin/Function0;", "content", "n", "(ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "q", "(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "a", "Lfo2/d;", "previewViewState", "", "b", "Ljava/util/List;", "quantityStatePreviewItems", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14665c {

    /* JADX INFO: renamed from: a */
    private static final C14666d f54153a;

    /* JADX INFO: renamed from: b */
    private static final List<C14666d> f54154b;

    static {
        C14666d c14666d = new C14666d(AbstractC8693b.m21278l("MG SportFlex Band"), AbstractC8693b.m21278l("CR7 Away"), null, null, AbstractC8693b.m21278l("$59"), null, 2, 0, 10, false, false, "line-1", null, false, 13992, null);
        f54153a = c14666d;
        f54154b = AbstractC37056f.m118959K(c14666d.m41906a((15933 & 1) != 0 ? c14666d.title : null, (15933 & 2) != 0 ? c14666d.subtitle : AbstractC8693b.m21278l("Editable · min 0 / max 10"), (15933 & 4) != 0 ? c14666d.image : null, (15933 & 8) != 0 ? c14666d.stackedImages : null, (15933 & 16) != 0 ? c14666d.price : null, (15933 & 32) != 0 ? c14666d.strikethroughPrice : null, (15933 & 64) != 0 ? c14666d.quantity : 2, (15933 & 128) != 0 ? c14666d.minQuantity : 0, (15933 & 256) != 0 ? c14666d.maxQuantity : 10, (15933 & 512) != 0 ? c14666d.isNotEditable : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14666d.hideQuantity : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14666d.lineItemId : null, (15933 & 4096) != 0 ? c14666d.analyticsLabel : null, (15933 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14666d.isUpdating : false), c14666d.m41906a((15933 & 1) != 0 ? c14666d.title : null, (15933 & 2) != 0 ? c14666d.subtitle : AbstractC8693b.m21278l("At max quantity · min 0 / max 5"), (15933 & 4) != 0 ? c14666d.image : null, (15933 & 8) != 0 ? c14666d.stackedImages : null, (15933 & 16) != 0 ? c14666d.price : null, (15933 & 32) != 0 ? c14666d.strikethroughPrice : null, (15933 & 64) != 0 ? c14666d.quantity : 5, (15933 & 128) != 0 ? c14666d.minQuantity : 0, (15933 & 256) != 0 ? c14666d.maxQuantity : 5, (15933 & 512) != 0 ? c14666d.isNotEditable : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14666d.hideQuantity : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14666d.lineItemId : null, (15933 & 4096) != 0 ? c14666d.analyticsLabel : null, (15933 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14666d.isUpdating : false), c14666d.m41906a((15933 & 1) != 0 ? c14666d.title : null, (15933 & 2) != 0 ? c14666d.subtitle : AbstractC8693b.m21278l("Min quantity 1 · min 1 / max 3"), (15933 & 4) != 0 ? c14666d.image : null, (15933 & 8) != 0 ? c14666d.stackedImages : null, (15933 & 16) != 0 ? c14666d.price : null, (15933 & 32) != 0 ? c14666d.strikethroughPrice : null, (15933 & 64) != 0 ? c14666d.quantity : 1, (15933 & 128) != 0 ? c14666d.minQuantity : 1, (15933 & 256) != 0 ? c14666d.maxQuantity : 3, (15933 & 512) != 0 ? c14666d.isNotEditable : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14666d.hideQuantity : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14666d.lineItemId : null, (15933 & 4096) != 0 ? c14666d.analyticsLabel : null, (15933 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14666d.isUpdating : false), c14666d.m41906a((15933 & 1) != 0 ? c14666d.title : null, (15933 & 2) != 0 ? c14666d.subtitle : AbstractC8693b.m21278l("Min quantity above 1 · min 2 / max 5"), (15933 & 4) != 0 ? c14666d.image : null, (15933 & 8) != 0 ? c14666d.stackedImages : null, (15933 & 16) != 0 ? c14666d.price : null, (15933 & 32) != 0 ? c14666d.strikethroughPrice : null, (15933 & 64) != 0 ? c14666d.quantity : 2, (15933 & 128) != 0 ? c14666d.minQuantity : 2, (15933 & 256) != 0 ? c14666d.maxQuantity : 5, (15933 & 512) != 0 ? c14666d.isNotEditable : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14666d.hideQuantity : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14666d.lineItemId : null, (15933 & 4096) != 0 ? c14666d.analyticsLabel : null, (15933 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14666d.isUpdating : false), c14666d.m41906a((15933 & 1) != 0 ? c14666d.title : null, (15933 & 2) != 0 ? c14666d.subtitle : AbstractC8693b.m21278l("Not editable · min 1 / max 1"), (15933 & 4) != 0 ? c14666d.image : null, (15933 & 8) != 0 ? c14666d.stackedImages : null, (15933 & 16) != 0 ? c14666d.price : null, (15933 & 32) != 0 ? c14666d.strikethroughPrice : null, (15933 & 64) != 0 ? c14666d.quantity : 1, (15933 & 128) != 0 ? c14666d.minQuantity : 1, (15933 & 256) != 0 ? c14666d.maxQuantity : 1, (15933 & 512) != 0 ? c14666d.isNotEditable : true, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14666d.hideQuantity : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14666d.lineItemId : null, (15933 & 4096) != 0 ? c14666d.analyticsLabel : null, (15933 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14666d.isUpdating : false), c14666d.m41906a((15933 & 1) != 0 ? c14666d.title : null, (15933 & 2) != 0 ? c14666d.subtitle : AbstractC8693b.m21278l("Hidden quantity"), (15933 & 4) != 0 ? c14666d.image : null, (15933 & 8) != 0 ? c14666d.stackedImages : null, (15933 & 16) != 0 ? c14666d.price : null, (15933 & 32) != 0 ? c14666d.strikethroughPrice : null, (15933 & 64) != 0 ? c14666d.quantity : 0, (15933 & 128) != 0 ? c14666d.minQuantity : 0, (15933 & 256) != 0 ? c14666d.maxQuantity : 0, (15933 & 512) != 0 ? c14666d.isNotEditable : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14666d.hideQuantity : true, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14666d.lineItemId : null, (15933 & 4096) != 0 ? c14666d.analyticsLabel : null, (15933 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14666d.isUpdating : false));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0269  */
    /* JADX WARN: Code duplicated, block: B:72:0x026d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0288  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x032f  */
    /* JADX WARN: Code duplicated, block: B:86:0x033b  */
    /* JADX WARN: Code duplicated, block: B:87:0x035f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0396  */
    /* JADX WARN: Code duplicated, block: B:91:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:94:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m41894h(C14666d c14666d, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        C38072d c38072d;
        int i17;
        int iHashCode2;
        int iHashCode3;
        int i18;
        int i19;
        int iHashCode4;
        TextResource strikethroughPrice;
        boolean z13;
        boolean z14;
        C14666d viewState = c14666d;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(853115477);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 8;
                float f14 = 1.5f * f13;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, modifier4), 2 * f13, f14);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, 54);
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
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                float f15 = 4;
                float f16 = 20 * f15;
                i16 = i15;
                float f17 = 1;
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(f16, c2314t), f17, f15);
                c38072d = C38072d.f163053a;
                i17 = C38072d.f163054b;
                Modifier modifier5 = modifier4;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, i17).getBrandWhite(), AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC26867a.m80219b(C1100b.f4583a, c14666d.getImage(), c14666d.m41916l(), AbstractC1102d.m3419p(f16, c2314t), null, c28655q, 3078 | (AbstractC22403o.f87638a << 3), 8);
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(0.5f * f13), C2299e.f9110M, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                TextResource title = c14666d.getTitle();
                i18 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(title, c28655q, i18);
                C2886a c2886aM8438s = c38072d.m121952e(c28655q, i17).getH5();
                long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
                i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q, 0, i19, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c14666d.getSubtitle(), c28655q, i18), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB4(), null, c28655q, 0, i19, 196602);
                c28655q.m87173q(true);
                C23010x c23010xM73381n = AbstractC25012a.m73381n(f17, f13, C2299e.f9112O, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c14666d.getPrice(), c28655q, i18), null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getH5(), null, c28655q, 0, i19, 196602);
                c28655q = c28655q;
                strikethroughPrice = c14666d.getStrikethroughPrice();
                if (strikethroughPrice == null) {
                    c28655q.m87150e0(-1959484443);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1959484442);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(strikethroughPrice, c28655q, i18), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, C36776l.f157353d, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB4(), null, c28655q, 100663296, i19, 196346);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                if (c14666d.getHideQuantity()) {
                    z13 = true;
                    viewState = c14666d;
                    c28655q.m87150e0(-1958267940);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1959117464);
                    if (c14666d.getIsNotEditable()) {
                        c28655q.m87150e0(-1959088045);
                        viewState = c14666d;
                        m41903q(null, AbstractC37817c.m121344e(875538339, c28655q, new C13242h(viewState, 15)), c28655q, 48, 1);
                        c28655q.m87173q(false);
                        z14 = false;
                        z13 = true;
                    } else {
                        viewState = c14666d;
                        c28655q.m87150e0(-1958750796);
                        z14 = false;
                        z13 = true;
                        m41897k(viewState.getQuantity(), viewState.getMinQuantity(), viewState.getMaxQuantity(), viewState.getIsUpdating(), viewState.getLineItemId(), viewState.getAnalyticsLabel(), onViewEvent, c28655q, (i16 << 15) & 3670016);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(z13);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13917c(i13, i14, 7, viewState, modifier3, onViewEvent);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f18 = 8;
            float f19 = 1.5f * f18;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, modifier4), 2 * f18, f19);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f19), C2299e.f9107J, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            float f110 = 4;
            float f111 = 20 * f110;
            i16 = i15;
            float f112 = 1;
            Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(f111, c2314t), f112, f110);
            c38072d = C38072d.f163053a;
            i17 = C38072d.f163054b;
            Modifier modifier6 = modifier4;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM53364e2, c38072d.m121949b(c28655q, i17).getBrandWhite(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            AbstractC26867a.m80219b(C1100b.f4583a, c14666d.getImage(), c14666d.m41916l(), AbstractC1102d.m3419p(f111, c2314t), null, c28655q, 3078 | (AbstractC22403o.f87638a << 3), 8);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(0.5f * f18), C2299e.f9110M, c28655q, 6);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N7);
            TextResource title2 = c14666d.getTitle();
            i18 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(title2, c28655q, i18);
            C2886a c2886aM8438s2 = c38072d.m121952e(c28655q, i17).getH5();
            long jM125430y2 = c38072d.m121949b(c28655q, i17).getBrandWhite();
            i19 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s2, null, c28655q, 0, i19, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c14666d.getSubtitle(), c28655q, i18), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB4(), null, c28655q, 0, i19, 196602);
            c28655q.m87173q(true);
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(f112, f18, C2299e.f9112O, c28655q, 54);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N8);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c14666d.getPrice(), c28655q, i18), null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getH5(), null, c28655q, 0, i19, 196602);
            c28655q = c28655q;
            strikethroughPrice = c14666d.getStrikethroughPrice();
            if (strikethroughPrice == null) {
                c28655q.m87150e0(-1959484443);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1959484442);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(strikethroughPrice, c28655q, i18), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, C36776l.f157353d, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB4(), null, c28655q, 100663296, i19, 196346);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            if (c14666d.getHideQuantity()) {
                c28655q.m87150e0(-1959117464);
                if (c14666d.getIsNotEditable()) {
                    c28655q.m87150e0(-1959088045);
                    viewState = c14666d;
                    m41903q(null, AbstractC37817c.m121344e(875538339, c28655q, new C13242h(viewState, 15)), c28655q, 48, 1);
                    c28655q.m87173q(false);
                    z14 = false;
                    z13 = true;
                } else {
                    viewState = c14666d;
                    c28655q.m87150e0(-1958750796);
                    z14 = false;
                    z13 = true;
                    m41897k(viewState.getQuantity(), viewState.getMinQuantity(), viewState.getMaxQuantity(), viewState.getIsUpdating(), viewState.getLineItemId(), viewState.getAnalyticsLabel(), onViewEvent, c28655q, (i16 << 15) & 3670016);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
            } else {
                z13 = true;
                viewState = c14666d;
                c28655q.m87150e0(-1958267940);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(z13);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 7, viewState, modifier3, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m41895i(C14666d c14666d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strValueOf = String.valueOf(c14666d.getQuantity());
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strValueOf, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m41896j(C14666d c14666d, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m41894h(c14666d, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m41897k(int i13, int i14, int i15, boolean z4, String str, String str2, Function1 function1, Composer composer, int i16) {
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1571279551);
        if ((i16 & 6) == 0) {
            i17 = (c28655q.m87149e(i13) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= c28655q.m87149e(i14) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i17 |= c28655q.m87149e(i15) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i16 & 24576) == 0) {
            i17 |= c28655q.m87153g(str) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i16) == 0) {
            i17 |= c28655q.m87153g(str2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i16) == 0) {
            i17 |= c28655q.m87157i(function1) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i17 & 1, (599187 & i17) != 599186)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(8 * 0.5f), C2299e.f9107J, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            boolean z13 = !z4 && i13 > i14;
            if (i13 == 1) {
                c28655q.m87150e0(-531089870);
                m41900n(z13, new InterfaceC13383c.f(str, str2), function1, C14667e.f54169a.m41929f(), c28655q, ((i17 >> 12) & 896) | 3072);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-530529731);
                m41900n(z13, new InterfaceC13383c.g(str, i13 - 1, EnumC13389i.DECREMENT, str2), function1, C14667e.f54169a.m41927d(), c28655q, ((i17 >> 12) & 896) | 3072);
                c28655q.m87173q(false);
            }
            m41903q(null, AbstractC37817c.m121344e(-816710102, c28655q, new C13849c0((byte) 0, i13, 9)), c28655q, 48, 1);
            m41900n(!z4 && i13 < i15, new InterfaceC13383c.g(str, i13 + 1, EnumC13389i.INCREMENT, str2), function1, C14667e.f54169a.m41928e(), c28655q, ((i17 >> 12) & 896) | 3072);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0342d(i13, i14, i15, z4, str, str2, function1, i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m41898l(int i13, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            String strValueOf = String.valueOf(i13);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strValueOf, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m41899m(int i13, int i14, int i15, boolean z4, String str, String str2, Function1 function1, int i16, Composer composer, int i17) {
        m41897k(i13, i14, i15, z4, str, str2, function1, composer, AbstractC28683x.m87244L(i16 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m41900n(boolean z4, Object obj, Function1 function1, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1896233102);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(obj) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            Modifier modifierM107879c = AbstractC34132o.m107879c(z4 ? 1.0f : 0.4f, C2314t.f9131w);
            boolean zM87157i = c28655q.m87157i(obj) | ((i15 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C11439d(function1, obj, 3);
                c28655q.m87172p0(objM87133R);
            }
            m41903q(AbstractC1092a.m3362g(modifierM107879c, z4, null, null, (InterfaceC4339a) objM87133R, 14), interfaceC4351m, c28655q, (i15 >> 6) & 112, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(z4, obj, function1, interfaceC4351m, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m41901o(Function1 function1, Object obj) {
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m41902p(boolean z4, Object obj, Function1 function1, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m41900n(z4, obj, function1, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m41903q(Modifier modifier, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(547129994);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC4351m) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier3 = i16 != 0 ? c2314t : modifier;
            float f13 = 4;
            Modifier modifierMo3471e = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3419p(10 * f13, c2314t), 1, f13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), AbstractC17918w0.f69621a).mo3471e(modifier3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            AbstractC11895b.m32007z((i15 >> 3) & 14, interfaceC4351m, c28655q, true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14664b(modifier2, interfaceC4351m, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m41904r(Modifier modifier, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m41903q(modifier, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

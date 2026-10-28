package zv2;

import a81.C0561l;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2561k6;
import b91.C2886a;
import b91.InterfaceC2887b;
import c31.C3922f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9785i;
import com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxConfirmDialog;
import com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxMeasurementModel;
import com.whoop.whoopaction.domain.models.Action;
import fg2.C14463e;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j11.AbstractC21211n;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.List;
import kd1.C22411w;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17918w0;
import p208i2.C17924z0;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p292l1.C23108i;
import p294l3.C23245b0;
import p294l3.C23248d;
import p294l3.C23254g;
import p294l3.C23267m0;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.C32096b;
import p490t0.C33252i;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p579wc.C37082e1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33229w0;
import qr2.AbstractC30556a;
import qz0.AbstractC30784c;
import qz0.AbstractC30787f;
import qz0.AbstractC30795n;
import tr2.InterfaceC34116n;
import u31.AbstractC34504e;
import vv2.C36538d;
import wb3.AbstractC37056f;
import x81.C38072d;
import xb3.C38173h;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39410n;
import yb3.C39412p;
import yb3.InterfaceC39407k;
import yv2.C39809c;
import yv2.EnumC39807a;
import z51.C40103n;
import zi1.C40674e0;
import zm1.C40893d;
import zr1.C41067a;

/* JADX INFO: renamed from: zv2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001aw\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aK\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0000¢\u0006\u0004\b \u0010!\u001a1\u0010$\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010%\u001a)\u0010(\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0001¢\u0006\u0004\b(\u0010)\u001a[\u00102\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0013H\u0001¢\u0006\u0004\b2\u00103\u001a/\u00106\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u00104\u001a\u00020\f2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003¢\u0006\u0004\b6\u00107\u001a5\u00108\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0013H\u0003¢\u0006\u0004\b8\u00109\u001aK\u0010?\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0:2\u0006\u0010<\u001a\u00020\"2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010>\u001a\u00020\u0000H\u0003¢\u0006\u0004\b?\u0010@\u001ae\u0010G\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010B\u001a\u00020.2\u0006\u0010C\u001a\u00020\f2\u0006\u0010E\u001a\u00020D2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0013H\u0001¢\u0006\u0004\bG\u0010H\u001aa\u0010P\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010I\u001a\u0004\u0018\u00010\f2\u0006\u0010J\u001a\u00020\f2\b\u0010K\u001a\u0004\u0018\u00010\f2\u0006\u0010L\u001a\u00020.2\u0006\u0010M\u001a\u00020.2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0001¢\u0006\u0004\bP\u0010Q\"\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T\"\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010(\"\u0014\u0010Z\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010(\"\u0014\u0010\\\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010(\"\u0014\u0010^\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010(\"\u0014\u0010`\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010(\"\u0014\u0010b\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010(\"\u0014\u0010d\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010(\"\u0014\u0010f\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010(\"\u001a\u0010j\u001a\u00020V8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010(\u001a\u0004\bh\u0010i\"\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020l0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n\"\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006t"}, m65681d2 = {"Lb91/a;", "O", "(Landroidx/compose/runtime/Composer;I)Lb91/a;", "Landroidx/compose/ui/Modifier;", "modifier", "Lzv2/i;", "pendingConfirm", "Lzv2/b;", "saveConfirmDialog", "deleteConfirmDialog", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "bindableSource", "", "selectedDateIso", "valueText", "unit", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "Lkotlin/Function1;", "", "onViewEvent", "q", "(Landroidx/compose/ui/Modifier;Lzv2/i;Lzv2/b;Lzv2/b;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "valuePrompt", "description", "Ll3/b0;", "bodyParagraphStyle", "Ll3/m0;", "bodyStyle", "valueStyle", "Ll3/g;", "Q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll3/b0;Ll3/m0;Ll3/m0;)Ll3/g;", "", "value", "P", "(Ljava/lang/String;ILjava/lang/String;Ll3/m0;)Ll3/g;", "title", "name", "F", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "sectionTitle", "prompt", "Lyv2/c;", "wheelState", "", "isExpanded", "onChipClick", "onDateChanged", "x", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lyv2/c;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", HttpHeaders.DATE, "onClick", "v", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "A", "(Landroidx/compose/ui/Modifier;Lyv2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "values", "selectedPage", "onIndexSelected", "textStyle", "D", "(Landroidx/compose/ui/Modifier;Ljava/util/List;ILkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;II)V", "valueTitle", "isError", "errorMessage", "Lj0/i;", "interactionSource", "onValueChanged", "J", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lj0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "caption", "saveButtonTitle", "deleteButtonTitle", "saveEnabled", "deleteEnabled", "onSaveClick", "onDeleteClick", "H", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lyb3/p;", "a", "Lyb3/p;", "VALUE_PROMPT_PLACEHOLDERS", "Ly3/f;", "b", "SECTION_CONTENT_SPACING", "c", "SUMMARY_SPACING", "d", "SUMMARY_CARD_PADDING", "e", "CHIP_HORIZONTAL_PADDING", "f", "CHIP_HEIGHT", "g", "VALUE_ROW_SPACING", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "FOOTER_SPACING", "i", "FOOTER_BUTTON_SPACING", "j", "getWHEEL_ITEM_HEIGHT", "()F", "WHEEL_ITEM_HEIGHT", "Ld0/e2;", "Ly3/l;", "k", "Ld0/e2;", "dateWheelSizeSpec", "Ltr2/n;", "l", "Ltr2/n;", "logger", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41172h {

    /* JADX INFO: renamed from: b */
    private static final float f177629b;

    /* JADX INFO: renamed from: c */
    private static final float f177630c;

    /* JADX INFO: renamed from: d */
    private static final float f177631d;

    /* JADX INFO: renamed from: e */
    private static final float f177632e;

    /* JADX INFO: renamed from: f */
    private static final float f177633f;

    /* JADX INFO: renamed from: g */
    private static final float f177634g;

    /* JADX INFO: renamed from: h */
    private static final float f177635h;

    /* JADX INFO: renamed from: i */
    private static final float f177636i;

    /* JADX INFO: renamed from: j */
    private static final float f177637j;

    /* JADX INFO: renamed from: a */
    private static final C39412p f177628a = new C39412p("%1\\$d|%2\\$s");

    /* JADX INFO: renamed from: k */
    private static final C11347e2 f177638k = AbstractC11348f.m30574v(270, 0, AbstractC11333b0.f36310a, 2);

    /* JADX INFO: renamed from: l */
    private static final InterfaceC34116n f177639l = InterfaceC34116n.INSTANCE.m107848a("OneRepMaxMeasurementSections");

    static {
        float f13 = 8;
        float f14 = ((float) 1.5d) * f13;
        f177629b = f14;
        f177630c = ((float) 0.5d) * f13;
        f177631d = f14;
        float f15 = 1 * f13;
        f177632e = f15;
        float f16 = 4;
        f177633f = f13 * f16;
        f177634g = f15;
        f177635h = f14;
        f177636i = f15;
        f177637j = 10 * f16;
    }

    /* JADX INFO: renamed from: A */
    private static final void m133780A(Modifier modifier, C39809c c39809c, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1858365976);
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
            i15 |= c28655q.m87157i(c39809c) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM3495a = AbstractC1129a.m3495a(AbstractC1102d.m3409f(1.0f, modifier2), C41165a.f177582w, null);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3495a);
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
            Modifier modifier3 = modifier2;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f177637j, AbstractC1102d.m3409f(1.0f, c2314t)), C22411w.f87680a.m64536b().m64090c()), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), AbstractC17918w0.f69621a), c28655q, 0);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C2886a c2886aM133794O = m133794O(c28655q, 0);
            c28655q.m87150e0(-117048434);
            for (EnumC39807a enumC39807a : c39809c.m127619e()) {
                c28655q.m87144b0(867111099, enumC39807a);
                float columnWeight = enumC39807a.getColumnWeight();
                if (columnWeight <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(columnWeight <= Float.MAX_VALUE ? columnWeight : Float.MAX_VALUE, true);
                List<String> listM127621h = c39809c.m127621h(enumC39807a);
                int iM127622i = c39809c.m127622i(enumC39807a);
                boolean zM87157i = ((i17 & 896) == 256) | c28655q.m87157i(c39809c) | c28655q.m87149e(enumC39807a.ordinal());
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C37082e1(function1, c39809c, enumC39807a, 27);
                    c28655q.m87172p0(objM87133R);
                }
                m133783D(layoutWeightElement, listM127621h, iM127622i, (Function1) objM87133R, c2886aM133794O, c28655q, C2886a.f11498d << 12, 0);
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(modifier2, c39809c, function1, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m133781B(Function1 function1, C39809c c39809c, EnumC39807a enumC39807a, int i13) {
        function1.invoke(c39809c.m127624k(enumC39807a, i13).getSelectedIso());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m133782C(Modifier modifier, C39809c c39809c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m133780A(modifier, c39809c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m133783D(Modifier modifier, List<String> list, int i13, Function1 function1, C2886a c2886a, Composer composer, int i14, int i15) {
        Modifier modifier2;
        int i16;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-699941004);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= (32768 & i14) == 0 ? c28655q.m87153g(c2886a) : c28655q.m87157i(c2886a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 9363) != 9362)) {
            Modifier modifier4 = i17 != 0 ? C2314t.f9131w : modifier2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC34504e.m109045j(C23016z.f90757a, list, i13, c2886a, f177637j, 0, true, null, false, true, function1, null, c28655q, (i16 & 112) | 907567110 | (i16 & 896) | (C2886a.f11498d << 9) | ((i16 >> 3) & 7168), (i16 >> 9) & 14, 1104);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33229w0(modifier3, list, i13, function1, c2886a, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m133784E(Modifier modifier, List list, int i13, Function1 function1, C2886a c2886a, int i14, int i15, Composer composer, int i16) {
        m133783D(modifier, list, i13, function1, c2886a, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    public static final void m133785F(Modifier modifier, String title, String name, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(name, "name");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(280438843);
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
            i15 |= c28655q2.m87153g(title) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(name) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier4), C22411w.f87680a.m64536b().m64090c());
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f177631d, AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q2, i17).getWhite10(), AbstractC17918w0.f69621a));
            C22949e c22949e = AbstractC22977m.f90650a;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f177630c), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
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
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(title, null, c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getH5(), null, c28655q2, (i15 >> 3) & 14, i18, 196602);
            AbstractC30795n.m94707h(name, null, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q2, i17).getB1(), null, c28655q2, (i15 >> 6) & 14, i18 | 3120, 186362);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2561k6(modifier3, title, name, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m133786G(Modifier modifier, String str, String str2, int i13, int i14, Composer composer, int i15) {
        m133785F(modifier, str, str2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    public static final void m133787H(Modifier modifier, String str, String saveButtonTitle, String str2, boolean z4, boolean z13, InterfaceC4339a onSaveClick, InterfaceC4339a onDeleteClick, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        Modifier modifier4;
        C0209i c0209i;
        C0213j c0213j;
        C0209i c0209i2;
        C0209i c0209i3;
        C2314t c2314t;
        boolean z14;
        boolean z15;
        AbstractC22676k.m65750j(saveButtonTitle, "saveButtonTitle");
        AbstractC22676k.m65750j(onSaveClick, "onSaveClick");
        AbstractC22676k.m65750j(onDeleteClick, "onDeleteClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1144231808);
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
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(saveButtonTitle) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(str2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q.m87157i(onSaveClick) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q.m87157i(onDeleteClick) ? 8388608 : 4194304;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 4793491) != 4793490)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier5 = i16 != 0 ? c2314t2 : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier5);
            C22949e c22949e = AbstractC22977m.f90650a;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f177635h), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            if (str == null) {
                c28655q.m87150e0(1471785900);
                c28655q.m87173q(false);
                z14 = false;
                c0209i2 = c0209i6;
                modifier4 = modifier5;
                c0209i3 = c0209i5;
                c2314t = c2314t2;
                c0209i = c0209i4;
                c0213j = c0213j2;
            } else {
                c28655q.m87150e0(1471785901);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                modifier4 = modifier5;
                c0209i = c0209i4;
                c0213j = c0213j2;
                c0209i2 = c0209i6;
                c0209i3 = c0209i5;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i18).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                z14 = false;
                c28655q.m87173q(false);
            }
            if (str2 == null) {
                c28655q = c28655q;
                c28655q.m87150e0(1472027763);
                int i19 = i17 >> 9;
                AbstractC27292z.m82343j(null, z4, false, null, null, null, new TextResource.C8691e(saveButtonTitle), null, null, null, 0.0f, null, null, onSaveClick, c28655q, (i19 & 112) | (TextResource.C8691e.f25898b << 18), i19 & 7168, 8125);
                c28655q.m87173q(false);
                z15 = true;
            } else {
                c28655q = c28655q;
                c28655q.m87150e0(1472245290);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f177636i), C2299e.f9107J, c28655q, 6);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                TextResource.C8691e c8691e = new TextResource.C8691e(str2);
                int i24 = TextResource.C8691e.f25898b;
                C28655q c28655q2 = c28655q;
                AbstractC27271o0.m82253b(layoutWeightElement, z13, c8691e, null, null, null, null, null, false, null, onDeleteClick, c28655q2, ((i17 >> 12) & 112) | (i24 << 6), (i17 >> 21) & 14, MessageListItemViewType.UNREAD_SEPARATOR);
                c28655q = c28655q2;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                int i25 = i17 >> 9;
                AbstractC27292z.m82343j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), z4, false, null, null, null, new TextResource.C8691e(saveButtonTitle), null, null, null, 0.0f, null, null, onSaveClick, c28655q, (i25 & 112) | (i24 << 18), i25 & 7168, 8124);
                z15 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z15);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9785i(modifier3, str, saveButtonTitle, str2, z4, z13, onSaveClick, onDeleteClick, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m133788I(Modifier modifier, String str, String str2, String str3, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m133787H(modifier, str, str2, str3, z4, z13, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public static final void m133789J(Modifier modifier, String sectionTitle, String valueTitle, String valueText, String unit, boolean z4, String errorMessage, InterfaceC21083i interactionSource, Function1 onValueChanged, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(sectionTitle, "sectionTitle");
        AbstractC22676k.m65750j(valueTitle, "valueTitle");
        AbstractC22676k.m65750j(valueText, "valueText");
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(interactionSource, "interactionSource");
        AbstractC22676k.m65750j(onValueChanged, "onValueChanged");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-911033362);
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
            i15 |= c28655q.m87153g(sectionTitle) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(valueTitle) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(valueText) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87153g(unit) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87155h(z4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q.m87153g(errorMessage) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q.m87153g(interactionSource) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= c28655q.m87157i(onValueChanged) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 38347923) != 38347922)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            C22949e c22949e = AbstractC22977m.f90650a;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f177629b), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            Modifier modifier4 = modifier2;
            AbstractC17755i2.m50938j(null, null, null, new TextResource.C8691e(sectionTitle), null, 0L, 0L, null, c28655q, TextResource.C8691e.f25898b << 9, 247);
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            AbstractC30795n.m94707h(valueTitle, null, c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getH5(), null, c28655q, (i17 >> 6) & 14, C2886a.f11498d << 18, 196602);
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "one_rep_max_value_field");
            TextResource textResourceM21278l = AbstractC8693b.m21278l(valueText);
            AbstractC30784c.c cVar = new AbstractC30784c.c(AbstractC8693b.m21278l(unit), null, 2, 0 == true ? 1 : 0);
            TextResource textResourceM21278l2 = z4 ? AbstractC8693b.m21278l(errorMessage) : AbstractC8693b.m21267a();
            C33252i c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40674e0(16);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z13 = (i17 & 234881024) == 67108864;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C41067a(onValueChanged, 4);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C40893d(19);
                c28655q.m87172p0(objM87133R3);
            }
            int i19 = TextResource.$stable;
            AbstractC30787f.m94664c(modifierM3599a, textResourceM21278l, null, null, null, null, null, cVar, textResourceM21278l2, z4, null, false, 3, 0, 0, false, null, false, false, interactionSource, c33252iM64090c, null, null, null, null, false, interfaceC4339a, function1, (Function1) objM87133R3, c28655q, (i19 << 24) | (i19 << 3) | 6 | (AbstractC30784c.c.f126792d << 21) | ((i17 << 12) & 1879048192), ((i17 << 6) & 1879048192) | 384, 102236160, 65531004);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23108i(modifier3, sectionTitle, valueTitle, valueText, unit, z4, errorMessage, interactionSource, onValueChanged, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m133790K() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m133791L(Function1 function1, String it) throws IOException {
        AbstractC22676k.m65750j(it, "it");
        StringBuilder sb4 = new StringBuilder();
        int length = it.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = it.charAt(i13);
            if ('0' <= cCharAt && cCharAt < ':') {
                sb4.append(cCharAt);
            }
        }
        function1.invoke(sb4.toString());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m133792M(Double d3) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m133793N(Modifier modifier, String str, String str2, String str3, String str4, boolean z4, String str5, InterfaceC21083i interfaceC21083i, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m133789J(modifier, str, str2, str3, str4, z4, str5, interfaceC21083i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final C2886a m133794O(Composer composer, int i13) {
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        return new C2886a(C23285v0.m67364b(c38072d.m121952e(composer, i14).getN5().getStyle(), 0L, 0L, C28780r.f116539F, c38072d.m121952e(composer, i14).getB1().getStyle().f92255a.f92196f, 0L, 0, 0L, null, null, 16777179), InterfaceC2887b.b.f11502a);
    }

    /* JADX INFO: renamed from: P */
    private static final C23254g m133795P(String str, int i13, String str2, C23267m0 c23267m0) {
        try {
            C23248d c23248d = new C23248d();
            C38173h c38173h = new C38173h(C39412p.m125847b(str, f177628a));
            int i14 = 0;
            while (c38173h.hasNext()) {
                C39410n c39410n = (C39410n) ((InterfaceC39407k) c38173h.next());
                String strSubstring = str.substring(i14, c39410n.m125844b().f71133w);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                c23248d.m67300b(String.format(strSubstring, Arrays.copyOf(new Object[]{Integer.valueOf(i13), str2}, 2)));
                int iM67308j = c23248d.m67308j(c23267m0);
                try {
                    c23248d.m67300b(String.format(c39410n.m125845c(), Arrays.copyOf(new Object[]{Integer.valueOf(i13), str2}, 2)));
                    c23248d.m67304f(iM67308j);
                    i14 = c39410n.m125844b().f71134x + 1;
                } catch (Throwable th3) {
                    c23248d.m67304f(iM67308j);
                    throw th3;
                }
            }
            String strSubstring2 = str.substring(i14);
            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
            c23248d.m67300b(String.format(strSubstring2, Arrays.copyOf(new Object[]{Integer.valueOf(i13), str2}, 2)));
            return c23248d.m67309k();
        } catch (IllegalFormatException e5) {
            f177639l.mo85230v(AbstractC11266d.m30461o("Invalid one rep max value_prompt format: ", str), e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final C23254g m133796Q(String str, String description, String valueText, String unit, C23245b0 bodyParagraphStyle, C23267m0 bodyStyle, C23267m0 valueStyle) {
        C23254g c23254gM133795P;
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(valueText, "valueText");
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(bodyParagraphStyle, "bodyParagraphStyle");
        AbstractC22676k.m65750j(bodyStyle, "bodyStyle");
        AbstractC22676k.m65750j(valueStyle, "valueStyle");
        Integer numM125932Q = AbstractC39421y.m125932Q(valueText);
        if (numM125932Q == null) {
            return null;
        }
        int iIntValue = numM125932Q.intValue();
        if (str == null || (c23254gM133795P = m133795P(str, iIntValue, unit, valueStyle)) == null) {
            return null;
        }
        C23248d c23248d = new C23248d();
        int iM67307i = c23248d.m67307i(bodyParagraphStyle);
        try {
            int iM67308j = c23248d.m67308j(bodyStyle);
            try {
                c23248d.m67301c(c23254gM133795P);
                if (!AbstractC39414r.m125890i0(description)) {
                    c23248d.m67300b("\n\n");
                    c23248d.m67300b(description);
                }
                c23248d.m67304f(iM67308j);
                c23248d.m67304f(iM67307i);
                return c23248d.m67309k();
            } catch (Throwable th3) {
                c23248d.m67304f(iM67308j);
                throw th3;
            }
        } catch (Throwable th4) {
            c23248d.m67304f(iM67307i);
            throw th4;
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m133813q(Modifier modifier, final InterfaceC41173i interfaceC41173i, final C41166b saveConfirmDialog, final C41166b c41166b, final OneRepMaxMeasurementModel bindableSource, final String selectedDateIso, final String valueText, final String unit, final InterfaceC4339a onDismiss, final Function1 onViewEvent, Composer composer, final int i13, final int i14) {
        final Modifier modifier2;
        int i15;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        C41166b c41166b2;
        AbstractC22676k.m65750j(saveConfirmDialog, "saveConfirmDialog");
        AbstractC22676k.m65750j(bindableSource, "bindableSource");
        AbstractC22676k.m65750j(selectedDateIso, "selectedDateIso");
        AbstractC22676k.m65750j(valueText, "valueText");
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(156549052);
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
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(interfaceC41173i) : c28655q2.m87157i(interfaceC41173i) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(saveConfirmDialog) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(c41166b) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(bindableSource) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87153g(selectedDateIso) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q2.m87153g(valueText) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q2.m87153g(unit) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= c28655q2.m87157i(onDismiss) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i13) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 536870912 : 268435456;
        }
        int i17 = i15;
        if (c28655q2.m87135U(i17 & 1, (306783379 & i17) != 306783378)) {
            if (i16 != 0) {
                modifier2 = C2314t.f9131w;
            }
            if (interfaceC41173i == null) {
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i18 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: zv2.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        switch (i18) {
                            case 0:
                                return AbstractC41172h.m133817u(modifier2, interfaceC41173i, saveConfirmDialog, c41166b, bindableSource, selectedDateIso, valueText, unit, onDismiss, onViewEvent, i13, i14, composer2, ((Integer) obj2).intValue());
                            case 1:
                                return AbstractC41172h.m133814r(modifier2, interfaceC41173i, saveConfirmDialog, c41166b, bindableSource, selectedDateIso, valueText, unit, onDismiss, onViewEvent, i13, i14, composer2, ((Integer) obj2).intValue());
                            default:
                                return AbstractC41172h.m133815s(modifier2, interfaceC41173i, saveConfirmDialog, c41166b, bindableSource, selectedDateIso, valueText, unit, onDismiss, onViewEvent, i13, i14, composer2, ((Integer) obj2).intValue());
                        }
                    }
                };
            } else {
                if (interfaceC41173i.equals(InterfaceC41173i.b.f177641a)) {
                    c41166b2 = saveConfirmDialog;
                } else {
                    if (!interfaceC41173i.equals(InterfaceC41173i.a.f177640a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c41166b2 = c41166b;
                }
                if (c41166b2 == null) {
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u == null) {
                        return;
                    }
                    final int i19 = 2;
                    interfaceC4351m = new InterfaceC4351m() { // from class: zv2.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            switch (i19) {
                                case 0:
                                    return AbstractC41172h.m133817u(modifier2, interfaceC41173i, saveConfirmDialog, c41166b, bindableSource, selectedDateIso, valueText, unit, onDismiss, onViewEvent, i13, i14, composer2, ((Integer) obj2).intValue());
                                case 1:
                                    return AbstractC41172h.m133814r(modifier2, interfaceC41173i, saveConfirmDialog, c41166b, bindableSource, selectedDateIso, valueText, unit, onDismiss, onViewEvent, i13, i14, composer2, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC41172h.m133815s(modifier2, interfaceC41173i, saveConfirmDialog, c41166b, bindableSource, selectedDateIso, valueText, unit, onDismiss, onViewEvent, i13, i14, composer2, ((Integer) obj2).intValue());
                            }
                        }
                    };
                } else {
                    Modifier modifier3 = modifier2;
                    C38072d c38072d = C38072d.f163053a;
                    int i24 = C38072d.f163054b;
                    C23285v0 c23285v0M53377r = AbstractC18489d0.m53377r(c38072d, c28655q2, i24);
                    C23254g c23254gM133796Q = m133796Q(c41166b2.getValuePrompt(), c41166b2.getDescription(), valueText, unit, c23285v0M53377r.f92256b, C23267m0.m67325a(c23285v0M53377r.f92255a, c38072d.m121949b(c28655q2, i24).getWhite70(), null, 65534), new C23267m0(c38072d.m121949b(c28655q2, i24).getBrandWhite(), 0L, C28780r.f116542I, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65530));
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(c41166b2.getTitle());
                    TextResource textResourceM21278l2 = c23254gM133796Q == null ? AbstractC8693b.m21278l(c41166b2.getDescription()) : null;
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c41166b2.getPrimaryButton());
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(c41166b2.getSecondaryButton());
                    boolean zM87157i = c28655q2.m87157i(bindableSource) | ((458752 & i17) == 131072) | ((3670016 & i17) == 1048576) | ((i17 & 112) == 32 || ((i17 & 64) != 0 && c28655q2.m87157i(interfaceC41173i))) | ((1879048192 & i17) == 536870912) | ((234881024 & i17) == 67108864);
                    Object objM87133R = c28655q2.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        C0561l c0561l = new C0561l(bindableSource, selectedDateIso, valueText, interfaceC41173i, onViewEvent, onDismiss, 11);
                        c28655q2.m87172p0(c0561l);
                        objM87133R = c0561l;
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    int i25 = TextResource.$stable;
                    c28655q = c28655q2;
                    AbstractC21211n.m59497o(modifier3, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, true, null, null, null, null, textResourceM21278l4, null, false, false, null, null, false, 0, null, c23254gM133796Q, null, false, null, onDismiss, onDismiss, interfaceC4339a, null, null, null, c28655q, (i17 & 14) | 24576 | (i25 << 3) | (i25 << 6) | (i25 << 9) | (i25 << 27), 384, ((i17 >> 18) & 896) | ((i17 >> 15) & 7168), 238808544);
                    modifier2 = modifier3;
                }
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q = c28655q2;
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i26 = 0;
            interfaceC4351m = new InterfaceC4351m() { // from class: zv2.g
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    switch (i26) {
                        case 0:
                            return AbstractC41172h.m133817u(modifier2, interfaceC41173i, saveConfirmDialog, c41166b, bindableSource, selectedDateIso, valueText, unit, onDismiss, onViewEvent, i13, i14, composer2, ((Integer) obj2).intValue());
                        case 1:
                            return AbstractC41172h.m133814r(modifier2, interfaceC41173i, saveConfirmDialog, c41166b, bindableSource, selectedDateIso, valueText, unit, onDismiss, onViewEvent, i13, i14, composer2, ((Integer) obj2).intValue());
                        default:
                            return AbstractC41172h.m133815s(modifier2, interfaceC41173i, saveConfirmDialog, c41166b, bindableSource, selectedDateIso, valueText, unit, onDismiss, onViewEvent, i13, i14, composer2, ((Integer) obj2).intValue());
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m133814r(Modifier modifier, InterfaceC41173i interfaceC41173i, C41166b c41166b, C41166b c41166b2, OneRepMaxMeasurementModel oneRepMaxMeasurementModel, String str, String str2, String str3, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m133813q(modifier, interfaceC41173i, c41166b, c41166b2, oneRepMaxMeasurementModel, str, str2, str3, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m133815s(Modifier modifier, InterfaceC41173i interfaceC41173i, C41166b c41166b, C41166b c41166b2, OneRepMaxMeasurementModel oneRepMaxMeasurementModel, String str, String str2, String str3, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m133813q(modifier, interfaceC41173i, c41166b, c41166b2, oneRepMaxMeasurementModel, str, str2, str3, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m133816t(OneRepMaxMeasurementModel oneRepMaxMeasurementModel, String str, String str2, InterfaceC41173i interfaceC41173i, Function1 function1, InterfaceC4339a interfaceC4339a) {
        Action primaryAction;
        AnalyticEventModel analyticEvent;
        OneRepMaxConfirmDialog oneRepMaxConfirmDialogM133732I = AbstractC41169e.m133732I(oneRepMaxMeasurementModel, str, str2, interfaceC41173i instanceof InterfaceC41173i.a);
        if (oneRepMaxConfirmDialogM133732I != null && (analyticEvent = oneRepMaxConfirmDialogM133732I.getAnalyticEvent()) != null) {
            AbstractC13673n.m38578y(null, analyticEvent, function1);
        }
        if (oneRepMaxConfirmDialogM133732I != null && (primaryAction = oneRepMaxConfirmDialogM133732I.getPrimaryAction()) != null) {
            function1.invoke(primaryAction);
        }
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m133817u(Modifier modifier, InterfaceC41173i interfaceC41173i, C41166b c41166b, C41166b c41166b2, OneRepMaxMeasurementModel oneRepMaxMeasurementModel, String str, String str2, String str3, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m133813q(modifier, interfaceC41173i, c41166b, c41166b2, oneRepMaxMeasurementModel, str, str2, str3, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m133818v(Modifier modifier, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(332988472);
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
            i15 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            Object objM87133R = c28655q2.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f177633f, modifier3), C22411w.f87680a.m64537c().m64090c());
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str, AbstractC1102d.m3427x(AbstractC1099a.m3396r(AbstractC1092a.m3360e(AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q2, i17).getWhite10(), AbstractC17918w0.f69621a), interfaceC21083i, null, false, null, interfaceC4339a, 28), f177632e, 0.0f, 2), C2299e.f9108K, 2), c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d.m121952e(c28655q2, i17).getB2(), null, c28655q, (i15 >> 3) & 14, (C2886a.f11498d << 18) | 3072, 188408);
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14463e(i13, i14, 2, modifier2, interfaceC4339a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m133819w(Modifier modifier, String str, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m133818v(modifier, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m133820x(Modifier modifier, String sectionTitle, String prompt, C39809c wheelState, boolean z4, InterfaceC4339a onChipClick, Function1 onDateChanged, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C39809c c39809c;
        C28655q c28655q;
        Modifier modifier3;
        AbstractC22676k.m65750j(sectionTitle, "sectionTitle");
        AbstractC22676k.m65750j(prompt, "prompt");
        AbstractC22676k.m65750j(wheelState, "wheelState");
        AbstractC22676k.m65750j(onChipClick, "onChipClick");
        AbstractC22676k.m65750j(onDateChanged, "onDateChanged");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-999028582);
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
            i15 |= c28655q2.m87153g(sectionTitle) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(prompt) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(wheelState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87157i(onChipClick) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q2.m87157i(onDateChanged) ? 1048576 : 524288;
        }
        int i17 = i15;
        if (c28655q2.m87135U(i17 & 1, (i17 & 599187) != 599186)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            Modifier modifier5 = modifier4;
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f177629b), c2305k, c28655q2, 6);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            AbstractC17755i2.m50938j(null, null, null, new TextResource.C8691e(sectionTitle), null, 0L, 0L, null, c28655q2, TextResource.C8691e.f25898b << 9, 247);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f177634g), C2299e.f9108K, c28655q2, 54);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            AbstractC30795n.m94707h(prompt, layoutWeightElement, c38072d.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB2(), null, c28655q2, (i17 >> 6) & 14, C2886a.f11498d << 18, 196600);
            int i19 = i17 >> 9;
            m133818v(null, wheelState.getDisplayLabel(), onChipClick, c28655q2, i19 & 896, 1);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            C11347e2 c11347e2 = f177638k;
            c39809c = wheelState;
            AbstractC1090b.m3350e(C23016z.f90757a, z4, null, AbstractC3788w0.m11576d(c11347e2, null, 12).m11562a(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(198, 0, null, 6), 2)), AbstractC3788w0.m11584l(c11347e2, C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(198, 0, null, 6), 2)), null, AbstractC37817c.m121344e(-599522968, c28655q, new C36538d(22, c39809c, onDateChanged)), c28655q, 1600518 | (i19 & 112), 18);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c39809c = wheelState;
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3922f(modifier3, sectionTitle, prompt, c39809c, z4, onChipClick, onDateChanged, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m133821y(C39809c c39809c, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        m133780A(AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, f177629b, 0.0f, 0.0f, 13), c39809c, function1, composer, 6, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m133822z(Modifier modifier, String str, String str2, C39809c c39809c, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m133820x(modifier, str, str2, c39809c, z4, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

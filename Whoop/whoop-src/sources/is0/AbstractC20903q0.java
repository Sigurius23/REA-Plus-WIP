package is0;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm2.C3428b1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import es0.EnumC13588a;
import fo2.C14664b;
import gy0.AbstractC16272a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: is0.q0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001aK\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u0005*\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aI\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\" \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\" \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+¨\u00061²\u0006\f\u00100\u001a\u00020 8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "Lis0/e;", "comments", "Lcom/whoop/design/util/TextResource;", "summaryLabel", "", "surfacedIndex", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "l", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lcom/whoop/design/util/TextResource;ILc93/a;Landroidx/compose/runtime/Composer;II)V", "s", "(Lis0/e;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;", "content", "j", "(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "text", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "", "id", "name", "badge", "Les0/a;", "renderStyle", "Lcom/whoop/navigation/models/GenericInteraction;", "longPressAction", "t", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;)Lis0/e;", "Ly3/f;", "a", "F", "BUBBLE_MAX_WIDTH", "Lkotlin/time/Duration;", "b", "J", "PREVIEW_ROTATION_INTERVAL", "c", "Ljava/util/List;", "getPreviewLongThreadComments", "()Ljava/util/List;", "previewLongThreadComments", "d", "getPreviewComments", "previewComments", "bubbleOffset", "community-reactions-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20903q0 {

    /* JADX INFO: renamed from: a */
    private static final float f78725a = 60 * 4;

    /* JADX INFO: renamed from: b */
    private static final long f78726b;

    /* JADX INFO: renamed from: c */
    private static final List<C20878e> f78727c;

    /* JADX INFO: renamed from: d */
    private static final List<C20878e> f78728d;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f78726b = DurationKt.toDuration(1.5d, DurationUnit.SECONDS);
        ArrayList arrayList = new ArrayList(20);
        for (int i13 = 0; i13 < 20; i13++) {
            arrayList.add(m57896u(AbstractC2875y.m8295h(i13, "long"), AbstractC2875y.m8295h(i13, "Member "), AbstractC2875y.m8296i(i13, "Comment number ", " on this thread"), null, null, null, 56, null));
        }
        f78727c = arrayList;
        f78728d = AbstractC37056f.m118959K(m57896u("c1", "Natalie", "This was a tough one, glad we made it!", null, null, null, 56, null), C20878e.m57689b(m57896u("c2", "Marley", "🎉", null, null, null, 56, null), null, null, null, null, null, EnumC13588a.EMOJI_LARGE, null, false, 223, null), m57896u("c3", "Miracle", "Solid effort out there", null, null, null, 56, null));
    }

    /* JADX INFO: renamed from: h */
    private static final void m57883h(TextResource textResource, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1394690316);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, (i14 & 14) | TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q, 0, (C2886a.f11498d << 18) | 3120, 186362);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3428b1(textResource, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m57884i(TextResource textResource, int i13, Composer composer, int i14) {
        m57883h(textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m57885j(Modifier modifier, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(254684474);
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
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1091c.m3355a(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3411h(AbstractC20884h.m57713o(), AbstractC1136a.m3599a(modifier, "ReactionsBubble")), 3, 4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), AbstractC17918w0.f69621a), AbstractC11348f.m30574v(400, 0, null, 6), 2), ((float) 1.5d) * 8, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14664b(modifier2, interfaceC4351m, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m57886k(Modifier modifier, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m57885j(modifier, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:112:0x0200  */
    /* JADX WARN: Code duplicated, block: B:114:0x0237  */
    /* JADX WARN: Code duplicated, block: B:117:0x0244  */
    /* JADX WARN: Code duplicated, block: B:120:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:0x0177  */
    /* JADX INFO: renamed from: l */
    public static final void m57887l(Modifier modifier, final List<C20878e> comments, final TextResource textResource, int i13, InterfaceC4339a interfaceC4339a, Composer composer, final int i14, final int i15) {
        final Modifier modifier2;
        int i16;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a2;
        int i19;
        int i24;
        boolean z4;
        final TextResource textResource2;
        final int i25;
        final InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        final InterfaceC4339a interfaceC4339a4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        ArrayList arrayList;
        List list;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z15;
        C28677v1 c28677v1M87180u2;
        Object objM87133R3;
        AbstractC22676k.m65750j(comments, "comments");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1528080301);
        int i26 = i15 & 1;
        if (i26 != 0) {
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
            i16 |= c28655q.m87157i(comments) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 256 : 128;
        }
        int i27 = i15 & 8;
        if (i27 == 0) {
            if ((i14 & 3072) == 0) {
                i17 = i13;
                i16 |= c28655q.m87149e(i17) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i18 = i15 & 16;
            if (i18 != 0) {
                if ((i14 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i19;
                }
                i24 = i16;
                if ((i24 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i24 & 1, z4)) {
                    if (i26 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i27 != 0) {
                        i17 = 0;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C20886i(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    boolean zM87153g = c28655q.m87153g(comments);
                    if ((i24 & 896) != 256 || ((i24 & 512) != 0 && c28655q.m87153g(textResource))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87153g | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14 || objM87133R == c28676v0) {
                        arrayList = new ArrayList();
                        for (Object obj : comments) {
                            if (AbstractC8693b.m21270d(m57894s((C20878e) obj, textResource))) {
                                arrayList.add(obj);
                            }
                        }
                        objM87133R = AbstractC25265s.m74143q0(AbstractC25265s.m74158x1(3, arrayList));
                        c28655q.m87172p0(objM87133R);
                    }
                    list = (List) objM87133R;
                    if (list.isEmpty()) {
                        c28677v1M87180u2 = c28655q.m87180u();
                        if (c28677v1M87180u2 != null) {
                            final int i28 = 0;
                            final int i29 = i17;
                            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: is0.o0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj2, Object obj3) {
                                    switch (i28) {
                                        case 0:
                                            int iIntValue = ((Integer) obj3).intValue();
                                            return AbstractC20903q0.m57889n(modifier2, comments, textResource, i29, interfaceC4339a4, i14, i15, (Composer) obj2, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj3).intValue();
                                            return AbstractC20903q0.m57893r(modifier2, comments, textResource, i29, interfaceC4339a4, i14, i15, (Composer) obj2, iIntValue2);
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    textResource2 = textResource;
                    InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                    int i34 = i17;
                    Modifier modifier3 = modifier2;
                    int size = list.size();
                    int i35 = i34 % size;
                    final C20878e c20878e = (C20878e) list.get(i35 + (size & (((i35 ^ size) & ((-i35) | i35)) >> 31)));
                    InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(AbstractC20884h.m57715q(list.size()), AbstractC20884h.m57712n(), "reactionsBubbleOffset", c28655q, 432, 8);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier3, "ReactionsPreviewRow"));
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11266d.m30453g(c28655q);
                    }
                    Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3409f, (InterfaceC21083i) objM87133R2, null, false, null, interfaceC4339a5, 28);
                    C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, 8, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    AbstractC20884h.m57701c(null, list, i34, c28655q, (i24 >> 3) & 896, 1);
                    VerticalAlignElement verticalAlignElement = new VerticalAlignElement(C2299e.f9107J);
                    if (1.0f > 0.0d) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    m57885j(AbstractC1099a.m3392n(AbstractC1102d.m3425v(verticalAlignElement.mo3471e(new LayoutWeightElement(1.0f, false)), 0.0f, f78725a, 1), 0.0f, m57890o(interfaceC28670t2M30587a), 1), AbstractC37817c.m121344e(-1910223295, c28655q, new InterfaceC4351m() { // from class: is0.p0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            TextResource textResource3 = textResource2;
                            return AbstractC20903q0.m57891p(c20878e, textResource3, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, 48, 0);
                    c28655q.m87173q(true);
                    modifier2 = modifier3;
                    i25 = i34;
                    interfaceC4339a3 = interfaceC4339a5;
                } else {
                    textResource2 = textResource;
                    c28655q.m87138X();
                    i25 = i17;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i36 = 1;
                    final TextResource textResource3 = textResource2;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: is0.o0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (i36) {
                                case 0:
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return AbstractC20903q0.m57889n(modifier2, comments, textResource3, i25, interfaceC4339a3, i14, i15, (Composer) obj2, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    return AbstractC20903q0.m57893r(modifier2, comments, textResource3, i25, interfaceC4339a3, i14, i15, (Composer) obj2, iIntValue2);
                            }
                        }
                    };
                }
            }
            i16 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            i24 = i16;
            if ((i24 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                if (i26 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i27 != 0) {
                    i17 = 0;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C20886i(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                boolean zM87153g2 = c28655q.m87153g(comments);
                if ((i24 & 896) != 256) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                z14 = zM87153g2 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (AbstractC8693b.m21270d(m57894s((C20878e) obj, textResource))) {
                            arrayList.add(obj);
                        }
                    }
                    objM87133R = AbstractC25265s.m74143q0(AbstractC25265s.m74158x1(3, arrayList));
                    c28655q.m87172p0(objM87133R);
                } else {
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (AbstractC8693b.m21270d(m57894s((C20878e) obj, textResource))) {
                            arrayList.add(obj);
                        }
                    }
                    objM87133R = AbstractC25265s.m74143q0(AbstractC25265s.m74158x1(3, arrayList));
                    c28655q.m87172p0(objM87133R);
                }
                list = (List) objM87133R;
                if (list.isEmpty()) {
                    c28677v1M87180u2 = c28655q.m87180u();
                    if (c28677v1M87180u2 != null) {
                        final int i210 = 0;
                        final int i211 = i17;
                        c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: is0.o0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i210) {
                                    case 0:
                                        int iIntValue = ((Integer) obj3).intValue();
                                        return AbstractC20903q0.m57889n(modifier2, comments, textResource, i211, interfaceC4339a4, i14, i15, (Composer) obj2, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj3).intValue();
                                        return AbstractC20903q0.m57893r(modifier2, comments, textResource, i211, interfaceC4339a4, i14, i15, (Composer) obj2, iIntValue2);
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                textResource2 = textResource;
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                int i37 = i17;
                Modifier modifier4 = modifier2;
                int size2 = list.size();
                int i38 = i37 % size2;
                final C20878e c20878e2 = (C20878e) list.get(i38 + (size2 & (((i38 ^ size2) & ((-i38) | i38)) >> 31)));
                InterfaceC28670t2 interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(AbstractC20884h.m57715q(list.size()), AbstractC20884h.m57712n(), "reactionsBubbleOffset", c28655q, 432, 8);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsPreviewRow"));
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q);
                }
                Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM3409f2, (InterfaceC21083i) objM87133R2, null, false, null, interfaceC4339a6, 28);
                C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(1, 8, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3360e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                AbstractC20884h.m57701c(null, list, i37, c28655q, (i24 >> 3) & 896, 1);
                VerticalAlignElement verticalAlignElement2 = new VerticalAlignElement(C2299e.f9107J);
                if (1.0f > 0.0d) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                m57885j(AbstractC1099a.m3392n(AbstractC1102d.m3425v(verticalAlignElement2.mo3471e(new LayoutWeightElement(1.0f, false)), 0.0f, f78725a, 1), 0.0f, m57890o(interfaceC28670t2M30587a2), 1), AbstractC37817c.m121344e(-1910223295, c28655q, new InterfaceC4351m() { // from class: is0.p0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        TextResource textResource4 = textResource2;
                        return AbstractC20903q0.m57891p(c20878e2, textResource4, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 48, 0);
                c28655q.m87173q(true);
                modifier2 = modifier4;
                i25 = i37;
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                textResource2 = textResource;
                c28655q.m87138X();
                i25 = i17;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i39 = 1;
                final TextResource textResource4 = textResource2;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: is0.o0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i39) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC20903q0.m57889n(modifier2, comments, textResource4, i25, interfaceC4339a3, i14, i15, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC20903q0.m57893r(modifier2, comments, textResource4, i25, interfaceC4339a3, i14, i15, (Composer) obj2, iIntValue2);
                        }
                    }
                };
            }
        }
        i16 |= 3072;
        i17 = i13;
        i18 = i15 & 16;
        if (i18 != 0) {
            if ((i14 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i19;
            }
            i24 = i16;
            if ((i24 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                if (i26 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i27 != 0) {
                    i17 = 0;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C20886i(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                boolean zM87153g3 = c28655q.m87153g(comments);
                if ((i24 & 896) != 256) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                z14 = zM87153g3 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (AbstractC8693b.m21270d(m57894s((C20878e) obj, textResource))) {
                            arrayList.add(obj);
                        }
                    }
                    objM87133R = AbstractC25265s.m74143q0(AbstractC25265s.m74158x1(3, arrayList));
                    c28655q.m87172p0(objM87133R);
                } else {
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (AbstractC8693b.m21270d(m57894s((C20878e) obj, textResource))) {
                            arrayList.add(obj);
                        }
                    }
                    objM87133R = AbstractC25265s.m74143q0(AbstractC25265s.m74158x1(3, arrayList));
                    c28655q.m87172p0(objM87133R);
                }
                list = (List) objM87133R;
                if (list.isEmpty()) {
                    c28677v1M87180u2 = c28655q.m87180u();
                    if (c28677v1M87180u2 != null) {
                        final int i212 = 0;
                        final int i213 = i17;
                        c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: is0.o0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i212) {
                                    case 0:
                                        int iIntValue = ((Integer) obj3).intValue();
                                        return AbstractC20903q0.m57889n(modifier2, comments, textResource, i213, interfaceC4339a4, i14, i15, (Composer) obj2, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj3).intValue();
                                        return AbstractC20903q0.m57893r(modifier2, comments, textResource, i213, interfaceC4339a4, i14, i15, (Composer) obj2, iIntValue2);
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                textResource2 = textResource;
                InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                int i310 = i17;
                Modifier modifier5 = modifier2;
                int size3 = list.size();
                int i311 = i310 % size3;
                final C20878e c20878e3 = (C20878e) list.get(i311 + (size3 & (((i311 ^ size3) & ((-i311) | i311)) >> 31)));
                InterfaceC28670t2 interfaceC28670t2M30587a3 = AbstractC11352g.m30587a(AbstractC20884h.m57715q(list.size()), AbstractC20884h.m57712n(), "reactionsBubbleOffset", c28655q, 432, 8);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier5, "ReactionsPreviewRow"));
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q);
                }
                Modifier modifierM3360e3 = AbstractC1092a.m3360e(modifierM3409f3, (InterfaceC21083i) objM87133R2, null, false, null, interfaceC4339a7, 28);
                C22994r1 c22994r1M53376q3 = AbstractC18489d0.m53376q(1, 8, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3360e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                AbstractC20884h.m57701c(null, list, i310, c28655q, (i24 >> 3) & 896, 1);
                VerticalAlignElement verticalAlignElement3 = new VerticalAlignElement(C2299e.f9107J);
                if (1.0f > 0.0d) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                m57885j(AbstractC1099a.m3392n(AbstractC1102d.m3425v(verticalAlignElement3.mo3471e(new LayoutWeightElement(1.0f, false)), 0.0f, f78725a, 1), 0.0f, m57890o(interfaceC28670t2M30587a3), 1), AbstractC37817c.m121344e(-1910223295, c28655q, new InterfaceC4351m() { // from class: is0.p0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        TextResource textResource5 = textResource2;
                        return AbstractC20903q0.m57891p(c20878e3, textResource5, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 48, 0);
                c28655q.m87173q(true);
                modifier2 = modifier5;
                i25 = i310;
                interfaceC4339a3 = interfaceC4339a7;
            } else {
                textResource2 = textResource;
                c28655q.m87138X();
                i25 = i17;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i312 = 1;
                final TextResource textResource5 = textResource2;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: is0.o0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i312) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC20903q0.m57889n(modifier2, comments, textResource5, i25, interfaceC4339a3, i14, i15, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC20903q0.m57893r(modifier2, comments, textResource5, i25, interfaceC4339a3, i14, i15, (Composer) obj2, iIntValue2);
                        }
                    }
                };
            }
        }
        i16 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        i24 = i16;
        if ((i24 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i24 & 1, z4)) {
            if (i26 != 0) {
                modifier2 = C2314t.f9131w;
            }
            if (i27 != 0) {
                i17 = 0;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C20886i(13);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            boolean zM87153g4 = c28655q.m87153g(comments);
            if ((i24 & 896) != 256) {
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = zM87153g4 | z13;
            objM87133R = c28655q.m87133R();
            if (z14) {
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                    if (AbstractC8693b.m21270d(m57894s((C20878e) obj, textResource))) {
                        arrayList.add(obj);
                    }
                }
                objM87133R = AbstractC25265s.m74143q0(AbstractC25265s.m74158x1(3, arrayList));
                c28655q.m87172p0(objM87133R);
            } else {
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                    if (AbstractC8693b.m21270d(m57894s((C20878e) obj, textResource))) {
                        arrayList.add(obj);
                    }
                }
                objM87133R = AbstractC25265s.m74143q0(AbstractC25265s.m74158x1(3, arrayList));
                c28655q.m87172p0(objM87133R);
            }
            list = (List) objM87133R;
            if (list.isEmpty()) {
                c28677v1M87180u2 = c28655q.m87180u();
                if (c28677v1M87180u2 != null) {
                    final int i214 = 0;
                    final int i215 = i17;
                    c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: is0.o0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (i214) {
                                case 0:
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return AbstractC20903q0.m57889n(modifier2, comments, textResource, i215, interfaceC4339a4, i14, i15, (Composer) obj2, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    return AbstractC20903q0.m57893r(modifier2, comments, textResource, i215, interfaceC4339a4, i14, i15, (Composer) obj2, iIntValue2);
                            }
                        }
                    };
                    return;
                }
                return;
            }
            textResource2 = textResource;
            InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
            int i313 = i17;
            Modifier modifier6 = modifier2;
            int size4 = list.size();
            int i314 = i313 % size4;
            final C20878e c20878e4 = (C20878e) list.get(i314 + (size4 & (((i314 ^ size4) & ((-i314) | i314)) >> 31)));
            InterfaceC28670t2 interfaceC28670t2M30587a4 = AbstractC11352g.m30587a(AbstractC20884h.m57715q(list.size()), AbstractC20884h.m57712n(), "reactionsBubbleOffset", c28655q, 432, 8);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier6, "ReactionsPreviewRow"));
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30453g(c28655q);
            }
            Modifier modifierM3360e4 = AbstractC1092a.m3360e(modifierM3409f4, (InterfaceC21083i) objM87133R2, null, false, null, interfaceC4339a8, 28);
            C22994r1 c22994r1M53376q4 = AbstractC18489d0.m53376q(1, 8, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3360e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            AbstractC20884h.m57701c(null, list, i313, c28655q, (i24 >> 3) & 896, 1);
            VerticalAlignElement verticalAlignElement4 = new VerticalAlignElement(C2299e.f9107J);
            if (1.0f > 0.0d) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m57885j(AbstractC1099a.m3392n(AbstractC1102d.m3425v(verticalAlignElement4.mo3471e(new LayoutWeightElement(1.0f, false)), 0.0f, f78725a, 1), 0.0f, m57890o(interfaceC28670t2M30587a4), 1), AbstractC37817c.m121344e(-1910223295, c28655q, new InterfaceC4351m() { // from class: is0.p0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    TextResource textResource6 = textResource2;
                    return AbstractC20903q0.m57891p(c20878e4, textResource6, (Composer) obj2, iIntValue);
                }
            }), c28655q, 48, 0);
            c28655q.m87173q(true);
            modifier2 = modifier6;
            i25 = i313;
            interfaceC4339a3 = interfaceC4339a8;
        } else {
            textResource2 = textResource;
            c28655q.m87138X();
            i25 = i17;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i315 = 1;
            final TextResource textResource6 = textResource2;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: is0.o0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i315) {
                        case 0:
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC20903q0.m57889n(modifier2, comments, textResource6, i25, interfaceC4339a3, i14, i15, (Composer) obj2, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj3).intValue();
                            return AbstractC20903q0.m57893r(modifier2, comments, textResource6, i25, interfaceC4339a3, i14, i15, (Composer) obj2, iIntValue2);
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m57888m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m57889n(Modifier modifier, List list, TextResource textResource, int i13, InterfaceC4339a interfaceC4339a, int i14, int i15, Composer composer, int i16) {
        m57887l(modifier, list, textResource, i13, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final float m57890o(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m57891p(C20878e c20878e, TextResource textResource, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(400, 0, null, 6);
            C37816b c37816bM121344e = AbstractC37817c.m121344e(1061791769, c28655q, new C20906s(textResource, 1));
            int i14 = AbstractC22403o.f87638a;
            int i15 = TextResource.$stable;
            AbstractC29125c.m88520b(c20878e, null, c11347e2M30574v, "reactionsBubbleText", c37816bM121344e, c28655q, i14 | i15 | i15 | i15 | GenericInteraction.$stable | 28032, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m57892q(TextResource textResource, C20878e comment, Composer composer, int i13) {
        AbstractC22676k.m65750j(comment, "comment");
        if ((i13 & 6) == 0) {
            i13 |= (i13 & 8) == 0 ? ((C28655q) composer).m87153g(comment) : ((C28655q) composer).m87157i(comment) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            m57883h(m57894s(comment, textResource), c28655q, TextResource.$stable);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m57893r(Modifier modifier, List list, TextResource textResource, int i13, InterfaceC4339a interfaceC4339a, int i14, int i15, Composer composer, int i16) {
        m57887l(modifier, list, textResource, i13, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final TextResource m57894s(C20878e c20878e, TextResource textResource) {
        return AbstractC8693b.m21271e(c20878e.getText(), AbstractC8693b.m21272f(textResource));
    }

    /* JADX INFO: renamed from: t */
    public static final C20878e m57895t(String id4, String name, String text, String str, EnumC13588a renderStyle, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(renderStyle, "renderStyle");
        return new C20878e(id4, AbstractC22404p.m64502k(AbstractC16272a.f61957L3), AbstractC8693b.m21278l(name), AbstractC8693b.m21278l(text), str != null ? AbstractC8693b.m21278l(str) : null, renderStyle, genericInteraction, false, 128, null);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ C20878e m57896u(String str, String str2, String str3, String str4, EnumC13588a enumC13588a, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            str4 = null;
        }
        if ((i13 & 16) != 0) {
            enumC13588a = EnumC13588a.TEXT;
        }
        if ((i13 & 32) != 0) {
            genericInteraction = null;
        }
        return m57895t(str, str2, str3, str4, enumC13588a, genericInteraction);
    }
}

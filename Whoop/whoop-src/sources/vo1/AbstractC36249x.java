package vo1;

import a41.C0372h;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm0.C3412o;
import c41.C4063l1;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.items.CyclePhaseStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseLegendStyle;
import eh0.C13193b;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m81.AbstractC25230e;
import m81.C25232g;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.C27273p0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p208i2.C17893k;
import p238j0.C21084j;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p40.C28827b;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32632k2;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import ro1.AbstractC31638j;
import so1.AbstractC32815g0;
import so1.C32817h0;
import so1.C32819i0;
import to1.AbstractC34020m;
import uf0.C34904e;
import um0.C35076b;
import uv0.AbstractC35283c;
import v31.C35608d;
import wb3.AbstractC37056f;
import wo1.AbstractC37457k0;
import x81.C38072d;
import xn1.AbstractC38480c;
import y71.C39274g;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: vo1.x */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aU\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aC\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001c\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a)\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b\"\u0010#\u001a!\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020$H\u0003¢\u0006\u0004\b&\u0010'\"\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lso1/g0;", "viewState", "Lkotlin/Function1;", "Lto1/m;", "Ll83/a0;", "onViewEvent", "Lro1/j;", "onNavigationEvent", "Lyn1/a;", "onAnalyticEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lso1/g0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lso1/g0$c;", "C", "(Lso1/g0$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lso1/h0;", "educationContent", "Landroidx/compose/ui/Modifier;", "modifier", "t", "(Lso1/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkd1/o;", "imageUrl", "P", "(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lso1/i0;", "legendList", "M", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "legendText", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;", "legendStyle", "H", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;Landroidx/compose/runtime/Composer;II)V", "Li2/x;", "color", "J", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;JLandroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/models/items/CyclePhaseStyle;", "a", "Ljava/util/List;", "cyclePhasesList", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36249x {

    /* JADX INFO: renamed from: a */
    private static final List<CyclePhaseStyle> f155272a = AbstractC37056f.m118959K(CyclePhaseStyle.MENSTRUAL, CyclePhaseStyle.FOLLICULAR, CyclePhaseStyle.OVULATORY, CyclePhaseStyle.LUTEAL);

    /* JADX INFO: renamed from: vo1.x$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f155273a;

        static {
            int[] iArr = new int[PhaseLegendStyle.values().length];
            try {
                iArr[PhaseLegendStyle.DOTTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhaseLegendStyle.SHORT_LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhaseLegendStyle.LONG_LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhaseLegendStyle.ONE_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f155273a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m115603A(Function1 function1) {
        function1.invoke(new AbstractC34020m.a(null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m115604B(AbstractC32815g0 abstractC32815g0, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m115644w(abstractC32815g0, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x036b  */
    /* JADX WARN: Code duplicated, block: B:107:0x037c  */
    /* JADX WARN: Code duplicated, block: B:110:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:111:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:113:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:116:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0201  */
    /* JADX WARN: Code duplicated, block: B:83:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x031b  */
    /* JADX WARN: Code duplicated, block: B:89:0x031f  */
    /* JADX WARN: Code duplicated, block: B:96:0x033e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0369  */
    /* JADX WARN: Failed to calculate best type for var: r15v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v10 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v10 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v10 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v10 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v11 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v11 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v12 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v12 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 p1.q, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
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
    /* JADX INFO: renamed from: C */
    public static final void m115605C(AbstractC32815g0.c viewState, Function1 onViewEvent, Function1 onNavigationEvent, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Object obj;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Function1 function5;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        Object objM87133R2;
        int i16;
        float f13;
        int iHashCode2;
        int i17;
        int i18;
        int iHashCode3;
        boolean z14;
        Object objM87133R3;
        Function1 function6;
        InterfaceC28601c1 interfaceC28601c2;
        C28655q c28655q2;
        C32817h0 c32817h0;
        C25232g c25232g;
        String strM73976a;
        Object objM87133R4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1840209547);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87157i(onNavigationEvent) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q3.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == obj) {
                        objM87133R4 = new C36244s(7);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == obj) {
                    c25232g = (C25232g) AbstractC25265s.m74100H0(viewState.m102972c());
                    if (c25232g != null) {
                        strM73976a = c25232g.getButtonId();
                    } else {
                        strM73976a = null;
                    }
                    objM87133R = AbstractC28683x.m87272z(strM73976a);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                function5 = function4;
                c2314t = C2314t.f9131w;
                Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC30060g.m92116f0(AbstractC36243r.m115501L0(AbstractC1102d.m3407d(1.0f, c2314t), viewState.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q3, 0)), AbstractC30060g.m92099U(0, c28655q3, 1), 14));
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM66724m);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                TextResource textResourceM102975f = viewState.getNavigationTitle();
                C38072d c38072d = C38072d.f163053a;
                AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM102975f, null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q3, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q3.m87133R();
                if (z13 || objM87133R2 == obj) {
                    objM87133R2 = new C34904e(onNavigationEvent, 25);
                    c28655q3.m87172p0(objM87133R2);
                }
                i16 = i15;
                AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q3, AbstractC6721d.a.f25641r << 3, 53);
                float f14 = 4;
                float f15 = f14 * f14;
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f15, c2314t));
                float f16 = 2;
                f13 = 8 * f16;
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                i17 = i16 >> 3;
                m115618P(viewState.getPhaseImageUrl(), onViewEvent, function5, c28655q3, AbstractC22403o.f87638a | (i16 & 112) | (i17 & 896), 0);
                float f17 = f16 * f14;
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f17, c2314t));
                TextResource textResourceM102978i = viewState.getPhaseTitleDisplay();
                i18 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM102978i, c28655q3, i18);
                int i24 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, viewState.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q3, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i24).getT3(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f17, c2314t));
                m115615M(viewState.m102974e(), c28655q3, 0);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f15, c2314t));
                if (viewState.m102977h() != null) {
                    c28655q3.m87150e0(-2145581556);
                    AbstractC37457k0.m120001n(viewState.m102977h(), c28655q3, 0);
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(-2145507559);
                    c28655q3.m87173q(false);
                }
                AbstractC25012a.m73389v(c2314t, f15, c28655q3, true);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, c2314t);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
                List<C25232g> listM102972c = viewState.m102972c();
                String str = (String) interfaceC28601c1.getValue();
                long jM125430y = c38072d.m121949b(c28655q3, i24).getBrandWhite();
                C39174f c39174f = new C39174f(f15);
                if ((i16 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R3 = c28655q3.m87133R();
                if (!z14 || objM87133R3 == obj) {
                    function6 = function5;
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C28827b(function6, interfaceC28601c2, 12);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    function6 = function5;
                    interfaceC28601c2 = interfaceC28601c1;
                }
                AbstractC25230e.m73957m(listM102972c, str, jM125430y, c39174f, null, null, (Function1) objM87133R3, c28655q3, 3072, 48);
                c28655q2 = c28655q3;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
                c32817h0 = viewState.m102973d().get(interfaceC28601c2.getValue());
                if (c32817h0 != null) {
                    c28655q2.m87150e0(-41611921);
                    m115641t(c32817h0, onNavigationEvent, AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), c28655q2, i18 | C27273p0.f109116o | 384 | (i17 & 112), 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-41381808);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(r3);
                c28655q2.m87173q(true);
                function3 = function6;
                c28655q = c28655q2;
            } else {
                C28655q c28655q4 = c28655q3;
                c28655q4.m87138X();
                function3 = function2;
                c28655q = c28655q4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, onViewEvent, onNavigationEvent, function3, i13, i14, 22);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            obj = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == obj) {
                    objM87133R4 = new C36244s(7);
                    c28655q3.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q3.m87133R();
            if (objM87133R == obj) {
                c25232g = (C25232g) AbstractC25265s.m74100H0(viewState.m102972c());
                if (c25232g != null) {
                    strM73976a = c25232g.getButtonId();
                } else {
                    strM73976a = null;
                }
                objM87133R = AbstractC28683x.m87272z(strM73976a);
                c28655q3.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            function5 = function4;
            c2314t = C2314t.f9131w;
            Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC30060g.m92116f0(AbstractC36243r.m115501L0(AbstractC1102d.m3407d(1.0f, c2314t), viewState.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q3, 0)), AbstractC30060g.m92099U(0, c28655q3, 1), 14));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM66724m2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i5, c23010xM66775a4);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N4);
            TextResource textResourceM102975f2 = viewState.getNavigationTitle();
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM102975f2, null, AbstractC13673n.m38561h(c38072d2), AbstractC30060g.m92103Y(c28655q3, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q3.m87133R();
            if (z13) {
                objM87133R2 = new C34904e(onNavigationEvent, 25);
                c28655q3.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C34904e(onNavigationEvent, 25);
                c28655q3.m87172p0(objM87133R2);
            }
            i16 = i15;
            AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R2, null, null, c28655q3, AbstractC6721d.a.f25641r << 3, 53);
            float f18 = 4;
            float f19 = f18 * f18;
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f19, c2314t));
            float f110 = 2;
            f13 = 8 * f110;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2);
            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3396r2);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, c23010xM66775a5);
            AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N5);
            i17 = i16 >> 3;
            m115618P(viewState.getPhaseImageUrl(), onViewEvent, function5, c28655q3, AbstractC22403o.f87638a | (i16 & 112) | (i17 & 896), 0);
            float f111 = f110 * f18;
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f111, c2314t));
            TextResource textResourceM102978i2 = viewState.getPhaseTitleDisplay();
            i18 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM102978i2, c28655q3, i18);
            int i25 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h2, null, viewState.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q3, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i25).getT3(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f111, c2314t));
            m115615M(viewState.m102974e(), c28655q3, 0);
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f19, c2314t));
            if (viewState.m102977h() != null) {
                c28655q3.m87150e0(-2145581556);
                AbstractC37457k0.m120001n(viewState.m102977h(), c28655q3, 0);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-2145507559);
                c28655q3.m87173q(false);
            }
            AbstractC25012a.m73389v(c2314t, f19, c28655q3, true);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
            iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, c2314t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N6);
            List<C25232g> listM102972c2 = viewState.m102972c();
            String str2 = (String) interfaceC28601c1.getValue();
            long jM125430y2 = c38072d2.m121949b(c28655q3, i25).getBrandWhite();
            C39174f c39174f2 = new C39174f(f19);
            if ((i16 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R3 = c28655q3.m87133R();
            if (z14) {
                function6 = function5;
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R3 = new C28827b(function6, interfaceC28601c2, 12);
                c28655q3.m87172p0(objM87133R3);
            } else {
                function6 = function5;
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R3 = new C28827b(function6, interfaceC28601c2, 12);
                c28655q3.m87172p0(objM87133R3);
            }
            AbstractC25230e.m73957m(listM102972c2, str2, jM125430y2, c39174f2, null, null, (Function1) objM87133R3, c28655q3, 3072, 48);
            c28655q2 = c28655q3;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f19, c2314t));
            c32817h0 = viewState.m102973d().get(interfaceC28601c2.getValue());
            if (c32817h0 != null) {
                c28655q2.m87150e0(-41611921);
                m115641t(c32817h0, onNavigationEvent, AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), c28655q2, i18 | C27273p0.f109116o | 384 | (i17 & 112), 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-41381808);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(r3);
            c28655q2.m87173q(true);
            function3 = function6;
            c28655q = c28655q2;
        } else {
            C28655q c28655q5 = c28655q3;
            c28655q5.m87138X();
            function3 = function2;
            c28655q = c28655q5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(viewState, onViewEvent, onNavigationEvent, function3, i13, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m115606D(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m115607E(Function1 function1) {
        function1.invoke(AbstractC31638j.a.f130716a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m115608F(Function1 function1, InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(AbstractC39672a.u.f170769a);
        interfaceC28601c1.setValue(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m115609G(AbstractC32815g0.c cVar, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m115605C(cVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final void m115610H(Modifier modifier, TextResource textResource, PhaseLegendStyle phaseLegendStyle, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(776851148);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(phaseLegendStyle.ordinal()) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierMo3471e = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 1.25d) * 8, 0.0f, 11).mo3471e(modifier2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m115612J(phaseLegendStyle, 0L, c28655q, (i15 >> 6) & 14, 2);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable | ((i15 >> 3) & 14));
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier2, textResource, phaseLegendStyle, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m115611I(Modifier modifier, TextResource textResource, PhaseLegendStyle phaseLegendStyle, int i13, int i14, Composer composer, int i15) {
        m115610H(modifier, textResource, phaseLegendStyle, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX INFO: renamed from: J */
    private static final void m115612J(PhaseLegendStyle phaseLegendStyle, long j7, Composer composer, int i13, int i14) {
        int i15;
        long jM125430y;
        long j13;
        float f13;
        float f14;
        float f15;
        final float f16;
        final float f17;
        boolean zM87147d;
        Object objM87133R;
        float f18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-173113650);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87149e(phaseLegendStyle.ordinal()) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            jM125430y = j7;
            i15 |= ((i14 & 2) == 0 && c28655q.m87151f(jM125430y)) ? 32 : 16;
        } else {
            jM125430y = j7;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
            } else if ((i14 & 2) != 0) {
                jM125430y = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
                i15 &= -113;
            }
            final long j14 = jM125430y;
            c28655q.m87175r();
            int i16 = a.f155273a[phaseLegendStyle.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    f13 = 5;
                    f18 = 2;
                } else if (i16 == 3) {
                    f13 = 7;
                    f15 = 25;
                    f16 = 2;
                    f14 = 8;
                } else {
                    if (i16 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 0;
                    f18 = 5;
                }
                f16 = f18;
                f17 = 23;
                f14 = f13;
                Modifier modifierM3421r = AbstractC1102d.m3421r(C2314t.f9131w, 30, 20);
                zM87147d = ((((i15 & 112) ^ 48) <= 32 && c28655q.m87151f(j14)) || (i15 & 48) == 32) | c28655q.m87147d(f16) | c28655q.m87147d(f17) | c28655q.m87149e(1) | c28655q.m87147d(f13) | c28655q.m87147d(f14);
                objM87133R = c28655q.m87133R();
                if (zM87147d || objM87133R == C28635l.f115821a) {
                    final float f19 = f13;
                    final float f24 = f14;
                    Function1 function1 = new Function1() { // from class: vo1.w
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC36249x.m115613K(j14, f16, f17, 1, f19, f24, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function1);
                    objM87133R = function1;
                }
                AbstractC21478l0.m60421a(modifierM3421r, (Function1) objM87133R, c28655q, 0);
                j13 = j14;
            } else {
                f13 = 0;
                f14 = 7;
                f15 = 25;
                f16 = 5;
            }
            f17 = f15;
            Modifier modifierM3421r2 = AbstractC1102d.m3421r(C2314t.f9131w, 30, 20);
            zM87147d = ((((i15 & 112) ^ 48) <= 32 && c28655q.m87151f(j14)) || (i15 & 48) == 32) | c28655q.m87147d(f16) | c28655q.m87147d(f17) | c28655q.m87149e(1) | c28655q.m87147d(f13) | c28655q.m87147d(f14);
            objM87133R = c28655q.m87133R();
            if (zM87147d) {
                final float f110 = f13;
                final float f25 = f14;
                Function1 function2 = new Function1() { // from class: vo1.w
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC36249x.m115613K(j14, f16, f17, 1, f110, f25, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function2);
                objM87133R = function2;
            } else {
                final float f111 = f13;
                final float f26 = f14;
                Function1 function3 = new Function1() { // from class: vo1.w
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC36249x.m115613K(j14, f16, f17, 1, f111, f26, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function3);
                objM87133R = function3;
            }
            AbstractC21478l0.m60421a(modifierM3421r2, (Function1) objM87133R, c28655q, 0);
            j13 = j14;
        } else {
            c28655q.m87138X();
            j13 = jM125430y;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4063l1(i13, i14, 1, j13, phaseLegendStyle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m115613K(long j7, float f13, float f14, int i13, float f15, float f16, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float f17 = 10;
        Canvas.mo732d0(j7, (((long) Float.floatToRawIntBits(Canvas.mo743q0(f13))) << 32) | (((long) Float.floatToRawIntBits(Canvas.mo743q0(f17))) & 4294967295L), (((long) Float.floatToRawIntBits(Canvas.mo743q0(f14))) << 32) | (((long) Float.floatToRawIntBits(Canvas.mo743q0(f17))) & 4294967295L), (496 & 8) != 0 ? 0.0f : Canvas.mo743q0(2), (496 & 16) != 0 ? 0 : i13, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{Canvas.mo743q0(f15), Canvas.mo743q0(f16)}, 0.0f)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m115614L(PhaseLegendStyle phaseLegendStyle, long j7, int i13, int i14, Composer composer, int i15) {
        m115612J(phaseLegendStyle, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    public static final void m115615M(List<C32819i0> legendList, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(legendList, "legendList");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1183859014);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(legendList) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC22960g2.m66729a(null, null, AbstractC22977m.m66746i(2 * 4), null, 0, 0, AbstractC37817c.m121344e(-374774741, c28655q, new C13193b(legendList, 5)), c28655q, 1573248, 59);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(legendList, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m115616N(List list, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C32819i0 c32819i0 = (C32819i0) it.next();
                if (c32819i0.getStyle() != null) {
                    m115610H(null, c32819i0.getLabel(), c32819i0.getStyle(), c28655q, TextResource.$stable << 3, 1);
                }
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m115617O(List list, int i13, Composer composer, int i14) {
        m115615M(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0274  */
    /* JADX WARN: Code duplicated, block: B:104:0x027f  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0191  */
    /* JADX WARN: Code duplicated, block: B:62:0x0195  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x0202  */
    /* JADX WARN: Code duplicated, block: B:85:0x021a  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:89:0x022a  */
    /* JADX WARN: Code duplicated, block: B:90:0x022c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0234  */
    /* JADX WARN: Code duplicated, block: B:96:0x0239  */
    /* JADX WARN: Code duplicated, block: B:97:0x023e  */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01c0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r15v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX INFO: renamed from: P */
    public static final void m115618P(AbstractC22403o abstractC22403o, Function1 onViewEvent, Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        int i15;
        boolean z4;
        Function1 function3;
        Function1 function4;
        ?? r15;
        C28677v1 c28677v1M87180u;
        Object obj;
        Function1 function5;
        float f13;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C2314t c2314t2;
        C0209i c0209i4;
        C0209i c0209i5;
        C0209i c0209i6;
        Object obj2;
        int i16;
        ?? r10;
        float f14;
        ?? r16;
        C2314t c2314t3;
        int iHashCode2;
        ?? r14;
        float f15;
        ?? r17;
        ?? r18;
        int i17;
        ?? r19;
        ?? r24;
        Object objM87133R;
        Object obj3;
        Function1 function6;
        Object objM87133R2;
        Object obj4;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1371520909);
        int i18 = (i13 & 6) == 0 ? ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i18 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i18 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i15 = i18;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == obj) {
                        obj4 = objM87133R2;
                        C36244s c36244s = new C36244s(4);
                        c28655q.m87172p0(c36244s);
                        obj4 = c36244s;
                    }
                    obj4 = objM87133R2;
                    function5 = (Function1) obj4;
                } else {
                    function5 = function2;
                }
                f13 = 150;
                c2314t = C2314t.f9131w;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, 2 * 8, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                }
                c0209i3 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N);
                if (abstractC22403o != null) {
                    c28655q.m87150e0(1750191774);
                    Modifier modifierM3411h = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t));
                    c2314t2 = c2314t;
                    AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3);
                    C28655q c28655q2 = c28655q;
                    f13 = f13;
                    i16 = i15;
                    f14 = 1.0f;
                    c0209i4 = c0209i3;
                    obj2 = obj;
                    r10 = 0;
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i;
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM3411h, null, null, 0.0f, null, c28655q2, 432, 120);
                    c28655q2.m87173q(false);
                    r16 = c28655q2;
                } else {
                    c2314t2 = c2314t;
                    c0209i4 = c0209i3;
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i;
                    obj2 = obj;
                    i16 = i15;
                    r10 = 0;
                    f14 = 1.0f;
                    c28655q.m87150e0(1750427529);
                    c28655q.m87173q(false);
                    r16 = c28655q;
                }
                c2314t3 = c2314t2;
                Modifier modifierM3411h2 = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(f14, c2314t3));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r16, r10);
                iHashCode2 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r16.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r16, modifierM3411h2);
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, c0209i6, c22994r1M66759a);
                AbstractC28683x.m87239G(r16, c0209i7, interfaceC28653p1M87165m2);
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N2);
                r16.m87150e0(-1432171611);
                for (r14 = r10; r14 < 4; r14++) {
                    Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t3, f155272a.get(r14).name() + "_PHASE_EDUCATION_TAG");
                    if (r14 == 3) {
                        f15 = 2.0f;
                    } else {
                        f15 = f14;
                    }
                    if (f15 > 0.0d) {
                        r17 = 1;
                    } else {
                        r17 = r10;
                    }
                    if (r17 == 0) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (f15 > Float.MAX_VALUE) {
                        f15 = Float.MAX_VALUE;
                    }
                    Modifier modifierM3406c = AbstractC1102d.m3406c(f14, modifierM3599a.mo3471e(new LayoutWeightElement(f15, true)));
                    C21084j c21084j = new C21084j();
                    if ((i16 & 112) == 32) {
                        r18 = 1;
                    } else {
                        r18 = r10;
                    }
                    int i24 = r18 | (r16.m87149e(r14) ? 1 : 0);
                    i17 = i16;
                    if ((i17 & 896) == 256) {
                        r19 = 1;
                    } else {
                        r19 = r10;
                    }
                    r24 = i24 | r19;
                    objM87133R = r16.m87133R();
                    if (r24 == 0) {
                        obj3 = obj2;
                        if (objM87133R == obj3) {
                            function6 = function5;
                        }
                        AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierM3406c, c21084j, null, false, null, (InterfaceC4339a) objM87133R, 28), r16, r10);
                        obj2 = obj3;
                        i16 = i17;
                        function5 = function6;
                    } else {
                        obj3 = obj2;
                    }
                    function6 = function5;
                    objM87133R = new C0372h(onViewEvent, (int) r14, function6, 6);
                    r16.m87172p0(objM87133R);
                    AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierM3406c, c21084j, null, false, null, (InterfaceC4339a) objM87133R, 28), r16, r10);
                    obj2 = obj3;
                    i16 = i17;
                    function5 = function6;
                }
                function3 = onViewEvent;
                AbstractC25012a.m73392y(r16, r10, true, true);
                function4 = function5;
                r15 = r16;
            } else {
                function3 = onViewEvent;
                c28655q.m87138X();
                function4 = function2;
                r15 = c28655q;
            }
            c28677v1M87180u = r15.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d((Object) abstractC22403o, function3, (InterfaceC23459e) function4, i13, i14, 13);
            }
        }
        i18 |= 384;
        function2 = function1;
        i15 = i18;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            obj = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == obj) {
                    obj4 = objM87133R2;
                    C36244s c36244s2 = new C36244s(4);
                    c28655q.m87172p0(c36244s2);
                    obj4 = c36244s2;
                }
                obj4 = objM87133R2;
                function5 = (Function1) obj4;
            } else {
                function5 = function2;
            }
            f13 = 150;
            c2314t = C2314t.f9131w;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, 2 * 8, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m3);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            }
            c0209i3 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N3);
            if (abstractC22403o != null) {
                c28655q.m87150e0(1750191774);
                Modifier modifierM3411h3 = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t));
                c2314t2 = c2314t;
                AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3);
                C28655q c28655q3 = c28655q;
                f13 = f13;
                i16 = i15;
                f14 = 1.0f;
                c0209i4 = c0209i3;
                obj2 = obj;
                r10 = 0;
                c0209i5 = c0209i2;
                c0209i6 = c0209i;
                AbstractC29125c.m88522c(abstractC26165aM64500i2, null, modifierM3411h3, null, null, 0.0f, null, c28655q3, 432, 120);
                c28655q3.m87173q(false);
                r16 = c28655q3;
            } else {
                c2314t2 = c2314t;
                c0209i4 = c0209i3;
                c0209i5 = c0209i2;
                c0209i6 = c0209i;
                obj2 = obj;
                i16 = i15;
                r10 = 0;
                f14 = 1.0f;
                c28655q.m87150e0(1750427529);
                c28655q.m87173q(false);
                r16 = c28655q;
            }
            c2314t3 = c2314t2;
            Modifier modifierM3411h4 = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(f14, c2314t3));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r16, r10);
            iHashCode2 = Long.hashCode(r16.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = r16.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(r16, modifierM3411h4);
            r16.m87158i0();
            if (r16.f115903S) {
                r16.m87163l(c0213j);
            } else {
                r16.m87178s0();
            }
            AbstractC28683x.m87239G(r16, c0209i6, c22994r1M66759a2);
            AbstractC28683x.m87239G(r16, c0209i8, interfaceC28653p1M87165m4);
            if (r16.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N4);
            r16.m87150e0(-1432171611);
            while (r14 < 4) {
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t3, f155272a.get(r14).name() + "_PHASE_EDUCATION_TAG");
                if (r14 == 3) {
                    f15 = 2.0f;
                } else {
                    f15 = f14;
                }
                if (f15 > 0.0d) {
                    r17 = 1;
                } else {
                    r17 = r10;
                }
                if (r17 == 0) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (f15 > Float.MAX_VALUE) {
                    f15 = Float.MAX_VALUE;
                }
                Modifier modifierM3406c2 = AbstractC1102d.m3406c(f14, modifierM3599a2.mo3471e(new LayoutWeightElement(f15, true)));
                C21084j c21084j2 = new C21084j();
                if ((i16 & 112) == 32) {
                    r18 = 1;
                } else {
                    r18 = r10;
                }
                int i25 = r18 | (r16.m87149e(r14) ? 1 : 0);
                i17 = i16;
                if ((i17 & 896) == 256) {
                    r19 = 1;
                } else {
                    r19 = r10;
                }
                r24 = i25 | r19;
                objM87133R = r16.m87133R();
                if (r24 == 0) {
                    obj3 = obj2;
                    if (objM87133R == obj3) {
                        function6 = function5;
                    }
                    AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierM3406c2, c21084j2, null, false, null, (InterfaceC4339a) objM87133R, 28), r16, r10);
                    obj2 = obj3;
                    i16 = i17;
                    function5 = function6;
                } else {
                    obj3 = obj2;
                }
                function6 = function5;
                objM87133R = new C0372h(onViewEvent, (int) r14, function6, 6);
                r16.m87172p0(objM87133R);
                AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierM3406c2, c21084j2, null, false, null, (InterfaceC4339a) objM87133R, 28), r16, r10);
                obj2 = obj3;
                i16 = i17;
                function5 = function6;
            }
            function3 = onViewEvent;
            AbstractC25012a.m73392y(r16, r10, true, true);
            function4 = function5;
            r15 = r16;
        } else {
            function3 = onViewEvent;
            c28655q.m87138X();
            function4 = function2;
            r15 = c28655q;
        }
        c28677v1M87180u = r15.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d((Object) abstractC22403o, function3, (InterfaceC23459e) function4, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m115619Q(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m115620R(Function1 function1, int i13, Function1 function2) {
        function1.invoke(new AbstractC34020m.b(f155272a.get(i13).name()));
        function2.invoke(AbstractC39672a.w.f170771a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m115621S(AbstractC22403o abstractC22403o, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m115618P(abstractC22403o, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x0150  */
    /* JADX WARN: Code duplicated, block: B:54:0x017b  */
    /* JADX WARN: Code duplicated, block: B:55:0x017d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0190  */
    /* JADX WARN: Code duplicated, block: B:69:0x019c  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public static final void m115641t(C32817h0 educationContent, Function1 onNavigationEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        C38072d c38072d;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        AbstractC22676k.m65750j(educationContent, "educationContent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1988623502);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(educationContent) : c28655q2.m87157i(educationContent) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onNavigationEvent) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
                TextResource textResourceM102981b = educationContent.getDescriptionDisplay();
                i16 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM102981b, c28655q2, i16);
                c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB1(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q2;
                if (educationContent.getCoachButton() != null) {
                    c28655q.m87150e0(-1452525384);
                    EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                    TextResource textResourceM82267m = educationContent.getCoachButton().getText();
                    C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), AbstractC8693b.m21277k(AbstractC38480c.f164854a));
                    InterfaceC21430b interfaceC21430bM60318a = p712j91.Function1.m60318a(AbstractC15673b0.m43972A());
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(educationContent))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C35076b(9, onNavigationEvent, educationContent);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27265l0.m82217i(null, enumC27269n0, textResourceM82267m, null, c39274g, false, null, interfaceC21430bM60318a, false, false, null, null, (Function1) objM87133R, c28655q, 100663344 | (i16 << 6) | (C39274g.f168929c << 12), 0, 3689);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1451896890);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(educationContent, onNavigationEvent, modifier3, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
            TextResource textResourceM102981b2 = educationContent.getDescriptionDisplay();
            i16 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM102981b2, c28655q2, i16);
            c38072d = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            Modifier modifier6 = modifier4;
            AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, c38072d.m121949b(c28655q2, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i19).getB1(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q2;
            if (educationContent.getCoachButton() != null) {
                c28655q.m87150e0(-1452525384);
                EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                TextResource textResourceM82267m2 = educationContent.getCoachButton().getText();
                C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(c38072d), AbstractC8693b.m21277k(AbstractC38480c.f164854a));
                InterfaceC21430b interfaceC21430bM60318a2 = p712j91.Function1.m60318a(AbstractC15673b0.m43972A());
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 14) != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                z15 = z13 | z14;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C35076b(9, onNavigationEvent, educationContent);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C35076b(9, onNavigationEvent, educationContent);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27265l0.m82217i(null, enumC27269n1, textResourceM82267m2, null, c39274g2, false, null, interfaceC21430bM60318a2, false, false, null, null, (Function1) objM87133R, c28655q, 100663344 | (i16 << 6) | (C39274g.f168929c << 12), 0, 3689);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1451896890);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(educationContent, onNavigationEvent, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m115642u(Function1 function1, C32817h0 c32817h0, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC31638j.b(c32817h0.getCoachButton().getNavigationAction()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m115643v(C32817h0 c32817h0, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m115641t(c32817h0, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0212  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:73:0x010b  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:78:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0167  */
    /* JADX WARN: Code duplicated, block: B:83:0x016d  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:92:0x01df  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:99:0x0206  */
    /* JADX INFO: renamed from: w */
    public static final void m115644w(AbstractC32815g0 viewState, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        Function1 function6;
        int i19;
        boolean z4;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        Function1 function12;
        Function1 function13;
        Function1 function14;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-432911984);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function4 = function1;
                i15 |= c28655q.m87157i(function4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C36244s(3);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function10 = (Function1) objM87133R4;
                        } else {
                            function10 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C36244s(5);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function11 = (Function1) objM87133R3;
                        } else {
                            function11 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C36244s(6);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function12 = (Function1) objM87133R2;
                        } else {
                            function12 = function6;
                        }
                        AbstractC14874j.m42904c(viewState, "healthcare_womens_health_phase_education", c28655q, (i15 & 14) | 48);
                        if (viewState instanceof AbstractC32815g0.b) {
                            c28655q.m87150e0(906325627);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC32815g0.a) {
                                c28655q.m87150e0(906713716);
                                AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                if ((i15 & 112) == 32) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objM87133R = c28655q.m87133R();
                                if (z13 || objM87133R == c28676v0) {
                                    objM87133R = new C34904e(function10, 24);
                                    c28655q.m87172p0(objM87133R);
                                }
                                int i25 = AbstractC33208p0.b.f138467h;
                                int i26 = TextResource.$stable;
                                AbstractC33199m0.m105214F(bVar, textResourceM21278l, null, textResourceM21278l2, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i25 | (i26 << 3) | (i26 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC32815g0.c) {
                                    throw AbstractC11895b.m32003v(583424481, c28655q, false);
                                }
                                c28655q.m87150e0(907226518);
                                function13 = function10;
                                function14 = function11;
                                function6 = function12;
                                m115605C((AbstractC32815g0.c) viewState, function13, function14, function6, c28655q, i15 & 8190, 0);
                                c28655q.m87173q(false);
                            }
                            function7 = function13;
                            function8 = function14;
                        }
                        function13 = function10;
                        function14 = function11;
                        function6 = function12;
                        function7 = function13;
                        function8 = function14;
                    } else {
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function5;
                    }
                    function9 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 21);
                    }
                }
                i15 |= 3072;
                function6 = function3;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C36244s(3);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C36244s(5);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C36244s(6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function12 = (Function1) objM87133R2;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_phase_education", c28655q, (i15 & 14) | 48);
                    if (viewState instanceof AbstractC32815g0.b) {
                        c28655q.m87150e0(906325627);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC32815g0.a) {
                            c28655q.m87150e0(906713716);
                            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z13) {
                                objM87133R = new C34904e(function10, 24);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C34904e(function10, 24);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i27 = AbstractC33208p0.b.f138467h;
                            int i28 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar2, textResourceM21278l3, null, textResourceM21278l4, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i27 | (i28 << 3) | (i28 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC32815g0.c) {
                                throw AbstractC11895b.m32003v(583424481, c28655q, false);
                            }
                            c28655q.m87150e0(907226518);
                            function13 = function10;
                            function14 = function11;
                            function6 = function12;
                            m115605C((AbstractC32815g0.c) viewState, function13, function14, function6, c28655q, i15 & 8190, 0);
                            c28655q.m87173q(false);
                        }
                        function7 = function13;
                        function8 = function14;
                    }
                    function13 = function10;
                    function14 = function11;
                    function6 = function12;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 21);
                }
            }
            i15 |= 384;
            function5 = function2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C36244s(3);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C36244s(5);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C36244s(6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function12 = (Function1) objM87133R2;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_phase_education", c28655q, (i15 & 14) | 48);
                    if (viewState instanceof AbstractC32815g0.b) {
                        c28655q.m87150e0(906325627);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC32815g0.a) {
                            c28655q.m87150e0(906713716);
                            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z13) {
                                objM87133R = new C34904e(function10, 24);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C34904e(function10, 24);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i29 = AbstractC33208p0.b.f138467h;
                            int i210 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar3, textResourceM21278l5, null, textResourceM21278l6, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i29 | (i210 << 3) | (i210 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC32815g0.c) {
                                throw AbstractC11895b.m32003v(583424481, c28655q, false);
                            }
                            c28655q.m87150e0(907226518);
                            function13 = function10;
                            function14 = function11;
                            function6 = function12;
                            m115605C((AbstractC32815g0.c) viewState, function13, function14, function6, c28655q, i15 & 8190, 0);
                            c28655q.m87173q(false);
                        }
                        function7 = function13;
                        function8 = function14;
                    }
                    function13 = function10;
                    function14 = function11;
                    function6 = function12;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 21);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C36244s(3);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function10 = (Function1) objM87133R4;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C36244s(5);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function11 = (Function1) objM87133R3;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36244s(6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function12 = (Function1) objM87133R2;
                } else {
                    function12 = function6;
                }
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_phase_education", c28655q, (i15 & 14) | 48);
                if (viewState instanceof AbstractC32815g0.b) {
                    c28655q.m87150e0(906325627);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC32815g0.a) {
                        c28655q.m87150e0(906713716);
                        AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C34904e(function10, 24);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C34904e(function10, 24);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i211 = AbstractC33208p0.b.f138467h;
                        int i212 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar4, textResourceM21278l7, null, textResourceM21278l8, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i211 | (i212 << 3) | (i212 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC32815g0.c) {
                            throw AbstractC11895b.m32003v(583424481, c28655q, false);
                        }
                        c28655q.m87150e0(907226518);
                        function13 = function10;
                        function14 = function11;
                        function6 = function12;
                        m115605C((AbstractC32815g0.c) viewState, function13, function14, function6, c28655q, i15 & 8190, 0);
                        c28655q.m87173q(false);
                    }
                    function7 = function13;
                    function8 = function14;
                }
                function13 = function10;
                function14 = function11;
                function6 = function12;
                function7 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
            }
            function9 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 21);
            }
        }
        i15 |= 48;
        function4 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C36244s(3);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C36244s(5);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C36244s(6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function12 = (Function1) objM87133R2;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_phase_education", c28655q, (i15 & 14) | 48);
                    if (viewState instanceof AbstractC32815g0.b) {
                        c28655q.m87150e0(906325627);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC32815g0.a) {
                            c28655q.m87150e0(906713716);
                            AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l9 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l10 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z13) {
                                objM87133R = new C34904e(function10, 24);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C34904e(function10, 24);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i213 = AbstractC33208p0.b.f138467h;
                            int i214 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar5, textResourceM21278l9, null, textResourceM21278l10, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i213 | (i214 << 3) | (i214 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC32815g0.c) {
                                throw AbstractC11895b.m32003v(583424481, c28655q, false);
                            }
                            c28655q.m87150e0(907226518);
                            function13 = function10;
                            function14 = function11;
                            function6 = function12;
                            m115605C((AbstractC32815g0.c) viewState, function13, function14, function6, c28655q, i15 & 8190, 0);
                            c28655q.m87173q(false);
                        }
                        function7 = function13;
                        function8 = function14;
                    }
                    function13 = function10;
                    function14 = function11;
                    function6 = function12;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 21);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C36244s(3);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function10 = (Function1) objM87133R4;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C36244s(5);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function11 = (Function1) objM87133R3;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36244s(6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function12 = (Function1) objM87133R2;
                } else {
                    function12 = function6;
                }
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_phase_education", c28655q, (i15 & 14) | 48);
                if (viewState instanceof AbstractC32815g0.b) {
                    c28655q.m87150e0(906325627);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC32815g0.a) {
                        c28655q.m87150e0(906713716);
                        AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l11 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l12 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C34904e(function10, 24);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C34904e(function10, 24);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i215 = AbstractC33208p0.b.f138467h;
                        int i216 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar6, textResourceM21278l11, null, textResourceM21278l12, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i215 | (i216 << 3) | (i216 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC32815g0.c) {
                            throw AbstractC11895b.m32003v(583424481, c28655q, false);
                        }
                        c28655q.m87150e0(907226518);
                        function13 = function10;
                        function14 = function11;
                        function6 = function12;
                        m115605C((AbstractC32815g0.c) viewState, function13, function14, function6, c28655q, i15 & 8190, 0);
                        c28655q.m87173q(false);
                    }
                    function7 = function13;
                    function8 = function14;
                }
                function13 = function10;
                function14 = function11;
                function6 = function12;
                function7 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
            }
            function9 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 21);
            }
        }
        i15 |= 384;
        function5 = function2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C36244s(3);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function10 = (Function1) objM87133R4;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C36244s(5);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function11 = (Function1) objM87133R3;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36244s(6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function12 = (Function1) objM87133R2;
                } else {
                    function12 = function6;
                }
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_phase_education", c28655q, (i15 & 14) | 48);
                if (viewState instanceof AbstractC32815g0.b) {
                    c28655q.m87150e0(906325627);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC32815g0.a) {
                        c28655q.m87150e0(906713716);
                        AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l13 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l14 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C34904e(function10, 24);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C34904e(function10, 24);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i217 = AbstractC33208p0.b.f138467h;
                        int i218 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar7, textResourceM21278l13, null, textResourceM21278l14, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i217 | (i218 << 3) | (i218 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC32815g0.c) {
                            throw AbstractC11895b.m32003v(583424481, c28655q, false);
                        }
                        c28655q.m87150e0(907226518);
                        function13 = function10;
                        function14 = function11;
                        function6 = function12;
                        m115605C((AbstractC32815g0.c) viewState, function13, function14, function6, c28655q, i15 & 8190, 0);
                        c28655q.m87173q(false);
                    }
                    function7 = function13;
                    function8 = function14;
                }
                function13 = function10;
                function14 = function11;
                function6 = function12;
                function7 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
            }
            function9 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 21);
            }
        }
        i15 |= 3072;
        function6 = function3;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C36244s(3);
                    c28655q.m87172p0(objM87133R4);
                }
                function10 = (Function1) objM87133R4;
            } else {
                function10 = function4;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C36244s(5);
                    c28655q.m87172p0(objM87133R3);
                }
                function11 = (Function1) objM87133R3;
            } else {
                function11 = function5;
            }
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36244s(6);
                    c28655q.m87172p0(objM87133R2);
                }
                function12 = (Function1) objM87133R2;
            } else {
                function12 = function6;
            }
            AbstractC14874j.m42904c(viewState, "healthcare_womens_health_phase_education", c28655q, (i15 & 14) | 48);
            if (viewState instanceof AbstractC32815g0.b) {
                c28655q.m87150e0(906325627);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                if (viewState instanceof AbstractC32815g0.a) {
                    c28655q.m87150e0(906713716);
                    AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                    TextResource textResourceM21278l15 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                    TextResource textResourceM21278l16 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C34904e(function10, 24);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C34904e(function10, 24);
                        c28655q.m87172p0(objM87133R);
                    }
                    int i219 = AbstractC33208p0.b.f138467h;
                    int i2110 = TextResource.$stable;
                    AbstractC33199m0.m105214F(bVar8, textResourceM21278l15, null, textResourceM21278l16, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i219 | (i2110 << 3) | (i2110 << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC32815g0.c) {
                        throw AbstractC11895b.m32003v(583424481, c28655q, false);
                    }
                    c28655q.m87150e0(907226518);
                    function13 = function10;
                    function14 = function11;
                    function6 = function12;
                    m115605C((AbstractC32815g0.c) viewState, function13, function14, function6, c28655q, i15 & 8190, 0);
                    c28655q.m87173q(false);
                }
                function7 = function13;
                function8 = function14;
            }
            function13 = function10;
            function14 = function11;
            function6 = function12;
            function7 = function13;
            function8 = function14;
        } else {
            c28655q.m87138X();
            function7 = function4;
            function8 = function5;
        }
        function9 = function6;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m115645x(AbstractC34020m it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m115646y(AbstractC31638j it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m115647z(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}

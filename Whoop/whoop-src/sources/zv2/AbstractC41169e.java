package zv2;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c41.C4105r1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxConfirmDialog;
import com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxMeasurementModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23459e;
import m83.AbstractC25247g0;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.AbstractC28193q0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31919h;
import p748zc1.C40317e8;
import p748zc1.C40392l6;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32417h;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yo1.C39689b;
import yv2.AbstractC39810d;
import yv2.AbstractC39812f;
import yv2.C39808b;
import yv2.C39809c;
import zm1.C40893d;

/* JADX INFO: renamed from: zv2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aA\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006#²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010!\u001a\u0004\u0018\u00010 8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lzv2/f;", "viewState", "", "initiallyExpanded", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Landroidx/compose/ui/Modifier;Lzv2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "source", "", "selectedDateIso", "valueText", "isDelete", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;", "I", "(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;", "", "bindings", "J", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "Ly3/f;", "a", "F", "CONTENT_PADDING", "b", "SECTION_SPACING", "isDateWheelExpanded", "Lzv2/i;", "pendingConfirm", "isValueFocused", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41169e {

    /* JADX INFO: renamed from: a */
    private static final float f177590a;

    /* JADX INFO: renamed from: b */
    private static final float f177591b;

    /* JADX INFO: renamed from: zv2.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.onerepmax.manualentry.view.OneRepMaxMeasurementItemKt$OneRepMaxMeasurementContent$2$1", m100430f = "OneRepMaxMeasurementItem.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177592w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f177593x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f177594y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177593x = interfaceC28670t2;
            this.f177594y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f177593x, this.f177594y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f177592w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC41169e.m133750q(this.f177593x)) {
                AbstractC41169e.m133729F(this.f177594y, false);
            }
            return C23454a0.f92919a;
        }
    }

    static {
        float f13 = 8;
        f177590a = 2 * f13;
        f177591b = 3 * f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final InterfaceC28601c1 m133724A(C41170f c41170f) {
        return AbstractC28683x.m87272z(c41170f.getInitialValue());
    }

    /* JADX INFO: renamed from: B */
    private static final String m133725B(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: C */
    private static final void m133726C(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final InterfaceC28601c1 m133727D(boolean z4) {
        return AbstractC28683x.m87272z(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: E */
    private static final boolean m133728E(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m133729F(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: I */
    public static final OneRepMaxConfirmDialog m133732I(OneRepMaxMeasurementModel source, String selectedDateIso, String valueText, boolean z4) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(selectedDateIso, "selectedDateIso");
        AbstractC22676k.m65750j(valueText, "valueText");
        OneRepMaxMeasurementModel oneRepMaxMeasurementModelBind = source.bind(m133733J(source.getBindings(), selectedDateIso, valueText));
        return z4 ? oneRepMaxMeasurementModelBind.getFooter().getDeleteConfirmDialog() : oneRepMaxMeasurementModelBind.getFooter().getSaveConfirmDialog();
    }

    /* JADX INFO: renamed from: J */
    public static final Map<String, Object> m133733J(Map<String, String> map, String selectedDateIso, String valueText) {
        Collection<String> collectionValues;
        Collection<String> collectionValues2;
        Object next;
        AbstractC22676k.m65750j(selectedDateIso, "selectedDateIso");
        AbstractC22676k.m65750j(valueText, "valueText");
        Object obj = null;
        String str = "$selected_date";
        if (map != null && (collectionValues2 = map.values()) != null) {
            Iterator<T> it = collectionValues2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e((String) next, "$selected_date"));
            String str2 = (String) next;
            if (str2 != null) {
                str = str2;
            }
        }
        String str3 = "$one_rep_max_value";
        if (map != null && (collectionValues = map.values()) != null) {
            for (Object obj2 : collectionValues) {
                if (AbstractC22676k.m65745e((String) obj2, "$one_rep_max_value")) {
                    obj = obj2;
                    break;
                }
            }
            String str4 = (String) obj;
            if (str4 != null) {
                str3 = str4;
            }
        }
        Integer numM125932Q = AbstractC39421y.m125932Q(valueText);
        int iIntValue = numM125932Q != null ? numM125932Q.intValue() : 0;
        return AbstractC25247g0.m73990Y(new C23465k(str, selectedDateIso), new C23465k(str3, Integer.valueOf(iIntValue)), new C23465k("$one_rep_max_value_display", String.valueOf(iIntValue)));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x020a  */
    /* JADX WARN: Code duplicated, block: B:107:0x021a  */
    /* JADX WARN: Code duplicated, block: B:111:0x022b  */
    /* JADX WARN: Code duplicated, block: B:113:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0233  */
    /* JADX WARN: Code duplicated, block: B:119:0x0264  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:131:0x032a  */
    /* JADX WARN: Code duplicated, block: B:134:0x032f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0347 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0349  */
    /* JADX WARN: Code duplicated, block: B:142:0x0380 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x0382  */
    /* JADX WARN: Code duplicated, block: B:146:0x03af  */
    /* JADX WARN: Code duplicated, block: B:147:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:150:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x010c  */
    /* JADX WARN: Code duplicated, block: B:72:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x0117  */
    /* JADX WARN: Code duplicated, block: B:79:0x012f  */
    /* JADX WARN: Code duplicated, block: B:82:0x013e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0163 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0165  */
    /* JADX WARN: Code duplicated, block: B:89:0x0186  */
    /* JADX WARN: Code duplicated, block: B:92:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d1  */
    /* JADX INFO: renamed from: l */
    public static final void m133745l(Modifier modifier, final C41170f viewState, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        Function1 function2;
        int i17;
        final int i18;
        final int i19;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        boolean z16;
        int i24;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87157i2;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        boolean z17;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c4;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c1M101215x;
        boolean zM87153g;
        Object objM87133R6;
        Locale locale;
        Locale localeM85323b;
        boolean zM87153g2;
        Object objM87133R7;
        C39808b c39808b;
        boolean zM87153g3;
        Object objM87133R8;
        boolean zM127645a;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R9;
        int i25;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87153g4;
        Object objM87133R10;
        C28676v0 c28676v1;
        boolean zM87153g5;
        Object objM87133R11;
        boolean zM87153g6;
        Object objM87133R12;
        int i26;
        boolean z25;
        Object objM87133R13;
        Object objM87133R14;
        Object objM87133R15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-927974437);
        int i27 = i14 & 1;
        if (i27 != 0) {
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = 0;
                i19 = 1;
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i28 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    i24 = 18;
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R15 = c28655q.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C40893d(i24);
                            c28655q.m87172p0(objM87133R15);
                        }
                        function4 = (Function1) objM87133R15;
                    } else {
                        function4 = function2;
                    }
                    InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                    Object[] objArr = {viewState.getSelectedDate()};
                    zM87157i = c28655q.m87157i(viewState);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new InterfaceC4339a() { // from class: zv2.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        return AbstractC41169e.m133747n(viewState);
                                    default:
                                        return AbstractC41169e.m133724A(viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 0);
                    Object[] objArr2 = {viewState.getInitialValue()};
                    zM87157i2 = c28655q.m87157i(viewState);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new InterfaceC4339a() { // from class: zv2.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        return AbstractC41169e.m133747n(viewState);
                                    default:
                                        return AbstractC41169e.m133724A(viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R2, c28655q, 0);
                    Object[] objArr3 = {viewState.getSelectedDate()};
                    if ((i15 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z17 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C4105r1(z16, 4);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R5;
                    interfaceC28601c1M101215x = AbstractC32417h.m101215x(interfaceC21083i, c28655q, 6);
                    Boolean boolValueOf = Boolean.valueOf(m133750q(interfaceC28601c1M101215x));
                    zM87153g = c28655q.m87153g(interfaceC28601c1M101215x) | c28655q.m87153g(interfaceC28601c3);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g || objM87133R6 == c28676v0) {
                        objM87133R6 = new a(interfaceC28601c1M101215x, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, boolValueOf);
                    locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    AbstractC22676k.m65747g(locale);
                    localeM85323b = AbstractC28193q0.m85323b(locale);
                    zM87153g2 = c28655q.m87153g(localeM85323b);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC39810d.m127629b(localeM85323b);
                        c28655q.m87172p0(objM87133R7);
                    }
                    c39808b = (C39808b) objM87133R7;
                    zM87153g3 = c28655q.m87153g(m133757x(interfaceC28601c1)) | c28655q.m87153g(viewState.getMinimumDate()) | c28655q.m87153g(viewState.getMaximumDate()) | c28655q.m87153g(c39808b);
                    objM87133R8 = c28655q.m87133R();
                    if (zM87153g3 || objM87133R8 == c28676v0) {
                        objM87133R8 = C39809c.INSTANCE.m127627a(viewState.getMinimumDate(), viewState.getMaximumDate(), m133757x(interfaceC28601c1), c39808b);
                        c28655q.m87172p0(objM87133R8);
                    }
                    C39809c c39809c = (C39809c) objM87133R8;
                    zM127645a = AbstractC39812f.m127645a(m133725B(interfaceC28601c2), viewState.getMinValue(), viewState.getMaxValue());
                    if (!AbstractC39414r.m125890i0(m133725B(interfaceC28601c2)) || zM127645a) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    if (AbstractC22676k.m65745e(m133725B(interfaceC28601c2), viewState.getInitialValue()) || !AbstractC22676k.m65745e(m133757x(interfaceC28601c1), viewState.getSelectedDate())) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (zM127645a || !z19) {
                        z24 = false;
                    } else {
                        z24 = true;
                    }
                    InterfaceC41173i interfaceC41173iM133748o = m133748o(interfaceC28601c4);
                    C41166b c41166bM133775q = viewState.getSaveConfirmDialog();
                    C41166b c41166bM133765g = viewState.getDeleteConfirmDialog();
                    Function1 function5 = function4;
                    OneRepMaxMeasurementModel oneRepMaxMeasurementModelM133760a = viewState.getBindableSource();
                    String strM133757x = m133757x(interfaceC28601c1);
                    String strM133725B = m133725B(interfaceC28601c2);
                    String strM133777s = viewState.getUnit();
                    objM87133R9 = c28655q.m87133R();
                    i25 = 21;
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C40392l6(i25, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R9);
                    }
                    boolean z26 = z24;
                    AbstractC41172h.m133813q(null, interfaceC41173iM133748o, c41166bM133775q, c41166bM133765g, oneRepMaxMeasurementModelM133760a, strM133757x, strM133725B, strM133777s, (InterfaceC4339a) objM87133R9, function5, c28655q, ((i15 << 18) & 1879048192) | 100663296, 1);
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f177590a, AbstractC1102d.m3409f(1.0f, modifier4));
                    C22949e c22949e = AbstractC22977m.f90650a;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f177591b), C2299e.f9110M, c28655q, 6);
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
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    AbstractC41172h.m133785F(null, viewState.getExerciseTitle(), viewState.getExerciseName(), c28655q, 0, 1);
                    String strM133763e = viewState.getDateSectionTitle();
                    String strM133762c = viewState.getDatePrompt();
                    boolean zM133728E = m133728E(interfaceC28601c3);
                    zM87153g4 = c28655q.m87153g(interfaceC28601c3) | c28655q.m87157i(interfaceC15237i);
                    objM87133R10 = c28655q.m87133R();
                    if (zM87153g4) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R10 == c28676v1) {
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R10;
                        zM87153g5 = c28655q.m87153g(interfaceC28601c1);
                        objM87133R11 = c28655q.m87133R();
                        if (zM87153g5 || objM87133R11 == c28676v1) {
                            objM87133R11 = new C40317e8(21, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R11);
                        }
                        AbstractC41172h.m133820x(null, strM133763e, strM133762c, c39809c, zM133728E, interfaceC4339a, (Function1) objM87133R11, c28655q, 0, 1);
                        String strM133778t = viewState.getValueSectionTitle();
                        String strM133779u = viewState.getValueTitle();
                        String strM133725B2 = m133725B(interfaceC28601c2);
                        String strM133777s2 = viewState.getUnit();
                        String strM133766h = viewState.getErrorMessage();
                        zM87153g6 = c28655q.m87153g(interfaceC28601c2);
                        objM87133R12 = c28655q.m87133R();
                        i26 = 22;
                        if (zM87153g6 || objM87133R12 == c28676v1) {
                            objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R12);
                        }
                        AbstractC41172h.m133789J(null, strM133778t, strM133779u, strM133725B2, strM133777s2, z18, strM133766h, interfaceC21083i, (Function1) objM87133R12, c28655q, 12582912, 1);
                        String strM133761b = viewState.getCaption();
                        String strM133774p = viewState.getSaveButtonTitle();
                        String strM133764f = viewState.getDeleteButtonTitle();
                        if (viewState.getDeleteConfirmDialog() != null) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objM87133R13 = c28655q.m87133R();
                        if (objM87133R13 == c28676v1) {
                            objM87133R13 = new C40392l6(i26, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R13;
                        objM87133R14 = c28655q.m87133R();
                        if (objM87133R14 == c28676v1) {
                            objM87133R14 = new C40392l6(20, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R14);
                        }
                        AbstractC41172h.m133787H(null, strM133761b, strM133774p, strM133764f, z26, z25, interfaceC4339a2, (InterfaceC4339a) objM87133R14, c28655q, 14155776, 1);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        modifier3 = modifier4;
                        function3 = function5;
                        z15 = z16;
                    }
                    objM87133R10 = new C39689b(27, interfaceC15237i, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R10);
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R10;
                    zM87153g5 = c28655q.m87153g(interfaceC28601c1);
                    objM87133R11 = c28655q.m87133R();
                    if (zM87153g5) {
                        objM87133R11 = new C40317e8(21, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C40317e8(21, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R11);
                    }
                    AbstractC41172h.m133820x(null, strM133763e, strM133762c, c39809c, zM133728E, interfaceC4339a3, (Function1) objM87133R11, c28655q, 0, 1);
                    String strM133778t2 = viewState.getValueSectionTitle();
                    String strM133779u2 = viewState.getValueTitle();
                    String strM133725B3 = m133725B(interfaceC28601c2);
                    String strM133777s3 = viewState.getUnit();
                    String strM133766h2 = viewState.getErrorMessage();
                    zM87153g6 = c28655q.m87153g(interfaceC28601c2);
                    objM87133R12 = c28655q.m87133R();
                    i26 = 22;
                    if (zM87153g6) {
                        objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R12);
                    }
                    AbstractC41172h.m133789J(null, strM133778t2, strM133779u2, strM133725B3, strM133777s3, z18, strM133766h2, interfaceC21083i, (Function1) objM87133R12, c28655q, 12582912, 1);
                    String strM133761b2 = viewState.getCaption();
                    String strM133774p2 = viewState.getSaveButtonTitle();
                    String strM133764f2 = viewState.getDeleteButtonTitle();
                    if (viewState.getDeleteConfirmDialog() != null) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v1) {
                        objM87133R13 = new C40392l6(i26, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R13;
                    objM87133R14 = c28655q.m87133R();
                    if (objM87133R14 == c28676v1) {
                        objM87133R14 = new C40392l6(20, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC41172h.m133787H(null, strM133761b2, strM133774p2, strM133764f2, z26, z25, interfaceC4339a4, (InterfaceC4339a) objM87133R14, c28655q, 14155776, 1);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                    function3 = function5;
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) viewState, z15, (InterfaceC23459e) function3, i13, i14, 16);
                }
            }
            i15 |= 3072;
            function2 = function1;
            i18 = 0;
            i19 = 1;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i28 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                i24 = 18;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R15 = c28655q.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C40893d(i24);
                        c28655q.m87172p0(objM87133R15);
                    }
                    function4 = (Function1) objM87133R15;
                } else {
                    function4 = function2;
                }
                InterfaceC15237i interfaceC15237i2 = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                Object[] objArr4 = {viewState.getSelectedDate()};
                zM87157i = c28655q.m87157i(viewState);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new InterfaceC4339a() { // from class: zv2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC41169e.m133747n(viewState);
                                default:
                                    return AbstractC41169e.m133724A(viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new InterfaceC4339a() { // from class: zv2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC41169e.m133747n(viewState);
                                default:
                                    return AbstractC41169e.m133724A(viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr4, (InterfaceC4339a) objM87133R, c28655q, 0);
                Object[] objArr5 = {viewState.getInitialValue()};
                zM87157i2 = c28655q.m87157i(viewState);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R2 = new InterfaceC4339a() { // from class: zv2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC41169e.m133747n(viewState);
                                default:
                                    return AbstractC41169e.m133724A(viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new InterfaceC4339a() { // from class: zv2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC41169e.m133747n(viewState);
                                default:
                                    return AbstractC41169e.m133724A(viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr5, (InterfaceC4339a) objM87133R2, c28655q, 0);
                Object[] objArr6 = {viewState.getSelectedDate()};
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    objM87133R3 = new C4105r1(z16, 4);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C4105r1(z16, 4);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr6, (InterfaceC4339a) objM87133R3, c28655q, 0);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R5;
                interfaceC28601c1M101215x = AbstractC32417h.m101215x(interfaceC21083i2, c28655q, 6);
                Boolean boolValueOf2 = Boolean.valueOf(m133750q(interfaceC28601c1M101215x));
                zM87153g = c28655q.m87153g(interfaceC28601c1M101215x) | c28655q.m87153g(interfaceC28601c3);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R6 = new a(interfaceC28601c1M101215x, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new a(interfaceC28601c1M101215x, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, boolValueOf2);
                locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                AbstractC22676k.m65747g(locale);
                localeM85323b = AbstractC28193q0.m85323b(locale);
                zM87153g2 = c28655q.m87153g(localeM85323b);
                objM87133R7 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R7 = AbstractC39810d.m127629b(localeM85323b);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = AbstractC39810d.m127629b(localeM85323b);
                    c28655q.m87172p0(objM87133R7);
                }
                c39808b = (C39808b) objM87133R7;
                zM87153g3 = c28655q.m87153g(m133757x(interfaceC28601c1)) | c28655q.m87153g(viewState.getMinimumDate()) | c28655q.m87153g(viewState.getMaximumDate()) | c28655q.m87153g(c39808b);
                objM87133R8 = c28655q.m87133R();
                if (zM87153g3) {
                    objM87133R8 = C39809c.INSTANCE.m127627a(viewState.getMinimumDate(), viewState.getMaximumDate(), m133757x(interfaceC28601c1), c39808b);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = C39809c.INSTANCE.m127627a(viewState.getMinimumDate(), viewState.getMaximumDate(), m133757x(interfaceC28601c1), c39808b);
                    c28655q.m87172p0(objM87133R8);
                }
                C39809c c39809c2 = (C39809c) objM87133R8;
                zM127645a = AbstractC39812f.m127645a(m133725B(interfaceC28601c2), viewState.getMinValue(), viewState.getMaxValue());
                if (AbstractC39414r.m125890i0(m133725B(interfaceC28601c2))) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (AbstractC22676k.m65745e(m133725B(interfaceC28601c2), viewState.getInitialValue())) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (zM127645a) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                InterfaceC41173i interfaceC41173iM133748o2 = m133748o(interfaceC28601c4);
                C41166b c41166bM133775q2 = viewState.getSaveConfirmDialog();
                C41166b c41166bM133765g2 = viewState.getDeleteConfirmDialog();
                Function1 function6 = function4;
                OneRepMaxMeasurementModel oneRepMaxMeasurementModelM133760a2 = viewState.getBindableSource();
                String strM133757x2 = m133757x(interfaceC28601c1);
                String strM133725B4 = m133725B(interfaceC28601c2);
                String strM133777s4 = viewState.getUnit();
                objM87133R9 = c28655q.m87133R();
                i25 = 21;
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C40392l6(i25, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R9);
                }
                boolean z27 = z24;
                AbstractC41172h.m133813q(null, interfaceC41173iM133748o2, c41166bM133775q2, c41166bM133765g2, oneRepMaxMeasurementModelM133760a2, strM133757x2, strM133725B4, strM133777s4, (InterfaceC4339a) objM87133R9, function6, c28655q, ((i15 << 18) & 1879048192) | 100663296, 1);
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f177590a, AbstractC1102d.m3409f(1.0f, modifier4));
                C22949e c22949e2 = AbstractC22977m.f90650a;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f177591b), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
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
                AbstractC41172h.m133785F(null, viewState.getExerciseTitle(), viewState.getExerciseName(), c28655q, 0, 1);
                String strM133763e2 = viewState.getDateSectionTitle();
                String strM133762c2 = viewState.getDatePrompt();
                boolean zM133728E2 = m133728E(interfaceC28601c3);
                zM87153g4 = c28655q.m87153g(interfaceC28601c3) | c28655q.m87157i(interfaceC15237i2);
                objM87133R10 = c28655q.m87133R();
                if (zM87153g4) {
                    c28676v1 = c28676v0;
                    if (objM87133R10 == c28676v1) {
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R10;
                    zM87153g5 = c28655q.m87153g(interfaceC28601c1);
                    objM87133R11 = c28655q.m87133R();
                    if (zM87153g5) {
                        objM87133R11 = new C40317e8(21, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C40317e8(21, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R11);
                    }
                    AbstractC41172h.m133820x(null, strM133763e2, strM133762c2, c39809c2, zM133728E2, interfaceC4339a5, (Function1) objM87133R11, c28655q, 0, 1);
                    String strM133778t3 = viewState.getValueSectionTitle();
                    String strM133779u3 = viewState.getValueTitle();
                    String strM133725B5 = m133725B(interfaceC28601c2);
                    String strM133777s5 = viewState.getUnit();
                    String strM133766h3 = viewState.getErrorMessage();
                    zM87153g6 = c28655q.m87153g(interfaceC28601c2);
                    objM87133R12 = c28655q.m87133R();
                    i26 = 22;
                    if (zM87153g6) {
                        objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R12);
                    }
                    AbstractC41172h.m133789J(null, strM133778t3, strM133779u3, strM133725B5, strM133777s5, z18, strM133766h3, interfaceC21083i2, (Function1) objM87133R12, c28655q, 12582912, 1);
                    String strM133761b3 = viewState.getCaption();
                    String strM133774p3 = viewState.getSaveButtonTitle();
                    String strM133764f3 = viewState.getDeleteButtonTitle();
                    if (viewState.getDeleteConfirmDialog() != null) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v1) {
                        objM87133R13 = new C40392l6(i26, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R13;
                    objM87133R14 = c28655q.m87133R();
                    if (objM87133R14 == c28676v1) {
                        objM87133R14 = new C40392l6(20, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC41172h.m133787H(null, strM133761b3, strM133774p3, strM133764f3, z27, z25, interfaceC4339a6, (InterfaceC4339a) objM87133R14, c28655q, 14155776, 1);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                    function3 = function6;
                    z15 = z16;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R10 = new C39689b(27, interfaceC15237i2, interfaceC28601c3);
                c28655q.m87172p0(objM87133R10);
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R10;
                zM87153g5 = c28655q.m87153g(interfaceC28601c1);
                objM87133R11 = c28655q.m87133R();
                if (zM87153g5) {
                    objM87133R11 = new C40317e8(21, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C40317e8(21, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R11);
                }
                AbstractC41172h.m133820x(null, strM133763e2, strM133762c2, c39809c2, zM133728E2, interfaceC4339a7, (Function1) objM87133R11, c28655q, 0, 1);
                String strM133778t4 = viewState.getValueSectionTitle();
                String strM133779u4 = viewState.getValueTitle();
                String strM133725B6 = m133725B(interfaceC28601c2);
                String strM133777s6 = viewState.getUnit();
                String strM133766h4 = viewState.getErrorMessage();
                zM87153g6 = c28655q.m87153g(interfaceC28601c2);
                objM87133R12 = c28655q.m87133R();
                i26 = 22;
                if (zM87153g6) {
                    objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R12);
                }
                AbstractC41172h.m133789J(null, strM133778t4, strM133779u4, strM133725B6, strM133777s6, z18, strM133766h4, interfaceC21083i2, (Function1) objM87133R12, c28655q, 12582912, 1);
                String strM133761b4 = viewState.getCaption();
                String strM133774p4 = viewState.getSaveButtonTitle();
                String strM133764f4 = viewState.getDeleteButtonTitle();
                if (viewState.getDeleteConfirmDialog() != null) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R13 = c28655q.m87133R();
                if (objM87133R13 == c28676v1) {
                    objM87133R13 = new C40392l6(i26, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R13);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R13;
                objM87133R14 = c28655q.m87133R();
                if (objM87133R14 == c28676v1) {
                    objM87133R14 = new C40392l6(20, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R14);
                }
                AbstractC41172h.m133787H(null, strM133761b4, strM133774p4, strM133764f4, z27, z25, interfaceC4339a8, (InterfaceC4339a) objM87133R14, c28655q, 14155776, 1);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier4;
                function3 = function6;
                z15 = z16;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) viewState, z15, (InterfaceC23459e) function3, i13, i14, 16);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = 0;
            i19 = 1;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i28 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                i24 = 18;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R15 = c28655q.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C40893d(i24);
                        c28655q.m87172p0(objM87133R15);
                    }
                    function4 = (Function1) objM87133R15;
                } else {
                    function4 = function2;
                }
                InterfaceC15237i interfaceC15237i3 = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                Object[] objArr7 = {viewState.getSelectedDate()};
                zM87157i = c28655q.m87157i(viewState);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new InterfaceC4339a() { // from class: zv2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC41169e.m133747n(viewState);
                                default:
                                    return AbstractC41169e.m133724A(viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new InterfaceC4339a() { // from class: zv2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC41169e.m133747n(viewState);
                                default:
                                    return AbstractC41169e.m133724A(viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr7, (InterfaceC4339a) objM87133R, c28655q, 0);
                Object[] objArr8 = {viewState.getInitialValue()};
                zM87157i2 = c28655q.m87157i(viewState);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R2 = new InterfaceC4339a() { // from class: zv2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC41169e.m133747n(viewState);
                                default:
                                    return AbstractC41169e.m133724A(viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new InterfaceC4339a() { // from class: zv2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC41169e.m133747n(viewState);
                                default:
                                    return AbstractC41169e.m133724A(viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr8, (InterfaceC4339a) objM87133R2, c28655q, 0);
                Object[] objArr9 = {viewState.getSelectedDate()};
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    objM87133R3 = new C4105r1(z16, 4);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C4105r1(z16, 4);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr9, (InterfaceC4339a) objM87133R3, c28655q, 0);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R5;
                interfaceC28601c1M101215x = AbstractC32417h.m101215x(interfaceC21083i3, c28655q, 6);
                Boolean boolValueOf3 = Boolean.valueOf(m133750q(interfaceC28601c1M101215x));
                zM87153g = c28655q.m87153g(interfaceC28601c1M101215x) | c28655q.m87153g(interfaceC28601c3);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R6 = new a(interfaceC28601c1M101215x, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new a(interfaceC28601c1M101215x, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, boolValueOf3);
                locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                AbstractC22676k.m65747g(locale);
                localeM85323b = AbstractC28193q0.m85323b(locale);
                zM87153g2 = c28655q.m87153g(localeM85323b);
                objM87133R7 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R7 = AbstractC39810d.m127629b(localeM85323b);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = AbstractC39810d.m127629b(localeM85323b);
                    c28655q.m87172p0(objM87133R7);
                }
                c39808b = (C39808b) objM87133R7;
                zM87153g3 = c28655q.m87153g(m133757x(interfaceC28601c1)) | c28655q.m87153g(viewState.getMinimumDate()) | c28655q.m87153g(viewState.getMaximumDate()) | c28655q.m87153g(c39808b);
                objM87133R8 = c28655q.m87133R();
                if (zM87153g3) {
                    objM87133R8 = C39809c.INSTANCE.m127627a(viewState.getMinimumDate(), viewState.getMaximumDate(), m133757x(interfaceC28601c1), c39808b);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = C39809c.INSTANCE.m127627a(viewState.getMinimumDate(), viewState.getMaximumDate(), m133757x(interfaceC28601c1), c39808b);
                    c28655q.m87172p0(objM87133R8);
                }
                C39809c c39809c3 = (C39809c) objM87133R8;
                zM127645a = AbstractC39812f.m127645a(m133725B(interfaceC28601c2), viewState.getMinValue(), viewState.getMaxValue());
                if (AbstractC39414r.m125890i0(m133725B(interfaceC28601c2))) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (AbstractC22676k.m65745e(m133725B(interfaceC28601c2), viewState.getInitialValue())) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (zM127645a) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                InterfaceC41173i interfaceC41173iM133748o3 = m133748o(interfaceC28601c4);
                C41166b c41166bM133775q3 = viewState.getSaveConfirmDialog();
                C41166b c41166bM133765g3 = viewState.getDeleteConfirmDialog();
                Function1 function7 = function4;
                OneRepMaxMeasurementModel oneRepMaxMeasurementModelM133760a3 = viewState.getBindableSource();
                String strM133757x3 = m133757x(interfaceC28601c1);
                String strM133725B7 = m133725B(interfaceC28601c2);
                String strM133777s7 = viewState.getUnit();
                objM87133R9 = c28655q.m87133R();
                i25 = 21;
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C40392l6(i25, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R9);
                }
                boolean z28 = z24;
                AbstractC41172h.m133813q(null, interfaceC41173iM133748o3, c41166bM133775q3, c41166bM133765g3, oneRepMaxMeasurementModelM133760a3, strM133757x3, strM133725B7, strM133777s7, (InterfaceC4339a) objM87133R9, function7, c28655q, ((i15 << 18) & 1879048192) | 100663296, 1);
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f177590a, AbstractC1102d.m3409f(1.0f, modifier4));
                C22949e c22949e3 = AbstractC22977m.f90650a;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f177591b), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
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
                AbstractC41172h.m133785F(null, viewState.getExerciseTitle(), viewState.getExerciseName(), c28655q, 0, 1);
                String strM133763e3 = viewState.getDateSectionTitle();
                String strM133762c3 = viewState.getDatePrompt();
                boolean zM133728E3 = m133728E(interfaceC28601c3);
                zM87153g4 = c28655q.m87153g(interfaceC28601c3) | c28655q.m87157i(interfaceC15237i3);
                objM87133R10 = c28655q.m87133R();
                if (zM87153g4) {
                    c28676v1 = c28676v0;
                    if (objM87133R10 == c28676v1) {
                    }
                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R10;
                    zM87153g5 = c28655q.m87153g(interfaceC28601c1);
                    objM87133R11 = c28655q.m87133R();
                    if (zM87153g5) {
                        objM87133R11 = new C40317e8(21, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C40317e8(21, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R11);
                    }
                    AbstractC41172h.m133820x(null, strM133763e3, strM133762c3, c39809c3, zM133728E3, interfaceC4339a9, (Function1) objM87133R11, c28655q, 0, 1);
                    String strM133778t5 = viewState.getValueSectionTitle();
                    String strM133779u5 = viewState.getValueTitle();
                    String strM133725B8 = m133725B(interfaceC28601c2);
                    String strM133777s8 = viewState.getUnit();
                    String strM133766h5 = viewState.getErrorMessage();
                    zM87153g6 = c28655q.m87153g(interfaceC28601c2);
                    objM87133R12 = c28655q.m87133R();
                    i26 = 22;
                    if (zM87153g6) {
                        objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R12);
                    }
                    AbstractC41172h.m133789J(null, strM133778t5, strM133779u5, strM133725B8, strM133777s8, z18, strM133766h5, interfaceC21083i3, (Function1) objM87133R12, c28655q, 12582912, 1);
                    String strM133761b5 = viewState.getCaption();
                    String strM133774p5 = viewState.getSaveButtonTitle();
                    String strM133764f5 = viewState.getDeleteButtonTitle();
                    if (viewState.getDeleteConfirmDialog() != null) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v1) {
                        objM87133R13 = new C40392l6(i26, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R13;
                    objM87133R14 = c28655q.m87133R();
                    if (objM87133R14 == c28676v1) {
                        objM87133R14 = new C40392l6(20, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC41172h.m133787H(null, strM133761b5, strM133774p5, strM133764f5, z28, z25, interfaceC4339a10, (InterfaceC4339a) objM87133R14, c28655q, 14155776, 1);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                    function3 = function7;
                    z15 = z16;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R10 = new C39689b(27, interfaceC15237i3, interfaceC28601c3);
                c28655q.m87172p0(objM87133R10);
                InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R10;
                zM87153g5 = c28655q.m87153g(interfaceC28601c1);
                objM87133R11 = c28655q.m87133R();
                if (zM87153g5) {
                    objM87133R11 = new C40317e8(21, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C40317e8(21, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R11);
                }
                AbstractC41172h.m133820x(null, strM133763e3, strM133762c3, c39809c3, zM133728E3, interfaceC4339a11, (Function1) objM87133R11, c28655q, 0, 1);
                String strM133778t6 = viewState.getValueSectionTitle();
                String strM133779u6 = viewState.getValueTitle();
                String strM133725B9 = m133725B(interfaceC28601c2);
                String strM133777s9 = viewState.getUnit();
                String strM133766h6 = viewState.getErrorMessage();
                zM87153g6 = c28655q.m87153g(interfaceC28601c2);
                objM87133R12 = c28655q.m87133R();
                i26 = 22;
                if (zM87153g6) {
                    objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R12);
                }
                AbstractC41172h.m133789J(null, strM133778t6, strM133779u6, strM133725B9, strM133777s9, z18, strM133766h6, interfaceC21083i3, (Function1) objM87133R12, c28655q, 12582912, 1);
                String strM133761b6 = viewState.getCaption();
                String strM133774p6 = viewState.getSaveButtonTitle();
                String strM133764f6 = viewState.getDeleteButtonTitle();
                if (viewState.getDeleteConfirmDialog() != null) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R13 = c28655q.m87133R();
                if (objM87133R13 == c28676v1) {
                    objM87133R13 = new C40392l6(i26, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R13);
                }
                InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R13;
                objM87133R14 = c28655q.m87133R();
                if (objM87133R14 == c28676v1) {
                    objM87133R14 = new C40392l6(20, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R14);
                }
                AbstractC41172h.m133787H(null, strM133761b6, strM133774p6, strM133764f6, z28, z25, interfaceC4339a12, (InterfaceC4339a) objM87133R14, c28655q, 14155776, 1);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier4;
                function3 = function7;
                z15 = z16;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) viewState, z15, (InterfaceC23459e) function3, i13, i14, 16);
            }
        }
        i15 |= 3072;
        function2 = function1;
        i18 = 0;
        i19 = 1;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i27 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i28 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            i24 = 18;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R15 = c28655q.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = new C40893d(i24);
                    c28655q.m87172p0(objM87133R15);
                }
                function4 = (Function1) objM87133R15;
            } else {
                function4 = function2;
            }
            InterfaceC15237i interfaceC15237i4 = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            Object[] objArr10 = {viewState.getSelectedDate()};
            zM87157i = c28655q.m87157i(viewState);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new InterfaceC4339a() { // from class: zv2.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return AbstractC41169e.m133747n(viewState);
                            default:
                                return AbstractC41169e.m133724A(viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new InterfaceC4339a() { // from class: zv2.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return AbstractC41169e.m133747n(viewState);
                            default:
                                return AbstractC41169e.m133724A(viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr10, (InterfaceC4339a) objM87133R, c28655q, 0);
            Object[] objArr11 = {viewState.getInitialValue()};
            zM87157i2 = c28655q.m87157i(viewState);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R2 = new InterfaceC4339a() { // from class: zv2.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                return AbstractC41169e.m133747n(viewState);
                            default:
                                return AbstractC41169e.m133724A(viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new InterfaceC4339a() { // from class: zv2.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                return AbstractC41169e.m133747n(viewState);
                            default:
                                return AbstractC41169e.m133724A(viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr11, (InterfaceC4339a) objM87133R2, c28655q, 0);
            Object[] objArr12 = {viewState.getSelectedDate()};
            if ((i15 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z17) {
                objM87133R3 = new C4105r1(z16, 4);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C4105r1(z16, 4);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr12, (InterfaceC4339a) objM87133R3, c28655q, 0);
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R5;
            interfaceC28601c1M101215x = AbstractC32417h.m101215x(interfaceC21083i4, c28655q, 6);
            Boolean boolValueOf4 = Boolean.valueOf(m133750q(interfaceC28601c1M101215x));
            zM87153g = c28655q.m87153g(interfaceC28601c1M101215x) | c28655q.m87153g(interfaceC28601c3);
            objM87133R6 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R6 = new a(interfaceC28601c1M101215x, interfaceC28601c3, null);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new a(interfaceC28601c1M101215x, interfaceC28601c3, null);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, boolValueOf4);
            locale = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
            if (locale == null) {
                locale = Locale.getDefault();
            }
            AbstractC22676k.m65747g(locale);
            localeM85323b = AbstractC28193q0.m85323b(locale);
            zM87153g2 = c28655q.m87153g(localeM85323b);
            objM87133R7 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R7 = AbstractC39810d.m127629b(localeM85323b);
                c28655q.m87172p0(objM87133R7);
            } else {
                objM87133R7 = AbstractC39810d.m127629b(localeM85323b);
                c28655q.m87172p0(objM87133R7);
            }
            c39808b = (C39808b) objM87133R7;
            zM87153g3 = c28655q.m87153g(m133757x(interfaceC28601c1)) | c28655q.m87153g(viewState.getMinimumDate()) | c28655q.m87153g(viewState.getMaximumDate()) | c28655q.m87153g(c39808b);
            objM87133R8 = c28655q.m87133R();
            if (zM87153g3) {
                objM87133R8 = C39809c.INSTANCE.m127627a(viewState.getMinimumDate(), viewState.getMaximumDate(), m133757x(interfaceC28601c1), c39808b);
                c28655q.m87172p0(objM87133R8);
            } else {
                objM87133R8 = C39809c.INSTANCE.m127627a(viewState.getMinimumDate(), viewState.getMaximumDate(), m133757x(interfaceC28601c1), c39808b);
                c28655q.m87172p0(objM87133R8);
            }
            C39809c c39809c4 = (C39809c) objM87133R8;
            zM127645a = AbstractC39812f.m127645a(m133725B(interfaceC28601c2), viewState.getMinValue(), viewState.getMaxValue());
            if (AbstractC39414r.m125890i0(m133725B(interfaceC28601c2))) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (AbstractC22676k.m65745e(m133725B(interfaceC28601c2), viewState.getInitialValue())) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (zM127645a) {
                z24 = false;
            } else {
                z24 = false;
            }
            InterfaceC41173i interfaceC41173iM133748o4 = m133748o(interfaceC28601c4);
            C41166b c41166bM133775q4 = viewState.getSaveConfirmDialog();
            C41166b c41166bM133765g4 = viewState.getDeleteConfirmDialog();
            Function1 function8 = function4;
            OneRepMaxMeasurementModel oneRepMaxMeasurementModelM133760a4 = viewState.getBindableSource();
            String strM133757x4 = m133757x(interfaceC28601c1);
            String strM133725B10 = m133725B(interfaceC28601c2);
            String strM133777s10 = viewState.getUnit();
            objM87133R9 = c28655q.m87133R();
            i25 = 21;
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new C40392l6(i25, interfaceC28601c4);
                c28655q.m87172p0(objM87133R9);
            }
            boolean z29 = z24;
            AbstractC41172h.m133813q(null, interfaceC41173iM133748o4, c41166bM133775q4, c41166bM133765g4, oneRepMaxMeasurementModelM133760a4, strM133757x4, strM133725B10, strM133777s10, (InterfaceC4339a) objM87133R9, function8, c28655q, ((i15 << 18) & 1879048192) | 100663296, 1);
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f177590a, AbstractC1102d.m3409f(1.0f, modifier4));
            C22949e c22949e4 = AbstractC22977m.f90650a;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f177591b), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
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
            AbstractC41172h.m133785F(null, viewState.getExerciseTitle(), viewState.getExerciseName(), c28655q, 0, 1);
            String strM133763e4 = viewState.getDateSectionTitle();
            String strM133762c4 = viewState.getDatePrompt();
            boolean zM133728E4 = m133728E(interfaceC28601c3);
            zM87153g4 = c28655q.m87153g(interfaceC28601c3) | c28655q.m87157i(interfaceC15237i4);
            objM87133R10 = c28655q.m87133R();
            if (zM87153g4) {
                c28676v1 = c28676v0;
                if (objM87133R10 == c28676v1) {
                }
                InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R10;
                zM87153g5 = c28655q.m87153g(interfaceC28601c1);
                objM87133R11 = c28655q.m87133R();
                if (zM87153g5) {
                    objM87133R11 = new C40317e8(21, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C40317e8(21, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R11);
                }
                AbstractC41172h.m133820x(null, strM133763e4, strM133762c4, c39809c4, zM133728E4, interfaceC4339a13, (Function1) objM87133R11, c28655q, 0, 1);
                String strM133778t7 = viewState.getValueSectionTitle();
                String strM133779u7 = viewState.getValueTitle();
                String strM133725B11 = m133725B(interfaceC28601c2);
                String strM133777s11 = viewState.getUnit();
                String strM133766h7 = viewState.getErrorMessage();
                zM87153g6 = c28655q.m87153g(interfaceC28601c2);
                objM87133R12 = c28655q.m87133R();
                i26 = 22;
                if (zM87153g6) {
                    objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R12);
                }
                AbstractC41172h.m133789J(null, strM133778t7, strM133779u7, strM133725B11, strM133777s11, z18, strM133766h7, interfaceC21083i4, (Function1) objM87133R12, c28655q, 12582912, 1);
                String strM133761b7 = viewState.getCaption();
                String strM133774p7 = viewState.getSaveButtonTitle();
                String strM133764f7 = viewState.getDeleteButtonTitle();
                if (viewState.getDeleteConfirmDialog() != null) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R13 = c28655q.m87133R();
                if (objM87133R13 == c28676v1) {
                    objM87133R13 = new C40392l6(i26, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R13);
                }
                InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R13;
                objM87133R14 = c28655q.m87133R();
                if (objM87133R14 == c28676v1) {
                    objM87133R14 = new C40392l6(20, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R14);
                }
                AbstractC41172h.m133787H(null, strM133761b7, strM133774p7, strM133764f7, z29, z25, interfaceC4339a14, (InterfaceC4339a) objM87133R14, c28655q, 14155776, 1);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier4;
                function3 = function8;
                z15 = z16;
            } else {
                c28676v1 = c28676v0;
            }
            objM87133R10 = new C39689b(27, interfaceC15237i4, interfaceC28601c3);
            c28655q.m87172p0(objM87133R10);
            InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R10;
            zM87153g5 = c28655q.m87153g(interfaceC28601c1);
            objM87133R11 = c28655q.m87133R();
            if (zM87153g5) {
                objM87133R11 = new C40317e8(21, interfaceC28601c1);
                c28655q.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C40317e8(21, interfaceC28601c1);
                c28655q.m87172p0(objM87133R11);
            }
            AbstractC41172h.m133820x(null, strM133763e4, strM133762c4, c39809c4, zM133728E4, interfaceC4339a15, (Function1) objM87133R11, c28655q, 0, 1);
            String strM133778t8 = viewState.getValueSectionTitle();
            String strM133779u8 = viewState.getValueTitle();
            String strM133725B12 = m133725B(interfaceC28601c2);
            String strM133777s12 = viewState.getUnit();
            String strM133766h8 = viewState.getErrorMessage();
            zM87153g6 = c28655q.m87153g(interfaceC28601c2);
            objM87133R12 = c28655q.m87133R();
            i26 = 22;
            if (zM87153g6) {
                objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                c28655q.m87172p0(objM87133R12);
            } else {
                objM87133R12 = new C40317e8(i26, interfaceC28601c2);
                c28655q.m87172p0(objM87133R12);
            }
            AbstractC41172h.m133789J(null, strM133778t8, strM133779u8, strM133725B12, strM133777s12, z18, strM133766h8, interfaceC21083i4, (Function1) objM87133R12, c28655q, 12582912, 1);
            String strM133761b8 = viewState.getCaption();
            String strM133774p8 = viewState.getSaveButtonTitle();
            String strM133764f8 = viewState.getDeleteButtonTitle();
            if (viewState.getDeleteConfirmDialog() != null) {
                z25 = true;
            } else {
                z25 = false;
            }
            objM87133R13 = c28655q.m87133R();
            if (objM87133R13 == c28676v1) {
                objM87133R13 = new C40392l6(i26, interfaceC28601c4);
                c28655q.m87172p0(objM87133R13);
            }
            InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R13;
            objM87133R14 = c28655q.m87133R();
            if (objM87133R14 == c28676v1) {
                objM87133R14 = new C40392l6(20, interfaceC28601c4);
                c28655q.m87172p0(objM87133R14);
            }
            AbstractC41172h.m133787H(null, strM133761b8, strM133774p8, strM133764f8, z29, z25, interfaceC4339a16, (InterfaceC4339a) objM87133R14, c28655q, 14155776, 1);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
            function3 = function8;
            z15 = z16;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) viewState, z15, (InterfaceC23459e) function3, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m133746m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC28601c1 m133747n(C41170f c41170f) {
        return AbstractC28683x.m87272z(c41170f.getSelectedDate());
    }

    /* JADX INFO: renamed from: o */
    private static final InterfaceC41173i m133748o(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC41173i) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: p */
    private static final void m133749p(InterfaceC28601c1 interfaceC28601c1, InterfaceC41173i interfaceC41173i) {
        interfaceC28601c1.setValue(interfaceC41173i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final boolean m133750q(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m133751r(InterfaceC28601c1 interfaceC28601c1) {
        m133749p(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m133752s(InterfaceC15237i interfaceC15237i, InterfaceC28601c1 interfaceC28601c1) {
        m133729F(interfaceC28601c1, !m133728E(interfaceC28601c1));
        if (m133728E(interfaceC28601c1)) {
            ((C15240l) interfaceC15237i).m43339b(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m133753t(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m133759z(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m133754u(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m133726C(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m133755v(InterfaceC28601c1 interfaceC28601c1) {
        m133749p(interfaceC28601c1, InterfaceC41173i.b.f177641a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m133756w(InterfaceC28601c1 interfaceC28601c1) {
        m133749p(interfaceC28601c1, InterfaceC41173i.a.f177640a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final String m133757x(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m133758y(Modifier modifier, C41170f c41170f, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m133745l(modifier, c41170f, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m133759z(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }
}

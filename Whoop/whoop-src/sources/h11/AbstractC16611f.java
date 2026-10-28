package h11;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.bot.settings.C6075e;
import com.whoop.navigation.models.GenericInteraction;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import h02.C16602z;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p180h0.C16416l0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.C22971k;
import p291l0.C22976l1;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h11.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0091\u0001\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00052\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "Lh11/h;", "pillStates", "Lkotlin/Function2;", "", "", "Ll83/a0;", "onPillClick", "Lkotlin/Function1;", "Lcom/whoop/navigation/models/GenericInteraction;", "onPillInteraction", "Lkotlin/Function0;", "onCalendarClick", "Lgz0/m0;", "leftCalendarDisplayIcon", "rightCalendarDisplayIcon", "pillAutomationTagPrefix", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16611f {

    /* JADX INFO: renamed from: h11.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.datepill.DatePillRowKt$DatePillRow$1$1", m100430f = "DatePillRow.kt", m100431l = {76, 81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        float f63892E;

        /* JADX INFO: renamed from: F */
        float f63893F;

        /* JADX INFO: renamed from: G */
        int f63894G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28670t2 f63895H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ boolean f63896I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ List<C16613h> f63897J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ C26068u f63898K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ InterfaceC39171c f63899L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ InterfaceC28601c1 f63900M;

        /* JADX INFO: renamed from: w */
        int f63901w;

        /* JADX INFO: renamed from: x */
        int f63902x;

        /* JADX INFO: renamed from: y */
        int f63903y;

        /* JADX INFO: renamed from: z */
        float f63904z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28670t2 interfaceC28670t2, boolean z4, List<C16613h> list, C26068u c26068u, InterfaceC39171c interfaceC39171c, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f63895H = interfaceC28670t2;
            this.f63896I = z4;
            this.f63897J = list;
            this.f63898K = c26068u;
            this.f63899L = interfaceC39171c;
            this.f63900M = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f63895H, this.f63896I, this.f63897J, this.f63898K, this.f63899L, this.f63900M, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
        
            if (r10.f63898K.m77563f(r11, ((int) r7) * (-1), r10) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
        
            if (r10.f63898K.m77567j(r11, ((int) r7) * (-1), r10) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h11.AbstractC16611f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: h11.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f63905w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4351m f63906x;

        public b(Function1 function1, InterfaceC4351m interfaceC4351m) {
            this.f63905w = function1;
            this.f63906x = interfaceC4351m;
        }

        /* JADX INFO: renamed from: a */
        public final void m47158a(Object event) {
            AbstractC22676k.m65750j(event, "event");
            if (event instanceof GenericInteraction) {
                Function1 function1 = this.f63905w;
                if (function1 != null) {
                    function1.invoke(event);
                    return;
                }
                return;
            }
            if (event instanceof C16607b) {
                C16607b c16607b = (C16607b) event;
                this.f63906x.invoke(c16607b.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), c16607b.getCycleId());
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m47158a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h11.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f63907w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C16613h c16613h) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h11.f$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f63908w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f63909x;

        public d(Function1 function1, List list) {
            this.f63908w = function1;
            this.f63909x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m47160a(int i13) {
            return this.f63908w.invoke(this.f63909x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m47160a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: h11.f$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f63910w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f63911x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4351m f63912y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f63913z;

        public e(List list, Function1 function1, InterfaceC4351m interfaceC4351m, String str) {
            this.f63910w = list;
            this.f63911x = function1;
            this.f63912y = interfaceC4351m;
            this.f63913z = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m47161a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C16613h c16613h = (C16613h) this.f63910w.get(i13);
            c28655q.m87150e0(1366996839);
            boolean zM87153g = c28655q.m87153g(this.f63911x) | c28655q.m87153g(this.f63912y);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new b(this.f63911x, this.f63912y);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            String str = this.f63913z;
            AbstractC16609d.m47136e(c16613h, function1, null, str != null ? AbstractC18489d0.m53370k(str, "_", c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()) : null, c28655q, 0, 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m47161a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:102:0x012a  */
    /* JADX WARN: Code duplicated, block: B:104:0x012e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0131  */
    /* JADX WARN: Code duplicated, block: B:107:0x0135  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0145  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0154  */
    /* JADX WARN: Code duplicated, block: B:119:0x016f  */
    /* JADX WARN: Code duplicated, block: B:121:0x017e  */
    /* JADX WARN: Code duplicated, block: B:124:0x018a  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:133:0x0222  */
    /* JADX WARN: Code duplicated, block: B:134:0x0226  */
    /* JADX WARN: Code duplicated, block: B:137:0x0239  */
    /* JADX WARN: Code duplicated, block: B:139:0x0247  */
    /* JADX WARN: Code duplicated, block: B:142:0x026f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0271  */
    /* JADX WARN: Code duplicated, block: B:146:0x027f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0281  */
    /* JADX WARN: Code duplicated, block: B:150:0x028a  */
    /* JADX WARN: Code duplicated, block: B:151:0x028c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0299  */
    /* JADX WARN: Code duplicated, block: B:155:0x029b  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:174:0x030f  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    /* JADX INFO: renamed from: h */
    public static final void m47150h(Modifier modifier, List<C16613h> list, InterfaceC4351m onPillClick, Function1 function1, InterfaceC4339a interfaceC4339a, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, String str, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        int i17;
        int i18;
        int iOrdinal;
        int i19;
        int i24;
        int i25;
        int i26;
        String str2;
        int i27;
        boolean z4;
        EnumC16313m0 enumC16313m2;
        EnumC16313m0 enumC16313m3;
        C28655q c28655q;
        Function1 function3;
        String str3;
        InterfaceC4339a interfaceC4339a2;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Function1 function4;
        InterfaceC4339a interfaceC4339a3;
        EnumC16313m0 enumC16313m4;
        EnumC16313m0 enumC16313m5;
        InterfaceC39171c interfaceC39171c;
        boolean z13;
        boolean zM87153g;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28670t2 interfaceC28670t2;
        int iIntValue;
        C26068u c26068uM77569a;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Boolean boolValueOf;
        boolean zM87153g2;
        Object objM87133R3;
        Boolean bool;
        String str4;
        C26068u c26068u;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i28;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        Object c6075e;
        EnumC16313m0 enumC16313m6;
        Function1 function5;
        EnumC16313m0 enumC16313m7;
        List<C16613h> pillStates = list;
        AbstractC22676k.m65750j(pillStates, "pillStates");
        AbstractC22676k.m65750j(onPillClick, "onPillClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-548510985);
        int i29 = i14 & 1;
        if (i29 != 0) {
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
            i15 |= c28655q2.m87157i(pillStates) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onPillClick) ? 256 : 128;
        }
        int i34 = i14 & 8;
        if (i34 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (enumC16313m0 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC16313m0.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87149e(enumC16313m1 != null ? enumC16313m1.ordinal() : -1)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87153g(str2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i34 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i18 != 0) {
                        enumC16313m4 = null;
                    } else {
                        enumC16313m4 = enumC16313m0;
                    }
                    if (i24 != 0) {
                        enumC16313m5 = null;
                    } else {
                        enumC16313m5 = enumC16313m1;
                    }
                    if (i26 != 0) {
                        str2 = null;
                    }
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    if (enumC16313m4 != null || interfaceC4339a3 == null) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    zM87153g = c28655q2.m87153g(pillStates);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87264r(new C16602z(pillStates, 1));
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
                    if (((Number) interfaceC28670t2.getValue()).intValue() >= 0) {
                        iIntValue = ((Number) interfaceC28670t2.getValue()).intValue() + (z13 ? 1 : 0);
                    } else {
                        iIntValue = 0;
                    }
                    c26068uM77569a = AbstractC26071x.m77569a(iIntValue, 0, c28655q2, 2);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    Object value = interfaceC28670t2.getValue();
                    boolValueOf = Boolean.valueOf(z13);
                    zM87153g2 = c28655q2.m87153g(interfaceC28670t2) | c28655q2.m87155h(z13) | c28655q2.m87157i(pillStates) | c28655q2.m87153g(c26068uM77569a) | c28655q2.m87153g(interfaceC39171c);
                    objM87133R3 = c28655q2.m87133R();
                    if (!zM87153g2 || objM87133R3 == c28676v0) {
                        bool = boolValueOf;
                        boolean z25 = z13 ? 1 : 0;
                        objM87133R3 = new a(interfaceC28670t2, z25, pillStates, c26068uM77569a, interfaceC39171c, interfaceC28601c1, null);
                        str4 = str2;
                        c26068u = c26068uM77569a;
                        z13 = z25 ? 1 : 0;
                        pillStates = pillStates;
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        String str5 = str2;
                        c26068u = c26068uM77569a;
                        str4 = str5;
                        bool = boolValueOf;
                    }
                    AbstractC28683x.m87255i(value, bool, pillStates, (InterfaceC4351m) objM87133R3, c28655q2);
                    Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), 0, 3);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3427x);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * 4);
                    C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(2 * 8, 0.0f, 2);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    i28 = i15;
                    if ((458752 & i28) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM87155h = c28655q2.m87155h(z13) | z14;
                    if ((57344 & i28) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z26 = zM87155h | z15;
                    if ((29360128 & i28) == 8388608) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean zM87157i = z26 | z16 | c28655q2.m87157i(pillStates);
                    if ((i28 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z27 = zM87157i | z17;
                    if ((i28 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z28 = z27 | z18;
                    if ((3670016 & i28) == 1048576) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z28 | z19;
                    Object objM87133R4 = c28655q2.m87133R();
                    if (!z24 || objM87133R4 == c28676v0) {
                        enumC16313m6 = enumC16313m4;
                        function5 = function4;
                        enumC16313m7 = enumC16313m5;
                        interfaceC4339a2 = interfaceC4339a3;
                        c6075e = new C6075e(enumC16313m6, pillStates, enumC16313m7, z13, interfaceC4339a2, str4, function5, onPillClick);
                        c28655q2.m87172p0(c6075e);
                    } else {
                        c6075e = objM87133R4;
                        enumC16313m6 = enumC16313m4;
                        function5 = function4;
                        enumC16313m7 = enumC16313m5;
                        interfaceC4339a2 = interfaceC4339a3;
                    }
                    c28655q = c28655q2;
                    AbstractC22674j.m65718d(modifierM3409f, c26068u, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) c6075e, c28655q, 24966, 488);
                    c28655q.m87173q(true);
                    str3 = str4;
                    function3 = function5;
                    enumC16313m2 = enumC16313m6;
                    enumC16313m3 = enumC16313m7;
                    modifier2 = modifier2;
                } else {
                    c28655q2.m87138X();
                    enumC16313m2 = enumC16313m0;
                    enumC16313m3 = enumC16313m1;
                    c28655q = c28655q2;
                    function3 = function2;
                    str3 = str2;
                    interfaceC4339a2 = interfaceC4339a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2880b(modifier2, list, onPillClick, function3, interfaceC4339a2, enumC16313m2, enumC16313m3, str3, i13, i14);
                }
            }
            i15 |= 24576;
            i18 = i14 & 32;
            if (i18 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (enumC16313m0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC16313m0.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87149e(enumC16313m1 != null ? enumC16313m1.ordinal() : -1)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
                str2 = str;
            } else {
                str2 = str;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87153g(str2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
            }
            if ((i15 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                if (i34 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    interfaceC4339a3 = null;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i18 != 0) {
                    enumC16313m4 = null;
                } else {
                    enumC16313m4 = enumC16313m0;
                }
                if (i24 != 0) {
                    enumC16313m5 = null;
                } else {
                    enumC16313m5 = enumC16313m1;
                }
                if (i26 != 0) {
                    str2 = null;
                }
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                if (enumC16313m4 != null) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zM87153g = c28655q2.m87153g(pillStates);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (zM87153g) {
                    objM87133R = AbstractC28683x.m87264r(new C16602z(pillStates, 1));
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC28683x.m87264r(new C16602z(pillStates, 1));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
                if (((Number) interfaceC28670t2.getValue()).intValue() >= 0) {
                    iIntValue = ((Number) interfaceC28670t2.getValue()).intValue() + (z13 ? 1 : 0);
                } else {
                    iIntValue = 0;
                }
                c26068uM77569a = AbstractC26071x.m77569a(iIntValue, 0, c28655q2, 2);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                Object value2 = interfaceC28670t2.getValue();
                boolValueOf = Boolean.valueOf(z13);
                zM87153g2 = c28655q2.m87153g(interfaceC28670t2) | c28655q2.m87155h(z13) | c28655q2.m87157i(pillStates) | c28655q2.m87153g(c26068uM77569a) | c28655q2.m87153g(interfaceC39171c);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g2) {
                    bool = boolValueOf;
                    boolean z29 = z13 ? 1 : 0;
                    objM87133R3 = new a(interfaceC28670t2, z29, pillStates, c26068uM77569a, interfaceC39171c, interfaceC28601c1, null);
                    str4 = str2;
                    c26068u = c26068uM77569a;
                    z13 = z29 ? 1 : 0;
                    pillStates = pillStates;
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    bool = boolValueOf;
                    boolean z210 = z13 ? 1 : 0;
                    objM87133R3 = new a(interfaceC28670t2, z210, pillStates, c26068uM77569a, interfaceC39171c, interfaceC28601c1, null);
                    str4 = str2;
                    c26068u = c26068uM77569a;
                    z13 = z210 ? 1 : 0;
                    pillStates = pillStates;
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87255i(value2, bool, pillStates, (InterfaceC4351m) objM87133R3, c28655q2);
                Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), 0, 3);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3427x2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(3 * 4);
                C22976l1 c22976l1M3379a2 = AbstractC1099a.m3379a(2 * 8, 0.0f, 2);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                i28 = i15;
                if ((458752 & i28) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM87155h2 = c28655q2.m87155h(z13) | z14;
                if ((57344 & i28) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z211 = zM87155h2 | z15;
                if ((29360128 & i28) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zM87157i2 = z211 | z16 | c28655q2.m87157i(pillStates);
                if ((i28 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z212 = zM87157i2 | z17;
                if ((i28 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z213 = z212 | z18;
                if ((3670016 & i28) == 1048576) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z213 | z19;
                Object objM87133R5 = c28655q2.m87133R();
                if (z24) {
                    enumC16313m6 = enumC16313m4;
                    function5 = function4;
                    enumC16313m7 = enumC16313m5;
                    interfaceC4339a2 = interfaceC4339a3;
                    c6075e = new C6075e(enumC16313m6, pillStates, enumC16313m7, z13, interfaceC4339a2, str4, function5, onPillClick);
                    c28655q2.m87172p0(c6075e);
                } else {
                    enumC16313m6 = enumC16313m4;
                    function5 = function4;
                    enumC16313m7 = enumC16313m5;
                    interfaceC4339a2 = interfaceC4339a3;
                    c6075e = new C6075e(enumC16313m6, pillStates, enumC16313m7, z13, interfaceC4339a2, str4, function5, onPillClick);
                    c28655q2.m87172p0(c6075e);
                }
                c28655q = c28655q2;
                AbstractC22674j.m65718d(modifierM3409f2, c26068u, c22976l1M3379a2, c22971kM66746i2, null, null, false, null, (Function1) c6075e, c28655q, 24966, 488);
                c28655q.m87173q(true);
                str3 = str4;
                function3 = function5;
                enumC16313m2 = enumC16313m6;
                enumC16313m3 = enumC16313m7;
                modifier2 = modifier2;
            } else {
                c28655q2.m87138X();
                enumC16313m2 = enumC16313m0;
                enumC16313m3 = enumC16313m1;
                c28655q = c28655q2;
                function3 = function2;
                str3 = str2;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(modifier2, list, onPillClick, function3, interfaceC4339a2, enumC16313m2, enumC16313m3, str3, i13, i14);
            }
        }
        i15 |= 3072;
        function2 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (enumC16313m0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC16313m0.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87149e(enumC16313m1 != null ? enumC16313m1.ordinal() : -1)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
                str2 = str;
            } else {
                str2 = str;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87153g(str2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
            }
            if ((i15 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                if (i34 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    interfaceC4339a3 = null;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i18 != 0) {
                    enumC16313m4 = null;
                } else {
                    enumC16313m4 = enumC16313m0;
                }
                if (i24 != 0) {
                    enumC16313m5 = null;
                } else {
                    enumC16313m5 = enumC16313m1;
                }
                if (i26 != 0) {
                    str2 = null;
                }
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                if (enumC16313m4 != null) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zM87153g = c28655q2.m87153g(pillStates);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (zM87153g) {
                    objM87133R = AbstractC28683x.m87264r(new C16602z(pillStates, 1));
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC28683x.m87264r(new C16602z(pillStates, 1));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
                if (((Number) interfaceC28670t2.getValue()).intValue() >= 0) {
                    iIntValue = ((Number) interfaceC28670t2.getValue()).intValue() + (z13 ? 1 : 0);
                } else {
                    iIntValue = 0;
                }
                c26068uM77569a = AbstractC26071x.m77569a(iIntValue, 0, c28655q2, 2);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                Object value3 = interfaceC28670t2.getValue();
                boolValueOf = Boolean.valueOf(z13);
                zM87153g2 = c28655q2.m87153g(interfaceC28670t2) | c28655q2.m87155h(z13) | c28655q2.m87157i(pillStates) | c28655q2.m87153g(c26068uM77569a) | c28655q2.m87153g(interfaceC39171c);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g2) {
                    bool = boolValueOf;
                    boolean z214 = z13 ? 1 : 0;
                    objM87133R3 = new a(interfaceC28670t2, z214, pillStates, c26068uM77569a, interfaceC39171c, interfaceC28601c1, null);
                    str4 = str2;
                    c26068u = c26068uM77569a;
                    z13 = z214 ? 1 : 0;
                    pillStates = pillStates;
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    bool = boolValueOf;
                    boolean z215 = z13 ? 1 : 0;
                    objM87133R3 = new a(interfaceC28670t2, z215, pillStates, c26068uM77569a, interfaceC39171c, interfaceC28601c1, null);
                    str4 = str2;
                    c26068u = c26068uM77569a;
                    z13 = z215 ? 1 : 0;
                    pillStates = pillStates;
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87255i(value3, bool, pillStates, (InterfaceC4351m) objM87133R3, c28655q2);
                Modifier modifierM3427x3 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), 0, 3);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3427x3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(3 * 4);
                C22976l1 c22976l1M3379a3 = AbstractC1099a.m3379a(2 * 8, 0.0f, 2);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                i28 = i15;
                if ((458752 & i28) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM87155h3 = c28655q2.m87155h(z13) | z14;
                if ((57344 & i28) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z216 = zM87155h3 | z15;
                if ((29360128 & i28) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zM87157i3 = z216 | z16 | c28655q2.m87157i(pillStates);
                if ((i28 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z217 = zM87157i3 | z17;
                if ((i28 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z218 = z217 | z18;
                if ((3670016 & i28) == 1048576) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z218 | z19;
                Object objM87133R6 = c28655q2.m87133R();
                if (z24) {
                    enumC16313m6 = enumC16313m4;
                    function5 = function4;
                    enumC16313m7 = enumC16313m5;
                    interfaceC4339a2 = interfaceC4339a3;
                    c6075e = new C6075e(enumC16313m6, pillStates, enumC16313m7, z13, interfaceC4339a2, str4, function5, onPillClick);
                    c28655q2.m87172p0(c6075e);
                } else {
                    enumC16313m6 = enumC16313m4;
                    function5 = function4;
                    enumC16313m7 = enumC16313m5;
                    interfaceC4339a2 = interfaceC4339a3;
                    c6075e = new C6075e(enumC16313m6, pillStates, enumC16313m7, z13, interfaceC4339a2, str4, function5, onPillClick);
                    c28655q2.m87172p0(c6075e);
                }
                c28655q = c28655q2;
                AbstractC22674j.m65718d(modifierM3409f3, c26068u, c22976l1M3379a3, c22971kM66746i3, null, null, false, null, (Function1) c6075e, c28655q, 24966, 488);
                c28655q.m87173q(true);
                str3 = str4;
                function3 = function5;
                enumC16313m2 = enumC16313m6;
                enumC16313m3 = enumC16313m7;
                modifier2 = modifier2;
            } else {
                c28655q2.m87138X();
                enumC16313m2 = enumC16313m0;
                enumC16313m3 = enumC16313m1;
                c28655q = c28655q2;
                function3 = function2;
                str3 = str2;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(modifier2, list, onPillClick, function3, interfaceC4339a2, enumC16313m2, enumC16313m3, str3, i13, i14);
            }
        }
        i15 |= 24576;
        i18 = i14 & 32;
        if (i18 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (enumC16313m0 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC16313m0.ordinal();
            }
            if (c28655q2.m87149e(iOrdinal)) {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i19;
        }
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q2.m87149e(enumC16313m1 != null ? enumC16313m1.ordinal() : -1)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i15 |= i25;
        }
        i26 = i14 & 128;
        if (i26 != 0) {
            i15 |= 12582912;
            str2 = str;
        } else {
            str2 = str;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87153g(str2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
        }
        if ((i15 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier2 = c2314t;
            }
            if (i34 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                interfaceC4339a3 = null;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            if (i18 != 0) {
                enumC16313m4 = null;
            } else {
                enumC16313m4 = enumC16313m0;
            }
            if (i24 != 0) {
                enumC16313m5 = null;
            } else {
                enumC16313m5 = enumC16313m1;
            }
            if (i26 != 0) {
                str2 = null;
            }
            interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            if (enumC16313m4 != null) {
                z13 = false;
            } else {
                z13 = false;
            }
            zM87153g = c28655q2.m87153g(pillStates);
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (zM87153g) {
                objM87133R = AbstractC28683x.m87264r(new C16602z(pillStates, 1));
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87264r(new C16602z(pillStates, 1));
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
            if (((Number) interfaceC28670t2.getValue()).intValue() >= 0) {
                iIntValue = ((Number) interfaceC28670t2.getValue()).intValue() + (z13 ? 1 : 0);
            } else {
                iIntValue = 0;
            }
            c26068uM77569a = AbstractC26071x.m77569a(iIntValue, 0, c28655q2, 2);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            Object value4 = interfaceC28670t2.getValue();
            boolValueOf = Boolean.valueOf(z13);
            zM87153g2 = c28655q2.m87153g(interfaceC28670t2) | c28655q2.m87155h(z13) | c28655q2.m87157i(pillStates) | c28655q2.m87153g(c26068uM77569a) | c28655q2.m87153g(interfaceC39171c);
            objM87133R3 = c28655q2.m87133R();
            if (zM87153g2) {
                bool = boolValueOf;
                boolean z219 = z13 ? 1 : 0;
                objM87133R3 = new a(interfaceC28670t2, z219, pillStates, c26068uM77569a, interfaceC39171c, interfaceC28601c1, null);
                str4 = str2;
                c26068u = c26068uM77569a;
                z13 = z219 ? 1 : 0;
                pillStates = pillStates;
                c28655q2.m87172p0(objM87133R3);
            } else {
                bool = boolValueOf;
                boolean z2110 = z13 ? 1 : 0;
                objM87133R3 = new a(interfaceC28670t2, z2110, pillStates, c26068uM77569a, interfaceC39171c, interfaceC28601c1, null);
                str4 = str2;
                c26068u = c26068uM77569a;
                z13 = z2110 ? 1 : 0;
                pillStates = pillStates;
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87255i(value4, bool, pillStates, (InterfaceC4351m) objM87133R3, c28655q2);
            Modifier modifierM3427x4 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), 0, 3);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3427x4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(3 * 4);
            C22976l1 c22976l1M3379a4 = AbstractC1099a.m3379a(2 * 8, 0.0f, 2);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            i28 = i15;
            if ((458752 & i28) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean zM87155h4 = c28655q2.m87155h(z13) | z14;
            if ((57344 & i28) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z2111 = zM87155h4 | z15;
            if ((29360128 & i28) == 8388608) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zM87157i4 = z2111 | z16 | c28655q2.m87157i(pillStates);
            if ((i28 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z2112 = zM87157i4 | z17;
            if ((i28 & 896) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z2113 = z2112 | z18;
            if ((3670016 & i28) == 1048576) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = z2113 | z19;
            Object objM87133R7 = c28655q2.m87133R();
            if (z24) {
                enumC16313m6 = enumC16313m4;
                function5 = function4;
                enumC16313m7 = enumC16313m5;
                interfaceC4339a2 = interfaceC4339a3;
                c6075e = new C6075e(enumC16313m6, pillStates, enumC16313m7, z13, interfaceC4339a2, str4, function5, onPillClick);
                c28655q2.m87172p0(c6075e);
            } else {
                enumC16313m6 = enumC16313m4;
                function5 = function4;
                enumC16313m7 = enumC16313m5;
                interfaceC4339a2 = interfaceC4339a3;
                c6075e = new C6075e(enumC16313m6, pillStates, enumC16313m7, z13, interfaceC4339a2, str4, function5, onPillClick);
                c28655q2.m87172p0(c6075e);
            }
            c28655q = c28655q2;
            AbstractC22674j.m65718d(modifierM3409f4, c26068u, c22976l1M3379a4, c22971kM66746i4, null, null, false, null, (Function1) c6075e, c28655q, 24966, 488);
            c28655q.m87173q(true);
            str3 = str4;
            function3 = function5;
            enumC16313m2 = enumC16313m6;
            enumC16313m3 = enumC16313m7;
            modifier2 = modifier2;
        } else {
            c28655q2.m87138X();
            enumC16313m2 = enumC16313m0;
            enumC16313m3 = enumC16313m1;
            c28655q = c28655q2;
            function3 = function2;
            str3 = str2;
            interfaceC4339a2 = interfaceC4339a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b(modifier2, list, onPillClick, function3, interfaceC4339a2, enumC16313m2, enumC16313m3, str3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final int m47151i(List list) {
        Iterator it = list.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((C16613h) it.next()).getIsSelected()) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m47152j(final EnumC16313m0 enumC16313m0, List list, final EnumC16313m0 enumC16313m1, boolean z4, final InterfaceC4339a interfaceC4339a, final String str, Function1 function1, InterfaceC4351m interfaceC4351m, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        if (enumC16313m0 != null) {
            if (!z4) {
                enumC16313m0 = null;
            }
            if (enumC16313m0 != null) {
                final int i13 = 0;
                InterfaceC26064q.m77556b(LazyRow, null, new C37816b(new Function3() { // from class: h11.e
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        switch (i13) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC16611f.m47153k(enumC16313m0, interfaceC4339a, str, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC16611f.m47155m(enumC16313m0, interfaceC4339a, str, (InterfaceC1103a) obj, (Composer) obj2, iIntValue2);
                        }
                    }
                }, true, 11536262), 3);
            }
        }
        ((C26053f) LazyRow).m77529r(list.size(), null, new d(c.f63907w, list), new C37816b(new e(list, function1, interfaceC4351m, str), true, 802480018));
        if (enumC16313m1 != null) {
            if (interfaceC4339a == null) {
                enumC16313m1 = null;
            }
            if (enumC16313m1 != null) {
                final int i14 = 1;
                InterfaceC26064q.m77556b(LazyRow, null, new C37816b(new Function3() { // from class: h11.e
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        switch (i14) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC16611f.m47153k(enumC16313m1, interfaceC4339a, str, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC16611f.m47155m(enumC16313m1, interfaceC4339a, str, (InterfaceC1103a) obj, (Composer) obj2, iIntValue2);
                        }
                    }
                }, true, 186070127), 3);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m47153k(EnumC16313m0 enumC16313m0, InterfaceC4339a interfaceC4339a, String str, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C16613h c16613h = new C16613h(new C16606a("", ""), null, false, EnumC16612g.COMPLETED_JOURNAL, "", -1L, enumC16313m0, false, false, null, null, null, false, AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62318e), 7942, null);
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C16416l0(interfaceC4339a, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC16609d.m47136e(c16613h, (Function1) objM87133R, null, str != null ? str.concat("_LeftCalendar") : null, c28655q, 0, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m47154l(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m47155m(EnumC16313m0 enumC16313m0, InterfaceC4339a interfaceC4339a, String str, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C16613h c16613h = new C16613h(new C16606a("", ""), null, false, EnumC16612g.COMPLETED_JOURNAL, "", -1L, enumC16313m0, false, false, null, null, null, false, AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62318e), 7942, null);
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C16416l0(interfaceC4339a, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC16609d.m47136e(c16613h, (Function1) objM87133R, null, str != null ? str.concat("_RightCalendar") : null, c28655q, 0, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m47156n(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m47157o(Modifier modifier, List list, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC4339a interfaceC4339a, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, String str, int i13, int i14, Composer composer, int i15) {
        m47150h(modifier, list, interfaceC4351m, function1, interfaceC4339a, enumC16313m0, enumC16313m1, str, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

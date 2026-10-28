package aq1;

import a01.C0086f;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import aq0.C1905p;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.SegmentControlDisplay;
import f11.C14003c;
import f11.C14005e;
import fy1.AbstractC14874j;
import fy1.InterfaceC14875k;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C27314o;
import p000.C29656q;
import p003a1.C0103b;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.AbstractC33231x0;
import p736sz0.C33223u0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import so1.C32841y;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import wo1.AbstractC37474w;
import x81.C38072d;
import xn1.AbstractC38480c;
import xp1.AbstractC38530a;
import yn1.AbstractC39672a;
import yn1.C39673b;
import yp1.AbstractC39703b;
import zp1.AbstractC40940a;

/* JADX INFO: renamed from: aq1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a[\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\u000e\u0010\u000f\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lyp1/b;", "viewState", "", "analyticsSource", "Lkotlin/Function1;", "Lzp1/a;", "Ll83/a0;", "onViewEvent", "Lxp1/a;", "onNavigationEvent", "Lyn1/a;", "onAnalyticEvent", "l", "(Lyp1/b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lyp1/b$c;", "selectedSegmentId", "onSelectedSegmentIdChange", "u", "(Lyp1/b$c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1912f {

    /* JADX INFO: renamed from: aq1.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.symptompatterns.view.SymptomPatternsScreenKt$SymptomPatternsScreen$6$1", m100430f = "SymptomPatternsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f7556w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f7557x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f7558y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f7559z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f7557x = function1;
            this.f7558y = str;
            this.f7559z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f7557x, this.f7558y, this.f7559z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f7556w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f7557x.invoke(new AbstractC39672a.n0(this.f7558y, C39673b.INSTANCE.m126876c(AbstractC1912f.m5862r(this.f7559z))));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: aq1.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f7560w = new b();

        /* JADX INFO: renamed from: a */
        public final void m5871a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5871a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: aq1.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f7561w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: aq1.f$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f7562w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f7563x;

        public d(Function1 function1, List list) {
            this.f7562w = function1;
            this.f7563x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m5873a(int i13) {
            return this.f7562w.invoke(this.f7563x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m5873a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: aq1.f$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f7564w;

        public e(List list) {
            this.f7564w = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m5874a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f7564w.get(i13);
            c28655q.m87150e0(-983940384);
            boolean z4 = interfaceC25312u instanceof C32841y;
            C2314t c2314t = C2314t.f9131w;
            if (z4) {
                c28655q.m87150e0(-983903619);
                float f13 = 4;
                AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                AbstractC37474w.m120154b((C32841y) interfaceC25312u, c28655q, 0);
                AbstractC31061c.m95650z(6, f13, c2314t, c28655q, false);
            } else if (interfaceC25312u instanceof C14005e) {
                c28655q.m87150e0(-983591511);
                C14003c c14003c = new C14003c();
                C14005e c14005eM39876b = C14005e.m39876b((C14005e) interfaceC25312u, null, false, false, null, null, false, false, 0.0f, 12.0f, false, null, null, 3839, null);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = b.f7560w;
                    c28655q.m87172p0(objM87133R);
                }
                c14003c.Compose(c14005eM39876b, (Function1) objM87133R, c28655q, (C14003c.f49967a << 6) | C14005e.f49972m | 48);
                float f14 = 4;
                AbstractC31061c.m95650z(f14, f14, c2314t, c28655q, false);
            } else {
                c28655q.m87150e0(-983282658);
                AbstractC25303l.m74291r(interfaceC25312u, null, null, null, c28655q, 0, 14);
                float f15 = 4;
                AbstractC31061c.m95650z(f15, f15, c2314t, c28655q, false);
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m5874a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:106:0x0210  */
    /* JADX WARN: Code duplicated, block: B:108:0x0215  */
    /* JADX WARN: Code duplicated, block: B:110:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x022e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0246  */
    /* JADX WARN: Code duplicated, block: B:115:0x0249  */
    /* JADX WARN: Code duplicated, block: B:119:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0262  */
    /* JADX WARN: Code duplicated, block: B:126:0x027d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x027f  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:0x012c  */
    /* JADX WARN: Code duplicated, block: B:90:0x013f  */
    /* JADX WARN: Code duplicated, block: B:92:0x014d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0190  */
    /* JADX WARN: Code duplicated, block: B:97:0x0198  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cd  */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0190, please report this as an issue */
    /* JADX INFO: renamed from: l */
    public static final void m5856l(AbstractC39703b viewState, String str, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        Function1 function5;
        int i19;
        int i24;
        Function1 function6;
        int i25;
        boolean z4;
        String str3;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        Function1 function12;
        int i26;
        AbstractC39703b.c cVar;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z13;
        boolean zM87153g2;
        Object objM87133R2;
        boolean zM87153g3;
        Object objM87133R3;
        Function1 function13;
        Function1 function14;
        boolean z14;
        Object objM87133R4;
        Function1 function15;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-820539286);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i27 = i14 & 2;
        if (i27 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function1;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function5 = function2;
                        if (c28655q.m87157i(function5)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            function6 = function3;
                            if (c28655q.m87157i(function6)) {
                                i25 = 16384;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 9363) != 9362) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z4)) {
                            if (i27 != 0) {
                                str2 = null;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R7 = c28655q.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = new C1905p(1);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                function10 = (Function1) objM87133R7;
                            } else {
                                function10 = function4;
                            }
                            if (i18 != 0) {
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C1905p(2);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                function11 = (Function1) objM87133R6;
                            } else {
                                function11 = function5;
                            }
                            if (i24 != 0) {
                                objM87133R5 = c28655q.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C1905p(3);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                function12 = (Function1) objM87133R5;
                            } else {
                                function12 = function6;
                            }
                            i26 = i15 & 14;
                            AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                            if (viewState instanceof AbstractC39703b.b) {
                                c28655q.m87150e0(-2026480063);
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
                                function15 = function12;
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            } else {
                                function6 = function12;
                                if (viewState instanceof AbstractC39703b.a) {
                                    c28655q.m87150e0(-2026090114);
                                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                    TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                    if ((i15 & 896) == 256) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    objM87133R4 = c28655q.m87133R();
                                    if (z14 || objM87133R4 == c28676v0) {
                                        objM87133R4 = new C27314o(function10, 7);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                                    int i28 = AbstractC33208p0.b.f138467h;
                                    int i29 = TextResource.$stable;
                                    int i34 = i28 | (i29 << 3) | (i29 << 9);
                                    function15 = function6;
                                    AbstractC33199m0.m105214F(bVar, textResourceM21278l, null, textResourceM21278l2, interfaceC4339a, false, false, null, null, null, false, false, c28655q, i34, 0, 4068);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                } else {
                                    if (viewState instanceof AbstractC39703b.c) {
                                        throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                                    }
                                    c28655q.m87150e0(-2025560231);
                                    cVar = (AbstractC39703b.c) viewState;
                                    zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                                    objM87133R = c28655q.m87133R();
                                    if (zM87153g || objM87133R == c28676v0) {
                                        objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                                    String strM5862r = m5862r(interfaceC28601c1);
                                    if ((i15 & 57344) == 16384) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                                    objM87133R2 = c28655q.m87133R();
                                    if (zM87153g2 || objM87133R2 == c28676v0) {
                                        objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    AbstractC28683x.m87254h(str2, strM5862r, (InterfaceC4351m) objM87133R2, c28655q);
                                    String strM5862r2 = m5862r(interfaceC28601c1);
                                    zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                                    objM87133R3 = c28655q.m87133R();
                                    if (zM87153g3 || objM87133R3 == c28676v0) {
                                        objM87133R3 = new C1910d(0, interfaceC28601c1);
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    Function1 function16 = (Function1) objM87133R3;
                                    int i35 = i15 << 3;
                                    int i36 = (i35 & 7168) | i26 | (i35 & 57344);
                                    function13 = function10;
                                    function14 = function11;
                                    m5865u(cVar, strM5862r2, function16, function13, function14, c28655q, i36);
                                    c28655q.m87173q(false);
                                }
                                str3 = str2;
                                function7 = function13;
                                function8 = function14;
                            }
                            function6 = function15;
                            function13 = function10;
                            function14 = function11;
                            str3 = str2;
                            function7 = function13;
                            function8 = function14;
                        } else {
                            c28655q.m87138X();
                            str3 = str2;
                            function7 = function4;
                            function8 = function5;
                        }
                        function9 = function6;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
                        }
                    }
                    i15 |= 24576;
                    function6 = function3;
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i27 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C1905p(1);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function10 = (Function1) objM87133R7;
                        } else {
                            function10 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C1905p(2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function11 = (Function1) objM87133R6;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C1905p(3);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function12 = (Function1) objM87133R5;
                        } else {
                            function12 = function6;
                        }
                        i26 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                        if (viewState instanceof AbstractC39703b.b) {
                            c28655q.m87150e0(-2026480063);
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
                            function15 = function12;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            function6 = function12;
                            if (viewState instanceof AbstractC39703b.a) {
                                c28655q.m87150e0(-2026090114);
                                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                if ((i15 & 896) == 256) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z14) {
                                    objM87133R4 = new C27314o(function10, 7);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C27314o(function10, 7);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                                int i210 = AbstractC33208p0.b.f138467h;
                                int i211 = TextResource.$stable;
                                int i37 = i210 | (i211 << 3) | (i211 << 9);
                                function15 = function6;
                                AbstractC33199m0.m105214F(bVar2, textResourceM21278l3, null, textResourceM21278l4, interfaceC4339a2, false, false, null, null, null, false, false, c28655q, i37, 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC39703b.c) {
                                    throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                                }
                                c28655q.m87150e0(-2025560231);
                                cVar = (AbstractC39703b.c) viewState;
                                zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                                objM87133R = c28655q.m87133R();
                                if (zM87153g) {
                                    objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                                String strM5862r3 = m5862r(interfaceC28601c1);
                                if ((i15 & 57344) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                                objM87133R2 = c28655q.m87133R();
                                if (zM87153g2) {
                                    objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                AbstractC28683x.m87254h(str2, strM5862r3, (InterfaceC4351m) objM87133R2, c28655q);
                                String strM5862r4 = m5862r(interfaceC28601c1);
                                zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                                objM87133R3 = c28655q.m87133R();
                                if (zM87153g3) {
                                    objM87133R3 = new C1910d(0, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C1910d(0, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                Function1 function17 = (Function1) objM87133R3;
                                int i38 = i15 << 3;
                                int i39 = (i38 & 7168) | i26 | (i38 & 57344);
                                function13 = function10;
                                function14 = function11;
                                m5865u(cVar, strM5862r4, function17, function13, function14, c28655q, i39);
                                c28655q.m87173q(false);
                            }
                            str3 = str2;
                            function7 = function13;
                            function8 = function14;
                        }
                        function6 = function15;
                        function13 = function10;
                        function14 = function11;
                        str3 = str2;
                        function7 = function13;
                        function8 = function14;
                    } else {
                        c28655q.m87138X();
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                    }
                    function9 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
                    }
                }
                i15 |= 3072;
                function5 = function2;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i27 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C1905p(1);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function10 = (Function1) objM87133R7;
                        } else {
                            function10 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C1905p(2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function11 = (Function1) objM87133R6;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C1905p(3);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function12 = (Function1) objM87133R5;
                        } else {
                            function12 = function6;
                        }
                        i26 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                        if (viewState instanceof AbstractC39703b.b) {
                            c28655q.m87150e0(-2026480063);
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
                            function15 = function12;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            function6 = function12;
                            if (viewState instanceof AbstractC39703b.a) {
                                c28655q.m87150e0(-2026090114);
                                AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                if ((i15 & 896) == 256) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z14) {
                                    objM87133R4 = new C27314o(function10, 7);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C27314o(function10, 7);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                                int i212 = AbstractC33208p0.b.f138467h;
                                int i213 = TextResource.$stable;
                                int i310 = i212 | (i213 << 3) | (i213 << 9);
                                function15 = function6;
                                AbstractC33199m0.m105214F(bVar3, textResourceM21278l5, null, textResourceM21278l6, interfaceC4339a3, false, false, null, null, null, false, false, c28655q, i310, 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC39703b.c) {
                                    throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                                }
                                c28655q.m87150e0(-2025560231);
                                cVar = (AbstractC39703b.c) viewState;
                                zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                                objM87133R = c28655q.m87133R();
                                if (zM87153g) {
                                    objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                                String strM5862r5 = m5862r(interfaceC28601c1);
                                if ((i15 & 57344) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                                objM87133R2 = c28655q.m87133R();
                                if (zM87153g2) {
                                    objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                AbstractC28683x.m87254h(str2, strM5862r5, (InterfaceC4351m) objM87133R2, c28655q);
                                String strM5862r6 = m5862r(interfaceC28601c1);
                                zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                                objM87133R3 = c28655q.m87133R();
                                if (zM87153g3) {
                                    objM87133R3 = new C1910d(0, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C1910d(0, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                Function1 function18 = (Function1) objM87133R3;
                                int i311 = i15 << 3;
                                int i312 = (i311 & 7168) | i26 | (i311 & 57344);
                                function13 = function10;
                                function14 = function11;
                                m5865u(cVar, strM5862r6, function18, function13, function14, c28655q, i312);
                                c28655q.m87173q(false);
                            }
                            str3 = str2;
                            function7 = function13;
                            function8 = function14;
                        }
                        function6 = function15;
                        function13 = function10;
                        function14 = function11;
                        str3 = str2;
                        function7 = function13;
                        function8 = function14;
                    } else {
                        c28655q.m87138X();
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                    }
                    function9 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C1905p(1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C1905p(2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C1905p(3);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function12 = (Function1) objM87133R5;
                    } else {
                        function12 = function6;
                    }
                    i26 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                    if (viewState instanceof AbstractC39703b.b) {
                        c28655q.m87150e0(-2026480063);
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
                        function15 = function12;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function6 = function12;
                        if (viewState instanceof AbstractC39703b.a) {
                            c28655q.m87150e0(-2026090114);
                            AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z14) {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                            int i214 = AbstractC33208p0.b.f138467h;
                            int i215 = TextResource.$stable;
                            int i313 = i214 | (i215 << 3) | (i215 << 9);
                            function15 = function6;
                            AbstractC33199m0.m105214F(bVar4, textResourceM21278l7, null, textResourceM21278l8, interfaceC4339a4, false, false, null, null, null, false, false, c28655q, i313, 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC39703b.c) {
                                throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                            }
                            c28655q.m87150e0(-2025560231);
                            cVar = (AbstractC39703b.c) viewState;
                            zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                            objM87133R = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            String strM5862r7 = m5862r(interfaceC28601c1);
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87254h(str2, strM5862r7, (InterfaceC4351m) objM87133R2, c28655q);
                            String strM5862r8 = m5862r(interfaceC28601c1);
                            zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function19 = (Function1) objM87133R3;
                            int i314 = i15 << 3;
                            int i315 = (i314 & 7168) | i26 | (i314 & 57344);
                            function13 = function10;
                            function14 = function11;
                            m5865u(cVar, strM5862r8, function19, function13, function14, c28655q, i315);
                            c28655q.m87173q(false);
                        }
                        str3 = str2;
                        function7 = function13;
                        function8 = function14;
                    }
                    function6 = function15;
                    function13 = function10;
                    function14 = function11;
                    str3 = str2;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
                }
            }
            i15 |= 384;
            function4 = function1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i27 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C1905p(1);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function10 = (Function1) objM87133R7;
                        } else {
                            function10 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C1905p(2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function11 = (Function1) objM87133R6;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C1905p(3);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function12 = (Function1) objM87133R5;
                        } else {
                            function12 = function6;
                        }
                        i26 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                        if (viewState instanceof AbstractC39703b.b) {
                            c28655q.m87150e0(-2026480063);
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
                            function15 = function12;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            function6 = function12;
                            if (viewState instanceof AbstractC39703b.a) {
                                c28655q.m87150e0(-2026090114);
                                AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l9 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l10 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                if ((i15 & 896) == 256) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z14) {
                                    objM87133R4 = new C27314o(function10, 7);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C27314o(function10, 7);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R4;
                                int i216 = AbstractC33208p0.b.f138467h;
                                int i217 = TextResource.$stable;
                                int i316 = i216 | (i217 << 3) | (i217 << 9);
                                function15 = function6;
                                AbstractC33199m0.m105214F(bVar5, textResourceM21278l9, null, textResourceM21278l10, interfaceC4339a5, false, false, null, null, null, false, false, c28655q, i316, 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC39703b.c) {
                                    throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                                }
                                c28655q.m87150e0(-2025560231);
                                cVar = (AbstractC39703b.c) viewState;
                                zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                                objM87133R = c28655q.m87133R();
                                if (zM87153g) {
                                    objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                                String strM5862r9 = m5862r(interfaceC28601c1);
                                if ((i15 & 57344) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                                objM87133R2 = c28655q.m87133R();
                                if (zM87153g2) {
                                    objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                AbstractC28683x.m87254h(str2, strM5862r9, (InterfaceC4351m) objM87133R2, c28655q);
                                String strM5862r10 = m5862r(interfaceC28601c1);
                                zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                                objM87133R3 = c28655q.m87133R();
                                if (zM87153g3) {
                                    objM87133R3 = new C1910d(0, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C1910d(0, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                Function1 function110 = (Function1) objM87133R3;
                                int i317 = i15 << 3;
                                int i318 = (i317 & 7168) | i26 | (i317 & 57344);
                                function13 = function10;
                                function14 = function11;
                                m5865u(cVar, strM5862r10, function110, function13, function14, c28655q, i318);
                                c28655q.m87173q(false);
                            }
                            str3 = str2;
                            function7 = function13;
                            function8 = function14;
                        }
                        function6 = function15;
                        function13 = function10;
                        function14 = function11;
                        str3 = str2;
                        function7 = function13;
                        function8 = function14;
                    } else {
                        c28655q.m87138X();
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                    }
                    function9 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C1905p(1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C1905p(2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C1905p(3);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function12 = (Function1) objM87133R5;
                    } else {
                        function12 = function6;
                    }
                    i26 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                    if (viewState instanceof AbstractC39703b.b) {
                        c28655q.m87150e0(-2026480063);
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
                        function15 = function12;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function6 = function12;
                        if (viewState instanceof AbstractC39703b.a) {
                            c28655q.m87150e0(-2026090114);
                            AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l11 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l12 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z14) {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R4;
                            int i218 = AbstractC33208p0.b.f138467h;
                            int i219 = TextResource.$stable;
                            int i319 = i218 | (i219 << 3) | (i219 << 9);
                            function15 = function6;
                            AbstractC33199m0.m105214F(bVar6, textResourceM21278l11, null, textResourceM21278l12, interfaceC4339a6, false, false, null, null, null, false, false, c28655q, i319, 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC39703b.c) {
                                throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                            }
                            c28655q.m87150e0(-2025560231);
                            cVar = (AbstractC39703b.c) viewState;
                            zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                            objM87133R = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            String strM5862r11 = m5862r(interfaceC28601c1);
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87254h(str2, strM5862r11, (InterfaceC4351m) objM87133R2, c28655q);
                            String strM5862r12 = m5862r(interfaceC28601c1);
                            zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function111 = (Function1) objM87133R3;
                            int i3110 = i15 << 3;
                            int i3111 = (i3110 & 7168) | i26 | (i3110 & 57344);
                            function13 = function10;
                            function14 = function11;
                            m5865u(cVar, strM5862r12, function111, function13, function14, c28655q, i3111);
                            c28655q.m87173q(false);
                        }
                        str3 = str2;
                        function7 = function13;
                        function8 = function14;
                    }
                    function6 = function15;
                    function13 = function10;
                    function14 = function11;
                    str3 = str2;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
                }
            }
            i15 |= 3072;
            function5 = function2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C1905p(1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C1905p(2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C1905p(3);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function12 = (Function1) objM87133R5;
                    } else {
                        function12 = function6;
                    }
                    i26 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                    if (viewState instanceof AbstractC39703b.b) {
                        c28655q.m87150e0(-2026480063);
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
                        function15 = function12;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function6 = function12;
                        if (viewState instanceof AbstractC39703b.a) {
                            c28655q.m87150e0(-2026090114);
                            AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l13 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l14 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z14) {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R4;
                            int i2110 = AbstractC33208p0.b.f138467h;
                            int i2111 = TextResource.$stable;
                            int i3112 = i2110 | (i2111 << 3) | (i2111 << 9);
                            function15 = function6;
                            AbstractC33199m0.m105214F(bVar7, textResourceM21278l13, null, textResourceM21278l14, interfaceC4339a7, false, false, null, null, null, false, false, c28655q, i3112, 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC39703b.c) {
                                throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                            }
                            c28655q.m87150e0(-2025560231);
                            cVar = (AbstractC39703b.c) viewState;
                            zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                            objM87133R = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            String strM5862r13 = m5862r(interfaceC28601c1);
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87254h(str2, strM5862r13, (InterfaceC4351m) objM87133R2, c28655q);
                            String strM5862r14 = m5862r(interfaceC28601c1);
                            zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function112 = (Function1) objM87133R3;
                            int i3113 = i15 << 3;
                            int i3114 = (i3113 & 7168) | i26 | (i3113 & 57344);
                            function13 = function10;
                            function14 = function11;
                            m5865u(cVar, strM5862r14, function112, function13, function14, c28655q, i3114);
                            c28655q.m87173q(false);
                        }
                        str3 = str2;
                        function7 = function13;
                        function8 = function14;
                    }
                    function6 = function15;
                    function13 = function10;
                    function14 = function11;
                    str3 = str2;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
                }
            }
            i15 |= 24576;
            function6 = function3;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i27 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C1905p(1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function10 = function4;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C1905p(2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function11 = (Function1) objM87133R6;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1905p(3);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function12 = (Function1) objM87133R5;
                } else {
                    function12 = function6;
                }
                i26 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                if (viewState instanceof AbstractC39703b.b) {
                    c28655q.m87150e0(-2026480063);
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
                    function15 = function12;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function6 = function12;
                    if (viewState instanceof AbstractC39703b.a) {
                        c28655q.m87150e0(-2026090114);
                        AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l15 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l16 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z14) {
                            objM87133R4 = new C27314o(function10, 7);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C27314o(function10, 7);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                        int i2112 = AbstractC33208p0.b.f138467h;
                        int i2113 = TextResource.$stable;
                        int i3115 = i2112 | (i2113 << 3) | (i2113 << 9);
                        function15 = function6;
                        AbstractC33199m0.m105214F(bVar8, textResourceM21278l15, null, textResourceM21278l16, interfaceC4339a8, false, false, null, null, null, false, false, c28655q, i3115, 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC39703b.c) {
                            throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                        }
                        c28655q.m87150e0(-2025560231);
                        cVar = (AbstractC39703b.c) viewState;
                        zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        String strM5862r15 = m5862r(interfaceC28601c1);
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87254h(str2, strM5862r15, (InterfaceC4351m) objM87133R2, c28655q);
                        String strM5862r16 = m5862r(interfaceC28601c1);
                        zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R3 = new C1910d(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C1910d(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function113 = (Function1) objM87133R3;
                        int i3116 = i15 << 3;
                        int i3117 = (i3116 & 7168) | i26 | (i3116 & 57344);
                        function13 = function10;
                        function14 = function11;
                        m5865u(cVar, strM5862r16, function113, function13, function14, c28655q, i3117);
                        c28655q.m87173q(false);
                    }
                    str3 = str2;
                    function7 = function13;
                    function8 = function14;
                }
                function6 = function15;
                function13 = function10;
                function14 = function11;
                str3 = str2;
                function7 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function7 = function4;
                function8 = function5;
            }
            function9 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function1;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i27 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C1905p(1);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function10 = (Function1) objM87133R7;
                        } else {
                            function10 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C1905p(2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function11 = (Function1) objM87133R6;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C1905p(3);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function12 = (Function1) objM87133R5;
                        } else {
                            function12 = function6;
                        }
                        i26 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                        if (viewState instanceof AbstractC39703b.b) {
                            c28655q.m87150e0(-2026480063);
                            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a9);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                            function15 = function12;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            function6 = function12;
                            if (viewState instanceof AbstractC39703b.a) {
                                c28655q.m87150e0(-2026090114);
                                AbstractC33208p0.b bVar9 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l17 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l18 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                if ((i15 & 896) == 256) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z14) {
                                    objM87133R4 = new C27314o(function10, 7);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C27314o(function10, 7);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R4;
                                int i2114 = AbstractC33208p0.b.f138467h;
                                int i2115 = TextResource.$stable;
                                int i3118 = i2114 | (i2115 << 3) | (i2115 << 9);
                                function15 = function6;
                                AbstractC33199m0.m105214F(bVar9, textResourceM21278l17, null, textResourceM21278l18, interfaceC4339a9, false, false, null, null, null, false, false, c28655q, i3118, 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC39703b.c) {
                                    throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                                }
                                c28655q.m87150e0(-2025560231);
                                cVar = (AbstractC39703b.c) viewState;
                                zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                                objM87133R = c28655q.m87133R();
                                if (zM87153g) {
                                    objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                                String strM5862r17 = m5862r(interfaceC28601c1);
                                if ((i15 & 57344) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                                objM87133R2 = c28655q.m87133R();
                                if (zM87153g2) {
                                    objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                AbstractC28683x.m87254h(str2, strM5862r17, (InterfaceC4351m) objM87133R2, c28655q);
                                String strM5862r18 = m5862r(interfaceC28601c1);
                                zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                                objM87133R3 = c28655q.m87133R();
                                if (zM87153g3) {
                                    objM87133R3 = new C1910d(0, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C1910d(0, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                Function1 function114 = (Function1) objM87133R3;
                                int i3119 = i15 << 3;
                                int i31110 = (i3119 & 7168) | i26 | (i3119 & 57344);
                                function13 = function10;
                                function14 = function11;
                                m5865u(cVar, strM5862r18, function114, function13, function14, c28655q, i31110);
                                c28655q.m87173q(false);
                            }
                            str3 = str2;
                            function7 = function13;
                            function8 = function14;
                        }
                        function6 = function15;
                        function13 = function10;
                        function14 = function11;
                        str3 = str2;
                        function7 = function13;
                        function8 = function14;
                    } else {
                        c28655q.m87138X();
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                    }
                    function9 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C1905p(1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C1905p(2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C1905p(3);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function12 = (Function1) objM87133R5;
                    } else {
                        function12 = function6;
                    }
                    i26 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                    if (viewState instanceof AbstractC39703b.b) {
                        c28655q.m87150e0(-2026480063);
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a10);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                        function15 = function12;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function6 = function12;
                        if (viewState instanceof AbstractC39703b.a) {
                            c28655q.m87150e0(-2026090114);
                            AbstractC33208p0.b bVar10 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l19 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z14) {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R4;
                            int i2116 = AbstractC33208p0.b.f138467h;
                            int i2117 = TextResource.$stable;
                            int i31111 = i2116 | (i2117 << 3) | (i2117 << 9);
                            function15 = function6;
                            AbstractC33199m0.m105214F(bVar10, textResourceM21278l19, null, textResourceM21278l110, interfaceC4339a10, false, false, null, null, null, false, false, c28655q, i31111, 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC39703b.c) {
                                throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                            }
                            c28655q.m87150e0(-2025560231);
                            cVar = (AbstractC39703b.c) viewState;
                            zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                            objM87133R = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            String strM5862r19 = m5862r(interfaceC28601c1);
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87254h(str2, strM5862r19, (InterfaceC4351m) objM87133R2, c28655q);
                            String strM5862r110 = m5862r(interfaceC28601c1);
                            zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function115 = (Function1) objM87133R3;
                            int i31112 = i15 << 3;
                            int i31113 = (i31112 & 7168) | i26 | (i31112 & 57344);
                            function13 = function10;
                            function14 = function11;
                            m5865u(cVar, strM5862r110, function115, function13, function14, c28655q, i31113);
                            c28655q.m87173q(false);
                        }
                        str3 = str2;
                        function7 = function13;
                        function8 = function14;
                    }
                    function6 = function15;
                    function13 = function10;
                    function14 = function11;
                    str3 = str2;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
                }
            }
            i15 |= 3072;
            function5 = function2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C1905p(1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C1905p(2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C1905p(3);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function12 = (Function1) objM87133R5;
                    } else {
                        function12 = function6;
                    }
                    i26 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                    if (viewState instanceof AbstractC39703b.b) {
                        c28655q.m87150e0(-2026480063);
                        C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a11);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                        function15 = function12;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function6 = function12;
                        if (viewState instanceof AbstractC39703b.a) {
                            c28655q.m87150e0(-2026090114);
                            AbstractC33208p0.b bVar11 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l111 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l112 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z14) {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R4;
                            int i2118 = AbstractC33208p0.b.f138467h;
                            int i2119 = TextResource.$stable;
                            int i31114 = i2118 | (i2119 << 3) | (i2119 << 9);
                            function15 = function6;
                            AbstractC33199m0.m105214F(bVar11, textResourceM21278l111, null, textResourceM21278l112, interfaceC4339a11, false, false, null, null, null, false, false, c28655q, i31114, 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC39703b.c) {
                                throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                            }
                            c28655q.m87150e0(-2025560231);
                            cVar = (AbstractC39703b.c) viewState;
                            zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                            objM87133R = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            String strM5862r111 = m5862r(interfaceC28601c1);
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87254h(str2, strM5862r111, (InterfaceC4351m) objM87133R2, c28655q);
                            String strM5862r112 = m5862r(interfaceC28601c1);
                            zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function116 = (Function1) objM87133R3;
                            int i31115 = i15 << 3;
                            int i31116 = (i31115 & 7168) | i26 | (i31115 & 57344);
                            function13 = function10;
                            function14 = function11;
                            m5865u(cVar, strM5862r112, function116, function13, function14, c28655q, i31116);
                            c28655q.m87173q(false);
                        }
                        str3 = str2;
                        function7 = function13;
                        function8 = function14;
                    }
                    function6 = function15;
                    function13 = function10;
                    function14 = function11;
                    str3 = str2;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
                }
            }
            i15 |= 24576;
            function6 = function3;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i27 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C1905p(1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function10 = function4;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C1905p(2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function11 = (Function1) objM87133R6;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1905p(3);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function12 = (Function1) objM87133R5;
                } else {
                    function12 = function6;
                }
                i26 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                if (viewState instanceof AbstractC39703b.b) {
                    c28655q.m87150e0(-2026480063);
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                    function15 = function12;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function6 = function12;
                    if (viewState instanceof AbstractC39703b.a) {
                        c28655q.m87150e0(-2026090114);
                        AbstractC33208p0.b bVar12 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l113 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l114 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z14) {
                            objM87133R4 = new C27314o(function10, 7);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C27314o(function10, 7);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R4;
                        int i21110 = AbstractC33208p0.b.f138467h;
                        int i21111 = TextResource.$stable;
                        int i31117 = i21110 | (i21111 << 3) | (i21111 << 9);
                        function15 = function6;
                        AbstractC33199m0.m105214F(bVar12, textResourceM21278l113, null, textResourceM21278l114, interfaceC4339a12, false, false, null, null, null, false, false, c28655q, i31117, 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC39703b.c) {
                            throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                        }
                        c28655q.m87150e0(-2025560231);
                        cVar = (AbstractC39703b.c) viewState;
                        zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        String strM5862r113 = m5862r(interfaceC28601c1);
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87254h(str2, strM5862r113, (InterfaceC4351m) objM87133R2, c28655q);
                        String strM5862r114 = m5862r(interfaceC28601c1);
                        zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R3 = new C1910d(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C1910d(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function117 = (Function1) objM87133R3;
                        int i31118 = i15 << 3;
                        int i31119 = (i31118 & 7168) | i26 | (i31118 & 57344);
                        function13 = function10;
                        function14 = function11;
                        m5865u(cVar, strM5862r114, function117, function13, function14, c28655q, i31119);
                        c28655q.m87173q(false);
                    }
                    str3 = str2;
                    function7 = function13;
                    function8 = function14;
                }
                function6 = function15;
                function13 = function10;
                function14 = function11;
                str3 = str2;
                function7 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function7 = function4;
                function8 = function5;
            }
            function9 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
            }
        }
        i15 |= 384;
        function4 = function1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C1905p(1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C1905p(2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C1905p(3);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function12 = (Function1) objM87133R5;
                    } else {
                        function12 = function6;
                    }
                    i26 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                    if (viewState instanceof AbstractC39703b.b) {
                        c28655q.m87150e0(-2026480063);
                        C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a13);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                        function15 = function12;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function6 = function12;
                        if (viewState instanceof AbstractC39703b.a) {
                            c28655q.m87150e0(-2026090114);
                            AbstractC33208p0.b bVar13 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l115 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l116 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z14) {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C27314o(function10, 7);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                            int i21112 = AbstractC33208p0.b.f138467h;
                            int i21113 = TextResource.$stable;
                            int i311110 = i21112 | (i21113 << 3) | (i21113 << 9);
                            function15 = function6;
                            AbstractC33199m0.m105214F(bVar13, textResourceM21278l115, null, textResourceM21278l116, interfaceC4339a13, false, false, null, null, null, false, false, c28655q, i311110, 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC39703b.c) {
                                throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                            }
                            c28655q.m87150e0(-2025560231);
                            cVar = (AbstractC39703b.c) viewState;
                            zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                            objM87133R = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            String strM5862r115 = m5862r(interfaceC28601c1);
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87254h(str2, strM5862r115, (InterfaceC4351m) objM87133R2, c28655q);
                            String strM5862r116 = m5862r(interfaceC28601c1);
                            zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C1910d(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function118 = (Function1) objM87133R3;
                            int i311111 = i15 << 3;
                            int i311112 = (i311111 & 7168) | i26 | (i311111 & 57344);
                            function13 = function10;
                            function14 = function11;
                            m5865u(cVar, strM5862r116, function118, function13, function14, c28655q, i311112);
                            c28655q.m87173q(false);
                        }
                        str3 = str2;
                        function7 = function13;
                        function8 = function14;
                    }
                    function6 = function15;
                    function13 = function10;
                    function14 = function11;
                    str3 = str2;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
                }
            }
            i15 |= 24576;
            function6 = function3;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i27 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C1905p(1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function10 = function4;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C1905p(2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function11 = (Function1) objM87133R6;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1905p(3);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function12 = (Function1) objM87133R5;
                } else {
                    function12 = function6;
                }
                i26 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                if (viewState instanceof AbstractC39703b.b) {
                    c28655q.m87150e0(-2026480063);
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a14);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
                    function15 = function12;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function6 = function12;
                    if (viewState instanceof AbstractC39703b.a) {
                        c28655q.m87150e0(-2026090114);
                        AbstractC33208p0.b bVar14 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l117 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l118 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z14) {
                            objM87133R4 = new C27314o(function10, 7);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C27314o(function10, 7);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                        int i21114 = AbstractC33208p0.b.f138467h;
                        int i21115 = TextResource.$stable;
                        int i311113 = i21114 | (i21115 << 3) | (i21115 << 9);
                        function15 = function6;
                        AbstractC33199m0.m105214F(bVar14, textResourceM21278l117, null, textResourceM21278l118, interfaceC4339a14, false, false, null, null, null, false, false, c28655q, i311113, 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC39703b.c) {
                            throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                        }
                        c28655q.m87150e0(-2025560231);
                        cVar = (AbstractC39703b.c) viewState;
                        zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        String strM5862r117 = m5862r(interfaceC28601c1);
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87254h(str2, strM5862r117, (InterfaceC4351m) objM87133R2, c28655q);
                        String strM5862r118 = m5862r(interfaceC28601c1);
                        zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R3 = new C1910d(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C1910d(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function119 = (Function1) objM87133R3;
                        int i311114 = i15 << 3;
                        int i311115 = (i311114 & 7168) | i26 | (i311114 & 57344);
                        function13 = function10;
                        function14 = function11;
                        m5865u(cVar, strM5862r118, function119, function13, function14, c28655q, i311115);
                        c28655q.m87173q(false);
                    }
                    str3 = str2;
                    function7 = function13;
                    function8 = function14;
                }
                function6 = function15;
                function13 = function10;
                function14 = function11;
                str3 = str2;
                function7 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function7 = function4;
                function8 = function5;
            }
            function9 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
            }
        }
        i15 |= 3072;
        function5 = function2;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i25 = 16384;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i27 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C1905p(1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function10 = function4;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C1905p(2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function11 = (Function1) objM87133R6;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1905p(3);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function12 = (Function1) objM87133R5;
                } else {
                    function12 = function6;
                }
                i26 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
                if (viewState instanceof AbstractC39703b.b) {
                    c28655q.m87150e0(-2026480063);
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a15);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                    function15 = function12;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function6 = function12;
                    if (viewState instanceof AbstractC39703b.a) {
                        c28655q.m87150e0(-2026090114);
                        AbstractC33208p0.b bVar15 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l119 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l1110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z14) {
                            objM87133R4 = new C27314o(function10, 7);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C27314o(function10, 7);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R4;
                        int i21116 = AbstractC33208p0.b.f138467h;
                        int i21117 = TextResource.$stable;
                        int i311116 = i21116 | (i21117 << 3) | (i21117 << 9);
                        function15 = function6;
                        AbstractC33199m0.m105214F(bVar15, textResourceM21278l119, null, textResourceM21278l1110, interfaceC4339a15, false, false, null, null, null, false, false, c28655q, i311116, 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC39703b.c) {
                            throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                        }
                        c28655q.m87150e0(-2025560231);
                        cVar = (AbstractC39703b.c) viewState;
                        zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        String strM5862r119 = m5862r(interfaceC28601c1);
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87254h(str2, strM5862r119, (InterfaceC4351m) objM87133R2, c28655q);
                        String strM5862r1110 = m5862r(interfaceC28601c1);
                        zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R3 = new C1910d(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C1910d(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function1110 = (Function1) objM87133R3;
                        int i311117 = i15 << 3;
                        int i311118 = (i311117 & 7168) | i26 | (i311117 & 57344);
                        function13 = function10;
                        function14 = function11;
                        m5865u(cVar, strM5862r1110, function1110, function13, function14, c28655q, i311118);
                        c28655q.m87173q(false);
                    }
                    str3 = str2;
                    function7 = function13;
                    function8 = function14;
                }
                function6 = function15;
                function13 = function10;
                function14 = function11;
                str3 = str2;
                function7 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function7 = function4;
                function8 = function5;
            }
            function9 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
            }
        }
        i15 |= 24576;
        function6 = function3;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i27 != 0) {
                str2 = null;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C1905p(1);
                    c28655q.m87172p0(objM87133R7);
                }
                function10 = (Function1) objM87133R7;
            } else {
                function10 = function4;
            }
            if (i18 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C1905p(2);
                    c28655q.m87172p0(objM87133R6);
                }
                function11 = (Function1) objM87133R6;
            } else {
                function11 = function5;
            }
            if (i24 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C1905p(3);
                    c28655q.m87172p0(objM87133R5);
                }
                function12 = (Function1) objM87133R5;
            } else {
                function12 = function6;
            }
            i26 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "healthcare_womens_health_hormonal_symptom_patterns", c28655q, i26 | 48);
            if (viewState instanceof AbstractC39703b.b) {
                c28655q.m87150e0(-2026480063);
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a16);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                function15 = function12;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                function6 = function12;
                if (viewState instanceof AbstractC39703b.a) {
                    c28655q.m87150e0(-2026090114);
                    AbstractC33208p0.b bVar16 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                    TextResource textResourceM21278l1111 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                    TextResource textResourceM21278l1112 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z14) {
                        objM87133R4 = new C27314o(function10, 7);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C27314o(function10, 7);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R4;
                    int i21118 = AbstractC33208p0.b.f138467h;
                    int i21119 = TextResource.$stable;
                    int i311119 = i21118 | (i21119 << 3) | (i21119 << 9);
                    function15 = function6;
                    AbstractC33199m0.m105214F(bVar16, textResourceM21278l1111, null, textResourceM21278l1112, interfaceC4339a16, false, false, null, null, null, false, false, c28655q, i311119, 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC39703b.c) {
                        throw AbstractC11895b.m32003v(1735744384, c28655q, false);
                    }
                    c28655q.m87150e0(-2025560231);
                    cVar = (AbstractC39703b.c) viewState;
                    zM87153g = c28655q.m87153g(cVar.getSelectedSegmentId());
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC28683x.m87272z(cVar.getSelectedSegmentId());
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    String strM5862r1111 = m5862r(interfaceC28601c1);
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87153g2 = z13 | ((i15 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(function6, str2, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87254h(str2, strM5862r1111, (InterfaceC4351m) objM87133R2, c28655q);
                    String strM5862r1112 = m5862r(interfaceC28601c1);
                    zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R3 = new C1910d(0, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C1910d(0, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function1 function1111 = (Function1) objM87133R3;
                    int i3111110 = i15 << 3;
                    int i3111111 = (i3111110 & 7168) | i26 | (i3111110 & 57344);
                    function13 = function10;
                    function14 = function11;
                    m5865u(cVar, strM5862r1112, function1111, function13, function14, c28655q, i3111111);
                    c28655q.m87173q(false);
                }
                str3 = str2;
                function7 = function13;
                function8 = function14;
            }
            function6 = function15;
            function13 = function10;
            function14 = function11;
            str3 = str2;
            function7 = function13;
            function8 = function14;
        } else {
            c28655q.m87138X();
            str3 = str2;
            function7 = function4;
            function8 = function5;
        }
        function9 = function6;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m5857m(AbstractC40940a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m5858n(AbstractC38530a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m5859o(AbstractC39703b abstractC39703b, String str, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m5856l(abstractC39703b, str, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m5860p(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m5861q(Function1 function1) {
        function1.invoke(AbstractC40940a.a.f176622a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final String m5862r(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m5863s(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m5864t(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m5863s(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final void m5865u(AbstractC39703b.c viewState, String selectedSegmentId, Function1 onSelectedSegmentIdChange, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        C28676v0 c28676v0;
        int i16;
        int i17;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
        AbstractC22676k.m65750j(onSelectedSegmentIdChange, "onSelectedSegmentIdChange");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-408114056);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(selectedSegmentId) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onSelectedSegmentIdChange) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            Context context = ((View) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4980f)).getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            long jM51517e = AbstractC17918w0.m51517e(4280824633L);
            boolean zM87157i = c28655q2.m87157i(window);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v1) {
                objM87133R = new C1911e(window, jM51517e, 0);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q2);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66724m);
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
            AbstractC6721d.a aVar = new AbstractC6721d.a(viewState.getNavigationTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean z4 = (57344 & i14) == 16384;
            Object objM87133R2 = c28655q2.m87133R();
            if (z4 || objM87133R2 == c28676v1) {
                objM87133R2 = new C27314o(onNavigationEvent, 8);
                c28655q2.m87172p0(objM87133R2);
            }
            C28655q c28655q3 = c28655q2;
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q3, AbstractC6721d.a.f25641r << 3, 53);
            if (viewState.m127043c().isEmpty()) {
                i15 = 8;
                c28676v0 = c28676v1;
                c28655q3.m87150e0(-1586835682);
                i16 = 2;
                AbstractC31061c.m95650z(2, 4, c2314t, c28655q3, false);
            } else {
                c28655q3.m87150e0(-1587721073);
                Iterator<SegmentControlDisplay> it = viewState.m127043c().iterator();
                int i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else {
                        if (AbstractC22676k.m65745e(it.next().getId(), selectedSegmentId)) {
                            i17 = i18;
                            break;
                        }
                        i18++;
                    }
                }
                float f13 = 4;
                AbstractC18489d0.m53380u(3, f13, c2314t, c28655q3);
                float f14 = 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * f14, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
                int iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
                List<SegmentControlDisplay> listM127043c = viewState.m127043c();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM127043c, 10));
                Iterator<T> it3 = listM127043c.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new C33223u0(((SegmentControlDisplay) it3.next()).getNameDisplay(), null, 2, 0 == true ? 1 : 0));
                }
                int i19 = i17 != -1 ? i17 : 0;
                boolean zM87157i2 = c28655q3.m87157i(viewState) | ((i14 & 896) == 256) | ((i14 & 7168) == 2048);
                Object objM87133R3 = c28655q3.m87133R();
                if (zM87157i2) {
                    c28676v0 = c28676v1;
                } else {
                    c28676v0 = c28676v1;
                    if (objM87133R3 == c28676v0) {
                    }
                    i15 = 8;
                    AbstractC33231x0.m105420e(arrayList, i19, null, null, (Function1) objM87133R3, c28655q3, 0, 12);
                    c28655q3 = c28655q3;
                    c28655q3.m87173q(true);
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f13 * f14, c2314t));
                    c28655q3.m87173q(false);
                    i16 = 2;
                }
                objM87133R3 = new C29656q((Object) viewState, onSelectedSegmentIdChange, (Object) onViewEvent, 3);
                c28655q3.m87172p0(objM87133R3);
                i15 = 8;
                AbstractC33231x0.m105420e(arrayList, i19, null, null, (Function1) objM87133R3, c28655q3, 0, 12);
                c28655q3 = c28655q3;
                c28655q3.m87173q(true);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f13 * f14, c2314t));
                c28655q3.m87173q(false);
                i16 = 2;
            }
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, i16 * i15, 0.0f, i16);
            boolean zM87157i3 = c28655q3.m87157i(viewState);
            Object objM87133R4 = c28655q3.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C0103b(viewState, 8);
                c28655q3.m87172p0(objM87133R4);
            }
            C28655q c28655q4 = c28655q3;
            AbstractC22674j.m65717c(modifierM3396r2, null, null, null, null, null, false, null, (Function1) objM87133R4, c28655q4, 6, 510);
            c28655q = c28655q4;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c((Object) viewState, (Object) selectedSegmentId, (Object) onSelectedSegmentIdChange, (Object) onViewEvent, (Object) onNavigationEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m5866v(Window window, long j7) {
        if (window != null) {
            window.setStatusBarColor(AbstractC17918w0.m51506H(j7));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m5867w(Function1 function1) {
        function1.invoke(AbstractC38530a.a.f165833a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m5868x(AbstractC39703b.c cVar, Function1 function1, Function1 function2, int i13) {
        String id4 = cVar.m127043c().get(i13).getId();
        function1.invoke(id4);
        function2.invoke(new AbstractC40940a.b(id4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m5869y(AbstractC39703b.c cVar, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<InterfaceC25312u> listM127045e = cVar.m127045e();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM127045e.size(), null, new d(c.f7561w, listM127045e), new C37816b(new e(listM127045e), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m5870z(AbstractC39703b.c cVar, String str, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m5865u(cVar, str, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

package to1;

import com.whoop.design.models.items.CyclePhaseStyle;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.GraphButton;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MenstrualPhaseStateSection;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseCoachingResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseEducationContent;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseInfo;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseLegend;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseLegendStyle;
import com.whoop.navigation.C9598e;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m81.C25232g;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import ny0.C27273p0;
import oo1.AbstractC28064j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23707s0;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import so1.AbstractC32815g0;
import so1.C32817h0;
import so1.C32819i0;
import so1.C32821j0;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: to1.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lto1/n;", "", "<init>", "()V", "", "selectedPhase", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;", "model", "Lso1/g0;", "c", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)Lso1/g0;", "Lec3/l;", "Loo1/j;", "upstream", "b", "(Lec3/l;)Lec3/l;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34021n {

    /* JADX INFO: renamed from: to1.n$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f142612a;

        static {
            int[] iArr = new int[CyclePhaseStyle.values().length];
            try {
                iArr[CyclePhaseStyle.FOLLICULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CyclePhaseStyle.OVULATORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CyclePhaseStyle.LUTEAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f142612a = iArr;
        }
    }

    /* JADX INFO: renamed from: to1.n$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142613w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34021n f142614x;

        /* JADX INFO: renamed from: to1.n$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142615w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34021n f142616x;

            /* JADX INFO: renamed from: to1.n$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.presentation.reducers.PhaseCoachingViewStateReducer$reduce$$inlined$map$1$2", m100430f = "PhaseCoachingViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42407a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f142617E;

                /* JADX INFO: renamed from: F */
                Object f142618F;

                /* JADX INFO: renamed from: G */
                Object f142619G;

                /* JADX INFO: renamed from: H */
                int f142620H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142621w;

                /* JADX INFO: renamed from: x */
                int f142622x;

                /* JADX INFO: renamed from: y */
                Object f142623y;

                public C42407a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142621w = obj;
                    this.f142622x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34021n c34021n) {
                this.f142615w = interfaceC13062m;
                this.f142616x = c34021n;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42407a c42407a;
                Object objM107592c;
                if (interfaceC30057d instanceof C42407a) {
                    c42407a = (C42407a) interfaceC30057d;
                    int i13 = c42407a.f142622x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42407a.f142622x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42407a = new C42407a(interfaceC30057d);
                    }
                } else {
                    c42407a = new C42407a(interfaceC30057d);
                }
                Object obj2 = c42407a.f142621w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42407a.f142622x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142615w;
                    AbstractC28064j abstractC28064j = (AbstractC28064j) obj;
                    if (AbstractC22676k.m65745e(abstractC28064j, AbstractC28064j.b.f113545a)) {
                        objM107592c = AbstractC32815g0.b.f136712b;
                    } else if (abstractC28064j instanceof AbstractC28064j.a) {
                        objM107592c = new AbstractC32815g0.a(((AbstractC28064j.a) abstractC28064j).getError());
                    } else {
                        if (!(abstractC28064j instanceof AbstractC28064j.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC28064j.c cVar = (AbstractC28064j.c) abstractC28064j;
                        objM107592c = this.f142616x.m107592c(cVar.getSelectedPhase(), cVar.getResponse());
                    }
                    c42407a.f142623y = null;
                    c42407a.f142617E = null;
                    c42407a.f142618F = null;
                    c42407a.f142619G = null;
                    c42407a.f142620H = 0;
                    c42407a.f142622x = 1;
                    if (interfaceC13062m.emit(objM107592c, c42407a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C34021n c34021n) {
            this.f142613w = interfaceC13058l;
            this.f142614x = c34021n;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142613w.collect(new a(interfaceC13062m, this.f142614x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final AbstractC32815g0 m107592c(String selectedPhase, PhaseCoachingResponse model) {
        CyclePhaseStyle cyclePhaseStyle;
        EnumC34022o enumC34022o;
        CyclePhaseStyle cyclePhaseStyle2;
        ArrayList arrayList;
        C27273p0 c27273p0;
        Integer numM46376a;
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        PhaseLegendStyle phaseLegendStyle;
        String str = selectedPhase == null ? "MENSTRUAL" : selectedPhase;
        CyclePhaseStyle cyclePhaseStyle3 = CyclePhaseStyle.MENSTRUAL;
        CyclePhaseStyle[] cyclePhaseStyleArrValues = CyclePhaseStyle.values();
        int length = cyclePhaseStyleArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                cyclePhaseStyle = null;
                break;
            }
            cyclePhaseStyle = cyclePhaseStyleArrValues[i13];
            if (AbstractC22676k.m65745e(cyclePhaseStyle.name(), str)) {
                break;
            }
            i13++;
        }
        if (cyclePhaseStyle != null) {
            cyclePhaseStyle3 = cyclePhaseStyle;
        }
        int i14 = a.f142612a[cyclePhaseStyle3.ordinal()];
        if (i14 == 1) {
            enumC34022o = EnumC34022o.FOLLICULAR;
        } else if (i14 != 2) {
            enumC34022o = i14 != 3 ? EnumC34022o.MENSTRUAL : EnumC34022o.LUTEAL;
        } else {
            enumC34022o = EnumC34022o.OVULATORY;
        }
        PhaseInfo phaseInfo = model.getPhases().get(enumC34022o.name());
        if (phaseInfo == null) {
            return new AbstractC32815g0.a("Unsupported phase type");
        }
        String strName = enumC34022o.name();
        CyclePhaseStyle cyclePhaseStyle4 = CyclePhaseStyle.MENSTRUAL;
        CyclePhaseStyle[] cyclePhaseStyleArrValues2 = CyclePhaseStyle.values();
        int length2 = cyclePhaseStyleArrValues2.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length2) {
                cyclePhaseStyle2 = null;
                break;
            }
            cyclePhaseStyle2 = cyclePhaseStyleArrValues2[i15];
            if (AbstractC22676k.m65745e(cyclePhaseStyle2.name(), strName)) {
                break;
            }
            i15++;
        }
        if (cyclePhaseStyle2 != null) {
            cyclePhaseStyle4 = cyclePhaseStyle2;
        }
        EnumC39333f enumC39333fM69376a = AbstractC23707s0.m69376a(cyclePhaseStyle4);
        AbstractC22403o.c cVar = new AbstractC22403o.c(phaseInfo.getBackgroundUrl(), 0, 0, 0, 14, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getNavigationTitle());
        List<PhaseLegend> legends = phaseInfo.getLegends();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(legends, 10));
        for (PhaseLegend phaseLegend : legends) {
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(phaseLegend.getLabel());
            String style = phaseLegend.getStyle();
            PhaseLegendStyle[] phaseLegendStyleArrValues = PhaseLegendStyle.values();
            int length3 = phaseLegendStyleArrValues.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length3) {
                    phaseLegendStyle = null;
                    break;
                }
                phaseLegendStyle = phaseLegendStyleArrValues[i16];
                if (AbstractC22676k.m65745e(phaseLegendStyle.name(), style)) {
                    break;
                }
                i16++;
            }
            arrayList2.add(new C32819i0(textResourceM21278l2, phaseLegendStyle));
        }
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(phaseInfo.getTitleDisplay());
        List<MenstrualPhaseStateSection> stats = phaseInfo.getStats();
        if (stats != null) {
            List<MenstrualPhaseStateSection> list = stats;
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (MenstrualPhaseStateSection menstrualPhaseStateSection : list) {
                arrayList3.add(new C32821j0(AbstractC8693b.m21278l(menstrualPhaseStateSection.getTitleDisplay()), AbstractC16315n0.m46376a(menstrualPhaseStateSection.getIcon()), new C17731c2(AbstractC8693b.m21278l(menstrualPhaseStateSection.getTrend().getTitleDisplay()), menstrualPhaseStateSection.getTrend().getBackgroundEnabled(), menstrualPhaseStateSection.getTrend().getTrend(), false, AbstractC16315n0.m46377b(menstrualPhaseStateSection.getTrend().getIcon()), null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null)));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<GraphButton> buttons = phaseInfo.getButtons();
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(buttons, 10));
        for (GraphButton graphButton : buttons) {
            String buttonId = graphButton.getButtonId();
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(graphButton.getLabel());
            String icon = graphButton.getIcon();
            if (icon != null) {
                EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                int length4 = enumC16313m0ArrValues.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length4) {
                        enumC16313m1 = null;
                        break;
                    }
                    enumC16313m1 = enumC16313m0ArrValues[i17];
                    if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                        break;
                    }
                    i17++;
                }
                enumC16313m0 = enumC16313m1;
            } else {
                enumC16313m0 = null;
            }
            arrayList4.add(new C25232g(buttonId, enumC16313m0, textResourceM21278l4, null, 8, null));
        }
        Map<String, PhaseEducationContent> education = phaseInfo.getEducation();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(education.size()));
        Iterator<T> it = education.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            PhaseEducationContent phaseEducationContent = (PhaseEducationContent) entry.getValue();
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(phaseEducationContent.getDescriptionDisplay());
            SecondaryButtonModel coachButton = phaseEducationContent.getCoachButton();
            if (coachButton != null) {
                TextResource text = coachButton.getText();
                C9598e action = coachButton.getAction();
                String icon2 = coachButton.getIcon();
                c27273p0 = new C27273p0(text, action, null, (icon2 == null || (numM46376a = AbstractC16315n0.m46376a(icon2)) == null) ? new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, null) : new C39274g(numM46376a.intValue(), null, 2, null), null, null, false, null, null, null, null, false, null, false, 16372, null);
            } else {
                c27273p0 = null;
            }
            linkedHashMap.put(key, new C32817h0(textResourceM21278l5, c27273p0));
        }
        return new AbstractC32815g0.c(enumC39333fM69376a, textResourceM21278l, cVar, textResourceM21278l3, arrayList2, arrayList, arrayList4, linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m107593b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(upstream, this);
    }
}

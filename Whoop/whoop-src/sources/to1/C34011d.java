package to1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.Cycle;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CycleSection;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.EditCycleBottomSheet;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.EditOption;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HideOption;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciCycleResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.UnhideOption;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsConfirmDialog;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f11.C14005e;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23713t0;
import po1.AbstractC29400b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import so1.AbstractC32840x;
import so1.C32812f;
import so1.C32814g;
import so1.C32818i;
import so1.C32820j;
import so1.C32822k;
import so1.C32831o0;
import tp1.C34064d;

/* JADX INFO: renamed from: to1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lto1/d;", "", "<init>", "()V", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;", "model", "Lso1/x$f;", "c", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;)Lso1/x$f;", "Lec3/l;", "Lpo1/b;", "upstream", "Lso1/x;", "b", "(Lec3/l;)Lec3/l;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34011d {

    /* JADX INFO: renamed from: to1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142529w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34011d f142530x;

        /* JADX INFO: renamed from: to1.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42403a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142531w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34011d f142532x;

            /* JADX INFO: renamed from: to1.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.presentation.reducers.MciCyclesViewStateReducer$reduce$$inlined$map$1$2", m100430f = "MciCyclesViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42404a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f142533E;

                /* JADX INFO: renamed from: F */
                Object f142534F;

                /* JADX INFO: renamed from: G */
                Object f142535G;

                /* JADX INFO: renamed from: H */
                int f142536H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142537w;

                /* JADX INFO: renamed from: x */
                int f142538x;

                /* JADX INFO: renamed from: y */
                Object f142539y;

                public C42404a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142537w = obj;
                    this.f142538x |= Integer.MIN_VALUE;
                    return C42403a.this.emit(null, this);
                }
            }

            public C42403a(InterfaceC13062m interfaceC13062m, C34011d c34011d) {
                this.f142531w = interfaceC13062m;
                this.f142532x = c34011d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42404a c42404a;
                Object objM107503c;
                if (interfaceC30057d instanceof C42404a) {
                    c42404a = (C42404a) interfaceC30057d;
                    int i13 = c42404a.f142538x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42404a.f142538x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42404a = new C42404a(interfaceC30057d);
                    }
                } else {
                    c42404a = new C42404a(interfaceC30057d);
                }
                Object obj2 = c42404a.f142537w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42404a.f142538x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142531w;
                    AbstractC29400b abstractC29400b = (AbstractC29400b) obj;
                    if (AbstractC22676k.m65745e(abstractC29400b, AbstractC29400b.b.f119251a)) {
                        objM107503c = AbstractC32840x.b.f136851b;
                    } else if (abstractC29400b instanceof AbstractC29400b.a) {
                        objM107503c = AbstractC32840x.a.f136850b;
                    } else if (abstractC29400b instanceof AbstractC29400b.f) {
                        objM107503c = this.f142532x.m107503c(((AbstractC29400b.f) abstractC29400b).getResponse());
                    } else if (AbstractC22676k.m65745e(abstractC29400b, AbstractC29400b.c.f119252a)) {
                        objM107503c = AbstractC32840x.c.f136852b;
                    } else if (AbstractC22676k.m65745e(abstractC29400b, AbstractC29400b.d.f119253a)) {
                        objM107503c = AbstractC32840x.d.f136853b;
                    } else {
                        if (!AbstractC22676k.m65745e(abstractC29400b, AbstractC29400b.e.f119254a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM107503c = AbstractC32840x.e.f136854b;
                    }
                    c42404a.f142539y = null;
                    c42404a.f142533E = null;
                    c42404a.f142534F = null;
                    c42404a.f142535G = null;
                    c42404a.f142536H = 0;
                    c42404a.f142538x = 1;
                    if (interfaceC13062m.emit(objM107503c, c42404a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C34011d c34011d) {
            this.f142529w = interfaceC13058l;
            this.f142530x = c34011d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142529w.collect(new C42403a(interfaceC13062m, this.f142530x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final AbstractC32840x.f m107503c(MciCycleResponse model) {
        C32831o0 c32831o0;
        EnumC16313m0 enumC16313m0;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getNavigationTitle());
        List<CycleSection> sections = model.getSections();
        int i13 = 10;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        for (CycleSection cycleSection : sections) {
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(cycleSection.getTitleDisplay());
            List<Cycle> cycles = cycleSection.getCycles();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(cycles, i13));
            for (Cycle cycle : cycles) {
                C14005e c14005eM69422a = AbstractC23713t0.m69422a(cycle.getCycle());
                String icon = cycle.getIcon();
                EnumC16313m0 enumC16313m1 = EnumC16313m0.PENCIL;
                EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                int length = enumC16313m0ArrValues.length;
                int i14 = 0;
                while (true) {
                    c32831o0 = null;
                    if (i14 >= length) {
                        enumC16313m0 = null;
                        break;
                    }
                    enumC16313m0 = enumC16313m0ArrValues[i14];
                    if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                        break;
                    }
                    i14++;
                }
                if (enumC16313m0 != null) {
                    enumC16313m1 = enumC16313m0;
                }
                boolean hidden = cycle.getHidden();
                EditCycleBottomSheet bottomSheet = cycle.getBottomSheet();
                EditOption editOption = bottomSheet.getEditOption();
                C32820j c32820j = editOption != null ? new C32820j(AbstractC8693b.m21278l(editOption.getDisplay()), editOption.getDate()) : null;
                HideOption hideOption = bottomSheet.getHideOption();
                C32822k c32822k = hideOption != null ? new C32822k(AbstractC8693b.m21278l(hideOption.getDisplay()), hideOption.getDateRange()) : null;
                UnhideOption unhideOption = bottomSheet.getUnhideOption();
                if (unhideOption != null) {
                    c32831o0 = new C32831o0(AbstractC8693b.m21278l(unhideOption.getDisplay()), unhideOption.getIds());
                }
                arrayList2.add(new C32814g(c14005eM69422a, enumC16313m1, hidden, new C32818i(c32820j, c32822k, c32831o0)));
            }
            arrayList.add(new C32812f(textResourceM21278l2, arrayList2));
            i13 = 10;
        }
        HormonalInsightsConfirmDialog hidingCycleModal = model.getHidingCycleModal();
        return new AbstractC32840x.f(textResourceM21278l, arrayList, new C34064d(AbstractC8693b.m21278l(hidingCycleModal.getTitle()), AbstractC8693b.m21278l(hidingCycleModal.getMessage()), AbstractC8693b.m21278l(hidingCycleModal.getPrimaryText()), AbstractC8693b.m21278l(hidingCycleModal.getSecondaryText())));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m107504b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}

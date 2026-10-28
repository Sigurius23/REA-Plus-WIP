package to1;

import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarDomainModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarDomainState;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarNetworkState;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarResponse;
import d13.AbstractC11478a;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h91.C17027b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25267u;
import np1.C27025c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import so1.AbstractC32832p;

/* JADX INFO: renamed from: to1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lto1/b;", "", "<init>", "()V", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;", "model", "", "", "", "periodOverrides", "isSaveEnabled", "Lso1/p;", "c", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;Ljava/util/Map;Z)Lso1/p;", "Lec3/l;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;", "upstream", "b", "(Lec3/l;)Lec3/l;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34009b {

    /* JADX INFO: renamed from: to1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142517w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34009b f142518x;

        /* JADX INFO: renamed from: to1.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42401a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142519w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34009b f142520x;

            /* JADX INFO: renamed from: to1.b$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.presentation.reducers.LogCalendarViewStateReducer$reduce$$inlined$map$1$2", m100430f = "LogCalendarViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42402a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f142521E;

                /* JADX INFO: renamed from: F */
                Object f142522F;

                /* JADX INFO: renamed from: G */
                Object f142523G;

                /* JADX INFO: renamed from: H */
                int f142524H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142525w;

                /* JADX INFO: renamed from: x */
                int f142526x;

                /* JADX INFO: renamed from: y */
                Object f142527y;

                public C42402a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142525w = obj;
                    this.f142526x |= Integer.MIN_VALUE;
                    return C42401a.this.emit(null, this);
                }
            }

            public C42401a(InterfaceC13062m interfaceC13062m, C34009b c34009b) {
                this.f142519w = interfaceC13062m;
                this.f142520x = c34009b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42402a c42402a;
                Object objM107499c;
                if (interfaceC30057d instanceof C42402a) {
                    c42402a = (C42402a) interfaceC30057d;
                    int i13 = c42402a.f142526x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42402a.f142526x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42402a = new C42402a(interfaceC30057d);
                    }
                } else {
                    c42402a = new C42402a(interfaceC30057d);
                }
                Object obj2 = c42402a.f142525w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42402a.f142526x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142519w;
                    LogCalendarDomainState logCalendarDomainState = (LogCalendarDomainState) obj;
                    LogCalendarNetworkState networkState = logCalendarDomainState.getNetworkState();
                    if (AbstractC22676k.m65745e(networkState, LogCalendarNetworkState.Loading.INSTANCE)) {
                        objM107499c = AbstractC32832p.b.f136795b;
                    } else if (networkState instanceof LogCalendarNetworkState.Error) {
                        objM107499c = new AbstractC32832p.a(((LogCalendarNetworkState.Error) logCalendarDomainState.getNetworkState()).getDate(), ((LogCalendarNetworkState.Error) logCalendarDomainState.getNetworkState()).getErrorType());
                    } else if (networkState instanceof LogCalendarNetworkState.Success) {
                        objM107499c = this.f142520x.m107499c(((LogCalendarNetworkState.Success) logCalendarDomainState.getNetworkState()).getModel(), logCalendarDomainState.getPeriodOverrides(), logCalendarDomainState.isSaveEnabled());
                    } else if (networkState instanceof LogCalendarNetworkState.SaveSuccess) {
                        objM107499c = AbstractC32832p.d.f136797b;
                    } else if (AbstractC22676k.m65745e(networkState, LogCalendarNetworkState.SaveError.INSTANCE)) {
                        objM107499c = AbstractC32832p.c.f136796b;
                    } else {
                        if (!AbstractC22676k.m65745e(networkState, LogCalendarNetworkState.Saving.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM107499c = AbstractC32832p.e.f136798b;
                    }
                    c42402a.f142527y = null;
                    c42402a.f142521E = null;
                    c42402a.f142522F = null;
                    c42402a.f142523G = null;
                    c42402a.f142524H = 0;
                    c42402a.f142526x = 1;
                    if (interfaceC13062m.emit(objM107499c, c42402a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C34009b c34009b) {
            this.f142517w = interfaceC13058l;
            this.f142518x = c34009b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142517w.collect(new C42401a(interfaceC13062m, this.f142518x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final AbstractC32832p m107499c(LogCalendarDomainModel model, Map<String, Boolean> periodOverrides, boolean isSaveEnabled) {
        ArrayList arrayListM74164j0 = AbstractC25267u.m74164j0(model.getCalendarDomainState().m48077e().values());
        ArrayList arrayList = new ArrayList(periodOverrides.size());
        Iterator<Map.Entry<String, Boolean>> it = periodOverrides.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (AbstractC34013f.m107517a(arrayListM74164j0, (String) it3.next())) {
                    z4 = true;
                    break;
                }
            }
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getNetworkModel().getNavigationTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getNetworkModel().getTitleDisplay());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getNetworkModel().getDescriptionDisplay());
        String nextDateTime = model.getNetworkModel().getMonthPicker().getNextDateTime();
        if (nextDateTime == null) {
            nextDateTime = "";
        }
        TextResource textResourceM30853e = AbstractC11478a.m30853e(Locale.ROOT, model.getNetworkModel().getMonthPicker().getCurrentDateRange(), "toUpperCase(...)");
        String prevDateTime = model.getNetworkModel().getMonthPicker().getPrevDateTime();
        C27025c c27025c = new C27025c(nextDateTime, prevDateTime != null ? prevDateTime : "", textResourceM30853e);
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(model.getNetworkModel().getButtonTitle());
        C17027b<CalendarDateModel> calendarDomainState = model.getCalendarDomainState();
        int selectedIndex = model.getSelectedIndex();
        LogCalendarResponse networkModel = model.getNetworkModel();
        return new AbstractC32832p.f(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, c27025c, textResourceM21278l4, calendarDomainState, selectedIndex, periodOverrides, isSaveEnabled, AbstractC34010c.m107501a(z4 ? networkModel.getEditingHiddenCycleModal() : networkModel.getEditingCycleModal()));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m107500b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}

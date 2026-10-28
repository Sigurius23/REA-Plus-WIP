package xd2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.shepherd.feature.notificationhistory.domain.models.PageHeaderResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdClearHistoryDialogResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdEmptyHistoryResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdHistoryClearAllResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdHistoryRecordResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdNotificationHistoryResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdPaginatedHistoryRecordSectionResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdPaginatedHistoryResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import jb1.C21535a;
import kd2.AbstractC22415a;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vd2.C35912b;
import vd2.InterfaceC35914d;

/* JADX INFO: renamed from: xd2.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lxd2/k;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lvd2/b;", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;", "settingsResponse", "", "isLoadingMoreHistory", "Lxd2/j;", "f", "(Lvd2/b;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Z)Lxd2/j;", "Lxd2/b;", "dialogState", "e", "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Lxd2/b;Z)Lxd2/j;", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;", "clearHistoryDialogResponse", "", "historyDate", "c", "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Ljava/lang/String;)Lxd2/b;", "Lec3/l;", "domainStateFlow", "b", "(Lec3/l;)Lec3/l;", "a", "Ljb1/a;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38215k {

    /* JADX INFO: renamed from: b */
    public static final int f163788b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: xd2.k$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f163790w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38215k f163791x;

        /* JADX INFO: renamed from: xd2.k$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42640a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f163792w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38215k f163793x;

            /* JADX INFO: renamed from: xd2.k$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.presentation.ShepherdNotificationHistoryViewStateReducer$reduce$$inlined$map$1$2", m100430f = "ShepherdNotificationHistoryViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42641a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f163794E;

                /* JADX INFO: renamed from: F */
                Object f163795F;

                /* JADX INFO: renamed from: G */
                Object f163796G;

                /* JADX INFO: renamed from: H */
                int f163797H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f163798w;

                /* JADX INFO: renamed from: x */
                int f163799x;

                /* JADX INFO: renamed from: y */
                Object f163800y;

                public C42641a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f163798w = obj;
                    this.f163799x |= Integer.MIN_VALUE;
                    return C42640a.this.emit(null, this);
                }
            }

            public C42640a(InterfaceC13062m interfaceC13062m, C38215k c38215k) {
                this.f163792w = interfaceC13062m;
                this.f163793x = c38215k;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42641a c42641a;
                Object objM122450f;
                InterfaceC38214j.a aVar;
                if (interfaceC30057d instanceof C42641a) {
                    c42641a = (C42641a) interfaceC30057d;
                    int i13 = c42641a.f163799x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42641a.f163799x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42641a = new C42641a(interfaceC30057d);
                    }
                } else {
                    c42641a = new C42641a(interfaceC30057d);
                }
                Object obj2 = c42641a.f163798w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42641a.f163799x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f163792w;
                    C35912b c35912b = (C35912b) obj;
                    InterfaceC35914d currentScreenType = c35912b.getCurrentScreenType();
                    if (AbstractC22676k.m65745e(currentScreenType, InterfaceC35914d.g.f152970a)) {
                        objM122450f = InterfaceC38214j.a.INSTANCE.m122462d();
                    } else if (AbstractC22676k.m65745e(currentScreenType, InterfaceC35914d.e.f152968a)) {
                        objM122450f = InterfaceC38214j.a.INSTANCE.m122461c();
                    } else if (AbstractC22676k.m65745e(currentScreenType, InterfaceC35914d.f.f152969a) || AbstractC22676k.m65745e(currentScreenType, InterfaceC35914d.a.f152964a)) {
                        objM122450f = this.f163793x.m122476f(c35912b, c35912b.getSettingsScreenResponse(), c35912b.getIsLoadingMoreHistory());
                    } else if (AbstractC22676k.m65745e(currentScreenType, InterfaceC35914d.h.f152971a)) {
                        objM122450f = InterfaceC38214j.a.m122450f(InterfaceC38214j.a.INSTANCE.m122459a(), null, null, null, null, null, null, InterfaceC38212h.a.f163728a, 63, null);
                    } else {
                        InterfaceC35914d.j jVar = InterfaceC35914d.j.f152973a;
                        if (AbstractC22676k.m65745e(currentScreenType, jVar)) {
                            aVar = new InterfaceC38214j.a(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22415a.f87685b, null, 2, null), 0L, null, 6, null), null, null, null, null, null, InterfaceC38212h.m.f163740a, 62, null);
                        } else if (AbstractC22676k.m65745e(currentScreenType, InterfaceC35914d.c.f152966a)) {
                            objM122450f = InterfaceC38214j.a.m122450f(InterfaceC38214j.a.INSTANCE.m122460b(), null, null, null, InterfaceC38212h.n.f163741a, null, InterfaceC38212h.c.f163730a, null, 87, null);
                        } else if (currentScreenType instanceof InterfaceC35914d.b) {
                            objM122450f = this.f163793x.m122476f(c35912b, c35912b.getSettingsScreenResponse(), c35912b.getIsLoadingMoreHistory());
                        } else if (currentScreenType instanceof InterfaceC35914d.i) {
                            objM122450f = InterfaceC38214j.a.m122450f(InterfaceC38214j.a.INSTANCE.m122459a(), null, null, null, null, null, null, new InterfaceC38212h.b(((InterfaceC35914d.i) c35912b.getCurrentScreenType()).getHistoryDate()), 63, null);
                        } else if (AbstractC22676k.m65745e(currentScreenType, jVar)) {
                            aVar = new InterfaceC38214j.a(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22415a.f87685b, null, 2, null), 0L, null, 6, null), null, null, null, null, null, InterfaceC38212h.m.f163740a, 62, null);
                        } else {
                            if (!(currentScreenType instanceof InterfaceC35914d.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            objM122450f = InterfaceC38214j.a.m122450f(InterfaceC38214j.a.INSTANCE.m122460b(), null, null, null, new InterfaceC38212h.o(((InterfaceC35914d.d) c35912b.getCurrentScreenType()).getHistoryDate()), null, InterfaceC38212h.c.f163730a, null, 87, null);
                        }
                        objM122450f = aVar;
                    }
                    c42641a.f163800y = null;
                    c42641a.f163794E = null;
                    c42641a.f163795F = null;
                    c42641a.f163796G = null;
                    c42641a.f163797H = 0;
                    c42641a.f163799x = 1;
                    if (interfaceC13062m.emit(objM122450f, c42641a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C38215k c38215k) {
            this.f163790w = interfaceC13058l;
            this.f163791x = c38215k;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f163790w.collect(new C42640a(interfaceC13062m, this.f163791x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C38215k(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: c */
    private final C38206b m122473c(ShepherdClearHistoryDialogResponse clearHistoryDialogResponse, String historyDate) {
        if (clearHistoryDialogResponse != null) {
            return new C38206b(historyDate, AbstractC8693b.m21278l(clearHistoryDialogResponse.getPageTitle()), AbstractC8693b.m21278l(clearHistoryDialogResponse.getWarningMessage()), AbstractC8693b.m21278l(clearHistoryDialogResponse.getClearHistoryDialogButtons().get(0).getLabel()), AbstractC8693b.m21278l(clearHistoryDialogResponse.getClearHistoryDialogButtons().get(1).getLabel()));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C38206b m122474d(C38215k c38215k, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        return c38215k.m122473c(shepherdClearHistoryDialogResponse, str);
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC38214j m122475e(ShepherdNotificationHistoryResponse settingsResponse, C38206b dialogState, boolean isLoadingMoreHistory) {
        EnumC16313m0 enumC16313m0;
        C38208d c38208d;
        C38207c c38207c;
        C38217m c38217m;
        EnumC16313m0 enumC16313m1;
        EnumC16313m0 enumC16313m2;
        ShepherdPaginatedHistoryResponse shepherdPaginatedHistoryResponse;
        EnumC16313m0 enumC16313m3;
        EnumC16313m0 enumC16313m4;
        EnumC16313m0 enumC16313m5;
        if (settingsResponse == null) {
            return InterfaceC38214j.a.INSTANCE.m122461c();
        }
        InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h(settingsResponse.getSettingsCta());
        PageHeaderResponse pageHeader = settingsResponse.getPageHeader();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(pageHeader.getTitle());
        String icon = pageHeader.getIcon();
        EnumC16313m0 enumC16313m6 = EnumC16313m0.EDUCATION;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m6 = enumC16313m0;
        }
        int whoopIcon = enumC16313m6.toWhoopIcon();
        C9598e destination = pageHeader.getDestination();
        if (AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
            destination = null;
        }
        C38205a c38205a = new C38205a(textResourceM21278l, whoopIcon, destination);
        ShepherdHistoryClearAllResponse shepherdHistoryClearAll = settingsResponse.getShepherdHistory().getShepherdHistoryClearAll();
        if (shepherdHistoryClearAll != null) {
            String icon2 = shepherdHistoryClearAll.getIcon();
            EnumC16313m0 enumC16313m7 = EnumC16313m0.CROSS;
            EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC16313m5 = null;
                    break;
                }
                enumC16313m5 = enumC16313m0ArrValues2[i14];
                if (AbstractC22676k.m65745e(enumC16313m5.name(), icon2)) {
                    break;
                }
                i14++;
            }
            if (enumC16313m5 != null) {
                enumC16313m7 = enumC16313m5;
            }
            c38208d = new C38208d(enumC16313m7.toWhoopIcon(), AbstractC8693b.m21278l(shepherdHistoryClearAll.getTitle()));
        } else {
            c38208d = null;
        }
        ShepherdEmptyHistoryResponse shepherdEmptyHistory = settingsResponse.getShepherdHistory().getShepherdEmptyHistory();
        if (shepherdEmptyHistory != null) {
            String icon3 = shepherdEmptyHistory.getIcon();
            EnumC16313m0 enumC16313m8 = EnumC16313m0.SHEPHERD;
            EnumC16313m0[] enumC16313m0ArrValues3 = EnumC16313m0.values();
            int length3 = enumC16313m0ArrValues3.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    enumC16313m4 = null;
                    break;
                }
                enumC16313m4 = enumC16313m0ArrValues3[i15];
                if (AbstractC22676k.m65745e(enumC16313m4.name(), icon3)) {
                    break;
                }
                i15++;
            }
            if (enumC16313m4 != null) {
                enumC16313m8 = enumC16313m4;
            }
            c38207c = new C38207c(enumC16313m8.toWhoopIcon(), AbstractC8693b.m21278l(shepherdEmptyHistory.getTitle()), AbstractC8693b.m21278l(shepherdEmptyHistory.getDescription()));
        } else {
            c38207c = null;
        }
        ShepherdPaginatedHistoryResponse shepherdPaginatedHistory = settingsResponse.getShepherdHistory().getShepherdPaginatedHistory();
        if (shepherdPaginatedHistory != null) {
            List<ShepherdPaginatedHistoryRecordSectionResponse> records = shepherdPaginatedHistory.getRecords();
            int i16 = 10;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(records, 10));
            for (ShepherdPaginatedHistoryRecordSectionResponse shepherdPaginatedHistoryRecordSectionResponse : records) {
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(shepherdPaginatedHistoryRecordSectionResponse.getTitle());
                String id4 = shepherdPaginatedHistoryRecordSectionResponse.getId();
                List<ShepherdHistoryRecordResponse> items = shepherdPaginatedHistoryRecordSectionResponse.getItems();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, i16));
                for (ShepherdHistoryRecordResponse shepherdHistoryRecordResponse : items) {
                    String historyDate = shepherdHistoryRecordResponse.getHistoryDate();
                    String recordDate = shepherdHistoryRecordResponse.getRecordDate();
                    String icon4 = shepherdHistoryRecordResponse.getIcon();
                    EnumC16313m0 enumC16313m9 = EnumC16313m0.TINY_ATTENTION;
                    EnumC16313m0[] enumC16313m0ArrValues4 = EnumC16313m0.values();
                    int length4 = enumC16313m0ArrValues4.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length4) {
                            enumC16313m2 = null;
                            break;
                        }
                        enumC16313m2 = enumC16313m0ArrValues4[i17];
                        int i18 = i17;
                        if (AbstractC22676k.m65745e(enumC16313m2.name(), icon4)) {
                            break;
                        }
                        i17 = i18 + 1;
                    }
                    if (enumC16313m2 != null) {
                        enumC16313m9 = enumC16313m2;
                    }
                    int whoopIcon2 = enumC16313m9.toWhoopIcon();
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(shepherdHistoryRecordResponse.getLabel());
                    String actionIcon = shepherdHistoryRecordResponse.getActionIcon();
                    EnumC16313m0 enumC16313m10 = EnumC16313m0.TINY_CARET_FORWARD;
                    EnumC16313m0[] enumC16313m0ArrValues5 = EnumC16313m0.values();
                    int length5 = enumC16313m0ArrValues5.length;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= length5) {
                            shepherdPaginatedHistoryResponse = shepherdPaginatedHistory;
                            enumC16313m3 = null;
                            break;
                        }
                        enumC16313m3 = enumC16313m0ArrValues5[i19];
                        shepherdPaginatedHistoryResponse = shepherdPaginatedHistory;
                        if (AbstractC22676k.m65745e(enumC16313m3.name(), actionIcon)) {
                            break;
                        }
                        i19++;
                        shepherdPaginatedHistory = shepherdPaginatedHistoryResponse;
                    }
                    if (enumC16313m3 != null) {
                        enumC16313m10 = enumC16313m3;
                    }
                    arrayList2.add(new C38209e(historyDate, recordDate, whoopIcon2, textResourceM21278l3, enumC16313m10.toWhoopIcon()));
                    shepherdPaginatedHistory = shepherdPaginatedHistoryResponse;
                }
                arrayList.add(new C38210f(textResourceM21278l2, id4, arrayList2));
                i16 = 10;
            }
            c38217m = new C38217m(arrayList, shepherdPaginatedHistory.getNextToken());
        } else {
            c38217m = null;
        }
        C38211g c38211g = new C38211g(c38207c == null, AbstractC8693b.m21278l(settingsResponse.getShepherdHistory().getTitle()), c38208d, c38207c, c38217m);
        String icon5 = settingsResponse.getIcon();
        EnumC16313m0 enumC16313m11 = EnumC16313m0.CROSS;
        EnumC16313m0[] enumC16313m0ArrValues6 = EnumC16313m0.values();
        int length6 = enumC16313m0ArrValues6.length;
        int i24 = 0;
        while (true) {
            if (i24 >= length6) {
                enumC16313m1 = null;
                break;
            }
            enumC16313m1 = enumC16313m0ArrValues6[i24];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), icon5)) {
                break;
            }
            i24++;
        }
        if (enumC16313m1 != null) {
            enumC16313m11 = enumC16313m1;
        }
        return new InterfaceC38214j.b(enumC16313m11.toWhoopIcon(), AbstractC8693b.m21278l(settingsResponse.getPageTitle()), AbstractC8693b.m21278l(settingsResponse.getBody()), c38205a, interfaceC25312uM60541h, settingsResponse.getDetectionOn(), c38211g, dialogState, isLoadingMoreHistory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC38214j m122476f(C35912b c35912b, ShepherdNotificationHistoryResponse shepherdNotificationHistoryResponse, boolean z4) {
        InterfaceC35914d currentScreenType = c35912b.getCurrentScreenType();
        if (AbstractC22676k.m65745e(currentScreenType, InterfaceC35914d.a.f152964a)) {
            return m122475e(shepherdNotificationHistoryResponse, m122474d(this, shepherdNotificationHistoryResponse != null ? shepherdNotificationHistoryResponse.getClearHistoryDialog() : null, null, 2, null), z4);
        }
        if (currentScreenType instanceof InterfaceC35914d.b) {
            return m122475e(shepherdNotificationHistoryResponse, m122473c(shepherdNotificationHistoryResponse != null ? shepherdNotificationHistoryResponse.getClearRecordDialog() : null, ((InterfaceC35914d.b) c35912b.getCurrentScreenType()).getHistoryDate()), z4);
        }
        return m122475e(shepherdNotificationHistoryResponse, null, z4);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m122477b(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return new a(domainStateFlow, this);
    }

    public /* synthetic */ C38215k(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC38216l.f163802a : c21535a);
    }
}

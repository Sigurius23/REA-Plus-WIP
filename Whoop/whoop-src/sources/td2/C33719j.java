package td2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.shepherd.feature.detail.domain.models.LabradorItemInfo;
import com.whoop.shepherd.feature.detail.domain.models.ShepherdHistoryDetailRecord;
import com.whoop.shepherd.feature.detail.domain.models.ShepherdHistoryDetailResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdClearHistoryDialogResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import jb1.C21535a;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rd2.C31248b;
import rd2.InterfaceC31251e;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import xd2.C38206b;

/* JADX INFO: renamed from: td2.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ltd2/j;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lrd2/b;", "domainState", "Ltd2/i;", "e", "(Lrd2/b;)Ltd2/i;", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;", "historyDetailResponse", "Lxd2/b;", "dialogState", "d", "(Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;Lxd2/b;)Ltd2/i;", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;", "clearHistoryDialogResponse", "c", "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lxd2/b;", "Lec3/l;", "upstream", "b", "(Lec3/l;)Lec3/l;", "a", "Ljb1/a;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33719j {

    /* JADX INFO: renamed from: b */
    public static final int f141021b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: td2.j$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f141023w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33719j f141024x;

        /* JADX INFO: renamed from: td2.j$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42378a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141025w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33719j f141026x;

            /* JADX INFO: renamed from: td2.j$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.detail.presentation.ShepherdHistoryDetailViewStateReducer$reduce$$inlined$map$1$2", m100430f = "ShepherdHistoryDetailViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42379a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f141027E;

                /* JADX INFO: renamed from: F */
                Object f141028F;

                /* JADX INFO: renamed from: G */
                Object f141029G;

                /* JADX INFO: renamed from: H */
                int f141030H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f141031w;

                /* JADX INFO: renamed from: x */
                int f141032x;

                /* JADX INFO: renamed from: y */
                Object f141033y;

                public C42379a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f141031w = obj;
                    this.f141032x |= Integer.MIN_VALUE;
                    return C42378a.this.emit(null, this);
                }
            }

            public C42378a(InterfaceC13062m interfaceC13062m, C33719j c33719j) {
                this.f141025w = interfaceC13062m;
                this.f141026x = c33719j;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42379a c42379a;
                Object objM106565g;
                if (interfaceC30057d instanceof C42379a) {
                    c42379a = (C42379a) interfaceC30057d;
                    int i13 = c42379a.f141032x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42379a.f141032x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42379a = new C42379a(interfaceC30057d);
                    }
                } else {
                    c42379a = new C42379a(interfaceC30057d);
                }
                Object obj2 = c42379a.f141031w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42379a.f141032x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f141025w;
                    C31248b c31248b = (C31248b) obj;
                    InterfaceC31251e currentScreenType = c31248b.getCurrentScreenType();
                    if (AbstractC22676k.m65745e(currentScreenType, InterfaceC31251e.e.f128752a)) {
                        objM106565g = InterfaceC33718i.a.INSTANCE.m106577d();
                    } else if (currentScreenType instanceof InterfaceC31251e.c) {
                        objM106565g = InterfaceC33718i.a.INSTANCE.m106576c();
                    } else if (AbstractC22676k.m65745e(currentScreenType, InterfaceC31251e.d.f128751a) || AbstractC22676k.m65745e(currentScreenType, InterfaceC31251e.a.f128748a)) {
                        objM106565g = this.f141026x.m106591e(c31248b);
                    } else if (currentScreenType instanceof InterfaceC31251e.f) {
                        objM106565g = InterfaceC33718i.a.m106565g(InterfaceC33718i.a.INSTANCE.m106574a(), null, null, null, null, null, null, new InterfaceC33715f.a(((InterfaceC31251e.f) c31248b.getCurrentScreenType()).getHistoryDate()), 63, null);
                    } else if (AbstractC22676k.m65745e(currentScreenType, InterfaceC31251e.g.f128754a)) {
                        objM106565g = InterfaceC33718i.a.INSTANCE.m106578e();
                    } else {
                        if (!(currentScreenType instanceof InterfaceC31251e.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM106565g = InterfaceC33718i.a.m106565g(InterfaceC33718i.a.INSTANCE.m106575b(), null, null, null, new InterfaceC33715f.g(((InterfaceC31251e.b) c31248b.getCurrentScreenType()).getHistoryDate()), null, InterfaceC33715f.b.f140966a, null, 87, null);
                    }
                    c42379a.f141033y = null;
                    c42379a.f141027E = null;
                    c42379a.f141028F = null;
                    c42379a.f141029G = null;
                    c42379a.f141030H = 0;
                    c42379a.f141032x = 1;
                    if (interfaceC13062m.emit(objM106565g, c42379a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C33719j c33719j) {
            this.f141023w = interfaceC13058l;
            this.f141024x = c33719j;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f141023w.collect(new C42378a(interfaceC13062m, this.f141024x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C33719j(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: c */
    private final C38206b m106589c(ShepherdClearHistoryDialogResponse clearHistoryDialogResponse) {
        if (clearHistoryDialogResponse != null) {
            return new C38206b(null, AbstractC8693b.m21278l(clearHistoryDialogResponse.getPageTitle()), AbstractC8693b.m21278l(clearHistoryDialogResponse.getWarningMessage()), AbstractC8693b.m21278l(clearHistoryDialogResponse.getClearHistoryDialogButtons().get(0).getLabel()), AbstractC8693b.m21278l(clearHistoryDialogResponse.getClearHistoryDialogButtons().get(1).getLabel()), 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC33718i m106590d(ShepherdHistoryDetailResponse historyDetailResponse, C38206b dialogState) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        C33710a c33710a;
        C33713d c33713d;
        EnumC16313m0 enumC16313m2;
        if (historyDetailResponse == null) {
            return InterfaceC33718i.a.INSTANCE.m106576c();
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(historyDetailResponse.getPossibleShepherdTile().getTileTile());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(historyDetailResponse.getPossibleShepherdTile().getTileSubtitle());
        String tileIcon = historyDetailResponse.getPossibleShepherdTile().getTileIcon();
        EnumC16313m0 enumC16313m3 = EnumC16313m0.TINY_ATTENTION;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            enumC16313m0 = null;
            if (i13 >= length) {
                enumC16313m1 = null;
                break;
            }
            enumC16313m1 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), tileIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m1 != null) {
            enumC16313m3 = enumC16313m1;
        }
        C33711b c33711b = new C33711b(textResourceM21278l, textResourceM21278l2, enumC16313m3.toWhoopIcon());
        LabradorItemInfo labradorItemInfo = historyDetailResponse.getLabradorItemInfo();
        if (labradorItemInfo != null) {
            String upsellDescription = labradorItemInfo.getUpsellDescription();
            if (upsellDescription == null) {
                upsellDescription = "";
            }
            c33710a = new C33710a(AbstractC8693b.m21278l(upsellDescription), this.reducer.m60541h(labradorItemInfo.getLabradorNewRecordingCta()));
        } else {
            c33710a = null;
        }
        if (historyDetailResponse.getHistoryDetailBox().getHistoryDetailByDate() != null) {
            String historyDate = historyDetailResponse.getHistoryDetailBox().getHistoryDetailByDate().getHistoryDate();
            String recordDate = historyDetailResponse.getHistoryDetailBox().getHistoryDetailByDate().getRecordDate();
            List<ShepherdHistoryDetailRecord> records = historyDetailResponse.getHistoryDetailBox().getHistoryDetailByDate().getRecords();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(records, 10));
            for (ShepherdHistoryDetailRecord shepherdHistoryDetailRecord : records) {
                String icon = shepherdHistoryDetailRecord.getIcon();
                EnumC16313m0 enumC16313m4 = EnumC16313m0.TINY_ATTENTION;
                EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
                int length2 = enumC16313m0ArrValues2.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length2) {
                        enumC16313m2 = null;
                        break;
                    }
                    enumC16313m2 = enumC16313m0ArrValues2[i14];
                    if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                        break;
                    }
                    i14++;
                }
                if (enumC16313m2 != null) {
                    enumC16313m4 = enumC16313m2;
                }
                arrayList.add(new C33716g(enumC16313m4.toWhoopIcon(), new TextResource.C8691e(shepherdHistoryDetailRecord.getLabel()), new TextResource.C8691e(shepherdHistoryDetailRecord.getTimeRange())));
            }
            c33713d = new C33713d(historyDate, recordDate, arrayList, historyDetailResponse.getHistoryDetailBox().getHistoryDetailByDate().getNextToken());
        } else {
            c33713d = null;
        }
        C33712c c33712c = new C33712c(new TextResource.C8691e(historyDetailResponse.getHistoryDetailBox().getTitle()), c33713d);
        C33714e c33714e = new C33714e(new TextResource.C8691e(historyDetailResponse.getClearButton().getLabel()), historyDetailResponse.getClearButton().getHasFocus());
        String icon2 = historyDetailResponse.getIcon();
        EnumC16313m0 enumC16313m5 = EnumC16313m0.CROSS;
        for (EnumC16313m0 enumC16313m6 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m6.name(), icon2)) {
                enumC16313m0 = enumC16313m6;
                break;
            }
        }
        if (enumC16313m0 != null) {
            enumC16313m5 = enumC16313m0;
        }
        return new InterfaceC33718i.b(c33711b, enumC16313m5.toWhoopIcon(), new TextResource.C8691e(historyDetailResponse.getPageTitle()), new TextResource.C8691e(historyDetailResponse.getDescription()), new TextResource.C8691e(historyDetailResponse.getAdvise()), c33710a, c33712c, c33714e, dialogState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final InterfaceC33718i m106591e(C31248b domainState) {
        if (!(domainState.getCurrentScreenType() instanceof InterfaceC31251e.a)) {
            return m106590d(domainState.getHistoryDetailResponse(), null);
        }
        ShepherdHistoryDetailResponse historyDetailResponse = domainState.getHistoryDetailResponse();
        ShepherdHistoryDetailResponse historyDetailResponse2 = domainState.getHistoryDetailResponse();
        return m106590d(historyDetailResponse, m106589c(historyDetailResponse2 != null ? historyDetailResponse2.getClearHistoryDialog() : null));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m106592b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }

    public /* synthetic */ C33719j(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC33720k.f141035a : c21535a);
    }
}

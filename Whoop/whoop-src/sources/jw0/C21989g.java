package jw0;

import com.whoop.core.details.network.model.sleep.KeyMetricBodyModalDomain;
import com.whoop.core.details.network.model.sleep.SleepDetailsKeyMetricTileType;
import com.whoop.core.details.network.model.sleep.SleepDetailsMetricModalsModel;
import com.whoop.core.details.network.model.sleep.SleepMetricBreakdownModelKt;
import com.whoop.core.details.network.model.sleep.SleepMetricTypeModel;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import l83.C23454a0;
import lw0.C24764a;
import mc1.EnumC25417b;
import nw0.AbstractC27201h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: jw0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0013\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010%\u001a\u00020\u0011*\u00020\"2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\u0011*\u00020'2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, m65681d2 = {"Ljw0/g;", "", "Llw0/a;", "sleepRepository", "Lcom/whoop/data/repositories/NotificationRepository;", "notificationRepository", "<init>", "(Llw0/a;Lcom/whoop/data/repositories/NotificationRepository;)V", "", "sourceId", "Ll83/a0;", "l", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/design/util/TextResource;", "valueDisplay", "unitDisplay", "timeDisplay", "Ljw0/f;", "domainState", "i", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljw0/f;)Ljw0/f;", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "sleepMetricType", "currentDomain", "k", "(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljw0/f;)Ljw0/f;", "Lmc1/b;", "heartRateZoneType", "j", "(Lmc1/b;Ljw0/f;)Ljw0/f;", "Ljw0/e$c;", "action", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljw0/e$c;Ljw0/f;)Ljw0/f;", "Ljw0/f$d;", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;", "keyMetricTileType", "n", "(Ljw0/f$d;Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;)Ljw0/f;", "Ljw0/f$b;", "m", "(Ljw0/f$b;Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;)Ljw0/f;", "Lec3/l;", "Ljw0/e;", "upstream", "g", "(Lec3/l;)Lec3/l;", "a", "Llw0/a;", "b", "Lcom/whoop/data/repositories/NotificationRepository;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21989g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C24764a sleepRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final NotificationRepository notificationRepository;

    /* JADX INFO: renamed from: jw0.g$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.domain.SleepDetailsInteractor$interact$1", m100430f = "SleepDetailsInteractor.kt", m100431l = {37, 38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ljw0/f;", "currentDomain", "Ljw0/e;", "action", "<anonymous>", "(Ljw0/f;Ljw0/e;)Ljw0/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f85199w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f85200x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f85201y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC21988f abstractC21988f, AbstractC21987e abstractC21987e, InterfaceC30057d<? super AbstractC21988f> interfaceC30057d) {
            a aVar = C21989g.this.new a(interfaceC30057d);
            aVar.f85200x = abstractC21988f;
            aVar.f85201y = abstractC21987e;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        
            if (r8 == r2) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jw0.C21989g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: jw0.g$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.domain.SleepDetailsInteractor", m100430f = "SleepDetailsInteractor.kt", m100431l = {53}, m100432m = "sendNotificationSegment", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f85204F;

        /* JADX INFO: renamed from: w */
        Object f85205w;

        /* JADX INFO: renamed from: x */
        Object f85206x;

        /* JADX INFO: renamed from: y */
        int f85207y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f85208z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f85208z = obj;
            this.f85204F |= Integer.MIN_VALUE;
            return C21989g.this.m62832l(null, this);
        }
    }

    public C21989g(C24764a sleepRepository, NotificationRepository notificationRepository) {
        AbstractC22676k.m65750j(sleepRepository, "sleepRepository");
        AbstractC22676k.m65750j(notificationRepository, "notificationRepository");
        this.sleepRepository = sleepRepository;
        this.notificationRepository = notificationRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final AbstractC21988f m62828h(AbstractC21987e.c action, AbstractC21988f currentDomain) {
        if ((action != null ? action.getSleepDialogType() : null) instanceof AbstractC27201h.b) {
            if (currentDomain instanceof AbstractC21988f.d) {
                AbstractC27201h sleepDialogType = action.getSleepDialogType();
                AbstractC22676k.m65748h(sleepDialogType, "null cannot be cast to non-null type com.whoop.core.details.sleep.view.SleepDetailsDialog.KeyMetricTile");
                return m62834n((AbstractC21988f.d) currentDomain, ((AbstractC27201h.b) sleepDialogType).getKeyMetricTileType());
            }
            if (!(currentDomain instanceof AbstractC21988f.b)) {
                return currentDomain;
            }
            AbstractC27201h sleepDialogType2 = action.getSleepDialogType();
            AbstractC22676k.m65748h(sleepDialogType2, "null cannot be cast to non-null type com.whoop.core.details.sleep.view.SleepDetailsDialog.KeyMetricTile");
            return m62833m((AbstractC21988f.b) currentDomain, ((AbstractC27201h.b) sleepDialogType2).getKeyMetricTileType());
        }
        if (currentDomain instanceof AbstractC21988f.a) {
            throw new IllegalStateException("Cannot launch dialog from error domain state");
        }
        if (currentDomain instanceof AbstractC21988f.b) {
            return AbstractC21988f.b.m62792b((AbstractC21988f.b) currentDomain, null, null, action != null ? action.getSleepDialogType() : null, null, null, false, null, false, null, 507, null);
        }
        if (AbstractC22676k.m65745e(currentDomain, AbstractC21988f.c.f85178a)) {
            throw new IllegalStateException("Cannot launch  dialog from loading domain state");
        }
        if (currentDomain instanceof AbstractC21988f.d) {
            return AbstractC21988f.d.m62802b((AbstractC21988f.d) currentDomain, false, null, null, null, null, null, null, action != null ? action.getSleepDialogType() : null, null, null, false, null, null, null, null, null, null, null, 262015, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final AbstractC21988f m62829i(TextResource valueDisplay, TextResource unitDisplay, TextResource timeDisplay, AbstractC21988f domainState) {
        if (!(domainState instanceof AbstractC21988f.d)) {
            return domainState;
        }
        if (timeDisplay == null || valueDisplay == null) {
            return AbstractC21988f.d.m62802b((AbstractC21988f.d) domainState, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 262135, null);
        }
        return AbstractC21988f.d.m62802b((AbstractC21988f.d) domainState, false, null, null, new C21984b(valueDisplay, unitDisplay == null ? AbstractC8693b.m21267a() : unitDisplay, timeDisplay), null, null, null, null, null, null, false, null, null, null, null, null, null, null, 262135, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final AbstractC21988f m62830j(EnumC25417b heartRateZoneType, AbstractC21988f currentDomain) {
        EnumC25417b enumC25417b = heartRateZoneType;
        AbstractC21988f.d dVar = currentDomain instanceof AbstractC21988f.d ? (AbstractC21988f.d) currentDomain : null;
        if (dVar == null) {
            return currentDomain;
        }
        AbstractC21991i abstractC21991i = AbstractC22676k.m65745e(dVar.getSelectedSleepMetricType(), dVar.m62818q().get(enumC25417b)) ? null : dVar.m62818q().get(enumC25417b);
        if (((AbstractC21988f.d) currentDomain).getCurrentHeartZoneType() == enumC25417b) {
            enumC25417b = EnumC25417b.NONE;
        }
        return AbstractC21988f.d.m62802b(dVar, false, null, null, null, abstractC21991i, null, null, null, null, null, false, null, null, enumC25417b, null, null, null, null, 237551, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final AbstractC21988f m62831k(SleepMetricTypeModel sleepMetricType, AbstractC21988f currentDomain) {
        AbstractC21988f.d dVar = currentDomain instanceof AbstractC21988f.d ? (AbstractC21988f.d) currentDomain : null;
        if (dVar == null) {
            throw new IllegalStateException("Cannot select tooltip from domain state other than successful");
        }
        SleepMetricTypeModel selectedTooltip = dVar.getSelectedTooltip();
        if (selectedTooltip != null) {
            return AbstractC21988f.d.m62802b((AbstractC21988f.d) currentDomain, false, null, null, null, null, null, null, null, null, null, false, null, null, null, selectedTooltip != sleepMetricType ? sleepMetricType : null, null, null, null, 245759, null);
        }
        return AbstractC21988f.d.m62802b((AbstractC21988f.d) currentDomain, false, null, null, null, null, null, null, null, null, null, false, null, null, null, sleepMetricType, null, null, null, 245759, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m62832l(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f85204F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f85204F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objSendPushNotificationMetric = bVar.f85208z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f85204F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSendPushNotificationMetric);
            if (str != null) {
                NotificationRepository notificationRepository = this.notificationRepository;
                PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.Opened;
                bVar.f85205w = null;
                bVar.f85206x = null;
                bVar.f85207y = 0;
                bVar.f85204F = 1;
                objSendPushNotificationMetric = notificationRepository.sendPushNotificationMetric(pushNotificationMetricType, str, bVar);
                if (objSendPushNotificationMetric == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objSendPushNotificationMetric);
        ((Boolean) objSendPushNotificationMetric).booleanValue();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private final AbstractC21988f m62833m(AbstractC21988f.b bVar, SleepDetailsKeyMetricTileType sleepDetailsKeyMetricTileType) {
        SleepDetailsKeyMetricTileType sleepDetailsKeyMetricTileType2;
        Object next;
        Iterator<T> it = bVar.getKeyMetrics().m62764a().iterator();
        do {
            if (!it.hasNext()) {
                sleepDetailsKeyMetricTileType2 = sleepDetailsKeyMetricTileType;
                next = null;
                break;
            }
            next = it.next();
            sleepDetailsKeyMetricTileType2 = sleepDetailsKeyMetricTileType;
        } while (((SleepDetailsMetricModalsModel) next).getSleepMetricType().toSleepDetailsKeyMetricTileType() != sleepDetailsKeyMetricTileType2);
        SleepDetailsMetricModalsModel sleepDetailsMetricModalsModel = (SleepDetailsMetricModalsModel) next;
        if (sleepDetailsMetricModalsModel == null) {
            throw new IllegalStateException("Requested key metric modal for metric not in the response body");
        }
        bVar.getDialog();
        return AbstractC21988f.b.m62792b(bVar, null, null, new AbstractC27201h.b(new KeyMetricBodyModalDomain(sleepDetailsMetricModalsModel.getCalibrationBodyDisplay(), sleepDetailsMetricModalsModel.getMetricDescriptionDisplay(), sleepDetailsMetricModalsModel.getIndividualMetricDisplay(), sleepDetailsMetricModalsModel.getIndividualMetricRangeDisplay()), sleepDetailsKeyMetricTileType2.getIcon(), AbstractC8693b.m21278l(sleepDetailsMetricModalsModel.getTrendTitleDisplay()), AbstractC8693b.m21278l(sleepDetailsMetricModalsModel.getTrendSubTitleDisplay()), SleepMetricBreakdownModelKt.toTrendTypeState(sleepDetailsMetricModalsModel.getSleepMetricTrendType()), sleepDetailsKeyMetricTileType2), null, null, false, null, false, null, 507, null);
    }

    /* JADX INFO: renamed from: n */
    private final AbstractC21988f m62834n(AbstractC21988f.d dVar, SleepDetailsKeyMetricTileType sleepDetailsKeyMetricTileType) {
        SleepDetailsKeyMetricTileType sleepDetailsKeyMetricTileType2;
        Object next;
        Iterator<T> it = dVar.getKeyMetrics().m62764a().iterator();
        do {
            if (!it.hasNext()) {
                sleepDetailsKeyMetricTileType2 = sleepDetailsKeyMetricTileType;
                next = null;
                break;
            }
            next = it.next();
            sleepDetailsKeyMetricTileType2 = sleepDetailsKeyMetricTileType;
        } while (((SleepDetailsMetricModalsModel) next).getSleepMetricType().toSleepDetailsKeyMetricTileType() != sleepDetailsKeyMetricTileType2);
        SleepDetailsMetricModalsModel sleepDetailsMetricModalsModel = (SleepDetailsMetricModalsModel) next;
        if (sleepDetailsMetricModalsModel == null) {
            throw new IllegalStateException("Requested key metric modal for metric not in the response body");
        }
        dVar.getDialog();
        return AbstractC21988f.d.m62802b(dVar, false, null, null, null, null, null, null, new AbstractC27201h.b(new KeyMetricBodyModalDomain(sleepDetailsMetricModalsModel.getCalibrationBodyDisplay(), sleepDetailsMetricModalsModel.getMetricDescriptionDisplay(), sleepDetailsMetricModalsModel.getIndividualMetricDisplay(), sleepDetailsMetricModalsModel.getIndividualMetricRangeDisplay()), sleepDetailsKeyMetricTileType2.getIcon(), AbstractC8693b.m21278l(sleepDetailsMetricModalsModel.getTrendTitleDisplay()), AbstractC8693b.m21278l(sleepDetailsMetricModalsModel.getTrendSubTitleDisplay()), SleepMetricBreakdownModelKt.toTrendTypeState(sleepDetailsMetricModalsModel.getSleepMetricTrendType()), sleepDetailsKeyMetricTileType2), null, null, false, null, null, null, null, null, null, null, 262015, null);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m62835g(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC21988f.c.f85178a, upstream, new a(null));
    }
}

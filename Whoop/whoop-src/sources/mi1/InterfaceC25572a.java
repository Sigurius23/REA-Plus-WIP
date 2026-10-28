package mi1;

import com.whoop.domain.model.haptics.NotificationHapticsPattern;
import com.whoop.domain.model.haptics.StoredAlarm;
import com.whoop.domain.model.haptics.StrapAlarmIdentifiable;
import java.util.List;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: mi1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lmi1/a;", "", "Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;", "notificationHapticsPattern", "Lmi1/b;", "d", "(Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;Lq83/d;)Ljava/lang/Object;", "", "Lcom/whoop/domain/model/haptics/StoredAlarm;", "storedAlarmList", "a", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "alarmId", "c", "(ILq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;", "strapAlarmIdentifiable", "b", "(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lq83/d;)Ljava/lang/Object;", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC25572a {
    /* JADX INFO: renamed from: a */
    Object mo75185a(List<StoredAlarm> list, InterfaceC30057d<? super AbstractC25573b> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo75186b(StrapAlarmIdentifiable strapAlarmIdentifiable, InterfaceC30057d<? super AbstractC25573b> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo75187c(int i13, InterfaceC30057d<? super AbstractC25573b> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    Object mo75188d(NotificationHapticsPattern notificationHapticsPattern, InterfaceC30057d<? super AbstractC25573b> interfaceC30057d);
}

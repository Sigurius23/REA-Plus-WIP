package jp0;

import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import com.whoop.data.remote.commons.Resource;
import com.whoop.sleep.coach.data.network.model.HarvardSleepAdviceDto;
import com.whoop.sleep.coach.data.network.model.Vow;
import ec3.InterfaceC13058l;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: jp0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Ljp0/a;", "", "Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;", "a", "(Lq83/d;)Ljava/lang/Object;", "harvardSleepAdviceDto", "", "format", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/sleep/coach/data/network/model/Vow;", "d", "(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "b", "Lec3/l;", "c", "()Lec3/l;", "cachedAlarm", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21847a {
    /* JADX INFO: renamed from: a */
    Object mo61829a(InterfaceC30057d<? super HarvardSleepAdviceDto> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo61830b(InterfaceC30057d<? super SmartAlarmUserInfo> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    InterfaceC13058l mo61831c();

    /* JADX INFO: renamed from: d */
    Object mo61832d(HarvardSleepAdviceDto harvardSleepAdviceDto, String str, InterfaceC30057d<? super Resource<Vow>> interfaceC30057d);
}

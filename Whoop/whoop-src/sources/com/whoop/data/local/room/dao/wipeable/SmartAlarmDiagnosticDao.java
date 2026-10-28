package com.whoop.data.local.room.dao.wipeable;

import com.whoop.data.local.room.entity.SmartAlarmDiagnosticDto;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;", "", "Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;", "smartAlarmDiagnosticDto", "Ll83/a0;", "insert", "(Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;Lq83/d;)Ljava/lang/Object;", "", "noRows", "", "from", "to", "delete", "(IJJLq83/d;)Ljava/lang/Object;", "", "getAll", "(Lq83/d;)Ljava/lang/Object;", "deleteAll", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SmartAlarmDiagnosticDao {
    Object delete(int i13, long j7, long j13, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object getAll(InterfaceC30057d<? super List<SmartAlarmDiagnosticDto>> interfaceC30057d);

    Object insert(SmartAlarmDiagnosticDto smartAlarmDiagnosticDto, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}

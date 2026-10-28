package com.whoop.data.local.room.dao.persistent;

import du0.C12374a;
import ec3.InterfaceC13058l;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0007J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\bH§@¢\u0006\u0004\b\u0018\u0010\u000bJ\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\bH§@¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001aH'¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/local/room/dao/persistent/RawDataDao;", "", "", "Ldu0/a;", "rawDataDtoList", "Ll83/a0;", "insertList", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "revision", "getPacketsByRevision", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "count", "getPacketsByRevisionAndCount", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "deleteAllData", "(Lq83/d;)Ljava/lang/Object;", "", "id", "delete", "(JLq83/d;)Ljava/lang/Object;", "deleteByPacketsList", "rawDataVersion", "getNewestTimestampByPacketVersion", "getOldestTimestampByPacketVersion", "Lec3/l;", "observeNewestTimestamp", "()Lec3/l;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface RawDataDao {
    Object delete(long j7, InterfaceC30057d<? super Integer> interfaceC30057d);

    Object deleteAllData(InterfaceC30057d<? super Integer> interfaceC30057d);

    Object deleteByPacketsList(List<C12374a> list, InterfaceC30057d<? super Integer> interfaceC30057d);

    Object getNewestTimestampByPacketVersion(String str, InterfaceC30057d<? super Long> interfaceC30057d);

    Object getOldestTimestampByPacketVersion(String str, InterfaceC30057d<? super Long> interfaceC30057d);

    Object getPacketsByRevision(String str, InterfaceC30057d<? super List<C12374a>> interfaceC30057d);

    Object getPacketsByRevisionAndCount(String str, int i13, InterfaceC30057d<? super List<C12374a>> interfaceC30057d);

    Object insertList(List<C12374a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    InterfaceC13058l observeNewestTimestamp();
}

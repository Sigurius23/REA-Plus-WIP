package com.whoop.data.local.room.dao.wipeable;

import androidx.lifecycle.AbstractC1615p0;
import com.whoop.data.local.room.entity.JournalAnsweredDto;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/local/room/dao/wipeable/JournalDao;", "", "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;", "journalAnswer", "Ll83/a0;", "saveJournalAnsweredDto", "(Lcom/whoop/data/local/room/entity/JournalAnsweredDto;Lq83/d;)Ljava/lang/Object;", "", "cycleId", "getJournalAnswer", "(JLq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/p0;", "getJournalAnswerLiveData", "(J)Landroidx/lifecycle/p0;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface JournalDao {
    Object getJournalAnswer(long j7, InterfaceC30057d<? super JournalAnsweredDto> interfaceC30057d);

    AbstractC1615p0 getJournalAnswerLiveData(long cycleId);

    Object saveJournalAnsweredDto(JournalAnsweredDto journalAnsweredDto, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}

package com.whoop.data.local.room.dao.wipeable;

import ai1.C0910b;
import androidx.lifecycle.AbstractC1615p0;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import be1.C3169c;
import com.whoop.data.local.room.entity.JournalAnsweredDto;
import ge3.AbstractC15751g;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
public final class JournalDao_Impl implements JournalDao {
    private final AbstractC1848z0 __db;
    private final AbstractC1802k __insertAdapterOfJournalAnsweredDto = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.wipeable.JournalDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_journal_answers` (`cycle_id`,`is_journal_shown`,`is_journal_answered`) VALUES (?,?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, JournalAnsweredDto journalAnsweredDto) {
            interfaceC33689c.mo5356p(1, journalAnsweredDto.getCycleId());
            interfaceC33689c.mo5356p(2, journalAnsweredDto.isJournalShown() ? 1L : 0L);
            interfaceC33689c.mo5356p(3, journalAnsweredDto.isJournalAnswered() ? 1L : 0L);
        }
    };

    public JournalDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JournalAnsweredDto lambda$getJournalAnswer$1(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        JournalAnsweredDto journalAnsweredDto;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * from table_journal_answers WHERE cycle_id == (?)");
        boolean z4 = true;
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cycle_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "is_journal_shown");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "is_journal_answered");
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                long j13 = interfaceC33689cMo68212g1.getLong(iM60658N);
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N2)) != 0;
                if (((int) interfaceC33689cMo68212g1.getLong(iM60658N3)) == 0) {
                    z4 = false;
                }
                journalAnsweredDto = new JournalAnsweredDto(j13, z13, z4);
            } else {
                journalAnsweredDto = null;
            }
            return journalAnsweredDto;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JournalAnsweredDto lambda$getJournalAnswerLiveData$2(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        JournalAnsweredDto journalAnsweredDto;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * from table_journal_answers WHERE cycle_id == (?)");
        boolean z4 = true;
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cycle_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "is_journal_shown");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "is_journal_answered");
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                long j13 = interfaceC33689cMo68212g1.getLong(iM60658N);
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N2)) != 0;
                if (((int) interfaceC33689cMo68212g1.getLong(iM60658N3)) == 0) {
                    z4 = false;
                }
                journalAnsweredDto = new JournalAnsweredDto(j13, z13, z4);
            } else {
                journalAnsweredDto = null;
            }
            return journalAnsweredDto;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$saveJournalAnsweredDto$0(JournalAnsweredDto journalAnsweredDto, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfJournalAnsweredDto.insert(interfaceC33687a, journalAnsweredDto);
        return C23454a0.f92919a;
    }

    @Override // com.whoop.data.local.room.dao.wipeable.JournalDao
    public Object getJournalAnswer(long j7, InterfaceC30057d<? super JournalAnsweredDto> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C0910b(j7, 5), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.JournalDao
    public AbstractC1615p0 getJournalAnswerLiveData(long j7) {
        return this.__db.getInvalidationTracker().m5455b(new String[]{"table_journal_answers"}, false, new C0910b(j7, 6));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.JournalDao
    public Object saveJournalAnsweredDto(JournalAnsweredDto journalAnsweredDto, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        journalAnsweredDto.getClass();
        return AbstractC15751g.m44434N(this.__db, false, true, new C3169c(22, this, journalAnsweredDto), interfaceC30057d);
    }
}

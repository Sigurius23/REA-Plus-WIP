package com.whoop.bot.api;

import com.whoop.bot.domain.chatminiarchwidget.CommitJournalEntryRequestBody;
import com.whoop.bot.domain.chatminiarchwidget.CommitJournalEntryResponse;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37294y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/bot/api/CommitJournalEntryApi;", "", "", "path", "Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryRequestBody;", "body", "Lpg3/v0;", "Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryResponse;", "commit", "(Ljava/lang/String;Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryRequestBody;Lq83/d;)Ljava/lang/Object;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface CommitJournalEntryApi {
    @InterfaceC37285p
    Object commit(@InterfaceC37294y String str, @InterfaceC37270a CommitJournalEntryRequestBody commitJournalEntryRequestBody, InterfaceC30057d<? super C29218v0<CommitJournalEntryResponse>> interfaceC30057d);
}

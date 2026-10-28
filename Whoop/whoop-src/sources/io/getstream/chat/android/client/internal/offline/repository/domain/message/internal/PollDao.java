package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;", "", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;", "polls", "Ll83/a0;", "insertPolls", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "pollId", "getPoll", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deletePoll", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface PollDao {
    Object deletePoll(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object getPoll(String str, InterfaceC30057d<? super PollEntity> interfaceC30057d);

    Object insertPolls(List<PollEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}

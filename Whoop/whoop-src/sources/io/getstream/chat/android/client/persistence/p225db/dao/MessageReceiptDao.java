package io.getstream.chat.android.client.persistence.p225db.dao;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.persistence.p225db.entity.MessageReceiptEntity;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;", "", "", "Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;", "receipts", "Ll83/a0;", "upsert", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", MapboxMap.QFE_LIMIT, "selectAll", "(ILq83/d;)Ljava/lang/Object;", "", "messageIds", "deleteByMessageIds", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessageReceiptDao {
    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteByMessageIds(List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object selectAll(int i13, InterfaceC30057d<? super List<MessageReceiptEntity>> interfaceC30057d);

    Object upsert(List<MessageReceiptEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}

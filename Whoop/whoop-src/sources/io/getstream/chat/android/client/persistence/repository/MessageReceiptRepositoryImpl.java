package io.getstream.chat.android.client.persistence.repository;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao;
import io.getstream.chat.android.client.persistence.p225db.entity.MessageReceiptEntity;
import io.getstream.chat.android.client.receipts.MessageReceipt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl;", "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;", "Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;", "dao", "<init>", "(Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;)V", "", "Lio/getstream/chat/android/client/receipts/MessageReceipt;", "receipts", "Ll83/a0;", "upsertMessageReceipts", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", MapboxMap.QFE_LIMIT, "selectMessageReceipts", "(ILq83/d;)Ljava/lang/Object;", "", "messageIds", "deleteMessageReceiptsByMessageIds", "clearMessageReceipts", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageReceiptRepositoryImpl implements MessageReceiptRepository {
    private final MessageReceiptDao dao;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistence.repository.MessageReceiptRepositoryImpl$selectMessageReceipts$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistence.repository.MessageReceiptRepositoryImpl", m100430f = "MessageReceiptRepository.kt", m100431l = {51}, m100432m = "selectMessageReceipts")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194171 extends AbstractC32269c {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C194171(InterfaceC30057d<? super C194171> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageReceiptRepositoryImpl.this.selectMessageReceipts(0, this);
        }
    }

    public MessageReceiptRepositoryImpl(MessageReceiptDao dao) {
        AbstractC22676k.m65750j(dao, "dao");
        this.dao = dao;
    }

    @Override // io.getstream.chat.android.client.persistence.repository.MessageReceiptRepository
    public final Object clearMessageReceipts(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeleteAll = this.dao.deleteAll(interfaceC30057d);
        return objDeleteAll == EnumC31071a.f128113w ? objDeleteAll : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistence.repository.MessageReceiptRepository
    public final Object deleteMessageReceiptsByMessageIds(List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeleteByMessageIds = this.dao.deleteByMessageIds(list, interfaceC30057d);
        return objDeleteByMessageIds == EnumC31071a.f128113w ? objDeleteByMessageIds : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.persistence.repository.MessageReceiptRepository
    public final Object selectMessageReceipts(int i13, InterfaceC30057d<? super List<MessageReceipt>> interfaceC30057d) {
        C194171 c194171;
        if (interfaceC30057d instanceof C194171) {
            c194171 = (C194171) interfaceC30057d;
            int i14 = c194171.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c194171.label = i14 - Integer.MIN_VALUE;
            } else {
                c194171 = new C194171(interfaceC30057d);
            }
        } else {
            c194171 = new C194171(interfaceC30057d);
        }
        Object objSelectAll = c194171.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c194171.label;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objSelectAll);
            MessageReceiptDao messageReceiptDao = this.dao;
            c194171.I$0 = i13;
            c194171.label = 1;
            objSelectAll = messageReceiptDao.selectAll(i13, c194171);
            if (objSelectAll == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objSelectAll);
        }
        Iterable iterable = (Iterable) objSelectAll;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(MessageReceiptRepositoryMapperKt.toModel((MessageReceiptEntity) it.next()));
        }
        return arrayList;
    }

    @Override // io.getstream.chat.android.client.persistence.repository.MessageReceiptRepository
    public final Object upsertMessageReceipts(List<MessageReceipt> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        MessageReceiptDao messageReceiptDao = this.dao;
        List<MessageReceipt> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(MessageReceiptRepositoryMapperKt.toEntity((MessageReceipt) it.next()));
        }
        Object objUpsert = messageReceiptDao.upsert(arrayList, interfaceC30057d);
        return objUpsert == EnumC31071a.f128113w ? objUpsert : C23454a0.f92919a;
    }
}

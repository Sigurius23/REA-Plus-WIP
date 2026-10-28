package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import com.mapbox.common.logger.LogPriority;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.plugin.listeners.DraftMessageListener;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.DraftsSort;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.QueryDraftsResult;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Iterator;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0010\u0010\u000fJF\u0010\u001a\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "messageRepository", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V", "Ln23/h;", "Lio/getstream/chat/android/models/DraftMessage;", "result", "", "channelType", "channelId", "message", "Ll83/a0;", "onCreateDraftMessageResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;", "onDeleteDraftMessagesResult", "Lio/getstream/chat/android/models/QueryDraftsResult;", "Lio/getstream/chat/android/models/FilterObject;", "filter", "", MapboxMap.QFE_LIMIT, "next", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/DraftsSort;", "sort", "onQueryDraftMessagesResult", "(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DraftMessageListenerDatabase implements DraftMessageListener {
    private final MessageRepository messageRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DraftMessageListenerDatabase$onCreateDraftMessageResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DraftMessageListenerDatabase", m100430f = "DraftMessageListenerDatabase.kt", m100431l = {50, 53}, m100432m = "onCreateDraftMessageResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191121 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C191121(InterfaceC30057d<? super C191121> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DraftMessageListenerDatabase.this.onCreateDraftMessageResult(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DraftMessageListenerDatabase", m100430f = "DraftMessageListenerDatabase.kt", m100431l = {73, 76}, m100432m = "onDeleteDraftMessagesResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191131 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C191131(InterfaceC30057d<? super C191131> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DraftMessageListenerDatabase.this.onDeleteDraftMessagesResult(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DraftMessageListenerDatabase$onQueryDraftMessagesResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DraftMessageListenerDatabase", m100430f = "DraftMessageListenerDatabase.kt", m100431l = {LogPriority.NONE}, m100432m = "onQueryDraftMessagesResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191141 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C191141(InterfaceC30057d<? super C191141> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DraftMessageListenerDatabase.this.onQueryDraftMessagesResult(null, null, 0, null, null, this);
        }
    }

    public DraftMessageListenerDatabase(MessageRepository messageRepository) {
        AbstractC22676k.m65750j(messageRepository, "messageRepository");
        this.messageRepository = messageRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f5, code lost:
    
        if (r8.insertDraftMessage(r9, r7) == r10) goto L34;
     */
    @Override // io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onCreateDraftMessageResult(n23.AbstractC26205h r6, java.lang.String r7, java.lang.String r8, io.getstream.chat.android.models.DraftMessage r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DraftMessageListenerDatabase.onCreateDraftMessageResult(n23.h, java.lang.String, java.lang.String, io.getstream.chat.android.models.DraftMessage, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f5, code lost:
    
        if (r8.deleteDraftMessage(r9, r7) == r10) goto L34;
     */
    @Override // io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onDeleteDraftMessagesResult(n23.AbstractC26205h r6, java.lang.String r7, java.lang.String r8, io.getstream.chat.android.models.DraftMessage r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DraftMessageListenerDatabase.onDeleteDraftMessagesResult(n23.h, java.lang.String, java.lang.String, io.getstream.chat.android.models.DraftMessage, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    public final Object onQueryDraftMessagesResult(AbstractC26205h abstractC26205h, FilterObject filterObject, int i13, String str, QuerySorter<DraftsSort> querySorter, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191141 c191141;
        Iterator it;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (interfaceC30057d instanceof C191141) {
            c191141 = (C191141) interfaceC30057d;
            int i19 = c191141.label;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                c191141.label = i19 - Integer.MIN_VALUE;
            } else {
                c191141 = new C191141(interfaceC30057d);
            }
        } else {
            c191141 = new C191141(interfaceC30057d);
        }
        Object obj = c191141.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i24 = c191141.label;
        if (i24 == 0) {
            AbstractC34132o.m107864I(obj);
            if (abstractC26205h instanceof C26204g) {
                it = ((QueryDraftsResult) ((C26204g) abstractC26205h).f103919a).getDrafts().iterator();
                i14 = 0;
                i15 = 0;
                i16 = 0;
                i17 = i13;
                i18 = 0;
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            return C23454a0.f92919a;
        }
        if (i24 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i25 = c191141.I$4;
        int i26 = c191141.I$3;
        int i27 = c191141.I$2;
        int i28 = c191141.I$1;
        int i29 = c191141.I$0;
        it = (Iterator) c191141.L$10;
        AbstractC26205h abstractC26205h2 = (AbstractC26205h) c191141.L$5;
        AbstractC34132o.m107864I(obj);
        i17 = i29;
        i16 = i28;
        i15 = i27;
        i14 = i26;
        i18 = i25;
        abstractC26205h = abstractC26205h2;
        while (it.hasNext()) {
            DraftMessage draftMessage = (DraftMessage) it.next();
            MessageRepository messageRepository = this.messageRepository;
            c191141.L$0 = null;
            c191141.L$1 = null;
            c191141.L$2 = null;
            c191141.L$3 = null;
            c191141.L$4 = null;
            c191141.L$5 = abstractC26205h;
            c191141.L$6 = null;
            c191141.L$7 = null;
            c191141.L$8 = null;
            c191141.L$9 = null;
            c191141.L$10 = it;
            c191141.L$11 = null;
            c191141.L$12 = null;
            c191141.I$0 = i17;
            c191141.I$1 = i16;
            c191141.I$2 = i15;
            c191141.I$3 = i14;
            c191141.I$4 = i18;
            c191141.I$5 = 0;
            c191141.label = 1;
            if (messageRepository.insertDraftMessage(draftMessage, c191141) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }
}

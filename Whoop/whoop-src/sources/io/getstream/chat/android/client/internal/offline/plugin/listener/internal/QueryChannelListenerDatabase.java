package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.plugin.listeners.QueryChannelListener;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ6\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repos", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V", "", "channelType", "channelId", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "request", "Ln23/h;", "Ll83/a0;", "onQueryChannelPrecondition", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "onQueryChannelRequest", "Lio/getstream/chat/android/models/Channel;", "result", "onQueryChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelListenerDatabase implements QueryChannelListener {
    private final RepositoryFacade repos;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.QueryChannelListenerDatabase$onQueryChannelResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.QueryChannelListenerDatabase", m100430f = "QueryChannelListenerDatabase.kt", m100431l = {61, 62}, m100432m = "onQueryChannelResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191181 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C191181(InterfaceC30057d<? super C191181> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QueryChannelListenerDatabase.this.onQueryChannelResult(null, null, null, null, this);
        }
    }

    public QueryChannelListenerDatabase(RepositoryFacade repos) {
        AbstractC22676k.m65750j(repos, "repos");
        this.repos = repos;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelPrecondition(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelRequest(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        if (r10.storeStateForChannel(r3, r9) == r11) goto L24;
     */
    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onQueryChannelResult(n23.AbstractC26205h r8, java.lang.String r9, java.lang.String r10, io.getstream.chat.android.client.api.models.QueryChannelRequest r11, q83.InterfaceC30057d<? super l83.C23454a0> r12) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.QueryChannelListenerDatabase.onQueryChannelResult(n23.h, java.lang.String, java.lang.String, io.getstream.chat.android.client.api.models.QueryChannelRequest, q83.d):java.lang.Object");
    }
}

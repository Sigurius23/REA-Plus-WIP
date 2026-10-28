package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.plugin.listeners.GetMessageListener;
import io.getstream.chat.android.models.Message;
import l83.C23454a0;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/GetMessageListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repositoryFacade", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V", "", "messageId", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "onGetMessageResult", "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "Lb23/k;", "logger", "Lb23/k;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class GetMessageListenerDatabase implements GetMessageListener {
    private final C2345k logger;
    private final RepositoryFacade repositoryFacade;

    public GetMessageListenerDatabase(RepositoryFacade repositoryFacade) {
        AbstractC22676k.m65750j(repositoryFacade, "repositoryFacade");
        this.repositoryFacade = repositoryFacade;
        this.logger = new C2345k("Chat: GetMessageListenerDatabase", C2343i.f9271c, C2343i.f9272d);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.GetMessageListener
    public final Object onGetMessageResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean z4 = abstractC26205h instanceof C26204g;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            Object objInsertMessage = this.repositoryFacade.insertMessage((Message) ((C26204g) abstractC26205h).f103919a, interfaceC30057d);
            if (objInsertMessage == EnumC31071a.f128113w) {
                return objInsertMessage;
            }
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str2 = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                c2345k.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[onGetMessageResult] Could not insert the message into the database. The API call had failed with: ", abstractC26202e.mo77807a()), null);
            }
        }
        return c23454a0;
    }
}

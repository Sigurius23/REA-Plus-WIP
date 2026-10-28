package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.client.persistance.repository.UserRepository;
import io.getstream.chat.android.client.plugin.listeners.FetchCurrentUserListener;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "userRepository", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V", "Ln23/h;", "Lio/getstream/chat/android/models/User;", "result", "Ll83/a0;", "onFetchCurrentUserResult", "(Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FetchCurrentUserListenerDatabase implements FetchCurrentUserListener {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final UserRepository userRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.FetchCurrentUserListenerDatabase", m100430f = "FetchCurrentUserListenerDatabase.kt", m100431l = {35}, m100432m = "onFetchCurrentUserResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191161 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C191161(InterfaceC30057d<? super C191161> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchCurrentUserListenerDatabase.this.onFetchCurrentUserResult(null, this);
        }
    }

    public FetchCurrentUserListenerDatabase(UserRepository userRepository) {
        AbstractC22676k.m65750j(userRepository, "userRepository");
        this.userRepository = userRepository;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:FetchCurUserLDB");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.plugin.listeners.FetchCurrentUserListener
    public final Object onFetchCurrentUserResult(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191161 c191161;
        if (interfaceC30057d instanceof C191161) {
            c191161 = (C191161) interfaceC30057d;
            int i13 = c191161.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191161.label = i13 - Integer.MIN_VALUE;
            } else {
                c191161 = new C191161(interfaceC30057d);
            }
        } else {
            c191161 = new C191161(interfaceC30057d);
        }
        Object obj = c191161.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191161.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (abstractC26205h instanceof C26204g) {
                User user = (User) ((C26204g) abstractC26205h).f103919a;
                C2345k logger = getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[onFetchCurrentUserResult] result: " + abstractC26205h, null);
                }
                UserRepository userRepository = this.userRepository;
                c191161.L$0 = null;
                c191161.L$1 = null;
                c191161.L$2 = abstractC26205h;
                c191161.L$3 = null;
                c191161.L$4 = null;
                c191161.L$5 = null;
                c191161.I$0 = 0;
                c191161.I$1 = 0;
                c191161.I$2 = 0;
                c191161.label = 1;
                if (userRepository.insertCurrentUser(user, c191161) == enumC31071a) {
                    return enumC31071a;
                }
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }
}

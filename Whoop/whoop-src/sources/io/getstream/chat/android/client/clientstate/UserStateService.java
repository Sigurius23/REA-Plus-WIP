package io.getstream.chat.android.client.clientstate;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4351m;
import d13.AbstractC11478a;
import ec3.InterfaceC13037f2;
import in0.C18719a;
import io.getstream.chat.android.core.internal.fsm.FiniteStateMachine;
import io.getstream.chat.android.core.internal.fsm.builder.FSMBuilder;
import io.getstream.chat.android.core.internal.fsm.builder.StateHandlerBuilder;
import io.getstream.chat.android.models.User;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/UserStateService;", "", "<init>", "()V", "Lio/getstream/chat/android/models/User;", com.whoop.service.network.model.UserState.Sources.USER, "Ll83/a0;", "onUserUpdated", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "", "isAnonymous", "onSetUser", "(Lio/getstream/chat/android/models/User;ZLq83/d;)Ljava/lang/Object;", "onLogout", "(Lq83/d;)Ljava/lang/Object;", "onSocketUnrecoverableError", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;", "Lio/getstream/chat/android/client/clientstate/UserState;", "Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;", "fsm", "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;", "getState$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/clientstate/UserState;", "state", "Lec3/f2;", "getStateFlow$stream_chat_android_client_release", "()Lec3/f2;", "stateFlow", "UserStateEvent", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserStateService {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "Chat:UserStateService");
    private final FiniteStateMachine<UserState, UserStateEvent> fsm = FiniteStateMachine.INSTANCE.invoke(new Function1() { // from class: io.getstream.chat.android.client.clientstate.b
        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            UserStateService.fsm$lambda$16(this.f73784w, (FSMBuilder) obj);
            return C23454a0.f92919a;
        }
    });

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;", "", "<init>", "()V", "ConnectUser", "UserUpdated", "ConnectAnonymous", "UnsetUser", "Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectAnonymous;", "Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectUser;", "Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;", "Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class UserStateEvent {

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectAnonymous;", "Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;", com.whoop.service.network.model.UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class ConnectAnonymous extends UserStateEvent {
            private final User user;

            public ConnectAnonymous(User user) {
                AbstractC22676k.m65750j(user, "user");
                this.user = user;
            }

            public static /* synthetic */ ConnectAnonymous copy$default(ConnectAnonymous connectAnonymous, User user, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    user = connectAnonymous.user;
                }
                return connectAnonymous.copy(user);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final User getUser() {
                return this.user;
            }

            public final ConnectAnonymous copy(User user) {
                AbstractC22676k.m65750j(user, "user");
                return new ConnectAnonymous(user);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConnectAnonymous) && AbstractC22676k.m65745e(this.user, ((ConnectAnonymous) other).user);
            }

            public final User getUser() {
                return this.user;
            }

            public final int hashCode() {
                return this.user.hashCode();
            }

            public final String toString() {
                return "ConnectAnonymous(user=" + this.user + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectUser;", "Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;", com.whoop.service.network.model.UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class ConnectUser extends UserStateEvent {
            private final User user;

            public ConnectUser(User user) {
                AbstractC22676k.m65750j(user, "user");
                this.user = user;
            }

            public static /* synthetic */ ConnectUser copy$default(ConnectUser connectUser, User user, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    user = connectUser.user;
                }
                return connectUser.copy(user);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final User getUser() {
                return this.user;
            }

            public final ConnectUser copy(User user) {
                AbstractC22676k.m65750j(user, "user");
                return new ConnectUser(user);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConnectUser) && AbstractC22676k.m65745e(this.user, ((ConnectUser) other).user);
            }

            public final User getUser() {
                return this.user;
            }

            public final int hashCode() {
                return this.user.hashCode();
            }

            public final String toString() {
                return "ConnectUser(user=" + this.user + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;", "Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class UnsetUser extends UserStateEvent {
            public static final UnsetUser INSTANCE = new UnsetUser();

            private UnsetUser() {
            }

            public final String toString() {
                return "UnsetUser";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;", "Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;", com.whoop.service.network.model.UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UserUpdated extends UserStateEvent {
            private final User user;

            public UserUpdated(User user) {
                AbstractC22676k.m65750j(user, "user");
                this.user = user;
            }

            public static /* synthetic */ UserUpdated copy$default(UserUpdated userUpdated, User user, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    user = userUpdated.user;
                }
                return userUpdated.copy(user);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final User getUser() {
                return this.user;
            }

            public final UserUpdated copy(User user) {
                AbstractC22676k.m65750j(user, "user");
                return new UserUpdated(user);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UserUpdated) && AbstractC22676k.m65745e(this.user, ((UserUpdated) other).user);
            }

            public final User getUser() {
                return this.user;
            }

            public final int hashCode() {
                return this.user.hashCode();
            }

            public final String toString() {
                return "UserUpdated(user=" + this.user + ")";
            }
        }

        private UserStateEvent() {
        }

        public UserStateEvent(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ UserState.UserSet m54639a(UserState.UserSet userSet, UserStateEvent.UserUpdated userUpdated) {
        return (UserState.UserSet) fsm$lambda$16$lambda$12$lambda$10(userSet, userUpdated);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ UserState.NotSet m54640b(UserState.AnonymousUserSet anonymousUserSet, UserStateEvent.UnsetUser unsetUser) {
        return (UserState.NotSet) fsm$lambda$16$lambda$15$lambda$14(anonymousUserSet, unsetUser);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ UserState.AnonymousUserSet m54642d(UserState.AnonymousUserSet anonymousUserSet, UserStateEvent.UserUpdated userUpdated) {
        return (UserState.AnonymousUserSet) fsm$lambda$16$lambda$15$lambda$13(anonymousUserSet, userUpdated);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ UserState.UserSet m54644f(UserState.NotSet notSet, UserStateEvent.ConnectUser connectUser) {
        return (UserState.UserSet) fsm$lambda$16$lambda$9$lambda$6(notSet, connectUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 fsm$lambda$16(final UserStateService userStateService, FSMBuilder FiniteStateMachine) {
        AbstractC22676k.m65750j(FiniteStateMachine, "$this$FiniteStateMachine");
        final int i13 = 0;
        FiniteStateMachine.defaultHandler(new InterfaceC4351m(userStateService) { // from class: io.getstream.chat.android.client.clientstate.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UserStateService f73783x;

            {
                this.f73783x = userStateService;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        UserState userState = (UserState) obj;
                        UserStateService.fsm$lambda$16$lambda$5(this.f73783x, userState, (UserStateService.UserStateEvent) obj2);
                        return userState;
                    default:
                        return UserStateService.fsm$lambda$16$lambda$9$lambda$8(this.f73783x, (UserState.NotSet) obj, (UserStateService.UserStateEvent.UnsetUser) obj2);
                }
            }
        });
        FiniteStateMachine.initialState(UserState.NotSet.INSTANCE);
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions = FiniteStateMachine.getStateFunctions();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(UserState.NotSet.class);
        StateHandlerBuilder stateHandlerBuilder = new StateHandlerBuilder();
        C18719a c18719a = new C18719a(1);
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers = stateHandlerBuilder.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(UserStateEvent.ConnectUser.class);
        AbstractC22681m0.m65774e(2, c18719a);
        eventHandlers.put(orCreateKotlinClass2, c18719a);
        C18719a c18719a2 = new C18719a(2);
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers2 = stateHandlerBuilder.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(UserStateEvent.ConnectAnonymous.class);
        AbstractC22681m0.m65774e(2, c18719a2);
        eventHandlers2.put(orCreateKotlinClass3, c18719a2);
        final int i14 = 1;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m(userStateService) { // from class: io.getstream.chat.android.client.clientstate.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UserStateService f73783x;

            {
                this.f73783x = userStateService;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        UserState userState = (UserState) obj;
                        UserStateService.fsm$lambda$16$lambda$5(this.f73783x, userState, (UserStateService.UserStateEvent) obj2);
                        return userState;
                    default:
                        return UserStateService.fsm$lambda$16$lambda$9$lambda$8(this.f73783x, (UserState.NotSet) obj, (UserStateService.UserStateEvent.UnsetUser) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers3 = stateHandlerBuilder.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(UserStateEvent.UnsetUser.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m);
        eventHandlers3.put(orCreateKotlinClass4, interfaceC4351m);
        stateFunctions.put(orCreateKotlinClass, stateHandlerBuilder.get());
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions2 = FiniteStateMachine.getStateFunctions();
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(UserState.UserSet.class);
        StateHandlerBuilder stateHandlerBuilder2 = new StateHandlerBuilder();
        C18719a c18719a3 = new C18719a(3);
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers4 = stateHandlerBuilder2.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(UserStateEvent.UserUpdated.class);
        AbstractC22681m0.m65774e(2, c18719a3);
        eventHandlers4.put(orCreateKotlinClass6, c18719a3);
        C18719a c18719a4 = new C18719a(4);
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers5 = stateHandlerBuilder2.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(UserStateEvent.UnsetUser.class);
        AbstractC22681m0.m65774e(2, c18719a4);
        eventHandlers5.put(orCreateKotlinClass7, c18719a4);
        stateFunctions2.put(orCreateKotlinClass5, stateHandlerBuilder2.get());
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions3 = FiniteStateMachine.getStateFunctions();
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(UserState.AnonymousUserSet.class);
        StateHandlerBuilder stateHandlerBuilder3 = new StateHandlerBuilder();
        C18719a c18719a5 = new C18719a(5);
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers6 = stateHandlerBuilder3.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(UserStateEvent.UserUpdated.class);
        AbstractC22681m0.m65774e(2, c18719a5);
        eventHandlers6.put(orCreateKotlinClass9, c18719a5);
        C18719a c18719a6 = new C18719a(6);
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers7 = stateHandlerBuilder3.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(UserStateEvent.UnsetUser.class);
        AbstractC22681m0.m65774e(2, c18719a6);
        eventHandlers7.put(orCreateKotlinClass10, c18719a6);
        stateFunctions3.put(orCreateKotlinClass8, stateHandlerBuilder3.get());
        return C23454a0.f92919a;
    }

    private static final UserState fsm$lambda$16$lambda$12$lambda$10(UserState.UserSet onEvent, UserStateEvent.UserUpdated event) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(event, "event");
        return new UserState.UserSet(event.getUser());
    }

    private static final UserState fsm$lambda$16$lambda$12$lambda$11(UserState.UserSet onEvent, UserStateEvent.UnsetUser it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return UserState.NotSet.INSTANCE;
    }

    private static final UserState fsm$lambda$16$lambda$15$lambda$13(UserState.AnonymousUserSet onEvent, UserStateEvent.UserUpdated event) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(event, "event");
        return new UserState.AnonymousUserSet(event.getUser());
    }

    private static final UserState fsm$lambda$16$lambda$15$lambda$14(UserState.AnonymousUserSet onEvent, UserStateEvent.UnsetUser it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return UserState.NotSet.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserState fsm$lambda$16$lambda$5(UserStateService userStateService, UserState state, UserStateEvent event) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(event, "event");
        C2345k logger = userStateService.getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "Can't handle " + event + " while being in state " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(state.getClass()).getSimpleName(), null);
        }
        return state;
    }

    private static final UserState fsm$lambda$16$lambda$9$lambda$6(UserState.NotSet onEvent, UserStateEvent.ConnectUser event) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(event, "event");
        return new UserState.UserSet(event.getUser());
    }

    private static final UserState fsm$lambda$16$lambda$9$lambda$7(UserState.NotSet onEvent, UserStateEvent.ConnectAnonymous event) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(event, "event");
        return new UserState.AnonymousUserSet(event.getUser());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserState fsm$lambda$16$lambda$9$lambda$8(UserStateService userStateService, UserState.NotSet onEvent, UserStateEvent.UnsetUser it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return userStateService.getState$stream_chat_android_client_release();
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ UserState.NotSet m54646h(UserState.UserSet userSet, UserStateEvent.UnsetUser unsetUser) {
        return (UserState.NotSet) fsm$lambda$16$lambda$12$lambda$11(userSet, unsetUser);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ UserState.AnonymousUserSet m54647i(UserState.NotSet notSet, UserStateEvent.ConnectAnonymous connectAnonymous) {
        return (UserState.AnonymousUserSet) fsm$lambda$16$lambda$9$lambda$7(notSet, connectAnonymous);
    }

    public final UserState getState$stream_chat_android_client_release() {
        return this.fsm.getState();
    }

    public final InterfaceC13037f2 getStateFlow$stream_chat_android_client_release() {
        return this.fsm.getStateFlow();
    }

    public final Object onLogout(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onLogout] no args", null);
        }
        Object objSendEvent = this.fsm.sendEvent(UserStateEvent.UnsetUser.INSTANCE, interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onSetUser(User user, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11478a.m30857i("[onSetUser] user.id: '", user.getId(), "', isAnonymous: ", z4), null);
        }
        if (z4) {
            Object objSendEvent = this.fsm.sendEvent(new UserStateEvent.ConnectAnonymous(user), interfaceC30057d);
            if (objSendEvent == EnumC31071a.f128113w) {
                return objSendEvent;
            }
        } else {
            Object objSendEvent2 = this.fsm.sendEvent(new UserStateEvent.ConnectUser(user), interfaceC30057d);
            if (objSendEvent2 == EnumC31071a.f128113w) {
                return objSendEvent2;
            }
        }
        return C23454a0.f92919a;
    }

    public final Object onSocketUnrecoverableError(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onSocketUnrecoverableError] no args", null);
        }
        Object objSendEvent = this.fsm.sendEvent(UserStateEvent.UnsetUser.INSTANCE, interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onUserUpdated(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11895b.m31996o("[onUserUpdated] user.id: '", user.getId(), "'"), null);
        }
        Object objSendEvent = this.fsm.sendEvent(new UserStateEvent.UserUpdated(user), interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }
}

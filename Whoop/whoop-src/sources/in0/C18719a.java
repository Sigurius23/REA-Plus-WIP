package in0;

import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.clientstate.UserState;
import io.getstream.chat.android.client.clientstate.UserStateService;
import io.getstream.chat.android.client.notifications.handler.ChatNotification;
import io.getstream.chat.android.client.notifications.handler.NotificationHandlerFactory;
import io.getstream.chat.android.core.internal.fsm.builder.FSMBuilder;
import iu1.C20936a;
import iv0.C20950a;
import ix2.C21024c;
import uf3.C34911a;
import xf3.C38266c;

/* JADX INFO: renamed from: in0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18719a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73538w;

    public /* synthetic */ C18719a(int i13) {
        this.f73538w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f73538w) {
            case 0:
                return C18720b.m54435m((C38266c) obj, (C34911a) obj2);
            case 1:
                return UserStateService.m54644f((UserState.NotSet) obj, (UserStateService.UserStateEvent.ConnectUser) obj2);
            case 2:
                return UserStateService.m54647i((UserState.NotSet) obj, (UserStateService.UserStateEvent.ConnectAnonymous) obj2);
            case 3:
                return UserStateService.m54639a((UserState.UserSet) obj, (UserStateService.UserStateEvent.UserUpdated) obj2);
            case 4:
                return UserStateService.m54646h((UserState.UserSet) obj, (UserStateService.UserStateEvent.UnsetUser) obj2);
            case 5:
                return UserStateService.m54642d((UserState.AnonymousUserSet) obj, (UserStateService.UserStateEvent.UserUpdated) obj2);
            case 6:
                return UserStateService.m54640b((UserState.AnonymousUserSet) obj, (UserStateService.UserStateEvent.UnsetUser) obj2);
            case 7:
                NotificationCompat.Builder builder = (NotificationCompat.Builder) obj;
                NotificationHandlerFactory.createNotificationHandler$lambda$0(builder, (ChatNotification) obj2);
                return builder;
            case 8:
                FSMBuilder._defaultHandler$lambda$0(obj, obj2);
                return obj;
            case 9:
                return C20936a.m58129j((C38266c) obj, (C34911a) obj2);
            case 10:
                return C20936a.m58130k((C38266c) obj, (C34911a) obj2);
            case 11:
                return C20936a.m58131l((C38266c) obj, (C34911a) obj2);
            case 12:
                return C20936a.m58132m((C38266c) obj, (C34911a) obj2);
            case 13:
                return C20936a.m58133n((C38266c) obj, (C34911a) obj2);
            case 14:
                return C20936a.m58134o((C38266c) obj, (C34911a) obj2);
            case 15:
                return C20936a.m58135p((C38266c) obj, (C34911a) obj2);
            case 16:
                return C20936a.m58136q((C38266c) obj, (C34911a) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C20950a.m58207g((C38266c) obj, (C34911a) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C20950a.m58208h((C38266c) obj, (C34911a) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C20950a.m58209i((C38266c) obj, (C34911a) obj2);
            case 20:
                return C20950a.m58210j((C38266c) obj, (C34911a) obj2);
            case 21:
                return C20950a.m58211k((C38266c) obj, (C34911a) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C21024c.m58640Y((C38266c) obj, (C34911a) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C21024c.m58665l0((C38266c) obj, (C34911a) obj2);
            case 24:
                return C21024c.m58645b0((C38266c) obj, (C34911a) obj2);
            case 25:
                return C21024c.m58669n0((C38266c) obj, (C34911a) obj2);
            case 26:
                return C21024c.m58671o0((C38266c) obj, (C34911a) obj2);
            case 27:
                return C21024c.m58673p0((C38266c) obj, (C34911a) obj2);
            case 28:
                return C21024c.m58675q0((C38266c) obj, (C34911a) obj2);
            default:
                return C21024c.m58677r0((C38266c) obj, (C34911a) obj2);
        }
    }
}

package io.getstream.chat.android.client.api2.endpoint;

import io.getstream.chat.android.client.api.AuthenticatedApi;
import io.getstream.chat.android.client.api2.model.requests.QueryRemindersRequest;
import io.getstream.chat.android.client.api2.model.requests.ReminderRequest;
import io.getstream.chat.android.client.api2.model.response.CompletableResponse;
import io.getstream.chat.android.client.api2.model.response.QueryRemindersResponse;
import io.getstream.chat.android.client.api2.model.response.ReminderResponse;
import io.getstream.chat.android.client.call.RetrofitCall;
import p715kotlin.Metadata;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37283n;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u000bH'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u000bH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/endpoint/RemindersApi;", "", "queryReminders", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/response/QueryRemindersResponse;", "body", "Lio/getstream/chat/android/client/api2/model/requests/QueryRemindersRequest;", "createReminder", "Lio/getstream/chat/android/client/api2/model/response/ReminderResponse;", "messageId", "", "Lio/getstream/chat/android/client/api2/model/requests/ReminderRequest;", "updateReminder", "deleteReminder", "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@AuthenticatedApi
public interface RemindersApi {
    @InterfaceC37284o("/messages/{id}/reminders")
    RetrofitCall<ReminderResponse> createReminder(@InterfaceC37288s("id") String messageId, @InterfaceC37270a ReminderRequest body);

    @InterfaceC37271b("/messages/{id}/reminders")
    RetrofitCall<CompletableResponse> deleteReminder(@InterfaceC37288s("id") String messageId);

    @InterfaceC37284o("/reminders/query")
    RetrofitCall<QueryRemindersResponse> queryReminders(@InterfaceC37270a QueryRemindersRequest body);

    @InterfaceC37283n("/messages/{id}/reminders")
    RetrofitCall<ReminderResponse> updateReminder(@InterfaceC37288s("id") String messageId, @InterfaceC37270a ReminderRequest body);
}

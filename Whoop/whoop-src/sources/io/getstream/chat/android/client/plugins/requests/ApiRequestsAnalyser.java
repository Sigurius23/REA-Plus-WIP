package io.getstream.chat.android.client.plugins.requests;

import java.util.Map;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;", "", "", "requestName", "", "data", "Ll83/a0;", "registerRequest", "(Ljava/lang/String;Ljava/util/Map;)V", "dumpRequestByName", "(Ljava/lang/String;)Ljava/lang/String;", "dumpAll", "()Ljava/lang/String;", "clearAll", "()V", "queryText", "clearRequestContaining", "(Ljava/lang/String;)V", "", "countRequestContaining", "(Ljava/lang/String;)I", "countAllRequests", "()I", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ApiRequestsAnalyser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;", "", "<init>", "()V", "instance", "Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;", "get", "isInitialized", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static ApiRequestsAnalyser instance;

        private Companion() {
        }

        public final ApiRequestsAnalyser get() {
            ApiRequestsAnalyser apiRequestsAnalyser = instance;
            if (apiRequestsAnalyser != null) {
                return apiRequestsAnalyser;
            }
            ApiRequestsDumper apiRequestsDumper = new ApiRequestsDumper(null, 1, null);
            instance = apiRequestsDumper;
            return apiRequestsDumper;
        }

        public final boolean isInitialized() {
            return instance != null;
        }
    }

    void clearAll();

    void clearRequestContaining(String queryText);

    int countAllRequests();

    int countRequestContaining(String requestName);

    String dumpAll();

    String dumpRequestByName(String requestName);

    void registerRequest(String requestName, Map<String, String> data);
}

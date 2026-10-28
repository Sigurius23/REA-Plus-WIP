package io.getstream.chat.android.p226ui.common.feature.channel.info;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction;", "", "QueryChanged", "UserClick", "LoadMore", "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$LoadMore;", "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$QueryChanged;", "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$UserClick;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface AddMembersViewAction {

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$LoadMore;", "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class LoadMore implements AddMembersViewAction {
        public static final int $stable = 0;
        public static final LoadMore INSTANCE = new LoadMore();

        private LoadMore() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof LoadMore);
        }

        public final int hashCode() {
            return 1132084599;
        }

        public final String toString() {
            return "LoadMore";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$QueryChanged;", "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction;", "query", "", "<init>", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class QueryChanged implements AddMembersViewAction {
        public static final int $stable = 0;
        private final String query;

        public QueryChanged(String query) {
            AbstractC22676k.m65750j(query, "query");
            this.query = query;
        }

        public static /* synthetic */ QueryChanged copy$default(QueryChanged queryChanged, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = queryChanged.query;
            }
            return queryChanged.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        public final QueryChanged copy(String query) {
            AbstractC22676k.m65750j(query, "query");
            return new QueryChanged(query);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QueryChanged) && AbstractC22676k.m65745e(this.query, ((QueryChanged) other).query);
        }

        public final String getQuery() {
            return this.query;
        }

        public final int hashCode() {
            return this.query.hashCode();
        }

        public final String toString() {
            return AbstractC11895b.m31996o("QueryChanged(query=", this.query, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction$UserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Lio/getstream/chat/android/models/User;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UserClick implements AddMembersViewAction {
        public static final int $stable = 0;
        private final User user;

        public UserClick(User user) {
            AbstractC22676k.m65750j(user, "user");
            this.user = user;
        }

        public static /* synthetic */ UserClick copy$default(UserClick userClick, User user, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                user = userClick.user;
            }
            return userClick.copy(user);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        public final UserClick copy(User user) {
            AbstractC22676k.m65750j(user, "user");
            return new UserClick(user);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserClick) && AbstractC22676k.m65745e(this.user, ((UserClick) other).user);
        }

        public final User getUser() {
            return this.user;
        }

        public final int hashCode() {
            return this.user.hashCode();
        }

        public final String toString() {
            return "UserClick(user=" + this.user + ")";
        }
    }
}

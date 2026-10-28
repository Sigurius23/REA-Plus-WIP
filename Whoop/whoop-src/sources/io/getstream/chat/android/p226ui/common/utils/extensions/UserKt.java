package io.getstream.chat.android.p226ui.common.utils.extensions;

import android.content.Context;
import android.text.format.DateUtils;
import io.getstream.chat.android.models.User;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001\u001a0\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0012\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m65681d2 = {"initials", "", "Lio/getstream/chat/android/models/User;", "getInitials", "(Lio/getstream/chat/android/models/User;)Ljava/lang/String;", "getUserByNameOrId", "", "nameOrId", "getLastSeenText", "context", "Landroid/content/Context;", "userOnlineResId", "", "userLastSeenJustNowResId", "userLastSeenResId", "isInLastMinute", "", "Ljava/util/Date;", "ONE_MINUTE_IN_MILLIS", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserKt {
    private static final int ONE_MINUTE_IN_MILLIS = 60000;

    public static final String getInitials(User user) {
        AbstractC22676k.m65750j(user, "<this>");
        return StringKt.initials(user.getName());
    }

    public static final String getLastSeenText(User user, Context context, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(user, "<this>");
        AbstractC22676k.m65750j(context, "context");
        if (user.getOnline()) {
            String string = context.getString(i13);
            AbstractC22676k.m65749i(string, "getString(...)");
            return string;
        }
        Date lastActive = user.getLastActive();
        if (lastActive == null && (lastActive = user.getUpdatedAt()) == null) {
            lastActive = user.getCreatedAt();
        }
        if (lastActive == null) {
            return "";
        }
        String string2 = isInLastMinute(lastActive) ? context.getString(i14) : context.getString(i15, DateUtils.getRelativeTimeSpanString(lastActive.getTime()).toString());
        return string2 == null ? "" : string2;
    }

    public static final User getUserByNameOrId(List<User> list, String nameOrId) {
        Object obj;
        Object next;
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(nameOrId, "nameOrId");
        List<User> list2 = list;
        Iterator<T> it = list2.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((User) next).getName(), nameOrId));
        User user = (User) next;
        if (user != null) {
            return user;
        }
        for (Object obj2 : list2) {
            if (AbstractC22676k.m65745e(((User) obj2).getId(), nameOrId)) {
                obj = obj2;
                break;
            }
        }
        return (User) obj;
    }

    private static final boolean isInLastMinute(Date date) {
        return new Date().getTime() - ((long) 60000) < date.getTime();
    }
}

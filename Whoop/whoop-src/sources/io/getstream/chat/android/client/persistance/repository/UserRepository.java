package io.getstream.chat.android.client.persistance.repository;

import com.whoop.service.network.model.UserState;
import ec3.InterfaceC13037f2;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import java.util.Collection;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u00150\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "", "", "Lio/getstream/chat/android/models/User;", "users", "Ll83/a0;", "insertUsers", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", UserState.Sources.USER, "insertUser", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "insertCurrentUser", "", "userId", "selectUser", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "ids", "selectUsers", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lec3/f2;", "", "observeLatestUsers", "()Lec3/f2;", "clear", "(Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface UserRepository {
    Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertCurrentUser(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertUser(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertUsers(Collection<User> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    InterfaceC13037f2 observeLatestUsers();

    Object selectUser(String str, InterfaceC30057d<? super User> interfaceC30057d);

    Object selectUsers(List<String> list, InterfaceC30057d<? super List<User>> interfaceC30057d);
}

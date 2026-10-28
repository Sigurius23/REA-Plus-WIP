package io.getstream.chat.android.client.persistance.repository.noop;

import com.whoop.service.network.model.UserState;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import io.getstream.chat.android.client.persistance.repository.UserRepository;
import io.getstream.chat.android.models.User;
import java.util.Collection;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u00170\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/noop/NoOpUserRepository;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "<init>", "()V", "", "Lio/getstream/chat/android/models/User;", "users", "Ll83/a0;", "insertUsers", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", UserState.Sources.USER, "insertUser", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "insertCurrentUser", "", "userId", "selectUser", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "ids", "selectUsers", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lec3/f2;", "", "observeLatestUsers", "()Lec3/f2;", "clear", "(Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpUserRepository implements UserRepository {
    public static final NoOpUserRepository INSTANCE = new NoOpUserRepository();

    private NoOpUserRepository() {
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object insertCurrentUser(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object insertUser(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object insertUsers(Collection<User> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final InterfaceC13037f2 observeLatestUsers() {
        return AbstractC13091v.m36593c(C25272z.f99163w);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object selectUser(String str, InterfaceC30057d<? super User> interfaceC30057d) {
        return null;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object selectUsers(List<String> list, InterfaceC30057d<? super List<User>> interfaceC30057d) {
        return C25271y.f99162w;
    }
}

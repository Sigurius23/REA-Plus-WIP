package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\ba\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H§@¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;", "", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;", "users", "Ll83/a0;", "insertMany", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "userEntity", "insert", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Lq83/d;)Ljava/lang/Object;", "", "ids", "select", "id", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", MapboxMap.QFE_LIMIT, MapboxMap.QFE_OFFSET, "selectAllUser", "(II)Ljava/util/List;", "searchString", "selectUsersLikeName", "(Ljava/lang/String;II)Ljava/util/List;", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface UserDao {
    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insert(UserEntity userEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertMany(List<UserEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object select(String str, InterfaceC30057d<? super UserEntity> interfaceC30057d);

    Object select(List<String> list, InterfaceC30057d<? super List<UserEntity>> interfaceC30057d);

    List<UserEntity> selectAllUser(int limit, int offset);

    List<UserEntity> selectUsersLikeName(String searchString, int limit, int offset);
}

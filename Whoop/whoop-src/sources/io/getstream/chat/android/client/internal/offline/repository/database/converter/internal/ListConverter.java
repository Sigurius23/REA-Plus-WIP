package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import com.squareup.moshi.JsonAdapter;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal.ChannelUserReadEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadParticipantEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserMuteEntity;
import j93.C21462d0;
import java.util.List;
import m83.C25271y;
import p441qx.C30722l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u001a\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006H\u0007J\u001a\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H\u0007J\u001a\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "", "<init>", "()V", "stringListAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "channelUserReadListAdapter", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;", "threadParticipantListAdapter", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;", "userMuteListAdapter", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;", "toStringList", "data", "fromStringList", "strings", "toReadList", "fromReadList", "entities", "toThreadParticipantList", "fromThreadParticipantList", "toUserMuteList", "fromUserMuteList", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ListConverter {
    private final JsonAdapter<List<ChannelUserReadEntity>> channelUserReadListAdapter;
    private final JsonAdapter<List<String>> stringListAdapter;
    private final JsonAdapter<List<ThreadParticipantEntity>> threadParticipantListAdapter;
    private final JsonAdapter<List<UserMuteEntity>> userMuteListAdapter;

    public ListConverter() {
        C30722l0 moshi = ConverterMoshiInstanceKt.getMoshi();
        C21462d0 c21462d0 = C21462d0.f82423c;
        this.stringListAdapter = AbstractC34924m.m110152m(moshi, AbstractC22671h0.m65692e(List.class, AbstractC37978j.m121626I(AbstractC22671h0.m65691d(String.class))));
        this.channelUserReadListAdapter = AbstractC34924m.m110152m(ConverterMoshiInstanceKt.getMoshi(), AbstractC22671h0.m65692e(List.class, AbstractC37978j.m121626I(AbstractC22671h0.m65691d(ChannelUserReadEntity.class))));
        this.threadParticipantListAdapter = AbstractC34924m.m110152m(ConverterMoshiInstanceKt.getMoshi(), AbstractC22671h0.m65692e(List.class, AbstractC37978j.m121626I(AbstractC22671h0.m65691d(ThreadParticipantEntity.class))));
        this.userMuteListAdapter = AbstractC34924m.m110152m(ConverterMoshiInstanceKt.getMoshi(), AbstractC22671h0.m65692e(List.class, AbstractC37978j.m121626I(AbstractC22671h0.m65691d(UserMuteEntity.class))));
    }

    public final String fromReadList(List<ChannelUserReadEntity> entities) {
        return this.channelUserReadListAdapter.toJson(entities);
    }

    public final String fromStringList(List<String> strings) {
        return this.stringListAdapter.toJson(strings);
    }

    public final String fromThreadParticipantList(List<ThreadParticipantEntity> entities) {
        return this.threadParticipantListAdapter.toJson(entities);
    }

    public final String fromUserMuteList(List<UserMuteEntity> entities) {
        return this.userMuteListAdapter.toJson(entities);
    }

    public final List<ChannelUserReadEntity> toReadList(String data) {
        return (data == null || data.length() == 0 || AbstractC22676k.m65745e(data, "null")) ? C25271y.f99162w : this.channelUserReadListAdapter.fromJson(data);
    }

    public final List<String> toStringList(String data) {
        return (data == null || data.length() == 0 || AbstractC22676k.m65745e(data, "null")) ? C25271y.f99162w : this.stringListAdapter.fromJson(data);
    }

    public final List<ThreadParticipantEntity> toThreadParticipantList(String data) {
        return (data == null || data.length() == 0 || AbstractC22676k.m65745e(data, "null")) ? C25271y.f99162w : this.threadParticipantListAdapter.fromJson(data);
    }

    public final List<UserMuteEntity> toUserMuteList(String data) {
        return (data == null || data.length() == 0 || AbstractC22676k.m65745e(data, "null")) ? C25271y.f99162w : this.userMuteListAdapter.fromJson(data);
    }
}

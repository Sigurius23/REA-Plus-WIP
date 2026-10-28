package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import com.squareup.moshi.JsonAdapter;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal.MemberEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal.ChannelUserReadEntity;
import j93.C21462d0;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.C25272z;
import p441qx.C30722l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u0007J \u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0007J \u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006H\u0007J \u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0007J \u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0007J \u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006H\u0007J \u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0007J \u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007R&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u00060\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u00060\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u00060\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;", "", "<init>", "()V", "stringMapAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "getStringMapAdapter$annotations", "intMapAdapter", "", "getIntMapAdapter$annotations", "channelUserReadMapAdapter", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;", "getChannelUserReadMapAdapter$annotations", "memberEntityMapAdapter", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;", "getMemberEntityMapAdapter$annotations", "readMapToString", "someObjects", "stringToReadMap", "data", "memberMapToString", "stringToMemberMap", "stringToMap", "mapToString", "stringToStringMap", "stringMapToString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MapConverter {
    private final JsonAdapter<Map<String, ChannelUserReadEntity>> channelUserReadMapAdapter;
    private final JsonAdapter<Map<String, Integer>> intMapAdapter;
    private final JsonAdapter<Map<String, MemberEntity>> memberEntityMapAdapter;
    private final JsonAdapter<Map<String, String>> stringMapAdapter;

    public MapConverter() {
        C30722l0 moshi = ConverterMoshiInstanceKt.getMoshi();
        C21462d0 c21462d0 = C21462d0.f82423c;
        this.stringMapAdapter = AbstractC34924m.m110152m(moshi, AbstractC22671h0.m65690c(AbstractC37978j.m121626I(AbstractC22671h0.m65691d(String.class)), AbstractC37978j.m121626I(AbstractC22671h0.m65691d(String.class))));
        this.intMapAdapter = AbstractC34924m.m110152m(ConverterMoshiInstanceKt.getMoshi(), AbstractC22671h0.m65690c(AbstractC37978j.m121626I(AbstractC22671h0.m65691d(String.class)), AbstractC37978j.m121626I(AbstractC22671h0.m65691d(Integer.TYPE))));
        this.channelUserReadMapAdapter = AbstractC34924m.m110152m(ConverterMoshiInstanceKt.getMoshi(), AbstractC22671h0.m65690c(AbstractC37978j.m121626I(AbstractC22671h0.m65691d(String.class)), AbstractC37978j.m121626I(AbstractC22671h0.m65691d(ChannelUserReadEntity.class))));
        this.memberEntityMapAdapter = AbstractC34924m.m110152m(ConverterMoshiInstanceKt.getMoshi(), AbstractC22671h0.m65690c(AbstractC37978j.m121626I(AbstractC22671h0.m65691d(String.class)), AbstractC37978j.m121626I(AbstractC22671h0.m65691d(MemberEntity.class))));
    }

    private static /* synthetic */ void getChannelUserReadMapAdapter$annotations() {
    }

    private static /* synthetic */ void getIntMapAdapter$annotations() {
    }

    private static /* synthetic */ void getMemberEntityMapAdapter$annotations() {
    }

    private static /* synthetic */ void getStringMapAdapter$annotations() {
    }

    public final String mapToString(Map<String, Integer> someObjects) {
        return this.intMapAdapter.toJson(someObjects);
    }

    public final String memberMapToString(Map<String, MemberEntity> someObjects) {
        return this.memberEntityMapAdapter.toJson(someObjects);
    }

    public final String readMapToString(Map<String, ChannelUserReadEntity> someObjects) {
        return this.channelUserReadMapAdapter.toJson(someObjects);
    }

    public final String stringMapToString(Map<String, String> someObjects) {
        return this.stringMapAdapter.toJson(someObjects);
    }

    public final Map<String, Integer> stringToMap(String data) {
        return (data == null || data.length() == 0 || AbstractC22676k.m65745e(data, "null")) ? new LinkedHashMap() : this.intMapAdapter.fromJson(data);
    }

    public final Map<String, MemberEntity> stringToMemberMap(String data) {
        return (data == null || data.length() == 0 || AbstractC22676k.m65745e(data, "null")) ? C25272z.f99163w : this.memberEntityMapAdapter.fromJson(data);
    }

    public final Map<String, ChannelUserReadEntity> stringToReadMap(String data) {
        return (data == null || data.length() == 0 || AbstractC22676k.m65745e(data, "null")) ? new LinkedHashMap() : this.channelUserReadMapAdapter.fromJson(data);
    }

    public final Map<String, String> stringToStringMap(String data) {
        return (data == null || data.length() == 0 || AbstractC22676k.m65745e(data, "null")) ? new LinkedHashMap() : this.stringMapAdapter.fromJson(data);
    }
}

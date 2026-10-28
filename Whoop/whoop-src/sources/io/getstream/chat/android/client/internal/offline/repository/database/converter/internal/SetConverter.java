package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import com.squareup.moshi.JsonAdapter;
import j93.C21462d0;
import java.util.Set;
import m83.C25235a0;
import p441qx.C30722l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;", "", "<init>", "()V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "getAdapter$annotations", "stringToSortedSet", "data", "sortedSetToString", "someObjects", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SetConverter {
    private final JsonAdapter<Set<String>> adapter;

    public SetConverter() {
        C30722l0 moshi = ConverterMoshiInstanceKt.getMoshi();
        C21462d0 c21462d0 = C21462d0.f82423c;
        this.adapter = AbstractC34924m.m110152m(moshi, AbstractC22671h0.m65692e(Set.class, AbstractC37978j.m121626I(AbstractC22671h0.m65691d(String.class))));
    }

    private static /* synthetic */ void getAdapter$annotations() {
    }

    public final String sortedSetToString(Set<String> someObjects) {
        return this.adapter.toJson(someObjects);
    }

    public final Set<String> stringToSortedSet(String data) {
        Set<String> setFromJson;
        C25235a0 c25235a0 = C25235a0.f99113w;
        return (data == null || data.length() == 0 || AbstractC22676k.m65745e(data, "null") || (setFromJson = this.adapter.fromJson(data)) == null) ? c25235a0 : setFromJson;
    }
}

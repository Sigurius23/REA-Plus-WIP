package com.whoop.navigation.json;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.whoop.navigation.AppScreen;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Set;
import m83.C25235a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J9\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/navigation/json/AppScreenTypeAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "", "", "additionalScreens", "<init>", "(Ljava/util/Set;)V", "", "T", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/reflect/TypeToken;", "type", "Lcom/google/gson/TypeAdapter;", "create", "(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/util/Set;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AppScreenTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Set<String> additionalScreens;

    /* JADX WARN: Multi-variable type inference failed */
    public AppScreenTypeAdapterFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        AbstractC22676k.m65750j(gson, "gson");
        AbstractC22676k.m65750j(type, "type");
        if (AppScreen.class.isAssignableFrom(type.getRawType())) {
            return new AppScreenTypeAdapter(this.additionalScreens);
        }
        return null;
    }

    public AppScreenTypeAdapterFactory(Set<String> additionalScreens) {
        AbstractC22676k.m65750j(additionalScreens, "additionalScreens");
        this.additionalScreens = additionalScreens;
    }

    public /* synthetic */ AppScreenTypeAdapterFactory(Set set, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25235a0.f99113w : set);
    }
}

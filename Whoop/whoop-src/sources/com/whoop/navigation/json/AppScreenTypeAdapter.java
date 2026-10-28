package com.whoop.navigation.json;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.whoop.navigation.AppScreen;
import java.io.IOException;
import java.util.Set;
import m83.C25235a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/navigation/json/AppScreenTypeAdapter;", "T", "Lcom/google/gson/TypeAdapter;", "", "", "additionalScreens", "<init>", "(Ljava/util/Set;)V", "Lcom/google/gson/stream/JsonWriter;", "out", "value", "Ll83/a0;", "write", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V", "Lcom/google/gson/stream/JsonReader;", "in", "read", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;", "a", "Ljava/util/Set;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AppScreenTypeAdapter<T> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Set<String> additionalScreens;

    /* JADX WARN: Multi-variable type inference failed */
    public AppScreenTypeAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public T read2(JsonReader in3) throws IOException {
        AbstractC22676k.m65750j(in3, "in");
        if (in3.peek() == JsonToken.NULL) {
            in3.nextNull();
            return null;
        }
        AppScreen.Companion companion = AppScreen.INSTANCE;
        String strNextString = in3.nextString();
        AbstractC22676k.m65749i(strNextString, "nextString(...)");
        return (T) companion.m23031a(strNextString, this.additionalScreens);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter out, T value) throws IOException {
        AbstractC22676k.m65750j(out, "out");
        if (value == 0) {
            out.nullValue();
        } else {
            if (!(value instanceof AppScreen)) {
                throw new IllegalArgumentException("Only works with AppScreen");
            }
            out.value(((AppScreen) value).getName());
        }
    }

    public AppScreenTypeAdapter(Set<String> additionalScreens) {
        AbstractC22676k.m65750j(additionalScreens, "additionalScreens");
        this.additionalScreens = additionalScreens;
    }

    public /* synthetic */ AppScreenTypeAdapter(Set set, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25235a0.f99113w : set);
    }
}

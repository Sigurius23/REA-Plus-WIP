package com.whoop.data.local.room.entity.converter;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001e\u0010\b\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005H\u0007¨\u0006\n"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/converter/AvatarUrlConverter;", "", "<init>", "()V", "stringToList", "", "", "data", "listToString", "list", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AvatarUrlConverter {
    public final String listToString(List<? extends List<String>> list) {
        String json = DefaultImagesConvertersKt.gson.toJson(list);
        AbstractC22676k.m65749i(json, "toJson(...)");
        return json;
    }

    public final List<List<String>> stringToList(String data) {
        if (data != null) {
            List<List<String>> list = (List) DefaultImagesConvertersKt.gson.fromJson(data, new TypeToken<List<? extends List<? extends String>>>() { // from class: com.whoop.data.local.room.entity.converter.AvatarUrlConverter$stringToList$listType$1
            }.getType());
            return list == null ? new ArrayList() : list;
        }
        List<List<String>> list2 = Collections.EMPTY_LIST;
        AbstractC22676k.m65749i(list2, "emptyList(...)");
        return list2;
    }
}

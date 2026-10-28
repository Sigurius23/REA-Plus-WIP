package com.whoop.labrador.data.dto;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import or2.C28169i0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;", "", "<init>", "()V", "", "", "values", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "string", "b", "(Ljava/lang/String;)Ljava/util/List;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FilteredLabradorDataConverter {
    /* JADX INFO: renamed from: a */
    public final String m22423a(List<? extends List<Integer>> values) {
        AbstractC22676k.m65750j(values, "values");
        String json = C28169i0.f113888a.m85279g().toJson(values);
        AbstractC22676k.m65749i(json, "toJson(...)");
        return json;
    }

    /* JADX INFO: renamed from: b */
    public final List<List<Integer>> m22424b(String string) {
        AbstractC22676k.m65750j(string, "string");
        List<List<Integer>> list = (List) C28169i0.f113888a.m85279g().fromJson(string, new TypeToken<List<? extends List<? extends Integer>>>() { // from class: com.whoop.labrador.data.dto.FilteredLabradorDataConverter$toFilteredLabradorData$listType$1
        }.getType());
        return list == null ? new ArrayList() : list;
    }
}

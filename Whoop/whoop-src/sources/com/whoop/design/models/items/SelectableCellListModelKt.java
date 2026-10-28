package com.whoop.design.models.items;

import com.whoop.design.models.SearchFilterableModel;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0007H\u0002¨\u0006\b"}, m65681d2 = {"matchesSearch", "", "Lcom/whoop/design/models/items/SelectableCellModel;", "query", "", "toSelectedCellIdsOrNull", "", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SelectableCellListModelKt {
    public static final boolean matchesSearch(SelectableCellModel selectableCellModel, String str) {
        AbstractC22676k.m65750j(selectableCellModel, "<this>");
        if (str != null && str.length() != 0) {
            SearchFilterableModel.Companion companion = SearchFilterableModel.INSTANCE;
            if (!companion.matchesQuery(str, selectableCellModel.getSearchKeys()) && !companion.matchesQuery(str, AbstractC37056f.m118958J(selectableCellModel.getTitle()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    public static final Set<String> toSelectedCellIdsOrNull(Object obj) {
        String content;
        JsonArray jsonArray = obj instanceof JsonArray ? (JsonArray) obj : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : jsonArray) {
            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
            if (jsonPrimitive == null) {
                content = null;
            } else {
                if (!jsonPrimitive.isString()) {
                    jsonPrimitive = null;
                }
                if (jsonPrimitive != null) {
                    content = jsonPrimitive.getContent();
                } else {
                    content = null;
                }
            }
            if (content != null) {
                arrayList.add(content);
            }
        }
        return AbstractC25265s.m74103I1(arrayList);
    }
}

package com.whoop.design.models.items;

import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u82.AbstractC34647h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\u0005"}, m65681d2 = {"matchesStateValue", "", "Lkotlinx/serialization/json/JsonElement;", "stored", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class OptionCommitPanelModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean matchesStateValue(JsonElement jsonElement, Object obj) {
        return AbstractC22676k.m65745e(obj, AbstractC34647h.m109490e(jsonElement, false, 1, null)) || AbstractC22676k.m65745e(obj, AbstractC34647h.m109489d(jsonElement, true));
    }
}

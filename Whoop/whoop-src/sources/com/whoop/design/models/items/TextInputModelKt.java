package com.whoop.design.models.items;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0003"}, m65681d2 = {"toStateText", "", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TextInputModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toStateText(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj.toString();
        }
        return null;
    }
}

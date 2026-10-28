package com.whoop.design.models;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"unwrap", "Lcom/whoop/design/models/DesignSystemModel;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DesignSystemModelKt {
    public static final DesignSystemModel unwrap(DesignSystemModel designSystemModel) {
        AbstractC22676k.m65750j(designSystemModel, "<this>");
        return designSystemModel instanceof DesignModelWrapper ? ((DesignModelWrapper) designSystemModel).getModel() : designSystemModel;
    }
}

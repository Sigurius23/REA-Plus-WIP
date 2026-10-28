package com.whoop.design.reducer.mapper;

import j93.InterfaceC21461d;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/reducer/mapper/MissingModelMappingException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "Lj93/d;", "modelClass", "<init>", "(Lj93/d;)V", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MissingModelMappingException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingModelMappingException(InterfaceC21461d modelClass) {
        super(AbstractC11266d.m30461o("No item for ", modelClass.getSimpleName()));
        AbstractC22676k.m65750j(modelClass, "modelClass");
    }
}

package io.ktor.serialization.gson;

import bc3.InterfaceC3070x;
import j93.InterfaceC21461d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, m65681d2 = {"Lio/ktor/serialization/gson/ExcludedTypeGsonException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lbc3/x;", "ktor-serialization-gson"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ExcludedTypeGsonException extends Exception implements InterfaceC3070x {

    /* JADX INFO: renamed from: w */
    public final InterfaceC21461d f74976w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExcludedTypeGsonException(InterfaceC21461d type) {
        super("Type " + ((KClassImpl) type).getJClass().getName() + " is excluded so couldn't be used in receive");
        AbstractC22676k.m65750j(type, "type");
        this.f74976w = type;
    }

    @Override // bc3.InterfaceC3070x
    /* JADX INFO: renamed from: a */
    public final Throwable mo8826a() {
        ExcludedTypeGsonException excludedTypeGsonException = new ExcludedTypeGsonException(this.f74976w);
        excludedTypeGsonException.initCause(this);
        return excludedTypeGsonException;
    }
}

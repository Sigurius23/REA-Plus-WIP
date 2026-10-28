package com.whoop.service.rearchitect;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.AbstractC32962f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/rearchitect/IllegalStateTransitionException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lst0/f;", "oldState", "newState", "<init>", "(Lst0/f;Lst0/f;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class IllegalStateTransitionException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalStateTransitionException(AbstractC32962f oldState, AbstractC32962f newState) {
        super("Illegal connection state transition: " + oldState + " to " + newState);
        AbstractC22676k.m65750j(oldState, "oldState");
        AbstractC22676k.m65750j(newState, "newState");
    }
}

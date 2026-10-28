package com.amplitude.quickjs.wrapper;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.amplitude.quickjs.wrapper.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4957a implements JSCallFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20286a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f20287b;

    public /* synthetic */ C4957a(Object obj, int i13) {
        this.f20286a = i13;
        this.f20287b = obj;
    }

    @Override // com.amplitude.quickjs.wrapper.JSCallFunction
    public final Object call(Object[] objArr) {
        switch (this.f20286a) {
            case 0:
                return QuickJSContext.lambda$setConsole$0((QuickJSContext.Console) this.f20287b, objArr);
            default:
                Function1 tmp0 = (Function1) this.f20287b;
                AbstractC22676k.m65750j(tmp0, "$tmp0");
                return tmp0.invoke(objArr);
        }
    }
}

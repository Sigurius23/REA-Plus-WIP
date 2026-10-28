package p193hf;

import d93.InterfaceC11820a;
import d93.InterfaceC11823d;
import java.util.Map;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22660c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hf.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C17226c implements InterfaceC11823d, Map.Entry, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public final Function1 f66195E;

    /* JADX INFO: renamed from: F */
    public final Function1 f66196F;

    /* JADX INFO: renamed from: w */
    public final Map.Entry f66197w;

    /* JADX INFO: renamed from: x */
    public final AbstractC22660c f66198x;

    /* JADX INFO: renamed from: y */
    public final Function1 f66199y;

    /* JADX INFO: renamed from: z */
    public final Map.Entry f66200z;

    /* JADX WARN: Multi-variable type inference failed */
    public C17226c(Map.Entry src, Function1 function1, Function1 function2, Function1 function3) {
        AbstractC22676k.m65750j(src, "src");
        this.f66197w = src;
        this.f66198x = (AbstractC22660c) function1;
        this.f66199y = function2;
        this.f66200z = src;
        this.f66195E = function2;
        this.f66196F = function3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.c] */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f66198x.invoke(this.f66197w.getKey());
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f66199y.invoke(this.f66197w.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        return this.f66195E.invoke(this.f66200z.setValue(this.f66196F.invoke(obj)));
    }
}

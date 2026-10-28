package m93;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C25333c0 implements InterfaceC25339g {

    /* JADX INFO: renamed from: a */
    public static final C25333c0 f99351a = new C25333c0();

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: a */
    public final List mo74408a() {
        return C25271y.f99162w;
    }

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: b */
    public final /* bridge */ boolean mo74409b() {
        return false;
    }

    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // m93.InterfaceC25339g
    public final /* bridge */ /* synthetic */ Member getMember() {
        return null;
    }

    @Override // m93.InterfaceC25339g
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        AbstractC22676k.m65749i(TYPE, "TYPE");
        return TYPE;
    }
}

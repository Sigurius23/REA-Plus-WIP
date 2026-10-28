package io.getstream.chat.android.client.socket;

import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: io.getstream.chat.android.client.socket.ChatSocketStateService$sam$kotlinx_coroutines_flow_FlowCollector$0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class C19435xe21bf3bc implements InterfaceC13062m, InterfaceC22666f {
    private final /* synthetic */ InterfaceC4351m function;

    public C19435xe21bf3bc(InterfaceC4351m function) {
        AbstractC22676k.m65750j(function, "function");
        this.function = function;
    }

    @Override // ec3.InterfaceC13062m
    public final /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        return this.function.invoke(obj, interfaceC30057d);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC13062m) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

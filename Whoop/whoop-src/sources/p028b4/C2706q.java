package p028b4;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.p018ui.node.Owner;
import c93.InterfaceC4339a;
import p390p1.C28647o;
import p634y1.InterfaceC39033f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b4.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C2706q extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f10665E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ View f10666F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Context f10667w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f10668x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28647o f10669y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC39033f f10670z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2706q(Context context, Function1 function1, C28647o c28647o, InterfaceC39033f interfaceC39033f, int i13, View view) {
        super(0);
        this.f10667w = context;
        this.f10668x = function1;
        this.f10669y = c28647o;
        this.f10670z = interfaceC39033f;
        this.f10665E = i13;
        this.f10666F = view;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f10666F;
        AbstractC22676k.m65748h(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new C2711v(this.f10667w, this.f10668x, this.f10669y, this.f10670z, this.f10665E, (Owner) callback).getLayoutNode();
    }
}

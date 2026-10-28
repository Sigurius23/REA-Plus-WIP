package p395p6;

import android.content.Context;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import v63.AbstractC35750h;
import y30.C39189d;

/* JADX INFO: renamed from: p6.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C28875e1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116866w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Context f116867x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f116868y;

    public /* synthetic */ C28875e1(Context context, String str, int i13) {
        this.f116866w = i13;
        this.f116867x = context;
        this.f116868y = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f116866w) {
            case 0:
                return AbstractC35750h.m113273b(this.f116867x, this.f116868y);
            case 1:
                C39189d.m124825d(this.f116867x, this.f116868y);
                return C23454a0.f92919a;
            default:
                return AbstractC21598x.m60684i0(this.f116867x, this.f116868y);
        }
    }
}

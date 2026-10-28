package p032bc;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: bc.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C2957k implements InterfaceC2972u {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f11862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f11863b;

    public C2957k(View view, ArrayList arrayList) {
        this.f11862a = view;
        this.f11863b = arrayList;
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: a */
    public final void mo8600a() {
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: b */
    public final void mo8571b(AbstractC2974w abstractC2974w) {
        abstractC2974w.mo8576C(this);
        abstractC2974w.m8646a(this);
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: c */
    public final void mo8572c(AbstractC2974w abstractC2974w) {
        abstractC2974w.mo8576C(this);
        this.f11862a.setVisibility(8);
        ArrayList arrayList = this.f11863b;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((View) arrayList.get(i13)).setVisibility(0);
        }
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: d */
    public final void mo8573d(AbstractC2974w abstractC2974w) {
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: e */
    public final void mo8601e() {
    }
}

package a13;

import java.util.Map;
import m32.C25008d;
import p236j.InterfaceC21063b;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a13.g */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0149g implements InterfaceC21063b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f464w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f465x;

    public /* synthetic */ C0149g(Object obj, int i13) {
        this.f464w = i13;
        this.f465x = obj;
    }

    @Override // p236j.InterfaceC21063b
    /* JADX INFO: renamed from: a */
    public final void mo364a(Object obj) {
        switch (this.f464w) {
            case 0:
                C0151i c0151i = (C0151i) this.f465x;
                if (!((Boolean) obj).booleanValue()) {
                    c0151i.m365a(EnumC0147e.f461y);
                } else {
                    c0151i.m365a(EnumC0147e.f460x);
                }
                break;
            case 1:
                ((Function1) ((InterfaceC28601c1) this.f465x).getValue()).invoke(obj);
                break;
            default:
                C25008d.m73360p((C25008d) this.f465x, (Map) obj);
                break;
        }
    }
}

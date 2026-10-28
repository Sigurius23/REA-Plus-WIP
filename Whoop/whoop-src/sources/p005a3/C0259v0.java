package p005a3;

import java.util.Map;
import p635y2.InterfaceC39130s0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a3.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0259v0 implements InterfaceC39130s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f886c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function1 f887d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Function1 f888e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0262w0 f889f;

    public C0259v0(int i13, int i14, Map map, Function1 function1, Function1 function2, AbstractC0262w0 abstractC0262w0) {
        this.f884a = i13;
        this.f885b = i14;
        this.f886c = map;
        this.f887d = function1;
        this.f888e = function2;
        this.f889f = abstractC0262w0;
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: a */
    public final Map mo776a() {
        return this.f886c;
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: b */
    public final void mo777b() {
        this.f888e.invoke(this.f889f.f899L);
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: c */
    public final Function1 mo778c() {
        return this.f887d;
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getHeight() {
        return this.f885b;
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getWidth() {
        return this.f884a;
    }
}

package yk2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import tk2.C33895m;

/* JADX INFO: renamed from: yk2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C39607g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f170367w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33895m.a f170368x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f170369y;

    public /* synthetic */ C39607g(C33895m.a aVar, Function1 function1, int i13) {
        this.f170367w = i13;
        this.f170368x = aVar;
        this.f170369y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f170367w) {
            case 0:
                return AbstractC39612l.m126515N(this.f170368x, this.f170369y);
            case 1:
                return AbstractC39612l.m126517P(this.f170368x, this.f170369y);
            default:
                return AbstractC39612l.m126518Q(this.f170368x, this.f170369y);
        }
    }
}

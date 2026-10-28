package no0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.InterfaceC23459e;
import lo0.C24575d0;
import lo0.C24578f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: no0.n */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26961n implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107555w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23459e f107556x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f107557y;

    public /* synthetic */ C26961n(Object obj, InterfaceC23459e interfaceC23459e, int i13) {
        this.f107555w = i13;
        this.f107557y = obj;
        this.f107556x = interfaceC23459e;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f107555w) {
            case 0:
                return AbstractC26965p.m80736i((C24578f) this.f107557y, (Function1) this.f107556x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC26948g0.m80495r((Function1) this.f107556x, (String) this.f107557y, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC26958l0.m80638c0((C24575d0) this.f107557y, (InterfaceC4339a) this.f107556x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C26961n(Function1 function1, String str) {
        this.f107555w = 1;
        this.f107556x = function1;
        this.f107557y = str;
    }
}

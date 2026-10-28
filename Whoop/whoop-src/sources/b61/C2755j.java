package b61;

import ad3.InterfaceC0768k;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gt2.AbstractC16205c;
import ht2.AbstractC17633e;
import j93.InterfaceC21461d;
import kotlinx.serialization.json.JsonElement;
import o91.AbstractC27685b;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: b61.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2755j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f10834E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10835w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f10836x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f10837y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10838z;

    public /* synthetic */ C2755j(AbstractC16205c abstractC16205c, Function1 function1, String str, InterfaceC28601c1 interfaceC28601c1) {
        this.f10835w = 1;
        this.f10838z = abstractC16205c;
        this.f10836x = function1;
        this.f10834E = str;
        this.f10837y = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10835w) {
            case 0:
                return AbstractC2756k.m7809z((InterfaceC28601c1) this.f10837y, (InterfaceC28601c1) this.f10838z, (C2757l) this.f10834E, (Function1) this.f10836x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC17633e.m50209Q((AbstractC16205c) this.f10838z, (Function1) this.f10836x, (String) this.f10834E, (InterfaceC28601c1) this.f10837y, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC27685b.m83694d((InterfaceC21461d) this.f10837y, (InterfaceC34116n) this.f10838z, (String) this.f10834E, (InterfaceC31766c) this.f10836x, (InterfaceC0768k) obj, (JsonElement) obj2);
        }
    }

    public /* synthetic */ C2755j(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f10835w = i13;
        this.f10837y = obj;
        this.f10838z = obj2;
        this.f10834E = obj3;
        this.f10836x = obj4;
    }
}

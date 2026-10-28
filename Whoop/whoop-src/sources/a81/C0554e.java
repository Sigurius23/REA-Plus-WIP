package a81;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.startactivity.goals.AbstractC10237a;
import java.util.List;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a81.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0554e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1912w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f1913x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f1914y;

    public /* synthetic */ C0554e(List list, int i13, Function1 function1) {
        this.f1912w = i13;
        this.f1913x = list;
        this.f1914y = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f1912w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC0564o.m1391M(this.f1913x, this.f1914y, composer, iIntValue);
            default:
                return AbstractC10237a.m26005o(this.f1913x, this.f1914y, composer, iIntValue);
        }
    }
}

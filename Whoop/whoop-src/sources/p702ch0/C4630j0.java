package p702ch0;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p734sl0.AbstractC32662q2;
import zg0.C40625h;
import zg0.C40626i;

/* JADX INFO: renamed from: ch0.j0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4630j0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18680w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18681x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f18682y;

    public /* synthetic */ C4630j0(int i13, Object obj, Object obj2) {
        this.f18680w = i13;
        this.f18681x = obj;
        this.f18682y = obj2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18680w) {
            case 0:
                return Function1.m14413V((C40626i) this.f18681x, (Function1) this.f18682y, (String) obj, (Uri) obj2);
            case 1:
                return AbstractC4658w0.m14723t((C40625h) this.f18681x, (Context) this.f18682y, (List) obj, (AbstractC32662q2) obj2);
            case 2:
                return AbstractC4610c1.m14364w((C40626i) this.f18681x, (C4656v0) this.f18682y, (String) obj, (Uri) obj2);
            default:
                return Function0.m14388d((InterfaceC4339a) this.f18681x, (Function3) this.f18682y, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}

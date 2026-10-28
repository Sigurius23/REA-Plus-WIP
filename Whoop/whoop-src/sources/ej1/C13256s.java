package ej1;

import androidx.compose.p018ui.Modifier;
import f61.C14147i;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.models.Location;
import java.util.List;
import no0.AbstractC26986z0;
import p134f2.C14015d;
import p270k2.InterfaceC22131e;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;
import sq2.AbstractC32884a;
import t71.AbstractC33564a;
import zr1.AbstractC41069c;

/* JADX INFO: renamed from: ej1.s */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13256s implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45898w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f45899x;

    public /* synthetic */ C13256s(List list, int i13) {
        this.f45898w = i13;
        this.f45899x = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f45898w) {
            case 0:
                return AbstractC13257t.m37279n(this.f45899x, (Modifier) obj);
            case 1:
                return C14147i.m40263G(this.f45899x, (InterfaceC22131e) obj);
            case 2:
                return Boolean.valueOf(MutableGlobalState.addLiveLocations$lambda$14$lambda$13(this.f45899x, (Location) obj));
            case 3:
                return AbstractC26986z0.m80925e(this.f45899x, (InterfaceC22131e) obj);
            case 4:
                return AbstractC32884a.m103222d(this.f45899x, (InterfaceC22131e) obj);
            case 5:
                return AbstractC33564a.m105988g(this.f45899x, (C14015d) obj);
            default:
                return AbstractC41069c.m133353u(this.f45899x, (InterfaceC26064q) obj);
        }
    }
}

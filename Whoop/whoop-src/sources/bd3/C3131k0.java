package bd3;

import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import p005a3.EnumC0236o2;
import p005a3.InterfaceC0240p2;
import p389p0.C28525g1;
import p389p0.C28535l0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: bd3.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3131k0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12278w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22669g0 f12279x;

    public /* synthetic */ C3131k0(C22669g0 c22669g0, int i13) {
        this.f12278w = i13;
        this.f12279x = c22669g0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f12278w) {
            case 0:
                JsonElement it = (JsonElement) obj;
                AbstractC22676k.m65750j(it, "it");
                this.f12279x.f89336w = it;
                return C23454a0.f92919a;
            case 1:
                return ThreadLogic.handlePollEvents$lambda$12$lambda$6(this.f12279x, (String) obj);
            case 2:
                return ThreadLogic.handlePollEvents$lambda$12$lambda$7(this.f12279x, (String) obj);
            case 3:
                return ThreadLogic.handlePollEvents$lambda$12$lambda$8(this.f12279x, (String) obj);
            case 4:
                return ThreadLogic.handlePollEvents$lambda$12$lambda$9(this.f12279x, (String) obj);
            case 5:
                return ThreadLogic.handlePollEvents$lambda$12$lambda$10(this.f12279x, (String) obj);
            case 6:
                return ThreadLogic.handlePollEvents$lambda$12$lambda$11(this.f12279x, (String) obj);
            default:
                InterfaceC0240p2 interfaceC0240p2 = (InterfaceC0240p2) obj;
                AbstractC22676k.m65748h(interfaceC0240p2, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                C28535l0 c28535l0 = ((C28525g1) interfaceC0240p2).f115432O;
                C22669g0 c22669g0 = this.f12279x;
                List listM118964P = (List) c22669g0.f89336w;
                if (listM118964P != null) {
                    listM118964P.add(c28535l0);
                } else {
                    listM118964P = AbstractC37056f.m118964P(c28535l0);
                }
                c22669g0.f89336w = listM118964P;
                return EnumC0236o2.f808x;
        }
    }
}

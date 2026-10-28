package i21;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import t71.InterfaceC33570g;
import y11.C39065r;

/* JADX INFO: renamed from: i21.p */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C18006p implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f69895E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f69896F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ TextResource f69897G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f69898H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f69899I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69900w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f69901x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f69902y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ TextResource f69903z;

    public /* synthetic */ C18006p(TextResource textResource, long j7, TextResource textResource2, long j13, InterfaceC33570g.a aVar, List list, Function1 function1, TextResource textResource3) {
        this.f69901x = textResource;
        this.f69902y = j7;
        this.f69903z = textResource2;
        this.f69895E = j13;
        this.f69898H = aVar;
        this.f69899I = list;
        this.f69896F = function1;
        this.f69897G = textResource3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69900w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18009s.m51700i(this.f69901x, this.f69902y, this.f69903z, this.f69895E, (InterfaceC33570g.a) this.f69898H, (List) this.f69899I, this.f69896F, this.f69897G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18010t.m51712h((C39065r) this.f69898H, this.f69901x, this.f69902y, (InterfaceC33570g.b) this.f69899I, this.f69903z, this.f69895E, this.f69896F, this.f69897G, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C18006p(C39065r c39065r, TextResource textResource, long j7, InterfaceC33570g.b bVar, TextResource textResource2, long j13, Function1 function1, TextResource textResource3) {
        this.f69898H = c39065r;
        this.f69901x = textResource;
        this.f69902y = j7;
        this.f69899I = bVar;
        this.f69903z = textResource2;
        this.f69895E = j13;
        this.f69896F = function1;
        this.f69897G = textResource3;
    }
}

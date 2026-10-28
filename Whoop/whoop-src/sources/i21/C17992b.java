package i21;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import hy0.C17750h1;
import java.util.List;
import p745y81.EnumC39333f;
import y11.AbstractC39058k;

/* JADX INFO: renamed from: i21.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17992b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f69837E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f69838F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f69839G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f69840H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f69841I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69842w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f69843x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f69844y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f69845z;

    public /* synthetic */ C17992b(TextResource textResource, long j7, boolean z4, TextResource textResource2, EnumC39333f enumC39333f, C17750h1 c17750h1, List list, int i13) {
        this.f69843x = textResource;
        this.f69837E = j7;
        this.f69845z = z4;
        this.f69844y = textResource2;
        this.f69839G = enumC39333f;
        this.f69840H = c17750h1;
        this.f69841I = list;
        this.f69838F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69842w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17993c.m51611o(this.f69843x, this.f69837E, this.f69845z, this.f69844y, (EnumC39333f) this.f69839G, (C17750h1) this.f69840H, (List) this.f69841I, this.f69838F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39058k.m124527s(this.f69843x, this.f69844y, (TextResource) this.f69839G, this.f69845z, this.f69837E, (TextResource) this.f69840H, (TextResource) this.f69841I, this.f69838F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C17992b(TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, long j7, TextResource textResource4, TextResource textResource5, int i13) {
        this.f69843x = textResource;
        this.f69844y = textResource2;
        this.f69839G = textResource3;
        this.f69845z = z4;
        this.f69837E = j7;
        this.f69840H = textResource4;
        this.f69841I = textResource5;
        this.f69838F = i13;
    }
}

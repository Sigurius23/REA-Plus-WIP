package js1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import hs1.AbstractC17606c;
import k01.AbstractC22092d;
import k01.C22093e;
import ly0.AbstractC24801e;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p208i2.AbstractC17911t;
import p635y2.InterfaceC39140v1;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: js1.i */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21918i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f84662E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84663w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f84664x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f84665y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f84666z;

    public /* synthetic */ C21918i(AbstractC17606c abstractC17606c, Function1 function1, boolean z4, String str) {
        this.f84666z = abstractC17606c;
        this.f84665y = function1;
        this.f84664x = z4;
        this.f84662E = str;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f84663w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC21921l.m62371A((AbstractC17606c) this.f84666z, (Function1) this.f84665y, this.f84664x, (String) this.f84662E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22092d.m63200z((C22093e) this.f84666z, (Modifier) this.f84662E, this.f84664x, (Function1) this.f84665y, (Composer) obj, iIntValue2);
            case 2:
                return AbstractC24801e.m72690j(this.f84664x, (TextResource) this.f84666z, (C2886a) this.f84665y, (TextResource) this.f84662E, (InterfaceC39140v1) obj, (C39169a) obj2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC27282u.m82295k(this.f84664x, (EnumC27284v) this.f84666z, (String) this.f84662E, (AbstractC17911t) this.f84665y, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C21918i(C22093e c22093e, Modifier modifier, boolean z4, Function1 function1) {
        this.f84666z = c22093e;
        this.f84662E = modifier;
        this.f84664x = z4;
        this.f84665y = function1;
    }

    public /* synthetic */ C21918i(boolean z4, TextResource textResource, C2886a c2886a, TextResource textResource2) {
        this.f84664x = z4;
        this.f84666z = textResource;
        this.f84665y = c2886a;
        this.f84662E = textResource2;
    }

    public /* synthetic */ C21918i(boolean z4, EnumC27284v enumC27284v, String str, AbstractC17911t abstractC17911t) {
        this.f84664x = z4;
        this.f84666z = enumC27284v;
        this.f84662E = str;
        this.f84665y = abstractC17911t;
    }
}

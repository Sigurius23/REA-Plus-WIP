package nb1;

import a51.C0391f;
import b91.EnumC2888c;
import c51.C4228e;
import c51.C4236m;
import c51.C4238o;
import c51.C4242s;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.amoeba.AmoebaDomainResult;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.design.models.items.amoeba.reducers.AmoebaViewStateReducer;
import l83.C23454a0;
import md0.C25447b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import z41.C40071f;
import z41.C40072g;

/* JADX INFO: renamed from: nb1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "model", "Lc51/s;", "f", "(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "smallAmoebaMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26537a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f105476a = Function1.m68251a(new C25447b(26));

    /* JADX INFO: renamed from: nb1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f105477w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f105477w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f105477w.invoke((WhoopAgeAmoeba) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m78631c() {
        return f105476a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m78632d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopAgeAmoeba.class), new a(new C25447b(27)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C4242s m78633e(WhoopAgeAmoeba model) {
        AbstractC22676k.m65750j(model, "model");
        return m78634f(model);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final C4242s m78634f(WhoopAgeAmoeba model) {
        AbstractC22676k.m65750j(model, "model");
        C4242s c4242sReduce = new AmoebaViewStateReducer(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0).reduce(new AmoebaDomainResult.Result(model, null, null, false));
        C40072g particleSystemSettings = c4242sReduce.getParticles().getParticleSystemSettings();
        C26538b c26538b = C26538b.f105478a;
        float fM78639d = c26538b.m78639d();
        AbstractC17911t abstractC17911tM78636a = c26538b.m78636a();
        C4236m c4236m = new C4236m(C40072g.m128427b(particleSystemSettings, 0, 0, c26538b.m78638c() * particleSystemSettings.getSpeed(), c26538b.m78638c() * particleSystemSettings.getMaxSpeed(), 0.0f, C40071f.m128422b(particleSystemSettings.getSize(), c26538b.m78637b() * particleSystemSettings.getSize().getBaseValue(), 0.0f, null, null, 14, null), null, null, 0L, false, 0.0f, null, particleSystemSettings.getRadius() * 0.6f, 0, 0.0f, C0391f.m1066b(particleSystemSettings.getEmitter(), null, particleSystemSettings.getEmitter().getParticlesPerSecond() * 0.6f, null, 5, null), null, 0.0f, 225235, null), 0.0f, 2, null);
        C4238o text = c4242sReduce.getText();
        return c4242sReduce.m13236b((8191 & 1) != 0 ? c4242sReduce.radius : fM78639d, (8191 & 2) != 0 ? c4242sReduce.padding : 0.0f, (8191 & 4) != 0 ? c4242sReduce.gradientPadding : 0.0f, (8191 & 8) != 0 ? c4242sReduce.paceOfAgingAnimationScore : 0.0d, (8191 & 16) != 0 ? c4242sReduce.yearsDifferenceAnimationScore : 0.0d, (8191 & 32) != 0 ? c4242sReduce.colors : null, (8191 & 64) != 0 ? c4242sReduce.centerShadowBrush : abstractC17911tM78636a, (8191 & 128) != 0 ? c4242sReduce.outline : null, (8191 & 256) != 0 ? c4242sReduce.usingPrimitiveEdgeFade : false, (8191 & 512) != 0 ? c4242sReduce.edgeFade : C4228e.m13119b(c4242sReduce.getEdgeFade(), 0.0f, 25.0f, 0.0f, 6, 5, null), (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c4242sReduce.primitiveEdgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c4242sReduce.particles : c4236m, (8191 & 4096) != 0 ? c4242sReduce.transition : null, (8191 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c4242sReduce.text : text != null ? C4238o.m13215b(text, null, null, null, null, null, EnumC2888c.N5, true, 31, null) : null);
    }
}

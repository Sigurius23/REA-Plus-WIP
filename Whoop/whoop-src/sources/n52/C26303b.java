package n52;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C1601k1;
import b83.C2807c;
import bc3.AbstractC3050q0;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.StartActivityRepository;
import com.whoop.realtime.presentation.C9882f;
import com.whoop.realtime.presentation.C9887k;
import com.whoop.realtime.service.C9907b;
import eq1.C13562a;
import j93.InterfaceC21461d;
import java.util.List;
import js0.AbstractC21909c;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import lm2.C24515a;
import mu2.C25960e;
import nd1.InterfaceC26584j;
import o52.C27552f0;
import o52.C27567n;
import o52.C27578s0;
import od1.C27840c;
import od1.C27856s;
import or2.C28150c;
import org.koin.core.error.DefinitionParameterException;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pv2.C29581b;
import qf3.C30330b;
import rd1.C31245d;
import rf3.C31362a;
import td1.InterfaceC33704b;
import tf3.C33768a;
import uf3.C34911a;
import us0.InterfaceC35211g;
import vf3.C35953c;
import we1.InterfaceC37217a;
import wf3.C37247a;
import xf3.C38266c;
import yu0.C39787d;
import z82.C40191e;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: n52.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Ln52/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26303b implements InterfaceC26584j {
    /* JADX INFO: renamed from: g */
    private static final C23454a0 m78060g(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C25960e c25960e = new C25960e(26);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C27578s0.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c25960e, 2)), false);
        C25960e c25960e2 = new C25960e(27);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C27567n.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c25960e2, 2)), false);
        C25960e c25960e3 = new C25960e(28);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C27552f0.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c25960e3, 2)), false);
        C25960e c25960e4 = new C25960e(29);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C9887k.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c25960e4, 2)), false);
        C26302a c26302a = new C26302a(0);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C9882f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c26302a, 2)), false);
        C26302a c26302a2 = new C26302a(1);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C9907b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass6, null, c26302a2, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C27578s0 m78061h(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27578s0((StartActivityRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(StartActivityRepository.class), null), (AbstractC21909c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC40205a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (InterfaceC37217a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null), (C27840c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27840c.class), null), null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C27567n m78062i(C38266c viewModel, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        Application applicationM88531h = AbstractC29125c.m88531h(viewModel);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27567n(applicationM88531h, (InterfaceC33704b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (C28150c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28150c.class), null), (C31245d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31245d.class), null), (C13562a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13562a.class), null), (InterfaceC35211g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC35211g.class), null), (C39787d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39787d.class), null), null, 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C27552f0 m78063j(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27552f0(null, (C13562a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13562a.class), null), (C29581b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29581b.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C9887k m78064k(C38266c viewModel, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C24515a c24515a = (C24515a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C24515a.class), null);
        C27856s c27856s = (C27856s) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27856s.class), null);
        C22365e c22365e = AbstractC3050q0.f12077a;
        ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
        C40191e c40191e = (C40191e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C1601k1.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C1601k1.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C9887k(c24515a, c27856s, executorC22364d, c40191e, (C1601k1) objM110111b, (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (AbstractC21909c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (InterfaceC37217a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null), null, 256, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C9882f m78065l(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C9882f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C9907b m78066m(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(Context.class));
        if (objM110111b != null) {
            return new C9907b((Context) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Context.class, new StringBuilder("No value found for type '"), '\''));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m78060g(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ List<InterfaceC26584j> getDependencies() {
        return super.getDependencies();
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}

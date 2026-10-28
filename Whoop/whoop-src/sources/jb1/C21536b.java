package jb1;

import j93.InterfaceC21461d;
import java.util.HashMap;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23603c1;
import p716lb1.C23743y0;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: jb1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0013\u001a\u00020\u00062\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0004j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\rR^\u0010\u001f\u001aF\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0004j\u0002`\u00110\u001aj\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0004j\u0002`\u0011`\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Ljb1/b;", "", "<init>", "()V", "Lkotlin/Function1;", "Llb1/z0;", "Ll83/a0;", "block", "b", "(Lkotlin/jvm/functions/Function1;)V", "Llb1/y0;", "mapper", "c", "(Llb1/y0;)V", "Lj93/d;", "itemClass", "Lm91/u;", "Lcom/whoop/design/reducer/ItemConfig;", "config", "a", "(Lj93/d;Lkotlin/jvm/functions/Function1;)V", "Llb1/y0;", "e", "()Llb1/y0;", "setModelMapper$design_models_release", "modelMapper", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "d", "()Ljava/util/HashMap;", "itemConfigs", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21536b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C23743y0 modelMapper = AbstractC23603c1.m68574a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HashMap<InterfaceC21461d, Function1> itemConfigs = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final void m60546a(InterfaceC21461d itemClass, Function1 config) {
        AbstractC22676k.m65750j(itemClass, "itemClass");
        AbstractC22676k.m65750j(config, "config");
        this.itemConfigs.put(itemClass, config);
    }

    /* JADX INFO: renamed from: b */
    public final void m60547b(Function1 block) {
        AbstractC22676k.m65750j(block, "block");
        C23749z0 c23749z0 = new C23749z0();
        block.invoke(c23749z0);
        this.modelMapper = this.modelMapper.m69692c(c23749z0.m69766b());
    }

    /* JADX INFO: renamed from: c */
    public final void m60548c(C23743y0 mapper) {
        AbstractC22676k.m65750j(mapper, "mapper");
        this.modelMapper = this.modelMapper.m69692c(mapper);
    }

    /* JADX INFO: renamed from: d */
    public final HashMap<InterfaceC21461d, Function1> m60549d() {
        return this.itemConfigs;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C23743y0 getModelMapper() {
        return this.modelMapper;
    }
}

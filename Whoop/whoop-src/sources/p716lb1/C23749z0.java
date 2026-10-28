package p716lb1;

import j93.InterfaceC21461d;
import java.util.HashMap;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb1.z0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fRP\u0010\u0013\u001a>\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0010j\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Llb1/z0;", "", "<init>", "()V", "Lj93/d;", "modelClass", "Lkotlin/Function1;", "Lcom/whoop/design/models/DesignSystemModel;", "Lm91/u;", "factory", "Ll83/a0;", "a", "(Lj93/d;Lkotlin/jvm/functions/Function1;)V", "Llb1/y0;", "b", "()Llb1/y0;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "modelMap", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23749z0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HashMap<InterfaceC21461d, Function1> modelMap = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final void m69765a(InterfaceC21461d modelClass, Function1 factory) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        AbstractC22676k.m65750j(factory, "factory");
        this.modelMap.put(modelClass, factory);
    }

    /* JADX INFO: renamed from: b */
    public final C23743y0 m69766b() {
        return new C23743y0(this.modelMap);
    }
}

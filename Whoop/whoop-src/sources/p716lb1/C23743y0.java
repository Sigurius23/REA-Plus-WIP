package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.reducer.mapper.MissingModelMappingException;
import j93.InterfaceC21461d;
import java.util.Map;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: renamed from: lb1.y0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Llb1/y0;", "", "", "Lj93/d;", "Lkotlin/Function1;", "Lcom/whoop/design/models/DesignSystemModel;", "Lm91/u;", "modelMap", "<init>", "(Ljava/util/Map;)V", "model", "b", "(Lcom/whoop/design/models/DesignSystemModel;)Lkotlin/jvm/functions/Function1;", "", "a", "(Lcom/whoop/design/models/DesignSystemModel;)Z", "mapper", "c", "(Llb1/y0;)Llb1/y0;", "Ljava/util/Map;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23743y0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<InterfaceC21461d, Function1> modelMap;

    /* JADX WARN: Multi-variable type inference failed */
    public C23743y0(Map<InterfaceC21461d, ? extends Function1> modelMap) {
        AbstractC22676k.m65750j(modelMap, "modelMap");
        this.modelMap = modelMap;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69690a(DesignSystemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return this.modelMap.containsKey(AbstractC22671h0.f89337a.getOrCreateKotlinClass(model.getClass()));
    }

    /* JADX INFO: renamed from: b */
    public final Function1 m69691b(DesignSystemModel model) {
        AbstractC22676k.m65750j(model, "model");
        Map<InterfaceC21461d, Function1> map = this.modelMap;
        Class<?> cls = model.getClass();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Function1 function1 = map.get(c22673i0.getOrCreateKotlinClass(cls));
        if (function1 != null) {
            return function1;
        }
        throw new MissingModelMappingException(c22673i0.getOrCreateKotlinClass(model.getClass()));
    }

    /* JADX INFO: renamed from: c */
    public final C23743y0 m69692c(C23743y0 mapper) {
        AbstractC22676k.m65750j(mapper, "mapper");
        return new C23743y0(AbstractC25247g0.m73995d0(this.modelMap, mapper.modelMap));
    }
}

package nc1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.hrzonesrow.HrZonesRowModel;
import e21.C12597b;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import n72.C26439b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;

/* JADX INFO: renamed from: nc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;", "Le21/b;", "g", "(Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;)Le21/b;", "Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;", "Le21/b$a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;)Le21/b$a;", "", "", "f", "(Ljava/lang/String;)F", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "hrZonesRowModelMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26569a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f105671a = Function1.m68251a(new C26439b(7));

    /* JADX INFO: renamed from: nc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f105672w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f105672w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f105672w.invoke((HrZonesRowModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m78724c() {
        return f105671a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m78725d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(HrZonesRowModel.class), new a(new C26439b(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C12597b m78726e(HrZonesRowModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m78728g(model);
    }

    /* JADX INFO: renamed from: f */
    private static final float m78727f(String str) {
        Iterator it = AbstractC39414r.m125906y0(str, new String[]{":"}, 6).iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            float f13 = fFloatValue * 60.0f;
            Float fM125915y = AbstractC39420x.m125915y(AbstractC39414r.m125869O0((String) it.next()).toString());
            fFloatValue = f13 + (fM125915y != null ? fM125915y.floatValue() : 0.0f);
        }
        return fFloatValue;
    }

    /* JADX INFO: renamed from: g */
    private static final C12597b m78728g(HrZonesRowModel hrZonesRowModel) {
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(hrZonesRowModel.getIcon());
        String title = hrZonesRowModel.getTitle();
        List<HrZonesRowModel.HrZone> zones = hrZonesRowModel.getZones();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = zones.iterator();
        while (it.hasNext()) {
            C12597b.a aVarM78729h = m78729h((HrZonesRowModel.HrZone) it.next());
            if (aVarM78729h != null) {
                arrayList.add(aVarM78729h);
            }
        }
        return new C12597b(enumC16313m0M46377b, title, arrayList);
    }

    /* JADX INFO: renamed from: h */
    private static final C12597b.a m78729h(HrZonesRowModel.HrZone hrZone) {
        float fM78727f = m78727f(hrZone.getValue());
        Float fValueOf = Float.valueOf(fM78727f);
        if (fM78727f <= 0.0f) {
            fValueOf = null;
        }
        if (fValueOf == null) {
            return null;
        }
        return new C12597b.a(hrZone.getLabel(), hrZone.getValue(), hrZone.getColor(), fValueOf.floatValue());
    }
}

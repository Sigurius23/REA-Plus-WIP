package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.IconMarkdownCalloutModel;
import f21.C14028d;
import f21.EnumC14025a;
import gz0.AbstractC16315n0;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "iconMarkdownCalloutMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23604c2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93697a = Function1.m68251a(new C23714t1(11));

    /* JADX INFO: renamed from: lb1.c2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93698w;

        public a(Function1 function1) {
            this.f93698w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93698w.invoke((IconMarkdownCalloutModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68577c() {
        return f93697a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68578d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(IconMarkdownCalloutModel.class), new a(new C23714t1(12)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C14028d m68579e(IconMarkdownCalloutModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String bodyIcon = model.getBodyIcon();
        EnumC14025a enumC14025a = null;
        Integer numM46376a = bodyIcon != null ? AbstractC16315n0.m46376a(bodyIcon) : null;
        String bodyText = model.getBodyText();
        String style = model.getStyle();
        if (style == null) {
            style = "";
        }
        EnumC14025a enumC14025a2 = EnumC14025a.COMPACT;
        for (EnumC14025a enumC14025a3 : EnumC14025a.values()) {
            if (AbstractC22676k.m65745e(enumC14025a3.name(), style)) {
                enumC14025a = enumC14025a3;
                break;
            }
        }
        if (enumC14025a != null) {
            enumC14025a2 = enumC14025a;
        }
        return new C14028d(id4, numM46376a, bodyText, enumC14025a2);
    }
}

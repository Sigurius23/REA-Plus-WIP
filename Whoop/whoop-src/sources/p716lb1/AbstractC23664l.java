package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AppointmentCardDateModel;
import com.whoop.design.models.items.AppointmentCardIconButtonModel;
import com.whoop.design.models.items.AppointmentCardModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.Request;
import com.whoop.whoopaction.domain.models.UpdateAction;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import jb1.AbstractC21537c;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import xz0.C38750a;
import xz0.C38751b;
import xz0.C38755f;
import xz0.EnumC38752c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lb1.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/design/models/items/AppointmentCardModel;", "model", "Lxz0/f;", "f", "(Lcom/whoop/design/models/items/AppointmentCardModel;)Lxz0/f;", "Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;", "Lxz0/b;", "g", "(Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;)Lxz0/b;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "appointmentCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23664l {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93842a = Function1.m68251a(new C23587a(16));

    /* JADX INFO: renamed from: lb1.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93843w;

        public a(Function1 function1) {
            this.f93843w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93843w.invoke((AppointmentCardModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69002c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AppointmentCardModel.class), new a(new C23587a(17)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C38755f m69003d(AppointmentCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69005f(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69004e() {
        return f93842a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX INFO: renamed from: f */
    public static final C38755f m69005f(AppointmentCardModel model) {
        EnumC38752c enumC38752c;
        AbstractC22676k.m65750j(model, "model");
        String header = model.getHeader();
        AppointmentCardIconButtonModel iconButton = model.getIconButton();
        C38751b c38751bM69006g = iconButton != null ? m69006g(iconButton) : null;
        TagModel tag = model.getTag();
        C17750h1 c17750h1M69314d = tag != null ? AbstractC23699q4.m69314d(tag) : null;
        String title = model.getTitle();
        String descriptionImageUrl = model.getDescriptionImageUrl();
        AbstractC22403o.c cVar = descriptionImageUrl != null ? new AbstractC22403o.c(descriptionImageUrl, 0, 0, 0, 14, null) : null;
        String description = model.getDescription();
        String imageUrl = model.getImageUrl();
        AbstractC22403o.c cVar2 = imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null;
        String imageAlignment = model.getImageAlignment();
        if (imageAlignment != null) {
            EnumC38752c[] enumC38752cArrValues = EnumC38752c.values();
            int length = enumC38752cArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC38752c = null;
                    break;
                }
                enumC38752c = enumC38752cArrValues[i13];
                if (AbstractC22676k.m65745e(enumC38752c.name(), imageAlignment)) {
                    break;
                }
                i13++;
            }
            if (enumC38752c == null) {
                enumC38752c = EnumC38752c.LEADING;
            }
        } else {
            enumC38752c = EnumC38752c.LEADING;
        }
        EnumC38752c enumC38752c2 = enumC38752c;
        AppointmentCardDateModel date = model.getDate();
        return new C38755f(header, c38751bM69006g, c17750h1M69314d, title, cVar, description, cVar2, enumC38752c2, date != null ? new C38750a(date.getMonth(), date.getDay()) : null, AbstractC21537c.m60555e(null, 1, null).m60545m(model.getItems()), model.getDestination());
    }

    /* JADX INFO: renamed from: g */
    private static final C38751b m69006g(AppointmentCardIconButtonModel appointmentCardIconButtonModel) {
        Request request;
        String path;
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(appointmentCardIconButtonModel.getIcon());
        if (enumC16313m0M46377b == null) {
            enumC16313m0M46377b = EnumC16313m0.ADD;
        }
        AnyModal modal = appointmentCardIconButtonModel.getModal();
        Action action = appointmentCardIconButtonModel.getAction();
        Action action2 = appointmentCardIconButtonModel.getAction();
        UpdateAction updateAction = action2 instanceof UpdateAction ? (UpdateAction) action2 : null;
        boolean z4 = false;
        if (updateAction != null && (request = updateAction.getRequest()) != null && (path = request.getPath()) != null && AbstractC39414r.m125876U(path, "dismissals", false)) {
            z4 = true;
        }
        return new C38751b(enumC16313m0M46377b, modal, action, z4);
    }
}

package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.CardContainerModel;
import com.whoop.design.models.cards.HeaderContentModel;
import com.whoop.design.models.colortheme.ColorBackgroundModel;
import e81.C12816a;
import e81.C12840n;
import f01.C13891q0;
import f01.C13902u;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jb1.AbstractC21537c;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.y */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/design/models/cards/CardContainerModel;", "model", "Lf01/u;", "d", "(Lcom/whoop/design/models/cards/CardContainerModel;)Lf01/u;", "Lcom/whoop/design/models/cards/HeaderContentModel;", "Lf01/q0;", "i", "(Lcom/whoop/design/models/cards/HeaderContentModel;)Lf01/q0;", "Llb1/y0;", "a", "Llb1/y0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Llb1/y0;", "cardContainerMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23742y {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94068a = Function1.m68251a(new C23724v(3));

    /* JADX INFO: renamed from: lb1.y$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94069w;

        public a(Function1 function1) {
            this.f94069w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94069w.invoke((CardContainerModel) it);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX INFO: renamed from: d */
    public static final C13902u m69683d(CardContainerModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        InterfaceC25312u interfaceC25312uM60541h = AbstractC21537c.m60554d(new C23670m(4)).m60541h(model.getItem());
        Object interaction = model.getInteraction();
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = (interaction == null && (interaction = model.getDestination()) == null) ? c23454a0 : interaction;
        if (interfaceC25312uM60541h instanceof C12840n) {
            if (obj.equals(c23454a0)) {
                interfaceC25312uM60541h = (C12840n) interfaceC25312uM60541h;
            } else {
                C12840n c12840n = (C12840n) interfaceC25312uM60541h;
                interfaceC25312uM60541h = C12840n.m36029c(c12840n, null, null, null, C12816a.m35879b(c12840n.getPieChartContent(), null, null, null, null, 7, null), null, null, null, null, 0.0f, 503, null);
            }
        }
        InterfaceC25312u interfaceC25312u = interfaceC25312uM60541h;
        String id4 = model.getId();
        String title = model.getTitle();
        String str = title.length() > 0 ? title : null;
        String endIcon = model.getEndIcon();
        if (endIcon != null) {
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), endIcon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 == null) {
                enumC16313m0 = EnumC16313m0.CARET_FORWARD;
            }
        } else {
            enumC16313m0 = EnumC16313m0.CARET_FORWARD;
        }
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        HeaderContentModel headerContent = model.getHeaderContent();
        C13891q0 c13891q0M69688i = headerContent != null ? m69688i(headerContent) : null;
        String cardName = model.getCardName();
        ColorBackgroundModel backgroundColor = model.getBackgroundColor();
        return new C13902u(id4, str, enumC16313m1, c13891q0M69688i, interfaceC25312u, cardName, obj, backgroundColor != null ? AbstractC23623f0.m68736a(backgroundColor) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69684e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CardContainerModel.class), new a(new C23724v(4)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C13902u m69685f(CardContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69683d(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m69686g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final C23743y0 m69687h() {
        return f94068a;
    }

    /* JADX INFO: renamed from: i */
    private static final C13891q0 m69688i(HeaderContentModel headerContentModel) {
        EnumC16313m0 leadingIcon = headerContentModel.getLeadingIcon();
        String leadingImage = headerContentModel.getLeadingImage();
        return new C13891q0(leadingIcon, leadingImage != null ? new AbstractC22403o.c(leadingImage, 0, 0, 0, 14, null) : null, headerContentModel.getTitle(), headerContentModel.getTrailingIcon());
    }
}

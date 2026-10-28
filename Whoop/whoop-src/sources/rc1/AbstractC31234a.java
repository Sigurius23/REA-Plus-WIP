package rc1;

import b91.EnumC2888c;
import com.whoop.design.models.ContentType;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.shopmediacard.ShopMediaCardModel;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23699q4;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;
import p745y81.EnumC39333f;
import r61.C30985h;
import s31.C32108e;
import s31.EnumC32107d;
import s31.InterfaceC32104a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;", "Ls31/e;", "f", "(Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;)Ls31/e;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "shopMediaCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31234a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f128616a = Function1.m68251a(new C30985h(9));

    /* JADX INFO: renamed from: rc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f128617w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f128617w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f128617w.invoke((ShopMediaCardModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m96176c() {
        return f128616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m96177d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ShopMediaCardModel.class), new a(new C30985h(10)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C32108e m96178e(ShopMediaCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m96179f(model);
    }

    /* JADX INFO: renamed from: f */
    private static final C32108e m96179f(ShopMediaCardModel shopMediaCardModel) {
        EnumC2888c enumC2888c = shopMediaCardModel.getSize() == EnumC32107d.HERO ? EnumC2888c.T4 : EnumC2888c.T3;
        AbstractC22403o.c cVar = new AbstractC22403o.c(shopMediaCardModel.getContentUrl(), 0, 0, 0, 14, null);
        ContentType contentType = shopMediaCardModel.getContentType();
        if (contentType == null) {
            contentType = ContentType.IMAGE;
        }
        InterfaceC32104a bVar = null;
        AbstractC22403o.c cVar2 = contentType == ContentType.IMAGE ? cVar : null;
        TagModel tag = shopMediaCardModel.getTag();
        C17750h1 c17750h1M69314d = tag != null ? AbstractC23699q4.m69314d(tag) : null;
        C33169c0 c33169c0 = new C33169c0(shopMediaCardModel.getTitle(), enumC2888c, EnumC39333f.BRAND_WHITE, 5, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null);
        String description = shopMediaCardModel.getDescription();
        C33169c0 c33169c1 = description != null ? new C33169c0(description, EnumC2888c.B2, EnumC39333f.WHITE_70, 5, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null) : null;
        String ctaText = shopMediaCardModel.getCtaText();
        if (ctaText != null && !AbstractC39414r.m125890i0(ctaText)) {
            String ctaText2 = shopMediaCardModel.getCtaText();
            EnumC16313m0 ctaIcon = shopMediaCardModel.getCtaIcon();
            if (ctaIcon == null) {
                ctaIcon = EnumC16313m0.CARET_FORWARD;
            }
            bVar = new InterfaceC32104a.a(ctaText2, ctaIcon);
        } else if (shopMediaCardModel.getCtaIcon() != null || shopMediaCardModel.getCtaInteraction() != null) {
            EnumC16313m0 ctaIcon2 = shopMediaCardModel.getCtaIcon();
            if (ctaIcon2 == null) {
                ctaIcon2 = EnumC16313m0.CARET_FORWARD;
            }
            bVar = new InterfaceC32104a.b(ctaIcon2);
        }
        return new C32108e(cVar2, c17750h1M69314d, c33169c0, c33169c1, bVar, shopMediaCardModel.getSize(), shopMediaCardModel.getCtaInteraction());
    }
}

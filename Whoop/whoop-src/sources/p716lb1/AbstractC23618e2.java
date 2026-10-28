package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ImageCardModel;
import com.whoop.design.models.items.ImageCardPickerModel;
import com.whoop.design.models.items.ImageUrlModel;
import h21.C16780d;
import h21.C16781e;
import hy0.C17749h0;
import hy0.EnumC17729c0;
import hy0.EnumC17745g0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.e2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/design/models/items/ImageUrlModel;", "model", "Lhy0/h0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/ImageUrlModel;)Lhy0/h0;", "Lcom/whoop/design/models/items/ImageCardPickerModel;", "Lh21/d;", "i", "(Lcom/whoop/design/models/items/ImageCardPickerModel;)Lh21/d;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "imageUrlMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23618e2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93734a = Function1.m68251a(new C23714t1(13));

    /* JADX INFO: renamed from: lb1.e2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93735w;

        public a(Function1 function1) {
            this.f93735w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93735w.invoke((ImageUrlModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.e2$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93736w;

        public b(Function1 function1) {
            this.f93736w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93736w.invoke((ImageCardPickerModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m68693d() {
        return f93734a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68694e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23714t1 c23714t1 = new C23714t1(14);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ImageUrlModel.class), new a(c23714t1));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ImageCardPickerModel.class), new b(new C23714t1(15)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C17749h0 m68695f(ImageUrlModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68697h(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C16780d m68696g(ImageCardPickerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68698i(model);
    }

    /* JADX INFO: renamed from: h */
    public static final C17749h0 m68697h(ImageUrlModel model) {
        EnumC17729c0 enumC17729c0;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        String captionDisplay = model.getCaptionDisplay();
        String alignment = model.getAlignment();
        EnumC17745g0 enumC17745g0 = null;
        if (alignment == null) {
            enumC17729c0 = null;
            break;
        }
        EnumC17729c0[] enumC17729c0ArrValues = EnumC17729c0.values();
        int length = enumC17729c0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC17729c0 = null;
                break;
            }
            enumC17729c0 = enumC17729c0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC17729c0.name(), alignment)) {
                break;
            }
            i13++;
        }
        Integer width = model.getWidth();
        Integer height = model.getHeight();
        String shape = model.getShape();
        if (shape != null) {
            for (EnumC17745g0 enumC17745g1 : EnumC17745g0.values()) {
                if (AbstractC22676k.m65745e(enumC17745g1.name(), shape)) {
                    enumC17745g0 = enumC17745g1;
                    break;
                }
            }
        }
        return new C17749h0(cVar, captionDisplay, enumC17729c0, width, height, enumC17745g0, model.getInline());
    }

    /* JADX INFO: renamed from: i */
    public static final C16780d m68698i(ImageCardPickerModel imageCardPickerModel) {
        AbstractC22676k.m65750j(imageCardPickerModel, "<this>");
        List<ImageCardModel> cards = imageCardPickerModel.getCards();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(cards, 10));
        for (ImageCardModel imageCardModel : cards) {
            arrayList.add(new C16781e(imageCardModel.getId(), new AbstractC22403o.c(imageCardModel.getImageUrl(), 0, 0, 0, 14, null), imageCardModel.getLabel(), 0.0f, 0.0f, 24, null));
        }
        return new C16780d(arrayList, imageCardPickerModel.getSelectedCardId());
    }
}

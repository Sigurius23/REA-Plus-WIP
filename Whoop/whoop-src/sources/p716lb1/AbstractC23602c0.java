package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.VowCardModel;
import com.whoop.design.models.items.AiChatEntryModel;
import com.whoop.design.util.AbstractC8693b;
import f01.C13904u1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import o01.C27347c;
import o01.EnumC27349e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.c0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/design/models/items/AiChatEntryModel;", "model", "Lo01/c;", "d", "(Lcom/whoop/design/models/items/AiChatEntryModel;)Lo01/c;", "Lcom/whoop/design/models/cards/VowCardModel;", "Lf01/u1;", "i", "(Lcom/whoop/design/models/cards/VowCardModel;)Lf01/u1;", "Llb1/y0;", "a", "Llb1/y0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Llb1/y0;", "chatMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23602c0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93693a = Function1.m68251a(new C23724v(20));

    /* JADX INFO: renamed from: lb1.c0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93694w;

        public a(Function1 function1) {
            this.f93694w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93694w.invoke((AiChatEntryModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.c0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93695w;

        public b(Function1 function1) {
            this.f93695w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93695w.invoke((VowCardModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C27347c m68566d(AiChatEntryModel model) {
        AbstractC22676k.m65750j(model, "model");
        String hint = model.getHint();
        EnumC27349e suggestionCategory = model.getSuggestionCategory();
        String contextualMessage = model.getContextualMessage();
        if (contextualMessage == null) {
            contextualMessage = "";
        }
        return new C27347c(null, hint, suggestionCategory, contextualMessage, model.getEducationType(), model.getConversationSeedId(), model.getSourceType(), model.getSourceId(), false, null, 769, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68567e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23724v c23724v = new C23724v(21);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(AiChatEntryModel.class), new a(c23724v));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(VowCardModel.class), new b(new C23724v(22)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C27347c m68568f(AiChatEntryModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68566d(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C13904u1 m68569g(VowCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68571i(model);
    }

    /* JADX INFO: renamed from: h */
    public static final C23743y0 m68570h() {
        return f93693a;
    }

    /* JADX INFO: renamed from: i */
    public static final C13904u1 m68571i(VowCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C13904u1(AbstractC8693b.m21278l(model.getBody()), AbstractC8693b.m21278l(model.getTitle()));
    }
}

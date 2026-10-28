package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SuggestionBubbleModel;
import l83.C23454a0;
import oz0.C28497c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.p4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/SuggestionBubbleModel;", "model", "Loz0/c;", "d", "(Lcom/whoop/design/models/items/SuggestionBubbleModel;)Loz0/c;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "suggestionBubbleMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23693p4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93911a = Function1.m68251a(new C23675m4(3));

    /* JADX INFO: renamed from: lb1.p4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93912w;

        public a(Function1 function1) {
            this.f93912w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93912w.invoke((SuggestionBubbleModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69244c() {
        return f93911a;
    }

    /* JADX INFO: renamed from: d */
    public static final C28497c m69245d(SuggestionBubbleModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C28497c(AbstractC11266d.m30461o("Suggestion", model.getContent()), model.getContent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69246e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SuggestionBubbleModel.class), new a(new C23675m4(4)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C28497c m69247f(SuggestionBubbleModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69245d(model);
    }
}

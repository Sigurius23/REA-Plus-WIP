package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.ContentBlock;
import com.whoop.design.models.cards.ContentBlockListCardModel;
import f01.C13855e0;
import f01.C13864h0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.q0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/cards/ContentBlockListCardModel;", "model", "Lf01/h0;", "c", "(Lcom/whoop/design/models/cards/ContentBlockListCardModel;)Lf01/h0;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "contentBlockListCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23695q0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93916a = Function1.m68251a(new C23644i0(17));

    /* JADX INFO: renamed from: lb1.q0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93917w;

        public a(Function1 function1) {
            this.f93917w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93917w.invoke((ContentBlockListCardModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C13864h0 m69263c(ContentBlockListCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<ContentBlock> contentBlocks = model.getContentBlocks();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(contentBlocks, 10));
        for (ContentBlock contentBlock : contentBlocks) {
            arrayList.add(new C13855e0(contentBlock.getTitle(), contentBlock.getContent(), true));
        }
        return new C13864h0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69264d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ContentBlockListCardModel.class), new a(new C23644i0(18)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C13864h0 m69265e(ContentBlockListCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69263c(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m69266f() {
        return f93916a;
    }
}

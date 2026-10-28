package pb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.behaviordetails.ImpactMagnitudeQuestionsModel;
import com.whoop.design.models.items.behaviordetails.MagnitudeQuestionGroup;
import com.whoop.design.models.items.behaviordetails.MagnitudeQuestionItem;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f51.C14100k;
import f51.C14101l;
import f51.C14102m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import nm1.C26842g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23639h2;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: pb1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionGroup;", "Lf51/l;", "f", "(Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionGroup;)Lf51/l;", "Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionItem;", "Lf51/m;", "g", "(Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionItem;)Lf51/m;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "impactMagnitudeQuestionsMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29057d {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f117573a = Function1.m68251a(new C26842g(20));

    /* JADX INFO: renamed from: pb1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f117574w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f117574w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f117574w.invoke((ImpactMagnitudeQuestionsModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m88330c() {
        return f117573a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m88331d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ImpactMagnitudeQuestionsModel.class), new a(new C26842g(21)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C14100k m88332e(ImpactMagnitudeQuestionsModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<MagnitudeQuestionGroup> magnitudeQuestions = model.getMagnitudeQuestions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(magnitudeQuestions, 10));
        Iterator<T> it = magnitudeQuestions.iterator();
        while (it.hasNext()) {
            arrayList.add(m88333f((MagnitudeQuestionGroup) it.next()));
        }
        String additionalInfoText = model.getAdditionalInfoText();
        return new C14100k(arrayList, additionalInfoText != null ? AbstractC8693b.m21278l(additionalInfoText) : null);
    }

    /* JADX INFO: renamed from: f */
    private static final C14101l m88333f(MagnitudeQuestionGroup magnitudeQuestionGroup) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(magnitudeQuestionGroup.getTitle());
        List<MagnitudeQuestionItem> items = magnitudeQuestionGroup.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(m88334g((MagnitudeQuestionItem) it.next()));
        }
        return new C14101l(textResourceM21278l, arrayList);
    }

    /* JADX INFO: renamed from: g */
    private static final C14102m m88334g(MagnitudeQuestionItem magnitudeQuestionItem) {
        return new C14102m(AbstractC8693b.m21278l(magnitudeQuestionItem.getQuestionTitle()), AbstractC8693b.m21278l(magnitudeQuestionItem.getQuestionMagnitude()), C23639h2.f93783a.m68833d(magnitudeQuestionItem.getQuestionStyle()));
    }
}

package uu2;

import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.anchorSelector.AnchorSectionModel;
import com.whoop.design.models.anchorSelector.AnchorSectionModelMappingKt;
import com.whoop.design.models.anchorSelector.AnchorSelectorModel;
import com.whoop.design.models.anchorSelector.SegmentedControlDisplayModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.dto.ExerciseDetailsModel;
import com.whoop.weightlifting.data.dto.MetaData;
import e51.C12729e;
import e51.C12738n;
import e51.C12740p;
import e51.EnumC12728d;
import e51.EnumC12737m;
import ep0.C13404j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l51.C23357g;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import uk2.C35051a;
import wv2.AbstractC37652a;

/* JADX INFO: renamed from: uu2.r */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u0006*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0006*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;", "Luu2/m;", "analyticsContext", "Luu2/o;", "f", "(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Luu2/m;)Luu2/o;", "Le51/n;", "Lm91/u;", "emptyStateItem", "b", "(Le51/n;Lm91/u;)Le51/n;", "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "e", "(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Le51/n;", "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;", "Le51/e;", "d", "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Le51/e;", "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;", "Le51/p;", "g", "(Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;)Le51/p;", "Ljb1/a;", "a", "Ljb1/a;", "defaultDesignItemReducer", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35267r {

    /* JADX INFO: renamed from: a */
    private static final C21535a f150055a = AbstractC21537c.m60554d(new C35051a(15));

    /* JADX INFO: renamed from: b */
    private static final C12738n m111853b(C12738n c12738n, InterfaceC25312u interfaceC25312u) {
        if (interfaceC25312u == null || c12738n.m35651c().isEmpty()) {
            return c12738n;
        }
        C12729e c12729e = (C12729e) AbstractC25265s.m74112P0(c12738n.m35651c());
        return C12738n.m35649b(c12738n, null, AbstractC25265s.m74128f1(C12729e.m35590b(c12729e, null, null, AbstractC25265s.m74128f1(interfaceC25312u, c12729e.m35593e()), null, null, null, 0.0f, 0.0f, 251, null), AbstractC25265s.m74086A0(1, c12738n.m35651c())), null, null, 0.0f, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m111854c(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private static final C12729e m111855d(AnchorSectionModel anchorSectionModel) {
        EnumC12728d enumC12728d;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(anchorSectionModel.getTitle());
        String type = anchorSectionModel.getType();
        List<InterfaceC25312u> listM60540g = AbstractC37652a.m121041e().m60540g(anchorSectionModel.getItems());
        String spacingType = anchorSectionModel.getSpacingType();
        if (spacingType == null) {
            spacingType = "";
        }
        EnumC12728d enumC12728d2 = EnumC12728d.NORMAL;
        EnumC12728d[] enumC12728dArrValues = EnumC12728d.values();
        int length = enumC12728dArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC12728d = null;
                break;
            }
            enumC12728d = enumC12728dArrValues[i13];
            if (AbstractC22676k.m65745e(enumC12728d.name(), spacingType)) {
                break;
            }
            i13++;
        }
        return new C12729e(textResourceM21278l, type, listM60540g, enumC12728d == null ? enumC12728d2 : enumC12728d, AnchorSectionModelMappingKt.resolveTitleTypography(anchorSectionModel), AnchorSectionModelMappingKt.resolveAnchorSectionHeaderState(anchorSectionModel), 0.0f, 0.0f, 192, null);
    }

    /* JADX INFO: renamed from: e */
    private static final C12738n m111856e(AnchorSelectorModel anchorSelectorModel) {
        List<SegmentedControlDisplayModel> tags = anchorSelectorModel.getTags();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tags, 10));
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            arrayList.add(m111858g((SegmentedControlDisplayModel) it.next()));
        }
        List<AnchorSectionModel> items = anchorSelectorModel.getItems();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it3 = items.iterator();
        while (it3.hasNext()) {
            arrayList2.add(m111855d((AnchorSectionModel) it3.next()));
        }
        SegmentedControlDisplayModel segmentedControlDisplayModel = (SegmentedControlDisplayModel) AbstractC25265s.m74100H0(anchorSelectorModel.getTags());
        return new C12738n(arrayList, arrayList2, segmentedControlDisplayModel != null ? segmentedControlDisplayModel.getId() : null, EnumC12737m.VIEWPORT_THRESHOLD, 0.0f, 16, null);
    }

    /* JADX INFO: renamed from: f */
    public static final C35264o m111857f(ExerciseDetailsModel exerciseDetailsModel, C35262m analyticsContext) {
        AiContextMetadata aiContextMetadata;
        AbstractC22676k.m65750j(exerciseDetailsModel, "<this>");
        AbstractC22676k.m65750j(analyticsContext, "analyticsContext");
        InterfaceC25312u interfaceC25312uM60544l = f150055a.m60544l(exerciseDetailsModel.getHeader());
        C13404j c13404jM18523a = null;
        C23357g c23357g = interfaceC25312uM60544l instanceof C23357g ? (C23357g) interfaceC25312uM60544l : null;
        if (c23357g == null) {
            throw new IllegalArgumentException(AbstractC11266d.m30461o("Expected CollapsableHeaderViewState from header model, got ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(exerciseDetailsModel.getHeader().getClass()).getSimpleName()).toString());
        }
        C12738n c12738nM111856e = m111856e(exerciseDetailsModel.getContent());
        DesignSystemModel emptyStateCard = exerciseDetailsModel.getEmptyStateCard();
        InterfaceC25312u interfaceC25312uM60544l2 = emptyStateCard != null ? AbstractC37652a.m121041e().m60544l(emptyStateCard) : null;
        C12738n c12738nM111853b = m111853b(c12738nM111856e, interfaceC25312uM60544l2);
        MetaData metadata = exerciseDetailsModel.getMetadata();
        if (metadata != null && (aiContextMetadata = metadata.getAiContextMetadata()) != null) {
            c13404jM18523a = AbstractC6219a.m18523a(aiContextMetadata);
        }
        return new C35264o(c23357g, c12738nM111853b, c13404jM18523a, interfaceC25312uM60544l2, analyticsContext);
    }

    /* JADX INFO: renamed from: g */
    private static final C12740p m111858g(SegmentedControlDisplayModel segmentedControlDisplayModel) {
        return new C12740p(segmentedControlDisplayModel.getNameDisplay(), segmentedControlDisplayModel.getId(), null, 4, null);
    }
}

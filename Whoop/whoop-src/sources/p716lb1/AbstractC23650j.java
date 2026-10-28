package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.anchorSelector.AnchorSectionModel;
import com.whoop.design.models.anchorSelector.AnchorSectionModelMappingKt;
import com.whoop.design.models.anchorSelector.AnchorSelectorModel;
import com.whoop.design.models.anchorSelector.SegmentedControlDisplayModel;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e51.AbstractC12730f;
import e51.C12729e;
import e51.C12738n;
import e51.C12740p;
import e51.EnumC12728d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k11.C22123f;
import l60.C23374a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "Lm91/u;", "j", "(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Lm91/u;", "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;", "Le51/p;", "k", "(Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;)Le51/p;", "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;", "Le51/e;", "i", "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Le51/e;", "Ljb1/a;", "f", "()Ljb1/a;", "Llb1/y0;", "a", "Llb1/y0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Llb1/y0;", "anchorSelectorMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23650j {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93809a = Function1.m68251a(new C23587a(14));

    /* JADX INFO: renamed from: lb1.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93810w;

        public a(Function1 function1) {
            this.f93810w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93810w.invoke((AnchorSelectorModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68898d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AnchorSelectorModel.class), new a(new C23587a(15)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC25312u m68899e(AnchorSelectorModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68904j(model);
    }

    /* JADX INFO: renamed from: f */
    private static final C21535a m68900f() {
        return AbstractC21537c.m60554d(new C23374a(26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m68901g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final C23743y0 m68902h() {
        return f93809a;
    }

    /* JADX INFO: renamed from: i */
    private static final C12729e m68903i(AnchorSectionModel anchorSectionModel) {
        EnumC12728d enumC12728d;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(anchorSectionModel.getTitle());
        String type = anchorSectionModel.getType();
        List<InterfaceC25312u> listM60540g = m68900f().m60540g(anchorSectionModel.getItems());
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
        return new C12729e(textResourceM21278l, type, listM60540g, enumC12728d == null ? enumC12728d2 : enumC12728d, AnchorSectionModelMappingKt.resolveTitleTypography(anchorSectionModel), AnchorSectionModelMappingKt.resolveAnchorSectionHeaderState(anchorSectionModel), AnchorSectionModelMappingKt.resolveLeadingPadding(anchorSectionModel), AnchorSectionModelMappingKt.resolveTrailingPadding(anchorSectionModel), null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC25312u m68904j(AnchorSelectorModel anchorSelectorModel) {
        C22123f c22123fM63348b;
        AbstractC22676k.m65750j(anchorSelectorModel, "<this>");
        EmptyTileModel emptyTile = anchorSelectorModel.getEmptyTile();
        if (emptyTile == null) {
            c22123fM63348b = null;
        } else {
            if (!anchorSelectorModel.isSearchActive() || !anchorSelectorModel.getItems().isEmpty()) {
                emptyTile = null;
            }
            if (emptyTile != null) {
                c22123fM63348b = C22123f.m63348b(AbstractC23645i1.m68864c(emptyTile), null, null, null, null, null, null, null, null, null, false, false, null, AbstractC12730f.m35600a(), 4095, null);
            } else {
                c22123fM63348b = null;
            }
        }
        if (c22123fM63348b != null) {
            return c22123fM63348b;
        }
        List<SegmentedControlDisplayModel> tags = anchorSelectorModel.getTags();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tags, 10));
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            arrayList.add(m68905k((SegmentedControlDisplayModel) it.next()));
        }
        List<AnchorSectionModel> items = anchorSelectorModel.getItems();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it3 = items.iterator();
        while (it3.hasNext()) {
            arrayList2.add(m68903i((AnchorSectionModel) it3.next()));
        }
        SegmentedControlDisplayModel segmentedControlDisplayModel = (SegmentedControlDisplayModel) AbstractC25265s.m74100H0(anchorSelectorModel.getTags());
        return new C12738n(arrayList, arrayList2, segmentedControlDisplayModel != null ? segmentedControlDisplayModel.getId() : null, null, AnchorSectionModelMappingKt.resolveTagsHorizontalInset(anchorSelectorModel), 8, null);
    }

    /* JADX INFO: renamed from: k */
    private static final C12740p m68905k(SegmentedControlDisplayModel segmentedControlDisplayModel) {
        return new C12740p(segmentedControlDisplayModel.getNameDisplay(), segmentedControlDisplayModel.getId(), segmentedControlDisplayModel.getAnalyticEvent());
    }
}

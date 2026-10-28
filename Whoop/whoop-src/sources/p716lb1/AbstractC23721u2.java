package p716lb1;

import b01.C2182c;
import b01.C2183d;
import b01.C2188i;
import b01.C2196q;
import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.BiomarkerModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.ExpandableListModel;
import com.whoop.design.models.items.ExpandableRowItemModel;
import com.whoop.design.models.items.FeatureItemModel;
import com.whoop.design.models.items.FeatureListModel;
import com.whoop.design.models.items.FeedbackSurveyModel;
import com.whoop.design.models.items.FlowRowHorizontalSpacing;
import com.whoop.design.models.items.FlowRowModel;
import com.whoop.design.models.items.HorizontalDividedListItem;
import com.whoop.design.models.items.HorizontalDividedListItemDialogInfo;
import com.whoop.design.models.items.HorizontalDividedListModel;
import com.whoop.design.models.items.InfoRowItemModel;
import com.whoop.design.models.items.InfoRowListModel;
import com.whoop.design.models.items.InteractiveTileModel;
import com.whoop.design.models.items.NumberedListItem;
import com.whoop.design.models.items.NumberedListModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.TextAreaModel;
import com.whoop.design.models.items.WaitlistBiomarkerListPreviewModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21535a;
import kd1.AbstractC22403o;
import l01.C23031c;
import l01.C23032d;
import l01.EnumC23033e;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import ny0.C27256h;
import ny0.C27273p0;
import p026b2.C2299e;
import p026b2.InterfaceC2301g;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p736sz0.C33175e0;
import p736sz0.C33184h0;
import p736sz0.C33194k1;
import p736sz0.C33198m;
import p736sz0.C33213r;
import p736sz0.C33222u;
import p745y81.EnumC39333f;
import q11.C29795e;
import q11.C29799i;
import q71.C30011b;
import q71.C30012c;
import q71.C30014e;
import q71.EnumC30016g;
import q71.EnumC30017h;
import t11.C33306f;
import t11.C33307g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lb1.u2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001c\u001a\u00020\u001b*\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010 \u001a\u00020\u001f*\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u0015\u0010$\u001a\u00020#*\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0015\u0010(\u001a\u00020'*\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)\"\u001a\u0010/\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/FeatureListModel;", "Lm91/u;", "v", "(Lcom/whoop/design/models/items/FeatureListModel;)Lm91/u;", "Lcom/whoop/design/models/items/ExpandableListModel;", "model", "Lq11/e;", "j", "(Lcom/whoop/design/models/items/ExpandableListModel;)Lq11/e;", "Lcom/whoop/design/models/items/NumberedListModel;", "Lsz0/h0;", "u", "(Lcom/whoop/design/models/items/NumberedListModel;)Lsz0/h0;", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "cta", "Lny0/p0;", "A", "(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;", "Lcom/whoop/design/models/items/InfoRowListModel;", "Lsz0/u;", "y", "(Lcom/whoop/design/models/items/InfoRowListModel;)Lsz0/u;", "Lcom/whoop/design/models/items/WaitlistBiomarkerListPreviewModel;", "Lb01/i;", "z", "(Lcom/whoop/design/models/items/WaitlistBiomarkerListPreviewModel;)Lb01/i;", "Lcom/whoop/design/models/items/FeedbackSurveyModel;", "Lt11/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/design/models/items/FeedbackSurveyModel;)Lt11/f;", "Lcom/whoop/design/models/items/FlowRowModel;", "Lsz0/m;", "x", "(Lcom/whoop/design/models/items/FlowRowModel;)Lsz0/m;", "Lcom/whoop/design/models/items/FlowRowHorizontalSpacing;", "Ly3/f;", "B", "(Lcom/whoop/design/models/items/FlowRowHorizontalSpacing;)F", "", "Lb2/g;", "C", "(Ljava/lang/String;)Lb2/g;", "Llb1/y0;", "a", "Llb1/y0;", "k", "()Llb1/y0;", "listMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23721u2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93998a = Function1.m68251a(new C23715t2(0));

    /* JADX INFO: renamed from: lb1.u2$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93999a;

        static {
            int[] iArr = new int[FlowRowHorizontalSpacing.values().length];
            try {
                iArr[FlowRowHorizontalSpacing.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowRowHorizontalSpacing.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowRowHorizontalSpacing.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowRowHorizontalSpacing.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f93999a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.u2$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94000w;

        public b(Function1 function1) {
            this.f94000w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94000w.invoke((FeatureListModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u2$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94001w;

        public c(Function1 function1) {
            this.f94001w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94001w.invoke((ExpandableListModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u2$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94002w;

        public d(Function1 function1) {
            this.f94002w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94002w.invoke((NumberedListModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u2$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94003w;

        public e(Function1 function1) {
            this.f94003w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94003w.invoke((InfoRowListModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u2$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94004w;

        public f(Function1 function1) {
            this.f94004w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94004w.invoke((FlowRowModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u2$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94005w;

        public g(Function1 function1) {
            this.f94005w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94005w.invoke((WaitlistBiomarkerListPreviewModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u2$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94006w;

        public h(Function1 function1) {
            this.f94006w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94006w.invoke((FeedbackSurveyModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u2$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94007w;

        public i(Function1 function1) {
            this.f94007w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94007w.invoke((HorizontalDividedListModel) it);
        }
    }

    /* JADX INFO: renamed from: A */
    private static final C27273p0 m69494A(SecondaryButtonModel secondaryButtonModel) {
        return AbstractC23613d4.m68666p(secondaryButtonModel);
    }

    /* JADX INFO: renamed from: B */
    private static final float m69495B(FlowRowHorizontalSpacing flowRowHorizontalSpacing) {
        float f13;
        int i13 = flowRowHorizontalSpacing == null ? -1 : a.f93999a[flowRowHorizontalSpacing.ordinal()];
        if (i13 != -1) {
            if (i13 == 1) {
                return 0;
            }
            if (i13 == 2) {
                f13 = 0.5f;
            } else if (i13 != 3) {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = 1.5f;
            }
            return 8 * f13;
        }
        return 1 * 8;
    }

    /* JADX INFO: renamed from: C */
    private static final InterfaceC2301g m69496C(String str) {
        String upperCase;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (AbstractC22676k.m65745e(upperCase, "CENTER")) {
            return C2299e.f9108K;
        }
        return AbstractC22676k.m65745e(upperCase, "BOTTOM") ? C2299e.f9109L : C2299e.f9107J;
    }

    /* JADX INFO: renamed from: j */
    public static final C29795e m69506j(ExpandableListModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String id4 = model.getId();
        String header = model.getHeader();
        List<ExpandableRowItemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (ExpandableRowItemModel expandableRowItemModel : items) {
            String id5 = expandableRowItemModel.getId();
            String titleDisplay = expandableRowItemModel.getTitleDisplay();
            String descriptionDisplay = expandableRowItemModel.getDescriptionDisplay();
            DesignSystemModel rightItem = expandableRowItemModel.getRightItem();
            arrayList.add(new C29799i(id5, titleDisplay, descriptionDisplay, rightItem != null ? c21535aM60555e.m60541h(rightItem) : null, expandableRowItemModel.getPrimaryAnalyticEvent()));
        }
        SecondaryButtonModel cta = model.getCta();
        return new C29795e(id4, header, arrayList, cta != null ? AbstractC23613d4.m68666p(cta) : null);
    }

    /* JADX INFO: renamed from: k */
    public static final C23743y0 m69507k() {
        return f93998a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m69508l(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23715t2 c23715t2 = new C23715t2(1);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(FeatureListModel.class), new b(c23715t2));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ExpandableListModel.class), new c(new C23715t2(2)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(NumberedListModel.class), new d(new C23715t2(3)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(InfoRowListModel.class), new e(new C23715t2(4)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(FlowRowModel.class), new f(new C23715t2(5)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(WaitlistBiomarkerListPreviewModel.class), new g(new C23715t2(6)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(FeedbackSurveyModel.class), new h(new C23715t2(7)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HorizontalDividedListModel.class), new i(new C23715t2(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC25312u m69509m(FeatureListModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69518v(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C29795e m69510n(ExpandableListModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69506j(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C33184h0 m69511o(NumberedListModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69517u(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C33222u m69512p(InfoRowListModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69521y(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C33198m m69513q(FlowRowModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69520x(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C2188i m69514r(WaitlistBiomarkerListPreviewModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69522z(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C33306f m69515s(FeedbackSurveyModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69519w(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C30014e m69516t(HorizontalDividedListModel model) {
        EnumC30017h enumC30017h;
        Iterator it;
        EnumC30016g enumC30016g;
        EnumC30016g enumC30016g2;
        EnumC30017h enumC30017h2;
        AbstractC22676k.m65750j(model, "model");
        List<HorizontalDividedListItem> listItems = model.getListItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listItems, 10));
        Iterator it3 = listItems.iterator();
        while (it3.hasNext()) {
            HorizontalDividedListItem horizontalDividedListItem = (HorizontalDividedListItem) it3.next();
            String id4 = horizontalDividedListItem.getId();
            TextResource title = horizontalDividedListItem.getTitle();
            TextResource subtitle = horizontalDividedListItem.getSubtitle();
            String imageUrl = horizontalDividedListItem.getImageUrl();
            AbstractC22403o.c cVar = imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null;
            String icon = horizontalDividedListItem.getIcon();
            EnumC16313m0 enumC16313m0M46377b = icon != null ? AbstractC16315n0.m46377b(icon) : null;
            String mainImage = horizontalDividedListItem.getMainImage();
            AbstractC22403o.c cVar2 = mainImage != null ? new AbstractC22403o.c(mainImage, 0, 0, 0, 14, null) : null;
            String mainImageStyle = horizontalDividedListItem.getMainImageStyle();
            int i13 = 0;
            if (mainImageStyle != null) {
                EnumC30017h enumC30017h3 = EnumC30017h.ICON;
                EnumC30017h[] enumC30017hArrValues = EnumC30017h.values();
                int length = enumC30017hArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        enumC30017h2 = null;
                        break;
                    }
                    enumC30017h2 = enumC30017hArrValues[i14];
                    if (AbstractC22676k.m65745e(enumC30017h2.name(), mainImageStyle)) {
                        break;
                    }
                    i14++;
                }
                if (enumC30017h2 != null) {
                    enumC30017h3 = enumC30017h2;
                }
                enumC30017h = enumC30017h3;
            } else {
                enumC30017h = null;
            }
            String mainImagePosition = horizontalDividedListItem.getMainImagePosition();
            if (mainImagePosition != null) {
                EnumC30016g enumC30016g3 = EnumC30016g.TOP;
                EnumC30016g[] enumC30016gArrValues = EnumC30016g.values();
                int length2 = enumC30016gArrValues.length;
                while (true) {
                    if (i13 >= length2) {
                        it = it3;
                        enumC30016g2 = null;
                        break;
                    }
                    enumC30016g2 = enumC30016gArrValues[i13];
                    it = it3;
                    if (AbstractC22676k.m65745e(enumC30016g2.name(), mainImagePosition)) {
                        break;
                    }
                    i13++;
                    it3 = it;
                }
                if (enumC30016g2 != null) {
                    enumC30016g3 = enumC30016g2;
                }
                enumC30016g = enumC30016g3;
            } else {
                it = it3;
                enumC30016g = null;
            }
            HorizontalDividedListItemDialogInfo dialogInfo = horizontalDividedListItem.getDialogInfo();
            arrayList.add(new C30012c(id4, title, subtitle, cVar, enumC16313m0M46377b, cVar2, enumC30017h, enumC30016g, dialogInfo != null ? new C30011b(dialogInfo.getTitle(), dialogInfo.getSubtitle(), dialogInfo.getButtonText()) : null));
            it3 = it;
        }
        return new C30014e(arrayList);
    }

    /* JADX INFO: renamed from: u */
    public static final C33184h0 m69517u(NumberedListModel numberedListModel) {
        AbstractC22676k.m65750j(numberedListModel, "<this>");
        List<NumberedListItem> info = numberedListModel.getInfo();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(info, 10));
        Iterator<T> it = info.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                return new C33184h0(arrayList, numberedListModel.getCta() != null ? m69494A(numberedListModel.getCta()) : null);
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            NumberedListItem numberedListItem = (NumberedListItem) next;
            TextResource textResourceM21278l = AbstractC8693b.m21278l(numberedListItem.getHeaderText());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(numberedListItem.getDescriptionText());
            SecondaryButtonModel cta = numberedListItem.getCta();
            arrayList.add(new C33175e0(i14, textResourceM21278l, textResourceM21278l2, cta != null ? m69494A(cta) : null, i13 < numberedListModel.getInfo().size() - 1, i13 < numberedListModel.getInfo().size() - 1));
            i13 = i14;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x016f  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:92:0x0130  */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC25312u m69518v(FeatureListModel featureListModel) {
        EnumC23033e enumC23033e;
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        EnumC39333f enumC39333f3;
        float f13;
        EnumC2888c enumC2888c;
        EnumC39333f enumC39333f4;
        EnumC39333f enumC39333f5;
        FeatureListModel featureListModel2 = featureListModel;
        AbstractC22676k.m65750j(featureListModel2, "<this>");
        String title = featureListModel2.getTitle();
        TextResource.C8691e c8691eM21279m = title != null ? AbstractC8693b.m21279m(title) : null;
        Boolean showDivider = featureListModel2.getShowDivider();
        boolean zBooleanValue = showDivider != null ? showDivider.booleanValue() : false;
        String style = featureListModel2.getStyle();
        if (style == null) {
            style = "";
        }
        EnumC23033e enumC23033e2 = EnumC23033e.CHECKLIST;
        EnumC23033e[] enumC23033eArrValues = EnumC23033e.values();
        int length = enumC23033eArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC23033e = null;
                break;
            }
            enumC23033e = enumC23033eArrValues[i13];
            if (AbstractC22676k.m65745e(enumC23033e.name(), style)) {
                break;
            }
            i13++;
        }
        if (enumC23033e != null) {
            enumC23033e2 = enumC23033e;
        }
        List<FeatureItemModel> items = featureListModel2.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (FeatureItemModel featureItemModel : items) {
            String title2 = featureItemModel.getTitle();
            String textColor = featureItemModel.getTextColor();
            if (textColor == null) {
                String style2 = featureListModel2.getStyle();
                enumC39333f = (AbstractC22676k.m65745e(style2, "CHECKLIST") && AbstractC22676k.m65745e(style2, "INFO")) ? EnumC39333f.RECOVERY : EnumC39333f.BRAND_WHITE;
            } else {
                if (textColor.length() <= 0) {
                    textColor = null;
                }
                if (textColor != null) {
                    enumC39333f = EnumC39333f.BRAND_WHITE;
                    EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
                    int length2 = enumC39333fArrValues.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length2) {
                            enumC39333f5 = enumC39333fArrValues[i14];
                            if (!AbstractC22676k.m65745e(enumC39333f5.name(), textColor)) {
                                i14++;
                            }
                        } else {
                            enumC39333f5 = null;
                        }
                    }
                    if (enumC39333f5 != null) {
                        enumC39333f = enumC39333f5;
                    }
                    if (enumC39333f == null) {
                        String style3 = featureListModel2.getStyle();
                        if (AbstractC22676k.m65745e(style3, "CHECKLIST")) {
                            enumC39333f = EnumC39333f.BRAND_WHITE;
                        }
                    }
                } else {
                    String style4 = featureListModel2.getStyle();
                    if (AbstractC22676k.m65745e(style4, "CHECKLIST")) {
                        enumC39333f = EnumC39333f.BRAND_WHITE;
                    }
                }
            }
            EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(featureItemModel.getIcon());
            String iconStyle = featureItemModel.getIconStyle();
            if (iconStyle != null) {
                switch (iconStyle.hashCode()) {
                    case -627931896:
                        if (iconStyle.equals("ACCENT_NEGATIVE_TREND")) {
                            enumC39333f2 = EnumC39333f.ACCENT_NEGATIVE_TREND_15;
                        } else {
                            enumC39333f2 = null;
                        }
                        break;
                    case 1035885315:
                        if (iconStyle.equals("ACCENT_INFO")) {
                            enumC39333f2 = EnumC39333f.NEUTRAL_15;
                        } else {
                            enumC39333f2 = null;
                        }
                        break;
                    case 1350129903:
                        if (iconStyle.equals("POSITIVE_CHECKMARK")) {
                            enumC39333f2 = EnumC39333f.ACCENT_POSITIVE_TREND_15;
                        } else {
                            enumC39333f2 = null;
                        }
                        break;
                    case 2017352774:
                        iconStyle.equals("NEUTRAL_INFO");
                        enumC39333f2 = null;
                        break;
                    default:
                        enumC39333f2 = null;
                        break;
                }
            } else {
                enumC39333f2 = null;
            }
            String iconStyle2 = featureItemModel.getIconStyle();
            if (iconStyle2 != null) {
                switch (iconStyle2) {
                    case "ACCENT_NEGATIVE_TREND":
                        enumC39333f4 = EnumC39333f.ACCENT_NEGATIVE_TREND;
                        enumC39333f3 = enumC39333f4;
                        break;
                    case "ACCENT_INFO":
                        enumC39333f4 = EnumC39333f.RECOVERY;
                        enumC39333f3 = enumC39333f4;
                        break;
                    case "POSITIVE_CHECKMARK":
                        enumC39333f4 = EnumC39333f.ACCENT_POSITIVE_TREND;
                        enumC39333f3 = enumC39333f4;
                        break;
                    case "NEUTRAL_INFO":
                        enumC39333f4 = EnumC39333f.WHITE_70;
                        enumC39333f3 = enumC39333f4;
                        break;
                    default:
                        enumC39333f3 = null;
                        break;
                }
            } else {
                enumC39333f3 = null;
            }
            if (AbstractC22676k.m65745e(featureItemModel.getIconStyle(), "NEUTRAL_INFO")) {
                float f14 = 4;
                f13 = f14 * f14;
            } else {
                f13 = ((float) 2.5d) * 4;
            }
            float f15 = f13;
            String textStyle = featureItemModel.getTextStyle();
            if (textStyle != null) {
                EnumC2888c[] enumC2888cArrValues = EnumC2888c.values();
                int length3 = enumC2888cArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 < length3) {
                        enumC2888c = enumC2888cArrValues[i15];
                        if (!AbstractC22676k.m65745e(enumC2888c.name(), textStyle)) {
                            i15++;
                        }
                    } else {
                        enumC2888c = null;
                    }
                }
                if (enumC2888c == null) {
                    enumC2888c = EnumC2888c.B2;
                }
            } else {
                enumC2888c = EnumC2888c.B2;
            }
            arrayList.add(new C23031c(title2, enumC39333f, enumC16313m0M46377b, enumC39333f2, enumC39333f3, null, f15, enumC2888c, 32, null));
            featureListModel2 = featureListModel;
        }
        return new C23032d(c8691eM21279m, zBooleanValue, enumC23033e2, arrayList);
    }

    /* JADX INFO: renamed from: w */
    public static final C33306f m69519w(FeedbackSurveyModel feedbackSurveyModel) {
        AbstractC22676k.m65750j(feedbackSurveyModel, "<this>");
        String id4 = feedbackSurveyModel.getId();
        C33194k1 c33194k1M69557g = AbstractC23723u4.m69557g(feedbackSurveyModel.getTitleSubtitle());
        List<InteractiveTileModel> options = feedbackSurveyModel.getOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        for (InteractiveTileModel interactiveTileModel : options) {
            arrayList.add(new C33307g(interactiveTileModel.getId(), AbstractC8693b.m21278l(interactiveTileModel.getText()), interactiveTileModel.getAutoFocus()));
        }
        TextAreaModel textArea = feedbackSurveyModel.getTextArea();
        return new C33306f(id4, c33194k1M69557g, arrayList, textArea != null ? AbstractC23711s4.m69413f(textArea) : null);
    }

    /* JADX INFO: renamed from: x */
    public static final C33198m m69520x(FlowRowModel flowRowModel) {
        AbstractC22676k.m65750j(flowRowModel, "<this>");
        List<DesignSystemModel> items = flowRowModel.getItems();
        List<InterfaceC25312u> listM60540g = items != null ? AbstractC21537c.m60555e(null, 1, null).m60540g(items) : null;
        if (listM60540g == null) {
            listM60540g = C25271y.f99162w;
        }
        return new C33198m(listM60540g, m69496C(flowRowModel.getVerticalAlignment()), m69495B(flowRowModel.getHorizontalSpacing()), null);
    }

    /* JADX INFO: renamed from: y */
    public static final C33222u m69521y(InfoRowListModel infoRowListModel) {
        AbstractC22676k.m65750j(infoRowListModel, "<this>");
        List<InfoRowItemModel> items = infoRowListModel.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (InfoRowItemModel infoRowItemModel : items) {
            arrayList.add(new C33213r(new AbstractC22403o.c(infoRowItemModel.getImageUrl(), AbstractC11895b.m31985d(C38072d.f163053a), 0, 0, 12, null), AbstractC8693b.m21278l(infoRowItemModel.getText())));
        }
        return new C33222u(arrayList);
    }

    /* JADX INFO: renamed from: z */
    public static final C2188i m69522z(WaitlistBiomarkerListPreviewModel waitlistBiomarkerListPreviewModel) {
        AbstractC22676k.m65750j(waitlistBiomarkerListPreviewModel, "<this>");
        C27256h c27256h = null;
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String searchPlaceholder = waitlistBiomarkerListPreviewModel.getSearchPlaceholder();
        List<BiomarkerModel> biomarkers = waitlistBiomarkerListPreviewModel.getBiomarkers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(biomarkers, 10));
        for (BiomarkerModel biomarkerModel : biomarkers) {
            arrayList.add(new C2182c(biomarkerModel.getId(), biomarkerModel.getName(), AbstractC16315n0.m46377b(biomarkerModel.getTrailingIcon()), biomarkerModel.getModal()));
        }
        C2196q c2196q = new C2196q("", searchPlaceholder, arrayList);
        C2183d c2183d = new C2183d(waitlistBiomarkerListPreviewModel.getCta().getText(), waitlistBiomarkerListPreviewModel.getCta().getAction());
        CardButtonModel button = waitlistBiomarkerListPreviewModel.getButton();
        if (button != null) {
            InterfaceC25312u interfaceC25312uM60541h = c21535aM60555e.m60541h(button);
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
            c27256h = (C27256h) interfaceC25312uM60541h;
        }
        return new C2188i(c2196q, c2183d, c27256h);
    }
}

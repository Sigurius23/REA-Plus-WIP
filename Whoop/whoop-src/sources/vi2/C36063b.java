package vi2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.TitleSubTitleModel;
import com.whoop.design.models.celebration.CelebrationMediaModel;
import com.whoop.design.models.items.HorizontalDividedListItem;
import com.whoop.design.models.items.HorizontalDividedListItemDialogInfo;
import com.whoop.design.models.items.HorizontalDividedListModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import h01.InterfaceC16556w;
import hy0.C17749h0;
import i51.C18112i;
import java.util.ArrayList;
import java.util.List;
import jb1.C21535a;
import jk0.EnumC21747a;
import kd1.AbstractC22403o;
import m83.AbstractC25265s;
import n83.C26460c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33194k1;
import p745y81.EnumC39333f;
import q71.C30014e;
import qi2.InterfaceC30414b;
import s21.C32078a;
import s21.C32085h;
import ti2.C33857d;
import ti2.C33860g;
import u21.C34481a;
import u21.C34484d;
import ui2.C35022c;
import ui2.EnumC35020a;
import ui2.EnumC35021b;
import v41.InterfaceC35689r0;
import ve0.C35926d;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;

/* JADX INFO: renamed from: vi2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 12\u00020\u0001:\u0001/B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b&\u0010'J'\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, m65681d2 = {"Lvi2/b;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "", "Lm91/u;", "reducedBffItems", "Ljk0/a;", "strapBodyStatus", "f", "(Ljava/util/List;Ljk0/a;)Ljava/util/List;", "", "showMaxStreakDialog", "showRestorationDialog", "Lcom/whoop/design/models/DesignSystemModel;", "bffItems", "Lti2/g$a;", "k", "(ZZLjava/util/List;Ljava/util/List;)Lti2/g$a;", "c", "(Ljava/util/List;)Lti2/g$a;", "reducedItems", "d", "Lcom/whoop/design/models/items/HorizontalDividedListItemDialogInfo;", "g", "(Ljava/util/List;)Lcom/whoop/design/models/items/HorizontalDividedListItemDialogInfo;", "Ls21/h;", "", "e", "(Ls21/h;)Ljava/lang/String;", "Lui2/a;", "streakState", "Ly81/f;", "l", "(Lui2/a;)Ly81/f;", "Lui2/b;", "j", "(Lui2/a;)Lui2/b;", "Lqi2/b;", "domainResult", "Lti2/d;", "streakLottieState", "Lti2/g;", "m", "(Lqi2/b;Ljk0/a;Lti2/d;)Lti2/g;", "a", "Ljb1/a;", "b", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36063b {

    /* JADX INFO: renamed from: c */
    public static final int f154005c = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: vi2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f154007a;

        static {
            int[] iArr = new int[EnumC35020a.values().length];
            try {
                iArr[EnumC35020a.FROZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f154007a = iArr;
        }
    }

    /* JADX INFO: renamed from: vi2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f154008w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof C17749h0);
        }
    }

    /* JADX INFO: renamed from: vi2.b$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f154009w = new d();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof HorizontalDividedListModel);
        }
    }

    public C36063b(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: c */
    private final C33860g.a m114521c(List<? extends DesignSystemModel> bffItems) {
        HorizontalDividedListItemDialogInfo horizontalDividedListItemDialogInfoM114525g = m114525g(bffItems);
        if (horizontalDividedListItemDialogInfoM114525g != null) {
            return new C33860g.a.C42396a(horizontalDividedListItemDialogInfoM114525g.getTitle(), horizontalDividedListItemDialogInfoM114525g.getSubtitle(), horizontalDividedListItemDialogInfoM114525g.getButtonText());
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final C33860g.a m114522d(List<? extends InterfaceC25312u> reducedItems) {
        C32078a dialogInfo;
        ArrayList arrayList = new ArrayList();
        for (Object obj : reducedItems) {
            if (obj instanceof C32085h) {
                arrayList.add(obj);
            }
        }
        C32085h c32085h = (C32085h) AbstractC25265s.m74100H0(arrayList);
        if (c32085h == null || (dialogInfo = c32085h.getDialogInfo()) == null) {
            return null;
        }
        return new C33860g.a.b(dialogInfo.getTitle(), dialogInfo.getSubtitle(), m114523e(c32085h), dialogInfo.m99783a());
    }

    /* JADX INFO: renamed from: e */
    private final String m114523e(C32085h c32085h) {
        List<InterfaceC25312u> listM99783a;
        C17749h0 c17749h0;
        AbstractC22403o image;
        C32078a dialogInfo = c32085h.getDialogInfo();
        if (dialogInfo == null || (listM99783a = dialogInfo.m99783a()) == null || (c17749h0 = (C17749h0) AbstractC38176k.m122283s(AbstractC38176k.m122282r(AbstractC25265s.m74145r0(listM99783a), c.f154008w))) == null || (image = c17749h0.getImage()) == null || !(image instanceof AbstractC22403o.c)) {
            return null;
        }
        Object data = ((AbstractC22403o.c) image).getData();
        if (data instanceof String) {
            return (String) data;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final List<InterfaceC25312u> m114524f(List<? extends InterfaceC25312u> reducedBffItems, EnumC21747a strapBodyStatus) {
        C26460c c26460c = new C26460c(reducedBffItems.size());
        for (InterfaceC25312u interfaceC25312u : reducedBffItems) {
            if (interfaceC25312u instanceof C30014e) {
                c26460c.add(interfaceC25312u);
            } else if (interfaceC25312u instanceof InterfaceC16556w) {
                if ((strapBodyStatus == EnumC21747a.STRAP_OFF_BODY || strapBodyStatus == EnumC21747a.UNKNOWN) ? AbstractC22676k.m65745e(((InterfaceC16556w) interfaceC25312u).getId(), "off_body_state") : !AbstractC22676k.m65745e(((InterfaceC16556w) interfaceC25312u).getId(), "off_body_state")) {
                    c26460c.add(interfaceC25312u);
                }
            } else if ((interfaceC25312u instanceof C34484d) || (interfaceC25312u instanceof C34481a)) {
                c26460c.add(interfaceC25312u);
            } else {
                c26460c.add(interfaceC25312u);
            }
        }
        return AbstractC37056f.m118988k(c26460c);
    }

    /* JADX INFO: renamed from: g */
    private final HorizontalDividedListItemDialogInfo m114525g(List<? extends DesignSystemModel> list) {
        return (HorizontalDividedListItemDialogInfo) AbstractC38176k.m122283s(AbstractC38176k.m122273B(AbstractC38176k.m122285u(AbstractC38176k.m122282r(AbstractC25265s.m74145r0(list), d.f154009w), new C35926d(8)), new C35926d(9)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Iterable m114526h(HorizontalDividedListModel it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getListItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final HorizontalDividedListItemDialogInfo m114527i(HorizontalDividedListItem it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getDialogInfo();
    }

    /* JADX INFO: renamed from: j */
    private final EnumC35021b m114528j(EnumC35020a streakState) {
        return (streakState == null ? -1 : b.f154007a[streakState.ordinal()]) == 1 ? EnumC35021b.RESTORATION_GRADIENT : EnumC35021b.NONE;
    }

    /* JADX INFO: renamed from: k */
    private final C33860g.a m114529k(boolean showMaxStreakDialog, boolean showRestorationDialog, List<? extends InterfaceC25312u> reducedBffItems, List<? extends DesignSystemModel> bffItems) {
        if (showMaxStreakDialog) {
            return m114521c(bffItems);
        }
        if (showRestorationDialog) {
            return m114522d(reducedBffItems);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    private final EnumC39333f m114530l(EnumC35020a streakState) {
        return (streakState == null ? -1 : b.f154007a[streakState.ordinal()]) == 1 ? EnumC39333f.STRAIN_ZONE_2 : EnumC39333f.BRAND_WHITE;
    }

    /* JADX INFO: renamed from: m */
    public final C33860g m114531m(InterfaceC30414b domainResult, EnumC21747a strapBodyStatus, C33857d streakLottieState) {
        C18112i c18112i;
        C33194k1 c33194k1;
        EnumC35020a enumC35020a;
        EnumC35020a enumC35020a2;
        InterfaceC30414b.c cVar;
        EnumC35020a enumC35020a3;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AbstractC22676k.m65750j(strapBodyStatus, "strapBodyStatus");
        AbstractC22676k.m65750j(streakLottieState, "streakLottieState");
        if (domainResult instanceof InterfaceC30414b.b) {
            return new C33860g(true, false, null, null, null, 28, null);
        }
        if (domainResult instanceof InterfaceC30414b.a) {
            return new C33860g(false, true, null, null, null, 28, null);
        }
        if (!(domainResult instanceof InterfaceC30414b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC30414b.c cVar2 = (InterfaceC30414b.c) domainResult;
        List<InterfaceC25312u> listM60540g = this.designItemReducer.m60540g(cVar2.getBffData().getItems());
        TextResource title = cVar2.getBffData().getTitle();
        String lottieUrl = cVar2.getBffData().getLottieUrl();
        String strM113135b = lottieUrl != null ? InterfaceC35689r0.e.m113135b(lottieUrl) : null;
        InterfaceC35689r0.e eVarM113134a = strM113135b != null ? InterfaceC35689r0.e.m113134a(strM113135b) : null;
        String imageUrl = cVar2.getBffData().getImageUrl();
        AbstractC22403o.c cVar3 = imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null;
        CelebrationMediaModel celebrationMedia = cVar2.getBffData().getCelebrationMedia();
        if (celebrationMedia != null) {
            InterfaceC25312u interfaceC25312uM60544l = this.designItemReducer.m60544l(celebrationMedia);
            c18112i = interfaceC25312uM60544l instanceof C18112i ? (C18112i) interfaceC25312uM60544l : null;
        } else {
            c18112i = null;
        }
        TitleSubTitleModel titleSubtitle = cVar2.getBffData().getTitleSubtitle();
        if (titleSubtitle != null) {
            InterfaceC25312u interfaceC25312uM60544l2 = this.designItemReducer.m60544l(titleSubtitle);
            c33194k1 = interfaceC25312uM60544l2 instanceof C33194k1 ? (C33194k1) interfaceC25312uM60544l2 : null;
        } else {
            c33194k1 = null;
        }
        TextResource streakValue = cVar2.getBffData().getStreakValue();
        TextResource streakSubtitle = cVar2.getBffData().getStreakSubtitle();
        if (streakSubtitle == null) {
            streakSubtitle = AbstractC8693b.m21267a();
        }
        TextResource textResource = streakSubtitle;
        String streakState = cVar2.getBffData().getStreakState();
        EnumC35020a[] enumC35020aArrValues = EnumC35020a.values();
        int length = enumC35020aArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC35020a = null;
                break;
            }
            enumC35020a = enumC35020aArrValues[i13];
            if (AbstractC22676k.m65745e(enumC35020a.name(), streakState)) {
                break;
            }
            i13++;
        }
        String streakState2 = cVar2.getBffData().getStreakState();
        EnumC35020a[] enumC35020aArrValues2 = EnumC35020a.values();
        int length2 = enumC35020aArrValues2.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                enumC35020a2 = null;
                break;
            }
            enumC35020a2 = enumC35020aArrValues2[i14];
            if (AbstractC22676k.m65745e(enumC35020a2.name(), streakState2)) {
                break;
            }
            i14++;
        }
        EnumC39333f enumC39333fM114530l = m114530l(enumC35020a2);
        String streakState3 = cVar2.getBffData().getStreakState();
        EnumC35020a[] enumC35020aArrValues3 = EnumC35020a.values();
        int length3 = enumC35020aArrValues3.length;
        int i15 = 0;
        while (i15 < length3) {
            EnumC35020a enumC35020a4 = enumC35020aArrValues3[i15];
            cVar = cVar2;
            if (AbstractC22676k.m65745e(enumC35020a4.name(), streakState3)) {
                enumC35020a3 = enumC35020a4;
                return new C33860g(false, false, new C35022c(title, eVarM113134a, cVar3, c18112i, c33194k1, streakValue, textResource, enumC35020a, enumC39333fM114530l, m114528j(enumC35020a3), m114524f(listM60540g, strapBodyStatus), cVar.getBffData().getHeaderIcon(), cVar.getBffData().getHeaderIconDestination()), m114529k(cVar.getShowMaxStreakDialog(), cVar.getShowRestorationDialog(), listM60540g, cVar.getBffData().getItems()), streakLottieState);
            }
            i15++;
            cVar2 = cVar;
        }
        cVar = cVar2;
        enumC35020a3 = null;
        return new C33860g(false, false, new C35022c(title, eVarM113134a, cVar3, c18112i, c33194k1, streakValue, textResource, enumC35020a, enumC39333fM114530l, m114528j(enumC35020a3), m114524f(listM60540g, strapBodyStatus), cVar.getBffData().getHeaderIcon(), cVar.getBffData().getHeaderIconDestination()), m114529k(cVar.getShowMaxStreakDialog(), cVar.getShowRestorationDialog(), listM60540g, cVar.getBffData().getItems()), streakLottieState);
    }

    public /* synthetic */ C36063b(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC36062a.m114512e() : c21535a);
    }
}

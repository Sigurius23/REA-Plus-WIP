package uv2;

import c41.AbstractC3992b0;
import c41.C3985a0;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.dto.AddTileModel;
import com.whoop.weightlifting.data.dto.LinkWorkoutModel;
import com.whoop.weightlifting.data.dto.MenuItemModel;
import com.whoop.weightlifting.data.dto.MetaData;
import cu2.AbstractC11128h;
import ep0.C13404j;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import s01.C32048d;
import s01.EnumC32047c;
import tv2.C34210c;
import tv2.InterfaceC34208a;
import uk2.C35051a;
import y71.AbstractC39279l;
import y71.C39282o;

/* JADX INFO: renamed from: uv2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Luv2/d;", "", "<init>", "()V", "Ltv2/a$a;", "fullScreenModal", "Luv2/c;", "d", "(Ltv2/a$a;)Luv2/c;", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;", "result", "e", "(Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;)Luv2/c;", "Ltv2/c;", "domainState", "b", "(Ltv2/c;)Luv2/c;", "Ljb1/a;", "a", "Ljb1/a;", "getReducer", "()Ljb1/a;", "reducer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35287d {

    /* JADX INFO: renamed from: b */
    public static final int f150273b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer = AbstractC21537c.m60554d(new C35051a(17));

    /* JADX INFO: renamed from: uv2.d$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C32048d.m99589b((C32048d) it, null, null, null, null, null, null, EnumC32047c.COACH_GRADIENT, 63, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m111968c(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32048d.class), new a());
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    private final C35286c m111969d(InterfaceC34208a.a fullScreenModal) {
        int i13 = 2;
        C35286c.b bVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (AbstractC22676k.m65745e(fullScreenModal, InterfaceC34208a.b.f143496a)) {
            return new C35286c(new C35286c.a(AbstractC33208p0.c.f138471e, null, null, null, null, null, false, 126, null), bVar, i13, objArr5 == true ? 1 : 0);
        }
        if (AbstractC22676k.m65745e(fullScreenModal, InterfaceC34208a.c.f143497a)) {
            boolean z4 = false;
            AbstractC22403o abstractC22403o = null;
            boolean z13 = false;
            return new C35286c(new C35286c.a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35473h1), z4, abstractC22403o, 6, null), null, AbstractC8693b.m21277k(AbstractC11128h.f35409N), InterfaceC35284a.a.f150210a, null, 0 == true ? 1 : 0, z13, 114, null), objArr4 == true ? 1 : 0, i13, objArr3 == true ? 1 : 0);
        }
        if (!AbstractC22676k.m65745e(fullScreenModal, InterfaceC34208a.d.f143498a)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z14 = false;
        AbstractC22403o abstractC22403o2 = null;
        boolean z15 = false;
        return new C35286c(new C35286c.a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35506s1), z14, abstractC22403o2, 6, null), null, AbstractC8693b.m21277k(AbstractC11128h.f35409N), InterfaceC35284a.a.f150210a, null, 0 == true ? 1 : 0, z15, 114, null), objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    private final C35286c m111970e(LinkWorkoutModel result) {
        AddTileModel addTile;
        AiContextMetadata aiContextMetadata;
        if (result == null) {
            return m111969d(InterfaceC34208a.d.f143498a);
        }
        boolean z4 = result.getScreenContent().getBuilderCta() != null;
        TextResource title = result.getTitle();
        TextResource headline = result.getScreenContent().getHeadline();
        TextResource subtext = result.getScreenContent().getSubtext();
        MetaData metadata = result.getScreenContent().getMetadata();
        C13404j c13404jM18523a = (metadata == null || (aiContextMetadata = metadata.getAiContextMetadata()) == null) ? null : AbstractC6219a.m18523a(aiContextMetadata);
        DesignSystemModel aiChatCallout = result.getScreenContent().getAiChatCallout();
        InterfaceC25312u interfaceC25312uM60544l = aiChatCallout != null ? this.reducer.m60544l(aiChatCallout) : null;
        C3985a0 c3985a0 = (z4 || (addTile = result.getScreenContent().getAddTile()) == null) ? null : new C3985a0(null, AbstractC3992b0.c.f16257g, addTile.getTitle(), false, 0, null, null, 121, null);
        DesignSystemModel builderCta = result.getScreenContent().getBuilderCta();
        InterfaceC25312u interfaceC25312uM60544l2 = builderCta != null ? this.reducer.m60544l(builderCta) : null;
        DesignSystemModel divider = result.getScreenContent().getDivider();
        InterfaceC25312u interfaceC25312uM60544l3 = divider != null ? this.reducer.m60544l(divider) : null;
        List<MenuItemModel> templates = result.getScreenContent().getTemplates();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(templates, 10));
        for (MenuItemModel menuItemModel : templates) {
            TextResource templateName = menuItemModel.getTemplateName();
            InterfaceC35284a.f fVar = new InterfaceC35284a.f(menuItemModel.getTemplateId(), menuItemModel.getTemplateName());
            TextResource subtext2 = menuItemModel.getSubtext();
            if (subtext2 == null) {
                subtext2 = AbstractC8693b.m21267a();
            }
            arrayList.add(new C39282o(fVar, templateName, null, false, false, new AbstractC39279l.b(subtext2, null, null, null, null, null, null, null, null, null, null, false, 4094, null), false, null, null, null, false, null, null, null, null, 32732, null));
        }
        return new C35286c(null, new C35286c.b(title, headline, subtext, c13404jM18523a, interfaceC25312uM60544l, c3985a0, interfaceC25312uM60544l2, interfaceC25312uM60544l3, arrayList, z4), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    public final C35286c m111971b(C34210c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return domainState.getCurrentDialogType() instanceof InterfaceC34208a.a ? m111969d((InterfaceC34208a.a) domainState.getCurrentDialogType()) : m111970e(domainState.getBffModel());
    }
}

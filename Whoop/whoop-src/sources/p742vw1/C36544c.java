package p742vw1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.extensions.domain.models.Cta;
import com.whoop.membership.management.domain.models.ScreenSection;
import com.whoop.profile.view.edit.form.C9778b;
import gy0.AbstractC16272a;
import j11.EnumC21213p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import jb1.C21536b;
import jx1.C22015f0;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import qw1.C30689c;
import qw1.InterfaceC30687a;
import uw1.C35311d;
import uw1.C35315h;
import ww1.AbstractC37659e;
import ww1.InterfaceC37661g;

/* JADX INFO: renamed from: vw1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u0007*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lvw1/c;", "", "<init>", "()V", "Lqw1/a$a;", "", "isNewMember", "Luw1/d;", "f", "(Lqw1/a$a;Z)Luw1/d;", "Lqw1/a$e;", "Luw1/d$a;", "e", "(Lqw1/a$e;Z)Luw1/d$a;", "Lqw1/c;", "dialog", "g", "(Lqw1/c;Luw1/d$a;)Luw1/d;", "", "currentEmailText", "Lcom/whoop/design/util/TextResource;", "validationError", "Ljb1/a;", "b", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Ljb1/a;", "domainResult", "d", "(Lqw1/c;)Luw1/d;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36544c {

    /* JADX INFO: renamed from: vw1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ String f156468w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ TextResource f156469x;

        public a(String str, TextResource textResource) {
            this.f156468w = str;
            this.f156469x = textResource;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C35315h c35315h = (C35315h) it;
            String str = this.f156468w;
            return C35315h.m112157b(c35315h, null, str, this.f156469x, str.length() > 0 && AbstractC8693b.m21269c(this.f156469x), null, null, 49, null);
        }
    }

    /* JADX INFO: renamed from: b */
    private final C21535a m117167b(String currentEmailText, TextResource validationError) {
        return Function1.m117147g(new C9778b(currentEmailText, validationError, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m117168c(String str, TextResource textResource, C21536b familyPlanDesignItemReducer) {
        AbstractC22676k.m65750j(familyPlanDesignItemReducer, "$this$familyPlanDesignItemReducer");
        familyPlanDesignItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35315h.class), new a(str, textResource));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private final C35311d.a m117169e(InterfaceC30687a.e eVar, boolean z4) {
        if (!(eVar instanceof InterfaceC30687a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC30687a.b bVar = (InterfaceC30687a.b) eVar;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(bVar.getProgressContent().getTitle());
        String subtitle = bVar.getProgressContent().getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        String str = subtitle;
        Cta primaryCta = bVar.getProgressContent().getPrimaryCta();
        AbstractC22403o.c cVar = null;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(primaryCta != null ? primaryCta.getTitle() : null);
        if (bVar.getProgressContent().getIcon() != null) {
            String icon = bVar.getProgressContent().getIcon();
            int i13 = AbstractC16272a.f61976O4;
            cVar = new AbstractC22403o.c(icon, i13, i13, i13);
        }
        return new C35311d.a(textResourceM21278l, textResourceM21278l2, null, null, str, cVar, false, true, EnumC21213p.CENTER_ICON, AbstractC37659e.c.f161401a, null, 1036, null);
    }

    /* JADX INFO: renamed from: f */
    private final C35311d m117170f(InterfaceC30687a.a aVar, boolean z4) {
        if (aVar instanceof InterfaceC30687a.c) {
            return new C35311d(null, new C35311d.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC30687a.d) {
            return new C35311d(null, new C35311d.b(C33205o0.f138451a.m105289c(), new InterfaceC37661g.c(z4), null, AbstractC37659e.d.f161402a, 4, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC30687a.f) {
            return new C35311d(null, new C35311d.b(C33205o0.f138451a.m105291e(), new InterfaceC37661g.c(z4), null, AbstractC37659e.d.f161402a, 4, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    private final C35311d m117171g(C30689c c30689c, C35311d.a aVar) {
        C35311d.c cVar;
        C21535a c21535aM117167b = m117167b(c30689c.getCurrentEmailText(), c30689c.getValidationError());
        if (c30689c.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() != null) {
            boolean isNewMember = c30689c.getIsNewMember();
            String navigationBarText = c30689c.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getNavigationBarText();
            List<ScreenSection> sections = c30689c.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getSections();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                List<DesignSystemModel> items = ((ScreenSection) it.next()).getItems();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
                Iterator<T> it3 = items.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(c21535aM117167b.m60541h((DesignSystemModel) it3.next()));
                }
                arrayList.add(new C22015f0(arrayList2));
            }
            cVar = new C35311d.c(isNewMember, navigationBarText, arrayList);
        } else {
            cVar = null;
        }
        return new C35311d(aVar, null, cVar, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final C35311d m117172d(C30689c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        InterfaceC30687a currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC30687a.a) {
            return m117170f((InterfaceC30687a.a) domainResult.getCurrentDialogType(), domainResult.getIsNewMember());
        }
        return currentDialogType instanceof InterfaceC30687a.e ? m117171g(domainResult, m117169e((InterfaceC30687a.e) domainResult.getCurrentDialogType(), domainResult.getIsNewMember())) : m117171g(domainResult, null);
    }
}

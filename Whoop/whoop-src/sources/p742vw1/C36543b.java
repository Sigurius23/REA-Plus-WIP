package p742vw1;

import c41.C4092p2;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.management.domain.models.ScreenSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import jb1.C21536b;
import jx1.C22015f0;
import l83.C23454a0;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import p745y81.C39336i;
import pw1.C29586b;
import pw1.InterfaceC29587c;
import uw1.C35310c;
import vs2.C36478d;
import ww1.AbstractC37659e;
import ww1.InterfaceC37658d;

/* JADX INFO: renamed from: vw1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u0005*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lvw1/b;", "", "<init>", "()V", "Lpw1/c$b;", "Luw1/c;", "d", "(Lpw1/c$b;)Luw1/c;", "Lpw1/c$e;", "Luw1/c$a;", "c", "(Lpw1/c$e;)Luw1/c$a;", "Lpw1/b;", "dialog", "e", "(Lpw1/b;Luw1/c$a;)Luw1/c;", "domainResult", "b", "(Lpw1/b;)Luw1/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36543b {

    /* JADX INFO: renamed from: vw1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f156467w = new a();

        /* JADX INFO: renamed from: a */
        public final long m117165a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m117165a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c */
    private final C35310c.a m117160c(InterfaceC29587c.e eVar) {
        if (!(eVar instanceof InterfaceC29587c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC29587c.a aVar = (InterfaceC29587c.a) eVar;
        String userId = aVar.getUserId();
        String familyPlanId = aVar.getFamilyPlanId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(aVar.getResponse().getTitle());
        TextResource textResourceM21267a = AbstractC8693b.m21267a();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(aVar.getResponse().getPrimaryCta().getText());
        List<InfoCalloutTileModel> callouts = aVar.getResponse().getCallouts();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(callouts, 10));
        Iterator<T> it = callouts.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60541h = Function1.m117148h(null, 1, null).m60541h((InfoCalloutTileModel) it.next());
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.InfoCalloutState");
            arrayList.add(C4092p2.m12552b((C4092p2) interfaceC25312uM60541h, null, 0.0f, null, null, null, null, p745y81.Function1.m125323a(a.f156467w), null, null, null, null, null, null, false, null, null, null, null, null, null, 1048511, null));
        }
        return new C35310c.a(textResourceM21278l, textResourceM21278l2, null, AbstractC8693b.m21278l(aVar.getResponse().getSecondaryCta().getText()), textResourceM21267a, null, false, true, null, new InterfaceC37658d.c(aVar.getUserId(), aVar.getFamilyPlanId()), InterfaceC37658d.a.f161392a, arrayList, userId, familyPlanId, 260, null);
    }

    /* JADX INFO: renamed from: d */
    private final C35310c m117161d(InterfaceC29587c.b bVar) {
        if (bVar instanceof InterfaceC29587c.c) {
            return new C35310c(null, new C35310c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC29587c.d) {
            return new C35310c(null, new C35310c.b(C33205o0.f138451a.m105289c(), InterfaceC37658d.b.f161393a, null, AbstractC37659e.d.f161402a, 4, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC29587c.f) {
            return new C35310c(null, new C35310c.b(C33205o0.f138451a.m105291e(), InterfaceC37658d.b.f161393a, null, AbstractC37659e.d.f161402a, 4, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    private final C35310c m117162e(C29586b c29586b, C35310c.a aVar) {
        C35310c.c cVar;
        C21535a c21535aM117147g = Function1.m117147g(new C36478d(15));
        if (c29586b.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() != null) {
            String navigationBarText = c29586b.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getNavigationBarText();
            List<ScreenSection> sections = c29586b.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getSections();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                List<DesignSystemModel> items = ((ScreenSection) it.next()).getItems();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
                Iterator<T> it3 = items.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(c21535aM117147g.m60541h((DesignSystemModel) it3.next()));
                }
                arrayList.add(new C22015f0(arrayList2));
            }
            cVar = new C35310c.c(navigationBarText, arrayList);
        } else {
            cVar = null;
        }
        return new C35310c(aVar, null, cVar, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m117163f(C21536b familyPlanDesignItemReducer) {
        AbstractC22676k.m65750j(familyPlanDesignItemReducer, "$this$familyPlanDesignItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final C35310c m117164b(C29586b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        InterfaceC29587c currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC29587c.b) {
            return m117161d((InterfaceC29587c.b) domainResult.getCurrentDialogType());
        }
        return currentDialogType instanceof InterfaceC29587c.e ? m117162e(domainResult, m117160c((InterfaceC29587c.e) domainResult.getCurrentDialogType())) : m117162e(domainResult, null);
    }
}

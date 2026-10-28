package af0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.advancedlabs.domain.models.NavigationBarModel;
import com.whoop.advancedlabs.domain.models.TestInputScreenResponse;
import com.whoop.advancedlabs.testupload.domain.models.ButtonModel;
import com.whoop.advancedlabs.testupload.domain.models.TestPreviewScreen;
import com.whoop.advancedlabs.testupload.domain.models.TestUploadBottomSheet;
import com.whoop.advancedlabs.testupload.domain.models.TestUploadScreen;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import gy0.AbstractC16277f;
import hy0.C17750h1;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf0.C22436k;
import m83.AbstractC25267u;
import ma0.AbstractC25370d;
import md0.AbstractC25448c;
import mf0.AbstractC25507f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import we0.C37213c;
import we0.C37214d;
import we0.C37215e;
import we0.InterfaceC37212b;
import ze0.AbstractC40584c;
import ze0.InterfaceC40582a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: af0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u0007*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u0017*\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"¨\u0006#"}, m65681d2 = {"Laf0/a;", "", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "Lwe0/c;", "Lze0/c;", "e", "(Lwe0/c;)Lze0/c;", "Lwe0/e;", "g", "(Lwe0/e;)Lze0/c;", "Lwe0/d;", "f", "(Lwe0/d;)Lze0/c;", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "Lze0/c$d;", "d", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;)Lze0/c$d;", "Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;", "Lze0/a;", "eventOverride", "Lze0/c$b;", "c", "(Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lze0/a;)Lze0/c$b;", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;", "Lze0/c$a;", "b", "(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;)Lze0/c$a;", "Lwe0/b;", "domainResult", "a", "(Lwe0/b;)Lze0/c;", "Lzr2/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0805a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    public C0805a(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC40584c.a m1950b(TestUploadBottomSheet testUploadBottomSheet) {
        String title = testUploadBottomSheet.getTitle();
        String description = testUploadBottomSheet.getDescription();
        ButtonModel button = testUploadBottomSheet.getButton();
        return new AbstractC40584c.a(title, description, button != null ? m1956h(this, button, null, 1, null) : null);
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC40584c.b m1951c(ButtonModel buttonModel, InterfaceC40582a interfaceC40582a) {
        String textDisplay = buttonModel.getTextDisplay();
        if (interfaceC40582a == null) {
            C9598e destination = buttonModel.getDestination();
            interfaceC40582a = destination != null ? new InterfaceC40582a.e(destination) : null;
        }
        return new AbstractC40584c.b(textDisplay, interfaceC40582a);
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC40584c.d m1952d(NavigationBarModel navigationBarModel) {
        String navigationTitle = navigationBarModel.getNavigationTitle();
        TagModel tag = navigationBarModel.getTag();
        InterfaceC25312u interfaceC25312uM60541h = tag != null ? AbstractC25448c.m74762z0().m60541h(tag) : null;
        return new AbstractC40584c.d(navigationTitle, interfaceC25312uM60541h instanceof C17750h1 ? (C17750h1) interfaceC25312uM60541h : null);
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC40584c m1953e(C37213c c37213c) {
        TestInputScreenResponse testInputScreen = c37213c.getResponse().getTestInputScreen();
        AbstractC40584c.d dVarM1952d = m1952d(testInputScreen.getNavigationBar());
        TestUploadBottomSheet uploadBottomSheet = c37213c.getResponse().getUploadBottomSheet();
        return new AbstractC40584c.e.a(dVarM1952d, uploadBottomSheet != null ? m1950b(uploadBottomSheet) : null, AbstractC25507f.m74983b(testInputScreen, this.dateAndTimeProvider));
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC40584c m1954f(C37214d c37214d) {
        TestPreviewScreen testPreviewScreen = c37214d.getResponse().getTestPreviewScreen();
        AbstractC40584c.d dVarM1952d = m1952d(testPreviewScreen.getNavigationBar());
        TestUploadBottomSheet uploadBottomSheet = c37214d.getResponse().getUploadBottomSheet();
        return new AbstractC40584c.e.b(dVarM1952d, uploadBottomSheet != null ? m1950b(uploadBottomSheet) : null, testPreviewScreen.getCoachFooter(), m1951c(testPreviewScreen.getReuploadButton(), InterfaceC40582a.c.f174785a), m1951c(testPreviewScreen.getSaveButton(), InterfaceC40582a.i.f174791a), c37214d.m119251a(), Integer.valueOf(c37214d.m119251a().size()), AbstractC0806b.m1958a(c37214d.m119251a()));
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC40584c m1955g(C37215e c37215e) {
        TestUploadScreen testUploadScreen = c37215e.getResponse().getTestUploadScreen();
        AbstractC40584c.d dVarM1952d = m1952d(testUploadScreen.getNavigationBar());
        TestUploadBottomSheet uploadBottomSheet = c37215e.getResponse().getUploadBottomSheet();
        AbstractC40584c.a aVarM1950b = uploadBottomSheet != null ? m1950b(uploadBottomSheet) : null;
        List<AdvancedLabsSectionModel> sections = testUploadScreen.getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60541h = AbstractC25448c.m74762z0().m60541h((AdvancedLabsSectionModel) it.next());
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.advancedlabs.view.AdvancedLabsSectionState");
            arrayList.add((C22436k) interfaceC25312uM60541h);
        }
        return new AbstractC40584c.e.c(dVarM1952d, aVarM1950b, arrayList, m1956h(this, testUploadScreen.getFileSelectButton(), null, 1, null), m1956h(this, testUploadScreen.getImageSelectButton(), null, 1, null));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ AbstractC40584c.b m1956h(C0805a c0805a, ButtonModel buttonModel, InterfaceC40582a interfaceC40582a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC40582a = null;
        }
        return c0805a.m1951c(buttonModel, interfaceC40582a);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC40584c m1957a(InterfaceC37212b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof InterfaceC37212b.b) {
            return new AbstractC40584c.c(C33205o0.f138451a.m105288b(), null, null, 6, null);
        }
        if (domainResult instanceof InterfaceC37212b.a) {
            return new AbstractC40584c.c(new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC25370d.f99436e), false, null, 6, null), AbstractC8693b.m21277k(AbstractC25370d.f99435d), null, AbstractC8693b.m21277k(AbstractC25370d.f99446o), true, false, AbstractC8693b.m21277k(AbstractC16277f.f62253K), false, false, 841, null), InterfaceC40582a.g.f174790a, InterfaceC40582a.a.f174783a);
        }
        if (domainResult instanceof C37213c) {
            return m1953e((C37213c) domainResult);
        }
        if (domainResult instanceof C37215e) {
            return m1955g((C37215e) domainResult);
        }
        if (domainResult instanceof C37214d) {
            return m1954f((C37214d) domainResult);
        }
        if (domainResult instanceof InterfaceC37212b.c) {
            C33211q0 c33211q0 = new C33211q0(null, new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21277k(AbstractC25370d.f99447p), null, null, false, false, null, false, false, MessageListItemViewType.START_OF_THE_CHANNEL, null);
            C9598e c9598e = ((InterfaceC37212b.c) domainResult).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
            return new AbstractC40584c.c(c33211q0, c9598e != null ? new InterfaceC40582a.e(c9598e) : null, null, 4, null);
        }
        if (domainResult.equals(InterfaceC37212b.d.f159075a)) {
            return new AbstractC40584c.c(new C33211q0(null, new AbstractC33208p0.d(AbstractC8693b.m21277k(AbstractC25370d.f99452u)), AbstractC8693b.m21277k(AbstractC25370d.f99448q), null, null, false, false, null, false, false, MessageListItemViewType.START_OF_THE_CHANNEL, null), null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}

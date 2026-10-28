package com.whoop.settings.journalv2;

import com.whoop.design.util.TextResource;
import com.whoop.journal.model.CurrentCycle;
import gz0.AbstractC16319p0;
import java.util.List;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25292c0;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: com.whoop.settings.journalv2.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/settings/journalv2/i;", "", "<init>", "()V", "Lcom/whoop/settings/journalv2/d$b;", "domainState", "", "Lm91/u;", "a", "(Lcom/whoop/settings/journalv2/d$b;)Ljava/util/List;", "", "isChecked", "", "cycleId", "Ly71/o;", "b", "(ZJ)Ly71/o;", "Lcom/whoop/journal/model/CurrentCycle;", "currentCycle", "c", "(ZJLcom/whoop/journal/model/CurrentCycle;)Ly71/o;", "Lcom/whoop/settings/journalv2/d;", "Lcom/whoop/settings/journalv2/h;", "d", "(Lcom/whoop/settings/journalv2/d;)Lcom/whoop/settings/journalv2/h;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10118i {

    /* JADX INFO: renamed from: a */
    private static final a f30470a = new a(null);

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.i$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/settings/journalv2/i$a;", "", "<init>", "()V", "", "INVALID_CYCLE_ID", "J", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    private final List<InterfaceC25312u> m25492a(InterfaceC10113d.b domainState) {
        float f13 = 8;
        C25292c0 c25292c0 = new C25292c0(0.0f, 2 * f13, 1, null);
        boolean isJournalEnabled = domainState.getIsJournalEnabled();
        Long cycleId = domainState.getCycleId();
        C39282o c39282oM25493b = m25493b(isJournalEnabled, cycleId != null ? cycleId.longValue() : -1L);
        C25292c0 c25292c1 = new C25292c0(0.0f, 1 * f13, 1, null);
        boolean isJournalEnabled2 = domainState.getIsJournalEnabled();
        Long cycleId2 = domainState.getCycleId();
        return AbstractC37056f.m118959K(c25292c0, c39282oM25493b, c25292c1, m25494c(isJournalEnabled2, cycleId2 != null ? cycleId2.longValue() : -1L, new CurrentCycle(0L, 0L, 0L, 0L, 15, null)));
    }

    /* JADX INFO: renamed from: b */
    private final C39282o m25493b(boolean isChecked, long cycleId) {
        return C39282o.Companion.m125229d(C39282o.INSTANCE, new TextResource.C8688b(AbstractC12922s.f44608i, null, 2, null), null, null, null, null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSettings(), new TextResource.C8688b(AbstractC12922s.f44608i, null, 2, null)), null, null, null, null, null, null, null, null, isChecked, false, null, false, null, null, new AbstractC10112c.a(cycleId), false, null, 7323614, null);
    }

    /* JADX INFO: renamed from: c */
    private final C39282o m25494c(boolean isChecked, long cycleId, CurrentCycle currentCycle) {
        return C39282o.Companion.m125229d(C39282o.INSTANCE, new TextResource.C8688b(AbstractC12922s.f44579N0, null, 2, null), null, null, null, null, new C39274g(AbstractC16319p0.m46430a().getAction().getJournal(), new TextResource.C8688b(AbstractC12922s.f44579N0, null, 2, null)), null, null, null, null, null, null, null, null, isChecked, false, null, false, null, null, new AbstractC10112c.b(cycleId, currentCycle), false, null, 7323614, null);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC10117h m25495d(InterfaceC10113d domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState instanceof InterfaceC10113d.b) {
            InterfaceC10113d.b bVar = (InterfaceC10113d.b) domainState;
            return new InterfaceC10117h.e(bVar.getIsJournalEnabled(), bVar.getIsShowDismissDialogChecked(), m25492a(bVar));
        }
        if (domainState instanceof InterfaceC10113d.a) {
            return InterfaceC10117h.a.f30463a;
        }
        if (domainState instanceof InterfaceC10113d.d) {
            return InterfaceC10117h.d.f30466a;
        }
        if (domainState instanceof InterfaceC10113d.c) {
            return InterfaceC10117h.c.f30465a;
        }
        throw new NoWhenBranchMatchedException();
    }
}

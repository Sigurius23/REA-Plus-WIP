package fe0;

import androidx.core.app.NotificationCompat;
import be0.AbstractC3165a;
import c31.EnumC3919c;
import ce0.AbstractC4487b;
import ck1.C4789l;
import com.whoop.navigation.C9598e;
import de0.C11980a;
import ge0.AbstractC15727b;
import l83.C23454a0;
import lf0.AbstractC23984x1;
import lf0.C23910e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;

/* JADX INFO: renamed from: fe0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lfe0/a;", "", "<init>", "()V", NotificationCompat.CATEGORY_EVENT, "Lkotlin/Function1;", "Lce0/b;", "Ll83/a0;", "onViewEvent", "", "searchQuery", "f", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "Lbe0/a;", "onNavigationEvent", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lc31/c;", "buttonClickType", "Lde0/a;", "selectedAppointment", "episodeId", "biomarkerTestId", "d", "(Lc31/c;Lde0/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lsz0/q0;", "modalState", "Lcom/whoop/navigation/e;", "buttonDestination", "b", "(Lsz0/q0;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Lsz0/q0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14411a {

    /* JADX INFO: renamed from: a */
    public static final C14411a f52567a = new C14411a();

    /* JADX INFO: renamed from: fe0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52568a;

        static {
            int[] iArr = new int[EnumC3919c.values().length];
            try {
                iArr[EnumC3919c.FILLED_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3919c.PROGRESS_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52568a = iArr;
        }
    }

    private C14411a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m41055c(Function1 function1, C9598e c9598e) {
        function1.invoke(new AbstractC3165a.b(c9598e));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final C33211q0 m41056b(C33211q0 modalState, C9598e buttonDestination, Function1 onNavigationEvent) {
        AbstractC22676k.m65750j(modalState, "modalState");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC33208p0 type = modalState.getType();
        return (!(type instanceof AbstractC33208p0.h) || buttonDestination == null) ? modalState : C33211q0.m105332d(modalState, null, AbstractC33208p0.h.m105313g((AbstractC33208p0.h) type, null, 0L, new C4789l(onNavigationEvent, buttonDestination, 3), 3, null), null, null, null, false, false, null, false, false, 1021, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m41057d(EnumC3919c buttonClickType, C11980a selectedAppointment, String episodeId, String biomarkerTestId, Function1 onViewEvent) {
        AbstractC22676k.m65750j(buttonClickType, "buttonClickType");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        int i13 = a.f52568a[buttonClickType.ordinal()];
        if ((i13 == 1 || i13 == 2) && selectedAppointment != null) {
            onViewEvent.invoke(new AbstractC4487b.f(selectedAppointment.getSiteCode(), selectedAppointment.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), episodeId, biomarkerTestId));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m41058e(Object event, Function1 onNavigationEvent) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        if (event instanceof C9598e) {
            onNavigationEvent.invoke(new AbstractC3165a.b((C9598e) event));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m41059f(Object event, Function1 onViewEvent, String searchQuery) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        if (!(event instanceof AbstractC23984x1.a)) {
            if (event instanceof AbstractC15727b.c) {
                onViewEvent.invoke(new AbstractC4487b.e(searchQuery, ((AbstractC15727b.c) event).getTargetDate(), true));
            }
        } else {
            AbstractC23984x1.a aVar = (AbstractC23984x1.a) event;
            C23910e appointment = aVar.getAppointment();
            if (appointment != null) {
                onViewEvent.invoke(new AbstractC4487b.b(aVar.getSiteCode(), appointment.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()));
            } else {
                onViewEvent.invoke(AbstractC4487b.a.f18033a);
            }
        }
    }
}

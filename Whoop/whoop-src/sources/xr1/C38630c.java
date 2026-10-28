package xr1;

import com.whoop.navigation.JournalScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import j02.AbstractC21155m0;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import l83.InterfaceC23457c;
import o02.InterfaceC27353d;
import org.joda.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: xr1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lxr1/c;", "Lo02/d;", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "Lcom/whoop/navigation/NavigationScreenModel;", "navigationScreenModel", "Lj02/m0;", "c", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;", "a", "Lzr2/a;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class C38630c implements InterfaceC27353d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    public C38630c(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: b */
    public /* bridge */ InterfaceC27353d mo67682b(List<? extends InterfaceC27353d> list, Map<InterfaceC21461d, ? extends Function1> map) {
        return super.mo67682b(list, map);
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC21155m0 mo67681a(NavigationScreenModel navigationScreenModel) {
        AbstractC22676k.m65750j(navigationScreenModel, "navigationScreenModel");
        if (!(navigationScreenModel instanceof JournalScreenModel)) {
            return AbstractC21155m0.j3.f80414b;
        }
        LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        java.time.LocalDate localDateOf = java.time.LocalDate.of(localDateMo133365d.getYear(), localDateMo133365d.getMonthOfYear(), localDateMo133365d.getDayOfMonth());
        JournalScreenModel journalScreenModel = (JournalScreenModel) navigationScreenModel;
        boolean shouldShowOnboarding = journalScreenModel.getShouldShowOnboarding();
        String source = journalScreenModel.getSource();
        AbstractC22676k.m65747g(localDateOf);
        return new AbstractC21155m0.e2(null, false, shouldShowOnboarding, -1L, null, null, localDateOf, localDateOf, false, source, null, false, false, 7425, null);
    }
}

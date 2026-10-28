package xr1;

import com.whoop.navigation.InterdayJournalScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import j02.AbstractC21155m0;
import j93.InterfaceC21461d;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import o02.InterfaceC27353d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xr1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lxr1/b;", "Lo02/d;", "<init>", "()V", "Lcom/whoop/navigation/NavigationScreenModel;", "navigationScreenModel", "Lj02/m0;", "c", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38629b implements InterfaceC27353d {
    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: b */
    public /* bridge */ InterfaceC27353d mo67682b(List<? extends InterfaceC27353d> list, Map<InterfaceC21461d, ? extends Function1> map) {
        return super.mo67682b(list, map);
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC21155m0 mo67681a(NavigationScreenModel navigationScreenModel) {
        AbstractC22676k.m65750j(navigationScreenModel, "navigationScreenModel");
        if (!(navigationScreenModel instanceof InterdayJournalScreenModel)) {
            return AbstractC21155m0.j3.f80414b;
        }
        InterdayJournalScreenModel interdayJournalScreenModel = (InterdayJournalScreenModel) navigationScreenModel;
        String date = interdayJournalScreenModel.getDate();
        long cycleId = interdayJournalScreenModel.getCycleId();
        LocalDate localDateNow = LocalDate.now();
        AbstractC22676k.m65749i(localDateNow, "now(...)");
        LocalDate localDateNow2 = LocalDate.now();
        String source = interdayJournalScreenModel.getSource();
        if (source == null) {
            source = "";
        }
        return new AbstractC21155m0.e2(date, false, false, cycleId, null, null, localDateNow, localDateNow2, false, source, null, false, false, 7424, null);
    }
}

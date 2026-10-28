package ef1;

import a71.C0520a;
import androidx.core.app.NotificationCompat;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cz0.AbstractC11258s;
import d61.InterfaceC11732a;
import hy0.C17750h1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import v41.C35678m;
import v41.EnumC35673j0;
import v41.EnumC35677l0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ef1.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lef1/d;", "", "<init>", "()V", "Lef1/c$b;", "screenState", "Ld61/a;", NotificationCompat.CATEGORY_EVENT, "", "timeSegmentIndex", "b", "(Lef1/c$b;Ld61/a;I)Lef1/c$b;", "Lef1/a$d;", "currentViewState", "modifiedState", "Lef1/f;", "a", "(Lef1/a$d;Lef1/c$b;Lef1/c$b;)Lef1/f;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13148d {

    /* JADX INFO: renamed from: ef1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f45529w = new a();

        /* JADX INFO: renamed from: a */
        public final long m36825a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m36825a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: b */
    private final C13147c.b m36823b(C13147c.b screenState, InterfaceC11732a event, int timeSegmentIndex) {
        TextResource textResourceM21267a;
        InterfaceC39332e interfaceC39332eM125323a;
        Collection<AbstractC11258s> collectionValues = event.mo31360b().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((AbstractC11258s) it.next()).mo30408a());
        }
        C13147c.c cVar = screenState.m36815f().get(Integer.valueOf(timeSegmentIndex));
        if (cVar == null) {
            return screenState;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C0520a c0520a = (C0520a) obj;
            TextResource textResourceM21267a2 = i13 != 0 ? AbstractC8693b.m21267a() : c0520a.getPrimaryContextualDisplay();
            TextResource valueDisplay = c0520a.getValueDisplay();
            EnumC35673j0 enumC35673j0 = EnumC35673j0.NONE;
            TextResource unitDisplay = c0520a.getUnitDisplay();
            TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
            InterfaceC39332e scrubberColor = c0520a.getScrubberColor();
            C17750h1 phaseTag = c0520a.getPhaseTag();
            if (phaseTag == null || (textResourceM21267a = phaseTag.getTagText()) == null) {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            TextResource textResource = textResourceM21267a;
            C17750h1 phaseTag2 = c0520a.getPhaseTag();
            if (phaseTag2 == null || (interfaceC39332eM125323a = phaseTag2.getTagTextColor()) == null) {
                interfaceC39332eM125323a = p745y81.Function1.m125323a(a.f45529w);
            }
            arrayList2.add(new C35678m(textResourceM21267a2, valueDisplay, unitDisplay, enumC35673j0, EnumC35677l0.NONE, textResourceM21267a3, scrubberColor, textResource, interfaceC39332eM125323a, null, 512, null));
            i13 = i14;
        }
        C13147c.c cVarM36816b = C13147c.c.m36816b(cVar, arrayList2, null, null, null, null, 30, null);
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(screenState.m36815f());
        linkedHashMapM74003l0.put(Integer.valueOf(timeSegmentIndex), cVarM36816b);
        return C13147c.b.m36810b(screenState, linkedHashMapM74003l0, null, null, null, 14, null);
    }

    /* JADX INFO: renamed from: a */
    public final C13150f m36824a(InterfaceC13145a.d event, C13147c.b currentViewState, C13147c.b modifiedState) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(currentViewState, "currentViewState");
        if (!(event.getAction() instanceof InterfaceC11732a)) {
            return null;
        }
        InterfaceC11732a interfaceC11732a = (InterfaceC11732a) event.getAction();
        if ((interfaceC11732a instanceof InterfaceC11732a.c) || (interfaceC11732a instanceof InterfaceC11732a.a)) {
            if (modifiedState != null) {
                currentViewState = modifiedState;
            }
            return new C13150f(m36823b(currentViewState, interfaceC11732a, event.getSelectedIndex()), true);
        }
        if (interfaceC11732a instanceof InterfaceC11732a.b) {
            return new C13150f(null, false);
        }
        throw new NoWhenBranchMatchedException();
    }
}

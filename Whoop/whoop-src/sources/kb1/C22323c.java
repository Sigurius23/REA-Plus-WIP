package kb1;

import com.whoop.design.util.AbstractC8693b;
import e93.AbstractC12889b;
import g51.C15493c;
import h91.C17027b;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qy0.C30770c;
import qy0.InterfaceC30768a;

/* JADX INFO: renamed from: kb1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J#\u0010\u0018\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lkb1/c;", "DateModel", "", "Lkotlin/Function1;", "Lkb1/e;", "Lqy0/a;", "mapper", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "dateModels", "Lkb1/a;", "dateInfo", "c", "(Ljava/util/List;Lkb1/a;)Ljava/util/List;", "b", "(Lkb1/a;)Ljava/util/List;", "d", "a", "Lh91/b;", "domainState", "", "monthIndex", "Lg51/c;", "e", "(Lh91/b;I)Lg51/c;", "Lkotlin/jvm/functions/Function1;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22323c<DateModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 mapper;

    public C22323c(Function1 mapper) {
        AbstractC22676k.m65750j(mapper, "mapper");
        this.mapper = mapper;
    }

    /* JADX INFO: renamed from: a */
    private final List<InterfaceC30768a> m64143a(C22321a dateInfo) {
        int slotsAfterLastDay = dateInfo.getSlotsAfterLastDay();
        ArrayList arrayList = new ArrayList(slotsAfterLastDay);
        for (int i13 = 0; i13 < slotsAfterLastDay; i13++) {
            arrayList.add(C30770c.f126707a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private final List<InterfaceC30768a> m64144b(C22321a dateInfo) {
        int slotsBeforeFirstDay = dateInfo.getSlotsBeforeFirstDay();
        ArrayList arrayList = new ArrayList(slotsBeforeFirstDay);
        for (int i13 = 0; i13 < slotsBeforeFirstDay; i13++) {
            arrayList.add(C30770c.f126707a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private final List<InterfaceC30768a> m64145c(List<? extends DateModel> dateModels, C22321a dateInfo) {
        return AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(m64144b(dateInfo), m64146d(dateModels, dateInfo)), m64143a(dateInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    private final List<InterfaceC30768a> m64146d(List<? extends DateModel> dateModels, C22321a dateInfo) {
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, dateInfo.getDaysInMonth());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            arrayList.add((InterfaceC30768a) this.mapper.invoke(C22325e.INSTANCE.m64159a(dateInfo, iNextInt + 1, AbstractC25265s.m74102I0(iNextInt, dateModels))));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final C15493c m64147e(C17027b<DateModel> domainState, int monthIndex) {
        AbstractC22676k.m65750j(domainState, "domainState");
        C22321a c22321a = new C22321a(domainState.m48085m(monthIndex));
        List<String> listM64212a = C22329i.f87163a.m64212a(domainState.getLocale());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM64212a, 10));
        Iterator<T> it = listM64212a.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8693b.m21278l((String) it.next()));
        }
        return new C15493c(AbstractC8693b.m21278l(c22321a.getMonthTitle()), m64145c(domainState.m48075c(monthIndex), c22321a), arrayList, domainState.m48080h());
    }
}

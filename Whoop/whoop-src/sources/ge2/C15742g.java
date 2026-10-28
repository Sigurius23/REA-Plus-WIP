package ge2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsOfUseResponse;
import com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsToggleItem;
import de2.C11987c;
import de2.InterfaceC11990f;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ge2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lge2/g;", "", "<init>", "()V", "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;", "bffFeed", "Lge2/f;", "d", "(Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;)Lge2/f;", "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;", "termsToggle", "Lge2/h;", "c", "(Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;)Lge2/h;", "Lec3/l;", "Lde2/c;", "domainStateFlow", "b", "(Lec3/l;)Lec3/l;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15742g {

    /* JADX INFO: renamed from: ge2.g$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59385w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15742g f59386x;

        /* JADX INFO: renamed from: ge2.g$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41644a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59387w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15742g f59388x;

            /* JADX INFO: renamed from: ge2.g$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.terms.presentation.ShepherdTermsOfUseViewStateReducer$reduce$$inlined$map$1$2", m100430f = "ShepherdTermsOfUseViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41645a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59389E;

                /* JADX INFO: renamed from: F */
                Object f59390F;

                /* JADX INFO: renamed from: G */
                Object f59391G;

                /* JADX INFO: renamed from: H */
                int f59392H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59393w;

                /* JADX INFO: renamed from: x */
                int f59394x;

                /* JADX INFO: renamed from: y */
                Object f59395y;

                public C41645a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59393w = obj;
                    this.f59394x |= Integer.MIN_VALUE;
                    return C41644a.this.emit(null, this);
                }
            }

            public C41644a(InterfaceC13062m interfaceC13062m, C15742g c15742g) {
                this.f59387w = interfaceC13062m;
                this.f59388x = c15742g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41645a c41645a;
                Object objM44403d;
                if (interfaceC30057d instanceof C41645a) {
                    c41645a = (C41645a) interfaceC30057d;
                    int i13 = c41645a.f59394x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41645a.f59394x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41645a = new C41645a(interfaceC30057d);
                    }
                } else {
                    c41645a = new C41645a(interfaceC30057d);
                }
                Object obj2 = c41645a.f59393w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41645a.f59394x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59387w;
                    C11987c c11987c = (C11987c) obj;
                    InterfaceC11990f currentScreenType = c11987c.getCurrentScreenType();
                    if (AbstractC22676k.m65745e(currentScreenType, InterfaceC11990f.c.f39474a)) {
                        objM44403d = InterfaceC15741f.a.INSTANCE.m44391b();
                    } else if (AbstractC22676k.m65745e(currentScreenType, InterfaceC11990f.a.f39472a)) {
                        objM44403d = InterfaceC15741f.a.INSTANCE.m44390a();
                    } else {
                        if (!AbstractC22676k.m65745e(currentScreenType, InterfaceC11990f.b.f39473a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM44403d = this.f59388x.m44403d(c11987c.getTermsOfUseResponse());
                    }
                    c41645a.f59395y = null;
                    c41645a.f59389E = null;
                    c41645a.f59390F = null;
                    c41645a.f59391G = null;
                    c41645a.f59392H = 0;
                    c41645a.f59394x = 1;
                    if (interfaceC13062m.emit(objM44403d, c41645a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C15742g c15742g) {
            this.f59385w = interfaceC13058l;
            this.f59386x = c15742g;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59385w.collect(new C41644a(interfaceC13062m, this.f59386x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c */
    private final C15743h m44402c(ShepherdTermsToggleItem termsToggle) {
        return new C15743h(termsToggle.getId(), AbstractC8693b.m21278l(termsToggle.getLabel()), termsToggle.getSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC15741f m44403d(ShepherdTermsOfUseResponse bffFeed) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        if (bffFeed == null) {
            return InterfaceC15741f.a.INSTANCE.m44390a();
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(bffFeed.getRegionPicker().getLabel());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(bffFeed.getRegionPicker().getTitle());
        List<String> regions = bffFeed.getRegionPicker().getRegions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(regions, 10));
        Iterator<T> it = regions.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8693b.m21278l((String) it.next()));
        }
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(bffFeed.getRegionPicker().getAvailabilityAlert());
        String availabilityIcon = bffFeed.getRegionPicker().getAvailabilityIcon();
        EnumC16313m0 enumC16313m2 = EnumC16313m0.TINY_INFORMATION;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            enumC16313m0 = null;
            if (i13 >= length) {
                enumC16313m1 = null;
                break;
            }
            enumC16313m1 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), availabilityIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m1 != null) {
            enumC16313m2 = enumC16313m1;
        }
        C15744i c15744i = new C15744i(textResourceM21278l, textResourceM21278l2, arrayList, textResourceM21278l3, enumC16313m2.toWhoopIcon(), AbstractC8693b.m21278l(bffFeed.getRegionPicker().getButtonLabel()));
        String icon = bffFeed.getIcon();
        EnumC16313m0 enumC16313m3 = EnumC16313m0.CROSS;
        for (EnumC16313m0 enumC16313m4 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m4.name(), icon)) {
                enumC16313m0 = enumC16313m4;
                break;
            }
        }
        if (enumC16313m0 != null) {
            enumC16313m3 = enumC16313m0;
        }
        int whoopIcon = enumC16313m3.toWhoopIcon();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(bffFeed.getPageTitle());
        AbstractC22403o.c cVar = new AbstractC22403o.c(bffFeed.getBackgroundImage(), 0, 0, 0, 14, null);
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(bffFeed.getTitle());
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(bffFeed.getBody());
        List<String> conditions = bffFeed.getConditions();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(conditions, 10));
        Iterator<T> it3 = conditions.iterator();
        while (it3.hasNext()) {
            arrayList2.add(AbstractC8693b.m21278l((String) it3.next()));
        }
        C15743h c15743hM44402c = m44402c(bffFeed.getAcknowledgeAllToggle());
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(bffFeed.getButtonLabel());
        C9598e destination = bffFeed.getDestination();
        return new InterfaceC15741f.b(whoopIcon, textResourceM21278l4, cVar, textResourceM21278l5, textResourceM21278l6, arrayList2, c15744i, c15743hM44402c, textResourceM21278l7, destination == null ? new C9598e(null, null, null, 7, null) : destination);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m44404b(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return new a(domainStateFlow, this);
    }
}

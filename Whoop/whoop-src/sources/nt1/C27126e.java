package nt1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityResponse;
import com.whoop.labrador.feature.eligibility.domain.model.LabradorSetupToggle;
import com.whoop.navigation.C9598e;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kt1.C22826b;
import kt1.InterfaceC22829e;
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

/* JADX INFO: renamed from: nt1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lnt1/e;", "", "<init>", "()V", "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;", "bffFeed", "Lnt1/d;", "d", "(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)Lnt1/d;", "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;", "labradorSetupToggle", "Lnt1/b;", "c", "(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;)Lnt1/b;", "Lec3/l;", "Lkt1/b;", "upstream", "b", "(Lec3/l;)Lec3/l;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27126e {

    /* JADX INFO: renamed from: nt1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108449w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27126e f108450x;

        /* JADX INFO: renamed from: nt1.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42090a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108451w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27126e f108452x;

            /* JADX INFO: renamed from: nt1.e$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.presentation.LabradorEligibilityViewStateReducer$reduce$$inlined$map$1$2", m100430f = "LabradorEligibilityViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42091a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108453E;

                /* JADX INFO: renamed from: F */
                Object f108454F;

                /* JADX INFO: renamed from: G */
                Object f108455G;

                /* JADX INFO: renamed from: H */
                int f108456H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108457w;

                /* JADX INFO: renamed from: x */
                int f108458x;

                /* JADX INFO: renamed from: y */
                Object f108459y;

                public C42091a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108457w = obj;
                    this.f108458x |= Integer.MIN_VALUE;
                    return C42090a.this.emit(null, this);
                }
            }

            public C42090a(InterfaceC13062m interfaceC13062m, C27126e c27126e) {
                this.f108451w = interfaceC13062m;
                this.f108452x = c27126e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42091a c42091a;
                Object objM81546d;
                if (interfaceC30057d instanceof C42091a) {
                    c42091a = (C42091a) interfaceC30057d;
                    int i13 = c42091a.f108458x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42091a.f108458x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42091a = new C42091a(interfaceC30057d);
                    }
                } else {
                    c42091a = new C42091a(interfaceC30057d);
                }
                Object obj2 = c42091a.f108457w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42091a.f108458x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108451w;
                    C22826b c22826b = (C22826b) obj;
                    InterfaceC22829e currentScreenType = c22826b.getCurrentScreenType();
                    if (AbstractC22676k.m65745e(currentScreenType, InterfaceC22829e.c.f89968a)) {
                        objM81546d = InterfaceC27125d.a.INSTANCE.m81534b();
                    } else if (AbstractC22676k.m65745e(currentScreenType, InterfaceC22829e.a.f89966a)) {
                        objM81546d = InterfaceC27125d.a.INSTANCE.m81533a();
                    } else {
                        if (!AbstractC22676k.m65745e(currentScreenType, InterfaceC22829e.b.f89967a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM81546d = this.f108452x.m81546d(c22826b.getLabradorEligibilityResponse());
                    }
                    c42091a.f108459y = null;
                    c42091a.f108453E = null;
                    c42091a.f108454F = null;
                    c42091a.f108455G = null;
                    c42091a.f108456H = 0;
                    c42091a.f108458x = 1;
                    if (interfaceC13062m.emit(objM81546d, c42091a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C27126e c27126e) {
            this.f108449w = interfaceC13058l;
            this.f108450x = c27126e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108449w.collect(new C42090a(interfaceC13062m, this.f108450x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c */
    private final C27123b m81545c(LabradorSetupToggle labradorSetupToggle) {
        return new C27123b(labradorSetupToggle.getSetupRequirement(), AbstractC8693b.m21278l(labradorSetupToggle.getLabel()), labradorSetupToggle.getSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC27125d m81546d(LabradorEligibilityResponse bffFeed) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        if (bffFeed == null) {
            return InterfaceC27125d.a.INSTANCE.m81533a();
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
        C27130i c27130i = new C27130i(textResourceM21278l, textResourceM21278l2, arrayList, textResourceM21278l3, enumC16313m2.toWhoopIcon(), AbstractC8693b.m21278l(bffFeed.getRegionPicker().getButtonLabel()));
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
        C27123b c27123bM81545c = m81545c(bffFeed.getAcknowledgeAllToggle());
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(bffFeed.getButtonLabel());
        C9598e destination = bffFeed.getDestination();
        return new InterfaceC27125d.b(whoopIcon, textResourceM21278l4, cVar, textResourceM21278l5, textResourceM21278l6, arrayList2, c27130i, c27123bM81545c, textResourceM21278l7, destination == null ? new C9598e(null, null, null, 7, null) : destination);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m81547b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}

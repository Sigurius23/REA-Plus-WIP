package be2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.shepherd.feature.registration.domain.models.RegulatoryInformationResponse;
import com.whoop.shepherd.feature.registration.domain.models.ShepherdRegistrationResponse;
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
import zd2.InterfaceC40555b;

/* JADX INFO: renamed from: be2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lbe2/e;", "", "<init>", "()V", "Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;", "bffFeed", "Lbe2/d;", "c", "(Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;)Lbe2/d;", "Lec3/l;", "Lzd2/b;", "upstream", "b", "(Lec3/l;)Lec3/l;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3178e {

    /* JADX INFO: renamed from: be2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f12458w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3178e f12459x;

        /* JADX INFO: renamed from: be2.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41305a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f12460w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3178e f12461x;

            /* JADX INFO: renamed from: be2.e$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.registration.presentation.ShepherdRegistrationViewStateReducer$reduce$$inlined$map$1$2", m100430f = "ShepherdRegistrationViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41306a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f12462E;

                /* JADX INFO: renamed from: F */
                Object f12463F;

                /* JADX INFO: renamed from: G */
                Object f12464G;

                /* JADX INFO: renamed from: H */
                int f12465H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f12466w;

                /* JADX INFO: renamed from: x */
                int f12467x;

                /* JADX INFO: renamed from: y */
                Object f12468y;

                public C41306a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f12466w = obj;
                    this.f12467x |= Integer.MIN_VALUE;
                    return C41305a.this.emit(null, this);
                }
            }

            public C41305a(InterfaceC13062m interfaceC13062m, C3178e c3178e) {
                this.f12460w = interfaceC13062m;
                this.f12461x = c3178e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41306a c41306a;
                Object objM9161c;
                if (interfaceC30057d instanceof C41306a) {
                    c41306a = (C41306a) interfaceC30057d;
                    int i13 = c41306a.f12467x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41306a.f12467x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41306a = new C41306a(interfaceC30057d);
                    }
                } else {
                    c41306a = new C41306a(interfaceC30057d);
                }
                Object obj2 = c41306a.f12466w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41306a.f12467x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f12460w;
                    InterfaceC40555b interfaceC40555b = (InterfaceC40555b) obj;
                    if (AbstractC22676k.m65745e(interfaceC40555b, InterfaceC40555b.c.f174634a)) {
                        objM9161c = InterfaceC3177d.b.INSTANCE.m9159b();
                    } else if (AbstractC22676k.m65745e(interfaceC40555b, InterfaceC40555b.a.f174632a)) {
                        objM9161c = InterfaceC3177d.b.INSTANCE.m9158a();
                    } else {
                        if (!(interfaceC40555b instanceof InterfaceC40555b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM9161c = this.f12461x.m9161c(((InterfaceC40555b.b) interfaceC40555b).getResponse());
                    }
                    c41306a.f12468y = null;
                    c41306a.f12462E = null;
                    c41306a.f12463F = null;
                    c41306a.f12464G = null;
                    c41306a.f12465H = 0;
                    c41306a.f12467x = 1;
                    if (interfaceC13062m.emit(objM9161c, c41306a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C3178e c3178e) {
            this.f12458w = interfaceC13058l;
            this.f12459x = c3178e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f12458w.collect(new C41305a(interfaceC13062m, this.f12459x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final InterfaceC3177d m9161c(ShepherdRegistrationResponse bffFeed) {
        EnumC16313m0 enumC16313m0;
        List<RegulatoryInformationResponse> regulatoryInfo = bffFeed.getRegulatoryInfo();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(regulatoryInfo, 10));
        for (RegulatoryInformationResponse regulatoryInformationResponse : regulatoryInfo) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(regulatoryInformationResponse.getSectionTitle());
            List<String> regulatoryLinks = regulatoryInformationResponse.getRegulatoryLinks();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(regulatoryLinks, 10));
            Iterator<T> it = regulatoryLinks.iterator();
            while (it.hasNext()) {
                arrayList2.add(new AbstractC22403o.c((String) it.next(), 0, 0, 0, 14, null));
            }
            arrayList.add(new C3174a(textResourceM21278l, arrayList2));
        }
        String icon = bffFeed.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_BACKWARD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        return new InterfaceC3177d.a(enumC16313m1.toWhoopIcon(), AbstractC8693b.m21278l(bffFeed.getPageTitle()), AbstractC8693b.m21278l(bffFeed.getHeaderTitle()), AbstractC8693b.m21278l(bffFeed.getDescription()), arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m9162b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}

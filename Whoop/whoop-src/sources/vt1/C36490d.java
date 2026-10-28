package vt1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.labrador.feature.registration.domain.models.LabradorRegistrationResponse;
import com.whoop.labrador.feature.registration.domain.models.RegulatoryInformationResponse;
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
import tt1.InterfaceC34161b;

/* JADX INFO: renamed from: vt1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lvt1/d;", "", "<init>", "()V", "Lcom/whoop/labrador/feature/registration/domain/models/LabradorRegistrationResponse;", "bffFeed", "Lvt1/c;", "c", "(Lcom/whoop/labrador/feature/registration/domain/models/LabradorRegistrationResponse;)Lvt1/c;", "Lec3/l;", "Ltt1/b;", "upstream", "b", "(Lec3/l;)Lec3/l;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36490d {

    /* JADX INFO: renamed from: vt1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f155892w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36490d f155893x;

        /* JADX INFO: renamed from: vt1.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42565a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f155894w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36490d f155895x;

            /* JADX INFO: renamed from: vt1.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.registration.presentation.LabradorRegistrationViewStateReducer$reduce$$inlined$map$1$2", m100430f = "LabradorRegistrationViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42566a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f155896E;

                /* JADX INFO: renamed from: F */
                Object f155897F;

                /* JADX INFO: renamed from: G */
                Object f155898G;

                /* JADX INFO: renamed from: H */
                int f155899H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f155900w;

                /* JADX INFO: renamed from: x */
                int f155901x;

                /* JADX INFO: renamed from: y */
                Object f155902y;

                public C42566a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f155900w = obj;
                    this.f155901x |= Integer.MIN_VALUE;
                    return C42565a.this.emit(null, this);
                }
            }

            public C42565a(InterfaceC13062m interfaceC13062m, C36490d c36490d) {
                this.f155894w = interfaceC13062m;
                this.f155895x = c36490d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42566a c42566a;
                Object objM116945c;
                if (interfaceC30057d instanceof C42566a) {
                    c42566a = (C42566a) interfaceC30057d;
                    int i13 = c42566a.f155901x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42566a.f155901x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42566a = new C42566a(interfaceC30057d);
                    }
                } else {
                    c42566a = new C42566a(interfaceC30057d);
                }
                Object obj2 = c42566a.f155900w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42566a.f155901x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f155894w;
                    InterfaceC34161b interfaceC34161b = (InterfaceC34161b) obj;
                    if (AbstractC22676k.m65745e(interfaceC34161b, InterfaceC34161b.c.f143189a)) {
                        objM116945c = InterfaceC36489c.b.INSTANCE.m116943b();
                    } else if (AbstractC22676k.m65745e(interfaceC34161b, InterfaceC34161b.a.f143187a)) {
                        objM116945c = InterfaceC36489c.b.INSTANCE.m116942a();
                    } else {
                        if (!(interfaceC34161b instanceof InterfaceC34161b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM116945c = this.f155895x.m116945c(((InterfaceC34161b.b) interfaceC34161b).getResponse());
                    }
                    c42566a.f155902y = null;
                    c42566a.f155896E = null;
                    c42566a.f155897F = null;
                    c42566a.f155898G = null;
                    c42566a.f155899H = 0;
                    c42566a.f155901x = 1;
                    if (interfaceC13062m.emit(objM116945c, c42566a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C36490d c36490d) {
            this.f155892w = interfaceC13058l;
            this.f155893x = c36490d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f155892w.collect(new C42565a(interfaceC13062m, this.f155893x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final InterfaceC36489c m116945c(LabradorRegistrationResponse bffFeed) {
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
            arrayList.add(new C36491e(textResourceM21278l, arrayList2));
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
        return new InterfaceC36489c.a(enumC16313m1.toWhoopIcon(), AbstractC8693b.m21278l(bffFeed.getPageTitle()), AbstractC8693b.m21278l(bffFeed.getHeaderTitle()), AbstractC8693b.m21278l(bffFeed.getDescription()), arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m116946b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}

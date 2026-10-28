package pd2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.shepherd.feature.about.domain.models.InformationItem;
import com.whoop.shepherd.feature.about.domain.models.ShepherdAboutResponse;
import com.whoop.shepherd.feature.about.domain.models.TileItem;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import nd2.InterfaceC26589b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: pd2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lpd2/e;", "", "<init>", "()V", "Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;", "bffFeed", "Lpd2/d;", "c", "(Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;)Lpd2/d;", "Lec3/l;", "Lnd2/b;", "domainState", "b", "(Lec3/l;)Lec3/l;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29109e {

    /* JADX INFO: renamed from: pd2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f117816w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29109e f117817x;

        /* JADX INFO: renamed from: pd2.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42158a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f117818w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29109e f117819x;

            /* JADX INFO: renamed from: pd2.e$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.about.presentation.ShepherdAboutViewStateReducer$reduce$$inlined$map$1$2", m100430f = "ShepherdAboutViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42159a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f117820E;

                /* JADX INFO: renamed from: F */
                Object f117821F;

                /* JADX INFO: renamed from: G */
                Object f117822G;

                /* JADX INFO: renamed from: H */
                int f117823H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f117824w;

                /* JADX INFO: renamed from: x */
                int f117825x;

                /* JADX INFO: renamed from: y */
                Object f117826y;

                public C42159a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f117824w = obj;
                    this.f117825x |= Integer.MIN_VALUE;
                    return C42158a.this.emit(null, this);
                }
            }

            public C42158a(InterfaceC13062m interfaceC13062m, C29109e c29109e) {
                this.f117818w = interfaceC13062m;
                this.f117819x = c29109e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42159a c42159a;
                Object objM88465c;
                if (interfaceC30057d instanceof C42159a) {
                    c42159a = (C42159a) interfaceC30057d;
                    int i13 = c42159a.f117825x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42159a.f117825x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42159a = new C42159a(interfaceC30057d);
                    }
                } else {
                    c42159a = new C42159a(interfaceC30057d);
                }
                Object obj2 = c42159a.f117824w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42159a.f117825x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f117818w;
                    InterfaceC26589b interfaceC26589b = (InterfaceC26589b) obj;
                    if (AbstractC22676k.m65745e(interfaceC26589b, InterfaceC26589b.c.f105744a)) {
                        objM88465c = InterfaceC29108d.b.INSTANCE.m88463b();
                    } else if (AbstractC22676k.m65745e(interfaceC26589b, InterfaceC26589b.a.f105742a)) {
                        objM88465c = InterfaceC29108d.b.INSTANCE.m88462a();
                    } else {
                        if (!(interfaceC26589b instanceof InterfaceC26589b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM88465c = this.f117819x.m88465c(((InterfaceC26589b.b) interfaceC26589b).getResponse());
                    }
                    c42159a.f117826y = null;
                    c42159a.f117820E = null;
                    c42159a.f117821F = null;
                    c42159a.f117822G = null;
                    c42159a.f117823H = 0;
                    c42159a.f117825x = 1;
                    if (interfaceC13062m.emit(objM88465c, c42159a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C29109e c29109e) {
            this.f117816w = interfaceC13058l;
            this.f117817x = c29109e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f117816w.collect(new C42158a(interfaceC13062m, this.f117817x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final InterfaceC29108d m88465c(ShepherdAboutResponse bffFeed) {
        C9598e c9598e;
        EnumC16313m0 enumC16313m0;
        List<InformationItem> informationItems = bffFeed.getInformationItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(informationItems, 10));
        for (InformationItem informationItem : informationItems) {
            arrayList.add(new C29105a(AbstractC8693b.m21278l(informationItem.getLabel()), AbstractC8693b.m21278l(informationItem.getValue())));
        }
        List<TileItem> tileItems = bffFeed.getTileItems();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(tileItems, 10));
        for (TileItem tileItem : tileItems) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(tileItem.getTileLabel());
            String caretIcon = tileItem.getCaretIcon();
            EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_FORWARD;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                c9598e = null;
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), caretIcon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            int whoopIcon = enumC16313m1.toWhoopIcon();
            C9598e destination = tileItem.getDestination();
            if (destination != null && !AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                c9598e = destination;
            }
            arrayList2.add(new C29110f(textResourceM21278l, whoopIcon, c9598e));
        }
        return new InterfaceC29108d.a(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l(bffFeed.getTitle()), AbstractC8693b.m21278l(bffFeed.getAboutTitle()), new AbstractC22403o.c(bffFeed.getAboutImageUrl(), 0, 0, 0, 14, null), arrayList, AbstractC8693b.m21278l(bffFeed.getManufacturerLabel()), AbstractC8693b.m21278l(bffFeed.getManufacturerAddress()), arrayList2);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m88466b(InterfaceC13058l domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return new a(domainState, this);
    }
}

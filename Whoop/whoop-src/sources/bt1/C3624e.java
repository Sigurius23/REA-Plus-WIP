package bt1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.labrador.feature.about.domain.models.InformationItem;
import com.whoop.labrador.feature.about.domain.models.LabradorAboutResponse;
import com.whoop.labrador.feature.about.domain.models.TileItem;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import java.util.ArrayList;
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
import ys1.InterfaceC39752b;

/* JADX INFO: renamed from: bt1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lbt1/e;", "", "<init>", "()V", "Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;", "bffFeed", "Lbt1/d;", "c", "(Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;)Lbt1/d;", "Lec3/l;", "Lys1/b;", "domainState", "b", "(Lec3/l;)Lec3/l;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3624e {

    /* JADX INFO: renamed from: bt1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f14759w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3624e f14760x;

        /* JADX INFO: renamed from: bt1.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41324a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f14761w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3624e f14762x;

            /* JADX INFO: renamed from: bt1.e$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.about.presentation.LabradorAboutViewStateReducer$reduce$$inlined$map$1$2", m100430f = "LabradorAboutViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41325a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f14763E;

                /* JADX INFO: renamed from: F */
                Object f14764F;

                /* JADX INFO: renamed from: G */
                Object f14765G;

                /* JADX INFO: renamed from: H */
                int f14766H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f14767w;

                /* JADX INFO: renamed from: x */
                int f14768x;

                /* JADX INFO: renamed from: y */
                Object f14769y;

                public C41325a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f14767w = obj;
                    this.f14768x |= Integer.MIN_VALUE;
                    return C41324a.this.emit(null, this);
                }
            }

            public C41324a(InterfaceC13062m interfaceC13062m, C3624e c3624e) {
                this.f14761w = interfaceC13062m;
                this.f14762x = c3624e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41325a c41325a;
                Object objM11012c;
                if (interfaceC30057d instanceof C41325a) {
                    c41325a = (C41325a) interfaceC30057d;
                    int i13 = c41325a.f14768x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41325a.f14768x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41325a = new C41325a(interfaceC30057d);
                    }
                } else {
                    c41325a = new C41325a(interfaceC30057d);
                }
                Object obj2 = c41325a.f14767w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41325a.f14768x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f14761w;
                    InterfaceC39752b interfaceC39752b = (InterfaceC39752b) obj;
                    if (AbstractC22676k.m65745e(interfaceC39752b, InterfaceC39752b.c.f171134a)) {
                        objM11012c = InterfaceC3623d.b.INSTANCE.m11010b();
                    } else if (AbstractC22676k.m65745e(interfaceC39752b, InterfaceC39752b.a.f171132a)) {
                        objM11012c = InterfaceC3623d.b.INSTANCE.m11009a();
                    } else {
                        if (!(interfaceC39752b instanceof InterfaceC39752b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM11012c = this.f14762x.m11012c(((InterfaceC39752b.b) interfaceC39752b).getResponse());
                    }
                    c41325a.f14769y = null;
                    c41325a.f14763E = null;
                    c41325a.f14764F = null;
                    c41325a.f14765G = null;
                    c41325a.f14766H = 0;
                    c41325a.f14768x = 1;
                    if (interfaceC13062m.emit(objM11012c, c41325a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C3624e c3624e) {
            this.f14759w = interfaceC13058l;
            this.f14760x = c3624e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f14759w.collect(new C41324a(interfaceC13062m, this.f14760x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final InterfaceC3623d m11012c(LabradorAboutResponse bffFeed) {
        C9598e c9598e;
        EnumC16313m0 enumC16313m0;
        List<InformationItem> informationItems = bffFeed.getInformationItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(informationItems, 10));
        for (InformationItem informationItem : informationItems) {
            arrayList.add(new C3620a(AbstractC8693b.m21278l(informationItem.getLabel()), AbstractC8693b.m21278l(informationItem.getValue())));
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
            arrayList2.add(new C3625f(textResourceM21278l, whoopIcon, c9598e));
        }
        return new InterfaceC3623d.a(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l(bffFeed.getTitle()), AbstractC8693b.m21278l(bffFeed.getAboutTitle()), new AbstractC22403o.c(bffFeed.getAboutImageUrl(), 0, 0, 0, 14, null), arrayList, AbstractC8693b.m21278l(bffFeed.getManufacturerLabel()), AbstractC8693b.m21278l(bffFeed.getManufacturerAddress()), arrayList2);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m11013b(InterfaceC13058l domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return new a(domainState, this);
    }
}

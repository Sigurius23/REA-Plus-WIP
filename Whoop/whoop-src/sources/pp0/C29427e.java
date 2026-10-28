package pp0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.common.network.model.GarmentItemDto;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sp0.C32870j;

/* JADX INFO: renamed from: pp0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0014B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lpp0/e;", "", "La6/g;", "Lf6/f;", "dataStore", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(La6/g;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "Lcom/whoop/common/network/model/GarmentItemDto;", "garmentsList", "Lsp0/j;", "b", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "strapLocationId", "Ll83/a0;", "c", "(ILq83/d;)Ljava/lang/Object;", "a", "La6/g;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29427e {

    /* JADX INFO: renamed from: d */
    public static final int f119477d = 8;

    /* JADX INFO: renamed from: e */
    private static final C14132d f119478e = AbstractC15751g.m44423C("strapLocationOnBodyId");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: pp0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.common.StrapBodyLocationDataStoreHandler", m100430f = "StrapBodyLocationDataStoreHandler.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "storedStrapLocation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f119481w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f119482x;

        /* JADX INFO: renamed from: z */
        int f119484z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119482x = obj;
            this.f119484z |= Integer.MIN_VALUE;
            return C29427e.this.m89703b(null, this);
        }
    }

    /* JADX INFO: renamed from: pp0.e$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.common.StrapBodyLocationDataStoreHandler$updateStrapLocationPreference$2", m100430f = "StrapBodyLocationDataStoreHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119485w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f119486x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f119487y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119487y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f119487y, interfaceC30057d);
            cVar.f119486x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f119486x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119485w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C29427e.f119478e, new Integer(this.f119487y));
            return C23454a0.f92919a;
        }
    }

    public C29427e(InterfaceC0422g dataStore, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.dataStore = dataStore;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m89703b(List<GarmentItemDto> list, InterfaceC30057d<? super C32870j> interfaceC30057d) {
        b bVar;
        Object next;
        Integer num;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f119484z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f119484z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM36577C = bVar.f119482x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f119484z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36577C);
            InterfaceC13058l data = this.dataStore.getData();
            bVar.f119481w = list;
            bVar.f119484z = 1;
            objM36577C = AbstractC13091v.m36577C(data, bVar);
            if (objM36577C == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) bVar.f119481w;
            AbstractC34132o.m107864I(objM36577C);
        }
        AbstractC14134f abstractC14134f = (AbstractC14134f) objM36577C;
        int iIntValue = (abstractC14134f == null || (num = (Integer) abstractC14134f.mo40227b(f119478e)) == null) ? 0 : num.intValue();
        if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ADD_ACTIVITY_REMEMBER_STRAP_LOCATION)) {
            return new C32870j(0, null, 3, null);
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer id4 = ((GarmentItemDto) next).getId();
            if (id4 != null && id4.intValue() == iIntValue) {
                break;
            }
        }
        GarmentItemDto garmentItemDto = (GarmentItemDto) next;
        if (garmentItemDto == null) {
            return new C32870j(0, null, 3, null);
        }
        Integer id5 = garmentItemDto.getId();
        return new C32870j(id5 != null ? id5.intValue() : 0, AbstractC8693b.m21278l(garmentItemDto.getName()));
    }

    /* JADX INFO: renamed from: c */
    public final Object m89704c(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM48861G;
        return (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ADD_ACTIVITY_REMEMBER_STRAP_LOCATION) && (objM48861G = AbstractC17269i.m48861G(this.dataStore, new c(i13, null), interfaceC30057d)) == EnumC31071a.f128113w) ? objM48861G : C23454a0.f92919a;
    }
}

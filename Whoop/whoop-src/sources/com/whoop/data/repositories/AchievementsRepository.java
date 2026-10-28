package com.whoop.data.repositories;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.RemoteDataSource;
import com.whoop.data.remote.commons.Resource;
import com.whoop.domain.model.RecordsDto;
import com.whoop.domain.model.memberlevels.MemberLevelsListViewData;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/data/repositories/AchievementsRepository;", "", "Ltr2/n;", "logger", "Lcom/whoop/data/remote/RemoteDataSource;", "remoteDataSource", "<init>", "(Ltr2/n;Lcom/whoop/data/remote/RemoteDataSource;)V", "", "levelId", "Lcom/whoop/data/remote/commons/Resource;", "", "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;", "getAllMemberLevels", "(ILq83/d;)Ljava/lang/Object;", "Ltr2/n;", "getLogger", "()Ltr2/n;", "Lcom/whoop/data/remote/RemoteDataSource;", "getRemoteDataSource", "()Lcom/whoop/data/remote/RemoteDataSource;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AchievementsRepository {
    private final InterfaceC34116n logger;
    private final RemoteDataSource remoteDataSource;

    /* JADX INFO: renamed from: com.whoop.data.repositories.AchievementsRepository$getAllMemberLevels$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.AchievementsRepository$getAllMemberLevels$2", m100430f = "AchievementsRepository.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "", "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65462 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ int $levelId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65462(int i13, InterfaceC30057d<? super C65462> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$levelId = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AchievementsRepository.this.new C65462(this.$levelId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<? extends List<MemberLevelsListViewData>>> interfaceC30057d) {
            return ((C65462) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    RemoteDataSource remoteDataSource = AchievementsRepository.this.getRemoteDataSource();
                    int i14 = this.$levelId;
                    this.label = 1;
                    obj = remoteDataSource.getAllProgressLevels(i14, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return Resource.INSTANCE.success(MemberLevelsListViewData.INSTANCE.convert((RecordsDto) obj));
            } catch (Exception e5) {
                return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117760b(e5, "Error fetching all member levels", AchievementsRepository.this.getLogger(), null, 8, null), null, null, null, 14, null);
            }
        }
    }

    public AchievementsRepository(InterfaceC34116n logger, RemoteDataSource remoteDataSource) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(remoteDataSource, "remoteDataSource");
        this.logger = logger;
        this.remoteDataSource = remoteDataSource;
    }

    public final Object getAllMemberLevels(int i13, InterfaceC30057d<? super Resource<? extends List<MemberLevelsListViewData>>> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new C65462(i13, null), interfaceC30057d);
    }

    public final InterfaceC34116n getLogger() {
        return this.logger;
    }

    public final RemoteDataSource getRemoteDataSource() {
        return this.remoteDataSource;
    }
}

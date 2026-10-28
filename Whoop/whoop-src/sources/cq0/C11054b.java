package cq0;

import com.whoop.data.remote.RemoteDataSource;
import com.whoop.data.remote.commons.Resource;
import com.whoop.domain.model.Invitation;
import com.whoop.network.exception.DomainException;
import com.whoop.service.network.model.ClaimInviteResponse;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import xg3.C38280g;

/* JADX INFO: renamed from: cq0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcq0/b;", "", "Lcom/whoop/data/remote/RemoteDataSource;", "remoteDataSource", "<init>", "(Lcom/whoop/data/remote/RemoteDataSource;)V", "", "inviteCode", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/domain/model/Invitation;", "b", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "invitation", "Lxg3/g;", "Lpg3/v0;", "Lcom/whoop/service/network/model/ClaimInviteResponse;", "a", "(Lcom/whoop/domain/model/Invitation;)Lxg3/g;", "Lcom/whoop/data/remote/RemoteDataSource;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11054b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final RemoteDataSource remoteDataSource;

    /* JADX INFO: renamed from: cq0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.InvitationRepository", m100430f = "InvitationRepository.kt", m100431l = {14}, m100432m = "validateInviteCode", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f34714E;

        /* JADX INFO: renamed from: w */
        Object f34715w;

        /* JADX INFO: renamed from: x */
        Object f34716x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f34717y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34717y = obj;
            this.f34714E |= Integer.MIN_VALUE;
            return C11054b.this.m29720b(null, this);
        }
    }

    public C11054b(RemoteDataSource remoteDataSource) {
        AbstractC22676k.m65750j(remoteDataSource, "remoteDataSource");
        this.remoteDataSource = remoteDataSource;
    }

    /* JADX INFO: renamed from: a */
    public final C38280g<C29218v0<ClaimInviteResponse>> m29719a(Invitation invitation) {
        AbstractC22676k.m65750j(invitation, "invitation");
        return this.remoteDataSource.joinTeam(invitation.getInviteCode());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m29720b(String str, InterfaceC30057d<? super Resource<Invitation>> interfaceC30057d) {
        a aVar;
        Resource.Companion companion;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f34714E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f34714E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f34717y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f34714E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                Resource.Companion companion2 = Resource.INSTANCE;
                RemoteDataSource remoteDataSource = this.remoteDataSource;
                aVar.f34715w = null;
                aVar.f34716x = companion2;
                aVar.f34714E = 1;
                Object objValidateInviteCode = remoteDataSource.validateInviteCode(str, aVar);
                if (objValidateInviteCode == enumC31071a) {
                    return enumC31071a;
                }
                obj = objValidateInviteCode;
                companion = companion2;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (Resource.Companion) aVar.f34716x;
                AbstractC34132o.m107864I(obj);
            }
            return companion.success(obj);
        } catch (DomainException e5) {
            return Resource.Companion.error$default(Resource.INSTANCE, "", null, null, e5, 6, null);
        }
    }
}

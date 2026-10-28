package mv1;

import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.util.TextResource;
import com.whoop.memberdataexport.models.IntermediateMemberDataExportDto;
import com.whoop.memberdataexport.models.MemberDataExportModel;
import com.whoop.memberdataexport.models.MemberDataExportModelKt;
import com.whoop.memberdataexport.models.SubmitMemberDataDto;
import com.whoop.memberdataexport.services.network.MemberDataExportServiceApi;
import java.io.IOException;
import jv1.AbstractC21969b;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import retrofit2.HttpException;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;

/* JADX INFO: renamed from: mv1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lmv1/a;", "", "Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;", "memberDataExportServiceApi", "Lrr2/c;", "crashReporter", "<init>", "(Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;Lrr2/c;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "logMessage", "Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;", "a", "(Ljava/lang/Exception;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "b", "(Lq83/d;)Ljava/lang/Object;", NotificationCompat.CATEGORY_EMAIL, "c", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;", "Lrr2/c;", "Ltr2/n;", "Ltr2/n;", "logger", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25971a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MemberDataExportServiceApi memberDataExportServiceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: mv1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.memberdataexport.repositories.MemberDataExportServiceRepository", m100430f = "MemberDataExportServiceRepository.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "getMemberDataExportDetailsForUser", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f102531w;

        /* JADX INFO: renamed from: y */
        int f102533y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f102531w = obj;
            this.f102533y |= Integer.MIN_VALUE;
            return C25971a.this.m76987b(this);
        }
    }

    /* JADX INFO: renamed from: mv1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.memberdataexport.repositories.MemberDataExportServiceRepository", m100430f = "MemberDataExportServiceRepository.kt", m100431l = {31}, m100432m = "submitMemberDataExportRequestForUser", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f102534w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f102535x;

        /* JADX INFO: renamed from: z */
        int f102537z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f102535x = obj;
            this.f102537z |= Integer.MIN_VALUE;
            return C25971a.this.m76988c(null, this);
        }
    }

    public C25971a(MemberDataExportServiceApi memberDataExportServiceApi, InterfaceC31766c crashReporter) {
        AbstractC22676k.m65750j(memberDataExportServiceApi, "memberDataExportServiceApi");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        this.memberDataExportServiceApi = memberDataExportServiceApi;
        this.crashReporter = crashReporter;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("MemberDataExportServiceRepository");
    }

    /* JADX INFO: renamed from: a */
    private final MemberDataExportModel.ErrorMemberDataExportModel m76986a(Exception exception, String logMessage) {
        AbstractC36685b.m117759a(exception, logMessage, this.logger, this.crashReporter);
        return new MemberDataExportModel.ErrorMemberDataExportModel(new TextResource.C8688b(AbstractC21969b.f85043c, null, 2, null), new TextResource.C8688b(AbstractC21969b.f85041a, null, 2, null), new TextResource.C8688b(AbstractC21969b.f85042b, null, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m76987b(InterfaceC30057d<? super MemberDataExportModel> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f102533y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f102533y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object memberDataExportDetailsForUser = aVar.f102531w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f102533y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(memberDataExportDetailsForUser);
                MemberDataExportServiceApi memberDataExportServiceApi = this.memberDataExportServiceApi;
                aVar.f102533y = 1;
                memberDataExportDetailsForUser = memberDataExportServiceApi.getMemberDataExportDetailsForUser(aVar);
                if (memberDataExportDetailsForUser == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(memberDataExportDetailsForUser);
            }
            return MemberDataExportModelKt.reduceDtoToModel((IntermediateMemberDataExportDto) memberDataExportDetailsForUser);
        } catch (IOException e5) {
            return m76986a(e5, "IOException: Failed to get member data export details.");
        } catch (HttpException e13) {
            return m76986a(e13, AbstractC2875y.m8295h(e13.f128920w, "HttpException: Failed to get member data export details. HttpResponse Code: "));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m76988c(String str, InterfaceC30057d<? super MemberDataExportModel> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f102537z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f102537z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objSubmitMemberDataExportRequestForUser = bVar.f102535x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f102537z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objSubmitMemberDataExportRequestForUser);
                MemberDataExportServiceApi memberDataExportServiceApi = this.memberDataExportServiceApi;
                SubmitMemberDataDto submitMemberDataDto = new SubmitMemberDataDto(str);
                bVar.f102534w = null;
                bVar.f102537z = 1;
                objSubmitMemberDataExportRequestForUser = memberDataExportServiceApi.submitMemberDataExportRequestForUser(submitMemberDataDto, bVar);
                if (objSubmitMemberDataExportRequestForUser == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objSubmitMemberDataExportRequestForUser);
            }
            return MemberDataExportModelKt.reduceDtoToModel((IntermediateMemberDataExportDto) objSubmitMemberDataExportRequestForUser);
        } catch (IOException e5) {
            return m76986a(e5, "IOException: Failed to submit member data export request.");
        } catch (HttpException e13) {
            return m76986a(e13, AbstractC2875y.m8295h(e13.f128920w, "HttpException: Failed to submit member data export request. HttpResponse Code: "));
        }
    }
}

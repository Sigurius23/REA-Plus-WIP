package cq0;

import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.domain.dto.community.share.TeamResponseDto;
import com.whoop.data.remote.domain.dto.community.share.WidgetResponseDto;
import com.whoop.domain.model.teams.WidgetCollectionResponse;
import com.whoop.domain.model.teams.share.TeamResponse;
import com.whoop.network.exception.DomainException;
import com.whoop.widget.api.WidgetApi;
import hj0.AbstractC17355n;
import in2.InterfaceC18732d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;

/* JADX INFO: renamed from: cq0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lcq0/h;", "Lhj0/n;", "Lcom/whoop/widget/api/WidgetApi;", "widgetApi", "Ltr2/n;", "logger", "Lin2/d;", "dispatcherFactory", "Lrr2/c;", "crashReporter", "<init>", "(Lcom/whoop/widget/api/WidgetApi;Ltr2/n;Lin2/d;Lrr2/c;)V", "", "collectionName", HttpHeaders.DATE, "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/domain/model/teams/WidgetCollectionResponse;", "f", "(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/teams/share/TeamResponse;", "e", "(IILq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/widget/api/WidgetApi;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11060h extends AbstractC17355n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WidgetApi widgetApi;

    /* JADX INFO: renamed from: cq0.h$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.WidgetRepository", m100430f = "WidgetRepository.kt", m100431l = {47}, m100432m = "fetchSelectTeam", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f34917E;

        /* JADX INFO: renamed from: w */
        int f34918w;

        /* JADX INFO: renamed from: x */
        int f34919x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f34920y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34920y = obj;
            this.f34917E |= Integer.MIN_VALUE;
            return C11060h.this.m29835e(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: cq0.h$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.WidgetRepository", m100430f = "WidgetRepository.kt", m100431l = {28}, m100432m = "fetchWidgets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f34922E;

        /* JADX INFO: renamed from: G */
        int f34924G;

        /* JADX INFO: renamed from: w */
        Object f34925w;

        /* JADX INFO: renamed from: x */
        Object f34926x;

        /* JADX INFO: renamed from: y */
        int f34927y;

        /* JADX INFO: renamed from: z */
        int f34928z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34922E = obj;
            this.f34924G |= Integer.MIN_VALUE;
            return C11060h.this.m29836f(null, null, 0, 0, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11060h(WidgetApi widgetApi, InterfaceC34116n logger, InterfaceC18732d dispatcherFactory, InterfaceC31766c crashReporter) {
        super(logger, crashReporter, dispatcherFactory);
        AbstractC22676k.m65750j(widgetApi, "widgetApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        this.widgetApi = widgetApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m29835e(int i13, int i14, InterfaceC30057d<? super Resource<TeamResponse>> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i15 = aVar.f34917E;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                aVar.f34917E = i15 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object selectTeams = aVar.f34920y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = aVar.f34917E;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(selectTeams);
                WidgetApi widgetApi = this.widgetApi;
                aVar.f34918w = i13;
                aVar.f34919x = i14;
                aVar.f34917E = 1;
                selectTeams = widgetApi.getSelectTeams(i13, i14, aVar);
                if (selectTeams == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(selectTeams);
            }
            return Resource.INSTANCE.success(((TeamResponseDto) selectTeams).toTeamResponse());
        } catch (Throwable th3) {
            return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117759a(th3, "Exception occurred while getting fetching user teams", getLogger(), getCrashReporter()), null, null, DomainException.INSTANCE.m23148a(th3), 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m29836f(String str, String str2, int i13, int i14, InterfaceC30057d<? super Resource<WidgetCollectionResponse>> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i15 = bVar.f34924G;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f34924G = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object userWidgetsForCollection = bVar2.f34922E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = bVar2.f34924G;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(userWidgetsForCollection);
                WidgetApi widgetApi = this.widgetApi;
                bVar2.f34925w = null;
                bVar2.f34926x = null;
                bVar2.f34927y = i13;
                bVar2.f34928z = i14;
                bVar2.f34924G = 1;
                userWidgetsForCollection = widgetApi.getUserWidgetsForCollection(str, str2, i13, i14, bVar2);
                if (userWidgetsForCollection == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(userWidgetsForCollection);
            }
            return Resource.INSTANCE.success(((WidgetResponseDto) userWidgetsForCollection).toWidgetCollectionResponse());
        } catch (Throwable th3) {
            return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117759a(th3, "Exception occurred while getting fetching user widgets", getLogger(), getCrashReporter()), null, null, DomainException.INSTANCE.m23148a(th3), 6, null);
        }
    }
}

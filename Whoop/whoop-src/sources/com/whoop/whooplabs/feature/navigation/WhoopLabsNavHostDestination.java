package com.whoop.whooplabs.feature.navigation;

import android.net.Uri;
import androidx.annotation.Keep;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jz2.EnumC22078a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p114eb.C12953f;
import p114eb.C12974m;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\b\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;", "", "", "baseRoute", "", "Ljz2/a;", "navArgs", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getBaseRoute$whooplabs_release", "()Ljava/lang/String;", "Ljava/util/List;", "route", "getRoute", "Leb/f;", "args", "getArgs", "()Ljava/util/List;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "b", "d", "e", "c", "f", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$a;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$c;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$d;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$h;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class WhoopLabsNavHostDestination {
    public static final int $stable = 8;
    private final List<C12953f> args;
    private final String baseRoute;
    private final List<EnumC22078a> navArgs;
    private final String route;

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.WhoopLabsNavHostDestination$a */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$a;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;", "<init>", "()V", "", "campaignId", "", "a", "(I)Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10830a extends WhoopLabsNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C10830a f33233a = new C10830a();

        /* JADX INFO: renamed from: b */
        public static final int f33234b = 8;

        private C10830a() {
            super("CampaignDetails", AbstractC37056f.m118958J(EnumC22078a.CampaignId), null);
        }

        /* JADX INFO: renamed from: a */
        public final String m28554a(int campaignId) {
            return AbstractC25012a.m73373f(campaignId, getBaseRoute(), "/");
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.WhoopLabsNavHostDestination$b */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;", "<init>", "()V", "", "campaignId", "", "a", "(I)Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10831b extends WhoopLabsNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C10831b f33235a = new C10831b();

        /* JADX INFO: renamed from: b */
        public static final int f33236b = 8;

        private C10831b() {
            super("CampaignExtendedDetails", AbstractC37056f.m118958J(EnumC22078a.CampaignId), null);
        }

        /* JADX INFO: renamed from: a */
        public final String m28555a(int campaignId) {
            return AbstractC25012a.m73373f(campaignId, getBaseRoute(), "/");
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.WhoopLabsNavHostDestination$c */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$c;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;", "<init>", "()V", "", "campaignId", "", "a", "(I)Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10832c extends WhoopLabsNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C10832c f33237a = new C10832c();

        /* JADX INFO: renamed from: b */
        public static final int f33238b = 8;

        private C10832c() {
            super("CampaignSchedule", AbstractC37056f.m118958J(EnumC22078a.CampaignId), null);
        }

        /* JADX INFO: renamed from: a */
        public final String m28556a(int campaignId) {
            return AbstractC25012a.m73373f(campaignId, getBaseRoute(), "/");
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.WhoopLabsNavHostDestination$d */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$d;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;", "<init>", "()V", "", "campaignId", "sessionId", "", "a", "(ILjava/lang/Integer;)Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10833d extends WhoopLabsNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C10833d f33239a = new C10833d();

        /* JADX INFO: renamed from: b */
        public static final int f33240b = 8;

        private C10833d() {
            super("CampaignScreening", AbstractC37056f.m118959K(EnumC22078a.CampaignId, EnumC22078a.SessionId), null);
        }

        /* JADX INFO: renamed from: a */
        public final String m28557a(int campaignId, Integer sessionId) {
            if (sessionId == null) {
                return AbstractC25012a.m73373f(campaignId, getBaseRoute(), "/");
            }
            return getBaseRoute() + "/" + campaignId + "?sessionId=" + sessionId;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.WhoopLabsNavHostDestination$e */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;", "<init>", "()V", "", "campaignId", "sessionId", "", "a", "(ILjava/lang/Integer;)Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10834e extends WhoopLabsNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C10834e f33241a = new C10834e();

        /* JADX INFO: renamed from: b */
        public static final int f33242b = 8;

        private C10834e() {
            super("CampaignSteps", AbstractC37056f.m118959K(EnumC22078a.CampaignId, EnumC22078a.SessionId), null);
        }

        /* JADX INFO: renamed from: a */
        public final String m28558a(int campaignId, Integer sessionId) {
            if (sessionId == null) {
                return AbstractC25012a.m73373f(campaignId, getBaseRoute(), "/");
            }
            return getBaseRoute() + "/" + campaignId + "?sessionId=" + sessionId;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.WhoopLabsNavHostDestination$f */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;", "<init>", "()V", "", "campaignFilter", "a", "(Ljava/lang/String;)Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10835f extends WhoopLabsNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C10835f f33243a = new C10835f();

        /* JADX INFO: renamed from: b */
        public static final int f33244b = 8;

        private C10835f() {
            super("CompletedCampaigns", AbstractC37056f.m118958J(EnumC22078a.CampaignFilter), null);
        }

        /* JADX INFO: renamed from: a */
        public final String m28559a(String campaignFilter) {
            AbstractC22676k.m65750j(campaignFilter, "campaignFilter");
            return AbstractC18489d0.m53370k(getBaseRoute(), "/", Uri.encode(campaignFilter));
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.WhoopLabsNavHostDestination$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10836g extends WhoopLabsNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C10836g f33245a = new C10836g();

        /* JADX INFO: renamed from: b */
        public static final int f33246b = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private C10836g() {
            super("Home", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.WhoopLabsNavHostDestination$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$h;", "Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10837h extends WhoopLabsNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C10837h f33247a = new C10837h();

        /* JADX INFO: renamed from: b */
        public static final int f33248b = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private C10837h() {
            super("Onboarding", null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ WhoopLabsNavHostDestination(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    private static final C23454a0 args$lambda$0$0(EnumC22078a enumC22078a, C12974m navArgument) {
        AbstractC22676k.m65750j(navArgument, "$this$navArgument");
        navArgument.m36462b(enumC22078a.getNavType());
        if (!enumC22078a.getIsRequired()) {
            navArgument.f44811a.f44789a = true;
        }
        return C23454a0.f92919a;
    }

    public final List<C12953f> getArgs() {
        return this.args;
    }

    /* JADX INFO: renamed from: getBaseRoute$whooplabs_release, reason: from getter */
    public final String getBaseRoute() {
        return this.baseRoute;
    }

    public final String getRoute() {
        return this.route;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private WhoopLabsNavHostDestination(String str, List<? extends EnumC22078a> list) {
        this.baseRoute = str;
        this.navArgs = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC22078a) obj).getIsRequired()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add("{" + ((EnumC22078a) it.next()).getKey() + "}");
        }
        List<EnumC22078a> list2 = this.navArgs;
        ArrayList<EnumC22078a> arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (!((EnumC22078a) obj2).getIsRequired()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        for (EnumC22078a enumC22078a : arrayList3) {
            arrayList4.add(enumC22078a.getKey() + "={" + enumC22078a.getKey() + "}");
        }
        this.route = AbstractC2875y.m8299l(AbstractC25265s.m74110N0(AbstractC25265s.m74129g1(AbstractC37056f.m118958J(this.baseRoute), arrayList2), "/", null, null, null, 62), AbstractC25265s.m74110N0(arrayList4, "&", "?", null, null, 60));
        List<EnumC22078a> list3 = this.navArgs;
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        for (EnumC22078a enumC22078a2 : list3) {
            String name = enumC22078a2.getKey();
            AbstractC22676k.m65750j(name, "name");
            C12974m c12974m = new C12974m();
            args$lambda$0$0(enumC22078a2, c12974m);
            arrayList5.add(new C12953f(name, c12974m.f44811a.m36452a()));
        }
        this.args = arrayList5;
    }

    public /* synthetic */ WhoopLabsNavHostDestination(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, null);
    }
}

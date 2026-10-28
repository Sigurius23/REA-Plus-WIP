package com.whoop.membership.familyPlan.navigation;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p114eb.C12953f;
import p114eb.C12974m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tw1.EnumC34223d;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;", "", "", "baseRoute", "", "Ltw1/d;", "navArgs", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getBaseRoute$membership_release", "()Ljava/lang/String;", "Ljava/util/List;", "route", "getRoute", "Leb/f;", "args", "getArgs", "()Ljava/util/List;", "a", "b", "Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$a;", "Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class FamilyPlanNavHostDestination {
    public static final int $stable = 8;
    private final List<C12953f> args;
    private final String baseRoute;
    private final List<EnumC34223d> navArgs;
    private final String route;

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.navigation.FamilyPlanNavHostDestination$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$a;", "Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9111a extends FamilyPlanNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C9111a f27233a = new C9111a();

        /* JADX INFO: renamed from: b */
        public static final int f27234b = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private C9111a() {
            super("FamilyPlanHubScreen", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.navigation.FamilyPlanNavHostDestination$b */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;", "Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;", "<init>", "()V", "", "isNewMember", "", "a", "(Z)Ljava/lang/String;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9112b extends FamilyPlanNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C9112b f27235a = new C9112b();

        /* JADX INFO: renamed from: b */
        public static final int f27236b = 8;

        private C9112b() {
            super("FamilyPlanInviteNewMemberScreen", AbstractC37056f.m118958J(EnumC34223d.NewMember), null);
        }

        /* JADX INFO: renamed from: a */
        public final String m22735a(boolean isNewMember) {
            return getBaseRoute() + "/" + isNewMember;
        }
    }

    public /* synthetic */ FamilyPlanNavHostDestination(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    private static final C23454a0 args$lambda$0$0(EnumC34223d enumC34223d, C12974m navArgument) {
        AbstractC22676k.m65750j(navArgument, "$this$navArgument");
        navArgument.m36462b(enumC34223d.getNavType());
        if (!enumC34223d.getIsRequired()) {
            navArgument.f44811a.f44789a = true;
        }
        return C23454a0.f92919a;
    }

    public final List<C12953f> getArgs() {
        return this.args;
    }

    /* JADX INFO: renamed from: getBaseRoute$membership_release, reason: from getter */
    public final String getBaseRoute() {
        return this.baseRoute;
    }

    public final String getRoute() {
        return this.route;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FamilyPlanNavHostDestination(String str, List<? extends EnumC34223d> list) {
        this.baseRoute = str;
        this.navArgs = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC34223d) obj).getIsRequired()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add("{" + ((EnumC34223d) it.next()).getKey() + "}");
        }
        List<EnumC34223d> list2 = this.navArgs;
        ArrayList<EnumC34223d> arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (!((EnumC34223d) obj2).getIsRequired()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        for (EnumC34223d enumC34223d : arrayList3) {
            arrayList4.add(enumC34223d.getKey() + "={" + enumC34223d.getKey() + "}");
        }
        this.route = AbstractC2875y.m8299l(AbstractC25265s.m74110N0(AbstractC25265s.m74129g1(AbstractC37056f.m118958J(this.baseRoute), arrayList2), "/", null, null, null, 62), AbstractC25265s.m74110N0(arrayList4, "&", "?", null, null, 60));
        List<EnumC34223d> list3 = this.navArgs;
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        for (EnumC34223d enumC34223d2 : list3) {
            String name = enumC34223d2.getKey();
            AbstractC22676k.m65750j(name, "name");
            C12974m c12974m = new C12974m();
            args$lambda$0$0(enumC34223d2, c12974m);
            arrayList5.add(new C12953f(name, c12974m.f44811a.m36452a()));
        }
        this.args = arrayList5;
    }

    public /* synthetic */ FamilyPlanNavHostDestination(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, null);
    }
}

package com.whoop.membership.management.navigation;

import ad3.AbstractC0757c;
import ad3.C0755b;
import android.net.Uri;
import androidx.annotation.Keep;
import com.whoop.payments.domain.models.Card;
import ih0.AbstractC18489d0;
import ix1.EnumC21020c;
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
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0004\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;", "", "", "baseRoute", "", "Lix1/c;", "navArgs", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getBaseRoute$membership_release", "()Ljava/lang/String;", "Ljava/util/List;", "route", "getRoute", "Leb/f;", "args", "getArgs", "()Ljava/util/List;", "c", "b", "d", "a", "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;", "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;", "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$c;", "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class MembershipManagementNavHostDestination {
    public static final int $stable = 8;
    private final List<C12953f> args;
    private final String baseRoute;
    private final List<EnumC21020c> navArgs;
    private final String route;

    /* JADX INFO: renamed from: com.whoop.membership.management.navigation.MembershipManagementNavHostDestination$a */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;", "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;", "<init>", "()V", "", "path", "payload", "Lcom/whoop/payments/domain/models/Card;", "card", "", "isIndependentCheckout", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Z)Ljava/lang/String;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9122a extends MembershipManagementNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C9122a f27273a = new C9122a();

        /* JADX INFO: renamed from: b */
        public static final int f27274b = 8;

        private C9122a() {
            super("CheckoutScreen", AbstractC37056f.m118959K(EnumC21020c.Path, EnumC21020c.Payload, EnumC21020c.Card, EnumC21020c.IsIndependentCheckout), null);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ String m22790b(C9122a c9122a, String str, String str2, Card card, boolean z4, int i13, Object obj) {
            if ((i13 & 8) != 0) {
                z4 = false;
            }
            return c9122a.m22791a(str, str2, card, z4);
        }

        /* JADX INFO: renamed from: a */
        public final String m22791a(String path, String payload, Card card, boolean isIndependentCheckout) {
            String strEncode;
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(payload, "payload");
            if (card != null) {
                C0755b c0755b = AbstractC0757c.f2762d;
                c0755b.getClass();
                strEncode = Uri.encode(c0755b.m1833d(Card.INSTANCE.serializer(), card));
            } else {
                strEncode = null;
            }
            if (strEncode != null) {
                String str = f27273a.getBaseRoute() + "/" + path + "/" + payload + "/" + isIndependentCheckout + "?card=" + strEncode;
                if (str != null) {
                    return str;
                }
            }
            return getBaseRoute() + "/" + path + "/" + payload + "/" + isIndependentCheckout;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.navigation.MembershipManagementNavHostDestination$b */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;", "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;", "<init>", "()V", "", "payload", "a", "(Ljava/lang/String;)Ljava/lang/String;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9123b extends MembershipManagementNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C9123b f27275a = new C9123b();

        /* JADX INFO: renamed from: b */
        public static final int f27276b = 8;

        private C9123b() {
            super("MembershipAdjustmentCheckoutScreen", AbstractC37056f.m118958J(EnumC21020c.Payload), null);
        }

        /* JADX INFO: renamed from: a */
        public final String m22792a(String payload) {
            AbstractC22676k.m65750j(payload, "payload");
            return AbstractC18489d0.m53370k(getBaseRoute(), "/", payload);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.navigation.MembershipManagementNavHostDestination$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$c;", "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9124c extends MembershipManagementNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C9124c f27277a = new C9124c();

        /* JADX INFO: renamed from: b */
        public static final int f27278b = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private C9124c() {
            super("MembershipAndBillingScreen", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.navigation.MembershipManagementNavHostDestination$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;", "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9125d extends MembershipManagementNavHostDestination {

        /* JADX INFO: renamed from: a */
        public static final C9125d f27279a = new C9125d();

        /* JADX INFO: renamed from: b */
        public static final int f27280b = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private C9125d() {
            super("MembershipManagementScreen", null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ MembershipManagementNavHostDestination(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    private static final C23454a0 args$lambda$0$0(EnumC21020c enumC21020c, C12974m navArgument) {
        AbstractC22676k.m65750j(navArgument, "$this$navArgument");
        navArgument.m36462b(enumC21020c.getNavType());
        if (!enumC21020c.getIsRequired()) {
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
    private MembershipManagementNavHostDestination(String str, List<? extends EnumC21020c> list) {
        this.baseRoute = str;
        this.navArgs = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC21020c) obj).getIsRequired()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add("{" + ((EnumC21020c) it.next()).getKey() + "}");
        }
        List<EnumC21020c> list2 = this.navArgs;
        ArrayList<EnumC21020c> arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (!((EnumC21020c) obj2).getIsRequired()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        for (EnumC21020c enumC21020c : arrayList3) {
            arrayList4.add(enumC21020c.getKey() + "={" + enumC21020c.getKey() + "}");
        }
        this.route = AbstractC2875y.m8299l(AbstractC25265s.m74110N0(AbstractC25265s.m74129g1(AbstractC37056f.m118958J(this.baseRoute), arrayList2), "/", null, null, null, 62), AbstractC25265s.m74110N0(arrayList4, "&", "?", null, null, 60));
        List<EnumC21020c> list3 = this.navArgs;
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        for (EnumC21020c enumC21020c2 : list3) {
            String name = enumC21020c2.getKey();
            AbstractC22676k.m65750j(name, "name");
            C12974m c12974m = new C12974m();
            args$lambda$0$0(enumC21020c2, c12974m);
            arrayList5.add(new C12953f(name, c12974m.f44811a.m36452a()));
        }
        this.args = arrayList5;
    }

    public /* synthetic */ MembershipManagementNavHostDestination(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, null);
    }
}

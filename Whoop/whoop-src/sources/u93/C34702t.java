package u93;

import androidx.health.platform.client.proto.C1533u;
import bg.C3215j;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kb3.C22336e;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import lb3.AbstractC23771f;
import lb3.AbstractC23811y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import va3.C35850h;
import ya3.C39371n;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: u93.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C34702t extends AbstractC22713p {

    /* JADX INFO: renamed from: b */
    public final C22336e f146146b;

    /* JADX INFO: renamed from: c */
    public final C22336e f146147c;

    /* JADX INFO: renamed from: d */
    public final C22340i f146148d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C34704u f146149e;

    public C34702t(C34704u c34704u, InterfaceC22345n interfaceC22345n) {
        if (interfaceC22345n == null) {
            m109609a(0);
            throw null;
        }
        this.f146149e = c34704u;
        C22342k c22342k = (C22342k) interfaceC22345n;
        this.f146146b = c22342k.m64223b(new C34698r(this, 0));
        this.f146147c = c22342k.m64223b(new C34698r(this, 1));
        this.f146148d = new C22340i(c22342k, new C3215j(this, 16));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m109609a(int i13) {
        String str;
        int i14;
        if (i13 != 3 && i13 != 7 && i13 != 9 && i13 != 12) {
            switch (i13) {
                case 15:
                case 16:
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 3 && i13 != 7 && i13 != 9 && i13 != 12) {
            switch (i13) {
                case 15:
                case 16:
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    i14 = 2;
                    break;
                default:
                    i14 = 3;
                    break;
            }
        } else {
            i14 = 2;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = "name";
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case 13:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = "p";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i13 == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i13 == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i13 == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i13 != 12) {
            switch (i13) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case 16:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    objArr[1] = "getFunctionNames";
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    objArr[1] = "getClassifierNames";
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i13) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case 13:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 3 && i13 != 7 && i13 != 9 && i13 != 12) {
            switch (i13) {
                case 15:
                case 16:
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC22712o m109610b() {
        InterfaceC22712o interfaceC22712oMo64128u = ((AbstractC23811y) ((AbstractC23771f) this.f146149e.mo60496e()).getSupertypes().iterator().next()).mo64128u();
        if (interfaceC22712oMo64128u != null) {
            return interfaceC22712oMo64128u;
        }
        m109609a(9);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet m109611c(C35850h c35850h, Collection collection) {
        if (c35850h == null) {
            m109609a(10);
            throw null;
        }
        if (collection == null) {
            m109609a(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C39371n.f169420c.m125565h(c35850h, collection, Collections.EMPTY_SET, this.f146149e, new C34700s(linkedHashSet));
        return linkedHashSet;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getClassifierNames() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m109609a(18);
        throw null;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedDescriptors(C22704g c22704g, Function1 function1) {
        if (c22704g == null) {
            m109609a(13);
            throw null;
        }
        Collection collection = (Collection) this.f146148d.invoke();
        if (collection != null) {
            return collection;
        }
        m109609a(15);
        throw null;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedFunctions(C35850h c35850h, InterfaceC40210a interfaceC40210a) {
        if (c35850h == null) {
            m109609a(5);
            throw null;
        }
        if (interfaceC40210a != null) {
            return (Collection) this.f146146b.invoke(c35850h);
        }
        m109609a(6);
        throw null;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Collection getContributedVariables(C35850h c35850h, InterfaceC40210a interfaceC40210a) {
        if (c35850h != null) {
            return (Collection) this.f146147c.invoke(c35850h);
        }
        m109609a(1);
        throw null;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getFunctionNames() {
        Set set = (Set) this.f146149e.f146157I.invoke();
        if (set != null) {
            return set;
        }
        m109609a(17);
        throw null;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getVariableNames() {
        Set set = (Set) this.f146149e.f146157I.invoke();
        if (set != null) {
            return set;
        }
        m109609a(19);
        throw null;
    }
}

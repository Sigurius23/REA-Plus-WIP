package ya3;

import androidx.health.platform.client.proto.C1533u;
import androidx.room.C1774d;
import cb3.AbstractC4393e;
import com.mapbox.common.logger.LogPriority;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import l83.C23465k;
import lb3.AbstractC23773f1;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.C23765d;
import lb3.C23794p0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mb3.AbstractC25390g;
import mb3.InterfaceC25386c;
import mb3.InterfaceC25387d;
import p000.AbstractC30802r;
import p097ds.AbstractC12313p;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.functions.Function1;
import pg3.C29203o;
import q63.AbstractC30007c;
import r93.AbstractC31146o;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31107a1;
import r93.InterfaceC31108b;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31142m0;
import r93.InterfaceC31145n0;
import r93.InterfaceC31149p0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31162w;
import r93.InterfaceC31165x0;
import u93.AbstractC34670d;
import u93.AbstractC34685k0;
import u93.AbstractC34710x;
import u93.AbstractC34711x0;
import u93.C34689m0;
import ub3.AbstractC34756j;
import ub3.C34754h;
import va3.C35850h;

/* JADX INFO: renamed from: ya3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C39371n {

    /* JADX INFO: renamed from: b */
    public static final List f169419b = AbstractC25265s.m74093D1(ServiceLoader.load(InterfaceC39364g.class, InterfaceC39364g.class.getClassLoader()));

    /* JADX INFO: renamed from: c */
    public static final C39371n f169420c;

    /* JADX INFO: renamed from: d */
    public static final C39367j f169421d;

    /* JADX INFO: renamed from: a */
    public final InterfaceC25386c f169422a;

    static {
        C39367j c39367j = new C39367j();
        f169421d = c39367j;
        f169420c = new C39371n(c39367j);
    }

    public C39371n(InterfaceC25386c interfaceC25386c) {
        if (interfaceC25386c != null) {
            this.f169422a = interfaceC25386c;
        } else {
            m125550a(5);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m125550a(int i13) {
        String str;
        int i14;
        if (i13 != 11 && i13 != 12 && i13 != 16 && i13 != 21 && i13 != 93 && i13 != 96 && i13 != 101 && i13 != 42 && i13 != 43) {
            switch (i13) {
                default:
                    switch (i13) {
                        default:
                            switch (i13) {
                                default:
                                    switch (i13) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 11 && i13 != 12 && i13 != 16 && i13 != 21 && i13 != 93 && i13 != 96 && i13 != 101 && i13 != 42 && i13 != 43) {
            switch (i13) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i14 = 2;
                    break;
                default:
                    switch (i13) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i14 = 2;
                            break;
                        default:
                            switch (i13) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i14 = 2;
                                    break;
                                default:
                                    switch (i13) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            i14 = 2;
                                            break;
                                        default:
                                            i14 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i14 = 2;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "descriptor";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[0] = "result";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case LogPriority.NONE /* 99 */:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i13 == 11 || i13 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i13 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i13 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i13 == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i13 == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i13 == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i13 != 42 && i13 != 43) {
            switch (i13) {
                case 24:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i13) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i13) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i13) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i13) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case LogPriority.NONE /* 99 */:
            case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 11 && i13 != 12 && i13 != 16 && i13 != 21 && i13 != 93 && i13 != 96 && i13 != 101 && i13 != 42 && i13 != 43) {
            switch (i13) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i13) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i13) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i13) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m125551b(AbstractC23811y abstractC23811y, AbstractC23811y abstractC23811y2, C23794p0 c23794p0) {
        if (abstractC23811y == null) {
            m125550a(44);
            throw null;
        }
        if (abstractC23811y2 == null) {
            m125550a(45);
            throw null;
        }
        if (AbstractC23791o.m69886e(abstractC23811y) && AbstractC23791o.m69886e(abstractC23811y2)) {
            return true;
        }
        return C23765d.m69833g(c23794p0, abstractC23811y.mo69863p0(), abstractC23811y2.mo69863p0());
    }

    /* JADX INFO: renamed from: c */
    public static void m125552c(InterfaceC31111c interfaceC31111c, LinkedHashSet linkedHashSet) {
        if (interfaceC31111c == null) {
            m125550a(17);
            throw null;
        }
        if (AbstractC30007c.m91831a(interfaceC31111c.getKind())) {
            linkedHashSet.add(interfaceC31111c);
            return;
        }
        if (interfaceC31111c.mo78673h().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC31111c);
        }
        Iterator it = interfaceC31111c.mo78673h().iterator();
        while (it.hasNext()) {
            m125552c((InterfaceC31111c) it.next(), linkedHashSet);
        }
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m125553d(InterfaceC31108b interfaceC31108b) {
        InterfaceC31151q0 interfaceC31151q0Mo78667B = interfaceC31108b.mo78667B();
        ArrayList arrayList = new ArrayList();
        if (interfaceC31151q0Mo78667B != null) {
            arrayList.add(((AbstractC34670d) interfaceC31151q0Mo78667B).getType());
        }
        Iterator it = interfaceC31108b.mo78676v().iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC34711x0) ((InterfaceC31107a1) it.next())).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX INFO: renamed from: e */
    public static void m125554e(Collection collection, InterfaceC31117e interfaceC31117e, AbstractC39373p abstractC39373p) {
        EnumC31106a0 enumC31106a0;
        boolean z4;
        if (collection == null) {
            m125550a(83);
            throw null;
        }
        if (interfaceC31117e == null) {
            m125550a(84);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            boolean z13 = false;
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList.isEmpty();
                if (!zIsEmpty) {
                    collection = arrayList;
                }
                Iterator it3 = collection.iterator();
                boolean z14 = false;
                boolean z15 = false;
                while (true) {
                    if (!it3.hasNext()) {
                        if (interfaceC31117e.mo60493U() && interfaceC31117e.mo60498k() != EnumC31106a0.f128307E && interfaceC31117e.mo60498k() != EnumC31106a0.f128311y) {
                            z13 = true;
                        }
                        if (z14 && !z15) {
                            enumC31106a0 = EnumC31106a0.f128312z;
                            break;
                        }
                        if (!z14 && z15) {
                            EnumC31106a0 enumC31106a0Mo60498k = z13 ? interfaceC31117e.mo60498k() : EnumC31106a0.f128307E;
                            if (enumC31106a0Mo60498k != null) {
                                enumC31106a0 = enumC31106a0Mo60498k;
                                break;
                            } else {
                                m125550a(90);
                                throw null;
                            }
                        }
                        HashSet<InterfaceC31111c> hashSet = new HashSet();
                        for (InterfaceC31111c interfaceC31111c : collection) {
                            if (interfaceC31111c == null) {
                                m125550a(15);
                                throw null;
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            m125552c(interfaceC31111c, linkedHashSet);
                            hashSet.addAll(linkedHashSet);
                        }
                        if (!hashSet.isEmpty()) {
                            AbstractC30802r.m94771t(AbstractC4393e.m13812j((InterfaceC31135k) hashSet.iterator().next()).mo78665r(AbstractC25390g.f99475a));
                        }
                        C39360c c39360c = new C39360c(1);
                        if (hashSet.size() > 1) {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            for (Object obj : hashSet) {
                                Iterator it4 = linkedHashSet2.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        linkedHashSet2.add(obj);
                                        break;
                                    }
                                    C23465k c23465k = (C23465k) c39360c.invoke(obj, it4.next());
                                    InterfaceC31108b interfaceC31108b = (InterfaceC31108b) c23465k.f92937w;
                                    InterfaceC31108b interfaceC31108b2 = (InterfaceC31108b) c23465k.f92938x;
                                    if (!m125561q(interfaceC31108b, interfaceC31108b2)) {
                                        if (m125561q(interfaceC31108b2, interfaceC31108b)) {
                                            break;
                                        }
                                    } else {
                                        it4.remove();
                                    }
                                }
                            }
                            hashSet = linkedHashSet2;
                        }
                        EnumC31106a0 enumC31106a0Mo60498k2 = interfaceC31117e.mo60498k();
                        if (enumC31106a0Mo60498k2 == null) {
                            m125550a(92);
                            throw null;
                        }
                        EnumC31106a0 enumC31106a1 = EnumC31106a0.f128307E;
                        for (InterfaceC31111c interfaceC31111c2 : hashSet) {
                            EnumC31106a0 enumC31106a0Mo60498k3 = (z13 && interfaceC31111c2.mo60498k() == EnumC31106a0.f128307E) ? enumC31106a0Mo60498k2 : interfaceC31111c2.mo60498k();
                            if (enumC31106a0Mo60498k3.compareTo(enumC31106a1) < 0) {
                                enumC31106a1 = enumC31106a0Mo60498k3;
                            }
                        }
                        if (enumC31106a1 != null) {
                            enumC31106a0 = enumC31106a1;
                            break;
                        } else {
                            m125550a(93);
                            throw null;
                        }
                    }
                    InterfaceC31111c interfaceC31111c3 = (InterfaceC31111c) it3.next();
                    int iOrdinal = interfaceC31111c3.mo60498k().ordinal();
                    if (iOrdinal == 0) {
                        enumC31106a0 = EnumC31106a0.f128310x;
                        break;
                    }
                    if (iOrdinal == 1) {
                        throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC31111c3);
                    }
                    if (iOrdinal == 2) {
                        z14 = true;
                    } else if (iOrdinal == 3) {
                        z15 = true;
                    }
                }
                InterfaceC31111c interfaceC31111cMo78655a0 = ((InterfaceC31111c) m125563s(collection, new C39368k())).mo78655a0(interfaceC31117e, enumC31106a0, zIsEmpty ? AbstractC31150q.f128356h : AbstractC31150q.f128355g);
                abstractC39373p.mo43951n(interfaceC31111cMo78655a0, collection);
                abstractC39373p.mo43949b(interfaceC31111cMo78655a0);
                return;
            }
            Object next = it.next();
            InterfaceC31111c interfaceC31111c4 = (InterfaceC31111c) next;
            if (!AbstractC31150q.m95877e(interfaceC31111c4.getVisibility())) {
                if (interfaceC31111c4 == null) {
                    AbstractC31150q.m95873a(2);
                    throw null;
                }
                if (interfaceC31117e == null) {
                    AbstractC31150q.m95873a(3);
                    throw null;
                }
                z4 = AbstractC31150q.m95875c(AbstractC31150q.f128360l, interfaceC31111c4, interfaceC31117e) == null;
            }
            if (z4) {
                arrayList.add(next);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m125555g(Object obj, LinkedList linkedList, Function1 function1, Function1 function2) {
        if (obj == null) {
            m125550a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC31108b interfaceC31108b = (InterfaceC31108b) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC31108b interfaceC31108b2 = (InterfaceC31108b) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iM125557j = m125557j(interfaceC31108b, interfaceC31108b2);
                if (iM125557j == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iM125557j == 3) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static C39370m m125556i(InterfaceC31108b interfaceC31108b, InterfaceC31108b interfaceC31108b2) {
        boolean z4;
        C39370m c39370mM125548c;
        if (interfaceC31108b == null) {
            m125550a(38);
            throw null;
        }
        if (interfaceC31108b2 == null) {
            m125550a(39);
            throw null;
        }
        boolean z13 = interfaceC31108b instanceof InterfaceC31162w;
        if ((z13 && !(interfaceC31108b2 instanceof InterfaceC31162w)) || (((z4 = interfaceC31108b instanceof InterfaceC31145n0)) && !(interfaceC31108b2 instanceof InterfaceC31145n0))) {
            return C39370m.m125548c("Member kind mismatch");
        }
        if (!z13 && !z4) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC31108b);
        }
        if (!interfaceC31108b.getName().equals(interfaceC31108b2.getName())) {
            return C39370m.m125548c("Name mismatch");
        }
        if ((interfaceC31108b.mo78667B() == null) != (interfaceC31108b2.mo78667B() == null)) {
            c39370mM125548c = C39370m.m125548c("Receiver presence mismatch");
        } else {
            c39370mM125548c = interfaceC31108b.mo78676v().size() != interfaceC31108b2.mo78676v().size() ? C39370m.m125548c("Value parameter number mismatch") : null;
        }
        if (c39370mM125548c != null) {
            return c39370mM125548c;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static int m125557j(InterfaceC31108b interfaceC31108b, InterfaceC31108b interfaceC31108b2) {
        C39371n c39371n = f169420c;
        int iM125549b = c39371n.m125566l(interfaceC31108b2, interfaceC31108b, null).m125549b();
        int iM125549b2 = c39371n.m125567m(interfaceC31108b, interfaceC31108b2, null, false).m125549b();
        if (iM125549b == 1 && iM125549b2 == 1) {
            return 1;
        }
        return (iM125549b == 3 || iM125549b2 == 3) ? 3 : 2;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m125558k(InterfaceC31108b interfaceC31108b, InterfaceC31108b interfaceC31108b2) {
        if (interfaceC31108b == null) {
            m125550a(65);
            throw null;
        }
        if (interfaceC31108b2 == null) {
            m125550a(66);
            throw null;
        }
        AbstractC23811y returnType = interfaceC31108b.getReturnType();
        AbstractC23811y returnType2 = interfaceC31108b2.getReturnType();
        if (!m125560p(interfaceC31108b, interfaceC31108b2)) {
            return false;
        }
        C23794p0 c23794p0M125564f = f169420c.m125564f(interfaceC31108b.getTypeParameters(), interfaceC31108b2.getTypeParameters());
        if (interfaceC31108b instanceof InterfaceC31162w) {
            return m125559o(interfaceC31108b, returnType, interfaceC31108b2, returnType2, c23794p0M125564f);
        }
        if (!(interfaceC31108b instanceof InterfaceC31145n0)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC31108b.getClass());
        }
        InterfaceC31145n0 interfaceC31145n0 = (InterfaceC31145n0) interfaceC31108b;
        InterfaceC31145n0 interfaceC31145n1 = (InterfaceC31145n0) interfaceC31108b2;
        InterfaceC31149p0 setter = interfaceC31145n0.getSetter();
        InterfaceC31149p0 setter2 = interfaceC31145n1.getSetter();
        if (!((setter == null || setter2 == null) ? true : m125560p(setter, setter2))) {
            return false;
        }
        if (interfaceC31145n0.mo78666A() && interfaceC31145n1.mo78666A()) {
            return C23765d.m69833g(c23794p0M125564f, returnType.mo69863p0(), returnType2.mo69863p0());
        }
        return (interfaceC31145n0.mo78666A() || !interfaceC31145n1.mo78666A()) && m125559o(interfaceC31108b, returnType, interfaceC31108b2, returnType2, c23794p0M125564f);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m125559o(InterfaceC31108b interfaceC31108b, AbstractC23811y abstractC23811y, InterfaceC31108b interfaceC31108b2, AbstractC23811y abstractC23811y2, C23794p0 c23794p0) {
        if (interfaceC31108b == null) {
            m125550a(71);
            throw null;
        }
        if (abstractC23811y == null) {
            m125550a(72);
            throw null;
        }
        if (interfaceC31108b2 == null) {
            m125550a(73);
            throw null;
        }
        if (abstractC23811y2 == null) {
            m125550a(74);
            throw null;
        }
        AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23811y.mo69863p0();
        AbstractC23773f1 abstractC23773f1Mo69863p1 = abstractC23811y2.mo69863p0();
        if (abstractC23773f1Mo69863p0 == abstractC23773f1Mo69863p1) {
            return true;
        }
        if (!c23794p0.m69904b(abstractC23773f1Mo69863p0, abstractC23773f1Mo69863p1)) {
            return false;
        }
        return C23765d.f94131a.m69840e(c23794p0, c23794p0.f94180c, abstractC23773f1Mo69863p0, abstractC23773f1Mo69863p1);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m125560p(InterfaceC31108b interfaceC31108b, InterfaceC31108b interfaceC31108b2) {
        if (interfaceC31108b == null) {
            m125550a(67);
            throw null;
        }
        if (interfaceC31108b2 != null) {
            Integer numM95874b = AbstractC31150q.m95874b(interfaceC31108b.getVisibility(), interfaceC31108b2.getVisibility());
            return numM95874b == null || numM95874b.intValue() >= 0;
        }
        m125550a(68);
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m125561q(InterfaceC31108b interfaceC31108b, InterfaceC31108b interfaceC31108b2) {
        if (interfaceC31108b == null) {
            m125550a(13);
            throw null;
        }
        if (interfaceC31108b2 == null) {
            m125550a(14);
            throw null;
        }
        boolean zEquals = interfaceC31108b.equals(interfaceC31108b2);
        C39361d c39361d = C39361d.f169412a;
        if (!zEquals && c39361d.m125517a(interfaceC31108b.mo78660a(), interfaceC31108b2.mo78660a(), false)) {
            return true;
        }
        InterfaceC31108b interfaceC31108bMo78660a = interfaceC31108b2.mo78660a();
        int i13 = AbstractC39363f.f169413a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AbstractC39363f.m125520b(interfaceC31108b.mo78660a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (c39361d.m125517a(interfaceC31108bMo78660a, (InterfaceC31108b) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static void m125562r(InterfaceC31111c interfaceC31111c, Function1 function1) {
        AbstractC31152r abstractC31152r;
        AbstractC31152r abstractC31152rM95879g;
        AbstractC31152r abstractC31152r2;
        if (interfaceC31111c == null) {
            m125550a(105);
            throw null;
        }
        for (InterfaceC31111c interfaceC31111c2 : interfaceC31111c.mo78673h()) {
            if (interfaceC31111c2.getVisibility() == AbstractC31150q.f128355g) {
                m125562r(interfaceC31111c2, function1);
            }
        }
        if (interfaceC31111c.getVisibility() != AbstractC31150q.f128355g) {
            return;
        }
        Collection<InterfaceC31111c> collectionMo78673h = interfaceC31111c.mo78673h();
        if (collectionMo78673h == null) {
            m125550a(107);
            throw null;
        }
        if (!collectionMo78673h.isEmpty()) {
            Iterator it = collectionMo78673h.iterator();
            loop3: while (true) {
                abstractC31152r = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    AbstractC31152r visibility = ((InterfaceC31111c) it.next()).getVisibility();
                    if (abstractC31152r != null) {
                        Integer numM95874b = AbstractC31150q.m95874b(visibility, abstractC31152r);
                        if (numM95874b != null) {
                            if (numM95874b.intValue() > 0) {
                            }
                        }
                    }
                    abstractC31152r = visibility;
                }
            }
            if (abstractC31152r == null) {
                abstractC31152rM95879g = null;
                break;
            }
            Iterator it3 = collectionMo78673h.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    abstractC31152rM95879g = abstractC31152r;
                    break;
                }
                Integer numM95874b2 = AbstractC31150q.m95874b(abstractC31152r, ((InterfaceC31111c) it3.next()).getVisibility());
                if (numM95874b2 == null || numM95874b2.intValue() < 0) {
                    abstractC31152rM95879g = null;
                    break;
                }
            }
        } else {
            abstractC31152rM95879g = AbstractC31150q.f128358j;
        }
        if (abstractC31152rM95879g == null) {
            abstractC31152rM95879g = null;
            break;
        }
        if (interfaceC31111c.getKind() == 2) {
            for (InterfaceC31111c interfaceC31111c3 : collectionMo78673h) {
                if (interfaceC31111c3.mo60498k() != EnumC31106a0.f128307E && !interfaceC31111c3.getVisibility().equals(abstractC31152rM95879g)) {
                    abstractC31152rM95879g = null;
                    break;
                }
            }
        } else {
            abstractC31152rM95879g = AbstractC31150q.m95879g(((AbstractC31146o) abstractC31152rM95879g).f128347a.mo95872c());
        }
        if (abstractC31152rM95879g == null) {
            if (function1 != null) {
                function1.invoke(interfaceC31111c);
            }
            abstractC31152r2 = AbstractC31150q.f128353e;
        } else {
            abstractC31152r2 = abstractC31152rM95879g;
        }
        if (interfaceC31111c instanceof C34689m0) {
            C34689m0 c34689m0 = (C34689m0) interfaceC31111c;
            if (abstractC31152r2 == null) {
                C34689m0.m109588r0(20);
                throw null;
            }
            c34689m0.f146115K = abstractC31152r2;
            Iterator it4 = ((InterfaceC31145n0) interfaceC31111c).mo78674m().iterator();
            while (it4.hasNext()) {
                m125562r((InterfaceC31142m0) it4.next(), abstractC31152rM95879g == null ? null : function1);
            }
            return;
        }
        if (interfaceC31111c instanceof AbstractC34710x) {
            AbstractC34710x abstractC34710x = (AbstractC34710x) interfaceC31111c;
            if (abstractC31152r2 != null) {
                abstractC34710x.f146199M = abstractC31152r2;
                return;
            } else {
                AbstractC34710x.m109629r0(10);
                throw null;
            }
        }
        AbstractC34685k0 abstractC34685k0 = (AbstractC34685k0) interfaceC31111c;
        abstractC34685k0.f146090L = abstractC31152r2;
        if (abstractC31152r2 != abstractC34685k0.m109573J0().getVisibility()) {
            abstractC34685k0.f146084F = false;
        }
    }

    /* JADX INFO: renamed from: s */
    public static Object m125563s(Collection collection, Function1 function1) {
        Object next;
        if (collection.size() == 1) {
            Object objM74094E0 = AbstractC25265s.m74094E0(collection);
            if (objM74094E0 != null) {
                return objM74094E0;
            }
            m125550a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(function1.invoke(it.next()));
        }
        Object objM74094E1 = AbstractC25265s.m74094E0(collection);
        InterfaceC31108b interfaceC31108b = (InterfaceC31108b) function1.invoke(objM74094E1);
        for (Object obj : collection) {
            InterfaceC31108b interfaceC31108b2 = (InterfaceC31108b) function1.invoke(obj);
            if (interfaceC31108b2 == null) {
                m125550a(69);
                throw null;
            }
            Iterator it3 = arrayList2.iterator();
            do {
                if (!it3.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (m125558k(interfaceC31108b2, (InterfaceC31108b) it3.next()));
            if (m125558k(interfaceC31108b2, interfaceC31108b) && !m125558k(interfaceC31108b, interfaceC31108b2)) {
                objM74094E1 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objM74094E1 != null) {
                return objM74094E1;
            }
            m125550a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objM74094E2 = AbstractC25265s.m74094E0(arrayList);
            if (objM74094E2 != null) {
                return objM74094E2;
            }
            m125550a(80);
            throw null;
        }
        Iterator it4 = arrayList.iterator();
        do {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
        } while (AbstractC12313p.m34258J(((InterfaceC31108b) function1.invoke(next)).getReturnType()));
        if (next != null) {
            return next;
        }
        Object objM74094E3 = AbstractC25265s.m74094E0(arrayList);
        if (objM74094E3 != null) {
            return objM74094E3;
        }
        m125550a(82);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final C23794p0 m125564f(List list, List list2) {
        if (list == null) {
            m125550a(40);
            throw null;
        }
        if (list2 == null) {
            m125550a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        InterfaceC25386c interfaceC25386c = this.f169422a;
        if (zIsEmpty) {
            return new C29203o((HashMap) null, interfaceC25386c).m88702r0();
        }
        HashMap map = new HashMap();
        for (int i13 = 0; i13 < list.size(); i13++) {
            map.put(((InterfaceC31165x0) list.get(i13)).mo60496e(), ((InterfaceC31165x0) list2.get(i13)).mo60496e());
        }
        return new C29203o(map, interfaceC25386c).m88702r0();
    }

    /* JADX INFO: renamed from: h */
    public final void m125565h(C35850h c35850h, Collection collection, Collection collection2, InterfaceC31117e interfaceC31117e, AbstractC39373p abstractC39373p) {
        if (c35850h == null) {
            m125550a(50);
            throw null;
        }
        if (collection == null) {
            m125550a(51);
            throw null;
        }
        if (collection2 == null) {
            m125550a(52);
            throw null;
        }
        if (interfaceC31117e == null) {
            m125550a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC31111c interfaceC31111c = (InterfaceC31111c) it.next();
            if (interfaceC31111c == null) {
                m125550a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            int i13 = C34754h.f146410y;
            C34754h c34754hM109753c = AbstractC34756j.m109753c();
            Iterator it3 = collection.iterator();
            while (it3.hasNext()) {
                InterfaceC31111c interfaceC31111c2 = (InterfaceC31111c) it3.next();
                int iM125549b = m125566l(interfaceC31111c2, interfaceC31111c, interfaceC31117e).m125549b();
                boolean z4 = !AbstractC31150q.m95877e(interfaceC31111c2.getVisibility()) && AbstractC31150q.m95875c(AbstractC31150q.f128360l, interfaceC31111c2, interfaceC31111c) == null;
                int iM35485e = AbstractC12682p.m35485e(iM125549b);
                if (iM35485e == 0) {
                    if (z4) {
                        c34754hM109753c.add(interfaceC31111c2);
                    }
                    arrayList.add(interfaceC31111c2);
                } else if (iM35485e == 2) {
                    if (z4) {
                        abstractC39373p.mo43950c(interfaceC31111c2, interfaceC31111c);
                    }
                    arrayList.add(interfaceC31111c2);
                }
            }
            abstractC39373p.mo43951n(interfaceC31111c, c34754hM109753c);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            C39372o c39372o = new C39372o(((InterfaceC31111c) linkedHashSet.iterator().next()).mo60581g(), 1);
            if (!linkedHashSet.isEmpty()) {
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    if (!((Boolean) c39372o.invoke(it4.next())).booleanValue()) {
                        LinkedList linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            InterfaceC31111c interfaceC31111cM125582c = AbstractC39375r.m125582c(linkedList);
                            m125554e(m125555g(interfaceC31111cM125582c, linkedList, new C39369l(), new C1774d(10, abstractC39373p, interfaceC31111cM125582c)), interfaceC31117e, abstractC39373p);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it5 = linkedHashSet.iterator();
        while (it5.hasNext()) {
            m125554e(Collections.singleton((InterfaceC31111c) it5.next()), interfaceC31117e, abstractC39373p);
        }
    }

    /* JADX INFO: renamed from: l */
    public final C39370m m125566l(InterfaceC31108b interfaceC31108b, InterfaceC31108b interfaceC31108b2, InterfaceC31117e interfaceC31117e) {
        if (interfaceC31108b == null) {
            m125550a(19);
            throw null;
        }
        if (interfaceC31108b2 != null) {
            return m125567m(interfaceC31108b, interfaceC31108b2, interfaceC31117e, false);
        }
        m125550a(20);
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public final C39370m m125567m(InterfaceC31108b interfaceC31108b, InterfaceC31108b interfaceC31108b2, InterfaceC31117e interfaceC31117e, boolean z4) {
        if (interfaceC31108b == null) {
            m125550a(22);
            throw null;
        }
        if (interfaceC31108b2 == null) {
            m125550a(23);
            throw null;
        }
        C39370m c39370mM125568n = m125568n(interfaceC31108b, interfaceC31108b2, z4);
        boolean z13 = c39370mM125568n.m125549b() == 1;
        List<InterfaceC39364g> list = f169419b;
        for (InterfaceC39364g interfaceC39364g : list) {
            if (interfaceC39364g.mo40920a() != 1 && (!z13 || interfaceC39364g.mo40920a() != 2)) {
                int iM35485e = AbstractC12682p.m35485e(interfaceC39364g.mo40921b(interfaceC31108b, interfaceC31108b2, interfaceC31117e));
                if (iM35485e == 0) {
                    z13 = true;
                } else if (iM35485e == 1) {
                    return C39370m.m125548c("External condition");
                }
            }
        }
        if (!z13) {
            return c39370mM125568n;
        }
        for (InterfaceC39364g interfaceC39364g2 : list) {
            if (interfaceC39364g2.mo40920a() == 1) {
                int iM35485e2 = AbstractC12682p.m35485e(interfaceC39364g2.mo40921b(interfaceC31108b, interfaceC31108b2, interfaceC31117e));
                if (iM35485e2 == 0) {
                    throw new IllegalStateException("Contract violation in " + interfaceC39364g2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iM35485e2 == 1) {
                    return C39370m.m125548c("External condition");
                }
            }
        }
        C39370m c39370m = C39370m.f169416c;
        if (c39370m != null) {
            return c39370m;
        }
        C39370m.m125547a(0);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final C39370m m125568n(InterfaceC31108b interfaceC31108b, InterfaceC31108b interfaceC31108b2, boolean z4) {
        boolean zM69840e;
        if (interfaceC31108b == null) {
            m125550a(28);
            throw null;
        }
        if (interfaceC31108b2 == null) {
            m125550a(29);
            throw null;
        }
        C39370m c39370mM125556i = m125556i(interfaceC31108b, interfaceC31108b2);
        if (c39370mM125556i != null) {
            return c39370mM125556i;
        }
        ArrayList arrayListM125553d = m125553d(interfaceC31108b);
        ArrayList arrayListM125553d2 = m125553d(interfaceC31108b2);
        List typeParameters = interfaceC31108b.getTypeParameters();
        List typeParameters2 = interfaceC31108b2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i13 = 0; i13 < arrayListM125553d.size(); i13++) {
                if (!InterfaceC25387d.f99472a.m74524a((AbstractC23811y) arrayListM125553d.get(i13), (AbstractC23811y) arrayListM125553d2.get(i13))) {
                    return C39370m.m125548c("Type parameter number mismatch");
                }
            }
            return new C39370m(3, "Type parameter number mismatch");
        }
        C23794p0 c23794p0M125564f = m125564f(typeParameters, typeParameters2);
        for (int i14 = 0; i14 < typeParameters.size(); i14++) {
            InterfaceC31165x0 interfaceC31165x0 = (InterfaceC31165x0) typeParameters.get(i14);
            InterfaceC31165x0 interfaceC31165x1 = (InterfaceC31165x0) typeParameters2.get(i14);
            if (interfaceC31165x0 == null) {
                m125550a(47);
                throw null;
            }
            if (interfaceC31165x1 == null) {
                m125550a(48);
                throw null;
            }
            List<AbstractC23811y> upperBounds = interfaceC31165x0.getUpperBounds();
            ArrayList arrayList = new ArrayList(interfaceC31165x1.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (AbstractC23811y abstractC23811y : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!m125551b(abstractC23811y, (AbstractC23811y) listIterator.next(), c23794p0M125564f));
                    listIterator.remove();
                }
            }
            return C39370m.m125548c("Type parameter bounds mismatch");
        }
        for (int i15 = 0; i15 < arrayListM125553d.size(); i15++) {
            if (!m125551b((AbstractC23811y) arrayListM125553d.get(i15), (AbstractC23811y) arrayListM125553d2.get(i15), c23794p0M125564f)) {
                return C39370m.m125548c("Value parameter type mismatch");
            }
        }
        if ((interfaceC31108b instanceof InterfaceC31162w) && (interfaceC31108b2 instanceof InterfaceC31162w) && ((InterfaceC31162w) interfaceC31108b).isSuspend() != ((InterfaceC31162w) interfaceC31108b2).isSuspend()) {
            return new C39370m(3, "Incompatible suspendability");
        }
        if (z4) {
            AbstractC23811y returnType = interfaceC31108b.getReturnType();
            AbstractC23811y returnType2 = interfaceC31108b2.getReturnType();
            if (returnType != null && returnType2 != null && (!AbstractC23791o.m69886e(returnType2) || !AbstractC23791o.m69886e(returnType))) {
                AbstractC23773f1 abstractC23773f1Mo69863p0 = returnType2.mo69863p0();
                AbstractC23773f1 abstractC23773f1Mo69863p1 = returnType.mo69863p0();
                if (abstractC23773f1Mo69863p0 == abstractC23773f1Mo69863p1) {
                    zM69840e = true;
                } else {
                    c23794p0M125564f.m69904b(abstractC23773f1Mo69863p0, abstractC23773f1Mo69863p1);
                    zM69840e = C23765d.f94131a.m69840e(c23794p0M125564f, c23794p0M125564f.f94180c, abstractC23773f1Mo69863p0, abstractC23773f1Mo69863p1);
                }
                if (!zM69840e) {
                    return new C39370m(3, "Return type mismatch");
                }
            }
        }
        C39370m c39370m = C39370m.f169416c;
        if (c39370m != null) {
            return c39370m;
        }
        C39370m.m125547a(0);
        throw null;
    }
}

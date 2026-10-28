package o93;

import androidx.health.platform.client.proto.C1533u;
import cb3.AbstractC4393e;
import com.mapbox.common.logger.LogPriority;
import dc3.C11934s;
import hg3.AbstractC17269i;
import ib3.C18343b;
import ib3.C18344c;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import io.sentry.config.AbstractC20301a;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kb3.C22336e;
import kb3.C22340i;
import kb3.C22342k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23773f1;
import lb3.AbstractC23791o;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23806v0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import p93.C29022a;
import p93.C29031j;
import r93.AbstractC31166y;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31149p0;
import r93.InterfaceC31162w;
import s93.C32305g;
import s93.InterfaceC32307i;
import t93.C33665a;
import t93.InterfaceC33666b;
import t93.InterfaceC33668d;
import u93.AbstractC34677g0;
import u93.C34671d0;
import u93.C34673e0;
import u93.C34691n0;
import va3.C35845c;
import va3.C35847e;
import va3.C35848f;
import va3.C35850h;
import ya3.AbstractC39363f;
import z93.EnumC40212c;

/* JADX INFO: renamed from: o93.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC27736h {

    /* JADX INFO: renamed from: e */
    public static final C35850h f111789e = C35850h.m113816g("<built-ins module>");

    /* JADX INFO: renamed from: a */
    public C34673e0 f111790a;

    /* JADX INFO: renamed from: b */
    public final C22340i f111791b;

    /* JADX INFO: renamed from: c */
    public final C22336e f111792c;

    /* JADX INFO: renamed from: d */
    public final C22342k f111793d;

    public AbstractC27736h(C22342k c22342k) {
        this.f111793d = c22342k;
        c22342k.m64222a(new C27734f(this, 0));
        this.f111791b = new C22340i(c22342k, new C27734f(this, 1));
        this.f111792c = c22342k.m64223b(new C11934s(this, 11));
    }

    /* JADX INFO: renamed from: A */
    public static boolean m83799A(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k != null) {
            return AbstractC39363f.m125526h(interfaceC31135k, C18344c.class, false) != null;
        }
        m83809a(9);
        throw null;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m83800B(AbstractC23811y abstractC23811y, C35848f c35848f) {
        if (abstractC23811y == null) {
            m83809a(97);
            throw null;
        }
        if (c35848f != null) {
            return m83807I(abstractC23811y.mo69844i0(), c35848f);
        }
        m83809a(98);
        throw null;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m83801C(AbstractC23811y abstractC23811y, C35848f c35848f) {
        if (c35848f != null) {
            return m83800B(abstractC23811y, c35848f) && !abstractC23811y.mo69814k0();
        }
        m83809a(135);
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m83802D(InterfaceC31162w interfaceC31162w) {
        if (interfaceC31162w.mo78660a().getAnnotations().mo52688J(AbstractC27741m.f111862m)) {
            return true;
        }
        if (!(interfaceC31162w instanceof InterfaceC31145n0)) {
            return false;
        }
        InterfaceC31145n0 interfaceC31145n0 = (InterfaceC31145n0) interfaceC31162w;
        boolean zMo78666A = interfaceC31145n0.mo78666A();
        C34691n0 getter = interfaceC31145n0.getGetter();
        InterfaceC31149p0 setter = interfaceC31145n0.getSetter();
        if (getter == null || !m83802D(getter)) {
            return false;
        }
        if (zMo78666A) {
            return setter != null && m83802D(setter);
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m83803E(AbstractC23811y abstractC23811y, C35848f c35848f) {
        if (abstractC23811y == null) {
            m83809a(105);
            throw null;
        }
        if (c35848f != null) {
            return !abstractC23811y.mo69814k0() && m83800B(abstractC23811y, c35848f);
        }
        m83809a(106);
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m83804F(AbstractC23811y abstractC23811y) {
        if (abstractC23811y != null) {
            return m83800B(abstractC23811y, AbstractC27741m.f111845b) && !AbstractC23767d1.m69849e(abstractC23811y);
        }
        m83809a(136);
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m83805G(AbstractC23811y abstractC23811y) {
        if (abstractC23811y.mo69814k0()) {
            return false;
        }
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        return (interfaceC31126hMo1784d instanceof InterfaceC31117e) && m83812u((InterfaceC31117e) interfaceC31126hMo1784d) != null;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m83806H(AbstractC23811y abstractC23811y) {
        return m83803E(abstractC23811y, AbstractC27741m.f111853f);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m83807I(InterfaceC23796q0 interfaceC23796q0, C35848f c35848f) {
        if (interfaceC23796q0 == null) {
            m83809a(101);
            throw null;
        }
        if (c35848f != null) {
            InterfaceC31126h interfaceC31126hMo1784d = interfaceC23796q0.mo1784d();
            return (interfaceC31126hMo1784d instanceof InterfaceC31117e) && m83810b((InterfaceC31117e) interfaceC31126hMo1784d, c35848f);
        }
        m83809a(102);
        throw null;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m83808J(InterfaceC31126h interfaceC31126h) {
        if (interfaceC31126h == null) {
            m83809a(10);
            throw null;
        }
        for (InterfaceC31135k interfaceC31135kMo60581g = interfaceC31126h; interfaceC31135kMo60581g != null; interfaceC31135kMo60581g = interfaceC31135kMo60581g.mo60581g()) {
            if (interfaceC31135kMo60581g instanceof InterfaceC31124g0) {
                C35847e c35847e = ((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31135kMo60581g)).f146067F;
                C35850h segment = AbstractC27742n.f111885j;
                c35847e.getClass();
                AbstractC22676k.m65750j(segment, "segment");
                return c35847e.f152613a.m113797h(segment);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m83809a(int i13) {
        String str;
        int i14;
        if (i13 != 11 && i13 != 13 && i13 != 15 && i13 != 69 && i13 != 74 && i13 != 81 && i13 != 84 && i13 != 86 && i13 != 87) {
            switch (i13) {
                default:
                    switch (i13) {
                        default:
                            switch (i13) {
                                default:
                                    switch (i13) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        case 20:
                        case 21:
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 11 && i13 != 13 && i13 != 15 && i13 != 69 && i13 != 74 && i13 != 81 && i13 != 84 && i13 != 86 && i13 != 87) {
            switch (i13) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i14 = 2;
                    break;
                default:
                    switch (i13) {
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        case 20:
                        case 21:
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            i14 = 2;
                            break;
                        default:
                            switch (i13) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    i14 = 2;
                                    break;
                                default:
                                    switch (i13) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case LogPriority.NONE /* 99 */:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 161:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i13 == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i13 == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i13 == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i13 == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i13 == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i13 == 81 || i13 == 84) {
            objArr[1] = "getArrayType";
        } else if (i13 == 86) {
            objArr[1] = "getEnumType";
        } else if (i13 != 87) {
            switch (i13) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i13) {
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            objArr[1] = "getKType";
                            break;
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case 38:
                            objArr[1] = "getMutableList";
                            break;
                        case 39:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i13) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i13) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i13) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case LogPriority.NONE /* 99 */:
            case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 11 && i13 != 13 && i13 != 15 && i13 != 69 && i13 != 74 && i13 != 81 && i13 != 84 && i13 != 86 && i13 != 87) {
            switch (i13) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i13) {
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        case 20:
                        case 21:
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i13) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i13) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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
    public static boolean m83810b(InterfaceC31117e interfaceC31117e, C35848f c35848f) {
        if (interfaceC31117e == null) {
            m83809a(103);
            throw null;
        }
        if (c35848f != null) {
            return interfaceC31117e.getName().equals(c35848f.m113796g()) && c35848f.equals(AbstractC39363f.m125524f(interfaceC31117e));
        }
        m83809a(104);
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public static EnumC27738j m83811s(InterfaceC31126h interfaceC31126h) {
        if (interfaceC31126h == null) {
            m83809a(77);
            throw null;
        }
        if (AbstractC27741m.f111852e0.contains(interfaceC31126h.getName())) {
            return (EnumC27738j) AbstractC27741m.f111856g0.get(AbstractC39363f.m125524f(interfaceC31126h));
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static EnumC27738j m83812u(InterfaceC31117e interfaceC31117e) {
        if (AbstractC27741m.f111850d0.contains(interfaceC31117e.getName())) {
            return (EnumC27738j) AbstractC27741m.f111854f0.get(AbstractC39363f.m125524f(interfaceC31117e));
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m83813y(AbstractC23811y abstractC23811y) {
        if (abstractC23811y != null) {
            return m83800B(abstractC23811y, AbstractC27741m.f111843a);
        }
        m83809a(139);
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m83814z(AbstractC23811y abstractC23811y) {
        if (abstractC23811y != null) {
            return m83800B(abstractC23811y, AbstractC27741m.f111855g);
        }
        m83809a(88);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m83815c(boolean z4) {
        C35850h moduleName = f111789e;
        AbstractC22676k.m65750j(moduleName, "moduleName");
        C22342k c22342k = this.f111793d;
        C34673e0 c34673e0 = new C34673e0(moduleName, c22342k, this, 48);
        this.f111790a = c34673e0;
        InterfaceC27731c.f111782a.getClass();
        c34673e0.f146049I = ((C18343b) C27730b.m83798a()).m52850a(c22342k, this.f111790a, mo83825m(), mo83829q(), mo83816d(), z4);
        C34673e0 c34673e1 = this.f111790a;
        c34673e1.getClass();
        c34673e1.f146048H = new C34671d0(AbstractC25260n.m74049W0(new C34673e0[]{c34673e1}));
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC33666b mo83816d() {
        return C33665a.f140610b;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC23763c0 m83817e() {
        AbstractC23763c0 abstractC23763c0Mo60594i = m83823k("Any").mo60594i();
        if (abstractC23763c0Mo60594i != null) {
            return abstractC23763c0Mo60594i;
        }
        m83809a(51);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC23811y m83818f(AbstractC23811y abstractC23811y) {
        if (abstractC23811y == null) {
            m83809a(68);
            throw null;
        }
        AbstractC23811y abstractC23811yM83819g = m83819g(abstractC23811y);
        if (abstractC23811yM83819g != null) {
            return abstractC23811yM83819g;
        }
        throw new IllegalStateException("not array: " + abstractC23811y);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX INFO: renamed from: g */
    public final AbstractC23811y m83819g(AbstractC23811y abstractC23811y) {
        C35845c c35845cM13808f;
        C35845c c35845cM83840a;
        InterfaceC31117e interfaceC31117eM48865L;
        AbstractC23763c0 abstractC23763c0Mo60594i;
        if (abstractC23811y == null) {
            m83809a(70);
            throw null;
        }
        if (!m83814z(abstractC23811y)) {
            AbstractC23773f1 abstractC23773f1M69851g = AbstractC23767d1.m69851g(abstractC23811y, false);
            AbstractC23811y abstractC23811y2 = (AbstractC23811y) ((C27735g) this.f111791b.invoke()).f111788b.get(abstractC23773f1M69851g);
            if (abstractC23811y2 != null) {
                return abstractC23811y2;
            }
            int i13 = AbstractC39363f.f169413a;
            InterfaceC31126h interfaceC31126hMo1784d = abstractC23773f1M69851g.mo69844i0().mo1784d();
            InterfaceC31109b0 interfaceC31109b0M125522d = interfaceC31126hMo1784d == null ? null : AbstractC39363f.m125522d(interfaceC31126hMo1784d);
            if (interfaceC31109b0M125522d != null) {
                InterfaceC31126h interfaceC31126hMo1784d2 = abstractC23773f1M69851g.mo69844i0().mo1784d();
                if (interfaceC31126hMo1784d2 == null) {
                    abstractC23763c0Mo60594i = null;
                } else {
                    Set set = AbstractC27746r.f111904a;
                    if (!AbstractC27746r.m83841b(interfaceC31126hMo1784d2.getName()) || (c35845cM13808f = AbstractC4393e.m13808f(interfaceC31126hMo1784d2)) == null || (c35845cM83840a = AbstractC27746r.m83840a(c35845cM13808f)) == null || (interfaceC31117eM48865L = AbstractC17269i.m48865L(interfaceC31109b0M125522d, c35845cM83840a)) == null) {
                        abstractC23763c0Mo60594i = null;
                    } else {
                        abstractC23763c0Mo60594i = interfaceC31117eM48865L.mo60594i();
                    }
                }
                if (abstractC23763c0Mo60594i != null) {
                    return abstractC23763c0Mo60594i;
                }
            }
        } else if (abstractC23811y.mo69842X().size() == 1) {
            return ((AbstractC23804u0) abstractC23811y.mo69842X().get(0)).mo69868b();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC23763c0 m83820h(AbstractC23811y abstractC23811y) {
        EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
        if (abstractC23811y != null) {
            return m83821i(enumC23776g1, abstractC23811y, C32305g.f133684a);
        }
        m83809a(83);
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC23763c0 m83821i(EnumC23776g1 enumC23776g1, AbstractC23811y abstractC23811y, InterfaceC32307i interfaceC32307i) {
        if (abstractC23811y != null) {
            return AbstractC23791o.m69889h(AbstractC20301a.m56329a0(interfaceC32307i), m83823k("Array"), Collections.singletonList(new C23806v0(abstractC23811y, enumC23776g1)));
        }
        m83809a(79);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC31117e m83822j(C35847e c35847e) {
        if (c35847e == null) {
            m83809a(12);
            throw null;
        }
        C34673e0 c34673e0M83824l = m83824l();
        EnumC40212c enumC40212c = EnumC40212c.f173637w;
        InterfaceC31117e interfaceC31117eM95886d = AbstractC31166y.m95886d(c34673e0M83824l, c35847e);
        if (interfaceC31117eM95886d != null) {
            return interfaceC31117eM95886d;
        }
        m83809a(13);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC31117e m83823k(String str) {
        if (str != null) {
            return (InterfaceC31117e) this.f111792c.invoke(C35850h.m113814e(str));
        }
        m83809a(14);
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public final C34673e0 m83824l() {
        this.f111790a.getClass();
        C34673e0 c34673e0 = this.f111790a;
        if (c34673e0 != null) {
            return c34673e0;
        }
        m83809a(7);
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public Iterable mo83825m() {
        List listSingletonList = Collections.singletonList(new C29022a(this.f111793d, m83824l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m83809a(5);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC23763c0 m83826n() {
        AbstractC23763c0 abstractC23763c0M83828p = m83828p();
        if (abstractC23763c0M83828p != null) {
            return abstractC23763c0M83828p;
        }
        m83809a(53);
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC23763c0 m83827o() {
        AbstractC23763c0 abstractC23763c0Mo60594i = m83823k("Nothing").mo60594i();
        if (abstractC23763c0Mo60594i != null) {
            return abstractC23763c0Mo60594i;
        }
        m83809a(49);
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC23763c0 m83828p() {
        AbstractC23763c0 abstractC23763c0Mo69808u0 = m83817e().mo64125r0(true);
        if (abstractC23763c0Mo69808u0 != null) {
            return abstractC23763c0Mo69808u0;
        }
        m83809a(52);
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC33668d mo83829q() {
        return C33665a.f140612d;
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC23763c0 m83830r(EnumC27738j enumC27738j) {
        if (enumC27738j == null) {
            m83809a(73);
            throw null;
        }
        AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) ((C27735g) this.f111791b.invoke()).f111787a.get(enumC27738j);
        if (abstractC23763c0 != null) {
            return abstractC23763c0;
        }
        m83809a(74);
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC23763c0 m83831t(EnumC27738j enumC27738j) {
        if (enumC27738j == null) {
            m83809a(54);
            throw null;
        }
        AbstractC23763c0 abstractC23763c0Mo60594i = m83823k(enumC27738j.f111806w.m113817b()).mo60594i();
        if (abstractC23763c0Mo60594i != null) {
            return abstractC23763c0Mo60594i;
        }
        m83809a(55);
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC23763c0 m83832v() {
        AbstractC23763c0 abstractC23763c0Mo60594i = m83823k("String").mo60594i();
        if (abstractC23763c0Mo60594i != null) {
            return abstractC23763c0Mo60594i;
        }
        m83809a(66);
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC31117e m83833w(int i13) {
        return m83822j(AbstractC27742n.f111881f.m113788a(C35850h.m113814e(C29031j.f117501c.f117503b + i13)));
    }

    /* JADX INFO: renamed from: x */
    public final AbstractC23763c0 m83834x() {
        AbstractC23763c0 abstractC23763c0Mo60594i = m83823k("Unit").mo60594i();
        if (abstractC23763c0Mo60594i != null) {
            return abstractC23763c0Mo60594i;
        }
        m83809a(65);
        throw null;
    }
}

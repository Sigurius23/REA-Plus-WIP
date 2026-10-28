package u93;

import al.AbstractC0954a;
import androidx.health.platform.client.proto.C1533u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lb3.AbstractC23763c0;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import lb3.EnumC23776g1;
import m83.AbstractC25265s;
import na3.C26514a;
import p048ce.C4463d;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31105a;
import r93.InterfaceC31107a1;
import r93.InterfaceC31135k;
import r93.InterfaceC31141m;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31160v;
import r93.InterfaceC31162w;
import r93.InterfaceC31165x0;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.x */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34710x extends AbstractC34692o implements InterfaceC31162w {

    /* JADX INFO: renamed from: F */
    public List f146192F;

    /* JADX INFO: renamed from: G */
    public List f146193G;

    /* JADX INFO: renamed from: H */
    public AbstractC23811y f146194H;

    /* JADX INFO: renamed from: I */
    public List f146195I;

    /* JADX INFO: renamed from: J */
    public InterfaceC31151q0 f146196J;

    /* JADX INFO: renamed from: K */
    public InterfaceC31151q0 f146197K;

    /* JADX INFO: renamed from: L */
    public EnumC31106a0 f146198L;

    /* JADX INFO: renamed from: M */
    public AbstractC31152r f146199M;

    /* JADX INFO: renamed from: N */
    public boolean f146200N;

    /* JADX INFO: renamed from: O */
    public boolean f146201O;

    /* JADX INFO: renamed from: P */
    public boolean f146202P;

    /* JADX INFO: renamed from: Q */
    public boolean f146203Q;

    /* JADX INFO: renamed from: R */
    public boolean f146204R;

    /* JADX INFO: renamed from: S */
    public boolean f146205S;

    /* JADX INFO: renamed from: T */
    public boolean f146206T;

    /* JADX INFO: renamed from: U */
    public boolean f146207U;

    /* JADX INFO: renamed from: V */
    public boolean f146208V;

    /* JADX INFO: renamed from: W */
    public boolean f146209W;

    /* JADX INFO: renamed from: X */
    public boolean f146210X;

    /* JADX INFO: renamed from: Y */
    public Collection f146211Y;

    /* JADX INFO: renamed from: Z */
    public volatile C4463d f146212Z;

    /* JADX INFO: renamed from: a0 */
    public final InterfaceC31162w f146213a0;

    /* JADX INFO: renamed from: b0 */
    public final int f146214b0;

    /* JADX INFO: renamed from: c0 */
    public InterfaceC31162w f146215c0;

    /* JADX INFO: renamed from: d0 */
    public Map f146216d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC34710x(int i13, InterfaceC31135k interfaceC31135k, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i interfaceC32307i, C35850h c35850h) {
        super(interfaceC31135k, interfaceC32307i, c35850h, interfaceC31155s0);
        if (interfaceC31135k == null) {
            m109629r0(0);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109629r0(1);
            throw null;
        }
        if (c35850h == null) {
            m109629r0(2);
            throw null;
        }
        if (i13 == 0) {
            m109629r0(3);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m109629r0(4);
            throw null;
        }
        this.f146199M = AbstractC31150q.f128357i;
        this.f146200N = false;
        this.f146201O = false;
        this.f146202P = false;
        this.f146203Q = false;
        this.f146204R = false;
        this.f146205S = false;
        this.f146206T = false;
        this.f146207U = false;
        this.f146208V = false;
        this.f146209W = true;
        this.f146210X = false;
        this.f146211Y = null;
        this.f146212Z = null;
        this.f146215c0 = null;
        this.f146216d0 = null;
        this.f146213a0 = interfaceC31162w == null ? this : interfaceC31162w;
        this.f146214b0 = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [r93.a1] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX INFO: renamed from: N0 */
    public static ArrayList m109628N0(InterfaceC31162w interfaceC31162w, List list, C23758a1 c23758a1, boolean z4, boolean z13, boolean[] zArr) {
        if (list == null) {
            m109629r0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            AbstractC34711x0 abstractC34711x0 = (AbstractC34711x0) obj;
            AbstractC23811y type = abstractC34711x0.getType();
            EnumC23776g1 enumC23776g1 = EnumC23776g1.IN_VARIANCE;
            AbstractC23811y abstractC23811yM69823i = c23758a1.m69823i(type, enumC23776g1);
            C34709w0 c34709w0 = (C34709w0) obj;
            AbstractC23811y abstractC23811y = c34709w0.f146190K;
            AbstractC23811y abstractC23811yM69823i2 = abstractC23811y == null ? null : c23758a1.m69823i(abstractC23811y, enumC23776g1);
            if (abstractC23811yM69823i == null) {
                return null;
            }
            if ((abstractC23811yM69823i != abstractC34711x0.getType() || abstractC23811y != abstractC23811yM69823i2) && zArr != null) {
                zArr[0] = true;
            }
            C26514a c26514a = obj instanceof C34707v0 ? new C26514a((List) ((C34707v0) obj).f146161M.getValue()) : null;
            ?? r10 = z4 ? 0 : obj;
            int i13 = c34709w0.f146186G;
            InterfaceC32307i annotations = ((AbstractC0954a) obj).getAnnotations();
            C35850h name = ((AbstractC34690n) obj).getName();
            boolean zM109625J0 = c34709w0.m109625J0();
            boolean z14 = c34709w0.f146188I;
            boolean z15 = c34709w0.f146189J;
            InterfaceC31155s0 source = z13 ? ((AbstractC34692o) obj).getSource() : InterfaceC31155s0.f128370q;
            AbstractC22676k.m65750j(annotations, "annotations");
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(source, "source");
            arrayList.add(c26514a == null ? new C34709w0(interfaceC31162w, r10, i13, annotations, name, abstractC23811yM69823i, zM109625J0, z14, z15, abstractC23811yM69823i2, source) : new C34707v0(interfaceC31162w, r10, i13, annotations, name, abstractC23811yM69823i, zM109625J0, z14, z15, abstractC23811yM69823i2, source, c26514a));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109629r0(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
                i14 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 25:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "overriddenDescriptors";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[1] = "getTypeParameters";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i13) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: B */
    public final InterfaceC31151q0 mo78667B() {
        return this.f146196J;
    }

    /* JADX INFO: renamed from: J0 */
    public final InterfaceC31162w m109630J0(InterfaceC31135k interfaceC31135k, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r) {
        InterfaceC31162w interfaceC31162wBuild = mo78657l0().mo68177l(interfaceC31135k).mo68179p(enumC31106a0).mo68184w(abstractC31152r).mo68172f(2).mo68174h().build();
        if (interfaceC31162wBuild != null) {
            return interfaceC31162wBuild;
        }
        m109629r0(26);
        throw null;
    }

    @Override // r93.InterfaceC31111c
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public C34697q0 mo78655a0(InterfaceC31135k interfaceC31135k, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r) {
        return (C34697q0) m109630J0(interfaceC31135k, enumC31106a0, abstractC31152r);
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: L */
    public final boolean mo60490L() {
        return false;
    }

    /* JADX INFO: renamed from: L0 */
    public abstract AbstractC34710x mo48177L0(int i13, InterfaceC31135k interfaceC31135k, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i interfaceC32307i, C35850h c35850h);

    /* JADX WARN: Failed to calculate best type for var: r0v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v22 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v9 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v44 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v44 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v45 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v51 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v52 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v52 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r20v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 'this'  ??, new type: u93.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v16 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: boolean[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r0v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v22 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r1v44 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v44 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r1v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v45 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r1v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v51 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r1v52 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v52 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r20v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 'this'  ??, new type: u93.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r3v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v16 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: boolean[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v8 ??, new type: java.util.List
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: M0 */
    public u93.AbstractC34710x mo88262M0(u93.C34708w r21) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u93.AbstractC34710x.mo88262M0(u93.w):u93.x");
    }

    /* JADX INFO: renamed from: O0 */
    public void mo109605O0(InterfaceC31151q0 interfaceC31151q0, InterfaceC31151q0 interfaceC31151q1, List list, List list2, List list3, AbstractC23811y abstractC23811y, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r) {
        if (list == null) {
            m109629r0(5);
            throw null;
        }
        if (list2 == null) {
            m109629r0(6);
            throw null;
        }
        if (list3 == null) {
            m109629r0(7);
            throw null;
        }
        if (abstractC31152r == null) {
            m109629r0(8);
            throw null;
        }
        this.f146192F = AbstractC25265s.m74093D1(list2);
        this.f146193G = AbstractC25265s.m74093D1(list3);
        this.f146194H = abstractC23811y;
        this.f146198L = enumC31106a0;
        this.f146199M = abstractC31152r;
        this.f146196J = interfaceC31151q0;
        this.f146197K = interfaceC31151q1;
        this.f146195I = list;
        for (int i13 = 0; i13 < list2.size(); i13++) {
            InterfaceC31165x0 interfaceC31165x0 = (InterfaceC31165x0) list2.get(i13);
            if (interfaceC31165x0.getIndex() != i13) {
                throw new IllegalStateException(interfaceC31165x0 + " index is " + interfaceC31165x0.getIndex() + " but position is " + i13);
            }
        }
        for (int i14 = 0; i14 < list3.size(); i14++) {
            InterfaceC31107a1 interfaceC31107a1 = (InterfaceC31107a1) list3.get(i14);
            C34709w0 c34709w0 = (C34709w0) interfaceC31107a1;
            if (c34709w0.f146186G != i14) {
                throw new IllegalStateException(interfaceC31107a1 + "index is " + c34709w0.f146186G + " but position is " + i14);
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final C34708w m109631P0(C23758a1 c23758a1) {
        if (c23758a1 != null) {
            return new C34708w(this, c23758a1.m69821f(), mo60581g(), mo60498k(), getVisibility(), getKind(), mo78676v(), mo78671c0(), this.f146196J, getReturnType());
        }
        m109629r0(24);
        throw null;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m109632Q0(InterfaceC31105a interfaceC31105a, Object obj) {
        if (this.f146216d0 == null) {
            this.f146216d0 = new LinkedHashMap();
        }
        this.f146216d0.put(interfaceC31105a, obj);
    }

    /* JADX INFO: renamed from: R0 */
    public void mo48178R0(boolean z4) {
        this.f146209W = z4;
    }

    /* JADX INFO: renamed from: S */
    public boolean mo48179S() {
        return this.f146210X;
    }

    /* JADX INFO: renamed from: S0 */
    public void mo48180S0(boolean z4) {
        this.f146210X = z4;
    }

    /* JADX INFO: renamed from: T */
    public Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitFunctionDescriptor(this, obj);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m109633T0(AbstractC23763c0 abstractC23763c0) {
        if (abstractC23763c0 != null) {
            this.f146194H = abstractC23763c0;
        } else {
            m109629r0(11);
            throw null;
        }
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: U */
    public final boolean mo60493U() {
        return this.f146205S;
    }

    @Override // r93.InterfaceC31162w
    /* JADX INFO: renamed from: Z */
    public final InterfaceC31162w mo95880Z() {
        return this.f146215c0;
    }

    @Override // u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public InterfaceC31162w mo78660a() {
        InterfaceC31162w interfaceC31162w = this.f146213a0;
        InterfaceC31162w interfaceC31162wMo78660a = interfaceC31162w == this ? this : interfaceC31162w.mo78660a();
        if (interfaceC31162wMo78660a != null) {
            return interfaceC31162wMo78660a;
        }
        m109629r0(20);
        throw null;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: c0 */
    public final List mo78671c0() {
        List list = this.f146195I;
        if (list != null) {
            return list;
        }
        m109629r0(13);
        throw null;
    }

    @Override // r93.InterfaceC31162w
    /* JADX INFO: renamed from: f0 */
    public final boolean mo95881f0() {
        return this.f146206T;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo78656g0(Collection collection) {
        if (collection == null) {
            m109629r0(17);
            throw null;
        }
        this.f146211Y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC31162w) it.next()).mo95882j0()) {
                this.f146207U = true;
                return;
            }
        }
    }

    @Override // r93.InterfaceC31111c
    public final int getKind() {
        int i13 = this.f146214b0;
        if (i13 != 0) {
            return i13;
        }
        m109629r0(21);
        throw null;
    }

    public AbstractC23811y getReturnType() {
        return this.f146194H;
    }

    @Override // r93.InterfaceC31108b
    public final List getTypeParameters() {
        List list = this.f146192F;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        AbstractC31152r abstractC31152r = this.f146199M;
        if (abstractC31152r != null) {
            return abstractC31152r;
        }
        m109629r0(16);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public Collection mo78673h() {
        C4463d c4463d = this.f146212Z;
        if (c4463d != null) {
            this.f146211Y = (Collection) c4463d.invoke();
            this.f146212Z = null;
        }
        Collection collection = this.f146211Y;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        m109629r0(14);
        throw null;
    }

    /* JADX INFO: renamed from: h0 */
    public Object mo48190h0(InterfaceC31105a interfaceC31105a) {
        Map map = this.f146216d0;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC31105a);
    }

    public boolean isExternal() {
        return this.f146202P;
    }

    @Override // r93.InterfaceC31162w
    public final boolean isInfix() {
        if (this.f146201O) {
            return true;
        }
        Iterator it = mo78660a().mo78673h().iterator();
        while (it.hasNext()) {
            if (((InterfaceC31162w) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f146203Q;
    }

    @Override // r93.InterfaceC31162w
    public final boolean isOperator() {
        if (this.f146200N) {
            return true;
        }
        Iterator it = mo78660a().mo78673h().iterator();
        while (it.hasNext()) {
            if (((InterfaceC31162w) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f146208V;
    }

    @Override // r93.InterfaceC31162w
    /* JADX INFO: renamed from: j0 */
    public final boolean mo95882j0() {
        return this.f146207U;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: k */
    public final EnumC31106a0 mo60498k() {
        EnumC31106a0 enumC31106a0 = this.f146198L;
        if (enumC31106a0 != null) {
            return enumC31106a0;
        }
        m109629r0(15);
        throw null;
    }

    /* JADX INFO: renamed from: l0 */
    public InterfaceC31160v mo78657l0() {
        return m109631P0(C23758a1.f94121b);
    }

    /* JADX INFO: renamed from: q */
    public boolean mo60566q() {
        return this.f146204R;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: v */
    public final List mo78676v() {
        List list = this.f146193G;
        if (list != null) {
            return list;
        }
        m109629r0(19);
        throw null;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: y */
    public final InterfaceC31151q0 mo78677y() {
        return this.f146197K;
    }

    @Override // r93.InterfaceC31159u0
    /* JADX INFO: renamed from: d */
    public InterfaceC31162w mo60593d(C23758a1 c23758a1) {
        if (c23758a1 == null) {
            m109629r0(22);
            throw null;
        }
        if (c23758a1.f94122a.mo69908e()) {
            return this;
        }
        C34708w c34708wM109631P0 = m109631P0(c23758a1);
        c34708wM109631P0.f146162E = mo78660a();
        c34708wM109631P0.f146172O = true;
        c34708wM109631P0.f146180W = true;
        return c34708wM109631P0.f146181X.mo88262M0(c34708wM109631P0);
    }
}

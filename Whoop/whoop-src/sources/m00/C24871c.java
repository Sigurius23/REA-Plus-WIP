package m00;

import a00.C0066a;
import a00.C0067b;
import a00.C0068c;
import a00.C0071f;
import a00.C0072g;
import a00.InterfaceC0069d;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d00.C11433l;
import ec3.C13045h2;
import ec3.C13081r1;
import h00.EnumC16519o0;
import h20.C16621a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import n40.C26264d;
import o00.C27343a;
import o00.C27344b;
import p505ts.AbstractC34132o;
import p599wz.AbstractC37748q0;
import p599wz.C37701a1;
import p599wz.C37708d;
import p599wz.C37736m0;
import p599wz.C37737m1;
import p599wz.C37742o0;
import p599wz.C37754s0;
import p599wz.InterfaceC37739n0;
import p631xz.C38747x;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import x30.AbstractC37926s0;
import y00.AbstractC38794c0;
import y00.C38804d0;
import y00.C38809d5;
import y00.C38854i0;
import y00.C38977v3;

/* JADX INFO: renamed from: m00.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C24871c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f97428E;

    /* JADX INFO: renamed from: F */
    public Object f97429F;

    /* JADX INFO: renamed from: G */
    public Object f97430G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f97431H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97432w = 0;

    /* JADX INFO: renamed from: x */
    public boolean f97433x;

    /* JADX INFO: renamed from: y */
    public int f97434y;

    /* JADX INFO: renamed from: z */
    public Object f97435z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24871c(C24872d c24872d, C38809d5 c38809d5, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f97429F = c24872d;
        this.f97431H = c38809d5;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f97432w) {
            case 0:
                return new C24871c((C24872d) this.f97429F, (C38809d5) this.f97431H, interfaceC30057d);
            default:
                C24871c c24871c = new C24871c((C27344b) this.f97431H, interfaceC30057d);
                c24871c.f97430G = obj;
                return c24871c;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f97432w) {
            case 0:
                break;
        }
        return ((C24871c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:161:0x036d A[Catch: all -> 0x02d6, TryCatch #3 {all -> 0x02d6, blocks: (B:159:0x0367, B:161:0x036d, B:163:0x037f, B:165:0x0383, B:167:0x038d, B:170:0x0393, B:172:0x039b, B:174:0x039f, B:177:0x03a5, B:179:0x03ad, B:181:0x03b1, B:183:0x03b5, B:189:0x03d1, B:190:0x03d3, B:192:0x03ed, B:158:0x0362, B:126:0x02c7, B:138:0x0326), top: B:203:0x0278 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x037f A[Catch: all -> 0x02d6, TryCatch #3 {all -> 0x02d6, blocks: (B:159:0x0367, B:161:0x036d, B:163:0x037f, B:165:0x0383, B:167:0x038d, B:170:0x0393, B:172:0x039b, B:174:0x039f, B:177:0x03a5, B:179:0x03ad, B:181:0x03b1, B:183:0x03b5, B:189:0x03d1, B:190:0x03d3, B:192:0x03ed, B:158:0x0362, B:126:0x02c7, B:138:0x0326), top: B:203:0x0278 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0382  */
    /* JADX WARN: Code duplicated, block: B:167:0x038d A[Catch: all -> 0x02d6, TryCatch #3 {all -> 0x02d6, blocks: (B:159:0x0367, B:161:0x036d, B:163:0x037f, B:165:0x0383, B:167:0x038d, B:170:0x0393, B:172:0x039b, B:174:0x039f, B:177:0x03a5, B:179:0x03ad, B:181:0x03b1, B:183:0x03b5, B:189:0x03d1, B:190:0x03d3, B:192:0x03ed, B:158:0x0362, B:126:0x02c7, B:138:0x0326), top: B:203:0x0278 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0390  */
    /* JADX WARN: Code duplicated, block: B:170:0x0393 A[Catch: all -> 0x02d6, TryCatch #3 {all -> 0x02d6, blocks: (B:159:0x0367, B:161:0x036d, B:163:0x037f, B:165:0x0383, B:167:0x038d, B:170:0x0393, B:172:0x039b, B:174:0x039f, B:177:0x03a5, B:179:0x03ad, B:181:0x03b1, B:183:0x03b5, B:189:0x03d1, B:190:0x03d3, B:192:0x03ed, B:158:0x0362, B:126:0x02c7, B:138:0x0326), top: B:203:0x0278 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x039a  */
    /* JADX WARN: Code duplicated, block: B:174:0x039f A[Catch: all -> 0x02d6, TryCatch #3 {all -> 0x02d6, blocks: (B:159:0x0367, B:161:0x036d, B:163:0x037f, B:165:0x0383, B:167:0x038d, B:170:0x0393, B:172:0x039b, B:174:0x039f, B:177:0x03a5, B:179:0x03ad, B:181:0x03b1, B:183:0x03b5, B:189:0x03d1, B:190:0x03d3, B:192:0x03ed, B:158:0x0362, B:126:0x02c7, B:138:0x0326), top: B:203:0x0278 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:177:0x03a5 A[Catch: all -> 0x02d6, TryCatch #3 {all -> 0x02d6, blocks: (B:159:0x0367, B:161:0x036d, B:163:0x037f, B:165:0x0383, B:167:0x038d, B:170:0x0393, B:172:0x039b, B:174:0x039f, B:177:0x03a5, B:179:0x03ad, B:181:0x03b1, B:183:0x03b5, B:189:0x03d1, B:190:0x03d3, B:192:0x03ed, B:158:0x0362, B:126:0x02c7, B:138:0x0326), top: B:203:0x0278 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:181:0x03b1 A[Catch: all -> 0x02d6, TryCatch #3 {all -> 0x02d6, blocks: (B:159:0x0367, B:161:0x036d, B:163:0x037f, B:165:0x0383, B:167:0x038d, B:170:0x0393, B:172:0x039b, B:174:0x039f, B:177:0x03a5, B:179:0x03ad, B:181:0x03b1, B:183:0x03b5, B:189:0x03d1, B:190:0x03d3, B:192:0x03ed, B:158:0x0362, B:126:0x02c7, B:138:0x0326), top: B:203:0x0278 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:186:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:189:0x03d1 A[Catch: all -> 0x02d6, TRY_ENTER, TryCatch #3 {all -> 0x02d6, blocks: (B:159:0x0367, B:161:0x036d, B:163:0x037f, B:165:0x0383, B:167:0x038d, B:170:0x0393, B:172:0x039b, B:174:0x039f, B:177:0x03a5, B:179:0x03ad, B:181:0x03b1, B:183:0x03b5, B:189:0x03d1, B:190:0x03d3, B:192:0x03ed, B:158:0x0362, B:126:0x02c7, B:138:0x0326), top: B:203:0x0278 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0108 A[Catch: all -> 0x0135, TryCatch #2 {all -> 0x0135, blocks: (B:37:0x00f3, B:39:0x0108, B:40:0x0111, B:42:0x0117, B:46:0x012d, B:47:0x0134, B:51:0x013d, B:53:0x0151, B:55:0x0163, B:57:0x0167, B:59:0x016b, B:61:0x016f, B:82:0x01f1, B:83:0x01f8, B:84:0x01f9, B:85:0x0200, B:86:0x0201, B:87:0x0203, B:89:0x021c), top: B:202:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0117 A[Catch: all -> 0x0135, TryCatch #2 {all -> 0x0135, blocks: (B:37:0x00f3, B:39:0x0108, B:40:0x0111, B:42:0x0117, B:46:0x012d, B:47:0x0134, B:51:0x013d, B:53:0x0151, B:55:0x0163, B:57:0x0167, B:59:0x016b, B:61:0x016f, B:82:0x01f1, B:83:0x01f8, B:84:0x01f9, B:85:0x0200, B:86:0x0201, B:87:0x0203, B:89:0x021c), top: B:202:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x012a  */
    /* JADX WARN: Code duplicated, block: B:51:0x013d A[Catch: all -> 0x0135, TryCatch #2 {all -> 0x0135, blocks: (B:37:0x00f3, B:39:0x0108, B:40:0x0111, B:42:0x0117, B:46:0x012d, B:47:0x0134, B:51:0x013d, B:53:0x0151, B:55:0x0163, B:57:0x0167, B:59:0x016b, B:61:0x016f, B:82:0x01f1, B:83:0x01f8, B:84:0x01f9, B:85:0x0200, B:86:0x0201, B:87:0x0203, B:89:0x021c), top: B:202:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0151 A[Catch: all -> 0x0135, TryCatch #2 {all -> 0x0135, blocks: (B:37:0x00f3, B:39:0x0108, B:40:0x0111, B:42:0x0117, B:46:0x012d, B:47:0x0134, B:51:0x013d, B:53:0x0151, B:55:0x0163, B:57:0x0167, B:59:0x016b, B:61:0x016f, B:82:0x01f1, B:83:0x01f8, B:84:0x01f9, B:85:0x0200, B:86:0x0201, B:87:0x0203, B:89:0x021c), top: B:202:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0163 A[Catch: all -> 0x0135, TryCatch #2 {all -> 0x0135, blocks: (B:37:0x00f3, B:39:0x0108, B:40:0x0111, B:42:0x0117, B:46:0x012d, B:47:0x0134, B:51:0x013d, B:53:0x0151, B:55:0x0163, B:57:0x0167, B:59:0x016b, B:61:0x016f, B:82:0x01f1, B:83:0x01f8, B:84:0x01f9, B:85:0x0200, B:86:0x0201, B:87:0x0203, B:89:0x021c), top: B:202:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0166  */
    /* JADX WARN: Code duplicated, block: B:59:0x016b A[Catch: all -> 0x0135, TryCatch #2 {all -> 0x0135, blocks: (B:37:0x00f3, B:39:0x0108, B:40:0x0111, B:42:0x0117, B:46:0x012d, B:47:0x0134, B:51:0x013d, B:53:0x0151, B:55:0x0163, B:57:0x0167, B:59:0x016b, B:61:0x016f, B:82:0x01f1, B:83:0x01f8, B:84:0x01f9, B:85:0x0200, B:86:0x0201, B:87:0x0203, B:89:0x021c), top: B:202:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0191  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5 A[Catch: all -> 0x002c, TryCatch #8 {all -> 0x002c, blocks: (B:9:0x0025, B:65:0x0194, B:66:0x0198, B:68:0x01b1, B:70:0x01b5, B:72:0x01b9, B:73:0x01bb, B:76:0x01d9, B:78:0x01dd, B:79:0x01e7, B:80:0x01ec), top: B:212:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b9 A[Catch: all -> 0x002c, TryCatch #8 {all -> 0x002c, blocks: (B:9:0x0025, B:65:0x0194, B:66:0x0198, B:68:0x01b1, B:70:0x01b5, B:72:0x01b9, B:73:0x01bb, B:76:0x01d9, B:78:0x01dd, B:79:0x01e7, B:80:0x01ec), top: B:212:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01d9 A[Catch: all -> 0x002c, TryCatch #8 {all -> 0x002c, blocks: (B:9:0x0025, B:65:0x0194, B:66:0x0198, B:68:0x01b1, B:70:0x01b5, B:72:0x01b9, B:73:0x01bb, B:76:0x01d9, B:78:0x01dd, B:79:0x01e7, B:80:0x01ec), top: B:212:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd A[Catch: all -> 0x002c, TryCatch #8 {all -> 0x002c, blocks: (B:9:0x0025, B:65:0x0194, B:66:0x0198, B:68:0x01b1, B:70:0x01b5, B:72:0x01b9, B:73:0x01bb, B:76:0x01d9, B:78:0x01dd, B:79:0x01e7, B:80:0x01ec), top: B:212:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e7 A[Catch: all -> 0x002c, TryCatch #8 {all -> 0x002c, blocks: (B:9:0x0025, B:65:0x0194, B:66:0x0198, B:68:0x01b1, B:70:0x01b5, B:72:0x01b9, B:73:0x01bb, B:76:0x01d9, B:78:0x01dd, B:79:0x01e7, B:80:0x01ec), top: B:212:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01f1 A[Catch: all -> 0x0135, TRY_ENTER, TryCatch #2 {all -> 0x0135, blocks: (B:37:0x00f3, B:39:0x0108, B:40:0x0111, B:42:0x0117, B:46:0x012d, B:47:0x0134, B:51:0x013d, B:53:0x0151, B:55:0x0163, B:57:0x0167, B:59:0x016b, B:61:0x016f, B:82:0x01f1, B:83:0x01f8, B:84:0x01f9, B:85:0x0200, B:86:0x0201, B:87:0x0203, B:89:0x021c), top: B:202:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01f9 A[Catch: all -> 0x0135, TryCatch #2 {all -> 0x0135, blocks: (B:37:0x00f3, B:39:0x0108, B:40:0x0111, B:42:0x0117, B:46:0x012d, B:47:0x0134, B:51:0x013d, B:53:0x0151, B:55:0x0163, B:57:0x0167, B:59:0x016b, B:61:0x016f, B:82:0x01f1, B:83:0x01f8, B:84:0x01f9, B:85:0x0200, B:86:0x0201, B:87:0x0203, B:89:0x021c), top: B:202:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0201 A[Catch: all -> 0x0135, TryCatch #2 {all -> 0x0135, blocks: (B:37:0x00f3, B:39:0x0108, B:40:0x0111, B:42:0x0117, B:46:0x012d, B:47:0x0134, B:51:0x013d, B:53:0x0151, B:55:0x0163, B:57:0x0167, B:59:0x016b, B:61:0x016f, B:82:0x01f1, B:83:0x01f8, B:84:0x01f9, B:85:0x0200, B:86:0x0201, B:87:0x0203, B:89:0x021c), top: B:202:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x023a A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:95:0x0234, B:97:0x023a, B:98:0x0243), top: B:199:0x0234 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x02d8: MOVE (r3 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:129:0x02d7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z4;
        C37737m1 c37737m1;
        C37737m1 c37737m2;
        Object value;
        C24872d c24872d;
        Object obj2;
        C37737m1 c37737m3;
        boolean z13;
        C38809d5 c38809d5;
        C38809d5 c38809d6;
        Object objM124166r;
        Object obj3;
        Throwable thM68037a;
        C13045h2 c13045h2;
        Object value2;
        AbstractC37748q0 abstractC37748q0;
        Object obj4;
        Map map;
        Object obj5;
        Map map2;
        Object obj6;
        String str;
        Object obj7;
        String str2;
        C24872d c24872d2;
        Object objM107888l;
        C27344b c27344b;
        C37737m1 c37737m4;
        boolean z14;
        Object value3;
        String str3;
        Object objM124172x;
        C27344b c27344b2;
        C37737m1 c37737m5;
        boolean z15;
        C16621a c16621a;
        C38804d0 c38804d0;
        C13045h2 c13045h3;
        Object value4;
        Object obj8;
        AbstractC38794c0 abstractC38794c0;
        C11433l c11433l;
        C37701a1 c37701a1;
        String str4;
        C38977v3 c38977v3;
        String str5;
        Object objM191i;
        Object objM107888l2;
        Throwable thM68037a2;
        C13045h2 c13045h4;
        Object value5;
        InterfaceC0069d interfaceC0069d;
        C13045h2 c13045h5;
        Object value6;
        C13045h2 c13045h6;
        Object value7;
        switch (this.f97432w) {
            case 0:
                C24872d c24872d3 = (C24872d) this.f97429F;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f97434y;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C13045h2 c13045h7 = c24872d3.f97441J;
                        do {
                            value = c13045h7.getValue();
                        } while (!c13045h7.m36569i(value, C24869a.m72901a((C24869a) value, null, false, null, null, 47)));
                        C24872d.m72903j(c24872d3, EnumC16519o0.Processing);
                        c37737m2 = c24872d3.f97438G;
                        C38809d5 c38809d7 = (C38809d5) this.f97431H;
                        boolean z16 = c37737m2.f161694a;
                        c37737m2.f161694a = false;
                        try {
                            C38747x c38747x = c24872d3.f97445y;
                            this.f97435z = c37737m2;
                            this.f97428E = c24872d3;
                            this.f97430G = c38809d7;
                            this.f97433x = z16;
                            this.f97434y = 1;
                            Object objM124152c = c38747x.m124152c(c38809d7, this);
                            if (objM124152c == enumC31071a) {
                                return enumC31071a;
                            }
                            c24872d = c24872d3;
                            obj2 = objM124152c;
                            c37737m3 = c37737m2;
                            z13 = z16;
                            c38809d5 = c38809d7;
                        } catch (Throwable th3) {
                            th = th3;
                            z4 = z16;
                            c37737m2.f161694a = z4;
                            throw th;
                        }
                    } else {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                z4 = this.f97433x;
                                c24872d2 = (C24872d) this.f97428E;
                                c37737m2 = (C37737m1) this.f97435z;
                                try {
                                    AbstractC34132o.m107864I(obj);
                                    z4 = z4;
                                    C24872d.m72903j(c24872d2, EnumC16519o0.Enabled);
                                    c37737m3 = c37737m2;
                                    z13 = z4 ? 1 : 0;
                                    c37737m3.f161694a = z13;
                                    return C23454a0.f92919a;
                                } catch (Throwable th4) {
                                    th = th4;
                                    c37737m2.f161694a = z4;
                                    throw th;
                                }
                            }
                            z13 = this.f97433x;
                            c38809d6 = (C38809d5) this.f97430G;
                            c24872d = (C24872d) this.f97428E;
                            c37737m3 = (C37737m1) this.f97435z;
                            try {
                                AbstractC34132o.m107864I(obj);
                                objM124166r = ((C23468n) obj).f92940w;
                                AbstractC34132o.m107864I(objM124166r);
                                objM107888l = (AbstractC37748q0) objM124166r;
                                break;
                            } catch (Throwable th5) {
                                th = th5;
                                objM107888l = AbstractC34132o.m107888l(th);
                            }
                            c38809d5 = c38809d6;
                            obj3 = objM107888l;
                            thM68037a = C23468n.m68037a(obj3);
                            if (thM68037a == null) {
                                abstractC37748q0 = (AbstractC37748q0) obj3;
                                LinkedHashMap linkedHashMap = (LinkedHashMap) c38809d5.mo124325c0();
                                obj4 = linkedHashMap.get("card");
                                if (obj4 instanceof Map) {
                                    map = (Map) obj4;
                                } else {
                                    map = null;
                                }
                                obj5 = linkedHashMap.get("billing_details");
                                if (obj5 instanceof Map) {
                                    map2 = (Map) obj5;
                                } else {
                                    map2 = null;
                                }
                                if (map != null) {
                                    obj6 = map.get("cvc");
                                } else {
                                    obj6 = null;
                                }
                                if (obj6 instanceof String) {
                                    str = (String) obj6;
                                } else {
                                    str = null;
                                }
                                if (map2 != null) {
                                    obj7 = map2.get("phone");
                                } else {
                                    obj7 = null;
                                }
                                if (obj7 instanceof String) {
                                    str2 = (String) obj7;
                                } else {
                                    str2 = null;
                                }
                                this.f97435z = c37737m3;
                                this.f97428E = c24872d;
                                this.f97430G = null;
                                this.f97433x = z13;
                                this.f97434y = 3;
                                if (C24872d.m72902g(c24872d, abstractC37748q0, str, str2, this) == enumC31071a) {
                                    return enumC31071a;
                                }
                                z4 = z13 ? 1 : 0;
                                c24872d2 = c24872d;
                                c37737m2 = c37737m3;
                                C24872d.m72903j(c24872d2, EnumC16519o0.Enabled);
                                c37737m3 = c37737m2;
                                z13 = z4 ? 1 : 0;
                            } else {
                                c13045h2 = c24872d.f97441J;
                                do {
                                    value2 = c13045h2.getValue();
                                } while (!c13045h2.m36569i(value2, C24869a.m72901a((C24869a) value2, null, false, null, AbstractC37926s0.m121456H(thM68037a), 63)));
                                C24872d.m72903j(c24872d, EnumC16519o0.Enabled);
                                c24872d.f97436E.m94512b("PaymentMethodViewModel: Failed to create card payment details", thM68037a);
                            }
                            c37737m3.f161694a = z13;
                            return C23454a0.f92919a;
                        }
                        z13 = this.f97433x;
                        C38809d5 c38809d8 = (C38809d5) this.f97430G;
                        c24872d = (C24872d) this.f97428E;
                        c37737m3 = (C37737m1) this.f97435z;
                        AbstractC34132o.m107864I(obj);
                        c38809d5 = c38809d8;
                        obj2 = ((C23468n) obj).f92940w;
                    }
                    boolean z17 = obj2 instanceof C23467m;
                    obj3 = obj2;
                    if (!z17) {
                        try {
                            C37742o0 c37742o0 = (C37742o0) obj2;
                            obj3 = c37742o0;
                            if (c24872d.f97443w.f161608H) {
                                InterfaceC37739n0 interfaceC37739n0 = c24872d.f97439H;
                                C37736m0 c37736m0 = interfaceC37739n0 instanceof C37736m0 ? (C37736m0) interfaceC37739n0 : null;
                                if (c37736m0 == null || c37736m0.f161692y) {
                                    C38747x c38747x2 = c24872d.f97445y;
                                    this.f97435z = c37737m3;
                                    this.f97428E = c24872d;
                                    this.f97430G = c38809d5;
                                    this.f97433x = z13;
                                    this.f97434y = 2;
                                    objM124166r = c38747x2.m124166r(c37742o0, this);
                                    if (objM124166r == enumC31071a) {
                                        return enumC31071a;
                                    }
                                    c38809d6 = c38809d5;
                                    AbstractC34132o.m107864I(objM124166r);
                                    objM107888l = (AbstractC37748q0) objM124166r;
                                    c38809d5 = c38809d6;
                                    obj3 = objM107888l;
                                } else {
                                    obj3 = c37742o0;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c38809d6 = c38809d5;
                            objM107888l = AbstractC34132o.m107888l(th);
                        }
                    }
                    thM68037a = C23468n.m68037a(obj3);
                    if (thM68037a == null) {
                        abstractC37748q0 = (AbstractC37748q0) obj3;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c38809d5.mo124325c0();
                        obj4 = linkedHashMap2.get("card");
                        if (obj4 instanceof Map) {
                            map = (Map) obj4;
                        } else {
                            map = null;
                        }
                        obj5 = linkedHashMap2.get("billing_details");
                        if (obj5 instanceof Map) {
                            map2 = (Map) obj5;
                        } else {
                            map2 = null;
                        }
                        if (map != null) {
                            obj6 = map.get("cvc");
                        } else {
                            obj6 = null;
                        }
                        if (obj6 instanceof String) {
                            str = (String) obj6;
                        } else {
                            str = null;
                        }
                        if (map2 != null) {
                            obj7 = map2.get("phone");
                        } else {
                            obj7 = null;
                        }
                        if (obj7 instanceof String) {
                            str2 = (String) obj7;
                        } else {
                            str2 = null;
                        }
                        this.f97435z = c37737m3;
                        this.f97428E = c24872d;
                        this.f97430G = null;
                        this.f97433x = z13;
                        this.f97434y = 3;
                        if (C24872d.m72902g(c24872d, abstractC37748q0, str, str2, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        z4 = z13 ? 1 : 0;
                        c24872d2 = c24872d;
                        c37737m2 = c37737m3;
                        C24872d.m72903j(c24872d2, EnumC16519o0.Enabled);
                        c37737m3 = c37737m2;
                        z13 = z4 ? 1 : 0;
                    } else {
                        c13045h2 = c24872d.f97441J;
                        do {
                            value2 = c13045h2.getValue();
                        } while (!c13045h2.m36569i(value2, C24869a.m72901a((C24869a) value2, null, false, null, AbstractC37926s0.m121456H(thM68037a), 63)));
                        C24872d.m72903j(c24872d, EnumC16519o0.Enabled);
                        c24872d.f97436E.m94512b("PaymentMethodViewModel: Failed to create card payment details", thM68037a);
                    }
                    c37737m3.f161694a = z13;
                    return C23454a0.f92919a;
                } catch (Throwable th7) {
                    th = th7;
                    z4 = i13;
                    c37737m2 = c37737m1;
                }
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f97434y;
                C23454a0 c23454a0 = C23454a0.f92919a;
                boolean z18 = false;
                if (i14 != 0) {
                    try {
                        try {
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                z14 = this.f97433x;
                                c27344b = (C27344b) this.f97435z;
                                c37737m4 = (C37737m1) this.f97430G;
                                try {
                                    AbstractC34132o.m107864I(obj);
                                    objM191i = obj;
                                    interfaceC0069d = (InterfaceC0069d) objM191i;
                                    c13045h5 = c27344b.f109530H;
                                    do {
                                        value6 = c13045h5.getValue();
                                    } while (!c13045h5.m36569i(value6, C27343a.m82484a((C27343a) value6, null, false, null, null, null, false, 127)));
                                    if (!(interfaceC0069d instanceof C0066a)) {
                                        if (interfaceC0069d instanceof C0068c) {
                                            c13045h6 = c27344b.f109530H;
                                            do {
                                                value7 = c13045h6.getValue();
                                            } while (!c13045h6.m36569i(value7, C27343a.m82484a((C27343a) value7, null, false, null, null, ((C0068c) interfaceC0069d).f207a, false, 191)));
                                        } else {
                                            if (!(interfaceC0069d instanceof C0067b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            c27344b.f109529G.invoke(((C0067b) interfaceC0069d).f206a);
                                        }
                                    }
                                    c27344b2 = c27344b;
                                    c37737m5 = c37737m4;
                                    z15 = z14;
                                    objM107888l2 = c23454a0;
                                } catch (Throwable th8) {
                                    th = th8;
                                    objM107888l2 = AbstractC34132o.m107888l(th);
                                    c27344b2 = c27344b;
                                    c37737m5 = c37737m4;
                                    z15 = z14;
                                }
                                thM68037a2 = C23468n.m68037a(objM107888l2);
                                if (thM68037a2 != null) {
                                    c27344b2.f109534w.m94512b("Failed to update payment details", thM68037a2);
                                    c13045h4 = c27344b2.f109530H;
                                    do {
                                        value5 = c13045h4.getValue();
                                        break;
                                    } while (!c13045h4.m36569i(value5, C27343a.m82484a((C27343a) value5, null, false, null, null, AbstractC37926s0.m121456H(thM68037a2), false, 63)));
                                }
                                c37737m5.f161694a = z15;
                                return c23454a0;
                            }
                            z15 = this.f97433x;
                            str3 = (String) this.f97429F;
                            c16621a = (C16621a) this.f97428E;
                            C27344b c27344b3 = (C27344b) this.f97435z;
                            C37737m1 c37737m6 = (C37737m1) this.f97430G;
                            try {
                                AbstractC34132o.m107864I(obj);
                                objM124172x = ((C23468n) obj).f92940w;
                                c27344b2 = c27344b3;
                                c37737m5 = c37737m6;
                                try {
                                    AbstractC34132o.m107864I(objM124172x);
                                    c38804d0 = (C38804d0) objM124172x;
                                    if (((C27343a) c27344b2.f109531I.f45200w.getValue()).m82485b()) {
                                        obj8 = null;
                                        for (Object obj9 : c38804d0.f166994w) {
                                            if (!AbstractC22676k.m65745e(((AbstractC38794c0) obj9).getId(), str3)) {
                                                if (!z18) {
                                                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                                                }
                                                z18 = true;
                                                obj8 = obj9;
                                            }
                                        }
                                        if (z18) {
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        abstractC38794c0 = (AbstractC38794c0) obj8;
                                        c11433l = ((C37708d) c27344b2.f109535x.f166746a.f166664b.f45200w.getValue()).f161571w;
                                        if (c11433l != null) {
                                            throw new IllegalArgumentException("LinkAccount should not be null in billing details update flow");
                                        }
                                        C0072g c0072g = c27344b2.f109528F;
                                        c37701a1 = ((C27343a) c27344b2.f109531I.f45200w.getValue()).f109520b;
                                        if (c37701a1 != null) {
                                            str4 = c37701a1.f161558a;
                                        } else {
                                            str4 = null;
                                        }
                                        c38977v3 = c16621a.f63955d;
                                        if (c38977v3 != null) {
                                            str5 = c38977v3.f167776z;
                                        } else {
                                            str5 = null;
                                        }
                                        C37754s0 c37754s0 = new C37754s0(abstractC38794c0, str4, str5);
                                        this.f97430G = c37737m5;
                                        this.f97435z = c27344b2;
                                        this.f97428E = null;
                                        this.f97429F = null;
                                        this.f97433x = z15;
                                        this.f97434y = 2;
                                        objM191i = c0072g.m191i((InterfaceC37739n0) c0072g.f221E, new C0071f(c37754s0, c0072g, c11433l, null, 0), c37754s0, this);
                                        if (objM191i == enumC31071a2) {
                                            return enumC31071a2;
                                        }
                                        z14 = z15;
                                        c27344b = c27344b2;
                                        c37737m4 = c37737m5;
                                        interfaceC0069d = (InterfaceC0069d) objM191i;
                                        c13045h5 = c27344b.f109530H;
                                        do {
                                            value6 = c13045h5.getValue();
                                        } while (!c13045h5.m36569i(value6, C27343a.m82484a((C27343a) value6, null, false, null, null, null, false, 127)));
                                        if (!(interfaceC0069d instanceof C0066a)) {
                                            if (interfaceC0069d instanceof C0068c) {
                                                c13045h6 = c27344b.f109530H;
                                                do {
                                                    value7 = c13045h6.getValue();
                                                } while (!c13045h6.m36569i(value7, C27343a.m82484a((C27343a) value7, null, false, null, null, ((C0068c) interfaceC0069d).f207a, false, 191)));
                                            } else {
                                                if (!(interfaceC0069d instanceof C0067b)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                c27344b.f109529G.invoke(((C0067b) interfaceC0069d).f206a);
                                            }
                                        }
                                        c27344b2 = c27344b;
                                        c37737m5 = c37737m4;
                                        z15 = z14;
                                    } else {
                                        c13045h3 = c27344b2.f109530H;
                                        do {
                                            value4 = c13045h3.getValue();
                                        } while (!c13045h3.m36569i(value4, C27343a.m82484a((C27343a) value4, null, false, null, null, null, false, 63)));
                                        c27344b2.f109536y.f104430a.mo36564a(C26264d.f104426a);
                                    }
                                    objM107888l2 = c23454a0;
                                } catch (Throwable th9) {
                                    th = th9;
                                    z14 = z15;
                                    c27344b = c27344b2;
                                    c37737m4 = c37737m5;
                                    objM107888l2 = AbstractC34132o.m107888l(th);
                                    c27344b2 = c27344b;
                                    c37737m5 = c37737m4;
                                    z15 = z14;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                z14 = z15;
                                c27344b = c27344b3;
                                c37737m4 = c37737m6;
                            }
                            thM68037a2 = C23468n.m68037a(objM107888l2);
                            if (thM68037a2 != null) {
                                c27344b2.f109534w.m94512b("Failed to update payment details", thM68037a2);
                                c13045h4 = c27344b2.f109530H;
                                do {
                                    value5 = c13045h4.getValue();
                                    break;
                                } while (!c13045h4.m36569i(value5, C27343a.m82484a((C27343a) value5, null, false, null, null, AbstractC37926s0.m121456H(thM68037a2), false, 63)));
                            }
                            c37737m5.f161694a = z15;
                            return c23454a0;
                            thM68037a2 = C23468n.m68037a(objM107888l2);
                            if (thM68037a2 != null) {
                                c27344b2.f109534w.m94512b("Failed to update payment details", thM68037a2);
                                c13045h4 = c27344b2.f109530H;
                                do {
                                    value5 = c13045h4.getValue();
                                    break;
                                } while (!c13045h4.m36569i(value5, C27343a.m82484a((C27343a) value5, null, false, null, null, AbstractC37926s0.m121456H(thM68037a2), false, 63)));
                            }
                            c37737m5.f161694a = z15;
                            return c23454a0;
                        } catch (Throwable th11) {
                            th = th11;
                            z14 = z15;
                            c37737m4 = c37737m5;
                        }
                        objM107888l2 = AbstractC34132o.m107888l(th);
                        c27344b2 = c27344b;
                        c37737m5 = c37737m4;
                        z15 = z14;
                    } catch (Throwable th12) {
                        th = th12;
                    }
                } else {
                    AbstractC34132o.m107864I(obj);
                    c27344b = (C27344b) this.f97431H;
                    C37737m1 c37737m7 = c27344b.f109537z;
                    boolean z19 = c37737m7.f161694a;
                    c37737m7.f161694a = false;
                    try {
                        C13045h2 c13045h8 = c27344b.f109530H;
                        C13081r1 c13081r1 = c27344b.f109531I;
                        do {
                            value3 = c13045h8.getValue();
                        } while (!c13045h8.m36569i(value3, C27343a.m82484a((C27343a) value3, null, false, null, null, null, true, 63)));
                        C16621a c16621a2 = ((C27343a) c13081r1.f45200w.getValue()).f109523e;
                        if (c16621a2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        str3 = ((C27343a) c13081r1.f45200w.getValue()).f109519a;
                        C38854i0 c38854i0 = new C38854i0(str3, Boolean.valueOf(((C27343a) c13081r1.f45200w.getValue()).f109522d), (LinkedHashMap) C27344b.m82486g(c27344b, c16621a2).mo124325c0(), (LinkedHashMap) c27344b.f109527E.f161635i0.mo124325c0());
                        C38747x c38747x3 = c27344b.f109535x;
                        C38977v3 c38977v4 = c16621a2.f63955d;
                        String str6 = c38977v4 != null ? c38977v4.f167776z : null;
                        this.f97430G = c37737m7;
                        this.f97435z = c27344b;
                        this.f97428E = c16621a2;
                        this.f97429F = str3;
                        this.f97433x = z19;
                        this.f97434y = 1;
                        objM124172x = c38747x3.m124172x(c38854i0, str6, this);
                        if (objM124172x == enumC31071a2) {
                            return enumC31071a2;
                        }
                        c27344b2 = c27344b;
                        c37737m5 = c37737m7;
                        z15 = z19;
                        c16621a = c16621a2;
                        AbstractC34132o.m107864I(objM124172x);
                        c38804d0 = (C38804d0) objM124172x;
                        if (((C27343a) c27344b2.f109531I.f45200w.getValue()).m82485b()) {
                            obj8 = null;
                            while (r9.hasNext()) {
                                if (!AbstractC22676k.m65745e(((AbstractC38794c0) obj9).getId(), str3)) {
                                    if (!z18) {
                                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                                    }
                                    z18 = true;
                                    obj8 = obj9;
                                }
                            }
                            if (z18) {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            abstractC38794c0 = (AbstractC38794c0) obj8;
                            c11433l = ((C37708d) c27344b2.f109535x.f166746a.f166664b.f45200w.getValue()).f161571w;
                            if (c11433l != null) {
                                throw new IllegalArgumentException("LinkAccount should not be null in billing details update flow");
                            }
                            C0072g c0072g2 = c27344b2.f109528F;
                            c37701a1 = ((C27343a) c27344b2.f109531I.f45200w.getValue()).f109520b;
                            if (c37701a1 != null) {
                                str4 = c37701a1.f161558a;
                            } else {
                                str4 = null;
                            }
                            c38977v3 = c16621a.f63955d;
                            if (c38977v3 != null) {
                                str5 = c38977v3.f167776z;
                            } else {
                                str5 = null;
                            }
                            C37754s0 c37754s1 = new C37754s0(abstractC38794c0, str4, str5);
                            this.f97430G = c37737m5;
                            this.f97435z = c27344b2;
                            this.f97428E = null;
                            this.f97429F = null;
                            this.f97433x = z15;
                            this.f97434y = 2;
                            objM191i = c0072g2.m191i((InterfaceC37739n0) c0072g2.f221E, new C0071f(c37754s1, c0072g2, c11433l, null, 0), c37754s1, this);
                            if (objM191i == enumC31071a2) {
                                return enumC31071a2;
                            }
                            z14 = z15;
                            c27344b = c27344b2;
                            c37737m4 = c37737m5;
                            interfaceC0069d = (InterfaceC0069d) objM191i;
                            c13045h5 = c27344b.f109530H;
                            do {
                                value6 = c13045h5.getValue();
                            } while (!c13045h5.m36569i(value6, C27343a.m82484a((C27343a) value6, null, false, null, null, null, false, 127)));
                            if (!(interfaceC0069d instanceof C0066a)) {
                                if (interfaceC0069d instanceof C0068c) {
                                    c13045h6 = c27344b.f109530H;
                                    do {
                                        value7 = c13045h6.getValue();
                                    } while (!c13045h6.m36569i(value7, C27343a.m82484a((C27343a) value7, null, false, null, null, ((C0068c) interfaceC0069d).f207a, false, 191)));
                                } else {
                                    if (!(interfaceC0069d instanceof C0067b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    c27344b.f109529G.invoke(((C0067b) interfaceC0069d).f206a);
                                }
                            }
                            c27344b2 = c27344b;
                            c37737m5 = c37737m4;
                            z15 = z14;
                        } else {
                            c13045h3 = c27344b2.f109530H;
                            do {
                                value4 = c13045h3.getValue();
                            } while (!c13045h3.m36569i(value4, C27343a.m82484a((C27343a) value4, null, false, null, null, null, false, 63)));
                            c27344b2.f109536y.f104430a.mo36564a(C26264d.f104426a);
                        }
                        objM107888l2 = c23454a0;
                        thM68037a2 = C23468n.m68037a(objM107888l2);
                        if (thM68037a2 != null) {
                            c27344b2.f109534w.m94512b("Failed to update payment details", thM68037a2);
                            c13045h4 = c27344b2.f109530H;
                            do {
                                value5 = c13045h4.getValue();
                                break;
                            } while (!c13045h4.m36569i(value5, C27343a.m82484a((C27343a) value5, null, false, null, null, AbstractC37926s0.m121456H(thM68037a2), false, 63)));
                        }
                        c37737m5.f161694a = z15;
                        return c23454a0;
                    } catch (Throwable th13) {
                        th = th13;
                        c37737m4 = c37737m7;
                        z14 = z19;
                    }
                }
                c37737m4.f161694a = z14;
                throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24871c(C27344b c27344b, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f97431H = c27344b;
    }
}

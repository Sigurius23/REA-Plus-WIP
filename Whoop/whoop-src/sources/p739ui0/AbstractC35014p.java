package p739ui0;

import a81.C0559j;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.bot.settings.C6078h;
import com.whoop.design.atomic.atom.icon.GlowStyle;
import com.whoop.design.models.items.FixedHeaderAlignment;
import com.whoop.design.models.items.NavigationBarStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ev2.C13698g;
import gb1.AbstractC15697y;
import gy0.AbstractC16276e;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p026b2.InterfaceC2300f;
import p026b2.InterfaceC2302h;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.C25307p;
import p720m91.C25311t;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import ri0.AbstractC31448g;
import ri0.C31447f;
import ri0.C31450i;
import ri0.C31451j;
import ri0.InterfaceC31443b;
import ri0.InterfaceC31449h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t01.C33259e;
import te0.AbstractC33745d;
import u91.C34656a;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ui0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lri0/f;", "navigationBarState", "", "v", "(Lri0/f;)Z", "Lcom/whoop/design/models/items/FixedHeaderAlignment;", "Lb2/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/design/models/items/FixedHeaderAlignment;)Lb2/f;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lri0/b;", "Ll83/a0;", "onEvent", "i", "(Landroidx/compose/ui/Modifier;Lri0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lri0/i;", "button", "Ly3/f;", "size", "Lkotlin/Function0;", "onClick", "s", "(Lri0/i;FLc93/a;Landroidx/compose/runtime/Composer;I)V", "a", "F", "glowDiameterOvershoot", "Lb2/h;", "titleAlignment", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35014p {

    /* JADX INFO: renamed from: a */
    private static final float f148168a = 7 * 4;

    /* JADX INFO: renamed from: ui0.p$a */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericToolbarKt$GenericToolbar$1$1$1", m100430f = "GenericToolbar.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148169w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31447f f148170x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f148171y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31447f c31447f, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148170x = c31447f;
            this.f148171y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f148170x, this.f148171y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148169w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC35014p.m110620k(this.f148171y, (AbstractC8693b.m21270d(this.f148170x.getTitle()) && (this.f148170x.getEndButton() instanceof C31451j)) ? C2299e.f9117z : C2299e.f9102E);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ui0.p$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f148172a;

        static {
            int[] iArr = new int[FixedHeaderAlignment.values().length];
            try {
                iArr[FixedHeaderAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FixedHeaderAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FixedHeaderAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f148172a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0267  */
    /* JADX WARN: Code duplicated, block: B:101:0x026b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0286  */
    /* JADX WARN: Code duplicated, block: B:109:0x0292  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:112:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:121:0x0301  */
    /* JADX WARN: Code duplicated, block: B:123:0x0351  */
    /* JADX WARN: Code duplicated, block: B:125:0x0372  */
    /* JADX WARN: Code duplicated, block: B:126:0x0376  */
    /* JADX WARN: Code duplicated, block: B:133:0x0395  */
    /* JADX WARN: Code duplicated, block: B:136:0x0429  */
    /* JADX WARN: Code duplicated, block: B:138:0x0435  */
    /* JADX WARN: Code duplicated, block: B:140:0x048c  */
    /* JADX WARN: Code duplicated, block: B:143:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:144:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:146:0x052d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0584  */
    /* JADX WARN: Code duplicated, block: B:150:0x059d  */
    /* JADX WARN: Code duplicated, block: B:152:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:154:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x05be  */
    /* JADX WARN: Code duplicated, block: B:158:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:161:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:162:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:165:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:167:0x0602  */
    /* JADX WARN: Code duplicated, block: B:169:0x0611  */
    /* JADX WARN: Code duplicated, block: B:170:0x0625  */
    /* JADX WARN: Code duplicated, block: B:172:0x0630  */
    /* JADX WARN: Code duplicated, block: B:173:0x0632  */
    /* JADX WARN: Code duplicated, block: B:177:0x063c  */
    /* JADX WARN: Code duplicated, block: B:182:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:184:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:187:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:189:0x0722  */
    /* JADX WARN: Code duplicated, block: B:191:0x072a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0748  */
    /* JADX WARN: Code duplicated, block: B:202:0x076c  */
    /* JADX WARN: Code duplicated, block: B:204:0x0774  */
    /* JADX WARN: Code duplicated, block: B:206:0x0780  */
    /* JADX WARN: Code duplicated, block: B:207:0x0782  */
    /* JADX WARN: Code duplicated, block: B:213:0x0795  */
    /* JADX WARN: Code duplicated, block: B:216:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:217:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:222:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:225:0x0804  */
    /* JADX WARN: Code duplicated, block: B:233:0x07e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0173  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Code duplicated, block: B:71:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0214  */
    /* JADX WARN: Code duplicated, block: B:93:0x021e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0231  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v11, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v13, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v6, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v8, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r54v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v29 */
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
    /* JADX INFO: renamed from: i */
    public static final void m110618i(Modifier modifier, C31447f c31447f, final Function1 onEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        ?? r10;
        Object obj;
        InterfaceC28601c1 interfaceC28601c1;
        C0209i c0209i;
        float f13;
        float f14;
        float f15;
        Modifier modifier4;
        float f16;
        float f17;
        int iHashCode;
        final InterfaceC31449h interfaceC31449hM96839g;
        C23454a0 c23454a0;
        C23454a0 c23454a1;
        float f18;
        boolean z4;
        C23454a0 c23454a2;
        boolean z13;
        boolean z14;
        Object obj2;
        float f19;
        int iHashCode2;
        float f24;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        float f25;
        C0213j c0213j;
        C0209i c0209i5;
        C22957g c22957g;
        float f26;
        final ?? r14;
        C2314t c2314t;
        int i16;
        C28655q c28655q;
        ?? r15;
        final InterfaceC31449h interfaceC31449hM96834b;
        float f27;
        C28676v0 c28676v0;
        int i17;
        TextResource textResourceM96857f;
        ?? r16;
        int i18;
        Object obj3;
        C2314t c2314t2;
        float f28;
        int i19;
        boolean z15;
        C23454a0 c23454a3;
        ?? r17;
        ?? r18;
        int i24;
        ?? r19;
        int i25;
        Object objM87133R;
        C28676v0 c28676v1;
        Object obj4;
        ?? r110;
        Modifier modifier5;
        boolean z16;
        boolean z17;
        ?? r111;
        int iHashCode3;
        int i26;
        ?? r112;
        int i27;
        C25306o c25306o;
        boolean z18;
        boolean zM87157i;
        int i28;
        Object obj5;
        ?? r113;
        C2305k c2305k;
        int iHashCode4;
        EnumC16313m0 enumC16313m0M96837e;
        C0209i c0209i6;
        boolean z19;
        C23454a0 c23454a4;
        boolean z24;
        boolean z25;
        C28655q c28655q2;
        String strM96841i;
        boolean z26;
        C28655q c28655q3;
        int iHashCode5;
        int i29;
        C38072d c38072d;
        int i34;
        int i35;
        C28655q c28655q4;
        TextResource textResourceM96840h;
        C28655q c28655q5;
        ?? r114;
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q6 = (C28655q) composer;
        c28655q6.m87154g0(-618525035);
        int i36 = i14 & 1;
        if (i36 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q6.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q6.m87157i(c31447f) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q6.m87157i(onEvent) ? 256 : 128;
        }
        int i37 = i15;
        if (c28655q6.m87135U(i37 & 1, (i37 & 147) != 146)) {
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifier6 = i36 != 0 ? c2314t3 : modifier2;
            Object objM87133R2 = c28655q6.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            Object obj6 = objM87133R2;
            if (objM87133R2 == c28676v2) {
                C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(C2299e.f9102E);
                c28655q6.m87172p0(c28633k1M87272z);
                obj6 = c28633k1M87272z;
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) obj6;
            if (c31447f == null) {
                c28655q6.m87150e0(-1069244480);
                c28655q6.m87173q(false);
            } else {
                c28655q6.m87150e0(-1069244479);
                TextResource textResourceM96842j = c31447f.getTitle();
                InterfaceC31449h interfaceC31449hM96834b2 = c31447f.getEndButton();
                boolean zM87157i2 = c28655q6.m87157i(c31447f);
                Object objM87133R3 = c28655q6.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v2) {
                    obj = objM87133R3;
                    a aVar = new a(c31447f, interfaceC28601c2, null);
                    c28655q6.m87172p0(aVar);
                    obj = aVar;
                }
                TextResource.Companion companion = TextResource.INSTANCE;
                AbstractC28683x.m87254h(textResourceM96842j, interfaceC31449hM96834b2, (InterfaceC4351m) obj, c28655q6);
                c28655q6.m87173q(false);
            }
            float f29 = 4;
            float f34 = 7 * f29;
            if (c31447f == null) {
                c28655q6.m87150e0(-1068680094);
                c28655q6.m87173q(false);
                modifier5 = modifier6;
                onEvent = onEvent;
                r114 = c28655q6;
            } else {
                c28655q6.m87150e0(-1068680093);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier6);
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g2, C2299e.f9110M, c28655q6, 0);
                int iHashCode6 = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q6.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q6, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j2);
                } else {
                    c28655q6.m87178s0();
                }
                C0209i c0209i7 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q6, c0209i7, c23010xM66775a);
                C0209i c0209i8 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q6, c0209i8, interfaceC28653p1M87165m);
                C0209i c0209i9 = C0217k.f732j;
                if (c28655q6.f115903S) {
                    interfaceC28601c1 = interfaceC28601c2;
                } else {
                    interfaceC28601c1 = interfaceC28601c2;
                    if (!AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode6))) {
                    }
                    c0209i = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q6, c0209i, modifierM118962N);
                    f13 = 2;
                    f14 = 8;
                    f15 = f13 * f14;
                    modifier4 = modifier6;
                    f16 = 1;
                    f17 = f16 * f14;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t3), f15, f17);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q6, 48);
                    iHashCode = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q6.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q6, modifierM3395q);
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j2);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i7, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q6, c0209i8, interfaceC28653p1M87165m2);
                    if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i9);
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i, modifierM118962N2);
                    interfaceC31449hM96839g = c31447f.getStartButton();
                    c23454a0 = C23454a0.f92919a;
                    if (interfaceC31449hM96839g == null) {
                        c28655q6.m87150e0(-1645286255);
                        c28655q6.m87173q(false);
                        c23454a1 = c23454a0;
                        i37 = i37;
                        c23454a2 = null;
                        z4 = false;
                        f18 = f34;
                    } else {
                        c28655q6.m87150e0(-1645286254);
                        if (interfaceC31449hM96839g instanceof C31450i) {
                            c28655q6.m87150e0(1578789369);
                            C31450i c31450i = (C31450i) interfaceC31449hM96839g;
                            boolean zM87157i3 = c28655q6.m87157i(interfaceC31449hM96839g);
                            c23454a1 = c23454a0;
                            if ((i37 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = z13 | zM87157i3;
                            Object objM87133R4 = c28655q6.m87133R();
                            if (!z14 || objM87133R4 == c28676v2) {
                                z4 = false;
                                final boolean z27 = false ? 1 : 0;
                                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: ui0.o
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (z27) {
                                            case 0:
                                                return AbstractC35014p.m110621l(interfaceC31449hM96839g, onEvent);
                                            case 1:
                                                return AbstractC35014p.m110624o(interfaceC31449hM96839g, onEvent);
                                            default:
                                                return AbstractC35014p.m110625p(interfaceC31449hM96839g, onEvent);
                                        }
                                    }
                                };
                                c28655q6.m87172p0(interfaceC4339a);
                                obj2 = interfaceC4339a;
                            } else {
                                z4 = false;
                                obj2 = objM87133R4;
                            }
                            f18 = f34;
                            m110628s(c31450i, f18, (InterfaceC4339a) obj2, c28655q6, 48);
                            c28655q6.m87173q(z4);
                            c23454a2 = c23454a1;
                        } else {
                            c23454a1 = c23454a0;
                            f18 = f34;
                            z4 = false;
                            c28655q6.m87150e0(1698080261);
                            c28655q6.m87173q(false);
                            c23454a2 = null;
                        }
                        c28655q6.m87173q(z4);
                    }
                    if (c23454a2 == null) {
                        AbstractC31061c.m95623C(c28655q6, -1992723494, c2314t3, f18, c28655q6);
                    } else {
                        c28655q6.m87150e0(-1992737351);
                    }
                    c28655q6.m87173q(z4);
                    f19 = f14 * f29;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3413j = AbstractC1102d.m3413j(AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f15, 0.0f, 2), f19, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(m110619j(interfaceC28601c1), false);
                    iHashCode2 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q6.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q6, modifierM3413j);
                    c28655q6.m87158i0();
                    f24 = f18;
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j2);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i7, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q6, c0209i8, interfaceC28653p1M87165m3);
                    if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i9);
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i, modifierM118962N3);
                    if (c31447f.getDisplayRefreshingAnimation()) {
                        f19 = f19;
                        c0209i2 = c0209i;
                        c0209i3 = c0209i7;
                        c0209i4 = c0209i9;
                        f25 = f15;
                        c0213j = c0213j2;
                        c0209i5 = c0209i8;
                        c22957g = c22957g2;
                        f24 = f24;
                        i37 = i37;
                        f26 = f29;
                        r14 = 1;
                        c2314t = c2314t3;
                        i16 = 7;
                        c28655q6.m87150e0(1598534759);
                        c28655q6.m87173q(false);
                        c28655q = c28655q6;
                    } else {
                        c28655q6.m87150e0(1595719990);
                        c2305k = C2299e.f9111N;
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q6, 48);
                        c2314t = c2314t3;
                        iHashCode4 = Long.hashCode(c28655q6.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q6.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q6, c2314t);
                        c28655q6.m87158i0();
                        if (c28655q6.f115903S) {
                            c28655q6.m87163l(c0213j2);
                        } else {
                            c28655q6.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q6, c0209i7, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q6, c0209i8, interfaceC28653p1M87165m4);
                        if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q6, iHashCode4, c0209i9);
                        }
                        AbstractC28683x.m87239G(c28655q6, c0209i, modifierM118962N4);
                        enumC16313m0M96837e = c31447f.getIcon();
                        if (enumC16313m0M96837e == null) {
                            c28655q6.m87150e0(1023615666);
                            z19 = false;
                            c28655q6.m87173q(false);
                            c0209i6 = c0209i7;
                            c0209i4 = c0209i9;
                            f25 = f15;
                            c0213j = c0213j2;
                            c23454a4 = null;
                        } else {
                            C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q6, 1023615667, enumC16313m0M96837e, c28655q6, 6);
                            long jM125430y = C38072d.f163053a.m121949b(c28655q6, C38072d.f163054b).getBrandWhite();
                            Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1102d.m3411h(f13 * f29, c2314t));
                            c0209i6 = c0209i7;
                            f25 = f15;
                            c0209i4 = c0209i9;
                            c0213j = c0213j2;
                            z19 = false;
                            AbstractC15005f3.m43108b(c27430eM53378s, "", modifierM38560g, jM125430y, c28655q6, 48, 0);
                            c28655q6.m87173q(false);
                            c23454a4 = c23454a1;
                        }
                        if (c23454a4 == null) {
                            c28655q6.m87150e0(1024184424);
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q6, 48);
                            iHashCode5 = Long.hashCode(c28655q6.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q6.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q6, c2314t);
                            c28655q6.m87158i0();
                            if (c28655q6.f115903S) {
                                c28655q6.m87163l(c0213j);
                            } else {
                                c28655q6.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q6, c0209i6, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q6, c0209i8, interfaceC28653p1M87165m5);
                            if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode5))) {
                                AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i4);
                            }
                            AbstractC28683x.m87239G(c28655q6, c0209i, modifierM118962N5);
                            TextResource textResourceM96842j2 = c31447f.getTitle();
                            i29 = TextResource.$stable;
                            String strM21274h = AbstractC8693b.m21274h(textResourceM96842j2, c28655q6, i29);
                            c38072d = C38072d.f163053a;
                            i34 = C38072d.f163054b;
                            long jM125430y2 = c38072d.m121949b(c28655q6, i34).getBrandWhite();
                            C2886a c2886aM8437r = c38072d.m121952e(c28655q6, i34).getH4();
                            C36775k c36775k = new C36775k(3);
                            i35 = C2886a.f11498d << 18;
                            c22957g = c22957g2;
                            c0209i3 = c0209i6;
                            c0209i2 = c0209i;
                            c0209i5 = c0209i8;
                            i16 = 7;
                            AbstractC30795n.m94707h(strM21274h, null, jM125430y2, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q6, 0, i35, 196090);
                            c28655q4 = c28655q6;
                            textResourceM96840h = c31447f.getSubtitle();
                            if (textResourceM96840h == null) {
                                c28655q4.m87150e0(1252502408);
                                z24 = false;
                                c28655q4.m87173q(false);
                                c28655q5 = c28655q4;
                            } else {
                                c28655q4.m87150e0(1252502409);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM96840h, c28655q4, i29), null, c38072d.m121949b(c28655q4, i34).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q4, i34).getH5(), null, c28655q4, 0, i35 | 3120, 185850);
                                C28655q c28655q7 = c28655q4;
                                z24 = false;
                                c28655q7.m87173q(false);
                                c28655q5 = c28655q7;
                            }
                            z25 = true;
                            c28655q5.m87173q(true);
                            c28655q5.m87173q(z24);
                            c28655q2 = c28655q5;
                        } else {
                            z24 = z19;
                            c0209i5 = c0209i8;
                            c22957g = c22957g2;
                            c0209i3 = c0209i6;
                            c0209i2 = c0209i;
                            z25 = true;
                            i16 = 7;
                            c28655q6.m87150e0(-1213905638);
                            c28655q6.m87173q(z24);
                            c28655q2 = c28655q6;
                        }
                        strM96841i = c31447f.getTag();
                        if (strM96841i == null) {
                            c28655q2.m87150e0(1025477867);
                            c28655q2.m87173q(z24);
                            z26 = z24;
                            f26 = f29;
                            c28655q3 = c28655q2;
                        } else {
                            AbstractC33745d.m106667z(c28655q2, 1025477868, c2314t, f17, c28655q2);
                            C38072d c38072d2 = C38072d.f163053a;
                            int i38 = C38072d.f163054b;
                            long jM125430y3 = c38072d2.m121949b(c28655q2, i38).getBrandWhite();
                            C2886a c2886aM8439t = c38072d2.m121952e(c28655q2, i38).getH6();
                            long jM125372X0 = c38072d2.m121949b(c28655q2, i38).getWhite20();
                            f26 = f29;
                            C28655q c28655q8 = c28655q2;
                            AbstractC30795n.m94707h(strM96841i, AbstractC1099a.m3395q(AbstractC11895b.m31987f(f16, f26, c2314t, jM125372X0), ((float) 1.5d) * r24, ((float) 0.25d) * f14), jM125430y3, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8439t, null, c28655q8, 0, C2886a.f11498d << 18, 196088);
                            C28655q c28655q9 = c28655q8;
                            z26 = false;
                            c28655q9.m87173q(false);
                            c28655q3 = c28655q9;
                        }
                        c28655q3.m87173q(z25);
                        c28655q3.m87173q(z26);
                        r14 = z25;
                        c28655q = c28655q3;
                    }
                    C28655q c28655q10 = c28655q;
                    AbstractC1090b.m3351f(c31447f.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", AbstractC37817c.m121344e(971565875, c28655q, new C13698g(f19, i16)), c28655q10, 224640, 2);
                    r15 = c28655q10;
                    r15.m87173q(r14);
                    interfaceC31449hM96834b = c31447f.getEndButton();
                    if (interfaceC31449hM96834b == null) {
                        r15.m87150e0(-1640818938);
                        r15.m87173q(false);
                        f26 = f26;
                        z15 = false;
                        c2314t2 = c2314t;
                        f28 = f24;
                        c28676v0 = c28676v2;
                        i17 = i37;
                        i19 = 256;
                        c23454a3 = null;
                    } else {
                        r15.m87150e0(-1640818937);
                        if (interfaceC31449hM96834b instanceof C31450i) {
                            r15.m87150e0(-1852407815);
                            C31450i c31450i2 = (C31450i) interfaceC31449hM96834b;
                            boolean zM87157i4 = r15.m87157i(interfaceC31449hM96834b);
                            i24 = i37;
                            if ((i24 & 896) == 256) {
                                r19 = r14;
                            } else {
                                r19 = 0;
                            }
                            i25 = (zM87157i4 ? 1 : 0) | r19;
                            objM87133R = r15.m87133R();
                            if (i25 == 0) {
                                c28676v1 = c28676v2;
                                if (objM87133R == c28676v1) {
                                    obj4 = objM87133R;
                                }
                                float f35 = f24;
                                m110628s(c31450i2, f35, (InterfaceC4339a) obj4, r15, 48);
                                r15.m87173q(false);
                                f26 = f26;
                                c28676v0 = c28676v1;
                                i19 = 256;
                                f28 = f35;
                                c23454a3 = c23454a1;
                                z15 = false;
                                c2314t2 = c2314t;
                                i17 = i24;
                                r18 = r15;
                            } else {
                                c28676v1 = c28676v2;
                            }
                            InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a() { // from class: ui0.o
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r14) {
                                        case 0:
                                            return AbstractC35014p.m110621l(interfaceC31449hM96834b, onEvent);
                                        case 1:
                                            return AbstractC35014p.m110624o(interfaceC31449hM96834b, onEvent);
                                        default:
                                            return AbstractC35014p.m110625p(interfaceC31449hM96834b, onEvent);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a2);
                            obj4 = interfaceC4339a2;
                            float f36 = f24;
                            m110628s(c31450i2, f36, (InterfaceC4339a) obj4, r15, 48);
                            r15.m87173q(false);
                            f26 = f26;
                            c28676v0 = c28676v1;
                            i19 = 256;
                            f28 = f36;
                            c23454a3 = c23454a1;
                            z15 = false;
                            c2314t2 = c2314t;
                            i17 = i24;
                            r18 = r15;
                        } else {
                            f27 = f24;
                            c28676v0 = c28676v2;
                            i17 = i37;
                            if (interfaceC31449hM96834b instanceof C31451j) {
                                throw AbstractC11895b.m32003v(-1852409302, r15, false);
                            }
                            r15.m87150e0(-1589734444);
                            textResourceM96857f = ((C31451j) interfaceC31449hM96834b).getText();
                            if (textResourceM96857f == null) {
                                r15.m87150e0(-1589734445);
                                r15.m87173q(false);
                                i19 = 256;
                                f28 = f27;
                                c23454a3 = null;
                                z15 = false;
                                c2314t2 = c2314t;
                                r17 = r15;
                            } else {
                                r15.m87150e0(-1589734444);
                                boolean zM87157i5 = r15.m87157i(interfaceC31449hM96834b);
                                if ((i17 & 896) == 256) {
                                    r16 = r14;
                                } else {
                                    r16 = 0;
                                }
                                i18 = (zM87157i5 ? 1 : 0) | r16;
                                Object objM87133R5 = r15.m87133R();
                                obj3 = objM87133R5;
                                if (i18 == 0 || objM87133R5 == c28676v0) {
                                    final int i39 = 2;
                                    InterfaceC4339a interfaceC4339a3 = new InterfaceC4339a() { // from class: ui0.o
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i39) {
                                                case 0:
                                                    return AbstractC35014p.m110621l(interfaceC31449hM96834b, onEvent);
                                                case 1:
                                                    return AbstractC35014p.m110624o(interfaceC31449hM96834b, onEvent);
                                                default:
                                                    return AbstractC35014p.m110625p(interfaceC31449hM96834b, onEvent);
                                            }
                                        }
                                    };
                                    r15.m87172p0(interfaceC4339a3);
                                    obj3 = interfaceC4339a3;
                                }
                                C2314t c2314t4 = c2314t;
                                Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t4, false, null, null, (InterfaceC4339a) obj3, 15);
                                c2314t2 = c2314t4;
                                String strM21274h2 = AbstractC8693b.m21274h(textResourceM96857f, r15, TextResource.$stable);
                                ?? r24 = C38072d.f163053a;
                                int i44 = C38072d.f163054b;
                                f28 = f27;
                                i19 = 256;
                                AbstractC30795n.m94707h(strM21274h2, modifierM3362g, r24.m121949b(r15, i44).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, r24.m121952e(r15, i44).getFormLabel(), null, r15, 0, (C2886a.f11498d << 18) | 3120, 186360);
                                ?? r115 = r15;
                                z15 = false;
                                r115.m87173q(false);
                                c23454a3 = c23454a1;
                                r17 = r115;
                            }
                            r17.m87173q(z15);
                            r18 = r17;
                        }
                        r18.m87173q(z15);
                        r110 = r18;
                    }
                    if (c23454a3 == null) {
                        r110 = r15;
                        r110.m87150e0(-1992558214);
                        modifier5 = modifier4;
                        AbstractC22953f.m66715b(r110, AbstractC1102d.m3419p(f28, modifier5));
                    } else {
                        r110 = r15;
                        modifier5 = modifier4;
                        r110.m87150e0(-1992593182);
                    }
                    r110.m87173q(z15);
                    r110.m87173q(true);
                    if (c31447f.m96836d().isEmpty()) {
                        z16 = true;
                        z17 = false;
                        r110.m87150e0(1886098897);
                        r110.m87173q(false);
                        r111 = r110;
                    } else {
                        r110.m87150e0(1885218621);
                        Modifier modifierM3394p = AbstractC1099a.m3394p(f25, AbstractC1102d.m3409f(1.0f, c2314t2));
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, m110632w(c31447f.getFixedHeaderAlignment()), r110, 0);
                        iHashCode3 = Long.hashCode(r110.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = r110.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(r110, modifierM3394p);
                        r110.m87158i0();
                        if (r110.f115903S) {
                            r110.m87163l(c0213j);
                        } else {
                            r110.m87178s0();
                        }
                        AbstractC28683x.m87239G(r110, c0209i3, c23010xM66775a4);
                        AbstractC28683x.m87239G(r110, c0209i5, interfaceC28653p1M87165m6);
                        if (r110.f115903S || !AbstractC22676k.m65745e(r110.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, r110, iHashCode3, c0209i4);
                        }
                        AbstractC28683x.m87239G(r110, c0209i2, modifierM118962N6);
                        r110.m87150e0(1881046951);
                        i26 = 0;
                        r112 = r110;
                        for (Object obj7 : c31447f.m96836d()) {
                            i27 = i26 + 1;
                            if (i26 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            c25306o = (C25306o) obj7;
                            C25307p c25307pM74328b = C25311t.f99303a.m74328b();
                            if ((i17 & 896) == i19) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87157i = r112.m87157i(c25306o) | z18;
                            Object objM87133R6 = r112.m87133R();
                            if (!zM87157i || objM87133R6 == c28676v0) {
                                i28 = 6;
                                C0559j c0559j = new C0559j(onEvent, c25306o, i28);
                                r112.m87172p0(c0559j);
                                obj5 = c0559j;
                            } else {
                                i28 = 6;
                                obj5 = objM87133R6;
                            }
                            ?? r54 = r112;
                            AbstractC25303l.m74290q(c25306o, c25307pM74328b, null, (Function1) obj5, r54, C25306o.f99297c | (C25307p.f99300b << 3), 4);
                            r113 = r54;
                            if (i26 < AbstractC37056f.m118951C(c31447f.m96836d())) {
                                r113.m87150e0(-1078028966);
                                AbstractC22953f.m66715b(r113, AbstractC1102d.m3411h(f26 * f26, c2314t2));
                                r113.m87173q(false);
                            } else {
                                r113.m87150e0(-1077932866);
                                r113.m87173q(false);
                            }
                            i26 = i27;
                            r112 = r113;
                        }
                        z16 = true;
                        z17 = false;
                        AbstractC25012a.m73392y(r112, false, true, false);
                        r111 = r112;
                    }
                    r111.m87173q(z16);
                    r111.m87173q(z17);
                    r114 = r111;
                }
                AbstractC11266d.m30471y(iHashCode6, c28655q6, iHashCode6, c0209i9);
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q6, c0209i, modifierM118962N);
                f13 = 2;
                f14 = 8;
                f15 = f13 * f14;
                modifier4 = modifier6;
                f16 = 1;
                f17 = f16 * f14;
                Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t3), f15, f17);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q6, 48);
                iHashCode = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q6.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q6, modifierM3395q2);
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j2);
                } else {
                    c28655q6.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q6, c0209i7, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q6, c0209i8, interfaceC28653p1M87165m7);
                if (c28655q6.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i9);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i9);
                }
                AbstractC28683x.m87239G(c28655q6, c0209i, modifierM118962N7);
                interfaceC31449hM96839g = c31447f.getStartButton();
                c23454a0 = C23454a0.f92919a;
                if (interfaceC31449hM96839g == null) {
                    c28655q6.m87150e0(-1645286255);
                    c28655q6.m87173q(false);
                    c23454a1 = c23454a0;
                    i37 = i37;
                    c23454a2 = null;
                    z4 = false;
                    f18 = f34;
                } else {
                    c28655q6.m87150e0(-1645286254);
                    if (interfaceC31449hM96839g instanceof C31450i) {
                        c28655q6.m87150e0(1578789369);
                        C31450i c31450i3 = (C31450i) interfaceC31449hM96839g;
                        boolean zM87157i6 = c28655q6.m87157i(interfaceC31449hM96839g);
                        c23454a1 = c23454a0;
                        if ((i37 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | zM87157i6;
                        Object objM87133R7 = c28655q6.m87133R();
                        if (z14) {
                            z4 = false;
                            final int z28 = false ? 1 : 0;
                            InterfaceC4339a interfaceC4339a4 = new InterfaceC4339a() { // from class: ui0.o
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (z28) {
                                        case 0:
                                            return AbstractC35014p.m110621l(interfaceC31449hM96839g, onEvent);
                                        case 1:
                                            return AbstractC35014p.m110624o(interfaceC31449hM96839g, onEvent);
                                        default:
                                            return AbstractC35014p.m110625p(interfaceC31449hM96839g, onEvent);
                                    }
                                }
                            };
                            c28655q6.m87172p0(interfaceC4339a4);
                            obj2 = interfaceC4339a4;
                        } else {
                            z4 = false;
                            final int z29 = false ? 1 : 0;
                            InterfaceC4339a interfaceC4339a5 = new InterfaceC4339a() { // from class: ui0.o
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (z29) {
                                        case 0:
                                            return AbstractC35014p.m110621l(interfaceC31449hM96839g, onEvent);
                                        case 1:
                                            return AbstractC35014p.m110624o(interfaceC31449hM96839g, onEvent);
                                        default:
                                            return AbstractC35014p.m110625p(interfaceC31449hM96839g, onEvent);
                                    }
                                }
                            };
                            c28655q6.m87172p0(interfaceC4339a5);
                            obj2 = interfaceC4339a5;
                        }
                        f18 = f34;
                        m110628s(c31450i3, f18, (InterfaceC4339a) obj2, c28655q6, 48);
                        c28655q6.m87173q(z4);
                        c23454a2 = c23454a1;
                    } else {
                        c23454a1 = c23454a0;
                        f18 = f34;
                        z4 = false;
                        c28655q6.m87150e0(1698080261);
                        c28655q6.m87173q(false);
                        c23454a2 = null;
                    }
                    c28655q6.m87173q(z4);
                }
                if (c23454a2 == null) {
                    AbstractC31061c.m95623C(c28655q6, -1992723494, c2314t3, f18, c28655q6);
                } else {
                    c28655q6.m87150e0(-1992737351);
                }
                c28655q6.m87173q(z4);
                f19 = f14 * f29;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3413j2 = AbstractC1102d.m3413j(AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f15, 0.0f, 2), f19, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(m110619j(interfaceC28601c1), false);
                iHashCode2 = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q6.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q6, modifierM3413j2);
                c28655q6.m87158i0();
                f24 = f18;
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j2);
                } else {
                    c28655q6.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q6, c0209i7, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q6, c0209i8, interfaceC28653p1M87165m8);
                if (c28655q6.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i9);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i9);
                }
                AbstractC28683x.m87239G(c28655q6, c0209i, modifierM118962N8);
                if (c31447f.getDisplayRefreshingAnimation()) {
                    c28655q6.m87150e0(1595719990);
                    c2305k = C2299e.f9111N;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q6, 48);
                    c2314t = c2314t3;
                    iHashCode4 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q6.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q6, c2314t);
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j2);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i7, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q6, c0209i8, interfaceC28653p1M87165m9);
                    if (c28655q6.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q6, iHashCode4, c0209i9);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q6, iHashCode4, c0209i9);
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i, modifierM118962N9);
                    enumC16313m0M96837e = c31447f.getIcon();
                    if (enumC16313m0M96837e == null) {
                        c28655q6.m87150e0(1023615666);
                        z19 = false;
                        c28655q6.m87173q(false);
                        c0209i6 = c0209i7;
                        c0209i4 = c0209i9;
                        f25 = f15;
                        c0213j = c0213j2;
                        c23454a4 = null;
                    } else {
                        C27430e c27430eM53378s2 = AbstractC18489d0.m53378s(c28655q6, 1023615667, enumC16313m0M96837e, c28655q6, 6);
                        long jM125430y4 = C38072d.f163053a.m121949b(c28655q6, C38072d.f163054b).getBrandWhite();
                        Modifier modifierM38560g2 = AbstractC13673n.m38560g(c2305k, AbstractC1102d.m3411h(f13 * f29, c2314t));
                        c0209i6 = c0209i7;
                        f25 = f15;
                        c0209i4 = c0209i9;
                        c0213j = c0213j2;
                        z19 = false;
                        AbstractC15005f3.m43108b(c27430eM53378s2, "", modifierM38560g2, jM125430y4, c28655q6, 48, 0);
                        c28655q6.m87173q(false);
                        c23454a4 = c23454a1;
                    }
                    if (c23454a4 == null) {
                        c28655q6.m87150e0(1024184424);
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q6, 48);
                        iHashCode5 = Long.hashCode(c28655q6.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q6.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q6, c2314t);
                        c28655q6.m87158i0();
                        if (c28655q6.f115903S) {
                            c28655q6.m87163l(c0213j);
                        } else {
                            c28655q6.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q6, c0209i6, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q6, c0209i8, interfaceC28653p1M87165m10);
                        if (c28655q6.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q6, c0209i, modifierM118962N10);
                        TextResource textResourceM96842j3 = c31447f.getTitle();
                        i29 = TextResource.$stable;
                        String strM21274h3 = AbstractC8693b.m21274h(textResourceM96842j3, c28655q6, i29);
                        c38072d = C38072d.f163053a;
                        i34 = C38072d.f163054b;
                        long jM125430y5 = c38072d.m121949b(c28655q6, i34).getBrandWhite();
                        C2886a c2886aM8437r2 = c38072d.m121952e(c28655q6, i34).getH4();
                        C36775k c36775k2 = new C36775k(3);
                        i35 = C2886a.f11498d << 18;
                        c22957g = c22957g2;
                        c0209i3 = c0209i6;
                        c0209i2 = c0209i;
                        c0209i5 = c0209i8;
                        i16 = 7;
                        AbstractC30795n.m94707h(strM21274h3, null, jM125430y5, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q6, 0, i35, 196090);
                        c28655q4 = c28655q6;
                        textResourceM96840h = c31447f.getSubtitle();
                        if (textResourceM96840h == null) {
                            c28655q4.m87150e0(1252502408);
                            z24 = false;
                            c28655q4.m87173q(false);
                            c28655q5 = c28655q4;
                        } else {
                            c28655q4.m87150e0(1252502409);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM96840h, c28655q4, i29), null, c38072d.m121949b(c28655q4, i34).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q4, i34).getH5(), null, c28655q4, 0, i35 | 3120, 185850);
                            C28655q c28655q11 = c28655q4;
                            z24 = false;
                            c28655q11.m87173q(false);
                            c28655q5 = c28655q11;
                        }
                        z25 = true;
                        c28655q5.m87173q(true);
                        c28655q5.m87173q(z24);
                        c28655q2 = c28655q5;
                    } else {
                        z24 = z19;
                        c0209i5 = c0209i8;
                        c22957g = c22957g2;
                        c0209i3 = c0209i6;
                        c0209i2 = c0209i;
                        z25 = true;
                        i16 = 7;
                        c28655q6.m87150e0(-1213905638);
                        c28655q6.m87173q(z24);
                        c28655q2 = c28655q6;
                    }
                    strM96841i = c31447f.getTag();
                    if (strM96841i == null) {
                        c28655q2.m87150e0(1025477867);
                        c28655q2.m87173q(z24);
                        z26 = z24;
                        f26 = f29;
                        c28655q3 = c28655q2;
                    } else {
                        AbstractC33745d.m106667z(c28655q2, 1025477868, c2314t, f17, c28655q2);
                        C38072d c38072d3 = C38072d.f163053a;
                        int i310 = C38072d.f163054b;
                        long jM125430y6 = c38072d3.m121949b(c28655q2, i310).getBrandWhite();
                        C2886a c2886aM8439t2 = c38072d3.m121952e(c28655q2, i310).getH6();
                        long jM125372X1 = c38072d3.m121949b(c28655q2, i310).getWhite20();
                        f26 = f29;
                        C28655q c28655q12 = c28655q2;
                        AbstractC30795n.m94707h(strM96841i, AbstractC1099a.m3395q(AbstractC11895b.m31987f(f16, f26, c2314t, jM125372X1), ((float) 1.5d) * r24, ((float) 0.25d) * f14), jM125430y6, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8439t2, null, c28655q12, 0, C2886a.f11498d << 18, 196088);
                        C28655q c28655q13 = c28655q12;
                        z26 = false;
                        c28655q13.m87173q(false);
                        c28655q3 = c28655q13;
                    }
                    c28655q3.m87173q(z25);
                    c28655q3.m87173q(z26);
                    r14 = z25;
                    c28655q = c28655q3;
                } else {
                    f19 = f19;
                    c0209i2 = c0209i;
                    c0209i3 = c0209i7;
                    c0209i4 = c0209i9;
                    f25 = f15;
                    c0213j = c0213j2;
                    c0209i5 = c0209i8;
                    c22957g = c22957g2;
                    f24 = f24;
                    i37 = i37;
                    f26 = f29;
                    r14 = 1;
                    c2314t = c2314t3;
                    i16 = 7;
                    c28655q6.m87150e0(1598534759);
                    c28655q6.m87173q(false);
                    c28655q = c28655q6;
                }
                C28655q c28655q14 = c28655q;
                AbstractC1090b.m3351f(c31447f.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", AbstractC37817c.m121344e(971565875, c28655q, new C13698g(f19, i16)), c28655q14, 224640, 2);
                r15 = c28655q14;
                r15.m87173q(r14);
                interfaceC31449hM96834b = c31447f.getEndButton();
                if (interfaceC31449hM96834b == null) {
                    r15.m87150e0(-1640818938);
                    r15.m87173q(false);
                    f26 = f26;
                    z15 = false;
                    c2314t2 = c2314t;
                    f28 = f24;
                    c28676v0 = c28676v2;
                    i17 = i37;
                    i19 = 256;
                    c23454a3 = null;
                } else {
                    r15.m87150e0(-1640818937);
                    if (interfaceC31449hM96834b instanceof C31450i) {
                        r15.m87150e0(-1852407815);
                        C31450i c31450i4 = (C31450i) interfaceC31449hM96834b;
                        boolean zM87157i7 = r15.m87157i(interfaceC31449hM96834b);
                        i24 = i37;
                        if ((i24 & 896) == 256) {
                            r19 = r14;
                        } else {
                            r19 = 0;
                        }
                        i25 = (zM87157i7 ? 1 : 0) | r19;
                        objM87133R = r15.m87133R();
                        if (i25 == 0) {
                            c28676v1 = c28676v2;
                            if (objM87133R == c28676v1) {
                                obj4 = objM87133R;
                            }
                            float f37 = f24;
                            m110628s(c31450i4, f37, (InterfaceC4339a) obj4, r15, 48);
                            r15.m87173q(false);
                            f26 = f26;
                            c28676v0 = c28676v1;
                            i19 = 256;
                            f28 = f37;
                            c23454a3 = c23454a1;
                            z15 = false;
                            c2314t2 = c2314t;
                            i17 = i24;
                            r18 = r15;
                        } else {
                            c28676v1 = c28676v2;
                        }
                        InterfaceC4339a interfaceC4339a6 = new InterfaceC4339a() { // from class: ui0.o
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (r14) {
                                    case 0:
                                        return AbstractC35014p.m110621l(interfaceC31449hM96834b, onEvent);
                                    case 1:
                                        return AbstractC35014p.m110624o(interfaceC31449hM96834b, onEvent);
                                    default:
                                        return AbstractC35014p.m110625p(interfaceC31449hM96834b, onEvent);
                                }
                            }
                        };
                        r15.m87172p0(interfaceC4339a6);
                        obj4 = interfaceC4339a6;
                        float f38 = f24;
                        m110628s(c31450i4, f38, (InterfaceC4339a) obj4, r15, 48);
                        r15.m87173q(false);
                        f26 = f26;
                        c28676v0 = c28676v1;
                        i19 = 256;
                        f28 = f38;
                        c23454a3 = c23454a1;
                        z15 = false;
                        c2314t2 = c2314t;
                        i17 = i24;
                        r18 = r15;
                    } else {
                        f27 = f24;
                        c28676v0 = c28676v2;
                        i17 = i37;
                        if (interfaceC31449hM96834b instanceof C31451j) {
                            throw AbstractC11895b.m32003v(-1852409302, r15, false);
                        }
                        r15.m87150e0(-1589734444);
                        textResourceM96857f = ((C31451j) interfaceC31449hM96834b).getText();
                        if (textResourceM96857f == null) {
                            r15.m87150e0(-1589734445);
                            r15.m87173q(false);
                            i19 = 256;
                            f28 = f27;
                            c23454a3 = null;
                            z15 = false;
                            c2314t2 = c2314t;
                            r17 = r15;
                        } else {
                            r15.m87150e0(-1589734444);
                            boolean zM87157i8 = r15.m87157i(interfaceC31449hM96834b);
                            if ((i17 & 896) == 256) {
                                r16 = r14;
                            } else {
                                r16 = 0;
                            }
                            i18 = (zM87157i8 ? 1 : 0) | r16;
                            Object objM87133R8 = r15.m87133R();
                            obj3 = objM87133R8;
                            if (i18 == 0) {
                                final int i311 = 2;
                                InterfaceC4339a interfaceC4339a7 = new InterfaceC4339a() { // from class: ui0.o
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i311) {
                                            case 0:
                                                return AbstractC35014p.m110621l(interfaceC31449hM96834b, onEvent);
                                            case 1:
                                                return AbstractC35014p.m110624o(interfaceC31449hM96834b, onEvent);
                                            default:
                                                return AbstractC35014p.m110625p(interfaceC31449hM96834b, onEvent);
                                        }
                                    }
                                };
                                r15.m87172p0(interfaceC4339a7);
                                obj3 = interfaceC4339a7;
                            } else {
                                final int i312 = 2;
                                InterfaceC4339a interfaceC4339a8 = new InterfaceC4339a() { // from class: ui0.o
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i312) {
                                            case 0:
                                                return AbstractC35014p.m110621l(interfaceC31449hM96834b, onEvent);
                                            case 1:
                                                return AbstractC35014p.m110624o(interfaceC31449hM96834b, onEvent);
                                            default:
                                                return AbstractC35014p.m110625p(interfaceC31449hM96834b, onEvent);
                                        }
                                    }
                                };
                                r15.m87172p0(interfaceC4339a8);
                                obj3 = interfaceC4339a8;
                            }
                            C2314t c2314t5 = c2314t;
                            Modifier modifierM3362g2 = AbstractC1092a.m3362g(c2314t5, false, null, null, (InterfaceC4339a) obj3, 15);
                            c2314t2 = c2314t5;
                            String strM21274h4 = AbstractC8693b.m21274h(textResourceM96857f, r15, TextResource.$stable);
                            ?? r25 = C38072d.f163053a;
                            int i45 = C38072d.f163054b;
                            f28 = f27;
                            i19 = 256;
                            AbstractC30795n.m94707h(strM21274h4, modifierM3362g2, r25.m121949b(r15, i45).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, r25.m121952e(r15, i45).getFormLabel(), null, r15, 0, (C2886a.f11498d << 18) | 3120, 186360);
                            ?? r116 = r15;
                            z15 = false;
                            r116.m87173q(false);
                            c23454a3 = c23454a1;
                            r17 = r116;
                        }
                        r17.m87173q(z15);
                        r18 = r17;
                    }
                    r18.m87173q(z15);
                    r110 = r18;
                }
                if (c23454a3 == null) {
                    r110 = r15;
                    r110.m87150e0(-1992558214);
                    modifier5 = modifier4;
                    AbstractC22953f.m66715b(r110, AbstractC1102d.m3419p(f28, modifier5));
                } else {
                    r110 = r15;
                    modifier5 = modifier4;
                    r110.m87150e0(-1992593182);
                }
                r110.m87173q(z15);
                r110.m87173q(true);
                if (c31447f.m96836d().isEmpty()) {
                    r110.m87150e0(1885218621);
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(f25, AbstractC1102d.m3409f(1.0f, c2314t2));
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g, m110632w(c31447f.getFixedHeaderAlignment()), r110, 0);
                    iHashCode3 = Long.hashCode(r110.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = r110.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(r110, modifierM3394p2);
                    r110.m87158i0();
                    if (r110.f115903S) {
                        r110.m87163l(c0213j);
                    } else {
                        r110.m87178s0();
                    }
                    AbstractC28683x.m87239G(r110, c0209i3, c23010xM66775a7);
                    AbstractC28683x.m87239G(r110, c0209i5, interfaceC28653p1M87165m11);
                    if (r110.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, r110, iHashCode3, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, r110, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(r110, c0209i2, modifierM118962N11);
                    r110.m87150e0(1881046951);
                    i26 = 0;
                    r112 = r110;
                    while (r1.hasNext()) {
                        i27 = i26 + 1;
                        if (i26 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        c25306o = (C25306o) obj7;
                        C25307p c25307pM74328b2 = C25311t.f99303a.m74328b();
                        if ((i17 & 896) == i19) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i = r112.m87157i(c25306o) | z18;
                        Object objM87133R9 = r112.m87133R();
                        if (zM87157i) {
                            i28 = 6;
                            C0559j c0559j2 = new C0559j(onEvent, c25306o, i28);
                            r112.m87172p0(c0559j2);
                            obj5 = c0559j2;
                        } else {
                            i28 = 6;
                            C0559j c0559j3 = new C0559j(onEvent, c25306o, i28);
                            r112.m87172p0(c0559j3);
                            obj5 = c0559j3;
                        }
                        ?? r55 = r112;
                        AbstractC25303l.m74290q(c25306o, c25307pM74328b2, null, (Function1) obj5, r55, C25306o.f99297c | (C25307p.f99300b << 3), 4);
                        r113 = r55;
                        if (i26 < AbstractC37056f.m118951C(c31447f.m96836d())) {
                            r113.m87150e0(-1078028966);
                            AbstractC22953f.m66715b(r113, AbstractC1102d.m3411h(f26 * f26, c2314t2));
                            r113.m87173q(false);
                        } else {
                            r113.m87150e0(-1077932866);
                            r113.m87173q(false);
                        }
                        i26 = i27;
                        r112 = r113;
                    }
                    z16 = true;
                    z17 = false;
                    AbstractC25012a.m73392y(r112, false, true, false);
                    r111 = r112;
                } else {
                    z16 = true;
                    z17 = false;
                    r110.m87150e0(1886098897);
                    r110.m87173q(false);
                    r111 = r110;
                }
                r111.m87173q(z16);
                r111.m87173q(z17);
                r114 = r111;
            }
            modifier3 = modifier5;
            r10 = r114;
        } else {
            onEvent = onEvent;
            c28655q6.m87138X();
            modifier3 = modifier2;
            r10 = c28655q6;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier3, c31447f, onEvent, i13, i14, 21);
        }
    }

    /* JADX INFO: renamed from: j */
    private static final InterfaceC2302h m110619j(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC2302h) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m110620k(InterfaceC28601c1 interfaceC28601c1, InterfaceC2302h interfaceC2302h) {
        interfaceC28601c1.setValue(interfaceC2302h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m110621l(InterfaceC31449h interfaceC31449h, Function1 function1) {
        AbstractC31448g.m96845c(interfaceC31449h, function1, null, 2, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m110622m(float f13, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        Modifier modifierM3419p = AbstractC1102d.m3419p(f13, C2314t.f9131w);
        InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C34656a(21);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC35684p.m113047h(modifierM3419p, dVarM113128a, false, 0.0f, 0, (InterfaceC4339a) objM87133R, null, null, null, c28655q, 196614, 476);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m110623n() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m110624o(InterfaceC31449h interfaceC31449h, Function1 function1) {
        AbstractC31448g.m96843a(interfaceC31449h, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m110625p(InterfaceC31449h interfaceC31449h, Function1 function1) {
        AbstractC31448g.m96843a(interfaceC31449h, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m110626q(Function1 function1, C25306o c25306o, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC31443b.j(it, c25306o.getState()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m110627r(Modifier modifier, C31447f c31447f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m110618i(modifier, c31447f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m110628s(C31450i c31450i, float f13, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C31450i c31450i2;
        int i14;
        C17919x c17919xM31989h;
        String strM21274h;
        boolean z4;
        C2314t c2314t;
        C23454a0 c23454a0;
        String strM21274h2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1406424423);
        if ((i13 & 6) == 0) {
            c31450i2 = c31450i;
            i14 = (c28655q.m87157i(c31450i2) ? 4 : 2) | i13;
        } else {
            c31450i2 = c31450i;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC22403o abstractC22403oM96856j = c31450i2.getIconUrl();
            C2314t c2314t2 = C2314t.f9131w;
            if (abstractC22403oM96856j == null && c31450i2.getIcon() == null) {
                AbstractC31061c.m95623C(c28655q, -1383854050, c2314t2, f13, c28655q);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1383766661);
                Modifier modifierM3419p = AbstractC1102d.m3419p(f13, c2314t2);
                GlowStyle glowStyleM96854h = c31450i2.getGlowStyle();
                EnumC39333f color = glowStyleM96854h != null ? glowStyleM96854h.getColor() : null;
                if (color == null) {
                    c28655q.m87150e0(-1383650443);
                    c28655q.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    c28655q.m87150e0(1340839436);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
                }
                Modifier modifierM5391i = AbstractC1772c1.m5391i(AbstractC15697y.m44173f(modifierM3419p, c17919xM31989h, f148168a + f13, 0.0f, c31450i2.getGlowPulse(), c28655q, 0, 4), c31450i2.getGlowStyle() == null, null, interfaceC4339a, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM5391i);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC22403o abstractC22403oM96856j2 = c31450i2.getIconUrl();
                if (abstractC22403oM96856j2 == null) {
                    c28655q.m87150e0(1033692504);
                    c28655q.m87173q(false);
                    z4 = false;
                    c23454a0 = null;
                    c2314t = c2314t2;
                } else {
                    c28655q.m87150e0(1033692505);
                    Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13, c2314t2), AbstractC33253j.f138651a);
                    TextResource textResourceM96852f = c31450i2.getContentDescription();
                    if (textResourceM96852f == null) {
                        c28655q.m87150e0(1090580210);
                        c28655q.m87173q(false);
                        strM21274h = null;
                    } else {
                        c28655q.m87150e0(1090580211);
                        strM21274h = AbstractC8693b.m21274h(textResourceM96852f, c28655q, TextResource.$stable);
                        c28655q.m87173q(false);
                    }
                    z4 = false;
                    c2314t = c2314t2;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM96856j2, null, null, c28655q, AbstractC22403o.f87638a, 3), strM21274h == null ? "" : strM21274h, modifierM118994r, null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q.m87150e0(1034114570);
                    EnumC16313m0 enumC16313m0M96855i = c31450i.getIcon();
                    if (enumC16313m0M96855i == null) {
                        c28655q.m87150e0(1034114569);
                        c28655q.m87173q(z4);
                    } else {
                        C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q, 1034114570, enumC16313m0M96855i, c28655q, 6);
                        TextResource textResourceM96852f2 = c31450i.getContentDescription();
                        if (textResourceM96852f2 == null) {
                            c28655q.m87150e0(-1881118714);
                            c28655q.m87173q(z4);
                            strM21274h2 = null;
                        } else {
                            c28655q.m87150e0(-1881118713);
                            strM21274h2 = AbstractC8693b.m21274h(textResourceM96852f2, c28655q, TextResource.$stable);
                            c28655q.m87173q(z4);
                        }
                        AbstractC15005f3.m43108b(c27430eM53378s, strM21274h2 == null ? "" : strM21274h2, AbstractC1102d.m3419p(f13, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 0, 0);
                        c28655q.m87173q(z4);
                    }
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(1695912787);
                    c28655q.m87173q(z4);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(z4);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C6078h(c31450i, f13, interfaceC4339a, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m110629t(C31450i c31450i, float f13, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m110628s(c31450i, f13, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m110631v(C31447f c31447f) {
        return (c31447f != null ? c31447f.getNavigationBarStyle() : null) == NavigationBarStyle.TRANSPARENT;
    }

    /* JADX INFO: renamed from: w */
    private static final InterfaceC2300f m110632w(FixedHeaderAlignment fixedHeaderAlignment) {
        int i13 = b.f148172a[fixedHeaderAlignment.ordinal()];
        if (i13 == 1) {
            return C2299e.f9110M;
        }
        if (i13 == 2) {
            return C2299e.f9111N;
        }
        if (i13 == 3) {
            return C2299e.f9112O;
        }
        throw new NoWhenBranchMatchedException();
    }
}

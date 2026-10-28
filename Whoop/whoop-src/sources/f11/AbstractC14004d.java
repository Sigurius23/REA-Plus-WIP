package f11;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2520f5;
import b30.C2619s2;
import b91.C2886a;
import c41.C4006d0;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e61.C12769l;
import ev2.C13693b;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.C11412w1;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17893k;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22965i;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: f11.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001b\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f²\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lf11/e;", "state", "", "isHidden", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lf11/e;ZLandroidx/compose/runtime/Composer;II)V", "", "index", "Lf11/h;", "tickMark", "", "maxTickHeight", "n", "(ILf11/h;Lf11/e;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "r", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Ly3/m;", "layoutDirection", "", "Ll83/k;", "Li2/x;", "u", "(Ly3/m;)[Ll83/k;", "baseHeight", "tickMarkWidth", "v", "(Lf11/h;FF)F", "Ly3/f;", "componentWidthDp", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14004d {

    /* JADX INFO: renamed from: f11.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f49968w;

        public a(List list) {
            this.f49968w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m39874a(int i13) {
            this.f49968w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m39874a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: f11.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f49969w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14005e f49970x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f49971y;

        public b(List list, C14005e c14005e, float f13) {
            this.f49969w = list;
            this.f49970x = c14005e;
            this.f49971y = f13;
        }

        /* JADX INFO: renamed from: a */
        public final void m39875a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C14008h c14008h = (C14008h) this.f49969w.get(i13);
            c28655q.m87150e0(-626028364);
            AbstractC14004d.m39865n(i13, c14008h, this.f49970x, this.f49971y, c28655q, ((i15 & 126) >> 3) & 14);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m39875a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0382  */
    /* JADX WARN: Code duplicated, block: B:104:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:105:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:107:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:108:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:112:0x0433  */
    /* JADX WARN: Code duplicated, block: B:113:0x043e  */
    /* JADX WARN: Code duplicated, block: B:117:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:118:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:120:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:122:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:127:0x050b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0578  */
    /* JADX WARN: Code duplicated, block: B:135:0x0584  */
    /* JADX WARN: Code duplicated, block: B:137:0x0590  */
    /* JADX WARN: Code duplicated, block: B:138:0x059b  */
    /* JADX WARN: Code duplicated, block: B:140:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:142:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:146:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:149:0x05f5 A[LOOP:1: B:147:0x05ef->B:149:0x05f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0612  */
    /* JADX WARN: Code duplicated, block: B:153:0x061a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0626  */
    /* JADX WARN: Code duplicated, block: B:157:0x062b  */
    /* JADX WARN: Code duplicated, block: B:160:0x063c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0641  */
    /* JADX WARN: Code duplicated, block: B:164:0x0644  */
    /* JADX WARN: Code duplicated, block: B:168:0x065d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0660  */
    /* JADX WARN: Code duplicated, block: B:172:0x067b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x067d  */
    /* JADX WARN: Code duplicated, block: B:176:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:241:0x094f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0953  */
    /* JADX WARN: Code duplicated, block: B:247:0x0974  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:250:0x099c  */
    /* JADX WARN: Code duplicated, block: B:252:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:255:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:257:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:259:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:260:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:263:0x0a42  */
    /* JADX WARN: Code duplicated, block: B:264:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:266:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:267:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:272:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:275:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:276:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:278:0x0b28  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:280:0x0b2e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0b3a  */
    /* JADX WARN: Code duplicated, block: B:285:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:287:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x0188  */
    /* JADX WARN: Code duplicated, block: B:69:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0263  */
    /* JADX WARN: Code duplicated, block: B:82:0x026e  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:86:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:88:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0332  */
    /* JADX WARN: Code duplicated, block: B:94:0x033d  */
    /* JADX WARN: Code duplicated, block: B:96:0x035c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0367  */
    /* JADX WARN: Code duplicated, block: B:99:0x0377  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v11, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v13, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v14, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v16, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v17, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v19, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v20, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v21, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v23, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v24, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v28, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v29, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v30, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v32, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v34, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v35, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v38, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v40, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v41, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v8, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r1v23, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r1v32, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r1v9, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r26v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r26v10, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r26v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r26v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r26v4, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r26v5, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r26v6, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r26v7, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r26v8, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v21, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r2v29, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r2v7, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v11, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v19, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v24, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v6, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v67, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r6v39, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r6v43, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r6v46, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r6v54, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v13, types: [y81.f] */
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
    /* JADX INFO: renamed from: h */
    public static final void m39859h(C14005e state, boolean z4, Composer composer, int i13, int i14) {
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r14;
        C28677v1 c28677v1M87180u;
        boolean z16;
        List<C14007g> listM39883i;
        C14007g c14007g;
        Object objM87133R;
        C28676v0 c28676v0;
        Object obj;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC39171c interfaceC39171c;
        C22957g c22957g;
        int iHashCode;
        C28676v0 c28676v1;
        C2314t c2314t;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z17;
        int iHashCode2;
        C14002b header;
        int iHashCode3;
        TextResource textResourceM39846f;
        C0209i c0209i5;
        C0213j c0213j2;
        InterfaceC28601c1 interfaceC28601c2;
        C0209i c0209i6;
        InterfaceC39171c interfaceC39171c2;
        int i15;
        C2314t c2314t2;
        C0209i c0209i7;
        C0209i c0209i8;
        ?? r10;
        ?? r15;
        TextResource textResourceM39847g;
        ?? r16;
        ?? r17;
        TextResource textResourceM39845e;
        float f13;
        ?? r18;
        TextResource textResourceM39842b;
        ?? r19;
        ?? M39841a;
        C17919x c17919xM31989h;
        long jM73370c;
        ?? r110;
        TextResource textResourceM39843c;
        float f14;
        boolean z18;
        ?? r111;
        TextResource textResourceM39844d;
        int i16;
        ?? r112;
        ?? r113;
        ?? r24;
        C14006f expectedAnnotation;
        int iHashCode4;
        boolean z19;
        ?? r114;
        ?? r115;
        Iterator it;
        float fM39873v;
        C17919x c17919x;
        Modifier modifierM3429z;
        Modifier modifierM39869r;
        boolean zM87153g;
        Object objM87133R2;
        C28676v0 c28676v2;
        InterfaceC28601c1 interfaceC28601c3;
        Object obj2;
        InterfaceC22965i interfaceC22965iM66746i;
        boolean zM87157i;
        Object obj3;
        List<C14007g> listM39883i2;
        ?? r116;
        C14001a footer;
        ?? r117;
        float f15;
        C2307m c2307m;
        C2305k c2305k;
        float f16;
        float fFloatValue;
        int iHashCode5;
        C0213j c0213j3;
        C0209i c0209i9;
        C2886a c2886aM8422c;
        ?? r118;
        TextResource textResourceM39896e;
        float f17;
        ?? r25;
        ?? M39897f;
        C17919x c17919xM31989h2;
        long jM73370c2;
        ?? r119;
        C17919x c17919xM31989h3;
        long jM73370c3;
        Iterator it3;
        Object next;
        C2305k c2305k2 = C2299e.f9110M;
        C2307m c2307m2 = C2299e.f9114w;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1894153888);
        int i17 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(state) ? 4 : 2) : i13;
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i17 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i17 & 1, z14)) {
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                listM39883i = state.m39883i();
                if (listM39883i != null) {
                    it3 = listM39883i.iterator();
                    do {
                        if (it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (((C14007g) next).getIsBelow());
                    c14007g = (C14007g) next;
                } else {
                    c14007g = null;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                obj = objM87133R;
                if (objM87133R == c28676v0) {
                    C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(new C39174f(0));
                    c28655q.m87172p0(c28633k1M87272z);
                    obj = c28633k1M87272z;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj;
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                c28676v1 = c28676v0;
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
                z17 = z16;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                header = state.getHeader();
                if (header == null) {
                    c28655q.m87150e0(-876378497);
                    c28655q.m87173q(false);
                    c28676v1 = c28676v1;
                    c2305k2 = c2305k2;
                    c0209i5 = c0209i3;
                    interfaceC28601c2 = interfaceC28601c1;
                    c0209i6 = c0209i4;
                    c2314t2 = c2314t;
                    c0213j2 = c0213j;
                    c0209i8 = c0209i;
                    c0209i7 = c0209i2;
                    r24 = 0;
                    interfaceC39171c2 = interfaceC39171c;
                    i15 = 4;
                    i16 = 6;
                    r113 = c28655q;
                } else {
                    c28655q.m87150e0(-876378496);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    textResourceM39846f = header.getSupertitle();
                    if (textResourceM39846f == null) {
                        c28655q.m87150e0(-1124873230);
                        c28655q.m87173q(false);
                        c0209i5 = c0209i3;
                        interfaceC28601c2 = interfaceC28601c1;
                        c0209i6 = c0209i4;
                        c2314t2 = c2314t;
                        c0213j2 = c0213j;
                        c0209i8 = c0209i;
                        c0209i7 = c0209i2;
                        r10 = 0;
                        interfaceC39171c2 = interfaceC39171c;
                        i15 = 4;
                        r15 = c28655q;
                    } else {
                        c28655q.m87150e0(-1124873229);
                        String strM21274h = AbstractC8693b.m21274h(textResourceM39846f, c28655q, 0);
                        C38072d c38072d = C38072d.f163053a;
                        C2886a c2886aM8438s = c38072d.m121952e(c28655q, 6).getH5();
                        long white50 = c38072d.m121949b(c28655q, 6).getWhite50();
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        interfaceC28601c2 = interfaceC28601c1;
                        c0209i6 = c0209i4;
                        interfaceC39171c2 = interfaceC39171c;
                        i15 = 4;
                        c2314t2 = c2314t;
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i;
                        AbstractC30795n.m94707h(strM21274h, null, white50, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q, 0, 0, 196602);
                        C28655q c28655q2 = c28655q;
                        r10 = 0;
                        AbstractC31061c.m95650z(2, 4, c2314t2, c28655q2, false);
                        r15 = c28655q2;
                    }
                    textResourceM39847g = header.getTitle();
                    if (textResourceM39847g == null) {
                        r15.m87150e0(-1124509073);
                        r15.m87173q(r10);
                        r17 = r10;
                        r16 = r15;
                    } else {
                        r15.m87150e0(-1124509072);
                        String strM21274h2 = AbstractC8693b.m21274h(textResourceM39847g, r15, r10);
                        ?? r26 = C38072d.f163053a;
                        C2886a c2886aM8418P = r26.m121952e(r15, 6).getT3();
                        long brandWhite = r26.m121949b(r15, 6).getBrandWhite();
                        ?? r27 = r15;
                        boolean z24 = r10 == true ? 1 : 0;
                        AbstractC30795n.m94707h(strM21274h2, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, r27, 0, 0, 196602);
                        ?? r120 = r27;
                        AbstractC31061c.m95650z(1, i15, c2314t2, r120, z24);
                        r17 = z24;
                        r16 = r120;
                    }
                    textResourceM39845e = header.getSubtitle();
                    if (textResourceM39845e == null) {
                        r16.m87150e0(-1124137786);
                        r16.m87173q(r17);
                        r18 = r16;
                    } else {
                        r16.m87150e0(-1124137785);
                        String strM21274h3 = AbstractC8693b.m21274h(textResourceM39845e, r16, r17 == true ? 1 : 0);
                        ?? r28 = C38072d.f163053a;
                        C2886a c2886aM8420a = r28.m121952e(r16, 6).getB1();
                        long brandWhite2 = r28.m121949b(r16, 6).getBrandWhite();
                        if (z17) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        ?? r29 = r16;
                        AbstractC30795n.m94707h(strM21274h3, null, C17919x.m51541c(f13, brandWhite2), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, r29, 0, 0, 196602);
                        ?? r121 = r29;
                        AbstractC31061c.m95650z(1, i15, c2314t2, r121, r17);
                        r18 = r121;
                    }
                    textResourceM39842b = header.getCurrentStatus();
                    if (textResourceM39842b == null) {
                        r18.m87150e0(-1123720991);
                        r18.m87173q(r17);
                        r110 = r18;
                    } else {
                        r18.m87150e0(-1123720990);
                        String strM21274h4 = AbstractC8693b.m21274h(textResourceM39842b, r18, r17 == true ? 1 : 0);
                        r19 = C38072d.f163053a;
                        C2886a c2886aM8438s2 = r19.m121952e(r18, 6).getH5();
                        M39841a = state.getHeader().getActiveColor();
                        if (M39841a == 0) {
                            r18.m87150e0(-318031312);
                            r18.m87173q(r17);
                            c17919xM31989h = null;
                        } else {
                            r18.m87150e0(-425901071);
                            c17919xM31989h = AbstractC11895b.m31989h(r18, r17, M39841a.mo134584toComposableColorWaAFU9c(r18, r17 == true ? 1 : 0));
                        }
                        if (c17919xM31989h == null) {
                            jM73370c = AbstractC25012a.m73370c(r18, -425899771, r19, r18, 6);
                            r18.m87173q(r17);
                        } else {
                            r18.m87150e0(-425901848);
                            r18.m87173q(r17);
                            jM73370c = c17919xM31989h.f69639a;
                        }
                        ?? r210 = r18;
                        AbstractC30795n.m94707h(strM21274h4, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s2, null, r210, 0, 0, 196602);
                        ?? r122 = r210;
                        AbstractC31061c.m95650z(1, i15, c2314t2, r122, r17);
                        r110 = r122;
                    }
                    textResourceM39843c = header.getDescription();
                    if (textResourceM39843c == null) {
                        r110.m87150e0(-1123301437);
                        r110.m87173q(r17);
                        z18 = true;
                        r111 = r110;
                    } else {
                        r110.m87150e0(-1123301436);
                        String strM21274h5 = AbstractC8693b.m21274h(textResourceM39843c, r110, r17 == true ? 1 : 0);
                        ?? r33 = C38072d.f163053a;
                        C2886a c2886aM8422c2 = r33.m121952e(r110, 6).getB3();
                        long brandWhite3 = r33.m121949b(r110, 6).getBrandWhite();
                        if (z17) {
                            f14 = 0.35f;
                        } else {
                            f14 = 0.7f;
                        }
                        ?? r211 = r110;
                        AbstractC30795n.m94707h(strM21274h5, null, C17919x.m51541c(f14, brandWhite3), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c2, null, r211, 0, 0, 196602);
                        ?? r123 = r211;
                        z18 = true;
                        AbstractC31061c.m95650z(1, i15, c2314t2, r123, r17);
                        r111 = r123;
                    }
                    r111.m87173q(z18);
                    textResourceM39844d = header.getRightAlignedDescription();
                    if (textResourceM39844d == null) {
                        r111.m87150e0(-151042795);
                        r111.m87173q(r17);
                        i16 = 6;
                        r112 = r111;
                    } else {
                        r111.m87150e0(-151042794);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t2, C2299e.f9106I), 0.0f, 0.0f, 0.0f, ((float) 0.5d) * 8, 7);
                        String strM21274h6 = AbstractC8693b.m21274h(textResourceM39844d, r111, r17 == true ? 1 : 0);
                        ?? r34 = C38072d.f163053a;
                        C2886a c2886aM8422c3 = r34.m121952e(r111, 6).getB3();
                        long white51 = r34.m121949b(r111, 6).getWhite50();
                        ?? r212 = r111;
                        i16 = 6;
                        AbstractC30795n.m94707h(strM21274h6, modifierM3398t, white51, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c3, null, r212, 0, 0, 196600);
                        ?? r124 = r212;
                        r124.m87173q(r17);
                        r112 = r124;
                    }
                    r112.m87173q(r17);
                    r24 = r17;
                    r113 = r112;
                }
                r113.m87173q(true);
                expectedAnnotation = state.getExpectedAnnotation();
                if (expectedAnnotation == null) {
                    r113.m87150e0(1323076118);
                    r113.m87173q(r24);
                    z19 = true;
                    r114 = r113;
                } else {
                    r113.m87150e0(1323076119);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, r113, i16);
                    iHashCode4 = Long.hashCode(r113.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = r113.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(r113, modifierM3409f2);
                    r113.m87158i0();
                    if (r113.f115903S) {
                        r113.m87163l(c0213j2);
                    } else {
                        r113.m87178s0();
                    }
                    AbstractC28683x.m87239G(r113, c0209i8, c22994r1M66759a);
                    AbstractC28683x.m87239G(r113, c0209i7, interfaceC28653p1M87165m4);
                    if (r113.f115903S || !AbstractC22676k.m65745e(r113.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, r113, iHashCode4, c0209i5);
                    }
                    AbstractC28683x.m87239G(r113, c0209i6, modifierM118962N4);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, ((float) 0.5d) * 8, 7);
                    String strM39891b = expectedAnnotation.getLabel();
                    ?? r35 = C38072d.f163053a;
                    ?? r213 = r113;
                    AbstractC30795n.m94707h(strM39891b, modifierM3398t2, r35.m121949b(r113, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r35.m121952e(r113, i16).getB3(), null, r213, 48, 0, 196600);
                    ?? r125 = r213;
                    z19 = true;
                    r125.m87173q(true);
                    AbstractC31061c.m95650z(1, i15, c2314t2, r125, r24);
                    r114 = r125;
                }
                r114.m87173q(z19);
                if (z17) {
                    r114.m87150e0(-1449755198);
                    r114.m87173q(r24);
                    r115 = r114;
                } else {
                    r114.m87150e0(-1454568847);
                    if (state.getExpectedAnnotation() == null) {
                        r114.m87150e0(-1454670310);
                        if (state.getIsHomeTile()) {
                            r114.m87150e0(-1454638504);
                            float f18 = i15;
                            AbstractC31061c.m95650z(f18, f18, c2314t2, r114, r24);
                        } else {
                            r114.m87150e0(-1454559144);
                            AbstractC31061c.m95650z(1, i15, c2314t2, r114, r24);
                        }
                        r114.m87173q(r24);
                    } else {
                        r114.m87150e0(-1454478110);
                        r114.m87173q(r24);
                    }
                    if (c14007g == null) {
                        r114.m87150e0(-1454450118);
                        r114.m87173q(r24);
                    } else {
                        r114.m87150e0(-1454450117);
                        AbstractC31061c.m95650z(11, i15, c2314t2, r114, r24);
                    }
                    it = state.m39885k().iterator();
                    if (it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    fM39873v = m39873v((C14008h) it.next(), state.getTickMarkHeight(), state.getTickMarkWidth());
                    while (it.hasNext()) {
                        fM39873v = Math.max(fM39873v, m39873v((C14008h) it.next(), state.getTickMarkHeight(), state.getTickMarkWidth()));
                    }
                    if (state.getFillFullSpace()) {
                        modifierM3429z = AbstractC1102d.m3409f(1.0f, c2314t2);
                        c17919x = null;
                    } else {
                        c17919x = null;
                        modifierM3429z = AbstractC1102d.m3429z(c2314t2, null, 3);
                    }
                    if (state.getUseEdgeFade()) {
                        modifierM39869r = m39869r(c2314t2);
                    } else {
                        modifierM39869r = c2314t2;
                    }
                    Modifier modifierMo3471e = modifierM3429z.mo3471e(modifierM39869r);
                    InterfaceC39171c interfaceC39171c3 = interfaceC39171c2;
                    zM87153g = r114.m87153g(interfaceC39171c3);
                    objM87133R2 = r114.m87133R();
                    if (zM87153g) {
                        c28676v2 = c28676v1;
                    } else {
                        c28676v2 = c28676v1;
                        if (objM87133R2 == c28676v2) {
                            interfaceC28601c3 = interfaceC28601c2;
                            obj2 = objM87133R2;
                        }
                        Modifier modifierM3500d = AbstractC1131a.m3500d(modifierMo3471e, (Function1) obj2);
                        if (state.getFillFullSpace()) {
                            interfaceC22965iM66746i = AbstractC22977m.f90656g;
                        } else {
                            interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * i15);
                        }
                        C2306l c2306l = C2299e.f9109L;
                        zM87157i = r114.m87157i(state) | r114.m87147d(fM39873v);
                        Object objM87133R3 = r114.m87133R();
                        obj3 = objM87133R3;
                        if (zM87157i || objM87133R3 == c28676v2) {
                            C11412w1 c11412w1 = new C11412w1(state, fM39873v, 1);
                            r114.m87172p0(c11412w1);
                            obj3 = c11412w1;
                        }
                        C17919x c17919x2 = c17919x;
                        InterfaceC28601c1 interfaceC28601c4 = interfaceC28601c3;
                        AbstractC22674j.m65718d(modifierM3500d, null, null, interfaceC22965iM66746i, c2306l, null, false, null, (Function1) obj3, r114, ProfileVerifier.CompilationStatus.f6515xf2722a21, 462);
                        listM39883i2 = state.m39883i();
                        if (listM39883i2 != null || listM39883i2.isEmpty()) {
                            r114.m87150e0(-1450109342);
                            r114.m87173q(r24);
                            r116 = r114;
                        } else {
                            r114.m87150e0(-1453352717);
                            float f19 = i15;
                            Modifier modifierM3411h = AbstractC1102d.m3411h(i16 * f19, c2314t2);
                            C2307m c2307m3 = c2307m2;
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m3, r24);
                            int iHashCode6 = Long.hashCode(r114.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = r114.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(r114, modifierM3411h);
                            InterfaceC0221l.f734a.getClass();
                            C0213j c0213j4 = C0217k.f724b;
                            r114.m87158i0();
                            if (r114.f115903S) {
                                r114.m87163l(c0213j4);
                            } else {
                                r114.m87178s0();
                            }
                            AbstractC28683x.m87239G(r114, C0217k.f729g, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(r114, C0217k.f728f, interfaceC28653p1M87165m5);
                            C0209i c0209i10 = C0217k.f732j;
                            if (r114.f115903S || !AbstractC22676k.m65745e(r114.m87133R(), Integer.valueOf(iHashCode6))) {
                                AbstractC11266d.m30471y(iHashCode6, r114, iHashCode6, c0209i10);
                            }
                            AbstractC28683x.m87239G(r114, C0217k.f726d, modifierM118962N5);
                            r114.m87150e0(159923821);
                            ?? r126 = r114;
                            for (C14007g c14007g2 : state.m39883i()) {
                                int size = state.m39885k().size();
                                float fM39892a = (c14007g2.getIndex() * (state.getTickMarkWidth() + ((m39861j(interfaceC28601c4) - (size * state.getTickMarkWidth())) / (size - 1)))) - ((float) 1.5d);
                                if (c14007g2.getIsBelow() && state.getBelowLabelClearsTicks()) {
                                    r126.m87150e0(-1479821309);
                                    Modifier modifierM3391m = AbstractC1099a.m3391m(c2314t2, fM39892a, (((float) 0.5d) * f19) + state.getTickMarkHeight());
                                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m3, r24);
                                    int iHashCode7 = Long.hashCode(r126.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m6 = r126.m87165m();
                                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(r126, modifierM3391m);
                                    InterfaceC0221l.f734a.getClass();
                                    C0213j c0213j5 = C0217k.f724b;
                                    r126.m87158i0();
                                    if (r126.f115903S) {
                                        r126.m87163l(c0213j5);
                                    } else {
                                        r126.m87178s0();
                                    }
                                    C0209i c0209i11 = C0217k.f729g;
                                    AbstractC28683x.m87239G(r126, c0209i11, interfaceC39127r0M66763d3);
                                    C0209i c0209i12 = C0217k.f728f;
                                    AbstractC28683x.m87239G(r126, c0209i12, interfaceC28653p1M87165m6);
                                    C0209i c0209i13 = C0217k.f732j;
                                    if (r126.f115903S || !AbstractC22676k.m65745e(r126.m87133R(), Integer.valueOf(iHashCode7))) {
                                        AbstractC11266d.m30471y(iHashCode7, r126, iHashCode7, c0209i13);
                                    }
                                    C0209i c0209i14 = C0217k.f726d;
                                    AbstractC28683x.m87239G(r126, c0209i14, modifierM118962N6);
                                    C2305k c2305k3 = c2305k2;
                                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k3, r126, r24);
                                    int iHashCode8 = Long.hashCode(r126.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m7 = r126.m87165m();
                                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(r126, c2314t2);
                                    r126.m87158i0();
                                    if (r126.f115903S) {
                                        r126.m87163l(c0213j5);
                                    } else {
                                        r126.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(r126, c0209i11, c23010xM66775a3);
                                    AbstractC28683x.m87239G(r126, c0209i12, interfaceC28653p1M87165m7);
                                    if (r126.f115903S || !AbstractC22676k.m65745e(r126.m87133R(), Integer.valueOf(iHashCode8))) {
                                        AbstractC11266d.m30471y(iHashCode8, r126, iHashCode8, c0209i13);
                                    }
                                    AbstractC28683x.m87239G(r126, c0209i14, modifierM118962N7);
                                    String strM21274h7 = AbstractC8693b.m21274h(c14007g2.getLabel(), r126, r24);
                                    ?? r36 = C38072d.f163053a;
                                    ?? r214 = r126;
                                    c2305k = c2305k3;
                                    f15 = f19;
                                    c2307m = c2307m3;
                                    AbstractC30795n.m94707h(strM21274h7, null, c14007g2.getLabelActiveColor().mo134584toComposableColorWaAFU9c(r126, r24), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r36.m121952e(r126, 6).getN9(), null, r214, 0, 0, 196602);
                                    ?? r127 = r214;
                                    TextResource textResourceM39896e2 = c14007g2.getSubLabel();
                                    if (textResourceM39896e2 == null) {
                                        r127.m87150e0(528499574);
                                        r127.m87173q(r24);
                                        r119 = r127;
                                    } else {
                                        r127.m87150e0(528499575);
                                        String strM21274h8 = AbstractC8693b.m21274h(textResourceM39896e2, r127, r24);
                                        C2886a c2886aM8422c4 = r36.m121952e(r127, 6).getB3();
                                        ?? M39897f2 = c14007g2.getSubLabelActiveColor();
                                        if (M39897f2 == 0) {
                                            r127.m87150e0(467559908);
                                            r127.m87173q(r24);
                                            c17919xM31989h3 = c17919x2;
                                        } else {
                                            r127.m87150e0(-677654083);
                                            c17919xM31989h3 = AbstractC11895b.m31989h(r127, r24, M39897f2.mo134584toComposableColorWaAFU9c(r127, r24));
                                        }
                                        if (c17919xM31989h3 == null) {
                                            jM73370c3 = AbstractC25012a.m73370c(r127, -677652783, r36, r127, 6);
                                            r127.m87173q(r24);
                                        } else {
                                            r127.m87150e0(-677654891);
                                            r127.m87173q(r24);
                                            jM73370c3 = c17919xM31989h3.f69639a;
                                        }
                                        AbstractC30795n.m94707h(strM21274h8, null, jM73370c3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c4, null, r127, 0, 0, 196602);
                                        ?? r128 = r127;
                                        r128.m87173q(r24);
                                        r119 = r128;
                                    }
                                    AbstractC25012a.m73392y(r119, true, true, r24);
                                } else {
                                    f15 = f19;
                                    c2307m = c2307m3;
                                    c2305k = c2305k2;
                                    r126.m87150e0(-1478491564);
                                    Float fM39895d = c14007g2.getPositionY();
                                    if (fM39895d != null) {
                                        fFloatValue = fM39895d.floatValue();
                                    } else {
                                        if (c14007g2.getIsBelow()) {
                                            f16 = 0.0f;
                                        } else if (c14007g2.getSubLabel() != null) {
                                            fFloatValue = -1.8f;
                                        } else {
                                            f16 = -1.2f;
                                        }
                                        Modifier modifierM3392n = AbstractC1099a.m3392n(c2314t2, fM39892a, 0.0f, 2);
                                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, r24);
                                        iHashCode5 = Long.hashCode(r126.f115904T);
                                        InterfaceC28653p1 interfaceC28653p1M87165m8 = r126.m87165m();
                                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(r126, modifierM3392n);
                                        InterfaceC0221l.f734a.getClass();
                                        c0213j3 = C0217k.f724b;
                                        r126.m87158i0();
                                        if (r126.f115903S) {
                                            r126.m87163l(c0213j3);
                                        } else {
                                            r126.m87178s0();
                                        }
                                        AbstractC28683x.m87239G(r126, C0217k.f729g, interfaceC39127r0M66763d4);
                                        AbstractC28683x.m87239G(r126, C0217k.f728f, interfaceC28653p1M87165m8);
                                        c0209i9 = C0217k.f732j;
                                        if (r126.f115903S || !AbstractC22676k.m65745e(r126.m87133R(), Integer.valueOf(iHashCode5))) {
                                            AbstractC11266d.m30471y(iHashCode5, r126, iHashCode5, c0209i9);
                                        }
                                        AbstractC28683x.m87239G(r126, C0217k.f726d, modifierM118962N8);
                                        Modifier modifierM88145f = AbstractC29011e.m88145f(c2314t2, 0.0f, f16, 0.0f, 0.0f, null, 29, null);
                                        String strM21274h9 = AbstractC8693b.m21274h(c14007g2.getLabel(), r126, r24);
                                        if (c14007g2.getIsBelow()) {
                                            r126.m87150e0(436600709);
                                            c2886aM8422c = C38072d.f163053a.m121952e(r126, 6).getN9();
                                        } else {
                                            r126.m87150e0(436601669);
                                            c2886aM8422c = C38072d.f163053a.m121952e(r126, 6).getB3();
                                        }
                                        r126.m87173q(r24);
                                        ?? r215 = r126;
                                        AbstractC30795n.m94707h(strM21274h9, modifierM88145f, c14007g2.getLabelActiveColor().mo134584toComposableColorWaAFU9c(r126, r24), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c, null, r215, 0, 0, 196600);
                                        r118 = r215;
                                        textResourceM39896e = c14007g2.getSubLabel();
                                        if (textResourceM39896e == null) {
                                            r118.m87150e0(649928443);
                                            r118.m87173q(r24);
                                            r119 = r118;
                                        } else {
                                            r118.m87150e0(649928444);
                                            if (c14007g2.getIsBelow()) {
                                                f17 = 0.0f;
                                            } else {
                                                f17 = -1.2f;
                                            }
                                            Modifier modifierM88145f2 = AbstractC29011e.m88145f(c2314t2, 0.0f, f17, 0.0f, 0.0f, null, 29, null);
                                            String strM21274h10 = AbstractC8693b.m21274h(textResourceM39896e, r118, r24);
                                            r25 = C38072d.f163053a;
                                            C2886a c2886aM8422c5 = r25.m121952e(r118, 6).getB3();
                                            M39897f = c14007g2.getSubLabelActiveColor();
                                            if (M39897f == 0) {
                                                r118.m87150e0(-1720981193);
                                                r118.m87173q(r24);
                                                c17919xM31989h2 = c17919x2;
                                            } else {
                                                r118.m87150e0(360126474);
                                                c17919xM31989h2 = AbstractC11895b.m31989h(r118, r24, M39897f.mo134584toComposableColorWaAFU9c(r118, r24));
                                            }
                                            if (c17919xM31989h2 == null) {
                                                jM73370c2 = AbstractC25012a.m73370c(r118, 360127774, r25, r118, 6);
                                                r118.m87173q(r24);
                                            } else {
                                                r118.m87150e0(360125666);
                                                r118.m87173q(r24);
                                                jM73370c2 = c17919xM31989h2.f69639a;
                                            }
                                            AbstractC30795n.m94707h(strM21274h10, modifierM88145f2, jM73370c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c5, null, r118, 0, 0, 196600);
                                            ?? r129 = r118;
                                            r129.m87173q(r24);
                                            r119 = r129;
                                        }
                                        r119.m87173q(true);
                                        r119.m87173q(r24);
                                    }
                                    f16 = fFloatValue;
                                    Modifier modifierM3392n2 = AbstractC1099a.m3392n(c2314t2, fM39892a, 0.0f, 2);
                                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, r24);
                                    iHashCode5 = Long.hashCode(r126.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m9 = r126.m87165m();
                                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(r126, modifierM3392n2);
                                    InterfaceC0221l.f734a.getClass();
                                    c0213j3 = C0217k.f724b;
                                    r126.m87158i0();
                                    if (r126.f115903S) {
                                        r126.m87163l(c0213j3);
                                    } else {
                                        r126.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(r126, C0217k.f729g, interfaceC39127r0M66763d5);
                                    AbstractC28683x.m87239G(r126, C0217k.f728f, interfaceC28653p1M87165m9);
                                    c0209i9 = C0217k.f732j;
                                    if (r126.f115903S) {
                                        AbstractC11266d.m30471y(iHashCode5, r126, iHashCode5, c0209i9);
                                    } else {
                                        AbstractC11266d.m30471y(iHashCode5, r126, iHashCode5, c0209i9);
                                    }
                                    AbstractC28683x.m87239G(r126, C0217k.f726d, modifierM118962N9);
                                    Modifier modifierM88145f3 = AbstractC29011e.m88145f(c2314t2, 0.0f, f16, 0.0f, 0.0f, null, 29, null);
                                    String strM21274h11 = AbstractC8693b.m21274h(c14007g2.getLabel(), r126, r24);
                                    if (c14007g2.getIsBelow()) {
                                        r126.m87150e0(436600709);
                                        c2886aM8422c = C38072d.f163053a.m121952e(r126, 6).getN9();
                                    } else {
                                        r126.m87150e0(436601669);
                                        c2886aM8422c = C38072d.f163053a.m121952e(r126, 6).getB3();
                                    }
                                    r126.m87173q(r24);
                                    ?? r216 = r126;
                                    AbstractC30795n.m94707h(strM21274h11, modifierM88145f3, c14007g2.getLabelActiveColor().mo134584toComposableColorWaAFU9c(r126, r24), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c, null, r216, 0, 0, 196600);
                                    r118 = r216;
                                    textResourceM39896e = c14007g2.getSubLabel();
                                    if (textResourceM39896e == null) {
                                        r118.m87150e0(649928443);
                                        r118.m87173q(r24);
                                        r119 = r118;
                                    } else {
                                        r118.m87150e0(649928444);
                                        if (c14007g2.getIsBelow()) {
                                            f17 = 0.0f;
                                        } else {
                                            f17 = -1.2f;
                                        }
                                        Modifier modifierM88145f4 = AbstractC29011e.m88145f(c2314t2, 0.0f, f17, 0.0f, 0.0f, null, 29, null);
                                        String strM21274h12 = AbstractC8693b.m21274h(textResourceM39896e, r118, r24);
                                        r25 = C38072d.f163053a;
                                        C2886a c2886aM8422c6 = r25.m121952e(r118, 6).getB3();
                                        M39897f = c14007g2.getSubLabelActiveColor();
                                        if (M39897f == 0) {
                                            r118.m87150e0(-1720981193);
                                            r118.m87173q(r24);
                                            c17919xM31989h2 = c17919x2;
                                        } else {
                                            r118.m87150e0(360126474);
                                            c17919xM31989h2 = AbstractC11895b.m31989h(r118, r24, M39897f.mo134584toComposableColorWaAFU9c(r118, r24));
                                        }
                                        if (c17919xM31989h2 == null) {
                                            jM73370c2 = AbstractC25012a.m73370c(r118, 360127774, r25, r118, 6);
                                            r118.m87173q(r24);
                                        } else {
                                            r118.m87150e0(360125666);
                                            r118.m87173q(r24);
                                            jM73370c2 = c17919xM31989h2.f69639a;
                                        }
                                        AbstractC30795n.m94707h(strM21274h12, modifierM88145f4, jM73370c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c6, null, r118, 0, 0, 196600);
                                        ?? r1210 = r118;
                                        r1210.m87173q(r24);
                                        r119 = r1210;
                                    }
                                    r119.m87173q(true);
                                    r119.m87173q(r24);
                                }
                                c2307m3 = c2307m;
                                f19 = f15;
                                c2305k2 = c2305k;
                                r126 = r119;
                            }
                            AbstractC25012a.m73392y(r126, r24, true, r24);
                            r116 = r126;
                        }
                        footer = state.getFooter();
                        if (footer == null) {
                            r116.m87150e0(-1450030231);
                            r116.m87173q(r24);
                            r117 = r116;
                        } else {
                            r116.m87150e0(-1450030230);
                            AbstractC22953f.m66715b(r116, AbstractC1102d.m3419p(2 * 4, c2314t2));
                            ?? r217 = r116;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(footer.getTitle(), r116, r24), null, footer.getTitleStyle().mo134584toComposableColorWaAFU9c(r116, r24), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(r116, 6).getB4(), null, r217, 0, 0, 196602);
                            ?? r130 = r217;
                            r130.m87173q(r24);
                            r117 = r130;
                        }
                        r117.m87173q(r24);
                        r115 = r117;
                    }
                    interfaceC28601c3 = interfaceC28601c2;
                    C2619s2 c2619s2 = new C2619s2(interfaceC39171c3, interfaceC28601c3, 6);
                    r114.m87172p0(c2619s2);
                    obj2 = c2619s2;
                    Modifier modifierM3500d2 = AbstractC1131a.m3500d(modifierMo3471e, (Function1) obj2);
                    if (state.getFillFullSpace()) {
                        interfaceC22965iM66746i = AbstractC22977m.f90656g;
                    } else {
                        interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * i15);
                    }
                    C2306l c2306l2 = C2299e.f9109L;
                    zM87157i = r114.m87157i(state) | r114.m87147d(fM39873v);
                    Object objM87133R4 = r114.m87133R();
                    obj3 = objM87133R4;
                    if (zM87157i) {
                        C11412w1 c11412w2 = new C11412w1(state, fM39873v, 1);
                        r114.m87172p0(c11412w2);
                        obj3 = c11412w2;
                    } else {
                        C11412w1 c11412w3 = new C11412w1(state, fM39873v, 1);
                        r114.m87172p0(c11412w3);
                        obj3 = c11412w3;
                    }
                    C17919x c17919x3 = c17919x;
                    InterfaceC28601c1 interfaceC28601c5 = interfaceC28601c3;
                    AbstractC22674j.m65718d(modifierM3500d2, null, null, interfaceC22965iM66746i, c2306l2, null, false, null, (Function1) obj3, r114, ProfileVerifier.CompilationStatus.f6515xf2722a21, 462);
                    listM39883i2 = state.m39883i();
                    if (listM39883i2 != null) {
                        r114.m87150e0(-1450109342);
                        r114.m87173q(r24);
                        r116 = r114;
                    } else {
                        r114.m87150e0(-1450109342);
                        r114.m87173q(r24);
                        r116 = r114;
                    }
                    footer = state.getFooter();
                    if (footer == null) {
                        r116.m87150e0(-1450030231);
                        r116.m87173q(r24);
                        r117 = r116;
                    } else {
                        r116.m87150e0(-1450030230);
                        AbstractC22953f.m66715b(r116, AbstractC1102d.m3419p(2 * 4, c2314t2));
                        ?? r218 = r116;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(footer.getTitle(), r116, r24), null, footer.getTitleStyle().mo134584toComposableColorWaAFU9c(r116, r24), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(r116, 6).getB4(), null, r218, 0, 0, 196602);
                        ?? r131 = r218;
                        r131.m87173q(r24);
                        r117 = r131;
                    }
                    r117.m87173q(r24);
                    r115 = r117;
                }
                z15 = z17;
                r14 = r115;
            } else {
                c28655q.m87138X();
                z15 = z13;
                r14 = c28655q;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2520f5(state, z15, i13, i14, 1);
            }
        }
        i17 |= 48;
        z13 = z4;
        if ((i17 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i17 & 1, z14)) {
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            listM39883i = state.m39883i();
            if (listM39883i != null) {
                it3 = listM39883i.iterator();
                do {
                    if (it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (((C14007g) next).getIsBelow());
                c14007g = (C14007g) next;
            } else {
                c14007g = null;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            obj = objM87133R;
            if (objM87133R == c28676v0) {
                C28633k1 c28633k1M87272z2 = AbstractC28683x.m87272z(new C39174f(0));
                c28655q.m87172p0(c28633k1M87272z2);
                obj = c28633k1M87272z2;
            }
            interfaceC28601c1 = (InterfaceC28601c1) obj;
            interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            c28676v1 = c28676v0;
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m2, false);
            z17 = z16;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d6);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
            header = state.getHeader();
            if (header == null) {
                c28655q.m87150e0(-876378497);
                c28655q.m87173q(false);
                c28676v1 = c28676v1;
                c2305k2 = c2305k2;
                c0209i5 = c0209i3;
                interfaceC28601c2 = interfaceC28601c1;
                c0209i6 = c0209i4;
                c2314t2 = c2314t;
                c0213j2 = c0213j;
                c0209i8 = c0209i;
                c0209i7 = c0209i2;
                r24 = 0;
                interfaceC39171c2 = interfaceC39171c;
                i15 = 4;
                i16 = 6;
                r113 = c28655q;
            } else {
                c28655q.m87150e0(-876378496);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                textResourceM39846f = header.getSupertitle();
                if (textResourceM39846f == null) {
                    c28655q.m87150e0(-1124873230);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i3;
                    interfaceC28601c2 = interfaceC28601c1;
                    c0209i6 = c0209i4;
                    c2314t2 = c2314t;
                    c0213j2 = c0213j;
                    c0209i8 = c0209i;
                    c0209i7 = c0209i2;
                    r10 = 0;
                    interfaceC39171c2 = interfaceC39171c;
                    i15 = 4;
                    r15 = c28655q;
                } else {
                    c28655q.m87150e0(-1124873229);
                    String strM21274h13 = AbstractC8693b.m21274h(textResourceM39846f, c28655q, 0);
                    C38072d c38072d2 = C38072d.f163053a;
                    C2886a c2886aM8438s3 = c38072d2.m121952e(c28655q, 6).getH5();
                    long white52 = c38072d2.m121949b(c28655q, 6).getWhite50();
                    c0209i5 = c0209i3;
                    c0213j2 = c0213j;
                    interfaceC28601c2 = interfaceC28601c1;
                    c0209i6 = c0209i4;
                    interfaceC39171c2 = interfaceC39171c;
                    i15 = 4;
                    c2314t2 = c2314t;
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i;
                    AbstractC30795n.m94707h(strM21274h13, null, white52, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s3, null, c28655q, 0, 0, 196602);
                    C28655q c28655q3 = c28655q;
                    r10 = 0;
                    AbstractC31061c.m95650z(2, 4, c2314t2, c28655q3, false);
                    r15 = c28655q3;
                }
                textResourceM39847g = header.getTitle();
                if (textResourceM39847g == null) {
                    r15.m87150e0(-1124509073);
                    r15.m87173q(r10);
                    r17 = r10;
                    r16 = r15;
                } else {
                    r15.m87150e0(-1124509072);
                    String strM21274h14 = AbstractC8693b.m21274h(textResourceM39847g, r15, r10);
                    ?? r219 = C38072d.f163053a;
                    C2886a c2886aM8418P2 = r219.m121952e(r15, 6).getT3();
                    long brandWhite4 = r219.m121949b(r15, 6).getBrandWhite();
                    ?? r220 = r15;
                    boolean z25 = r10 == true ? 1 : 0;
                    AbstractC30795n.m94707h(strM21274h14, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, r220, 0, 0, 196602);
                    ?? r1211 = r220;
                    AbstractC31061c.m95650z(1, i15, c2314t2, r1211, z25);
                    r17 = z25;
                    r16 = r1211;
                }
                textResourceM39845e = header.getSubtitle();
                if (textResourceM39845e == null) {
                    r16.m87150e0(-1124137786);
                    r16.m87173q(r17);
                    r18 = r16;
                } else {
                    r16.m87150e0(-1124137785);
                    String strM21274h15 = AbstractC8693b.m21274h(textResourceM39845e, r16, r17 == true ? 1 : 0);
                    ?? r221 = C38072d.f163053a;
                    C2886a c2886aM8420a2 = r221.m121952e(r16, 6).getB1();
                    long brandWhite5 = r221.m121949b(r16, 6).getBrandWhite();
                    if (z17) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    ?? r222 = r16;
                    AbstractC30795n.m94707h(strM21274h15, null, C17919x.m51541c(f13, brandWhite5), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, r222, 0, 0, 196602);
                    ?? r1212 = r222;
                    AbstractC31061c.m95650z(1, i15, c2314t2, r1212, r17);
                    r18 = r1212;
                }
                textResourceM39842b = header.getCurrentStatus();
                if (textResourceM39842b == null) {
                    r18.m87150e0(-1123720991);
                    r18.m87173q(r17);
                    r110 = r18;
                } else {
                    r18.m87150e0(-1123720990);
                    String strM21274h16 = AbstractC8693b.m21274h(textResourceM39842b, r18, r17 == true ? 1 : 0);
                    r19 = C38072d.f163053a;
                    C2886a c2886aM8438s4 = r19.m121952e(r18, 6).getH5();
                    M39841a = state.getHeader().getActiveColor();
                    if (M39841a == 0) {
                        r18.m87150e0(-318031312);
                        r18.m87173q(r17);
                        c17919xM31989h = null;
                    } else {
                        r18.m87150e0(-425901071);
                        c17919xM31989h = AbstractC11895b.m31989h(r18, r17, M39841a.mo134584toComposableColorWaAFU9c(r18, r17 == true ? 1 : 0));
                    }
                    if (c17919xM31989h == null) {
                        jM73370c = AbstractC25012a.m73370c(r18, -425899771, r19, r18, 6);
                        r18.m87173q(r17);
                    } else {
                        r18.m87150e0(-425901848);
                        r18.m87173q(r17);
                        jM73370c = c17919xM31989h.f69639a;
                    }
                    ?? r2110 = r18;
                    AbstractC30795n.m94707h(strM21274h16, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s4, null, r2110, 0, 0, 196602);
                    ?? r1213 = r2110;
                    AbstractC31061c.m95650z(1, i15, c2314t2, r1213, r17);
                    r110 = r1213;
                }
                textResourceM39843c = header.getDescription();
                if (textResourceM39843c == null) {
                    r110.m87150e0(-1123301437);
                    r110.m87173q(r17);
                    z18 = true;
                    r111 = r110;
                } else {
                    r110.m87150e0(-1123301436);
                    String strM21274h17 = AbstractC8693b.m21274h(textResourceM39843c, r110, r17 == true ? 1 : 0);
                    ?? r37 = C38072d.f163053a;
                    C2886a c2886aM8422c7 = r37.m121952e(r110, 6).getB3();
                    long brandWhite6 = r37.m121949b(r110, 6).getBrandWhite();
                    if (z17) {
                        f14 = 0.35f;
                    } else {
                        f14 = 0.7f;
                    }
                    ?? r2111 = r110;
                    AbstractC30795n.m94707h(strM21274h17, null, C17919x.m51541c(f14, brandWhite6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c7, null, r2111, 0, 0, 196602);
                    ?? r1214 = r2111;
                    z18 = true;
                    AbstractC31061c.m95650z(1, i15, c2314t2, r1214, r17);
                    r111 = r1214;
                }
                r111.m87173q(z18);
                textResourceM39844d = header.getRightAlignedDescription();
                if (textResourceM39844d == null) {
                    r111.m87150e0(-151042795);
                    r111.m87173q(r17);
                    i16 = 6;
                    r112 = r111;
                } else {
                    r111.m87150e0(-151042794);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t2, C2299e.f9106I), 0.0f, 0.0f, 0.0f, ((float) 0.5d) * 8, 7);
                    String strM21274h18 = AbstractC8693b.m21274h(textResourceM39844d, r111, r17 == true ? 1 : 0);
                    ?? r38 = C38072d.f163053a;
                    C2886a c2886aM8422c8 = r38.m121952e(r111, 6).getB3();
                    long white53 = r38.m121949b(r111, 6).getWhite50();
                    ?? r2112 = r111;
                    i16 = 6;
                    AbstractC30795n.m94707h(strM21274h18, modifierM3398t3, white53, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c8, null, r2112, 0, 0, 196600);
                    ?? r1215 = r2112;
                    r1215.m87173q(r17);
                    r112 = r1215;
                }
                r112.m87173q(r17);
                r24 = r17;
                r113 = r112;
            }
            r113.m87173q(true);
            expectedAnnotation = state.getExpectedAnnotation();
            if (expectedAnnotation == null) {
                r113.m87150e0(1323076118);
                r113.m87173q(r24);
                z19 = true;
                r114 = r113;
            } else {
                r113.m87150e0(1323076119);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, r113, i16);
                iHashCode4 = Long.hashCode(r113.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = r113.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(r113, modifierM3409f4);
                r113.m87158i0();
                if (r113.f115903S) {
                    r113.m87163l(c0213j2);
                } else {
                    r113.m87178s0();
                }
                AbstractC28683x.m87239G(r113, c0209i8, c22994r1M66759a2);
                AbstractC28683x.m87239G(r113, c0209i7, interfaceC28653p1M87165m13);
                if (r113.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, r113, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, r113, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(r113, c0209i6, modifierM118962N13);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, ((float) 0.5d) * 8, 7);
                String strM39891b2 = expectedAnnotation.getLabel();
                ?? r39 = C38072d.f163053a;
                ?? r2113 = r113;
                AbstractC30795n.m94707h(strM39891b2, modifierM3398t4, r39.m121949b(r113, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r39.m121952e(r113, i16).getB3(), null, r2113, 48, 0, 196600);
                ?? r1216 = r2113;
                z19 = true;
                r1216.m87173q(true);
                AbstractC31061c.m95650z(1, i15, c2314t2, r1216, r24);
                r114 = r1216;
            }
            r114.m87173q(z19);
            if (z17) {
                r114.m87150e0(-1454568847);
                if (state.getExpectedAnnotation() == null) {
                    r114.m87150e0(-1454670310);
                    if (state.getIsHomeTile()) {
                        r114.m87150e0(-1454638504);
                        float f110 = i15;
                        AbstractC31061c.m95650z(f110, f110, c2314t2, r114, r24);
                    } else {
                        r114.m87150e0(-1454559144);
                        AbstractC31061c.m95650z(1, i15, c2314t2, r114, r24);
                    }
                    r114.m87173q(r24);
                } else {
                    r114.m87150e0(-1454478110);
                    r114.m87173q(r24);
                }
                if (c14007g == null) {
                    r114.m87150e0(-1454450118);
                    r114.m87173q(r24);
                } else {
                    r114.m87150e0(-1454450117);
                    AbstractC31061c.m95650z(11, i15, c2314t2, r114, r24);
                }
                it = state.m39885k().iterator();
                if (it.hasNext()) {
                    throw new NoSuchElementException();
                }
                fM39873v = m39873v((C14008h) it.next(), state.getTickMarkHeight(), state.getTickMarkWidth());
                while (it.hasNext()) {
                    fM39873v = Math.max(fM39873v, m39873v((C14008h) it.next(), state.getTickMarkHeight(), state.getTickMarkWidth()));
                }
                if (state.getFillFullSpace()) {
                    modifierM3429z = AbstractC1102d.m3409f(1.0f, c2314t2);
                    c17919x = null;
                } else {
                    c17919x = null;
                    modifierM3429z = AbstractC1102d.m3429z(c2314t2, null, 3);
                }
                if (state.getUseEdgeFade()) {
                    modifierM39869r = m39869r(c2314t2);
                } else {
                    modifierM39869r = c2314t2;
                }
                Modifier modifierMo3471e2 = modifierM3429z.mo3471e(modifierM39869r);
                InterfaceC39171c interfaceC39171c4 = interfaceC39171c2;
                zM87153g = r114.m87153g(interfaceC39171c4);
                objM87133R2 = r114.m87133R();
                if (zM87153g) {
                    c28676v2 = c28676v1;
                    if (objM87133R2 == c28676v2) {
                        interfaceC28601c3 = interfaceC28601c2;
                        obj2 = objM87133R2;
                    }
                    Modifier modifierM3500d3 = AbstractC1131a.m3500d(modifierMo3471e2, (Function1) obj2);
                    if (state.getFillFullSpace()) {
                        interfaceC22965iM66746i = AbstractC22977m.f90656g;
                    } else {
                        interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * i15);
                    }
                    C2306l c2306l3 = C2299e.f9109L;
                    zM87157i = r114.m87157i(state) | r114.m87147d(fM39873v);
                    Object objM87133R5 = r114.m87133R();
                    obj3 = objM87133R5;
                    if (zM87157i) {
                        C11412w1 c11412w4 = new C11412w1(state, fM39873v, 1);
                        r114.m87172p0(c11412w4);
                        obj3 = c11412w4;
                    } else {
                        C11412w1 c11412w5 = new C11412w1(state, fM39873v, 1);
                        r114.m87172p0(c11412w5);
                        obj3 = c11412w5;
                    }
                    C17919x c17919x4 = c17919x;
                    InterfaceC28601c1 interfaceC28601c6 = interfaceC28601c3;
                    AbstractC22674j.m65718d(modifierM3500d3, null, null, interfaceC22965iM66746i, c2306l3, null, false, null, (Function1) obj3, r114, ProfileVerifier.CompilationStatus.f6515xf2722a21, 462);
                    listM39883i2 = state.m39883i();
                    if (listM39883i2 != null) {
                        r114.m87150e0(-1450109342);
                        r114.m87173q(r24);
                        r116 = r114;
                    } else {
                        r114.m87150e0(-1450109342);
                        r114.m87173q(r24);
                        r116 = r114;
                    }
                    footer = state.getFooter();
                    if (footer == null) {
                        r116.m87150e0(-1450030231);
                        r116.m87173q(r24);
                        r117 = r116;
                    } else {
                        r116.m87150e0(-1450030230);
                        AbstractC22953f.m66715b(r116, AbstractC1102d.m3419p(2 * 4, c2314t2));
                        ?? r2114 = r116;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(footer.getTitle(), r116, r24), null, footer.getTitleStyle().mo134584toComposableColorWaAFU9c(r116, r24), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(r116, 6).getB4(), null, r2114, 0, 0, 196602);
                        ?? r132 = r2114;
                        r132.m87173q(r24);
                        r117 = r132;
                    }
                    r117.m87173q(r24);
                    r115 = r117;
                } else {
                    c28676v2 = c28676v1;
                }
                interfaceC28601c3 = interfaceC28601c2;
                C2619s2 c2619s3 = new C2619s2(interfaceC39171c4, interfaceC28601c3, 6);
                r114.m87172p0(c2619s3);
                obj2 = c2619s3;
                Modifier modifierM3500d4 = AbstractC1131a.m3500d(modifierMo3471e2, (Function1) obj2);
                if (state.getFillFullSpace()) {
                    interfaceC22965iM66746i = AbstractC22977m.f90656g;
                } else {
                    interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * i15);
                }
                C2306l c2306l4 = C2299e.f9109L;
                zM87157i = r114.m87157i(state) | r114.m87147d(fM39873v);
                Object objM87133R6 = r114.m87133R();
                obj3 = objM87133R6;
                if (zM87157i) {
                    C11412w1 c11412w6 = new C11412w1(state, fM39873v, 1);
                    r114.m87172p0(c11412w6);
                    obj3 = c11412w6;
                } else {
                    C11412w1 c11412w7 = new C11412w1(state, fM39873v, 1);
                    r114.m87172p0(c11412w7);
                    obj3 = c11412w7;
                }
                C17919x c17919x5 = c17919x;
                InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c3;
                AbstractC22674j.m65718d(modifierM3500d4, null, null, interfaceC22965iM66746i, c2306l4, null, false, null, (Function1) obj3, r114, ProfileVerifier.CompilationStatus.f6515xf2722a21, 462);
                listM39883i2 = state.m39883i();
                if (listM39883i2 != null) {
                    r114.m87150e0(-1450109342);
                    r114.m87173q(r24);
                    r116 = r114;
                } else {
                    r114.m87150e0(-1450109342);
                    r114.m87173q(r24);
                    r116 = r114;
                }
                footer = state.getFooter();
                if (footer == null) {
                    r116.m87150e0(-1450030231);
                    r116.m87173q(r24);
                    r117 = r116;
                } else {
                    r116.m87150e0(-1450030230);
                    AbstractC22953f.m66715b(r116, AbstractC1102d.m3419p(2 * 4, c2314t2));
                    ?? r2115 = r116;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(footer.getTitle(), r116, r24), null, footer.getTitleStyle().mo134584toComposableColorWaAFU9c(r116, r24), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(r116, 6).getB4(), null, r2115, 0, 0, 196602);
                    ?? r133 = r2115;
                    r133.m87173q(r24);
                    r117 = r133;
                }
                r117.m87173q(r24);
                r115 = r117;
            } else {
                r114.m87150e0(-1449755198);
                r114.m87173q(r24);
                r115 = r114;
            }
            z15 = z17;
            r14 = r115;
        } else {
            c28655q.m87138X();
            z15 = z13;
            r14 = c28655q;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2520f5(state, z15, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m39860i(C14005e c14005e, boolean z4, int i13, int i14, Composer composer, int i15) {
        m39859h(c14005e, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final float m39861j(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39174f) interfaceC28601c1.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: k */
    private static final void m39862k(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(new C39174f(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m39863l(InterfaceC39171c interfaceC39171c, InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y layoutCoordinates) {
        AbstractC22676k.m65750j(layoutCoordinates, "layoutCoordinates");
        m39862k(interfaceC28601c1, interfaceC39171c.mo733e0((int) (layoutCoordinates.mo3541n() >> 32)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m39864m(C14005e c14005e, float f13, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        List<C14008h> listM39885k = c14005e.m39885k();
        ((C26053f) LazyRow).m77529r(listM39885k.size(), null, new a(listM39885k), new C37816b(new b(listM39885k, c14005e, f13), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m39865n(int i13, C14008h c14008h, C14005e c14005e, float f13, Composer composer, int i14) {
        int i15;
        C14005e c14005e2;
        long jMo134584toComposableColorWaAFU9c;
        boolean z4;
        int i16;
        Modifier modifier;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(579642016);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(c14008h) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            c14005e2 = c14005e;
            i15 |= c28655q.m87157i(c14005e2) ? 256 : 128;
        } else {
            c14005e2 = c14005e;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87147d(f13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            if (!c14005e2.getIsFadeIn() || c14005e2.getUseEdgeFade() || i13 >= 4) {
                c28655q.m87150e0(-1947799030);
                jMo134584toComposableColorWaAFU9c = c14008h.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1947892247);
                jMo134584toComposableColorWaAFU9c = C17919x.m51541c((i13 + 1) * 0.2f, c14008h.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                c28655q.m87173q(false);
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C14006f expectedAnnotation = c14005e2.getExpectedAnnotation();
            if (expectedAnnotation == null) {
                c28655q.m87150e0(-1174911076);
                c28655q.m87173q(false);
                z4 = false;
                c0209i3 = c0209i3;
            } else {
                c28655q.m87150e0(-1174911075);
                if (i13 == expectedAnnotation.getIndex()) {
                    c28655q.m87150e0(-1856350264);
                    InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    long mciRed50 = C38072d.f163053a.m121949b(c28655q, 6).getMciRed50();
                    float fMo743q0 = interfaceC39171c.mo743q0(3);
                    float fMo743q1 = interfaceC39171c.mo743q0(2);
                    Modifier modifierM3411h = AbstractC1102d.m3411h(12, AbstractC1102d.m3424u((float) 0.1d, c2314t));
                    boolean zM87147d = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87151f(mciRed50);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87147d || objM87133R == C28635l.f115821a) {
                        objM87133R = new C12769l(fMo743q0, fMo743q1, mciRed50, 2);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC21478l0.m60421a(modifierM3411h, (Function1) objM87133R, c28655q, 6);
                    z4 = false;
                    AbstractC25012a.m73388u(1, 4, c2314t, c28655q, false);
                } else {
                    z4 = false;
                    c28655q.m87150e0(-1855266256);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z4);
            }
            float fM39873v = m39873v(c14008h, c14005e.getTickMarkHeight(), c14005e.getTickMarkWidth());
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(f13, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, z4);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3411h2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM39873v, AbstractC1102d.m3424u(c14005e.getTickMarkWidth(), c2314t)), AbstractC33253j.m105486b(50)), jMo134584toComposableColorWaAFU9c, AbstractC17918w0.f69621a);
            if (c14008h.getBorderColor() != null) {
                c28655q.m87150e0(231604271);
                i16 = 0;
                Modifier modifierM44455h = AbstractC15751g.m44455h(c2314t, 1, c14008h.getBorderColor().mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC33253j.m105486b(50));
                c28655q.m87173q(false);
                modifier = modifierM44455h;
            } else {
                i16 = 0;
                c28655q.m87150e0(231903390);
                c28655q.m87173q(false);
                modifier = c2314t;
            }
            AbstractC22989q.m66760a(modifierM3358c.mo3471e(modifier), c28655q, i16);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4006d0(i13, c14008h, c14005e, f13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m39866o(float f13, float f14, long j7, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        Canvas.mo732d0(j7, (((long) Float.floatToRawIntBits(-Canvas.mo743q0((float) 0.5d))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L), (496 & 8) != 0 ? 0.0f : 3.0f, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{f13, f14}, 0.0f)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m39867p(int i13, C14008h c14008h, C14005e c14005e, float f13, int i14, Composer composer, int i15) {
        m39865n(i13, c14008h, c14005e, f13, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final Modifier m39869r(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return AbstractC1125a.m3480c(AbstractC1127a.m3486a(modifier, new C13693b(26)), new C13693b(27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m39870s(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51555f(1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m39871t(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C17909s c17909s = AbstractC17911t.f69612b;
        C23465k[] c23465kArrM39872u = m39872u(c0238p0.getLayoutDirection());
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51484b(c17909s, (C23465k[]) Arrays.copyOf(c23465kArrM39872u, c23465kArrM39872u.length)), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final C23465k[] m39872u(EnumC39181m layoutDirection) {
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal == 0) {
            Float fValueOf = Float.valueOf(0.0f);
            long j7 = C17919x.f69625b;
            return new C23465k[]{new C23465k(fValueOf, new C17919x(C17919x.m51541c(0.0f, j7))), new C23465k(Float.valueOf(0.25f), new C17919x(j7))};
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        Float fValueOf2 = Float.valueOf(0.75f);
        long j13 = C17919x.f69625b;
        return new C23465k[]{new C23465k(fValueOf2, new C17919x(j13)), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.m51541c(0.0f, j13)))};
    }

    /* JADX INFO: renamed from: v */
    private static final float m39873v(C14008h c14008h, float f13, float f14) {
        if (c14008h.getIsToday()) {
            return f13 * (f14 >= 4.0f ? 3.0f : 2.5f);
        }
        return f13;
    }
}

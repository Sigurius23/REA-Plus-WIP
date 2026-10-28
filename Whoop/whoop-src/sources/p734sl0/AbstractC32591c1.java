package p734sl0;

import a00.C0073h;
import android.net.Uri;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.p057ai.chat.models.AttachmentType;
import gb1.AbstractC15673b0;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import hh0.AbstractC17287g;
import java.io.File;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.C22409u;
import kh0.AbstractC22478e;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import o72.C27640a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p097ds.AbstractC12313p;
import p163g1.AbstractC14983d3;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p238j0.C21084j;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc2.C32375n;
import sh2.C32513d;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.AbstractC38073e;
import x81.C38072d;
import xf3.C38266c;
import zg0.C40628k;

/* JADX INFO: renamed from: sl0.c1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aA\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000f²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lzg0/k;", "attachmentUploadState", "Lkotlin/Function0;", "Ll83/a0;", "removeAttachment", "retryClicked", "Lkd1/u;", "pdfCacheManager", "j", "(Lzg0/k;Lc93/a;Lc93/a;Lkd1/u;Landroidx/compose/runtime/Composer;II)V", "", "cachedFilePath", "", "showPreview", "showImagePreview", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32591c1 {

    /* JADX INFO: renamed from: sl0.c1$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AttachmentUploadViewKt$AttachmentUploadView$3$1$2$1$1", m100430f = "AttachmentUploadView.kt", m100431l = {112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f135046E;

        /* JADX INFO: renamed from: w */
        int f135047w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22409u f135048x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Uri f135049y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f135050z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22409u c22409u, Uri uri, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135048x = c22409u;
            this.f135049y = uri;
            this.f135050z = interfaceC28601c1;
            this.f135046E = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f135048x, this.f135049y, this.f135050z, this.f135046E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM64530g;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135047w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22409u c22409u = this.f135048x;
                Uri uri = this.f135049y;
                this.f135047w = 1;
                objM64530g = c22409u.m64530g(uri, this);
                if (objM64530g == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM64530g = ((C23468n) obj).f92940w;
            }
            InterfaceC28601c1 interfaceC28601c1 = this.f135050z;
            InterfaceC28601c1 interfaceC28601c2 = this.f135046E;
            if (!(objM64530g instanceof C23467m)) {
                AbstractC32591c1.m101667v(interfaceC28601c1, ((File) objM64530g).getAbsolutePath());
                AbstractC32591c1.m101669x(interfaceC28601c2, true);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.c1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f135051a;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            try {
                iArr[AttachmentType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentType.PDF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f135051a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0191  */
    /* JADX WARN: Code duplicated, block: B:104:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:111:0x0206  */
    /* JADX WARN: Code duplicated, block: B:115:0x0223  */
    /* JADX WARN: Code duplicated, block: B:117:0x0226  */
    /* JADX WARN: Code duplicated, block: B:118:0x0243  */
    /* JADX WARN: Code duplicated, block: B:120:0x0250  */
    /* JADX WARN: Code duplicated, block: B:121:0x0255  */
    /* JADX WARN: Code duplicated, block: B:124:0x0276  */
    /* JADX WARN: Code duplicated, block: B:127:0x027f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0292  */
    /* JADX WARN: Code duplicated, block: B:132:0x0298  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:144:0x0318  */
    /* JADX WARN: Code duplicated, block: B:145:0x031e  */
    /* JADX WARN: Code duplicated, block: B:148:0x032b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0339  */
    /* JADX WARN: Code duplicated, block: B:153:0x0366  */
    /* JADX WARN: Code duplicated, block: B:156:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:161:0x040b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0428  */
    /* JADX WARN: Code duplicated, block: B:164:0x0438  */
    /* JADX WARN: Code duplicated, block: B:166:0x0447 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x044c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0456  */
    /* JADX WARN: Code duplicated, block: B:174:0x046f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0472  */
    /* JADX WARN: Code duplicated, block: B:180:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:184:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:186:0x04db  */
    /* JADX WARN: Code duplicated, block: B:187:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:190:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:193:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:198:0x0571  */
    /* JADX WARN: Code duplicated, block: B:199:0x0595  */
    /* JADX WARN: Code duplicated, block: B:202:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:204:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:207:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:209:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:210:0x0604  */
    /* JADX WARN: Code duplicated, block: B:212:0x0610  */
    /* JADX WARN: Code duplicated, block: B:215:0x0627  */
    /* JADX WARN: Code duplicated, block: B:218:0x0636 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:227:0x0679  */
    /* JADX WARN: Code duplicated, block: B:229:0x0687  */
    /* JADX WARN: Code duplicated, block: B:232:0x0694  */
    /* JADX WARN: Code duplicated, block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0102  */
    /* JADX WARN: Code duplicated, block: B:81:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x0132  */
    /* JADX WARN: Code duplicated, block: B:88:0x0151  */
    /* JADX WARN: Code duplicated, block: B:91:0x0160  */
    /* JADX WARN: Code duplicated, block: B:94:0x0171  */
    /* JADX WARN: Code duplicated, block: B:97:0x0188  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r12v29, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r13v10, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v12, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v14, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v8, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v9, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r2v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r30v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v26 */
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
    /* JADX INFO: renamed from: j */
    public static final void m101655j(C40628k attachmentUploadState, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C22409u c22409u, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a3;
        int i16;
        int i17;
        boolean z4;
        InterfaceC4339a interfaceC4339a4;
        C22409u c22409u2;
        InterfaceC4339a interfaceC4339a5;
        ?? r14;
        C28677v1 c28677v1M87180u;
        int i18;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a6;
        InterfaceC4339a interfaceC4339a7;
        int i19;
        InterfaceC4339a interfaceC4339a8;
        InterfaceC4339a interfaceC4339a9;
        C26669a c26669a;
        C38266c c38266c;
        boolean zM87153g;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC2994c0 interfaceC2994c0;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z13;
        float f13;
        float f14;
        float f15;
        C2314t c2314t;
        float f16;
        int iHashCode;
        C0213j c0213j;
        boolean z14;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        InterfaceC4339a interfaceC4339a10;
        C0209i c0209i4;
        int i24;
        InterfaceC28601c1 interfaceC28601c4;
        C22409u c22409u3;
        float f17;
        C2314t c2314t2;
        int i25;
        InterfaceC28601c1 interfaceC28601c5;
        InterfaceC28601c1 interfaceC28601c6;
        AbstractC22403o abstractC22403oM131851c;
        boolean z15;
        Object objM87133R8;
        float f18;
        C28676v0 c28676v1;
        boolean z16;
        C28655q c28655q;
        ?? r15;
        ?? r10;
        ?? r16;
        Object objM87133R9;
        C28676v0 c28676v2;
        C28676v0 c28676v3;
        InterfaceC4339a interfaceC4339a11;
        ?? r17;
        ?? r18;
        String strM101666u;
        Object objM87133R10;
        float f19;
        int i26;
        boolean z17;
        boolean zM87157i;
        Object c0073h;
        int i27;
        int iHashCode2;
        Object objM87133R11;
        String strM131849a;
        boolean z18;
        int i28;
        boolean zM87157i2;
        C22409u c22409u4 = c22409u;
        AbstractC22676k.m65750j(attachmentUploadState, "attachmentUploadState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(663402588);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(attachmentUploadState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if ((i14 & 8) != 0) {
                        i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    } else {
                        if ((i13 & 4096) == 0) {
                            zM87157i2 = c28655q2.m87153g(c22409u4);
                        } else {
                            zM87157i2 = c28655q2.m87157i(c22409u4);
                        }
                        if (zM87157i2) {
                            i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                    }
                    i15 |= i28;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28655q2.m87140Z();
                    i18 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0 || c28655q2.m87118C()) {
                        if (i29 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32513d(29);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a6 = interfaceC4339a3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32581a1(0);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a7 = interfaceC4339a2;
                        }
                        if ((i14 & 8) != 0) {
                            c28655q2.m87152f0(-909571169);
                            c26669a = C29155a.f118017b;
                            if (c26669a == null) {
                                throw new IllegalStateException("KoinApplication has not been started");
                            }
                            c38266c = c26669a.f106046a.f159364d;
                            c28655q2.m87152f0(-3686552);
                            zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                            objM87133R = c28655q2.m87133R();
                            if (zM87153g || objM87133R == c28676v0) {
                                objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c28655q2.m87173q(false);
                            c28655q2.m87173q(false);
                            c22409u4 = (C22409u) objM87133R;
                            i15 &= -7169;
                        }
                        i19 = i15;
                        interfaceC4339a8 = interfaceC4339a6;
                        interfaceC4339a9 = interfaceC4339a7;
                    } else {
                        c28655q2.m87138X();
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                        }
                        interfaceC4339a9 = interfaceC4339a2;
                        i19 = i15;
                        interfaceC4339a8 = interfaceC4339a3;
                    }
                    c28655q2.m87175r();
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R4;
                    boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("whoop-coach-file-upload");
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R7;
                    c28655q2.m87150e0(1874749563);
                    if (!attachmentUploadState.getIsUploading() || attachmentUploadState.getIsError()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    f13 = 1;
                    f14 = 8;
                    f15 = f13 * f14;
                    c2314t = C2314t.f9131w;
                    float f24 = 4;
                    Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(16 * f24, AbstractC1099a.m3394p(f15, c2314t)), AbstractC33253j.m105489e(f24));
                    f16 = f24;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM118994r);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    z14 = z13;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        interfaceC4339a10 = interfaceC4339a8;
                    } else {
                        interfaceC4339a10 = interfaceC4339a8;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                        i24 = b.f135051a[attachmentUploadState.getType().ordinal()];
                        if (i24 != 1) {
                            interfaceC28601c4 = interfaceC28601c1;
                            c22409u3 = c22409u4;
                            f17 = f15;
                            c2314t2 = c2314t;
                            i25 = i19;
                            interfaceC28601c5 = interfaceC28601c3;
                            f16 = f16;
                            interfaceC28601c6 = interfaceC28601c2;
                            c28655q2.m87150e0(1392973733);
                            abstractC22403oM131851c = attachmentUploadState.getImageSource();
                            if (abstractC22403oM131851c == null) {
                                c28655q2.m87150e0(1392973732);
                                c28655q2.m87173q(false);
                                z16 = false;
                                c28676v1 = c28676v0;
                                c28655q = c28655q2;
                            } else {
                                c28655q2.m87150e0(1392973733);
                                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t2), "attachment_upload_image");
                                if (z14 && zIsFeatureEnabled) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                objM87133R8 = c28655q2.m87133R();
                                if (objM87133R8 == c28676v0) {
                                    objM87133R8 = new C32586b1(0, interfaceC28601c5);
                                    c28655q2.m87172p0(objM87133R8);
                                }
                                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3599a, z15, null, null, (InterfaceC4339a) objM87133R8, 14);
                                if (z14) {
                                    f18 = f16;
                                } else {
                                    f18 = 0;
                                }
                                c28676v1 = c28676v0;
                                z16 = false;
                                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM131851c, null, null, c28655q2, AbstractC22403o.f87638a, 3), AbstractC8693b.m21273g(AbstractC37336b.f159653W0, c28655q2, 0), AbstractC12313p.m34301s(f18, modifierM3362g), null, null, 0.0f, null, c28655q2, 0, 120);
                                C28655q c28655q3 = c28655q2;
                                c28655q3.m87173q(false);
                                c28655q = c28655q3;
                            }
                            c28655q.m87173q(z16);
                            r10 = z16;
                            r15 = c28655q;
                        } else if (i24 != 2) {
                            c28655q2.m87150e0(1396086443);
                            c28655q2.m87173q(false);
                            interfaceC28601c6 = interfaceC28601c2;
                            c22409u3 = c22409u4;
                            r10 = 0;
                            f17 = f15;
                            c2314t2 = c2314t;
                            i25 = i19;
                            interfaceC28601c5 = interfaceC28601c3;
                            c28676v1 = c28676v0;
                            interfaceC28601c4 = interfaceC28601c1;
                            f16 = f16;
                            r15 = c28655q2;
                        } else {
                            c28655q2.m87150e0(1393719996);
                            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                            if (z14) {
                                f19 = f13 * f16;
                            } else {
                                f19 = 0;
                            }
                            Modifier modifierM34301s = AbstractC12313p.m34301s(f19, modifierM3407d);
                            C38072d c38072d = C38072d.f163053a;
                            i26 = C38072d.f163054b;
                            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM34301s, c38072d.m121949b(c28655q2, i26).getWhite10(), AbstractC17918w0.f69621a);
                            if (!attachmentUploadState.getIsUploading() || attachmentUploadState.getIsError()) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            zM87157i = c28655q2.m87157i(attachmentUploadState) | c28655q2.m87157i(interfaceC2994c0) | ((((i19 & 7168) ^ 3072) <= 2048 && c28655q2.m87157i(c22409u4)) || (i19 & 3072) == 2048);
                            Object objM87133R12 = c28655q2.m87133R();
                            if (!zM87157i || objM87133R12 == c28676v0) {
                                c22409u3 = c22409u4;
                                interfaceC28601c6 = interfaceC28601c2;
                                i27 = i26;
                                interfaceC28601c4 = interfaceC28601c1;
                                c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                                c28655q2.m87172p0(c0073h);
                            } else {
                                interfaceC28601c4 = interfaceC28601c1;
                                i27 = i26;
                                c22409u3 = c22409u4;
                                c0073h = objM87133R12;
                                interfaceC28601c6 = interfaceC28601c2;
                            }
                            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM3358c, z17, null, null, (InterfaceC4339a) c0073h, 14), f15, 2 * f14);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                            Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3419p(5 * f16, c2314t), 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C32375n(17);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R11);
                            interfaceC28601c5 = interfaceC28601c3;
                            int i34 = i19;
                            c2314t2 = c2314t;
                            f17 = f15;
                            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q2, 0), null, modifierM3480c, 0L, c28655q2, 48, 8);
                            strM131849a = attachmentUploadState.getDisplayName();
                            if (strM131849a.length() == 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (z18) {
                                strM131849a = "document.pdf";
                            }
                            int i35 = i27;
                            AbstractC30795n.m94707h(strM131849a, AbstractC1102d.m3409f(1.0f, c2314t2), c38072d.m121949b(c28655q2, i35).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, 0, null, c38072d.m121952e(c28655q2, i35).getFormLabel(), null, c28655q2, 48, (C2886a.f11498d << 18) | 3120, 185848);
                            C28655q c28655q4 = c28655q2;
                            c28655q4.m87173q(true);
                            c28655q4.m87173q(false);
                            i25 = i34;
                            r10 = 0;
                            c28676v1 = c28676v0;
                            r15 = c28655q4;
                        }
                        if (attachmentUploadState.getIsUploading() || attachmentUploadState.getIsError()) {
                            r15.m87150e0(1396186790);
                            C21084j c21084j = new C21084j();
                            if ((i25 & 112) == 32) {
                                r16 = 1;
                            } else {
                                r16 = r10;
                            }
                            objM87133R9 = r15.m87133R();
                            if (r16 == 0) {
                                c28676v2 = c28676v1;
                                if (objM87133R9 == c28676v2) {
                                }
                                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                                ?? r19 = C38072d.f163053a;
                                int i36 = C38072d.f163054b;
                                float f25 = 2;
                                Modifier modifierM3419p = AbstractC1102d.m3419p(f25 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f25, AbstractC1092a.m3358c(modifierM3398t, r19.m121949b(r15, i36).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                                c28676v3 = c28676v2;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r19.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p, r19.m121949b(r15, i36).getBlack70(), r15, 0, 0);
                                r15.m87173q(r10);
                            } else {
                                c28676v2 = c28676v1;
                            }
                            objM87133R9 = new C32579a(interfaceC4339a10, 6);
                            r15.m87172p0(objM87133R9);
                            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                            ?? r110 = C38072d.f163053a;
                            int i37 = C38072d.f163054b;
                            float f26 = 2;
                            Modifier modifierM3419p2 = AbstractC1102d.m3419p(f26 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f26, AbstractC1092a.m3358c(modifierM3398t2, r110.m121949b(r15, i37).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                            c28676v3 = c28676v2;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r110.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p2, r110.m121949b(r15, i37).getBlack70(), r15, 0, 0);
                            r15.m87173q(r10);
                        } else {
                            r15.m87150e0(1396945453);
                            r15.m87173q(r10);
                            c28676v3 = c28676v1;
                        }
                        if (attachmentUploadState.getIsError()) {
                            r15.m87150e0(1396989473);
                            ?? r111 = r15;
                            InterfaceC4339a interfaceC4339a12 = interfaceC4339a9;
                            AbstractC14983d3.m43104a(interfaceC4339a12, null, false, C32636l1.f135259a.m101924b(), r111, ((i25 >> 6) & 14) | 24576, 14);
                            interfaceC4339a11 = interfaceC4339a12;
                            ?? r112 = r111;
                            r112.m87173q(r10);
                            r17 = r112;
                        } else {
                            interfaceC4339a11 = interfaceC4339a9;
                            r15.m87150e0(1397523789);
                            r15.m87173q(r10);
                            r17 = r15;
                        }
                        if (attachmentUploadState.getIsUploading()) {
                            r17.m87150e0(1397561392);
                            ?? r33 = r17;
                            AbstractC35684p.m113047h(AbstractC1102d.m3419p(5 * f16, c2314t2), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r33, 6, 508);
                            ?? r113 = r33;
                            r113.m87173q(r10);
                            r18 = r113;
                        } else {
                            r17.m87150e0(1397773773);
                            r17.m87173q(r10);
                            r18 = r17;
                        }
                        r18.m87173q(true);
                        r18.m87173q(r10);
                        if (m101668w(interfaceC28601c6)) {
                            r18.m87150e0(1874914932);
                            strM101666u = m101666u(interfaceC28601c4);
                            if (strM101666u == null) {
                                r18.m87150e0(-2007179251);
                                r18.m87173q(r10);
                            } else {
                                r18.m87150e0(-2007179250);
                                objM87133R10 = r18.m87133R();
                                if (objM87133R10 == c28676v3) {
                                    objM87133R10 = new C32586b1(1, interfaceC28601c6);
                                    r18.m87172p0(objM87133R10);
                                }
                                AbstractC17287g.m48960d(strM101666u, (InterfaceC4339a) objM87133R10, r18, 48);
                                r18.m87173q(r10);
                            }
                            r18.m87173q(r10);
                        } else {
                            r18.m87150e0(-2007027226);
                            r18.m87173q(r10);
                        }
                        if (m101670y(interfaceC28601c5) || !zIsFeatureEnabled) {
                            r18.m87150e0(-2006657210);
                            r18.m87173q(r10);
                        } else {
                            r18.m87150e0(1874923179);
                            AbstractC22403o abstractC22403oM131851c2 = attachmentUploadState.getImageSource();
                            if (abstractC22403oM131851c2 == null) {
                                r18.m87150e0(-2006923594);
                                r18.m87173q(r10);
                            } else {
                                r18.m87150e0(-2006923593);
                                String strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159653W0, r18, r10);
                                Object objM87133R13 = r18.m87133R();
                                if (objM87133R13 == c28676v3) {
                                    objM87133R13 = new C32586b1(2, interfaceC28601c5);
                                    r18.m87172p0(objM87133R13);
                                }
                                AbstractC22478e.m64913f(abstractC22403oM131851c2, strM21273g, (InterfaceC4339a) objM87133R13, r18, AbstractC22403o.f87638a | 384);
                                r18.m87173q(r10);
                            }
                            r18.m87173q(r10);
                        }
                        interfaceC4339a5 = interfaceC4339a10;
                        c22409u2 = c22409u3;
                        interfaceC4339a4 = interfaceC4339a11;
                        r14 = r18;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    i24 = b.f135051a[attachmentUploadState.getType().ordinal()];
                    if (i24 != 1) {
                        interfaceC28601c4 = interfaceC28601c1;
                        c22409u3 = c22409u4;
                        f17 = f15;
                        c2314t2 = c2314t;
                        i25 = i19;
                        interfaceC28601c5 = interfaceC28601c3;
                        f16 = f16;
                        interfaceC28601c6 = interfaceC28601c2;
                        c28655q2.m87150e0(1392973733);
                        abstractC22403oM131851c = attachmentUploadState.getImageSource();
                        if (abstractC22403oM131851c == null) {
                            c28655q2.m87150e0(1392973732);
                            c28655q2.m87173q(false);
                            z16 = false;
                            c28676v1 = c28676v0;
                            c28655q = c28655q2;
                        } else {
                            c28655q2.m87150e0(1392973733);
                            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t2), "attachment_upload_image");
                            if (z14) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C32586b1(0, interfaceC28601c5);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3599a2, z15, null, null, (InterfaceC4339a) objM87133R8, 14);
                            if (z14) {
                                f18 = f16;
                            } else {
                                f18 = 0;
                            }
                            c28676v1 = c28676v0;
                            z16 = false;
                            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM131851c, null, null, c28655q2, AbstractC22403o.f87638a, 3), AbstractC8693b.m21273g(AbstractC37336b.f159653W0, c28655q2, 0), AbstractC12313p.m34301s(f18, modifierM3362g2), null, null, 0.0f, null, c28655q2, 0, 120);
                            C28655q c28655q5 = c28655q2;
                            c28655q5.m87173q(false);
                            c28655q = c28655q5;
                        }
                        c28655q.m87173q(z16);
                        r10 = z16;
                        r15 = c28655q;
                    } else if (i24 != 2) {
                        c28655q2.m87150e0(1396086443);
                        c28655q2.m87173q(false);
                        interfaceC28601c6 = interfaceC28601c2;
                        c22409u3 = c22409u4;
                        r10 = 0;
                        f17 = f15;
                        c2314t2 = c2314t;
                        i25 = i19;
                        interfaceC28601c5 = interfaceC28601c3;
                        c28676v1 = c28676v0;
                        interfaceC28601c4 = interfaceC28601c1;
                        f16 = f16;
                        r15 = c28655q2;
                    } else {
                        c28655q2.m87150e0(1393719996);
                        Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                        if (z14) {
                            f19 = f13 * f16;
                        } else {
                            f19 = 0;
                        }
                        Modifier modifierM34301s2 = AbstractC12313p.m34301s(f19, modifierM3407d2);
                        C38072d c38072d2 = C38072d.f163053a;
                        i26 = C38072d.f163054b;
                        Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM34301s2, c38072d2.m121949b(c28655q2, i26).getWhite10(), AbstractC17918w0.f69621a);
                        if (attachmentUploadState.getIsUploading()) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        zM87157i = c28655q2.m87157i(attachmentUploadState) | c28655q2.m87157i(interfaceC2994c0) | ((((i19 & 7168) ^ 3072) <= 2048 && c28655q2.m87157i(c22409u4)) || (i19 & 3072) == 2048);
                        Object objM87133R14 = c28655q2.m87133R();
                        if (zM87157i) {
                            c22409u3 = c22409u4;
                            interfaceC28601c6 = interfaceC28601c2;
                            i27 = i26;
                            interfaceC28601c4 = interfaceC28601c1;
                            c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                            c28655q2.m87172p0(c0073h);
                        } else {
                            c22409u3 = c22409u4;
                            interfaceC28601c6 = interfaceC28601c2;
                            i27 = i26;
                            interfaceC28601c4 = interfaceC28601c1;
                            c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                            c28655q2.m87172p0(c0073h);
                        }
                        Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM3358c2, z17, null, null, (InterfaceC4339a) c0073h, 14), f15, 2 * f14);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                        Modifier modifierM3488c2 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(5 * f16, c2314t), 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C32375n(17);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        Modifier modifierM3480c2 = AbstractC1125a.m3480c(modifierM3488c2, (Function1) objM87133R11);
                        interfaceC28601c5 = interfaceC28601c3;
                        int i38 = i19;
                        c2314t2 = c2314t;
                        f17 = f15;
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q2, 0), null, modifierM3480c2, 0L, c28655q2, 48, 8);
                        strM131849a = attachmentUploadState.getDisplayName();
                        if (strM131849a.length() == 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            strM131849a = "document.pdf";
                        }
                        int i39 = i27;
                        AbstractC30795n.m94707h(strM131849a, AbstractC1102d.m3409f(1.0f, c2314t2), c38072d2.m121949b(c28655q2, i39).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, 0, null, c38072d2.m121952e(c28655q2, i39).getFormLabel(), null, c28655q2, 48, (C2886a.f11498d << 18) | 3120, 185848);
                        C28655q c28655q6 = c28655q2;
                        c28655q6.m87173q(true);
                        c28655q6.m87173q(false);
                        i25 = i38;
                        r10 = 0;
                        c28676v1 = c28676v0;
                        r15 = c28655q6;
                    }
                    if (attachmentUploadState.getIsUploading()) {
                        r15.m87150e0(1396186790);
                        C21084j c21084j2 = new C21084j();
                        if ((i25 & 112) == 32) {
                            r16 = 1;
                        } else {
                            r16 = r10;
                        }
                        objM87133R9 = r15.m87133R();
                        if (r16 == 0) {
                            c28676v2 = c28676v1;
                            if (objM87133R9 == c28676v2) {
                            }
                            Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j2, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                            ?? r114 = C38072d.f163053a;
                            int i310 = C38072d.f163054b;
                            float f27 = 2;
                            Modifier modifierM3419p3 = AbstractC1102d.m3419p(f27 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f27, AbstractC1092a.m3358c(modifierM3398t3, r114.m121949b(r15, i310).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                            c28676v3 = c28676v2;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r114.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p3, r114.m121949b(r15, i310).getBlack70(), r15, 0, 0);
                            r15.m87173q(r10);
                        } else {
                            c28676v2 = c28676v1;
                        }
                        objM87133R9 = new C32579a(interfaceC4339a10, 6);
                        r15.m87172p0(objM87133R9);
                        Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j2, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r115 = C38072d.f163053a;
                        int i311 = C38072d.f163054b;
                        float f28 = 2;
                        Modifier modifierM3419p4 = AbstractC1102d.m3419p(f28 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f28, AbstractC1092a.m3358c(modifierM3398t4, r115.m121949b(r15, i311).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r115.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p4, r115.m121949b(r15, i311).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    } else {
                        r15.m87150e0(1396186790);
                        C21084j c21084j3 = new C21084j();
                        if ((i25 & 112) == 32) {
                            r16 = 1;
                        } else {
                            r16 = r10;
                        }
                        objM87133R9 = r15.m87133R();
                        if (r16 == 0) {
                            c28676v2 = c28676v1;
                            if (objM87133R9 == c28676v2) {
                            }
                            Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j3, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                            ?? r116 = C38072d.f163053a;
                            int i312 = C38072d.f163054b;
                            float f29 = 2;
                            Modifier modifierM3419p5 = AbstractC1102d.m3419p(f29 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f29, AbstractC1092a.m3358c(modifierM3398t5, r116.m121949b(r15, i312).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                            c28676v3 = c28676v2;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r116.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p5, r116.m121949b(r15, i312).getBlack70(), r15, 0, 0);
                            r15.m87173q(r10);
                        } else {
                            c28676v2 = c28676v1;
                        }
                        objM87133R9 = new C32579a(interfaceC4339a10, 6);
                        r15.m87172p0(objM87133R9);
                        Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j3, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r117 = C38072d.f163053a;
                        int i313 = C38072d.f163054b;
                        float f210 = 2;
                        Modifier modifierM3419p6 = AbstractC1102d.m3419p(f210 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f210, AbstractC1092a.m3358c(modifierM3398t6, r117.m121949b(r15, i313).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r117.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p6, r117.m121949b(r15, i313).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    }
                    if (attachmentUploadState.getIsError()) {
                        r15.m87150e0(1396989473);
                        ?? r118 = r15;
                        InterfaceC4339a interfaceC4339a13 = interfaceC4339a9;
                        AbstractC14983d3.m43104a(interfaceC4339a13, null, false, C32636l1.f135259a.m101924b(), r118, ((i25 >> 6) & 14) | 24576, 14);
                        interfaceC4339a11 = interfaceC4339a13;
                        ?? r119 = r118;
                        r119.m87173q(r10);
                        r17 = r119;
                    } else {
                        interfaceC4339a11 = interfaceC4339a9;
                        r15.m87150e0(1397523789);
                        r15.m87173q(r10);
                        r17 = r15;
                    }
                    if (attachmentUploadState.getIsUploading()) {
                        r17.m87150e0(1397561392);
                        ?? r34 = r17;
                        AbstractC35684p.m113047h(AbstractC1102d.m3419p(5 * f16, c2314t2), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r34, 6, 508);
                        ?? r1110 = r34;
                        r1110.m87173q(r10);
                        r18 = r1110;
                    } else {
                        r17.m87150e0(1397773773);
                        r17.m87173q(r10);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(r10);
                    if (m101668w(interfaceC28601c6)) {
                        r18.m87150e0(1874914932);
                        strM101666u = m101666u(interfaceC28601c4);
                        if (strM101666u == null) {
                            r18.m87150e0(-2007179251);
                            r18.m87173q(r10);
                        } else {
                            r18.m87150e0(-2007179250);
                            objM87133R10 = r18.m87133R();
                            if (objM87133R10 == c28676v3) {
                                objM87133R10 = new C32586b1(1, interfaceC28601c6);
                                r18.m87172p0(objM87133R10);
                            }
                            AbstractC17287g.m48960d(strM101666u, (InterfaceC4339a) objM87133R10, r18, 48);
                            r18.m87173q(r10);
                        }
                        r18.m87173q(r10);
                    } else {
                        r18.m87150e0(-2007027226);
                        r18.m87173q(r10);
                    }
                    if (m101670y(interfaceC28601c5)) {
                        r18.m87150e0(-2006657210);
                        r18.m87173q(r10);
                    } else {
                        r18.m87150e0(-2006657210);
                        r18.m87173q(r10);
                    }
                    interfaceC4339a5 = interfaceC4339a10;
                    c22409u2 = c22409u3;
                    interfaceC4339a4 = interfaceC4339a11;
                    r14 = r18;
                } else {
                    c28655q2.m87138X();
                    interfaceC4339a4 = interfaceC4339a2;
                    c22409u2 = c22409u4;
                    interfaceC4339a5 = interfaceC4339a3;
                    r14 = c28655q2;
                }
                c28677v1M87180u = r14.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C27640a(attachmentUploadState, interfaceC4339a5, interfaceC4339a4, c22409u2, i13, i14, 26);
                }
            }
            i15 |= 384;
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) != 0) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                } else {
                    if ((i13 & 4096) == 0) {
                        zM87157i2 = c28655q2.m87153g(c22409u4);
                    } else {
                        zM87157i2 = c28655q2.m87157i(c22409u4);
                    }
                    if (zM87157i2) {
                        i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                }
                i15 |= i28;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i29 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32513d(29);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32581a1(0);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a2;
                    }
                    if ((i14 & 8) != 0) {
                        c28655q2.m87152f0(-909571169);
                        c26669a = C29155a.f118017b;
                        if (c26669a == null) {
                            throw new IllegalStateException("KoinApplication has not been started");
                        }
                        c38266c = c26669a.f106046a.f159364d;
                        c28655q2.m87152f0(-3686552);
                        zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                        objM87133R = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        c28655q2.m87173q(false);
                        c22409u4 = (C22409u) objM87133R;
                        i15 &= -7169;
                    }
                    i19 = i15;
                    interfaceC4339a8 = interfaceC4339a6;
                    interfaceC4339a9 = interfaceC4339a7;
                } else {
                    if (i29 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32513d(29);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32581a1(0);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a2;
                    }
                    if ((i14 & 8) != 0) {
                        c28655q2.m87152f0(-909571169);
                        c26669a = C29155a.f118017b;
                        if (c26669a == null) {
                            throw new IllegalStateException("KoinApplication has not been started");
                        }
                        c38266c = c26669a.f106046a.f159364d;
                        c28655q2.m87152f0(-3686552);
                        zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                        objM87133R = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        c28655q2.m87173q(false);
                        c22409u4 = (C22409u) objM87133R;
                        i15 &= -7169;
                    }
                    i19 = i15;
                    interfaceC4339a8 = interfaceC4339a6;
                    interfaceC4339a9 = interfaceC4339a7;
                }
                c28655q2.m87175r();
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R4;
                boolean zIsFeatureEnabled2 = ((FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("whoop-coach-file-upload");
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R7;
                c28655q2.m87150e0(1874749563);
                if (attachmentUploadState.getIsUploading()) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                f13 = 1;
                f14 = 8;
                f15 = f13 * f14;
                c2314t = C2314t.f9131w;
                float f211 = 4;
                Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(16 * f211, AbstractC1099a.m3394p(f15, c2314t)), AbstractC33253j.m105489e(f211));
                f16 = f211;
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM118994r2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                z14 = z13;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    interfaceC4339a10 = interfaceC4339a8;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                    i24 = b.f135051a[attachmentUploadState.getType().ordinal()];
                    if (i24 != 1) {
                        interfaceC28601c4 = interfaceC28601c1;
                        c22409u3 = c22409u4;
                        f17 = f15;
                        c2314t2 = c2314t;
                        i25 = i19;
                        interfaceC28601c5 = interfaceC28601c3;
                        f16 = f16;
                        interfaceC28601c6 = interfaceC28601c2;
                        c28655q2.m87150e0(1392973733);
                        abstractC22403oM131851c = attachmentUploadState.getImageSource();
                        if (abstractC22403oM131851c == null) {
                            c28655q2.m87150e0(1392973732);
                            c28655q2.m87173q(false);
                            z16 = false;
                            c28676v1 = c28676v0;
                            c28655q = c28655q2;
                        } else {
                            c28655q2.m87150e0(1392973733);
                            Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t2), "attachment_upload_image");
                            if (z14) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C32586b1(0, interfaceC28601c5);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM3599a3, z15, null, null, (InterfaceC4339a) objM87133R8, 14);
                            if (z14) {
                                f18 = f16;
                            } else {
                                f18 = 0;
                            }
                            c28676v1 = c28676v0;
                            z16 = false;
                            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM131851c, null, null, c28655q2, AbstractC22403o.f87638a, 3), AbstractC8693b.m21273g(AbstractC37336b.f159653W0, c28655q2, 0), AbstractC12313p.m34301s(f18, modifierM3362g3), null, null, 0.0f, null, c28655q2, 0, 120);
                            C28655q c28655q7 = c28655q2;
                            c28655q7.m87173q(false);
                            c28655q = c28655q7;
                        }
                        c28655q.m87173q(z16);
                        r10 = z16;
                        r15 = c28655q;
                    } else if (i24 != 2) {
                        c28655q2.m87150e0(1396086443);
                        c28655q2.m87173q(false);
                        interfaceC28601c6 = interfaceC28601c2;
                        c22409u3 = c22409u4;
                        r10 = 0;
                        f17 = f15;
                        c2314t2 = c2314t;
                        i25 = i19;
                        interfaceC28601c5 = interfaceC28601c3;
                        c28676v1 = c28676v0;
                        interfaceC28601c4 = interfaceC28601c1;
                        f16 = f16;
                        r15 = c28655q2;
                    } else {
                        c28655q2.m87150e0(1393719996);
                        Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                        if (z14) {
                            f19 = f13 * f16;
                        } else {
                            f19 = 0;
                        }
                        Modifier modifierM34301s3 = AbstractC12313p.m34301s(f19, modifierM3407d3);
                        C38072d c38072d3 = C38072d.f163053a;
                        i26 = C38072d.f163054b;
                        Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierM34301s3, c38072d3.m121949b(c28655q2, i26).getWhite10(), AbstractC17918w0.f69621a);
                        if (attachmentUploadState.getIsUploading()) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        zM87157i = c28655q2.m87157i(attachmentUploadState) | c28655q2.m87157i(interfaceC2994c0) | ((((i19 & 7168) ^ 3072) <= 2048 && c28655q2.m87157i(c22409u4)) || (i19 & 3072) == 2048);
                        Object objM87133R15 = c28655q2.m87133R();
                        if (zM87157i) {
                            c22409u3 = c22409u4;
                            interfaceC28601c6 = interfaceC28601c2;
                            i27 = i26;
                            interfaceC28601c4 = interfaceC28601c1;
                            c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                            c28655q2.m87172p0(c0073h);
                        } else {
                            c22409u3 = c22409u4;
                            interfaceC28601c6 = interfaceC28601c2;
                            i27 = i26;
                            interfaceC28601c4 = interfaceC28601c1;
                            c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                            c28655q2.m87172p0(c0073h);
                        }
                        Modifier modifierM3395q3 = AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM3358c3, z17, null, null, (InterfaceC4339a) c0073h, 14), f15, 2 * f14);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3395q3);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                        Modifier modifierM3488c3 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(5 * f16, c2314t), 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C32375n(17);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        Modifier modifierM3480c3 = AbstractC1125a.m3480c(modifierM3488c3, (Function1) objM87133R11);
                        interfaceC28601c5 = interfaceC28601c3;
                        int i314 = i19;
                        c2314t2 = c2314t;
                        f17 = f15;
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q2, 0), null, modifierM3480c3, 0L, c28655q2, 48, 8);
                        strM131849a = attachmentUploadState.getDisplayName();
                        if (strM131849a.length() == 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            strM131849a = "document.pdf";
                        }
                        int i315 = i27;
                        AbstractC30795n.m94707h(strM131849a, AbstractC1102d.m3409f(1.0f, c2314t2), c38072d3.m121949b(c28655q2, i315).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, 0, null, c38072d3.m121952e(c28655q2, i315).getFormLabel(), null, c28655q2, 48, (C2886a.f11498d << 18) | 3120, 185848);
                        C28655q c28655q8 = c28655q2;
                        c28655q8.m87173q(true);
                        c28655q8.m87173q(false);
                        i25 = i314;
                        r10 = 0;
                        c28676v1 = c28676v0;
                        r15 = c28655q8;
                    }
                    if (attachmentUploadState.getIsUploading()) {
                        r15.m87150e0(1396186790);
                        C21084j c21084j4 = new C21084j();
                        if ((i25 & 112) == 32) {
                            r16 = 1;
                        } else {
                            r16 = r10;
                        }
                        objM87133R9 = r15.m87133R();
                        if (r16 == 0) {
                            c28676v2 = c28676v1;
                            if (objM87133R9 == c28676v2) {
                            }
                            Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j4, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                            ?? r1111 = C38072d.f163053a;
                            int i316 = C38072d.f163054b;
                            float f212 = 2;
                            Modifier modifierM3419p7 = AbstractC1102d.m3419p(f212 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f212, AbstractC1092a.m3358c(modifierM3398t7, r1111.m121949b(r15, i316).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                            c28676v3 = c28676v2;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1111.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p7, r1111.m121949b(r15, i316).getBlack70(), r15, 0, 0);
                            r15.m87173q(r10);
                        } else {
                            c28676v2 = c28676v1;
                        }
                        objM87133R9 = new C32579a(interfaceC4339a10, 6);
                        r15.m87172p0(objM87133R9);
                        Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j4, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r1112 = C38072d.f163053a;
                        int i317 = C38072d.f163054b;
                        float f213 = 2;
                        Modifier modifierM3419p8 = AbstractC1102d.m3419p(f213 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f213, AbstractC1092a.m3358c(modifierM3398t8, r1112.m121949b(r15, i317).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1112.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p8, r1112.m121949b(r15, i317).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    } else {
                        r15.m87150e0(1396186790);
                        C21084j c21084j5 = new C21084j();
                        if ((i25 & 112) == 32) {
                            r16 = 1;
                        } else {
                            r16 = r10;
                        }
                        objM87133R9 = r15.m87133R();
                        if (r16 == 0) {
                            c28676v2 = c28676v1;
                            if (objM87133R9 == c28676v2) {
                            }
                            Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j5, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                            ?? r1113 = C38072d.f163053a;
                            int i318 = C38072d.f163054b;
                            float f214 = 2;
                            Modifier modifierM3419p9 = AbstractC1102d.m3419p(f214 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f214, AbstractC1092a.m3358c(modifierM3398t9, r1113.m121949b(r15, i318).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                            c28676v3 = c28676v2;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1113.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p9, r1113.m121949b(r15, i318).getBlack70(), r15, 0, 0);
                            r15.m87173q(r10);
                        } else {
                            c28676v2 = c28676v1;
                        }
                        objM87133R9 = new C32579a(interfaceC4339a10, 6);
                        r15.m87172p0(objM87133R9);
                        Modifier modifierM3398t10 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j5, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r1114 = C38072d.f163053a;
                        int i319 = C38072d.f163054b;
                        float f215 = 2;
                        Modifier modifierM3419p10 = AbstractC1102d.m3419p(f215 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f215, AbstractC1092a.m3358c(modifierM3398t10, r1114.m121949b(r15, i319).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1114.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p10, r1114.m121949b(r15, i319).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    }
                    if (attachmentUploadState.getIsError()) {
                        r15.m87150e0(1396989473);
                        ?? r1115 = r15;
                        InterfaceC4339a interfaceC4339a14 = interfaceC4339a9;
                        AbstractC14983d3.m43104a(interfaceC4339a14, null, false, C32636l1.f135259a.m101924b(), r1115, ((i25 >> 6) & 14) | 24576, 14);
                        interfaceC4339a11 = interfaceC4339a14;
                        ?? r1116 = r1115;
                        r1116.m87173q(r10);
                        r17 = r1116;
                    } else {
                        interfaceC4339a11 = interfaceC4339a9;
                        r15.m87150e0(1397523789);
                        r15.m87173q(r10);
                        r17 = r15;
                    }
                    if (attachmentUploadState.getIsUploading()) {
                        r17.m87150e0(1397561392);
                        ?? r35 = r17;
                        AbstractC35684p.m113047h(AbstractC1102d.m3419p(5 * f16, c2314t2), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r35, 6, 508);
                        ?? r1117 = r35;
                        r1117.m87173q(r10);
                        r18 = r1117;
                    } else {
                        r17.m87150e0(1397773773);
                        r17.m87173q(r10);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(r10);
                    if (m101668w(interfaceC28601c6)) {
                        r18.m87150e0(1874914932);
                        strM101666u = m101666u(interfaceC28601c4);
                        if (strM101666u == null) {
                            r18.m87150e0(-2007179251);
                            r18.m87173q(r10);
                        } else {
                            r18.m87150e0(-2007179250);
                            objM87133R10 = r18.m87133R();
                            if (objM87133R10 == c28676v3) {
                                objM87133R10 = new C32586b1(1, interfaceC28601c6);
                                r18.m87172p0(objM87133R10);
                            }
                            AbstractC17287g.m48960d(strM101666u, (InterfaceC4339a) objM87133R10, r18, 48);
                            r18.m87173q(r10);
                        }
                        r18.m87173q(r10);
                    } else {
                        r18.m87150e0(-2007027226);
                        r18.m87173q(r10);
                    }
                    if (m101670y(interfaceC28601c5)) {
                        r18.m87150e0(-2006657210);
                        r18.m87173q(r10);
                    } else {
                        r18.m87150e0(-2006657210);
                        r18.m87173q(r10);
                    }
                    interfaceC4339a5 = interfaceC4339a10;
                    c22409u2 = c22409u3;
                    interfaceC4339a4 = interfaceC4339a11;
                    r14 = r18;
                } else {
                    interfaceC4339a10 = interfaceC4339a8;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                i24 = b.f135051a[attachmentUploadState.getType().ordinal()];
                if (i24 != 1) {
                    interfaceC28601c4 = interfaceC28601c1;
                    c22409u3 = c22409u4;
                    f17 = f15;
                    c2314t2 = c2314t;
                    i25 = i19;
                    interfaceC28601c5 = interfaceC28601c3;
                    f16 = f16;
                    interfaceC28601c6 = interfaceC28601c2;
                    c28655q2.m87150e0(1392973733);
                    abstractC22403oM131851c = attachmentUploadState.getImageSource();
                    if (abstractC22403oM131851c == null) {
                        c28655q2.m87150e0(1392973732);
                        c28655q2.m87173q(false);
                        z16 = false;
                        c28676v1 = c28676v0;
                        c28655q = c28655q2;
                    } else {
                        c28655q2.m87150e0(1392973733);
                        Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t2), "attachment_upload_image");
                        if (z14) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C32586b1(0, interfaceC28601c5);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM3599a4, z15, null, null, (InterfaceC4339a) objM87133R8, 14);
                        if (z14) {
                            f18 = f16;
                        } else {
                            f18 = 0;
                        }
                        c28676v1 = c28676v0;
                        z16 = false;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM131851c, null, null, c28655q2, AbstractC22403o.f87638a, 3), AbstractC8693b.m21273g(AbstractC37336b.f159653W0, c28655q2, 0), AbstractC12313p.m34301s(f18, modifierM3362g4), null, null, 0.0f, null, c28655q2, 0, 120);
                        C28655q c28655q9 = c28655q2;
                        c28655q9.m87173q(false);
                        c28655q = c28655q9;
                    }
                    c28655q.m87173q(z16);
                    r10 = z16;
                    r15 = c28655q;
                } else if (i24 != 2) {
                    c28655q2.m87150e0(1396086443);
                    c28655q2.m87173q(false);
                    interfaceC28601c6 = interfaceC28601c2;
                    c22409u3 = c22409u4;
                    r10 = 0;
                    f17 = f15;
                    c2314t2 = c2314t;
                    i25 = i19;
                    interfaceC28601c5 = interfaceC28601c3;
                    c28676v1 = c28676v0;
                    interfaceC28601c4 = interfaceC28601c1;
                    f16 = f16;
                    r15 = c28655q2;
                } else {
                    c28655q2.m87150e0(1393719996);
                    Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
                    if (z14) {
                        f19 = f13 * f16;
                    } else {
                        f19 = 0;
                    }
                    Modifier modifierM34301s4 = AbstractC12313p.m34301s(f19, modifierM3407d4);
                    C38072d c38072d4 = C38072d.f163053a;
                    i26 = C38072d.f163054b;
                    Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifierM34301s4, c38072d4.m121949b(c28655q2, i26).getWhite10(), AbstractC17918w0.f69621a);
                    if (attachmentUploadState.getIsUploading()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    zM87157i = c28655q2.m87157i(attachmentUploadState) | c28655q2.m87157i(interfaceC2994c0) | ((((i19 & 7168) ^ 3072) <= 2048 && c28655q2.m87157i(c22409u4)) || (i19 & 3072) == 2048);
                    Object objM87133R16 = c28655q2.m87133R();
                    if (zM87157i) {
                        c22409u3 = c22409u4;
                        interfaceC28601c6 = interfaceC28601c2;
                        i27 = i26;
                        interfaceC28601c4 = interfaceC28601c1;
                        c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                        c28655q2.m87172p0(c0073h);
                    } else {
                        c22409u3 = c22409u4;
                        interfaceC28601c6 = interfaceC28601c2;
                        i27 = i26;
                        interfaceC28601c4 = interfaceC28601c1;
                        c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                        c28655q2.m87172p0(c0073h);
                    }
                    Modifier modifierM3395q4 = AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM3358c4, z17, null, null, (InterfaceC4339a) c0073h, 14), f15, 2 * f14);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3395q4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m6);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N6);
                    Modifier modifierM3488c4 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(5 * f16, c2314t), 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C32375n(17);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    Modifier modifierM3480c4 = AbstractC1125a.m3480c(modifierM3488c4, (Function1) objM87133R11);
                    interfaceC28601c5 = interfaceC28601c3;
                    int i3110 = i19;
                    c2314t2 = c2314t;
                    f17 = f15;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q2, 0), null, modifierM3480c4, 0L, c28655q2, 48, 8);
                    strM131849a = attachmentUploadState.getDisplayName();
                    if (strM131849a.length() == 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        strM131849a = "document.pdf";
                    }
                    int i3111 = i27;
                    AbstractC30795n.m94707h(strM131849a, AbstractC1102d.m3409f(1.0f, c2314t2), c38072d4.m121949b(c28655q2, i3111).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, 0, null, c38072d4.m121952e(c28655q2, i3111).getFormLabel(), null, c28655q2, 48, (C2886a.f11498d << 18) | 3120, 185848);
                    C28655q c28655q10 = c28655q2;
                    c28655q10.m87173q(true);
                    c28655q10.m87173q(false);
                    i25 = i3110;
                    r10 = 0;
                    c28676v1 = c28676v0;
                    r15 = c28655q10;
                }
                if (attachmentUploadState.getIsUploading()) {
                    r15.m87150e0(1396186790);
                    C21084j c21084j6 = new C21084j();
                    if ((i25 & 112) == 32) {
                        r16 = 1;
                    } else {
                        r16 = r10;
                    }
                    objM87133R9 = r15.m87133R();
                    if (r16 == 0) {
                        c28676v2 = c28676v1;
                        if (objM87133R9 == c28676v2) {
                        }
                        Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j6, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r1118 = C38072d.f163053a;
                        int i3112 = C38072d.f163054b;
                        float f216 = 2;
                        Modifier modifierM3419p11 = AbstractC1102d.m3419p(f216 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f216, AbstractC1092a.m3358c(modifierM3398t11, r1118.m121949b(r15, i3112).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1118.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p11, r1118.m121949b(r15, i3112).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    } else {
                        c28676v2 = c28676v1;
                    }
                    objM87133R9 = new C32579a(interfaceC4339a10, 6);
                    r15.m87172p0(objM87133R9);
                    Modifier modifierM3398t12 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j6, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                    ?? r1119 = C38072d.f163053a;
                    int i3113 = C38072d.f163054b;
                    float f217 = 2;
                    Modifier modifierM3419p12 = AbstractC1102d.m3419p(f217 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f217, AbstractC1092a.m3358c(modifierM3398t12, r1119.m121949b(r15, i3113).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                    c28676v3 = c28676v2;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1119.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p12, r1119.m121949b(r15, i3113).getBlack70(), r15, 0, 0);
                    r15.m87173q(r10);
                } else {
                    r15.m87150e0(1396186790);
                    C21084j c21084j7 = new C21084j();
                    if ((i25 & 112) == 32) {
                        r16 = 1;
                    } else {
                        r16 = r10;
                    }
                    objM87133R9 = r15.m87133R();
                    if (r16 == 0) {
                        c28676v2 = c28676v1;
                        if (objM87133R9 == c28676v2) {
                        }
                        Modifier modifierM3398t13 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j7, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r11110 = C38072d.f163053a;
                        int i3114 = C38072d.f163054b;
                        float f218 = 2;
                        Modifier modifierM3419p13 = AbstractC1102d.m3419p(f218 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f218, AbstractC1092a.m3358c(modifierM3398t13, r11110.m121949b(r15, i3114).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r11110.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p13, r11110.m121949b(r15, i3114).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    } else {
                        c28676v2 = c28676v1;
                    }
                    objM87133R9 = new C32579a(interfaceC4339a10, 6);
                    r15.m87172p0(objM87133R9);
                    Modifier modifierM3398t14 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j7, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                    ?? r11111 = C38072d.f163053a;
                    int i3115 = C38072d.f163054b;
                    float f219 = 2;
                    Modifier modifierM3419p14 = AbstractC1102d.m3419p(f219 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f219, AbstractC1092a.m3358c(modifierM3398t14, r11111.m121949b(r15, i3115).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                    c28676v3 = c28676v2;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r11111.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p14, r11111.m121949b(r15, i3115).getBlack70(), r15, 0, 0);
                    r15.m87173q(r10);
                }
                if (attachmentUploadState.getIsError()) {
                    r15.m87150e0(1396989473);
                    ?? r11112 = r15;
                    InterfaceC4339a interfaceC4339a15 = interfaceC4339a9;
                    AbstractC14983d3.m43104a(interfaceC4339a15, null, false, C32636l1.f135259a.m101924b(), r11112, ((i25 >> 6) & 14) | 24576, 14);
                    interfaceC4339a11 = interfaceC4339a15;
                    ?? r11113 = r11112;
                    r11113.m87173q(r10);
                    r17 = r11113;
                } else {
                    interfaceC4339a11 = interfaceC4339a9;
                    r15.m87150e0(1397523789);
                    r15.m87173q(r10);
                    r17 = r15;
                }
                if (attachmentUploadState.getIsUploading()) {
                    r17.m87150e0(1397561392);
                    ?? r36 = r17;
                    AbstractC35684p.m113047h(AbstractC1102d.m3419p(5 * f16, c2314t2), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r36, 6, 508);
                    ?? r11114 = r36;
                    r11114.m87173q(r10);
                    r18 = r11114;
                } else {
                    r17.m87150e0(1397773773);
                    r17.m87173q(r10);
                    r18 = r17;
                }
                r18.m87173q(true);
                r18.m87173q(r10);
                if (m101668w(interfaceC28601c6)) {
                    r18.m87150e0(1874914932);
                    strM101666u = m101666u(interfaceC28601c4);
                    if (strM101666u == null) {
                        r18.m87150e0(-2007179251);
                        r18.m87173q(r10);
                    } else {
                        r18.m87150e0(-2007179250);
                        objM87133R10 = r18.m87133R();
                        if (objM87133R10 == c28676v3) {
                            objM87133R10 = new C32586b1(1, interfaceC28601c6);
                            r18.m87172p0(objM87133R10);
                        }
                        AbstractC17287g.m48960d(strM101666u, (InterfaceC4339a) objM87133R10, r18, 48);
                        r18.m87173q(r10);
                    }
                    r18.m87173q(r10);
                } else {
                    r18.m87150e0(-2007027226);
                    r18.m87173q(r10);
                }
                if (m101670y(interfaceC28601c5)) {
                    r18.m87150e0(-2006657210);
                    r18.m87173q(r10);
                } else {
                    r18.m87150e0(-2006657210);
                    r18.m87173q(r10);
                }
                interfaceC4339a5 = interfaceC4339a10;
                c22409u2 = c22409u3;
                interfaceC4339a4 = interfaceC4339a11;
                r14 = r18;
            } else {
                c28655q2.m87138X();
                interfaceC4339a4 = interfaceC4339a2;
                c22409u2 = c22409u4;
                interfaceC4339a5 = interfaceC4339a3;
                r14 = c28655q2;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a(attachmentUploadState, interfaceC4339a5, interfaceC4339a4, c22409u2, i13, i14, 26);
            }
        }
        i15 |= 48;
        interfaceC4339a3 = interfaceC4339a;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) != 0) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                } else {
                    if ((i13 & 4096) == 0) {
                        zM87157i2 = c28655q2.m87153g(c22409u4);
                    } else {
                        zM87157i2 = c28655q2.m87157i(c22409u4);
                    }
                    if (zM87157i2) {
                        i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                }
                i15 |= i28;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i29 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32513d(29);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32581a1(0);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a2;
                    }
                    if ((i14 & 8) != 0) {
                        c28655q2.m87152f0(-909571169);
                        c26669a = C29155a.f118017b;
                        if (c26669a == null) {
                            throw new IllegalStateException("KoinApplication has not been started");
                        }
                        c38266c = c26669a.f106046a.f159364d;
                        c28655q2.m87152f0(-3686552);
                        zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                        objM87133R = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        c28655q2.m87173q(false);
                        c22409u4 = (C22409u) objM87133R;
                        i15 &= -7169;
                    }
                    i19 = i15;
                    interfaceC4339a8 = interfaceC4339a6;
                    interfaceC4339a9 = interfaceC4339a7;
                } else {
                    if (i29 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32513d(29);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32581a1(0);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a2;
                    }
                    if ((i14 & 8) != 0) {
                        c28655q2.m87152f0(-909571169);
                        c26669a = C29155a.f118017b;
                        if (c26669a == null) {
                            throw new IllegalStateException("KoinApplication has not been started");
                        }
                        c38266c = c26669a.f106046a.f159364d;
                        c28655q2.m87152f0(-3686552);
                        zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                        objM87133R = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        c28655q2.m87173q(false);
                        c22409u4 = (C22409u) objM87133R;
                        i15 &= -7169;
                    }
                    i19 = i15;
                    interfaceC4339a8 = interfaceC4339a6;
                    interfaceC4339a9 = interfaceC4339a7;
                }
                c28655q2.m87175r();
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R4;
                boolean zIsFeatureEnabled3 = ((FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("whoop-coach-file-upload");
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R7;
                c28655q2.m87150e0(1874749563);
                if (attachmentUploadState.getIsUploading()) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                f13 = 1;
                f14 = 8;
                f15 = f13 * f14;
                c2314t = C2314t.f9131w;
                float f2110 = 4;
                Modifier modifierM118994r3 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(16 * f2110, AbstractC1099a.m3394p(f15, c2314t)), AbstractC33253j.m105489e(f2110));
                f16 = f2110;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM118994r3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                z14 = z13;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d3);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m7);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    interfaceC4339a10 = interfaceC4339a8;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N7);
                    i24 = b.f135051a[attachmentUploadState.getType().ordinal()];
                    if (i24 != 1) {
                        interfaceC28601c4 = interfaceC28601c1;
                        c22409u3 = c22409u4;
                        f17 = f15;
                        c2314t2 = c2314t;
                        i25 = i19;
                        interfaceC28601c5 = interfaceC28601c3;
                        f16 = f16;
                        interfaceC28601c6 = interfaceC28601c2;
                        c28655q2.m87150e0(1392973733);
                        abstractC22403oM131851c = attachmentUploadState.getImageSource();
                        if (abstractC22403oM131851c == null) {
                            c28655q2.m87150e0(1392973732);
                            c28655q2.m87173q(false);
                            z16 = false;
                            c28676v1 = c28676v0;
                            c28655q = c28655q2;
                        } else {
                            c28655q2.m87150e0(1392973733);
                            Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t2), "attachment_upload_image");
                            if (z14) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C32586b1(0, interfaceC28601c5);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            Modifier modifierM3362g5 = AbstractC1092a.m3362g(modifierM3599a5, z15, null, null, (InterfaceC4339a) objM87133R8, 14);
                            if (z14) {
                                f18 = f16;
                            } else {
                                f18 = 0;
                            }
                            c28676v1 = c28676v0;
                            z16 = false;
                            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM131851c, null, null, c28655q2, AbstractC22403o.f87638a, 3), AbstractC8693b.m21273g(AbstractC37336b.f159653W0, c28655q2, 0), AbstractC12313p.m34301s(f18, modifierM3362g5), null, null, 0.0f, null, c28655q2, 0, 120);
                            C28655q c28655q11 = c28655q2;
                            c28655q11.m87173q(false);
                            c28655q = c28655q11;
                        }
                        c28655q.m87173q(z16);
                        r10 = z16;
                        r15 = c28655q;
                    } else if (i24 != 2) {
                        c28655q2.m87150e0(1396086443);
                        c28655q2.m87173q(false);
                        interfaceC28601c6 = interfaceC28601c2;
                        c22409u3 = c22409u4;
                        r10 = 0;
                        f17 = f15;
                        c2314t2 = c2314t;
                        i25 = i19;
                        interfaceC28601c5 = interfaceC28601c3;
                        c28676v1 = c28676v0;
                        interfaceC28601c4 = interfaceC28601c1;
                        f16 = f16;
                        r15 = c28655q2;
                    } else {
                        c28655q2.m87150e0(1393719996);
                        Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
                        if (z14) {
                            f19 = f13 * f16;
                        } else {
                            f19 = 0;
                        }
                        Modifier modifierM34301s5 = AbstractC12313p.m34301s(f19, modifierM3407d5);
                        C38072d c38072d5 = C38072d.f163053a;
                        i26 = C38072d.f163054b;
                        Modifier modifierM3358c5 = AbstractC1092a.m3358c(modifierM34301s5, c38072d5.m121949b(c28655q2, i26).getWhite10(), AbstractC17918w0.f69621a);
                        if (attachmentUploadState.getIsUploading()) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        zM87157i = c28655q2.m87157i(attachmentUploadState) | c28655q2.m87157i(interfaceC2994c0) | ((((i19 & 7168) ^ 3072) <= 2048 && c28655q2.m87157i(c22409u4)) || (i19 & 3072) == 2048);
                        Object objM87133R17 = c28655q2.m87133R();
                        if (zM87157i) {
                            c22409u3 = c22409u4;
                            interfaceC28601c6 = interfaceC28601c2;
                            i27 = i26;
                            interfaceC28601c4 = interfaceC28601c1;
                            c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                            c28655q2.m87172p0(c0073h);
                        } else {
                            c22409u3 = c22409u4;
                            interfaceC28601c6 = interfaceC28601c2;
                            i27 = i26;
                            interfaceC28601c4 = interfaceC28601c1;
                            c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                            c28655q2.m87172p0(c0073h);
                        }
                        Modifier modifierM3395q5 = AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM3358c5, z17, null, null, (InterfaceC4339a) c0073h, 14), f15, 2 * f14);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3395q5);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m8);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N8);
                        Modifier modifierM3488c5 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(5 * f16, c2314t), 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C32375n(17);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        Modifier modifierM3480c5 = AbstractC1125a.m3480c(modifierM3488c5, (Function1) objM87133R11);
                        interfaceC28601c5 = interfaceC28601c3;
                        int i3116 = i19;
                        c2314t2 = c2314t;
                        f17 = f15;
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q2, 0), null, modifierM3480c5, 0L, c28655q2, 48, 8);
                        strM131849a = attachmentUploadState.getDisplayName();
                        if (strM131849a.length() == 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            strM131849a = "document.pdf";
                        }
                        int i3117 = i27;
                        AbstractC30795n.m94707h(strM131849a, AbstractC1102d.m3409f(1.0f, c2314t2), c38072d5.m121949b(c28655q2, i3117).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, 0, null, c38072d5.m121952e(c28655q2, i3117).getFormLabel(), null, c28655q2, 48, (C2886a.f11498d << 18) | 3120, 185848);
                        C28655q c28655q12 = c28655q2;
                        c28655q12.m87173q(true);
                        c28655q12.m87173q(false);
                        i25 = i3116;
                        r10 = 0;
                        c28676v1 = c28676v0;
                        r15 = c28655q12;
                    }
                    if (attachmentUploadState.getIsUploading()) {
                        r15.m87150e0(1396186790);
                        C21084j c21084j8 = new C21084j();
                        if ((i25 & 112) == 32) {
                            r16 = 1;
                        } else {
                            r16 = r10;
                        }
                        objM87133R9 = r15.m87133R();
                        if (r16 == 0) {
                            c28676v2 = c28676v1;
                            if (objM87133R9 == c28676v2) {
                            }
                            Modifier modifierM3398t15 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j8, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                            ?? r11115 = C38072d.f163053a;
                            int i3118 = C38072d.f163054b;
                            float f2111 = 2;
                            Modifier modifierM3419p15 = AbstractC1102d.m3419p(f2111 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f2111, AbstractC1092a.m3358c(modifierM3398t15, r11115.m121949b(r15, i3118).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                            c28676v3 = c28676v2;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r11115.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p15, r11115.m121949b(r15, i3118).getBlack70(), r15, 0, 0);
                            r15.m87173q(r10);
                        } else {
                            c28676v2 = c28676v1;
                        }
                        objM87133R9 = new C32579a(interfaceC4339a10, 6);
                        r15.m87172p0(objM87133R9);
                        Modifier modifierM3398t16 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j8, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r11116 = C38072d.f163053a;
                        int i3119 = C38072d.f163054b;
                        float f2112 = 2;
                        Modifier modifierM3419p16 = AbstractC1102d.m3419p(f2112 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f2112, AbstractC1092a.m3358c(modifierM3398t16, r11116.m121949b(r15, i3119).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r11116.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p16, r11116.m121949b(r15, i3119).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    } else {
                        r15.m87150e0(1396186790);
                        C21084j c21084j9 = new C21084j();
                        if ((i25 & 112) == 32) {
                            r16 = 1;
                        } else {
                            r16 = r10;
                        }
                        objM87133R9 = r15.m87133R();
                        if (r16 == 0) {
                            c28676v2 = c28676v1;
                            if (objM87133R9 == c28676v2) {
                            }
                            Modifier modifierM3398t17 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j9, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                            ?? r11117 = C38072d.f163053a;
                            int i31110 = C38072d.f163054b;
                            float f2113 = 2;
                            Modifier modifierM3419p17 = AbstractC1102d.m3419p(f2113 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f2113, AbstractC1092a.m3358c(modifierM3398t17, r11117.m121949b(r15, i31110).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                            c28676v3 = c28676v2;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r11117.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p17, r11117.m121949b(r15, i31110).getBlack70(), r15, 0, 0);
                            r15.m87173q(r10);
                        } else {
                            c28676v2 = c28676v1;
                        }
                        objM87133R9 = new C32579a(interfaceC4339a10, 6);
                        r15.m87172p0(objM87133R9);
                        Modifier modifierM3398t18 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j9, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r11118 = C38072d.f163053a;
                        int i31111 = C38072d.f163054b;
                        float f2114 = 2;
                        Modifier modifierM3419p18 = AbstractC1102d.m3419p(f2114 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f2114, AbstractC1092a.m3358c(modifierM3398t18, r11118.m121949b(r15, i31111).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r11118.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p18, r11118.m121949b(r15, i31111).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    }
                    if (attachmentUploadState.getIsError()) {
                        r15.m87150e0(1396989473);
                        ?? r11119 = r15;
                        InterfaceC4339a interfaceC4339a16 = interfaceC4339a9;
                        AbstractC14983d3.m43104a(interfaceC4339a16, null, false, C32636l1.f135259a.m101924b(), r11119, ((i25 >> 6) & 14) | 24576, 14);
                        interfaceC4339a11 = interfaceC4339a16;
                        ?? r111110 = r11119;
                        r111110.m87173q(r10);
                        r17 = r111110;
                    } else {
                        interfaceC4339a11 = interfaceC4339a9;
                        r15.m87150e0(1397523789);
                        r15.m87173q(r10);
                        r17 = r15;
                    }
                    if (attachmentUploadState.getIsUploading()) {
                        r17.m87150e0(1397561392);
                        ?? r37 = r17;
                        AbstractC35684p.m113047h(AbstractC1102d.m3419p(5 * f16, c2314t2), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r37, 6, 508);
                        ?? r111111 = r37;
                        r111111.m87173q(r10);
                        r18 = r111111;
                    } else {
                        r17.m87150e0(1397773773);
                        r17.m87173q(r10);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(r10);
                    if (m101668w(interfaceC28601c6)) {
                        r18.m87150e0(1874914932);
                        strM101666u = m101666u(interfaceC28601c4);
                        if (strM101666u == null) {
                            r18.m87150e0(-2007179251);
                            r18.m87173q(r10);
                        } else {
                            r18.m87150e0(-2007179250);
                            objM87133R10 = r18.m87133R();
                            if (objM87133R10 == c28676v3) {
                                objM87133R10 = new C32586b1(1, interfaceC28601c6);
                                r18.m87172p0(objM87133R10);
                            }
                            AbstractC17287g.m48960d(strM101666u, (InterfaceC4339a) objM87133R10, r18, 48);
                            r18.m87173q(r10);
                        }
                        r18.m87173q(r10);
                    } else {
                        r18.m87150e0(-2007027226);
                        r18.m87173q(r10);
                    }
                    if (m101670y(interfaceC28601c5)) {
                        r18.m87150e0(-2006657210);
                        r18.m87173q(r10);
                    } else {
                        r18.m87150e0(-2006657210);
                        r18.m87173q(r10);
                    }
                    interfaceC4339a5 = interfaceC4339a10;
                    c22409u2 = c22409u3;
                    interfaceC4339a4 = interfaceC4339a11;
                    r14 = r18;
                } else {
                    interfaceC4339a10 = interfaceC4339a8;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N7);
                i24 = b.f135051a[attachmentUploadState.getType().ordinal()];
                if (i24 != 1) {
                    interfaceC28601c4 = interfaceC28601c1;
                    c22409u3 = c22409u4;
                    f17 = f15;
                    c2314t2 = c2314t;
                    i25 = i19;
                    interfaceC28601c5 = interfaceC28601c3;
                    f16 = f16;
                    interfaceC28601c6 = interfaceC28601c2;
                    c28655q2.m87150e0(1392973733);
                    abstractC22403oM131851c = attachmentUploadState.getImageSource();
                    if (abstractC22403oM131851c == null) {
                        c28655q2.m87150e0(1392973732);
                        c28655q2.m87173q(false);
                        z16 = false;
                        c28676v1 = c28676v0;
                        c28655q = c28655q2;
                    } else {
                        c28655q2.m87150e0(1392973733);
                        Modifier modifierM3599a6 = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t2), "attachment_upload_image");
                        if (z14) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C32586b1(0, interfaceC28601c5);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        Modifier modifierM3362g6 = AbstractC1092a.m3362g(modifierM3599a6, z15, null, null, (InterfaceC4339a) objM87133R8, 14);
                        if (z14) {
                            f18 = f16;
                        } else {
                            f18 = 0;
                        }
                        c28676v1 = c28676v0;
                        z16 = false;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM131851c, null, null, c28655q2, AbstractC22403o.f87638a, 3), AbstractC8693b.m21273g(AbstractC37336b.f159653W0, c28655q2, 0), AbstractC12313p.m34301s(f18, modifierM3362g6), null, null, 0.0f, null, c28655q2, 0, 120);
                        C28655q c28655q13 = c28655q2;
                        c28655q13.m87173q(false);
                        c28655q = c28655q13;
                    }
                    c28655q.m87173q(z16);
                    r10 = z16;
                    r15 = c28655q;
                } else if (i24 != 2) {
                    c28655q2.m87150e0(1396086443);
                    c28655q2.m87173q(false);
                    interfaceC28601c6 = interfaceC28601c2;
                    c22409u3 = c22409u4;
                    r10 = 0;
                    f17 = f15;
                    c2314t2 = c2314t;
                    i25 = i19;
                    interfaceC28601c5 = interfaceC28601c3;
                    c28676v1 = c28676v0;
                    interfaceC28601c4 = interfaceC28601c1;
                    f16 = f16;
                    r15 = c28655q2;
                } else {
                    c28655q2.m87150e0(1393719996);
                    Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, c2314t);
                    if (z14) {
                        f19 = f13 * f16;
                    } else {
                        f19 = 0;
                    }
                    Modifier modifierM34301s6 = AbstractC12313p.m34301s(f19, modifierM3407d6);
                    C38072d c38072d6 = C38072d.f163053a;
                    i26 = C38072d.f163054b;
                    Modifier modifierM3358c6 = AbstractC1092a.m3358c(modifierM34301s6, c38072d6.m121949b(c28655q2, i26).getWhite10(), AbstractC17918w0.f69621a);
                    if (attachmentUploadState.getIsUploading()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    zM87157i = c28655q2.m87157i(attachmentUploadState) | c28655q2.m87157i(interfaceC2994c0) | ((((i19 & 7168) ^ 3072) <= 2048 && c28655q2.m87157i(c22409u4)) || (i19 & 3072) == 2048);
                    Object objM87133R18 = c28655q2.m87133R();
                    if (zM87157i) {
                        c22409u3 = c22409u4;
                        interfaceC28601c6 = interfaceC28601c2;
                        i27 = i26;
                        interfaceC28601c4 = interfaceC28601c1;
                        c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                        c28655q2.m87172p0(c0073h);
                    } else {
                        c22409u3 = c22409u4;
                        interfaceC28601c6 = interfaceC28601c2;
                        i27 = i26;
                        interfaceC28601c4 = interfaceC28601c1;
                        c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                        c28655q2.m87172p0(c0073h);
                    }
                    Modifier modifierM3395q6 = AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM3358c6, z17, null, null, (InterfaceC4339a) c0073h, 14), f15, 2 * f14);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3395q6);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m9);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N9);
                    Modifier modifierM3488c6 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(5 * f16, c2314t), 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C32375n(17);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    Modifier modifierM3480c6 = AbstractC1125a.m3480c(modifierM3488c6, (Function1) objM87133R11);
                    interfaceC28601c5 = interfaceC28601c3;
                    int i31112 = i19;
                    c2314t2 = c2314t;
                    f17 = f15;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q2, 0), null, modifierM3480c6, 0L, c28655q2, 48, 8);
                    strM131849a = attachmentUploadState.getDisplayName();
                    if (strM131849a.length() == 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        strM131849a = "document.pdf";
                    }
                    int i31113 = i27;
                    AbstractC30795n.m94707h(strM131849a, AbstractC1102d.m3409f(1.0f, c2314t2), c38072d6.m121949b(c28655q2, i31113).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, 0, null, c38072d6.m121952e(c28655q2, i31113).getFormLabel(), null, c28655q2, 48, (C2886a.f11498d << 18) | 3120, 185848);
                    C28655q c28655q14 = c28655q2;
                    c28655q14.m87173q(true);
                    c28655q14.m87173q(false);
                    i25 = i31112;
                    r10 = 0;
                    c28676v1 = c28676v0;
                    r15 = c28655q14;
                }
                if (attachmentUploadState.getIsUploading()) {
                    r15.m87150e0(1396186790);
                    C21084j c21084j10 = new C21084j();
                    if ((i25 & 112) == 32) {
                        r16 = 1;
                    } else {
                        r16 = r10;
                    }
                    objM87133R9 = r15.m87133R();
                    if (r16 == 0) {
                        c28676v2 = c28676v1;
                        if (objM87133R9 == c28676v2) {
                        }
                        Modifier modifierM3398t19 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j10, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r111112 = C38072d.f163053a;
                        int i31114 = C38072d.f163054b;
                        float f2115 = 2;
                        Modifier modifierM3419p19 = AbstractC1102d.m3419p(f2115 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f2115, AbstractC1092a.m3358c(modifierM3398t19, r111112.m121949b(r15, i31114).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r111112.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p19, r111112.m121949b(r15, i31114).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    } else {
                        c28676v2 = c28676v1;
                    }
                    objM87133R9 = new C32579a(interfaceC4339a10, 6);
                    r15.m87172p0(objM87133R9);
                    Modifier modifierM3398t110 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j10, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                    ?? r111113 = C38072d.f163053a;
                    int i31115 = C38072d.f163054b;
                    float f2116 = 2;
                    Modifier modifierM3419p110 = AbstractC1102d.m3419p(f2116 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f2116, AbstractC1092a.m3358c(modifierM3398t110, r111113.m121949b(r15, i31115).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                    c28676v3 = c28676v2;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r111113.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p110, r111113.m121949b(r15, i31115).getBlack70(), r15, 0, 0);
                    r15.m87173q(r10);
                } else {
                    r15.m87150e0(1396186790);
                    C21084j c21084j11 = new C21084j();
                    if ((i25 & 112) == 32) {
                        r16 = 1;
                    } else {
                        r16 = r10;
                    }
                    objM87133R9 = r15.m87133R();
                    if (r16 == 0) {
                        c28676v2 = c28676v1;
                        if (objM87133R9 == c28676v2) {
                        }
                        Modifier modifierM3398t111 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j11, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r111114 = C38072d.f163053a;
                        int i31116 = C38072d.f163054b;
                        float f2117 = 2;
                        Modifier modifierM3419p111 = AbstractC1102d.m3419p(f2117 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f2117, AbstractC1092a.m3358c(modifierM3398t111, r111114.m121949b(r15, i31116).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r111114.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p111, r111114.m121949b(r15, i31116).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    } else {
                        c28676v2 = c28676v1;
                    }
                    objM87133R9 = new C32579a(interfaceC4339a10, 6);
                    r15.m87172p0(objM87133R9);
                    Modifier modifierM3398t112 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j11, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                    ?? r111115 = C38072d.f163053a;
                    int i31117 = C38072d.f163054b;
                    float f2118 = 2;
                    Modifier modifierM3419p112 = AbstractC1102d.m3419p(f2118 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f2118, AbstractC1092a.m3358c(modifierM3398t112, r111115.m121949b(r15, i31117).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                    c28676v3 = c28676v2;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r111115.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p112, r111115.m121949b(r15, i31117).getBlack70(), r15, 0, 0);
                    r15.m87173q(r10);
                }
                if (attachmentUploadState.getIsError()) {
                    r15.m87150e0(1396989473);
                    ?? r111116 = r15;
                    InterfaceC4339a interfaceC4339a17 = interfaceC4339a9;
                    AbstractC14983d3.m43104a(interfaceC4339a17, null, false, C32636l1.f135259a.m101924b(), r111116, ((i25 >> 6) & 14) | 24576, 14);
                    interfaceC4339a11 = interfaceC4339a17;
                    ?? r111117 = r111116;
                    r111117.m87173q(r10);
                    r17 = r111117;
                } else {
                    interfaceC4339a11 = interfaceC4339a9;
                    r15.m87150e0(1397523789);
                    r15.m87173q(r10);
                    r17 = r15;
                }
                if (attachmentUploadState.getIsUploading()) {
                    r17.m87150e0(1397561392);
                    ?? r38 = r17;
                    AbstractC35684p.m113047h(AbstractC1102d.m3419p(5 * f16, c2314t2), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r38, 6, 508);
                    ?? r111118 = r38;
                    r111118.m87173q(r10);
                    r18 = r111118;
                } else {
                    r17.m87150e0(1397773773);
                    r17.m87173q(r10);
                    r18 = r17;
                }
                r18.m87173q(true);
                r18.m87173q(r10);
                if (m101668w(interfaceC28601c6)) {
                    r18.m87150e0(1874914932);
                    strM101666u = m101666u(interfaceC28601c4);
                    if (strM101666u == null) {
                        r18.m87150e0(-2007179251);
                        r18.m87173q(r10);
                    } else {
                        r18.m87150e0(-2007179250);
                        objM87133R10 = r18.m87133R();
                        if (objM87133R10 == c28676v3) {
                            objM87133R10 = new C32586b1(1, interfaceC28601c6);
                            r18.m87172p0(objM87133R10);
                        }
                        AbstractC17287g.m48960d(strM101666u, (InterfaceC4339a) objM87133R10, r18, 48);
                        r18.m87173q(r10);
                    }
                    r18.m87173q(r10);
                } else {
                    r18.m87150e0(-2007027226);
                    r18.m87173q(r10);
                }
                if (m101670y(interfaceC28601c5)) {
                    r18.m87150e0(-2006657210);
                    r18.m87173q(r10);
                } else {
                    r18.m87150e0(-2006657210);
                    r18.m87173q(r10);
                }
                interfaceC4339a5 = interfaceC4339a10;
                c22409u2 = c22409u3;
                interfaceC4339a4 = interfaceC4339a11;
                r14 = r18;
            } else {
                c28655q2.m87138X();
                interfaceC4339a4 = interfaceC4339a2;
                c22409u2 = c22409u4;
                interfaceC4339a5 = interfaceC4339a3;
                r14 = c28655q2;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a(attachmentUploadState, interfaceC4339a5, interfaceC4339a4, c22409u2, i13, i14, 26);
            }
        }
        i15 |= 384;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) != 0) {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                if ((i13 & 4096) == 0) {
                    zM87157i2 = c28655q2.m87153g(c22409u4);
                } else {
                    zM87157i2 = c28655q2.m87157i(c22409u4);
                }
                if (zM87157i2) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
            }
            i15 |= i28;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            i18 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if (i29 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32513d(29);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a6 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32581a1(0);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a2;
                }
                if ((i14 & 8) != 0) {
                    c28655q2.m87152f0(-909571169);
                    c26669a = C29155a.f118017b;
                    if (c26669a == null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c = c26669a.f106046a.f159364d;
                    c28655q2.m87152f0(-3686552);
                    zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                    objM87133R = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    c28655q2.m87173q(false);
                    c22409u4 = (C22409u) objM87133R;
                    i15 &= -7169;
                }
                i19 = i15;
                interfaceC4339a8 = interfaceC4339a6;
                interfaceC4339a9 = interfaceC4339a7;
            } else {
                if (i29 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32513d(29);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a6 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32581a1(0);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a2;
                }
                if ((i14 & 8) != 0) {
                    c28655q2.m87152f0(-909571169);
                    c26669a = C29155a.f118017b;
                    if (c26669a == null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c = c26669a.f106046a.f159364d;
                    c28655q2.m87152f0(-3686552);
                    zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                    objM87133R = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    c28655q2.m87173q(false);
                    c22409u4 = (C22409u) objM87133R;
                    i15 &= -7169;
                }
                i19 = i15;
                interfaceC4339a8 = interfaceC4339a6;
                interfaceC4339a9 = interfaceC4339a7;
            }
            c28655q2.m87175r();
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R4);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R4;
            boolean zIsFeatureEnabled4 = ((FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("whoop-coach-file-upload");
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R5);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
            objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R6);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R6;
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R7);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R7;
            c28655q2.m87150e0(1874749563);
            if (attachmentUploadState.getIsUploading()) {
                z13 = true;
            } else {
                z13 = true;
            }
            f13 = 1;
            f14 = 8;
            f15 = f13 * f14;
            c2314t = C2314t.f9131w;
            float f2119 = 4;
            Modifier modifierM118994r4 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(16 * f2119, AbstractC1099a.m3394p(f15, c2314t)), AbstractC33253j.m105489e(f2119));
            f16 = f2119;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM118994r4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            z14 = z13;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m10);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                interfaceC4339a10 = interfaceC4339a8;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N10);
                i24 = b.f135051a[attachmentUploadState.getType().ordinal()];
                if (i24 != 1) {
                    interfaceC28601c4 = interfaceC28601c1;
                    c22409u3 = c22409u4;
                    f17 = f15;
                    c2314t2 = c2314t;
                    i25 = i19;
                    interfaceC28601c5 = interfaceC28601c3;
                    f16 = f16;
                    interfaceC28601c6 = interfaceC28601c2;
                    c28655q2.m87150e0(1392973733);
                    abstractC22403oM131851c = attachmentUploadState.getImageSource();
                    if (abstractC22403oM131851c == null) {
                        c28655q2.m87150e0(1392973732);
                        c28655q2.m87173q(false);
                        z16 = false;
                        c28676v1 = c28676v0;
                        c28655q = c28655q2;
                    } else {
                        c28655q2.m87150e0(1392973733);
                        Modifier modifierM3599a7 = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t2), "attachment_upload_image");
                        if (z14) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C32586b1(0, interfaceC28601c5);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        Modifier modifierM3362g7 = AbstractC1092a.m3362g(modifierM3599a7, z15, null, null, (InterfaceC4339a) objM87133R8, 14);
                        if (z14) {
                            f18 = f16;
                        } else {
                            f18 = 0;
                        }
                        c28676v1 = c28676v0;
                        z16 = false;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM131851c, null, null, c28655q2, AbstractC22403o.f87638a, 3), AbstractC8693b.m21273g(AbstractC37336b.f159653W0, c28655q2, 0), AbstractC12313p.m34301s(f18, modifierM3362g7), null, null, 0.0f, null, c28655q2, 0, 120);
                        C28655q c28655q15 = c28655q2;
                        c28655q15.m87173q(false);
                        c28655q = c28655q15;
                    }
                    c28655q.m87173q(z16);
                    r10 = z16;
                    r15 = c28655q;
                } else if (i24 != 2) {
                    c28655q2.m87150e0(1396086443);
                    c28655q2.m87173q(false);
                    interfaceC28601c6 = interfaceC28601c2;
                    c22409u3 = c22409u4;
                    r10 = 0;
                    f17 = f15;
                    c2314t2 = c2314t;
                    i25 = i19;
                    interfaceC28601c5 = interfaceC28601c3;
                    c28676v1 = c28676v0;
                    interfaceC28601c4 = interfaceC28601c1;
                    f16 = f16;
                    r15 = c28655q2;
                } else {
                    c28655q2.m87150e0(1393719996);
                    Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, c2314t);
                    if (z14) {
                        f19 = f13 * f16;
                    } else {
                        f19 = 0;
                    }
                    Modifier modifierM34301s7 = AbstractC12313p.m34301s(f19, modifierM3407d7);
                    C38072d c38072d7 = C38072d.f163053a;
                    i26 = C38072d.f163054b;
                    Modifier modifierM3358c7 = AbstractC1092a.m3358c(modifierM34301s7, c38072d7.m121949b(c28655q2, i26).getWhite10(), AbstractC17918w0.f69621a);
                    if (attachmentUploadState.getIsUploading()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    zM87157i = c28655q2.m87157i(attachmentUploadState) | c28655q2.m87157i(interfaceC2994c0) | ((((i19 & 7168) ^ 3072) <= 2048 && c28655q2.m87157i(c22409u4)) || (i19 & 3072) == 2048);
                    Object objM87133R19 = c28655q2.m87133R();
                    if (zM87157i) {
                        c22409u3 = c22409u4;
                        interfaceC28601c6 = interfaceC28601c2;
                        i27 = i26;
                        interfaceC28601c4 = interfaceC28601c1;
                        c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                        c28655q2.m87172p0(c0073h);
                    } else {
                        c22409u3 = c22409u4;
                        interfaceC28601c6 = interfaceC28601c2;
                        i27 = i26;
                        interfaceC28601c4 = interfaceC28601c1;
                        c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                        c28655q2.m87172p0(c0073h);
                    }
                    Modifier modifierM3395q7 = AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM3358c7, z17, null, null, (InterfaceC4339a) c0073h, 14), f15, 2 * f14);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3395q7);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11);
                    Modifier modifierM3488c7 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(5 * f16, c2314t), 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C32375n(17);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    Modifier modifierM3480c7 = AbstractC1125a.m3480c(modifierM3488c7, (Function1) objM87133R11);
                    interfaceC28601c5 = interfaceC28601c3;
                    int i31118 = i19;
                    c2314t2 = c2314t;
                    f17 = f15;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q2, 0), null, modifierM3480c7, 0L, c28655q2, 48, 8);
                    strM131849a = attachmentUploadState.getDisplayName();
                    if (strM131849a.length() == 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        strM131849a = "document.pdf";
                    }
                    int i31119 = i27;
                    AbstractC30795n.m94707h(strM131849a, AbstractC1102d.m3409f(1.0f, c2314t2), c38072d7.m121949b(c28655q2, i31119).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, 0, null, c38072d7.m121952e(c28655q2, i31119).getFormLabel(), null, c28655q2, 48, (C2886a.f11498d << 18) | 3120, 185848);
                    C28655q c28655q16 = c28655q2;
                    c28655q16.m87173q(true);
                    c28655q16.m87173q(false);
                    i25 = i31118;
                    r10 = 0;
                    c28676v1 = c28676v0;
                    r15 = c28655q16;
                }
                if (attachmentUploadState.getIsUploading()) {
                    r15.m87150e0(1396186790);
                    C21084j c21084j12 = new C21084j();
                    if ((i25 & 112) == 32) {
                        r16 = 1;
                    } else {
                        r16 = r10;
                    }
                    objM87133R9 = r15.m87133R();
                    if (r16 == 0) {
                        c28676v2 = c28676v1;
                        if (objM87133R9 == c28676v2) {
                        }
                        Modifier modifierM3398t113 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j12, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r111119 = C38072d.f163053a;
                        int i311110 = C38072d.f163054b;
                        float f21110 = 2;
                        Modifier modifierM3419p113 = AbstractC1102d.m3419p(f21110 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f21110, AbstractC1092a.m3358c(modifierM3398t113, r111119.m121949b(r15, i311110).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r111119.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p113, r111119.m121949b(r15, i311110).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    } else {
                        c28676v2 = c28676v1;
                    }
                    objM87133R9 = new C32579a(interfaceC4339a10, 6);
                    r15.m87172p0(objM87133R9);
                    Modifier modifierM3398t114 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j12, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                    ?? r1111110 = C38072d.f163053a;
                    int i311111 = C38072d.f163054b;
                    float f21111 = 2;
                    Modifier modifierM3419p114 = AbstractC1102d.m3419p(f21111 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f21111, AbstractC1092a.m3358c(modifierM3398t114, r1111110.m121949b(r15, i311111).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                    c28676v3 = c28676v2;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1111110.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p114, r1111110.m121949b(r15, i311111).getBlack70(), r15, 0, 0);
                    r15.m87173q(r10);
                } else {
                    r15.m87150e0(1396186790);
                    C21084j c21084j13 = new C21084j();
                    if ((i25 & 112) == 32) {
                        r16 = 1;
                    } else {
                        r16 = r10;
                    }
                    objM87133R9 = r15.m87133R();
                    if (r16 == 0) {
                        c28676v2 = c28676v1;
                        if (objM87133R9 == c28676v2) {
                        }
                        Modifier modifierM3398t115 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j13, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                        ?? r1111111 = C38072d.f163053a;
                        int i311112 = C38072d.f163054b;
                        float f21112 = 2;
                        Modifier modifierM3419p115 = AbstractC1102d.m3419p(f21112 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f21112, AbstractC1092a.m3358c(modifierM3398t115, r1111111.m121949b(r15, i311112).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                        c28676v3 = c28676v2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1111111.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p115, r1111111.m121949b(r15, i311112).getBlack70(), r15, 0, 0);
                        r15.m87173q(r10);
                    } else {
                        c28676v2 = c28676v1;
                    }
                    objM87133R9 = new C32579a(interfaceC4339a10, 6);
                    r15.m87172p0(objM87133R9);
                    Modifier modifierM3398t116 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j13, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                    ?? r1111112 = C38072d.f163053a;
                    int i311113 = C38072d.f163054b;
                    float f21113 = 2;
                    Modifier modifierM3419p116 = AbstractC1102d.m3419p(f21113 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f21113, AbstractC1092a.m3358c(modifierM3398t116, r1111112.m121949b(r15, i311113).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                    c28676v3 = c28676v2;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1111112.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p116, r1111112.m121949b(r15, i311113).getBlack70(), r15, 0, 0);
                    r15.m87173q(r10);
                }
                if (attachmentUploadState.getIsError()) {
                    r15.m87150e0(1396989473);
                    ?? r1111113 = r15;
                    InterfaceC4339a interfaceC4339a18 = interfaceC4339a9;
                    AbstractC14983d3.m43104a(interfaceC4339a18, null, false, C32636l1.f135259a.m101924b(), r1111113, ((i25 >> 6) & 14) | 24576, 14);
                    interfaceC4339a11 = interfaceC4339a18;
                    ?? r1111114 = r1111113;
                    r1111114.m87173q(r10);
                    r17 = r1111114;
                } else {
                    interfaceC4339a11 = interfaceC4339a9;
                    r15.m87150e0(1397523789);
                    r15.m87173q(r10);
                    r17 = r15;
                }
                if (attachmentUploadState.getIsUploading()) {
                    r17.m87150e0(1397561392);
                    ?? r39 = r17;
                    AbstractC35684p.m113047h(AbstractC1102d.m3419p(5 * f16, c2314t2), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r39, 6, 508);
                    ?? r1111115 = r39;
                    r1111115.m87173q(r10);
                    r18 = r1111115;
                } else {
                    r17.m87150e0(1397773773);
                    r17.m87173q(r10);
                    r18 = r17;
                }
                r18.m87173q(true);
                r18.m87173q(r10);
                if (m101668w(interfaceC28601c6)) {
                    r18.m87150e0(1874914932);
                    strM101666u = m101666u(interfaceC28601c4);
                    if (strM101666u == null) {
                        r18.m87150e0(-2007179251);
                        r18.m87173q(r10);
                    } else {
                        r18.m87150e0(-2007179250);
                        objM87133R10 = r18.m87133R();
                        if (objM87133R10 == c28676v3) {
                            objM87133R10 = new C32586b1(1, interfaceC28601c6);
                            r18.m87172p0(objM87133R10);
                        }
                        AbstractC17287g.m48960d(strM101666u, (InterfaceC4339a) objM87133R10, r18, 48);
                        r18.m87173q(r10);
                    }
                    r18.m87173q(r10);
                } else {
                    r18.m87150e0(-2007027226);
                    r18.m87173q(r10);
                }
                if (m101670y(interfaceC28601c5)) {
                    r18.m87150e0(-2006657210);
                    r18.m87173q(r10);
                } else {
                    r18.m87150e0(-2006657210);
                    r18.m87173q(r10);
                }
                interfaceC4339a5 = interfaceC4339a10;
                c22409u2 = c22409u3;
                interfaceC4339a4 = interfaceC4339a11;
                r14 = r18;
            } else {
                interfaceC4339a10 = interfaceC4339a8;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N10);
            i24 = b.f135051a[attachmentUploadState.getType().ordinal()];
            if (i24 != 1) {
                interfaceC28601c4 = interfaceC28601c1;
                c22409u3 = c22409u4;
                f17 = f15;
                c2314t2 = c2314t;
                i25 = i19;
                interfaceC28601c5 = interfaceC28601c3;
                f16 = f16;
                interfaceC28601c6 = interfaceC28601c2;
                c28655q2.m87150e0(1392973733);
                abstractC22403oM131851c = attachmentUploadState.getImageSource();
                if (abstractC22403oM131851c == null) {
                    c28655q2.m87150e0(1392973732);
                    c28655q2.m87173q(false);
                    z16 = false;
                    c28676v1 = c28676v0;
                    c28655q = c28655q2;
                } else {
                    c28655q2.m87150e0(1392973733);
                    Modifier modifierM3599a8 = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t2), "attachment_upload_image");
                    if (z14) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C32586b1(0, interfaceC28601c5);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    Modifier modifierM3362g8 = AbstractC1092a.m3362g(modifierM3599a8, z15, null, null, (InterfaceC4339a) objM87133R8, 14);
                    if (z14) {
                        f18 = f16;
                    } else {
                        f18 = 0;
                    }
                    c28676v1 = c28676v0;
                    z16 = false;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM131851c, null, null, c28655q2, AbstractC22403o.f87638a, 3), AbstractC8693b.m21273g(AbstractC37336b.f159653W0, c28655q2, 0), AbstractC12313p.m34301s(f18, modifierM3362g8), null, null, 0.0f, null, c28655q2, 0, 120);
                    C28655q c28655q17 = c28655q2;
                    c28655q17.m87173q(false);
                    c28655q = c28655q17;
                }
                c28655q.m87173q(z16);
                r10 = z16;
                r15 = c28655q;
            } else if (i24 != 2) {
                c28655q2.m87150e0(1396086443);
                c28655q2.m87173q(false);
                interfaceC28601c6 = interfaceC28601c2;
                c22409u3 = c22409u4;
                r10 = 0;
                f17 = f15;
                c2314t2 = c2314t;
                i25 = i19;
                interfaceC28601c5 = interfaceC28601c3;
                c28676v1 = c28676v0;
                interfaceC28601c4 = interfaceC28601c1;
                f16 = f16;
                r15 = c28655q2;
            } else {
                c28655q2.m87150e0(1393719996);
                Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, c2314t);
                if (z14) {
                    f19 = f13 * f16;
                } else {
                    f19 = 0;
                }
                Modifier modifierM34301s8 = AbstractC12313p.m34301s(f19, modifierM3407d8);
                C38072d c38072d8 = C38072d.f163053a;
                i26 = C38072d.f163054b;
                Modifier modifierM3358c8 = AbstractC1092a.m3358c(modifierM34301s8, c38072d8.m121949b(c28655q2, i26).getWhite10(), AbstractC17918w0.f69621a);
                if (attachmentUploadState.getIsUploading()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                zM87157i = c28655q2.m87157i(attachmentUploadState) | c28655q2.m87157i(interfaceC2994c0) | ((((i19 & 7168) ^ 3072) <= 2048 && c28655q2.m87157i(c22409u4)) || (i19 & 3072) == 2048);
                Object objM87133R110 = c28655q2.m87133R();
                if (zM87157i) {
                    c22409u3 = c22409u4;
                    interfaceC28601c6 = interfaceC28601c2;
                    i27 = i26;
                    interfaceC28601c4 = interfaceC28601c1;
                    c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                    c28655q2.m87172p0(c0073h);
                } else {
                    c22409u3 = c22409u4;
                    interfaceC28601c6 = interfaceC28601c2;
                    i27 = i26;
                    interfaceC28601c4 = interfaceC28601c1;
                    c0073h = new C0073h(attachmentUploadState, interfaceC2994c0, interfaceC28601c4, interfaceC28601c6, c22409u3, 21);
                    c28655q2.m87172p0(c0073h);
                }
                Modifier modifierM3395q8 = AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM3358c8, z17, null, null, (InterfaceC4339a) c0073h, 14), f15, 2 * f14);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3395q8);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m12);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N12);
                Modifier modifierM3488c8 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(5 * f16, c2314t), 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C32375n(17);
                    c28655q2.m87172p0(objM87133R11);
                }
                Modifier modifierM3480c8 = AbstractC1125a.m3480c(modifierM3488c8, (Function1) objM87133R11);
                interfaceC28601c5 = interfaceC28601c3;
                int i311114 = i19;
                c2314t2 = c2314t;
                f17 = f15;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q2, 0), null, modifierM3480c8, 0L, c28655q2, 48, 8);
                strM131849a = attachmentUploadState.getDisplayName();
                if (strM131849a.length() == 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    strM131849a = "document.pdf";
                }
                int i311115 = i27;
                AbstractC30795n.m94707h(strM131849a, AbstractC1102d.m3409f(1.0f, c2314t2), c38072d8.m121949b(c28655q2, i311115).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, 0, null, c38072d8.m121952e(c28655q2, i311115).getFormLabel(), null, c28655q2, 48, (C2886a.f11498d << 18) | 3120, 185848);
                C28655q c28655q18 = c28655q2;
                c28655q18.m87173q(true);
                c28655q18.m87173q(false);
                i25 = i311114;
                r10 = 0;
                c28676v1 = c28676v0;
                r15 = c28655q18;
            }
            if (attachmentUploadState.getIsUploading()) {
                r15.m87150e0(1396186790);
                C21084j c21084j14 = new C21084j();
                if ((i25 & 112) == 32) {
                    r16 = 1;
                } else {
                    r16 = r10;
                }
                objM87133R9 = r15.m87133R();
                if (r16 == 0) {
                    c28676v2 = c28676v1;
                    if (objM87133R9 == c28676v2) {
                    }
                    Modifier modifierM3398t117 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j14, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                    ?? r1111116 = C38072d.f163053a;
                    int i311116 = C38072d.f163054b;
                    float f21114 = 2;
                    Modifier modifierM3419p117 = AbstractC1102d.m3419p(f21114 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f21114, AbstractC1092a.m3358c(modifierM3398t117, r1111116.m121949b(r15, i311116).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                    c28676v3 = c28676v2;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1111116.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p117, r1111116.m121949b(r15, i311116).getBlack70(), r15, 0, 0);
                    r15.m87173q(r10);
                } else {
                    c28676v2 = c28676v1;
                }
                objM87133R9 = new C32579a(interfaceC4339a10, 6);
                r15.m87172p0(objM87133R9);
                Modifier modifierM3398t118 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j14, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                ?? r1111117 = C38072d.f163053a;
                int i311117 = C38072d.f163054b;
                float f21115 = 2;
                Modifier modifierM3419p118 = AbstractC1102d.m3419p(f21115 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f21115, AbstractC1092a.m3358c(modifierM3398t118, r1111117.m121949b(r15, i311117).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                c28676v3 = c28676v2;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1111117.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p118, r1111117.m121949b(r15, i311117).getBlack70(), r15, 0, 0);
                r15.m87173q(r10);
            } else {
                r15.m87150e0(1396186790);
                C21084j c21084j15 = new C21084j();
                if ((i25 & 112) == 32) {
                    r16 = 1;
                } else {
                    r16 = r10;
                }
                objM87133R9 = r15.m87133R();
                if (r16 == 0) {
                    c28676v2 = c28676v1;
                    if (objM87133R9 == c28676v2) {
                    }
                    Modifier modifierM3398t119 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j15, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                    ?? r1111118 = C38072d.f163053a;
                    int i311118 = C38072d.f163054b;
                    float f21116 = 2;
                    Modifier modifierM3419p119 = AbstractC1102d.m3419p(f21116 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f21116, AbstractC1092a.m3358c(modifierM3398t119, r1111118.m121949b(r15, i311118).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                    c28676v3 = c28676v2;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1111118.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p119, r1111118.m121949b(r15, i311118).getBlack70(), r15, 0, 0);
                    r15.m87173q(r10);
                } else {
                    c28676v2 = c28676v1;
                }
                objM87133R9 = new C32579a(interfaceC4339a10, 6);
                r15.m87172p0(objM87133R9);
                Modifier modifierM3398t1110 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(c2314t2, c21084j15, null, false, null, (InterfaceC4339a) objM87133R9, 28), 0.0f, 0.0f, f17, 0.0f, 11);
                ?? r1111119 = C38072d.f163053a;
                int i311119 = C38072d.f163054b;
                float f21117 = 2;
                Modifier modifierM3419p1110 = AbstractC1102d.m3419p(f21117 * f16, C1100b.f4583a.mo3400a(AbstractC1099a.m3394p(f21117, AbstractC1092a.m3358c(modifierM3398t1110, r1111119.m121949b(r15, i311119).getWhite70(), AbstractC33253j.f138651a)), C2299e.f9116y));
                c28676v3 = c28676v2;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1111119.m121951d().getTinyIcons().getCross(), r15, 6), AbstractC8693b.m21273g(AbstractC16277f.f62257L, r15, r10), modifierM3419p1110, r1111119.m121949b(r15, i311119).getBlack70(), r15, 0, 0);
                r15.m87173q(r10);
            }
            if (attachmentUploadState.getIsError()) {
                r15.m87150e0(1396989473);
                ?? r11111110 = r15;
                InterfaceC4339a interfaceC4339a19 = interfaceC4339a9;
                AbstractC14983d3.m43104a(interfaceC4339a19, null, false, C32636l1.f135259a.m101924b(), r11111110, ((i25 >> 6) & 14) | 24576, 14);
                interfaceC4339a11 = interfaceC4339a19;
                ?? r11111111 = r11111110;
                r11111111.m87173q(r10);
                r17 = r11111111;
            } else {
                interfaceC4339a11 = interfaceC4339a9;
                r15.m87150e0(1397523789);
                r15.m87173q(r10);
                r17 = r15;
            }
            if (attachmentUploadState.getIsUploading()) {
                r17.m87150e0(1397561392);
                ?? r310 = r17;
                AbstractC35684p.m113047h(AbstractC1102d.m3419p(5 * f16, c2314t2), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, r310, 6, 508);
                ?? r11111112 = r310;
                r11111112.m87173q(r10);
                r18 = r11111112;
            } else {
                r17.m87150e0(1397773773);
                r17.m87173q(r10);
                r18 = r17;
            }
            r18.m87173q(true);
            r18.m87173q(r10);
            if (m101668w(interfaceC28601c6)) {
                r18.m87150e0(1874914932);
                strM101666u = m101666u(interfaceC28601c4);
                if (strM101666u == null) {
                    r18.m87150e0(-2007179251);
                    r18.m87173q(r10);
                } else {
                    r18.m87150e0(-2007179250);
                    objM87133R10 = r18.m87133R();
                    if (objM87133R10 == c28676v3) {
                        objM87133R10 = new C32586b1(1, interfaceC28601c6);
                        r18.m87172p0(objM87133R10);
                    }
                    AbstractC17287g.m48960d(strM101666u, (InterfaceC4339a) objM87133R10, r18, 48);
                    r18.m87173q(r10);
                }
                r18.m87173q(r10);
            } else {
                r18.m87150e0(-2007027226);
                r18.m87173q(r10);
            }
            if (m101670y(interfaceC28601c5)) {
                r18.m87150e0(-2006657210);
                r18.m87173q(r10);
            } else {
                r18.m87150e0(-2006657210);
                r18.m87173q(r10);
            }
            interfaceC4339a5 = interfaceC4339a10;
            c22409u2 = c22409u3;
            interfaceC4339a4 = interfaceC4339a11;
            r14 = r18;
        } else {
            c28655q2.m87138X();
            interfaceC4339a4 = interfaceC4339a2;
            c22409u2 = c22409u4;
            interfaceC4339a5 = interfaceC4339a3;
            r14 = c28655q2;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a(attachmentUploadState, interfaceC4339a5, interfaceC4339a4, c22409u2, i13, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m101656k() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m101657l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m101658m(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m101659n(InterfaceC28601c1 interfaceC28601c1) {
        m101658m(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m101660o(C40628k c40628k, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C22409u c22409u) {
        Uri uriM131853e = c40628k.getUri();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (uriM131853e == null) {
            return c23454a0;
        }
        if (m101666u(interfaceC28601c1) != null) {
            m101669x(interfaceC28601c2, true);
            return c23454a0;
        }
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(c22409u, uriM131853e, interfaceC28601c1, interfaceC28601c2, null), 3);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m101661p(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, AbstractC15673b0.m43972A(), 0L, 0L, 0.0f, null, 9, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m101662q(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m101663r(InterfaceC28601c1 interfaceC28601c1) {
        m101669x(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m101664s(InterfaceC28601c1 interfaceC28601c1) {
        m101658m(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m101665t(C40628k c40628k, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C22409u c22409u, int i13, int i14, Composer composer, int i15) {
        m101655j(c40628k, interfaceC4339a, interfaceC4339a2, c22409u, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final String m101666u(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m101667v(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: w */
    private static final boolean m101668w(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m101669x(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: y */
    private static final boolean m101670y(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }
}

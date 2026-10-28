package hg3;

import android.content.Context;
import android.database.SQLException;
import android.graphics.Matrix;
import android.provider.Settings;
import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.datastore.core.CorruptionException;
import androidx.lifecycle.C1578e1;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import androidx.room.C1778e;
import androidx.room.C1786g;
import androidx.room.C1830t0;
import androidx.room.C1832u;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import bh.C3245h;
import bj.AbstractC3318q;
import bj.C3307f;
import bj.C3313l;
import bm.C3383g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cb3.AbstractC4393e;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import dj.AbstractC12064i;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import g20.C15270p;
import gb.C15634a0;
import gb.C15636b0;
import gb.C15638c0;
import gb.C15640d0;
import gb.C15642e0;
import gb.C15644f0;
import gb.C15646g0;
import gb.C15648i;
import gb.C15656q;
import gb.C15661v;
import gb.C15662w;
import gb.C15665z;
import ge3.AbstractC15751g;
import gf.InterfaceC15772m;
import hg3.AbstractC17269i;
import i93.C18283i;
import ia3.C18297c;
import io.ktor.serialization.ContentConvertException;
import io.ktor.utils.p228io.C20019l;
import io.ktor.utils.p228io.C20020m;
import io.ktor.utils.p228io.C20027t;
import io.ktor.utils.p228io.InterfaceC20024q;
import io.ktor.utils.p228io.internal.AbstractC19997g;
import io.sentry.C20337g0;
import io.sentry.android.core.C20136p0;
import io.sentry.hints.InterfaceC20355b;
import io.sentry.hints.InterfaceC20357d;
import j63.C21384a;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import k63.C22235e;
import k63.C22236f;
import l83.C23454a0;
import l83.C23465k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23811y;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m93.C25337e0;
import m93.InterfaceC25339g;
import ma3.InterfaceC25373b;
import no.nordicsemi.android.dfu.DfuBaseService;
import o93.AbstractC27736h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p005a3.C0222l0;
import p007a6.C0410c;
import p007a6.C0449q0;
import p007a6.InterfaceC0422g;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p027b3.C2442t0;
import p031b9.AbstractC2875y;
import p040c0.C3786v0;
import p049cj.AbstractC4737c;
import p049cj.C4738d;
import p077d0.AbstractC11343d2;
import p077d0.C11350f1;
import p077d0.C11421z1;
import p080d4.AbstractC11649h;
import p080d4.C11645d;
import p080d4.C11648g;
import p095dp.AbstractC12240d;
import p097ds.AbstractC12313p;
import p114eb.AbstractC12964i1;
import p114eb.C12967j1;
import p114eb.C12982q;
import p114eb.C12985r0;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p119ej.C13224a;
import p132f0.C13825t;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15067l1;
import p163g1.AbstractC15158u2;
import p163g1.C14970c1;
import p163g1.C15137s1;
import p163g1.C15192x6;
import p163g1.C15202y6;
import p181h2.C16618c;
import p193hf.C17224a;
import p193hf.C17229f;
import p193hf.C17231h;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p239j1.C21190h;
import p239j1.C21192j;
import p239j1.C21194l;
import p245j8.AbstractC21412c;
import p249jc.AbstractC21598x;
import p255jk.C21743a;
import p255jk.C21745c;
import p255jk.C21746d;
import p294l3.AbstractC23256h;
import p294l3.AbstractC23284v;
import p294l3.C23242a;
import p294l3.C23250e;
import p294l3.C23254g;
import p294l3.C23285v0;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p392p3.C28779q;
import p392p3.C28780r;
import p392p3.C28786x;
import p392p3.InterfaceC28770h;
import p392p3.InterfaceC28778p;
import p420qc.C30200j;
import p420qc.C30207q;
import p426qi.C30387i;
import p493t3.C33491c;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p524ui.AbstractC34987o;
import p524ui.C34969a;
import p524ui.InterfaceC34971b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p616xi.C38313a;
import p616xi.C38314b;
import p634y1.AbstractC39038k;
import p634y1.C39031d;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p649yi.C39548c;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p715kotlin.reflect.jvm.internal.UtilKt;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import r93.AbstractC31167y0;
import r93.C31112c0;
import r93.C31156t;
import r93.C31158u;
import r93.InterfaceC31107a1;
import r93.InterfaceC31109b0;
import r93.InterfaceC31110b1;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31136k0;
import r93.InterfaceC31145n0;
import r93.InterfaceC31151q0;
import s63.C32236a;
import s83.AbstractC32269c;
import se.AbstractC32410a;
import t63.AbstractC33559b;
import u63.AbstractC34560a;
import u93.AbstractC34670d;
import u93.AbstractC34711x0;
import u93.C34665a0;
import v63.AbstractC35749g;
import v63.C35746d;
import v63.C35747e;
import va3.C35845c;
import va3.C35848f;
import va3.C35850h;
import w63.AbstractC36867b;
import w63.C36866a;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import ya3.AbstractC39365h;
import ya3.AbstractC39373p;
import z93.EnumC40212c;

/* JADX INFO: renamed from: hg3.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17269i {

    /* JADX INFO: renamed from: a */
    public static C17268h f66366a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f66367b = false;

    /* JADX INFO: renamed from: A */
    public static final Set m48856A(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC22676k.m65749i(itKeys, "this.keys()");
        while (itKeys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(itKeys.next());
            AbstractC22676k.m65749i(jSONArray, "this.getJSONArray(fieldKey)");
            for (int i13 : m48911q0(jSONArray)) {
                arrayList.add(Integer.valueOf(i13));
            }
        }
        return AbstractC25265s.m74103I1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:21:0x0063->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC25339g m48857B(InterfaceC25339g interfaceC25339g, InterfaceC31111c descriptor, boolean z4) {
        List list;
        Iterator it;
        AbstractC23811y type;
        AbstractC23811y returnType;
        AbstractC23811y abstractC23811yM48870Q;
        InterfaceC31126h interfaceC31126hMo1784d;
        boolean zM125538b;
        AbstractC22676k.m65750j(interfaceC25339g, "<this>");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (!AbstractC39365h.m125537a(descriptor)) {
            List listMo78671c0 = descriptor.mo78671c0();
            AbstractC22676k.m65749i(listMo78671c0, "getContextReceiverParameters(...)");
            List list2 = listMo78671c0;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                List listMo78676v = descriptor.mo78676v();
                AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
                list = listMo78676v;
                if (list instanceof Collection) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        type = ((AbstractC34711x0) ((InterfaceC31107a1) it.next())).getType();
                        AbstractC22676k.m65749i(type, "getType(...)");
                        if (AbstractC39365h.m125542f(type)) {
                        }
                    }
                    returnType = descriptor.getReturnType();
                    if (returnType == null) {
                        abstractC23811yM48870Q = m48870Q(descriptor);
                        if (abstractC23811yM48870Q != null) {
                        }
                        return interfaceC25339g;
                    }
                    interfaceC31126hMo1784d = returnType.mo69844i0().mo1784d();
                    if (interfaceC31126hMo1784d != null) {
                        zM125538b = AbstractC39365h.m125538b(interfaceC31126hMo1784d);
                    } else {
                        zM125538b = false;
                    }
                    if (!zM125538b) {
                        abstractC23811yM48870Q = m48870Q(descriptor);
                        if (abstractC23811yM48870Q != null) {
                        }
                        return interfaceC25339g;
                    }
                } else {
                    it = list.iterator();
                    while (it.hasNext()) {
                        type = ((AbstractC34711x0) ((InterfaceC31107a1) it.next())).getType();
                        AbstractC22676k.m65749i(type, "getType(...)");
                        if (AbstractC39365h.m125542f(type)) {
                        }
                    }
                    returnType = descriptor.getReturnType();
                    if (returnType == null) {
                        abstractC23811yM48870Q = m48870Q(descriptor);
                        if (abstractC23811yM48870Q != null) {
                        }
                        return interfaceC25339g;
                    }
                    interfaceC31126hMo1784d = returnType.mo69844i0().mo1784d();
                    if (interfaceC31126hMo1784d != null) {
                        zM125538b = AbstractC39365h.m125538b(interfaceC31126hMo1784d);
                    } else {
                        zM125538b = false;
                    }
                    if (!zM125538b) {
                        abstractC23811yM48870Q = m48870Q(descriptor);
                        if (abstractC23811yM48870Q != null) {
                        }
                        return interfaceC25339g;
                    }
                }
            } else {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (AbstractC39365h.m125542f(((AbstractC34670d) ((InterfaceC31151q0) it3.next())).getType())) {
                    }
                }
                List listMo78676v2 = descriptor.mo78676v();
                AbstractC22676k.m65749i(listMo78676v2, "getValueParameters(...)");
                list = listMo78676v2;
                if ((list instanceof Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        type = ((AbstractC34711x0) ((InterfaceC31107a1) it.next())).getType();
                        AbstractC22676k.m65749i(type, "getType(...)");
                        if (AbstractC39365h.m125542f(type)) {
                        }
                    }
                    returnType = descriptor.getReturnType();
                    if (returnType == null) {
                        abstractC23811yM48870Q = m48870Q(descriptor);
                        if (abstractC23811yM48870Q != null || !AbstractC39365h.m125542f(abstractC23811yM48870Q)) {
                            return interfaceC25339g;
                        }
                    } else {
                        interfaceC31126hMo1784d = returnType.mo69844i0().mo1784d();
                        if (interfaceC31126hMo1784d != null) {
                            zM125538b = AbstractC39365h.m125538b(interfaceC31126hMo1784d);
                        } else {
                            zM125538b = false;
                        }
                        if (!zM125538b) {
                            abstractC23811yM48870Q = m48870Q(descriptor);
                            if (abstractC23811yM48870Q != null) {
                            }
                            return interfaceC25339g;
                        }
                    }
                } else {
                    returnType = descriptor.getReturnType();
                    if (returnType == null) {
                        abstractC23811yM48870Q = m48870Q(descriptor);
                        if (abstractC23811yM48870Q != null) {
                        }
                        return interfaceC25339g;
                    }
                    interfaceC31126hMo1784d = returnType.mo69844i0().mo1784d();
                    if (interfaceC31126hMo1784d != null) {
                        zM125538b = AbstractC39365h.m125538b(interfaceC31126hMo1784d);
                    } else {
                        zM125538b = false;
                    }
                    if (!zM125538b) {
                        abstractC23811yM48870Q = m48870Q(descriptor);
                        if (abstractC23811yM48870Q != null) {
                        }
                        return interfaceC25339g;
                    }
                }
            }
        }
        return new C25337e0(interfaceC25339g, descriptor, z4);
    }

    /* JADX INFO: renamed from: C */
    public static C20337g0 m48858C(Object obj) {
        C20337g0 c20337g0 = new C20337g0();
        c20337g0.m56493d(obj, "sentry:typeCheckHint");
        return c20337g0;
    }

    /* JADX INFO: renamed from: D */
    public static final String m48859D(CharsetDecoder charsetDecoder, AbstractC35749g input) throws Throwable {
        CoderResult coderResultDecode;
        C36866a c36866aM118253c;
        AbstractC22676k.m65750j(input, "input");
        StringBuilder sb4 = new StringBuilder((int) Math.min(Integer.MAX_VALUE, input instanceof C35747e ? input.m113270s() : Math.max(input.m113270s(), 16L)));
        CharBuffer charBuffer = AbstractC34560a.f145563a;
        CharBuffer charBufferAllocate = CharBuffer.allocate(DfuBaseService.ERROR_REMOTE_MASK);
        boolean z4 = true;
        C36866a c36866aM118252b = AbstractC36867b.m118252b(input, 1);
        int iRemaining = 0;
        if (c36866aM118252b != null) {
            int i13 = 1;
            int i14 = 1;
            int iRemaining2 = 0;
            while (true) {
                try {
                    int i15 = c36866aM118252b.f77287c;
                    int i16 = c36866aM118252b.f77286b;
                    int i17 = i15 - i16;
                    if (i17 >= i13) {
                        int i18 = Integer.MAX_VALUE - iRemaining2;
                        if (i18 != 0) {
                            try {
                                ByteBuffer byteBuffer = (ByteBuffer) c36866aM118252b.f77291g;
                                ByteBuffer byteBuffer2 = AbstractC33559b.f140038a;
                                ByteBuffer byteBufferM36264b0 = AbstractC12889b.m36264b0(byteBuffer, i16, i17);
                                charBufferAllocate.clear();
                                if (i18 < 8192) {
                                    charBufferAllocate.limit(i18);
                                }
                                CoderResult coderResultDecode2 = charsetDecoder.decode(byteBufferM36264b0, charBufferAllocate, false);
                                charBufferAllocate.flip();
                                iRemaining2 += charBufferAllocate.remaining();
                                sb4.append((CharSequence) charBufferAllocate);
                                if (coderResultDecode2.isMalformed() || coderResultDecode2.isUnmappable()) {
                                    AbstractC34560a.m109276d(coderResultDecode2);
                                }
                                i14 = (coderResultDecode2.isUnderflow() && byteBufferM36264b0.hasRemaining()) ? i14 + 1 : 1;
                                if (byteBufferM36264b0.limit() != i17) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                c36866aM118252b.m56793d(byteBufferM36264b0.position());
                                i13 = i14;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                            th = th;
                            if (z4) {
                                AbstractC36867b.m118251a(input, c36866aM118252b);
                            }
                            throw th;
                        }
                        i13 = 0;
                        i17 = c36866aM118252b.f77287c - c36866aM118252b.f77286b;
                    }
                    if (i17 == 0) {
                        try {
                            c36866aM118253c = AbstractC36867b.m118253c(input, c36866aM118252b);
                        } catch (Throwable th4) {
                            th = th4;
                            z4 = false;
                        }
                    } else if (i17 < i13 || c36866aM118252b.f77290f - c36866aM118252b.f77289e < 8) {
                        AbstractC36867b.m118251a(input, c36866aM118252b);
                        c36866aM118253c = AbstractC36867b.m118252b(input, i13);
                    } else {
                        c36866aM118253c = c36866aM118252b;
                    }
                    if (c36866aM118253c == null) {
                        break;
                    }
                    if (i13 <= 0) {
                        iRemaining = 1;
                        c36866aM118252b = c36866aM118253c;
                        break;
                    }
                    c36866aM118252b = c36866aM118253c;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            if (iRemaining != 0) {
                AbstractC36867b.m118251a(input, c36866aM118252b);
            }
            iRemaining = iRemaining2;
        }
        do {
            charBufferAllocate.clear();
            int i19 = Integer.MAX_VALUE - iRemaining;
            if (i19 == 0) {
                break;
            }
            if (i19 < 8192) {
                charBufferAllocate.limit(i19);
            }
            coderResultDecode = charsetDecoder.decode(AbstractC34560a.f145564b, charBufferAllocate, true);
            charBufferAllocate.flip();
            iRemaining += charBufferAllocate.remaining();
            sb4.append((CharSequence) charBufferAllocate);
            if (coderResultDecode.isUnmappable() || coderResultDecode.isMalformed()) {
                AbstractC34560a.m109276d(coderResultDecode);
            }
        } while (coderResultDecode.isOverflow());
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public static final Object m48860F(ArrayList arrayList, InterfaceC20024q interfaceC20024q, C32236a c32236a, Charset charset, AbstractC32269c abstractC32269c) throws ContentConvertException {
        C22236f c22236f;
        if (abstractC32269c instanceof C22236f) {
            c22236f = (C22236f) abstractC32269c;
            int i13 = c22236f.f86655z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c22236f.f86655z = i13 - Integer.MIN_VALUE;
            } else {
                c22236f = new C22236f(abstractC32269c);
            }
        } else {
            c22236f = new C22236f(abstractC32269c);
        }
        Object objM36576B = c22236f.f86654y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c22236f.f86655z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36576B);
            C22235e c22235e = new C22235e(new C3383g(arrayList, 1), charset, c32236a, interfaceC20024q);
            C1778e c1778e = new C1778e(interfaceC20024q, null, 20);
            c22236f.f86652w = interfaceC20024q;
            c22236f.f86653x = c32236a;
            c22236f.f86655z = 1;
            objM36576B = AbstractC13091v.m36576B(c22235e, c1778e, c22236f);
            if (objM36576B == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32236a = c22236f.f86653x;
            interfaceC20024q = c22236f.f86652w;
            AbstractC34132o.m107864I(objM36576B);
        }
        if (objM36576B != null) {
            return objM36576B;
        }
        C20020m c20020m = (C20020m) interfaceC20024q;
        if (!c20020m.m55850n()) {
            return c20020m;
        }
        if (c32236a.f133490c.isMarkedNullable()) {
            return C21384a.f81810a;
        }
        throw new ContentConvertException("No suitable converter found for " + c32236a, 0);
    }

    /* JADX INFO: renamed from: G */
    public static final Object m48861G(InterfaceC0422g interfaceC0422g, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        return interfaceC0422g.mo1102a(new C0410c(interfaceC4351m, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: H */
    public static final C35747e m48862H(CharsetEncoder charsetEncoder, CharSequence input, int i13, int i14) {
        AbstractC22676k.m65750j(input, "input");
        C35746d c35746d = new C35746d();
        try {
            m48863I(charsetEncoder, c35746d, input, i13, i14);
            return c35746d.m113257i();
        } catch (Throwable th3) {
            c35746d.close();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m48863I(CharsetEncoder charsetEncoder, C35746d c35746d, CharSequence input, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(input, "input");
        if (i13 >= i14) {
            return;
        }
        C36866a c36866aM118254d = AbstractC36867b.m118254d(c35746d, 1, null);
        while (true) {
            try {
                int iM109274b = AbstractC34560a.m109274b(charsetEncoder, input, i13, i14, c36866aM118254d);
                if (iM109274b < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i13 += iM109274b;
                if (i13 >= i14) {
                    i15 = 0;
                } else {
                    i15 = iM109274b == 0 ? 8 : 1;
                }
                if (i15 > 0) {
                    c36866aM118254d = AbstractC36867b.m118254d(c35746d, i15, c36866aM118254d);
                } else {
                    c35746d.m113255b();
                    C36866a c36866aM118254d2 = AbstractC36867b.m118254d(c35746d, 1, null);
                    int i16 = 1;
                    while (true) {
                        try {
                            i16 = AbstractC34560a.m109273a(charsetEncoder, c36866aM118254d2) ? 0 : i16 + 1;
                            if (i16 <= 0) {
                                c35746d.m113255b();
                                return;
                            }
                            c36866aM118254d2 = AbstractC36867b.m118254d(c35746d, 1, c36866aM118254d2);
                        } catch (Throwable th3) {
                            c35746d.m113255b();
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                c35746d.m113255b();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static final void m48864K(String sql, InterfaceC33687a interfaceC33687a) {
        AbstractC22676k.m65750j(interfaceC33687a, "<this>");
        AbstractC22676k.m65750j(sql, "sql");
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1(sql);
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static final InterfaceC31117e m48865L(InterfaceC31109b0 interfaceC31109b0, C35845c classId) {
        AbstractC22676k.m65750j(interfaceC31109b0, "<this>");
        AbstractC22676k.m65750j(classId, "classId");
        InterfaceC31126h interfaceC31126hM48866M = m48866M(interfaceC31109b0, classId);
        if (interfaceC31126hM48866M instanceof InterfaceC31117e) {
            return (InterfaceC31117e) interfaceC31126hM48866M;
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static final InterfaceC31126h m48866M(InterfaceC31109b0 interfaceC31109b0, C35845c classId) {
        AbstractC22676k.m65750j(interfaceC31109b0, "<this>");
        AbstractC22676k.m65750j(classId, "classId");
        if (interfaceC31109b0.mo78665r(AbstractC39373p.f169425a) != null) {
            throw new ClassCastException();
        }
        InterfaceC31136k0 interfaceC31136k0Mo78658F = interfaceC31109b0.mo78658F(classId.f152609a);
        C35848f c35848f = classId.f152610b.f152613a;
        c35848f.getClass();
        List listM113790f = C35848f.m113790f(c35848f);
        InterfaceC31126h contributedClassifier = ((C34665a0) interfaceC31136k0Mo78658F).f146031H.getContributedClassifier((C35850h) AbstractC25265s.m74096F0(listM113790f), EnumC40212c.f173634G);
        if (contributedClassifier != null) {
            for (C35850h c35850h : listM113790f.subList(1, listM113790f.size())) {
                if (contributedClassifier instanceof InterfaceC31117e) {
                    InterfaceC31126h contributedClassifier2 = ((InterfaceC31117e) contributedClassifier).mo60487H().getContributedClassifier(c35850h, EnumC40212c.f173634G);
                    contributedClassifier = contributedClassifier2 instanceof InterfaceC31117e ? (InterfaceC31117e) contributedClassifier2 : null;
                    if (contributedClassifier != null) {
                    }
                }
            }
            return contributedClassifier;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090 A[EDGE_INSN: B:45:0x0090->B:41:0x0090 BREAK  A[LOOP:0: B:11:0x0018->B:49:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0071 A[SYNTHETIC] */
    /* JADX INFO: renamed from: N */
    public static final List m48867N(C1830t0 c1830t0, int i13, int i14) {
        TreeMap treeMap;
        C23465k c23465k;
        Iterator it;
        boolean z4;
        int iIntValue;
        TreeMap treeMap2;
        AbstractC22676k.m65750j(c1830t0, "<this>");
        LinkedHashMap linkedHashMap = c1830t0.f7177a;
        if (i13 == i14) {
            return C25271y.f99162w;
        }
        boolean z13 = i14 > i13;
        ArrayList arrayList = new ArrayList();
        do {
            if (!z13) {
                if (i13 <= i14) {
                    return arrayList;
                }
                if (z13) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i13));
                    if (treeMap2 == null) {
                        c23465k = null;
                    } else {
                        c23465k = new C23465k(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i13));
                    if (treeMap == null) {
                        c23465k = null;
                    } else {
                        c23465k = new C23465k(treeMap, treeMap.keySet());
                    }
                }
                if (c23465k == null) {
                    Map map = (Map) c23465k.f92937w;
                    it = ((Iterable) c23465k.f92938x).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z4 = false;
                            break;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z13) {
                            if (i13 + 1 <= iIntValue) {
                                continue;
                            }
                        } else if (i14 <= iIntValue) {
                            continue;
                        }
                    }
                } else {
                    break;
                    break;
                }
            } else {
                if (i13 >= i14) {
                    return arrayList;
                }
                if (z13) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i13));
                    if (treeMap2 == null) {
                        c23465k = null;
                    } else {
                        c23465k = new C23465k(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i13));
                    if (treeMap == null) {
                        c23465k = null;
                    } else {
                        c23465k = new C23465k(treeMap, treeMap.keySet());
                    }
                }
                if (c23465k == null) {
                    Map map2 = (Map) c23465k.f92937w;
                    it = ((Iterable) c23465k.f92938x).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z4 = false;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z13) {
                            if (i14 <= iIntValue && iIntValue < i13) {
                                Object obj = map2.get(Integer.valueOf(iIntValue));
                                AbstractC22676k.m65747g(obj);
                                arrayList.add(obj);
                                z4 = true;
                                i13 = iIntValue;
                                break;
                                break;
                            }
                        } else if (i13 + 1 <= iIntValue && iIntValue <= i14) {
                            Object obj2 = map2.get(Integer.valueOf(iIntValue));
                            AbstractC22676k.m65747g(obj2);
                            arrayList.add(obj2);
                            z4 = true;
                            i13 = iIntValue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        } while (z4);
        return null;
    }

    /* JADX INFO: renamed from: O */
    public static final InterfaceC31117e m48868O(InterfaceC31109b0 interfaceC31109b0, C35845c classId, C41113q notFoundClasses) {
        AbstractC22676k.m65750j(interfaceC31109b0, "<this>");
        AbstractC22676k.m65750j(classId, "classId");
        AbstractC22676k.m65750j(notFoundClasses, "notFoundClasses");
        InterfaceC31117e interfaceC31117eM48865L = m48865L(interfaceC31109b0, classId);
        return interfaceC31117eM48865L != null ? interfaceC31117eM48865L : notFoundClasses.m133473t(classId, AbstractC38176k.m122276E(AbstractC38176k.m122272A(AbstractC38176k.m122288x(classId, C31158u.f128378w), C31156t.f128373x)));
    }

    /* JADX INFO: renamed from: P */
    public static final C30200j m48869P(C30207q c30207q) {
        AbstractC22676k.m65750j(c30207q, "<this>");
        return new C30200j(c30207q.f123634a, c30207q.f123653t);
    }

    /* JADX INFO: renamed from: Q */
    public static final AbstractC23811y m48870Q(InterfaceC31111c interfaceC31111c) {
        InterfaceC31151q0 interfaceC31151q0Mo78667B = interfaceC31111c.mo78667B();
        InterfaceC31151q0 interfaceC31151q0Mo78677y = interfaceC31111c.mo78677y();
        if (interfaceC31151q0Mo78667B != null) {
            return ((AbstractC34670d) interfaceC31151q0Mo78667B).getType();
        }
        if (interfaceC31151q0Mo78677y != null) {
            if (interfaceC31111c instanceof InterfaceC31132j) {
                return ((AbstractC34670d) interfaceC31151q0Mo78677y).getType();
            }
            InterfaceC31135k interfaceC31135kMo60581g = interfaceC31111c.mo60581g();
            InterfaceC31117e interfaceC31117e = interfaceC31135kMo60581g instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31135kMo60581g : null;
            if (interfaceC31117e != null) {
                return interfaceC31117e.mo60594i();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public static final Method m48871R(Class cls, InterfaceC31111c descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            AbstractC22676k.m65747g(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    /* JADX INFO: renamed from: S */
    public static final ArrayList m48872S(AbstractC23763c0 abstractC23763c0) {
        ArrayList arrayListM48873T = m48873T(AbstractC32410a.m101050t(abstractC23763c0));
        if (arrayListM48873T == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM48873T, 10));
        Iterator it = arrayListM48873T.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23763c0.mo69844i0().mo1784d();
        AbstractC22676k.m65748h(interfaceC31126hMo1784d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> javaClass = UtilKt.toJavaClass((InterfaceC31117e) interfaceC31126hMo1784d);
        AbstractC22676k.m65747g(javaClass);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(javaClass.getDeclaredMethod((String) it3.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: T */
    public static final ArrayList m48873T(AbstractC23763c0 abstractC23763c0) {
        ?? M118958J;
        if (!AbstractC39365h.m125543g(abstractC23763c0)) {
            return null;
        }
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23763c0.mo69844i0().mo1784d();
        AbstractC22676k.m65748h(interfaceC31126hMo1784d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        int i13 = AbstractC4393e.f17737a;
        AbstractC31167y0 abstractC31167y0Mo60488I = ((InterfaceC31117e) interfaceC31126hMo1784d).mo60488I();
        C31112c0 c31112c0 = abstractC31167y0Mo60488I instanceof C31112c0 ? (C31112c0) abstractC31167y0Mo60488I : null;
        AbstractC22676k.m65747g(c31112c0);
        ArrayList<C23465k> arrayList = c31112c0.f128313a;
        ArrayList arrayList2 = new ArrayList();
        for (C23465k c23465k : arrayList) {
            C35850h c35850h = (C35850h) c23465k.f92937w;
            ArrayList arrayListM48873T = m48873T((AbstractC23763c0) c23465k.f92938x);
            if (arrayListM48873T != null) {
                M118958J = new ArrayList(AbstractC25267u.m74163i0(arrayListM48873T, 10));
                Iterator it = arrayListM48873T.iterator();
                while (it.hasNext()) {
                    M118958J.add(c35850h.m113818c() + '-' + ((String) it.next()));
                }
            } else {
                M118958J = AbstractC37056f.m118958J(c35850h.m113818c());
            }
            AbstractC25265s.m74141p0(arrayList2, (Iterable) M118958J);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: U */
    public static final String m48874U(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("error")) {
            return "";
        }
        String string = jSONObject.getString("error");
        AbstractC22676k.m65749i(string, "this.getString(key)");
        return string;
    }

    /* JADX INFO: renamed from: V */
    public static final boolean m48875V(C23254g c23254g) {
        int length = c23254g.f92135x.length();
        List list = c23254g.f92134w;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                C23250e c23250e = (C23250e) list.get(i13);
                if ((c23250e.f92125a instanceof AbstractC23284v) && AbstractC23256h.m67320b(0, length, c23250e.f92126b, c23250e.f92127c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public static boolean m48876W(C20337g0 c20337g0, Class cls) {
        return cls.isInstance(c20337g0.m56491b("sentry:typeCheckHint"));
    }

    /* JADX INFO: renamed from: X */
    public static boolean m48877X(C20337g0 c20337g0) {
        return Boolean.TRUE.equals(c20337g0.m56492c(Boolean.class, "sentry:isFromHybridSdk"));
    }

    /* JADX INFO: renamed from: Y */
    public static final boolean m48878Y(C1786g c1786g, int i13, int i14) {
        AbstractC22676k.m65750j(c1786g, "<this>");
        if (i13 > i14 && c1786g.f7053l) {
            return false;
        }
        Set set = c1786g.f7054m;
        return c1786g.f7052k && (set == null || !set.contains(Integer.valueOf(i13)));
    }

    /* JADX INFO: renamed from: Z */
    public static final JSONObject m48879Z(String str, JSONObject jSONObject) {
        AbstractC22676k.m65750j(jSONObject, "<this>");
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final C13825t m48880a(float f13, long j7) {
        return new C13825t(f13, new C17875c1(j7));
    }

    /* JADX INFO: renamed from: a0 */
    public static final String m48881a0(String str, JSONObject jSONObject) {
        AbstractC22676k.m65750j(jSONObject, "<this>");
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C28786x m48882b(int i13, C28780r c28780r, int i14) {
        if ((i14 & 2) != 0) {
            c28780r = C28780r.f116539F;
        }
        return new C28786x(i13, c28780r, new C28779q(new InterfaceC28778p[0]));
    }

    /* JADX INFO: renamed from: b0 */
    public static C38313a m48883b0(C4738d c4738d, C30387i c30387i) {
        return new C38313a(AbstractC3318q.m9616a(c4738d, c30387i, 1.0f, C3307f.f12868b, false), 0);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0135 A[PHI: r5 r8 r9 r13 r14 r21
      0x0135: PHI (r5v48 b2.h) = (r5v3 b2.h), (r5v2 b2.h), (r5v2 b2.h) binds: [B:119:0x015c, B:104:0x0131, B:105:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r8v8 kotlin.jvm.functions.Function1) = (r8v2 kotlin.jvm.functions.Function1), (r8v1 kotlin.jvm.functions.Function1), (r8v1 kotlin.jvm.functions.Function1) binds: [B:119:0x015c, B:104:0x0131, B:105:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r9v25 kotlin.jvm.functions.Function1) = (r9v3 kotlin.jvm.functions.Function1), (r9v2 kotlin.jvm.functions.Function1), (r9v2 kotlin.jvm.functions.Function1) binds: [B:119:0x015c, B:104:0x0131, B:105:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r13v15 kotlin.jvm.functions.Function1) = (r13v2 kotlin.jvm.functions.Function1), (r13v1 kotlin.jvm.functions.Function1), (r13v1 kotlin.jvm.functions.Function1) binds: [B:119:0x015c, B:104:0x0131, B:105:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r14v15 kotlin.jvm.functions.Function1) = (r14v4 kotlin.jvm.functions.Function1), (r14v3 kotlin.jvm.functions.Function1), (r14v3 kotlin.jvm.functions.Function1) binds: [B:119:0x015c, B:104:0x0131, B:105:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r21v14 int) = (r21v4 int), (r21v15 int), (r21v16 int) binds: [B:119:0x015c, B:104:0x0131, B:105:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x013f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0144  */
    /* JADX WARN: Code duplicated, block: B:112:0x0149  */
    /* JADX WARN: Code duplicated, block: B:115:0x0150  */
    /* JADX WARN: Code duplicated, block: B:118:0x0157  */
    /* JADX WARN: Code duplicated, block: B:120:0x015e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0175  */
    /* JADX WARN: Code duplicated, block: B:125:0x0190  */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:128:0x0196  */
    /* JADX WARN: Code duplicated, block: B:130:0x019c  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:144:0x01fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x0202  */
    /* JADX WARN: Code duplicated, block: B:150:0x022f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0231  */
    /* JADX WARN: Code duplicated, block: B:154:0x0250  */
    /* JADX WARN: Code duplicated, block: B:157:0x0272  */
    /* JADX WARN: Code duplicated, block: B:160:0x0286  */
    /* JADX WARN: Code duplicated, block: B:162:0x0298  */
    /* JADX WARN: Code duplicated, block: B:164:0x029e  */
    /* JADX WARN: Code duplicated, block: B:170:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:182:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:188:0x030c  */
    /* JADX WARN: Code duplicated, block: B:189:0x030e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0316 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x0320  */
    /* JADX WARN: Code duplicated, block: B:198:0x0344  */
    /* JADX WARN: Code duplicated, block: B:199:0x0347  */
    /* JADX WARN: Code duplicated, block: B:202:0x034f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x0351  */
    /* JADX WARN: Code duplicated, block: B:206:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x0370  */
    /* JADX WARN: Code duplicated, block: B:212:0x0386  */
    /* JADX WARN: Code duplicated, block: B:215:0x039e  */
    /* JADX WARN: Code duplicated, block: B:217:0x03c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:220:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:222:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:224:0x0404 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:227:0x0409  */
    /* JADX WARN: Code duplicated, block: B:231:0x044a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:234:0x0453  */
    /* JADX WARN: Code duplicated, block: B:237:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x04be  */
    /* JADX WARN: Code duplicated, block: B:241:0x04de  */
    /* JADX WARN: Code duplicated, block: B:244:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:245:0x0502  */
    /* JADX WARN: Code duplicated, block: B:247:0x0506  */
    /* JADX WARN: Code duplicated, block: B:249:0x050c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0529  */
    /* JADX WARN: Code duplicated, block: B:254:0x0540  */
    /* JADX WARN: Code duplicated, block: B:256:0x0552  */
    /* JADX WARN: Code duplicated, block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x011f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m48884c(C12991u0 c12991u0, C12985r0 graph, Modifier modifier, InterfaceC2302h interfaceC2302h, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC2302h interfaceC2302h2;
        int i16;
        Function1 function6;
        int i17;
        int i18;
        Function1 function7;
        int i19;
        Function1 function8;
        Function1 function9;
        int i24;
        int i25;
        int i26;
        InterfaceC2302h interfaceC2302h3;
        Function1 function10;
        Function1 function11;
        int i27;
        Function1 function12;
        InterfaceC1585g0 interfaceC1585g0;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        C12967j1 c12967j1;
        AbstractC12964i1 abstractC12964i1Mo36434b;
        C15648i c15648i;
        Function1 function13;
        InterfaceC28601c1 interfaceC28601c1M87261o;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28690z0 interfaceC28690z0;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z4;
        boolean zM87153g;
        Object objM87133R3;
        InterfaceC2302h interfaceC2302h4;
        boolean zM87157i;
        Object objM87133R4;
        C39031d c39031dM124461g;
        InterfaceC28601c1 interfaceC28601c1M87261o2;
        Object objM87133R5;
        InterfaceC28670t2 interfaceC28670t2;
        C12982q c12982q;
        Object objM87133R6;
        Map map;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        Function1 function17;
        InterfaceC2302h interfaceC2302h5;
        InterfaceC30057d interfaceC30057d;
        AbstractC12964i1 abstractC12964i1Mo36434b2;
        C15656q c15656q;
        Function1 function18;
        Function1 function19;
        Function1 function20;
        Function1 function21;
        C28677v1 c28677v1M87180u;
        C15656q c15656q2;
        Function1 function22;
        boolean z13;
        boolean z14;
        Object objM87133R7;
        C15648i c15648i2;
        Function1 function23;
        C15648i c15648i3;
        boolean z15;
        boolean z16;
        Object objM87133R8;
        Function1 function24;
        boolean z17;
        Object objM87133R9;
        Function1 function25;
        boolean zM87153g2;
        Object objM87133R10;
        Object objM87133R11;
        C11350f1 c11350f1;
        C11421z1 c11421z1M30543e;
        boolean zM87157i2;
        Object objM87133R12;
        C11421z1 c11421z1;
        boolean zM87157i3;
        Object objM87133R13;
        Map map2;
        C15648i c15648i4;
        InterfaceC28670t2 interfaceC28670t3;
        C11421z1 c11421z2;
        boolean zM87153g3;
        Object objM87133R14;
        boolean zM87153g4;
        Object objM87133R15;
        C28677v1 c28677v1M87180u2;
        C28677v1 c28677v1M87180u3;
        int i28;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1964664536);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c12991u0) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(graph) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        int i29 = i14 & 8;
        if (i29 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC2302h2 = interfaceC2302h;
                i15 |= c28655q.m87153g(interfaceC2302h2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function1;
                    if (c28655q.m87157i(function6)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        function7 = function2;
                        if (c28655q.m87157i(function7)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    if ((i13 & 1572864) == 0) {
                        function8 = function3;
                        if ((i14 & 64) == 0 || !c28655q.m87157i(function8)) {
                            i28 = 524288;
                        } else {
                            i28 = 1048576;
                        }
                        i15 |= i28;
                    } else {
                        function8 = function3;
                    }
                    if ((i13 & 12582912) == 0) {
                        if ((i14 & 128) == 0) {
                            function9 = function4;
                            int i34 = c28655q.m87157i(function9) ? 8388608 : 4194304;
                            i15 |= i34;
                        } else {
                            function9 = function4;
                        }
                        i15 |= i34;
                    } else {
                        function9 = function4;
                    }
                    i24 = i14 & 256;
                    i25 = i15;
                    if (i24 != 0) {
                        i25 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c28655q.m87157i(function5)) {
                            i26 = 67108864;
                        } else {
                            i26 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i25 |= i26;
                    }
                    if ((i25 & 38347923) == 38347922 || !c28655q.m87121F()) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0 || c28655q.m87118C()) {
                            if (i29 != 0) {
                                interfaceC2302h2 = C2299e.f9114w;
                            }
                            if (i16 != 0) {
                                function6 = C15662w.f58779x;
                            }
                            if (i18 != 0) {
                                function7 = C15662w.f58780y;
                            }
                            if ((i14 & 64) != 0) {
                                i25 &= -3670017;
                                function8 = function6;
                            }
                            if ((i14 & 128) != 0) {
                                i25 &= -29360129;
                                function9 = function7;
                            }
                            if (i24 != 0) {
                                interfaceC2302h3 = interfaceC2302h2;
                                function10 = function6;
                                function11 = function8;
                                i27 = i25;
                                function12 = null;
                            }
                            c28655q.m87175r();
                            interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                            interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                            if (interfaceC1583f2M73844a != null) {
                                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                            }
                            c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                            c12967j1 = c12991u0.f44702w;
                            AbstractC22676k.m65750j(graph, "graph");
                            c12991u0.m36383K(graph, null);
                            abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                            if (abstractC12964i1Mo36434b instanceof C15648i) {
                                c15648i = (C15648i) abstractC12964i1Mo36434b;
                            } else {
                                c15648i = null;
                            }
                            if (c15648i == null) {
                                c28677v1M87180u2 = c28655q.m87180u();
                                if (c28677v1M87180u2 != null) {
                                    c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                                    return;
                                }
                                return;
                            }
                            function13 = function9;
                            interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                            objM87133R = c28655q.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                            }
                            interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g || objM87133R3 == c28676v0) {
                                objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC2302h4 = interfaceC2302h3;
                            AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                            zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87157i || objM87133R4 == c28676v0) {
                                objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                            c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                            interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                                c28655q.m87172p0(objM87133R5);
                            }
                            interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                            c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new LinkedHashMap();
                                c28655q.m87172p0(objM87133R6);
                            }
                            map = (Map) objM87133R6;
                            function14 = function10;
                            c28655q.m87150e0(653364988);
                            if (c12982q != null) {
                                function22 = function7;
                                boolean zM87153g5 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                                if ((57344 & i27) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                z14 = zM87153g5 | z13;
                                objM87133R7 = c28655q.m87133R();
                                if (!z14 || objM87133R7 == c28676v0) {
                                    Function1 function26 = function11;
                                    C15648i c15648i5 = c15648i;
                                    objM87133R7 = new C15646g0(c15648i5, function26, function14, interfaceC28601c1, 0);
                                    c15648i2 = c15648i5;
                                    function16 = function26;
                                    c28655q.m87172p0(objM87133R7);
                                } else {
                                    function16 = function11;
                                    c15648i2 = c15648i;
                                }
                                function23 = (Function1) objM87133R7;
                                c15648i3 = c15648i2;
                                boolean zM87153g6 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                                function15 = function13;
                                if ((458752 & i27) == 131072) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z15 | zM87153g6;
                                objM87133R8 = c28655q.m87133R();
                                if (!z16 || objM87133R8 == c28676v0) {
                                    objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                                    function17 = function22;
                                    c28655q.m87172p0(objM87133R8);
                                } else {
                                    function17 = function22;
                                }
                                function24 = (Function1) objM87133R8;
                                if ((234881024 & i27) == 67108864) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R9 = c28655q.m87133R();
                                if (z17 || objM87133R9 == c28676v0) {
                                    objM87133R9 = new C3786v0(function12, 6);
                                    c28655q.m87172p0(objM87133R9);
                                }
                                function25 = (Function1) objM87133R9;
                                Boolean bool = Boolean.TRUE;
                                zM87153g2 = c28655q.m87153g(c15648i3);
                                objM87133R10 = c28655q.m87133R();
                                if (zM87153g2 || objM87133R10 == c28676v0) {
                                    objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                                    c28655q.m87172p0(objM87133R10);
                                }
                                AbstractC28683x.m87251e(bool, (Function1) objM87133R10, c28655q);
                                objM87133R11 = c28655q.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C11350f1(c12982q);
                                    c28655q.m87172p0(objM87133R11);
                                }
                                c11350f1 = (C11350f1) objM87133R11;
                                c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                                if (m48890f(interfaceC28601c1)) {
                                    c28655q.m87150e0(-1218260648);
                                    Float fValueOf = Float.valueOf(r39.m87022x());
                                    zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                                    objM87133R15 = c28655q.m87133R();
                                    if (!zM87153g4 || objM87133R15 == c28676v0) {
                                        objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                        interfaceC30057d = null;
                                        c28655q.m87172p0(objM87133R15);
                                    } else {
                                        interfaceC30057d = null;
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf);
                                    c28655q.m87173q(false);
                                    c11421z1 = c11421z1M30543e;
                                } else {
                                    interfaceC30057d = null;
                                    c28655q.m87150e0(-1218005611);
                                    zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                                    objM87133R12 = c28655q.m87133R();
                                    if (!zM87157i2 || objM87133R12 == c28676v0) {
                                        objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                        c11421z1 = c11421z1M30543e;
                                        c28655q.m87172p0(objM87133R12);
                                    } else {
                                        c11421z1 = c11421z1M30543e;
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                                    c28655q.m87173q(false);
                                }
                                zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                                objM87133R13 = c28655q.m87133R();
                                if (!zM87157i3 || objM87133R13 == c28676v0) {
                                    objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                                    map2 = map;
                                    c15648i4 = c15648i3;
                                    interfaceC28670t3 = interfaceC28670t2;
                                    c28655q.m87172p0(objM87133R13);
                                } else {
                                    c15648i4 = c15648i3;
                                    map2 = map;
                                    interfaceC28670t3 = interfaceC28670t2;
                                }
                                int i35 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                                c11421z2 = c11421z1;
                                AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i35);
                                interfaceC2302h5 = interfaceC2302h4;
                                Object objMo2428y0 = c11421z2.f36630a.mo2428y0();
                                Object value = c11421z2.f36633d.getValue();
                                zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                                objM87133R14 = c28655q.m87133R();
                                if (zM87153g3 || objM87133R14 == c28676v0) {
                                    objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                                    c28655q.m87172p0(objM87133R14);
                                }
                                AbstractC28683x.m87254h(objMo2428y0, value, (InterfaceC4351m) objM87133R14, c28655q);
                            } else {
                                function15 = function13;
                                function16 = function11;
                                c12967j1 = c12967j1;
                                function17 = function7;
                                interfaceC2302h5 = interfaceC2302h4;
                                interfaceC30057d = null;
                            }
                            c28655q.m87173q(false);
                            abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                            if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                                c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                            } else {
                                c15656q = interfaceC30057d;
                            }
                            if (c15656q == 0) {
                                c28677v1M87180u = c28655q.m87180u();
                                if (c28677v1M87180u != null) {
                                    c15656q = c15656q2;
                                    return;
                                } else {
                                    c15656q = c15656q2;
                                    c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                                    return;
                                }
                            }
                            c15656q = c15656q2;
                            function9 = function15;
                            function18 = function14;
                            function19 = function16;
                            function20 = function12;
                            AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                            function21 = function17;
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 64) != 0) {
                                i25 &= -3670017;
                            }
                            if ((i14 & 128) != 0) {
                                i25 &= -29360129;
                            }
                        }
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                        c28655q.m87175r();
                        interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a != null) {
                            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                        }
                        c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                        c12967j1 = c12991u0.f44702w;
                        AbstractC22676k.m65750j(graph, "graph");
                        c12991u0.m36383K(graph, null);
                        abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                        if (abstractC12964i1Mo36434b instanceof C15648i) {
                            c15648i = (C15648i) abstractC12964i1Mo36434b;
                        } else {
                            c15648i = null;
                        }
                        if (c15648i == null) {
                            c28677v1M87180u2 = c28655q.m87180u();
                            if (c28677v1M87180u2 != null) {
                                c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                                return;
                            }
                            return;
                        }
                        function13 = function9;
                        interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                        }
                        interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC2302h4 = interfaceC2302h3;
                        AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                        zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                        c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                        interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                        c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new LinkedHashMap();
                            c28655q.m87172p0(objM87133R6);
                        }
                        map = (Map) objM87133R6;
                        function14 = function10;
                        c28655q.m87150e0(653364988);
                        if (c12982q != null) {
                            function22 = function7;
                            boolean zM87153g7 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                            if ((57344 & i27) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87153g7 | z13;
                            objM87133R7 = c28655q.m87133R();
                            if (z14) {
                                Function1 function27 = function11;
                                C15648i c15648i6 = c15648i;
                                objM87133R7 = new C15646g0(c15648i6, function27, function14, interfaceC28601c1, 0);
                                c15648i2 = c15648i6;
                                function16 = function27;
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                Function1 function28 = function11;
                                C15648i c15648i7 = c15648i;
                                objM87133R7 = new C15646g0(c15648i7, function28, function14, interfaceC28601c1, 0);
                                c15648i2 = c15648i7;
                                function16 = function28;
                                c28655q.m87172p0(objM87133R7);
                            }
                            function23 = (Function1) objM87133R7;
                            c15648i3 = c15648i2;
                            boolean zM87153g8 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                            function15 = function13;
                            if ((458752 & i27) == 131072) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z15 | zM87153g8;
                            objM87133R8 = c28655q.m87133R();
                            if (z16) {
                                objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                                function17 = function22;
                                c28655q.m87172p0(objM87133R8);
                            } else {
                                objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                                function17 = function22;
                                c28655q.m87172p0(objM87133R8);
                            }
                            function24 = (Function1) objM87133R8;
                            if ((234881024 & i27) == 67108864) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R9 = c28655q.m87133R();
                            if (z17) {
                                objM87133R9 = new C3786v0(function12, 6);
                                c28655q.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C3786v0(function12, 6);
                                c28655q.m87172p0(objM87133R9);
                            }
                            function25 = (Function1) objM87133R9;
                            Boolean bool2 = Boolean.TRUE;
                            zM87153g2 = c28655q.m87153g(c15648i3);
                            objM87133R10 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                                c28655q.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                                c28655q.m87172p0(objM87133R10);
                            }
                            AbstractC28683x.m87251e(bool2, (Function1) objM87133R10, c28655q);
                            objM87133R11 = c28655q.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C11350f1(c12982q);
                                c28655q.m87172p0(objM87133R11);
                            }
                            c11350f1 = (C11350f1) objM87133R11;
                            c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                            if (m48890f(interfaceC28601c1)) {
                                c28655q.m87150e0(-1218260648);
                                Float fValueOf2 = Float.valueOf(r39.m87022x());
                                zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                                objM87133R15 = c28655q.m87133R();
                                if (zM87153g4) {
                                    objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                    interfaceC30057d = null;
                                    c28655q.m87172p0(objM87133R15);
                                } else {
                                    objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                    interfaceC30057d = null;
                                    c28655q.m87172p0(objM87133R15);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf2);
                                c28655q.m87173q(false);
                                c11421z1 = c11421z1M30543e;
                            } else {
                                interfaceC30057d = null;
                                c28655q.m87150e0(-1218005611);
                                zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                                objM87133R12 = c28655q.m87133R();
                                if (zM87157i2) {
                                    objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                    c11421z1 = c11421z1M30543e;
                                    c28655q.m87172p0(objM87133R12);
                                } else {
                                    objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                    c11421z1 = c11421z1M30543e;
                                    c28655q.m87172p0(objM87133R12);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                                c28655q.m87173q(false);
                            }
                            zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                            objM87133R13 = c28655q.m87133R();
                            if (zM87157i3) {
                                objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                                map2 = map;
                                c15648i4 = c15648i3;
                                interfaceC28670t3 = interfaceC28670t2;
                                c28655q.m87172p0(objM87133R13);
                            } else {
                                objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                                map2 = map;
                                c15648i4 = c15648i3;
                                interfaceC28670t3 = interfaceC28670t2;
                                c28655q.m87172p0(objM87133R13);
                            }
                            int i36 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                            c11421z2 = c11421z1;
                            AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i36);
                            interfaceC2302h5 = interfaceC2302h4;
                            Object objMo2428y1 = c11421z2.f36630a.mo2428y0();
                            Object value2 = c11421z2.f36633d.getValue();
                            zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                            objM87133R14 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                                c28655q.m87172p0(objM87133R14);
                            } else {
                                objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                                c28655q.m87172p0(objM87133R14);
                            }
                            AbstractC28683x.m87254h(objMo2428y1, value2, (InterfaceC4351m) objM87133R14, c28655q);
                        } else {
                            function15 = function13;
                            function16 = function11;
                            c12967j1 = c12967j1;
                            function17 = function7;
                            interfaceC2302h5 = interfaceC2302h4;
                            interfaceC30057d = null;
                        }
                        c28655q.m87173q(false);
                        abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                        if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                            c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                        } else {
                            c15656q = interfaceC30057d;
                        }
                        if (c15656q == 0) {
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c15656q = c15656q2;
                                return;
                            } else {
                                c15656q = c15656q2;
                                c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                                return;
                            }
                        }
                        c15656q = c15656q2;
                        function9 = function15;
                        function18 = function14;
                        function19 = function16;
                        function20 = function12;
                        AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                        function21 = function17;
                    } else {
                        c28655q.m87138X();
                        interfaceC2302h5 = interfaceC2302h2;
                        function18 = function6;
                        function19 = function8;
                        function21 = function7;
                        function20 = function5;
                    }
                    c28677v1M87180u3 = c28655q.m87180u();
                    if (c28677v1M87180u3 != null) {
                        c28677v1M87180u3.f115982d = new C15642e0(c12991u0, graph, modifier, interfaceC2302h5, function18, function21, function19, function9, function20, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function7 = function2;
                if ((i13 & 1572864) == 0) {
                    function8 = function3;
                    if ((i14 & 64) == 0) {
                        i28 = 524288;
                    } else {
                        i28 = 524288;
                    }
                    i15 |= i28;
                } else {
                    function8 = function3;
                }
                if ((i13 & 12582912) == 0) {
                    if ((i14 & 128) == 0) {
                        function9 = function4;
                        if (c28655q.m87157i(function9)) {
                        }
                        i15 |= i34;
                    } else {
                        function9 = function4;
                    }
                    i15 |= i34;
                } else {
                    function9 = function4;
                }
                i24 = i14 & 256;
                i25 = i15;
                if (i24 != 0) {
                    i25 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(function5)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i25 |= i26;
                }
                if ((i25 & 38347923) == 38347922) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    } else {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    }
                    c28655q.m87175r();
                    interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a != null) {
                        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                    }
                    c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                    c12967j1 = c12991u0.f44702w;
                    AbstractC22676k.m65750j(graph, "graph");
                    c12991u0.m36383K(graph, null);
                    abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                    if (abstractC12964i1Mo36434b instanceof C15648i) {
                        c15648i = (C15648i) abstractC12964i1Mo36434b;
                    } else {
                        c15648i = null;
                    }
                    if (c15648i == null) {
                        c28677v1M87180u2 = c28655q.m87180u();
                        if (c28677v1M87180u2 != null) {
                            c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                            return;
                        }
                        return;
                    }
                    function13 = function9;
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC2302h4 = interfaceC2302h3;
                    AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                    zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                    c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                    interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                    c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new LinkedHashMap();
                        c28655q.m87172p0(objM87133R6);
                    }
                    map = (Map) objM87133R6;
                    function14 = function10;
                    c28655q.m87150e0(653364988);
                    if (c12982q != null) {
                        function22 = function7;
                        boolean zM87153g9 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                        if ((57344 & i27) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87153g9 | z13;
                        objM87133R7 = c28655q.m87133R();
                        if (z14) {
                            Function1 function29 = function11;
                            C15648i c15648i8 = c15648i;
                            objM87133R7 = new C15646g0(c15648i8, function29, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i8;
                            function16 = function29;
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            Function1 function210 = function11;
                            C15648i c15648i9 = c15648i;
                            objM87133R7 = new C15646g0(c15648i9, function210, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i9;
                            function16 = function210;
                            c28655q.m87172p0(objM87133R7);
                        }
                        function23 = (Function1) objM87133R7;
                        c15648i3 = c15648i2;
                        boolean zM87153g10 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                        function15 = function13;
                        if ((458752 & i27) == 131072) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | zM87153g10;
                        objM87133R8 = c28655q.m87133R();
                        if (z16) {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        }
                        function24 = (Function1) objM87133R8;
                        if ((234881024 & i27) == 67108864) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z17) {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function25 = (Function1) objM87133R9;
                        Boolean bool3 = Boolean.TRUE;
                        zM87153g2 = c28655q.m87153g(c15648i3);
                        objM87133R10 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC28683x.m87251e(bool3, (Function1) objM87133R10, c28655q);
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C11350f1(c12982q);
                            c28655q.m87172p0(objM87133R11);
                        }
                        c11350f1 = (C11350f1) objM87133R11;
                        c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                        if (m48890f(interfaceC28601c1)) {
                            c28655q.m87150e0(-1218260648);
                            Float fValueOf3 = Float.valueOf(r39.m87022x());
                            zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                            objM87133R15 = c28655q.m87133R();
                            if (zM87153g4) {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            } else {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf3);
                            c28655q.m87173q(false);
                            c11421z1 = c11421z1M30543e;
                        } else {
                            interfaceC30057d = null;
                            c28655q.m87150e0(-1218005611);
                            zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                            objM87133R12 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                            c28655q.m87173q(false);
                        }
                        zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                        objM87133R13 = c28655q.m87133R();
                        if (zM87157i3) {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        }
                        int i37 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                        c11421z2 = c11421z1;
                        AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i37);
                        interfaceC2302h5 = interfaceC2302h4;
                        Object objMo2428y2 = c11421z2.f36630a.mo2428y0();
                        Object value3 = c11421z2.f36633d.getValue();
                        zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                        objM87133R14 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        }
                        AbstractC28683x.m87254h(objMo2428y2, value3, (InterfaceC4351m) objM87133R14, c28655q);
                    } else {
                        function15 = function13;
                        function16 = function11;
                        c12967j1 = c12967j1;
                        function17 = function7;
                        interfaceC2302h5 = interfaceC2302h4;
                        interfaceC30057d = null;
                    }
                    c28655q.m87173q(false);
                    abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                    if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                        c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                    } else {
                        c15656q = interfaceC30057d;
                    }
                    if (c15656q == 0) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c15656q = c15656q2;
                            return;
                        } else {
                            c15656q = c15656q2;
                            c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                            return;
                        }
                    }
                    c15656q = c15656q2;
                    function9 = function15;
                    function18 = function14;
                    function19 = function16;
                    function20 = function12;
                    AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                    function21 = function17;
                } else {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    } else {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    }
                    c28655q.m87175r();
                    interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a != null) {
                        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                    }
                    c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                    c12967j1 = c12991u0.f44702w;
                    AbstractC22676k.m65750j(graph, "graph");
                    c12991u0.m36383K(graph, null);
                    abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                    if (abstractC12964i1Mo36434b instanceof C15648i) {
                        c15648i = (C15648i) abstractC12964i1Mo36434b;
                    } else {
                        c15648i = null;
                    }
                    if (c15648i == null) {
                        c28677v1M87180u2 = c28655q.m87180u();
                        if (c28677v1M87180u2 != null) {
                            c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                            return;
                        }
                        return;
                    }
                    function13 = function9;
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC2302h4 = interfaceC2302h3;
                    AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                    zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                    c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                    interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                    c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new LinkedHashMap();
                        c28655q.m87172p0(objM87133R6);
                    }
                    map = (Map) objM87133R6;
                    function14 = function10;
                    c28655q.m87150e0(653364988);
                    if (c12982q != null) {
                        function22 = function7;
                        boolean zM87153g11 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                        if ((57344 & i27) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87153g11 | z13;
                        objM87133R7 = c28655q.m87133R();
                        if (z14) {
                            Function1 function211 = function11;
                            C15648i c15648i10 = c15648i;
                            objM87133R7 = new C15646g0(c15648i10, function211, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i10;
                            function16 = function211;
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            Function1 function212 = function11;
                            C15648i c15648i11 = c15648i;
                            objM87133R7 = new C15646g0(c15648i11, function212, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i11;
                            function16 = function212;
                            c28655q.m87172p0(objM87133R7);
                        }
                        function23 = (Function1) objM87133R7;
                        c15648i3 = c15648i2;
                        boolean zM87153g12 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                        function15 = function13;
                        if ((458752 & i27) == 131072) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | zM87153g12;
                        objM87133R8 = c28655q.m87133R();
                        if (z16) {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        }
                        function24 = (Function1) objM87133R8;
                        if ((234881024 & i27) == 67108864) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z17) {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function25 = (Function1) objM87133R9;
                        Boolean bool4 = Boolean.TRUE;
                        zM87153g2 = c28655q.m87153g(c15648i3);
                        objM87133R10 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC28683x.m87251e(bool4, (Function1) objM87133R10, c28655q);
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C11350f1(c12982q);
                            c28655q.m87172p0(objM87133R11);
                        }
                        c11350f1 = (C11350f1) objM87133R11;
                        c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                        if (m48890f(interfaceC28601c1)) {
                            c28655q.m87150e0(-1218260648);
                            Float fValueOf4 = Float.valueOf(r39.m87022x());
                            zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                            objM87133R15 = c28655q.m87133R();
                            if (zM87153g4) {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            } else {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf4);
                            c28655q.m87173q(false);
                            c11421z1 = c11421z1M30543e;
                        } else {
                            interfaceC30057d = null;
                            c28655q.m87150e0(-1218005611);
                            zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                            objM87133R12 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                            c28655q.m87173q(false);
                        }
                        zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                        objM87133R13 = c28655q.m87133R();
                        if (zM87157i3) {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        }
                        int i38 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                        c11421z2 = c11421z1;
                        AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i38);
                        interfaceC2302h5 = interfaceC2302h4;
                        Object objMo2428y3 = c11421z2.f36630a.mo2428y0();
                        Object value4 = c11421z2.f36633d.getValue();
                        zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                        objM87133R14 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        }
                        AbstractC28683x.m87254h(objMo2428y3, value4, (InterfaceC4351m) objM87133R14, c28655q);
                    } else {
                        function15 = function13;
                        function16 = function11;
                        c12967j1 = c12967j1;
                        function17 = function7;
                        interfaceC2302h5 = interfaceC2302h4;
                        interfaceC30057d = null;
                    }
                    c28655q.m87173q(false);
                    abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                    if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                        c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                    } else {
                        c15656q = interfaceC30057d;
                    }
                    if (c15656q == 0) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c15656q = c15656q2;
                            return;
                        } else {
                            c15656q = c15656q2;
                            c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                            return;
                        }
                    }
                    c15656q = c15656q2;
                    function9 = function15;
                    function18 = function14;
                    function19 = function16;
                    function20 = function12;
                    AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                    function21 = function17;
                }
                c28677v1M87180u3 = c28655q.m87180u();
                if (c28677v1M87180u3 != null) {
                    c28677v1M87180u3.f115982d = new C15642e0(c12991u0, graph, modifier, interfaceC2302h5, function18, function21, function19, function9, function20, i13, i14);
                }
            }
            i15 |= 24576;
            function6 = function1;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    function7 = function2;
                    if (c28655q.m87157i(function7)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((i13 & 1572864) == 0) {
                    function8 = function3;
                    if ((i14 & 64) == 0) {
                        i28 = 524288;
                    } else {
                        i28 = 524288;
                    }
                    i15 |= i28;
                } else {
                    function8 = function3;
                }
                if ((i13 & 12582912) == 0) {
                    if ((i14 & 128) == 0) {
                        function9 = function4;
                        if (c28655q.m87157i(function9)) {
                        }
                        i15 |= i34;
                    } else {
                        function9 = function4;
                    }
                    i15 |= i34;
                } else {
                    function9 = function4;
                }
                i24 = i14 & 256;
                i25 = i15;
                if (i24 != 0) {
                    i25 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(function5)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i25 |= i26;
                }
                if ((i25 & 38347923) == 38347922) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    } else {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    }
                    c28655q.m87175r();
                    interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a != null) {
                        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                    }
                    c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                    c12967j1 = c12991u0.f44702w;
                    AbstractC22676k.m65750j(graph, "graph");
                    c12991u0.m36383K(graph, null);
                    abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                    if (abstractC12964i1Mo36434b instanceof C15648i) {
                        c15648i = (C15648i) abstractC12964i1Mo36434b;
                    } else {
                        c15648i = null;
                    }
                    if (c15648i == null) {
                        c28677v1M87180u2 = c28655q.m87180u();
                        if (c28677v1M87180u2 != null) {
                            c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                            return;
                        }
                        return;
                    }
                    function13 = function9;
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC2302h4 = interfaceC2302h3;
                    AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                    zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                    c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                    interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                    c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new LinkedHashMap();
                        c28655q.m87172p0(objM87133R6);
                    }
                    map = (Map) objM87133R6;
                    function14 = function10;
                    c28655q.m87150e0(653364988);
                    if (c12982q != null) {
                        function22 = function7;
                        boolean zM87153g13 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                        if ((57344 & i27) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87153g13 | z13;
                        objM87133R7 = c28655q.m87133R();
                        if (z14) {
                            Function1 function213 = function11;
                            C15648i c15648i12 = c15648i;
                            objM87133R7 = new C15646g0(c15648i12, function213, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i12;
                            function16 = function213;
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            Function1 function214 = function11;
                            C15648i c15648i13 = c15648i;
                            objM87133R7 = new C15646g0(c15648i13, function214, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i13;
                            function16 = function214;
                            c28655q.m87172p0(objM87133R7);
                        }
                        function23 = (Function1) objM87133R7;
                        c15648i3 = c15648i2;
                        boolean zM87153g14 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                        function15 = function13;
                        if ((458752 & i27) == 131072) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | zM87153g14;
                        objM87133R8 = c28655q.m87133R();
                        if (z16) {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        }
                        function24 = (Function1) objM87133R8;
                        if ((234881024 & i27) == 67108864) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z17) {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function25 = (Function1) objM87133R9;
                        Boolean bool5 = Boolean.TRUE;
                        zM87153g2 = c28655q.m87153g(c15648i3);
                        objM87133R10 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC28683x.m87251e(bool5, (Function1) objM87133R10, c28655q);
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C11350f1(c12982q);
                            c28655q.m87172p0(objM87133R11);
                        }
                        c11350f1 = (C11350f1) objM87133R11;
                        c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                        if (m48890f(interfaceC28601c1)) {
                            c28655q.m87150e0(-1218260648);
                            Float fValueOf5 = Float.valueOf(r39.m87022x());
                            zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                            objM87133R15 = c28655q.m87133R();
                            if (zM87153g4) {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            } else {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf5);
                            c28655q.m87173q(false);
                            c11421z1 = c11421z1M30543e;
                        } else {
                            interfaceC30057d = null;
                            c28655q.m87150e0(-1218005611);
                            zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                            objM87133R12 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                            c28655q.m87173q(false);
                        }
                        zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                        objM87133R13 = c28655q.m87133R();
                        if (zM87157i3) {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        }
                        int i39 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                        c11421z2 = c11421z1;
                        AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i39);
                        interfaceC2302h5 = interfaceC2302h4;
                        Object objMo2428y4 = c11421z2.f36630a.mo2428y0();
                        Object value5 = c11421z2.f36633d.getValue();
                        zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                        objM87133R14 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        }
                        AbstractC28683x.m87254h(objMo2428y4, value5, (InterfaceC4351m) objM87133R14, c28655q);
                    } else {
                        function15 = function13;
                        function16 = function11;
                        c12967j1 = c12967j1;
                        function17 = function7;
                        interfaceC2302h5 = interfaceC2302h4;
                        interfaceC30057d = null;
                    }
                    c28655q.m87173q(false);
                    abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                    if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                        c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                    } else {
                        c15656q = interfaceC30057d;
                    }
                    if (c15656q == 0) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c15656q = c15656q2;
                            return;
                        } else {
                            c15656q = c15656q2;
                            c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                            return;
                        }
                    }
                    c15656q = c15656q2;
                    function9 = function15;
                    function18 = function14;
                    function19 = function16;
                    function20 = function12;
                    AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                    function21 = function17;
                } else {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    } else {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    }
                    c28655q.m87175r();
                    interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a != null) {
                        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                    }
                    c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                    c12967j1 = c12991u0.f44702w;
                    AbstractC22676k.m65750j(graph, "graph");
                    c12991u0.m36383K(graph, null);
                    abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                    if (abstractC12964i1Mo36434b instanceof C15648i) {
                        c15648i = (C15648i) abstractC12964i1Mo36434b;
                    } else {
                        c15648i = null;
                    }
                    if (c15648i == null) {
                        c28677v1M87180u2 = c28655q.m87180u();
                        if (c28677v1M87180u2 != null) {
                            c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                            return;
                        }
                        return;
                    }
                    function13 = function9;
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC2302h4 = interfaceC2302h3;
                    AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                    zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                    c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                    interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                    c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new LinkedHashMap();
                        c28655q.m87172p0(objM87133R6);
                    }
                    map = (Map) objM87133R6;
                    function14 = function10;
                    c28655q.m87150e0(653364988);
                    if (c12982q != null) {
                        function22 = function7;
                        boolean zM87153g15 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                        if ((57344 & i27) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87153g15 | z13;
                        objM87133R7 = c28655q.m87133R();
                        if (z14) {
                            Function1 function215 = function11;
                            C15648i c15648i14 = c15648i;
                            objM87133R7 = new C15646g0(c15648i14, function215, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i14;
                            function16 = function215;
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            Function1 function216 = function11;
                            C15648i c15648i15 = c15648i;
                            objM87133R7 = new C15646g0(c15648i15, function216, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i15;
                            function16 = function216;
                            c28655q.m87172p0(objM87133R7);
                        }
                        function23 = (Function1) objM87133R7;
                        c15648i3 = c15648i2;
                        boolean zM87153g16 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                        function15 = function13;
                        if ((458752 & i27) == 131072) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | zM87153g16;
                        objM87133R8 = c28655q.m87133R();
                        if (z16) {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        }
                        function24 = (Function1) objM87133R8;
                        if ((234881024 & i27) == 67108864) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z17) {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function25 = (Function1) objM87133R9;
                        Boolean bool6 = Boolean.TRUE;
                        zM87153g2 = c28655q.m87153g(c15648i3);
                        objM87133R10 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC28683x.m87251e(bool6, (Function1) objM87133R10, c28655q);
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C11350f1(c12982q);
                            c28655q.m87172p0(objM87133R11);
                        }
                        c11350f1 = (C11350f1) objM87133R11;
                        c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                        if (m48890f(interfaceC28601c1)) {
                            c28655q.m87150e0(-1218260648);
                            Float fValueOf6 = Float.valueOf(r39.m87022x());
                            zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                            objM87133R15 = c28655q.m87133R();
                            if (zM87153g4) {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            } else {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf6);
                            c28655q.m87173q(false);
                            c11421z1 = c11421z1M30543e;
                        } else {
                            interfaceC30057d = null;
                            c28655q.m87150e0(-1218005611);
                            zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                            objM87133R12 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                            c28655q.m87173q(false);
                        }
                        zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                        objM87133R13 = c28655q.m87133R();
                        if (zM87157i3) {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        }
                        int i310 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                        c11421z2 = c11421z1;
                        AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i310);
                        interfaceC2302h5 = interfaceC2302h4;
                        Object objMo2428y5 = c11421z2.f36630a.mo2428y0();
                        Object value6 = c11421z2.f36633d.getValue();
                        zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                        objM87133R14 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        }
                        AbstractC28683x.m87254h(objMo2428y5, value6, (InterfaceC4351m) objM87133R14, c28655q);
                    } else {
                        function15 = function13;
                        function16 = function11;
                        c12967j1 = c12967j1;
                        function17 = function7;
                        interfaceC2302h5 = interfaceC2302h4;
                        interfaceC30057d = null;
                    }
                    c28655q.m87173q(false);
                    abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                    if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                        c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                    } else {
                        c15656q = interfaceC30057d;
                    }
                    if (c15656q == 0) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c15656q = c15656q2;
                            return;
                        } else {
                            c15656q = c15656q2;
                            c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                            return;
                        }
                    }
                    c15656q = c15656q2;
                    function9 = function15;
                    function18 = function14;
                    function19 = function16;
                    function20 = function12;
                    AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                    function21 = function17;
                }
                c28677v1M87180u3 = c28655q.m87180u();
                if (c28677v1M87180u3 != null) {
                    c28677v1M87180u3.f115982d = new C15642e0(c12991u0, graph, modifier, interfaceC2302h5, function18, function21, function19, function9, function20, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function7 = function2;
            if ((i13 & 1572864) == 0) {
                function8 = function3;
                if ((i14 & 64) == 0) {
                    i28 = 524288;
                } else {
                    i28 = 524288;
                }
                i15 |= i28;
            } else {
                function8 = function3;
            }
            if ((i13 & 12582912) == 0) {
                if ((i14 & 128) == 0) {
                    function9 = function4;
                    if (c28655q.m87157i(function9)) {
                    }
                    i15 |= i34;
                } else {
                    function9 = function4;
                }
                i15 |= i34;
            } else {
                function9 = function4;
            }
            i24 = i14 & 256;
            i25 = i15;
            if (i24 != 0) {
                i25 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q.m87157i(function5)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i25 |= i26;
            }
            if ((i25 & 38347923) == 38347922) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                } else {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                }
                c28655q.m87175r();
                interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a != null) {
                    throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                }
                c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                c12967j1 = c12991u0.f44702w;
                AbstractC22676k.m65750j(graph, "graph");
                c12991u0.m36383K(graph, null);
                abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                if (abstractC12964i1Mo36434b instanceof C15648i) {
                    c15648i = (C15648i) abstractC12964i1Mo36434b;
                } else {
                    c15648i = null;
                }
                if (c15648i == null) {
                    c28677v1M87180u2 = c28655q.m87180u();
                    if (c28677v1M87180u2 != null) {
                        c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                        return;
                    }
                    return;
                }
                function13 = function9;
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC2302h4 = interfaceC2302h3;
                AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new LinkedHashMap();
                    c28655q.m87172p0(objM87133R6);
                }
                map = (Map) objM87133R6;
                function14 = function10;
                c28655q.m87150e0(653364988);
                if (c12982q != null) {
                    function22 = function7;
                    boolean zM87153g17 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                    if ((57344 & i27) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87153g17 | z13;
                    objM87133R7 = c28655q.m87133R();
                    if (z14) {
                        Function1 function217 = function11;
                        C15648i c15648i16 = c15648i;
                        objM87133R7 = new C15646g0(c15648i16, function217, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i16;
                        function16 = function217;
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        Function1 function218 = function11;
                        C15648i c15648i17 = c15648i;
                        objM87133R7 = new C15646g0(c15648i17, function218, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i17;
                        function16 = function218;
                        c28655q.m87172p0(objM87133R7);
                    }
                    function23 = (Function1) objM87133R7;
                    c15648i3 = c15648i2;
                    boolean zM87153g18 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                    function15 = function13;
                    if ((458752 & i27) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | zM87153g18;
                    objM87133R8 = c28655q.m87133R();
                    if (z16) {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    }
                    function24 = (Function1) objM87133R8;
                    if ((234881024 & i27) == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z17) {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function25 = (Function1) objM87133R9;
                    Boolean bool7 = Boolean.TRUE;
                    zM87153g2 = c28655q.m87153g(c15648i3);
                    objM87133R10 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87251e(bool7, (Function1) objM87133R10, c28655q);
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C11350f1(c12982q);
                        c28655q.m87172p0(objM87133R11);
                    }
                    c11350f1 = (C11350f1) objM87133R11;
                    c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                    if (m48890f(interfaceC28601c1)) {
                        c28655q.m87150e0(-1218260648);
                        Float fValueOf7 = Float.valueOf(r39.m87022x());
                        zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                        objM87133R15 = c28655q.m87133R();
                        if (zM87153g4) {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf7);
                        c28655q.m87173q(false);
                        c11421z1 = c11421z1M30543e;
                    } else {
                        interfaceC30057d = null;
                        c28655q.m87150e0(-1218005611);
                        zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                        objM87133R12 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                        c28655q.m87173q(false);
                    }
                    zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                    objM87133R13 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    }
                    int i311 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                    c11421z2 = c11421z1;
                    AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i311);
                    interfaceC2302h5 = interfaceC2302h4;
                    Object objMo2428y6 = c11421z2.f36630a.mo2428y0();
                    Object value7 = c11421z2.f36633d.getValue();
                    zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                    objM87133R14 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC28683x.m87254h(objMo2428y6, value7, (InterfaceC4351m) objM87133R14, c28655q);
                } else {
                    function15 = function13;
                    function16 = function11;
                    c12967j1 = c12967j1;
                    function17 = function7;
                    interfaceC2302h5 = interfaceC2302h4;
                    interfaceC30057d = null;
                }
                c28655q.m87173q(false);
                abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                    c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                } else {
                    c15656q = interfaceC30057d;
                }
                if (c15656q == 0) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c15656q = c15656q2;
                        return;
                    } else {
                        c15656q = c15656q2;
                        c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                        return;
                    }
                }
                c15656q = c15656q2;
                function9 = function15;
                function18 = function14;
                function19 = function16;
                function20 = function12;
                AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                function21 = function17;
            } else {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                } else {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                }
                c28655q.m87175r();
                interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a != null) {
                    throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                }
                c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                c12967j1 = c12991u0.f44702w;
                AbstractC22676k.m65750j(graph, "graph");
                c12991u0.m36383K(graph, null);
                abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                if (abstractC12964i1Mo36434b instanceof C15648i) {
                    c15648i = (C15648i) abstractC12964i1Mo36434b;
                } else {
                    c15648i = null;
                }
                if (c15648i == null) {
                    c28677v1M87180u2 = c28655q.m87180u();
                    if (c28677v1M87180u2 != null) {
                        c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                        return;
                    }
                    return;
                }
                function13 = function9;
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC2302h4 = interfaceC2302h3;
                AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new LinkedHashMap();
                    c28655q.m87172p0(objM87133R6);
                }
                map = (Map) objM87133R6;
                function14 = function10;
                c28655q.m87150e0(653364988);
                if (c12982q != null) {
                    function22 = function7;
                    boolean zM87153g19 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                    if ((57344 & i27) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87153g19 | z13;
                    objM87133R7 = c28655q.m87133R();
                    if (z14) {
                        Function1 function219 = function11;
                        C15648i c15648i18 = c15648i;
                        objM87133R7 = new C15646g0(c15648i18, function219, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i18;
                        function16 = function219;
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        Function1 function2110 = function11;
                        C15648i c15648i19 = c15648i;
                        objM87133R7 = new C15646g0(c15648i19, function2110, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i19;
                        function16 = function2110;
                        c28655q.m87172p0(objM87133R7);
                    }
                    function23 = (Function1) objM87133R7;
                    c15648i3 = c15648i2;
                    boolean zM87153g110 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                    function15 = function13;
                    if ((458752 & i27) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | zM87153g110;
                    objM87133R8 = c28655q.m87133R();
                    if (z16) {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    }
                    function24 = (Function1) objM87133R8;
                    if ((234881024 & i27) == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z17) {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function25 = (Function1) objM87133R9;
                    Boolean bool8 = Boolean.TRUE;
                    zM87153g2 = c28655q.m87153g(c15648i3);
                    objM87133R10 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87251e(bool8, (Function1) objM87133R10, c28655q);
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C11350f1(c12982q);
                        c28655q.m87172p0(objM87133R11);
                    }
                    c11350f1 = (C11350f1) objM87133R11;
                    c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                    if (m48890f(interfaceC28601c1)) {
                        c28655q.m87150e0(-1218260648);
                        Float fValueOf8 = Float.valueOf(r39.m87022x());
                        zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                        objM87133R15 = c28655q.m87133R();
                        if (zM87153g4) {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf8);
                        c28655q.m87173q(false);
                        c11421z1 = c11421z1M30543e;
                    } else {
                        interfaceC30057d = null;
                        c28655q.m87150e0(-1218005611);
                        zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                        objM87133R12 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                        c28655q.m87173q(false);
                    }
                    zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                    objM87133R13 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    }
                    int i312 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                    c11421z2 = c11421z1;
                    AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i312);
                    interfaceC2302h5 = interfaceC2302h4;
                    Object objMo2428y7 = c11421z2.f36630a.mo2428y0();
                    Object value8 = c11421z2.f36633d.getValue();
                    zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                    objM87133R14 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC28683x.m87254h(objMo2428y7, value8, (InterfaceC4351m) objM87133R14, c28655q);
                } else {
                    function15 = function13;
                    function16 = function11;
                    c12967j1 = c12967j1;
                    function17 = function7;
                    interfaceC2302h5 = interfaceC2302h4;
                    interfaceC30057d = null;
                }
                c28655q.m87173q(false);
                abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                    c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                } else {
                    c15656q = interfaceC30057d;
                }
                if (c15656q == 0) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c15656q = c15656q2;
                        return;
                    } else {
                        c15656q = c15656q2;
                        c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                        return;
                    }
                }
                c15656q = c15656q2;
                function9 = function15;
                function18 = function14;
                function19 = function16;
                function20 = function12;
                AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                function21 = function17;
            }
            c28677v1M87180u3 = c28655q.m87180u();
            if (c28677v1M87180u3 != null) {
                c28677v1M87180u3.f115982d = new C15642e0(c12991u0, graph, modifier, interfaceC2302h5, function18, function21, function19, function9, function20, i13, i14);
            }
        }
        i15 |= 3072;
        interfaceC2302h2 = interfaceC2302h;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function6 = function1;
                if (c28655q.m87157i(function6)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    function7 = function2;
                    if (c28655q.m87157i(function7)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((i13 & 1572864) == 0) {
                    function8 = function3;
                    if ((i14 & 64) == 0) {
                        i28 = 524288;
                    } else {
                        i28 = 524288;
                    }
                    i15 |= i28;
                } else {
                    function8 = function3;
                }
                if ((i13 & 12582912) == 0) {
                    if ((i14 & 128) == 0) {
                        function9 = function4;
                        if (c28655q.m87157i(function9)) {
                        }
                        i15 |= i34;
                    } else {
                        function9 = function4;
                    }
                    i15 |= i34;
                } else {
                    function9 = function4;
                }
                i24 = i14 & 256;
                i25 = i15;
                if (i24 != 0) {
                    i25 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(function5)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i25 |= i26;
                }
                if ((i25 & 38347923) == 38347922) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    } else {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    }
                    c28655q.m87175r();
                    interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a != null) {
                        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                    }
                    c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                    c12967j1 = c12991u0.f44702w;
                    AbstractC22676k.m65750j(graph, "graph");
                    c12991u0.m36383K(graph, null);
                    abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                    if (abstractC12964i1Mo36434b instanceof C15648i) {
                        c15648i = (C15648i) abstractC12964i1Mo36434b;
                    } else {
                        c15648i = null;
                    }
                    if (c15648i == null) {
                        c28677v1M87180u2 = c28655q.m87180u();
                        if (c28677v1M87180u2 != null) {
                            c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                            return;
                        }
                        return;
                    }
                    function13 = function9;
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC2302h4 = interfaceC2302h3;
                    AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                    zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                    c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                    interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                    c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new LinkedHashMap();
                        c28655q.m87172p0(objM87133R6);
                    }
                    map = (Map) objM87133R6;
                    function14 = function10;
                    c28655q.m87150e0(653364988);
                    if (c12982q != null) {
                        function22 = function7;
                        boolean zM87153g111 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                        if ((57344 & i27) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87153g111 | z13;
                        objM87133R7 = c28655q.m87133R();
                        if (z14) {
                            Function1 function2111 = function11;
                            C15648i c15648i110 = c15648i;
                            objM87133R7 = new C15646g0(c15648i110, function2111, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i110;
                            function16 = function2111;
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            Function1 function2112 = function11;
                            C15648i c15648i111 = c15648i;
                            objM87133R7 = new C15646g0(c15648i111, function2112, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i111;
                            function16 = function2112;
                            c28655q.m87172p0(objM87133R7);
                        }
                        function23 = (Function1) objM87133R7;
                        c15648i3 = c15648i2;
                        boolean zM87153g112 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                        function15 = function13;
                        if ((458752 & i27) == 131072) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | zM87153g112;
                        objM87133R8 = c28655q.m87133R();
                        if (z16) {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        }
                        function24 = (Function1) objM87133R8;
                        if ((234881024 & i27) == 67108864) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z17) {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function25 = (Function1) objM87133R9;
                        Boolean bool9 = Boolean.TRUE;
                        zM87153g2 = c28655q.m87153g(c15648i3);
                        objM87133R10 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC28683x.m87251e(bool9, (Function1) objM87133R10, c28655q);
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C11350f1(c12982q);
                            c28655q.m87172p0(objM87133R11);
                        }
                        c11350f1 = (C11350f1) objM87133R11;
                        c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                        if (m48890f(interfaceC28601c1)) {
                            c28655q.m87150e0(-1218260648);
                            Float fValueOf9 = Float.valueOf(r39.m87022x());
                            zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                            objM87133R15 = c28655q.m87133R();
                            if (zM87153g4) {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            } else {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf9);
                            c28655q.m87173q(false);
                            c11421z1 = c11421z1M30543e;
                        } else {
                            interfaceC30057d = null;
                            c28655q.m87150e0(-1218005611);
                            zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                            objM87133R12 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                            c28655q.m87173q(false);
                        }
                        zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                        objM87133R13 = c28655q.m87133R();
                        if (zM87157i3) {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        }
                        int i313 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                        c11421z2 = c11421z1;
                        AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i313);
                        interfaceC2302h5 = interfaceC2302h4;
                        Object objMo2428y8 = c11421z2.f36630a.mo2428y0();
                        Object value9 = c11421z2.f36633d.getValue();
                        zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                        objM87133R14 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        }
                        AbstractC28683x.m87254h(objMo2428y8, value9, (InterfaceC4351m) objM87133R14, c28655q);
                    } else {
                        function15 = function13;
                        function16 = function11;
                        c12967j1 = c12967j1;
                        function17 = function7;
                        interfaceC2302h5 = interfaceC2302h4;
                        interfaceC30057d = null;
                    }
                    c28655q.m87173q(false);
                    abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                    if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                        c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                    } else {
                        c15656q = interfaceC30057d;
                    }
                    if (c15656q == 0) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c15656q = c15656q2;
                            return;
                        } else {
                            c15656q = c15656q2;
                            c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                            return;
                        }
                    }
                    c15656q = c15656q2;
                    function9 = function15;
                    function18 = function14;
                    function19 = function16;
                    function20 = function12;
                    AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                    function21 = function17;
                } else {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    } else {
                        if (i29 != 0) {
                            interfaceC2302h2 = C2299e.f9114w;
                        }
                        if (i16 != 0) {
                            function6 = C15662w.f58779x;
                        }
                        if (i18 != 0) {
                            function7 = C15662w.f58780y;
                        }
                        if ((i14 & 64) != 0) {
                            i25 &= -3670017;
                            function8 = function6;
                        }
                        if ((i14 & 128) != 0) {
                            i25 &= -29360129;
                            function9 = function7;
                        }
                        if (i24 != 0) {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = null;
                        } else {
                            interfaceC2302h3 = interfaceC2302h2;
                            function10 = function6;
                            function11 = function8;
                            i27 = i25;
                            function12 = function5;
                        }
                    }
                    c28655q.m87175r();
                    interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a != null) {
                        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                    }
                    c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                    c12967j1 = c12991u0.f44702w;
                    AbstractC22676k.m65750j(graph, "graph");
                    c12991u0.m36383K(graph, null);
                    abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                    if (abstractC12964i1Mo36434b instanceof C15648i) {
                        c15648i = (C15648i) abstractC12964i1Mo36434b;
                    } else {
                        c15648i = null;
                    }
                    if (c15648i == null) {
                        c28677v1M87180u2 = c28655q.m87180u();
                        if (c28677v1M87180u2 != null) {
                            c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                            return;
                        }
                        return;
                    }
                    function13 = function9;
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC2302h4 = interfaceC2302h3;
                    AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                    zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                    c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                    interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                    c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new LinkedHashMap();
                        c28655q.m87172p0(objM87133R6);
                    }
                    map = (Map) objM87133R6;
                    function14 = function10;
                    c28655q.m87150e0(653364988);
                    if (c12982q != null) {
                        function22 = function7;
                        boolean zM87153g113 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                        if ((57344 & i27) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87153g113 | z13;
                        objM87133R7 = c28655q.m87133R();
                        if (z14) {
                            Function1 function2113 = function11;
                            C15648i c15648i112 = c15648i;
                            objM87133R7 = new C15646g0(c15648i112, function2113, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i112;
                            function16 = function2113;
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            Function1 function2114 = function11;
                            C15648i c15648i113 = c15648i;
                            objM87133R7 = new C15646g0(c15648i113, function2114, function14, interfaceC28601c1, 0);
                            c15648i2 = c15648i113;
                            function16 = function2114;
                            c28655q.m87172p0(objM87133R7);
                        }
                        function23 = (Function1) objM87133R7;
                        c15648i3 = c15648i2;
                        boolean zM87153g114 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                        function15 = function13;
                        if ((458752 & i27) == 131072) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | zM87153g114;
                        objM87133R8 = c28655q.m87133R();
                        if (z16) {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                            function17 = function22;
                            c28655q.m87172p0(objM87133R8);
                        }
                        function24 = (Function1) objM87133R8;
                        if ((234881024 & i27) == 67108864) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z17) {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C3786v0(function12, 6);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function25 = (Function1) objM87133R9;
                        Boolean bool10 = Boolean.TRUE;
                        zM87153g2 = c28655q.m87153g(c15648i3);
                        objM87133R10 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                            c28655q.m87172p0(objM87133R10);
                        }
                        AbstractC28683x.m87251e(bool10, (Function1) objM87133R10, c28655q);
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C11350f1(c12982q);
                            c28655q.m87172p0(objM87133R11);
                        }
                        c11350f1 = (C11350f1) objM87133R11;
                        c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                        if (m48890f(interfaceC28601c1)) {
                            c28655q.m87150e0(-1218260648);
                            Float fValueOf10 = Float.valueOf(r39.m87022x());
                            zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                            objM87133R15 = c28655q.m87133R();
                            if (zM87153g4) {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            } else {
                                objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                                interfaceC30057d = null;
                                c28655q.m87172p0(objM87133R15);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf10);
                            c28655q.m87173q(false);
                            c11421z1 = c11421z1M30543e;
                        } else {
                            interfaceC30057d = null;
                            c28655q.m87150e0(-1218005611);
                            zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                            objM87133R12 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                                c11421z1 = c11421z1M30543e;
                                c28655q.m87172p0(objM87133R12);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                            c28655q.m87173q(false);
                        }
                        zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                        objM87133R13 = c28655q.m87133R();
                        if (zM87157i3) {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                            map2 = map;
                            c15648i4 = c15648i3;
                            interfaceC28670t3 = interfaceC28670t2;
                            c28655q.m87172p0(objM87133R13);
                        }
                        int i314 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                        c11421z2 = c11421z1;
                        AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i314);
                        interfaceC2302h5 = interfaceC2302h4;
                        Object objMo2428y9 = c11421z2.f36630a.mo2428y0();
                        Object value10 = c11421z2.f36633d.getValue();
                        zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                        objM87133R14 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                            c28655q.m87172p0(objM87133R14);
                        }
                        AbstractC28683x.m87254h(objMo2428y9, value10, (InterfaceC4351m) objM87133R14, c28655q);
                    } else {
                        function15 = function13;
                        function16 = function11;
                        c12967j1 = c12967j1;
                        function17 = function7;
                        interfaceC2302h5 = interfaceC2302h4;
                        interfaceC30057d = null;
                    }
                    c28655q.m87173q(false);
                    abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                    if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                        c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                    } else {
                        c15656q = interfaceC30057d;
                    }
                    if (c15656q == 0) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c15656q = c15656q2;
                            return;
                        } else {
                            c15656q = c15656q2;
                            c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                            return;
                        }
                    }
                    c15656q = c15656q2;
                    function9 = function15;
                    function18 = function14;
                    function19 = function16;
                    function20 = function12;
                    AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                    function21 = function17;
                }
                c28677v1M87180u3 = c28655q.m87180u();
                if (c28677v1M87180u3 != null) {
                    c28677v1M87180u3.f115982d = new C15642e0(c12991u0, graph, modifier, interfaceC2302h5, function18, function21, function19, function9, function20, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function7 = function2;
            if ((i13 & 1572864) == 0) {
                function8 = function3;
                if ((i14 & 64) == 0) {
                    i28 = 524288;
                } else {
                    i28 = 524288;
                }
                i15 |= i28;
            } else {
                function8 = function3;
            }
            if ((i13 & 12582912) == 0) {
                if ((i14 & 128) == 0) {
                    function9 = function4;
                    if (c28655q.m87157i(function9)) {
                    }
                    i15 |= i34;
                } else {
                    function9 = function4;
                }
                i15 |= i34;
            } else {
                function9 = function4;
            }
            i24 = i14 & 256;
            i25 = i15;
            if (i24 != 0) {
                i25 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q.m87157i(function5)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i25 |= i26;
            }
            if ((i25 & 38347923) == 38347922) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                } else {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                }
                c28655q.m87175r();
                interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a != null) {
                    throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                }
                c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                c12967j1 = c12991u0.f44702w;
                AbstractC22676k.m65750j(graph, "graph");
                c12991u0.m36383K(graph, null);
                abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                if (abstractC12964i1Mo36434b instanceof C15648i) {
                    c15648i = (C15648i) abstractC12964i1Mo36434b;
                } else {
                    c15648i = null;
                }
                if (c15648i == null) {
                    c28677v1M87180u2 = c28655q.m87180u();
                    if (c28677v1M87180u2 != null) {
                        c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                        return;
                    }
                    return;
                }
                function13 = function9;
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC2302h4 = interfaceC2302h3;
                AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new LinkedHashMap();
                    c28655q.m87172p0(objM87133R6);
                }
                map = (Map) objM87133R6;
                function14 = function10;
                c28655q.m87150e0(653364988);
                if (c12982q != null) {
                    function22 = function7;
                    boolean zM87153g115 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                    if ((57344 & i27) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87153g115 | z13;
                    objM87133R7 = c28655q.m87133R();
                    if (z14) {
                        Function1 function2115 = function11;
                        C15648i c15648i114 = c15648i;
                        objM87133R7 = new C15646g0(c15648i114, function2115, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i114;
                        function16 = function2115;
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        Function1 function2116 = function11;
                        C15648i c15648i115 = c15648i;
                        objM87133R7 = new C15646g0(c15648i115, function2116, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i115;
                        function16 = function2116;
                        c28655q.m87172p0(objM87133R7);
                    }
                    function23 = (Function1) objM87133R7;
                    c15648i3 = c15648i2;
                    boolean zM87153g116 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                    function15 = function13;
                    if ((458752 & i27) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | zM87153g116;
                    objM87133R8 = c28655q.m87133R();
                    if (z16) {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    }
                    function24 = (Function1) objM87133R8;
                    if ((234881024 & i27) == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z17) {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function25 = (Function1) objM87133R9;
                    Boolean bool11 = Boolean.TRUE;
                    zM87153g2 = c28655q.m87153g(c15648i3);
                    objM87133R10 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87251e(bool11, (Function1) objM87133R10, c28655q);
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C11350f1(c12982q);
                        c28655q.m87172p0(objM87133R11);
                    }
                    c11350f1 = (C11350f1) objM87133R11;
                    c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                    if (m48890f(interfaceC28601c1)) {
                        c28655q.m87150e0(-1218260648);
                        Float fValueOf11 = Float.valueOf(r39.m87022x());
                        zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                        objM87133R15 = c28655q.m87133R();
                        if (zM87153g4) {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf11);
                        c28655q.m87173q(false);
                        c11421z1 = c11421z1M30543e;
                    } else {
                        interfaceC30057d = null;
                        c28655q.m87150e0(-1218005611);
                        zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                        objM87133R12 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                        c28655q.m87173q(false);
                    }
                    zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                    objM87133R13 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    }
                    int i315 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                    c11421z2 = c11421z1;
                    AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i315);
                    interfaceC2302h5 = interfaceC2302h4;
                    Object objMo2428y10 = c11421z2.f36630a.mo2428y0();
                    Object value11 = c11421z2.f36633d.getValue();
                    zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                    objM87133R14 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC28683x.m87254h(objMo2428y10, value11, (InterfaceC4351m) objM87133R14, c28655q);
                } else {
                    function15 = function13;
                    function16 = function11;
                    c12967j1 = c12967j1;
                    function17 = function7;
                    interfaceC2302h5 = interfaceC2302h4;
                    interfaceC30057d = null;
                }
                c28655q.m87173q(false);
                abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                    c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                } else {
                    c15656q = interfaceC30057d;
                }
                if (c15656q == 0) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c15656q = c15656q2;
                        return;
                    } else {
                        c15656q = c15656q2;
                        c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                        return;
                    }
                }
                c15656q = c15656q2;
                function9 = function15;
                function18 = function14;
                function19 = function16;
                function20 = function12;
                AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                function21 = function17;
            } else {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                } else {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                }
                c28655q.m87175r();
                interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a != null) {
                    throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                }
                c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                c12967j1 = c12991u0.f44702w;
                AbstractC22676k.m65750j(graph, "graph");
                c12991u0.m36383K(graph, null);
                abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                if (abstractC12964i1Mo36434b instanceof C15648i) {
                    c15648i = (C15648i) abstractC12964i1Mo36434b;
                } else {
                    c15648i = null;
                }
                if (c15648i == null) {
                    c28677v1M87180u2 = c28655q.m87180u();
                    if (c28677v1M87180u2 != null) {
                        c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                        return;
                    }
                    return;
                }
                function13 = function9;
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC2302h4 = interfaceC2302h3;
                AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new LinkedHashMap();
                    c28655q.m87172p0(objM87133R6);
                }
                map = (Map) objM87133R6;
                function14 = function10;
                c28655q.m87150e0(653364988);
                if (c12982q != null) {
                    function22 = function7;
                    boolean zM87153g117 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                    if ((57344 & i27) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87153g117 | z13;
                    objM87133R7 = c28655q.m87133R();
                    if (z14) {
                        Function1 function2117 = function11;
                        C15648i c15648i116 = c15648i;
                        objM87133R7 = new C15646g0(c15648i116, function2117, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i116;
                        function16 = function2117;
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        Function1 function2118 = function11;
                        C15648i c15648i117 = c15648i;
                        objM87133R7 = new C15646g0(c15648i117, function2118, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i117;
                        function16 = function2118;
                        c28655q.m87172p0(objM87133R7);
                    }
                    function23 = (Function1) objM87133R7;
                    c15648i3 = c15648i2;
                    boolean zM87153g118 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                    function15 = function13;
                    if ((458752 & i27) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | zM87153g118;
                    objM87133R8 = c28655q.m87133R();
                    if (z16) {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    }
                    function24 = (Function1) objM87133R8;
                    if ((234881024 & i27) == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z17) {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function25 = (Function1) objM87133R9;
                    Boolean bool12 = Boolean.TRUE;
                    zM87153g2 = c28655q.m87153g(c15648i3);
                    objM87133R10 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87251e(bool12, (Function1) objM87133R10, c28655q);
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C11350f1(c12982q);
                        c28655q.m87172p0(objM87133R11);
                    }
                    c11350f1 = (C11350f1) objM87133R11;
                    c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                    if (m48890f(interfaceC28601c1)) {
                        c28655q.m87150e0(-1218260648);
                        Float fValueOf12 = Float.valueOf(r39.m87022x());
                        zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                        objM87133R15 = c28655q.m87133R();
                        if (zM87153g4) {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf12);
                        c28655q.m87173q(false);
                        c11421z1 = c11421z1M30543e;
                    } else {
                        interfaceC30057d = null;
                        c28655q.m87150e0(-1218005611);
                        zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                        objM87133R12 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                        c28655q.m87173q(false);
                    }
                    zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                    objM87133R13 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    }
                    int i316 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                    c11421z2 = c11421z1;
                    AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i316);
                    interfaceC2302h5 = interfaceC2302h4;
                    Object objMo2428y11 = c11421z2.f36630a.mo2428y0();
                    Object value12 = c11421z2.f36633d.getValue();
                    zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                    objM87133R14 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC28683x.m87254h(objMo2428y11, value12, (InterfaceC4351m) objM87133R14, c28655q);
                } else {
                    function15 = function13;
                    function16 = function11;
                    c12967j1 = c12967j1;
                    function17 = function7;
                    interfaceC2302h5 = interfaceC2302h4;
                    interfaceC30057d = null;
                }
                c28655q.m87173q(false);
                abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                    c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                } else {
                    c15656q = interfaceC30057d;
                }
                if (c15656q == 0) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c15656q = c15656q2;
                        return;
                    } else {
                        c15656q = c15656q2;
                        c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                        return;
                    }
                }
                c15656q = c15656q2;
                function9 = function15;
                function18 = function14;
                function19 = function16;
                function20 = function12;
                AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                function21 = function17;
            }
            c28677v1M87180u3 = c28655q.m87180u();
            if (c28677v1M87180u3 != null) {
                c28677v1M87180u3.f115982d = new C15642e0(c12991u0, graph, modifier, interfaceC2302h5, function18, function21, function19, function9, function20, i13, i14);
            }
        }
        i15 |= 24576;
        function6 = function1;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                function7 = function2;
                if (c28655q.m87157i(function7)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((i13 & 1572864) == 0) {
                function8 = function3;
                if ((i14 & 64) == 0) {
                    i28 = 524288;
                } else {
                    i28 = 524288;
                }
                i15 |= i28;
            } else {
                function8 = function3;
            }
            if ((i13 & 12582912) == 0) {
                if ((i14 & 128) == 0) {
                    function9 = function4;
                    if (c28655q.m87157i(function9)) {
                    }
                    i15 |= i34;
                } else {
                    function9 = function4;
                }
                i15 |= i34;
            } else {
                function9 = function4;
            }
            i24 = i14 & 256;
            i25 = i15;
            if (i24 != 0) {
                i25 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q.m87157i(function5)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i25 |= i26;
            }
            if ((i25 & 38347923) == 38347922) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                } else {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                }
                c28655q.m87175r();
                interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a != null) {
                    throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                }
                c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                c12967j1 = c12991u0.f44702w;
                AbstractC22676k.m65750j(graph, "graph");
                c12991u0.m36383K(graph, null);
                abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                if (abstractC12964i1Mo36434b instanceof C15648i) {
                    c15648i = (C15648i) abstractC12964i1Mo36434b;
                } else {
                    c15648i = null;
                }
                if (c15648i == null) {
                    c28677v1M87180u2 = c28655q.m87180u();
                    if (c28677v1M87180u2 != null) {
                        c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                        return;
                    }
                    return;
                }
                function13 = function9;
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC2302h4 = interfaceC2302h3;
                AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new LinkedHashMap();
                    c28655q.m87172p0(objM87133R6);
                }
                map = (Map) objM87133R6;
                function14 = function10;
                c28655q.m87150e0(653364988);
                if (c12982q != null) {
                    function22 = function7;
                    boolean zM87153g119 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                    if ((57344 & i27) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87153g119 | z13;
                    objM87133R7 = c28655q.m87133R();
                    if (z14) {
                        Function1 function2119 = function11;
                        C15648i c15648i118 = c15648i;
                        objM87133R7 = new C15646g0(c15648i118, function2119, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i118;
                        function16 = function2119;
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        Function1 function21110 = function11;
                        C15648i c15648i119 = c15648i;
                        objM87133R7 = new C15646g0(c15648i119, function21110, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i119;
                        function16 = function21110;
                        c28655q.m87172p0(objM87133R7);
                    }
                    function23 = (Function1) objM87133R7;
                    c15648i3 = c15648i2;
                    boolean zM87153g1110 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                    function15 = function13;
                    if ((458752 & i27) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | zM87153g1110;
                    objM87133R8 = c28655q.m87133R();
                    if (z16) {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    }
                    function24 = (Function1) objM87133R8;
                    if ((234881024 & i27) == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z17) {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function25 = (Function1) objM87133R9;
                    Boolean bool13 = Boolean.TRUE;
                    zM87153g2 = c28655q.m87153g(c15648i3);
                    objM87133R10 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87251e(bool13, (Function1) objM87133R10, c28655q);
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C11350f1(c12982q);
                        c28655q.m87172p0(objM87133R11);
                    }
                    c11350f1 = (C11350f1) objM87133R11;
                    c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                    if (m48890f(interfaceC28601c1)) {
                        c28655q.m87150e0(-1218260648);
                        Float fValueOf13 = Float.valueOf(r39.m87022x());
                        zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                        objM87133R15 = c28655q.m87133R();
                        if (zM87153g4) {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf13);
                        c28655q.m87173q(false);
                        c11421z1 = c11421z1M30543e;
                    } else {
                        interfaceC30057d = null;
                        c28655q.m87150e0(-1218005611);
                        zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                        objM87133R12 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                        c28655q.m87173q(false);
                    }
                    zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                    objM87133R13 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    }
                    int i317 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                    c11421z2 = c11421z1;
                    AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i317);
                    interfaceC2302h5 = interfaceC2302h4;
                    Object objMo2428y12 = c11421z2.f36630a.mo2428y0();
                    Object value13 = c11421z2.f36633d.getValue();
                    zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                    objM87133R14 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC28683x.m87254h(objMo2428y12, value13, (InterfaceC4351m) objM87133R14, c28655q);
                } else {
                    function15 = function13;
                    function16 = function11;
                    c12967j1 = c12967j1;
                    function17 = function7;
                    interfaceC2302h5 = interfaceC2302h4;
                    interfaceC30057d = null;
                }
                c28655q.m87173q(false);
                abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                    c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                } else {
                    c15656q = interfaceC30057d;
                }
                if (c15656q == 0) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c15656q = c15656q2;
                        return;
                    } else {
                        c15656q = c15656q2;
                        c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                        return;
                    }
                }
                c15656q = c15656q2;
                function9 = function15;
                function18 = function14;
                function19 = function16;
                function20 = function12;
                AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                function21 = function17;
            } else {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                } else {
                    if (i29 != 0) {
                        interfaceC2302h2 = C2299e.f9114w;
                    }
                    if (i16 != 0) {
                        function6 = C15662w.f58779x;
                    }
                    if (i18 != 0) {
                        function7 = C15662w.f58780y;
                    }
                    if ((i14 & 64) != 0) {
                        i25 &= -3670017;
                        function8 = function6;
                    }
                    if ((i14 & 128) != 0) {
                        i25 &= -29360129;
                        function9 = function7;
                    }
                    if (i24 != 0) {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = null;
                    } else {
                        interfaceC2302h3 = interfaceC2302h2;
                        function10 = function6;
                        function11 = function8;
                        i27 = i25;
                        function12 = function5;
                    }
                }
                c28655q.m87175r();
                interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a != null) {
                    throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                }
                c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
                c12967j1 = c12991u0.f44702w;
                AbstractC22676k.m65750j(graph, "graph");
                c12991u0.m36383K(graph, null);
                abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
                if (abstractC12964i1Mo36434b instanceof C15648i) {
                    c15648i = (C15648i) abstractC12964i1Mo36434b;
                } else {
                    c15648i = null;
                }
                if (c15648i == null) {
                    c28677v1M87180u2 = c28655q.m87180u();
                    if (c28677v1M87180u2 != null) {
                        c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                        return;
                    }
                    return;
                }
                function13 = function9;
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC2302h4 = interfaceC2302h3;
                AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
                zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
                c39031dM124461g = AbstractC39038k.m124461g(c28655q);
                interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new LinkedHashMap();
                    c28655q.m87172p0(objM87133R6);
                }
                map = (Map) objM87133R6;
                function14 = function10;
                c28655q.m87150e0(653364988);
                if (c12982q != null) {
                    function22 = function7;
                    boolean zM87153g1111 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                    if ((57344 & i27) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87153g1111 | z13;
                    objM87133R7 = c28655q.m87133R();
                    if (z14) {
                        Function1 function21111 = function11;
                        C15648i c15648i1110 = c15648i;
                        objM87133R7 = new C15646g0(c15648i1110, function21111, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i1110;
                        function16 = function21111;
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        Function1 function21112 = function11;
                        C15648i c15648i1111 = c15648i;
                        objM87133R7 = new C15646g0(c15648i1111, function21112, function14, interfaceC28601c1, 0);
                        c15648i2 = c15648i1111;
                        function16 = function21112;
                        c28655q.m87172p0(objM87133R7);
                    }
                    function23 = (Function1) objM87133R7;
                    c15648i3 = c15648i2;
                    boolean zM87153g1112 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                    function15 = function13;
                    if ((458752 & i27) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | zM87153g1112;
                    objM87133R8 = c28655q.m87133R();
                    if (z16) {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                        function17 = function22;
                        c28655q.m87172p0(objM87133R8);
                    }
                    function24 = (Function1) objM87133R8;
                    if ((234881024 & i27) == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z17) {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C3786v0(function12, 6);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function25 = (Function1) objM87133R9;
                    Boolean bool14 = Boolean.TRUE;
                    zM87153g2 = c28655q.m87153g(c15648i3);
                    objM87133R10 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87251e(bool14, (Function1) objM87133R10, c28655q);
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C11350f1(c12982q);
                        c28655q.m87172p0(objM87133R11);
                    }
                    c11350f1 = (C11350f1) objM87133R11;
                    c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                    if (m48890f(interfaceC28601c1)) {
                        c28655q.m87150e0(-1218260648);
                        Float fValueOf14 = Float.valueOf(r39.m87022x());
                        zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                        objM87133R15 = c28655q.m87133R();
                        if (zM87153g4) {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                            interfaceC30057d = null;
                            c28655q.m87172p0(objM87133R15);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf14);
                        c28655q.m87173q(false);
                        c11421z1 = c11421z1M30543e;
                    } else {
                        interfaceC30057d = null;
                        c28655q.m87150e0(-1218005611);
                        zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                        objM87133R12 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                            c11421z1 = c11421z1M30543e;
                            c28655q.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                        c28655q.m87173q(false);
                    }
                    zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                    objM87133R13 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                        map2 = map;
                        c15648i4 = c15648i3;
                        interfaceC28670t3 = interfaceC28670t2;
                        c28655q.m87172p0(objM87133R13);
                    }
                    int i318 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                    c11421z2 = c11421z1;
                    AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i318);
                    interfaceC2302h5 = interfaceC2302h4;
                    Object objMo2428y13 = c11421z2.f36630a.mo2428y0();
                    Object value14 = c11421z2.f36633d.getValue();
                    zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                    objM87133R14 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC28683x.m87254h(objMo2428y13, value14, (InterfaceC4351m) objM87133R14, c28655q);
                } else {
                    function15 = function13;
                    function16 = function11;
                    c12967j1 = c12967j1;
                    function17 = function7;
                    interfaceC2302h5 = interfaceC2302h4;
                    interfaceC30057d = null;
                }
                c28655q.m87173q(false);
                abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
                if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                    c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
                } else {
                    c15656q = interfaceC30057d;
                }
                if (c15656q == 0) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c15656q = c15656q2;
                        return;
                    } else {
                        c15656q = c15656q2;
                        c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                        return;
                    }
                }
                c15656q = c15656q2;
                function9 = function15;
                function18 = function14;
                function19 = function16;
                function20 = function12;
                AbstractC1772c1.m5384a(c15656q, c28655q, 0);
                function21 = function17;
            }
            c28677v1M87180u3 = c28655q.m87180u();
            if (c28677v1M87180u3 != null) {
                c28677v1M87180u3.f115982d = new C15642e0(c12991u0, graph, modifier, interfaceC2302h5, function18, function21, function19, function9, function20, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function7 = function2;
        if ((i13 & 1572864) == 0) {
            function8 = function3;
            if ((i14 & 64) == 0) {
                i28 = 524288;
            } else {
                i28 = 524288;
            }
            i15 |= i28;
        } else {
            function8 = function3;
        }
        if ((i13 & 12582912) == 0) {
            if ((i14 & 128) == 0) {
                function9 = function4;
                if (c28655q.m87157i(function9)) {
                }
                i15 |= i34;
            } else {
                function9 = function4;
            }
            i15 |= i34;
        } else {
            function9 = function4;
        }
        i24 = i14 & 256;
        i25 = i15;
        if (i24 != 0) {
            i25 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c28655q.m87157i(function5)) {
                i26 = 67108864;
            } else {
                i26 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i25 |= i26;
        }
        if ((i25 & 38347923) == 38347922) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i29 != 0) {
                    interfaceC2302h2 = C2299e.f9114w;
                }
                if (i16 != 0) {
                    function6 = C15662w.f58779x;
                }
                if (i18 != 0) {
                    function7 = C15662w.f58780y;
                }
                if ((i14 & 64) != 0) {
                    i25 &= -3670017;
                    function8 = function6;
                }
                if ((i14 & 128) != 0) {
                    i25 &= -29360129;
                    function9 = function7;
                }
                if (i24 != 0) {
                    interfaceC2302h3 = interfaceC2302h2;
                    function10 = function6;
                    function11 = function8;
                    i27 = i25;
                    function12 = null;
                } else {
                    interfaceC2302h3 = interfaceC2302h2;
                    function10 = function6;
                    function11 = function8;
                    i27 = i25;
                    function12 = function5;
                }
            } else {
                if (i29 != 0) {
                    interfaceC2302h2 = C2299e.f9114w;
                }
                if (i16 != 0) {
                    function6 = C15662w.f58779x;
                }
                if (i18 != 0) {
                    function7 = C15662w.f58780y;
                }
                if ((i14 & 64) != 0) {
                    i25 &= -3670017;
                    function8 = function6;
                }
                if ((i14 & 128) != 0) {
                    i25 &= -29360129;
                    function9 = function7;
                }
                if (i24 != 0) {
                    interfaceC2302h3 = interfaceC2302h2;
                    function10 = function6;
                    function11 = function8;
                    i27 = i25;
                    function12 = null;
                } else {
                    interfaceC2302h3 = interfaceC2302h2;
                    function10 = function6;
                    function11 = function8;
                    i27 = i25;
                    function12 = function5;
                }
            }
            c28655q.m87175r();
            interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
            interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
            if (interfaceC1583f2M73844a != null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
            c12967j1 = c12991u0.f44702w;
            AbstractC22676k.m65750j(graph, "graph");
            c12991u0.m36383K(graph, null);
            abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
            if (abstractC12964i1Mo36434b instanceof C15648i) {
                c15648i = (C15648i) abstractC12964i1Mo36434b;
            } else {
                c15648i = null;
            }
            if (c15648i == null) {
                c28677v1M87180u2 = c28655q.m87180u();
                if (c28677v1M87180u2 != null) {
                    c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                    return;
                }
                return;
            }
            function13 = function9;
            interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC2302h4 = interfaceC2302h3;
            AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
            zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
            c39031dM124461g = AbstractC39038k.m124461g(c28655q);
            interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                c28655q.m87172p0(objM87133R5);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
            c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
            objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new LinkedHashMap();
                c28655q.m87172p0(objM87133R6);
            }
            map = (Map) objM87133R6;
            function14 = function10;
            c28655q.m87150e0(653364988);
            if (c12982q != null) {
                function22 = function7;
                boolean zM87153g1113 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                if ((57344 & i27) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87153g1113 | z13;
                objM87133R7 = c28655q.m87133R();
                if (z14) {
                    Function1 function21113 = function11;
                    C15648i c15648i1112 = c15648i;
                    objM87133R7 = new C15646g0(c15648i1112, function21113, function14, interfaceC28601c1, 0);
                    c15648i2 = c15648i1112;
                    function16 = function21113;
                    c28655q.m87172p0(objM87133R7);
                } else {
                    Function1 function21114 = function11;
                    C15648i c15648i1113 = c15648i;
                    objM87133R7 = new C15646g0(c15648i1113, function21114, function14, interfaceC28601c1, 0);
                    c15648i2 = c15648i1113;
                    function16 = function21114;
                    c28655q.m87172p0(objM87133R7);
                }
                function23 = (Function1) objM87133R7;
                c15648i3 = c15648i2;
                boolean zM87153g1114 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                function15 = function13;
                if ((458752 & i27) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | zM87153g1114;
                objM87133R8 = c28655q.m87133R();
                if (z16) {
                    objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                    function17 = function22;
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                    function17 = function22;
                    c28655q.m87172p0(objM87133R8);
                }
                function24 = (Function1) objM87133R8;
                if ((234881024 & i27) == 67108864) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R9 = c28655q.m87133R();
                if (z17) {
                    objM87133R9 = new C3786v0(function12, 6);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C3786v0(function12, 6);
                    c28655q.m87172p0(objM87133R9);
                }
                function25 = (Function1) objM87133R9;
                Boolean bool15 = Boolean.TRUE;
                zM87153g2 = c28655q.m87153g(c15648i3);
                objM87133R10 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87251e(bool15, (Function1) objM87133R10, c28655q);
                objM87133R11 = c28655q.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C11350f1(c12982q);
                    c28655q.m87172p0(objM87133R11);
                }
                c11350f1 = (C11350f1) objM87133R11;
                c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                if (m48890f(interfaceC28601c1)) {
                    c28655q.m87150e0(-1218260648);
                    Float fValueOf15 = Float.valueOf(r39.m87022x());
                    zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                    objM87133R15 = c28655q.m87133R();
                    if (zM87153g4) {
                        objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                        interfaceC30057d = null;
                        c28655q.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                        interfaceC30057d = null;
                        c28655q.m87172p0(objM87133R15);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf15);
                    c28655q.m87173q(false);
                    c11421z1 = c11421z1M30543e;
                } else {
                    interfaceC30057d = null;
                    c28655q.m87150e0(-1218005611);
                    zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                    objM87133R12 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                        c11421z1 = c11421z1M30543e;
                        c28655q.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                        c11421z1 = c11421z1M30543e;
                        c28655q.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                    c28655q.m87173q(false);
                }
                zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                objM87133R13 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                    map2 = map;
                    c15648i4 = c15648i3;
                    interfaceC28670t3 = interfaceC28670t2;
                    c28655q.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                    map2 = map;
                    c15648i4 = c15648i3;
                    interfaceC28670t3 = interfaceC28670t2;
                    c28655q.m87172p0(objM87133R13);
                }
                int i319 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                c11421z2 = c11421z1;
                AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i319);
                interfaceC2302h5 = interfaceC2302h4;
                Object objMo2428y14 = c11421z2.f36630a.mo2428y0();
                Object value15 = c11421z2.f36633d.getValue();
                zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                objM87133R14 = c28655q.m87133R();
                if (zM87153g3) {
                    objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                    c28655q.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                    c28655q.m87172p0(objM87133R14);
                }
                AbstractC28683x.m87254h(objMo2428y14, value15, (InterfaceC4351m) objM87133R14, c28655q);
            } else {
                function15 = function13;
                function16 = function11;
                c12967j1 = c12967j1;
                function17 = function7;
                interfaceC2302h5 = interfaceC2302h4;
                interfaceC30057d = null;
            }
            c28655q.m87173q(false);
            abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
            if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
            } else {
                c15656q = interfaceC30057d;
            }
            if (c15656q == 0) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c15656q = c15656q2;
                    return;
                } else {
                    c15656q = c15656q2;
                    c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                    return;
                }
            }
            c15656q = c15656q2;
            function9 = function15;
            function18 = function14;
            function19 = function16;
            function20 = function12;
            AbstractC1772c1.m5384a(c15656q, c28655q, 0);
            function21 = function17;
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i29 != 0) {
                    interfaceC2302h2 = C2299e.f9114w;
                }
                if (i16 != 0) {
                    function6 = C15662w.f58779x;
                }
                if (i18 != 0) {
                    function7 = C15662w.f58780y;
                }
                if ((i14 & 64) != 0) {
                    i25 &= -3670017;
                    function8 = function6;
                }
                if ((i14 & 128) != 0) {
                    i25 &= -29360129;
                    function9 = function7;
                }
                if (i24 != 0) {
                    interfaceC2302h3 = interfaceC2302h2;
                    function10 = function6;
                    function11 = function8;
                    i27 = i25;
                    function12 = null;
                } else {
                    interfaceC2302h3 = interfaceC2302h2;
                    function10 = function6;
                    function11 = function8;
                    i27 = i25;
                    function12 = function5;
                }
            } else {
                if (i29 != 0) {
                    interfaceC2302h2 = C2299e.f9114w;
                }
                if (i16 != 0) {
                    function6 = C15662w.f58779x;
                }
                if (i18 != 0) {
                    function7 = C15662w.f58780y;
                }
                if ((i14 & 64) != 0) {
                    i25 &= -3670017;
                    function8 = function6;
                }
                if ((i14 & 128) != 0) {
                    i25 &= -29360129;
                    function9 = function7;
                }
                if (i24 != 0) {
                    interfaceC2302h3 = interfaceC2302h2;
                    function10 = function6;
                    function11 = function8;
                    i27 = i25;
                    function12 = null;
                } else {
                    interfaceC2302h3 = interfaceC2302h2;
                    function10 = function6;
                    function11 = function8;
                    i27 = i25;
                    function12 = function5;
                }
            }
            c28655q.m87175r();
            interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
            interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
            if (interfaceC1583f2M73844a != null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            c12991u0.m36503P(interfaceC1583f2M73844a.getViewModelStore());
            c12967j1 = c12991u0.f44702w;
            AbstractC22676k.m65750j(graph, "graph");
            c12991u0.m36383K(graph, null);
            abstractC12964i1Mo36434b = c12967j1.mo36434b("composable");
            if (abstractC12964i1Mo36434b instanceof C15648i) {
                c15648i = (C15648i) abstractC12964i1Mo36434b;
            } else {
                c15648i = null;
            }
            if (c15648i == null) {
                c28677v1M87180u2 = c28655q.m87180u();
                if (c28677v1M87180u2 != null) {
                    c28677v1M87180u2.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h3, function10, function7, function11, function9, function12, i13, i14, 0);
                    return;
                }
                return;
            }
            function13 = function9;
            interfaceC28601c1M87261o = AbstractC28683x.m87261o(c15648i.m36435b().f44870e, c28655q, 0);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            if (((List) interfaceC28601c1M87261o.getValue()).size() > 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c15648i);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C3245h(c15648i, interfaceC28601c1M87261o, interfaceC28690z0, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC2302h4 = interfaceC2302h3;
            AbstractC1772c1.m5386c(z4, (InterfaceC4351m) objM87133R3, c28655q, 0);
            zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87157i(interfaceC1585g0);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C2442t0(6, c12991u0, interfaceC1585g0);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R4, c28655q);
            c39031dM124461g = AbstractC39038k.m124461g(c28655q);
            interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(c12991u0.f44690k, c28655q, 0);
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87264r(new C0222l0(interfaceC28601c1M87261o2, 10));
                c28655q.m87172p0(objM87133R5);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
            c12982q = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28670t2.getValue());
            objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new LinkedHashMap();
                c28655q.m87172p0(objM87133R6);
            }
            map = (Map) objM87133R6;
            function14 = function10;
            c28655q.m87150e0(653364988);
            if (c12982q != null) {
                function22 = function7;
                boolean zM87153g1115 = c28655q.m87153g(c15648i) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && c28655q.m87153g(function11)) || (i27 & 1572864) == 1048576);
                if ((57344 & i27) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87153g1115 | z13;
                objM87133R7 = c28655q.m87133R();
                if (z14) {
                    Function1 function21115 = function11;
                    C15648i c15648i1114 = c15648i;
                    objM87133R7 = new C15646g0(c15648i1114, function21115, function14, interfaceC28601c1, 0);
                    c15648i2 = c15648i1114;
                    function16 = function21115;
                    c28655q.m87172p0(objM87133R7);
                } else {
                    Function1 function21116 = function11;
                    C15648i c15648i1115 = c15648i;
                    objM87133R7 = new C15646g0(c15648i1115, function21116, function14, interfaceC28601c1, 0);
                    c15648i2 = c15648i1115;
                    function16 = function21116;
                    c28655q.m87172p0(objM87133R7);
                }
                function23 = (Function1) objM87133R7;
                c15648i3 = c15648i2;
                boolean zM87153g1116 = c28655q.m87153g(c15648i2) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && c28655q.m87153g(function13)) || (i27 & 12582912) == 8388608);
                function15 = function13;
                if ((458752 & i27) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | zM87153g1116;
                objM87133R8 = c28655q.m87133R();
                if (z16) {
                    objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                    function17 = function22;
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C15646g0(c15648i3, function15, function22, interfaceC28601c1, 1);
                    function17 = function22;
                    c28655q.m87172p0(objM87133R8);
                }
                function24 = (Function1) objM87133R8;
                if ((234881024 & i27) == 67108864) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R9 = c28655q.m87133R();
                if (z17) {
                    objM87133R9 = new C3786v0(function12, 6);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C3786v0(function12, 6);
                    c28655q.m87172p0(objM87133R9);
                }
                function25 = (Function1) objM87133R9;
                Boolean bool16 = Boolean.TRUE;
                zM87153g2 = c28655q.m87153g(c15648i3);
                objM87133R10 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C2442t0(7, interfaceC28670t2, c15648i3);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87251e(bool16, (Function1) objM87133R10, c28655q);
                objM87133R11 = c28655q.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C11350f1(c12982q);
                    c28655q.m87172p0(objM87133R11);
                }
                c11350f1 = (C11350f1) objM87133R11;
                c11421z1M30543e = AbstractC11343d2.m30543e(c11350f1, "entry", c28655q, 56);
                if (m48890f(interfaceC28601c1)) {
                    c28655q.m87150e0(-1218260648);
                    Float fValueOf16 = Float.valueOf(r39.m87022x());
                    zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(c11350f1);
                    objM87133R15 = c28655q.m87133R();
                    if (zM87153g4) {
                        objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                        interfaceC30057d = null;
                        c28655q.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new C15270p(c11350f1, interfaceC28601c1M87261o, interfaceC28690z0, (InterfaceC30057d) null, 2);
                        interfaceC30057d = null;
                        c28655q.m87172p0(objM87133R15);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R15, fValueOf16);
                    c28655q.m87173q(false);
                    c11421z1 = c11421z1M30543e;
                } else {
                    interfaceC30057d = null;
                    c28655q.m87150e0(-1218005611);
                    zM87157i2 = c28655q.m87157i(c11350f1) | c28655q.m87157i(c12982q) | c28655q.m87153g(c11421z1M30543e);
                    objM87133R12 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                        c11421z1 = c11421z1M30543e;
                        c28655q.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C1578e1(c11350f1, c12982q, c11421z1M30543e, interfaceC30057d, 9);
                        c11421z1 = c11421z1M30543e;
                        c28655q.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, c12982q);
                    c28655q.m87173q(false);
                }
                zM87157i3 = c28655q.m87157i(map) | c28655q.m87153g(c15648i3) | c28655q.m87153g(function23) | c28655q.m87153g(function24) | c28655q.m87153g(function25);
                objM87133R13 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                    map2 = map;
                    c15648i4 = c15648i3;
                    interfaceC28670t3 = interfaceC28670t2;
                    c28655q.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new C15634a0(map, c15648i3, function23, function24, function25, interfaceC28670t2, interfaceC28601c1);
                    map2 = map;
                    c15648i4 = c15648i3;
                    interfaceC28670t3 = interfaceC28670t2;
                    c28655q.m87172p0(objM87133R13);
                }
                int i3110 = ((i27 >> 3) & 112) | 221184 | (i27 & 7168);
                c11421z2 = c11421z1;
                AbstractC1089a.m3343a(c11421z2, modifier, (Function1) objM87133R13, interfaceC2302h4, C15636b0.f58683x, AbstractC37817c.m121344e(820763100, c28655q, new C15638c0(c39031dM124461g, interfaceC28601c1, interfaceC28670t3)), c28655q, i3110);
                interfaceC2302h5 = interfaceC2302h4;
                Object objMo2428y15 = c11421z2.f36630a.mo2428y0();
                Object value16 = c11421z2.f36633d.getValue();
                zM87153g3 = c28655q.m87153g(c11421z2) | c28655q.m87157i(c12991u0) | c28655q.m87153g(c15648i4) | c28655q.m87157i(map2);
                objM87133R14 = c28655q.m87133R();
                if (zM87153g3) {
                    objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                    c28655q.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new C15640d0(c11421z2, c12991u0, map2, interfaceC28670t3, c15648i4, null);
                    c28655q.m87172p0(objM87133R14);
                }
                AbstractC28683x.m87254h(objMo2428y15, value16, (InterfaceC4351m) objM87133R14, c28655q);
            } else {
                function15 = function13;
                function16 = function11;
                c12967j1 = c12967j1;
                function17 = function7;
                interfaceC2302h5 = interfaceC2302h4;
                interfaceC30057d = null;
            }
            c28655q.m87173q(false);
            abstractC12964i1Mo36434b2 = c12967j1.mo36434b("dialog");
            if (abstractC12964i1Mo36434b2 instanceof C15656q) {
                c15656q2 = (C15656q) abstractC12964i1Mo36434b2;
            } else {
                c15656q = interfaceC30057d;
            }
            if (c15656q == 0) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c15656q = c15656q2;
                    return;
                } else {
                    c15656q = c15656q2;
                    c28677v1M87180u.f115982d = new C15644f0(c12991u0, graph, modifier, interfaceC2302h5, function14, function17, function16, function15, function12, i13, i14, 1);
                    return;
                }
            }
            c15656q = c15656q2;
            function9 = function15;
            function18 = function14;
            function19 = function16;
            function20 = function12;
            AbstractC1772c1.m5384a(c15656q, c28655q, 0);
            function21 = function17;
        }
        c28677v1M87180u3 = c28655q.m87180u();
        if (c28677v1M87180u3 != null) {
            c28677v1M87180u3.f115982d = new C15642e0(c12991u0, graph, modifier, interfaceC2302h5, function18, function21, function19, function9, function20, i13, i14);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static C38314b m48885c0(AbstractC4737c abstractC4737c, C30387i c30387i, boolean z4) {
        return new C38314b(AbstractC3318q.m9616a(abstractC4737c, c30387i, z4 ? AbstractC12064i.m33265c() : 1.0f, C3307f.f12869c, false), 7);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0157  */
    /* JADX WARN: Code duplicated, block: B:104:0x015a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0162  */
    /* JADX WARN: Code duplicated, block: B:110:0x016c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0170  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:88:0x011a  */
    /* JADX WARN: Code duplicated, block: B:89:0x011d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0121  */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    /* JADX WARN: Code duplicated, block: B:96:0x0131  */
    /* JADX WARN: Code duplicated, block: B:99:0x014a  */
    /* JADX INFO: renamed from: d */
    public static final void m48886d(C12991u0 c12991u0, String str, Modifier modifier, InterfaceC2302h interfaceC2302h, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        int i17;
        int i18;
        int i19;
        Function1 function7;
        int i24;
        int i25;
        Function1 function8;
        int i26;
        char c3;
        C2307m c2307m;
        Function1 function9;
        Function1 function10;
        int i27;
        InterfaceC2302h interfaceC2302h2;
        int i28;
        Modifier modifier3;
        Function1 function11;
        Function1 function12;
        Function1 function13;
        Function1 function14;
        boolean z4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        Function1 function15;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        Function1 function19;
        InterfaceC2302h interfaceC2302h3;
        Modifier modifier4;
        C28677v1 c28677v1M87180u;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1840250294);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c12991u0) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        int i29 = i14 & 4;
        if (i29 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i15 | 27648;
            i17 = i14 & 32;
            if (i17 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
                i19 = i14 & 64;
                if (i19 != 0) {
                    if ((1572864 & i13) == 0) {
                        function7 = function2;
                        if (c28655q.m87157i(function7)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i16 |= i24;
                    }
                    if ((i13 & 12582912) == 0) {
                        i16 |= 4194304;
                    }
                    if ((i13 & 100663296) == 0) {
                        i16 |= AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i25 = i14 & 512;
                    if (i25 != 0) {
                        i16 |= 805306368;
                        function8 = function5;
                    } else {
                        function8 = function5;
                        if ((i13 & 805306368) == 0) {
                            if (c28655q.m87157i(function8)) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                            i16 |= i26;
                        }
                    }
                    if (c28655q.m87157i(function6)) {
                        c3 = 4;
                    } else {
                        c3 = 2;
                    }
                    if ((i16 & 306783379) != 306783378 && (c3 & 3) == 2 && c28655q.m87121F()) {
                        c28655q.m87138X();
                        interfaceC2302h3 = interfaceC2302h;
                        function17 = function3;
                        function16 = function4;
                        modifier4 = modifier2;
                        function18 = function7;
                        function15 = function8;
                        function19 = function1;
                    } else {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0 || c28655q.m87118C()) {
                            if (i29 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            c2307m = C2299e.f9114w;
                            if (i17 != 0) {
                                function9 = C15636b0.f58684y;
                            } else {
                                function9 = function1;
                            }
                            if (i19 != 0) {
                                function10 = C15636b0.f58685z;
                            } else {
                                function10 = function7;
                            }
                            i27 = (-264241153) & i16;
                            if (i25 != 0) {
                                function14 = function10;
                                function11 = function14;
                                function13 = null;
                                interfaceC2302h2 = c2307m;
                                i28 = i27;
                                modifier3 = modifier2;
                                function12 = function9;
                            } else {
                                interfaceC2302h2 = c2307m;
                                i28 = i27;
                                modifier3 = modifier2;
                                function11 = function10;
                                function12 = function9;
                                function13 = function8;
                                function14 = function11;
                            }
                        } else {
                            c28655q.m87138X();
                            i28 = i16 & (-264241153);
                            interfaceC2302h2 = interfaceC2302h;
                            function9 = function1;
                            function11 = function4;
                            function13 = function8;
                            modifier3 = modifier2;
                            function14 = function7;
                            function12 = function3;
                        }
                        c28655q.m87175r();
                        if ((i28 & 57344) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Modifier modifier5 = modifier3;
                        if ((i28 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | z4 | ((c3 & 14) == 4);
                        objM87133R = c28655q.m87133R();
                        if (z14 || objM87133R == C28635l.f115821a) {
                            C12987s0 c12987s0 = new C12987s0(c12991u0.f44702w, str);
                            function6.invoke(c12987s0);
                            objM87133R = c12987s0.m36490g();
                            c28655q.m87172p0(objM87133R);
                        }
                        int i34 = i28 & 8078;
                        int i35 = i28 >> 3;
                        m48884c(c12991u0, (C12985r0) objM87133R, modifier5, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i35 & 234881024) | i34 | (i35 & 57344) | (458752 & i35), 0);
                        function15 = function13;
                        function16 = function11;
                        function17 = function12;
                        function18 = function14;
                        function19 = function9;
                        interfaceC2302h3 = interfaceC2302h2;
                        modifier4 = modifier5;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C15661v(c12991u0, str, modifier4, interfaceC2302h3, function19, function18, function17, function16, function15, function6, i13, i14);
                    }
                }
                i16 |= 1572864;
                function7 = function2;
                if ((i13 & 12582912) == 0) {
                    i16 |= 4194304;
                }
                if ((i13 & 100663296) == 0) {
                    i16 |= AndroidSDKConstants.FLAG_MUTABLE;
                }
                i25 = i14 & 512;
                if (i25 != 0) {
                    i16 |= 805306368;
                    function8 = function5;
                } else {
                    function8 = function5;
                    if ((i13 & 805306368) == 0) {
                        if (c28655q.m87157i(function8)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i16 |= i26;
                    }
                }
                if (c28655q.m87157i(function6)) {
                    c3 = 4;
                } else {
                    c3 = 2;
                }
                if ((i16 & 306783379) != 306783378) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    } else {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    }
                    c28655q.m87175r();
                    if ((i28 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifier6 = modifier3;
                    if ((i28 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | z4 | ((c3 & 14) == 4);
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        C12987s0 c12987s1 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s1);
                        objM87133R = c12987s1.m36490g();
                        c28655q.m87172p0(objM87133R);
                    } else {
                        C12987s0 c12987s2 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s2);
                        objM87133R = c12987s2.m36490g();
                        c28655q.m87172p0(objM87133R);
                    }
                    int i36 = i28 & 8078;
                    int i37 = i28 >> 3;
                    m48884c(c12991u0, (C12985r0) objM87133R, modifier6, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i37 & 234881024) | i36 | (i37 & 57344) | (458752 & i37), 0);
                    function15 = function13;
                    function16 = function11;
                    function17 = function12;
                    function18 = function14;
                    function19 = function9;
                    interfaceC2302h3 = interfaceC2302h2;
                    modifier4 = modifier6;
                } else {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    } else {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    }
                    c28655q.m87175r();
                    if ((i28 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifier7 = modifier3;
                    if ((i28 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | z4 | ((c3 & 14) == 4);
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        C12987s0 c12987s3 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s3);
                        objM87133R = c12987s3.m36490g();
                        c28655q.m87172p0(objM87133R);
                    } else {
                        C12987s0 c12987s4 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s4);
                        objM87133R = c12987s4.m36490g();
                        c28655q.m87172p0(objM87133R);
                    }
                    int i38 = i28 & 8078;
                    int i39 = i28 >> 3;
                    m48884c(c12991u0, (C12985r0) objM87133R, modifier7, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i39 & 234881024) | i38 | (i39 & 57344) | (458752 & i39), 0);
                    function15 = function13;
                    function16 = function11;
                    function17 = function12;
                    function18 = function14;
                    function19 = function9;
                    interfaceC2302h3 = interfaceC2302h2;
                    modifier4 = modifier7;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15661v(c12991u0, str, modifier4, interfaceC2302h3, function19, function18, function17, function16, function15, function6, i13, i14);
                }
            }
            i16 = 224256 | i15;
            i19 = i14 & 64;
            if (i19 != 0) {
                if ((1572864 & i13) == 0) {
                    function7 = function2;
                    if (c28655q.m87157i(function7)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                if ((i13 & 12582912) == 0) {
                    i16 |= 4194304;
                }
                if ((i13 & 100663296) == 0) {
                    i16 |= AndroidSDKConstants.FLAG_MUTABLE;
                }
                i25 = i14 & 512;
                if (i25 != 0) {
                    i16 |= 805306368;
                    function8 = function5;
                } else {
                    function8 = function5;
                    if ((i13 & 805306368) == 0) {
                        if (c28655q.m87157i(function8)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i16 |= i26;
                    }
                }
                if (c28655q.m87157i(function6)) {
                    c3 = 4;
                } else {
                    c3 = 2;
                }
                if ((i16 & 306783379) != 306783378) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    } else {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    }
                    c28655q.m87175r();
                    if ((i28 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifier8 = modifier3;
                    if ((i28 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | z4 | ((c3 & 14) == 4);
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        C12987s0 c12987s5 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s5);
                        objM87133R = c12987s5.m36490g();
                        c28655q.m87172p0(objM87133R);
                    } else {
                        C12987s0 c12987s6 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s6);
                        objM87133R = c12987s6.m36490g();
                        c28655q.m87172p0(objM87133R);
                    }
                    int i310 = i28 & 8078;
                    int i311 = i28 >> 3;
                    m48884c(c12991u0, (C12985r0) objM87133R, modifier8, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i311 & 234881024) | i310 | (i311 & 57344) | (458752 & i311), 0);
                    function15 = function13;
                    function16 = function11;
                    function17 = function12;
                    function18 = function14;
                    function19 = function9;
                    interfaceC2302h3 = interfaceC2302h2;
                    modifier4 = modifier8;
                } else {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    } else {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    }
                    c28655q.m87175r();
                    if ((i28 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifier9 = modifier3;
                    if ((i28 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | z4 | ((c3 & 14) == 4);
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        C12987s0 c12987s7 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s7);
                        objM87133R = c12987s7.m36490g();
                        c28655q.m87172p0(objM87133R);
                    } else {
                        C12987s0 c12987s8 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s8);
                        objM87133R = c12987s8.m36490g();
                        c28655q.m87172p0(objM87133R);
                    }
                    int i312 = i28 & 8078;
                    int i313 = i28 >> 3;
                    m48884c(c12991u0, (C12985r0) objM87133R, modifier9, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i313 & 234881024) | i312 | (i313 & 57344) | (458752 & i313), 0);
                    function15 = function13;
                    function16 = function11;
                    function17 = function12;
                    function18 = function14;
                    function19 = function9;
                    interfaceC2302h3 = interfaceC2302h2;
                    modifier4 = modifier9;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15661v(c12991u0, str, modifier4, interfaceC2302h3, function19, function18, function17, function16, function15, function6, i13, i14);
                }
            }
            i16 |= 1572864;
            function7 = function2;
            if ((i13 & 12582912) == 0) {
                i16 |= 4194304;
            }
            if ((i13 & 100663296) == 0) {
                i16 |= AndroidSDKConstants.FLAG_MUTABLE;
            }
            i25 = i14 & 512;
            if (i25 != 0) {
                i16 |= 805306368;
                function8 = function5;
            } else {
                function8 = function5;
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(function8)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i16 |= i26;
                }
            }
            if (c28655q.m87157i(function6)) {
                c3 = 4;
            } else {
                c3 = 2;
            }
            if ((i16 & 306783379) != 306783378) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                } else {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                }
                c28655q.m87175r();
                if ((i28 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifier10 = modifier3;
                if ((i28 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | z4 | ((c3 & 14) == 4);
                objM87133R = c28655q.m87133R();
                if (z14) {
                    C12987s0 c12987s9 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s9);
                    objM87133R = c12987s9.m36490g();
                    c28655q.m87172p0(objM87133R);
                } else {
                    C12987s0 c12987s10 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s10);
                    objM87133R = c12987s10.m36490g();
                    c28655q.m87172p0(objM87133R);
                }
                int i314 = i28 & 8078;
                int i315 = i28 >> 3;
                m48884c(c12991u0, (C12985r0) objM87133R, modifier10, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i315 & 234881024) | i314 | (i315 & 57344) | (458752 & i315), 0);
                function15 = function13;
                function16 = function11;
                function17 = function12;
                function18 = function14;
                function19 = function9;
                interfaceC2302h3 = interfaceC2302h2;
                modifier4 = modifier10;
            } else {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                } else {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                }
                c28655q.m87175r();
                if ((i28 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifier11 = modifier3;
                if ((i28 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | z4 | ((c3 & 14) == 4);
                objM87133R = c28655q.m87133R();
                if (z14) {
                    C12987s0 c12987s11 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s11);
                    objM87133R = c12987s11.m36490g();
                    c28655q.m87172p0(objM87133R);
                } else {
                    C12987s0 c12987s12 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s12);
                    objM87133R = c12987s12.m36490g();
                    c28655q.m87172p0(objM87133R);
                }
                int i316 = i28 & 8078;
                int i317 = i28 >> 3;
                m48884c(c12991u0, (C12985r0) objM87133R, modifier11, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i317 & 234881024) | i316 | (i317 & 57344) | (458752 & i317), 0);
                function15 = function13;
                function16 = function11;
                function17 = function12;
                function18 = function14;
                function19 = function9;
                interfaceC2302h3 = interfaceC2302h2;
                modifier4 = modifier11;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15661v(c12991u0, str, modifier4, interfaceC2302h3, function19, function18, function17, function16, function15, function6, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i15 | 27648;
        i17 = i14 & 32;
        if (i17 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(function1)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
            i19 = i14 & 64;
            if (i19 != 0) {
                if ((1572864 & i13) == 0) {
                    function7 = function2;
                    if (c28655q.m87157i(function7)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                if ((i13 & 12582912) == 0) {
                    i16 |= 4194304;
                }
                if ((i13 & 100663296) == 0) {
                    i16 |= AndroidSDKConstants.FLAG_MUTABLE;
                }
                i25 = i14 & 512;
                if (i25 != 0) {
                    i16 |= 805306368;
                    function8 = function5;
                } else {
                    function8 = function5;
                    if ((i13 & 805306368) == 0) {
                        if (c28655q.m87157i(function8)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i16 |= i26;
                    }
                }
                if (c28655q.m87157i(function6)) {
                    c3 = 4;
                } else {
                    c3 = 2;
                }
                if ((i16 & 306783379) != 306783378) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    } else {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    }
                    c28655q.m87175r();
                    if ((i28 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifier12 = modifier3;
                    if ((i28 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | z4 | ((c3 & 14) == 4);
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        C12987s0 c12987s13 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s13);
                        objM87133R = c12987s13.m36490g();
                        c28655q.m87172p0(objM87133R);
                    } else {
                        C12987s0 c12987s14 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s14);
                        objM87133R = c12987s14.m36490g();
                        c28655q.m87172p0(objM87133R);
                    }
                    int i318 = i28 & 8078;
                    int i319 = i28 >> 3;
                    m48884c(c12991u0, (C12985r0) objM87133R, modifier12, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i319 & 234881024) | i318 | (i319 & 57344) | (458752 & i319), 0);
                    function15 = function13;
                    function16 = function11;
                    function17 = function12;
                    function18 = function14;
                    function19 = function9;
                    interfaceC2302h3 = interfaceC2302h2;
                    modifier4 = modifier12;
                } else {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    } else {
                        if (i29 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        c2307m = C2299e.f9114w;
                        if (i17 != 0) {
                            function9 = C15636b0.f58684y;
                        } else {
                            function9 = function1;
                        }
                        if (i19 != 0) {
                            function10 = C15636b0.f58685z;
                        } else {
                            function10 = function7;
                        }
                        i27 = (-264241153) & i16;
                        if (i25 != 0) {
                            function14 = function10;
                            function11 = function14;
                            function13 = null;
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function12 = function9;
                        } else {
                            interfaceC2302h2 = c2307m;
                            i28 = i27;
                            modifier3 = modifier2;
                            function11 = function10;
                            function12 = function9;
                            function13 = function8;
                            function14 = function11;
                        }
                    }
                    c28655q.m87175r();
                    if ((i28 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifier13 = modifier3;
                    if ((i28 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | z4 | ((c3 & 14) == 4);
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        C12987s0 c12987s15 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s15);
                        objM87133R = c12987s15.m36490g();
                        c28655q.m87172p0(objM87133R);
                    } else {
                        C12987s0 c12987s16 = new C12987s0(c12991u0.f44702w, str);
                        function6.invoke(c12987s16);
                        objM87133R = c12987s16.m36490g();
                        c28655q.m87172p0(objM87133R);
                    }
                    int i3110 = i28 & 8078;
                    int i3111 = i28 >> 3;
                    m48884c(c12991u0, (C12985r0) objM87133R, modifier13, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i3111 & 234881024) | i3110 | (i3111 & 57344) | (458752 & i3111), 0);
                    function15 = function13;
                    function16 = function11;
                    function17 = function12;
                    function18 = function14;
                    function19 = function9;
                    interfaceC2302h3 = interfaceC2302h2;
                    modifier4 = modifier13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15661v(c12991u0, str, modifier4, interfaceC2302h3, function19, function18, function17, function16, function15, function6, i13, i14);
                }
            }
            i16 |= 1572864;
            function7 = function2;
            if ((i13 & 12582912) == 0) {
                i16 |= 4194304;
            }
            if ((i13 & 100663296) == 0) {
                i16 |= AndroidSDKConstants.FLAG_MUTABLE;
            }
            i25 = i14 & 512;
            if (i25 != 0) {
                i16 |= 805306368;
                function8 = function5;
            } else {
                function8 = function5;
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(function8)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i16 |= i26;
                }
            }
            if (c28655q.m87157i(function6)) {
                c3 = 4;
            } else {
                c3 = 2;
            }
            if ((i16 & 306783379) != 306783378) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                } else {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                }
                c28655q.m87175r();
                if ((i28 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifier14 = modifier3;
                if ((i28 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | z4 | ((c3 & 14) == 4);
                objM87133R = c28655q.m87133R();
                if (z14) {
                    C12987s0 c12987s17 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s17);
                    objM87133R = c12987s17.m36490g();
                    c28655q.m87172p0(objM87133R);
                } else {
                    C12987s0 c12987s18 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s18);
                    objM87133R = c12987s18.m36490g();
                    c28655q.m87172p0(objM87133R);
                }
                int i3112 = i28 & 8078;
                int i3113 = i28 >> 3;
                m48884c(c12991u0, (C12985r0) objM87133R, modifier14, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i3113 & 234881024) | i3112 | (i3113 & 57344) | (458752 & i3113), 0);
                function15 = function13;
                function16 = function11;
                function17 = function12;
                function18 = function14;
                function19 = function9;
                interfaceC2302h3 = interfaceC2302h2;
                modifier4 = modifier14;
            } else {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                } else {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                }
                c28655q.m87175r();
                if ((i28 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifier15 = modifier3;
                if ((i28 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | z4 | ((c3 & 14) == 4);
                objM87133R = c28655q.m87133R();
                if (z14) {
                    C12987s0 c12987s19 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s19);
                    objM87133R = c12987s19.m36490g();
                    c28655q.m87172p0(objM87133R);
                } else {
                    C12987s0 c12987s110 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s110);
                    objM87133R = c12987s110.m36490g();
                    c28655q.m87172p0(objM87133R);
                }
                int i3114 = i28 & 8078;
                int i3115 = i28 >> 3;
                m48884c(c12991u0, (C12985r0) objM87133R, modifier15, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i3115 & 234881024) | i3114 | (i3115 & 57344) | (458752 & i3115), 0);
                function15 = function13;
                function16 = function11;
                function17 = function12;
                function18 = function14;
                function19 = function9;
                interfaceC2302h3 = interfaceC2302h2;
                modifier4 = modifier15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15661v(c12991u0, str, modifier4, interfaceC2302h3, function19, function18, function17, function16, function15, function6, i13, i14);
            }
        }
        i16 = 224256 | i15;
        i19 = i14 & 64;
        if (i19 != 0) {
            if ((1572864 & i13) == 0) {
                function7 = function2;
                if (c28655q.m87157i(function7)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            if ((i13 & 12582912) == 0) {
                i16 |= 4194304;
            }
            if ((i13 & 100663296) == 0) {
                i16 |= AndroidSDKConstants.FLAG_MUTABLE;
            }
            i25 = i14 & 512;
            if (i25 != 0) {
                i16 |= 805306368;
                function8 = function5;
            } else {
                function8 = function5;
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(function8)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i16 |= i26;
                }
            }
            if (c28655q.m87157i(function6)) {
                c3 = 4;
            } else {
                c3 = 2;
            }
            if ((i16 & 306783379) != 306783378) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                } else {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                }
                c28655q.m87175r();
                if ((i28 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifier16 = modifier3;
                if ((i28 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | z4 | ((c3 & 14) == 4);
                objM87133R = c28655q.m87133R();
                if (z14) {
                    C12987s0 c12987s111 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s111);
                    objM87133R = c12987s111.m36490g();
                    c28655q.m87172p0(objM87133R);
                } else {
                    C12987s0 c12987s112 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s112);
                    objM87133R = c12987s112.m36490g();
                    c28655q.m87172p0(objM87133R);
                }
                int i3116 = i28 & 8078;
                int i3117 = i28 >> 3;
                m48884c(c12991u0, (C12985r0) objM87133R, modifier16, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i3117 & 234881024) | i3116 | (i3117 & 57344) | (458752 & i3117), 0);
                function15 = function13;
                function16 = function11;
                function17 = function12;
                function18 = function14;
                function19 = function9;
                interfaceC2302h3 = interfaceC2302h2;
                modifier4 = modifier16;
            } else {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                } else {
                    if (i29 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    c2307m = C2299e.f9114w;
                    if (i17 != 0) {
                        function9 = C15636b0.f58684y;
                    } else {
                        function9 = function1;
                    }
                    if (i19 != 0) {
                        function10 = C15636b0.f58685z;
                    } else {
                        function10 = function7;
                    }
                    i27 = (-264241153) & i16;
                    if (i25 != 0) {
                        function14 = function10;
                        function11 = function14;
                        function13 = null;
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function12 = function9;
                    } else {
                        interfaceC2302h2 = c2307m;
                        i28 = i27;
                        modifier3 = modifier2;
                        function11 = function10;
                        function12 = function9;
                        function13 = function8;
                        function14 = function11;
                    }
                }
                c28655q.m87175r();
                if ((i28 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifier17 = modifier3;
                if ((i28 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | z4 | ((c3 & 14) == 4);
                objM87133R = c28655q.m87133R();
                if (z14) {
                    C12987s0 c12987s113 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s113);
                    objM87133R = c12987s113.m36490g();
                    c28655q.m87172p0(objM87133R);
                } else {
                    C12987s0 c12987s114 = new C12987s0(c12991u0.f44702w, str);
                    function6.invoke(c12987s114);
                    objM87133R = c12987s114.m36490g();
                    c28655q.m87172p0(objM87133R);
                }
                int i3118 = i28 & 8078;
                int i3119 = i28 >> 3;
                m48884c(c12991u0, (C12985r0) objM87133R, modifier17, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i3119 & 234881024) | i3118 | (i3119 & 57344) | (458752 & i3119), 0);
                function15 = function13;
                function16 = function11;
                function17 = function12;
                function18 = function14;
                function19 = function9;
                interfaceC2302h3 = interfaceC2302h2;
                modifier4 = modifier17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15661v(c12991u0, str, modifier4, interfaceC2302h3, function19, function18, function17, function16, function15, function6, i13, i14);
            }
        }
        i16 |= 1572864;
        function7 = function2;
        if ((i13 & 12582912) == 0) {
            i16 |= 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i16 |= AndroidSDKConstants.FLAG_MUTABLE;
        }
        i25 = i14 & 512;
        if (i25 != 0) {
            i16 |= 805306368;
            function8 = function5;
        } else {
            function8 = function5;
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(function8)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i16 |= i26;
            }
        }
        if (c28655q.m87157i(function6)) {
            c3 = 4;
        } else {
            c3 = 2;
        }
        if ((i16 & 306783379) != 306783378) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i29 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                c2307m = C2299e.f9114w;
                if (i17 != 0) {
                    function9 = C15636b0.f58684y;
                } else {
                    function9 = function1;
                }
                if (i19 != 0) {
                    function10 = C15636b0.f58685z;
                } else {
                    function10 = function7;
                }
                i27 = (-264241153) & i16;
                if (i25 != 0) {
                    function14 = function10;
                    function11 = function14;
                    function13 = null;
                    interfaceC2302h2 = c2307m;
                    i28 = i27;
                    modifier3 = modifier2;
                    function12 = function9;
                } else {
                    interfaceC2302h2 = c2307m;
                    i28 = i27;
                    modifier3 = modifier2;
                    function11 = function10;
                    function12 = function9;
                    function13 = function8;
                    function14 = function11;
                }
            } else {
                if (i29 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                c2307m = C2299e.f9114w;
                if (i17 != 0) {
                    function9 = C15636b0.f58684y;
                } else {
                    function9 = function1;
                }
                if (i19 != 0) {
                    function10 = C15636b0.f58685z;
                } else {
                    function10 = function7;
                }
                i27 = (-264241153) & i16;
                if (i25 != 0) {
                    function14 = function10;
                    function11 = function14;
                    function13 = null;
                    interfaceC2302h2 = c2307m;
                    i28 = i27;
                    modifier3 = modifier2;
                    function12 = function9;
                } else {
                    interfaceC2302h2 = c2307m;
                    i28 = i27;
                    modifier3 = modifier2;
                    function11 = function10;
                    function12 = function9;
                    function13 = function8;
                    function14 = function11;
                }
            }
            c28655q.m87175r();
            if ((i28 & 57344) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            Modifier modifier18 = modifier3;
            if ((i28 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | z4 | ((c3 & 14) == 4);
            objM87133R = c28655q.m87133R();
            if (z14) {
                C12987s0 c12987s115 = new C12987s0(c12991u0.f44702w, str);
                function6.invoke(c12987s115);
                objM87133R = c12987s115.m36490g();
                c28655q.m87172p0(objM87133R);
            } else {
                C12987s0 c12987s116 = new C12987s0(c12991u0.f44702w, str);
                function6.invoke(c12987s116);
                objM87133R = c12987s116.m36490g();
                c28655q.m87172p0(objM87133R);
            }
            int i31110 = i28 & 8078;
            int i31111 = i28 >> 3;
            m48884c(c12991u0, (C12985r0) objM87133R, modifier18, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i31111 & 234881024) | i31110 | (i31111 & 57344) | (458752 & i31111), 0);
            function15 = function13;
            function16 = function11;
            function17 = function12;
            function18 = function14;
            function19 = function9;
            interfaceC2302h3 = interfaceC2302h2;
            modifier4 = modifier18;
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i29 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                c2307m = C2299e.f9114w;
                if (i17 != 0) {
                    function9 = C15636b0.f58684y;
                } else {
                    function9 = function1;
                }
                if (i19 != 0) {
                    function10 = C15636b0.f58685z;
                } else {
                    function10 = function7;
                }
                i27 = (-264241153) & i16;
                if (i25 != 0) {
                    function14 = function10;
                    function11 = function14;
                    function13 = null;
                    interfaceC2302h2 = c2307m;
                    i28 = i27;
                    modifier3 = modifier2;
                    function12 = function9;
                } else {
                    interfaceC2302h2 = c2307m;
                    i28 = i27;
                    modifier3 = modifier2;
                    function11 = function10;
                    function12 = function9;
                    function13 = function8;
                    function14 = function11;
                }
            } else {
                if (i29 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                c2307m = C2299e.f9114w;
                if (i17 != 0) {
                    function9 = C15636b0.f58684y;
                } else {
                    function9 = function1;
                }
                if (i19 != 0) {
                    function10 = C15636b0.f58685z;
                } else {
                    function10 = function7;
                }
                i27 = (-264241153) & i16;
                if (i25 != 0) {
                    function14 = function10;
                    function11 = function14;
                    function13 = null;
                    interfaceC2302h2 = c2307m;
                    i28 = i27;
                    modifier3 = modifier2;
                    function12 = function9;
                } else {
                    interfaceC2302h2 = c2307m;
                    i28 = i27;
                    modifier3 = modifier2;
                    function11 = function10;
                    function12 = function9;
                    function13 = function8;
                    function14 = function11;
                }
            }
            c28655q.m87175r();
            if ((i28 & 57344) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            Modifier modifier19 = modifier3;
            if ((i28 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | z4 | ((c3 & 14) == 4);
            objM87133R = c28655q.m87133R();
            if (z14) {
                C12987s0 c12987s117 = new C12987s0(c12991u0.f44702w, str);
                function6.invoke(c12987s117);
                objM87133R = c12987s117.m36490g();
                c28655q.m87172p0(objM87133R);
            } else {
                C12987s0 c12987s118 = new C12987s0(c12991u0.f44702w, str);
                function6.invoke(c12987s118);
                objM87133R = c12987s118.m36490g();
                c28655q.m87172p0(objM87133R);
            }
            int i31112 = i28 & 8078;
            int i31113 = i28 >> 3;
            m48884c(c12991u0, (C12985r0) objM87133R, modifier19, interfaceC2302h2, function9, function14, function12, function11, function13, c28655q, (i31113 & 234881024) | i31112 | (i31113 & 57344) | (458752 & i31113), 0);
            function15 = function13;
            function16 = function11;
            function17 = function12;
            function18 = function14;
            function19 = function9;
            interfaceC2302h3 = interfaceC2302h2;
            modifier4 = modifier19;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15661v(c12991u0, str, modifier4, interfaceC2302h3, function19, function18, function17, function16, function15, function6, i13, i14);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static C38313a m48887d0(C4738d c4738d, C30387i c30387i, int i13) {
        C3313l c3313l = new C3313l();
        c3313l.f12888a = i13;
        ArrayList arrayListM9616a = AbstractC3318q.m9616a(c4738d, c30387i, 1.0f, c3313l, false);
        for (int i14 = 0; i14 < arrayListM9616a.size(); i14++) {
            C13224a c13224a = (C13224a) arrayListM9616a.get(i14);
            C39548c c39548c = (C39548c) c13224a.f45816b;
            C39548c c39548c2 = (C39548c) c13224a.f45817c;
            if (c39548c != null && c39548c2 != null) {
                float[] fArr = c39548c.f170132a;
                int length = fArr.length;
                float[] fArr2 = c39548c2.f170132a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f13 = Float.NaN;
                    int i15 = 0;
                    for (int i16 = 0; i16 < length2; i16++) {
                        float f14 = fArr3[i16];
                        if (f14 != f13) {
                            fArr3[i15] = f14;
                            i15++;
                            f13 = fArr3[i16];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i15);
                    c13224a = new C13224a(c39548c.m126327b(fArrCopyOfRange), c39548c2.m126327b(fArrCopyOfRange));
                }
            }
            arrayListM9616a.set(i14, c13224a);
        }
        return new C38313a(arrayListM9616a, 1);
    }

    /* JADX INFO: renamed from: e */
    public static final void m48888e(C12991u0 c12991u0, String str, Modifier modifier, Function1 function1, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(141827520);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c12991u0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        int i15 = i14 | 3456;
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(function1) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i15 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            boolean z4 = ((i15 & 7168) == 2048) | ((i15 & 112) == 32) | ((57344 & i15) == 16384);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                C12987s0 c12987s0 = new C12987s0(c12991u0.f44702w, str);
                function1.invoke(c12987s0);
                objM87133R = c12987s0.m36490g();
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            m48884c(c12991u0, (C12985r0) objM87133R, c2314t, null, null, null, null, null, null, c28655q, i15 & 910, 504);
            modifier2 = c2314t;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15665z(i13, 0, c12991u0, str, modifier2, function1);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static C38313a m48889e0(AbstractC4737c abstractC4737c, C30387i c30387i) {
        return new C38313a(AbstractC3318q.m9616a(abstractC4737c, c30387i, 1.0f, C3307f.f12870d, false), 2);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m48890f(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f0 */
    public static C38313a m48891f0(C4738d c4738d, C30387i c30387i) {
        return new C38313a(AbstractC3318q.m9616a(c4738d, c30387i, AbstractC12064i.m33265c(), C3307f.f12872f, true), 3);
    }

    /* JADX INFO: renamed from: g */
    public static C23242a m48892g(String str, C23285v0 c23285v0, long j7, InterfaceC39171c interfaceC39171c, InterfaceC28770h interfaceC28770h, int i13, int i14) {
        C25271y c25271y = C25271y.f99162w;
        return new C23242a(new C33491c(str, c23285v0, c25271y, c25271y, interfaceC28770h, interfaceC39171c), i13, 1, j7);
    }

    /* JADX INFO: renamed from: g0 */
    public static Modifier m48893g0(Modifier modifier, C21194l c21194l) {
        return AbstractC1129a.m3495a(modifier, new C21192j(new C1832u(1, c21194l, C21194l.class, "onPull", "onPull$material(F)F", 0, 16), new C21190h(2, c21194l, C21194l.class, "onRelease", "onRelease$material(F)F", 4, 0)), null);
    }

    /* JADX INFO: renamed from: h */
    public static final C16618c m48894h(long j7, long j13) {
        return new C16618c(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
    }

    /* JADX INFO: renamed from: i */
    public static final C16618c m48895i(float f13, long j7) {
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        return new C16618c(Float.intBitsToFloat(i13) - f13, Float.intBitsToFloat(i14) - f13, Float.intBitsToFloat(i13) + f13, Float.intBitsToFloat(i14) + f13);
    }

    /* JADX INFO: renamed from: j */
    public static final C16618c m48896j(long j7, long j13) {
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        return new C16618c(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat(i14));
    }

    /* JADX INFO: renamed from: j0 */
    public static final C18297c m48897j0(C41113q c41113q, InterfaceC25373b annotationsOwner) {
        AbstractC22676k.m65750j(c41113q, "<this>");
        AbstractC22676k.m65750j(annotationsOwner, "annotationsOwner");
        return new C18297c(c41113q, annotationsOwner, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x0184  */
    /* JADX WARN: Code duplicated, block: B:109:0x0194  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    /* JADX INFO: renamed from: k */
    public static final void m48898k(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, long j7, long j13, C13825t c13825t, float f13, final InterfaceC4351m interfaceC4351m, Composer composer, final int i13, final int i14) {
        int i15;
        InterfaceC17869a1 interfaceC17869a2;
        long jM43093h;
        long jM43101b;
        int i16;
        C13825t c13825t2;
        int i17;
        int i18;
        float f14;
        int i19;
        InterfaceC4351m interfaceC4351m2;
        int i24;
        boolean z4;
        final Modifier modifier2;
        final InterfaceC17869a1 interfaceC17869a3;
        final long j14;
        final long j15;
        final C13825t c13825t3;
        final float f15;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        Modifier modifier4;
        float f16;
        InterfaceC17869a1 interfaceC17869a4;
        long j16;
        C13825t c13825t4;
        int i25;
        int i26;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(174096871);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC17869a2 = interfaceC17869a1;
                i15 |= c28655q.m87153g(interfaceC17869a2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 4) == 0) {
                    jM43093h = j7;
                    int i29 = c28655q.m87151f(jM43093h) ? 256 : 128;
                    i15 |= i29;
                } else {
                    jM43093h = j7;
                }
                i15 |= i29;
            } else {
                jM43093h = j7;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    jM43101b = j13;
                    if (c28655q.m87151f(jM43101b)) {
                        i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i26;
                } else {
                    jM43101b = j13;
                }
                i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i26;
            } else {
                jM43101b = j13;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    c13825t2 = c13825t;
                    if (c28655q.m87153g(c13825t2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        f14 = f13;
                        if (c28655q.m87147d(f14)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    if ((1572864 & i13) == 0) {
                        interfaceC4351m2 = interfaceC4351m;
                        if (c28655q.m87157i(interfaceC4351m2)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    } else {
                        interfaceC4351m2 = interfaceC4351m;
                    }
                    i24 = i15;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i24 & 1, z4)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0 || c28655q.m87118C()) {
                            if (i27 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i28 != 0) {
                                interfaceC17869a2 = AbstractC17918w0.f69621a;
                            }
                            if ((i14 & 4) != 0) {
                                jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                            }
                            if ((i14 & 8) != 0) {
                                jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                            }
                            if (i16 != 0) {
                                c13825t2 = null;
                            }
                            if (i18 != 0) {
                                modifier4 = modifier3;
                                f16 = 0;
                                interfaceC17869a4 = interfaceC17869a2;
                                j16 = jM43093h;
                                c13825t4 = c13825t2;
                            } else {
                                modifier4 = modifier3;
                            }
                            c28655q.m87175r();
                            C28596b0 c28596b0 = AbstractC15158u2.f56855b;
                            float f17 = ((C39174f) c28655q.m87161k(c28596b0)).f168413w + f16;
                            AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(jM43101b)), c28596b0.mo86977a(new C39174f(f17))}, AbstractC37817c.m121344e(-2004281689, c28655q, new C15192x6(modifier4, interfaceC17869a4, j16, f17, c13825t4, f16, interfaceC4351m2)), c28655q, 56);
                            j15 = jM43101b;
                            modifier2 = modifier4;
                            interfaceC17869a3 = interfaceC17869a4;
                            j14 = j16;
                            c13825t3 = c13825t4;
                            f15 = f16;
                        } else {
                            c28655q.m87138X();
                            modifier4 = modifier;
                        }
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                        f16 = f14;
                        c28655q.m87175r();
                        C28596b0 c28596b1 = AbstractC15158u2.f56855b;
                        float f18 = ((C39174f) c28655q.m87161k(c28596b1)).f168413w + f16;
                        AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(jM43101b)), c28596b1.mo86977a(new C39174f(f18))}, AbstractC37817c.m121344e(-2004281689, c28655q, new C15192x6(modifier4, interfaceC17869a4, j16, f18, c13825t4, f16, interfaceC4351m2)), c28655q, 56);
                        j15 = jM43101b;
                        modifier2 = modifier4;
                        interfaceC17869a3 = interfaceC17869a4;
                        j14 = j16;
                        c13825t3 = c13825t4;
                        f15 = f16;
                    } else {
                        c28655q.m87138X();
                        modifier2 = modifier;
                        interfaceC17869a3 = interfaceC17869a2;
                        j14 = jM43093h;
                        j15 = jM43101b;
                        c13825t3 = c13825t2;
                        f15 = f14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.u6
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC17269i.m48898k(modifier2, interfaceC17869a3, j14, j15, c13825t3, f15, interfaceC4351m, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f14 = f13;
                if ((1572864 & i13) == 0) {
                    interfaceC4351m2 = interfaceC4351m;
                    if (c28655q.m87157i(interfaceC4351m2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                } else {
                    interfaceC4351m2 = interfaceC4351m;
                }
                i24 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i24 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i28 != 0) {
                            interfaceC17869a2 = AbstractC17918w0.f69621a;
                        }
                        if ((i14 & 4) != 0) {
                            jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        }
                        if ((i14 & 8) != 0) {
                            jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                        }
                        if (i16 != 0) {
                            c13825t2 = null;
                        }
                        if (i18 != 0) {
                            modifier4 = modifier3;
                            f16 = 0;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                        } else {
                            modifier4 = modifier3;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                            f16 = f14;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i28 != 0) {
                            interfaceC17869a2 = AbstractC17918w0.f69621a;
                        }
                        if ((i14 & 4) != 0) {
                            jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        }
                        if ((i14 & 8) != 0) {
                            jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                        }
                        if (i16 != 0) {
                            c13825t2 = null;
                        }
                        if (i18 != 0) {
                            modifier4 = modifier3;
                            f16 = 0;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                        } else {
                            modifier4 = modifier3;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                            f16 = f14;
                        }
                    }
                    c28655q.m87175r();
                    C28596b0 c28596b2 = AbstractC15158u2.f56855b;
                    float f19 = ((C39174f) c28655q.m87161k(c28596b2)).f168413w + f16;
                    AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(jM43101b)), c28596b2.mo86977a(new C39174f(f19))}, AbstractC37817c.m121344e(-2004281689, c28655q, new C15192x6(modifier4, interfaceC17869a4, j16, f19, c13825t4, f16, interfaceC4351m2)), c28655q, 56);
                    j15 = jM43101b;
                    modifier2 = modifier4;
                    interfaceC17869a3 = interfaceC17869a4;
                    j14 = j16;
                    c13825t3 = c13825t4;
                    f15 = f16;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    interfaceC17869a3 = interfaceC17869a2;
                    j14 = jM43093h;
                    j15 = jM43101b;
                    c13825t3 = c13825t2;
                    f15 = f14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.u6
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC17269i.m48898k(modifier2, interfaceC17869a3, j14, j15, c13825t3, f15, interfaceC4351m, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 24576;
            c13825t2 = c13825t;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((1572864 & i13) == 0) {
                    interfaceC4351m2 = interfaceC4351m;
                    if (c28655q.m87157i(interfaceC4351m2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                } else {
                    interfaceC4351m2 = interfaceC4351m;
                }
                i24 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i24 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i28 != 0) {
                            interfaceC17869a2 = AbstractC17918w0.f69621a;
                        }
                        if ((i14 & 4) != 0) {
                            jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        }
                        if ((i14 & 8) != 0) {
                            jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                        }
                        if (i16 != 0) {
                            c13825t2 = null;
                        }
                        if (i18 != 0) {
                            modifier4 = modifier3;
                            f16 = 0;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                        } else {
                            modifier4 = modifier3;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                            f16 = f14;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i28 != 0) {
                            interfaceC17869a2 = AbstractC17918w0.f69621a;
                        }
                        if ((i14 & 4) != 0) {
                            jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        }
                        if ((i14 & 8) != 0) {
                            jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                        }
                        if (i16 != 0) {
                            c13825t2 = null;
                        }
                        if (i18 != 0) {
                            modifier4 = modifier3;
                            f16 = 0;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                        } else {
                            modifier4 = modifier3;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                            f16 = f14;
                        }
                    }
                    c28655q.m87175r();
                    C28596b0 c28596b3 = AbstractC15158u2.f56855b;
                    float f110 = ((C39174f) c28655q.m87161k(c28596b3)).f168413w + f16;
                    AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(jM43101b)), c28596b3.mo86977a(new C39174f(f110))}, AbstractC37817c.m121344e(-2004281689, c28655q, new C15192x6(modifier4, interfaceC17869a4, j16, f110, c13825t4, f16, interfaceC4351m2)), c28655q, 56);
                    j15 = jM43101b;
                    modifier2 = modifier4;
                    interfaceC17869a3 = interfaceC17869a4;
                    j14 = j16;
                    c13825t3 = c13825t4;
                    f15 = f16;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    interfaceC17869a3 = interfaceC17869a2;
                    j14 = jM43093h;
                    j15 = jM43101b;
                    c13825t3 = c13825t2;
                    f15 = f14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.u6
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC17269i.m48898k(modifier2, interfaceC17869a3, j14, j15, c13825t3, f15, interfaceC4351m, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f14 = f13;
            if ((1572864 & i13) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                if (c28655q.m87157i(interfaceC4351m2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            } else {
                interfaceC4351m2 = interfaceC4351m;
            }
            i24 = i15;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i28 != 0) {
                        interfaceC17869a2 = AbstractC17918w0.f69621a;
                    }
                    if ((i14 & 4) != 0) {
                        jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                    }
                    if ((i14 & 8) != 0) {
                        jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                    }
                    if (i16 != 0) {
                        c13825t2 = null;
                    }
                    if (i18 != 0) {
                        modifier4 = modifier3;
                        f16 = 0;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                    } else {
                        modifier4 = modifier3;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                        f16 = f14;
                    }
                } else {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i28 != 0) {
                        interfaceC17869a2 = AbstractC17918w0.f69621a;
                    }
                    if ((i14 & 4) != 0) {
                        jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                    }
                    if ((i14 & 8) != 0) {
                        jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                    }
                    if (i16 != 0) {
                        c13825t2 = null;
                    }
                    if (i18 != 0) {
                        modifier4 = modifier3;
                        f16 = 0;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                    } else {
                        modifier4 = modifier3;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                        f16 = f14;
                    }
                }
                c28655q.m87175r();
                C28596b0 c28596b4 = AbstractC15158u2.f56855b;
                float f111 = ((C39174f) c28655q.m87161k(c28596b4)).f168413w + f16;
                AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(jM43101b)), c28596b4.mo86977a(new C39174f(f111))}, AbstractC37817c.m121344e(-2004281689, c28655q, new C15192x6(modifier4, interfaceC17869a4, j16, f111, c13825t4, f16, interfaceC4351m2)), c28655q, 56);
                j15 = jM43101b;
                modifier2 = modifier4;
                interfaceC17869a3 = interfaceC17869a4;
                j14 = j16;
                c13825t3 = c13825t4;
                f15 = f16;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                interfaceC17869a3 = interfaceC17869a2;
                j14 = jM43093h;
                j15 = jM43101b;
                c13825t3 = c13825t2;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.u6
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC17269i.m48898k(modifier2, interfaceC17869a3, j14, j15, c13825t3, f15, interfaceC4351m, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 48;
        interfaceC17869a2 = interfaceC17869a1;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                jM43093h = j7;
                if (c28655q.m87151f(jM43093h)) {
                }
                i15 |= i29;
            } else {
                jM43093h = j7;
            }
            i15 |= i29;
        } else {
            jM43093h = j7;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                jM43101b = j13;
                if (c28655q.m87151f(jM43101b)) {
                    i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i26;
            } else {
                jM43101b = j13;
            }
            i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i26;
        } else {
            jM43101b = j13;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                c13825t2 = c13825t;
                if (c28655q.m87153g(c13825t2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((1572864 & i13) == 0) {
                    interfaceC4351m2 = interfaceC4351m;
                    if (c28655q.m87157i(interfaceC4351m2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                } else {
                    interfaceC4351m2 = interfaceC4351m;
                }
                i24 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i24 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i28 != 0) {
                            interfaceC17869a2 = AbstractC17918w0.f69621a;
                        }
                        if ((i14 & 4) != 0) {
                            jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        }
                        if ((i14 & 8) != 0) {
                            jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                        }
                        if (i16 != 0) {
                            c13825t2 = null;
                        }
                        if (i18 != 0) {
                            modifier4 = modifier3;
                            f16 = 0;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                        } else {
                            modifier4 = modifier3;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                            f16 = f14;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i28 != 0) {
                            interfaceC17869a2 = AbstractC17918w0.f69621a;
                        }
                        if ((i14 & 4) != 0) {
                            jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                        }
                        if ((i14 & 8) != 0) {
                            jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                        }
                        if (i16 != 0) {
                            c13825t2 = null;
                        }
                        if (i18 != 0) {
                            modifier4 = modifier3;
                            f16 = 0;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                        } else {
                            modifier4 = modifier3;
                            interfaceC17869a4 = interfaceC17869a2;
                            j16 = jM43093h;
                            c13825t4 = c13825t2;
                            f16 = f14;
                        }
                    }
                    c28655q.m87175r();
                    C28596b0 c28596b5 = AbstractC15158u2.f56855b;
                    float f112 = ((C39174f) c28655q.m87161k(c28596b5)).f168413w + f16;
                    AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(jM43101b)), c28596b5.mo86977a(new C39174f(f112))}, AbstractC37817c.m121344e(-2004281689, c28655q, new C15192x6(modifier4, interfaceC17869a4, j16, f112, c13825t4, f16, interfaceC4351m2)), c28655q, 56);
                    j15 = jM43101b;
                    modifier2 = modifier4;
                    interfaceC17869a3 = interfaceC17869a4;
                    j14 = j16;
                    c13825t3 = c13825t4;
                    f15 = f16;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    interfaceC17869a3 = interfaceC17869a2;
                    j14 = jM43093h;
                    j15 = jM43101b;
                    c13825t3 = c13825t2;
                    f15 = f14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.u6
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC17269i.m48898k(modifier2, interfaceC17869a3, j14, j15, c13825t3, f15, interfaceC4351m, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f14 = f13;
            if ((1572864 & i13) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                if (c28655q.m87157i(interfaceC4351m2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            } else {
                interfaceC4351m2 = interfaceC4351m;
            }
            i24 = i15;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i28 != 0) {
                        interfaceC17869a2 = AbstractC17918w0.f69621a;
                    }
                    if ((i14 & 4) != 0) {
                        jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                    }
                    if ((i14 & 8) != 0) {
                        jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                    }
                    if (i16 != 0) {
                        c13825t2 = null;
                    }
                    if (i18 != 0) {
                        modifier4 = modifier3;
                        f16 = 0;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                    } else {
                        modifier4 = modifier3;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                        f16 = f14;
                    }
                } else {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i28 != 0) {
                        interfaceC17869a2 = AbstractC17918w0.f69621a;
                    }
                    if ((i14 & 4) != 0) {
                        jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                    }
                    if ((i14 & 8) != 0) {
                        jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                    }
                    if (i16 != 0) {
                        c13825t2 = null;
                    }
                    if (i18 != 0) {
                        modifier4 = modifier3;
                        f16 = 0;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                    } else {
                        modifier4 = modifier3;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                        f16 = f14;
                    }
                }
                c28655q.m87175r();
                C28596b0 c28596b6 = AbstractC15158u2.f56855b;
                float f113 = ((C39174f) c28655q.m87161k(c28596b6)).f168413w + f16;
                AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(jM43101b)), c28596b6.mo86977a(new C39174f(f113))}, AbstractC37817c.m121344e(-2004281689, c28655q, new C15192x6(modifier4, interfaceC17869a4, j16, f113, c13825t4, f16, interfaceC4351m2)), c28655q, 56);
                j15 = jM43101b;
                modifier2 = modifier4;
                interfaceC17869a3 = interfaceC17869a4;
                j14 = j16;
                c13825t3 = c13825t4;
                f15 = f16;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                interfaceC17869a3 = interfaceC17869a2;
                j14 = jM43093h;
                j15 = jM43101b;
                c13825t3 = c13825t2;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.u6
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC17269i.m48898k(modifier2, interfaceC17869a3, j14, j15, c13825t3, f15, interfaceC4351m, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 24576;
        c13825t2 = c13825t;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                f14 = f13;
                if (c28655q.m87147d(f14)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((1572864 & i13) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                if (c28655q.m87157i(interfaceC4351m2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            } else {
                interfaceC4351m2 = interfaceC4351m;
            }
            i24 = i15;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i28 != 0) {
                        interfaceC17869a2 = AbstractC17918w0.f69621a;
                    }
                    if ((i14 & 4) != 0) {
                        jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                    }
                    if ((i14 & 8) != 0) {
                        jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                    }
                    if (i16 != 0) {
                        c13825t2 = null;
                    }
                    if (i18 != 0) {
                        modifier4 = modifier3;
                        f16 = 0;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                    } else {
                        modifier4 = modifier3;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                        f16 = f14;
                    }
                } else {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i28 != 0) {
                        interfaceC17869a2 = AbstractC17918w0.f69621a;
                    }
                    if ((i14 & 4) != 0) {
                        jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                    }
                    if ((i14 & 8) != 0) {
                        jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                    }
                    if (i16 != 0) {
                        c13825t2 = null;
                    }
                    if (i18 != 0) {
                        modifier4 = modifier3;
                        f16 = 0;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                    } else {
                        modifier4 = modifier3;
                        interfaceC17869a4 = interfaceC17869a2;
                        j16 = jM43093h;
                        c13825t4 = c13825t2;
                        f16 = f14;
                    }
                }
                c28655q.m87175r();
                C28596b0 c28596b7 = AbstractC15158u2.f56855b;
                float f114 = ((C39174f) c28655q.m87161k(c28596b7)).f168413w + f16;
                AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(jM43101b)), c28596b7.mo86977a(new C39174f(f114))}, AbstractC37817c.m121344e(-2004281689, c28655q, new C15192x6(modifier4, interfaceC17869a4, j16, f114, c13825t4, f16, interfaceC4351m2)), c28655q, 56);
                j15 = jM43101b;
                modifier2 = modifier4;
                interfaceC17869a3 = interfaceC17869a4;
                j14 = j16;
                c13825t3 = c13825t4;
                f15 = f16;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                interfaceC17869a3 = interfaceC17869a2;
                j14 = jM43093h;
                j15 = jM43101b;
                c13825t3 = c13825t2;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.u6
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC17269i.m48898k(modifier2, interfaceC17869a3, j14, j15, c13825t3, f15, interfaceC4351m, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        f14 = f13;
        if ((1572864 & i13) == 0) {
            interfaceC4351m2 = interfaceC4351m;
            if (c28655q.m87157i(interfaceC4351m2)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i15 |= i25;
        } else {
            interfaceC4351m2 = interfaceC4351m;
        }
        i24 = i15;
        if ((i15 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i24 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i27 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i28 != 0) {
                    interfaceC17869a2 = AbstractC17918w0.f69621a;
                }
                if ((i14 & 4) != 0) {
                    jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                }
                if ((i14 & 8) != 0) {
                    jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                }
                if (i16 != 0) {
                    c13825t2 = null;
                }
                if (i18 != 0) {
                    modifier4 = modifier3;
                    f16 = 0;
                    interfaceC17869a4 = interfaceC17869a2;
                    j16 = jM43093h;
                    c13825t4 = c13825t2;
                } else {
                    modifier4 = modifier3;
                    interfaceC17869a4 = interfaceC17869a2;
                    j16 = jM43093h;
                    c13825t4 = c13825t2;
                    f16 = f14;
                }
            } else {
                if (i27 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i28 != 0) {
                    interfaceC17869a2 = AbstractC17918w0.f69621a;
                }
                if ((i14 & 4) != 0) {
                    jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                }
                if ((i14 & 8) != 0) {
                    jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
                }
                if (i16 != 0) {
                    c13825t2 = null;
                }
                if (i18 != 0) {
                    modifier4 = modifier3;
                    f16 = 0;
                    interfaceC17869a4 = interfaceC17869a2;
                    j16 = jM43093h;
                    c13825t4 = c13825t2;
                } else {
                    modifier4 = modifier3;
                    interfaceC17869a4 = interfaceC17869a2;
                    j16 = jM43093h;
                    c13825t4 = c13825t2;
                    f16 = f14;
                }
            }
            c28655q.m87175r();
            C28596b0 c28596b8 = AbstractC15158u2.f56855b;
            float f115 = ((C39174f) c28655q.m87161k(c28596b8)).f168413w + f16;
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(jM43101b)), c28596b8.mo86977a(new C39174f(f115))}, AbstractC37817c.m121344e(-2004281689, c28655q, new C15192x6(modifier4, interfaceC17869a4, j16, f115, c13825t4, f16, interfaceC4351m2)), c28655q, 56);
            j15 = jM43101b;
            modifier2 = modifier4;
            interfaceC17869a3 = interfaceC17869a4;
            j14 = j16;
            c13825t3 = c13825t4;
            f15 = f16;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            interfaceC17869a3 = interfaceC17869a2;
            j14 = jM43093h;
            j15 = jM43101b;
            c13825t3 = c13825t2;
            f15 = f14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.u6
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC17269i.m48898k(modifier2, interfaceC17869a3, j14, j15, c13825t3, f15, interfaceC4351m, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m48899k0(C20337g0 c20337g0) {
        return !(InterfaceC20357d.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) || InterfaceC20355b.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) || C20136p0.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0166  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    /* JADX INFO: renamed from: l */
    public static final void m48900l(final InterfaceC4339a interfaceC4339a, final Modifier modifier, boolean z4, final InterfaceC17869a1 interfaceC17869a1, final long j7, final long j13, C13825t c13825t, final float f13, final InterfaceC21083i interfaceC21083i, final C37816b c37816b, Composer composer, final int i13, final int i14) {
        int i15;
        boolean z13;
        InterfaceC17869a1 interfaceC17869a2;
        int i16;
        final C13825t c13825t2;
        int i17;
        InterfaceC21083i interfaceC21083i2;
        int i18;
        boolean z14;
        final boolean z15;
        C28677v1 c28677v1M87180u;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2141308794);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i29 = i14 & 4;
        if (i29 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                interfaceC17869a2 = interfaceC17869a1;
                if (c28655q.m87153g(interfaceC17869a2)) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i28;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87151f(j7)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i27;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87151f(j13)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            i16 = i14 & 64;
            if (i16 != 0) {
                if ((1572864 & i13) == 0) {
                    c13825t2 = c13825t;
                    if (c28655q.m87153g(c13825t2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
                if ((12582912 & i13) == 0) {
                    if (c28655q.m87147d(f13)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i15 |= i25;
                }
                if ((100663296 & i13) == 0) {
                    interfaceC21083i2 = interfaceC21083i;
                    if (c28655q.m87153g(interfaceC21083i2)) {
                        i24 = 67108864;
                    } else {
                        i24 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i24;
                } else {
                    interfaceC21083i2 = interfaceC21083i;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(c37816b)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i15 |= i19;
                }
                i18 = i15;
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i18 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0 || c28655q.m87118C()) {
                        if (i29 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            c13825t2 = null;
                        }
                    } else {
                        c28655q.m87138X();
                    }
                    boolean z16 = z13;
                    C13825t c13825t3 = c13825t2;
                    c28655q.m87175r();
                    C28596b0 c28596b0 = AbstractC15158u2.f56855b;
                    float f14 = ((C39174f) c28655q.m87161k(c28596b0)).f168413w + f13;
                    AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(j13)), c28596b0.mo86977a(new C39174f(f14))}, AbstractC37817c.m121344e(-1766606150, c28655q, new C15202y6(f14, f13, j7, modifier, interfaceC4339a, c13825t3, interfaceC17869a2, interfaceC21083i2, c37816b, z16)), c28655q, 56);
                    c13825t2 = c13825t3;
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.v6
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                            AbstractC17269i.m48900l(interfaceC4339a, modifier, z15, interfaceC17869a1, j7, j13, c13825t2, f13, interfaceC21083i, c37816b, (Composer) obj, iM87244L, i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 1572864;
            c13825t2 = c13825t;
            if ((12582912 & i13) == 0) {
                if (c28655q.m87147d(f13)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
            if ((100663296 & i13) == 0) {
                interfaceC21083i2 = interfaceC21083i;
                if (c28655q.m87153g(interfaceC21083i2)) {
                    i24 = 67108864;
                } else {
                    i24 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i24;
            } else {
                interfaceC21083i2 = interfaceC21083i;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(c37816b)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i15 |= i19;
            }
            i18 = i15;
            if ((i15 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        c13825t2 = null;
                    }
                } else {
                    if (i29 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        c13825t2 = null;
                    }
                }
                boolean z17 = z13;
                C13825t c13825t4 = c13825t2;
                c28655q.m87175r();
                C28596b0 c28596b1 = AbstractC15158u2.f56855b;
                float f15 = ((C39174f) c28655q.m87161k(c28596b1)).f168413w + f13;
                AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(j13)), c28596b1.mo86977a(new C39174f(f15))}, AbstractC37817c.m121344e(-1766606150, c28655q, new C15202y6(f15, f13, j7, modifier, interfaceC4339a, c13825t4, interfaceC17869a2, interfaceC21083i2, c37816b, z17)), c28655q, 56);
                c13825t2 = c13825t4;
                z15 = z17;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.v6
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        AbstractC17269i.m48900l(interfaceC4339a, modifier, z15, interfaceC17869a1, j7, j13, c13825t2, f13, interfaceC21083i, c37816b, (Composer) obj, iM87244L, i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            interfaceC17869a2 = interfaceC17869a1;
            if (c28655q.m87153g(interfaceC17869a2)) {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i28;
        } else {
            interfaceC17869a2 = interfaceC17869a1;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87151f(j7)) {
                i27 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i27 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i27;
        }
        if ((196608 & i13) == 0) {
            if (c28655q.m87151f(j13)) {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i26;
        }
        i16 = i14 & 64;
        if (i16 != 0) {
            if ((1572864 & i13) == 0) {
                c13825t2 = c13825t;
                if (c28655q.m87153g(c13825t2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q.m87147d(f13)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
            if ((100663296 & i13) == 0) {
                interfaceC21083i2 = interfaceC21083i;
                if (c28655q.m87153g(interfaceC21083i2)) {
                    i24 = 67108864;
                } else {
                    i24 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i24;
            } else {
                interfaceC21083i2 = interfaceC21083i;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(c37816b)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i15 |= i19;
            }
            i18 = i15;
            if ((i15 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        c13825t2 = null;
                    }
                } else {
                    if (i29 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        c13825t2 = null;
                    }
                }
                boolean z18 = z13;
                C13825t c13825t5 = c13825t2;
                c28655q.m87175r();
                C28596b0 c28596b2 = AbstractC15158u2.f56855b;
                float f16 = ((C39174f) c28655q.m87161k(c28596b2)).f168413w + f13;
                AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(j13)), c28596b2.mo86977a(new C39174f(f16))}, AbstractC37817c.m121344e(-1766606150, c28655q, new C15202y6(f16, f13, j7, modifier, interfaceC4339a, c13825t5, interfaceC17869a2, interfaceC21083i2, c37816b, z18)), c28655q, 56);
                c13825t2 = c13825t5;
                z15 = z18;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.v6
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        AbstractC17269i.m48900l(interfaceC4339a, modifier, z15, interfaceC17869a1, j7, j13, c13825t2, f13, interfaceC21083i, c37816b, (Composer) obj, iM87244L, i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 1572864;
        c13825t2 = c13825t;
        if ((12582912 & i13) == 0) {
            if (c28655q.m87147d(f13)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i15 |= i25;
        }
        if ((100663296 & i13) == 0) {
            interfaceC21083i2 = interfaceC21083i;
            if (c28655q.m87153g(interfaceC21083i2)) {
                i24 = 67108864;
            } else {
                i24 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i24;
        } else {
            interfaceC21083i2 = interfaceC21083i;
        }
        if ((i13 & 805306368) == 0) {
            if (c28655q.m87157i(c37816b)) {
                i19 = 536870912;
            } else {
                i19 = 268435456;
            }
            i15 |= i19;
        }
        i18 = i15;
        if ((i15 & 306783379) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i18 & 1, z14)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i29 != 0) {
                    z13 = true;
                }
                if (i16 != 0) {
                    c13825t2 = null;
                }
            } else {
                if (i29 != 0) {
                    z13 = true;
                }
                if (i16 != 0) {
                    c13825t2 = null;
                }
            }
            boolean z19 = z13;
            C13825t c13825t6 = c13825t2;
            c28655q.m87175r();
            C28596b0 c28596b3 = AbstractC15158u2.f56855b;
            float f17 = ((C39174f) c28655q.m87161k(c28596b3)).f168413w + f13;
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(j13)), c28596b3.mo86977a(new C39174f(f17))}, AbstractC37817c.m121344e(-1766606150, c28655q, new C15202y6(f17, f13, j7, modifier, interfaceC4339a, c13825t6, interfaceC17869a2, interfaceC21083i2, c37816b, z19)), c28655q, 56);
            c13825t2 = c13825t6;
            z15 = z19;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.v6
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                    AbstractC17269i.m48900l(interfaceC4339a, modifier, z15, interfaceC17869a1, j7, j13, c13825t2, f13, interfaceC21083i, c37816b, (Composer) obj, iM87244L, i14);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m48901l0(int i13, String str) {
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Error code: " + i13);
        if (str != null) {
            sb4.append(", message: ".concat(str));
        }
        throw new SQLException(sb4.toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public static final Object m48902m(File file, Function1 function1, AbstractC32269c abstractC32269c) throws IOException {
        C0449q0 c0449q0;
        if (abstractC32269c instanceof C0449q0) {
            c0449q0 = (C0449q0) abstractC32269c;
            int i13 = c0449q0.f1553y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0449q0.f1553y = i13 - Integer.MIN_VALUE;
            } else {
                c0449q0 = new C0449q0(abstractC32269c);
            }
        } else {
            c0449q0 = new C0449q0(abstractC32269c);
        }
        Object obj = c0449q0.f1552x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c0449q0.f1553y;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                File file2 = c0449q0.f1551w;
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            c0449q0.f1551w = file;
            c0449q0.f1553y = 1;
            Object objInvoke = function1.invoke(c0449q0);
            return objInvoke == obj2 ? obj2 : objInvoke;
        } catch (IOException e5) {
            if (e5 instanceof CorruptionException) {
                throw e5;
            }
            throw AbstractC34235f.m108235u(file, e5);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static final C21743a m48903m0(JSONObject jSONObject) throws JSONException {
        C21746d c21746dM34254F;
        AbstractC22676k.m65750j(jSONObject, "<this>");
        C21743a c21743a = new C21743a();
        String string = jSONObject.getString("event_type");
        AbstractC22676k.m65749i(string, "this.getString(\"event_type\")");
        c21743a.f83624M = string;
        c21743a.f83629a = m48881a0("user_id", jSONObject);
        c21743a.f83630b = m48881a0("device_id", jSONObject);
        C21745c c21745cM34037C = null;
        c21743a.f83631c = jSONObject.has("time") ? Long.valueOf(jSONObject.getLong("time")) : null;
        JSONObject jSONObjectM48879Z = m48879Z("event_properties", jSONObject);
        c21743a.f83625N = jSONObjectM48879Z != null ? AbstractC25247g0.m74003l0(AbstractC12889b.m36274g0(jSONObjectM48879Z)) : null;
        JSONObject jSONObjectM48879Z2 = m48879Z("user_properties", jSONObject);
        c21743a.f83626O = jSONObjectM48879Z2 != null ? AbstractC25247g0.m74003l0(AbstractC12889b.m36274g0(jSONObjectM48879Z2)) : null;
        JSONObject jSONObjectM48879Z3 = m48879Z("groups", jSONObject);
        c21743a.f83627P = jSONObjectM48879Z3 != null ? AbstractC25247g0.m74003l0(AbstractC12889b.m36274g0(jSONObjectM48879Z3)) : null;
        JSONObject jSONObjectM48879Z4 = m48879Z("group_properties", jSONObject);
        c21743a.f83628Q = jSONObjectM48879Z4 != null ? AbstractC25247g0.m74003l0(AbstractC12889b.m36274g0(jSONObjectM48879Z4)) : null;
        c21743a.f83637i = m48881a0("app_version", jSONObject);
        c21743a.f83639k = m48881a0("platform", jSONObject);
        c21743a.f83640l = m48881a0("os_name", jSONObject);
        c21743a.f83641m = m48881a0("os_version", jSONObject);
        c21743a.f83642n = m48881a0("device_brand", jSONObject);
        c21743a.f83643o = m48881a0("device_manufacturer", jSONObject);
        c21743a.f83644p = m48881a0("device_model", jSONObject);
        c21743a.f83645q = m48881a0("carrier", jSONObject);
        c21743a.f83646r = m48881a0("country", jSONObject);
        c21743a.f83647s = m48881a0("region", jSONObject);
        c21743a.f83648t = m48881a0("city", jSONObject);
        c21743a.f83649u = m48881a0("dma", jSONObject);
        c21743a.f83612A = m48881a0("language", jSONObject);
        c21743a.f83618G = jSONObject.has("price") ? Double.valueOf(jSONObject.getDouble("price")) : null;
        c21743a.f83619H = jSONObject.has("quantity") ? Integer.valueOf(jSONObject.getInt("quantity")) : null;
        c21743a.f83617F = jSONObject.has("revenue") ? Double.valueOf(jSONObject.getDouble("revenue")) : null;
        c21743a.f83620I = m48881a0("productId", jSONObject);
        c21743a.f83621J = m48881a0("revenueType", jSONObject);
        c21743a.f83635g = jSONObject.has("location_lat") ? Double.valueOf(jSONObject.getDouble("location_lat")) : null;
        c21743a.f83636h = jSONObject.has("location_lng") ? Double.valueOf(jSONObject.getDouble("location_lng")) : null;
        c21743a.f83614C = m48881a0("ip", jSONObject);
        c21743a.f83650v = m48881a0("idfa", jSONObject);
        c21743a.f83651w = m48881a0("idfv", jSONObject);
        c21743a.f83652x = m48881a0("adid", jSONObject);
        c21743a.f83654z = m48881a0("android_id", jSONObject);
        c21743a.f83653y = jSONObject.optString("android_app_set_id", null);
        c21743a.f83632d = jSONObject.has(AnalyticsRequestV2.PARAM_EVENT_ID) ? Long.valueOf(jSONObject.getLong(AnalyticsRequestV2.PARAM_EVENT_ID)) : null;
        c21743a.f83633e = jSONObject.has("session_id") ? Long.valueOf(jSONObject.getLong("session_id")) : null;
        c21743a.f83634f = m48881a0("insert_id", jSONObject);
        c21743a.f83613B = jSONObject.has("library") ? jSONObject.getString("library") : null;
        c21743a.f83622K = m48881a0("partner_id", jSONObject);
        if (jSONObject.has("plan")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("plan");
            AbstractC22676k.m65749i(jSONObject2, "this.getJSONObject(\"plan\")");
            c21746dM34254F = AbstractC12313p.m34254F(jSONObject2);
        } else {
            c21746dM34254F = null;
        }
        c21743a.f83615D = c21746dM34254F;
        if (jSONObject.has("ingestion_metadata")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("ingestion_metadata");
            AbstractC22676k.m65749i(jSONObject3, "this.getJSONObject(\"ingestion_metadata\")");
            c21745cM34037C = AbstractC12240d.m34037C(jSONObject3);
        }
        c21743a.f83616E = c21745cM34037C;
        return c21743a;
    }

    /* JADX INFO: renamed from: n */
    public static final Modifier m48904n(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, long j7, C13825t c13825t, float f13) {
        Modifier modifierM36262a0 = AbstractC12889b.m36262a0(modifier, f13, interfaceC17869a1, false, 0L, 0L, 24);
        Modifier modifierM44456i = C2314t.f9131w;
        if (c13825t != null) {
            modifierM44456i = AbstractC15751g.m44456i(c13825t.f49345a, modifierM44456i, c13825t.f49346b, interfaceC17869a1);
        }
        return AbstractC37056f.m118994r(AbstractC1092a.m3358c(modifierM36262a0.mo3471e(modifierM44456i), j7, interfaceC17869a1), interfaceC17869a1);
    }

    /* JADX INFO: renamed from: n0 */
    public static final ArrayList m48905n0(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC12889b.m36278i0(0, jSONArray.length()).iterator();
        while (((C18283i) it).f71138y) {
            JSONObject jSONObject = jSONArray.getJSONObject(((AbstractC25243e0) it).nextInt());
            AbstractC22676k.m65749i(jSONObject, "this.getJSONObject(it)");
            arrayList.add(m48903m0(jSONObject));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static final long m48906o(long j7, C15137s1 c15137s1, float f13, C28655q c28655q) {
        if (!C17919x.m51542d(j7, ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h()) || c15137s1 == null) {
            c28655q.m87150e0(-1124526507);
            c28655q.m87173q(false);
            return j7;
        }
        c28655q.m87150e0(-1124594614);
        long jM43186a = c15137s1.m43186a(j7, f13, c28655q, 0);
        c28655q.m87173q(false);
        return jM43186a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Class m48907o0(AbstractC23811y abstractC23811y) {
        AbstractC23763c0 abstractC23763c0M125544h;
        Class clsM48909p0 = m48909p0(abstractC23811y.mo69844i0().mo1784d());
        if (clsM48909p0 == null) {
            return null;
        }
        if (AbstractC23767d1.m69849e(abstractC23811y) && ((abstractC23763c0M125544h = AbstractC39365h.m125544h(abstractC23811y)) == null || AbstractC23767d1.m69849e(abstractC23763c0M125544h) || AbstractC27736h.m83805G(abstractC23763c0M125544h))) {
            return null;
        }
        return clsM48909p0;
    }

    /* JADX INFO: renamed from: p */
    public static void m48908p(AtomicLong atomicLong, long j7) {
        long j13;
        long j14;
        do {
            j13 = atomicLong.get();
            if (j13 == Long.MAX_VALUE) {
                return;
            } else {
                j14 = j13 + j7;
            }
        } while (!atomicLong.compareAndSet(j13, j14 >= 0 ? j14 : Long.MAX_VALUE));
    }

    /* JADX INFO: renamed from: p0 */
    public static final Class m48909p0(InterfaceC31135k interfaceC31135k) {
        if (!(interfaceC31135k instanceof InterfaceC31117e) || !AbstractC39365h.m125538b(interfaceC31135k)) {
            return null;
        }
        InterfaceC31117e interfaceC31117e = (InterfaceC31117e) interfaceC31135k;
        Class<?> javaClass = UtilKt.toJavaClass(interfaceC31117e);
        if (javaClass != null) {
            return javaClass;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + interfaceC31117e.getName() + " cannot be found (classId=" + AbstractC4393e.m13808f((InterfaceC31126h) interfaceC31135k) + ')');
    }

    /* JADX INFO: renamed from: q */
    public static final InterfaceC34971b m48910q(C30387i c30387i, boolean z4, boolean z13, AbstractC34987o abstractC34987o, float f13, int i13, C28655q c28655q, int i14) {
        c28655q.m87152f0(683659508);
        boolean z14 = (i14 & 2) != 0 ? true : z4;
        boolean z15 = (i14 & 4) != 0 ? true : z13;
        AbstractC34987o abstractC34987o2 = (i14 & 16) != 0 ? null : abstractC34987o;
        float f14 = (i14 & 32) != 0 ? 1.0f : f13;
        int i15 = (i14 & 64) != 0 ? 1 : i13;
        int i16 = (i14 & 128) == 0 ? 2 : 1;
        if (i15 <= 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i15, "Iterations must be a positive number (", ").").toString());
        }
        if (Float.isInfinite(f14) || Float.isNaN(f14)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f14 + '.').toString());
        }
        InterfaceC34971b interfaceC34971bM60692n0 = AbstractC21598x.m60692n0(c28655q);
        c28655q.m87152f0(-492369756);
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = AbstractC31061c.m95647w(z14, c28655q);
        }
        c28655q.m87173q(false);
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        c28655q.m87152f0(-180606834);
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        Matrix matrix = AbstractC12064i.f40031a;
        float f15 = f14 / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        c28655q.m87173q(false);
        AbstractC28683x.m87256j(new Object[]{c30387i, Boolean.valueOf(z14), abstractC34987o2, Float.valueOf(f15), Integer.valueOf(i15)}, new C34969a(z14, z15, interfaceC34971bM60692n0, c30387i, i15, f15, abstractC34987o2, i16, interfaceC28601c1, null), c28655q);
        c28655q.m87173q(false);
        return interfaceC34971bM60692n0;
    }

    /* JADX INFO: renamed from: q0 */
    public static final int[] m48911q0(JSONArray jSONArray) {
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = jSONArray.optInt(i13);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: r */
    public static final C17224a m48912r(Collection collection, Function1 src2Dest, Function1 dest2Src) {
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        AbstractC22676k.m65750j(dest2Src, "dest2Src");
        return new C17224a(collection, src2Dest, dest2Src);
    }

    /* JADX INFO: renamed from: r0 */
    public static final ArrayList m48913r0(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC12889b.m36278i0(0, jSONArray.length()).iterator();
        while (((C18283i) it).f71138y) {
            JSONObject jSONObject = jSONArray.getJSONObject(((AbstractC25243e0) it).nextInt());
            AbstractC22676k.m65749i(jSONObject, "this.getJSONObject(it)");
            arrayList.add(jSONObject);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static final C17229f m48914s(List list, Function1 src2Dest, Function1 dest2Src) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        AbstractC22676k.m65750j(dest2Src, "dest2Src");
        return new C17229f(list, src2Dest, dest2Src);
    }

    /* JADX INFO: renamed from: s0 */
    public static final C20027t m48915s0(InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j coroutineContext, boolean z4, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(interfaceC2994c0, "<this>");
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        C20020m c20020m = new C20020m(z4, AbstractC19997g.f75050c, 8);
        C2996c2 c2996c2M8732z = AbstractC3006f0.m8732z(interfaceC2994c0, coroutineContext, null, new C1578e1(c20020m, interfaceC4351m, (AbstractC3076z) interfaceC2994c0.getCoroutineContext().get(AbstractC3076z.Key), (InterfaceC30057d) null), 2);
        c2996c2M8732z.invokeOnCompletion(new C20019l(c20020m, 2));
        return new C20027t(c2996c2M8732z, c20020m);
    }

    /* JADX INFO: renamed from: t */
    public static final C17231h m48916t(InterfaceC15772m interfaceC15772m, C22693x c22693x, Function1 function1, C22693x c22693x2, Function1 function2) {
        AbstractC22676k.m65750j(interfaceC15772m, "<this>");
        return new C17231h(interfaceC15772m, c22693x, function1, c22693x2, function2);
    }

    /* JADX INFO: renamed from: u */
    public static final Boolean m48917u(boolean z4) {
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: v */
    public static final Integer m48918v(int i13) {
        return new Integer(i13);
    }

    /* JADX INFO: renamed from: z */
    public static final Object m48919z(Object obj, InterfaceC31111c descriptor) {
        AbstractC23811y abstractC23811yM48870Q;
        Class clsM48907o0;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return (((descriptor instanceof InterfaceC31145n0) && AbstractC39365h.m125540d((InterfaceC31110b1) descriptor)) || (abstractC23811yM48870Q = m48870Q(descriptor)) == null || (clsM48907o0 = m48907o0(abstractC23811yM48870Q)) == null) ? obj : m48871R(clsM48907o0, descriptor).invoke(obj, null);
    }

    /* JADX INFO: renamed from: E */
    public abstract String mo3962E(byte[] bArr, int i13, int i14);

    /* JADX INFO: renamed from: J */
    public abstract int mo3963J(String str, byte[] bArr, int i13, int i14);

    /* JADX INFO: renamed from: h0 */
    public abstract void mo31052h0(C11648g c11648g, C11648g c11648g2);

    /* JADX INFO: renamed from: i0 */
    public abstract void mo31053i0(C11648g c11648g, Thread thread);

    /* JADX INFO: renamed from: w */
    public abstract boolean mo31054w(AbstractC11649h abstractC11649h, C11645d c11645d, C11645d c11645d2);

    /* JADX INFO: renamed from: x */
    public abstract boolean mo31055x(AbstractC11649h abstractC11649h, Object obj, Object obj2);

    /* JADX INFO: renamed from: y */
    public abstract boolean mo31056y(AbstractC11649h abstractC11649h, C11648g c11648g, C11648g c11648g2);
}

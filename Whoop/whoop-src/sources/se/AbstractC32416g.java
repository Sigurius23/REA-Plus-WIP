package se;

import a00.C0072g;
import a41.C0374j;
import a81.C0556g;
import al0.C0971f;
import am0.C0998b;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.text.SpannableStringBuilder;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b30.C2570m;
import b30.C2641v3;
import b30.C2662y3;
import ba3.C2911i;
import bc3.C2990b0;
import bc3.C3023j1;
import bc3.C3031l1;
import bc3.InterfaceC3027k1;
import bg0.C3226h;
import c43.C4189e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ca3.C4377d;
import ca3.InterfaceC4379f;
import ca3.InterfaceC4385l;
import cb3.AbstractC4393e;
import ch.C4582c;
import ck1.C4780c;
import com.amplitude.android.engagement.types.BeaconMarker;
import com.amplitude.android.engagement.types.IconMarker;
import com.amplitude.android.engagement.types.ImageMarker;
import com.amplitude.android.engagement.types.Marker;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import d30.C11534g1;
import d30.C11546l;
import d30.C11552o;
import d30.C11566v;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11671p;
import da3.C11834a;
import ea3.C12933d;
import ea3.C12934e;
import f01.C13845b;
import f02.C13917c;
import fa3.AbstractC14305c;
import fa3.AbstractC14309e;
import fa3.AbstractC14311f;
import fa3.AbstractC14314g0;
import fa3.C14307d;
import g40.AbstractC15376j4;
import g40.C15440w2;
import g40.InterfaceC15391m3;
import g40.InterfaceC15450y2;
import h00.C16507i0;
import ha3.InterfaceC17060c;
import io.getstream.android.video.generated.models.ICEServer;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.C20543t;
import io.sentry.C20546t2;
import io.sentry.InterfaceC20317e1;
import io.sentry.config.AbstractC20301a;
import io.sentry.util.AbstractC20587i;
import j93.AbstractC21478l0;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23459e;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23773f1;
import lb3.AbstractC23800s0;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import lb3.C23765d;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import m40.C25046w;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import ma3.InterfaceC25376e;
import mb3.C25397n;
import mg.C25527i;
import n43.C26285a;
import n53.C26318e;
import n83.C26460c;
import ng.C26676f;
import ng.C26678h;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26944e0;
import no0.C26954j0;
import o73.C27648a;
import o93.AbstractC27736h;
import p000.AbstractC11266d;
import p000.C0003a0;
import p000.C12473e;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p006a4.AbstractC0355b;
import p026b2.C2298d;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2376g;
import p035bp.AbstractC3511b;
import p043c4.AbstractC3979v;
import p043c4.C3951c;
import p043c4.C3974q;
import p048ce.AbstractC4482w;
import p088dc.AbstractC11894a;
import p095dp.AbstractC12240d;
import p097ds.AbstractC12314q;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12667a;
import p132f0.C13825t;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15036i1;
import p163g1.AbstractC15044i9;
import p163g1.AbstractC15166v0;
import p163g1.C14970c1;
import p163g1.C15033h9;
import p163g1.C15052j6;
import p163g1.C15062k6;
import p163g1.C15069l3;
import p163g1.C15072l6;
import p163g1.C15092n6;
import p163g1.C15168v2;
import p163g1.C15178w2;
import p180h0.C16416l0;
import p180h0.EnumC16377d2;
import p208i2.AbstractC17918w0;
import p208i2.C17885g;
import p208i2.C17919x;
import p236j.C21074m;
import p249jc.AbstractC21598x;
import p267k.C22082c;
import p267k.InterfaceC22085f;
import p271k3.EnumC22167a;
import p280kf.C22425a;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23164r1;
import p294l3.C23285v0;
import p331n2.AbstractC26165a;
import p352ny.AbstractC27230b;
import p353o0.C27332p;
import p363ob.C27784g;
import p363ob.C27787j;
import p368og.C27914k;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p427qj.AbstractC30418c;
import p437qt.C30582e;
import p452r7.C31021k0;
import p459rf.C31343n;
import p479s4.AbstractC32128i;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p499t9.C33623c0;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p505ts.AbstractC34132o;
import p547v8.AbstractC35785b;
import p550vd.AbstractC35902e;
import p599wz.C37718g0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import pf.C29124b;
import pf.C29143u;
import pf.InterfaceC29123a;
import q00.C29737s;
import q00.C29738t;
import q00.C29739u;
import q83.AbstractC30060g;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;
import qa3.C30123c1;
import qa3.C30134g0;
import qa3.C30144j1;
import qa3.C30146k0;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31142m0;
import r93.InterfaceC31145n0;
import s20.C32077a;
import sa3.C32334h;
import sa3.C32336j;
import t00.C33254a;
import t20.C33333n;
import ta3.AbstractC33686l;
import u93.C34697q0;
import ua3.C34726f;
import ua3.C34727g;
import va3.AbstractC35844b;
import va3.C35850h;
import wa3.C37010o;
import wb3.AbstractC37056f;
import x43.AbstractC37978j;
import x93.C38112d0;
import y00.AbstractC38794c0;
import y00.C38774a0;
import y00.C38784b0;
import y00.C38991x;
import y00.EnumC38828f4;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: se.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC32416g {
    /* JADX INFO: renamed from: A */
    public static final InterfaceC31111c m101132A(InterfaceC31111c interfaceC31111c) {
        AbstractC22676k.m65750j(interfaceC31111c, "<this>");
        if (!AbstractC14314g0.f52270j.contains(interfaceC31111c.getName()) && !AbstractC14311f.f52254d.contains(AbstractC4393e.m13813k(interfaceC31111c).getName())) {
            return null;
        }
        if ((interfaceC31111c instanceof InterfaceC31145n0) || (interfaceC31111c instanceof InterfaceC31142m0)) {
            return AbstractC4393e.m13804b(interfaceC31111c, C14307d.f52239F);
        }
        if (interfaceC31111c instanceof C34697q0) {
            return AbstractC4393e.m13804b(interfaceC31111c, C14307d.f52240G);
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public static final InterfaceC31111c m101133B(InterfaceC31111c interfaceC31111c) {
        AbstractC22676k.m65750j(interfaceC31111c, "<this>");
        InterfaceC31111c interfaceC31111cM101132A = m101132A(interfaceC31111c);
        if (interfaceC31111cM101132A != null) {
            return interfaceC31111cM101132A;
        }
        int i13 = AbstractC14309e.f52250l;
        C35850h name = interfaceC31111c.getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        if (AbstractC14309e.m40919b(name)) {
            return AbstractC4393e.m13804b(interfaceC31111c, C14307d.f52241H);
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m101134C(C37718g0 c37718g0) {
        AbstractC22676k.m65750j(c37718g0, "<this>");
        String strMo124337q = c37718g0.f161636w.mo124337q();
        CountryCode.Companion.getClass();
        return !AbstractC22676k.m65745e(strMo124337q, CountryCode.f22161US.getValue());
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m101135D(InterfaceC31117e interfaceC31117e, InterfaceC31111c specialCallableDescriptor) {
        AbstractC22676k.m65750j(interfaceC31117e, "<this>");
        AbstractC22676k.m65750j(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC31135k interfaceC31135kMo60581g = specialCallableDescriptor.mo60581g();
        AbstractC22676k.m65748h(interfaceC31135kMo60581g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC23763c0 abstractC23763c0Mo60594i = ((InterfaceC31117e) interfaceC31135kMo60581g).mo60594i();
        AbstractC22676k.m65749i(abstractC23763c0Mo60594i, "getDefaultType(...)");
        for (InterfaceC31117e interfaceC31117eM125527i = AbstractC39363f.m125527i(interfaceC31117e); interfaceC31117eM125527i != null; interfaceC31117eM125527i = AbstractC39363f.m125527i(interfaceC31117eM125527i)) {
            if (!(interfaceC31117eM125527i instanceof InterfaceC17060c)) {
                AbstractC23763c0 abstractC23763c0Mo60594i2 = interfaceC31117eM125527i.mo60594i();
                if (abstractC23763c0Mo60594i2 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                AbstractC23773f1 abstractC23773f1M69851g = null;
                arrayDeque.add(new C25397n(abstractC23763c0Mo60594i2, null));
                InterfaceC23796q0 interfaceC23796q0Mo69844i0 = abstractC23763c0Mo60594i.mo69844i0();
                while (!arrayDeque.isEmpty()) {
                    C25397n c25397n = (C25397n) arrayDeque.poll();
                    AbstractC23811y abstractC23811yM69822g = c25397n.f99493a;
                    InterfaceC23796q0 interfaceC23796q0Mo69844i1 = abstractC23811yM69822g.mo69844i0();
                    if (interfaceC23796q0Mo69844i1 == null) {
                        AbstractC35785b.m113404a(3);
                        throw null;
                    }
                    if (interfaceC23796q0Mo69844i0 == null) {
                        AbstractC35785b.m113404a(4);
                        throw null;
                    }
                    if (interfaceC23796q0Mo69844i1.equals(interfaceC23796q0Mo69844i0)) {
                        boolean zMo69814k0 = abstractC23811yM69822g.mo69814k0();
                        for (C25397n c25397n2 = c25397n.f99494b; c25397n2 != null; c25397n2 = c25397n2.f99494b) {
                            AbstractC23811y abstractC23811y = c25397n2.f99493a;
                            List listMo69842X = abstractC23811y.mo69842X();
                            boolean z4 = listMo69842X instanceof Collection;
                            C23765d c23765d = AbstractC23800s0.f94190b;
                            if (!z4 || !listMo69842X.isEmpty()) {
                                Iterator it = listMo69842X.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        abstractC23811yM69822g = new C23758a1(c23765d.m69841f(abstractC23811y.mo69844i0(), abstractC23811y.mo69842X())).m69822g(abstractC23811yM69822g, EnumC23776g1.INVARIANT);
                                        break;
                                    }
                                    EnumC23776g1 enumC23776g1Mo69867a = ((AbstractC23804u0) it.next()).mo69867a();
                                    EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
                                    if (enumC23776g1Mo69867a != enumC23776g1) {
                                        abstractC23811yM69822g = (AbstractC23811y) AbstractC12240d.m34078o(new C23758a1(AbstractC35844b.m113771l(c23765d.m69841f(abstractC23811y.mo69844i0(), abstractC23811y.mo69842X()))).m69822g(abstractC23811yM69822g, enumC23776g1)).f123580b;
                                        break;
                                    }
                                }
                            } else {
                                abstractC23811yM69822g = new C23758a1(c23765d.m69841f(abstractC23811y.mo69844i0(), abstractC23811y.mo69842X())).m69822g(abstractC23811yM69822g, EnumC23776g1.INVARIANT);
                                break;
                            }
                            zMo69814k0 = zMo69814k0 || abstractC23811y.mo69814k0();
                        }
                        InterfaceC23796q0 interfaceC23796q0Mo69844i2 = abstractC23811yM69822g.mo69844i0();
                        if (interfaceC23796q0Mo69844i2 == null) {
                            AbstractC35785b.m113404a(3);
                            throw null;
                        }
                        if (interfaceC23796q0Mo69844i2.equals(interfaceC23796q0Mo69844i0)) {
                            abstractC23773f1M69851g = AbstractC23767d1.m69851g(abstractC23811yM69822g, zMo69814k0);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + AbstractC35902e.m113974n(interfaceC23796q0Mo69844i2) + ", \n\nsupertype: " + AbstractC35902e.m113974n(interfaceC23796q0Mo69844i0) + " \n" + interfaceC23796q0Mo69844i2.equals(interfaceC23796q0Mo69844i0));
                    }
                    for (AbstractC23811y abstractC23811y2 : interfaceC23796q0Mo69844i1.getSupertypes()) {
                        AbstractC22676k.m65747g(abstractC23811y2);
                        arrayDeque.add(new C25397n(abstractC23811y2, c25397n));
                    }
                }
                if (abstractC23773f1M69851g != null) {
                    return !AbstractC27736h.m83799A(interfaceC31117eM125527i);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m101136E(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m101137F(InterfaceC25376e interfaceC25376e) {
        C38112d0 c38112d0 = interfaceC25376e instanceof C38112d0 ? (C38112d0) interfaceC25376e : null;
        return (c38112d0 == null || c38112d0.m122097c() == null || c38112d0.m122098d()) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public static final int m101138G(C27332p c27332p, EnumC16377d2 enumC16377d2) {
        return (int) (enumC16377d2 == EnumC16377d2.f62971w ? c27332p.f109465t & 4294967295L : c27332p.f109465t >> 32);
    }

    /* JADX INFO: renamed from: H */
    public static final List m101139H(InterfaceC33689c interfaceC33689c) {
        int iM60700s = AbstractC21598x.m60700s(interfaceC33689c, "id");
        int iM60700s2 = AbstractC21598x.m60700s(interfaceC33689c, "seq");
        int iM60700s3 = AbstractC21598x.m60700s(interfaceC33689c, "from");
        int iM60700s4 = AbstractC21598x.m60700s(interfaceC33689c, "to");
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        while (interfaceC33689c.mo5355e1()) {
            c26460cM119000x.add(new C27784g((int) interfaceC33689c.getLong(iM60700s), (int) interfaceC33689c.getLong(iM60700s2), interfaceC33689c.mo5353J0(iM60700s3), interfaceC33689c.mo5353J0(iM60700s4)));
        }
        return AbstractC25265s.m74150t1(AbstractC37056f.m118988k(c26460cM119000x));
    }

    /* JADX INFO: renamed from: I */
    public static final C27787j m101140I(String str, InterfaceC33687a interfaceC33687a, boolean z4) {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iM60700s = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "seqno");
            int iM60700s2 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "cid");
            int iM60700s3 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "name");
            int iM60700s4 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "desc");
            if (iM60700s != -1 && iM60700s2 != -1 && iM60700s3 != -1 && iM60700s4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (interfaceC33689cMo68212g1.mo5355e1()) {
                    if (((int) interfaceC33689cMo68212g1.getLong(iM60700s2)) >= 0) {
                        int i13 = (int) interfaceC33689cMo68212g1.getLong(iM60700s);
                        String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60700s3);
                        String str2 = interfaceC33689cMo68212g1.getLong(iM60700s4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i13), strMo5353J0);
                        linkedHashMap2.put(Integer.valueOf(i13), str2);
                    }
                }
                List listM74152u1 = AbstractC25265s.m74152u1(linkedHashMap.entrySet(), new C2298d(21));
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74152u1, 10));
                Iterator it = listM74152u1.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM74093D1 = AbstractC25265s.m74093D1(arrayList);
                List listM74152u2 = AbstractC25265s.m74152u1(linkedHashMap2.entrySet(), new C2298d(22));
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74152u2, 10));
                Iterator it3 = listM74152u2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it3.next()).getValue());
                }
                C27787j c27787j = new C27787j(str, listM74093D1, AbstractC25265s.m74093D1(arrayList2), z4);
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
                return c27787j;
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m101141J(Metadata metadata) {
        C23465k c23465kM109657i = C34727g.m109657i(AbstractC32411b.m101082Z(metadata), metadata.m65681d2());
        C34726f strings = (C34726f) c23465kM109657i.f92937w;
        C30134g0 c30134g0 = (C30134g0) c23465kM109657i.f92938x;
        boolean z4 = new C11834a(metadata.m65683mv()).compareTo(new C11834a(1, 4, 0)) < 0;
        AbstractC22676k.m65750j(c30134g0, "<this>");
        AbstractC22676k.m65750j(strings, "strings");
        C0072g c0072g = new C0072g(3);
        C30123c1 c30123c1 = c30134g0.f123155G;
        AbstractC22676k.m65749i(c30123c1, "getTypeTable(...)");
        C32334h c32334h = new C32334h(c30123c1);
        C32336j c32336j = C32336j.f133837b;
        C30144j1 c30144j1 = c30134g0.f123156H;
        AbstractC22676k.m65749i(c30144j1, "getVersionRequirementTable(...)");
        C2911i c2911i = new C2911i(strings, c32334h, AbstractC29125c.m88541r(c30144j1), z4, C25271y.f99162w, 16);
        List list = c30134g0.f123161z;
        AbstractC22676k.m65749i(list, "getFunctionList(...)");
        List list2 = c30134g0.f123153E;
        AbstractC22676k.m65749i(list2, "getPropertyList(...)");
        List list3 = c30134g0.f123154F;
        AbstractC22676k.m65749i(list3, "getTypeAliasList(...)");
        AbstractC34132o.m107875T(c0072g, list, list2, list3, c2911i);
        Iterator it = c2911i.f11701h.iterator();
        while (it.hasNext()) {
            ((C12933d) ((InterfaceC4385l) it.next())).getClass();
            C4377d type = C12934e.f44664b;
            AbstractC22676k.m65750j(type, "type");
            C12934e c12934e = (C12934e) ((InterfaceC4379f) AbstractC34132o.m107863H((ArrayList) c0072g.f221E, type));
            for (C30146k0 c30146k0 : (List) c30134g0.m118820k(AbstractC33686l.f140746l)) {
                ArrayList arrayList = c12934e.f44665a;
                AbstractC22676k.m65747g(c30146k0);
                arrayList.add(AbstractC34132o.m107869N(c30146k0, c2911i));
            }
            C37010o packageModuleName = AbstractC33686l.f140745k;
            AbstractC22676k.m65749i(packageModuleName, "packageModuleName");
            Integer num = (Integer) AbstractC21478l0.m60453x(c30134g0, packageModuleName);
            if (num != null) {
                c2911i.f11694a.getString(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m101142K(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Object value = AbstractC30060g.m92088H(new C0971f(context, 17)).getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        SharedPreferences.Editor editorEdit = ((SharedPreferences) value).edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: L */
    public static final C4189e m101143L(ICEServer iCEServer) {
        AbstractC22676k.m65750j(iCEServer, "<this>");
        return new C4189e(iCEServer.getUrls(), iCEServer.getUsername(), iCEServer.getPassword());
    }

    /* JADX INFO: renamed from: a */
    public static final void m101144a(C2570m form, Function1 onValuesChanged, Composer composer, int i13) {
        AbstractC22676k.m65750j(form, "form");
        AbstractC22676k.m65750j(onValuesChanged, "onValuesChanged");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1097081514);
        int i14 = (c28655q.m87153g(form) ? 4 : 2) | i13 | (c28655q.m87157i(onValuesChanged) ? 32 : 16);
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC22674j.m65730p(true, (C15440w2) form.f9989z, (Set) C27648a.m83597t((C26318e) form.f9984E, c28655q, 0).getValue(), null, null, c28655q, 3142, 16);
            c28655q.m87150e0(-1288901972);
            boolean z4 = ((i14 & 14) == 4) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C12473e(form, onValuesChanged, (InterfaceC30057d) null, 15);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0003a0(form, onValuesChanged, i13, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m101145b(InterfaceC15391m3 interfaceC15391m3, boolean z4, InterfaceC15450y2 interfaceC15450y2, Modifier modifier, Set set, IdentifierSpec identifierSpec, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-441413865);
        int i14 = i13 << 3;
        AbstractC15376j4.m43587c(interfaceC15391m3, z4, AbstractC22676k.m65745e(identifierSpec, interfaceC15450y2.mo43531a()) ? 7 : 6, modifier, null, 0, 0, null, false, false, c28655q, ((i13 >> 15) & 14) | (i14 & 112) | (i14 & 7168), MessageListItemViewType.GIPHY);
        c28655q.m87173q(false);
    }

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
    /* JADX INFO: renamed from: c */
    public static final void m101146c(C15072l6 c15072l6, Modifier modifier, Composer composer, int i13) {
        Object obj;
        boolean z4;
        C37816b c37816b = AbstractC15036i1.f56299a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1354335728);
        int i14 = (i13 & 6) == 0 ? ((i13 & 8) == 0 ? c28655q.m87153g(c15072l6) : c28655q.m87157i(c15072l6) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 256 : 128;
        }
        boolean z13 = true;
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                obj = objM87133R;
                C15178w2 c15178w2 = new C15178w2();
                c15178w2.f56967a = new Object();
                c15178w2.f56968b = new ArrayList();
                c28655q.m87172p0(c15178w2);
                obj = c15178w2;
            }
            obj = objM87133R;
            C15178w2 c15178w3 = (C15178w2) obj;
            String strM101177H = AbstractC32417h.m101177H(c28655q, 7);
            Object obj2 = c15178w3.f56967a;
            ArrayList arrayList = c15178w3.f56968b;
            if (AbstractC22676k.m65745e(c15072l6, obj2)) {
                z4 = true;
                c28655q.m87150e0(95900978);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(141556995);
                c15178w3.f56967a = c15072l6;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    arrayList2.add((C15072l6) ((C15168v2) arrayList.get(i15)).f56899a);
                }
                ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(arrayList2);
                if (!arrayListM74097F1.contains(c15072l6)) {
                    arrayListM74097F1.add(c15072l6);
                }
                arrayList.clear();
                ArrayList arrayListM987a = AbstractC0355b.m987a(arrayListM74097F1);
                int size2 = arrayListM987a.size();
                int i16 = 0;
                while (i16 < size2) {
                    C15072l6 c15072l7 = (C15072l6) arrayListM987a.get(i16);
                    arrayList.add(new C15168v2(c15072l7, AbstractC37817c.m121344e(-1032415134, c28655q, new C15052j6(c15072l7, c15072l6, arrayListM74097F1, c15178w3, strM101177H, 0))));
                    i16++;
                    z13 = z13;
                }
                z4 = z13;
                c28655q.m87173q(false);
            }
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
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
            C28677v1 c28677v1M87117B = c28655q.m87117B();
            if (c28677v1M87117B == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            c28677v1M87117B.f115980b |= 1;
            c15178w3.f56969c = c28677v1M87117B;
            c28655q.m87150e0(-1757732554);
            int size3 = arrayList.size();
            for (int i17 = 0; i17 < size3; i17++) {
                C15168v2 c15168v2 = (C15168v2) arrayList.get(i17);
                C15072l6 c15072l8 = (C15072l6) c15168v2.f56899a;
                C37816b c37816b2 = c15168v2.f56900b;
                c28655q.m87144b0(-1515535286, c15072l8);
                c37816b2.invoke(AbstractC37817c.m121344e(2017516783, c28655q, new C15062k6(c15072l8, 0)), c28655q, 6);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(c15072l6, modifier, i13);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m101147d(String sourceUrl, Integer num, InterfaceC4339a onClick, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(sourceUrl, "sourceUrl");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-37002194);
        if ((i13 & 14) == 0) {
            i14 = (c28655q.m87153g(sourceUrl) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= c28655q.m87153g(num) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= c28655q.m87157i(onClick) ? 256 : 128;
        }
        int i15 = i14;
        if ((i15 & 731) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Object objM87133R = c28655q.m87133R();
            InterfaceC30057d interfaceC30057d = null;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            boolean zM87153g = c28655q.m87153g(sourceUrl) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(interfaceC28601c2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                C26285a c26285a = new C26285a(sourceUrl, interfaceC28601c1, interfaceC28601c2, interfaceC30057d, 14);
                c28655q.m87172p0(c26285a);
                objM87133R3 = c26285a;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, sourceUrl);
            float fIntValue = num != null ? num.intValue() : 24;
            Bitmap bitmap = (Bitmap) interfaceC28601c1.getValue();
            C2314t c2314t = C2314t.f9131w;
            if (bitmap != null) {
                c28655q.m87152f0(-725659711);
                Bitmap bitmap2 = (Bitmap) interfaceC28601c1.getValue();
                AbstractC22676k.m65747g(bitmap2);
                C17885g c17885g = new C17885g(bitmap2);
                Modifier modifierM3419p = AbstractC1102d.m3419p(fIntValue, c2314t);
                boolean zM87153g2 = c28655q.m87153g(onClick);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87153g2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C4582c(onClick, 10);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC29125c.m88526e(c17885g, sourceUrl, AbstractC1092a.m3361f(modifierM3419p, false, null, (InterfaceC4339a) objM87133R4, 7), null, c28655q, ((i15 << 3) & 112) | 8, 248);
                c28655q.m87173q(false);
            } else if (((Boolean) interfaceC28601c2.getValue()).booleanValue()) {
                c28655q.m87152f0(-725659437);
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(R.drawable.icon_info_circle, c28655q, 0);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(fIntValue, c2314t);
                boolean zM87153g3 = c28655q.m87153g(onClick);
                Object objM87133R5 = c28655q.m87133R();
                if (zM87153g3 || objM87133R5 == c28676v0) {
                    objM87133R5 = new C4582c(onClick, 11);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC23164r1.m67132a(abstractC26165aM88500I, "Info Circle", AbstractC1092a.m3361f(modifierM3419p2, false, null, (InterfaceC4339a) objM87133R5, 7), C17919x.f69637n, c28655q, 3128);
                c28655q.m87173q(false);
            } else {
                c28655q.m87152f0(-725659015);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3951c(sourceUrl, num, onClick, i13);
    }

    /* JADX INFO: renamed from: e */
    public static final void m101148e(InterfaceC4339a onLogoutClicked, Composer composer, int i13) {
        AbstractC22676k.m65750j(onLogoutClicked, "onLogoutClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1980050729);
        int i14 = (c28655q.m87157i(onLogoutClicked) ? 4 : 2) | i13;
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(1513480211);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC37056f.m118958J(C16507i0.f63476a);
                c28655q.m87172p0(objM87133R);
            }
            List list = (List) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(1513483109);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C16416l0(onLogoutClicked, 2);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC32411b.m101100l(null, list, (Function1) objM87133R2, 0, c28655q, 1);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2662y3(i13, 3, onLogoutClicked);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C21074m m101149f(InterfaceC22085f interfaceC22085f) {
        int iM12012c = AbstractC3979v.m12012c();
        C21074m c21074m = new C21074m();
        c21074m.f79941a = C22082c.f85639a;
        AbstractC3979v.m12012c();
        c21074m.f79941a = interfaceC22085f;
        c21074m.f79942b = iM12012c;
        return c21074m;
    }

    /* JADX INFO: renamed from: g */
    public static final void m101150g(Modifier modifier, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(949852527);
        if ((i13 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C28674u2 c28674u2 = AbstractC14981d1.f55997a;
            long j7 = AbstractC11673r.m31087p(((C14970c1) c28655q.m87161k(c28674u2)).m43091f()) ? C17919x.f69625b : C17919x.f69629f;
            C2307m c2307m = C2299e.f9102E;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3419p(24, AbstractC37056f.m118994r(modifier, AbstractC33253j.f138651a)), ((C14970c1) c28655q.m87161k(c28674u2)).m43091f(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_selected_symbol, c28655q, 0), null, AbstractC1102d.m3419p(12, C2314t.f9131w), j7, c28655q, 432, 0);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2641v3(modifier, i13, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m101151h(C15092n6 c15092n6, Modifier modifier, Function3 function3, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1351125615);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(c15092n6) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i17 = i15 | 384;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            function3 = AbstractC15036i1.f56299a;
            C15072l6 c15072l6 = (C15072l6) c15092n6.f56507b.getValue();
            InterfaceC2376g interfaceC2376g = (InterfaceC2376g) c28655q.m87161k(AbstractC2453v1.f9562a);
            boolean zM87157i = c28655q.m87157i(c15072l6) | c28655q.m87157i(interfaceC2376g);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C11552o(c15072l6, interfaceC2376g, null, 19);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c15072l6);
            m101146c((C15072l6) c15092n6.f56507b.getValue(), modifier, c28655q, i17 & MessageListItemViewType.GIPHY);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        Function3 function4 = function3;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(c15092n6, modifier2, function4, i13, i14, 9);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m101152i(boolean z4, InterfaceC4339a onClick, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1630060123);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onClick) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            C33252i c33252iM105489e = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
            Modifier modifierM3405b = AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, C11671p.f37684e.f37661c.f37658c, 1);
            C13825t c13825tM31075d = AbstractC11673r.m31075d(false, c28655q2, 48);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            c28655q = c28655q2;
            AbstractC12350b.m34583d(onClick, modifierM3405b, z4, c33252iM105489e, c13825tM31075d, AbstractC15166v0.m43196a(C15069l3.m43147a(c28655q2).m43093h(), 0L, C15069l3.m43147a(c28655q2).m43093h(), 0L, c28655q, 0, 10), null, AbstractC27230b.f109002a, c28655q, ((i14 >> 3) & 14) | 805306368 | ((i14 << 6) & 896), 280);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0374j(z4, onClick, i13, 5);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final EnumC22167a m101153j(boolean z4) {
        return z4 ? EnumC22167a.f85977w : EnumC22167a.f85978x;
    }

    /* JADX INFO: renamed from: k */
    public static final void m101154k(Marker marker, InterfaceC4339a onClick, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(marker, "marker");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-61656285);
        int i15 = (c28655q.m87153g(marker) ? 4 : 2) | i13 | (c28655q.m87157i(onClick) ? 32 : 16);
        if ((i15 & 91) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else if (marker instanceof IconMarker) {
            c28655q.m87152f0(234003932);
            IconMarker iconMarker = (IconMarker) marker;
            switch (AbstractC30418c.f124836a[iconMarker.getIcon().ordinal()]) {
                case 1:
                    i14 = R.drawable.icon_info_circle;
                    break;
                case 2:
                    i14 = R.drawable.icon_help_circle;
                    break;
                case 3:
                    i14 = R.drawable.icon_help_square;
                    break;
                case 4:
                    i14 = R.drawable.icon_book_closed;
                    break;
                case 5:
                    i14 = R.drawable.icon_lightbulb;
                    break;
                case 6:
                    i14 = R.drawable.icon_lightning;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Integer width = iconMarker.getWidth();
            float fIntValue = width != null ? width.intValue() : 24;
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(i14, c28655q, 0);
            Modifier modifierM3419p = AbstractC1102d.m3419p(fIntValue, C2314t.f9131w);
            boolean zM87153g = c28655q.m87153g(onClick);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C4582c(onClick, 12);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23164r1.m67132a(abstractC26165aM88500I, "Tooltip Marker", AbstractC1092a.m3361f(modifierM3419p, false, null, (InterfaceC4339a) objM87133R, 7), C17919x.f69637n, c28655q, 3128);
            c28655q.m87173q(false);
        } else if (marker instanceof BeaconMarker) {
            c28655q.m87152f0(234004983);
            AbstractC12667a.m35451c(null, onClick, c28655q, i15 & 112, 1);
            c28655q.m87173q(false);
        } else if (marker instanceof ImageMarker) {
            c28655q.m87152f0(234005097);
            ImageMarker imageMarker = (ImageMarker) marker;
            m101147d(imageMarker.getSource(), imageMarker.getWidth(), onClick, c28655q, (i15 << 3) & 896);
            c28655q.m87173q(false);
        } else {
            c28655q.m87152f0(234005216);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3974q(marker, onClick, i13, 7);
    }

    /* JADX INFO: renamed from: l */
    public static final void m101155l(boolean z4, C33254a formHeaderInformation, Composer composer, int i13) {
        int i14;
        float f13;
        AbstractC22676k.m65750j(formHeaderInformation, "formHeaderInformation");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1058685397);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(formHeaderInformation) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            c28655q.m87150e0(-1087898812);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C25046w(context, 30);
                c28655q.m87172p0(objM87133R);
            }
            C25046w c25046w = (C25046w) objM87133R;
            c28655q.m87173q(false);
            float f14 = 12;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7);
            C11669n c11669n = C11671p.f37680a;
            Modifier modifierM3393o = AbstractC1099a.m3393o(AbstractC11673r.m31081j(), modifierM3398t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3393o);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(693538150);
            if (formHeaderInformation.f138653b) {
                c28655q.m87150e0(2138358);
                int iM121625H = AbstractC37978j.m121625H(formHeaderInformation.f138654c, formHeaderInformation.f138655d, formHeaderInformation.f138660i, c28655q);
                c28655q.m87173q(false);
                c28655q.m87150e0(944505289);
                String str = formHeaderInformation.f138656e;
                String str2 = formHeaderInformation.f138657f;
                c28655q.m87150e0(-201455451);
                c28655q.m87150e0(-1529074886);
                boolean z13 = ((double) AbstractC17918w0.m51536x(AbstractC11673r.m31082k(c28655q).f37668a)) < 0.5d;
                c28655q.m87173q(false);
                if (z13 && str2 != null) {
                    str = str2;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                f13 = f14;
                AbstractC11894a.m31960i(iM121625H, str, c25046w, formHeaderInformation.f138658g, AbstractC1102d.m3419p(20, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f14, 0.0f, 11)), C2299e.f9102E, c28655q, 221696);
                c28655q = c28655q;
            } else {
                f13 = f14;
            }
            c28655q.m87173q(false);
            long jM43090e = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43090e();
            String strM113396S = AbstractC35785b.m113396S(formHeaderInformation.f138652a, c28655q);
            C23285v0 c23285v0 = ((C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b)).f56277d;
            if (!z4) {
                jM43090e = C17919x.m51541c(0.6f, jM43090e);
            }
            C28655q c28655q2 = c28655q;
            AbstractC15011f9.m43114b(strM113396S, AbstractC1136a.m3599a(c2314t, "TEST_TAG_HEADER_TITLE"), jM43090e, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c23285v0, c28655q2, 48, 3120, 55288);
            c28655q = c28655q2;
            c28655q.m87150e0(693567300);
            String str3 = formHeaderInformation.f138659h;
            if (str3 != null) {
                AbstractC20301a.m56343k(str3, AbstractC1099a.m3398t(c2314t, f13, 0.0f, 0.0f, 0.0f, 14), false, false, c28655q, 48, 12);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(z4, formHeaderInformation, i13, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x011b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:71:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x016d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:87:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x019f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static final void m101156m(C11566v interactor, boolean z4, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Modifier modifier3;
        Object objM87133R;
        Object obj;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c1M83597t;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C33254a c33254a;
        boolean z13;
        boolean z14;
        int i16;
        boolean z15;
        Object objM87133R2;
        boolean z16;
        Object objM87133R3;
        int i17;
        Modifier modifier4;
        String str;
        boolean z17;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(interactor, "interactor");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(913614814);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(interactor) : c28655q.m87157i(interactor) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) == 146 || !c28655q.m87121F()) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                C11669n c11669n = C11671p.f37680a;
                C22976l1 c22976l1M31081j = AbstractC11673r.m31081j();
                c28655q.m87150e0(-1389390490);
                objM87133R = c28655q.m87133R();
                obj = C28635l.f115821a;
                if (objM87133R == obj) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c28655q.m87173q(false);
                interfaceC28601c1M83597t = C27648a.m83597t(interactor.f37328l, c28655q, 0);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(interfaceC4339a);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c33254a = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37182g;
                z13 = !((C11534g1) interfaceC28601c1M83597t.getValue()).f37177b;
                c28655q.m87150e0(-1525416678);
                if (c33254a != null) {
                    str = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37176a;
                    C33623c0 c33623c0 = EnumC38828f4.f167088G;
                    if (AbstractC22676k.m65745e(str, "card") || !z4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        z14 = false;
                        m101155l(z13, c33254a, c28655q, 0);
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                c28655q.m87173q(z14);
                String str2 = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37176a;
                List list = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37183h;
                C32077a c32077a = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37180e;
                C33333n c33333n = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37179d;
                c28655q.m87150e0(-1525397156);
                i16 = i15 & 14;
                if (i16 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(interactor))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                int i19 = i15;
                objM87133R2 = c28655q.m87133R();
                if (z15 || objM87133R2 == obj) {
                    objM87133R2 = new C4780c(interactor, 17);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function1 = (Function1) objM87133R2;
                c28655q.m87173q(false);
                c28655q.m87150e0(-1525390065);
                if (i16 != 4 || ((i19 & 8) != 0 && c28655q.m87157i(interactor))) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (!z16 || objM87133R3 == obj) {
                    i17 = 1;
                    objM87133R3 = new C11546l(i17, interactor, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    i17 = 1;
                }
                c28655q.m87173q(false);
                AbstractC4482w.m14003n(z13, str2, list, c32077a, c33333n, c22976l1M31081j, function1, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(i17);
                modifier4 = modifier3;
            } else {
                c28655q.m87138X();
                modifier4 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(interactor, z4, modifier4, i13, i14, 5);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) == 146) {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            C11669n c11669n2 = C11671p.f37680a;
            C22976l1 c22976l1M31081j2 = AbstractC11673r.m31081j();
            c28655q.m87150e0(-1389390490);
            objM87133R = c28655q.m87133R();
            obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c28655q.m87173q(false);
            interfaceC28601c1M83597t = C27648a.m83597t(interactor.f37328l, c28655q, 0);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier3);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(interfaceC4339a);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c33254a = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37182g;
            z13 = !((C11534g1) interfaceC28601c1M83597t.getValue()).f37177b;
            c28655q.m87150e0(-1525416678);
            if (c33254a != null) {
                str = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37176a;
                C33623c0 c33623c1 = EnumC38828f4.f167088G;
                if (AbstractC22676k.m65745e(str, "card")) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (z17) {
                    z14 = false;
                    m101155l(z13, c33254a, c28655q, 0);
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            c28655q.m87173q(z14);
            String str3 = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37176a;
            List list2 = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37183h;
            C32077a c32077a2 = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37180e;
            C33333n c33333n2 = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37179d;
            c28655q.m87150e0(-1525397156);
            i16 = i15 & 14;
            if (i16 != 4) {
                z15 = true;
            } else {
                z15 = true;
            }
            int i110 = i15;
            objM87133R2 = c28655q.m87133R();
            if (z15) {
                objM87133R2 = new C4780c(interactor, 17);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C4780c(interactor, 17);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            c28655q.m87173q(false);
            c28655q.m87150e0(-1525390065);
            if (i16 != 4) {
                z16 = true;
            } else {
                z16 = true;
            }
            objM87133R3 = c28655q.m87133R();
            if (z16) {
                i17 = 1;
                objM87133R3 = new C11546l(i17, interactor, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            } else {
                i17 = 1;
                objM87133R3 = new C11546l(i17, interactor, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            AbstractC4482w.m14003n(z13, str3, list2, c32077a2, c33333n2, c22976l1M31081j2, function2, (InterfaceC4339a) objM87133R3, c28655q, 0);
            c28655q.m87173q(i17);
            modifier4 = modifier3;
        } else {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            C11669n c11669n3 = C11671p.f37680a;
            C22976l1 c22976l1M31081j3 = AbstractC11673r.m31081j();
            c28655q.m87150e0(-1389390490);
            objM87133R = c28655q.m87133R();
            obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c28655q.m87173q(false);
            interfaceC28601c1M83597t = C27648a.m83597t(interactor.f37328l, c28655q, 0);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier3);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(interfaceC4339a);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
            c33254a = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37182g;
            z13 = !((C11534g1) interfaceC28601c1M83597t.getValue()).f37177b;
            c28655q.m87150e0(-1525416678);
            if (c33254a != null) {
                str = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37176a;
                C33623c0 c33623c2 = EnumC38828f4.f167088G;
                if (AbstractC22676k.m65745e(str, "card")) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (z17) {
                    z14 = false;
                    m101155l(z13, c33254a, c28655q, 0);
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            c28655q.m87173q(z14);
            String str4 = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37176a;
            List list3 = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37183h;
            C32077a c32077a3 = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37180e;
            C33333n c33333n3 = ((C11534g1) interfaceC28601c1M83597t.getValue()).f37179d;
            c28655q.m87150e0(-1525397156);
            i16 = i15 & 14;
            if (i16 != 4) {
                z15 = true;
            } else {
                z15 = true;
            }
            int i111 = i15;
            objM87133R2 = c28655q.m87133R();
            if (z15) {
                objM87133R2 = new C4780c(interactor, 17);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C4780c(interactor, 17);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function3 = (Function1) objM87133R2;
            c28655q.m87173q(false);
            c28655q.m87150e0(-1525390065);
            if (i16 != 4) {
                z16 = true;
            } else {
                z16 = true;
            }
            objM87133R3 = c28655q.m87133R();
            if (z16) {
                i17 = 1;
                objM87133R3 = new C11546l(i17, interactor, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            } else {
                i17 = 1;
                objM87133R3 = new C11546l(i17, interactor, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            AbstractC4482w.m14003n(z13, str4, list3, c32077a3, c33333n3, c22976l1M31081j3, function3, (InterfaceC4339a) objM87133R3, c28655q, 0);
            c28655q.m87173q(i17);
            modifier4 = modifier3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(interactor, z4, modifier4, i13, i14, 5);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m101157n(Modifier modifier, AbstractC38794c0 paymentDetails, InterfaceC4339a onSetDefaultClick, InterfaceC4339a onRemoveClick, InterfaceC4339a onUpdateClick, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(paymentDetails, "paymentDetails");
        AbstractC22676k.m65750j(onSetDefaultClick, "onSetDefaultClick");
        AbstractC22676k.m65750j(onRemoveClick, "onRemoveClick");
        AbstractC22676k.m65750j(onUpdateClick, "onUpdateClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(542686095);
        int i15 = i13 | (c28655q.m87157i(paymentDetails) ? 32 : 16) | (c28655q.m87157i(onSetDefaultClick) ? 256 : 128) | (c28655q.m87157i(onRemoveClick) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87157i(onUpdateClick) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK);
        if ((i15 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(1072333675);
            boolean zM87153g = c28655q.m87153g(paymentDetails);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                C26460c c26460cM119000x = AbstractC37056f.m119000x();
                if (!paymentDetails.mo124311h()) {
                    c26460cM119000x.add(C29738t.f121625d);
                }
                boolean z4 = paymentDetails instanceof C38774a0;
                if (z4) {
                    c26460cM119000x.add(C29739u.f121626d);
                }
                if (z4 || (paymentDetails instanceof C38784b0)) {
                    i14 = R.string.stripe_paymentsheet_remove_card;
                } else {
                    if (!(paymentDetails instanceof C38991x)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14 = R.string.stripe_wallet_remove_linked_account;
                }
                c26460cM119000x.add(new C29737s(AbstractC32128i.m100054h(i14)));
                objM87133R = AbstractC37056f.m118988k(c26460cM119000x);
                c28655q.m87172p0(objM87133R);
            }
            List list = (List) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(1072352533);
            boolean z13 = ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | ((i15 & 57344) == 16384);
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C26954j0(onSetDefaultClick, (InterfaceC23459e) onRemoveClick, (Object) onUpdateClick, 15);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC32411b.m101100l(modifier, list, (Function1) objM87133R2, 6, c28655q, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0556g(modifier, paymentDetails, onSetDefaultClick, onRemoveClick, onUpdateClick, i13, 13);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m101158o(SpannableStringBuilder spannableStringBuilder, Object obj, int i13, int i14) {
        for (Object obj2 : spannableStringBuilder.getSpans(i13, i14, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i13 && spannableStringBuilder.getSpanEnd(obj2) == i14 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i13, i14, 33);
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC30063j m101159p(C31343n c31343n) {
        InterfaceC30061h interfaceC30061h = c31343n.getContext().get(C29143u.f117934x);
        AbstractC22676k.m65747g(interfaceC30061h);
        return ((C29143u) interfaceC30061h).f117935w;
    }

    /* JADX INFO: renamed from: q */
    public static void m101160q(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC20317e1 m101161r(C30582e c30582e) {
        Class clsM93820o;
        if (!AbstractC20587i.f77090a) {
            C20546t2 c20546t2 = C20546t2.f76998w;
            if (C30582e.m93818h(c20546t2, "io.sentry.opentelemetry.OtelContextScopesStorage") && (clsM93820o = C30582e.m93820o(c20546t2, "io.sentry.opentelemetry.OtelContextScopesStorage")) != null) {
                try {
                    Object objNewInstance = clsM93820o.getDeclaredConstructor(null).newInstance(null);
                    if (objNewInstance != null && (objNewInstance instanceof InterfaceC20317e1)) {
                        return (InterfaceC20317e1) objNewInstance;
                    }
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
        }
        return new C20543t();
    }

    /* JADX INFO: renamed from: s */
    public static final InterfaceC30063j m101162s(InterfaceC29123a interfaceC29123a, InterfaceC30063j outerContext) {
        Map map;
        AbstractC22676k.m65750j(interfaceC29123a, "<this>");
        AbstractC22676k.m65750j(outerContext, "outerContext");
        InterfaceC30063j coroutineContext = interfaceC29123a.getCoroutineContext();
        C3023j1 c3023j1 = C3023j1.f12041w;
        C3031l1 c3031l1 = new C3031l1((InterfaceC3027k1) coroutineContext.get(c3023j1));
        InterfaceC30063j interfaceC30063jPlus = interfaceC29123a.getCoroutineContext().plus(c3031l1).plus(new C2990b0("call-context")).plus(new C25527i(AbstractC3511b.m10394w(outerContext)));
        C27914k c27914k = (C27914k) outerContext.get(C27914k.f112511x);
        if (c27914k == null || (map = c27914k.f112512w) == null) {
            map = C25272z.f99163w;
        }
        InterfaceC30063j interfaceC30063jPlus2 = interfaceC30063jPlus.plus(new C27914k(map));
        C26676f c26676fM34346z = AbstractC12314q.m34346z(outerContext);
        InterfaceC30063j interfaceC30063jPlus3 = interfaceC30063jPlus2.plus(c26676fM34346z != null ? new C26678h(c26676fM34346z) : C30064k.f122676w);
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) outerContext.get(c3023j1);
        if (interfaceC3027k1 == null) {
            return interfaceC30063jPlus3;
        }
        c3031l1.invokeOnCompletion(new C29124b(interfaceC3027k1.invokeOnCompletion(true, true, new C26944e0(c3031l1, 29)), 0));
        return interfaceC30063jPlus3;
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m101163t(C34697q0 c34697q0) {
        AbstractC22676k.m65750j(c34697q0, "<this>");
        return m101132A(c34697q0) != null;
    }

    /* JADX INFO: renamed from: u */
    public static final byte[] m101164u(byte[] key, byte[] bArr) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        AbstractC22676k.m65750j(key, "key");
        C22425a c22425a = new C22425a(key);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        PrivateKey privateKey = keyPairGenerator.generateKeyPair().getPrivate();
        AbstractC22676k.m65748h(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        ECParameterSpec params = ((ECPrivateKey) privateKey).getParams();
        byte[] byteArray = c22425a.f87749w.toByteArray();
        AbstractC22676k.m65749i(byteArray, "toByteArray(...)");
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), params));
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(privateKeyGeneratePrivate);
        signature.update(bArr);
        byte[] bArrSign = signature.sign();
        AbstractC22676k.m65749i(bArrSign, "sign(...)");
        return bArrSign;
    }

    /* JADX INFO: renamed from: v */
    public static String m101165v(AbstractC5146i abstractC5146i) {
        StringBuilder sb4 = new StringBuilder(abstractC5146i.size());
        for (int i13 = 0; i13 < abstractC5146i.size(); i13++) {
            byte bMo16164a = abstractC5146i.mo16164a(i13);
            if (bMo16164a == 34) {
                sb4.append("\\\"");
            } else if (bMo16164a == 39) {
                sb4.append("\\'");
            } else if (bMo16164a != 92) {
                switch (bMo16164a) {
                    case 7:
                        sb4.append("\\a");
                        break;
                    case 8:
                        sb4.append("\\b");
                        break;
                    case 9:
                        sb4.append("\\t");
                        break;
                    case 10:
                        sb4.append("\\n");
                        break;
                    case 11:
                        sb4.append("\\v");
                        break;
                    case 12:
                        sb4.append("\\f");
                        break;
                    case 13:
                        sb4.append("\\r");
                        break;
                    default:
                        if (bMo16164a < 32 || bMo16164a > 126) {
                            sb4.append('\\');
                            sb4.append((char) (((bMo16164a >>> 6) & 3) + 48));
                            sb4.append((char) (((bMo16164a >>> 3) & 7) + 48));
                            sb4.append((char) ((bMo16164a & 7) + 48));
                        } else {
                            sb4.append((char) bMo16164a);
                        }
                        break;
                }
            } else {
                sb4.append("\\\\");
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: w */
    public static final C28780r m101166w() {
        C28780r c28780r = C28780r.f116544x;
        return C28780r.f116546z;
    }

    /* JADX INFO: renamed from: x */
    public static final int m101167x(C28780r c28780r, int i13) {
        boolean z4 = c28780r.compareTo(C28780r.f116546z) >= 0;
        boolean z13 = i13 == 1;
        if (z13 && z4) {
            return 3;
        }
        if (z4) {
            return 1;
        }
        return z13 ? 2 : 0;
    }

    /* JADX INFO: renamed from: y */
    public static final C31021k0 m101168y(int i13) {
        return new C31021k0(i13);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: z */
    public static final String m101169z(InterfaceC31111c callableMemberDescriptor) {
        C35850h c35850h;
        AbstractC22676k.m65750j(callableMemberDescriptor, "callableMemberDescriptor");
        InterfaceC31111c interfaceC31111cM101132A = AbstractC27736h.m83799A(callableMemberDescriptor) ? m101132A(callableMemberDescriptor) : null;
        if (interfaceC31111cM101132A != null) {
            InterfaceC31111c interfaceC31111cM13813k = AbstractC4393e.m13813k(interfaceC31111cM101132A);
            if (interfaceC31111cM13813k instanceof InterfaceC31145n0) {
                AbstractC27736h.m83799A(interfaceC31111cM13813k);
                InterfaceC31111c interfaceC31111cM13804b = AbstractC4393e.m13804b(AbstractC4393e.m13813k(interfaceC31111cM13813k), C14307d.f52244z);
                if (interfaceC31111cM13804b != null && (c35850h = (C35850h) AbstractC14311f.f52251a.get(AbstractC4393e.m13809g(interfaceC31111cM13804b))) != null) {
                    return c35850h.m113817b();
                }
            } else if (interfaceC31111cM13813k instanceof C34697q0) {
                int i13 = AbstractC14305c.f52232l;
                LinkedHashMap linkedHashMap = AbstractC14314g0.f52269i;
                String strM56348p = AbstractC20301a.m56348p((C34697q0) interfaceC31111cM13813k);
                C35850h c35850h2 = strM56348p == null ? null : (C35850h) linkedHashMap.get(strM56348p);
                if (c35850h2 != null) {
                    return c35850h2.m113817b();
                }
            }
        }
        return null;
    }
}

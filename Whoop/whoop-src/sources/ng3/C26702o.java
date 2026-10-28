package ng3;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import com.google.android.material.tabs.TabLayout;
import cr.AbstractC11075m;
import gm.C15982j;
import j43.C21319c;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import jg3.AbstractC21688o;
import jg3.C21677d;
import o33.EnumC27517b;
import p002a0.C0030i1;
import p287kq.AbstractC22766a;
import p377or.C28137k;
import p477s2.AbstractC32072d;
import p499t9.InterfaceC33626e;
import p516u8.C34610p;
import p527um.C35073c;
import p619xl.C38445a;
import p623xr.InterfaceC38616l;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pm.InterfaceC29353a;
import qa.InterfaceC30105j;
import qa.InterfaceC30107l;
import r30.EnumC30905j;
import sn.InterfaceC32756r0;
import t23.C33403i3;
import t23.InterfaceC33408j3;
import t83.C33617b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ng3.o */
/* JADX INFO: loaded from: classes3.dex */
public class C26702o implements InterfaceC26704q, InterfaceC29353a, InterfaceC30105j, InterfaceC32756r0, InterfaceC38616l, InterfaceC33626e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f106193w;

    public /* synthetic */ C26702o(int i13, boolean z4) {
        this.f106193w = i13;
    }

    /* JADX INFO: renamed from: f */
    public static final void m79407f(List list, ArrayList arrayList) throws CertPathBuilderException, NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, InvalidAlgorithmParameterException {
        LinkedList linkedListM99706p = AbstractC32072d.m99706p(list);
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            keyStore.setCertificateEntry(String.format(Locale.ROOT, "ca_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1)), (Certificate) arrayList.get(i13));
            i13 = i14;
        }
        X509CertSelector x509CertSelector = new X509CertSelector();
        x509CertSelector.setCertificate((X509Certificate) linkedListM99706p.get(0));
        PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(keyStore, x509CertSelector);
        pKIXBuilderParameters.setRevocationEnabled(false);
        pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(linkedListM99706p)));
        CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters);
    }

    /* JADX INFO: renamed from: k */
    public static RectF m79408k(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f21082h0 || !(view instanceof C28137k)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        C28137k c28137k = (C28137k) view;
        int contentWidth = c28137k.getContentWidth();
        int contentHeight = c28137k.getContentHeight();
        int iM29870d = (int) AbstractC11075m.m29870d(c28137k.getContext(), 24);
        if (contentWidth < iM29870d) {
            contentWidth = iM29870d;
        }
        int right = (c28137k.getRight() + c28137k.getLeft()) / 2;
        int bottom = (c28137k.getBottom() + c28137k.getTop()) / 2;
        int i13 = contentWidth / 2;
        return new RectF(right - i13, bottom - (contentHeight / 2), i13 + right, (right / 2) + bottom);
    }

    /* JADX INFO: renamed from: m */
    public static void m79409m(C21319c c21319c, Context context) {
        AbstractC22676k.m65750j(context, "context");
        if (c21319c.f81525e) {
            InterfaceC33408j3.f139483t.getClass();
            C33403i3 c33403i3 = C33403i3.f139476a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0021 A[RETURN] */
    /* JADX INFO: renamed from: n */
    public static EnumC27517b m79410n(String alias) {
        AbstractC22676k.m65750j(alias, "alias");
        for (EnumC27517b enumC27517b : EnumC27517b.values()) {
            if (enumC27517b.f110805w.equals(alias)) {
                if (enumC27517b == null) {
                    return EnumC27517b.f110803y;
                }
                return enumC27517b;
            }
        }
        enumC27517b = null;
        if (enumC27517b == null) {
            return EnumC27517b.f110803y;
        }
        return enumC27517b;
    }

    /* JADX INFO: renamed from: o */
    public static EnumC30905j m79411o(String str) {
        Object next;
        C33617b c33617b = EnumC30905j.f127460J;
        c33617b.getClass();
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        while (c0030i1.hasNext()) {
            next = c0030i1.next();
            if (AbstractC22676k.m65745e(str, ((EnumC30905j) next).f127463w)) {
                return (EnumC30905j) next;
            }
        }
        next = null;
        return (EnumC30905j) next;
    }

    @Override // p623xr.InterfaceC38617m
    /* JADX INFO: renamed from: a */
    public Object mo45127a() {
        return new C26701n(26);
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: b */
    public boolean mo79412b() {
        return true;
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: c */
    public void mo79413c() {
    }

    @Override // p499t9.InterfaceC33626e
    /* JADX INFO: renamed from: d */
    public long mo79414d(long j7) {
        return j7;
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: e */
    public int mo79415e(C38445a c38445a, C35073c c35073c, int i13) {
        c35073c.f2052x = 4;
        return -4;
    }

    @Override // qa.InterfaceC30105j
    /* JADX INFO: renamed from: g */
    public boolean mo60610g(C34610p c34610p) {
        return false;
    }

    @Override // pm.InterfaceC29353a
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // qa.InterfaceC30105j
    /* JADX INFO: renamed from: h */
    public InterfaceC30107l mo60611h(C34610p c34610p) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // qa.InterfaceC30105j
    /* JADX INFO: renamed from: i */
    public int mo60612i(C34610p c34610p) {
        return 1;
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: j */
    public int mo79416j(long j7) {
        return 0;
    }

    @Override // ng3.InterfaceC26704q
    /* JADX INFO: renamed from: l */
    public Object mo43799l(InterfaceC26698k interfaceC26698k) {
        switch (this.f106193w) {
            case 0:
                AbstractC21688o abstractC21688o = (AbstractC21688o) interfaceC26698k.mo14019g(AbstractC26703p.f106194a);
                return abstractC21688o != null ? abstractC21688o : (AbstractC21688o) interfaceC26698k.mo14019g(AbstractC26703p.f106198e);
            default:
                EnumC26688a enumC26688a = EnumC26688a.EPOCH_DAY;
                if (interfaceC26698k.mo60986a(enumC26688a)) {
                    return C21677d.m61004u0(interfaceC26698k.mo60987h(enumC26688a));
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo79417p(TabLayout tabLayout, View view, View view2, float f13, Drawable drawable) {
        RectF rectFM79408k = m79408k(tabLayout, view);
        RectF rectFM79408k2 = m79408k(tabLayout, view2);
        drawable.setBounds(AbstractC22766a.m65971c(f13, (int) rectFM79408k.left, (int) rectFM79408k2.left), drawable.getBounds().top, AbstractC22766a.m65971c(f13, (int) rectFM79408k.right, (int) rectFM79408k2.right), drawable.getBounds().bottom);
    }

    public C26702o(C15982j c15982j) {
        this.f106193w = 26;
    }

    public C26702o(int i13) {
        this.f106193w = i13;
        switch (i13) {
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                C41060w0 c41060w0 = C41060w0.f177067E;
                break;
            default:
                AbstractC1772c1.m5382S(this, "TelecomPermissions");
                break;
        }
    }
}

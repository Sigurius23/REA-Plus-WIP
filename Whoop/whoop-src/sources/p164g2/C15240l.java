package p164g2;

import android.graphics.Rect;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.p018ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.p018ui.platform.AndroidComposeView;
import at.C1956b;
import c93.InterfaceC4339a;
import java.util.ArrayList;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p002a0.AbstractC0015d1;
import p002a0.C0037l0;
import p002a0.C0047q0;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p005a3.AbstractC0233o;
import p005a3.C0223l1;
import p005a3.C0224l2;
import p005a3.C0230n0;
import p026b2.AbstractC2316v;
import p027b3.C2364d2;
import p027b3.C2404l2;
import p027b3.C2466y;
import p028b4.C2696g;
import p042c2.C3857b;
import p042c2.C3859d;
import p088dc.AbstractC11894a;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p209i3.AbstractC18029k;
import p209i3.C18030l;
import p249jc.AbstractC21598x;
import p394p5.C28848e;
import p446r1.C30849c;
import p477s2.AbstractC32072d;
import p477s2.AbstractC32073e;
import p477s2.InterfaceC32074f;
import p603x2.AbstractC37831a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: g2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C15240l implements InterfaceC15239k {

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f57239a;

    /* JADX INFO: renamed from: b */
    public final AndroidComposeView f57240b;

    /* JADX INFO: renamed from: d */
    public final C15236h f57242d;

    /* JADX INFO: renamed from: f */
    public C0037l0 f57244f;

    /* JADX INFO: renamed from: h */
    public C15252x f57246h;

    /* JADX INFO: renamed from: i */
    public boolean f57247i;

    /* JADX INFO: renamed from: c */
    public final C15252x f57241c = new C15252x(null, 2, 6);

    /* JADX INFO: renamed from: e */
    public final FocusOwnerImpl$modifier$1 f57243e = new AbstractC0207h1() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // p005a3.AbstractC0207h1
        public final AbstractC2316v create() {
            return this.f4793w.f57241c;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.f4793w.f57241c.hashCode();
        }

        @Override // p005a3.AbstractC0207h1
        public final void inspectableProperties(C2404l2 c2404l2) {
            c2404l2.m7401c("RootFocusTarget");
        }

        @Override // p005a3.AbstractC0207h1
        public final /* bridge */ /* synthetic */ void update(AbstractC2316v abstractC2316v) {
        }
    };

    /* JADX INFO: renamed from: g */
    public final C0047q0 f57245g = new C0047q0(1);

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public C15240l(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.f57239a = androidComposeView;
        this.f57240b = androidComposeView2;
        this.f57242d = new C15236h(this, androidComposeView2);
    }

    /* JADX INFO: renamed from: b */
    public final void m43339b(boolean z4) {
        m43341d(8, z4, true);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m43340c(boolean z4) {
        C0223l1 c0223l1;
        C15252x c15252x = this.f57246h;
        if (c15252x != null) {
            if (this.f57247i && !z4) {
                return false;
            }
            m43346i(null);
            c15252x.m43356X0(this.f57247i ? EnumC15251w.f57273y : EnumC15251w.f57271w, EnumC15251w.f57274z);
            if (!c15252x.f9142w.f9141N) {
                AbstractC37831a.m121374b("visitAncestors called on an unattached node");
            }
            AbstractC2316v abstractC2316v = c15252x.f9142w.f9132E;
            C0230n0 c0230n0M516p = AbstractC0201g.m516p(c15252x);
            while (c0230n0M516p != null) {
                if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    while (abstractC2316v != null) {
                        if ((abstractC2316v.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            C30849c c30849c = null;
                            AbstractC2316v abstractC2316vM504d = abstractC2316v;
                            while (abstractC2316vM504d != null) {
                                if (abstractC2316vM504d instanceof C15252x) {
                                    ((C15252x) abstractC2316vM504d).m43356X0(EnumC15251w.f57272x, EnumC15251w.f57274z);
                                } else if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                    int i13 = 0;
                                    for (AbstractC2316v abstractC2316v2 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
                                        if ((abstractC2316v2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                abstractC2316vM504d = abstractC2316v2;
                                            } else {
                                                if (c30849c == null) {
                                                    c30849c = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (abstractC2316vM504d != null) {
                                                    c30849c.m94885b(abstractC2316vM504d);
                                                    abstractC2316vM504d = null;
                                                }
                                                c30849c.m94885b(abstractC2316v2);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                            }
                        }
                        abstractC2316v = abstractC2316v.f9132E;
                    }
                }
                c0230n0M516p = c0230n0M516p.m588G();
                abstractC2316v = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m43341d(int i13, boolean z4, boolean z13) {
        boolean zM43340c;
        int iOrdinal;
        if (z4 || (iOrdinal = AbstractC15235g.m43301A(this.f57241c, i13).ordinal()) == 0) {
            zM43340c = m43340c(z4);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            zM43340c = false;
        }
        if (zM43340c && z13) {
            m43342e();
        }
        return zM43340c;
    }

    /* JADX INFO: renamed from: e */
    public final void m43342e() {
        AndroidComposeView androidComposeView = this.f57239a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x015a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x016a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:315:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0163 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:344:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x014c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b A[ADDED_TO_REGION, LOOP:12: B:41:0x007b->B:69:0x00c7, LOOP_START, PHI: r7
      0x007b: PHI (r7v29 b2.v) = (r7v23 b2.v), (r7v30 b2.v) binds: [B:40:0x0079, B:69:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x007d A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0105 A[ADDED_TO_REGION, LOOP:16: B:87:0x0105->B:115:0x0151, LOOP_START, PHI: r1
      0x0105: PHI (r1v15 b2.v) = (r1v9 b2.v), (r1v16 b2.v) binds: [B:86:0x0103, B:115:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0107 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0116 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x011c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r0v24, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r15v5, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r15v9, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v36, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX INFO: renamed from: f */
    public final boolean m43343f(KeyEvent keyEvent, InterfaceC4339a interfaceC4339a) {
        AbstractC2316v abstractC2316v;
        C0230n0 c0230n0M516p;
        Object obj;
        Object obj2;
        AbstractC2316v abstractC2316v2;
        C0223l1 c0223l1;
        AbstractC2316v abstractC2316vM504d;
        C30849c c30849c;
        AbstractC2316v abstractC2316v3;
        C0230n0 c0230n0M516p2;
        Object obj3;
        Object obj4;
        C0223l1 c0223l2;
        C30849c c30849c2;
        AbstractC2316v abstractC2316vM504d2;
        int size;
        C0223l1 c0223l3;
        C15252x c15252x = this.f57241c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f57242d.f57237e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!m43347j(keyEvent)) {
                Trace.endSection();
                return false;
            }
            C15252x c15252xM43318h = AbstractC15235g.m43318h(c15252x);
            if (c15252xM43318h != null) {
                if (!c15252xM43318h.f9142w.f9141N) {
                    AbstractC37831a.m121374b("visitLocalDescendants called on an unattached node");
                }
                AbstractC2316v abstractC2316v4 = c15252xM43318h.f9142w;
                if ((abstractC2316v4.f9145z & 9216) != 0) {
                    abstractC2316v2 = null;
                    for (AbstractC2316v abstractC2316v5 = abstractC2316v4.f9133F; abstractC2316v5 != null; abstractC2316v5 = abstractC2316v5.f9133F) {
                        int i13 = abstractC2316v5.f9144y;
                        if ((i13 & 9216) != 0) {
                            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                break;
                            }
                            abstractC2316v2 = abstractC2316v5;
                        }
                    }
                } else {
                    abstractC2316v2 = null;
                }
                if (abstractC2316v2 == null) {
                    if (c15252xM43318h == null) {
                        if (!c15252x.f9142w.f9141N) {
                            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                        }
                        abstractC2316v = c15252x.f9142w.f9132E;
                        c0230n0M516p = AbstractC0201g.m516p(c15252x);
                        loop15: while (true) {
                            if (c0230n0M516p != null) {
                                obj = null;
                                break;
                            }
                            if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                while (abstractC2316v != null) {
                                    if ((abstractC2316v.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                        abstractC2316vM504d = abstractC2316v;
                                        c30849c = null;
                                        while (abstractC2316vM504d != null) {
                                            if (abstractC2316vM504d instanceof InterfaceC32074f) {
                                                obj = abstractC2316vM504d;
                                                break loop15;
                                            }
                                            if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                                            }
                                            abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                                        }
                                    }
                                    abstractC2316v = abstractC2316v.f9132E;
                                }
                            }
                            c0230n0M516p = c0230n0M516p.m588G();
                            if (c0230n0M516p != null) {
                            }
                        }
                        obj2 = (InterfaceC32074f) obj;
                        if (obj2 != null) {
                            abstractC2316v2 = ((AbstractC2316v) obj2).f9142w;
                        } else {
                            abstractC2316v2 = null;
                        }
                    } else {
                        if (!c15252xM43318h.f9142w.f9141N) {
                            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                        }
                        abstractC2316v3 = c15252xM43318h.f9142w;
                        c0230n0M516p2 = AbstractC0201g.m516p(c15252xM43318h);
                        loop11: while (true) {
                            if (c0230n0M516p2 != null) {
                                obj3 = null;
                                break;
                            }
                            if ((((AbstractC2316v) c0230n0M516p2.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                while (abstractC2316v3 != null) {
                                    if ((abstractC2316v3.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                        c30849c2 = null;
                                        abstractC2316vM504d2 = abstractC2316v3;
                                        while (abstractC2316vM504d2 != null) {
                                            if (abstractC2316vM504d2 instanceof InterfaceC32074f) {
                                                obj3 = abstractC2316vM504d2;
                                                break loop11;
                                            }
                                            if ((abstractC2316vM504d2.f9144y & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                                            }
                                            abstractC2316vM504d2 = AbstractC0201g.m504d(c30849c2);
                                        }
                                    }
                                    abstractC2316v3 = abstractC2316v3.f9132E;
                                }
                            }
                            c0230n0M516p2 = c0230n0M516p2.m588G();
                            if (c0230n0M516p2 != null) {
                            }
                        }
                        obj4 = (InterfaceC32074f) obj3;
                        if (obj4 != null) {
                            abstractC2316v2 = ((AbstractC2316v) obj4).f9142w;
                        } else {
                            if (!c15252x.f9142w.f9141N) {
                                AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                            }
                            abstractC2316v = c15252x.f9142w.f9132E;
                            c0230n0M516p = AbstractC0201g.m516p(c15252x);
                            loop15: while (true) {
                                if (c0230n0M516p != null) {
                                    obj = null;
                                    break;
                                }
                                if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    while (abstractC2316v != null) {
                                        if ((abstractC2316v.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                            abstractC2316vM504d = abstractC2316v;
                                            c30849c = null;
                                            while (abstractC2316vM504d != null) {
                                                if (abstractC2316vM504d instanceof InterfaceC32074f) {
                                                    obj = abstractC2316vM504d;
                                                    break loop15;
                                                }
                                                if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                                                }
                                                abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                                            }
                                        }
                                        abstractC2316v = abstractC2316v.f9132E;
                                    }
                                }
                                c0230n0M516p = c0230n0M516p.m588G();
                                if (c0230n0M516p != null) {
                                }
                            }
                            obj2 = (InterfaceC32074f) obj;
                            if (obj2 != null) {
                                abstractC2316v2 = ((AbstractC2316v) obj2).f9142w;
                            } else {
                                abstractC2316v2 = null;
                            }
                        }
                    }
                }
            } else if (c15252xM43318h == null) {
                if (!c15252x.f9142w.f9141N) {
                    AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                }
                abstractC2316v = c15252x.f9142w.f9132E;
                c0230n0M516p = AbstractC0201g.m516p(c15252x);
                loop15: while (true) {
                    if (c0230n0M516p != null) {
                        obj = null;
                        break;
                    }
                    if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        while (abstractC2316v != null) {
                            if ((abstractC2316v.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                abstractC2316vM504d = abstractC2316v;
                                c30849c = null;
                                while (abstractC2316vM504d != null) {
                                    if (abstractC2316vM504d instanceof InterfaceC32074f) {
                                        obj = abstractC2316vM504d;
                                        break loop15;
                                    }
                                    if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_MASK) == 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                        AbstractC2316v abstractC2316v6 = ((AbstractC0233o) abstractC2316vM504d).f804P;
                                        int i14 = 0;
                                        while (abstractC2316v6 != null) {
                                            if ((abstractC2316v6.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    abstractC2316vM504d = abstractC2316vM504d;
                                                    c30849c = c30849c;
                                                    c30849c = c30849c;
                                                    abstractC2316vM504d = abstractC2316v6;
                                                } else {
                                                    if (c30849c == null) {
                                                        c30849c = new C30849c(new AbstractC2316v[16]);
                                                    }
                                                    if (abstractC2316vM504d != null) {
                                                        c30849c.m94885b(abstractC2316vM504d);
                                                        abstractC2316vM504d = null;
                                                    }
                                                    c30849c.m94885b(abstractC2316v6);
                                                }
                                            } else {
                                                abstractC2316vM504d = abstractC2316vM504d;
                                                c30849c = c30849c;
                                            }
                                            abstractC2316v6 = abstractC2316v6.f9133F;
                                            abstractC2316vM504d = abstractC2316vM504d;
                                            c30849c = c30849c;
                                        }
                                        if (i14 == 1) {
                                            abstractC2316vM504d = abstractC2316vM504d;
                                            c30849c = c30849c;
                                        } else {
                                            abstractC2316vM504d = abstractC2316vM504d;
                                            c30849c = c30849c;
                                        }
                                    }
                                    abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                                }
                            }
                            abstractC2316v = abstractC2316v.f9132E;
                        }
                    }
                    c0230n0M516p = c0230n0M516p.m588G();
                    abstractC2316v = (c0230n0M516p != null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
                }
                obj2 = (InterfaceC32074f) obj;
                if (obj2 != null) {
                    abstractC2316v2 = ((AbstractC2316v) obj2).f9142w;
                } else {
                    abstractC2316v2 = null;
                }
            } else {
                if (!c15252xM43318h.f9142w.f9141N) {
                    AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                }
                abstractC2316v3 = c15252xM43318h.f9142w;
                c0230n0M516p2 = AbstractC0201g.m516p(c15252xM43318h);
                loop11: while (true) {
                    if (c0230n0M516p2 != null) {
                        obj3 = null;
                        break;
                    }
                    if ((((AbstractC2316v) c0230n0M516p2.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        while (abstractC2316v3 != null) {
                            if ((abstractC2316v3.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c30849c2 = null;
                                abstractC2316vM504d2 = abstractC2316v3;
                                while (abstractC2316vM504d2 != null) {
                                    if (abstractC2316vM504d2 instanceof InterfaceC32074f) {
                                        obj3 = abstractC2316vM504d2;
                                        break loop11;
                                    }
                                    if ((abstractC2316vM504d2.f9144y & DfuBaseService.ERROR_REMOTE_MASK) == 0 && (abstractC2316vM504d2 instanceof AbstractC0233o)) {
                                        AbstractC2316v abstractC2316v7 = ((AbstractC0233o) abstractC2316vM504d2).f804P;
                                        int i15 = 0;
                                        while (abstractC2316v7 != null) {
                                            if ((abstractC2316v7.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                                i15++;
                                                if (i15 == 1) {
                                                    abstractC2316vM504d2 = abstractC2316vM504d2;
                                                    c30849c2 = c30849c2;
                                                    c30849c2 = c30849c2;
                                                    abstractC2316vM504d2 = abstractC2316v7;
                                                } else {
                                                    if (c30849c2 == null) {
                                                        c30849c2 = new C30849c(new AbstractC2316v[16]);
                                                    }
                                                    if (abstractC2316vM504d2 != null) {
                                                        c30849c2.m94885b(abstractC2316vM504d2);
                                                        abstractC2316vM504d2 = null;
                                                    }
                                                    c30849c2.m94885b(abstractC2316v7);
                                                }
                                            } else {
                                                abstractC2316vM504d2 = abstractC2316vM504d2;
                                                c30849c2 = c30849c2;
                                            }
                                            abstractC2316v7 = abstractC2316v7.f9133F;
                                            abstractC2316vM504d2 = abstractC2316vM504d2;
                                            c30849c2 = c30849c2;
                                        }
                                        if (i15 == 1) {
                                            abstractC2316vM504d2 = abstractC2316vM504d2;
                                            c30849c2 = c30849c2;
                                        } else {
                                            abstractC2316vM504d2 = abstractC2316vM504d2;
                                            c30849c2 = c30849c2;
                                        }
                                    }
                                    abstractC2316vM504d2 = AbstractC0201g.m504d(c30849c2);
                                }
                            }
                            abstractC2316v3 = abstractC2316v3.f9132E;
                        }
                    }
                    c0230n0M516p2 = c0230n0M516p2.m588G();
                    abstractC2316v3 = (c0230n0M516p2 != null || (c0223l2 = c0230n0M516p2.f783e0) == null) ? null : (C0224l2) c0223l2.f742f;
                }
                obj4 = (InterfaceC32074f) obj3;
                if (obj4 != null) {
                    abstractC2316v2 = ((AbstractC2316v) obj4).f9142w;
                } else {
                    if (!c15252x.f9142w.f9141N) {
                        AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                    }
                    abstractC2316v = c15252x.f9142w.f9132E;
                    c0230n0M516p = AbstractC0201g.m516p(c15252x);
                    loop15: while (true) {
                        if (c0230n0M516p != null) {
                            obj = null;
                            break;
                        }
                        if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            while (abstractC2316v != null) {
                                if ((abstractC2316v.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    abstractC2316vM504d = abstractC2316v;
                                    c30849c = null;
                                    while (abstractC2316vM504d != null) {
                                        if (abstractC2316vM504d instanceof InterfaceC32074f) {
                                            obj = abstractC2316vM504d;
                                            break loop15;
                                        }
                                        if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                                        }
                                        abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                                    }
                                }
                                abstractC2316v = abstractC2316v.f9132E;
                            }
                        }
                        c0230n0M516p = c0230n0M516p.m588G();
                        if (c0230n0M516p != null) {
                        }
                    }
                    obj2 = (InterfaceC32074f) obj;
                    if (obj2 != null) {
                        abstractC2316v2 = ((AbstractC2316v) obj2).f9142w;
                    } else {
                        abstractC2316v2 = null;
                    }
                }
            }
            if (abstractC2316v2 != null) {
                if (!abstractC2316v2.f9142w.f9141N) {
                    AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                }
                AbstractC2316v abstractC2316v8 = abstractC2316v2.f9142w.f9132E;
                C0230n0 c0230n0M516p3 = AbstractC0201g.m516p(abstractC2316v2);
                ArrayList arrayList = null;
                while (c0230n0M516p3 != null) {
                    if ((((AbstractC2316v) c0230n0M516p3.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        while (abstractC2316v8 != null) {
                            if ((abstractC2316v8.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                AbstractC2316v abstractC2316vM504d3 = abstractC2316v8;
                                C30849c c30849c3 = null;
                                while (abstractC2316vM504d3 != null) {
                                    if (abstractC2316vM504d3 instanceof InterfaceC32074f) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(abstractC2316vM504d3);
                                    } else if ((abstractC2316vM504d3.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0 && (abstractC2316vM504d3 instanceof AbstractC0233o)) {
                                        int i16 = 0;
                                        for (AbstractC2316v abstractC2316v9 = ((AbstractC0233o) abstractC2316vM504d3).f804P; abstractC2316v9 != null; abstractC2316v9 = abstractC2316v9.f9133F) {
                                            if ((abstractC2316v9.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                                i16++;
                                                if (i16 == 1) {
                                                    abstractC2316vM504d3 = abstractC2316v9;
                                                } else {
                                                    if (c30849c3 == null) {
                                                        c30849c3 = new C30849c(new AbstractC2316v[16]);
                                                    }
                                                    if (abstractC2316vM504d3 != null) {
                                                        c30849c3.m94885b(abstractC2316vM504d3);
                                                        abstractC2316vM504d3 = null;
                                                    }
                                                    c30849c3.m94885b(abstractC2316v9);
                                                }
                                            }
                                        }
                                        if (i16 == 1) {
                                        }
                                    }
                                    abstractC2316vM504d3 = AbstractC0201g.m504d(c30849c3);
                                }
                            }
                            abstractC2316v8 = abstractC2316v8.f9132E;
                        }
                    }
                    c0230n0M516p3 = c0230n0M516p3.m588G();
                    abstractC2316v8 = (c0230n0M516p3 == null || (c0223l3 = c0230n0M516p3.f783e0) == null) ? null : (C0224l2) c0223l3.f742f;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i17 = size - 1;
                        if (((InterfaceC32074f) arrayList.get(size)).mo39148Q(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i17 < 0) {
                            break;
                        }
                        size = i17;
                    }
                }
                ?? M504d = abstractC2316v2.f9142w;
                ?? c30849c4 = 0;
                while (M504d != 0) {
                    if (M504d instanceof InterfaceC32074f) {
                        if (((InterfaceC32074f) M504d).mo39148Q(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((M504d.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0 && (M504d instanceof AbstractC0233o)) {
                        AbstractC2316v abstractC2316v10 = ((AbstractC0233o) M504d).f804P;
                        int i18 = 0;
                        while (abstractC2316v10 != null) {
                            if ((abstractC2316v10.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                i18++;
                                if (i18 == 1) {
                                    M504d = M504d;
                                    c30849c4 = c30849c4;
                                    c30849c4 = c30849c4;
                                    M504d = abstractC2316v10;
                                } else {
                                    if (c30849c4 == 0) {
                                        c30849c4 = new C30849c(new AbstractC2316v[16]);
                                    }
                                    if (M504d != 0) {
                                        c30849c4.m94885b(M504d);
                                        M504d = 0;
                                    }
                                    c30849c4.m94885b(abstractC2316v10);
                                }
                            } else {
                                M504d = M504d;
                                c30849c4 = c30849c4;
                            }
                            abstractC2316v10 = abstractC2316v10.f9133F;
                            M504d = M504d;
                            c30849c4 = c30849c4;
                        }
                        if (i18 == 1) {
                            M504d = M504d;
                            c30849c4 = c30849c4;
                        } else {
                            M504d = M504d;
                            c30849c4 = c30849c4;
                        }
                    }
                    M504d = AbstractC0201g.m504d(c30849c4);
                }
                if (((Boolean) interfaceC4339a.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? M504d2 = abstractC2316v2.f9142w;
                ?? c30849c5 = 0;
                while (M504d2 != 0) {
                    if (M504d2 instanceof InterfaceC32074f) {
                        if (((InterfaceC32074f) M504d2).mo39149Z(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((M504d2.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0 && (M504d2 instanceof AbstractC0233o)) {
                        AbstractC2316v abstractC2316v11 = ((AbstractC0233o) M504d2).f804P;
                        int i19 = 0;
                        while (abstractC2316v11 != null) {
                            if ((abstractC2316v11.f9144y & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                i19++;
                                if (i19 == 1) {
                                    c30849c5 = c30849c5;
                                    M504d2 = M504d2;
                                    c30849c5 = c30849c5;
                                    M504d2 = abstractC2316v11;
                                } else {
                                    if (c30849c5 == 0) {
                                        c30849c5 = new C30849c(new AbstractC2316v[16]);
                                    }
                                    if (M504d2 != 0) {
                                        c30849c5.m94885b(M504d2);
                                        M504d2 = 0;
                                    }
                                    c30849c5.m94885b(abstractC2316v11);
                                }
                            } else {
                                c30849c5 = c30849c5;
                                M504d2 = M504d2;
                            }
                            abstractC2316v11 = abstractC2316v11.f9133F;
                            c30849c5 = c30849c5;
                            M504d2 = M504d2;
                        }
                        if (i19 == 1) {
                            c30849c5 = c30849c5;
                            M504d2 = M504d2;
                        } else {
                            c30849c5 = c30849c5;
                            M504d2 = M504d2;
                        }
                    }
                    M504d2 = AbstractC0201g.m504d(c30849c5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i24 = 0; i24 < size2; i24++) {
                        if (((InterfaceC32074f) arrayList.get(i24)).mo39149Z(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Boolean m43344g(int i13, C16618c c16618c, Function1 function1) {
        C15252x c15252x = this.f57241c;
        C15252x c15252xM43318h = AbstractC15235g.m43318h(c15252x);
        AndroidComposeView androidComposeView = this.f57240b;
        if (c15252xM43318h != null) {
            C15247s c15247sM43317g = AbstractC15235g.m43317g(c15252xM43318h, i13, androidComposeView.getLayoutDirection());
            C15247s c15247s = C15247s.f57265b;
            if (!AbstractC22676k.m65745e(c15247sM43317g, AbstractC15235g.m43328r())) {
                if (AbstractC22676k.m65745e(c15247sM43317g, AbstractC15235g.m43330t())) {
                    C15252x c15252xM43318h2 = AbstractC15235g.m43318h(c15252x);
                    if (c15252xM43318h2 != null) {
                        return (Boolean) function1.invoke(c15252xM43318h2);
                    }
                } else if (!AbstractC22676k.m65745e(c15247sM43317g, AbstractC15235g.m43329s())) {
                    return Boolean.valueOf(c15247sM43317g.m43351a(function1));
                }
            }
            return null;
        }
        c15252xM43318h = null;
        return AbstractC15235g.m43322l(c15252x, i13, androidComposeView.getLayoutDirection(), c16618c, new C2696g(c15252xM43318h, this, function1));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX INFO: renamed from: h */
    public final boolean m43345h(int i13) {
        boolean zM60693o0;
        C22669g0 c22669g0 = new C22669g0();
        c22669g0.f89336w = Boolean.FALSE;
        C15252x c15252x = this.f57246h;
        AndroidComposeView androidComposeView = this.f57239a;
        Boolean boolM43344g = m43344g(i13, androidComposeView.getEmbeddedViewFocusRect(), new C28848e(c22669g0, i13, 4));
        if (AbstractC22676k.m65745e(boolM43344g, Boolean.TRUE) && c15252x != this.f57246h) {
            return true;
        }
        if (boolM43344g != null && c22669g0.f89336w != null) {
            if (boolM43344g.booleanValue() && ((Boolean) c22669g0.f89336w).booleanValue()) {
                return true;
            }
            if (!AbstractC15235g.m43332v(i13)) {
                if (C15232d.m43298b(i13, 7) || C15232d.m43298b(i13, 8)) {
                    zM60693o0 = false;
                } else {
                    Integer numM60705u0 = AbstractC21598x.m60705u0(i13);
                    if (numM60705u0 == null) {
                        throw new IllegalStateException("Invalid focus direction");
                    }
                    int iIntValue = numM60705u0.intValue();
                    C16618c embeddedViewFocusRect = androidComposeView.getEmbeddedViewFocusRect();
                    Rect rectM51502D = embeddedViewFocusRect != null ? AbstractC17918w0.m51502D(embeddedViewFocusRect) : null;
                    C1956b c1956b = C2364d2.f9330f;
                    C2364d2 c2364d2M31933A = AbstractC11894a.m31933A();
                    View viewM7289b = rectM51502D == null ? c2364d2M31933A.m7289b(iIntValue, androidComposeView.findFocus(), androidComposeView) : c2364d2M31933A.m7290c(androidComposeView, rectM51502D, iIntValue);
                    if (viewM7289b != null) {
                        zM60693o0 = AbstractC21598x.m60693o0(viewM7289b, Integer.valueOf(iIntValue), rectM51502D);
                    } else {
                        zM60693o0 = false;
                    }
                }
                if (zM60693o0) {
                    return true;
                }
            } else if (m43341d(i13, false, false)) {
                Boolean boolM43344g2 = m43344g(i13, null, new C2466y(i13, 2));
                if (boolM43344g2 != null ? boolM43344g2.booleanValue() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m43346i(C15252x c15252x) {
        C0230n0 c0230n0M516p;
        C18030l c18030lM591I;
        C0230n0 c0230n0M516p2;
        C18030l c18030lM591I2;
        C15252x c15252x2 = this.f57246h;
        this.f57246h = c15252x;
        if (c15252x == null || c15252x2 != c15252x) {
            this.f57247i = false;
        }
        C0047q0 c0047q0 = this.f57245g;
        Object[] objArr = c0047q0.f136a;
        int i13 = c0047q0.f137b;
        for (int i14 = 0; i14 < i13; i14++) {
            C3859d c3859d = (C3859d) objArr[i14];
            c3859d.getClass();
            if (c15252x2 != null && (c0230n0M516p2 = AbstractC0201g.m516p(c15252x2)) != null && (c18030lM591I2 = c0230n0M516p2.m591I()) != null && c18030lM591I2.f69980w.m124b(AbstractC18029k.f69960g)) {
                ((AutofillManager) c3859d.f15787a.f2818x).notifyViewExited(c3859d.f15789c, c0230n0M516p2.f795x);
            }
            if (c15252x != null && (c0230n0M516p = AbstractC0201g.m516p(c15252x)) != null && (c18030lM591I = c0230n0M516p.m591I()) != null && c18030lM591I.f69980w.m124b(AbstractC18029k.f69960g)) {
                int i15 = c0230n0M516p.f795x;
                c3859d.f15790d.f81183a.m1949g(i15, new C3857b(c3859d, i15));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r3v19, types: [int] */
    /* JADX INFO: renamed from: j */
    public final boolean m43347j(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z4;
        long j7;
        int iNumberOfTrailingZeros2;
        int i13;
        long[] jArr;
        int i14;
        long jM99714D = AbstractC32073e.m99714D(keyEvent);
        int iM99720L = AbstractC32073e.m99720L(keyEvent);
        int i15 = -862048943;
        long j13 = 0;
        int i16 = 8;
        int i17 = 0;
        boolean z13 = true;
        if (!AbstractC32072d.m99701j(iM99720L, 2)) {
            if (!AbstractC32072d.m99701j(iM99720L, 1)) {
                return true;
            }
            C0037l0 c0037l0 = this.f57244f;
            if (c0037l0 == null || !c0037l0.m85a(jM99714D)) {
                return false;
            }
            C0037l0 c0037l1 = this.f57244f;
            if (c0037l1 != null) {
                int iHashCode = Long.hashCode(jM99714D) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 & 127;
                int i24 = c0037l1.f108c;
                int i25 = i18 >>> 7;
                loop5: while (true) {
                    int i26 = i25 & i24;
                    long[] jArr2 = c0037l1.f106a;
                    int i27 = i26 >> 3;
                    int i28 = (i26 & 7) << 3;
                    long j14 = ((jArr2[i27 + 1] << (64 - i28)) & ((-i28) >> 63)) | (jArr2[i27] >>> i28);
                    long j15 = (((long) i19) * 72340172838076673L) ^ j14;
                    for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i26) & i24;
                        if (c0037l1.f107b[iNumberOfTrailingZeros] == jM99714D) {
                            break loop5;
                        }
                    }
                    if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i17 += 8;
                    i25 = i26 + i17;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    c0037l1.f109d--;
                    long[] jArr3 = c0037l1.f106a;
                    int i29 = c0037l1.f108c;
                    int i34 = iNumberOfTrailingZeros >> 3;
                    int i35 = (iNumberOfTrailingZeros & 7) << 3;
                    long j17 = (jArr3[i34] & (~(255 << i35))) | (254 << i35);
                    jArr3[i34] = j17;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i29) + (i29 & 7)) >> 3] = j17;
                    return true;
                }
            }
            return true;
        }
        C0037l0 c0037l2 = this.f57244f;
        if (c0037l2 == null) {
            c0037l2 = new C0037l0(3);
            this.f57244f = c0037l2;
        }
        C0037l0 c0037l3 = c0037l2;
        int iHashCode2 = Long.hashCode(jM99714D) * (-862048943);
        int i36 = iHashCode2 ^ (iHashCode2 << 16);
        int i37 = i36 >>> 7;
        int i38 = i36 & 127;
        int i39 = c0037l3.f108c;
        int i44 = i37 & i39;
        int i45 = 0;
        loop0: while (true) {
            long[] jArr4 = c0037l3.f106a;
            int i46 = i44 >> 3;
            int i47 = i15;
            int i48 = (i44 & 7) << 3;
            long j18 = (jArr4[i46] >>> i48) | ((jArr4[i46 + 1] << (64 - i48)) & ((-i48) >> 63));
            long j19 = i38;
            long j24 = j18 ^ (j19 * 72340172838076673L);
            long j25 = (j24 - 72340172838076673L) & (~j24) & (-9187201950435737472L);
            while (j25 != j13) {
                iNumberOfTrailingZeros2 = (i44 + (Long.numberOfTrailingZeros(j25) >> 3)) & i39;
                long j26 = j13;
                if (c0037l3.f107b[iNumberOfTrailingZeros2] == jM99714D) {
                    z4 = true;
                    break loop0;
                }
                j25 &= j25 - 1;
                j13 = j26;
            }
            long j27 = j13;
            if ((j18 & ((~j18) << 6) & (-9187201950435737472L)) != j27) {
                int iM86b = c0037l3.m86b(i37);
                if (c0037l3.f110e != 0 || ((c0037l3.f106a[iM86b >> 3] >> ((iM86b & 7) << 3)) & 255) == 254) {
                    z4 = true;
                    j7 = 128;
                } else {
                    int i49 = c0037l3.f108c;
                    if (i49 > i16) {
                        long j28 = 128;
                        if (Long.compareUnsigned(((long) c0037l3.f109d) * 32, ((long) i49) * 25) <= 0) {
                            long[] jArr5 = c0037l3.f106a;
                            int i54 = c0037l3.f108c;
                            long[] jArr6 = c0037l3.f107b;
                            int i55 = (i54 + 7) >> 3;
                            int i56 = 0;
                            while (i56 < i55) {
                                int i57 = i16;
                                long j29 = jArr5[i56] & (-9187201950435737472L);
                                jArr5[i56] = (-72340172838076674L) & ((~j29) + (j29 >>> 7));
                                i56++;
                                i16 = i57;
                                j28 = j28;
                                i37 = i37;
                            }
                            i13 = i37;
                            j7 = j28;
                            int iM74081v0 = AbstractC25260n.m74081v0(jArr5);
                            int i58 = iM74081v0 - 1;
                            jArr5[i58] = (jArr5[i58] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[iM74081v0] = jArr5[0];
                            int i59 = 0;
                            while (i59 != i54) {
                                int i64 = i59 >> 3;
                                int i65 = (i59 & 7) << 3;
                                long j34 = (jArr5[i64] >> i65) & 255;
                                if (j34 != j7 && j34 == 254) {
                                    int iHashCode3 = Long.hashCode(jArr6[i59]) * i47;
                                    int i66 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i67 = i66 >>> 7;
                                    int iM86b2 = c0037l3.m86b(i67);
                                    int i68 = i67 & i54;
                                    boolean z14 = z13;
                                    if (((iM86b2 - i68) & i54) / 8 == ((i59 - i68) & i54) / 8) {
                                        jArr5[i64] = (jArr5[i64] & (~(255 << i65))) | (((long) (i66 & 127)) << i65);
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i59++;
                                    } else {
                                        int i69 = i59;
                                        int i74 = iM86b2 >> 3;
                                        long j35 = jArr5[i74];
                                        int i75 = (iM86b2 & 7) << 3;
                                        if (((j35 >> i75) & 255) == j7) {
                                            jArr5[i74] = (j35 & (~(255 << i75))) | (((long) (i66 & 127)) << i75);
                                            jArr5[i64] = (jArr5[i64] & (~(255 << i65))) | (j7 << i65);
                                            jArr6[iM86b2] = jArr6[i69];
                                            jArr6[i69] = j27;
                                            i14 = i69;
                                        } else {
                                            jArr5[i74] = (((long) (i66 & 127)) << i75) | (j35 & (~(255 << i75)));
                                            long j36 = jArr6[iM86b2];
                                            jArr6[iM86b2] = jArr6[i69];
                                            jArr6[i69] = j36;
                                            i14 = i69 - 1;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i59 = i14 + 1;
                                    }
                                    z13 = z14;
                                } else {
                                    i59++;
                                }
                            }
                            z4 = z13;
                            c0037l3.f110e = AbstractC0015d1.m16a(c0037l3.f108c) - c0037l3.f109d;
                        } else {
                            j7 = 128;
                        }
                        iM86b = c0037l3.m86b(i13);
                    } else {
                        j7 = 128;
                    }
                    i13 = i37;
                    z4 = true;
                    int iM17b = AbstractC0015d1.m17b(c0037l3.f108c);
                    long[] jArr7 = c0037l3.f106a;
                    long[] jArr8 = c0037l3.f107b;
                    int i76 = c0037l3.f108c;
                    c0037l3.m87c(iM17b);
                    long[] jArr9 = c0037l3.f106a;
                    long[] jArr10 = c0037l3.f107b;
                    int i77 = c0037l3.f108c;
                    int i78 = 0;
                    while (i78 < i76) {
                        if (((jArr7[i78 >> 3] >> ((i78 & 7) << 3)) & 255) < j7) {
                            long j37 = jArr8[i78];
                            int iHashCode4 = Long.hashCode(j37) * i47;
                            int i79 = iHashCode4 ^ (iHashCode4 << 16);
                            jArr = jArr9;
                            int iM86b3 = c0037l3.m86b(i79 >>> 7);
                            long j38 = i79 & 127;
                            int i83 = iM86b3 >> 3;
                            int i84 = (iM86b3 & 7) << 3;
                            long j39 = (jArr[i83] & (~(255 << i84))) | (j38 << i84);
                            jArr[i83] = j39;
                            jArr[(((iM86b3 - 7) & i77) + (i77 & 7)) >> 3] = j39;
                            jArr10[iM86b3] = j37;
                        } else {
                            jArr = jArr9;
                        }
                        i78++;
                        jArr9 = jArr;
                        jArr7 = jArr7;
                        jArr8 = jArr8;
                    }
                    iM86b = c0037l3.m86b(i13);
                }
                iNumberOfTrailingZeros2 = iM86b;
                c0037l3.f109d++;
                int i85 = c0037l3.f110e;
                long[] jArr11 = c0037l3.f106a;
                int i86 = iNumberOfTrailingZeros2 >> 3;
                long j44 = jArr11[i86];
                int i87 = (iNumberOfTrailingZeros2 & 7) << 3;
                c0037l3.f110e = i85 - (((j44 >> i87) & 255) == j7 ? z4 : 0);
                int i88 = c0037l3.f108c;
                long j45 = (j44 & (~(255 << i87))) | (j19 << i87);
                jArr11[i86] = j45;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i88) + (i88 & 7)) >> 3] = j45;
                break;
            }
            i45 += 8;
            i44 = (i44 + i45) & i39;
            i16 = i16;
            i15 = i47;
            j13 = j27;
        }
        c0037l3.f107b[iNumberOfTrailingZeros2] = jM99714D;
        return z4;
    }
}

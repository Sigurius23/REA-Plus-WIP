package p713jm0;

import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.appconfiguration.TabConfiguration;
import dp0.AbstractC12247c;
import h31.C16825r;
import hm0.C17422c;
import hm0.C17423d;
import hm0.InterfaceC17420a;
import java.io.IOException;
import java.util.List;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: jm0.b, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lkotlin/Function1;", "Lcom/whoop/appconfiguration/TabConfiguration;", "Ll83/a0;", "onTabSelected", "Landroidx/compose/ui/Modifier;", "modifier", "", "showCoachBar", "showVoiceButton", "", "coachBarPlaceholder", "d", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Lhm0/d;", "viewState", "bottom-navigation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {
    /* JADX WARN: Code duplicated, block: B:104:0x0215  */
    /* JADX WARN: Code duplicated, block: B:107:0x0223  */
    /* JADX WARN: Code duplicated, block: B:109:0x0229  */
    /* JADX WARN: Code duplicated, block: B:112:0x0234  */
    /* JADX WARN: Code duplicated, block: B:114:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x0258  */
    /* JADX WARN: Code duplicated, block: B:117:0x0291  */
    /* JADX WARN: Code duplicated, block: B:120:0x029e  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ab A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    /* JADX WARN: Code duplicated, block: B:87:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0170  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    /* JADX WARN: Code duplicated, block: B:92:0x018f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c5  */
    /* JADX INFO: renamed from: d */
    public static final void m61617d(final p715kotlin.jvm.functions.Function1 onTabSelected, Modifier modifier, boolean z4, boolean z13, String str, Composer composer, final int i13, final int i14) throws XmlPullParserException, IOException {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z14;
        int i17;
        int i18;
        boolean z15;
        int i19;
        int i24;
        String str2;
        int i25;
        boolean z16;
        final Modifier modifier3;
        final boolean z17;
        final boolean z18;
        final String str3;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        final Modifier modifier4;
        final boolean z19;
        final boolean z24;
        final String str4;
        C17423d c17423d;
        boolean zIsFeatureEnabled;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        AbstractC23864c abstractC23864c;
        InterfaceC28601c1 interfaceC28601c1M87260n;
        boolean zM34106k;
        String strM49448a;
        boolean zM87157i;
        Object objM87133R2;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R3;
        Object obj;
        Object obj2;
        boolean zM87153g3;
        Object objM87133R4;
        AbstractC22676k.m65750j(onTabSelected, "onTabSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(120529985);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(onTabSelected) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z14 = z4;
                    if (c28655q.m87155h(z14)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        z15 = z13;
                        if (c28655q.m87155h(z15)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            str2 = str;
                            if (c28655q.m87153g(str2)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 9363) != 9362) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z16)) {
                            if (i26 != 0) {
                                modifier4 = C2314t.f9131w;
                            } else {
                                modifier4 = modifier2;
                            }
                            if (i16 != 0) {
                                z19 = false;
                            } else {
                                z19 = z14;
                            }
                            if (i18 != 0) {
                                z24 = false;
                            } else {
                                z24 = z15;
                            }
                            if (i24 != 0) {
                                str4 = "";
                            } else {
                                str4 = str2;
                            }
                            c17423d = new C17423d(null, null, false, false, 15, null);
                            c28655q.m87150e0(1371609227);
                            zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                            C28676v0 c28676v0 = C28635l.f115821a;
                            if (zIsFeatureEnabled) {
                                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                                if (applicationContext instanceof Application) {
                                    application = (Application) applicationContext;
                                } else {
                                    application = null;
                                }
                                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                                objM87133R = c28655q.m87133R();
                                if (zM87153g || objM87133R == c28676v0) {
                                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                abstractC23864c = (AbstractC23864c) objM87133R;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-707976188);
                                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                                if (interfaceC1583f2M73844a == null) {
                                    c28655q.m87150e0(-707931115);
                                    c28655q.m87173q(false);
                                    obj2 = null;
                                    obj = null;
                                    abstractC23864c = null;
                                } else {
                                    c28655q.m87150e0(-707931114);
                                    Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                                    AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                                    application2 = (Application) applicationContext2;
                                    zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                                    objM87133R3 = c28655q.m87133R();
                                    if (!zM87153g2 || objM87133R3 == c28676v0) {
                                        objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                        obj = null;
                                        obj2 = null;
                                        c28655q.m87172p0(objM87133R3);
                                    } else {
                                        obj2 = null;
                                        obj = null;
                                    }
                                    abstractC23864c = (AbstractC23864c) objM87133R3;
                                    c28655q.m87173q(false);
                                }
                                if (abstractC23864c == null) {
                                    c28655q.m87150e0(-707430526);
                                    zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                                    objM87133R4 = c28655q.m87133R();
                                    if (zM87153g3 || objM87133R4 == c28676v0) {
                                        objM87133R4 = new C23863b(c17423d);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    abstractC23864c = (C23863b) objM87133R4;
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(-438479417);
                                    c28655q.m87173q(false);
                                }
                                c28655q.m87173q(false);
                                c28655q.m87173q(false);
                            }
                            interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                            zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                            strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                            if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                                strM49448a = null;
                            }
                            AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                            if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                                List<TabConfiguration> listM49450c = m61618e(interfaceC28601c1M87260n).m49450c();
                                String strM49448a2 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                                boolean zM49449b = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                                zM87157i = c28655q.m87157i(abstractC23864c);
                                objM87133R2 = c28655q.m87133R();
                                if (zM87157i || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C16825r(abstractC23864c, 2);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                String str5 = str4;
                                boolean z25 = z24;
                                Modifier modifier5 = modifier4;
                                boolean z26 = z19;
                                AbstractC21789d.m61632k(listM49450c, strM49448a2, zM49449b, onTabSelected, modifier5, 0.0f, (InterfaceC4339a) objM87133R2, z26, zM34106k, z25, str5, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                                modifier3 = modifier5;
                                z17 = z26;
                                z18 = z25;
                                str3 = str5;
                                c28655q = c28655q;
                            } else {
                                c28677v1M87180u = c28655q.m87180u();
                                if (c28677v1M87180u != null) {
                                    return;
                                }
                                final int i27 = 0;
                                interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj3, Object obj4) {
                                        switch (i27) {
                                            case 0:
                                                int iIntValue = ((Integer) obj4).intValue();
                                                return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                            default:
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                                        }
                                    }
                                };
                            }
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        z17 = z14;
                        z18 = z15;
                        str3 = str2;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            final int i28 = 1;
                            interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj3, Object obj4) {
                                    switch (i28) {
                                        case 0:
                                            int iIntValue = ((Integer) obj4).intValue();
                                            return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                    }
                    i15 |= 24576;
                    str2 = str;
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i26 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i18 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i24 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        c17423d = new C17423d(null, null, false, false, 15, null);
                        c28655q.m87150e0(1371609227);
                        zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                        C28676v0 c28676v1 = C28635l.f115821a;
                        if (zIsFeatureEnabled) {
                            c28655q.m87150e0(-707976188);
                            interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                            if (interfaceC1583f2M73844a == null) {
                                c28655q.m87150e0(-707931115);
                                c28655q.m87173q(false);
                                obj2 = null;
                                obj = null;
                                abstractC23864c = null;
                            } else {
                                c28655q.m87150e0(-707931114);
                                Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                                AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                                application2 = (Application) applicationContext3;
                                zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                                objM87133R3 = c28655q.m87133R();
                                if (zM87153g2) {
                                    objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                    obj = null;
                                    obj2 = null;
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                    obj = null;
                                    obj2 = null;
                                    c28655q.m87172p0(objM87133R3);
                                }
                                abstractC23864c = (AbstractC23864c) objM87133R3;
                                c28655q.m87173q(false);
                            }
                            if (abstractC23864c == null) {
                                c28655q.m87150e0(-707430526);
                                zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                                objM87133R4 = c28655q.m87133R();
                                if (zM87153g3) {
                                    objM87133R4 = new C23863b(c17423d);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C23863b(c17423d);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                abstractC23864c = (C23863b) objM87133R4;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-438479417);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                            applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            if (applicationContext instanceof Application) {
                                application = (Application) applicationContext;
                            } else {
                                application = null;
                            }
                            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                            objM87133R = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R;
                            c28655q.m87173q(false);
                        }
                        interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                        zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                        strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                        if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                            strM49448a = null;
                        }
                        AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                        if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                return;
                            }
                            final int i29 = 0;
                            interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj3, Object obj4) {
                                    switch (i29) {
                                        case 0:
                                            int iIntValue = ((Integer) obj4).intValue();
                                            return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                                    }
                                }
                            };
                        } else {
                            List<TabConfiguration> listM49450c2 = m61618e(interfaceC28601c1M87260n).m49450c();
                            String strM49448a3 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                            boolean zM49449b2 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                            zM87157i = c28655q.m87157i(abstractC23864c);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R2 = new C16825r(abstractC23864c, 2);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C16825r(abstractC23864c, 2);
                                c28655q.m87172p0(objM87133R2);
                            }
                            String str6 = str4;
                            boolean z27 = z24;
                            Modifier modifier6 = modifier4;
                            boolean z28 = z19;
                            AbstractC21789d.m61632k(listM49450c2, strM49448a3, zM49449b2, onTabSelected, modifier6, 0.0f, (InterfaceC4339a) objM87133R2, z28, zM34106k, z27, str6, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                            modifier3 = modifier6;
                            z17 = z28;
                            z18 = z27;
                            str3 = str6;
                            c28655q = c28655q;
                        }
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z17 = z14;
                    z18 = z15;
                    str3 = str2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i210 = 1;
                        interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i210) {
                                    case 0:
                                        int iIntValue = ((Integer) obj4).intValue();
                                        return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i15 |= 3072;
                z15 = z13;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        str2 = str;
                        if (c28655q.m87153g(str2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i26 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i18 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i24 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        c17423d = new C17423d(null, null, false, false, 15, null);
                        c28655q.m87150e0(1371609227);
                        zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                        C28676v0 c28676v2 = C28635l.f115821a;
                        if (zIsFeatureEnabled) {
                            c28655q.m87150e0(-707976188);
                            interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                            if (interfaceC1583f2M73844a == null) {
                                c28655q.m87150e0(-707931115);
                                c28655q.m87173q(false);
                                obj2 = null;
                                obj = null;
                                abstractC23864c = null;
                            } else {
                                c28655q.m87150e0(-707931114);
                                Context applicationContext4 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                                AbstractC22676k.m65748h(applicationContext4, "null cannot be cast to non-null type android.app.Application");
                                application2 = (Application) applicationContext4;
                                zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                                objM87133R3 = c28655q.m87133R();
                                if (zM87153g2) {
                                    objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                    obj = null;
                                    obj2 = null;
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                    obj = null;
                                    obj2 = null;
                                    c28655q.m87172p0(objM87133R3);
                                }
                                abstractC23864c = (AbstractC23864c) objM87133R3;
                                c28655q.m87173q(false);
                            }
                            if (abstractC23864c == null) {
                                c28655q.m87150e0(-707430526);
                                zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                                objM87133R4 = c28655q.m87133R();
                                if (zM87153g3) {
                                    objM87133R4 = new C23863b(c17423d);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C23863b(c17423d);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                abstractC23864c = (C23863b) objM87133R4;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-438479417);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                            applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            if (applicationContext instanceof Application) {
                                application = (Application) applicationContext;
                            } else {
                                application = null;
                            }
                            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                            objM87133R = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R;
                            c28655q.m87173q(false);
                        }
                        interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                        zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                        strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                        if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                            strM49448a = null;
                        }
                        AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                        if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                return;
                            }
                            final int i211 = 0;
                            interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj3, Object obj4) {
                                    switch (i211) {
                                        case 0:
                                            int iIntValue = ((Integer) obj4).intValue();
                                            return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                                    }
                                }
                            };
                        } else {
                            List<TabConfiguration> listM49450c3 = m61618e(interfaceC28601c1M87260n).m49450c();
                            String strM49448a4 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                            boolean zM49449b3 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                            zM87157i = c28655q.m87157i(abstractC23864c);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R2 = new C16825r(abstractC23864c, 2);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C16825r(abstractC23864c, 2);
                                c28655q.m87172p0(objM87133R2);
                            }
                            String str7 = str4;
                            boolean z29 = z24;
                            Modifier modifier7 = modifier4;
                            boolean z210 = z19;
                            AbstractC21789d.m61632k(listM49450c3, strM49448a4, zM49449b3, onTabSelected, modifier7, 0.0f, (InterfaceC4339a) objM87133R2, z210, zM34106k, z29, str7, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                            modifier3 = modifier7;
                            z17 = z210;
                            z18 = z29;
                            str3 = str7;
                            c28655q = c28655q;
                        }
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z17 = z14;
                    z18 = z15;
                    str3 = str2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i212 = 1;
                        interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i212) {
                                    case 0:
                                        int iIntValue = ((Integer) obj4).intValue();
                                        return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i15 |= 24576;
                str2 = str;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i24 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    c17423d = new C17423d(null, null, false, false, 15, null);
                    c28655q.m87150e0(1371609227);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                    C28676v0 c28676v3 = C28635l.f115821a;
                    if (zIsFeatureEnabled) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj2 = null;
                            obj = null;
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext5 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext5, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext5;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R3;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (C23863b) objM87133R4;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                        c28655q.m87173q(false);
                    }
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                    zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                    strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                    if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        strM49448a = null;
                    }
                    AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                    if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        }
                        final int i213 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i213) {
                                    case 0:
                                        int iIntValue = ((Integer) obj4).intValue();
                                        return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                                }
                            }
                        };
                    } else {
                        List<TabConfiguration> listM49450c4 = m61618e(interfaceC28601c1M87260n).m49450c();
                        String strM49448a5 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                        boolean zM49449b4 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                        zM87157i = c28655q.m87157i(abstractC23864c);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        String str8 = str4;
                        boolean z211 = z24;
                        Modifier modifier8 = modifier4;
                        boolean z212 = z19;
                        AbstractC21789d.m61632k(listM49450c4, strM49448a5, zM49449b4, onTabSelected, modifier8, 0.0f, (InterfaceC4339a) objM87133R2, z212, zM34106k, z211, str8, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                        modifier3 = modifier8;
                        z17 = z212;
                        z18 = z211;
                        str3 = str8;
                        c28655q = c28655q;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q.m87138X();
                modifier3 = modifier2;
                z17 = z14;
                z18 = z15;
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i214 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i214) {
                                case 0:
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 384;
            z14 = z4;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        str2 = str;
                        if (c28655q.m87153g(str2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i26 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i18 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i24 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        c17423d = new C17423d(null, null, false, false, 15, null);
                        c28655q.m87150e0(1371609227);
                        zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                        C28676v0 c28676v4 = C28635l.f115821a;
                        if (zIsFeatureEnabled) {
                            c28655q.m87150e0(-707976188);
                            interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                            if (interfaceC1583f2M73844a == null) {
                                c28655q.m87150e0(-707931115);
                                c28655q.m87173q(false);
                                obj2 = null;
                                obj = null;
                                abstractC23864c = null;
                            } else {
                                c28655q.m87150e0(-707931114);
                                Context applicationContext6 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                                AbstractC22676k.m65748h(applicationContext6, "null cannot be cast to non-null type android.app.Application");
                                application2 = (Application) applicationContext6;
                                zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                                objM87133R3 = c28655q.m87133R();
                                if (zM87153g2) {
                                    objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                    obj = null;
                                    obj2 = null;
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                    obj = null;
                                    obj2 = null;
                                    c28655q.m87172p0(objM87133R3);
                                }
                                abstractC23864c = (AbstractC23864c) objM87133R3;
                                c28655q.m87173q(false);
                            }
                            if (abstractC23864c == null) {
                                c28655q.m87150e0(-707430526);
                                zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                                objM87133R4 = c28655q.m87133R();
                                if (zM87153g3) {
                                    objM87133R4 = new C23863b(c17423d);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C23863b(c17423d);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                abstractC23864c = (C23863b) objM87133R4;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-438479417);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                            applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            if (applicationContext instanceof Application) {
                                application = (Application) applicationContext;
                            } else {
                                application = null;
                            }
                            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                            objM87133R = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R;
                            c28655q.m87173q(false);
                        }
                        interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                        zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                        strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                        if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                            strM49448a = null;
                        }
                        AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                        if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                return;
                            }
                            final int i215 = 0;
                            interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj3, Object obj4) {
                                    switch (i215) {
                                        case 0:
                                            int iIntValue = ((Integer) obj4).intValue();
                                            return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                                    }
                                }
                            };
                        } else {
                            List<TabConfiguration> listM49450c5 = m61618e(interfaceC28601c1M87260n).m49450c();
                            String strM49448a6 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                            boolean zM49449b5 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                            zM87157i = c28655q.m87157i(abstractC23864c);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R2 = new C16825r(abstractC23864c, 2);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C16825r(abstractC23864c, 2);
                                c28655q.m87172p0(objM87133R2);
                            }
                            String str9 = str4;
                            boolean z213 = z24;
                            Modifier modifier9 = modifier4;
                            boolean z214 = z19;
                            AbstractC21789d.m61632k(listM49450c5, strM49448a6, zM49449b5, onTabSelected, modifier9, 0.0f, (InterfaceC4339a) objM87133R2, z214, zM34106k, z213, str9, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                            modifier3 = modifier9;
                            z17 = z214;
                            z18 = z213;
                            str3 = str9;
                            c28655q = c28655q;
                        }
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z17 = z14;
                    z18 = z15;
                    str3 = str2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i216 = 1;
                        interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i216) {
                                    case 0:
                                        int iIntValue = ((Integer) obj4).intValue();
                                        return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i15 |= 24576;
                str2 = str;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i24 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    c17423d = new C17423d(null, null, false, false, 15, null);
                    c28655q.m87150e0(1371609227);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                    C28676v0 c28676v5 = C28635l.f115821a;
                    if (zIsFeatureEnabled) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj2 = null;
                            obj = null;
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext7 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext7, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext7;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R3;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (C23863b) objM87133R4;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                        c28655q.m87173q(false);
                    }
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                    zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                    strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                    if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        strM49448a = null;
                    }
                    AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                    if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        }
                        final int i217 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i217) {
                                    case 0:
                                        int iIntValue = ((Integer) obj4).intValue();
                                        return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                                }
                            }
                        };
                    } else {
                        List<TabConfiguration> listM49450c6 = m61618e(interfaceC28601c1M87260n).m49450c();
                        String strM49448a7 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                        boolean zM49449b6 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                        zM87157i = c28655q.m87157i(abstractC23864c);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        String str10 = str4;
                        boolean z215 = z24;
                        Modifier modifier10 = modifier4;
                        boolean z216 = z19;
                        AbstractC21789d.m61632k(listM49450c6, strM49448a7, zM49449b6, onTabSelected, modifier10, 0.0f, (InterfaceC4339a) objM87133R2, z216, zM34106k, z215, str10, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                        modifier3 = modifier10;
                        z17 = z216;
                        z18 = z215;
                        str3 = str10;
                        c28655q = c28655q;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q.m87138X();
                modifier3 = modifier2;
                z17 = z14;
                z18 = z15;
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i218 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i218) {
                                case 0:
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 3072;
            z15 = z13;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i24 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    c17423d = new C17423d(null, null, false, false, 15, null);
                    c28655q.m87150e0(1371609227);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                    C28676v0 c28676v6 = C28635l.f115821a;
                    if (zIsFeatureEnabled) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj2 = null;
                            obj = null;
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext8 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext8, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext8;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R3;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (C23863b) objM87133R4;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                        c28655q.m87173q(false);
                    }
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                    zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                    strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                    if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        strM49448a = null;
                    }
                    AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                    if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        }
                        final int i219 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i219) {
                                    case 0:
                                        int iIntValue = ((Integer) obj4).intValue();
                                        return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                                }
                            }
                        };
                    } else {
                        List<TabConfiguration> listM49450c7 = m61618e(interfaceC28601c1M87260n).m49450c();
                        String strM49448a8 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                        boolean zM49449b7 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                        zM87157i = c28655q.m87157i(abstractC23864c);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        String str11 = str4;
                        boolean z217 = z24;
                        Modifier modifier11 = modifier4;
                        boolean z218 = z19;
                        AbstractC21789d.m61632k(listM49450c7, strM49448a8, zM49449b7, onTabSelected, modifier11, 0.0f, (InterfaceC4339a) objM87133R2, z218, zM34106k, z217, str11, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                        modifier3 = modifier11;
                        z17 = z218;
                        z18 = z217;
                        str3 = str11;
                        c28655q = c28655q;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q.m87138X();
                modifier3 = modifier2;
                z17 = z14;
                z18 = z15;
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i2110 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i2110) {
                                case 0:
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 24576;
            str2 = str;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i26 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i24 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                c17423d = new C17423d(null, null, false, false, 15, null);
                c28655q.m87150e0(1371609227);
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                C28676v0 c28676v7 = C28635l.f115821a;
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj2 = null;
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext9 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext9, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext9;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R4 = new C23863b(c17423d);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C23863b(c17423d);
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (C23863b) objM87133R4;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                    c28655q.m87173q(false);
                }
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                    strM49448a = null;
                }
                AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i2111 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i2111) {
                                case 0:
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                            }
                        }
                    };
                } else {
                    List<TabConfiguration> listM49450c8 = m61618e(interfaceC28601c1M87260n).m49450c();
                    String strM49448a9 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                    boolean zM49449b8 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                    zM87157i = c28655q.m87157i(abstractC23864c);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C16825r(abstractC23864c, 2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C16825r(abstractC23864c, 2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    String str12 = str4;
                    boolean z219 = z24;
                    Modifier modifier12 = modifier4;
                    boolean z2110 = z19;
                    AbstractC21789d.m61632k(listM49450c8, strM49448a9, zM49449b8, onTabSelected, modifier12, 0.0f, (InterfaceC4339a) objM87133R2, z2110, zM34106k, z219, str12, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                    modifier3 = modifier12;
                    z17 = z2110;
                    z18 = z219;
                    str3 = str12;
                    c28655q = c28655q;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q.m87138X();
            modifier3 = modifier2;
            z17 = z14;
            z18 = z15;
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i2112 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (i2112) {
                            case 0:
                                int iIntValue = ((Integer) obj4).intValue();
                                return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj4).intValue();
                                return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z14 = z4;
                if (c28655q.m87155h(z14)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        str2 = str;
                        if (c28655q.m87153g(str2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i26 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i18 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i24 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        c17423d = new C17423d(null, null, false, false, 15, null);
                        c28655q.m87150e0(1371609227);
                        zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                        C28676v0 c28676v8 = C28635l.f115821a;
                        if (zIsFeatureEnabled) {
                            c28655q.m87150e0(-707976188);
                            interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                            if (interfaceC1583f2M73844a == null) {
                                c28655q.m87150e0(-707931115);
                                c28655q.m87173q(false);
                                obj2 = null;
                                obj = null;
                                abstractC23864c = null;
                            } else {
                                c28655q.m87150e0(-707931114);
                                Context applicationContext10 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                                AbstractC22676k.m65748h(applicationContext10, "null cannot be cast to non-null type android.app.Application");
                                application2 = (Application) applicationContext10;
                                zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                                objM87133R3 = c28655q.m87133R();
                                if (zM87153g2) {
                                    objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                    obj = null;
                                    obj2 = null;
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                    obj = null;
                                    obj2 = null;
                                    c28655q.m87172p0(objM87133R3);
                                }
                                abstractC23864c = (AbstractC23864c) objM87133R3;
                                c28655q.m87173q(false);
                            }
                            if (abstractC23864c == null) {
                                c28655q.m87150e0(-707430526);
                                zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                                objM87133R4 = c28655q.m87133R();
                                if (zM87153g3) {
                                    objM87133R4 = new C23863b(c17423d);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C23863b(c17423d);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                abstractC23864c = (C23863b) objM87133R4;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-438479417);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                            applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            if (applicationContext instanceof Application) {
                                application = (Application) applicationContext;
                            } else {
                                application = null;
                            }
                            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                            objM87133R = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R;
                            c28655q.m87173q(false);
                        }
                        interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                        zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                        strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                        if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                            strM49448a = null;
                        }
                        AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                        if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                return;
                            }
                            final int i2113 = 0;
                            interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj3, Object obj4) {
                                    switch (i2113) {
                                        case 0:
                                            int iIntValue = ((Integer) obj4).intValue();
                                            return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                                    }
                                }
                            };
                        } else {
                            List<TabConfiguration> listM49450c9 = m61618e(interfaceC28601c1M87260n).m49450c();
                            String strM49448a10 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                            boolean zM49449b9 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                            zM87157i = c28655q.m87157i(abstractC23864c);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R2 = new C16825r(abstractC23864c, 2);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C16825r(abstractC23864c, 2);
                                c28655q.m87172p0(objM87133R2);
                            }
                            String str13 = str4;
                            boolean z2111 = z24;
                            Modifier modifier13 = modifier4;
                            boolean z2112 = z19;
                            AbstractC21789d.m61632k(listM49450c9, strM49448a10, zM49449b9, onTabSelected, modifier13, 0.0f, (InterfaceC4339a) objM87133R2, z2112, zM34106k, z2111, str13, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                            modifier3 = modifier13;
                            z17 = z2112;
                            z18 = z2111;
                            str3 = str13;
                            c28655q = c28655q;
                        }
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z17 = z14;
                    z18 = z15;
                    str3 = str2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i2114 = 1;
                        interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i2114) {
                                    case 0:
                                        int iIntValue = ((Integer) obj4).intValue();
                                        return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i15 |= 24576;
                str2 = str;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i24 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    c17423d = new C17423d(null, null, false, false, 15, null);
                    c28655q.m87150e0(1371609227);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                    C28676v0 c28676v9 = C28635l.f115821a;
                    if (zIsFeatureEnabled) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj2 = null;
                            obj = null;
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext11 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext11, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext11;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R3;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (C23863b) objM87133R4;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                        c28655q.m87173q(false);
                    }
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                    zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                    strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                    if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        strM49448a = null;
                    }
                    AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                    if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        }
                        final int i2115 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i2115) {
                                    case 0:
                                        int iIntValue = ((Integer) obj4).intValue();
                                        return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                                }
                            }
                        };
                    } else {
                        List<TabConfiguration> listM49450c10 = m61618e(interfaceC28601c1M87260n).m49450c();
                        String strM49448a11 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                        boolean zM49449b10 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                        zM87157i = c28655q.m87157i(abstractC23864c);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        String str14 = str4;
                        boolean z2113 = z24;
                        Modifier modifier14 = modifier4;
                        boolean z2114 = z19;
                        AbstractC21789d.m61632k(listM49450c10, strM49448a11, zM49449b10, onTabSelected, modifier14, 0.0f, (InterfaceC4339a) objM87133R2, z2114, zM34106k, z2113, str14, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                        modifier3 = modifier14;
                        z17 = z2114;
                        z18 = z2113;
                        str3 = str14;
                        c28655q = c28655q;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q.m87138X();
                modifier3 = modifier2;
                z17 = z14;
                z18 = z15;
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i2116 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i2116) {
                                case 0:
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 3072;
            z15 = z13;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i24 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    c17423d = new C17423d(null, null, false, false, 15, null);
                    c28655q.m87150e0(1371609227);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                    C28676v0 c28676v10 = C28635l.f115821a;
                    if (zIsFeatureEnabled) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj2 = null;
                            obj = null;
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext12 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext12, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext12;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R3;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (C23863b) objM87133R4;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                        c28655q.m87173q(false);
                    }
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                    zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                    strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                    if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        strM49448a = null;
                    }
                    AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                    if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        }
                        final int i2117 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i2117) {
                                    case 0:
                                        int iIntValue = ((Integer) obj4).intValue();
                                        return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                                }
                            }
                        };
                    } else {
                        List<TabConfiguration> listM49450c11 = m61618e(interfaceC28601c1M87260n).m49450c();
                        String strM49448a12 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                        boolean zM49449b11 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                        zM87157i = c28655q.m87157i(abstractC23864c);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        String str15 = str4;
                        boolean z2115 = z24;
                        Modifier modifier15 = modifier4;
                        boolean z2116 = z19;
                        AbstractC21789d.m61632k(listM49450c11, strM49448a12, zM49449b11, onTabSelected, modifier15, 0.0f, (InterfaceC4339a) objM87133R2, z2116, zM34106k, z2115, str15, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                        modifier3 = modifier15;
                        z17 = z2116;
                        z18 = z2115;
                        str3 = str15;
                        c28655q = c28655q;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q.m87138X();
                modifier3 = modifier2;
                z17 = z14;
                z18 = z15;
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i2118 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i2118) {
                                case 0:
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 24576;
            str2 = str;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i26 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i24 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                c17423d = new C17423d(null, null, false, false, 15, null);
                c28655q.m87150e0(1371609227);
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                C28676v0 c28676v11 = C28635l.f115821a;
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj2 = null;
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext13 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext13, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext13;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R4 = new C23863b(c17423d);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C23863b(c17423d);
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (C23863b) objM87133R4;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                    c28655q.m87173q(false);
                }
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                    strM49448a = null;
                }
                AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i2119 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i2119) {
                                case 0:
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                            }
                        }
                    };
                } else {
                    List<TabConfiguration> listM49450c12 = m61618e(interfaceC28601c1M87260n).m49450c();
                    String strM49448a13 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                    boolean zM49449b12 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                    zM87157i = c28655q.m87157i(abstractC23864c);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C16825r(abstractC23864c, 2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C16825r(abstractC23864c, 2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    String str16 = str4;
                    boolean z2117 = z24;
                    Modifier modifier16 = modifier4;
                    boolean z2118 = z19;
                    AbstractC21789d.m61632k(listM49450c12, strM49448a13, zM49449b12, onTabSelected, modifier16, 0.0f, (InterfaceC4339a) objM87133R2, z2118, zM34106k, z2117, str16, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                    modifier3 = modifier16;
                    z17 = z2118;
                    z18 = z2117;
                    str3 = str16;
                    c28655q = c28655q;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q.m87138X();
            modifier3 = modifier2;
            z17 = z14;
            z18 = z15;
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i21110 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (i21110) {
                            case 0:
                                int iIntValue = ((Integer) obj4).intValue();
                                return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj4).intValue();
                                return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 384;
        z14 = z4;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i24 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    c17423d = new C17423d(null, null, false, false, 15, null);
                    c28655q.m87150e0(1371609227);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                    C28676v0 c28676v12 = C28635l.f115821a;
                    if (zIsFeatureEnabled) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj2 = null;
                            obj = null;
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext14 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext14, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext14;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R3;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C23863b(c17423d);
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (C23863b) objM87133R4;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                        c28655q.m87173q(false);
                    }
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                    zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                    strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                    if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        strM49448a = null;
                    }
                    AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                    if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        }
                        final int i21111 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i21111) {
                                    case 0:
                                        int iIntValue = ((Integer) obj4).intValue();
                                        return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                                }
                            }
                        };
                    } else {
                        List<TabConfiguration> listM49450c13 = m61618e(interfaceC28601c1M87260n).m49450c();
                        String strM49448a14 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                        boolean zM49449b13 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                        zM87157i = c28655q.m87157i(abstractC23864c);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16825r(abstractC23864c, 2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        String str17 = str4;
                        boolean z2119 = z24;
                        Modifier modifier17 = modifier4;
                        boolean z21110 = z19;
                        AbstractC21789d.m61632k(listM49450c13, strM49448a14, zM49449b13, onTabSelected, modifier17, 0.0f, (InterfaceC4339a) objM87133R2, z21110, zM34106k, z2119, str17, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                        modifier3 = modifier17;
                        z17 = z21110;
                        z18 = z2119;
                        str3 = str17;
                        c28655q = c28655q;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q.m87138X();
                modifier3 = modifier2;
                z17 = z14;
                z18 = z15;
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i21112 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i21112) {
                                case 0:
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 24576;
            str2 = str;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i26 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i24 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                c17423d = new C17423d(null, null, false, false, 15, null);
                c28655q.m87150e0(1371609227);
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                C28676v0 c28676v13 = C28635l.f115821a;
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj2 = null;
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext15 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext15, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext15;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R4 = new C23863b(c17423d);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C23863b(c17423d);
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (C23863b) objM87133R4;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                    c28655q.m87173q(false);
                }
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                    strM49448a = null;
                }
                AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i21113 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i21113) {
                                case 0:
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                            }
                        }
                    };
                } else {
                    List<TabConfiguration> listM49450c14 = m61618e(interfaceC28601c1M87260n).m49450c();
                    String strM49448a15 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                    boolean zM49449b14 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                    zM87157i = c28655q.m87157i(abstractC23864c);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C16825r(abstractC23864c, 2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C16825r(abstractC23864c, 2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    String str18 = str4;
                    boolean z21111 = z24;
                    Modifier modifier18 = modifier4;
                    boolean z21112 = z19;
                    AbstractC21789d.m61632k(listM49450c14, strM49448a15, zM49449b14, onTabSelected, modifier18, 0.0f, (InterfaceC4339a) objM87133R2, z21112, zM34106k, z21111, str18, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                    modifier3 = modifier18;
                    z17 = z21112;
                    z18 = z21111;
                    str3 = str18;
                    c28655q = c28655q;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q.m87138X();
            modifier3 = modifier2;
            z17 = z14;
            z18 = z15;
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i21114 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (i21114) {
                            case 0:
                                int iIntValue = ((Integer) obj4).intValue();
                                return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj4).intValue();
                                return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 3072;
        z15 = z13;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                str2 = str;
                if (c28655q.m87153g(str2)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i26 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i24 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                c17423d = new C17423d(null, null, false, false, 15, null);
                c28655q.m87150e0(1371609227);
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                C28676v0 c28676v14 = C28635l.f115821a;
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj2 = null;
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext16 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext16, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext16;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R4 = new C23863b(c17423d);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C23863b(c17423d);
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (C23863b) objM87133R4;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                    c28655q.m87173q(false);
                }
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
                zM34106k = AbstractC12247c.m34106k(c28655q, 0);
                strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                    strM49448a = null;
                }
                AbstractC12247c.m34100e(strM49448a, c28655q, 0);
                if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i21115 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i21115) {
                                case 0:
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                            }
                        }
                    };
                } else {
                    List<TabConfiguration> listM49450c15 = m61618e(interfaceC28601c1M87260n).m49450c();
                    String strM49448a16 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                    boolean zM49449b15 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                    zM87157i = c28655q.m87157i(abstractC23864c);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C16825r(abstractC23864c, 2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C16825r(abstractC23864c, 2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    String str19 = str4;
                    boolean z21113 = z24;
                    Modifier modifier19 = modifier4;
                    boolean z21114 = z19;
                    AbstractC21789d.m61632k(listM49450c15, strM49448a16, zM49449b15, onTabSelected, modifier19, 0.0f, (InterfaceC4339a) objM87133R2, z21114, zM34106k, z21113, str19, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                    modifier3 = modifier19;
                    z17 = z21114;
                    z18 = z21113;
                    str3 = str19;
                    c28655q = c28655q;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q.m87138X();
            modifier3 = modifier2;
            z17 = z14;
            z18 = z15;
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i21116 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (i21116) {
                            case 0:
                                int iIntValue = ((Integer) obj4).intValue();
                                return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj4).intValue();
                                return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 24576;
        str2 = str;
        if ((i15 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            if (i26 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            if (i18 != 0) {
                z24 = false;
            } else {
                z24 = z15;
            }
            if (i24 != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            c17423d = new C17423d(null, null, false, false, 15, null);
            c28655q.m87150e0(1371609227);
            zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
            C28676v0 c28676v15 = C28635l.f115821a;
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj2 = null;
                    obj = null;
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext17 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext17, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext17;
                    zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, new C23863b(c17423d), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c17423d) | c28655q.m87153g(obj);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R4 = new C23863b(c17423d);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C23863b(c17423d);
                        c28655q.m87172p0(objM87133R4);
                    }
                    abstractC23864c = (C23863b) objM87133R4;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c17423d) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c17423d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17422c.class), null, null);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
                c28655q.m87173q(false);
            }
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C17423d(null, null, false, false, 15, null), null, c28655q, 0, 2);
            zM34106k = AbstractC12247c.m34106k(c28655q, 0);
            strM49448a = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
            if (!m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                strM49448a = null;
            }
            AbstractC12247c.m34100e(strM49448a, c28655q, 0);
            if (m61618e(interfaceC28601c1M87260n).getIsVisible()) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i21117 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (i21117) {
                            case 0:
                                int iIntValue = ((Integer) obj4).intValue();
                                return Function1.m61619f(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj4).intValue();
                                return Function1.m61621h(onTabSelected, modifier4, z19, z24, str4, i13, i14, (Composer) obj3, iIntValue2);
                        }
                    }
                };
            } else {
                List<TabConfiguration> listM49450c16 = m61618e(interfaceC28601c1M87260n).m49450c();
                String strM49448a17 = m61618e(interfaceC28601c1M87260n).getSelectedTabId();
                boolean zM49449b16 = m61618e(interfaceC28601c1M87260n).getShowCommunityBadge();
                zM87157i = c28655q.m87157i(abstractC23864c);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C16825r(abstractC23864c, 2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C16825r(abstractC23864c, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                String str110 = str4;
                boolean z21115 = z24;
                Modifier modifier110 = modifier4;
                boolean z21116 = z19;
                AbstractC21789d.m61632k(listM49450c16, strM49448a17, zM49449b16, onTabSelected, modifier110, 0.0f, (InterfaceC4339a) objM87133R2, z21116, zM34106k, z21115, str110, c28655q, ((i15 << 18) & 1879048192) | ((i15 << 9) & 64512) | ((i15 << 15) & 29360128), (i15 >> 12) & 14, 32);
                modifier3 = modifier110;
                z17 = z21116;
                z18 = z21115;
                str3 = str110;
                c28655q = c28655q;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        modifier3 = modifier2;
        z17 = z14;
        z18 = z15;
        str3 = str2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i21118 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: jm0.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj3, Object obj4) {
                    switch (i21118) {
                        case 0:
                            int iIntValue = ((Integer) obj4).intValue();
                            return Function1.m61619f(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj4).intValue();
                            return Function1.m61621h(onTabSelected, modifier3, z17, z18, str3, i13, i14, (Composer) obj3, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: renamed from: e */
    private static final C17423d m61618e(InterfaceC28670t2 interfaceC28670t2) {
        return (C17423d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m61619f(p715kotlin.jvm.functions.Function1 function1, Modifier modifier, boolean z4, boolean z13, String str, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m61617d(function1, modifier, z4, z13, str, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m61620g(AbstractC23864c abstractC23864c) {
        abstractC23864c.mo1216g(InterfaceC17420a.a.f67511a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m61621h(p715kotlin.jvm.functions.Function1 function1, Modifier modifier, boolean z4, boolean z13, String str, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m61617d(function1, modifier, z4, z13, str, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

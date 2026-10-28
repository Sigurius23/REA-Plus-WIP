package yk2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import c93.InterfaceC4354p;
import com.whoop.profile.view.C9814j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.WeakHashMap;
import l83.C23454a0;
import my0.C26030a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C39916z;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.C22944c2;
import p291l0.C22949e;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import tk2.InterfaceC33899q;
import w41.AbstractC36800a;
import w41.AbstractC36811k;
import w41.AbstractC36824x;
import w41.AbstractC36826z;
import w41.C36806f;
import w41.C36823w;
import wb3.AbstractC37056f;
import x81.C38072d;
import zk2.AbstractC40862w;

/* JADX INFO: renamed from: yk2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001aE\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0010\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u001a\u0010&\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006'"}, m65681d2 = {"Ltk2/q;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Ly3/f;", "horizontalBleed", "statusBarTop", "Lw41/f;", "mapController", "navigationBarsBottom", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ltk2/q;Landroidx/compose/ui/Modifier;FFLw41/f;FLandroidx/compose/runtime/Composer;II)V", "Ltk2/q$b;", "e", "(Ltk2/q$b;Landroidx/compose/ui/Modifier;FLw41/f;Landroidx/compose/runtime/Composer;II)V", "m", "(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;", "Ly81/f;", "backgroundColor", "topBleed", "j", "(Ly81/f;FFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "navigationBarBottom", "Lw41/x$a;", "l", "(FF)Lw41/x$a;", "Lw41/w;", "a", "Lw41/w;", "defaultUserLocation", "b", "F", "getTrackSessionMapTopOverlayHeight", "()F", "trackSessionMapTopOverlayHeight", "c", "getTrackSessionMapBottomOverlayHeight", "trackSessionMapBottomOverlayHeight", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39614n {

    /* JADX INFO: renamed from: a */
    private static final C36823w f170397a = new C36823w(42.3601d, -71.0589d);

    /* JADX INFO: renamed from: b */
    private static final float f170398b;

    /* JADX INFO: renamed from: c */
    private static final float f170399c;

    static {
        float f13 = 8;
        f170398b = 14 * f13;
        f170399c = 25 * f13;
    }

    /* JADX INFO: renamed from: e */
    private static final void m126576e(InterfaceC33899q.b bVar, Modifier modifier, float f13, C36806f c36806f, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C36806f c36806f2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-502143361);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(bVar) : c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(c36806f) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            if (i17 != 0) {
                c36806f = null;
            }
            C36806f c36806f3 = c36806f;
            AbstractC28683x.m87247a(AbstractC36811k.m117986M().mo86977a("[\n  {\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#212426\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#565A5C\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#212426\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative.land_parcel\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative.neighborhood\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#505456\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#2C3032\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#5A5E60\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.local\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#292D2F\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.arterial\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#323638\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#363B3D\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"labels\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway.controlled_access\",\n    \"elementType\": \"labels\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#171B1D\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#484C4E\"\n      }\n    ]\n  }\n]"), AbstractC37817c.m121344e(1024289215, c28655q, new C39916z(bVar, f13, modifier3, c36806f3, 2)), c28655q, 56);
            modifier2 = modifier3;
            c36806f2 = c36806f3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            c36806f2 = c36806f;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9814j(bVar, modifier2, f13, c36806f2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m126577f(InterfaceC33899q.b bVar, float f13, Modifier modifier, C36806f c36806f, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC36826z mapState = bVar.getMapState();
            if (mapState != null) {
                c28655q.m87150e0(-1142540703);
                if (mapState instanceof AbstractC36826z.a) {
                    c28655q.m87150e0(-1142476998);
                    WeakHashMap weakHashMap = C22944c2.f90553v;
                    mapState = AbstractC36826z.a.m118052b((AbstractC36826z.a) mapState, null, null, false, m126583l(f13, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a()), 7, null);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1142092133);
                    c28655q.m87173q(false);
                }
                AbstractC36811k.m117998l(mapState, modifier, true, c36806f, false, c28655q, AbstractC36826z.f157519a | 24960, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1141789604);
                InterfaceC4354p interfaceC4354p = (InterfaceC4354p) c28655q.m87161k(AbstractC36800a.m117934n());
                C36823w userLocation = bVar.getUserLocation();
                if (userLocation == null) {
                    userLocation = f170397a;
                }
                interfaceC4354p.invoke(modifier, userLocation, Boolean.FALSE, C39601a.f170353a.m126492b(), c28655q, Integer.valueOf((C36823w.f157507c << 3) | 3456));
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m126578g(InterfaceC33899q.b bVar, Modifier modifier, float f13, C36806f c36806f, int i13, int i14, Composer composer, int i15) {
        m126576e(bVar, modifier, f13, c36806f, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:77:0x010d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0119  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m126579h(InterfaceC33899q state, Modifier modifier, float f13, float f14, C36806f c36806f, float f15, Composer composer, int i13, int i14) {
        int i15;
        C36806f c36806f2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier2;
        C36806f c36806f3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        Modifier modifier4;
        int i16;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(854530952);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(state) : c28655q2.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87147d(f13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87147d(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i14 & 16;
        if (i18 == 0) {
            if ((i13 & 24576) == 0) {
                c36806f2 = c36806f;
                i15 |= c28655q2.m87153g(c36806f2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i13) == 0) {
                if (c28655q2.m87147d(f15)) {
                    i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i16;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i18 != 0) {
                    c36806f2 = null;
                } else {
                    c36806f2 = c36806f2;
                }
                if (state instanceof InterfaceC33899q.b) {
                    c28655q2.m87150e0(865501539);
                    int i19 = i15 & 14;
                    int i24 = i15 >> 3;
                    m126576e((InterfaceC33899q.b) state, m126584m(modifier3, f13, f14, f15), f14, c36806f2, c28655q2, i19 | (i24 & 896) | (i24 & 7168), 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    modifier4 = modifier3;
                } else {
                    c28655q = c28655q2;
                    if (state instanceof InterfaceC33899q.a) {
                        throw AbstractC11895b.m32003v(865499875, c28655q, false);
                    }
                    c28655q.m87150e0(1061183236);
                    modifier4 = modifier3;
                    m126581j(((InterfaceC33899q.a) state).getBackgroundColor(), f13, f14, modifier4, c28655q, ((i15 >> 3) & MessageListItemViewType.GIPHY) | ((i15 << 6) & 7168), 0);
                    c28655q.m87173q(false);
                }
                modifier2 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
            }
            c36806f3 = c36806f2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C26030a(state, modifier2, f13, f14, c36806f3, f15, i13, i14);
            }
        }
        i15 |= 24576;
        c36806f2 = c36806f;
        if ((196608 & i13) == 0) {
            if (c28655q2.m87147d(f15)) {
                i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i16;
        }
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier;
            }
            if (i18 != 0) {
                c36806f2 = null;
            } else {
                c36806f2 = c36806f2;
            }
            if (state instanceof InterfaceC33899q.b) {
                c28655q2.m87150e0(865501539);
                int i110 = i15 & 14;
                int i25 = i15 >> 3;
                m126576e((InterfaceC33899q.b) state, m126584m(modifier3, f13, f14, f15), f14, c36806f2, c28655q2, i110 | (i25 & 896) | (i25 & 7168), 0);
                c28655q = c28655q2;
                c28655q.m87173q(false);
                modifier4 = modifier3;
            } else {
                c28655q = c28655q2;
                if (state instanceof InterfaceC33899q.a) {
                    throw AbstractC11895b.m32003v(865499875, c28655q, false);
                }
                c28655q.m87150e0(1061183236);
                modifier4 = modifier3;
                m126581j(((InterfaceC33899q.a) state).getBackgroundColor(), f13, f14, modifier4, c28655q, ((i15 >> 3) & MessageListItemViewType.GIPHY) | ((i15 << 6) & 7168), 0);
                c28655q.m87173q(false);
            }
            modifier2 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
        }
        c36806f3 = c36806f2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26030a(state, modifier2, f13, f14, c36806f3, f15, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m126580i(InterfaceC33899q interfaceC33899q, Modifier modifier, float f13, float f14, C36806f c36806f, float f15, int i13, int i14, Composer composer, int i15) {
        m126579h(interfaceC33899q, modifier, f13, f14, c36806f, f15, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    private static final void m126581j(final EnumC39333f enumC39333f, final float f13, final float f14, Modifier modifier, Composer composer, final int i13, final int i14) {
        int i15;
        float f15;
        float f16;
        Modifier modifier2;
        boolean z4;
        final Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-805019094);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(enumC39333f.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            f15 = f13;
            i15 |= c28655q.m87147d(f15) ? 32 : 16;
        } else {
            f15 = f13;
        }
        if ((i13 & 384) == 0) {
            f16 = f14;
            i15 |= c28655q.m87147d(f16) ? 256 : 128;
        } else {
            f16 = f14;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC40862w.m132444k(modifier2, f15, f16, 0.0f, 4, null), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC40862w.m132439f(enumC39333f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x), c28655q, i15 & 14, 0);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: yk2.m
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC39614n.m126582k(enumC39333f, f13, f14, modifier3, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC40862w.m132444k(modifier2, f15, f16, 0.0f, 4, null), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC40862w.m132439f(enumC39333f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x), c28655q, i15 & 14, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: yk2.m
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC39614n.m126582k(enumC39333f, f13, f14, modifier3, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m126582k(EnumC39333f enumC39333f, float f13, float f14, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m126581j(enumC39333f, f13, f14, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final AbstractC36824x.a m126583l(float f13, float f14) {
        float f15 = 8;
        return new AbstractC36824x.a(2 * f15, f13 + f170398b, 0 * f15, f14 + f170399c, null);
    }

    /* JADX INFO: renamed from: m */
    public static final Modifier m126584m(Modifier trackSessionMapLayerBleed, float f13, float f14, float f15) {
        AbstractC22676k.m65750j(trackSessionMapLayerBleed, "$this$trackSessionMapLayerBleed");
        return AbstractC1102d.m3407d(1.0f, AbstractC40862w.m132443j(trackSessionMapLayerBleed, f13, f14, f15));
    }
}

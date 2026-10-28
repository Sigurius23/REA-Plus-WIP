package c41;

import a11.C0129g;
import a11.C0132j;
import a11.C0134l;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b11.C2275b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15673b0;
import hg3.AbstractC17269i;
import i91.AbstractC18247a;
import i91.C18250d;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy0.AbstractC21027b;
import jy0.AbstractC22046b;
import ky0.AbstractC22890b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22961h;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import rz0.C31922a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "Lc41/o;", "pillState", "Lc41/x;", "type", "Lcom/whoop/navigation/ActivityDetailType;", "activityDetailType", "", "isEmpty", "Lc41/g2;", "actionState", "Lcom/whoop/navigation/e;", "destination", "Lkotlin/Function1;", "", "Ll83/a0;", "onClickEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;ZLc41/g2;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Li2/x;", "n", "(ZLcom/whoop/navigation/ActivityDetailType;Landroidx/compose/runtime/Composer;I)J", "onButtonClick", "o", "(Lc41/x;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Li91/a;", "r", "()Li91/a;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4075n {

    /* JADX INFO: renamed from: c41.n$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16552a;

        static {
            int[] iArr = new int[ActivityDetailType.values().length];
            try {
                iArr[ActivityDetailType.CARDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityDetailType.WEIGHTLIFTING_MSK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityDetailType.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivityDetailType.RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16552a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013a  */
    /* JADX WARN: Code duplicated, block: B:102:0x015b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0166  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0095 A[PHI: r13
      0x0095: PHI (r13v17 int) = (r13v0 int), (r13v6 int), (r13v7 int) binds: [B:49:0x0093, B:59:0x00ad, B:58:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    /* JADX INFO: renamed from: h */
    public static final void m12503h(final TextResource title, final C4082o pillState, final AbstractC4145x type, ActivityDetailType activityDetailType, boolean z4, EnumC4029g2 enumC4029g2, C9598e c9598e, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        int i17;
        boolean zM87157i;
        int i18;
        Function1 function2;
        int i19;
        boolean z14;
        C28655q c28655q;
        ActivityDetailType activityDetailType2;
        EnumC4029g2 enumC4029g3;
        C9598e c9598e2;
        boolean z15;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        ActivityDetailType activityDetailType3;
        final boolean z16;
        EnumC4029g2 enumC4029g4;
        C9598e c9598e3;
        Function1 function4;
        int i24;
        C13825t c13825t;
        C31922a c31922a;
        Object objM87133R;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(pillState, "pillState");
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1737461071);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(pillState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(type) ? 256 : 128;
        }
        int i25 = i14 & 8;
        if (i25 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87149e(activityDetailType == null ? -1 : activityDetailType.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i26 = i14 & 16;
        if (i26 == 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 64;
            i17 = 1572864;
            if (i16 == 0) {
                i15 |= i17;
            } else if ((1572864 & i13) == 0) {
                if ((2097152 & i13) == 0) {
                    zM87157i = c28655q2.m87153g(c9598e);
                } else {
                    zM87157i = c28655q2.m87157i(c9598e);
                }
                if (zM87157i) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            i18 = i14 & 128;
            if (i18 != 0) {
                if ((12582912 & i13) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i15 |= i19;
                }
                if ((4727955 & i15) != 4727954) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    if (i25 != 0) {
                        activityDetailType3 = ActivityDetailType.CARDIO;
                    } else {
                        activityDetailType3 = activityDetailType;
                    }
                    if (i26 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i14 & 32) != 0) {
                        enumC4029g4 = EnumC4029g2.NORMAL;
                    } else {
                        enumC4029g4 = enumC4029g2;
                    }
                    int i27 = i15;
                    if (i16 != 0) {
                        c9598e3 = null;
                    } else {
                        c9598e3 = c9598e;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C0129g(17);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    int i28 = (i27 >> 12) & 14;
                    i24 = (i27 >> 6) & 112;
                    long jM51541c = C17919x.m51541c(0.1f, m12509n(z16, activityDetailType3, c28655q2, i28 | i24));
                    if (z16) {
                        c28655q2.m87150e0(-2051323722);
                        C13825t c13825tM48880a = AbstractC17269i.m48880a(((float) 0.25d) * 4, m12509n(true, activityDetailType3, c28655q2, i24 | 6));
                        c28655q2.m87173q(false);
                        c13825t = c13825tM48880a;
                    } else {
                        c28655q2.m87150e0(-2051362379);
                        c28655q2.m87173q(false);
                        c13825t = null;
                    }
                    if (z16) {
                        c31922a = new C31922a(0.0f, 0.0f, 3, null);
                    } else {
                        c31922a = null;
                    }
                    final C9598e c9598e4 = c9598e3;
                    final Function1 function5 = function4;
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(null, null, jM51541c, null, c13825t, c31922a, 0.0f, AbstractC37817c.m121344e(-781800895, c28655q2, new InterfaceC4351m() { // from class: c41.k
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4075n.m12505j(type, c9598e4, function5, z16, pillState, title, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 12582912, 75);
                    c9598e2 = c9598e4;
                    z15 = z16;
                    enumC4029g3 = enumC4029g4;
                    activityDetailType2 = activityDetailType3;
                    function3 = function5;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    activityDetailType2 = activityDetailType;
                    enumC4029g3 = enumC4029g2;
                    c9598e2 = c9598e;
                    z15 = z13;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4061l(title, pillState, type, activityDetailType2, z15, enumC4029g3, c9598e2, function3, i13, i14);
                }
            }
            i15 |= 12582912;
            function2 = function1;
            if ((4727955 & i15) != 4727954) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i25 != 0) {
                    activityDetailType3 = ActivityDetailType.CARDIO;
                } else {
                    activityDetailType3 = activityDetailType;
                }
                if (i26 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i14 & 32) != 0) {
                    enumC4029g4 = EnumC4029g2.NORMAL;
                } else {
                    enumC4029g4 = enumC4029g2;
                }
                int i29 = i15;
                if (i16 != 0) {
                    c9598e3 = null;
                } else {
                    c9598e3 = c9598e;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C0129g(17);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                int i210 = (i29 >> 12) & 14;
                i24 = (i29 >> 6) & 112;
                long jM51541c2 = C17919x.m51541c(0.1f, m12509n(z16, activityDetailType3, c28655q2, i210 | i24));
                if (z16) {
                    c28655q2.m87150e0(-2051362379);
                    c28655q2.m87173q(false);
                    c13825t = null;
                } else {
                    c28655q2.m87150e0(-2051323722);
                    C13825t c13825tM48880a2 = AbstractC17269i.m48880a(((float) 0.25d) * 4, m12509n(true, activityDetailType3, c28655q2, i24 | 6));
                    c28655q2.m87173q(false);
                    c13825t = c13825tM48880a2;
                }
                if (z16) {
                    c31922a = new C31922a(0.0f, 0.0f, 3, null);
                } else {
                    c31922a = null;
                }
                final C9598e c9598e5 = c9598e3;
                final Function1 function6 = function4;
                c28655q = c28655q2;
                AbstractC31926e.m99375j(null, null, jM51541c2, null, c13825t, c31922a, 0.0f, AbstractC37817c.m121344e(-781800895, c28655q2, new InterfaceC4351m() { // from class: c41.k
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4075n.m12505j(type, c9598e5, function6, z16, pillState, title, (Composer) obj, iIntValue);
                    }
                }), c28655q, 12582912, 75);
                c9598e2 = c9598e5;
                z15 = z16;
                enumC4029g3 = enumC4029g4;
                activityDetailType2 = activityDetailType3;
                function3 = function6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                activityDetailType2 = activityDetailType;
                enumC4029g3 = enumC4029g2;
                c9598e2 = c9598e;
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4061l(title, pillState, type, activityDetailType2, z15, enumC4029g3, c9598e2, function3, i13, i14);
            }
        }
        i15 |= 24576;
        z13 = z4;
        i16 = i14 & 64;
        i17 = 1572864;
        if (i16 == 0) {
            i15 |= i17;
        } else if ((1572864 & i13) == 0) {
            if ((2097152 & i13) == 0) {
                zM87157i = c28655q2.m87153g(c9598e);
            } else {
                zM87157i = c28655q2.m87157i(c9598e);
            }
            if (zM87157i) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i15 |= i17;
        }
        i18 = i14 & 128;
        if (i18 != 0) {
            if ((12582912 & i13) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i15 |= i19;
            }
            if ((4727955 & i15) != 4727954) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i25 != 0) {
                    activityDetailType3 = ActivityDetailType.CARDIO;
                } else {
                    activityDetailType3 = activityDetailType;
                }
                if (i26 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i14 & 32) != 0) {
                    enumC4029g4 = EnumC4029g2.NORMAL;
                } else {
                    enumC4029g4 = enumC4029g2;
                }
                int i211 = i15;
                if (i16 != 0) {
                    c9598e3 = null;
                } else {
                    c9598e3 = c9598e;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C0129g(17);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                int i212 = (i211 >> 12) & 14;
                i24 = (i211 >> 6) & 112;
                long jM51541c3 = C17919x.m51541c(0.1f, m12509n(z16, activityDetailType3, c28655q2, i212 | i24));
                if (z16) {
                    c28655q2.m87150e0(-2051362379);
                    c28655q2.m87173q(false);
                    c13825t = null;
                } else {
                    c28655q2.m87150e0(-2051323722);
                    C13825t c13825tM48880a3 = AbstractC17269i.m48880a(((float) 0.25d) * 4, m12509n(true, activityDetailType3, c28655q2, i24 | 6));
                    c28655q2.m87173q(false);
                    c13825t = c13825tM48880a3;
                }
                if (z16) {
                    c31922a = new C31922a(0.0f, 0.0f, 3, null);
                } else {
                    c31922a = null;
                }
                final C9598e c9598e6 = c9598e3;
                final Function1 function7 = function4;
                c28655q = c28655q2;
                AbstractC31926e.m99375j(null, null, jM51541c3, null, c13825t, c31922a, 0.0f, AbstractC37817c.m121344e(-781800895, c28655q2, new InterfaceC4351m() { // from class: c41.k
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4075n.m12505j(type, c9598e6, function7, z16, pillState, title, (Composer) obj, iIntValue);
                    }
                }), c28655q, 12582912, 75);
                c9598e2 = c9598e6;
                z15 = z16;
                enumC4029g3 = enumC4029g4;
                activityDetailType2 = activityDetailType3;
                function3 = function7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                activityDetailType2 = activityDetailType;
                enumC4029g3 = enumC4029g2;
                c9598e2 = c9598e;
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4061l(title, pillState, type, activityDetailType2, z15, enumC4029g3, c9598e2, function3, i13, i14);
            }
        }
        i15 |= 12582912;
        function2 = function1;
        if ((4727955 & i15) != 4727954) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i25 != 0) {
                activityDetailType3 = ActivityDetailType.CARDIO;
            } else {
                activityDetailType3 = activityDetailType;
            }
            if (i26 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if ((i14 & 32) != 0) {
                enumC4029g4 = EnumC4029g2.NORMAL;
            } else {
                enumC4029g4 = enumC4029g2;
            }
            int i213 = i15;
            if (i16 != 0) {
                c9598e3 = null;
            } else {
                c9598e3 = c9598e;
            }
            if (i18 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C0129g(17);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            int i214 = (i213 >> 12) & 14;
            i24 = (i213 >> 6) & 112;
            long jM51541c4 = C17919x.m51541c(0.1f, m12509n(z16, activityDetailType3, c28655q2, i214 | i24));
            if (z16) {
                c28655q2.m87150e0(-2051362379);
                c28655q2.m87173q(false);
                c13825t = null;
            } else {
                c28655q2.m87150e0(-2051323722);
                C13825t c13825tM48880a4 = AbstractC17269i.m48880a(((float) 0.25d) * 4, m12509n(true, activityDetailType3, c28655q2, i24 | 6));
                c28655q2.m87173q(false);
                c13825t = c13825tM48880a4;
            }
            if (z16) {
                c31922a = new C31922a(0.0f, 0.0f, 3, null);
            } else {
                c31922a = null;
            }
            final C9598e c9598e7 = c9598e3;
            final Function1 function8 = function4;
            c28655q = c28655q2;
            AbstractC31926e.m99375j(null, null, jM51541c4, null, c13825t, c31922a, 0.0f, AbstractC37817c.m121344e(-781800895, c28655q2, new InterfaceC4351m() { // from class: c41.k
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC4075n.m12505j(type, c9598e7, function8, z16, pillState, title, (Composer) obj, iIntValue);
                }
            }), c28655q, 12582912, 75);
            c9598e2 = c9598e7;
            z15 = z16;
            enumC4029g3 = enumC4029g4;
            activityDetailType2 = activityDetailType3;
            function3 = function8;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            activityDetailType2 = activityDetailType;
            enumC4029g3 = enumC4029g2;
            c9598e2 = c9598e;
            z15 = z13;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4061l(title, pillState, type, activityDetailType2, z15, enumC4029g3, c9598e2, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m12504i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m12505j(AbstractC4145x abstractC4145x, C9598e c9598e, Function1 function1, boolean z4, C4082o c4082o, TextResource textResource, Composer composer, int i13) {
        int i14;
        long jMo134584toComposableColorWaAFU9c;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87153g = c28655q.m87153g(abstractC4145x) | c28655q.m87157i(c9598e) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C4068m(abstractC4145x, c9598e, function1, 0);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f13 = 8;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(1 * f13, modifierM3362g));
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            float f14 = 4;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(f14, f14, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            boolean zM12534e = c4082o.getIsEmpty();
            if (z4) {
                c28655q.m87150e0(-1535130480);
                i14 = 0;
                jMo134584toComposableColorWaAFU9c = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            } else {
                i14 = 0;
                c28655q.m87150e0(-1535051492);
                jMo134584toComposableColorWaAFU9c = c4082o.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                c28655q.m87173q(false);
            }
            int i15 = i14;
            AbstractC22046b.m63097b(zM12534e, z4, null, jMo134584toComposableColorWaAFU9c, c4082o.getIcon(), c4082o.getSecondaryText(), c4082o.getSecondaryIcon(), c28655q, 0, 4);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i15);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, layoutWeightElement2, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196600);
            c28655q.m87173q(true);
            if (z4) {
                z13 = true;
                c28655q.m87150e0(82066845);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(81842932);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 2 * f13, 0.0f, 0.0f, 0.0f, 14);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                boolean zM87153g2 = c28655q.m87153g(function1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C2275b(function1, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                m12510o(abstractC4145x, (Function1) objM87133R2, c28655q, 0);
                z13 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m12506k(AbstractC4145x abstractC4145x, C9598e c9598e, Function1 function1) {
        if (abstractC4145x.getClickable()) {
            if (c9598e != null) {
                function1.invoke(c9598e);
            } else {
                function1.invoke(EnumC4033h.TILE);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m12507l(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(EnumC4033h.BUTTON);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m12508m(TextResource textResource, C4082o c4082o, AbstractC4145x abstractC4145x, ActivityDetailType activityDetailType, boolean z4, EnumC4029g2 enumC4029g2, C9598e c9598e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12503h(textResource, c4082o, abstractC4145x, activityDetailType, z4, enumC4029g2, c9598e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final long m12509n(boolean z4, ActivityDetailType activityDetailType, Composer composer, int i13) {
        long strain;
        if (!z4) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(906826045);
            return AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(906511023);
        int i14 = a.f16552a[activityDetailType.ordinal()];
        if (i14 == 1) {
            c28655q2.m87150e0(29244767);
            strain = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
            c28655q2.m87173q(false);
        } else if (i14 == 2) {
            c28655q2.m87150e0(29247231);
            strain = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
            c28655q2.m87173q(false);
        } else if (i14 == 3) {
            c28655q2.m87150e0(29249310);
            strain = C38072d.f163053a.m121949b(c28655q2, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
            c28655q2.m87173q(false);
        } else {
            if (i14 != 4) {
                throw AbstractC11895b.m32003v(29242291, c28655q2, false);
            }
            c28655q2.m87150e0(29251457);
            strain = C38072d.f163053a.m121949b(c28655q2, 6).getRecovery();
            c28655q2.m87173q(false);
        }
        c28655q2.m87173q(false);
        return strain;
    }

    /* JADX INFO: renamed from: o */
    private static final void m12510o(AbstractC4145x abstractC4145x, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1862622361);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC4145x) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (abstractC4145x instanceof AbstractC4145x.a) {
            c28655q.m87150e0(1021278204);
            AbstractC4145x.a aVar = (AbstractC4145x.a) abstractC4145x;
            int i15 = i14;
            TextResource textResourceM12895e = aVar.getText();
            AbstractC18247a abstractC18247aM12892b = aVar.getBackground();
            boolean z4 = ((i15 & 112) == 32) | ((i15 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C0134l(8, function1, aVar);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21027b.m58696c(textResourceM12895e, abstractC18247aM12892b, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
            c28655q.m87173q(false);
        } else if (abstractC4145x instanceof AbstractC4145x.b) {
            c28655q.m87150e0(1021283393);
            String strM21274h = AbstractC8693b.m21274h(((AbstractC4145x.b) abstractC4145x).getText(), c28655q, 0);
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, ((float) 1.5d) * 8, 0.0f, 11);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN9(), null, c28655q, 48, 0, 196600);
            c28655q = c28655q;
            c28655q.m87173q(false);
        } else {
            if (!(abstractC4145x instanceof AbstractC4145x.c)) {
                throw AbstractC11895b.m32003v(1021276945, c28655q, false);
            }
            c28655q.m87150e0(1021291823);
            AbstractC4145x.c cVar = (AbstractC4145x.c) abstractC4145x;
            AbstractC22890b.m66525e(cVar.getEndTime(), cVar.getStartTime(), cVar.getRangeColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
            c28655q = c28655q;
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(abstractC4145x, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m12511p(Function1 function1, AbstractC4145x abstractC4145x) {
        function1.invoke(((AbstractC4145x.a) abstractC4145x).getClickEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m12512q(AbstractC4145x abstractC4145x, Function1 function1, int i13, Composer composer, int i14) {
        m12510o(abstractC4145x, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final AbstractC18247a m12513r() {
        return new C18250d(p712j91.Function1.m60318a(AbstractC15673b0.m44000O()), 0.0f, 2, null);
    }
}

package c11;

import am2.C1012d;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import ar2.C1935f;
import aw0.C2108h;
import b30.C2476a1;
import b91.C2886a;
import bs1.C3595n;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d11.AbstractC11471f;
import d11.C11474i;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import i91.AbstractC18249c;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27246d;
import ny0.C27256h;
import p000.AbstractC11266d;
import p000.C21061j;
import p000.C22931l;
import p003a1.C0111j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.C3733d1;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import p91.AbstractC29011e;
import p91.C29007a;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c11.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aM\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0010\u001a\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0012\u001a9\u0010\u001c\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010$\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020#H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0017\u0010+\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b+\u0010*\u001a\u0017\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b-\u0010.\"\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101\"\u0014\u00106\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101\"\u0014\u00108\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101\"\u0014\u0010:\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00101¨\u0006=²\u0006\u000e\u0010\f\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010;\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020(8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lc11/p;", "viewState", "", "showDivider", "Lkotlin/Function1;", "Ll83/a0;", "onExpanded", "", "onViewEvent", "v", "(Lc11/p;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lc11/i;", "isExpanded", "G", "(Lc11/i;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "R", "(Lc11/i;Landroidx/compose/runtime/Composer;I)V", "V", "(Lc11/i;ZLandroidx/compose/runtime/Composer;I)V", "T", "a0", "P", "J", "", "Lm91/u;", "expandedItems", "Lm91/p;", "factory", "L", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lm91/p;Landroidx/compose/runtime/Composer;I)V", "Lc11/m;", "style", "Ly81/e;", "d0", "(Lc11/m;)Ly81/e;", "Lc11/n;", "h0", "(Lc11/n;)Ly81/e;", "", "percentage", "", "g0", "(D)F", "f0", "Lb2/k;", "e0", "(D)Lb2/k;", "Ly3/f;", "a", "F", "topIndicatorIconOffsetY", "b", "bottomIndicatorIconOffsetY", "c", "bottomIndicatorIconOffsetYClosed", "d", "barPadding", "e", "impactTextWidth", "rotationAngle", "backgroundAlpha", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3841h {

    /* JADX INFO: renamed from: a */
    private static final float f15716a = 5;

    /* JADX INFO: renamed from: b */
    private static final float f15717b = -1;

    /* JADX INFO: renamed from: c */
    private static final float f15718c = -18;

    /* JADX INFO: renamed from: d */
    private static final float f15719d = 16;

    /* JADX INFO: renamed from: e */
    private static final float f15720e = 50;

    /* JADX INFO: renamed from: c11.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15721a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f15722b;

        static {
            int[] iArr = new int[EnumC3846m.values().length];
            try {
                iArr[EnumC3846m.YOUNGER_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3846m.YOUNGER_3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3846m.YOUNGER_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3846m.YOUNGER_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3846m.NEUTRAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3846m.OLDER_1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3846m.OLDER_2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC3846m.OLDER_3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC3846m.OLDER_4.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC3846m.DISABLED_0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC3846m.DISABLED_1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC3846m.DISABLED_2.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC3846m.DISABLED_3.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC3846m.DISABLED_4.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f15721a = iArr;
            int[] iArr2 = new int[EnumC3847n.values().length];
            try {
                iArr2[EnumC3847n.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EnumC3847n.OLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EnumC3847n.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EnumC3847n.YOUNGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            f15722b = iArr2;
        }
    }

    /* JADX INFO: renamed from: c11.h$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f15723w = new b();

        /* JADX INFO: renamed from: a */
        public final long m11755a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11755a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f15724w = new c();

        /* JADX INFO: renamed from: a */
        public final long m11756a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11756a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f15725w = new d();

        /* JADX INFO: renamed from: a */
        public final long m11757a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11757a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f15726w = new e();

        /* JADX INFO: renamed from: a */
        public final long m11758a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11758a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f15727w = new f();

        /* JADX INFO: renamed from: a */
        public final long m11759a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11759a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f15728w = new g();

        /* JADX INFO: renamed from: a */
        public final long m11760a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11760a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f15729w = new h();

        /* JADX INFO: renamed from: a */
        public final long m11761a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.7f, whoopColor.getAccentPositiveTrend());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11761a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f15730w = new i();

        /* JADX INFO: renamed from: a */
        public final long m11762a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.5f, whoopColor.getAccentPositiveTrend());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11762a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f15731w = new j();

        /* JADX INFO: renamed from: a */
        public final long m11763a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.3f, whoopColor.getAccentPositiveTrend());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11763a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f15732w = new k();

        /* JADX INFO: renamed from: a */
        public final long m11764a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11764a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f15733w = new l();

        /* JADX INFO: renamed from: a */
        public final long m11765a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.3f, whoopColor.getAccentNegativeTrend());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11765a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f15734w = new m();

        /* JADX INFO: renamed from: a */
        public final long m11766a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.5f, whoopColor.getAccentNegativeTrend());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11766a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f15735w = new n();

        /* JADX INFO: renamed from: a */
        public final long m11767a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.7f, whoopColor.getAccentNegativeTrend());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11767a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f15736w = new o();

        /* JADX INFO: renamed from: a */
        public final long m11768a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11768a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f15737w = new p();

        /* JADX INFO: renamed from: a */
        public final long m11769a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11769a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f15738w = new q();

        /* JADX INFO: renamed from: a */
        public final long m11770a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11770a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f15739w = new r();

        /* JADX INFO: renamed from: a */
        public final long m11771a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11771a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c11.h$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f15740w = new s();

        /* JADX INFO: renamed from: a */
        public final long m11772a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11772a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: A */
    private static final boolean m11695A(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: B */
    private static final void m11696B(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: C */
    private static final float m11697C(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: D */
    private static final float m11698D(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m11699E(Function1 function1, Function1 function2, String str, InterfaceC28601c1 interfaceC28601c1) {
        m11696B(interfaceC28601c1, !m11695A(interfaceC28601c1));
        function1.invoke(Boolean.valueOf(m11695A(interfaceC28601c1)));
        function2.invoke(new AbstractC3834a.a(str, m11695A(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m11700F(long j7, InterfaceC28670t2 interfaceC28670t2, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63383i0(drawBehind, j7, 0L, 0L, m11698D(interfaceC28670t2), null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0140  */
    /* JADX WARN: Code duplicated, block: B:62:0x015b  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0190  */
    /* JADX WARN: Code duplicated, block: B:70:0x0194  */
    /* JADX WARN: Code duplicated, block: B:75:0x01af  */
    /* JADX INFO: renamed from: G */
    public static final void m11701G(C3842i viewState, boolean z4, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        int i15;
        int iHashCode;
        int iHashCode2;
        boolean z13;
        int iHashCode3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(330550475);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = z4 ? 12 : 15;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            if (c28655q.f115903S) {
                i15 = i14;
            } else {
                i15 = i14;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f15719d, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z13 = false;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                int i16 = i15 & 14;
                int i17 = i15 & 126;
                m11722a0(viewState, z4, c28655q, i17);
                m11714T(viewState, c28655q, i16);
                m11716V(viewState, z4, c28655q, i17);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(8, c2314t));
                m11712R(viewState, c28655q, i16);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                m11704J(viewState, z4, c28655q, i17);
                if (z4 && !viewState.m11774b().isEmpty()) {
                    z13 = true;
                }
                function1 = onViewEvent;
                AbstractC1090b.m3350e(C23016z.f90757a, z13, null, null, null, null, AbstractC37817c.m121344e(1373055897, c28655q, new C22931l(9, viewState, function1)), c28655q, 1572870, 30);
                c28655q.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f15719d, 0.0f, 2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N6);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            z13 = false;
            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N7);
            int i18 = i15 & 14;
            int i19 = i15 & 126;
            m11722a0(viewState, z4, c28655q, i19);
            m11714T(viewState, c28655q, i18);
            m11716V(viewState, z4, c28655q, i19);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(8, c2314t));
            m11712R(viewState, c28655q, i18);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            m11704J(viewState, z4, c28655q, i19);
            if (z4) {
                z13 = true;
            }
            function1 = onViewEvent;
            AbstractC1090b.m3350e(C23016z.f90757a, z13, null, null, null, null, AbstractC37817c.m121344e(1373055897, c28655q, new C22931l(9, viewState, function1)), c28655q, 1572870, 30);
            c28655q.m87173q(true);
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(viewState, z4, function1, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m11702H(C3842i c3842i, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(16, C2314t.f9131w));
        m11706L(c3842i.m11774b(), function1, c3842i.getFactory(), composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m11703I(C3842i c3842i, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m11701G(c3842i, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX INFO: renamed from: J */
    public static final void m11704J(C3842i viewState, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        boolean z13;
        C28655q c28655q2;
        C2314t c2314t;
        ?? r10;
        int i15;
        C28655q c28655q3;
        C38072d c38072d;
        C28655q c28655q4;
        C28655q c28655q5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q6 = (C28655q) composer;
        c28655q6.m87154g0(2018001827);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q6.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q6.m87155h(z4) ? 32 : 16;
        }
        if (c28655q6.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C3835b c3835bM11785a = AbstractC3843j.m11785a(viewState.getExpandedBottomRangeValue().getStyle(), c28655q6, 0);
            float f13 = ((C39174f) AbstractC11352g.m30587a(z4 ? f15717b : f15718c, null, null, c28655q6, 0, 14).getValue()).f168413w;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3392n(c2314t2, 0.0f, f13, 1));
            float f14 = f15719d;
            float f15 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3409f, f14, 0.0f, f14 + f15720e + f15, 0.0f, 10);
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q6, 0);
            int iHashCode = Long.hashCode(c28655q6.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q6.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q6, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q6.m87158i0();
            if (c28655q6.f115903S) {
                c28655q6.m87163l(interfaceC4339a);
            } else {
                c28655q6.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q6, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N);
            Modifier modifierM88149j = AbstractC29011e.m88149j(c2314t2, (float) viewState.getExpandedBottomRangeValue().getValueRangePercentage(), 0.0f, C29007a.INSTANCE.m88137b());
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q6.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q6.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q6, modifierM88149j);
            c28655q6.m87158i0();
            if (c28655q6.f115903S) {
                c28655q6.m87163l(interfaceC4339a);
            } else {
                c28655q6.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q6, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N2);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getHealth().getPicker(), c28655q6, 6), null, AbstractC1127a.m3488c(AbstractC1102d.m3421r(c2314t2, f15, 5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 180.0f, null, null, 0, 524031), c3835bM11785a.getBottomIndicatorColor(), c28655q6, 432, 0);
            C28655q c28655q7 = c28655q6;
            c28655q7.m87173q(true);
            if (z4) {
                c28655q7.m87150e0(1879776937);
                C2305k c2305kM11730e0 = m11730e0(viewState.getExpandedBottomRangeValue().getValueRangePercentage());
                Modifier modifierM88149j2 = AbstractC29011e.m88149j(c2314t2, (float) viewState.getExpandedBottomRangeValue().getValueRangePercentage(), 0.0f, new C29007a(m11734g0(viewState.getExpandedBottomRangeValue().getValueRangePercentage()), 0.0f, false, false, 14, null));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305kM11730e0, c28655q7, 0);
                int iHashCode3 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q7.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q7, modifierM88149j2);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q7, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N3);
                AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3411h(1, c2314t2));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9109L, c28655q7, 54);
                int iHashCode4 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q7.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q7, c2314t2);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q7, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N4);
                TextResource textResourceM11789c = viewState.getExpandedBottomRangeValue().getValueDisplay();
                if (textResourceM11789c == null) {
                    c28655q7.m87150e0(986391086);
                    c28655q7.m87173q(false);
                    r10 = 0;
                    c2314t = c2314t2;
                    c38072d = c38072d2;
                    i15 = 2;
                    c28655q3 = c28655q7;
                } else {
                    c28655q7.m87150e0(986391087);
                    String strM21274h = AbstractC8693b.m21274h(textResourceM11789c, c28655q7, 0);
                    C38072d c38072d3 = c38072d2;
                    C2886a c2886aM8407E = c38072d3.m121952e(c28655q7, 6).getN8();
                    long jM11694f = c3835bM11785a.getValueTextColor();
                    c2314t = c2314t2;
                    r10 = 0;
                    i15 = 2;
                    AbstractC30795n.m94707h(strM21274h, null, jM11694f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8407E, null, c28655q7, 0, 0, 196602);
                    C28655q c28655q8 = c28655q7;
                    c28655q8.m87173q(false);
                    c38072d = c38072d3;
                    c28655q3 = c28655q8;
                }
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3424u(i15, c2314t));
                TextResource textResourceM11791e = viewState.getExpandedBottomRangeValue().getValueUnitDisplay();
                if (textResourceM11791e == null) {
                    c28655q3.m87150e0(986782895);
                    c28655q3.m87173q(r10);
                    c28655q4 = c28655q3;
                } else {
                    c28655q3.m87150e0(986782896);
                    C28655q c28655q9 = c28655q3;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM11791e, c28655q3, r10), null, c3835bM11785a.getUnitTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getB2(), null, c28655q9, 0, 0, 196602);
                    C28655q c28655q10 = c28655q9;
                    c28655q10.m87173q(r10);
                    c28655q4 = c28655q10;
                }
                c28655q4.m87173q(true);
                TextResource textResourceM11787a = viewState.getExpandedBottomRangeValue().getExpandedValueLabelDisplay();
                if (textResourceM11787a == null) {
                    c28655q4.m87150e0(-1500428187);
                    c28655q4.m87173q(r10);
                    c28655q5 = c28655q4;
                } else {
                    c28655q4.m87150e0(-1500428186);
                    C28655q c28655q11 = c28655q4;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM11787a, c28655q4, r10), null, c3835bM11785a.getBottomExpandedLabel(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getB2(), null, c28655q11, 0, 0, 196602);
                    C28655q c28655q12 = c28655q11;
                    c28655q12.m87173q(r10);
                    c28655q5 = c28655q12;
                }
                z13 = true;
                c28655q5.m87173q(true);
                c28655q5.m87173q(r10);
                c28655q2 = c28655q5;
            } else {
                z13 = true;
                c28655q7.m87150e0(1881508969);
                c28655q7.m87173q(false);
                c28655q2 = c28655q7;
            }
            c28655q2.m87173q(z13);
            c28655q = c28655q2;
        } else {
            c28655q6.m87138X();
            c28655q = c28655q6;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3836c(viewState, z4, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m11705K(C3842i c3842i, boolean z4, int i13, Composer composer, int i14) {
        m11704J(c3842i, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    public static final void m11706L(List<? extends InterfaceC25312u> expandedItems, Function1 function1, C25307p c25307p, Composer composer, int i13) {
        C2314t c2314t;
        boolean z4;
        int i14;
        Function1 onViewEvent = function1;
        C25307p factory = c25307p;
        AbstractC22676k.m65750j(expandedItems, "expandedItems");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(factory, "factory");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(651841305);
        int i15 = 2;
        int i16 = 4;
        int i17 = (i13 & 6) == 0 ? (c28655q.m87157i(expandedItems) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i17 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i17 |= c28655q.m87157i(factory) ? 256 : 128;
        }
        int i18 = i17;
        boolean z13 = false;
        if (c28655q.m87135U(i18 & 1, (i18 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-409251470);
            int i19 = 0;
            for (Object obj : expandedItems) {
                int i24 = i19 + 1;
                if (i19 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
                boolean z14 = interfaceC25312u instanceof C27256h;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z14) {
                    c28655q.m87150e0(-1860901709);
                    C27246d c27246d = new C27246d();
                    float f13 = i16;
                    float f14 = i15 * f13;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3388j(c2314t2, EnumC22935a1.f90538x), f14, ((float) 1.5d) * f13, f14, 0.0f, 8);
                    C2314t c2314t3 = c2314t2;
                    C27256h c27256h = (C27256h) interfaceC25312u;
                    boolean zM87157i = c28655q.m87157i(interfaceC25312u) | ((i18 & 112) == 32);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C3837d(onViewEvent, c27256h, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function2 = (Function1) objM87133R;
                    c2314t = c2314t3;
                    z4 = false;
                    c27246d.Compose(modifierM3398t, c27256h, function2, c28655q, 0);
                    c28655q.m87173q(false);
                    i14 = 1;
                } else {
                    c2314t = c2314t2;
                    z4 = z13;
                    if (interfaceC25312u instanceof C11474i) {
                        c28655q.m87150e0(-1860499825);
                        C11474i c11474i = (C11474i) interfaceC25312u;
                        boolean zM87157i2 = c28655q.m87157i(interfaceC25312u) | ((i18 & 112) == 32 ? true : z4);
                        Object objM87133R2 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C3838e(onViewEvent, c11474i, 0);
                            c28655q.m87172p0(objM87133R2);
                        }
                        i14 = 1;
                        AbstractC11471f.m30786k(c11474i, null, null, (InterfaceC4339a) objM87133R2, c28655q, 0, 6);
                        c28655q.m87173q(z4);
                        c2314t = c2314t;
                    } else {
                        i14 = 1;
                        c28655q.m87150e0(-1722580322);
                        AbstractC25303l.m74291r(interfaceC25312u, factory, null, function1, c28655q, ((i18 >> 3) & 112) | ((i18 << 6) & 7168), 4);
                        c28655q.m87173q(z4);
                    }
                }
                if (i19 < expandedItems.size() - i14) {
                    c28655q.m87150e0(-1860247547);
                    AbstractC30007c.m91851u(c2314t, 8, c28655q, z4);
                } else {
                    c28655q.m87150e0(-1860178355);
                    c28655q.m87173q(z4);
                }
                onViewEvent = function1;
                factory = c25307p;
                c2314t2 = c2314t;
                z13 = z4;
                i19 = i24;
                i15 = 2;
                i16 = 4;
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(expandedItems, function1, c25307p, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m11707M(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(interfaceC25312u);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m11708N(Function1 function1, InterfaceC25312u interfaceC25312u) {
        function1.invoke(interfaceC25312u);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m11709O(List list, Function1 function1, C25307p c25307p, int i13, Composer composer, int i14) {
        m11706L(list, function1, c25307p, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    public static final void m11710P(C3842i viewState, Composer composer, int i13) {
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1326985639);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC34132o.m107879c(0.15f, AbstractC1102d.m3409f(1.0f, c2314t)), AbstractC33253j.m105491g(0.0f, 0.0f, f13, f13, 3));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118994r);
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
            c28655q.m87150e0(-1646490894);
            int i15 = 0;
            for (Object obj : viewState.m11779g()) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C3844k c3844k = (C3844k) obj;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3411h(18, new LayoutWeightElement(1.0f, true)), AbstractC18249c.m52575m(m11728d0(c3844k.getStyle()))), c28655q, 0);
                if (i15 < viewState.m11779g().size() - 1) {
                    c28655q.m87150e0(412009085);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(1, c2314t));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(412077316);
                    c28655q.m87173q(false);
                }
                i15 = i16;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3839f(viewState, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m11711Q(C3842i c3842i, int i13, Composer composer, int i14) {
        m11710P(c3842i, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private static final void m11712R(C3842i c3842i, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Float fValueOf = Float.valueOf(1.5f);
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(660300619);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(c3842i) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3424u = AbstractC1102d.m3424u(f15720e, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3424u);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(c3842i.getImpactValueDisplay(), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, m11736h0(c3842i.getImpactValueStyle()).mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), fValueOf, c28655q2, 0, 12582912, 65530);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3842i.getImpactValueLabelDisplay(), c28655q2, 0), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 3, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB2(), fValueOf, c28655q2, 0, 12582960, 63482);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3839f(c3842i, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m11713S(C3842i c3842i, int i13, Composer composer, int i14) {
        m11712R(c3842i, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    public static final void m11714T(C3842i viewState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(548870660);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C3835b c3835bM11785a = AbstractC3843j.m11785a(viewState.getTopRangeValue().getStyle(), c28655q, 0);
            Modifier modifierM3419p = AbstractC1102d.m3419p(16, AbstractC1099a.m3392n(AbstractC29011e.m88149j(C2314t.f9131w, (float) viewState.getTopRangeValue().getValueRangePercentage(), 0.0f, C29007a.INSTANCE.m88137b()), 0.0f, f15716a, 1));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
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
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(C38072d.f163053a.m121951d().getHealth().getPicker(), c28655q, 6), null, null, c3835bM11785a.getTopIndicatorColor(), c28655q, 48, 4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3839f(viewState, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m11715U(C3842i c3842i, int i13, Composer composer, int i14) {
        m11714T(c3842i, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: V */
    public static final void m11716V(C3842i viewState, boolean z4, Composer composer, int i13) {
        int i14;
        boolean z13 = z4;
        C2306l c2306l = C2299e.f9107J;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1204282090);
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z13) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105490f(f13, f13, z13 ? 0 : f13, z13 ? 0 : f13));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118994r);
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
            c28655q.m87150e0(694482805);
            int i16 = 0;
            for (Object obj : viewState.m11779g()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C3844k c3844k = (C3844k) obj;
                int i18 = i16;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3411h(f13, new LayoutWeightElement(1.0f, true)), AbstractC18249c.m52575m(m11728d0(c3844k.getStyle()))), c28655q, 0);
                if (i18 < viewState.m11779g().size() - 1) {
                    c28655q.m87150e0(-32250278);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(1, c2314t));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-32182047);
                    c28655q.m87173q(false);
                }
                i16 = i17;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            float f14 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.25d) * f14, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            if (!z4 || viewState.getExpandedBottomRangeValue().getValueRangePercentage() > 0.1d) {
                c28655q.m87150e0(567957528);
                i14 = 6;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getRangeLeftLabelDisplay(), c28655q, 0), AbstractC1099a.m3398t(c2314t, ((float) 0.5d) * f14, 0.0f, 0.0f, 0.0f, 14), m11728d0(viewState.getRangeLeftLabelStyle()).mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN9(), null, c28655q, 48, 0, 196600);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(568288546);
                c28655q.m87173q(false);
                i14 = 6;
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            if (!z4 || viewState.getExpandedBottomRangeValue().getValueRangePercentage() < 0.9d) {
                c28655q.m87150e0(568481304);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getRangeRightLabelDisplay(), c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 0.5d) * f14, 0.0f, 11), m11728d0(viewState.getRangeRightLabelStyle()).mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, i14).getN9(), null, c28655q, 48, 0, 196600);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(568812322);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C3595n(23);
                c28655q.m87172p0(objM87133R);
            }
            C3733d1 c3733d1M11576d = AbstractC3788w0.m11576d(null, (Function1) objM87133R, 7);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C3595n(21);
                c28655q.m87172p0(objM87133R2);
            }
            z13 = z4;
            AbstractC1090b.m3351f(z13, null, c3733d1M11576d, AbstractC3788w0.m11584l(null, null, (Function1) objM87133R2, 7).m11563a(AbstractC3788w0.m11578f(null, 3)), null, AbstractC37817c.m121344e(-837274420, c28655q, new C2476a1(viewState, 3)), c28655q, ((i15 >> 3) & 14) | 200064, 18);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3836c(viewState, z13, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final int m11717W(int i13) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final int m11718X(int i13) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m11719Y(C3842i c3842i, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        m11710P(c3842i, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m11720Z(C3842i c3842i, boolean z4, int i13, Composer composer, int i14) {
        m11716V(c3842i, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v14 */
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
    /* JADX INFO: renamed from: a0 */
    public static final void m11722a0(C3842i viewState, boolean z4, Composer composer, int i13) {
        int i14;
        ?? r10;
        boolean z13;
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-363704577);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C3835b c3835bM11785a = AbstractC3843j.m11785a(viewState.getTopRangeValue().getStyle(), c28655q, 0);
            C2305k c2305kM11730e0 = m11730e0(viewState.getTopRangeValue().getValueRangePercentage());
            float fM11790d = (float) viewState.getTopRangeValue().getValueRangePercentage();
            C29007a c29007a = new C29007a(m11734g0(viewState.getTopRangeValue().getValueRangePercentage()), 0.0f, false, false, 14, null);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3392n = AbstractC1099a.m3392n(AbstractC29011e.m88149j(c2314t, fM11790d, 0.0f, c29007a), 0.0f, f15716a, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305kM11730e0, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3392n);
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
            AbstractC1090b.m3350e(C23016z.f90757a, z4, null, null, null, null, AbstractC37817c.m121344e(255357041, c28655q, new C22931l(8, viewState, c3835bM11785a)), c28655q, (i14 & 112) | 1572870, 30);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM11789c = viewState.getTopRangeValue().getValueDisplay();
            if (textResourceM11789c == null) {
                c28655q.m87150e0(-1172908857);
                c28655q.m87173q(false);
                r10 = 0;
                i15 = 2;
                z13 = true;
            } else {
                c28655q.m87150e0(-1172908856);
                r10 = 0;
                z13 = true;
                i15 = 2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM11789c, c28655q, 0), null, c3835bM11785a.getValueTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN7(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(i15, c2314t));
            TextResource textResourceM11791e = viewState.getTopRangeValue().getValueUnitDisplay();
            if (textResourceM11791e == null) {
                c28655q.m87150e0(-1172590456);
                c28655q.m87173q(r10);
            } else {
                c28655q.m87150e0(-1172590455);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM11791e, c28655q, r10), null, c3835bM11785a.getUnitTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(r10);
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3836c(viewState, z4, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m11724b0(C3842i c3842i, C3835b c3835b, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        TextResource textResourceM11787a = c3842i.getTopRangeValue().getExpandedValueLabelDisplay();
        if (textResourceM11787a == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(954598361);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(954598362);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM11787a, c28655q2, 0), null, c3835b.getTopExpandedLabel(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getB2(), null, c28655q2, 0, 0, 196602);
            c28655q2.m87173q(false);
        }
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(2, C2314t.f9131w));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m11726c0(C3842i c3842i, boolean z4, int i13, Composer composer, int i14) {
        m11722a0(c3842i, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d0 */
    public static final InterfaceC39332e m11728d0(EnumC3846m style) {
        AbstractC22676k.m65750j(style, "style");
        switch (a.f15721a[style.ordinal()]) {
            case 1:
                return p745y81.Function1.m125323a(g.f15728w);
            case 2:
                return p745y81.Function1.m125323a(h.f15729w);
            case 3:
                return p745y81.Function1.m125323a(i.f15730w);
            case 4:
                return p745y81.Function1.m125323a(j.f15731w);
            case 5:
                return p745y81.Function1.m125323a(k.f15732w);
            case 6:
                return p745y81.Function1.m125323a(l.f15733w);
            case 7:
                return p745y81.Function1.m125323a(m.f15734w);
            case 8:
                return p745y81.Function1.m125323a(n.f15735w);
            case 9:
                return p745y81.Function1.m125323a(o.f15736w);
            case 10:
                return p745y81.Function1.m125323a(b.f15723w);
            case 11:
                return p745y81.Function1.m125323a(c.f15724w);
            case 12:
                return p745y81.Function1.m125323a(d.f15725w);
            case 13:
                return p745y81.Function1.m125323a(e.f15726w);
            case 14:
                return p745y81.Function1.m125323a(f.f15727w);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final C2305k m11730e0(double d3) {
        return new C2305k(m11732f0(d3));
    }

    /* JADX INFO: renamed from: f0 */
    public static final float m11732f0(double d3) {
        return (float) (Math.pow(d3 - 0.5d, 3.0d) * ((double) 8));
    }

    /* JADX INFO: renamed from: g0 */
    public static final float m11734g0(double d3) {
        return (m11732f0(d3) + 1) / 2;
    }

    /* JADX INFO: renamed from: h0 */
    public static final InterfaceC39332e m11736h0(EnumC3847n style) {
        AbstractC22676k.m65750j(style, "style");
        int i13 = a.f15722b[style.ordinal()];
        if (i13 == 1) {
            return p745y81.Function1.m125323a(p.f15737w);
        }
        if (i13 == 2) {
            return p745y81.Function1.m125323a(q.f15738w);
        }
        if (i13 == 3) {
            return p745y81.Function1.m125323a(r.f15739w);
        }
        if (i13 == 4) {
            return p745y81.Function1.m125323a(s.f15740w);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:103:0x0203  */
    /* JADX WARN: Code duplicated, block: B:106:0x0250  */
    /* JADX WARN: Code duplicated, block: B:107:0x0254  */
    /* JADX WARN: Code duplicated, block: B:110:0x0261  */
    /* JADX WARN: Code duplicated, block: B:112:0x026f  */
    /* JADX WARN: Code duplicated, block: B:115:0x031e  */
    /* JADX WARN: Code duplicated, block: B:119:0x034a  */
    /* JADX WARN: Code duplicated, block: B:121:0x035e  */
    /* JADX WARN: Code duplicated, block: B:124:0x036a  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0122  */
    /* JADX WARN: Code duplicated, block: B:76:0x0124  */
    /* JADX WARN: Code duplicated, block: B:79:0x0151  */
    /* JADX WARN: Code duplicated, block: B:80:0x0153  */
    /* JADX WARN: Code duplicated, block: B:83:0x015b  */
    /* JADX WARN: Code duplicated, block: B:84:0x015d  */
    /* JADX WARN: Code duplicated, block: B:87:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0172  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:97:0x01de  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e2  */
    /* JADX INFO: renamed from: v */
    public static final void m11750v(C3849p viewState, boolean z4, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        boolean z14;
        boolean z15;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        boolean zM87157i;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        float f13;
        String strM21274h;
        float f14;
        InterfaceC28670t2 interfaceC28670t2M30588b;
        long jM125416r;
        boolean z17;
        boolean z18;
        boolean zM87153g;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        boolean zM87151f;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z19;
        int iHashCode2;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2130081370);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function3 = function1;
                    if (c28655q.m87157i(function3)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function4 = function2;
                        if (c28655q.m87157i(function4)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i24 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C3595n(20);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function7 = (Function1) objM87133R5;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C3595n(22);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function8 = (Function1) objM87133R4;
                        } else {
                            function8 = function4;
                        }
                        Object[] objArr = {viewState.getTitleDisplay()};
                        zM87157i = c28655q.m87157i(viewState);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i || objM87133R == c28676v0) {
                            objM87133R = new C0111j(viewState, 13);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 0);
                        if (m11695A(interfaceC28601c1)) {
                            f13 = -180.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                        strM21274h = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0);
                        if (m11695A(interfaceC28601c1)) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.0f;
                        }
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                        C38072d c38072d = C38072d.f163053a;
                        jM125416r = c38072d.m121949b(c28655q, 6).getBlack30();
                        boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1);
                        if ((i15 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z24 = zM87153g2 | z17;
                        if ((i15 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87153g = z24 | z18 | c28655q.m87153g(strM21274h);
                        objM87133R2 = c28655q.m87133R();
                        if (!zM87153g || objM87133R2 == c28676v0) {
                            objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                            interfaceC28601c2 = interfaceC28601c1;
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        C2314t c2314t = C2314t.f9131w;
                        Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        zM87151f = c28655q.m87151f(jM125416r) | c28655q.m87153g(interfaceC28670t2M30588b);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87151f || objM87133R3 == c28676v0) {
                            objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3478a = AbstractC1125a.m3478a(modifierM3362g, (Function1) objM87133R3);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3478a);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        float f15 = 2 * 8;
                        int i25 = i15;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2), 0.0f, f15, 0.0f, 0.0f, 13);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                        Function1 function9 = function7;
                        z19 = z16;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        Function1 function10 = function8;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196602);
                        float f16 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m11697C(interfaceC28670t2M30588b2), AbstractC1102d.m3419p(f16 * f16, c2314t)), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        m11701G(viewState.getContent(), m11695A(interfaceC28601c2), function10, c28655q, (i25 >> 3) & 896);
                        if (z19 || m11695A(interfaceC28601c2)) {
                            c28655q.m87150e0(222762706);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(222583650);
                            AbstractC15751g.m44449b(AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2), c38072d.m121949b(c28655q, 6).getWhite5(), 1, 0.0f, c28655q, 390, 8);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        function5 = function9;
                        function6 = function10;
                        z15 = z19;
                    } else {
                        c28655q.m87138X();
                        z15 = z13;
                        function5 = function3;
                        function6 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2108h(viewState, z15, function5, function6, i13, i14, 2);
                    }
                }
                i15 |= 3072;
                function4 = function2;
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C3595n(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C3595n(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    Object[] objArr2 = {viewState.getTitleDisplay()};
                    zM87157i = c28655q.m87157i(viewState);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C0111j(viewState, 13);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C0111j(viewState, 13);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R, c28655q, 0);
                    if (m11695A(interfaceC28601c1)) {
                        f13 = -180.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b3 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                    strM21274h = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0);
                    if (m11695A(interfaceC28601c1)) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                    C38072d c38072d2 = C38072d.f163053a;
                    jM125416r = c38072d2.m121949b(c28655q, 6).getBlack30();
                    boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                    if ((i15 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z25 = zM87153g3 | z17;
                    if ((i15 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87153g = z25 | z18 | c28655q.m87153g(strM21274h);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q.m87172p0(objM87133R2);
                    }
                    C2314t c2314t2 = C2314t.f9131w;
                    Modifier modifierM3362g2 = AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    zM87151f = c28655q.m87151f(jM125416r) | c28655q.m87153g(interfaceC28670t2M30588b);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87151f) {
                        objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3478a2 = AbstractC1125a.m3478a(modifierM3362g2, (Function1) objM87133R3);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3478a2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i5 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                    C0209i c0209i6 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                    float f17 = 2 * 8;
                    int i26 = i15;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f17, 0.0f, 2), 0.0f, f17, 0.0f, 0.0f, 13);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    Function1 function11 = function7;
                    z19 = z16;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                    Function1 function12 = function8;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0), null, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196602);
                    float f18 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m11697C(interfaceC28670t2M30588b3), AbstractC1102d.m3419p(f18 * f18, c2314t2)), c38072d2.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    m11701G(viewState.getContent(), m11695A(interfaceC28601c2), function12, c28655q, (i26 >> 3) & 896);
                    if (z19) {
                        c28655q.m87150e0(222762706);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(222762706);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function5 = function11;
                    function6 = function12;
                    z15 = z19;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2108h(viewState, z15, function5, function6, i13, i14, 2);
                }
            }
            i15 |= 384;
            function3 = function1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C3595n(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C3595n(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    Object[] objArr3 = {viewState.getTitleDisplay()};
                    zM87157i = c28655q.m87157i(viewState);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C0111j(viewState, 13);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C0111j(viewState, 13);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) objM87133R, c28655q, 0);
                    if (m11695A(interfaceC28601c1)) {
                        f13 = -180.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b4 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                    strM21274h = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0);
                    if (m11695A(interfaceC28601c1)) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                    C38072d c38072d3 = C38072d.f163053a;
                    jM125416r = c38072d3.m121949b(c28655q, 6).getBlack30();
                    boolean zM87153g4 = c28655q.m87153g(interfaceC28601c1);
                    if ((i15 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z26 = zM87153g4 | z17;
                    if ((i15 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87153g = z26 | z18 | c28655q.m87153g(strM21274h);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q.m87172p0(objM87133R2);
                    }
                    C2314t c2314t3 = C2314t.f9131w;
                    Modifier modifierM3362g3 = AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    zM87151f = c28655q.m87151f(jM125416r) | c28655q.m87153g(interfaceC28670t2M30588b);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87151f) {
                        objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3478a3 = AbstractC1125a.m3478a(modifierM3362g3, (Function1) objM87133R3);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3478a3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i8 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a3);
                    C0209i c0209i9 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                    float f19 = 2 * 8;
                    int i27 = i15;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f19, 0.0f, 2), 0.0f, f19, 0.0f, 0.0f, 13);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    Function1 function13 = function7;
                    z19 = z16;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                    Function1 function14 = function8;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0), null, c38072d3.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196602);
                    float f110 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d3.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m11697C(interfaceC28670t2M30588b4), AbstractC1102d.m3419p(f110 * f110, c2314t3)), c38072d3.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    m11701G(viewState.getContent(), m11695A(interfaceC28601c2), function14, c28655q, (i27 >> 3) & 896);
                    if (z19) {
                        c28655q.m87150e0(222762706);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(222762706);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function5 = function13;
                    function6 = function14;
                    z15 = z19;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2108h(viewState, z15, function5, function6, i13, i14, 2);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C3595n(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C3595n(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                Object[] objArr4 = {viewState.getTitleDisplay()};
                zM87157i = c28655q.m87157i(viewState);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C0111j(viewState, 13);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0111j(viewState, 13);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr4, (InterfaceC4339a) objM87133R, c28655q, 0);
                if (m11695A(interfaceC28601c1)) {
                    f13 = -180.0f;
                } else {
                    f13 = 0.0f;
                }
                InterfaceC28670t2 interfaceC28670t2M30588b5 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                strM21274h = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0);
                if (m11695A(interfaceC28601c1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                C38072d c38072d4 = C38072d.f163053a;
                jM125416r = c38072d4.m121949b(c28655q, 6).getBlack30();
                boolean zM87153g5 = c28655q.m87153g(interfaceC28601c1);
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z27 = zM87153g5 | z17;
                if ((i15 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87153g = z27 | z18 | c28655q.m87153g(strM21274h);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q.m87172p0(objM87133R2);
                }
                C2314t c2314t4 = C2314t.f9131w;
                Modifier modifierM3362g4 = AbstractC1092a.m3362g(c2314t4, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                zM87151f = c28655q.m87151f(jM125416r) | c28655q.m87153g(interfaceC28670t2M30588b);
                objM87133R3 = c28655q.m87133R();
                if (zM87151f) {
                    objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM3478a4 = AbstractC1125a.m3478a(modifierM3362g4, (Function1) objM87133R3);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3478a4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a4);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                float f111 = 2 * 8;
                int i28 = i15;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f111, 0.0f, 2), 0.0f, f111, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                Function1 function15 = function7;
                z19 = z16;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
                Function1 function16 = function8;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0), null, c38072d4.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196602);
                float f112 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d4.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m11697C(interfaceC28670t2M30588b5), AbstractC1102d.m3419p(f112 * f112, c2314t4)), c38072d4.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                m11701G(viewState.getContent(), m11695A(interfaceC28601c2), function16, c28655q, (i28 >> 3) & 896);
                if (z19) {
                    c28655q.m87150e0(222762706);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(222762706);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function5 = function15;
                function6 = function16;
                z15 = z19;
            } else {
                c28655q.m87138X();
                z15 = z13;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(viewState, z15, function5, function6, i13, i14, 2);
            }
        }
        i15 |= 48;
        z13 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                if (c28655q.m87157i(function3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C3595n(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C3595n(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    Object[] objArr5 = {viewState.getTitleDisplay()};
                    zM87157i = c28655q.m87157i(viewState);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C0111j(viewState, 13);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C0111j(viewState, 13);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr5, (InterfaceC4339a) objM87133R, c28655q, 0);
                    if (m11695A(interfaceC28601c1)) {
                        f13 = -180.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b6 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                    strM21274h = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0);
                    if (m11695A(interfaceC28601c1)) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                    C38072d c38072d5 = C38072d.f163053a;
                    jM125416r = c38072d5.m121949b(c28655q, 6).getBlack30();
                    boolean zM87153g6 = c28655q.m87153g(interfaceC28601c1);
                    if ((i15 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z28 = zM87153g6 | z17;
                    if ((i15 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87153g = z28 | z18 | c28655q.m87153g(strM21274h);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q.m87172p0(objM87133R2);
                    }
                    C2314t c2314t5 = C2314t.f9131w;
                    Modifier modifierM3362g5 = AbstractC1092a.m3362g(c2314t5, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    zM87151f = c28655q.m87151f(jM125416r) | c28655q.m87153g(interfaceC28670t2M30588b);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87151f) {
                        objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3478a5 = AbstractC1125a.m3478a(modifierM3362g5, (Function1) objM87133R3);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3478a5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a5);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m9);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N9);
                    float f113 = 2 * 8;
                    int i29 = i15;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t5), f113, 0.0f, 2), 0.0f, f113, 0.0f, 0.0f, 13);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    Function1 function17 = function7;
                    z19 = z16;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                    Function1 function18 = function8;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0), null, c38072d5.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196602);
                    float f114 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d5.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m11697C(interfaceC28670t2M30588b6), AbstractC1102d.m3419p(f114 * f114, c2314t5)), c38072d5.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    m11701G(viewState.getContent(), m11695A(interfaceC28601c2), function18, c28655q, (i29 >> 3) & 896);
                    if (z19) {
                        c28655q.m87150e0(222762706);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(222762706);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function5 = function17;
                    function6 = function18;
                    z15 = z19;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2108h(viewState, z15, function5, function6, i13, i14, 2);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C3595n(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C3595n(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                Object[] objArr6 = {viewState.getTitleDisplay()};
                zM87157i = c28655q.m87157i(viewState);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C0111j(viewState, 13);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0111j(viewState, 13);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr6, (InterfaceC4339a) objM87133R, c28655q, 0);
                if (m11695A(interfaceC28601c1)) {
                    f13 = -180.0f;
                } else {
                    f13 = 0.0f;
                }
                InterfaceC28670t2 interfaceC28670t2M30588b7 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                strM21274h = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0);
                if (m11695A(interfaceC28601c1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                C38072d c38072d6 = C38072d.f163053a;
                jM125416r = c38072d6.m121949b(c28655q, 6).getBlack30();
                boolean zM87153g7 = c28655q.m87153g(interfaceC28601c1);
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z29 = zM87153g7 | z17;
                if ((i15 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87153g = z29 | z18 | c28655q.m87153g(strM21274h);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q.m87172p0(objM87133R2);
                }
                C2314t c2314t6 = C2314t.f9131w;
                Modifier modifierM3362g6 = AbstractC1092a.m3362g(c2314t6, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                zM87151f = c28655q.m87151f(jM125416r) | c28655q.m87153g(interfaceC28670t2M30588b);
                objM87133R3 = c28655q.m87133R();
                if (zM87151f) {
                    objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM3478a6 = AbstractC1125a.m3478a(modifierM3362g6, (Function1) objM87133R3);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3478a6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i17 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i17, c23010xM66775a6);
                C0209i c0209i18 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i19 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N11);
                float f115 = 2 * 8;
                int i210 = i15;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t6), f115, 0.0f, 2), 0.0f, f115, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                Function1 function19 = function7;
                z19 = z16;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N12);
                Function1 function110 = function8;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0), null, c38072d6.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196602);
                float f116 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d6.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m11697C(interfaceC28670t2M30588b7), AbstractC1102d.m3419p(f116 * f116, c2314t6)), c38072d6.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                m11701G(viewState.getContent(), m11695A(interfaceC28601c2), function110, c28655q, (i210 >> 3) & 896);
                if (z19) {
                    c28655q.m87150e0(222762706);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(222762706);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function5 = function19;
                function6 = function110;
                z15 = z19;
            } else {
                c28655q.m87138X();
                z15 = z13;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(viewState, z15, function5, function6, i13, i14, 2);
            }
        }
        i15 |= 384;
        function3 = function1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C3595n(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C3595n(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                Object[] objArr7 = {viewState.getTitleDisplay()};
                zM87157i = c28655q.m87157i(viewState);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C0111j(viewState, 13);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0111j(viewState, 13);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr7, (InterfaceC4339a) objM87133R, c28655q, 0);
                if (m11695A(interfaceC28601c1)) {
                    f13 = -180.0f;
                } else {
                    f13 = 0.0f;
                }
                InterfaceC28670t2 interfaceC28670t2M30588b8 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                strM21274h = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0);
                if (m11695A(interfaceC28601c1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                C38072d c38072d7 = C38072d.f163053a;
                jM125416r = c38072d7.m121949b(c28655q, 6).getBlack30();
                boolean zM87153g8 = c28655q.m87153g(interfaceC28601c1);
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z210 = zM87153g8 | z17;
                if ((i15 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87153g = z210 | z18 | c28655q.m87153g(strM21274h);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q.m87172p0(objM87133R2);
                }
                C2314t c2314t7 = C2314t.f9131w;
                Modifier modifierM3362g7 = AbstractC1092a.m3362g(c2314t7, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                zM87151f = c28655q.m87151f(jM125416r) | c28655q.m87153g(interfaceC28670t2M30588b);
                objM87133R3 = c28655q.m87133R();
                if (zM87151f) {
                    objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM3478a7 = AbstractC1125a.m3478a(modifierM3362g7, (Function1) objM87133R3);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3478a7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i110, c23010xM66775a7);
                C0209i c0209i111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m13);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N13);
                float f117 = 2 * 8;
                int i211 = i15;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t7), f117, 0.0f, 2), 0.0f, f117, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                Function1 function111 = function7;
                z19 = z16;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3398t7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N14);
                Function1 function112 = function8;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0), null, c38072d7.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196602);
                float f118 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d7.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m11697C(interfaceC28670t2M30588b8), AbstractC1102d.m3419p(f118 * f118, c2314t7)), c38072d7.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                m11701G(viewState.getContent(), m11695A(interfaceC28601c2), function112, c28655q, (i211 >> 3) & 896);
                if (z19) {
                    c28655q.m87150e0(222762706);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(222762706);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function5 = function111;
                function6 = function112;
                z15 = z19;
            } else {
                c28655q.m87138X();
                z15 = z13;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(viewState, z15, function5, function6, i13, i14, 2);
            }
        }
        i15 |= 3072;
        function4 = function2;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i24 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C3595n(20);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C3595n(22);
                    c28655q.m87172p0(objM87133R4);
                }
                function8 = (Function1) objM87133R4;
            } else {
                function8 = function4;
            }
            Object[] objArr8 = {viewState.getTitleDisplay()};
            zM87157i = c28655q.m87157i(viewState);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C0111j(viewState, 13);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C0111j(viewState, 13);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr8, (InterfaceC4339a) objM87133R, c28655q, 0);
            if (m11695A(interfaceC28601c1)) {
                f13 = -180.0f;
            } else {
                f13 = 0.0f;
            }
            InterfaceC28670t2 interfaceC28670t2M30588b9 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
            strM21274h = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0);
            if (m11695A(interfaceC28601c1)) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
            C38072d c38072d8 = C38072d.f163053a;
            jM125416r = c38072d8.m121949b(c28655q, 6).getBlack30();
            boolean zM87153g9 = c28655q.m87153g(interfaceC28601c1);
            if ((i15 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z211 = zM87153g9 | z17;
            if ((i15 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            zM87153g = z211 | z18 | c28655q.m87153g(strM21274h);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                interfaceC28601c2 = interfaceC28601c1;
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C1012d((Object) function7, (Object) function8, (Object) strM21274h, (Object) interfaceC28601c1, 5);
                interfaceC28601c2 = interfaceC28601c1;
                c28655q.m87172p0(objM87133R2);
            }
            C2314t c2314t8 = C2314t.f9131w;
            Modifier modifierM3362g8 = AbstractC1092a.m3362g(c2314t8, false, null, null, (InterfaceC4339a) objM87133R2, 15);
            zM87151f = c28655q.m87151f(jM125416r) | c28655q.m87153g(interfaceC28670t2M30588b);
            objM87133R3 = c28655q.m87133R();
            if (zM87151f) {
                objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C3840g(jM125416r, interfaceC28670t2M30588b, 0);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3478a8 = AbstractC1125a.m3478a(modifierM3362g8, (Function1) objM87133R3);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3478a8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i113 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a8);
            C0209i c0209i114 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m15);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N15);
            float f119 = 2 * 8;
            int i212 = i15;
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t8), f119, 0.0f, 2), 0.0f, f119, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            Function1 function113 = function7;
            z19 = z16;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3398t8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i113, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m16);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N16);
            Function1 function114 = function8;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, 0), null, c38072d8.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196602);
            float f1110 = 4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d8.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m11697C(interfaceC28670t2M30588b9), AbstractC1102d.m3419p(f1110 * f1110, c2314t8)), c38072d8.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
            c28655q = c28655q;
            c28655q.m87173q(true);
            m11701G(viewState.getContent(), m11695A(interfaceC28601c2), function114, c28655q, (i212 >> 3) & 896);
            if (z19) {
                c28655q.m87150e0(222762706);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(222762706);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function5 = function113;
            function6 = function114;
            z15 = z19;
        } else {
            c28655q.m87138X();
            z15 = z13;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(viewState, z15, function5, function6, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m11751w(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m11752x(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m11753y(C3849p c3849p, boolean z4, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m11750v(c3849p, z4, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final InterfaceC28601c1 m11754z(C3849p c3849p) {
        return AbstractC28683x.m87272z(Boolean.valueOf(c3849p.getIsInitiallyExpanded()));
    }
}

package p739ui0;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.archv2.feature.domain.C6010p;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.PickMediaSource;
import j93.InterfaceC21467g;
import java.io.File;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p179h.C16351i;
import p267k.C22083d;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p734sl0.C32632k2;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32416g;
import sg2.C32451b;
import sg2.C32469t;
import tr2.InterfaceC34116n;
import u91.C34656a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ui0.r */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001ai\u0010\f\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u001c\u0010\u0005\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00040\u00062\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/p;", "pendingPick", "Lkotlin/Function2;", "", "Ll83/a0;", "onResult", "Lkotlin/Function1;", "onUnavailable", "Landroid/content/Context;", "Ljava/io/File;", "Landroid/net/Uri;", "captureUriFor", "f", "(Lcom/whoop/archv2/feature/domain/p;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Ltr2/n;", "a", "Ltr2/n;", "logger", "", "pickLaunched", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35016r {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f148176a = InterfaceC34116n.INSTANCE.m107848a("MediaPickEffects");

    /* JADX INFO: renamed from: ui0.r$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        public static final a f148177w = new a();

        public a() {
            super(2, Function1.class, "captureUriFor", "captureUriFor(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;", 1);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(Context p13, File p14) {
            AbstractC22676k.m65750j(p13, "p0");
            AbstractC22676k.m65750j(p14, "p1");
            return Function1.m110493h(p13, p14);
        }
    }

    /* JADX INFO: renamed from: ui0.r$b */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.MediaPickEffectsKt$LaunchPendingMediaPick$2$1", m100430f = "MediaPickEffects.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4339a f148178E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f148179F;

        /* JADX INFO: renamed from: w */
        int f148180w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6010p f148181x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC34999a f148182y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C16351i f148183z;

        /* JADX INFO: renamed from: ui0.r$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f148184a;

            static {
                int[] iArr = new int[PickMediaSource.values().length];
                try {
                    iArr[PickMediaSource.CAMERA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PickMediaSource.LIBRARY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f148184a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6010p c6010p, InterfaceC34999a interfaceC34999a, C16351i c16351i, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148181x = c6010p;
            this.f148182y = interfaceC34999a;
            this.f148183z = c16351i;
            this.f148178E = interfaceC4339a;
            this.f148179F = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f148181x, this.f148182y, this.f148183z, this.f148178E, this.f148179F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148180w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C6010p c6010p = this.f148181x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (c6010p != null && !AbstractC35016r.m110643k(this.f148179F)) {
                AbstractC35016r.m110644l(this.f148179F, true);
                int i13 = a.f148184a[this.f148181x.getSource().ordinal()];
                if (i13 == 1) {
                    InterfaceC34999a interfaceC34999a = this.f148182y;
                    C35000b c35000b = (C35000b) interfaceC34999a;
                    Function1.m110504s(c35000b.f148063a, c35000b.f148064b, c35000b.f148065c, c35000b.f148066d, c35000b.f148067e, c35000b.f148068f, c35000b.f148069g, this.f148181x.getStateKey());
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        this.f148183z.mo4052a(AbstractC32416g.m101149f(C22083d.f85640a), null);
                    } catch (ActivityNotFoundException e5) {
                        AbstractC35016r.f148176a.mo85222m(AbstractC11266d.m30461o("No photo picker to open: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(e5.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
                        this.f148178E.invoke();
                    }
                }
            }
            return c23454a0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0152  */
    /* JADX WARN: Code duplicated, block: B:107:0x0171  */
    /* JADX WARN: Code duplicated, block: B:109:0x0187  */
    /* JADX WARN: Code duplicated, block: B:112:0x0191  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x011e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x012e  */
    /* JADX INFO: renamed from: f */
    public static final void m110638f(C6010p c6010p, InterfaceC4351m onResult, Function1 onUnavailable, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4351m interfaceC4351m2;
        int i16;
        boolean z4;
        InterfaceC4351m interfaceC4351m3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4351m interfaceC4351m4;
        boolean z13;
        int i17;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Function1 function1;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        InterfaceC4339a interfaceC4339a;
        boolean zM87153g;
        Object objM87133R3;
        C16351i c16351iM118972a0;
        InterfaceC34999a interfaceC34999aM110497l;
        String stateKey;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z19;
        boolean zM87153g2;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(onResult, "onResult");
        AbstractC22676k.m65750j(onUnavailable, "onUnavailable");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-664007186);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c6010p) : c28655q.m87157i(c6010p) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onResult) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onUnavailable) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                i15 |= c28655q.m87157i(interfaceC4351m2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = 0;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = a.f148177w;
                        c28655q.m87172p0(objM87133R6);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) ((InterfaceC21467g) objM87133R6);
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i17 = i15 & 14;
                if (i17 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(c6010p))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C32469t(27, onResult, c6010p);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
                if ((i15 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i17 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(c6010p))) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objM87133R2 = c28655q.m87133R();
                if (z18 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C35015q(i16, onUnavailable, c6010p);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R2;
                ActivityResultContracts$PickVisualMedia activityResultContracts$PickVisualMedia = new ActivityResultContracts$PickVisualMedia();
                zM87153g = c28655q.m87153g(function1);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    objM87133R3 = new C32451b(function1, 26);
                    c28655q.m87172p0(objM87133R3);
                }
                c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$PickVisualMedia, (Function1) objM87133R3, c28655q, 0);
                interfaceC34999aM110497l = Function1.m110497l(function1, interfaceC4339a, interfaceC4351m4, c28655q, (i15 >> 3) & 896);
                if (c6010p != null) {
                    stateKey = c6010p.getStateKey();
                } else {
                    stateKey = null;
                }
                Object[] objArr = {stateKey};
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C34656a(22);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R4, c28655q, 48);
                if (i17 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(c6010p))) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87153g2 = z19 | c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(interfaceC34999aM110497l) | c28655q.m87157i(c16351iM118972a0) | c28655q.m87153g(interfaceC4339a);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g2 || objM87133R5 == c28676v0) {
                    b bVar = new b(c6010p, interfaceC34999aM110497l, c16351iM118972a0, interfaceC4339a, interfaceC28601c1, null);
                    c28655q.m87172p0(bVar);
                    objM87133R5 = bVar;
                }
                GenericInteraction.Companion companion = GenericInteraction.INSTANCE;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, c6010p);
                interfaceC4351m3 = interfaceC4351m4;
            } else {
                c28655q.m87138X();
                interfaceC4351m3 = interfaceC4351m2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(c6010p, onResult, onUnavailable, interfaceC4351m3, i13, i14, 10);
            }
        }
        i15 |= 3072;
        interfaceC4351m2 = interfaceC4351m;
        i16 = 0;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = a.f148177w;
                    c28655q.m87172p0(objM87133R6);
                }
                interfaceC4351m4 = (InterfaceC4351m) ((InterfaceC21467g) objM87133R6);
            } else {
                interfaceC4351m4 = interfaceC4351m2;
            }
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            i17 = i15 & 14;
            if (i17 != 4) {
                z14 = true;
            } else {
                z14 = true;
            }
            z15 = z13 | z14;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C32469t(27, onResult, c6010p);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C32469t(27, onResult, c6010p);
                c28655q.m87172p0(objM87133R);
            }
            function1 = (Function1) objM87133R;
            if ((i15 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (i17 != 4) {
                z17 = true;
            } else {
                z17 = true;
            }
            z18 = z16 | z17;
            objM87133R2 = c28655q.m87133R();
            if (z18) {
                objM87133R2 = new C35015q(i16, onUnavailable, c6010p);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C35015q(i16, onUnavailable, c6010p);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC4339a = (InterfaceC4339a) objM87133R2;
            ActivityResultContracts$PickVisualMedia activityResultContracts$PickVisualMedia2 = new ActivityResultContracts$PickVisualMedia();
            zM87153g = c28655q.m87153g(function1);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R3 = new C32451b(function1, 26);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C32451b(function1, 26);
                c28655q.m87172p0(objM87133R3);
            }
            c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$PickVisualMedia2, (Function1) objM87133R3, c28655q, 0);
            interfaceC34999aM110497l = Function1.m110497l(function1, interfaceC4339a, interfaceC4351m4, c28655q, (i15 >> 3) & 896);
            if (c6010p != null) {
                stateKey = c6010p.getStateKey();
            } else {
                stateKey = null;
            }
            Object[] objArr2 = {stateKey};
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C34656a(22);
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R4, c28655q, 48);
            if (i17 != 4) {
                z19 = true;
            } else {
                z19 = true;
            }
            zM87153g2 = z19 | c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(interfaceC34999aM110497l) | c28655q.m87157i(c16351iM118972a0) | c28655q.m87153g(interfaceC4339a);
            objM87133R5 = c28655q.m87133R();
            if (zM87153g2) {
                b bVar2 = new b(c6010p, interfaceC34999aM110497l, c16351iM118972a0, interfaceC4339a, interfaceC28601c1, null);
                c28655q.m87172p0(bVar2);
                objM87133R5 = bVar2;
            } else {
                b bVar3 = new b(c6010p, interfaceC34999aM110497l, c16351iM118972a0, interfaceC4339a, interfaceC28601c1, null);
                c28655q.m87172p0(bVar3);
                objM87133R5 = bVar3;
            }
            GenericInteraction.Companion companion2 = GenericInteraction.INSTANCE;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, c6010p);
            interfaceC4351m3 = interfaceC4351m4;
        } else {
            c28655q.m87138X();
            interfaceC4351m3 = interfaceC4351m2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(c6010p, onResult, onUnavailable, interfaceC4351m3, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m110639g(InterfaceC4351m interfaceC4351m, C6010p c6010p, String str) {
        interfaceC4351m.invoke(c6010p, str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m110640h(Function1 function1, C6010p c6010p) {
        function1.invoke(c6010p);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m110641i(Function1 function1, Uri uri) {
        function1.invoke(uri != null ? uri.toString() : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC28601c1 m110642j() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final boolean m110643k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m110644l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m110645m(C6010p c6010p, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC4351m interfaceC4351m2, int i13, int i14, Composer composer, int i15) {
        m110638f(c6010p, interfaceC4351m, function1, interfaceC4351m2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

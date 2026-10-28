package p437qt;

import a11.C0129g;
import ae3.C0803k;
import al.InterfaceC0955b;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1174d0;
import androidx.databinding.C1192v;
import androidx.databinding.C1195y;
import androidx.databinding.InterfaceC1173d;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1575d2;
import androidx.lifecycle.C1610n1;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1620r;
import cg.C4553h;
import cg.C4554i;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5140g;
import com.google.firebase.components.ComponentRegistrar;
import dk.C12100f;
import eg.C13162k;
import eg.C13166o;
import fg3.InterfaceC14473a;
import fg3.InterfaceC14474b;
import fk.InterfaceC14544a;
import gl.C15961z;
import gl.InterfaceC15935a0;
import gl.InterfaceC15947l;
import gt.C16163b;
import hg3.C17262b;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.AbstractC20118j0;
import io.sentry.util.InterfaceC20583e;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kb3.C22342k;
import ne3.C26624l;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p037bu.C3633d;
import p148fg.C14439i;
import p148fg.C14440j;
import p148fg.C14441k;
import p173gj.C15903d;
import p173gj.C15906g;
import p223ik.InterfaceC18598b;
import p223ik.InterfaceC18599c;
import p298l8.AbstractC23420c;
import p298l8.C23418a;
import p298l8.InterfaceC23419b;
import p337n8.C26445b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30062i;
import vg.InterfaceC35960g;
import wd3.AbstractC37172f;
import xb3.AbstractC38176k;
import xb3.InterfaceC38174i;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: qt.e */
/* JADX INFO: loaded from: classes.dex */
public final class C30582e implements InterfaceC30062i, InterfaceC1173d, InterfaceC23419b, InterfaceC5140g, InterfaceC18599c, InterfaceC35960g, InterfaceC15947l, InterfaceC15935a0, InterfaceC14473a, InterfaceC20583e {

    /* JADX INFO: renamed from: x */
    public static C30582e f125831x;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125832w;

    public /* synthetic */ C30582e(int i13) {
        this.f125832w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: c */
    public static final String m93815c(InterfaceC38174i interfaceC38174i, boolean z4) {
        String str;
        int i13 = C4554i.f18348y;
        C4553h c4553h = C4553h.f18347w;
        if (z4) {
            str = "?";
        } else {
            AbstractC22676k.m65750j(interfaceC38174i, "<this>");
            if (interfaceC38174i.iterator().hasNext()) {
                str = "?";
            } else {
                str = "";
            }
        }
        return AbstractC38176k.m122289y(interfaceC38174i, "&", str, new C0129g(22), 28);
    }

    /* JADX INFO: renamed from: d */
    public static final String m93816d(C26624l c26624l, C26624l[] c26624lArr, int i13) {
        int i14;
        boolean z4;
        int i15;
        int i16;
        C26624l c26624l2 = PublicSuffixDatabase.f112933b;
        int iMo79253d = c26624l.mo79253d();
        int i17 = 0;
        while (i17 < iMo79253d) {
            int i18 = (i17 + iMo79253d) / 2;
            while (i18 > -1 && c26624l.mo79257i(i18) != 10) {
                i18--;
            }
            int i19 = i18 + 1;
            int i24 = 1;
            while (true) {
                i14 = i19 + i24;
                if (c26624l.mo79257i(i14) == 10) {
                    break;
                }
                i24++;
            }
            int i25 = i14 - i19;
            int i26 = i13;
            boolean z13 = false;
            int i27 = 0;
            int i28 = 0;
            while (true) {
                if (z13) {
                    i15 = 46;
                    z4 = false;
                } else {
                    byte bMo79257i = c26624lArr[i26].mo79257i(i27);
                    byte[] bArr = AbstractC37172f.f158958a;
                    int i29 = bMo79257i & 255;
                    z4 = z13;
                    i15 = i29;
                }
                byte bMo79257i2 = c26624l.mo79257i(i19 + i28);
                byte[] bArr2 = AbstractC37172f.f158958a;
                i16 = i15 - (bMo79257i2 & 255);
                if (i16 != 0) {
                    break;
                }
                i28++;
                i27++;
                if (i28 == i25) {
                    break;
                }
                if (c26624lArr[i26].mo79253d() != i27) {
                    z13 = z4;
                } else {
                    if (i26 == c26624lArr.length - 1) {
                        break;
                    }
                    i26++;
                    i27 = -1;
                    z13 = true;
                }
            }
            if (i16 >= 0) {
                if (i16 <= 0) {
                    int i34 = i25 - i28;
                    int iMo79253d2 = c26624lArr[i26].mo79253d() - i27;
                    int length = c26624lArr.length;
                    for (int i35 = i26 + 1; i35 < length; i35++) {
                        iMo79253d2 += c26624lArr[i35].mo79253d();
                    }
                    if (iMo79253d2 >= i34) {
                        if (iMo79253d2 <= i34) {
                            return c26624l.mo79262o(i19, i25 + i19).mo79261n(AbstractC39397a.f169546a);
                        }
                    }
                }
                i17 = i14 + 1;
            }
            iMo79253d = i18;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C1575d2 m93817f(InterfaceC1583f2 owner, C1610n1 c1610n1, int i13) {
        InterfaceC1563a2 factory = c1610n1;
        if ((i13 & 2) != 0) {
            AbstractC22676k.m65750j(owner, "owner");
            factory = owner instanceof InterfaceC1620r ? ((InterfaceC1620r) owner).getDefaultViewModelProviderFactory() : C26445b.f105043a;
        }
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC23420c extras = owner instanceof InterfaceC1620r ? ((InterfaceC1620r) owner).getDefaultViewModelCreationExtras() : C23418a.f92771b;
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC22676k.m65750j(factory, "factory");
        AbstractC22676k.m65750j(extras, "extras");
        return new C1575d2(owner.getViewModelStore(), factory, extras);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m93818h(InterfaceC20602v0 interfaceC20602v0, String str) {
        return m93820o(interfaceC20602v0, str) != null;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m93819n(C20513q6 c20513q6, String str) {
        return m93818h(c20513q6 != null ? c20513q6.getLogger() : null, str);
    }

    /* JADX INFO: renamed from: o */
    public static Class m93820o(InterfaceC20602v0 interfaceC20602v0, String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (interfaceC20602v0 == null) {
                return null;
            }
            interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e5) {
            if (interfaceC20602v0 == null) {
                return null;
            }
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e5);
            return null;
        } catch (Throwable th3) {
            if (interfaceC20602v0 == null) {
                return null;
            }
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Failed to initialize ".concat(str), th3);
            return null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5140g
    /* JADX INFO: renamed from: a */
    public byte[] mo16163a(byte[] bArr, int i13, int i14) {
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        return bArr2;
    }

    @Override // fg3.InterfaceC14473a
    /* JADX INFO: renamed from: b */
    public InterfaceC14474b mo41314b(String str) {
        return C17262b.f66349w;
    }

    @Override // gl.InterfaceC15935a0
    /* JADX INFO: renamed from: e */
    public void mo44991e(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f125832w) {
            case 21:
                mediaMetadataRetriever.setDataSource(new C15961z((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // vg.InterfaceC35960g
    /* JADX INFO: renamed from: g */
    public Object mo56533g(Function1 function1) {
        switch (this.f125832w) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C13162k c13162k = new C13162k();
                function1.invoke(c13162k);
                return new C13166o(new C0803k(c13162k));
            default:
                C14439i c14439i = new C14439i();
                Duration.Companion companion = Duration.INSTANCE;
                c14439i.f52712a = DurationKt.toDuration(10, DurationUnit.MILLISECONDS);
                c14439i.f52713b = 1.5d;
                c14439i.f52714c = 1.0d;
                c14439i.f52715d = DurationKt.toDuration(20, DurationUnit.SECONDS);
                function1.invoke(c14439i);
                return new C14441k(new C14440j(c14439i));
        }
    }

    @Override // gl.InterfaceC15947l
    /* JADX INFO: renamed from: i */
    public void mo45011i(InterfaceC0955b interfaceC0955b, Bitmap bitmap) {
    }

    @Override // io.sentry.util.InterfaceC20583e
    /* JADX INFO: renamed from: j */
    public Object mo19991j() {
        return Boolean.valueOf(AbstractC20118j0.m56013g());
    }

    @Override // gl.InterfaceC15947l
    /* JADX INFO: renamed from: k */
    public void mo45012k() {
    }

    @Override // p223ik.InterfaceC18599c
    /* JADX INFO: renamed from: l */
    public InterfaceC18598b mo53816l(C15903d c15903d) {
        C15906g c15906g = c15903d.f60128a;
        SharedPreferences sharedPreferences = c15906g.f60153b.getSharedPreferences("amplitude-events-" + c15906g.f60156e, 0);
        String str = c15906g.f60156e;
        InterfaceC14544a interfaceC14544aM11156E = c15906g.f60158g.m11156E(c15903d);
        AbstractC22676k.m65749i(sharedPreferences, "sharedPreferences");
        return new C12100f(str, interfaceC14544aM11156E, sharedPreferences, new File(c15906g.m44888a(), "events"), c15903d.f60141n);
    }

    @Override // androidx.databinding.InterfaceC1173d
    /* JADX INFO: renamed from: m */
    public C1174d0 mo3728m(AbstractC1168a0 abstractC1168a0, int i13, ReferenceQueue referenceQueue) {
        switch (this.f125832w) {
            case 4:
                return new C1195y(abstractC1168a0, i13, referenceQueue, 0).m3741d();
            default:
                return new C1192v(abstractC1168a0, i13, referenceQueue).m3738d();
        }
    }

    /* JADX INFO: renamed from: p */
    public List m93821p(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C16163b c16163b : componentRegistrar.getComponents()) {
            String str = c16163b.f61428a;
            if (str != null) {
                c16163b = new C16163b(str, c16163b.f61429b, c16163b.f61430c, c16163b.f61431d, c16163b.f61432e, new C3633d(1, str, c16163b), c16163b.f61434g);
            }
            arrayList.add(c16163b);
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f125832w) {
            case 1:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public C30582e(C22342k c22342k) {
        this.f125832w = 16;
        String str = C22342k.f87182d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }
}

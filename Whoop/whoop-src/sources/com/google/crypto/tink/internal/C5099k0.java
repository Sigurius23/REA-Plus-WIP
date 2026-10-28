package com.google.crypto.tink.internal;

import ab3.AbstractC0715g;
import ab3.C0712d;
import ab3.C0719k;
import ab3.C0729u;
import ab3.C0731w;
import ab3.C0734z;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.databinding.RunnableC1189s;
import androidx.profileinstaller.ExecutorC1651b;
import c93.InterfaceC4351m;
import cd3.C4455g;
import ce3.C4497a0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.whoop.android.R;
import e93.AbstractC12889b;
import fa3.AbstractC14330w;
import fe3.AbstractC14421e;
import fe3.InterfaceC14420d;
import gs.C16139j;
import gs.C16141k;
import hb3.AbstractC17104a0;
import hb3.C17136y;
import hb3.InterfaceC17103a;
import hb3.InterfaceC17107c;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import io.sentry.C20351h5;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.C20607v5;
import io.sentry.C20620w5;
import io.sentry.EnumC20436n5;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.C20119j1;
import io.sentry.metrics.InterfaceC20427a;
import io.sentry.transport.C20568r;
import io.sentry.util.C20579a;
import j93.AbstractC21478l0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kb3.C22336e;
import lb3.AbstractC23811y;
import live.hms.video.error.ErrorCodes;
import m63.C25126d;
import m83.AbstractC25267u;
import m83.C25271y;
import n93.AbstractC26487a;
import ne3.AbstractC26604b;
import ne3.C26621j0;
import ne3.C26624l;
import ne3.C26645y;
import o93.AbstractC27746r;
import oa3.C27758a;
import oa3.C27761d;
import oa3.C27763f;
import oa3.C27774q;
import oa3.C27775r;
import oa3.EnumC27760c;
import p000.AbstractC11266d;
import p002a0.C0022g;
import p014aj.C0928c;
import p014aj.C0929d;
import p037bu.C3631b;
import p075ct.C11105a;
import p088dc.AbstractC11894a;
import p097ds.AbstractC12313p;
import p097ds.AbstractC12314q;
import p098dt.C12355g;
import p108e4.AbstractC12682p;
import p154fs.AbstractC14733k;
import p249jc.AbstractC21598x;
import p347ns.C27081b;
import p347ns.C27082c;
import p347ns.C27083d;
import p347ns.C27084e;
import p347ns.C27085f;
import p437qt.C30581d;
import p437qt.InterfaceC30584g;
import p474s.AbstractC31967i2;
import p474s.C31943c2;
import p474s.C31992p;
import p479s4.AbstractC32122c;
import p543v4.AbstractC35642a;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p581we.C37199o;
import p659ys.C39741c;
import p659ys.C39742d;
import p688zp.C40937a;
import p691zs.C41073a;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30120b1;
import qa3.C30122c0;
import qa3.C30129e1;
import qa3.C30136h;
import qa3.C30146k0;
import qa3.C30154o;
import qa3.C30171w0;
import qa3.C30172x;
import qa3.EnumC30142j;
import r93.InterfaceC31155s0;
import sa3.AbstractC32330d;
import sa3.C32331e;
import sa3.C32334h;
import sa3.InterfaceC32332f;
import so.C32785b;
import so.C32787d;
import so.C32797n;
import so.C32798o;
import so.C32800q;
import so.ExecutorC32799p;
import st.InterfaceC32956a;
import ta3.AbstractC33686l;
import ta3.C33678d;
import ta3.C33680f;
import tt.C34147a;
import tt.C34149c;
import tt.InterfaceC34150d;
import u93.C34673e0;
import ua3.AbstractC34722b;
import ua3.C34725e;
import ua3.C34727g;
import va3.AbstractC35844b;
import va3.AbstractC35854l;
import va3.C35845c;
import w93.C36968a;
import w93.C36969b;
import wa3.AbstractC37006m;
import wa3.C36998i;
import wa3.C37010o;
import wa3.InterfaceC37019v;
import x93.AbstractC38109c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C5099k0 implements InterfaceC5105n0, InterfaceC20427a, InterfaceC17103a, InterfaceC17107c {

    /* JADX INFO: renamed from: E */
    public Object f21436E;

    /* JADX INFO: renamed from: F */
    public Object f21437F;

    /* JADX INFO: renamed from: w */
    public Object f21438w;

    /* JADX INFO: renamed from: x */
    public Object f21439x;

    /* JADX INFO: renamed from: y */
    public Object f21440y;

    /* JADX INFO: renamed from: z */
    public Object f21441z;

    public C5099k0(Set set, C0022g c0022g, String str, String str2, C40937a c40937a) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f21440y = setUnmodifiableSet;
        Map map = c0022g == null ? Collections.EMPTY_MAP : c0022g;
        this.f21439x = str;
        this.f21436E = str2;
        this.f21437F = c40937a == null ? C40937a.f176616w : c40937a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        this.f21441z = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: B */
    public static LayerDrawable m15977B(C31943c2 c31943c2, Context context, int i13) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i13);
        Drawable drawableM99425c = c31943c2.m99425c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM99425c2 = c31943c2.m99425c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM99425c instanceof BitmapDrawable) && drawableM99425c.getIntrinsicWidth() == dimensionPixelSize && drawableM99425c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM99425c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM99425c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM99425c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM99425c2 instanceof BitmapDrawable) && drawableM99425c2.getIntrinsicWidth() == dimensionPixelSize && drawableM99425c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM99425c2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM99425c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM99425c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: R */
    public static void m15978R(Drawable drawable, int i13, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C31992p.f132796b;
        }
        drawableMutate.setColorFilter(C31992p.m99506c(i13, mode));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15979b(int[] iArr, int i13) {
        for (int i14 : iArr) {
            if (i14 == i13) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static C5099k0 m15980m(String str, AbstractC5146i abstractC5146i, EnumC36385l3 enumC36385l3, EnumC36362h4 enumC36362h4, Integer num) throws GeneralSecurityException {
        if (enumC36362h4 == EnumC36362h4.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        C5099k0 c5099k0 = new C5099k0();
        c5099k0.f21439x = str;
        c5099k0.f21440y = AbstractC5113r0.m16079c(str);
        c5099k0.f21441z = abstractC5146i;
        c5099k0.f21436E = enumC36385l3;
        c5099k0.f21437F = enumC36362h4;
        c5099k0.f21438w = num;
        return c5099k0;
    }

    /* JADX INFO: renamed from: n */
    public static ColorStateList m15981n(Context context, int i13) {
        int iM99461c = AbstractC31967i2.m99461c(context, R.attr.colorControlHighlight);
        int iM99460b = AbstractC31967i2.m99460b(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC31967i2.f132716b;
        int[] iArr2 = AbstractC31967i2.f132718d;
        int iM112836e = AbstractC35642a.m112836e(iM99461c, i13);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC31967i2.f132717c, AbstractC31967i2.f132720f}, new int[]{iM99460b, iM112836e, AbstractC35642a.m112836e(iM99461c, i13), i13});
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ List m15982u(C5099k0 c5099k0, AbstractC17104a0 abstractC17104a0, C27775r c27775r, Boolean bool, boolean z4, int i13) {
        boolean z13 = (i13 & 4) == 0;
        if ((i13 & 16) != 0) {
            bool = null;
        }
        return c5099k0.m16012p(abstractC17104a0, c27775r, z13, false, bool, (i13 & 32) != 0 ? false : z4);
    }

    /* JADX INFO: renamed from: y */
    public static C27775r m15983y(InterfaceC37019v proto, InterfaceC32332f nameResolver, C32334h c32334h, int i13, boolean z4) {
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC18489d0.m53382w(i13, "kind");
        if (proto instanceof C30154o) {
            C36998i c36998i = C34727g.f146269a;
            C34725e c34725eM109649a = C34727g.m109649a((C30154o) proto, nameResolver, c32334h);
            if (c34725eM109649a != null) {
                return AbstractC12314q.m34341u(c34725eM109649a);
            }
        } else if (proto instanceof C30122c0) {
            C36998i c36998i2 = C34727g.f146269a;
            C34725e c34725eM109651c = C34727g.m109651c((C30122c0) proto, nameResolver, c32334h);
            if (c34725eM109651c != null) {
                return AbstractC12314q.m34341u(c34725eM109651c);
            }
        } else if (proto instanceof C30146k0) {
            C37010o propertySignature = AbstractC33686l.f140738d;
            AbstractC22676k.m65749i(propertySignature, "propertySignature");
            C33680f c33680f = (C33680f) AbstractC21478l0.m60453x((AbstractC37006m) proto, propertySignature);
            if (c33680f != null) {
                int iM35485e = AbstractC12682p.m35485e(i13);
                if (iM35485e == 1) {
                    return AbstractC11894a.m31934B((C30146k0) proto, nameResolver, c32334h, true, true, z4);
                }
                if (iM35485e != 2) {
                    if (iM35485e != 3 || (c33680f.f140695x & 8) != 8) {
                        return null;
                    }
                    C33678d c33678d = c33680f.f140690F;
                    AbstractC22676k.m65749i(c33678d, "getSetter(...)");
                    return AbstractC12314q.m34342v(nameResolver, c33678d);
                }
                if (c33680f.m106427i()) {
                    C33678d c33678d2 = c33680f.f140689E;
                    AbstractC22676k.m65749i(c33678d2, "getGetter(...)");
                    return AbstractC12314q.m34342v(nameResolver, c33678d2);
                }
            }
        }
        return null;
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: A */
    public ArrayList mo15984A(C30171w0 proto, InterfaceC32332f nameResolver) {
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        List list = proto.f123490R;
        AbstractC22676k.m65749i(list, "getAnnotationList(...)");
        List<C30136h> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C30136h c30136h : list2) {
            AbstractC22676k.m65747g(c30136h);
            arrayList.add(((C37199o) this.f21437F).m119229m(c30136h, nameResolver));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public ColorStateList m15985C(Context context, int i13) {
        if (i13 == R.drawable.abc_edit_text_material) {
            return AbstractC32122c.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i13 == 2131231237) {
            return AbstractC32122c.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i13 != R.drawable.abc_switch_thumb_material) {
            if (i13 == R.drawable.abc_btn_default_mtrl_shape) {
                return m15981n(context, AbstractC31967i2.m99461c(context, R.attr.colorButtonNormal));
            }
            if (i13 == R.drawable.abc_btn_borderless_material) {
                return m15981n(context, 0);
            }
            if (i13 == R.drawable.abc_btn_colored_material) {
                return m15981n(context, AbstractC31967i2.m99461c(context, R.attr.colorAccent));
            }
            if (i13 == 2131231232 || i13 == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC32122c.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (m15979b((int[]) this.f21440y, i13)) {
                return AbstractC31967i2.m99462d(context, R.attr.colorControlNormal);
            }
            if (m15979b((int[]) this.f21437F, i13)) {
                return AbstractC32122c.getColorStateList(context, R.color.abc_tint_default);
            }
            if (m15979b((int[]) this.f21438w, i13)) {
                return AbstractC32122c.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i13 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC32122c.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM99462d = AbstractC31967i2.m99462d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM99462d == null || !colorStateListM99462d.isStateful()) {
            iArr[0] = AbstractC31967i2.f132716b;
            iArr2[0] = AbstractC31967i2.m99460b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC31967i2.f132719e;
            iArr2[1] = AbstractC31967i2.m99461c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC31967i2.f132720f;
            iArr2[2] = AbstractC31967i2.m99461c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC31967i2.f132716b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM99462d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC31967i2.f132719e;
            iArr2[1] = AbstractC31967i2.m99461c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC31967i2.f132720f;
            iArr2[2] = colorStateListM99462d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: D */
    public boolean m15986D(C35845c classId) {
        C36969b c36969bM34252D;
        AbstractC22676k.m65750j(classId, "classId");
        if (classId.m113776e() != null && AbstractC22676k.m65745e(classId.m113777f().m113817b(), "Container") && (c36969bM34252D = AbstractC12313p.m34252D((C0929d) this.f21439x, classId, (C32331e) this.f21438w)) != null) {
            LinkedHashSet linkedHashSet = AbstractC26487a.f105199a;
            Class klass = c36969bM34252D.f158227a;
            AbstractC22676k.m65750j(klass, "klass");
            Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
            AbstractC22676k.m65749i(declaredAnnotations, "getDeclaredAnnotations(...)");
            boolean z4 = false;
            for (Annotation annotation : declaredAnnotations) {
                AbstractC22676k.m65747g(annotation);
                if (AbstractC38109c.m122089a(AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation))).equals(AbstractC14330w.f52305b)) {
                    z4 = true;
                }
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public C26645y m15987E() throws IOException {
        AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
        Object obj = AbstractC14421e.f52594a;
        InterfaceC14420d interfaceC14420d = obj != null ? (InterfaceC14420d) obj : null;
        Context contextMo41113a = interfaceC14420d != null ? interfaceC14420d.mo41113a() : null;
        AssetManager assets = contextMo41113a != null ? contextMo41113a.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream inputStreamOpen = assets.open((String) this.f21439x);
        AbstractC22676k.m65749i(inputStreamOpen, "open(...)");
        return AbstractC26604b.m79166k(inputStreamOpen);
    }

    /* JADX INFO: renamed from: F */
    public C25126d m15988F(C35845c c35845c, InterfaceC31155s0 interfaceC31155s0, List result) {
        AbstractC22676k.m65750j(result, "result");
        return new C25126d(this, AbstractC17269i.m48868O((C34673e0) this.f21441z, c35845c, (C41113q) this.f21436E), c35845c, result, interfaceC31155s0);
    }

    /* JADX INFO: renamed from: G */
    public C25126d m15989G(C35845c c35845c, C36968a c36968a, List result) {
        AbstractC22676k.m65750j(result, "result");
        if (AbstractC26487a.f105199a.contains(c35845c)) {
            return null;
        }
        return m15988F(c35845c, c36968a, result);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX INFO: renamed from: H */
    public Object m15990H(AbstractC17104a0 abstractC17104a0, C30146k0 c30146k0, int i13, AbstractC23811y abstractC23811y, InterfaceC4351m interfaceC4351m) {
        Object objInvoke;
        C36969b c36969bM36244J = AbstractC12889b.m36244J(abstractC17104a0, true, true, AbstractC32330d.f133786B.mo91233e(c30146k0.f123332z), C34727g.m109652d(c30146k0), (C0929d) this.f21439x, (C32331e) this.f21438w);
        if (c36969bM36244J == null) {
            if (abstractC17104a0 instanceof C17136y) {
                InterfaceC31155s0 interfaceC31155s0 = (InterfaceC31155s0) ((C17136y) abstractC17104a0).f65707z;
                C27774q c27774q = interfaceC31155s0 instanceof C27774q ? (C27774q) interfaceC31155s0 : null;
                if (c27774q != null) {
                    c36969bM36244J = c27774q.f111971w;
                } else {
                    c36969bM36244J = null;
                }
            } else {
                c36969bM36244J = null;
            }
        }
        if (c36969bM36244J != null) {
            C32331e c32331e = (C32331e) c36969bM36244J.f158228b.f117526e;
            C32331e version = C27763f.f111952e;
            AbstractC22676k.m65750j(version, "version");
            C27775r c27775rM15983y = m15983y(c30146k0, (InterfaceC32332f) abstractC17104a0.f65705x, (C32334h) abstractC17104a0.f65706y, i13, c32331e.m100625a(version.f133780b, version.f133781c, version.f133782d));
            if (c27775rM15983y != null && (objInvoke = interfaceC4351m.invoke(((C22336e) this.f21440y).invoke(c36969bM36244J), c27775rM15983y)) != null) {
                if (AbstractC27746r.m83842c(abstractC23811y)) {
                    objInvoke = (AbstractC0715g) objInvoke;
                    if (objInvoke instanceof C0712d) {
                        return new C0734z(((Number) ((C0712d) objInvoke).mo1777b()).byteValue());
                    }
                    if (objInvoke instanceof C0731w) {
                        return new C0734z(((Number) ((C0731w) objInvoke).mo1777b()).shortValue());
                    }
                    if (objInvoke instanceof C0719k) {
                        return new C0734z(((Number) ((C0719k) objInvoke).mo1777b()).intValue());
                    }
                    if (objInvoke instanceof C0729u) {
                        return new C0734z(((Number) ((C0729u) objInvoke).mo1777b()).longValue());
                    }
                }
                return objInvoke;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public List m15991I(AbstractC17104a0 abstractC17104a0, InterfaceC37019v interfaceC37019v, int i13, int i14) {
        C27775r c27775rM15983y = m15983y(interfaceC37019v, (InterfaceC32332f) abstractC17104a0.f65705x, (C32334h) abstractC17104a0.f65706y, i13, false);
        return c27775rM15983y == null ? C25271y.f99162w : m15982u(this, abstractC17104a0, AbstractC12314q.m34343w(c27775rM15983y, i14), null, false, 60);
    }

    /* JADX INFO: renamed from: J */
    public List m15992J(AbstractC17104a0 abstractC17104a0, C30146k0 c30146k0, EnumC27760c enumC27760c) {
        C32334h c32334h = (C32334h) abstractC17104a0.f65706y;
        InterfaceC32332f interfaceC32332f = (InterfaceC32332f) abstractC17104a0.f65705x;
        Boolean boolM100626g = AbstractC32330d.f133786B.mo91233e(c30146k0.f123332z);
        boolean zM109652d = C34727g.m109652d(c30146k0);
        if (enumC27760c == EnumC27760c.f111941w) {
            C27775r c27775rM31934B = AbstractC11894a.m31934B(c30146k0, interfaceC32332f, c32334h, (40 & 8) == 0, (40 & 16) == 0, true);
            if (c27775rM31934B != null) {
                return m15982u(this, abstractC17104a0, c27775rM31934B, boolM100626g, zM109652d, 8);
            }
        } else {
            C27775r c27775rM31934B2 = AbstractC11894a.m31934B(c30146k0, interfaceC32332f, c32334h, (40 & 8) == 0, (40 & 16) == 0, true);
            if (c27775rM31934B2 != null) {
                if (AbstractC39414r.m125876U(c27775rM31934B2.m83878a(), "$delegate", false) == (enumC27760c == EnumC27760c.f111943y)) {
                    return m16012p(abstractC17104a0, c27775rM31934B2, true, true, boolM100626g, zM109652d);
                }
            }
        }
        return C25271y.f99162w;
    }

    /* JADX INFO: renamed from: K */
    public void m15993K(boolean z4) {
        C20535s c20535sM56711a = ((C20579a) this.f21437F).m56711a();
        try {
            try {
                ((C20351h5) this.f21436E).mo56218c(new RunnableC1189s(this, 5), z4 ? 0 : ErrorCodes.WebsocketMethodErrors.cServerErrors);
            } catch (RejectedExecutionException e5) {
                ((C20513q6) this.f21439x).getLogger().mo16060j(EnumC20436n5.WARNING, "Metrics batch processor flush task rejected", e5);
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m15994L() {
        try {
            C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(m15987E());
            try {
                C26624l c26624lMo79218m0 = c26621j0M79158c.mo79218m0(c26621j0M79158c.readInt());
                C26624l c26624lMo79218m1 = c26621j0M79158c.mo79218m0(c26621j0M79158c.readInt());
                c26621j0M79158c.close();
                synchronized (this) {
                    AbstractC22676k.m65747g(c26624lMo79218m0);
                    this.f21436E = c26624lMo79218m0;
                    AbstractC22676k.m65747g(c26624lMo79218m1);
                    this.f21437F = c26624lMo79218m1;
                }
                ((CountDownLatch) this.f21441z).countDown();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(c26621j0M79158c, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            ((CountDownLatch) this.f21441z).countDown();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m15995M(int i13) throws InvalidAlgorithmParameterException {
        if (i13 != 16 && i13 != 24 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i13)));
        }
        this.f21438w = Integer.valueOf(i13);
    }

    /* JADX INFO: renamed from: N */
    public void m15996N(String str, String str2, Bundle bundle) {
        int i13;
        String str3;
        String strEncodeToString;
        boolean zM2311U;
        int i14;
        PackageInfo packageInfoM56017d;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        C12355g c12355g = (C12355g) this.f21439x;
        c12355g.m34610a();
        bundle.putString("gmp_app_id", c12355g.f41521c.f41534b);
        C20119j1 c20119j1 = (C20119j1) this.f21440y;
        synchronized (c20119j1) {
            try {
                if (c20119j1.f75584a == 0 && (packageInfoM56017d = c20119j1.m56017d("com.google.android.gms")) != null) {
                    c20119j1.f75584a = packageInfoM56017d.versionCode;
                }
                i13 = c20119j1.f75584a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        bundle.putString("gmsv", Integer.toString(i13));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C20119j1) this.f21440y).m56016b());
        C20119j1 c20119j2 = (C20119j1) this.f21440y;
        synchronized (c20119j2) {
            try {
                if (((String) c20119j2.f75588e) == null) {
                    c20119j2.m56019f();
                }
                str3 = (String) c20119j2.f75588e;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        bundle.putString("app_ver_name", str3);
        C12355g c12355g2 = (C12355g) this.f21439x;
        c12355g2.m34610a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(c12355g2.f41520b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((C34147a) Tasks.await(((C34149c) ((InterfaceC34150d) this.f21438w)).m107923d())).f143132a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e5) {
            e = e5;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e13) {
            e = e13;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(((C34149c) ((InterfaceC34150d) this.f21438w)).m107922c()));
        bundle.putString("cliv", "fcm-24.0.0");
        InterfaceC30584g interfaceC30584g = (InterfaceC30584g) ((InterfaceC32956a) this.f21437F).get();
        C3631b c3631b = (C3631b) ((InterfaceC32956a) this.f21436E).get();
        if (interfaceC30584g == null || c3631b == null) {
            return;
        }
        C30581d c30581d = (C30581d) interfaceC30584g;
        synchronized (c30581d) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0928c c0928c = (C0928c) c30581d.f125826a.get();
            synchronized (c0928c) {
                zM2311U = c0928c.m2311U(jCurrentTimeMillis);
            }
            if (zM2311U) {
                synchronized (c0928c) {
                    String strM2300I = c0928c.m2300I(System.currentTimeMillis());
                    ((SharedPreferences) c0928c.f3421x).edit().putString("last-used-date", strM2300I).commit();
                    c0928c.m2309S(strM2300I);
                }
                i14 = 3;
            } else {
                i14 = 1;
            }
        }
        if (i14 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(AbstractC12682p.m35485e(i14)));
            bundle.putString("Firebase-Client", c3631b.m11151a());
        }
    }

    /* JADX INFO: renamed from: O */
    public void m15997O(AbstractC14733k abstractC14733k) throws GeneralSecurityException {
        if (C27085f.f108262g.contains(abstractC14733k)) {
            this.f21437F = abstractC14733k;
            return;
        }
        throw new GeneralSecurityException("Invalid DEM parameters " + abstractC14733k + "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported.");
    }

    /* JADX INFO: renamed from: P */
    public void m15998P(int i13) throws InvalidAlgorithmParameterException {
        if (i13 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i13)));
        }
        this.f21439x = Integer.valueOf(i13);
    }

    /* JADX INFO: renamed from: Q */
    public void m15999Q(int i13) throws GeneralSecurityException {
        if (i13 < 12 || i13 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i13)));
        }
        this.f21440y = Integer.valueOf(i13);
    }

    /* JADX INFO: renamed from: S */
    public void m16000S(int i13) throws GeneralSecurityException {
        if (i13 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i13)));
        }
        this.f21441z = Integer.valueOf(i13);
    }

    /* JADX INFO: renamed from: T */
    public Task m16001T(String str, String str2, Bundle bundle) {
        int i13;
        try {
            m15996N(str, str2, bundle);
            C32785b c32785b = (C32785b) this.f21441z;
            ExecutorC32799p executorC32799p = ExecutorC32799p.f136503w;
            C4497a0 c4497a0 = c32785b.f136468c;
            if (c4497a0.m14109b() < 12000000) {
                return c4497a0.m14110d() != 0 ? c32785b.m102845a(bundle).continueWithTask(executorC32799p, new C32800q(c32785b, bundle)) : Tasks.m15639c(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            C32798o c32798oM102855b = C32798o.m102855b(c32785b.f136467b);
            synchronized (c32798oM102855b) {
                i13 = c32798oM102855b.f136499a;
                c32798oM102855b.f136499a = i13 + 1;
            }
            return c32798oM102855b.m102857c(new C32797n(i13, 1, bundle, 1)).continueWith(executorC32799p, C32787d.f136474w);
        } catch (InterruptedException | ExecutionException e5) {
            return Tasks.m15639c(e5);
        }
    }

    @Override // io.sentry.metrics.InterfaceC20427a
    /* JADX INFO: renamed from: a */
    public void mo16002a(boolean z4) {
        C20351h5 c20351h5 = (C20351h5) this.f21436E;
        if (z4) {
            m15993K(true);
            c20351h5.submit(new RunnableC20277c7(this, 14));
        } else {
            c20351h5.mo56216a(((C20513q6) this.f21439x).getShutdownTimeoutMillis());
            while (!((ConcurrentLinkedQueue) this.f21441z).isEmpty()) {
                m16019x();
            }
        }
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: c */
    public List mo16003c(AbstractC17104a0 abstractC17104a0, C30146k0 c30146k0) {
        return m15992J(abstractC17104a0, c30146k0, EnumC27760c.f111943y);
    }

    @Override // io.sentry.metrics.InterfaceC20427a
    /* JADX INFO: renamed from: d */
    public void mo16004d(long j7) {
        m15993K(true);
        try {
            C0928c c0928c = (C0928c) this.f21438w;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c0928c.getClass();
            ((C20568r) c0928c.f3421x).tryAcquireSharedNanos(1, timeUnit.toNanos(j7));
        } catch (InterruptedException e5) {
            ((C20513q6) this.f21439x).getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to flush metrics events", e5);
            Thread.currentThread().interrupt();
        }
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: e */
    public List mo16005e(AbstractC17104a0 abstractC17104a0, C30146k0 c30146k0) {
        return m15992J(abstractC17104a0, c30146k0, EnumC27760c.f111942x);
    }

    /* JADX INFO: renamed from: f */
    public C16141k m16006f() throws GeneralSecurityException {
        if (((Integer) this.f21438w) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f21439x) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f21440y) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f21441z;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((C16139j) this.f21436E) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((C16139j) this.f21437F) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        C16139j c16139j = (C16139j) this.f21436E;
        if (c16139j == C16139j.f61296c) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (c16139j == C16139j.f61297d) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (c16139j == C16139j.f61298e) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (c16139j == C16139j.f61299f) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (c16139j != C16139j.f61300g) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new C16141k(((Integer) this.f21438w).intValue(), ((Integer) this.f21439x).intValue(), ((Integer) this.f21440y).intValue(), ((Integer) this.f21441z).intValue(), (C16139j) this.f21437F, (C16139j) this.f21436E);
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: g */
    public ArrayList mo16007g(C17136y container) {
        AbstractC22676k.m65750j(container, "container");
        InterfaceC31155s0 interfaceC31155s0 = (InterfaceC31155s0) container.f65707z;
        C27774q c27774q = interfaceC31155s0 instanceof C27774q ? (C27774q) interfaceC31155s0 : null;
        C36969b c36969b = c27774q != null ? c27774q.f111971w : null;
        if (c36969b == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + container.f65807G.m113773a()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class klass = c36969b.f158227a;
        AbstractC22676k.m65750j(klass, "klass");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        AbstractC22676k.m65749i(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            AbstractC22676k.m65747g(annotation);
            Class clsM60663S = AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation));
            C25126d c25126dM15989G = m15989G(AbstractC38109c.m122089a(clsM60663S), new C36968a(annotation), arrayList);
            if (c25126dM15989G != null) {
                AbstractC35844b.m113768i(c25126dM15989G, annotation, clsM60663S);
            }
        }
        return arrayList;
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: h */
    public List mo16008h(AbstractC17104a0 abstractC17104a0, InterfaceC37019v proto, int i13) {
        int size;
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC18489d0.m53382w(i13, "kind");
        if (proto instanceof C30122c0) {
            size = ((C30122c0) proto).f123046O.size();
        } else {
            size = proto instanceof C30146k0 ? ((C30146k0) proto).f123314O.size() : 0;
        }
        return m15991I(abstractC17104a0, proto, i13, size);
    }

    /* JADX INFO: renamed from: j */
    public C27085f m16009j() throws GeneralSecurityException {
        C27081b c27081b = (C27081b) this.f21439x;
        if (c27081b == null) {
            throw new GeneralSecurityException("Elliptic curve type is not set");
        }
        if (((C27082c) this.f21441z) == null) {
            throw new GeneralSecurityException("Hash type is not set");
        }
        if (((AbstractC14733k) this.f21437F) == null) {
            throw new GeneralSecurityException("DEM parameters are not set");
        }
        if (((C27084e) this.f21438w) == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        C27081b c27081b2 = C27081b.f108246e;
        if (c27081b != c27081b2 && ((C27083d) this.f21436E) == null) {
            throw new GeneralSecurityException("Point format is not set");
        }
        if (c27081b != c27081b2 || ((C27083d) this.f21436E) == null) {
            return new C27085f((C27081b) this.f21439x, (C27082c) this.f21441z, (C27083d) this.f21436E, (AbstractC14733k) this.f21437F, (C27084e) this.f21438w, (C11105a) this.f21440y);
        }
        throw new GeneralSecurityException("For Curve25519 point format must not be set");
    }

    /* JADX INFO: renamed from: l */
    public C39742d m16010l() throws GeneralSecurityException {
        if (((Integer) this.f21438w) == null) {
            throw new GeneralSecurityException("keySizeBytes needs to be set");
        }
        Integer num = (Integer) this.f21439x;
        if (num == null) {
            throw new GeneralSecurityException("derivedKeySizeBytes needs to be set");
        }
        if (((C39741c) this.f21440y) == null) {
            throw new GeneralSecurityException("hkdfHashType needs to be set");
        }
        if (((C39741c) this.f21441z) == null) {
            throw new GeneralSecurityException("hmacHashType needs to be set");
        }
        if (((Integer) this.f21436E) == null) {
            throw new GeneralSecurityException("hmacTagSizeBytes needs to be set");
        }
        if (((Integer) this.f21437F) == null) {
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
        }
        if (num.intValue() != 16 && ((Integer) this.f21439x).intValue() != 32) {
            throw new GeneralSecurityException("derivedKeySizeBytes needs to be 16 or 32, not " + ((Integer) this.f21439x));
        }
        if (((Integer) this.f21438w).intValue() < ((Integer) this.f21439x).intValue()) {
            throw new GeneralSecurityException("keySizeBytes needs to be at least derivedKeySizeBytes, i.e., " + ((Integer) this.f21439x));
        }
        if (((Integer) this.f21437F).intValue() <= ((Integer) this.f21436E).intValue() + ((Integer) this.f21439x).intValue() + 8) {
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedKeySizeBytes + hmacTagSizeBytes + 9, i.e., " + (((Integer) this.f21436E).intValue() + ((Integer) this.f21439x).intValue() + 9));
        }
        C39741c c39741c = (C39741c) this.f21441z;
        int i13 = c39741c != C39741c.f171098d ? c39741c == C39741c.f171097c ? 20 : 0 : 32;
        if (c39741c == C39741c.f171099e) {
            i13 = 64;
        }
        if (((Integer) this.f21436E).intValue() >= 10 && ((Integer) this.f21436E).intValue() <= i13) {
            return new C39742d((Integer) this.f21438w, (Integer) this.f21439x, (C39741c) this.f21440y, (C39741c) this.f21441z, (Integer) this.f21436E, (Integer) this.f21437F);
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "hmacTagSize must be in range [10, ", "], but is ");
        sbM30466t.append((Integer) this.f21436E);
        throw new GeneralSecurityException(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: o */
    public Task m16011o(Task task) {
        return task.continueWith(new ExecutorC1651b(0), new C41073a(this));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX INFO: renamed from: p */
    public List m16012p(AbstractC17104a0 abstractC17104a0, C27775r c27775r, boolean z4, boolean z13, Boolean bool, boolean z14) {
        List list;
        C36969b c36969bM36244J = AbstractC12889b.m36244J(abstractC17104a0, z4, z13, bool, z14, (C0929d) this.f21439x, (C32331e) this.f21438w);
        if (c36969bM36244J == null) {
            if (abstractC17104a0 instanceof C17136y) {
                InterfaceC31155s0 interfaceC31155s0 = (InterfaceC31155s0) ((C17136y) abstractC17104a0).f65707z;
                C27774q c27774q = interfaceC31155s0 instanceof C27774q ? (C27774q) interfaceC31155s0 : null;
                if (c27774q != null) {
                    c36969bM36244J = c27774q.f111971w;
                } else {
                    c36969bM36244J = null;
                }
            } else {
                c36969bM36244J = null;
            }
        }
        return (c36969bM36244J == null || (list = (List) ((HashMap) ((C27761d) ((C22336e) this.f21440y).invoke(c36969bM36244J)).m83859a()).get(c27775r)) == null) ? C25271y.f99162w : list;
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: q */
    public List mo16013q(AbstractC17104a0 abstractC17104a0, InterfaceC37019v proto, int i13) {
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC18489d0.m53382w(i13, "kind");
        if (i13 == 2) {
            return m15992J(abstractC17104a0, (C30146k0) proto, EnumC27760c.f111941w);
        }
        C27775r c27775rM15983y = m15983y(proto, (InterfaceC32332f) abstractC17104a0.f65705x, (C32334h) abstractC17104a0.f65706y, i13, false);
        return c27775rM15983y == null ? C25271y.f99162w : m15982u(this, abstractC17104a0, c27775rM15983y, null, false, 60);
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: r */
    public ArrayList mo16014r(C30120b1 proto, InterfaceC32332f nameResolver) {
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        List list = proto.f123016K;
        AbstractC22676k.m65749i(list, "getAnnotationList(...)");
        List<C30136h> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C30136h c30136h : list2) {
            AbstractC22676k.m65747g(c30136h);
            arrayList.add(((C37199o) this.f21437F).m119229m(c30136h, nameResolver));
        }
        return arrayList;
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: s */
    public List mo16015s(AbstractC17104a0 container, C30172x c30172x) {
        AbstractC22676k.m65750j(container, "container");
        return m15982u(this, container, AbstractC12314q.m34340t(((InterfaceC32332f) container.f65705x).getString(c30172x.f123503z), AbstractC34722b.m109647b(((C17136y) container).f65807G.m113774b())), null, false, 60);
    }

    @Override // hb3.InterfaceC17103a
    /* JADX INFO: renamed from: t */
    public Object mo16016t(AbstractC17104a0 abstractC17104a0, C30146k0 c30146k0, AbstractC23811y abstractC23811y) {
        return m15990H(abstractC17104a0, c30146k0, 2, abstractC23811y, C27758a.f111938y);
    }

    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: v */
    public List mo16017v(AbstractC17104a0 abstractC17104a0, InterfaceC37019v callableProto, int i13, int i14, C30129e1 c30129e1) {
        AbstractC22676k.m65750j(callableProto, "callableProto");
        AbstractC18489d0.m53382w(i13, "kind");
        return m15991I(abstractC17104a0, callableProto, i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    @Override // hb3.InterfaceC17107c
    /* JADX INFO: renamed from: w */
    public List mo16018w(AbstractC17104a0 abstractC17104a0, InterfaceC37019v callableProto, int i13, int i14, C30129e1 c30129e1) {
        int size;
        AbstractC22676k.m65750j(callableProto, "callableProto");
        AbstractC18489d0.m53382w(i13, "kind");
        boolean z4 = callableProto instanceof C30122c0;
        int i15 = 0;
        if (z4) {
            size = ((C30122c0) callableProto).f123046O.size();
        } else {
            size = callableProto instanceof C30146k0 ? ((C30146k0) callableProto).f123314O.size() : 0;
        }
        if (z4) {
            int i16 = ((C30122c0) callableProto).f123057y;
            if ((i16 & 32) == 32 || (i16 & 64) == 64) {
                i15 = 1;
            }
        } else if (callableProto instanceof C30146k0) {
            int i17 = ((C30146k0) callableProto).f123331y;
            if ((i17 & 32) == 32 || (i17 & 64) == 64) {
                i15 = 1;
            }
        } else {
            if (!(callableProto instanceof C30154o)) {
                throw new UnsupportedOperationException("Unsupported message: " + callableProto.getClass());
            }
            C17136y c17136y = (C17136y) abstractC17104a0;
            if (c17136y.f65808H == EnumC30142j.ENUM_CLASS) {
                i15 = 2;
            } else if (c17136y.f65809I) {
                i15 = 1;
            }
        }
        return m15991I(abstractC17104a0, callableProto, i13, size + i15 + i14);
    }

    /* JADX INFO: renamed from: x */
    public void m16019x() {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f21441z;
        ArrayList arrayList = new ArrayList(1000);
        do {
            C20607v5 c20607v5 = (C20607v5) concurrentLinkedQueue.poll();
            if (c20607v5 != null) {
                arrayList.add(c20607v5);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        C4455g c4455g = (C4455g) this.f21440y;
        C20620w5 c20620w5 = new C20620w5(arrayList);
        c4455g.getClass();
        try {
            c4455g.m13934H(c4455g.m13956v(c20620w5), null);
        } catch (IOException e5) {
            ((C20513q6) c4455g.f17962x).getLogger().mo16058i(EnumC20436n5.WARNING, e5, "Capturing metrics failed.", new Object[0]);
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            C20568r c20568r = (C20568r) ((C0928c) this.f21438w).f3421x;
            int i14 = C20568r.f77048w;
            c20568r.releaseShared(1);
        }
    }

    @Override // hb3.InterfaceC17103a
    /* JADX INFO: renamed from: z */
    public Object mo16020z(AbstractC17104a0 abstractC17104a0, C30146k0 c30146k0, AbstractC23811y abstractC23811y) {
        return m15990H(abstractC17104a0, c30146k0, 3, abstractC23811y, C27758a.f111937x);
    }

    public C5099k0(int i13) {
        switch (i13) {
            case 6:
                this.f21439x = new int[]{2131231247, 2131231245, 2131231171};
                this.f21440y = new int[]{2131231195, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f21441z = new int[]{2131231244, 2131231246, 2131231188, R.drawable.abc_text_cursor_material, 2131231241, 2131231242, 2131231243};
                this.f21436E = new int[]{2131231220, R.drawable.abc_cab_background_internal_bg, 2131231219};
                this.f21437F = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f21438w = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
            default:
                this.f21440y = new AtomicBoolean(false);
                this.f21441z = new CountDownLatch(1);
                this.f21439x = "PublicSuffixDatabase.list";
                break;
        }
    }

    public C5099k0(C20513q6 c20513q6, C4455g c4455g) {
        this.f21437F = new C20579a();
        this.f21438w = new C0928c(17, (byte) 0);
        this.f21439x = c20513q6;
        this.f21440y = c4455g;
        this.f21441z = new ConcurrentLinkedQueue();
        this.f21436E = new C20351h5(c20513q6);
    }
}

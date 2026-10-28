package pr2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.util.avatar.AvatarApi;
import g93.AbstractC15612d;
import g93.C15611c;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Locale;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34842t0;
import ud3.C34844u0;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.C39412p;

/* JADX INFO: renamed from: pr2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lpr2/f;", "", "<init>", "()V", "Ll83/k;", "", "f", "()Ll83/k;", "", "firstName", "lastName", "Landroid/graphics/Bitmap;", "e", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "bitmap", "", "c", "(Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/util/avatar/AvatarApi;", "avatarApi", "jpegBytes", "Lpr2/d;", "g", "(Lcom/whoop/util/avatar/AvatarApi;[BLq83/d;)Ljava/lang/Object;", "d", "(Lcom/whoop/util/avatar/AvatarApi;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "b", "Ltr2/n;", "logger", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29498f {

    /* JADX INFO: renamed from: a */
    public static final C29498f f119932a = new C29498f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("AvatarUrlUtil");

    /* JADX INFO: renamed from: pr2.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarUrlUtil$bitmapToJpegBytes$2", m100430f = "AvatarUrlUtil.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)[B"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119934w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Bitmap f119935x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119935x = bitmap;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f119935x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super byte[]> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119934w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                boolean zCompress = this.f119935x.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                byte[] byteArray = zCompress ? byteArrayOutputStream.toByteArray() : null;
                C29498f.logger.mo85228t("Bitmap compression success: " + zCompress + ", resulting bytes: " + (byteArray != null ? byteArray.length : 0), new AbstractC30556a.a[0]);
                return byteArray;
            } catch (Exception e5) {
                C29498f.logger.mo85230v("Error converting bitmap to JPEG", e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: pr2.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarUrlUtil", m100430f = "AvatarUrlUtil.kt", m100431l = {115, 121, 127}, m100432m = "generateAndUploadAvatar$core_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f119936E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f119937F;

        /* JADX INFO: renamed from: H */
        int f119939H;

        /* JADX INFO: renamed from: w */
        Object f119940w;

        /* JADX INFO: renamed from: x */
        Object f119941x;

        /* JADX INFO: renamed from: y */
        Object f119942y;

        /* JADX INFO: renamed from: z */
        Object f119943z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119937F = obj;
            this.f119939H |= Integer.MIN_VALUE;
            return C29498f.this.m90127d(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: pr2.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarUrlUtil$generateInitialsBitmap$2", m100430f = "AvatarUrlUtil.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lbc3/c0;)Landroid/graphics/Bitmap;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119944w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f119945x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f119946y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119945x = str;
            this.f119946y = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f119945x, this.f119946y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119944w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                String str = this.f119945x;
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                char cM125882a0 = AbstractC39414r.m125882a0(upperCase);
                String upperCase2 = this.f119946y.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                char cM125882a1 = AbstractC39414r.m125882a0(upperCase2);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(cM125882a0);
                sb4.append(cM125882a1);
                String string = sb4.toString();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(280, 280, Bitmap.Config.ARGB_8888);
                AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                C23465k c23465kM90125f = C29498f.f119932a.m90125f();
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 280.0f, 280.0f, ((Number) c23465kM90125f.f92937w).intValue(), ((Number) c23465kM90125f.f92938x).intValue(), Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                paint.setShader(linearGradient);
                canvas.drawCircle(140.0f, 140.0f, 140.0f, paint);
                Paint paint2 = new Paint(1);
                paint2.setColor(-16777216);
                paint2.setTextSize(106.4f);
                paint2.setFontFeatureSettings("sans-serif");
                paint2.setTypeface(Typeface.DEFAULT_BOLD);
                paint2.setTextAlign(Paint.Align.CENTER);
                Rect rect = new Rect();
                paint2.getTextBounds(string, 0, string.length(), rect);
                canvas.drawText(string, 140.0f, (rect.height() / 2.0f) + 140.0f, paint2);
                return bitmapCreateBitmap;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: pr2.f$d */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarUrlUtil", m100430f = "AvatarUrlUtil.kt", m100431l = {97}, m100432m = "uploadAvatarBytes$core_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f119948F;

        /* JADX INFO: renamed from: w */
        Object f119949w;

        /* JADX INFO: renamed from: x */
        Object f119950x;

        /* JADX INFO: renamed from: y */
        Object f119951y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f119952z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119952z = obj;
            this.f119948F |= Integer.MIN_VALUE;
            return C29498f.this.m90129g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: pr2.f$e */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarUrlUtil$uploadAvatarBytes$2", m100430f = "AvatarUrlUtil.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f119953w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AvatarApi f119954x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34846v0 f119955y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AvatarApi avatarApi, AbstractC34846v0 abstractC34846v0, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f119954x = avatarApi;
            this.f119955y = abstractC34846v0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f119954x, this.f119955y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119953w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AvatarApi avatarApi = this.f119954x;
            AbstractC34846v0 abstractC34846v0 = this.f119955y;
            this.f119953w = 1;
            Object objUploadAvatar = avatarApi.uploadAvatar(abstractC34846v0, this);
            return objUploadAvatar == enumC31071a ? enumC31071a : objUploadAvatar;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    private C29498f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final C23465k m90125f() {
        List listM118959K = AbstractC37056f.m118959K(new C23465k(Integer.valueOf(Color.parseColor("#42ABE7")), Integer.valueOf(Color.parseColor("#79FFD1"))), new C23465k(Integer.valueOf(Color.parseColor("#EBB681")), Integer.valueOf(Color.parseColor("#FF897A"))), new C23465k(Integer.valueOf(Color.parseColor("#D2FF8E")), Integer.valueOf(Color.parseColor("#FFF194"))), new C23465k(Integer.valueOf(Color.parseColor("#A38EFF")), Integer.valueOf(Color.parseColor("#94A7FF"))), new C23465k(Integer.valueOf(Color.parseColor("#B2FF8E")), Integer.valueOf(Color.parseColor("#94FFDF"))), new C23465k(Integer.valueOf(Color.parseColor("#FF8EDB")), Integer.valueOf(Color.parseColor("#FF9494"))), new C23465k(Integer.valueOf(Color.parseColor("#A88EFF")), Integer.valueOf(Color.parseColor("#B529BA"))), new C23465k(Integer.valueOf(Color.parseColor("#FF652A")), Integer.valueOf(Color.parseColor("#FFD68E"))), new C23465k(Integer.valueOf(Color.parseColor("#D2FF8E")), Integer.valueOf(Color.parseColor("#2B36FF"))), new C23465k(Integer.valueOf(Color.parseColor("#81ECEC")), Integer.valueOf(Color.parseColor("#00CEC9"))), new C23465k(Integer.valueOf(Color.parseColor("#8EC8FF")), Integer.valueOf(Color.parseColor("#FA94FF"))), new C23465k(Integer.valueOf(Color.parseColor("#FF875F")), Integer.valueOf(Color.parseColor("#FF595C"))), new C23465k(Integer.valueOf(Color.parseColor("#6485FF")), Integer.valueOf(Color.parseColor("#412CFF"))), new C23465k(Integer.valueOf(Color.parseColor("#864AFF")), Integer.valueOf(Color.parseColor("#5500FF"))), new C23465k(Integer.valueOf(Color.parseColor("#8EFFA6")), Integer.valueOf(Color.parseColor("#3CECFF"))), new C23465k(Integer.valueOf(Color.parseColor("#FF8ED0")), Integer.valueOf(Color.parseColor("#C225D7"))), new C23465k(Integer.valueOf(Color.parseColor("#FFC38E")), Integer.valueOf(Color.parseColor("#4934D3"))), new C23465k(Integer.valueOf(Color.parseColor("#8EB2FF")), Integer.valueOf(Color.parseColor("#8833FF"))), new C23465k(Integer.valueOf(Color.parseColor("#FF8E8E")), Integer.valueOf(Color.parseColor("#B2266A"))), new C23465k(Integer.valueOf(Color.parseColor("#FFCD7B")), Integer.valueOf(Color.parseColor("#30E04E"))), new C23465k(Integer.valueOf(Color.parseColor("#48FF95")), Integer.valueOf(Color.parseColor("#128A4A"))));
        C15611c c15611c = AbstractC15612d.f58612w;
        return (C23465k) AbstractC25265s.m74131i1(listM118959K);
    }

    /* JADX INFO: renamed from: c */
    public final Object m90126c(Bitmap bitmap, InterfaceC30057d<? super byte[]> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new a(bitmap, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m90127d(AvatarApi avatarApi, String str, String str2, InterfaceC30057d<? super InterfaceC29496d> interfaceC30057d) {
        b bVar;
        byte[] bArr;
        Object objM90129g;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f119939H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f119939H = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM90128e = bVar.f119937F;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f119939H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM90128e);
            bVar.f119940w = avatarApi;
            bVar.f119941x = null;
            bVar.f119942y = null;
            bVar.f119939H = 1;
            objM90128e = m90128e(str, str2, bVar);
            if (objM90128e != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            avatarApi = (AvatarApi) bVar.f119940w;
            AbstractC34132o.m107864I(objM90128e);
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM90128e);
                return objM90128e;
            }
            avatarApi = (AvatarApi) bVar.f119940w;
            AbstractC34132o.m107864I(objM90128e);
        }
        bArr = (byte[]) objM90128e;
        if (bArr == null) {
            return new InterfaceC29496d.a("Could not convert avatar to JPEG", new RuntimeException("Failed to convert bitmap to JPEG"));
        }
        bVar.f119940w = null;
        bVar.f119941x = null;
        bVar.f119942y = null;
        bVar.f119943z = null;
        bVar.f119936E = null;
        bVar.f119939H = 3;
        objM90129g = m90129g(avatarApi, bArr, bVar);
        if (objM90129g != obj) {
            return obj;
        }
        return objM90129g;
        Bitmap bitmap = (Bitmap) objM90128e;
        if (bitmap == null) {
            return new InterfaceC29496d.a("Could not create avatar bitmap", new RuntimeException("Failed to generate initials bitmap"));
        }
        bVar.f119940w = avatarApi;
        bVar.f119941x = null;
        bVar.f119942y = null;
        bVar.f119943z = null;
        bVar.f119939H = 2;
        objM90128e = m90126c(bitmap, bVar);
        if (objM90128e != obj) {
            bArr = (byte[]) objM90128e;
            if (bArr == null) {
                return new InterfaceC29496d.a("Could not convert avatar to JPEG", new RuntimeException("Failed to convert bitmap to JPEG"));
            }
            bVar.f119940w = null;
            bVar.f119941x = null;
            bVar.f119942y = null;
            bVar.f119943z = null;
            bVar.f119936E = null;
            bVar.f119939H = 3;
            objM90129g = m90129g(avatarApi, bArr, bVar);
            if (objM90129g != obj) {
                return objM90129g;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final Object m90128e(String str, String str2, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
        if (str.length() == 0 || str2.length() == 0) {
            return null;
        }
        return AbstractC3006f0.m8705K(AbstractC3050q0.f12077a, new c(str, str2, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m90129g(AvatarApi avatarApi, byte[] bArr, InterfaceC30057d<? super InterfaceC29496d> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f119948F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f119948F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f119952z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f119948F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            C34844u0 c34844u0 = AbstractC34846v0.Companion;
            C39412p c39412p = C34818h0.f146589e;
            C34842t0 c34842t0M109927d = C34844u0.m109927d(c34844u0, bArr, AbstractC1772c1.m5373J("image/jpeg"), 0, 6);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = logger;
            e eVar = new e(avatarApi, c34842t0M109927d, null);
            dVar2.f119949w = null;
            dVar2.f119950x = null;
            dVar2.f119951y = null;
            dVar2.f119948F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to upload avatar", eVar, dVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC29496d.b("Avatar uploaded successfully");
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new InterfaceC29496d.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}

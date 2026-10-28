package bd2;

import ad2.AbstractC0752a;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import fd2.EnumC14403a;
import fd2.EnumC14404b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C26047n;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import va3.AbstractC35854l;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: bd2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000  2\u00020\u0001:\u0001*B\u0089\u0001\u0012 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002\u0012 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b \u0010!J(\u0010\"\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\"\u0010!J(\u0010#\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b#\u0010!J(\u0010$\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b$\u0010!R,\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R,\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010,¨\u0006-"}, m65681d2 = {"Lbd2/a;", "", "Lkotlin/Function3;", "Landroid/content/Context;", "", "", "Landroid/widget/Toast;", "makeToast", "Ljava/io/File;", "Landroid/net/Uri;", "getUriForFile", "Lkotlin/Function1;", "getDefaultSmsPackage", "Ltr2/n;", "logger", "Lkotlin/Function2;", "Lfd2/a;", "Lfd2/b;", "Ll83/a0;", "onShareActionOutcome", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Ltr2/n;Lc93/m;)V", "context", "uri", "Landroid/content/Intent;", "e", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Landroid/graphics/Bitmap;", "bitmap", "filename", "j", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/net/Uri;", "f", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "a", "Lkotlin/jvm/functions/Function3;", "b", "c", "Lkotlin/jvm/functions/Function1;", "d", "Ltr2/n;", "Lc93/m;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3108a {

    /* JADX INFO: renamed from: g */
    public static final int f12157g = 8;

    /* JADX INFO: renamed from: h */
    private static final String f12158h = AbstractC2875y.m8299l(Environment.DIRECTORY_PICTURES, "/WHOOP");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function3 makeToast;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function3 getUriForFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 getDefaultSmsPackage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC4351m onShareActionOutcome;

    /* JADX INFO: renamed from: bd2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements Function3 {

        /* JADX INFO: renamed from: w */
        public static final a f12164w = new a();

        public a() {
            super(3, AbstractC3109b.class, "defaultMakeToast", "defaultMakeToast(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/Toast;", 1);
        }

        /* JADX INFO: renamed from: a */
        public final Toast m8935a(Context p13, String p14, int i13) {
            AbstractC22676k.m65750j(p13, "p0");
            AbstractC22676k.m65750j(p14, "p1");
            return AbstractC3109b.m8941d(p13, p14, i13);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m8935a((Context) obj, (String) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: bd2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b extends C22672i implements Function3 {

        /* JADX INFO: renamed from: w */
        public static final b f12165w = new b();

        public b() {
            super(3, FileProvider.class, "getUriForFile", "getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;", 0);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(Context p13, String p14, File p15) {
            AbstractC22676k.m65750j(p13, "p0");
            AbstractC22676k.m65750j(p14, "p1");
            AbstractC22676k.m65750j(p15, "p2");
            return FileProvider.getUriForFile(p13, p14, p15);
        }
    }

    /* JADX INFO: renamed from: bd2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c extends C22672i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f12166w = new c();

        public c() {
            super(1, AbstractC3109b.class, "defaultGetDefaultSmsPackage", "defaultGetDefaultSmsPackage(Landroid/content/Context;)Ljava/lang/String;", 1);
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Context p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return AbstractC3109b.m8940c(p13);
        }
    }

    /* JADX INFO: renamed from: bd2.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.share.action.ShareActionsHelper", m100430f = "ShareActionsHelper.kt", m100431l = {42}, m100432m = "handleCopy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f12168F;

        /* JADX INFO: renamed from: w */
        Object f12169w;

        /* JADX INFO: renamed from: x */
        Object f12170x;

        /* JADX INFO: renamed from: y */
        Object f12171y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f12172z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f12172z = obj;
            this.f12168F |= Integer.MIN_VALUE;
            return C3108a.this.m8931f(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: bd2.a$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.share.action.ShareActionsHelper$handleCopy$uri$1", m100430f = "ShareActionsHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/net/Uri;", "<anonymous>", "(Lbc3/c0;)Landroid/net/Uri;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f12173E;

        /* JADX INFO: renamed from: w */
        int f12174w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Context f12176y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Bitmap f12177z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context, Bitmap bitmap, String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12176y = context;
            this.f12177z = bitmap;
            this.f12173E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C3108a.this.new f(this.f12176y, this.f12177z, this.f12173E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Uri> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12174w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C3108a.this.m8930j(this.f12176y, this.f12177z, this.f12173E);
        }
    }

    /* JADX INFO: renamed from: bd2.a$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.share.action.ShareActionsHelper", m100430f = "ShareActionsHelper.kt", m100431l = {66}, m100432m = "handleDownload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f12179F;

        /* JADX INFO: renamed from: w */
        Object f12180w;

        /* JADX INFO: renamed from: x */
        Object f12181x;

        /* JADX INFO: renamed from: y */
        Object f12182y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f12183z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f12183z = obj;
            this.f12179F |= Integer.MIN_VALUE;
            return C3108a.this.m8932g(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: bd2.a$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.share.action.ShareActionsHelper$handleDownload$uri$1", m100430f = "ShareActionsHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/net/Uri;", "<anonymous>", "(Lbc3/c0;)Landroid/net/Uri;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12184w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Context f12185x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f12186y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Bitmap f12187z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context, String str, Bitmap bitmap, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12185x = context;
            this.f12186y = str;
            this.f12187z = bitmap;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f12185x, this.f12186y, this.f12187z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Uri> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12184w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", this.f12186y);
            contentValues.put("mime_type", "image/png");
            contentValues.put("relative_path", C3108a.f12158h);
            Uri uriInsert = this.f12185x.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null) {
                return null;
            }
            Context context = this.f12185x;
            Bitmap bitmap = this.f12187z;
            try {
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream == null) {
                    return uriInsert;
                }
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
                    outputStreamOpenOutputStream.close();
                    return uriInsert;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(outputStreamOpenOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (Exception e5) {
                context.getContentResolver().delete(uriInsert, null, null);
                throw e5;
            }
        }
    }

    /* JADX INFO: renamed from: bd2.a$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.share.action.ShareActionsHelper", m100430f = "ShareActionsHelper.kt", m100431l = {118}, m100432m = "handleMessage", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f12189F;

        /* JADX INFO: renamed from: w */
        Object f12190w;

        /* JADX INFO: renamed from: x */
        Object f12191x;

        /* JADX INFO: renamed from: y */
        Object f12192y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f12193z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f12193z = obj;
            this.f12189F |= Integer.MIN_VALUE;
            return C3108a.this.m8933h(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: bd2.a$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.share.action.ShareActionsHelper$handleMessage$uri$1", m100430f = "ShareActionsHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/net/Uri;", "<anonymous>", "(Lbc3/c0;)Landroid/net/Uri;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f12194E;

        /* JADX INFO: renamed from: w */
        int f12195w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Context f12197y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Bitmap f12198z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context, Bitmap bitmap, String str, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12197y = context;
            this.f12198z = bitmap;
            this.f12194E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C3108a.this.new j(this.f12197y, this.f12198z, this.f12194E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Uri> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12195w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C3108a.this.m8930j(this.f12197y, this.f12198z, this.f12194E);
        }
    }

    /* JADX INFO: renamed from: bd2.a$k */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.share.action.ShareActionsHelper", m100430f = "ShareActionsHelper.kt", m100431l = {154}, m100432m = "handleMore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f12200F;

        /* JADX INFO: renamed from: w */
        Object f12201w;

        /* JADX INFO: renamed from: x */
        Object f12202x;

        /* JADX INFO: renamed from: y */
        Object f12203y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f12204z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f12204z = obj;
            this.f12200F |= Integer.MIN_VALUE;
            return C3108a.this.m8934i(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: bd2.a$l */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.share.action.ShareActionsHelper$handleMore$uri$1", m100430f = "ShareActionsHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/net/Uri;", "<anonymous>", "(Lbc3/c0;)Landroid/net/Uri;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f12205E;

        /* JADX INFO: renamed from: w */
        int f12206w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Context f12208y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Bitmap f12209z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Context context, Bitmap bitmap, String str, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12208y = context;
            this.f12209z = bitmap;
            this.f12205E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C3108a.this.new l(this.f12208y, this.f12209z, this.f12205E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Uri> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12206w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C3108a.this.m8930j(this.f12208y, this.f12209z, this.f12205E);
        }
    }

    public C3108a(Function3 makeToast, Function3 getUriForFile, Function1 getDefaultSmsPackage, InterfaceC34116n logger, InterfaceC4351m onShareActionOutcome) {
        AbstractC22676k.m65750j(makeToast, "makeToast");
        AbstractC22676k.m65750j(getUriForFile, "getUriForFile");
        AbstractC22676k.m65750j(getDefaultSmsPackage, "getDefaultSmsPackage");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(onShareActionOutcome, "onShareActionOutcome");
        this.makeToast = makeToast;
        this.getUriForFile = getUriForFile;
        this.getDefaultSmsPackage = getDefaultSmsPackage;
        this.logger = logger;
        this.onShareActionOutcome = onShareActionOutcome;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m8926b(EnumC14403a enumC14403a, EnumC14404b enumC14404b) {
        AbstractC22676k.m65750j(enumC14403a, "<unused var>");
        AbstractC22676k.m65750j(enumC14404b, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private final Intent m8929e(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/png");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setClipData(ClipData.newUri(context.getContentResolver(), "WHOOP Share", uri));
        intent.addFlags(1);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final Uri m8930j(Context context, Bitmap bitmap, String filename) throws IOException {
        if (!AbstractC39421y.m125920E(filename, ".png", false)) {
            filename = filename.concat(".png");
        }
        File file = new File(context.getCacheDir(), filename);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            return (Uri) this.getUriForFile.invoke(context, context.getPackageName() + ".provider", file);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(fileOutputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: f */
    public final Object m8931f(Context context, Bitmap bitmap, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f12168F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f12168F = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM8705K = eVar.f12172z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f12168F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8705K);
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                f fVar = new f(context, bitmap, str, null);
                eVar.f12169w = context;
                eVar.f12170x = bitmap;
                eVar.f12171y = null;
                eVar.f12168F = 1;
                objM8705K = AbstractC3006f0.m8705K(executorC22364d, fVar, eVar);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmap = (Bitmap) eVar.f12170x;
                context = (Context) eVar.f12169w;
                AbstractC34132o.m107864I(objM8705K);
            }
            ClipData clipDataNewUri = ClipData.newUri(context.getContentResolver(), "WHOOP Share", (Uri) objM8705K);
            Object systemService = context.getSystemService("clipboard");
            AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(clipDataNewUri);
            if (Build.VERSION.SDK_INT <= 32) {
                Function3 function3 = this.makeToast;
                String string = context.getString(AbstractC0752a.f2746i);
                AbstractC22676k.m65749i(string, "getString(...)");
                ((Toast) function3.invoke(context, string, new Integer(0))).show();
            }
            this.onShareActionOutcome.invoke(EnumC14403a.COPY, EnumC14404b.SUCCESS);
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(eVar.getContext());
            this.logger.mo85230v("Copy failed: data state=".concat(bitmap.isRecycled() ? "recycled" : "valid"), e5, new AbstractC30556a.a[0]);
            this.onShareActionOutcome.invoke(EnumC14403a.COPY, EnumC14404b.FAILURE);
            Function3 function4 = this.makeToast;
            String string2 = context.getString(AbstractC0752a.f2747j);
            AbstractC22676k.m65749i(string2, "getString(...)");
            ((Toast) function4.invoke(context, string2, new Integer(0))).show();
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m8932g(Context context, Bitmap bitmap, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        g gVar;
        String strM30461o;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f12179F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f12179F = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objM8705K = gVar.f12183z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f12179F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8705K);
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                h hVar = new h(context, str, bitmap, null);
                gVar.f12180w = context;
                gVar.f12181x = null;
                gVar.f12182y = null;
                gVar.f12179F = 1;
                objM8705K = AbstractC3006f0.m8705K(executorC22364d, hVar, gVar);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) gVar.f12180w;
                AbstractC34132o.m107864I(objM8705K);
            }
            if (((Uri) objM8705K) != null) {
                Function3 function3 = this.makeToast;
                String string = context.getString(AbstractC0752a.f2750m);
                AbstractC22676k.m65749i(string, "getString(...)");
                ((Toast) function3.invoke(context, string, new Integer(0))).show();
                this.onShareActionOutcome.invoke(EnumC14403a.DOWNLOAD, EnumC14404b.SUCCESS);
            } else {
                this.logger.mo85222m("Save to gallery failure: MediaStore insert returned null", new AbstractC30556a.a[0]);
                this.onShareActionOutcome.invoke(EnumC14403a.DOWNLOAD, EnumC14404b.FAILURE);
                Function3 function4 = this.makeToast;
                String string2 = context.getString(AbstractC0752a.f2749l);
                AbstractC22676k.m65749i(string2, "getString(...)");
                ((Toast) function4.invoke(context, string2, new Integer(0))).show();
            }
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(gVar.getContext());
            if (e5 instanceof SecurityException) {
                strM30461o = AbstractC11266d.m30461o("Permission denied: ", e5.getMessage());
            } else {
                strM30461o = e5 instanceof IOException ? AbstractC11266d.m30461o("IO error: ", e5.getMessage()) : AbstractC11266d.m30461o("Unknown error: ", e5.getMessage());
            }
            this.logger.mo85230v(AbstractC11266d.m30461o("Save to gallery failure: ", strM30461o), e5, new AbstractC30556a.a[0]);
            this.onShareActionOutcome.invoke(EnumC14403a.DOWNLOAD, EnumC14404b.FAILURE);
            Function3 function5 = this.makeToast;
            String string3 = context.getString(AbstractC0752a.f2749l);
            AbstractC22676k.m65749i(string3, "getString(...)");
            ((Toast) function5.invoke(context, string3, new Integer(0))).show();
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: h */
    public final Object m8933h(Context context, Bitmap bitmap, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        i iVar;
        Context context2;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f12189F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f12189F = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object objM8705K = iVar2.f12193z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar2.f12189F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            try {
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                j jVar = new j(context, bitmap, str, null);
                iVar2.f12190w = context;
                iVar2.f12191x = null;
                iVar2.f12192y = null;
                iVar2.f12189F = 1;
                objM8705K = AbstractC3006f0.m8705K(executorC22364d, jVar, iVar2);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
                context2 = context;
            } catch (Exception e5) {
                e = e5;
                context2 = context;
                AbstractC3006f0.m8721o(iVar2.getContext());
                if (e instanceof IOException) {
                    this.logger.mo85230v(AbstractC11266d.m30461o("File write failure (temp files for sharing): ", e.getMessage()), e, new AbstractC30556a.a[0]);
                } else {
                    this.logger.mo85213c(AbstractC11266d.m30461o("Share intent unavailable: ", e.getMessage()), e, new AbstractC30556a.a[0]);
                }
                this.onShareActionOutcome.invoke(EnumC14403a.MESSAGE, EnumC14404b.FAILURE);
                Function3 function3 = this.makeToast;
                String string = context2.getString(AbstractC0752a.f2751n);
                AbstractC22676k.m65749i(string, "getString(...)");
                ((Toast) function3.invoke(context2, string, new Integer(0))).show();
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context2 = (Context) iVar2.f12190w;
            try {
                AbstractC34132o.m107864I(objM8705K);
            } catch (Exception e13) {
                e = e13;
                AbstractC3006f0.m8721o(iVar2.getContext());
                if (e instanceof IOException) {
                    this.logger.mo85230v(AbstractC11266d.m30461o("File write failure (temp files for sharing): ", e.getMessage()), e, new AbstractC30556a.a[0]);
                } else {
                    this.logger.mo85213c(AbstractC11266d.m30461o("Share intent unavailable: ", e.getMessage()), e, new AbstractC30556a.a[0]);
                }
                this.onShareActionOutcome.invoke(EnumC14403a.MESSAGE, EnumC14404b.FAILURE);
                Function3 function4 = this.makeToast;
                String string2 = context2.getString(AbstractC0752a.f2751n);
                AbstractC22676k.m65749i(string2, "getString(...)");
                ((Toast) function4.invoke(context2, string2, new Integer(0))).show();
                return c23454a0;
            }
        }
        Intent intentM8929e = m8929e(context2, (Uri) objM8705K);
        String str2 = (String) this.getDefaultSmsPackage.invoke(context2);
        if (str2 != null) {
            Intent intent = new Intent(intentM8929e);
            intent.setPackage(str2);
            try {
                context2.startActivity(intent);
                this.onShareActionOutcome.invoke(EnumC14403a.MESSAGE, EnumC14404b.SUCCESS);
                return c23454a0;
            } catch (Exception e14) {
                this.logger.mo85213c("Share intent unavailable: default SMS app could not handle intent, reason=" + e14.getMessage(), e14, new AbstractC30556a.a[0]);
                context2.startActivity(Intent.createChooser(intentM8929e, context2.getString(AbstractC0752a.f2742e)));
                this.onShareActionOutcome.invoke(EnumC14403a.MESSAGE, EnumC14404b.SUCCESS);
                return c23454a0;
            }
        }
        context2.startActivity(Intent.createChooser(intentM8929e, context2.getString(AbstractC0752a.f2742e)));
        this.onShareActionOutcome.invoke(EnumC14403a.MESSAGE, EnumC14404b.SUCCESS);
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m8934i(Context context, Bitmap bitmap, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        k kVar;
        C3108a c3108a;
        Context context2;
        Exception exc;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f12200F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f12200F = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        k kVar2 = kVar;
        Object objM8705K = kVar2.f12204z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = kVar2.f12200F;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) kVar2.f12201w;
            try {
                AbstractC34132o.m107864I(objM8705K);
                c3108a = this;
                try {
                    context.startActivity(Intent.createChooser(m8929e(context, (Uri) objM8705K), null));
                    c3108a.onShareActionOutcome.invoke(EnumC14403a.MORE, EnumC14404b.SUCCESS);
                } catch (Exception e5) {
                    e = e5;
                    exc = e;
                    AbstractC3006f0.m8721o(kVar2.getContext());
                    if (exc instanceof IOException) {
                        c3108a.logger.mo85230v(AbstractC11266d.m30461o("File write failure (temp files for sharing): ", exc.getMessage()), exc, new AbstractC30556a.a[0]);
                    } else {
                        c3108a.logger.mo85213c(AbstractC11266d.m30461o("Share intent unavailable: ", exc.getMessage()), exc, new AbstractC30556a.a[0]);
                    }
                    c3108a.onShareActionOutcome.invoke(EnumC14403a.MORE, EnumC14404b.FAILURE);
                    Function3 function3 = c3108a.makeToast;
                    String string = context.getString(AbstractC0752a.f2751n);
                    AbstractC22676k.m65749i(string, "getString(...)");
                    ((Toast) function3.invoke(context, string, new Integer(0))).show();
                }
            } catch (Exception e13) {
                exc = e13;
                c3108a = this;
                AbstractC3006f0.m8721o(kVar2.getContext());
                if (exc instanceof IOException) {
                    c3108a.logger.mo85230v(AbstractC11266d.m30461o("File write failure (temp files for sharing): ", exc.getMessage()), exc, new AbstractC30556a.a[0]);
                } else {
                    c3108a.logger.mo85213c(AbstractC11266d.m30461o("Share intent unavailable: ", exc.getMessage()), exc, new AbstractC30556a.a[0]);
                }
                c3108a.onShareActionOutcome.invoke(EnumC14403a.MORE, EnumC14404b.FAILURE);
                Function3 function4 = c3108a.makeToast;
                String string2 = context.getString(AbstractC0752a.f2751n);
                AbstractC22676k.m65749i(string2, "getString(...)");
                ((Toast) function4.invoke(context, string2, new Integer(0))).show();
            }
            return C23454a0.f92919a;
        }
        AbstractC34132o.m107864I(objM8705K);
        try {
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            try {
                c3108a = this;
                context2 = context;
                try {
                    l lVar = c3108a.new l(context2, bitmap, str, null);
                    kVar2.f12201w = context2;
                    kVar2.f12202x = null;
                    kVar2.f12203y = null;
                    kVar2.f12200F = 1;
                    objM8705K = AbstractC3006f0.m8705K(executorC22364d, lVar, kVar2);
                    if (objM8705K == enumC31071a) {
                        return enumC31071a;
                    }
                    context = context2;
                    context.startActivity(Intent.createChooser(m8929e(context, (Uri) objM8705K), null));
                    c3108a.onShareActionOutcome.invoke(EnumC14403a.MORE, EnumC14404b.SUCCESS);
                    return C23454a0.f92919a;
                } catch (Exception e14) {
                    exc = e14;
                    context = context2;
                    AbstractC3006f0.m8721o(kVar2.getContext());
                    if (exc instanceof IOException) {
                        c3108a.logger.mo85230v(AbstractC11266d.m30461o("File write failure (temp files for sharing): ", exc.getMessage()), exc, new AbstractC30556a.a[0]);
                    } else {
                        c3108a.logger.mo85213c(AbstractC11266d.m30461o("Share intent unavailable: ", exc.getMessage()), exc, new AbstractC30556a.a[0]);
                    }
                    c3108a.onShareActionOutcome.invoke(EnumC14403a.MORE, EnumC14404b.FAILURE);
                    Function3 function5 = c3108a.makeToast;
                    String string3 = context.getString(AbstractC0752a.f2751n);
                    AbstractC22676k.m65749i(string3, "getString(...)");
                    ((Toast) function5.invoke(context, string3, new Integer(0))).show();
                }
            } catch (Exception e15) {
                e = e15;
                c3108a = this;
                exc = e;
                AbstractC3006f0.m8721o(kVar2.getContext());
                if (exc instanceof IOException) {
                    c3108a.logger.mo85230v(AbstractC11266d.m30461o("File write failure (temp files for sharing): ", exc.getMessage()), exc, new AbstractC30556a.a[0]);
                } else {
                    c3108a.logger.mo85213c(AbstractC11266d.m30461o("Share intent unavailable: ", exc.getMessage()), exc, new AbstractC30556a.a[0]);
                }
                c3108a.onShareActionOutcome.invoke(EnumC14403a.MORE, EnumC14404b.FAILURE);
                Function3 function6 = c3108a.makeToast;
                String string4 = context.getString(AbstractC0752a.f2751n);
                AbstractC22676k.m65749i(string4, "getString(...)");
                ((Toast) function6.invoke(context, string4, new Integer(0))).show();
                return C23454a0.f92919a;
            }
        } catch (Exception e16) {
            c3108a = this;
            context2 = context;
            exc = e16;
        }
        AbstractC3006f0.m8721o(kVar2.getContext());
        if (exc instanceof IOException) {
            c3108a.logger.mo85230v(AbstractC11266d.m30461o("File write failure (temp files for sharing): ", exc.getMessage()), exc, new AbstractC30556a.a[0]);
        } else {
            c3108a.logger.mo85213c(AbstractC11266d.m30461o("Share intent unavailable: ", exc.getMessage()), exc, new AbstractC30556a.a[0]);
        }
        c3108a.onShareActionOutcome.invoke(EnumC14403a.MORE, EnumC14404b.FAILURE);
        Function3 function7 = c3108a.makeToast;
        String string5 = context.getString(AbstractC0752a.f2751n);
        AbstractC22676k.m65749i(string5, "getString(...)");
        ((Toast) function7.invoke(context, string5, new Integer(0))).show();
        return C23454a0.f92919a;
    }

    public /* synthetic */ C3108a(Function3 function3, Function3 function4, Function1 function1, InterfaceC34116n interfaceC34116n, InterfaceC4351m interfaceC4351m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? a.f12164w : function3, (i13 & 2) != 0 ? b.f12165w : function4, (i13 & 4) != 0 ? c.f12166w : function1, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ShareActionsHelper") : interfaceC34116n, (i13 & 16) != 0 ? new C26047n(14) : interfaceC4351m);
    }
}

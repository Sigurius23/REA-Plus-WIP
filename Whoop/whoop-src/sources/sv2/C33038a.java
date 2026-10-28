package sv2;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.zxing.WriterException;
import com.whoop.navigation.C9598e;
import com.whoop.weightlifting.StrengthTrainerDestination;
import cu2.EnumC11122b;
import du2.AbstractC12377a;
import fi0.InterfaceC14515a;
import hu.C17639a;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import j02.InterfaceC21159o0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import l83.C23454a0;
import p114eb.AbstractC12939a0;
import p156fu.C14775b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qv2.C30660a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import rv2.InterfaceC31846d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import va3.AbstractC35854l;
import x83.AbstractC38093j;

/* JADX INFO: renamed from: sv2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u0018*\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J!\u0010'\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010\"J\u0017\u0010,\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u0004\u0018\u0001012\u0006\u0010+\u001a\u00020*H\u0082@¢\u0006\u0004\b2\u00103J\u0013\u00106\u001a\u000205*\u000204H\u0002¢\u0006\u0004\b6\u00107J\"\u0010:\u001a\u0004\u0018\u0001012\u0006\u00108\u001a\u0002052\u0006\u00109\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b:\u0010;J?\u0010@\u001a\u00020\u00182\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001f2\u0016\b\u0002\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010>H\u0002¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020B¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010KR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010NR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010OR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010PR\u0014\u0010R\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010Q¨\u0006S"}, m65681d2 = {"Lsv2/a;", "", "Leb/a0;", "strengthTrainerNavController", "globalNavController", "Lfi0/a;", "analytics", "Lrr2/c;", "crashReporter", "Lin2/d;", "dispatcherFactory", "Lbc3/c0;", "coroutineScope", "Lkotlin/Function0;", "Landroid/content/Context;", "getCurrentContext", "Lj02/o0;", "appNavigator", "Lhu/a;", "qrCodeWriter", "<init>", "(Leb/a0;Leb/a0;Lfi0/a;Lrr2/c;Lin2/d;Lbc3/c0;Lc93/a;Lj02/o0;Lhu/a;)V", "Lrv2/d$a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "g", "(Lrv2/d$a;)V", "Lcom/whoop/navigation/e;", "destination", "j", "(Lj02/o0;Lcom/whoop/navigation/e;)V", "", "source", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)V", "", "workoutId", "", "isCopyFlow", "i", "(JZ)V", "k", "Lqv2/a;", "shareableWorkoutLink", "m", "(Lqv2/a;)V", "Lbc3/k1;", "l", "(Lqv2/a;)Lbc3/k1;", "Landroid/net/Uri;", "e", "(Lqv2/a;Lq83/d;)Ljava/lang/Object;", "Lfu/b;", "Landroid/graphics/Bitmap;", "q", "(Lfu/b;)Landroid/graphics/Bitmap;", "bitmap", "fileName", "d", "(Landroid/graphics/Bitmap;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "category", "action", "", "otherProperties", "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lrv2/d$o;", "n", "(Lrv2/d$o;)V", "a", "Leb/a0;", "b", "c", "Lfi0/a;", "Lrr2/c;", "Lin2/d;", "f", "Lbc3/c0;", "Lc93/a;", "Lj02/o0;", "Lhu/a;", "()Landroid/content/Context;", "context", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33038a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 strengthTrainerNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 globalNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC4339a getCurrentContext;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC21159o0 appNavigator;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C17639a qrCodeWriter;

    /* JADX INFO: renamed from: sv2.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.view.WorkoutLibraryNavRouter$createImageFile$2", m100430f = "WorkoutLibraryNavRouter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/net/Uri;", "<anonymous>", "(Lbc3/c0;)Landroid/net/Uri;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137601w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f137603y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Bitmap f137604z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Bitmap bitmap, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f137603y = str;
            this.f137604z = bitmap;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33038a.this.new a(this.f137603y, this.f137604z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Uri> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f137601w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                File file = new File(C33038a.this.m104425f().getCacheDir(), "qrCodes");
                AbstractC38093j.m122038l(file);
                file.mkdirs();
                File file2 = new File(file, this.f137603y + ".png");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    this.f137604z.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return FileProvider.getUriForFile(C33038a.this.m104425f(), C33038a.this.m104425f().getPackageName() + ".provider", file2);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(fileOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (IOException e5) {
                C33038a.this.crashReporter.mo98631p(e5);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: sv2.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.library.view.WorkoutLibraryNavRouter$openWorkoutQrCodeShareSheet$1", m100430f = "WorkoutLibraryNavRouter.kt", m100431l = {142}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137605w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30660a f137607y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C30660a c30660a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f137607y = c30660a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33038a.this.new b(this.f137607y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137605w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C33038a c33038a = C33038a.this;
                C30660a c30660a = this.f137607y;
                this.f137605w = 1;
                obj = c33038a.m104424e(c30660a, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                C33038a c33038a2 = C33038a.this;
                C30660a c30660a2 = this.f137607y;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("image/png");
                intent.setFlags(1);
                intent.setClipData(ClipData.newUri(c33038a2.m104425f().getContentResolver(), c30660a2.getName(), uri));
                intent.putExtra("android.intent.extra.STREAM", uri);
                c33038a2.m104425f().startActivity(Intent.createChooser(intent, null));
            }
            return C23454a0.f92919a;
        }
    }

    public C33038a(AbstractC12939a0 strengthTrainerNavController, AbstractC12939a0 globalNavController, InterfaceC14515a analytics, InterfaceC31766c crashReporter, InterfaceC18732d dispatcherFactory, InterfaceC2994c0 coroutineScope, InterfaceC4339a getCurrentContext, InterfaceC21159o0 appNavigator, C17639a qrCodeWriter) {
        AbstractC22676k.m65750j(strengthTrainerNavController, "strengthTrainerNavController");
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(getCurrentContext, "getCurrentContext");
        AbstractC22676k.m65750j(appNavigator, "appNavigator");
        AbstractC22676k.m65750j(qrCodeWriter, "qrCodeWriter");
        this.strengthTrainerNavController = strengthTrainerNavController;
        this.globalNavController = globalNavController;
        this.analytics = analytics;
        this.crashReporter = crashReporter;
        this.dispatcherFactory = dispatcherFactory;
        this.coroutineScope = coroutineScope;
        this.getCurrentContext = getCurrentContext;
        this.appNavigator = appNavigator;
        this.qrCodeWriter = qrCodeWriter;
    }

    /* JADX INFO: renamed from: d */
    private final Object m104423d(Bitmap bitmap, String str, InterfaceC30057d<? super Uri> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new a(str, bitmap, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final Object m104424e(C30660a c30660a, InterfaceC30057d<? super Uri> interfaceC30057d) {
        try {
            C17639a c17639a = this.qrCodeWriter;
            String str = c30660a.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String();
            c17639a.getClass();
            return m104423d(m104435q(C17639a.m50258a(str)), c30660a.getName(), interfaceC30057d);
        } catch (WriterException e5) {
            this.crashReporter.mo98631p(e5);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final Context m104425f() {
        return (Context) this.getCurrentContext.invoke();
    }

    /* JADX INFO: renamed from: g */
    private final void m104426g(InterfaceC31846d.a event) {
        m104429j(this.appNavigator, event.getDestination());
    }

    /* JADX INFO: renamed from: h */
    private final void m104427h(String source) {
        m104434p(this, null, "Build New Workout", source != null ? AbstractC31061c.m95645u("source", source) : null, 1, null);
        StrengthTrainerDestination.C10743f.f32781a.m28092d(this.strengthTrainerNavController, true);
    }

    /* JADX INFO: renamed from: i */
    private final void m104428i(long workoutId, boolean isCopyFlow) {
        m104433o(isCopyFlow ? "Copy Workout" : "Existing Workout", "Open", AbstractC31061c.m95645u("workoutId", String.valueOf(workoutId)));
        StrengthTrainerDestination.C10741d.m28056n(StrengthTrainerDestination.C10741d.f32764a, this.strengthTrainerNavController, workoutId, null, null, false, isCopyFlow, null, 46, null);
    }

    /* JADX INFO: renamed from: j */
    private final void m104429j(InterfaceC21159o0 interfaceC21159o0, C9598e c9598e) {
        interfaceC21159o0.mo59392a(C9598e.m23127b(c9598e, null, AbstractC12377a.m34730b(c9598e.getParameters()), null, 5, null));
    }

    /* JADX INFO: renamed from: k */
    private final void m104430k(String workoutId) {
        m104433o("WHOOP Workout", "Open", AbstractC31061c.m95645u("workoutId", workoutId));
        StrengthTrainerDestination.C10746i.f32793a.m28116d(this.strengthTrainerNavController, workoutId);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC3027k1 m104431l(C30660a shareableWorkoutLink) {
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(shareableWorkoutLink, null), 3);
    }

    /* JADX INFO: renamed from: m */
    private final void m104432m(C30660a shareableWorkoutLink) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(MimeType.MIME_TYPE_TXT);
        intent.putExtra("android.intent.extra.TEXT", shareableWorkoutLink.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String());
        intent.putExtra("android.intent.extra.TITLE", shareableWorkoutLink.getName());
        m104425f().startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: renamed from: o */
    private final void m104433o(String category, String action, Map<String, ? extends Object> otherProperties) {
        InterfaceC14515a.m41418i(this.analytics, category, action, null, "Workout Builder", null, otherProperties, 20, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m104434p(C33038a c33038a, String str, String str2, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            map = null;
        }
        c33038a.m104433o(str, str2, map);
    }

    /* JADX INFO: renamed from: q */
    private final Bitmap m104435q(C14775b c14775b) {
        int i13 = c14775b.f54789w;
        int i14 = c14775b.f54790x;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.RGB_565);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        int i15 = c14775b.f54789w;
        for (int i16 = 0; i16 < i15; i16++) {
            for (int i17 = 0; i17 < i14; i17++) {
                bitmapCreateBitmap.setPixel(i16, i17, ((c14775b.f54792z[(i16 / 32) + (c14775b.f54791y * i17)] >>> (i16 & 31)) & 1) != 0 ? -16777216 : -1);
            }
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: n */
    public final void m104436n(InterfaceC31846d.o event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC31846d.c) {
            this.globalNavController.m36410z();
            return;
        }
        if (event instanceof InterfaceC31846d.k) {
            this.globalNavController.m36402q(Uri.parse("android-app://com.whoop/education?path=WEIGHTLIFTING_EDUCATION&screenName=Muscular%20Load&entryPoint=workoutLibrary"));
            return;
        }
        if (event instanceof InterfaceC31846d.m) {
            StrengthTrainerDestination.C10743f.f32781a.m28092d(this.strengthTrainerNavController, false);
            return;
        }
        if (event instanceof InterfaceC31846d.i) {
            m104427h(((InterfaceC31846d.i) event).getSource());
            return;
        }
        if (event instanceof InterfaceC31846d.j) {
            InterfaceC31846d.j jVar = (InterfaceC31846d.j) event;
            m104428i(jVar.getWorkoutTemplateKey(), jVar.getIsCopyFlow());
            return;
        }
        if (event instanceof InterfaceC31846d.n) {
            m104430k(((InterfaceC31846d.n) event).getWorkoutTemplateKey());
            return;
        }
        if (event instanceof InterfaceC31846d.s) {
            m104432m(((InterfaceC31846d.s) event).getShareableWorkoutLink());
            return;
        }
        if (event instanceof InterfaceC31846d.r) {
            m104431l(((InterfaceC31846d.r) event).getShareableWorkoutLink());
            return;
        }
        if (event instanceof InterfaceC31846d.w) {
            this.appNavigator.mo59392a(((InterfaceC31846d.w) event).m98973a());
            return;
        }
        if (event instanceof InterfaceC31846d.l) {
            InterfaceC31846d.l lVar = (InterfaceC31846d.l) event;
            StrengthTrainerDestination.C10742e.m28080p(StrengthTrainerDestination.C10742e.f32774a, this.strengthTrainerNavController, lVar.getExerciseId(), false, EnumC11122b.INTERNAL, null, lVar.getIsExerciseDetailsV2ExperimentEnabled(), 8, null);
        } else if (event instanceof InterfaceC31846d.h) {
            StrengthTrainerDestination.C10738a.f32750a.m28026n(this.strengthTrainerNavController);
        } else {
            if (!(event instanceof InterfaceC31846d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m104426g((InterfaceC31846d.a) event);
        }
    }

    public C33038a(AbstractC12939a0 abstractC12939a0, AbstractC12939a0 abstractC12939a1, InterfaceC14515a interfaceC14515a, InterfaceC31766c interfaceC31766c, InterfaceC18732d interfaceC18732d, InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, InterfaceC21159o0 interfaceC21159o0, C17639a c17639a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12939a0, abstractC12939a1, interfaceC14515a, interfaceC31766c, interfaceC18732d, interfaceC2994c0, interfaceC4339a, interfaceC21159o0, (i13 & 256) != 0 ? new C17639a() : c17639a);
    }
}

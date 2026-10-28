package ne1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import com.whoop.design.model.CtaNavigationDestination;
import com.whoop.video.VideoActivity;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import j02.AbstractC21155m0;
import j02.AbstractC21161p0;
import j02.InterfaceC21159o0;
import oe1.C27872b;
import oe1.C27874d;
import oe1.InterfaceC27871a;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p236j.AbstractC21065d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ne1.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u0017*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u0017*\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J#\u00100\u001a\u00020/2\u0006\u0010\u001c\u001a\u00020,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00170-¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00106R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00103R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, m65681d2 = {"Lne1/b;", "", "Loe1/d;", "viewModel", "", "featureEducationScreenName", "Landroid/content/Context;", "context", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Lj/d;", "Landroid/content/Intent;", "activityResultLauncher", "Lor2/y;", "externalLinkNavigator", "Landroid/app/Activity;", "activity", "Loe1/b;", "analyticsHelper", "featureEducationEntryPoint", "Lkotlin/Function1;", "Ll83/a0;", "onLaunchPodcastFailed", "<init>", "(Loe1/d;Ljava/lang/String;Landroid/content/Context;Leb/a0;Lj02/o0;Lj/d;Lor2/y;Landroid/app/Activity;Loe1/b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lne1/a$e;", NotificationCompat.CATEGORY_EVENT, "b", "(Landroid/app/Activity;Lne1/a$e;)V", "deepLink", "a", "(Landroid/app/Activity;Ljava/lang/String;)V", "name", "e", "(Ljava/lang/String;)V", "articleId", "f", "Lcom/whoop/design/model/CtaNavigationDestination;", "destination", "Lj02/p0;", "c", "(Lcom/whoop/design/model/CtaNavigationDestination;)Lj02/p0;", "Lne1/a;", "Lkotlin/Function0;", "setFragmentResult", "", "d", "(Lne1/a;Lc93/a;)Z", "Loe1/d;", "Ljava/lang/String;", "Landroid/content/Context;", "Leb/a0;", "Lj02/o0;", "Lj/d;", "g", "Lor2/y;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Landroid/app/Activity;", "i", "Loe1/b;", "j", "k", "Lkotlin/jvm/functions/Function1;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26599b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27874d viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String featureEducationScreenName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC21065d activityResultLauncher;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C27872b analyticsHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String featureEducationEntryPoint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Function1 onLaunchPodcastFailed;

    /* JADX INFO: renamed from: ne1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105822a;

        static {
            int[] iArr = new int[CtaNavigationDestination.values().length];
            try {
                iArr[CtaNavigationDestination.GO_TO_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f105822a = iArr;
        }
    }

    public C26599b(C27874d viewModel, String featureEducationScreenName, Context context, AbstractC12939a0 navController, InterfaceC21159o0 navigator, AbstractC21065d abstractC21065d, C28216y externalLinkNavigator, Activity activity, C27872b analyticsHelper, String featureEducationEntryPoint, Function1 onLaunchPodcastFailed) {
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(featureEducationScreenName, "featureEducationScreenName");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(featureEducationEntryPoint, "featureEducationEntryPoint");
        AbstractC22676k.m65750j(onLaunchPodcastFailed, "onLaunchPodcastFailed");
        this.viewModel = viewModel;
        this.featureEducationScreenName = featureEducationScreenName;
        this.context = context;
        this.navController = navController;
        this.navigator = navigator;
        this.activityResultLauncher = abstractC21065d;
        this.externalLinkNavigator = externalLinkNavigator;
        this.activity = activity;
        this.analyticsHelper = analyticsHelper;
        this.featureEducationEntryPoint = featureEducationEntryPoint;
        this.onLaunchPodcastFailed = onLaunchPodcastFailed;
    }

    /* JADX INFO: renamed from: a */
    private final void m79111a(Activity activity, String str) {
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* JADX INFO: renamed from: b */
    private final void m79112b(Activity activity, AbstractC26598a.e eVar) {
        try {
            m79111a(activity, eVar.getDeepLink());
        } catch (ActivityNotFoundException unused) {
            this.onLaunchPodcastFailed.invoke(eVar.getName());
        }
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC21161p0 m79113c(CtaNavigationDestination destination) {
        if (a.f105822a[destination.ordinal()] == 1) {
            return this.navigator.mo59393b(AbstractC21155m0.e3.f80338b);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    private final void m79114e(String name) {
        this.analyticsHelper.m84134a(new InterfaceC27871a.g(null, null, name, null, AbstractC31061c.m95645u("Source", this.featureEducationEntryPoint), 11, null));
    }

    /* JADX INFO: renamed from: f */
    private final void m79115f(String articleId) {
        this.analyticsHelper.m84134a(new InterfaceC27871a.h(null, null, articleId, null, AbstractC31061c.m95645u("Source", this.featureEducationEntryPoint), 11, null));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m79116d(AbstractC26598a event, InterfaceC4339a setFragmentResult) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(setFragmentResult, "setFragmentResult");
        if (event instanceof AbstractC26598a.g) {
            this.viewModel.m84141n(new InterfaceC27871a.e(this.featureEducationScreenName, null, null, null, null, 30, null));
            Intent intent = new Intent(this.context, (Class<?>) VideoActivity.class);
            intent.putExtra("videoUrl", ((AbstractC26598a.g) event).getVideoUrl());
            intent.putExtra("SHOULD_SUBTITLES_DEFAULT_TO_OFF", true);
            intent.putExtra("SHOULD_FORCE_HD_VIDEO", true);
            AbstractC21065d abstractC21065d = this.activityResultLauncher;
            if (abstractC21065d != null) {
                abstractC21065d.mo4052a(intent, null);
            }
            return true;
        }
        if (event instanceof AbstractC26598a.a) {
            setFragmentResult.invoke();
            return this.navController.m36410z();
        }
        if (event instanceof AbstractC26598a.c) {
            C28216y.m85414y(this.externalLinkNavigator, this.activity, ((AbstractC26598a.c) event).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String(), false, 4, null);
            return true;
        }
        if (event instanceof AbstractC26598a.e) {
            AbstractC26598a.e eVar = (AbstractC26598a.e) event;
            m79114e(eVar.getName());
            m79112b(this.activity, eVar);
            return true;
        }
        if (!(event instanceof AbstractC26598a.f)) {
            if (event instanceof AbstractC26598a.b) {
                m79113c(((AbstractC26598a.b) event).getDestination());
                return true;
            }
            if (!(event instanceof AbstractC26598a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC26598a.d dVar = (AbstractC26598a.d) event;
            this.analyticsHelper.m84134a(new InterfaceC27871a.c(this.featureEducationScreenName, null, dVar.getAnalyticsLabel(), null, null, 26, null));
            this.navigator.mo59392a(dVar.getNavigationAction());
            return true;
        }
        AbstractC26598a.f fVar = (AbstractC26598a.f) event;
        m79115f(fVar.getTitle());
        Intent intent2 = new Intent();
        intent2.setAction("android.intent.action.SEND");
        intent2.putExtra("android.intent.extra.TITLE", fVar.getTitle());
        intent2.putExtra("android.intent.extra.TEXT", fVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String());
        intent2.setType(MimeType.MIME_TYPE_TXT);
        this.activity.startActivity(Intent.createChooser(intent2, null));
        return true;
    }
}

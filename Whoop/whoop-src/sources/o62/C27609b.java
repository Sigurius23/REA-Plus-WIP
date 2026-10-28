package o62;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import h62.AbstractC16981a;
import java.util.Map;
import java.util.regex.Pattern;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o62.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lo62/b;", "", "Landroid/content/Context;", "context", "", "checkoutOrigin", "", "analyticsProperties", "Lkotlin/Function1;", "Lh62/a;", "Ll83/a0;", "onAnalyticsEvent", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "e", "()V", "message", "", "b", "(Ljava/lang/String;)Z", "c", "a", "Landroid/content/Context;", "Ljava/lang/String;", "Ljava/util/Map;", "d", "Lkotlin/jvm/functions/Function1;", "Landroid/content/ClipboardManager;", "Landroid/content/ClipboardManager;", "clipboardManager", "Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;", "f", "Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;", "clipboardListener", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27609b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String checkoutOrigin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, String> analyticsProperties;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1 onAnalyticsEvent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ClipboardManager clipboardManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ClipboardManager.OnPrimaryClipChangedListener clipboardListener;

    public C27609b(Context context, String str, Map<String, String> map, Function1 onAnalyticsEvent) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        this.context = context;
        this.checkoutOrigin = str;
        this.analyticsProperties = map;
        this.onAnalyticsEvent = onAnalyticsEvent;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m83369b(String message) {
        Pattern patternCompile = Pattern.compile("((join|try)\\.(dev\\.whoop\\.com|qa\\.whoop\\.com|whoop\\.com)/)([A-Za-z0-9]{6})");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        AbstractC22676k.m65750j(message, "input");
        return patternCompile.matcher(message).find();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m83370d(C27609b c27609b) {
        ClipboardManager clipboardManager = c27609b.clipboardManager;
        ClipData primaryClip = clipboardManager != null ? clipboardManager.getPrimaryClip() : null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || !c27609b.m83369b(primaryClip.getItemAt(0).getText().toString())) {
            c27609b.m83371e();
        } else {
            c27609b.onAnalyticsEvent.invoke(new AbstractC16981a.c(null, "Copy to clipboard", c27609b.checkoutOrigin, c27609b.analyticsProperties, null, 17, null));
            c27609b.m83371e();
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m83371e() {
        ClipboardManager clipboardManager;
        ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = this.clipboardListener;
        if (onPrimaryClipChangedListener == null || (clipboardManager = this.clipboardManager) == null) {
            return;
        }
        clipboardManager.removePrimaryClipChangedListener(onPrimaryClipChangedListener);
    }

    /* JADX INFO: renamed from: c */
    public final void m83372c() {
        Object systemService = this.context.getSystemService("clipboard");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        this.clipboardManager = clipboardManager;
        ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: o62.a
            @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
            public final void onPrimaryClipChanged() {
                C27609b.m83370d(this.f111127a);
            }
        };
        this.clipboardListener = onPrimaryClipChangedListener;
        clipboardManager.addPrimaryClipChangedListener(onPrimaryClipChangedListener);
    }
}

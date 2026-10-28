package rg0;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import ih0.InterfaceC18484b;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rg0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lrg0/d;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "isChatV2", "", "", "a", "(Z)Ljava/util/Map;", "properties", "e", "(Ljava/util/Map;Z)Ljava/util/Map;", "", "version", "d", "(Ljava/lang/Integer;)Ljava/util/Map;", "Lih0/b;", NotificationCompat.CATEGORY_EVENT, "fingerprint", "Ll83/a0;", "b", "(Lih0/b;Ljava/lang/String;Z)V", "Lfi0/a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31383d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C31383d(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final Map<String, Object> m96637a(boolean isChatV2) {
        return isChatV2 ? AbstractC36095b.m114688p(Boolean.TRUE, "is_chat_v2") : C25272z.f99163w;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m96638c(C31383d c31383d, InterfaceC18484b interfaceC18484b, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        c31383d.m96641b(interfaceC18484b, str, z4);
    }

    /* JADX INFO: renamed from: d */
    private final Map<String, Object> m96639d(Integer version) {
        return version != null ? AbstractC25247g0.m73989X(new C23465k("form_version", Integer.valueOf(version.intValue()))) : C25272z.f99163w;
    }

    /* JADX INFO: renamed from: e */
    private final Map<String, Object> m96640e(Map<String, ? extends Object> properties, boolean isChatV2) {
        return AbstractC25247g0.m73995d0(properties, m96637a(isChatV2));
    }

    /* JADX INFO: renamed from: b */
    public final void m96641b(InterfaceC18484b event, String fingerprint, boolean isChatV2) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        if (event instanceof InterfaceC18484b.c) {
            InterfaceC18484b.c cVar = (InterfaceC18484b.c) event;
            InterfaceC14515a.m41418i(this.analytics, null, "form_option_selected", null, "AI Coach", null, m96640e(AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("fingerprint", fingerprint), new C23465k("form_id", cVar.getFormId()), new C23465k("form_key", cVar.getFormKey()), new C23465k("question_id", cVar.getQuestionId()), new C23465k("option_id", cVar.getOptionId())), m96639d(cVar.getVersion())), isChatV2), 21, null);
            return;
        }
        if (event instanceof InterfaceC18484b.a) {
            InterfaceC18484b.a aVar = (InterfaceC18484b.a) event;
            InterfaceC14515a.m41418i(this.analytics, null, "form_background_tapped", null, "AI Coach", null, m96640e(AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("fingerprint", fingerprint), new C23465k("form_id", aVar.getFormId()), new C23465k("form_key", aVar.getFormKey())), m96639d(aVar.getVersion())), isChatV2), 21, null);
            return;
        }
        if (event instanceof InterfaceC18484b.d) {
            InterfaceC18484b.d dVar = (InterfaceC18484b.d) event;
            InterfaceC14515a.m41418i(this.analytics, null, "form_submit_tapped", null, "AI Coach", null, m96640e(AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("fingerprint", fingerprint), new C23465k("form_id", dVar.getFormId()), new C23465k("form_key", dVar.getFormKey()), new C23465k("selected_option_id", dVar.getSelectedOptionId())), m96639d(dVar.getVersion())), isChatV2), 21, null);
        } else if (event instanceof InterfaceC18484b.e) {
            InterfaceC18484b.e eVar = (InterfaceC18484b.e) event;
            InterfaceC14515a.m41418i(this.analytics, null, "form_view_impression", null, "AI Coach", null, m96640e(AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("fingerprint", fingerprint), new C23465k("form_id", eVar.getFormId()), new C23465k("form_key", eVar.getFormKey())), m96639d(eVar.getVersion())), isChatV2), 21, null);
        } else {
            if (!(event instanceof InterfaceC18484b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC18484b.b bVar = (InterfaceC18484b.b) event;
            InterfaceC14515a.m41418i(this.analytics, null, "form_error_impression", null, "AI Coach", null, m96640e(AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("fingerprint", fingerprint), new C23465k("form_id", bVar.getFormId()), new C23465k("form_key", bVar.getFormKey()), new C23465k("error_type", bVar.getErrorType().getAnalyticsValue())), m96639d(bVar.getVersion())), isChatV2), 21, null);
        }
    }
}

package p708hb2;

import ah0.C0885f;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hb2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJH\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b!\u0010\u0010¨\u0006\""}, m65681d2 = {"Lhb2/e;", "", "", "id", "prompt", "", "Lah0/f;", "options", "", "isRequired", "progressLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)Lhb2/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "f", "Ljava/util/List;", "d", "()Ljava/util/List;", "Z", "g", "()Z", "e", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C17097e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String prompt;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C0885f> options;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isRequired;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String progressLabel;

    public C17097e(String id4, String prompt, List<C0885f> options, boolean z4, String progressLabel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(prompt, "prompt");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(progressLabel, "progressLabel");
        this.id = id4;
        this.prompt = prompt;
        this.options = options;
        this.isRequired = z4;
        this.progressLabel = progressLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17097e m48302b(C17097e c17097e, String str, String str2, List list, boolean z4, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c17097e.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c17097e.prompt;
        }
        if ((i13 & 4) != 0) {
            list = c17097e.options;
        }
        if ((i13 & 8) != 0) {
            z4 = c17097e.isRequired;
        }
        if ((i13 & 16) != 0) {
            str3 = c17097e.progressLabel;
        }
        String str4 = str3;
        List list2 = list;
        return c17097e.m48303a(str, str2, list2, z4, str4);
    }

    /* JADX INFO: renamed from: a */
    public final C17097e m48303a(String id4, String prompt, List<C0885f> options, boolean isRequired, String progressLabel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(prompt, "prompt");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(progressLabel, "progressLabel");
        return new C17097e(id4, prompt, options, isRequired, progressLabel);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d */
    public final List<C0885f> m48305d() {
        return this.options;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProgressLabel() {
        return this.progressLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17097e)) {
            return false;
        }
        C17097e c17097e = (C17097e) other;
        return AbstractC22676k.m65745e(this.id, c17097e.id) && AbstractC22676k.m65745e(this.prompt, c17097e.prompt) && AbstractC22676k.m65745e(this.options, c17097e.options) && this.isRequired == c17097e.isRequired && AbstractC22676k.m65745e(this.progressLabel, c17097e.progressLabel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public int hashCode() {
        return this.progressLabel.hashCode() + AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.prompt), 31, this.options), 31, this.isRequired);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.prompt;
        List<C0885f> list = this.options;
        boolean z4 = this.isRequired;
        String str3 = this.progressLabel;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DebugQuestion(id=", str, ", prompt=", str2, ", options=");
        AbstractC26725a.m79512p(", isRequired=", ", progressLabel=", sbM32001t, list, z4);
        return AbstractC25012a.m73376i(str3, ")", sbM32001t);
    }

    public /* synthetic */ C17097e(String str, String str2, List list, boolean z4, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i13 & 8) != 0 ? true : z4, (i13 & 16) != 0 ? "" : str3);
    }
}

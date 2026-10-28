package cc2;

import io.getstream.chat.android.client.api.QueryParams;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: cc2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcc2/c;", "Lm91/u;", "", QueryParams.URL, "", "enableJavascript", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4414c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean enableJavascript;

    public C4414c(String url, boolean z4) {
        AbstractC22676k.m65750j(url, "url");
        this.url = url;
        this.enableJavascript = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnableJavascript() {
        return this.enableJavascript;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4414c)) {
            return false;
        }
        C4414c c4414c = (C4414c) other;
        return AbstractC22676k.m65745e(this.url, c4414c.url) && this.enableJavascript == c4414c.enableJavascript;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableJavascript) + (this.url.hashCode() * 31);
    }

    public String toString() {
        return AbstractC26725a.m79503g("LanguageBetaOptOutItemViewState(url=", this.url, ", enableJavascript=", ")", this.enableJavascript);
    }

    public /* synthetic */ C4414c(String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? true : z4);
    }
}

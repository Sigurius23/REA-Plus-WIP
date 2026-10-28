package i51;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: i51.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Li51/c;", "", "Li51/b;", "configuration", "", "Lm91/u;", "buttons", "<init>", "(Li51/b;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li51/b;", "b", "()Li51/b;", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18106c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC18105b configuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> buttons;

    /* JADX WARN: Multi-variable type inference failed */
    public C18106c(EnumC18105b configuration, List<? extends InterfaceC25312u> buttons) {
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(buttons, "buttons");
        this.configuration = configuration;
        this.buttons = buttons;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m51959a() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC18105b getConfiguration() {
        return this.configuration;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18106c)) {
            return false;
        }
        C18106c c18106c = (C18106c) other;
        return this.configuration == c18106c.configuration && AbstractC22676k.m65745e(this.buttons, c18106c.buttons);
    }

    public int hashCode() {
        return this.buttons.hashCode() + (this.configuration.hashCode() * 31);
    }

    public String toString() {
        return "CelebrationButtonSectionViewState(configuration=" + this.configuration + ", buttons=" + this.buttons + ")";
    }
}

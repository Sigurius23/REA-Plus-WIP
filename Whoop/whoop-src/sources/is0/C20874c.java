package is0;

import com.whoop.navigation.models.GenericInteraction;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: is0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lis0/c;", "", "", "emoji", "", "isSending", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20874c {

    /* JADX INFO: renamed from: d */
    public static final int f78536d = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String emoji;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSending;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    public C20874c(String emoji, boolean z4, GenericInteraction interaction) {
        AbstractC22676k.m65750j(emoji, "emoji");
        AbstractC22676k.m65750j(interaction, "interaction");
        this.emoji = emoji;
        this.isSending = z4;
        this.interaction = interaction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSending() {
        return this.isSending;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20874c)) {
            return false;
        }
        C20874c c20874c = (C20874c) other;
        return AbstractC22676k.m65745e(this.emoji, c20874c.emoji) && this.isSending == c20874c.isSending && AbstractC22676k.m65745e(this.interaction, c20874c.interaction);
    }

    public int hashCode() {
        return this.interaction.hashCode() + AbstractC2875y.m8289b(this.emoji.hashCode() * 31, 31, this.isSending);
    }

    public String toString() {
        String str = this.emoji;
        boolean z4 = this.isSending;
        return AbstractC26725a.m79506j(AbstractC25012a.m73379l("QuickReactionState(emoji=", str, ", isSending=", ", interaction=", z4), this.interaction, ")");
    }
}

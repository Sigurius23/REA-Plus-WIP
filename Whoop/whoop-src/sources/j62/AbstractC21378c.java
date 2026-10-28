package j62;

import com.whoop.referafriend.domain.models.RafHubDomainState;
import live.hms.video.media.tracks.HMSTrackSource;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j62.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lj62/c;", "", "<init>", "()V", "c", "b", "a", "Lj62/c$a;", "Lj62/c$b;", "Lj62/c$c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21378c {

    /* JADX INFO: renamed from: j62.c$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj62/c$a;", "Lj62/c;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21378c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String source) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.source, ((a) other).source);
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j62.c$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lj62/c$b;", "Lj62/c;", "Lcom/whoop/referafriend/domain/models/RafHubDomainState;", HMSTrackSource.SCREEN, "", "source", "Lj62/f;", "modal", "<init>", "(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;)V", "a", "(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;)Lj62/c$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/referafriend/domain/models/RafHubDomainState;", "d", "()Lcom/whoop/referafriend/domain/models/RafHubDomainState;", "b", "Ljava/lang/String;", "e", "c", "Lj62/f;", "()Lj62/f;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC21378c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final RafHubDomainState screen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AbstractC21381f modal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RafHubDomainState screen, String source, AbstractC21381f abstractC21381f) {
            super(null);
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(source, "source");
            this.screen = screen;
            this.source = source;
            this.modal = abstractC21381f;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m60003b(b bVar, RafHubDomainState rafHubDomainState, String str, AbstractC21381f abstractC21381f, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                rafHubDomainState = bVar.screen;
            }
            if ((i13 & 2) != 0) {
                str = bVar.source;
            }
            if ((i13 & 4) != 0) {
                abstractC21381f = bVar.modal;
            }
            return bVar.m60004a(rafHubDomainState, str, abstractC21381f);
        }

        /* JADX INFO: renamed from: a */
        public final b m60004a(RafHubDomainState screen, String source, AbstractC21381f modal) {
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(source, "source");
            return new b(screen, source, modal);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC21381f getModal() {
            return this.modal;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final RafHubDomainState getScreen() {
            return this.screen;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.screen, bVar.screen) && AbstractC22676k.m65745e(this.source, bVar.source) && AbstractC22676k.m65745e(this.modal, bVar.modal);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.screen.hashCode() * 31, 31, this.source);
            AbstractC21381f abstractC21381f = this.modal;
            return iM30450d + (abstractC21381f == null ? 0 : abstractC21381f.hashCode());
        }

        public String toString() {
            return "Loaded(screen=" + this.screen + ", source=" + this.source + ", modal=" + this.modal + ")";
        }

        public /* synthetic */ b(RafHubDomainState rafHubDomainState, String str, AbstractC21381f abstractC21381f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(rafHubDomainState, str, (i13 & 4) != 0 ? null : abstractC21381f);
        }
    }

    /* JADX INFO: renamed from: j62.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj62/c$c;", "Lj62/c;", "<init>", "()V", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC21378c {

        /* JADX INFO: renamed from: a */
        public static final c f81771a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC21378c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21378c() {
    }
}

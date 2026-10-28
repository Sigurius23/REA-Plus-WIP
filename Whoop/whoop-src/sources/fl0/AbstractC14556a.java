package fl0;

import android.net.Uri;
import c13.AbstractC3855a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jh3.AbstractC21702c;
import kotlinx.serialization.json.JsonElement;
import m83.C25272z;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: fl0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m65681d2 = {"Lfl0/a;", "", "<init>", "()V", "c", "i", "j", "k", "l", "f", "e", "d", "g", "b", "a", "m", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lfl0/a$a;", "Lfl0/a$b;", "Lfl0/a$c;", "Lfl0/a$d;", "Lfl0/a$e;", "Lfl0/a$f;", "Lfl0/a$g;", "Lfl0/a$h;", "Lfl0/a$i;", "Lfl0/a$j;", "Lfl0/a$k;", "Lfl0/a$l;", "Lfl0/a$m;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14556a {

    /* JADX INFO: renamed from: fl0.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0014\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lfl0/a$a;", "Lfl0/a;", "", "committed", "", "recommendationId", "fromGhostTile", "replacementId", "activityTitle", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "d", "c", "e", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC14556a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean committed;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String recommendationId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean fromGhostTile;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String replacementId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String activityTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, String recommendationId, boolean z13, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(recommendationId, "recommendationId");
            this.committed = z4;
            this.recommendationId = recommendationId;
            this.fromGhostTile = z13;
            this.replacementId = str;
            this.activityTitle = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityTitle() {
            return this.activityTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCommitted() {
            return this.committed;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getFromGhostTile() {
            return this.fromGhostTile;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRecommendationId() {
            return this.recommendationId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getReplacementId() {
            return this.replacementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.committed == aVar.committed && AbstractC22676k.m65745e(this.recommendationId, aVar.recommendationId) && this.fromGhostTile == aVar.fromGhostTile && AbstractC22676k.m65745e(this.replacementId, aVar.replacementId) && AbstractC22676k.m65745e(this.activityTitle, aVar.activityTitle);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(Boolean.hashCode(this.committed) * 31, 31, this.recommendationId), 31, this.fromGhostTile);
            String str = this.replacementId;
            int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.activityTitle;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            boolean z4 = this.committed;
            String str = this.recommendationId;
            boolean z13 = this.fromGhostTile;
            String str2 = this.replacementId;
            String str3 = this.activityTitle;
            StringBuilder sbM38567n = AbstractC13673n.m38567n("CommitRecommendation(committed=", ", recommendationId=", str, ", fromGhostTile=", z4);
            AbstractC38963t7.m124391u(sbM38567n, z13, ", replacementId=", str2, ", activityTitle=");
            return AbstractC25012a.m73376i(str3, ")", sbM38567n);
        }
    }

    /* JADX INFO: renamed from: fl0.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfl0/a$b;", "Lfl0/a;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC14556a {

        /* JADX INFO: renamed from: a */
        public static final b f53201a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: fl0.a$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfl0/a$c;", "Lfl0/a;", "Ljava/util/UUID;", "supportActionTileId", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC14556a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final UUID supportActionTileId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UUID supportActionTileId) {
            super(null);
            AbstractC22676k.m65750j(supportActionTileId, "supportActionTileId");
            this.supportActionTileId = supportActionTileId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getSupportActionTileId() {
            return this.supportActionTileId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.supportActionTileId, ((c) other).supportActionTileId);
        }

        public int hashCode() {
            return this.supportActionTileId.hashCode();
        }

        public String toString() {
            return "CreateMxmSupportTicket(supportActionTileId=" + this.supportActionTileId + ")";
        }
    }

    /* JADX INFO: renamed from: fl0.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lfl0/a$d;", "Lfl0/a;", "", "conversationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC14556a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String conversationId) {
            super(null);
            AbstractC22676k.m65750j(conversationId, "conversationId");
            this.conversationId = conversationId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.conversationId, ((d) other).conversationId);
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DeleteConversation(conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: renamed from: fl0.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfl0/a$e;", "Lfl0/a;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC14556a {

        /* JADX INFO: renamed from: a */
        public static final e f53204a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: fl0.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lfl0/a$f;", "Lfl0/a;", "", "conversationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC14556a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String conversationId) {
            super(null);
            AbstractC22676k.m65750j(conversationId, "conversationId");
            this.conversationId = conversationId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.conversationId, ((f) other).conversationId);
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OpenConversation(conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: renamed from: fl0.a$g */
    @Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lfl0/a$g;", "Lfl0/a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC14556a {
    }

    /* JADX INFO: renamed from: fl0.a$h */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lfl0/a$h;", "Lfl0/a;", "", "fileId", "Landroid/net/Uri;", "uri", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/net/Uri;", "()Landroid/net/Uri;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC14556a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fileId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Uri uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Uri uri) {
            super(null);
            AbstractC22676k.m65750j(uri, "uri");
            this.fileId = str;
            this.uri = uri;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFileId() {
            return this.fileId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.fileId, hVar.fileId) && AbstractC22676k.m65745e(this.uri, hVar.uri);
        }

        public int hashCode() {
            String str = this.fileId;
            return this.uri.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "RemoveImage(fileId=" + this.fileId + ", uri=" + this.uri + ")";
        }
    }

    /* JADX INFO: renamed from: fl0.a$i */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001d\u0010 R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b!\u0010)¨\u0006*"}, m65681d2 = {"Lfl0/a$i;", "Lfl0/a;", "", "message", "messageId", "", "Landroid/net/Uri;", "imageUris", "fileIds", "", "timestamp", "", "isVoiceInput", "Lfl0/l;", "retryAnalyticsData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;ZLfl0/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "Z", "g", "()Z", "Lfl0/l;", "()Lfl0/l;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC14556a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String messageId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<Uri> imageUris;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<String> fileIds;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Long timestamp;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isVoiceInput;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C14567l retryAnalyticsData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(String message, String str, List<? extends Uri> list, List<String> list2, Long l7, boolean z4, C14567l c14567l) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
            this.messageId = str;
            this.imageUris = list;
            this.fileIds = list2;
            this.timestamp = l7;
            this.isVoiceInput = z4;
            this.retryAnalyticsData = c14567l;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m41602a() {
            return this.fileIds;
        }

        /* JADX INFO: renamed from: b */
        public final List<Uri> m41603b() {
            return this.imageUris;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C14567l getRetryAnalyticsData() {
            return this.retryAnalyticsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.message, iVar.message) && AbstractC22676k.m65745e(this.messageId, iVar.messageId) && AbstractC22676k.m65745e(this.imageUris, iVar.imageUris) && AbstractC22676k.m65745e(this.fileIds, iVar.fileIds) && AbstractC22676k.m65745e(this.timestamp, iVar.timestamp) && this.isVoiceInput == iVar.isVoiceInput && AbstractC22676k.m65745e(this.retryAnalyticsData, iVar.retryAnalyticsData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsVoiceInput() {
            return this.isVoiceInput;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            String str = this.messageId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<Uri> list = this.imageUris;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.fileIds;
            int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Long l7 = this.timestamp;
            int iM8289b = AbstractC2875y.m8289b((iHashCode4 + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.isVoiceInput);
            C14567l c14567l = this.retryAnalyticsData;
            return iM8289b + (c14567l != null ? c14567l.hashCode() : 0);
        }

        public String toString() {
            String str = this.message;
            String str2 = this.messageId;
            List<Uri> list = this.imageUris;
            List<String> list2 = this.fileIds;
            Long l7 = this.timestamp;
            boolean z4 = this.isVoiceInput;
            C14567l c14567l = this.retryAnalyticsData;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("SendMessage(message=", str, ", messageId=", str2, ", imageUris=");
            AbstractC21702c.m61148s(sbM32001t, list, ", fileIds=", list2, ", timestamp=");
            sbM32001t.append(l7);
            sbM32001t.append(", isVoiceInput=");
            sbM32001t.append(z4);
            sbM32001t.append(", retryAnalyticsData=");
            sbM32001t.append(c14567l);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: fl0.a$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lfl0/a$j;", "Lfl0/a;", "", "message", "messageId", "Lfl0/l;", "retryAnalyticsData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfl0/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lfl0/l;", "()Lfl0/l;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC14556a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String messageId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C14567l retryAnalyticsData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String message, String str, C14567l c14567l) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
            this.messageId = str;
            this.retryAnalyticsData = c14567l;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C14567l getRetryAnalyticsData() {
            return this.retryAnalyticsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.message, jVar.message) && AbstractC22676k.m65745e(this.messageId, jVar.messageId) && AbstractC22676k.m65745e(this.retryAnalyticsData, jVar.retryAnalyticsData);
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            String str = this.messageId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C14567l c14567l = this.retryAnalyticsData;
            return iHashCode2 + (c14567l != null ? c14567l.hashCode() : 0);
        }

        public String toString() {
            String str = this.message;
            String str2 = this.messageId;
            C14567l c14567l = this.retryAnalyticsData;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("SendMessageSuggestion(message=", str, ", messageId=", str2, ", retryAnalyticsData=");
            sbM32001t.append(c14567l);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: fl0.a$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfl0/a$l;", "Lfl0/a;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC14556a {

        /* JADX INFO: renamed from: a */
        public static final l f53227a = new l();

        private l() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: fl0.a$m */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lfl0/a$m;", "Lfl0/a;", "", "Landroid/net/Uri;", "imageUris", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC14556a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Uri> imageUris;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(List<? extends Uri> imageUris) {
            super(null);
            AbstractC22676k.m65750j(imageUris, "imageUris");
            this.imageUris = imageUris;
        }

        /* JADX INFO: renamed from: a */
        public final List<Uri> m41621a() {
            return this.imageUris;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && AbstractC22676k.m65745e(this.imageUris, ((m) other).imageUris);
        }

        public int hashCode() {
            return this.imageUris.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("UploadImages(imageUris=", ")", this.imageUris);
        }
    }

    public /* synthetic */ AbstractC14556a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC14556a() {
    }

    /* JADX INFO: renamed from: fl0.a$k */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001f\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b%\u0010\u0013R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b\u001b\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006+"}, m65681d2 = {"Lfl0/a$k;", "Lfl0/a;", "", "startingMessage", "conversationIdSeed", "source", "presetQuestion", "", "includeInitialMessage", "hasLocationPermission", "sourceId", "", "Lkotlinx/serialization/json/JsonElement;", "args", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "c", "f", "d", "e", "Z", "()Z", "g", "Ljava/util/Map;", "()Ljava/util/Map;", "i", "Ljava/lang/Long;", "()Ljava/lang/Long;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC14556a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String startingMessage;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String conversationIdSeed;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String presetQuestion;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean includeInitialMessage;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean hasLocationPermission;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String sourceId;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Map<String, JsonElement> args;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(String str, String conversationIdSeed, String source, String str2, boolean z4, boolean z13, String sourceId, Map<String, ? extends JsonElement> args, Long l7) {
            super(null);
            AbstractC22676k.m65750j(conversationIdSeed, "conversationIdSeed");
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(sourceId, "sourceId");
            AbstractC22676k.m65750j(args, "args");
            this.startingMessage = str;
            this.conversationIdSeed = conversationIdSeed;
            this.source = source;
            this.presetQuestion = str2;
            this.includeInitialMessage = z4;
            this.hasLocationPermission = z13;
            this.sourceId = sourceId;
            this.args = args;
            this.timestamp = l7;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, JsonElement> m41612a() {
            return this.args;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getConversationIdSeed() {
            return this.conversationIdSeed;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getHasLocationPermission() {
            return this.hasLocationPermission;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIncludeInitialMessage() {
            return this.includeInitialMessage;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPresetQuestion() {
            return this.presetQuestion;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.startingMessage, kVar.startingMessage) && AbstractC22676k.m65745e(this.conversationIdSeed, kVar.conversationIdSeed) && AbstractC22676k.m65745e(this.source, kVar.source) && AbstractC22676k.m65745e(this.presetQuestion, kVar.presetQuestion) && this.includeInitialMessage == kVar.includeInitialMessage && this.hasLocationPermission == kVar.hasLocationPermission && AbstractC22676k.m65745e(this.sourceId, kVar.sourceId) && AbstractC22676k.m65745e(this.args, kVar.args) && AbstractC22676k.m65745e(this.timestamp, kVar.timestamp);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getStartingMessage() {
            return this.startingMessage;
        }

        public int hashCode() {
            String str = this.startingMessage;
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.conversationIdSeed), 31, this.source);
            String str2 = this.presetQuestion;
            int iM11821e = AbstractC3855a.m11821e(this.args, AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.includeInitialMessage), 31, this.hasLocationPermission), 31, this.sourceId), 31);
            Long l7 = this.timestamp;
            return iM11821e + (l7 != null ? l7.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        public String toString() {
            String str = this.startingMessage;
            String str2 = this.conversationIdSeed;
            String str3 = this.source;
            String str4 = this.presetQuestion;
            boolean z4 = this.includeInitialMessage;
            boolean z13 = this.hasLocationPermission;
            String str5 = this.sourceId;
            Map<String, JsonElement> map = this.args;
            Long l7 = this.timestamp;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("StartConversation(startingMessage=", str, ", conversationIdSeed=", str2, ", source=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", presetQuestion=", str4, ", includeInitialMessage=");
            AbstractC38963t7.m124392v(sbM32001t, z4, ", hasLocationPermission=", z13, ", sourceId=");
            AbstractC36095b.m114695w(sbM32001t, str5, ", args=", map, ", timestamp=");
            sbM32001t.append(l7);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ k(String str, String str2, String str3, String str4, boolean z4, boolean z13, String str5, Map map, Long l7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? true : z4, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? "" : str5, (i13 & 128) != 0 ? C25272z.f99163w : map, (i13 & 256) != 0 ? null : l7);
        }
    }
}

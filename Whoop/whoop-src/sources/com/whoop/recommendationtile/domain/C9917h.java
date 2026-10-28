package com.whoop.recommendationtile.domain;

import ad3.AbstractC0757c;
import c93.InterfaceC4351m;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.recommendationtile.RecommendationTileStatus;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.RequestExtensionsKt;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import h31.C16814g;
import h31.C16824q;
import h31.EnumC16809b;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.util.List;
import jb1.C21535a;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import o91.C27684a;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import pc1.AbstractC29070d;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.C34387c;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import z02.InterfaceC39944a;

/* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010 J#\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/h;", "Lod1/g;", "Lcom/whoop/recommendationtile/domain/b;", "Lcom/whoop/recommendationtile/domain/c;", "Lu02/c;", "apiClient", "Lad3/c;", "designJson", "Ljb1/a;", "designItemReducer", "Ltr2/n;", "logger", "<init>", "(Lu02/c;Lad3/c;Ljb1/a;Ltr2/n;)V", "state", "Lh31/q;", "tile", "j", "(Lcom/whoop/recommendationtile/domain/c;Lh31/q;)Lcom/whoop/recommendationtile/domain/c;", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "action", "Lec3/l;", "Lcom/whoop/recommendationtile/domain/h$a;", "k", "(Lcom/whoop/whoopaction/domain/models/UpdateAction;)Lec3/l;", "Lcom/whoop/navigation/e;", "m", "(Lcom/whoop/whoopaction/domain/models/UpdateAction;)Lcom/whoop/navigation/e;", "", "body", "Lcom/whoop/recommendationtile/domain/RecommendationTileCommitResponse;", "n", "(Ljava/lang/String;)Lcom/whoop/recommendationtile/domain/RecommendationTileCommitResponse;", "l", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lu02/c;", "b", "Lad3/c;", "c", "Ljb1/a;", "d", "Ltr2/n;", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9917h implements InterfaceC27844g<InterfaceC9911b, C9912c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC0757c designJson;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/h$a;", "", "g", "c", "b", "a", "e", "d", "f", "Lcom/whoop/recommendationtile/domain/h$a$a;", "Lcom/whoop/recommendationtile/domain/h$a$b;", "Lcom/whoop/recommendationtile/domain/h$a$c;", "Lcom/whoop/recommendationtile/domain/h$a$d;", "Lcom/whoop/recommendationtile/domain/h$a$e;", "Lcom/whoop/recommendationtile/domain/h$a$f;", "Lcom/whoop/recommendationtile/domain/h$a$g;", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/h$a$a;", "Lcom/whoop/recommendationtile/domain/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41408a implements a {

            /* JADX INFO: renamed from: a */
            public static final C41408a f29319a = new C41408a();

            private C41408a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C41408a);
            }

            public int hashCode() {
                return 984622230;
            }

            public String toString() {
                return "CommitFailed";
            }
        }

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$a$b */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/h$a$b;", "Lcom/whoop/recommendationtile/domain/h$a;", "Lh31/q;", "tile", "Lcom/whoop/navigation/e;", "dismiss", "", "followupMessage", "<init>", "(Lh31/q;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh31/q;", "c", "()Lh31/q;", "b", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Ljava/lang/String;", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: d */
            public static final int f29320d = C9598e.f28134d;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C16824q tile;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final C9598e dismiss;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String followupMessage;

            public b(C16824q c16824q, C9598e c9598e, String str) {
                this.tile = c16824q;
                this.dismiss = c9598e;
                this.followupMessage = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C9598e getDismiss() {
                return this.dismiss;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getFollowupMessage() {
                return this.followupMessage;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final C16824q getTile() {
                return this.tile;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return AbstractC22676k.m65745e(this.tile, bVar.tile) && AbstractC22676k.m65745e(this.dismiss, bVar.dismiss) && AbstractC22676k.m65745e(this.followupMessage, bVar.followupMessage);
            }

            public int hashCode() {
                C16824q c16824q = this.tile;
                int iHashCode = (c16824q == null ? 0 : c16824q.hashCode()) * 31;
                C9598e c9598e = this.dismiss;
                int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
                String str = this.followupMessage;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                C16824q c16824q = this.tile;
                C9598e c9598e = this.dismiss;
                String str = this.followupMessage;
                StringBuilder sb4 = new StringBuilder("CommitFinished(tile=");
                sb4.append(c16824q);
                sb4.append(", dismiss=");
                sb4.append(c9598e);
                sb4.append(", followupMessage=");
                return AbstractC25012a.m73376i(str, ")", sb4);
            }
        }

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$a$c */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/h$a$c;", "Lcom/whoop/recommendationtile/domain/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a */
            public static final c f29324a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -352076984;
            }

            public String toString() {
                return "CommitStarted";
            }
        }

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$a$d */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/h$a$d;", "Lcom/whoop/recommendationtile/domain/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d implements a {

            /* JADX INFO: renamed from: a */
            public static final d f29325a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1856303376;
            }

            public String toString() {
                return "DismissConsumed";
            }
        }

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$a$e */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/h$a$e;", "Lcom/whoop/recommendationtile/domain/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e implements a {

            /* JADX INFO: renamed from: a */
            public static final e f29326a = new e();

            private e() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -349646013;
            }

            public String toString() {
                return "ErrorDismissed";
            }
        }

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$a$f */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/h$a$f;", "Lcom/whoop/recommendationtile/domain/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class f implements a {

            /* JADX INFO: renamed from: a */
            public static final f f29327a = new f();

            private f() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return 2115843198;
            }

            public String toString() {
                return "FollowupCleared";
            }
        }

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$a$g */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/h$a$g;", "Lcom/whoop/recommendationtile/domain/h$a;", "Lh31/q;", "tile", "<init>", "(Lh31/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh31/q;", "()Lh31/q;", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C16824q tile;

            public g(C16824q tile) {
                AbstractC22676k.m65750j(tile, "tile");
                this.tile = tile;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C16824q getTile() {
                return this.tile;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof g) && AbstractC22676k.m65745e(this.tile, ((g) other).tile);
            }

            public int hashCode() {
                return this.tile.hashCode();
            }

            public String toString() {
                return "Seeded(tile=" + this.tile + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.domain.RecommendationTileInteractor$commit$1", m100430f = "RecommendationTileInteractor.kt", m100431l = {103, 104, 112, 120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/recommendationtile/domain/h$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f29329E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ UpdateAction f29331G;

        /* JADX INFO: renamed from: w */
        Object f29332w;

        /* JADX INFO: renamed from: x */
        Object f29333x;

        /* JADX INFO: renamed from: y */
        Object f29334y;

        /* JADX INFO: renamed from: z */
        int f29335z;

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.domain.RecommendationTileInteractor$commit$1$apiResult$1", m100430f = "RecommendationTileInteractor.kt", m100431l = {105, 106}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            Object f29336w;

            /* JADX INFO: renamed from: x */
            int f29337x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C9917h f29338y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ UpdateAction f29339z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C9917h c9917h, UpdateAction updateAction, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f29338y = c9917h;
                this.f29339z = updateAction;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f29338y, this.f29339z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f29337x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C34387c c34387c = this.f29338y.apiClient;
                    InterfaceC39944a actionApiRequest$default = RequestExtensionsKt.toActionApiRequest$default(this.f29339z.getRequest(), null, 1, null);
                    InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(String.class);
                    C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(String.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
                    this.f29337x = 1;
                    obj = c34387c.m108748d(actionApiRequest$default, c32236aM44445Y, this);
                    if (obj != enumC31071a) {
                    }
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f29336w = null;
                this.f29337x = 2;
                Object objM60440k = AbstractC21478l0.m60440k((AbstractC14155c) obj, AbstractC39397a.f169546a, this);
                return objM60440k == enumC31071a ? enumC31071a : objM60440k;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super String> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UpdateAction updateAction, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29331G = updateAction;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C9917h.this.new b(this.f29331G, interfaceC30057d);
            bVar.f29329E = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0076  */
        /* JADX WARN: Code duplicated, block: B:30:0x009d  */
        /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:50:0x00e4  */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
        
            if (r8.emit(r3, r13) == r9) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L47;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.recommendationtile.domain.C9917h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.domain.RecommendationTileInteractor$interact$$inlined$flatMapLatest$1", m100430f = "RecommendationTileInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f29340w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f29341x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29342y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C9917h f29343z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C9917h c9917h) {
            super(3, interfaceC30057d);
            this.f29343z = c9917h;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC9911b interfaceC9911b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f29343z);
            cVar.f29341x = interfaceC13062m;
            cVar.f29342y = interfaceC9911b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM24345k;
            C0456u c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29340w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f29341x;
                InterfaceC9911b interfaceC9911b = (InterfaceC9911b) this.f29342y;
                if (interfaceC9911b instanceof InterfaceC9911b.e) {
                    interfaceC13058lM24345k = new C0456u(new a.g(((InterfaceC9911b.e) interfaceC9911b).getTile()), 1);
                } else {
                    if (interfaceC9911b instanceof InterfaceC9911b.d) {
                        c0456u = new C0456u(a.e.f29326a, 1);
                    } else if (interfaceC9911b instanceof InterfaceC9911b.c) {
                        c0456u = new C0456u(a.d.f29325a, 1);
                    } else if (interfaceC9911b instanceof InterfaceC9911b.a) {
                        c0456u = new C0456u(a.f.f29327a, 1);
                    } else {
                        if (!(interfaceC9911b instanceof InterfaceC9911b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC13058lM24345k = this.f29343z.m24345k(((InterfaceC9911b.b) interfaceC9911b).getAction());
                    }
                    interfaceC13058lM24345k = c0456u;
                }
                this.f29341x = null;
                this.f29342y = null;
                this.f29340w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM24345k, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC9911b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.h$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.domain.RecommendationTileInteractor$interact$2", m100430f = "RecommendationTileInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/c;", "state", "Lcom/whoop/recommendationtile/domain/h$a;", "result", "<anonymous>", "(Lcom/whoop/recommendationtile/domain/c;Lcom/whoop/recommendationtile/domain/h$a;)Lcom/whoop/recommendationtile/domain/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f29344w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f29345x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29346y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C9912c c9912c, a aVar, InterfaceC30057d<? super C9912c> interfaceC30057d) {
            d dVar = C9917h.this.new d(interfaceC30057d);
            dVar.f29345x = c9912c;
            dVar.f29346y = aVar;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C9912c c9912cM24297b;
            C9912c c9912c = (C9912c) this.f29345x;
            a aVar = (a) this.f29346y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f29344w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (aVar instanceof a.g) {
                a.g gVar = (a.g) aVar;
                return (gVar.getTile().getRecommendationId().length() <= 0 || !AbstractC22676k.m65745e(gVar.getTile().getRecommendationId(), c9912c.getRecommendationId())) ? C9912c.m24297b(C9917h.this.m24344j(c9912c, gVar.getTile()), null, null, false, false, null, null, null, false, false, null, null, null, 2047, null) : C9912c.m24297b(c9912c, null, null, false, false, null, null, null, false, false, null, null, null, 4091, null);
            }
            if (aVar instanceof a.c) {
                return C9912c.m24297b(c9912c, null, null, true, false, null, null, null, false, false, null, null, null, 4083, null);
            }
            if (aVar instanceof a.b) {
                a.b bVar = (a.b) aVar;
                C16824q tile = bVar.getTile();
                if (tile == null || (c9912cM24297b = C9917h.this.m24344j(c9912c, tile)) == null) {
                    c9912cM24297b = C9912c.m24297b(c9912c, null, null, false, false, null, null, null, false, false, null, null, null, 4083, null);
                }
                return C9912c.m24297b(c9912cM24297b, null, null, false, false, null, null, null, false, false, null, bVar.getDismiss(), bVar.getFollowupMessage(), 1023, null);
            }
            if (aVar instanceof a.C41408a) {
                return C9912c.m24297b(c9912c, null, null, false, true, null, null, null, false, false, null, null, null, 4083, null);
            }
            if (aVar instanceof a.e) {
                return C9912c.m24297b(c9912c, null, null, false, false, null, null, null, false, false, null, null, null, 4087, null);
            }
            if (aVar instanceof a.d) {
                return C9912c.m24297b(c9912c, null, null, false, false, null, null, null, false, false, null, null, null, 3071, null);
            }
            if (aVar instanceof a.f) {
                return C9912c.m24297b(c9912c, null, null, false, false, null, null, null, false, false, null, null, null, 2047, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C9917h(C34387c apiClient, AbstractC0757c designJson, C21535a designItemReducer, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(designJson, "designJson");
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        AbstractC22676k.m65750j(logger, "logger");
        this.apiClient = apiClient;
        this.designJson = designJson;
        this.designItemReducer = designItemReducer;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C9912c m24344j(C9912c state, C16824q tile) {
        String recommendationId = tile.getRecommendationId();
        RecommendationTileStatus recommendationTileStatusM88377c = AbstractC29070d.m88377c(tile.getStyle());
        InterfaceC25312u header = tile.getHeader();
        List<InterfaceC25312u> listM47398b = tile.m47398b();
        InterfaceC25312u cta = tile.getCta();
        C16814g c16814g = cta instanceof C16814g ? (C16814g) cta : null;
        boolean isExpanded = tile.getIsExpanded();
        boolean isSelected = tile.getIsSelected();
        EnumC16809b backgroundStyle = tile.getBackgroundStyle();
        if (backgroundStyle == null) {
            backgroundStyle = state.getBackgroundStyle();
        }
        return C9912c.m24297b(state, recommendationId, recommendationTileStatusM88377c, false, false, header, listM47398b, c16814g, isExpanded, isSelected, backgroundStyle, null, null, 3072, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m24345k(UpdateAction action) {
        return new C13084s1(new b(action, null));
    }

    /* JADX INFO: renamed from: l */
    private final RecommendationTileCommitResponse m24346l(String body) {
        try {
            AbstractC0757c abstractC0757c = this.designJson;
            abstractC0757c.getClass();
            return (RecommendationTileCommitResponse) abstractC0757c.m1831b(RecommendationTileCommitResponse.INSTANCE.serializer(), body);
        } catch (SerializationException unused) {
            return new RecommendationTileCommitResponse((DesignSystemModel) this.designJson.m1831b(new C27684a(null, null, null, 7, null), body), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C9598e m24347m(UpdateAction updateAction) {
        C9598e completionDestination = updateAction.getCompletionDestination();
        if (completionDestination != null) {
            return completionDestination;
        }
        if (updateAction.getDismissEvent() != null) {
            return new C9598e(null, null, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final RecommendationTileCommitResponse m24348n(String body) {
        if (AbstractC39414r.m125890i0(body)) {
            return null;
        }
        try {
            return m24346l(body);
        } catch (SerializationException e5) {
            this.logger.mo85228t(AbstractC11266d.m30461o("RecommendationTile commit response was not a tile body: ", e5.getMessage()), new AbstractC30556a.a[0]);
            return null;
        } catch (IllegalArgumentException e13) {
            this.logger.mo85228t(AbstractC11266d.m30461o("RecommendationTile commit response was not a design item: ", e13.getMessage()), new AbstractC30556a.a[0]);
            return null;
        }
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(new C9912c(null, null, false, false, null, null, null, false, false, null, null, null, 4095, null), AbstractC13091v.m36590P(upstream, new c(null, this)), new d(null)), 1);
    }

    public /* synthetic */ C9917h(C34387c c34387c, AbstractC0757c abstractC0757c, C21535a c21535a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34387c, (i13 & 2) != 0 ? AbstractC6728b.m20379d(null, null, null, null, null, 31, null) : abstractC0757c, (i13 & 4) != 0 ? new C21535a(null, null, 3, null) : c21535a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("RecommendationTileInteractor") : interfaceC34116n);
    }
}

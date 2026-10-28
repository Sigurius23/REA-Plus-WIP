package com.whoop.archv2.feature.domain;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.ReloadAction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ri0.InterfaceC31443b;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i;", "", "<init>", "()V", "m", "o", "p", "c", "n", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "d", "f", "e", "a", "l", "b", "k", "j", "Lcom/whoop/archv2/feature/domain/i$a;", "Lcom/whoop/archv2/feature/domain/i$b;", "Lcom/whoop/archv2/feature/domain/i$c;", "Lcom/whoop/archv2/feature/domain/i$d;", "Lcom/whoop/archv2/feature/domain/i$e;", "Lcom/whoop/archv2/feature/domain/i$f;", "Lcom/whoop/archv2/feature/domain/i$g;", "Lcom/whoop/archv2/feature/domain/i$h;", "Lcom/whoop/archv2/feature/domain/i$i;", "Lcom/whoop/archv2/feature/domain/i$j;", "Lcom/whoop/archv2/feature/domain/i$k;", "Lcom/whoop/archv2/feature/domain/i$l;", "Lcom/whoop/archv2/feature/domain/i$m;", "Lcom/whoop/archv2/feature/domain/i$n;", "Lcom/whoop/archv2/feature/domain/i$o;", "Lcom/whoop/archv2/feature/domain/i$p;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6001i {

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$a */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$a;", "Lcom/whoop/archv2/feature/domain/i;", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/navigation/models/ApiRequest;", "nextPageRequest", "<init>", "(Ljava/util/List;Lcom/whoop/navigation/models/ApiRequest;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/whoop/navigation/models/ApiRequest;", "()Lcom/whoop/navigation/models/ApiRequest;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC6001i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<DesignSystemModel> items;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ApiRequest nextPageRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends DesignSystemModel> items, ApiRequest apiRequest) {
            super(null);
            AbstractC22676k.m65750j(items, "items");
            this.items = items;
            this.nextPageRequest = apiRequest;
        }

        /* JADX INFO: renamed from: a */
        public final List<DesignSystemModel> m18004a() {
            return this.items;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ApiRequest getNextPageRequest() {
            return this.nextPageRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.items, aVar.items) && AbstractC22676k.m65745e(this.nextPageRequest, aVar.nextPageRequest);
        }

        public int hashCode() {
            int iHashCode = this.items.hashCode() * 31;
            ApiRequest apiRequest = this.nextPageRequest;
            return iHashCode + (apiRequest == null ? 0 : apiRequest.hashCode());
        }

        public String toString() {
            return "AppendItems(items=" + this.items + ", nextPageRequest=" + this.nextPageRequest + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$b;", "Lcom/whoop/archv2/feature/domain/i;", "<init>", "()V", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC6001i {

        /* JADX INFO: renamed from: a */
        public static final b f23934a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$c;", "Lcom/whoop/archv2/feature/domain/i;", "Lcom/whoop/archv2/feature/domain/c;", "domainAction", "<init>", "(Lcom/whoop/archv2/feature/domain/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/archv2/feature/domain/c;", "()Lcom/whoop/archv2/feature/domain/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC6001i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC5995c domainAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC5995c domainAction) {
            super(null);
            AbstractC22676k.m65750j(domainAction, "domainAction");
            this.domainAction = domainAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC5995c getDomainAction() {
            return this.domainAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.domainAction, ((c) other).domainAction);
        }

        public int hashCode() {
            return this.domainAction.hashCode();
        }

        public String toString() {
            return "HandleDomainAction(domainAction=" + this.domainAction + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$d;", "Lcom/whoop/archv2/feature/domain/i;", "<init>", "()V", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC6001i {

        /* JADX INFO: renamed from: a */
        public static final d f23936a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$e;", "Lcom/whoop/archv2/feature/domain/i;", "<init>", "()V", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC6001i {

        /* JADX INFO: renamed from: a */
        public static final e f23937a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$f;", "Lcom/whoop/archv2/feature/domain/i;", "<init>", "()V", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC6001i {

        /* JADX INFO: renamed from: a */
        public static final f f23938a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$g;", "Lcom/whoop/archv2/feature/domain/i;", "", "key", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC6001i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String key) {
            super(null);
            AbstractC22676k.m65750j(key, "key");
            this.key = key;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.key, ((g) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("PopAccumulatedKey(key=", this.key, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$h */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$h;", "Lcom/whoop/archv2/feature/domain/i;", "", "key", "Lkotlinx/serialization/json/JsonElement;", "value", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lkotlinx/serialization/json/JsonElement;", "()Lkotlinx/serialization/json/JsonElement;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC6001i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final JsonElement value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String key, JsonElement value) {
            super(null);
            AbstractC22676k.m65750j(key, "key");
            AbstractC22676k.m65750j(value, "value");
            this.key = key;
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final JsonElement getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.key, hVar.key) && AbstractC22676k.m65745e(this.value, hVar.value);
        }

        public int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        public String toString() {
            return "PushAccumulatedKey(key=" + this.key + ", value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$i */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$i;", "Lcom/whoop/archv2/feature/domain/i;", "", "", "keys", "<init>", "(Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC6001i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Set<String> keys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Set<String> keys) {
            super(null);
            AbstractC22676k.m65750j(keys, "keys");
            this.keys = keys;
        }

        /* JADX INFO: renamed from: a */
        public final Set<String> m18010a() {
            return this.keys;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.keys, ((i) other).keys);
        }

        public int hashCode() {
            return this.keys.hashCode();
        }

        public String toString() {
            return "RemoveAccumulatedKeys(keys=" + this.keys + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$j;", "Lcom/whoop/archv2/feature/domain/i;", "Lcom/whoop/archv2/feature/domain/p;", "pick", "<init>", "(Lcom/whoop/archv2/feature/domain/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/archv2/feature/domain/p;", "()Lcom/whoop/archv2/feature/domain/p;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC6001i {

        /* JADX INFO: renamed from: b */
        public static final int f23943b = GenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C6010p pick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C6010p pick) {
            super(null);
            AbstractC22676k.m65750j(pick, "pick");
            this.pick = pick;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C6010p getPick() {
            return this.pick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.pick, ((j) other).pick);
        }

        public int hashCode() {
            return this.pick.hashCode();
        }

        public String toString() {
            return "SetPendingMediaPick(pick=" + this.pick + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$k;", "Lcom/whoop/archv2/feature/domain/i;", "Lcom/whoop/archv2/feature/domain/q;", "request", "<init>", "(Lcom/whoop/archv2/feature/domain/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/archv2/feature/domain/q;", "()Lcom/whoop/archv2/feature/domain/q;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC6001i {

        /* JADX INFO: renamed from: b */
        public static final int f23945b = GenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C6011q request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C6011q request) {
            super(null);
            AbstractC22676k.m65750j(request, "request");
            this.request = request;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C6011q getRequest() {
            return this.request;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && AbstractC22676k.m65745e(this.request, ((k) other).request);
        }

        public int hashCode() {
            return this.request.hashCode();
        }

        public String toString() {
            return "SetPendingPermissionRequest(request=" + this.request + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$l */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$l;", "Lcom/whoop/archv2/feature/domain/i;", "Lcom/whoop/whoopaction/domain/models/ReloadAction;", "reloadAction", "<init>", "(Lcom/whoop/whoopaction/domain/models/ReloadAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/ReloadAction;", "()Lcom/whoop/whoopaction/domain/models/ReloadAction;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC6001i {

        /* JADX INFO: renamed from: b */
        public static final int f23947b = ReloadAction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ReloadAction reloadAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ReloadAction reloadAction) {
            super(null);
            AbstractC22676k.m65750j(reloadAction, "reloadAction");
            this.reloadAction = reloadAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ReloadAction getReloadAction() {
            return this.reloadAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && AbstractC22676k.m65745e(this.reloadAction, ((l) other).reloadAction);
        }

        public int hashCode() {
            return this.reloadAction.hashCode();
        }

        public String toString() {
            return "SetPendingReload(reloadAction=" + this.reloadAction + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$m;", "Lcom/whoop/archv2/feature/domain/i;", "Lcom/whoop/archv2/feature/domain/f;", "domainState", "<init>", "(Lcom/whoop/archv2/feature/domain/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/archv2/feature/domain/f;", "()Lcom/whoop/archv2/feature/domain/f;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC6001i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C5998f domainState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C5998f domainState) {
            super(null);
            AbstractC22676k.m65750j(domainState, "domainState");
            this.domainState = domainState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C5998f getDomainState() {
            return this.domainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && AbstractC22676k.m65745e(this.domainState, ((m) other).domainState);
        }

        public int hashCode() {
            return this.domainState.hashCode();
        }

        public String toString() {
            return "ShowContent(domainState=" + this.domainState + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$n */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$n;", "Lcom/whoop/archv2/feature/domain/i;", "", "", "", "accumulatedState", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC6001i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, Object> accumulatedState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Map<String, ? extends Object> accumulatedState) {
            super(null);
            AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
            this.accumulatedState = accumulatedState;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, Object> m18015a() {
            return this.accumulatedState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && AbstractC22676k.m65745e(this.accumulatedState, ((n) other).accumulatedState);
        }

        public int hashCode() {
            return this.accumulatedState.hashCode();
        }

        public String toString() {
            return AbstractC26725a.m79504h("UpdateAccumulatedState(accumulatedState=", ")", this.accumulatedState);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$o */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$o;", "Lcom/whoop/archv2/feature/domain/i;", "Lcom/whoop/archv2/feature/domain/b;", "dialogType", "<init>", "(Lcom/whoop/archv2/feature/domain/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/archv2/feature/domain/b;", "()Lcom/whoop/archv2/feature/domain/b;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC6001i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC5994b dialogType;

        public o(InterfaceC5994b interfaceC5994b) {
            super(null);
            this.dialogType = interfaceC5994b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC5994b getDialogType() {
            return this.dialogType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && AbstractC22676k.m65745e(this.dialogType, ((o) other).dialogType);
        }

        public int hashCode() {
            InterfaceC5994b interfaceC5994b = this.dialogType;
            if (interfaceC5994b == null) {
                return 0;
            }
            return interfaceC5994b.hashCode();
        }

        public String toString() {
            return "UpdateDialog(dialogType=" + this.dialogType + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.i$p */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/i$p;", "Lcom/whoop/archv2/feature/domain/i;", "Lri0/b$n;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lri0/b$n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lri0/b$n;", "()Lri0/b$n;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC6001i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC31443b.n event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC31443b.n event) {
            super(null);
            AbstractC22676k.m65750j(event, "event");
            this.event = event;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC31443b.n getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p) && AbstractC22676k.m65745e(this.event, ((p) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "UpdateNavigation(event=" + this.event + ")";
        }
    }

    public /* synthetic */ AbstractC6001i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6001i() {
    }
}

package vg0;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.json.JsonElement;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vg0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001f\u0010\u0011R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0018\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011¨\u0006%"}, m65681d2 = {"Lvg0/l;", "", "", "fingerprint", "source", "sourceId", "initialMessage", "presetQuestionKey", "", "Lkotlinx/serialization/json/JsonElement;", "args", "", "isWcePrefetch", "entrypointExperience", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "f", "g", "d", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35998l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fingerprint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String sourceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String initialMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String presetQuestionKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Map<String, JsonElement> args;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isWcePrefetch;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String entrypointExperience;

    /* JADX WARN: Multi-variable type inference failed */
    public C35998l(String str, String source, String str2, String str3, String str4, Map<String, ? extends JsonElement> args, boolean z4, String str5) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(args, "args");
        this.fingerprint = str;
        this.source = source;
        this.sourceId = str2;
        this.initialMessage = str3;
        this.presetQuestionKey = str4;
        this.args = args;
        this.isWcePrefetch = z4;
        this.entrypointExperience = str5;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, JsonElement> m114319a() {
        return this.args;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEntrypointExperience() {
        return this.entrypointExperience;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInitialMessage() {
        return this.initialMessage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPresetQuestionKey() {
        return this.presetQuestionKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35998l)) {
            return false;
        }
        C35998l c35998l = (C35998l) other;
        return AbstractC22676k.m65745e(this.fingerprint, c35998l.fingerprint) && AbstractC22676k.m65745e(this.source, c35998l.source) && AbstractC22676k.m65745e(this.sourceId, c35998l.sourceId) && AbstractC22676k.m65745e(this.initialMessage, c35998l.initialMessage) && AbstractC22676k.m65745e(this.presetQuestionKey, c35998l.presetQuestionKey) && AbstractC22676k.m65745e(this.args, c35998l.args) && this.isWcePrefetch == c35998l.isWcePrefetch && AbstractC22676k.m65745e(this.entrypointExperience, c35998l.entrypointExperience);
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
    public final boolean getIsWcePrefetch() {
        return this.isWcePrefetch;
    }

    public int hashCode() {
        String str = this.fingerprint;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.source);
        String str2 = this.sourceId;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initialMessage;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.presetQuestionKey;
        int iM8289b = AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.args, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, this.isWcePrefetch);
        String str5 = this.entrypointExperience;
        return iM8289b + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.fingerprint;
        String str2 = this.source;
        String str3 = this.sourceId;
        String str4 = this.initialMessage;
        String str5 = this.presetQuestionKey;
        Map<String, JsonElement> map = this.args;
        boolean z4 = this.isWcePrefetch;
        String str6 = this.entrypointExperience;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CreateConversationAction(fingerprint=", str, ", source=", str2, ", sourceId=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", initialMessage=", str4, ", presetQuestionKey=");
        AbstractC36095b.m114695w(sbM32001t, str5, ", args=", map, ", isWcePrefetch=");
        return AbstractC21702c.m61139j(sbM32001t, z4, ", entrypointExperience=", str6, ")");
    }
}

package com.whoop.navigation;

import ad3.AbstractC0757c;
import ad3.C0764g;
import ad3.C0771n;
import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p710im1.C18681l0;
import p710im1.C18689p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yb3.AbstractC39421y;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`aBÃ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aBÏ\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0012\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u001c\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b5\u00106Jâ\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010!J\u0010\u0010:\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>J'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bE\u0010FR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bJ\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bK\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bL\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bM\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010H\u001a\u0004\bN\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010H\u001a\u0004\bO\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bP\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bQ\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010R\u001a\u0004\bS\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bT\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bV\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bW\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bX\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\bZ\u00102R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u00104R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010]\u001a\u0004\b^\u00106¨\u0006b"}, m65681d2 = {"Lcom/whoop/navigation/AiAction;", "", "", "source", "screenId", "sourceType", "sourceId", "agentId", "conversationSeedId", "fingerprint", "presetQuestion", "educationType", "", "shouldOpenFullSize", "entryText", "includeInitialMessage", "staticInitialMessage", "userMessage", "Lcom/whoop/navigation/ChatEntrypointExperience;", "entrypointExperience", "", "Lkotlinx/serialization/json/JsonElement;", "args", "Lcom/whoop/navigation/DrawerPresentation;", "drawerPresentation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Z", "component11", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "component15", "()Lcom/whoop/navigation/ChatEntrypointExperience;", "component16", "()Ljava/util/Map;", "component17", "()Lcom/whoop/navigation/DrawerPresentation;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;)Lcom/whoop/navigation/AiAction;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/AiAction;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getSource", "getScreenId", "getSourceType", "getSourceId", "getAgentId", "getConversationSeedId", "getFingerprint", "getPresetQuestion", "getEducationType", "Z", "getShouldOpenFullSize", "getEntryText", "Ljava/lang/Boolean;", "getIncludeInitialMessage", "getStaticInitialMessage", "getUserMessage", "Lcom/whoop/navigation/ChatEntrypointExperience;", "getEntrypointExperience", "Ljava/util/Map;", "getArgs", "Lcom/whoop/navigation/DrawerPresentation;", "getDrawerPresentation", "Companion", "a", "$serializer", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiAction {
    private static final InterfaceC23462h[] $childSerializers;
    private static final String PREFIX = "ai_action.";
    private static final AbstractC0757c json;
    private static final InterfaceC34116n logger;
    private final String agentId;
    private final Map<String, JsonElement> args;
    private final String conversationSeedId;
    private final DrawerPresentation drawerPresentation;
    private final String educationType;
    private final String entryText;
    private final ChatEntrypointExperience entrypointExperience;
    private final String fingerprint;
    private final Boolean includeInitialMessage;
    private final String presetQuestion;
    private final String screenId;
    private final boolean shouldOpenFullSize;
    private final String source;
    private final String sourceId;
    private final String sourceType;
    private final String staticInitialMessage;
    private final String userMessage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.AiAction$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/navigation/AiAction$a;", "", "<init>", "()V", "", "raw", "Lcom/whoop/navigation/DrawerPresentation;", "c", "(Ljava/lang/String;)Lcom/whoop/navigation/DrawerPresentation;", "encoded", "", "Lkotlinx/serialization/json/JsonElement;", "b", "(Ljava/lang/String;)Ljava/util/Map;", "queryMap", "Lcom/whoop/navigation/AiAction;", "a", "(Ljava/util/Map;)Lcom/whoop/navigation/AiAction;", "Lwc3/c;", "serializer", "()Lwc3/c;", "PREFIX", "Ljava/lang/String;", "Lad3/c;", "json", "Lad3/c;", "Ltr2/n;", "logger", "Ltr2/n;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private final Map<String, JsonElement> m23022b(String encoded) {
            C25272z c25272z = C25272z.f99163w;
            if (encoded != null) {
                try {
                    if (encoded.length() <= 0) {
                        encoded = null;
                    }
                    if (encoded != null) {
                        AbstractC0757c abstractC0757c = AiAction.json;
                        abstractC0757c.getClass();
                        Map<String, JsonElement> map = (Map) abstractC0757c.m1831b(new LinkedHashMapSerializer(StringSerializer.INSTANCE, JsonElement.Companion.serializer()), encoded);
                        if (map != null) {
                            return map;
                        }
                    }
                } catch (Exception e5) {
                    AiAction.logger.mo85230v("Failed to deserialize AiAction args", e5, new AbstractC30556a.a[0]);
                }
            }
            return c25272z;
        }

        /* JADX INFO: renamed from: c */
        private final DrawerPresentation m23023c(String raw) {
            Object obj = null;
            if (raw == null) {
                return null;
            }
            for (Object obj2 : DrawerPresentation.getEntries()) {
                if (AbstractC39421y.m125921F(((DrawerPresentation) obj2).name(), raw, true)) {
                    obj = obj2;
                    break;
                }
            }
            return (DrawerPresentation) obj;
        }

        /* JADX INFO: renamed from: a */
        public final AiAction m23024a(Map<String, String> queryMap) {
            AbstractC22676k.m65750j(queryMap, "queryMap");
            Set<String> setKeySet = queryMap.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator<T> it = setKeySet.iterator();
                while (it.hasNext()) {
                    if (AbstractC39421y.m125930O((String) it.next(), AiAction.PREFIX, false)) {
                        String str = queryMap.get("ai_action.source");
                        String str2 = queryMap.get("ai_action.screen_id");
                        String str3 = queryMap.get("ai_action.source_type");
                        if (str3 == null) {
                            str3 = "CHAT_WITH_AGENT";
                        }
                        String str4 = str3;
                        String str5 = queryMap.get("ai_action.source_id");
                        String str6 = queryMap.get("ai_action.agent_id");
                        String str7 = queryMap.get("ai_action.conversation_seed_id");
                        String str8 = queryMap.get("ai_action.fingerprint");
                        String str9 = queryMap.get("ai_action.preset_question");
                        String str10 = queryMap.get("ai_action.education_type");
                        String str11 = queryMap.get("ai_action.should_open_full_size");
                        boolean z4 = str11 != null ? Boolean.parseBoolean(str11) : false;
                        String str12 = queryMap.get("ai_action.entry_text");
                        String str13 = queryMap.get("ai_action.include_initial_message");
                        return new AiAction(str, str2, str4, str5, str6, str7, str8, str9, str10, z4, str12, str13 != null ? Boolean.valueOf(Boolean.parseBoolean(str13)) : null, queryMap.get("ai_action.static_initial_message"), queryMap.get("ai_action.user_message"), (ChatEntrypointExperience) null, m23022b(queryMap.get("ai_action.args")), m23023c(queryMap.get("ai_action.drawer_presentation")), DfuBaseService.ERROR_CONNECTION_MASK, (DefaultConstructorMarker) null);
                    }
                }
            }
            return null;
        }

        public final InterfaceC37138c serializer() {
            return AiAction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C18681l0(23)), AbstractC30060g.m92087G(enumC23463i, new C18681l0(24)), AbstractC30060g.m92087G(enumC23463i, new C18681l0(25))};
        json = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C18689p0(19));
        logger = InterfaceC34116n.INSTANCE.m107848a("AiAction");
    }

    public /* synthetic */ AiAction(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z4, String str10, Boolean bool, String str11, String str12, ChatEntrypointExperience chatEntrypointExperience, Map map, DrawerPresentation drawerPresentation, SerializationConstructorMarker serializationConstructorMarker) {
        if (7675 != (i13 & 7675)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7675, AiAction$$serializer.INSTANCE.getDescriptor());
        }
        this.source = str;
        this.screenId = str2;
        if ((i13 & 4) == 0) {
            this.sourceType = "";
        } else {
            this.sourceType = str3;
        }
        this.sourceId = str4;
        this.agentId = str5;
        this.conversationSeedId = str6;
        this.fingerprint = str7;
        this.presetQuestion = str8;
        this.educationType = str9;
        if ((i13 & 512) == 0) {
            this.shouldOpenFullSize = false;
        } else {
            this.shouldOpenFullSize = z4;
        }
        this.entryText = str10;
        this.includeInitialMessage = bool;
        this.staticInitialMessage = str11;
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.userMessage = null;
        } else {
            this.userMessage = str12;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.entrypointExperience = null;
        } else {
            this.entrypointExperience = chatEntrypointExperience;
        }
        this.args = (32768 & i13) == 0 ? C25272z.f99163w : map;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
            this.drawerPresentation = null;
        } else {
            this.drawerPresentation = drawerPresentation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ChatEntrypointExperience.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, C0771n.f2806a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return DrawerPresentation.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiAction copy$default(AiAction aiAction, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z4, String str10, Boolean bool, String str11, String str12, ChatEntrypointExperience chatEntrypointExperience, Map map, DrawerPresentation drawerPresentation, int i13, Object obj) {
        DrawerPresentation drawerPresentation2;
        Map map2;
        String str13 = (i13 & 1) != 0 ? aiAction.source : str;
        String str14 = (i13 & 2) != 0 ? aiAction.screenId : str2;
        String str15 = (i13 & 4) != 0 ? aiAction.sourceType : str3;
        String str16 = (i13 & 8) != 0 ? aiAction.sourceId : str4;
        String str17 = (i13 & 16) != 0 ? aiAction.agentId : str5;
        String str18 = (i13 & 32) != 0 ? aiAction.conversationSeedId : str6;
        String str19 = (i13 & 64) != 0 ? aiAction.fingerprint : str7;
        String str20 = (i13 & 128) != 0 ? aiAction.presetQuestion : str8;
        String str21 = (i13 & 256) != 0 ? aiAction.educationType : str9;
        boolean z13 = (i13 & 512) != 0 ? aiAction.shouldOpenFullSize : z4;
        String str22 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? aiAction.entryText : str10;
        Boolean bool2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? aiAction.includeInitialMessage : bool;
        String str23 = (i13 & 4096) != 0 ? aiAction.staticInitialMessage : str11;
        String str24 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? aiAction.userMessage : str12;
        String str25 = str13;
        ChatEntrypointExperience chatEntrypointExperience2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? aiAction.entrypointExperience : chatEntrypointExperience;
        Map map3 = (i13 & 32768) != 0 ? aiAction.args : map;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            map2 = map3;
            drawerPresentation2 = aiAction.drawerPresentation;
        } else {
            drawerPresentation2 = drawerPresentation;
            map2 = map3;
        }
        return aiAction.copy(str25, str14, str15, str16, str17, str18, str19, str20, str21, z13, str22, bool2, str23, str24, chatEntrypointExperience2, map2, drawerPresentation2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 json$lambda$0(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2776c = true;
        Json.f2780g = true;
        Json.f2785l = true;
        return C23454a0.f92919a;
    }

    public static final /* synthetic */ void write$Self$navigation_release(AiAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.source);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.screenId);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.sourceType, "")) {
            output.encodeStringElement(serialDesc, 2, self.sourceType);
        }
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.sourceId);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.agentId);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.conversationSeedId);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.fingerprint);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.presetQuestion);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.educationType);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.shouldOpenFullSize) {
            output.encodeBooleanElement(serialDesc, 9, self.shouldOpenFullSize);
        }
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.entryText);
        output.encodeNullableSerializableElement(serialDesc, 11, BooleanSerializer.INSTANCE, self.includeInitialMessage);
        output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.staticInitialMessage);
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.userMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.userMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.entrypointExperience != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, (InterfaceC37145j) interfaceC23462hArr[14].getValue(), self.entrypointExperience);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || !AbstractC22676k.m65745e(self.args, C25272z.f99163w)) {
            output.encodeSerializableElement(serialDesc, 15, (InterfaceC37145j) interfaceC23462hArr[15].getValue(), self.args);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 16) && self.drawerPresentation == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 16, (InterfaceC37145j) interfaceC23462hArr[16].getValue(), self.drawerPresentation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShouldOpenFullSize() {
        return this.shouldOpenFullSize;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getEntryText() {
        return this.entryText;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getIncludeInitialMessage() {
        return this.includeInitialMessage;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getStaticInitialMessage() {
        return this.staticInitialMessage;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getUserMessage() {
        return this.userMessage;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final ChatEntrypointExperience getEntrypointExperience() {
        return this.entrypointExperience;
    }

    public final Map<String, JsonElement> component16() {
        return this.args;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final DrawerPresentation getDrawerPresentation() {
        return this.drawerPresentation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScreenId() {
        return this.screenId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPresetQuestion() {
        return this.presetQuestion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEducationType() {
        return this.educationType;
    }

    public final AiAction copy(String source, String screenId, String sourceType, String sourceId, String agentId, String conversationSeedId, String fingerprint, String presetQuestion, String educationType, boolean shouldOpenFullSize, String entryText, Boolean includeInitialMessage, String staticInitialMessage, String userMessage, ChatEntrypointExperience entrypointExperience, Map<String, ? extends JsonElement> args, DrawerPresentation drawerPresentation) {
        AbstractC22676k.m65750j(sourceType, "sourceType");
        AbstractC22676k.m65750j(args, "args");
        return new AiAction(source, screenId, sourceType, sourceId, agentId, conversationSeedId, fingerprint, presetQuestion, educationType, shouldOpenFullSize, entryText, includeInitialMessage, staticInitialMessage, userMessage, entrypointExperience, args, drawerPresentation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiAction)) {
            return false;
        }
        AiAction aiAction = (AiAction) other;
        return AbstractC22676k.m65745e(this.source, aiAction.source) && AbstractC22676k.m65745e(this.screenId, aiAction.screenId) && AbstractC22676k.m65745e(this.sourceType, aiAction.sourceType) && AbstractC22676k.m65745e(this.sourceId, aiAction.sourceId) && AbstractC22676k.m65745e(this.agentId, aiAction.agentId) && AbstractC22676k.m65745e(this.conversationSeedId, aiAction.conversationSeedId) && AbstractC22676k.m65745e(this.fingerprint, aiAction.fingerprint) && AbstractC22676k.m65745e(this.presetQuestion, aiAction.presetQuestion) && AbstractC22676k.m65745e(this.educationType, aiAction.educationType) && this.shouldOpenFullSize == aiAction.shouldOpenFullSize && AbstractC22676k.m65745e(this.entryText, aiAction.entryText) && AbstractC22676k.m65745e(this.includeInitialMessage, aiAction.includeInitialMessage) && AbstractC22676k.m65745e(this.staticInitialMessage, aiAction.staticInitialMessage) && AbstractC22676k.m65745e(this.userMessage, aiAction.userMessage) && this.entrypointExperience == aiAction.entrypointExperience && AbstractC22676k.m65745e(this.args, aiAction.args) && this.drawerPresentation == aiAction.drawerPresentation;
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final Map<String, JsonElement> getArgs() {
        return this.args;
    }

    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    public final DrawerPresentation getDrawerPresentation() {
        return this.drawerPresentation;
    }

    public final String getEducationType() {
        return this.educationType;
    }

    public final String getEntryText() {
        return this.entryText;
    }

    public final ChatEntrypointExperience getEntrypointExperience() {
        return this.entrypointExperience;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final Boolean getIncludeInitialMessage() {
        return this.includeInitialMessage;
    }

    public final String getPresetQuestion() {
        return this.presetQuestion;
    }

    public final String getScreenId() {
        return this.screenId;
    }

    public final boolean getShouldOpenFullSize() {
        return this.shouldOpenFullSize;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public final String getStaticInitialMessage() {
        return this.staticInitialMessage;
    }

    public final String getUserMessage() {
        return this.userMessage;
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.screenId;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.sourceType);
        String str3 = this.sourceId;
        int iHashCode2 = (iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentId;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.conversationSeedId;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fingerprint;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.presetQuestion;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.educationType;
        int iM8289b = AbstractC2875y.m8289b((iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.shouldOpenFullSize);
        String str9 = this.entryText;
        int iHashCode7 = (iM8289b + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.includeInitialMessage;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.staticInitialMessage;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.userMessage;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        ChatEntrypointExperience chatEntrypointExperience = this.entrypointExperience;
        int iM11821e = AbstractC3855a.m11821e(this.args, (iHashCode10 + (chatEntrypointExperience == null ? 0 : chatEntrypointExperience.hashCode())) * 31, 31);
        DrawerPresentation drawerPresentation = this.drawerPresentation;
        return iM11821e + (drawerPresentation != null ? drawerPresentation.hashCode() : 0);
    }

    public String toString() {
        String str = this.source;
        String str2 = this.screenId;
        String str3 = this.sourceType;
        String str4 = this.sourceId;
        String str5 = this.agentId;
        String str6 = this.conversationSeedId;
        String str7 = this.fingerprint;
        String str8 = this.presetQuestion;
        String str9 = this.educationType;
        boolean z4 = this.shouldOpenFullSize;
        String str10 = this.entryText;
        Boolean bool = this.includeInitialMessage;
        String str11 = this.staticInitialMessage;
        String str12 = this.userMessage;
        ChatEntrypointExperience chatEntrypointExperience = this.entrypointExperience;
        Map<String, JsonElement> map = this.args;
        DrawerPresentation drawerPresentation = this.drawerPresentation;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiAction(source=", str, ", screenId=", str2, ", sourceType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", sourceId=", str4, ", agentId=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", conversationSeedId=", str6, ", fingerprint=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", presetQuestion=", str8, ", educationType=");
        AbstractC38963t7.m124390t(sbM32001t, str9, ", shouldOpenFullSize=", z4, ", entryText=");
        AbstractC36095b.m114692t(bool, str10, ", includeInitialMessage=", ", staticInitialMessage=", sbM32001t);
        AbstractC11266d.m30444B(sbM32001t, str11, ", userMessage=", str12, ", entrypointExperience=");
        sbM32001t.append(chatEntrypointExperience);
        sbM32001t.append(", args=");
        sbM32001t.append(map);
        sbM32001t.append(", drawerPresentation=");
        sbM32001t.append(drawerPresentation);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AiAction(String str, String str2, String sourceType, String str3, String str4, String str5, String str6, String str7, String str8, boolean z4, String str9, Boolean bool, String str10, String str11, ChatEntrypointExperience chatEntrypointExperience, Map<String, ? extends JsonElement> args, DrawerPresentation drawerPresentation) {
        AbstractC22676k.m65750j(sourceType, "sourceType");
        AbstractC22676k.m65750j(args, "args");
        this.source = str;
        this.screenId = str2;
        this.sourceType = sourceType;
        this.sourceId = str3;
        this.agentId = str4;
        this.conversationSeedId = str5;
        this.fingerprint = str6;
        this.presetQuestion = str7;
        this.educationType = str8;
        this.shouldOpenFullSize = z4;
        this.entryText = str9;
        this.includeInitialMessage = bool;
        this.staticInitialMessage = str10;
        this.userMessage = str11;
        this.entrypointExperience = chatEntrypointExperience;
        this.args = args;
        this.drawerPresentation = drawerPresentation;
    }

    public /* synthetic */ AiAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z4, String str10, Boolean bool, String str11, String str12, ChatEntrypointExperience chatEntrypointExperience, Map map, DrawerPresentation drawerPresentation, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? "" : str3, str4, str5, str6, str7, str8, str9, (i13 & 512) != 0 ? false : z4, str10, bool, str11, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str12, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : chatEntrypointExperience, (32768 & i13) != 0 ? C25272z.f99163w : map, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : drawerPresentation);
    }
}

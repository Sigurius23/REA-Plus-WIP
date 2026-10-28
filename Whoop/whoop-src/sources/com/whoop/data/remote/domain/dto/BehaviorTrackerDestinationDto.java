package com.whoop.data.remote.domain.dto;

import ad3.C0771n;
import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.BehaviorTrackerDestination;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import u82.AbstractC34647h;
import ve.C35916a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001d¨\u0006-"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;", "", "", HMSTrackSource.SCREEN, "", "Lkotlinx/serialization/json/JsonElement;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;", "toBehaviorTrackerDestination", "()Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreen", "Ljava/util/Map;", "getParameters", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorTrackerDestinationDto {

    @SerializedName("parameters")
    private final Map<String, JsonElement> parameters;

    @SerializedName(HMSTrackSource.SCREEN)
    private final String screen;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35916a(28))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorTrackerDestinationDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BehaviorTrackerDestinationDto(int i13, String str, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, BehaviorTrackerDestinationDto$$serializer.INSTANCE.getDescriptor());
        }
        this.screen = str;
        this.parameters = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, C0771n.f2806a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BehaviorTrackerDestinationDto copy$default(BehaviorTrackerDestinationDto behaviorTrackerDestinationDto, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = behaviorTrackerDestinationDto.screen;
        }
        if ((i13 & 2) != 0) {
            map = behaviorTrackerDestinationDto.parameters;
        }
        return behaviorTrackerDestinationDto.copy(str, map);
    }

    public static final /* synthetic */ void write$Self$core_release(BehaviorTrackerDestinationDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.screen);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.parameters);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScreen() {
        return this.screen;
    }

    public final Map<String, JsonElement> component2() {
        return this.parameters;
    }

    public final BehaviorTrackerDestinationDto copy(String screen, Map<String, ? extends JsonElement> parameters) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(parameters, "parameters");
        return new BehaviorTrackerDestinationDto(screen, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorTrackerDestinationDto)) {
            return false;
        }
        BehaviorTrackerDestinationDto behaviorTrackerDestinationDto = (BehaviorTrackerDestinationDto) other;
        return AbstractC22676k.m65745e(this.screen, behaviorTrackerDestinationDto.screen) && AbstractC22676k.m65745e(this.parameters, behaviorTrackerDestinationDto.parameters);
    }

    public final Map<String, JsonElement> getParameters() {
        return this.parameters;
    }

    public final String getScreen() {
        return this.screen;
    }

    public int hashCode() {
        return this.parameters.hashCode() + (this.screen.hashCode() * 31);
    }

    public final BehaviorTrackerDestination toBehaviorTrackerDestination() {
        String str = this.screen;
        Map<String, JsonElement> map = this.parameters;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            Object objM109488c = AbstractC34647h.m109488c(jsonElement);
            if (objM109488c == null) {
                objM109488c = jsonElement.toString();
            }
            linkedHashMap.put(key, objM109488c);
        }
        return new BehaviorTrackerDestination(str, linkedHashMap);
    }

    public String toString() {
        return AbstractC36095b.m114680h("BehaviorTrackerDestinationDto(screen=", this.screen, ", parameters=", ")", this.parameters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BehaviorTrackerDestinationDto(String screen, Map<String, ? extends JsonElement> parameters) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.screen = screen;
        this.parameters = parameters;
    }
}

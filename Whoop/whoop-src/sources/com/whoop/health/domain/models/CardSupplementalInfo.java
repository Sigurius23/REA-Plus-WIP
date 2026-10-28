package com.whoop.health.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import sh2.C32513d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/health/domain/models/CardSupplementalInfo;", "", "", "latestProcessedTimestamp", "", "", "trailingEcgSamples", "", "trailingEcgTimestamp", "<init>", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/CardSupplementalInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/health/domain/models/CardSupplementalInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getLatestProcessedTimestamp", "Ljava/util/List;", "getTrailingEcgSamples", "Ljava/lang/String;", "getTrailingEcgTimestamp", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CardSupplementalInfo {
    private final Long latestProcessedTimestamp;
    private final List<Double> trailingEcgSamples;
    private final String trailingEcgTimestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32513d(1)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/CardSupplementalInfo$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/CardSupplementalInfo;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CardSupplementalInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CardSupplementalInfo() {
        this((Long) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(DoubleSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardSupplementalInfo copy$default(CardSupplementalInfo cardSupplementalInfo, Long l7, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = cardSupplementalInfo.latestProcessedTimestamp;
        }
        if ((i13 & 2) != 0) {
            list = cardSupplementalInfo.trailingEcgSamples;
        }
        if ((i13 & 4) != 0) {
            str = cardSupplementalInfo.trailingEcgTimestamp;
        }
        return cardSupplementalInfo.copy(l7, list, str);
    }

    public static final /* synthetic */ void write$Self$health_release(CardSupplementalInfo self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.latestProcessedTimestamp != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.latestProcessedTimestamp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.trailingEcgSamples, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.trailingEcgSamples);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.trailingEcgTimestamp == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.trailingEcgTimestamp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getLatestProcessedTimestamp() {
        return this.latestProcessedTimestamp;
    }

    public final List<Double> component2() {
        return this.trailingEcgSamples;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrailingEcgTimestamp() {
        return this.trailingEcgTimestamp;
    }

    public final CardSupplementalInfo copy(Long latestProcessedTimestamp, List<Double> trailingEcgSamples, String trailingEcgTimestamp) {
        AbstractC22676k.m65750j(trailingEcgSamples, "trailingEcgSamples");
        return new CardSupplementalInfo(latestProcessedTimestamp, trailingEcgSamples, trailingEcgTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardSupplementalInfo)) {
            return false;
        }
        CardSupplementalInfo cardSupplementalInfo = (CardSupplementalInfo) other;
        return AbstractC22676k.m65745e(this.latestProcessedTimestamp, cardSupplementalInfo.latestProcessedTimestamp) && AbstractC22676k.m65745e(this.trailingEcgSamples, cardSupplementalInfo.trailingEcgSamples) && AbstractC22676k.m65745e(this.trailingEcgTimestamp, cardSupplementalInfo.trailingEcgTimestamp);
    }

    public final Long getLatestProcessedTimestamp() {
        return this.latestProcessedTimestamp;
    }

    public final List<Double> getTrailingEcgSamples() {
        return this.trailingEcgSamples;
    }

    public final String getTrailingEcgTimestamp() {
        return this.trailingEcgTimestamp;
    }

    public int hashCode() {
        Long l7 = this.latestProcessedTimestamp;
        int iM31983b = AbstractC11895b.m31983b((l7 == null ? 0 : l7.hashCode()) * 31, 31, this.trailingEcgSamples);
        String str = this.trailingEcgTimestamp;
        return iM31983b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Long l7 = this.latestProcessedTimestamp;
        List<Double> list = this.trailingEcgSamples;
        String str = this.trailingEcgTimestamp;
        StringBuilder sb4 = new StringBuilder("CardSupplementalInfo(latestProcessedTimestamp=");
        sb4.append(l7);
        sb4.append(", trailingEcgSamples=");
        sb4.append(list);
        sb4.append(", trailingEcgTimestamp=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ CardSupplementalInfo(int i13, Long l7, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.latestProcessedTimestamp = null;
        } else {
            this.latestProcessedTimestamp = l7;
        }
        if ((i13 & 2) == 0) {
            this.trailingEcgSamples = C25271y.f99162w;
        } else {
            this.trailingEcgSamples = list;
        }
        if ((i13 & 4) == 0) {
            this.trailingEcgTimestamp = null;
        } else {
            this.trailingEcgTimestamp = str;
        }
    }

    public CardSupplementalInfo(Long l7, List<Double> trailingEcgSamples, String str) {
        AbstractC22676k.m65750j(trailingEcgSamples, "trailingEcgSamples");
        this.latestProcessedTimestamp = l7;
        this.trailingEcgSamples = trailingEcgSamples;
        this.trailingEcgTimestamp = str;
    }

    public /* synthetic */ CardSupplementalInfo(Long l7, List list, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : l7, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : str);
    }
}

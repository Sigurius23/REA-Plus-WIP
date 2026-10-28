package com.whoop.sage.domain.models;

import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.coacheverywherecommon.models.AiContextMetadata$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import xc3.AbstractC38195a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006%"}, m65681d2 = {"Lcom/whoop/sage/domain/models/MetaData;", "", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "<init>", "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/coacheverywherecommon/models/AiContextMetadata;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/domain/models/MetaData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "copy", "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lcom/whoop/sage/domain/models/MetaData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "getAiContextMetadata", "Companion", "$serializer", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MetaData {
    private final AiContextMetadata aiContextMetadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = AiContextMetadata.$stable;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(21))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/domain/models/MetaData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/domain/models/MetaData;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MetaData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetaData(int i13, AiContextMetadata aiContextMetadata, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, MetaData$$serializer.INSTANCE.getDescriptor());
        }
        this.aiContextMetadata = aiContextMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiContextMetadata.class), AbstractC38195a.m122336d(AiContextMetadata$$serializer.INSTANCE), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ MetaData copy$default(MetaData metaData, AiContextMetadata aiContextMetadata, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            aiContextMetadata = metaData.aiContextMetadata;
        }
        return metaData.copy(aiContextMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AiContextMetadata getAiContextMetadata() {
        return this.aiContextMetadata;
    }

    public final MetaData copy(AiContextMetadata aiContextMetadata) {
        return new MetaData(aiContextMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MetaData) && AbstractC22676k.m65745e(this.aiContextMetadata, ((MetaData) other).aiContextMetadata);
    }

    public final AiContextMetadata getAiContextMetadata() {
        return this.aiContextMetadata;
    }

    public int hashCode() {
        AiContextMetadata aiContextMetadata = this.aiContextMetadata;
        if (aiContextMetadata == null) {
            return 0;
        }
        return aiContextMetadata.hashCode();
    }

    public String toString() {
        return "MetaData(aiContextMetadata=" + this.aiContextMetadata + ")";
    }

    public MetaData(AiContextMetadata aiContextMetadata) {
        this.aiContextMetadata = aiContextMetadata;
    }
}

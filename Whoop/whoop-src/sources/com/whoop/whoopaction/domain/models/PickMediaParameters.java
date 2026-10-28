package com.whoop.whoopaction.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.domain.api.C10717a;
import java.util.List;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001e¨\u00063"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/PickMediaParameters;", "Lcom/whoop/whoopaction/domain/models/OSActionParameters;", "", "Lcom/whoop/whoopaction/domain/models/PickMediaType;", "mediaTypes", "Lcom/whoop/whoopaction/domain/models/PickMediaSource;", "source", "", "stateKey", "<init>", "(Ljava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/PickMediaParameters;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/whoopaction/domain/models/PickMediaSource;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/PickMediaParameters;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMediaTypes", "getMediaTypes$annotations", "()V", "Lcom/whoop/whoopaction/domain/models/PickMediaSource;", "getSource", "Ljava/lang/String;", "getStateKey", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PickMediaParameters implements OSActionParameters {
    private final List<PickMediaType> mediaTypes;
    private final PickMediaSource source;
    private final String stateKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C10717a(19)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/PickMediaParameters$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/PickMediaParameters;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PickMediaParameters$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PickMediaParameters(int i13, List list, PickMediaSource pickMediaSource, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PickMediaParameters$$serializer.INSTANCE.getDescriptor());
        }
        this.mediaTypes = list;
        this.source = pickMediaSource;
        this.stateKey = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.whoopaction.domain.models.PickMediaSource", PickMediaSource.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PickMediaParameters copy$default(PickMediaParameters pickMediaParameters, List list, PickMediaSource pickMediaSource, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = pickMediaParameters.mediaTypes;
        }
        if ((i13 & 2) != 0) {
            pickMediaSource = pickMediaParameters.source;
        }
        if ((i13 & 4) != 0) {
            str = pickMediaParameters.stateKey;
        }
        return pickMediaParameters.copy(list, pickMediaSource, str);
    }

    @InterfaceC37144i(with = PickMediaTypesSerializer.class)
    public static /* synthetic */ void getMediaTypes$annotations() {
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(PickMediaParameters self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, PickMediaTypesSerializer.INSTANCE, self.mediaTypes);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.source);
        output.encodeStringElement(serialDesc, 2, self.stateKey);
    }

    public final List<PickMediaType> component1() {
        return this.mediaTypes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PickMediaSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStateKey() {
        return this.stateKey;
    }

    public final PickMediaParameters copy(List<? extends PickMediaType> mediaTypes, PickMediaSource source, String stateKey) {
        AbstractC22676k.m65750j(mediaTypes, "mediaTypes");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(stateKey, "stateKey");
        return new PickMediaParameters(mediaTypes, source, stateKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickMediaParameters)) {
            return false;
        }
        PickMediaParameters pickMediaParameters = (PickMediaParameters) other;
        return AbstractC22676k.m65745e(this.mediaTypes, pickMediaParameters.mediaTypes) && this.source == pickMediaParameters.source && AbstractC22676k.m65745e(this.stateKey, pickMediaParameters.stateKey);
    }

    public final List<PickMediaType> getMediaTypes() {
        return this.mediaTypes;
    }

    public final PickMediaSource getSource() {
        return this.source;
    }

    public final String getStateKey() {
        return this.stateKey;
    }

    public int hashCode() {
        return this.stateKey.hashCode() + ((this.source.hashCode() + (this.mediaTypes.hashCode() * 31)) * 31);
    }

    public String toString() {
        List<PickMediaType> list = this.mediaTypes;
        PickMediaSource pickMediaSource = this.source;
        String str = this.stateKey;
        StringBuilder sb4 = new StringBuilder("PickMediaParameters(mediaTypes=");
        sb4.append(list);
        sb4.append(", source=");
        sb4.append(pickMediaSource);
        sb4.append(", stateKey=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PickMediaParameters(List<? extends PickMediaType> mediaTypes, PickMediaSource source, String stateKey) {
        AbstractC22676k.m65750j(mediaTypes, "mediaTypes");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(stateKey, "stateKey");
        this.mediaTypes = mediaTypes;
        this.source = source;
        this.stateKey = stateKey;
    }
}

package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36961h;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J0\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006*"}, m65681d2 = {"Lcom/whoop/design/models/items/PregnancyTilePlot;", "", "", "Lcom/whoop/design/models/items/PregnancyProgressLabelModel;", "labels", "Lcom/whoop/design/models/items/PregnancyProgressBarModel;", "progressBars", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/PregnancyTilePlot;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/items/PregnancyTilePlot;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLabels", "getProgressBars", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PregnancyTilePlot {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<PregnancyProgressLabelModel> labels;
    private final List<PregnancyProgressBarModel> progressBars;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/PregnancyTilePlot$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/PregnancyTilePlot;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PregnancyTilePlot$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C36961h(24)), AbstractC30060g.m92087G(enumC23463i, new C36961h(25))};
    }

    public /* synthetic */ PregnancyTilePlot(int i13, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, PregnancyTilePlot$$serializer.INSTANCE.getDescriptor());
        }
        this.labels = list;
        this.progressBars = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(PregnancyProgressLabelModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(PregnancyProgressBarModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PregnancyTilePlot copy$default(PregnancyTilePlot pregnancyTilePlot, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = pregnancyTilePlot.labels;
        }
        if ((i13 & 2) != 0) {
            list2 = pregnancyTilePlot.progressBars;
        }
        return pregnancyTilePlot.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(PregnancyTilePlot self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.labels);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.progressBars);
    }

    public final List<PregnancyProgressLabelModel> component1() {
        return this.labels;
    }

    public final List<PregnancyProgressBarModel> component2() {
        return this.progressBars;
    }

    public final PregnancyTilePlot copy(List<PregnancyProgressLabelModel> labels, List<PregnancyProgressBarModel> progressBars) {
        AbstractC22676k.m65750j(labels, "labels");
        AbstractC22676k.m65750j(progressBars, "progressBars");
        return new PregnancyTilePlot(labels, progressBars);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PregnancyTilePlot)) {
            return false;
        }
        PregnancyTilePlot pregnancyTilePlot = (PregnancyTilePlot) other;
        return AbstractC22676k.m65745e(this.labels, pregnancyTilePlot.labels) && AbstractC22676k.m65745e(this.progressBars, pregnancyTilePlot.progressBars);
    }

    public final List<PregnancyProgressLabelModel> getLabels() {
        return this.labels;
    }

    public final List<PregnancyProgressBarModel> getProgressBars() {
        return this.progressBars;
    }

    public int hashCode() {
        return this.progressBars.hashCode() + (this.labels.hashCode() * 31);
    }

    public String toString() {
        return AbstractC13673n.m38562i("PregnancyTilePlot(labels=", ", progressBars=", this.labels, ")", this.progressBars);
    }

    public PregnancyTilePlot(List<PregnancyProgressLabelModel> labels, List<PregnancyProgressBarModel> progressBars) {
        AbstractC22676k.m65750j(labels, "labels");
        AbstractC22676k.m65750j(progressBars, "progressBars");
        this.labels = labels;
        this.progressBars = progressBars;
    }
}

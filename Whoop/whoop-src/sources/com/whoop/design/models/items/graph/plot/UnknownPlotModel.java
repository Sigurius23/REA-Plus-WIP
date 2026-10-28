package com.whoop.design.models.items.graph.plot;

import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.ObjectSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ma1.C25371a;
import p715kotlin.Metadata;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/UnknownPlotModel;", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "<init>", "()V", "Lwc3/c;", "serializer", "()Lwc3/c;", "", "hideWhileScrubbing", "Ljava/lang/Boolean;", "getHideWhileScrubbing", "()Ljava/lang/Boolean;", "skipScrubbing", "getSkipScrubbing", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final class UnknownPlotModel extends GraphPlot {
    public static final int $stable = 0;
    private static final Boolean skipScrubbing = null;
    public static final UnknownPlotModel INSTANCE = new UnknownPlotModel();
    private static final Boolean hideWhileScrubbing = Boolean.FALSE;
    private static final /* synthetic */ InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25371a(7));

    private UnknownPlotModel() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return new ObjectSerializer("com.whoop.design.models.items.graph.plot.UnknownPlotModel", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
        return (InterfaceC37138c) $cachedSerializer$delegate.getValue();
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getHideWhileScrubbing() {
        return hideWhileScrubbing;
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getSkipScrubbing() {
        return skipScrubbing;
    }

    public final InterfaceC37138c serializer() {
        return get$cachedSerializer();
    }
}

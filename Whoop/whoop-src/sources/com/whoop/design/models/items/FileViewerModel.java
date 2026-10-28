package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import java.util.Map;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import w91.C36957d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\bZ[\\]^_`YBK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0011\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-JV\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bA\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bC\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bG\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u0010-R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RRE\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`S¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\t0V8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010N\u001a\u0004\bW\u0010P\"\u0004\bX\u0010R¨\u0006a"}, m65681d2 = {"Lcom/whoop/design/models/items/FileViewerModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "", "fileUrl", "Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;", "urlType", "Lcom/whoop/design/models/items/FileViewerModel$FileType;", "fileType", "Lcom/whoop/design/models/items/FileViewerModel$Scaling;", "scaling", "Lcom/whoop/design/models/items/FileViewerModel$Zoom;", "zoom", "Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;", "horizontalAlignment", "Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;", "verticalAlignment", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/items/FileViewerModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;", "component3", "()Lcom/whoop/design/models/items/FileViewerModel$FileType;", "component4", "()Lcom/whoop/design/models/items/FileViewerModel$Scaling;", "component5", "()Lcom/whoop/design/models/items/FileViewerModel$Zoom;", "component6", "()Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;", "component7", "()Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;)Lcom/whoop/design/models/items/FileViewerModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/FileViewerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getFileUrl", "Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;", "getUrlType", "Lcom/whoop/design/models/items/FileViewerModel$FileType;", "getFileType", "Lcom/whoop/design/models/items/FileViewerModel$Scaling;", "getScaling", "Lcom/whoop/design/models/items/FileViewerModel$Zoom;", "getZoom", "Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;", "getHorizontalAlignment", "Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;", "getVerticalAlignment", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "FileType", "FileUrlType", "Scaling", "Zoom", "HorizontalAlignment", "VerticalAlignment", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FileViewerModel implements WithGeneratedBindings, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final FileType fileType;
    private final String fileUrl;
    private final HorizontalAlignment horizontalAlignment;
    private final Scaling scaling;
    private final FileUrlType urlType;
    private final VerticalAlignment verticalAlignment;
    private final Zoom zoom;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/FileViewerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/FileViewerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FileViewerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/models/items/FileViewerModel$FileType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "PDF", "UNKNOWN", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum FileType {
        IMAGE,
        PDF,
        UNKNOWN;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;", "", "<init>", "(Ljava/lang/String;I)V", "RELATIVE", "ABSOLUTE", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum FileUrlType {
        RELATIVE,
        ABSOLUTE;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "LEADING", "CENTER", "TRAILING", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum HorizontalAlignment {
        LEADING,
        CENTER,
        TRAILING;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/design/models/items/FileViewerModel$Scaling;", "", "<init>", "(Ljava/lang/String;I)V", "FIT", "FILL", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum Scaling {
        FIT,
        FILL;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "CENTER", "BOTTOM", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum VerticalAlignment {
        TOP,
        CENTER,
        BOTTOM;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/models/items/FileViewerModel$Zoom;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "PINCH", "FIT", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum Zoom {
        NONE,
        PINCH,
        FIT;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36957d(16)), AbstractC30060g.m92087G(enumC23463i, new C36957d(17)), AbstractC30060g.m92087G(enumC23463i, new C36957d(18)), AbstractC30060g.m92087G(enumC23463i, new C36957d(19)), AbstractC30060g.m92087G(enumC23463i, new C36957d(20)), AbstractC30060g.m92087G(enumC23463i, new C36957d(21)), AbstractC30060g.m92087G(enumC23463i, new C36957d(22)), null};
    }

    public /* synthetic */ FileViewerModel(int i13, String str, FileUrlType fileUrlType, FileType fileType, Scaling scaling, Zoom zoom, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, FileViewerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.fileUrl = str;
        if ((i13 & 2) == 0) {
            this.urlType = FileUrlType.ABSOLUTE;
        } else {
            this.urlType = fileUrlType;
        }
        if ((i13 & 4) == 0) {
            this.fileType = FileType.UNKNOWN;
        } else {
            this.fileType = fileType;
        }
        if ((i13 & 8) == 0) {
            this.scaling = Scaling.FIT;
        } else {
            this.scaling = scaling;
        }
        if ((i13 & 16) == 0) {
            this.zoom = Zoom.NONE;
        } else {
            this.zoom = zoom;
        }
        if ((i13 & 32) == 0) {
            this.horizontalAlignment = HorizontalAlignment.CENTER;
        } else {
            this.horizontalAlignment = horizontalAlignment;
        }
        if ((i13 & 64) == 0) {
            this.verticalAlignment = VerticalAlignment.CENTER;
        } else {
            this.verticalAlignment = verticalAlignment;
        }
        if ((i13 & 128) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 256) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.FileViewerModel.FileUrlType", FileUrlType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.FileViewerModel.FileType", FileType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.FileViewerModel.Scaling", Scaling.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.FileViewerModel.Zoom", Zoom.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.FileViewerModel.HorizontalAlignment", HorizontalAlignment.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.FileViewerModel.VerticalAlignment", VerticalAlignment.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$5() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    public static /* synthetic */ FileViewerModel copy$default(FileViewerModel fileViewerModel, String str, FileUrlType fileUrlType, FileType fileType, Scaling scaling, Zoom zoom, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = fileViewerModel.fileUrl;
        }
        if ((i13 & 2) != 0) {
            fileUrlType = fileViewerModel.urlType;
        }
        if ((i13 & 4) != 0) {
            fileType = fileViewerModel.fileType;
        }
        if ((i13 & 8) != 0) {
            scaling = fileViewerModel.scaling;
        }
        if ((i13 & 16) != 0) {
            zoom = fileViewerModel.zoom;
        }
        if ((i13 & 32) != 0) {
            horizontalAlignment = fileViewerModel.horizontalAlignment;
        }
        if ((i13 & 64) != 0) {
            verticalAlignment = fileViewerModel.verticalAlignment;
        }
        HorizontalAlignment horizontalAlignment2 = horizontalAlignment;
        VerticalAlignment verticalAlignment2 = verticalAlignment;
        Zoom zoom2 = zoom;
        FileType fileType2 = fileType;
        return fileViewerModel.copy(str, fileUrlType, fileType2, scaling, zoom2, horizontalAlignment2, verticalAlignment2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FileViewerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.fileUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.urlType != FileUrlType.ABSOLUTE) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.urlType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.fileType != FileType.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.fileType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.scaling != Scaling.FIT) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.scaling);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.zoom != Zoom.NONE) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.zoom);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.horizontalAlignment != HorizontalAlignment.CENTER) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.horizontalAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.verticalAlignment != VerticalAlignment.CENTER) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.verticalAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FileUrlType getUrlType() {
        return this.urlType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FileType getFileType() {
        return this.fileType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Scaling getScaling() {
        return this.scaling;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Zoom getZoom() {
        return this.zoom;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public final FileViewerModel copy(String fileUrl, FileUrlType urlType, FileType fileType, Scaling scaling, Zoom zoom, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment) {
        AbstractC22676k.m65750j(fileUrl, "fileUrl");
        AbstractC22676k.m65750j(urlType, "urlType");
        AbstractC22676k.m65750j(fileType, "fileType");
        AbstractC22676k.m65750j(scaling, "scaling");
        AbstractC22676k.m65750j(zoom, "zoom");
        AbstractC22676k.m65750j(horizontalAlignment, "horizontalAlignment");
        AbstractC22676k.m65750j(verticalAlignment, "verticalAlignment");
        return new FileViewerModel(fileUrl, urlType, fileType, scaling, zoom, horizontalAlignment, verticalAlignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileViewerModel)) {
            return false;
        }
        FileViewerModel fileViewerModel = (FileViewerModel) other;
        return AbstractC22676k.m65745e(this.fileUrl, fileViewerModel.fileUrl) && this.urlType == fileViewerModel.urlType && this.fileType == fileViewerModel.fileType && this.scaling == fileViewerModel.scaling && this.zoom == fileViewerModel.zoom && this.horizontalAlignment == fileViewerModel.horizontalAlignment && this.verticalAlignment == fileViewerModel.verticalAlignment;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final FileType getFileType() {
        return this.fileType;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final Scaling getScaling() {
        return this.scaling;
    }

    public final FileUrlType getUrlType() {
        return this.urlType;
    }

    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public final Zoom getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return this.verticalAlignment.hashCode() + ((this.horizontalAlignment.hashCode() + ((this.zoom.hashCode() + ((this.scaling.hashCode() + ((this.fileType.hashCode() + ((this.urlType.hashCode() + (this.fileUrl.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        return "FileViewerModel(fileUrl=" + this.fileUrl + ", urlType=" + this.urlType + ", fileType=" + this.fileType + ", scaling=" + this.scaling + ", zoom=" + this.zoom + ", horizontalAlignment=" + this.horizontalAlignment + ", verticalAlignment=" + this.verticalAlignment + ")";
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public FileViewerModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return FileViewerModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public FileViewerModel(String fileUrl, FileUrlType urlType, FileType fileType, Scaling scaling, Zoom zoom, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment) {
        AbstractC22676k.m65750j(fileUrl, "fileUrl");
        AbstractC22676k.m65750j(urlType, "urlType");
        AbstractC22676k.m65750j(fileType, "fileType");
        AbstractC22676k.m65750j(scaling, "scaling");
        AbstractC22676k.m65750j(zoom, "zoom");
        AbstractC22676k.m65750j(horizontalAlignment, "horizontalAlignment");
        AbstractC22676k.m65750j(verticalAlignment, "verticalAlignment");
        this.fileUrl = fileUrl;
        this.urlType = urlType;
        this.fileType = fileType;
        this.scaling = scaling;
        this.zoom = zoom;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
    }

    public /* synthetic */ FileViewerModel(String str, FileUrlType fileUrlType, FileType fileType, Scaling scaling, Zoom zoom, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? FileUrlType.ABSOLUTE : fileUrlType, (i13 & 4) != 0 ? FileType.UNKNOWN : fileType, (i13 & 8) != 0 ? Scaling.FIT : scaling, (i13 & 16) != 0 ? Zoom.NONE : zoom, (i13 & 32) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (i13 & 64) != 0 ? VerticalAlignment.CENTER : verticalAlignment);
    }
}

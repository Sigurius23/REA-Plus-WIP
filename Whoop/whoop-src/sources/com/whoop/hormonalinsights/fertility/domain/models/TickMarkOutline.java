package com.whoop.hormonalinsights.fertility.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p133f1.C13998z1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/hormonalinsights/fertility/domain/models/TickMarkOutline;", "", "", "startIndex", "endIndex", "Lcom/whoop/hormonalinsights/fertility/domain/models/TickMarkOutlineStyle;", "style", "<init>", "(IILcom/whoop/hormonalinsights/fertility/domain/models/TickMarkOutlineStyle;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILcom/whoop/hormonalinsights/fertility/domain/models/TickMarkOutlineStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/fertility/domain/models/TickMarkOutline;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Lcom/whoop/hormonalinsights/fertility/domain/models/TickMarkOutlineStyle;", "copy", "(IILcom/whoop/hormonalinsights/fertility/domain/models/TickMarkOutlineStyle;)Lcom/whoop/hormonalinsights/fertility/domain/models/TickMarkOutline;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStartIndex", "getEndIndex", "Lcom/whoop/hormonalinsights/fertility/domain/models/TickMarkOutlineStyle;", "getStyle", "Companion", "$serializer", "a", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TickMarkOutline {
    public static final int $stable = 0;
    private final int endIndex;
    private final int startIndex;
    private final TickMarkOutlineStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13998z1(26))};

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.fertility.domain.models.TickMarkOutline$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/fertility/domain/models/TickMarkOutline$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/fertility/domain/models/TickMarkOutline;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TickMarkOutline$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TickMarkOutline(int i13, int i14, int i15, TickMarkOutlineStyle tickMarkOutlineStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, TickMarkOutline$$serializer.INSTANCE.getDescriptor());
        }
        this.startIndex = i14;
        this.endIndex = i15;
        this.style = tickMarkOutlineStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return TickMarkOutlineStyle.INSTANCE.serializer();
    }

    public static /* synthetic */ TickMarkOutline copy$default(TickMarkOutline tickMarkOutline, int i13, int i14, TickMarkOutlineStyle tickMarkOutlineStyle, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = tickMarkOutline.startIndex;
        }
        if ((i15 & 2) != 0) {
            i14 = tickMarkOutline.endIndex;
        }
        if ((i15 & 4) != 0) {
            tickMarkOutlineStyle = tickMarkOutline.style;
        }
        return tickMarkOutline.copy(i13, i14, tickMarkOutlineStyle);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(TickMarkOutline self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.startIndex);
        output.encodeIntElement(serialDesc, 1, self.endIndex);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TickMarkOutlineStyle getStyle() {
        return this.style;
    }

    public final TickMarkOutline copy(int startIndex, int endIndex, TickMarkOutlineStyle style) {
        AbstractC22676k.m65750j(style, "style");
        return new TickMarkOutline(startIndex, endIndex, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TickMarkOutline)) {
            return false;
        }
        TickMarkOutline tickMarkOutline = (TickMarkOutline) other;
        return this.startIndex == tickMarkOutline.startIndex && this.endIndex == tickMarkOutline.endIndex && this.style == tickMarkOutline.style;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final TickMarkOutlineStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC11266d.m30448b(this.endIndex, Integer.hashCode(this.startIndex) * 31, 31);
    }

    public String toString() {
        int i13 = this.startIndex;
        int i14 = this.endIndex;
        TickMarkOutlineStyle tickMarkOutlineStyle = this.style;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "TickMarkOutline(startIndex=", ", endIndex=", ", style=");
        sbM30465s.append(tickMarkOutlineStyle);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    public TickMarkOutline(int i13, int i14, TickMarkOutlineStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.startIndex = i13;
        this.endIndex = i14;
        this.style = style;
    }
}

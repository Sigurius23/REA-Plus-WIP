package com.whoop.whattoexpect.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, m65681d2 = {"Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;", "", "Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;", "circularProgressIndicator", "", "text", "<init>", "(Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$what_to_expect_release", "(Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;Ljava/lang/String;)Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;", "getCircularProgressIndicator", "Ljava/lang/String;", "getText", "Companion", "$serializer", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressIndicator {
    private final CircularProgressIndicator circularProgressIndicator;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whattoexpect/domain/models/ProgressIndicator$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;", "serializer", "()Lwc3/c;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressIndicator$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressIndicator(int i13, CircularProgressIndicator circularProgressIndicator, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ProgressIndicator$$serializer.INSTANCE.getDescriptor());
        }
        this.circularProgressIndicator = circularProgressIndicator;
        this.text = str;
    }

    public static /* synthetic */ ProgressIndicator copy$default(ProgressIndicator progressIndicator, CircularProgressIndicator circularProgressIndicator, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            circularProgressIndicator = progressIndicator.circularProgressIndicator;
        }
        if ((i13 & 2) != 0) {
            str = progressIndicator.text;
        }
        return progressIndicator.copy(circularProgressIndicator, str);
    }

    public static final /* synthetic */ void write$Self$what_to_expect_release(ProgressIndicator self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, CircularProgressIndicator$$serializer.INSTANCE, self.circularProgressIndicator);
        output.encodeStringElement(serialDesc, 1, self.text);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final ProgressIndicator copy(CircularProgressIndicator circularProgressIndicator, String text) {
        AbstractC22676k.m65750j(circularProgressIndicator, "circularProgressIndicator");
        AbstractC22676k.m65750j(text, "text");
        return new ProgressIndicator(circularProgressIndicator, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressIndicator)) {
            return false;
        }
        ProgressIndicator progressIndicator = (ProgressIndicator) other;
        return AbstractC22676k.m65745e(this.circularProgressIndicator, progressIndicator.circularProgressIndicator) && AbstractC22676k.m65745e(this.text, progressIndicator.text);
    }

    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.circularProgressIndicator.hashCode() * 31);
    }

    public String toString() {
        return "ProgressIndicator(circularProgressIndicator=" + this.circularProgressIndicator + ", text=" + this.text + ")";
    }

    public ProgressIndicator(CircularProgressIndicator circularProgressIndicator, String text) {
        AbstractC22676k.m65750j(circularProgressIndicator, "circularProgressIndicator");
        AbstractC22676k.m65750j(text, "text");
        this.circularProgressIndicator = circularProgressIndicator;
        this.text = text;
    }
}

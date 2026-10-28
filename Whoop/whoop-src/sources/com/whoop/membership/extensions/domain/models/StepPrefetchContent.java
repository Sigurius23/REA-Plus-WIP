package com.whoop.membership.extensions.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001aR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u001a¨\u0006/"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "", "", "path", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "loadingProgressContent", "genericErrorProgressContent", "<init>", "(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "component3", "copy", "(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;)Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "getLoadingProgressContent", "getLoadingProgressContent$annotations", "()V", "getGenericErrorProgressContent", "getGenericErrorProgressContent$annotations", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StepPrefetchContent {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("generic_error_progress_content")
    private final ProgressContent genericErrorProgressContent;

    @SerializedName("loading_progress_content")
    private final ProgressContent loadingProgressContent;
    private final String path;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StepPrefetchContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StepPrefetchContent(int i13, String str, ProgressContent progressContent, ProgressContent progressContent2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, StepPrefetchContent$$serializer.INSTANCE.getDescriptor());
        }
        this.path = str;
        this.loadingProgressContent = progressContent;
        this.genericErrorProgressContent = progressContent2;
    }

    public static /* synthetic */ StepPrefetchContent copy$default(StepPrefetchContent stepPrefetchContent, String str, ProgressContent progressContent, ProgressContent progressContent2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stepPrefetchContent.path;
        }
        if ((i13 & 2) != 0) {
            progressContent = stepPrefetchContent.loadingProgressContent;
        }
        if ((i13 & 4) != 0) {
            progressContent2 = stepPrefetchContent.genericErrorProgressContent;
        }
        return stepPrefetchContent.copy(str, progressContent, progressContent2);
    }

    @InterfaceC37143h("generic_error_progress_content")
    public static /* synthetic */ void getGenericErrorProgressContent$annotations() {
    }

    @InterfaceC37143h("loading_progress_content")
    public static /* synthetic */ void getLoadingProgressContent$annotations() {
    }

    public static final /* synthetic */ void write$Self$membership_release(StepPrefetchContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.path);
        ProgressContent$$serializer progressContent$$serializer = ProgressContent$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, progressContent$$serializer, self.loadingProgressContent);
        output.encodeSerializableElement(serialDesc, 2, progressContent$$serializer, self.genericErrorProgressContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProgressContent getLoadingProgressContent() {
        return this.loadingProgressContent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProgressContent getGenericErrorProgressContent() {
        return this.genericErrorProgressContent;
    }

    public final StepPrefetchContent copy(String path, ProgressContent loadingProgressContent, ProgressContent genericErrorProgressContent) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(loadingProgressContent, "loadingProgressContent");
        AbstractC22676k.m65750j(genericErrorProgressContent, "genericErrorProgressContent");
        return new StepPrefetchContent(path, loadingProgressContent, genericErrorProgressContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepPrefetchContent)) {
            return false;
        }
        StepPrefetchContent stepPrefetchContent = (StepPrefetchContent) other;
        return AbstractC22676k.m65745e(this.path, stepPrefetchContent.path) && AbstractC22676k.m65745e(this.loadingProgressContent, stepPrefetchContent.loadingProgressContent) && AbstractC22676k.m65745e(this.genericErrorProgressContent, stepPrefetchContent.genericErrorProgressContent);
    }

    public final ProgressContent getGenericErrorProgressContent() {
        return this.genericErrorProgressContent;
    }

    public final ProgressContent getLoadingProgressContent() {
        return this.loadingProgressContent;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.genericErrorProgressContent.hashCode() + ((this.loadingProgressContent.hashCode() + (this.path.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "StepPrefetchContent(path=" + this.path + ", loadingProgressContent=" + this.loadingProgressContent + ", genericErrorProgressContent=" + this.genericErrorProgressContent + ")";
    }

    public StepPrefetchContent(String path, ProgressContent loadingProgressContent, ProgressContent genericErrorProgressContent) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(loadingProgressContent, "loadingProgressContent");
        AbstractC22676k.m65750j(genericErrorProgressContent, "genericErrorProgressContent");
        this.path = path;
        this.loadingProgressContent = loadingProgressContent;
        this.genericErrorProgressContent = genericErrorProgressContent;
    }
}

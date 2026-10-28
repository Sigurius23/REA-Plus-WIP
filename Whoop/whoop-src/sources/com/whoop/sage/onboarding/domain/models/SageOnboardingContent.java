package com.whoop.sage.onboarding.domain.models;

import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;
import wc3.C37142g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;", "", "Companion", "a", "Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen;", "Lh72/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public interface SageOnboardingContent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f29382a;

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.domain.models.SageOnboardingContent$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f29382a = new Companion();

        private Companion() {
        }

        public final InterfaceC37138c serializer() {
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            return new C37142g("com.whoop.sage.onboarding.domain.models.SageOnboardingContent", c22673i0.getOrCreateKotlinClass(SageOnboardingContent.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(SageManualReadingInputScreen.class), c22673i0.getOrCreateKotlinClass(SageOnboardingGuidelinesAcknowledgeScreen.class), c22673i0.getOrCreateKotlinClass(SageOnboardingInfoCheckboxScreen.class), c22673i0.getOrCreateKotlinClass(SageOnboardingInformationScreen.class), c22673i0.getOrCreateKotlinClass(SageOnboardingSelectionScreen.class)}, new InterfaceC37138c[]{SageManualReadingInputScreen$$serializer.INSTANCE, SageOnboardingGuidelinesAcknowledgeScreen$$serializer.INSTANCE, SageOnboardingInfoCheckboxScreen$$serializer.INSTANCE, SageOnboardingInformationScreen$$serializer.INSTANCE, SageOnboardingSelectionScreen$$serializer.INSTANCE}, new Annotation[0]);
        }
    }
}

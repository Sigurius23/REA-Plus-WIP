package com.whoop.activation.domain.models;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;", "", "value", "", "shouldPopulateCta", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getValue", "()Ljava/lang/String;", "getShouldPopulateCta", "()Z", "START_SCREEN", "FALLBACK", "Companion", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum ActivationFlowCtaDestinations {
    START_SCREEN("START_SCREEN", true),
    FALLBACK("FALLBACK", false);

    private final boolean shouldPopulateCta;
    private final String value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations$Companion;", "", "<init>", "()V", "toActivationFlowDestination", "Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;", "destination", "", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        public final ActivationFlowCtaDestinations toActivationFlowDestination(String destination) {
            for (ActivationFlowCtaDestinations activationFlowCtaDestinations : ActivationFlowCtaDestinations.values()) {
                if (AbstractC22676k.m65745e(activationFlowCtaDestinations.getValue(), destination)) {
                    if (activationFlowCtaDestinations == null) {
                        return ActivationFlowCtaDestinations.FALLBACK;
                    }
                    return activationFlowCtaDestinations;
                }
            }
            activationFlowCtaDestinations = null;
            if (activationFlowCtaDestinations == null) {
                return ActivationFlowCtaDestinations.FALLBACK;
            }
            return activationFlowCtaDestinations;
        }

        private Companion() {
        }
    }

    ActivationFlowCtaDestinations(String str, boolean z4) {
        this.value = str;
        this.shouldPopulateCta = z4;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final boolean getShouldPopulateCta() {
        return this.shouldPopulateCta;
    }

    public final String getValue() {
        return this.value;
    }
}

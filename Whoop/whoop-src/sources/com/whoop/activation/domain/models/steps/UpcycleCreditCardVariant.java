package com.whoop.activation.domain.models.steps;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CONTROL", "AFTER_UPCYCLE", "Companion", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum UpcycleCreditCardVariant {
    CONTROL("control"),
    AFTER_UPCYCLE("after-upcycle");

    private final String value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant$Companion;", "", "<init>", "()V", "fromValue", "Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;", "value", "", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UpcycleCreditCardVariant fromValue(String value) {
            AbstractC22676k.m65750j(value, "value");
            for (UpcycleCreditCardVariant upcycleCreditCardVariant : UpcycleCreditCardVariant.values()) {
                if (AbstractC39421y.m125921F(upcycleCreditCardVariant.getValue(), value, true)) {
                    return upcycleCreditCardVariant;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    UpcycleCreditCardVariant(String str) {
        this.value = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}

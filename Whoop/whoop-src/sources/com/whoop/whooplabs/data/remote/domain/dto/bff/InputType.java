package com.whoop.whooplabs.data.remote.domain.dto.bff;

import dx2.C12430a;
import ge3.AbstractC15751g;
import java.util.Locale;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;", "", "<init>", "(Ljava/lang/String;I)V", "NUMBER_INPUT", "TEXT_INPUT", "TEXT_SELECTION", "UNKNOWN", "TIME_PICKER", "DATETIME_PICKER", "Companion", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public enum InputType {
    NUMBER_INPUT,
    TEXT_INPUT,
    TEXT_SELECTION,
    UNKNOWN,
    TIME_PICKER,
    DATETIME_PICKER;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(7));

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType$Companion;", "", "<init>", "()V", "", "value", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;", "fromValue", "(Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;", "Lwc3/c;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) InputType.$cachedSerializer$delegate.getValue();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002b  */
        /* JADX WARN: Code duplicated, block: B:12:0x002e A[RETURN] */
        public final InputType fromValue(String value) {
            AbstractC22676k.m65750j(value, "value");
            for (InputType inputType : InputType.values()) {
                String strName = inputType.name();
                String upperCase = value.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                if (AbstractC22676k.m65745e(strName, upperCase)) {
                    if (inputType == null) {
                        return InputType.UNKNOWN;
                    }
                    return inputType;
                }
            }
            inputType = null;
            if (inputType == null) {
                return InputType.UNKNOWN;
            }
            return inputType;
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.whooplabs.data.remote.domain.dto.bff.InputType", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}

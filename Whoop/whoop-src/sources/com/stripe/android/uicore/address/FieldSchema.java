package com.stripe.android.uicore.address;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.ArrayList;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'(B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB=\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0003\u0010\u001bR0\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\"\u0012\u0004\b%\u0010\u001d\u001a\u0004\b#\u0010$¨\u0006)"}, m65681d2 = {"Lcom/stripe/android/uicore/address/FieldSchema;", "", "", "isNumeric", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "examples", "Lcom/stripe/android/uicore/address/NameType;", "nameType", "<init>", "(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stripe_ui_core_release", "(Lcom/stripe/android/uicore/address/FieldSchema;Lzc3/c;Lyc3/g;)V", "write$Self", "Z", "()Z", "isNumeric$annotations", "()V", "Ljava/util/ArrayList;", "getExamples", "()Ljava/util/ArrayList;", "getExamples$annotations", "Lcom/stripe/android/uicore/address/NameType;", "getNameType", "()Lcom/stripe/android/uicore/address/NameType;", "getNameType$annotations", "Companion", "$serializer", "com/stripe/android/uicore/address/b", "stripe-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final class FieldSchema {
    public static final int $stable = 8;
    private final ArrayList<String> examples;
    private final boolean isNumeric;
    private final NameType nameType;
    public static final C5703b Companion = new C5703b();
    private static final InterfaceC37138c[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), NameType.Companion.serializer()};

    public /* synthetic */ FieldSchema(int i13, boolean z4, ArrayList arrayList, NameType nameType, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i13 & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4, FieldSchema$$serializer.INSTANCE.getDescriptor());
        }
        this.isNumeric = (i13 & 1) == 0 ? false : z4;
        if ((i13 & 2) == 0) {
            this.examples = new ArrayList<>();
        } else {
            this.examples = arrayList;
        }
        this.nameType = nameType;
    }

    @InterfaceC37143h("examples")
    public static /* synthetic */ void getExamples$annotations() {
    }

    @InterfaceC37143h("nameType")
    public static /* synthetic */ void getNameType$annotations() {
    }

    @InterfaceC37143h("isNumeric")
    public static /* synthetic */ void isNumeric$annotations() {
    }

    public static final /* synthetic */ void write$Self$stripe_ui_core_release(FieldSchema self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isNumeric) {
            output.encodeBooleanElement(serialDesc, 0, self.isNumeric);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.examples, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.examples);
        }
        output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.nameType);
    }

    public final ArrayList<String> getExamples() {
        return this.examples;
    }

    public final NameType getNameType() {
        return this.nameType;
    }

    /* JADX INFO: renamed from: isNumeric, reason: from getter */
    public final boolean getIsNumeric() {
        return this.isNumeric;
    }

    public FieldSchema(boolean z4, ArrayList<String> examples, NameType nameType) {
        AbstractC22676k.m65750j(examples, "examples");
        AbstractC22676k.m65750j(nameType, "nameType");
        this.isNumeric = z4;
        this.examples = examples;
        this.nameType = nameType;
    }

    public /* synthetic */ FieldSchema(boolean z4, ArrayList arrayList, NameType nameType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? new ArrayList() : arrayList, nameType);
    }
}

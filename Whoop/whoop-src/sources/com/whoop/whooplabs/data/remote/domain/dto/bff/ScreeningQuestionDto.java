package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import vy2.C36607e;
import vy2.EnumC36608f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fBo\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*Jl\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010!J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b8\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b9\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b:\u0010#R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b;\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010*¨\u0006@"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;", "", "", "id", "", "title", "subtitle", "content", "positiveButtonText", "negativeButtonText", "type", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningOptionDto;", "options", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lvy2/e;", "toDomain", "()Lvy2/e;", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getTitle", "getSubtitle", "getContent", "getPositiveButtonText", "getNegativeButtonText", "getType", "Ljava/util/List;", "getOptions", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ScreeningQuestionDto {
    private final String content;
    private final int id;
    private final String negativeButtonText;
    private final List<ScreeningOptionDto> options;
    private final String positiveButtonText;
    private final String subtitle;
    private final String title;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(10))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ScreeningQuestionDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScreeningQuestionDto(int i13, int i14, String str, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, ScreeningQuestionDto$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.title = str;
        this.subtitle = str2;
        this.content = str3;
        this.positiveButtonText = str4;
        this.negativeButtonText = str5;
        this.type = str6;
        this.options = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ScreeningOptionDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScreeningQuestionDto copy$default(ScreeningQuestionDto screeningQuestionDto, int i13, String str, String str2, String str3, String str4, String str5, String str6, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = screeningQuestionDto.id;
        }
        if ((i14 & 2) != 0) {
            str = screeningQuestionDto.title;
        }
        if ((i14 & 4) != 0) {
            str2 = screeningQuestionDto.subtitle;
        }
        if ((i14 & 8) != 0) {
            str3 = screeningQuestionDto.content;
        }
        if ((i14 & 16) != 0) {
            str4 = screeningQuestionDto.positiveButtonText;
        }
        if ((i14 & 32) != 0) {
            str5 = screeningQuestionDto.negativeButtonText;
        }
        if ((i14 & 64) != 0) {
            str6 = screeningQuestionDto.type;
        }
        if ((i14 & 128) != 0) {
            list = screeningQuestionDto.options;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str4;
        String str9 = str5;
        return screeningQuestionDto.copy(i13, str, str2, str3, str8, str9, str7, list2);
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(ScreeningQuestionDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.content);
        output.encodeStringElement(serialDesc, 4, self.positiveButtonText);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.negativeButtonText);
        output.encodeStringElement(serialDesc, 6, self.type);
        output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.options);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<ScreeningOptionDto> component8() {
        return this.options;
    }

    public final ScreeningQuestionDto copy(int id4, String title, String subtitle, String content, String positiveButtonText, String negativeButtonText, String type, List<ScreeningOptionDto> options) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(positiveButtonText, "positiveButtonText");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(options, "options");
        return new ScreeningQuestionDto(id4, title, subtitle, content, positiveButtonText, negativeButtonText, type, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreeningQuestionDto)) {
            return false;
        }
        ScreeningQuestionDto screeningQuestionDto = (ScreeningQuestionDto) other;
        return this.id == screeningQuestionDto.id && AbstractC22676k.m65745e(this.title, screeningQuestionDto.title) && AbstractC22676k.m65745e(this.subtitle, screeningQuestionDto.subtitle) && AbstractC22676k.m65745e(this.content, screeningQuestionDto.content) && AbstractC22676k.m65745e(this.positiveButtonText, screeningQuestionDto.positiveButtonText) && AbstractC22676k.m65745e(this.negativeButtonText, screeningQuestionDto.negativeButtonText) && AbstractC22676k.m65745e(this.type, screeningQuestionDto.type) && AbstractC22676k.m65745e(this.options, screeningQuestionDto.options);
    }

    public final String getContent() {
        return this.content;
    }

    public final int getId() {
        return this.id;
    }

    public final String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    public final List<ScreeningOptionDto> getOptions() {
        return this.options;
    }

    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.positiveButtonText);
        String str3 = this.negativeButtonText;
        return this.options.hashCode() + AbstractC11266d.m30450d((iM30450d2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.type);
    }

    public final C36607e toDomain() {
        int i13 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.content;
        String str4 = this.positiveButtonText;
        String str5 = this.negativeButtonText;
        EnumC36608f enumC36608fM117601a = EnumC36608f.INSTANCE.m117601a(this.type);
        List<ScreeningOptionDto> list = this.options;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ScreeningOptionDto) it.next()).toDomain());
        }
        return new C36607e(i13, str, str2, str3, str4, str5, enumC36608fM117601a, arrayList);
    }

    public String toString() {
        int i13 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.content;
        String str4 = this.positiveButtonText;
        String str5 = this.negativeButtonText;
        String str6 = this.type;
        List<ScreeningOptionDto> list = this.options;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ScreeningQuestionDto(id=", ", title=", str, ", subtitle=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", content=", str3, ", positiveButtonText=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", negativeButtonText=", str5, ", type=");
        return AbstractC30007c.m91840j(str6, ", options=", ")", sbM53373n, list);
    }

    public ScreeningQuestionDto(int i13, String title, String str, String str2, String positiveButtonText, String str3, String type, List<ScreeningOptionDto> options) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(positiveButtonText, "positiveButtonText");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(options, "options");
        this.id = i13;
        this.title = title;
        this.subtitle = str;
        this.content = str2;
        this.positiveButtonText = positiveButtonText;
        this.negativeButtonText = str3;
        this.type = type;
        this.options = options;
    }
}

package com.amplitude.android.engagement.types;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import l83.InterfaceC23457c;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B-\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bBA\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J6\u0010\u0019\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0017¨\u0006*"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/PageTargetingConfig;", "", "", "Lkotlinx/serialization/json/JsonElement;", "conditions", "Lcom/amplitude/android/engagement/types/TargetingConfig;", "configs", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/amplitude/android/engagement/types/PageTargetingConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getConditions", "getConfigs", "Companion", "$serializer", "com/amplitude/android/engagement/types/x0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PageTargetingConfig {
    public static final int $stable = 8;
    private final List<List<JsonElement>> conditions;
    private final List<TargetingConfig> configs;
    public static final C4947x0 Companion = new C4947x0();
    private static final InterfaceC37138c[] $childSerializers = {new ArrayListSerializer(new ArrayListSerializer(C0771n.f2806a)), new ArrayListSerializer(TargetingConfig$$serializer.INSTANCE)};

    /* JADX WARN: Multi-variable type inference failed */
    public PageTargetingConfig() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageTargetingConfig copy$default(PageTargetingConfig pageTargetingConfig, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = pageTargetingConfig.conditions;
        }
        if ((i13 & 2) != 0) {
            list2 = pageTargetingConfig.configs;
        }
        return pageTargetingConfig.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self(PageTargetingConfig self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 0);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.conditions, c25271y)) {
            output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.conditions);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.configs, c25271y)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.configs);
    }

    public final List<List<JsonElement>> component1() {
        return this.conditions;
    }

    public final List<TargetingConfig> component2() {
        return this.configs;
    }

    public final PageTargetingConfig copy(List<? extends List<? extends JsonElement>> conditions, List<TargetingConfig> configs) {
        AbstractC22676k.m65750j(conditions, "conditions");
        AbstractC22676k.m65750j(configs, "configs");
        return new PageTargetingConfig(conditions, configs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageTargetingConfig)) {
            return false;
        }
        PageTargetingConfig pageTargetingConfig = (PageTargetingConfig) other;
        return AbstractC22676k.m65745e(this.conditions, pageTargetingConfig.conditions) && AbstractC22676k.m65745e(this.configs, pageTargetingConfig.configs);
    }

    public final List<List<JsonElement>> getConditions() {
        return this.conditions;
    }

    public final List<TargetingConfig> getConfigs() {
        return this.configs;
    }

    public int hashCode() {
        return this.configs.hashCode() + (this.conditions.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PageTargetingConfig(conditions=");
        sb4.append(this.conditions);
        sb4.append(", configs=");
        return AbstractC17176i.m48506h(sb4, this.configs, ')');
    }

    @InterfaceC23457c
    public /* synthetic */ PageTargetingConfig(int i13, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.conditions = c25271y;
        } else {
            this.conditions = list;
        }
        if ((i13 & 2) == 0) {
            this.configs = c25271y;
        } else {
            this.configs = list2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PageTargetingConfig(List<? extends List<? extends JsonElement>> conditions, List<TargetingConfig> configs) {
        AbstractC22676k.m65750j(conditions, "conditions");
        AbstractC22676k.m65750j(configs, "configs");
        this.conditions = conditions;
        this.configs = configs;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PageTargetingConfig(List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2);
    }
}

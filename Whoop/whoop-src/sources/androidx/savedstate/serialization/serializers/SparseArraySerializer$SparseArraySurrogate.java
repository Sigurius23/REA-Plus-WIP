package androidx.savedstate.serialization.serializers;

import android.annotation.SuppressLint;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000 \u001d*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u001e\u001fB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJG\u0010\u0018\u001a\u00020\u0015\"\n\b\u0002\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006 "}, m65681d2 = {"androidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate", "T", "", "", "", "keys", "values", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Lwc3/c;", "typeSerial0", "Ll83/a0;", "write$Self$savedstate_release", "(Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;Lzc3/c;Lyc3/g;Lwc3/c;)V", "write$Self", "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "getValues", "Companion", "$serializer", "androidx/savedstate/serialization/serializers/b", "savedstate_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
@SuppressLint({"UnsafeOptInUsageError"})
@InterfaceC37144i
final class SparseArraySerializer$SparseArraySurrogate<T> {
    private static final InterfaceC39443g $cachedDescriptor;
    private final List<Integer> keys;
    private final List<T> values;
    public static final C1851b Companion = new C1851b();
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C1850a()), null};

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        pluginGeneratedSerialDescriptor.addElement("keys", false);
        pluginGeneratedSerialDescriptor.addElement("values", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ SparseArraySerializer$SparseArraySurrogate(int i13, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, $cachedDescriptor);
        }
        this.keys = list;
        this.values = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(IntSerializer.INSTANCE);
    }

    public static final /* synthetic */ void write$Self$savedstate_release(SparseArraySerializer$SparseArraySurrogate self, InterfaceC40540c output, InterfaceC39443g serialDesc, InterfaceC37138c typeSerial0) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.keys);
        output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(typeSerial0), self.values);
    }

    public final List<Integer> getKeys() {
        return this.keys;
    }

    public final List<T> getValues() {
        return this.values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparseArraySerializer$SparseArraySurrogate(List<Integer> keys, List<? extends T> values) {
        AbstractC22676k.m65750j(keys, "keys");
        AbstractC22676k.m65750j(values, "values");
        this.keys = keys;
        this.values = values;
    }
}

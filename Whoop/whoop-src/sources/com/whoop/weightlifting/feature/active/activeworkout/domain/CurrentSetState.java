package com.whoop.weightlifting.feature.active.activeworkout.domain;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no2.C26995a;
import org.joda.time.DateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37142g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0005\u0007\b\t\n\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;", "", "Lorg/joda/time/DateTime;", "getStartTime", "()Lorg/joda/time/DateTime;", "startTime", "Companion", "Rest", "Active", "Warmup", "Cooldown", "a", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public interface CurrentSetState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f32856a;

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;", "Lorg/joda/time/DateTime;", "startTime", "", "wasEditedAfterStarting", "<init>", "(Lorg/joda/time/DateTime;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILorg/joda/time/DateTime;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lorg/joda/time/DateTime;", "component2", "()Z", "copy", "(Lorg/joda/time/DateTime;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lorg/joda/time/DateTime;", "getStartTime", "Z", "getWasEditedAfterStarting", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Active implements CurrentSetState {
        private final DateTime startTime;
        private final boolean wasEditedAfterStarting;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26995a(24)), null};

        /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState$Active$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return CurrentSetState$Active$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Active(int i13, DateTime dateTime, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, CurrentSetState$Active$$serializer.INSTANCE.getDescriptor());
            }
            this.startTime = dateTime;
            if ((i13 & 2) == 0) {
                this.wasEditedAfterStarting = false;
            } else {
                this.wasEditedAfterStarting = z4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC37138c _childSerializers$_anonymous_() {
            return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DateTime.class), null, new InterfaceC37138c[0]);
        }

        public static /* synthetic */ Active copy$default(Active active, DateTime dateTime, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                dateTime = active.startTime;
            }
            if ((i13 & 2) != 0) {
                z4 = active.wasEditedAfterStarting;
            }
            return active.copy(dateTime, z4);
        }

        public static final /* synthetic */ void write$Self$weightlifting_release(Active self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.getStartTime());
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.wasEditedAfterStarting) {
                output.encodeBooleanElement(serialDesc, 1, self.wasEditedAfterStarting);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DateTime getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getWasEditedAfterStarting() {
            return this.wasEditedAfterStarting;
        }

        public final Active copy(DateTime startTime, boolean wasEditedAfterStarting) {
            AbstractC22676k.m65750j(startTime, "startTime");
            return new Active(startTime, wasEditedAfterStarting);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Active)) {
                return false;
            }
            Active active = (Active) other;
            return AbstractC22676k.m65745e(this.startTime, active.startTime) && this.wasEditedAfterStarting == active.wasEditedAfterStarting;
        }

        @Override // com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState
        public DateTime getStartTime() {
            return this.startTime;
        }

        public final boolean getWasEditedAfterStarting() {
            return this.wasEditedAfterStarting;
        }

        public int hashCode() {
            return Boolean.hashCode(this.wasEditedAfterStarting) + (this.startTime.hashCode() * 31);
        }

        public String toString() {
            return "Active(startTime=" + this.startTime + ", wasEditedAfterStarting=" + this.wasEditedAfterStarting + ")";
        }

        public Active(DateTime startTime, boolean z4) {
            AbstractC22676k.m65750j(startTime, "startTime");
            this.startTime = startTime;
            this.wasEditedAfterStarting = z4;
        }

        public /* synthetic */ Active(DateTime dateTime, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(dateTime, (i13 & 2) != 0 ? false : z4);
        }
    }

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;", "Lorg/joda/time/DateTime;", "startTime", "<init>", "(Lorg/joda/time/DateTime;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILorg/joda/time/DateTime;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lorg/joda/time/DateTime;", "copy", "(Lorg/joda/time/DateTime;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/joda/time/DateTime;", "getStartTime", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Cooldown implements CurrentSetState {
        private final DateTime startTime;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26995a(25))};

        /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState$Cooldown$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return CurrentSetState$Cooldown$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Cooldown(int i13, DateTime dateTime, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, CurrentSetState$Cooldown$$serializer.INSTANCE.getDescriptor());
            }
            this.startTime = dateTime;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC37138c _childSerializers$_anonymous_() {
            return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DateTime.class), null, new InterfaceC37138c[0]);
        }

        public static /* synthetic */ Cooldown copy$default(Cooldown cooldown, DateTime dateTime, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                dateTime = cooldown.startTime;
            }
            return cooldown.copy(dateTime);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DateTime getStartTime() {
            return this.startTime;
        }

        public final Cooldown copy(DateTime startTime) {
            AbstractC22676k.m65750j(startTime, "startTime");
            return new Cooldown(startTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Cooldown) && AbstractC22676k.m65745e(this.startTime, ((Cooldown) other).startTime);
        }

        @Override // com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState
        public DateTime getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            return this.startTime.hashCode();
        }

        public String toString() {
            return "Cooldown(startTime=" + this.startTime + ")";
        }

        public Cooldown(DateTime startTime) {
            AbstractC22676k.m65750j(startTime, "startTime");
            this.startTime = startTime;
        }
    }

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;", "Lorg/joda/time/DateTime;", "startTime", "", "cancelled", "<init>", "(Lorg/joda/time/DateTime;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILorg/joda/time/DateTime;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lorg/joda/time/DateTime;", "component2", "()Z", "copy", "(Lorg/joda/time/DateTime;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lorg/joda/time/DateTime;", "getStartTime", "Z", "getCancelled", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Rest implements CurrentSetState {
        private final boolean cancelled;
        private final DateTime startTime;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26995a(26)), null};

        /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState$Rest$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return CurrentSetState$Rest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Rest(int i13, DateTime dateTime, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, CurrentSetState$Rest$$serializer.INSTANCE.getDescriptor());
            }
            this.startTime = dateTime;
            if ((i13 & 2) == 0) {
                this.cancelled = false;
            } else {
                this.cancelled = z4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC37138c _childSerializers$_anonymous_() {
            return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DateTime.class), null, new InterfaceC37138c[0]);
        }

        public static /* synthetic */ Rest copy$default(Rest rest, DateTime dateTime, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                dateTime = rest.startTime;
            }
            if ((i13 & 2) != 0) {
                z4 = rest.cancelled;
            }
            return rest.copy(dateTime, z4);
        }

        public static final /* synthetic */ void write$Self$weightlifting_release(Rest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.getStartTime());
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.cancelled) {
                output.encodeBooleanElement(serialDesc, 1, self.cancelled);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DateTime getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getCancelled() {
            return this.cancelled;
        }

        public final Rest copy(DateTime startTime, boolean cancelled) {
            AbstractC22676k.m65750j(startTime, "startTime");
            return new Rest(startTime, cancelled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rest)) {
                return false;
            }
            Rest rest = (Rest) other;
            return AbstractC22676k.m65745e(this.startTime, rest.startTime) && this.cancelled == rest.cancelled;
        }

        public final boolean getCancelled() {
            return this.cancelled;
        }

        @Override // com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState
        public DateTime getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            return Boolean.hashCode(this.cancelled) + (this.startTime.hashCode() * 31);
        }

        public String toString() {
            return "Rest(startTime=" + this.startTime + ", cancelled=" + this.cancelled + ")";
        }

        public Rest(DateTime startTime, boolean z4) {
            AbstractC22676k.m65750j(startTime, "startTime");
            this.startTime = startTime;
            this.cancelled = z4;
        }

        public /* synthetic */ Rest(DateTime dateTime, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(dateTime, (i13 & 2) != 0 ? false : z4);
        }
    }

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;", "Lorg/joda/time/DateTime;", "startTime", "<init>", "(Lorg/joda/time/DateTime;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILorg/joda/time/DateTime;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lorg/joda/time/DateTime;", "copy", "(Lorg/joda/time/DateTime;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/joda/time/DateTime;", "getStartTime", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Warmup implements CurrentSetState {
        private final DateTime startTime;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26995a(27))};

        /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState$Warmup$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return CurrentSetState$Warmup$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Warmup(int i13, DateTime dateTime, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, CurrentSetState$Warmup$$serializer.INSTANCE.getDescriptor());
            }
            this.startTime = dateTime;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC37138c _childSerializers$_anonymous_() {
            return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DateTime.class), null, new InterfaceC37138c[0]);
        }

        public static /* synthetic */ Warmup copy$default(Warmup warmup, DateTime dateTime, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                dateTime = warmup.startTime;
            }
            return warmup.copy(dateTime);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DateTime getStartTime() {
            return this.startTime;
        }

        public final Warmup copy(DateTime startTime) {
            AbstractC22676k.m65750j(startTime, "startTime");
            return new Warmup(startTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Warmup) && AbstractC22676k.m65745e(this.startTime, ((Warmup) other).startTime);
        }

        @Override // com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState
        public DateTime getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            return this.startTime.hashCode();
        }

        public String toString() {
            return "Warmup(startTime=" + this.startTime + ")";
        }

        public Warmup(DateTime startTime) {
            AbstractC22676k.m65750j(startTime, "startTime");
            this.startTime = startTime;
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f32856a = new Companion();

        private Companion() {
        }

        public final InterfaceC37138c serializer() {
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            return new C37142g("com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState", c22673i0.getOrCreateKotlinClass(CurrentSetState.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(Active.class), c22673i0.getOrCreateKotlinClass(Cooldown.class), c22673i0.getOrCreateKotlinClass(Rest.class), c22673i0.getOrCreateKotlinClass(Warmup.class)}, new InterfaceC37138c[]{CurrentSetState$Active$$serializer.INSTANCE, CurrentSetState$Cooldown$$serializer.INSTANCE, CurrentSetState$Rest$$serializer.INSTANCE, CurrentSetState$Warmup$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    DateTime getStartTime();
}

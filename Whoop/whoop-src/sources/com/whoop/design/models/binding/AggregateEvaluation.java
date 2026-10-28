package com.whoop.design.models.binding;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/binding/AggregateEvaluation;", "", "<init>", "()V", "Update", "NoUpdate", "Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;", "Lcom/whoop/design/models/binding/AggregateEvaluation$Update;", "state-binding-annotations"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AggregateEvaluation {

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/models/binding/AggregateEvaluation$NoUpdate;", "Lcom/whoop/design/models/binding/AggregateEvaluation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "state-binding-annotations"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class NoUpdate extends AggregateEvaluation {
        public static final NoUpdate INSTANCE = new NoUpdate();

        private NoUpdate() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NoUpdate);
        }

        public int hashCode() {
            return -657796106;
        }

        public String toString() {
            return "NoUpdate";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/design/models/binding/AggregateEvaluation$Update;", "Lcom/whoop/design/models/binding/AggregateEvaluation;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "state-binding-annotations"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Update extends AggregateEvaluation {
        private final Object value;

        public Update(Object obj) {
            super(null);
            this.value = obj;
        }

        public static /* synthetic */ Update copy$default(Update update, Object obj, int i13, Object obj2) {
            if ((i13 & 1) != 0) {
                obj = update.value;
            }
            return update.copy(obj);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public final Update copy(Object value) {
            return new Update(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Update) && AbstractC22676k.m65745e(this.value, ((Update) other).value);
        }

        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return AbstractC18489d0.m53369j(this.value, "Update(value=", ")");
        }
    }

    public /* synthetic */ AggregateEvaluation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AggregateEvaluation() {
    }
}

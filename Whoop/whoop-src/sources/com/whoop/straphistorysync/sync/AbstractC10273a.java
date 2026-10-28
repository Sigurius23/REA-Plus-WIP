package com.whoop.straphistorysync.sync;

import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.straphistorysync.sync.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/a;", "", "<init>", "()V", "a", "b", "Lcom/whoop/straphistorysync/sync/a$a;", "Lcom/whoop/straphistorysync/sync/a$b;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10273a {

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.a$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/a$a;", "Lcom/whoop/straphistorysync/sync/a;", "Lec3/f2;", "Lcom/whoop/straphistorysync/sync/f;", "flow", "<init>", "(Lec3/f2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lec3/f2;", "()Lec3/f2;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC10273a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC13037f2 flow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC13037f2 flow) {
            super(null);
            AbstractC22676k.m65750j(flow, "flow");
            this.flow = flow;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC13037f2 getFlow() {
            return this.flow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.flow, ((a) other).flow);
        }

        public int hashCode() {
            return this.flow.hashCode();
        }

        public String toString() {
            return "AlreadyRunning(flow=" + this.flow + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.a$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/a$b;", "Lcom/whoop/straphistorysync/sync/a;", "Lec3/p1;", "Lcom/whoop/straphistorysync/sync/f;", "flow", "<init>", "(Lec3/p1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lec3/p1;", "()Lec3/p1;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC10273a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC13075p1 flow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13075p1 flow) {
            super(null);
            AbstractC22676k.m65750j(flow, "flow");
            this.flow = flow;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC13075p1 getFlow() {
            return this.flow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.flow, ((b) other).flow);
        }

        public int hashCode() {
            return this.flow.hashCode();
        }

        public String toString() {
            return "StartNew(flow=" + this.flow + ")";
        }
    }

    public /* synthetic */ AbstractC10273a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC10273a() {
    }
}

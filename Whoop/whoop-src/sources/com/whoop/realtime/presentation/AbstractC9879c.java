package com.whoop.realtime.presentation;

import com.whoop.design.util.TextResource;
import lm2.InterfaceC24516b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/realtime/presentation/c;", "", "<init>", "()V", "a", "b", "d", "c", "Lcom/whoop/realtime/presentation/c$a;", "Lcom/whoop/realtime/presentation/c$b;", "Lcom/whoop/realtime/presentation/c$c;", "Lcom/whoop/realtime/presentation/c$d;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC9879c {

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/realtime/presentation/c$a;", "Lcom/whoop/realtime/presentation/c;", "Llm2/b;", "activity", "", "selected", "<init>", "(Llm2/b;Z)V", "a", "(Llm2/b;Z)Lcom/whoop/realtime/presentation/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Llm2/b;", "c", "()Llm2/b;", "b", "Z", "d", "()Z", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC9879c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC24516b activity;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC24516b activity, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(activity, "activity");
            this.activity = activity;
            this.selected = z4;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m24012b(a aVar, InterfaceC24516b interfaceC24516b, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                interfaceC24516b = aVar.activity;
            }
            if ((i13 & 2) != 0) {
                z4 = aVar.selected;
            }
            return aVar.m24013a(interfaceC24516b, z4);
        }

        /* JADX INFO: renamed from: a */
        public final a m24013a(InterfaceC24516b activity, boolean selected) {
            AbstractC22676k.m65750j(activity, "activity");
            return new a(activity, selected);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC24516b getActivity() {
            return this.activity;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.activity, aVar.activity) && this.selected == aVar.selected;
        }

        public int hashCode() {
            return Boolean.hashCode(this.selected) + (this.activity.hashCode() * 31);
        }

        public String toString() {
            return "Activity(activity=" + this.activity + ", selected=" + this.selected + ")";
        }

        public /* synthetic */ a(InterfaceC24516b interfaceC24516b, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC24516b, (i13 & 2) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/realtime/presentation/c$b;", "Lcom/whoop/realtime/presentation/c;", "Lcom/whoop/design/util/TextResource;", "text", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC9879c {

        /* JADX INFO: renamed from: b */
        public static final int f28937b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextResource text) {
            super(null);
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.text, ((b) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("Divider(text=", this.text, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/realtime/presentation/c$c;", "Lcom/whoop/realtime/presentation/c;", "Lcom/whoop/design/util/TextResource;", "text", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC9879c {

        /* JADX INFO: renamed from: b */
        public static final int f28939b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextResource text) {
            super(null);
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.text, ((c) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("TextFooter(text=", this.text, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.c$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/realtime/presentation/c$d;", "Lcom/whoop/realtime/presentation/c;", "Lcom/whoop/design/util/TextResource;", "text", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC9879c {

        /* JADX INFO: renamed from: b */
        public static final int f28941b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextResource text) {
            super(null);
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.text, ((d) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("TextHeader(text=", this.text, ")");
        }
    }

    public /* synthetic */ AbstractC9879c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC9879c() {
    }
}

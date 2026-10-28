package com.whoop.design.util;

import android.content.Context;
import android.content.res.Resources;
import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import m83.C25271y;
import md1.C25452a;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "resolve", "(Landroid/content/Context;)Ljava/lang/CharSequence;", "Companion", "d", "e", "b", "c", "a", "Lcom/whoop/design/util/TextResource$b;", "Lcom/whoop/design/util/TextResource$c;", "Lcom/whoop/design/util/TextResource$e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = C25452a.class)
public abstract class TextResource {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.whoop.design.util.TextResource$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/util/TextResource$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/util/TextResource;", "serializer", "()Lwc3/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return C25452a.f99689a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.util.TextResource$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lcom/whoop/design/util/TextResource$c;", "Lcom/whoop/design/util/TextResource;", "", "resId", "quantity", "", "Lcom/whoop/design/util/TextResource$d;", "arguments", "<init>", "(IILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "", "resolve", "(Landroid/content/Context;)Ljava/lang/CharSequence;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getResId", "b", "getQuantity", "c", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class C8689c extends TextResource {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int resId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int quantity;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<AbstractC8690d> arguments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8689c(int i13, int i14, List<? extends AbstractC8690d> arguments) {
            super(null);
            AbstractC22676k.m65750j(arguments, "arguments");
            this.resId = i13;
            this.quantity = i14;
            this.arguments = arguments;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C8689c)) {
                return false;
            }
            C8689c c8689c = (C8689c) other;
            return this.resId == c8689c.resId && this.quantity == c8689c.quantity && AbstractC22676k.m65745e(this.arguments, c8689c.arguments);
        }

        public int hashCode() {
            return this.arguments.hashCode() + AbstractC11266d.m30448b(this.quantity, Integer.hashCode(this.resId) * 31, 31);
        }

        @Override // com.whoop.design.util.TextResource
        public CharSequence resolve(Context context) {
            AbstractC22676k.m65750j(context, "context");
            Resources resources = context.getResources();
            int i13 = this.resId;
            int i14 = this.quantity;
            List<AbstractC8690d> list = this.arguments;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC8690d) it.next()).mo21261a(context));
            }
            Object[] array = arrayList.toArray(new Object[0]);
            String quantityString = resources.getQuantityString(i13, i14, Arrays.copyOf(array, array.length));
            AbstractC22676k.m65749i(quantityString, "getQuantityString(...)");
            return quantityString;
        }

        public String toString() {
            int i13 = this.resId;
            int i14 = this.quantity;
            return AbstractC3855a.m11829m(AbstractC11266d.m30465s(i13, i14, "TextResource(quantityResId=", ", quantity=", ", arguments="), this.arguments, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.util.TextResource$d */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/util/TextResource$d;", "", "<init>", "()V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Ljava/lang/Object;", "b", "c", "Lcom/whoop/design/util/TextResource$d$a;", "Lcom/whoop/design/util/TextResource$d$b;", "Lcom/whoop/design/util/TextResource$d$c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class AbstractC8690d {

        /* JADX INFO: renamed from: com.whoop.design.util.TextResource$d$a */
        @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/design/util/TextResource$d$a;", "Lcom/whoop/design/util/TextResource$d;", "", "value", "<init>", "(Ljava/lang/Object;)V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends AbstractC8690d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final Object value;

            public a(Object obj) {
                super(null);
                this.value = obj;
            }

            @Override // com.whoop.design.util.TextResource.AbstractC8690d
            /* JADX INFO: renamed from: a */
            public Object mo21261a(Context context) {
                AbstractC22676k.m65750j(context, "context");
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.value, ((a) other).value);
            }

            public int hashCode() {
                Object obj = this.value;
                if (obj == null) {
                    return 0;
                }
                return obj.hashCode();
            }

            public String toString() {
                return AbstractC18489d0.m53369j(this.value, "GeneralArg(value=", ")");
            }
        }

        /* JADX INFO: renamed from: com.whoop.design.util.TextResource$d$b */
        /* JADX INFO: loaded from: classes8.dex */
        @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/design/util/TextResource$d$b;", "Lcom/whoop/design/util/TextResource$d;", "", "value", "<init>", "(Ljava/lang/Number;)V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getValue", "()Ljava/lang/Number;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends AbstractC8690d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final Number value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Number value) {
                super(null);
                AbstractC22676k.m65750j(value, "value");
                this.value = value;
            }

            @Override // com.whoop.design.util.TextResource.AbstractC8690d
            /* JADX INFO: renamed from: a */
            public Object mo21261a(Context context) {
                AbstractC22676k.m65750j(context, "context");
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && AbstractC22676k.m65745e(this.value, ((b) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NumeralArg(value=" + this.value + ")";
            }
        }

        /* JADX INFO: renamed from: com.whoop.design.util.TextResource$d$c */
        /* JADX INFO: loaded from: classes8.dex */
        @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/design/util/TextResource$d$c;", "Lcom/whoop/design/util/TextResource$d;", "Lcom/whoop/design/util/TextResource;", "value", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getValue", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends AbstractC8690d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final TextResource value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(TextResource value) {
                super(null);
                AbstractC22676k.m65750j(value, "value");
                this.value = value;
            }

            @Override // com.whoop.design.util.TextResource.AbstractC8690d
            /* JADX INFO: renamed from: a */
            public Object mo21261a(Context context) {
                AbstractC22676k.m65750j(context, "context");
                return this.value.resolve(context);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && AbstractC22676k.m65745e(this.value, ((c) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return AbstractC36095b.m114678f("ResourceArg(value=", this.value, ")");
            }
        }

        public /* synthetic */ AbstractC8690d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract Object mo21261a(Context context);

        private AbstractC8690d() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.util.TextResource$e */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/design/util/TextResource$e;", "Lcom/whoop/design/util/TextResource;", "", "value", "<init>", "(Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "resolve", "(Landroid/content/Context;)Ljava/lang/CharSequence;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class C8691e extends TextResource {

        /* JADX INFO: renamed from: b */
        public static final int f25898b = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CharSequence value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8691e(CharSequence value) {
            super(null);
            AbstractC22676k.m65750j(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CharSequence getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C8691e) && AbstractC22676k.m65745e(this.value, ((C8691e) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @Override // com.whoop.design.util.TextResource
        public CharSequence resolve(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return this.value.toString();
        }

        public String toString() {
            return "TextResource(value=" + ((Object) this.value) + ")";
        }
    }

    public /* synthetic */ TextResource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract CharSequence resolve(Context context);

    private TextResource() {
    }

    /* JADX INFO: renamed from: com.whoop.design.util.TextResource$b */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lcom/whoop/design/util/TextResource$b;", "Lcom/whoop/design/util/TextResource;", "", "resId", "", "Lcom/whoop/design/util/TextResource$d;", "arguments", "<init>", "(ILjava/util/List;)V", "", "(I[Lcom/whoop/design/util/TextResource$d;)V", "", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "", "resolve", "(Landroid/content/Context;)Ljava/lang/CharSequence;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getResId", "b", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class C8688b extends TextResource {

        /* JADX INFO: renamed from: c */
        public static final int f25889c = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int resId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<AbstractC8690d> arguments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8688b(int i13, List<? extends AbstractC8690d> arguments) {
            super(null);
            AbstractC22676k.m65750j(arguments, "arguments");
            this.resId = i13;
            this.arguments = arguments;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C8688b)) {
                return false;
            }
            C8688b c8688b = (C8688b) other;
            return this.resId == c8688b.resId && AbstractC22676k.m65745e(this.arguments, c8688b.arguments);
        }

        public int hashCode() {
            return this.arguments.hashCode() + (Integer.hashCode(this.resId) * 31);
        }

        @Override // com.whoop.design.util.TextResource
        public CharSequence resolve(Context context) {
            AbstractC22676k.m65750j(context, "context");
            if (this.arguments.isEmpty()) {
                String string = context.getString(this.resId);
                AbstractC22676k.m65749i(string, "getString(...)");
                return string;
            }
            int i13 = this.resId;
            List<AbstractC8690d> list = this.arguments;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC8690d) it.next()).mo21261a(context));
            }
            Object[] array = arrayList.toArray(new Object[0]);
            String string2 = context.getString(i13, Arrays.copyOf(array, array.length));
            AbstractC22676k.m65749i(string2, "getString(...)");
            return string2;
        }

        public String toString() {
            return "TextResource(resId=" + this.resId + ", arguments=" + this.arguments + ")";
        }

        public /* synthetic */ C8688b(int i13, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, (List<? extends AbstractC8690d>) ((i14 & 2) != 0 ? C25271y.f99162w : list));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C8688b(int i13, AbstractC8690d... arguments) {
            this(i13, (List<? extends AbstractC8690d>) AbstractC25260n.m74049W0(arguments));
            AbstractC22676k.m65750j(arguments, "arguments");
        }
    }
}

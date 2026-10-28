package com.mapbox.maps.extension.style.types;

import androidx.annotation.Keep;
import com.mapbox.bindgen.Value;
import com.squareup.wire.AbstractC5583n;
import cv.C11141a;
import java.util.HashMap;
import l83.C23465k;
import m83.AbstractC25247g0;
import p012ab.C0680g0;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vu.C36503d;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m65681d2 = {"Lcom/mapbox/maps/extension/style/types/PromoteId;", "", "", "propertyName", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lvu/d;", "expression", "(Lvu/d;Ljava/lang/String;)V", "Lcom/mapbox/bindgen/Value;", "toValue$extension_style_release", "()Lcom/mapbox/bindgen/Value;", "toValue", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/PromoteId;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPropertyName", "getSourceId", "Lvu/d;", "getExpression", "()Lvu/d;", "Companion", "cv/a", "extension-style_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final /* data */ class PromoteId {
    public static final C11141a Companion = new C11141a();
    private final C36503d expression;
    private final String propertyName;
    private final String sourceId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PromoteId(String propertyName) {
        this(propertyName, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        AbstractC22676k.m65750j(propertyName, "propertyName");
    }

    public static /* synthetic */ PromoteId copy$default(PromoteId promoteId, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = promoteId.propertyName;
        }
        if ((i13 & 2) != 0) {
            str2 = promoteId.sourceId;
        }
        return promoteId.copy(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Value toValue$lambda$0(PromoteId this$0, String it) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(it, "it");
        return Value.valueOf(this$0.propertyName);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPropertyName() {
        return this.propertyName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    public final PromoteId copy(String propertyName, String sourceId) {
        AbstractC22676k.m65750j(propertyName, "propertyName");
        return new PromoteId(propertyName, sourceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoteId)) {
            return false;
        }
        PromoteId promoteId = (PromoteId) other;
        return AbstractC22676k.m65745e(this.propertyName, promoteId.propertyName) && AbstractC22676k.m65745e(this.sourceId, promoteId.sourceId);
    }

    public final C36503d getExpression() {
        return this.expression;
    }

    public final String getPropertyName() {
        return this.propertyName;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        int iHashCode = this.propertyName.hashCode() * 31;
        String str = this.sourceId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PromoteId(propertyName=");
        sb4.append(this.propertyName);
        sb4.append(", sourceId=");
        return AbstractC25012a.m73377j(sb4, this.sourceId, ')');
    }

    public final Value toValue$extension_style_release() {
        Value valueOrElse = Value.fromJson(this.propertyName).getValueOrElse(new C0680g0(this, 25));
        AbstractC22676k.m65749i(valueOrElse, "fromJson(propertyName).g…e.valueOf(propertyName) }");
        Value value = valueOrElse;
        String str = this.sourceId;
        return str != null ? new Value((HashMap<String, Value>) AbstractC25247g0.m73987V(new C23465k(str, value))) : value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PromoteId(C36503d expression) {
        this(expression, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        AbstractC22676k.m65750j(expression, "expression");
    }

    public PromoteId(String propertyName, String str) {
        AbstractC22676k.m65750j(propertyName, "propertyName");
        this.propertyName = propertyName;
        this.sourceId = str;
        C36503d c36503dM16782h0 = null;
        try {
            Value value = Value.fromJson(propertyName).getValue();
            if (value != null) {
                c36503dM16782h0 = AbstractC5583n.m16782h0(value);
            }
        } catch (Throwable unused) {
        }
        this.expression = c36503dM16782h0;
    }

    public /* synthetic */ PromoteId(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2);
    }

    public /* synthetic */ PromoteId(C36503d c36503d, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36503d, (i13 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PromoteId(C36503d expression, String str) {
        AbstractC22676k.m65750j(expression, "expression");
        String json = expression.toJson();
        AbstractC22676k.m65749i(json, "expression.toJson()");
        this(json, str);
    }
}

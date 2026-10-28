package com.whoop.design.util;

import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import live.hms.video.utils.HMSConstantsKt;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.design.util.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\t*\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\t¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u0019*\u00020\t¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\t*\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\t*\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b \u0010!\u001a\u0011\u0010#\u001a\u00020\"*\u00020\t¢\u0006\u0004\b#\u0010$\"\u0014\u0010&\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%¨\u0006'"}, m65681d2 = {"", "resId", "", "g", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "", "value", "i", "(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Lcom/whoop/design/util/TextResource;", "resource", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "l", "(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;", "Lcom/whoop/design/util/TextResource$e;", "m", "(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;", "b", "(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;", "Lcom/whoop/design/util/TextResource$b;", "k", "(I)Lcom/whoop/design/util/TextResource$b;", "a", "()Lcom/whoop/design/util/TextResource;", "", "c", "(Lcom/whoop/design/util/TextResource;)Z", "d", "f", "(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "e", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;", "Lcom/whoop/design/util/TextResource$d$c;", "j", "(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource$d$c;", "Lcom/whoop/design/util/TextResource$e;", "empty", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC8693b {

    /* JADX INFO: renamed from: a */
    private static final TextResource.C8691e f25900a = new TextResource.C8691e("");

    /* JADX INFO: renamed from: a */
    public static final TextResource m21267a() {
        return f25900a;
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: b */
    public static final String m21268b(TextResource textResource) {
        AbstractC22676k.m65750j(textResource, "<this>");
        return ((TextResource.C8691e) textResource).getValue().toString();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m21269c(TextResource textResource) {
        AbstractC22676k.m65750j(textResource, "<this>");
        return textResource.equals(m21267a());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m21270d(TextResource textResource) {
        AbstractC22676k.m65750j(textResource, "<this>");
        return !textResource.equals(m21267a());
    }

    /* JADX INFO: renamed from: e */
    public static final TextResource m21271e(TextResource textResource, TextResource textResource2) {
        AbstractC22676k.m65750j(textResource2, "default");
        if (textResource != null) {
            if (!m21270d(textResource)) {
                textResource = null;
            }
            if (textResource != null) {
                return textResource;
            }
        }
        return textResource2;
    }

    /* JADX INFO: renamed from: f */
    public static final TextResource m21272f(TextResource textResource) {
        if (textResource != null) {
            if (!m21270d(textResource)) {
                textResource = null;
            }
            if (textResource != null) {
                return textResource;
            }
        }
        return m21267a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final String m21273g(int i13, Composer composer, int i14) {
        return m21274h(new TextResource.C8688b(i13, null, 2, 0 == true ? 1 : 0), composer, 0);
    }

    /* JADX INFO: renamed from: h */
    public static final String m21274h(TextResource resource, Composer composer, int i13) {
        AbstractC22676k.m65750j(resource, "resource");
        return resource.resolve((Context) ((C28655q) composer).m87161k(AndroidCompositionLocals_androidKt.f4976b)).toString();
    }

    /* JADX INFO: renamed from: i */
    public static final String m21275i(CharSequence value, Composer composer, int i13) {
        AbstractC22676k.m65750j(value, "value");
        return m21274h(new TextResource.C8691e(value), composer, 0);
    }

    /* JADX INFO: renamed from: j */
    public static final TextResource.AbstractC8690d.c m21276j(TextResource textResource) {
        AbstractC22676k.m65750j(textResource, "<this>");
        return new TextResource.AbstractC8690d.c(textResource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final TextResource.C8688b m21277k(int i13) {
        return new TextResource.C8688b(i13, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: l */
    public static final TextResource m21278l(String str) {
        return str != null ? new TextResource.C8691e(str) : m21267a();
    }

    /* JADX INFO: renamed from: m */
    public static final TextResource.C8691e m21279m(String str) {
        if (str != null) {
            return new TextResource.C8691e(str);
        }
        return null;
    }
}

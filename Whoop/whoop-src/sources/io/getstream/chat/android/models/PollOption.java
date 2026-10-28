package io.getstream.chat.android.models;

import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0007\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/models/PollOption;", "", "id", "", "text", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getText", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PollOption {
    private final Map<String, Object> extraData;
    private final String id;
    private final String text;

    public PollOption(String str, String text, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.id = str;
        this.text = text;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollOption copy$default(PollOption pollOption, String str, String str2, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pollOption.id;
        }
        if ((i13 & 2) != 0) {
            str2 = pollOption.text;
        }
        if ((i13 & 4) != 0) {
            map = pollOption.extraData;
        }
        return pollOption.copy(str, str2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Map<String, Object> component3() {
        return this.extraData;
    }

    public final PollOption copy(String id4, String text, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new PollOption(id4, text, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollOption)) {
            return false;
        }
        PollOption pollOption = (PollOption) other;
        return AbstractC22676k.m65745e(this.id, pollOption.id) && AbstractC22676k.m65745e(this.text, pollOption.text) && AbstractC22676k.m65745e(this.extraData, pollOption.extraData);
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.id;
        return this.extraData.hashCode() + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.text);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        return AbstractC13673n.m38565l(AbstractC11895b.m32001t("PollOption(id=", str, ", text=", str2, ", extraData="), this.extraData, ")");
    }

    public /* synthetic */ PollOption(String str, String str2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? C25272z.f99163w : map);
    }

    public /* synthetic */ PollOption(String str, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25272z.f99163w : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollOption(String text, Map<String, ? extends Object> extraData) {
        this(null, text, extraData);
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(extraData, "extraData");
    }
}

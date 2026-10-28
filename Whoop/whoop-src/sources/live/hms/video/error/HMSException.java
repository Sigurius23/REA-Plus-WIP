package live.hms.video.error;

import java.util.HashMap;
import live.hms.video.events.IAnalyticsPropertiesProvider;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00060\u0002j\u0002`\u00012\u00020\u0003Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012$\b\u0002\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0012j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011`\u0010¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0012j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011`\u0010H\u0016¢\u0006\u0002\u0010\u001fJ\b\u0010&\u001a\u00020\u0007H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001b\"\u0004\b\u001c\u0010\u001dR2\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0012j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011`\u0010X\u0080\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR$\u0010\n\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010$¨\u0006'"}, m65681d2 = {"Llive/hms/video/error/HMSException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "Llive/hms/video/events/IAnalyticsPropertiesProvider;", "code", "", "name", "", "action", "message", "description", "cause", "", "isTerminal", "", "params", "Lkotlin/collections/HashMap;", "", "Ljava/util/HashMap;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;)V", "getCode", "()I", "getName", "()Ljava/lang/String;", "getAction", "getMessage", "()Z", "setTerminal", "(Z)V", "getParams$lib_release", "()Ljava/util/HashMap;", "Ljava/util/HashMap;", "value", "getDescription", "setDescription$lib_release", "(Ljava/lang/String;)V", "toAnalyticsProperties", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSException extends Exception implements IAnalyticsPropertiesProvider {
    private final String action;
    private final int code;
    private String description;
    private boolean isTerminal;
    private final String message;
    private final String name;
    private final HashMap<String, Object> params;

    public /* synthetic */ HMSException(int i13, String str, String str2, String str3, String str4, Throwable th3, boolean z4, HashMap map, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, str2, str3, str4, (i14 & 32) != 0 ? null : th3, (i14 & 64) != 0 ? true : z4, (i14 & 128) != 0 ? new HashMap() : map);
    }

    public final String getAction() {
        return this.action;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getName() {
        return this.name;
    }

    public final HashMap<String, Object> getParams$lib_release() {
        return this.params;
    }

    /* JADX INFO: renamed from: isTerminal, reason: from getter */
    public final boolean getIsTerminal() {
        return this.isTerminal;
    }

    public final void setDescription$lib_release(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.description = str;
    }

    public final void setTerminal(boolean z4) {
        this.isTerminal = z4;
    }

    @Override // live.hms.video.events.IAnalyticsPropertiesProvider
    public HashMap<String, Object> toAnalyticsProperties() {
        this.params.put("error_code", Integer.valueOf(this.code));
        this.params.put("error_message", getMessage());
        this.params.put("error_description", this.description);
        this.params.put("action", this.action);
        this.params.put("is_terminal", Boolean.valueOf(this.isTerminal));
        return this.params;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.name + ": " + getMessage() + " [code=" + this.code + ", action=" + this.action + ", description=" + this.description + ", cause=" + getCause() + ']';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSException(int i13, String name, String action, String message, String description, Throwable th3, boolean z4, HashMap<String, Object> params) {
        super(message, th3);
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(params, "params");
        this.code = i13;
        this.name = name;
        this.action = action;
        this.message = message;
        this.isTerminal = z4;
        this.params = params;
        this.description = description;
    }
}

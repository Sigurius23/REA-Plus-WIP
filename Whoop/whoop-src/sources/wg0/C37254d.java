package wg0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wg0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J`\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b$\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b+\u0010\u0019R\u0011\u0010.\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u0019¨\u00060"}, m65681d2 = {"Lwg0/d;", "", "", "itemId", "messageId", "", "itemIndex", "currentText", "targetText", "serverTextHash", "Lwg0/c;", "granularity", "charsPerStep", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILwg0/c;I)V", "charsOverride", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/Integer;)Lwg0/d;", "a", "()Lwg0/d;", "b", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILwg0/c;I)Lwg0/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "getMessageId", "c", "I", "getItemIndex", "d", "e", "g", "getServerTextHash", "Lwg0/c;", "getGranularity", "()Lwg0/c;", "getCharsPerStep", "j", "()Z", "isComplete", "currentTextHash", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37254d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String itemId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String messageId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int itemIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String currentText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String targetText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int serverTextHash;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC37253c granularity;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int charsPerStep;

    /* JADX INFO: renamed from: wg0.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f159380a;

        static {
            int[] iArr = new int[EnumC37253c.values().length];
            try {
                iArr[EnumC37253c.CHARACTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37253c.WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f159380a = iArr;
        }
    }

    public C37254d(String itemId, String messageId, int i13, String currentText, String targetText, int i14, EnumC37253c granularity, int i15) {
        AbstractC22676k.m65750j(itemId, "itemId");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(currentText, "currentText");
        AbstractC22676k.m65750j(targetText, "targetText");
        AbstractC22676k.m65750j(granularity, "granularity");
        this.itemId = itemId;
        this.messageId = messageId;
        this.itemIndex = i13;
        this.currentText = currentText;
        this.targetText = targetText;
        this.serverTextHash = i14;
        this.granularity = granularity;
        this.charsPerStep = i15;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C37254d m119396c(C37254d c37254d, String str, String str2, int i13, String str3, String str4, int i14, EnumC37253c enumC37253c, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = c37254d.itemId;
        }
        if ((i16 & 2) != 0) {
            str2 = c37254d.messageId;
        }
        if ((i16 & 4) != 0) {
            i13 = c37254d.itemIndex;
        }
        if ((i16 & 8) != 0) {
            str3 = c37254d.currentText;
        }
        if ((i16 & 16) != 0) {
            str4 = c37254d.targetText;
        }
        if ((i16 & 32) != 0) {
            i14 = c37254d.serverTextHash;
        }
        if ((i16 & 64) != 0) {
            enumC37253c = c37254d.granularity;
        }
        if ((i16 & 128) != 0) {
            i15 = c37254d.charsPerStep;
        }
        EnumC37253c enumC37253c2 = enumC37253c;
        int i17 = i15;
        String str5 = str4;
        int i18 = i14;
        return c37254d.m119399b(str, str2, i13, str3, str5, i18, enumC37253c2, i17);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C37254d m119397i(C37254d c37254d, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = null;
        }
        return c37254d.m119404h(num);
    }

    /* JADX INFO: renamed from: a */
    public final C37254d m119398a() {
        return !m119405j() ? m119396c(this, null, null, 0, this.targetText, null, 0, null, 0, 247, null) : this;
    }

    /* JADX INFO: renamed from: b */
    public final C37254d m119399b(String itemId, String messageId, int itemIndex, String currentText, String targetText, int serverTextHash, EnumC37253c granularity, int charsPerStep) {
        AbstractC22676k.m65750j(itemId, "itemId");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(currentText, "currentText");
        AbstractC22676k.m65750j(targetText, "targetText");
        AbstractC22676k.m65750j(granularity, "granularity");
        return new C37254d(itemId, messageId, itemIndex, currentText, targetText, serverTextHash, granularity, charsPerStep);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrentText() {
        return this.currentText;
    }

    /* JADX INFO: renamed from: e */
    public final int m119401e() {
        return m119405j() ? this.serverTextHash : this.currentText.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37254d)) {
            return false;
        }
        C37254d c37254d = (C37254d) other;
        return AbstractC22676k.m65745e(this.itemId, c37254d.itemId) && AbstractC22676k.m65745e(this.messageId, c37254d.messageId) && this.itemIndex == c37254d.itemIndex && AbstractC22676k.m65745e(this.currentText, c37254d.currentText) && AbstractC22676k.m65745e(this.targetText, c37254d.targetText) && this.serverTextHash == c37254d.serverTextHash && this.granularity == c37254d.granularity && this.charsPerStep == c37254d.charsPerStep;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTargetText() {
        return this.targetText;
    }

    /* JADX INFO: renamed from: h */
    public final C37254d m119404h(Integer charsOverride) {
        String strM119395a;
        int i13 = a.f159380a[this.granularity.ordinal()];
        if (i13 == 1) {
            strM119395a = AbstractC37252b.m119395a(this.currentText, this.targetText, charsOverride != null ? charsOverride.intValue() : this.charsPerStep);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strM119395a = AbstractC37261k.m119423a(this.currentText, this.targetText);
        }
        String str = strM119395a;
        return !AbstractC22676k.m65745e(str, this.currentText) ? m119396c(this, null, null, 0, str, null, 0, null, 0, 247, null) : this;
    }

    public int hashCode() {
        return Integer.hashCode(this.charsPerStep) + ((this.granularity.hashCode() + AbstractC11266d.m30448b(this.serverTextHash, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.itemIndex, AbstractC11266d.m30450d(this.itemId.hashCode() * 31, 31, this.messageId), 31), 31, this.currentText), 31, this.targetText), 31)) * 31);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m119405j() {
        return AbstractC22676k.m65745e(this.currentText, this.targetText);
    }

    public String toString() {
        String str = this.itemId;
        String str2 = this.messageId;
        int i13 = this.itemIndex;
        String str3 = this.currentText;
        String str4 = this.targetText;
        int i14 = this.serverTextHash;
        EnumC37253c enumC37253c = this.granularity;
        int i15 = this.charsPerStep;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ItemInterpolationState(itemId=", str, ", messageId=", str2, ", itemIndex=");
        AbstractC11895b.m31979B(i13, ", currentText=", str3, ", targetText=", sbM32001t);
        AbstractC11266d.m30470x(i14, str4, ", serverTextHash=", ", granularity=", sbM32001t);
        sbM32001t.append(enumC37253c);
        sbM32001t.append(", charsPerStep=");
        sbM32001t.append(i15);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
